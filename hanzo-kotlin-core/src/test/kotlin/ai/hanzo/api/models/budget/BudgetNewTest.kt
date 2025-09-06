// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.budget

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BudgetNewTest {

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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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

        val roundtrippedBudgetNew =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(budgetNew),
                jacksonTypeRef<BudgetNew>(),
            )

        assertThat(roundtrippedBudgetNew).isEqualTo(budgetNew)
    }
}
