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
                    .headers(JsonValue.from(mapOf<String, Any>()))
                    .path("path")
                    .target("target")
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
                        .headers(JsonValue.from(mapOf<String, Any>()))
                        .path("path")
                        .target("target")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PassThroughGenericEndpoint.builder()
                    .headers(JsonValue.from(mapOf<String, Any>()))
                    .path("path")
                    .target("target")
                    .build()
            )
    }
}
