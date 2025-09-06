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
                        .headers(JsonValue.from(mapOf<String, Any>()))
                        .path("path")
                        .target("target")
                        .build()
                )
                .build()

        assertThat(passThroughEndpointResponse.endpoints())
            .containsExactly(
                PassThroughGenericEndpoint.builder()
                    .headers(JsonValue.from(mapOf<String, Any>()))
                    .path("path")
                    .target("target")
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
                        .headers(JsonValue.from(mapOf<String, Any>()))
                        .path("path")
                        .target("target")
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
