// money — the balance, then the usage that moved it.
//
// Neither call takes an org: both derive the tenant server-side from the JWT
// `owner` claim, so a key can only ever read its own money.
//
// Operations: cloud_get_v1_billing_balance (GET /v1/billing/balance),
//             cloud_get_v1_billing_usage   (GET /v1/billing/usage)
//
// Both are declared in hanzo.yaml with a bare `default` response and no schema
// — "the route answers; its response shape is not declared at the source" — so
// openapi-generator types them `Unit`. There is no typed accessor to print a
// balance with, and no query parameter to narrow the (unbounded) usage ledger
// with, because the document declares neither. This example therefore reports
// the status the routes gave, which is all the document supports; when the
// source declares those shapes, a regeneration prints them. Hand-rolling the
// request here would be exactly the drift this SDK exists to prevent.
//
//   HANZO_API_KEY=hk-... ./gradlew :examples:money:run
import ai.hanzo.Hanzo
import ai.hanzo.cloud.api.BillingApi

fun main() {
    val billing = Hanzo().api(::BillingApi)

    println("balance  HTTP ${billing.cloudGetV1BillingBalanceWithHttpInfo().statusCode}")
    println("usage    HTTP ${billing.cloudGetV1BillingUsageWithHttpInfo().statusCode}")
}
