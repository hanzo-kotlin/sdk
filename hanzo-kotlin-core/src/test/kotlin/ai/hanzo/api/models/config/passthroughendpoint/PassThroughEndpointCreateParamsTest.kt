// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.config.passthroughendpoint

import ai.hanzo.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PassThroughEndpointCreateParamsTest {

    @Test
    fun create() {
        PassThroughEndpointCreateParams.builder()
            .passThroughGenericEndpoint(
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
    }

    @Test
    fun body() {
        val params =
            PassThroughEndpointCreateParams.builder()
                .passThroughGenericEndpoint(
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    fun bodyWithoutOptionalFields() {
        val params =
            PassThroughEndpointCreateParams.builder()
                .passThroughGenericEndpoint(
                    PassThroughGenericEndpoint.builder().path("path").target("target").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(PassThroughGenericEndpoint.builder().path("path").target("target").build())
    }
}
