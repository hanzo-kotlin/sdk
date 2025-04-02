// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.config.passthroughendpoint

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PassThroughGenericEndpointTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val passThroughGenericEndpoint =
            PassThroughGenericEndpoint.builder()
                .headers(JsonValue.from(mapOf<String, Any>()))
                .path("path")
                .target("target")
                .build()

        assertThat(passThroughGenericEndpoint._headers())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(passThroughGenericEndpoint.path()).isEqualTo("path")
        assertThat(passThroughGenericEndpoint.target()).isEqualTo("target")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val passThroughGenericEndpoint =
            PassThroughGenericEndpoint.builder()
                .headers(JsonValue.from(mapOf<String, Any>()))
                .path("path")
                .target("target")
                .build()

        val roundtrippedPassThroughGenericEndpoint =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(passThroughGenericEndpoint),
                jacksonTypeRef<PassThroughGenericEndpoint>(),
            )

        assertThat(roundtrippedPassThroughGenericEndpoint).isEqualTo(passThroughGenericEndpoint)
    }
}
