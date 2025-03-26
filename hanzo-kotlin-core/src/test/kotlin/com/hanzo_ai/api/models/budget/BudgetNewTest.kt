// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.budget

import com.hanzo_ai.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BudgetNewTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val budgetNew =
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

        assertThat(budgetNew.budgetDuration()).isEqualTo("budget_duration")
        assertThat(budgetNew.budgetId()).isEqualTo("budget_id")
        assertThat(budgetNew.maxBudget()).isEqualTo(0.0)
        assertThat(budgetNew.maxParallelRequests()).isEqualTo(0L)
        assertThat(budgetNew.modelMaxBudget())
            .isEqualTo(
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
        assertThat(budgetNew.rpmLimit()).isEqualTo(0L)
        assertThat(budgetNew.softBudget()).isEqualTo(0.0)
        assertThat(budgetNew.tpmLimit()).isEqualTo(0L)
    }
}
