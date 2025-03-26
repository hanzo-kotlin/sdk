// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.customer

import com.hanzo_ai.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CustomerCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
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
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.userId()).isEqualTo("user_id")
        assertThat(body.alias()).isEqualTo("alias")
        assertThat(body.allowedModelRegion()).isEqualTo(CustomerCreateParams.AllowedModelRegion.EU)
        assertThat(body.blocked()).isEqualTo(true)
        assertThat(body.budgetDuration()).isEqualTo("budget_duration")
        assertThat(body.budgetId()).isEqualTo("budget_id")
        assertThat(body.defaultModel()).isEqualTo("default_model")
        assertThat(body.maxBudget()).isEqualTo(0.0)
        assertThat(body.maxParallelRequests()).isEqualTo(0L)
        assertThat(body.modelMaxBudget())
            .isEqualTo(
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
        assertThat(body.rpmLimit()).isEqualTo(0L)
        assertThat(body.softBudget()).isEqualTo(0.0)
        assertThat(body.tpmLimit()).isEqualTo(0L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = CustomerCreateParams.builder().userId("user_id").build()

        val body = params._body()

        assertThat(body.userId()).isEqualTo("user_id")
    }
}
