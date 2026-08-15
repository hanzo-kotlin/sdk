// hello — reach the gateway, then prove the key works.
//
// Two calls, and the first is the one a reader with no credential can run. The
// document declares a `bearer` scheme over every operation and exempts exactly
// four with `security: []`; GET /v1/models is one of them, so it answers 200 to
// a caller carrying nothing. That separates the two ways this flow can end in
// "no" — an unreachable gateway from a rejected credential.
//
// GET /v1/keys is the second call and the identity proof. With no key, or a
// bogus one, it answers 403 {"code":"forbidden","error":"sign in to manage API
// keys"} while the nonsense sibling GET /v1/keys-zzq9 answers 404 — so the
// refusal is this route refusing rather than a wildcard door. The three obvious
// identity routes were disqualified for answering 200 to a caller with no
// credential at all; flows.yaml records the probe.
//
// Operations: get_models (GET /v1/models), get_keys (GET /v1/keys)
//
//   ./gradlew :examples:hello:run                    # open call only
//   HANZO_API_KEY=sk-... ./gradlew :examples:hello:run
import ai.hanzo.Hanzo
import ai.hanzo.cloud.api.KeysApi
import ai.hanzo.cloud.api.ModelsApi
import ai.hanzo.cloud.infrastructure.ClientException

fun main() {
    val hanzo = Hanzo()

    // No response schema is declared for this route, so the generated method
    // returns Unit and the status is the whole of what it reports. Reading it
    // off `...WithHttpInfo` is the typed way; parsing the body here would be
    // this client inventing a shape the document does not state.
    println("gateway  ${hanzo.baseUrl}  HTTP ${hanzo.api(::ModelsApi).getModelsWithHttpInfo().statusCode}")

    // `propertyKeys`, not `keys`: the wire name is `keys`, which is on the
    // Kotlin generator's reserved list (`size`, `keys`, `values`, `entries`,
    // `class`), and @SerializedName still sends the original.
    val keys =
        try {
            hanzo.api(::KeysApi).getKeys().propertyKeys.orEmpty()
        } catch (refused: ClientException) {
            // The refusal is the other half of the flow, so it is caught rather
            // than thrown at the terminal as a stack trace. Every generated call
            // raises ClientException on a 4xx and ServerException on a 5xx, both
            // carrying `statusCode` and the raw `response`.
            println("keys     HTTP ${refused.statusCode}  set HANZO_API_KEY to a key this gateway knows")
            return
        }
    if (keys.isEmpty()) {
        println("keys     the key is good, and it owns no keys of its own")
        return
    }
    keys.forEach { key ->
        println(
            "keys     ${key.type.orEmpty().padEnd(8)} ${key.prefix.orEmpty().padEnd(24)} ${key.createdAt.orEmpty()}"
        )
    }
}
