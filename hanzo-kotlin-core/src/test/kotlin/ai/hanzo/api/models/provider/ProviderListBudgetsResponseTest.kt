// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.provider

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProviderListBudgetsResponseTest {

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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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

        val roundtrippedProviderListBudgetsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(providerListBudgetsResponse),
                jacksonTypeRef<ProviderListBudgetsResponse>(),
            )

        assertThat(roundtrippedProviderListBudgetsResponse).isEqualTo(providerListBudgetsResponse)
    }
}
