// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.customer

import com.hanzo_ai.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CustomerRetrieveInfoResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val customerRetrieveInfoResponse =
            CustomerRetrieveInfoResponse.builder()
                .blocked(true)
                .userId("user_id")
                .alias("alias")
                .allowedModelRegion(CustomerRetrieveInfoResponse.AllowedModelRegion.EU)
                .defaultModel("default_model")
                .llmBudgetTable(
                    CustomerRetrieveInfoResponse.LlmBudgetTable.builder()
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

        assertThat(customerRetrieveInfoResponse.blocked()).isEqualTo(true)
        assertThat(customerRetrieveInfoResponse.userId()).isEqualTo("user_id")
        assertThat(customerRetrieveInfoResponse.alias()).isEqualTo("alias")
        assertThat(customerRetrieveInfoResponse.allowedModelRegion())
            .isEqualTo(CustomerRetrieveInfoResponse.AllowedModelRegion.EU)
        assertThat(customerRetrieveInfoResponse.defaultModel()).isEqualTo("default_model")
        assertThat(customerRetrieveInfoResponse.llmBudgetTable())
            .isEqualTo(
                CustomerRetrieveInfoResponse.LlmBudgetTable.builder()
                    .budgetDuration("budget_duration")
                    .maxBudget(0.0)
                    .maxParallelRequests(0L)
                    .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                    .rpmLimit(0L)
                    .softBudget(0.0)
                    .tpmLimit(0L)
                    .build()
            )
        assertThat(customerRetrieveInfoResponse.spend()).isEqualTo(0.0)
    }
}
