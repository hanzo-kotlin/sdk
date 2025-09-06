// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.config.passthroughendpoint

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PassThroughEndpointUpdateResponseTest {

    @Test
    fun create() {
        val passThroughEndpointUpdateResponse = PassThroughEndpointUpdateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val passThroughEndpointUpdateResponse = PassThroughEndpointUpdateResponse.builder().build()

        val roundtrippedPassThroughEndpointUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(passThroughEndpointUpdateResponse),
                jacksonTypeRef<PassThroughEndpointUpdateResponse>(),
            )

        assertThat(roundtrippedPassThroughEndpointUpdateResponse)
            .isEqualTo(passThroughEndpointUpdateResponse)
    }
}
