// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.health

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HealthCheckReadinessResponseTest {

    @Test
    fun create() {
        val healthCheckReadinessResponse = HealthCheckReadinessResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val healthCheckReadinessResponse = HealthCheckReadinessResponse.builder().build()

        val roundtrippedHealthCheckReadinessResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(healthCheckReadinessResponse),
                jacksonTypeRef<HealthCheckReadinessResponse>(),
            )

        assertThat(roundtrippedHealthCheckReadinessResponse).isEqualTo(healthCheckReadinessResponse)
    }
}
