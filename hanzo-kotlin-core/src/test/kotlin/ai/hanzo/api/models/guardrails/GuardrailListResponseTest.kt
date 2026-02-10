// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.guardrails

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GuardrailListResponseTest {

    @Test
    fun create() {
        val guardrailListResponse =
            GuardrailListResponse.builder()
                .addGuardrail(
                    GuardrailListResponse.Guardrail.builder()
                        .guardrailInfo(JsonValue.from(mapOf<String, Any>()))
                        .guardrailName("guardrail_name")
                        .llmParams(
                            GuardrailListResponse.Guardrail.LlmParams.builder()
                                .guardrail("guardrail")
                                .mode("string")
                                .defaultOn(true)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(guardrailListResponse.guardrails())
            .containsExactly(
                GuardrailListResponse.Guardrail.builder()
                    .guardrailInfo(JsonValue.from(mapOf<String, Any>()))
                    .guardrailName("guardrail_name")
                    .llmParams(
                        GuardrailListResponse.Guardrail.LlmParams.builder()
                            .guardrail("guardrail")
                            .mode("string")
                            .defaultOn(true)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val guardrailListResponse =
            GuardrailListResponse.builder()
                .addGuardrail(
                    GuardrailListResponse.Guardrail.builder()
                        .guardrailInfo(JsonValue.from(mapOf<String, Any>()))
                        .guardrailName("guardrail_name")
                        .llmParams(
                            GuardrailListResponse.Guardrail.LlmParams.builder()
                                .guardrail("guardrail")
                                .mode("string")
                                .defaultOn(true)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedGuardrailListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(guardrailListResponse),
                jacksonTypeRef<GuardrailListResponse>(),
            )

        assertThat(roundtrippedGuardrailListResponse).isEqualTo(guardrailListResponse)
    }
}
