package ai.hanzo

import ai.hanzo.cloud.infrastructure.ApiClient
import okhttp3.Call
import okhttp3.OkHttpClient

/**
 * Endpoint and credentials, resolved once.
 *
 * Everything under `ai.hanzo.cloud` is generated from the API document
 * hanzoai/cloud emits, by `scripts/generate.sh`. This file is not: it is the
 * hand-written seam that reads the environment and hands the pieces to the
 * generated client. It lives beside the generated package rather than inside it
 * because `sdks.yaml` gives the generator `src/main/kotlin/ai/hanzo/cloud`
 * outright — a file in there would be deleted by the next regeneration.
 *
 * THE CREDENTIAL RIDES THE TRANSPORT, and this interceptor is its only home.
 * The document now declares a `bearer` scheme, so the generator does emit
 * credential code — `ApiClient.updateAuthParams`, filling `Authorization` from
 * [ApiClient.accessToken] — but that field is on the generated COMPANION, one
 * per process. A program serving two tenants would have the second `Hanzo`
 * silently re-point the first one's calls. A credential is a value, so it
 * belongs on the instance that was handed it, and the transport is the only
 * per-instance place the generated client has: `ApiClient` takes `(baseUrl,
 * client)` and nothing else. `FlowsTest` proves both halves — one instance
 * keeps its own token, and a keyless one sends nothing even while another
 * instance in the same process holds a key.
 *
 * So the interceptor SETS the header when there is a key and REMOVES it when
 * there is not, rather than leaving it alone: that makes this the single
 * authority for the header on this transport, and a token parked on the
 * process-wide field by anything else cannot ride out on a call that was meant
 * to be anonymous. `X-Org-Id` travels the same way for a different reason —
 * the KV and agents routes require it, the document declares no such parameter,
 * and no generated signature accepts one.
 *
 * What the declaration buys the client is per-operation: each generated request
 * config now carries `requiresAuthentication`, true everywhere except the four
 * operations the document exempts with `security: []` — `get_models`,
 * `get_models_providers`, `get_commands`, `get_openapi.json`. That is why
 * `examples/hello` can open with a call that succeeds carrying nothing.
 *
 * ```
 * val hanzo = Hanzo()
 * val keys = hanzo.api(::KeysApi).getKeys()
 * ```
 */
class Hanzo(
    /** Gateway to talk to. `HANZO_BASE_URL`, else [DEFAULT_BASE_URL]. */
    val baseUrl: String = env("HANZO_BASE_URL") ?: DEFAULT_BASE_URL,
    /**
     * Bearer credential. `HANZO_API_KEY`. Absent on purpose sends no
     * `Authorization` header at all, which is how `examples/hello` shows the API
     * refusing an unauthenticated call rather than inventing a client-side error.
     */
    val apiKey: String? = env("HANZO_API_KEY"),
    /** Org scope. `HANZO_ORG_ID`. Required by the KV and agents routes. */
    val orgId: String? = env("HANZO_ORG_ID"),
) {
    /** One transport: one connection pool, and one place the headers are set. */
    val client: OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor { chain ->
                val request = chain.request().newBuilder()
                if (apiKey != null) {
                    request.header("Authorization", "Bearer $apiKey")
                } else {
                    request.removeHeader("Authorization")
                }
                orgId?.let { request.header("X-Org-Id", it) }
                chain.proceed(request.build())
            }
            .build()

    /**
     * Builds one of the generated API classes against this client:
     * `hanzo.api(::AuthApi)`. Every generated class takes the same
     * `(basePath, client)` pair, so this is the whole of the wiring.
     */
    fun <T> api(create: (String, Call.Factory) -> T): T = create(baseUrl, client)

    companion object {
        /** The Hanzo gateway. Every route is `<base>/v1/<service>/...`. */
        const val DEFAULT_BASE_URL: String = "https://api.hanzo.ai"

        private fun env(name: String): String? = System.getenv(name)?.takeIf { it.isNotBlank() }
    }
}
