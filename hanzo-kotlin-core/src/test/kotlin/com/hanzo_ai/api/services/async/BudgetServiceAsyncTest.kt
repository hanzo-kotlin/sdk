// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.models.budget.BudgetCreateParams
import com.hanzo_ai.api.models.budget.BudgetDeleteParams
import com.hanzo_ai.api.models.budget.BudgetInfoParams
import com.hanzo_ai.api.models.budget.BudgetNew
import com.hanzo_ai.api.models.budget.BudgetSettingsParams
import com.hanzo_ai.api.models.budget.BudgetUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BudgetServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
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
                BudgetCreateParams.builder()
                    .budgetNew(
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
                    .build()
            )

        budget.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
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
                BudgetUpdateParams.builder()
                    .budgetNew(
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
                    .build()
            )

        budget.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun list() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val budgetServiceAsync = client.budget()

        val budget = budgetServiceAsync.list()

        budget.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
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
