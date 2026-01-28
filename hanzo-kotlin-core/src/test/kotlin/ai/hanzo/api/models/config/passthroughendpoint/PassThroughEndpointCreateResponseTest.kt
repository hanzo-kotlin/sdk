// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.config.passthroughendpoint

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PassThroughEndpointCreateResponseTest {

    @Test
    fun create() {
        val passThroughEndpointCreateResponse = PassThroughEndpointCreateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val passThroughEndpointCreateResponse = PassThroughEndpointCreateResponse.builder().build()

        val roundtrippedPassThroughEndpointCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(passThroughEndpointCreateResponse),
                jacksonTypeRef<PassThroughEndpointCreateResponse>(),
            )

        assertThat(roundtrippedPassThroughEndpointCreateResponse)
            .isEqualTo(passThroughEndpointCreateResponse)
    }
}
