// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.health

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class HealthCheckLivenessResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val healthCheckLivenessResponse = HealthCheckLivenessResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val healthCheckLivenessResponse = HealthCheckLivenessResponse.builder().build()

        val roundtrippedHealthCheckLivenessResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(healthCheckLivenessResponse),
                jacksonTypeRef<HealthCheckLivenessResponse>(),
            )

        assertThat(roundtrippedHealthCheckLivenessResponse).isEqualTo(healthCheckLivenessResponse)
    }
}
