// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.config.passthroughendpoint

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PassThroughGenericEndpointTest {

    @Test
    fun create() {
        val passThroughGenericEndpoint =
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

        assertThat(passThroughGenericEndpoint.path()).isEqualTo("path")
        assertThat(passThroughGenericEndpoint.target()).isEqualTo("target")
        assertThat(passThroughGenericEndpoint.id()).isEqualTo("id")
        assertThat(passThroughGenericEndpoint.auth()).isEqualTo(true)
        assertThat(passThroughGenericEndpoint.costPerRequest()).isEqualTo(0.0)
        assertThat(passThroughGenericEndpoint.guardrails())
            .isEqualTo(
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
        assertThat(passThroughGenericEndpoint.headers())
            .isEqualTo(
                PassThroughGenericEndpoint.Headers.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(passThroughGenericEndpoint.includeSubpath()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val passThroughGenericEndpoint =
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

        val roundtrippedPassThroughGenericEndpoint =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(passThroughGenericEndpoint),
                jacksonTypeRef<PassThroughGenericEndpoint>(),
            )

        assertThat(roundtrippedPassThroughGenericEndpoint).isEqualTo(passThroughGenericEndpoint)
    }
}
