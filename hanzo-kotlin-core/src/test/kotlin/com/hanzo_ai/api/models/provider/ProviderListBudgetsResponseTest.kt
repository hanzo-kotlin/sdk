// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.provider

import com.hanzo_ai.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ProviderListBudgetsResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val providerListBudgetsResponse =
            ProviderListBudgetsResponse.builder()
                .providers(
                    ProviderListBudgetsResponse.Providers.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "budget_limit" to 0,
                                    "time_period" to "time_period",
                                    "budget_reset_at" to "budget_reset_at",
                                    "spend" to 0,
                                )
                            ),
                        )
                        .build()
                )
                .build()

        assertThat(providerListBudgetsResponse.providers())
            .isEqualTo(
                ProviderListBudgetsResponse.Providers.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "budget_limit" to 0,
                                "time_period" to "time_period",
                                "budget_reset_at" to "budget_reset_at",
                                "spend" to 0,
                            )
                        ),
                    )
                    .build()
            )
    }
}
