// hello — prove the key works, and print what it can reach.
//
// This is the call that says no. With no key, or a bogus one, GET /v1/keys
// answers 403 {"code":"forbidden","error":"sign in to manage API keys"} while
// the nonsense sibling GET /v1/keys-zzq9 answers 404 — so the refusal is this
// route refusing rather than a wildcard door, which is what makes it usable as
// proof that a credential works. The three obvious identity routes were
// disqualified for answering 200 to a caller with no credential at all;
// flows.yaml records the probe.
//
// Operation: get_v1_keys (GET /v1/keys)
//
//   HANZO_API_KEY=hk-... ./gradlew :examples:hello:run
import ai.hanzo.Hanzo
import ai.hanzo.cloud.api.KeysApi

fun main() {
    // `propertyKeys`, not `keys`: the wire name is `keys`, which the Kotlin
    // generator renames because a data class cannot carry it, and @SerializedName
    // still sends the original.
    val keys = Hanzo().api(::KeysApi).getKeys().propertyKeys.orEmpty()
    if (keys.isEmpty()) {
        println("the key is good, and it owns no keys of its own")
        return
    }
    keys.forEach { key ->
        println(
            "${key.type.orEmpty().padEnd(8)} ${key.prefix.orEmpty().padEnd(24)} ${key.createdAt.orEmpty()}"
        )
    }
}
