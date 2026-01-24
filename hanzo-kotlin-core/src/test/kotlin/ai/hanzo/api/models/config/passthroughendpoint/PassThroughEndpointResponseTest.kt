// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.config.passthroughendpoint

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PassThroughEndpointResponseTest {

    @Test
    fun create() {
        val passThroughEndpointResponse =
            PassThroughEndpointResponse.builder()
                .addEndpoint(
                    PassThroughGenericEndpoint.builder()
                        .path("path")
                        .target("target")
                        .id("id")
                        .auth(true)
                        .costPerRequest(0.0)
                        .guardrails(
                            PassThroughGenericEndpoint.Guardrails.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "request_fields" to listOf("string"),
                                            "response_fields" to listOf("string"),
                                        )
                                    ),
                                )
                                .build()
                        )
                        .headers(
                            PassThroughGenericEndpoint.Headers.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .includeSubpath(true)
                        .build()
                )
                .build()

        assertThat(passThroughEndpointResponse.endpoints())
            .containsExactly(
                PassThroughGenericEndpoint.builder()
                    .path("path")
                    .target("target")
                    .id("id")
                    .auth(true)
                    .costPerRequest(0.0)
                    .guardrails(
                        PassThroughGenericEndpoint.Guardrails.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    mapOf(
                                        "request_fields" to listOf("string"),
                                        "response_fields" to listOf("string"),
                                    )
                                ),
                            )
                            .build()
                    )
                    .headers(
                        PassThroughGenericEndpoint.Headers.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .includeSubpath(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val passThroughEndpointResponse =
            PassThroughEndpointResponse.builder()
                .addEndpoint(
                    PassThroughGenericEndpoint.builder()
                        .path("path")
                        .target("target")
                        .id("id")
                        .auth(true)
                        .costPerRequest(0.0)
                        .guardrails(
                            PassThroughGenericEndpoint.Guardrails.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "request_fields" to listOf("string"),
                                            "response_fields" to listOf("string"),
                                        )
                                    ),
                                )
                                .build()
                        )
                        .headers(
                            PassThroughGenericEndpoint.Headers.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .includeSubpath(true)
                        .build()
                )
                .build()

        val roundtrippedPassThroughEndpointResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(passThroughEndpointResponse),
                jacksonTypeRef<PassThroughEndpointResponse>(),
            )

        assertThat(roundtrippedPassThroughEndpointResponse).isEqualTo(passThroughEndpointResponse)
    }
}
