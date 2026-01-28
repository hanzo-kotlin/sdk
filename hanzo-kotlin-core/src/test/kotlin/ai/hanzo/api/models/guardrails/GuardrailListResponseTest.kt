// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.guardrails

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GuardrailListResponseTest {

    @Test
    fun create() {
        val guardrailListResponse =
            GuardrailListResponse.builder()
                .addGuardrail(
                    GuardrailListResponse.Guardrail.builder()
                        .guardrailName("guardrail_name")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .guardrailDefinitionLocation(
                            GuardrailListResponse.Guardrail.GuardrailDefinitionLocation.DB
                        )
                        .guardrailId("guardrail_id")
                        .guardrailInfo(
                            GuardrailListResponse.Guardrail.GuardrailInfo.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .litellmParams(
                            GuardrailListResponse.Guardrail.LitellmParams.builder()
                                .additionalProviderSpecificParams(
                                    GuardrailListResponse.Guardrail.LitellmParams
                                        .AdditionalProviderSpecificParams
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .apiBase("api_base")
                                .apiEndpoint("api_endpoint")
                                .apiKey("api_key")
                                .categoryThresholds(
                                    GuardrailListResponse.Guardrail.LitellmParams.CategoryThresholds
                                        .builder()
                                        .jailbreak(0.0)
                                        .promptInjection(0.0)
                                        .build()
                                )
                                .credentials("credentials")
                                .defaultOn(true)
                                .detectSecretsConfig(
                                    GuardrailListResponse.Guardrail.LitellmParams
                                        .DetectSecretsConfig
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .experimentalUseLatestRoleMessageOnly(true)
                                .failOnError(true)
                                .guardName("guard_name")
                                .location("location")
                                .maskRequestContent(true)
                                .maskResponseContent(true)
                                .model("model")
                                .pangeaInputRecipe("pangea_input_recipe")
                                .pangeaOutputRecipe("pangea_output_recipe")
                                .templateId("template_id")
                                .violationMessageTemplate("violation_message_template")
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(guardrailListResponse.guardrails())
            .containsExactly(
                GuardrailListResponse.Guardrail.builder()
                    .guardrailName("guardrail_name")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .guardrailDefinitionLocation(
                        GuardrailListResponse.Guardrail.GuardrailDefinitionLocation.DB
                    )
                    .guardrailId("guardrail_id")
                    .guardrailInfo(
                        GuardrailListResponse.Guardrail.GuardrailInfo.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .litellmParams(
                        GuardrailListResponse.Guardrail.LitellmParams.builder()
                            .additionalProviderSpecificParams(
                                GuardrailListResponse.Guardrail.LitellmParams
                                    .AdditionalProviderSpecificParams
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .apiBase("api_base")
                            .apiEndpoint("api_endpoint")
                            .apiKey("api_key")
                            .categoryThresholds(
                                GuardrailListResponse.Guardrail.LitellmParams.CategoryThresholds
                                    .builder()
                                    .jailbreak(0.0)
                                    .promptInjection(0.0)
                                    .build()
                            )
                            .credentials("credentials")
                            .defaultOn(true)
                            .detectSecretsConfig(
                                GuardrailListResponse.Guardrail.LitellmParams.DetectSecretsConfig
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .experimentalUseLatestRoleMessageOnly(true)
                            .failOnError(true)
                            .guardName("guard_name")
                            .location("location")
                            .maskRequestContent(true)
                            .maskResponseContent(true)
                            .model("model")
                            .pangeaInputRecipe("pangea_input_recipe")
                            .pangeaOutputRecipe("pangea_output_recipe")
                            .templateId("template_id")
                            .violationMessageTemplate("violation_message_template")
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                        .guardrailName("guardrail_name")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .guardrailDefinitionLocation(
                            GuardrailListResponse.Guardrail.GuardrailDefinitionLocation.DB
                        )
                        .guardrailId("guardrail_id")
                        .guardrailInfo(
                            GuardrailListResponse.Guardrail.GuardrailInfo.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .litellmParams(
                            GuardrailListResponse.Guardrail.LitellmParams.builder()
                                .additionalProviderSpecificParams(
                                    GuardrailListResponse.Guardrail.LitellmParams
                                        .AdditionalProviderSpecificParams
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .apiBase("api_base")
                                .apiEndpoint("api_endpoint")
                                .apiKey("api_key")
                                .categoryThresholds(
                                    GuardrailListResponse.Guardrail.LitellmParams.CategoryThresholds
                                        .builder()
                                        .jailbreak(0.0)
                                        .promptInjection(0.0)
                                        .build()
                                )
                                .credentials("credentials")
                                .defaultOn(true)
                                .detectSecretsConfig(
                                    GuardrailListResponse.Guardrail.LitellmParams
                                        .DetectSecretsConfig
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .experimentalUseLatestRoleMessageOnly(true)
                                .failOnError(true)
                                .guardName("guard_name")
                                .location("location")
                                .maskRequestContent(true)
                                .maskResponseContent(true)
                                .model("model")
                                .pangeaInputRecipe("pangea_input_recipe")
                                .pangeaOutputRecipe("pangea_output_recipe")
                                .templateId("template_id")
                                .violationMessageTemplate("violation_message_template")
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
