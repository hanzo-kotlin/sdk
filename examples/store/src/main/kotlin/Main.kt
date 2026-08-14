// store — provision a KV store, read it back, delete it.
//
// This is the provisioning plane, and it is the one the document declares:
// /v1/kv and /v1/kv/{name}, nothing else. The value plane (/v1/kv/keys/{key})
// was authored in a spec that is now deleted, and 404s at api.hanzo.ai.
//
// Org-scoped: /v1/kv answers 403 without a tenant, and says which half is
// missing — "a validated principal is required" for no credential at all, "an
// org scope is required" for a key that resolves no org. `Hanzo` sends the
// scope as X-Org-Id from HANZO_ORG_ID.
//
// Operations: post_kv           (POST   /v1/kv),
//             get_kv_by_name    (GET    /v1/kv/{name}),
//             delete_kv_by_name (DELETE /v1/kv/{name})
//
//   HANZO_API_KEY=sk-... HANZO_ORG_ID=my-org ./gradlew :examples:store:run
import ai.hanzo.Hanzo
import ai.hanzo.cloud.api.KvApi
import ai.hanzo.cloud.model.ProvisionRequest

fun main() {
    val hanzo = Hanzo()
    require(hanzo.orgId != null) { "HANZO_ORG_ID is required: /v1/kv answers 403 without X-Org-Id" }
    val kv = hanzo.api(::KvApi)

    // Names are org-unique, so a hardcoded one collides with the last run.
    val name = "sdk-example-${System.nanoTime().toString(36)}"

    val created = kv.postKv(ProvisionRequest(name = name))
    println("created  ${created.name} (${created.id}) status=${created.status}")

    try {
        val store = kv.getKvByName(name)
        println("read     ${store.name} kind=${store.kind} at ${store.host}:${store.port}")
    } finally {
        // In a `finally`, so a failed read still cleans up instead of leaving
        // the store behind for the next run to collide with.
        kv.deleteKvByName(name)
        println("deleted  $name")
    }
}
