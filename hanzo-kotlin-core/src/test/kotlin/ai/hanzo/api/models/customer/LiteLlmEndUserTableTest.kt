// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.customer

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.jsonMapper
import ai.hanzo.api.models.organization.BudgetTable
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LiteLlmEndUserTableTest {

    @Test
    fun create() {
        val liteLlmEndUserTable =
            LiteLlmEndUserTable.builder()
                .blocked(true)
                .userId("user_id")
                .alias("alias")
                .allowedModelRegion(LiteLlmEndUserTable.AllowedModelRegion.EU)
                .defaultModel("default_model")
                .litellmBudgetTable(
                    BudgetTable.builder()
                        .budgetDuration("budget_duration")
                        .budgetId("budget_id")
                        .maxBudget(0.0)
                        .maxParallelRequests(0L)
                        .modelMaxBudget(
                            BudgetTable.ModelMaxBudget.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .rpmLimit(0L)
                        .softBudget(0.0)
                        .tpmLimit(0L)
                        .build()
                )
                .spend(0.0)
                .build()

        assertThat(liteLlmEndUserTable.blocked()).isEqualTo(true)
        assertThat(liteLlmEndUserTable.userId()).isEqualTo("user_id")
        assertThat(liteLlmEndUserTable.alias()).isEqualTo("alias")
        assertThat(liteLlmEndUserTable.allowedModelRegion())
            .isEqualTo(LiteLlmEndUserTable.AllowedModelRegion.EU)
        assertThat(liteLlmEndUserTable.defaultModel()).isEqualTo("default_model")
        assertThat(liteLlmEndUserTable.litellmBudgetTable())
            .isEqualTo(
                BudgetTable.builder()
                    .budgetDuration("budget_duration")
                    .budgetId("budget_id")
                    .maxBudget(0.0)
                    .maxParallelRequests(0L)
                    .modelMaxBudget(
                        BudgetTable.ModelMaxBudget.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .rpmLimit(0L)
                    .softBudget(0.0)
                    .tpmLimit(0L)
                    .build()
            )
        assertThat(liteLlmEndUserTable.spend()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val liteLlmEndUserTable =
            LiteLlmEndUserTable.builder()
                .blocked(true)
                .userId("user_id")
                .alias("alias")
                .allowedModelRegion(LiteLlmEndUserTable.AllowedModelRegion.EU)
                .defaultModel("default_model")
                .litellmBudgetTable(
                    BudgetTable.builder()
                        .budgetDuration("budget_duration")
                        .budgetId("budget_id")
                        .maxBudget(0.0)
                        .maxParallelRequests(0L)
                        .modelMaxBudget(
                            BudgetTable.ModelMaxBudget.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .rpmLimit(0L)
                        .softBudget(0.0)
                        .tpmLimit(0L)
                        .build()
                )
                .spend(0.0)
                .build()

        val roundtrippedLiteLlmEndUserTable =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(liteLlmEndUserTable),
                jacksonTypeRef<LiteLlmEndUserTable>(),
            )

        assertThat(roundtrippedLiteLlmEndUserTable).isEqualTo(liteLlmEndUserTable)
    }
}
