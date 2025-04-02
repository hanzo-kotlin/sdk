// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.config.passthroughendpoint

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PassThroughEndpointUpdateResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val passThroughEndpointUpdateResponse = PassThroughEndpointUpdateResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
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
