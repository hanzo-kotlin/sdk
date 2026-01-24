// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.budget

import ai.hanzo.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BudgetUpdateParamsTest {

    @Test
    fun create() {
        BudgetUpdateParams.builder()
            .budgetNew(
                BudgetNew.builder()
                    .budgetDuration("budget_duration")
                    .budgetId("budget_id")
                    .budgetResetAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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

    @Test
    fun body() {
        val params =
            BudgetUpdateParams.builder()
                .budgetNew(
                    BudgetNew.builder()
                        .budgetDuration("budget_duration")
                        .budgetId("budget_id")
                        .budgetResetAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                    .budgetResetAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BudgetUpdateParams.builder().budgetNew(BudgetNew.builder().build()).build()

        val body = params._body()

        assertThat(body).isEqualTo(BudgetNew.builder().build())
    }
}
