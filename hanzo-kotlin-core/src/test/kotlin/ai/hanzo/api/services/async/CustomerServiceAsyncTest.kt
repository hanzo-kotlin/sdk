// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.models.customer.BlockUsers
import ai.hanzo.api.models.customer.CustomerBlockParams
import ai.hanzo.api.models.customer.CustomerCreateParams
import ai.hanzo.api.models.customer.CustomerDeleteParams
import ai.hanzo.api.models.customer.CustomerRetrieveInfoParams
import ai.hanzo.api.models.customer.CustomerUnblockParams
import ai.hanzo.api.models.customer.CustomerUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CustomerServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.customer()

        val customer =
            customerServiceAsync.create(
                CustomerCreateParams.builder()
                    .userId("user_id")
                    .alias("alias")
                    .allowedModelRegion(CustomerCreateParams.AllowedModelRegion.EU)
                    .blocked(true)
                    .budgetDuration("budget_duration")
                    .budgetId("budget_id")
                    .defaultModel("default_model")
                    .maxBudget(0.0)
                    .maxParallelRequests(0L)
                    .modelMaxBudget(
                        CustomerCreateParams.ModelMaxBudget.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    mapOf(
                                        "budget_duration" to "budget_duration",
                                        "max_budget" to 0,
                                        "rpm_limit" to 0,
                                        "tpm_limit" to 0,
                                    )
                                ),
                            )
                            .build()
                    )
                    .rpmLimit(0L)
                    .softBudget(0.0)
                    .tpmLimit(0L)
                    .build()
            )

        customer.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.customer()

        val customer =
            customerServiceAsync.update(
                CustomerUpdateParams.builder()
                    .userId("user_id")
                    .alias("alias")
                    .allowedModelRegion(CustomerUpdateParams.AllowedModelRegion.EU)
                    .blocked(true)
                    .budgetId("budget_id")
                    .defaultModel("default_model")
                    .maxBudget(0.0)
                    .build()
            )

        customer.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.customer()

        val customers = customerServiceAsync.list()

        customers.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.customer()

        val customer =
            customerServiceAsync.delete(CustomerDeleteParams.builder().addUserId("string").build())

        customer.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun block() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.customer()

        val response =
            customerServiceAsync.block(
                CustomerBlockParams.builder()
                    .blockUsers(BlockUsers.builder().addUserId("string").build())
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieveInfo() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.customer()

        val response =
            customerServiceAsync.retrieveInfo(
                CustomerRetrieveInfoParams.builder().endUserId("end_user_id").build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun unblock() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.customer()

        val response =
            customerServiceAsync.unblock(
                CustomerUnblockParams.builder()
                    .blockUsers(BlockUsers.builder().addUserId("string").build())
                    .build()
            )

        response.validate()
    }
}
