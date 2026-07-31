// store — provision a KV store, read it back, delete it.
//
// This is the provisioning plane, and it is the one that answers: the value
// plane (/v1/kv/keys/{key} — kv_setKey, kv_getKey, kv_deleteKey) is authored in
// the document but does not route at api.hanzo.ai.
//
// Org-scoped: /v1/kv replies 403 {"error":"X-Org-Id required"} without one,
// which `Hanzo` sends from HANZO_ORG_ID.
//
// Operations: cloud_post_v1_kv        (POST   /v1/kv),
//             cloud_get_v1_kv_name    (GET    /v1/kv/{name}),
//             cloud_delete_v1_kv_name (DELETE /v1/kv/{name})
//
//   HANZO_API_KEY=hk-... HANZO_ORG_ID=my-org ./gradlew :examples:store:run
import ai.hanzo.Hanzo
import ai.hanzo.cloud.api.KvApi
import ai.hanzo.cloud.model.CloudProvisionRequest

fun main() {
    val hanzo = Hanzo()
    require(hanzo.orgId != null) { "HANZO_ORG_ID is required: /v1/kv answers 403 without X-Org-Id" }
    val kv = hanzo.api(::KvApi)

    // Names are org-unique, so a hardcoded one collides with the last run.
    val name = "sdk-example-${System.nanoTime().toString(36)}"

    val created = kv.cloudPostV1Kv(CloudProvisionRequest(name = name))
    println("created  ${created.name} (${created.id}) status=${created.status}")

    try {
        val store = kv.cloudGetV1KvName(name)
        println("read     ${store.name} kind=${store.kind} at ${store.host}:${store.port}")
    } finally {
        // In a `finally`, so a failed read still cleans up instead of leaving
        // the store behind for the next run to collide with.
        kv.cloudDeleteV1KvName(name)
        println("deleted  $name")
    }
}
