// money — the balance, then the usage that moved it.
//
// Neither call takes an org: both derive the tenant server-side from the token's
// `owner` claim, so a key can only ever read its own money.
//
// Operations: get_v1_billing_balance (GET /v1/billing/balance),
//             get_v1_billing_usage   (GET /v1/billing/usage)
//
// Both are published with no response schema, so openapi-generator types them
// Unit. There is no typed accessor to print a balance with, and no query
// parameter to narrow the (unbounded) usage ledger with, because the document
// declares neither. This example therefore reports the status the routes gave,
// which is all the document supports; when the source declares those shapes, a
// regeneration prints them. Hand-rolling the request here would be exactly the
// drift this SDK exists to prevent.
//
//   HANZO_API_KEY=hk-... ./gradlew :examples:money:run
import ai.hanzo.Hanzo
import ai.hanzo.cloud.api.BillingApi

fun main() {
    val billing = Hanzo().api(::BillingApi)

    println("balance  HTTP ${billing.getV1BillingBalanceWithHttpInfo().statusCode}")
    println("usage    HTTP ${billing.getV1BillingUsageWithHttpInfo().statusCode}")
}
