// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.budget

import com.hanzo_ai.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BudgetUpdateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
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
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = BudgetUpdateParams.builder().budgetNew(BudgetNew.builder().build()).build()

        val body = params._body()

        assertThat(body).isEqualTo(BudgetNew.builder().build())
    }
}
