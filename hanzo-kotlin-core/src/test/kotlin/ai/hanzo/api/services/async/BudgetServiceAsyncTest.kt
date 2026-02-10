// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.models.budget.BudgetDeleteParams
import ai.hanzo.api.models.budget.BudgetInfoParams
import ai.hanzo.api.models.budget.BudgetNew
import ai.hanzo.api.models.budget.BudgetSettingsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BudgetServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val budgetServiceAsync = client.budget()

        val budget =
            budgetServiceAsync.create(
                BudgetNew.builder()
                    .budgetDuration("budget_duration")
                    .budgetId("budget_id")
                    .maxBudget(0.0)
                    .maxParallelRequests(0L)
                    .modelMaxBudget(
                        BudgetNew.ModelMaxBudget.builder()
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

        budget.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val budgetServiceAsync = client.budget()

        val budget =
            budgetServiceAsync.update(
                BudgetNew.builder()
                    .budgetDuration("budget_duration")
                    .budgetId("budget_id")
                    .maxBudget(0.0)
                    .maxParallelRequests(0L)
                    .modelMaxBudget(
                        BudgetNew.ModelMaxBudget.builder()
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

        budget.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val budgetServiceAsync = client.budget()

        val budgets = budgetServiceAsync.list()

        budgets.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val budgetServiceAsync = client.budget()

        val budget = budgetServiceAsync.delete(BudgetDeleteParams.builder().id("id").build())

        budget.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun info() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val budgetServiceAsync = client.budget()

        val response =
            budgetServiceAsync.info(BudgetInfoParams.builder().addBudget("string").build())

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun settings() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val budgetServiceAsync = client.budget()

        val response =
            budgetServiceAsync.settings(
                BudgetSettingsParams.builder().budgetId("budget_id").build()
            )

        response.validate()
    }
}
