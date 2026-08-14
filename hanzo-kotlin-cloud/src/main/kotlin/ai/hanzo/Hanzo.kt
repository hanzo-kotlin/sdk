package ai.hanzo

import okhttp3.Call
import okhttp3.OkHttpClient

/**
 * Endpoint and credentials, resolved once.
 *
 * Everything under `ai.hanzo.cloud` is generated from the API document
 * hanzoai/cloud emits, by `scripts/generate.sh`. This file is not: it is the
 * hand-written seam that turns the generated transport into an authenticated
 * client, and it is the one place in the repo that reads the environment. It
 * lives beside the generated package rather than inside it because `sdks.yaml`
 * gives the generator `src/main/kotlin/ai/hanzo/cloud` outright — a file in
 * there would be deleted by the next regeneration.
 *
 * Auth is an interceptor on a shared [OkHttpClient], and it is what makes the
 * client authenticated AT ALL: the document declares no `securitySchemes`, so
 * the generator registers no credential and every generated call would go out
 * bare. An interceptor is also the only way to add `X-Org-Id`, which the KV and
 * agents routes require and which no generated signature accepts. One transport
 * carries both, so neither can be set on one call and forgotten on the next.
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
                apiKey?.let { request.header("Authorization", "Bearer $it") }
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
