// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.customer

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CustomerListResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val customerListResponse =
            CustomerListResponse.builder()
                .blocked(true)
                .userId("user_id")
                .alias("alias")
                .allowedModelRegion(CustomerListResponse.AllowedModelRegion.EU)
                .defaultModel("default_model")
                .llmBudgetTable(
                    CustomerListResponse.LlmBudgetTable.builder()
                        .budgetDuration("budget_duration")
                        .maxBudget(0.0)
                        .maxParallelRequests(0L)
                        .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                        .rpmLimit(0L)
                        .softBudget(0.0)
                        .tpmLimit(0L)
                        .build()
                )
                .spend(0.0)
                .build()

        assertThat(customerListResponse.blocked()).isEqualTo(true)
        assertThat(customerListResponse.userId()).isEqualTo("user_id")
        assertThat(customerListResponse.alias()).isEqualTo("alias")
        assertThat(customerListResponse.allowedModelRegion())
            .isEqualTo(CustomerListResponse.AllowedModelRegion.EU)
        assertThat(customerListResponse.defaultModel()).isEqualTo("default_model")
        assertThat(customerListResponse.llmBudgetTable())
            .isEqualTo(
                CustomerListResponse.LlmBudgetTable.builder()
                    .budgetDuration("budget_duration")
                    .maxBudget(0.0)
                    .maxParallelRequests(0L)
                    .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                    .rpmLimit(0L)
                    .softBudget(0.0)
                    .tpmLimit(0L)
                    .build()
            )
        assertThat(customerListResponse.spend()).isEqualTo(0.0)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerListResponse =
            CustomerListResponse.builder()
                .blocked(true)
                .userId("user_id")
                .alias("alias")
                .allowedModelRegion(CustomerListResponse.AllowedModelRegion.EU)
                .defaultModel("default_model")
                .llmBudgetTable(
                    CustomerListResponse.LlmBudgetTable.builder()
                        .budgetDuration("budget_duration")
                        .maxBudget(0.0)
                        .maxParallelRequests(0L)
                        .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                        .rpmLimit(0L)
                        .softBudget(0.0)
                        .tpmLimit(0L)
                        .build()
                )
                .spend(0.0)
                .build()

        val roundtrippedCustomerListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerListResponse),
                jacksonTypeRef<CustomerListResponse>(),
            )

        assertThat(roundtrippedCustomerListResponse).isEqualTo(customerListResponse)
    }
}
