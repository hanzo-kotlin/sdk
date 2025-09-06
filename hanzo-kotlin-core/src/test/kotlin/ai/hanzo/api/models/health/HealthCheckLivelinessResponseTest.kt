// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.health

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HealthCheckLivelinessResponseTest {

    @Test
    fun create() {
        val healthCheckLivelinessResponse = HealthCheckLivelinessResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val healthCheckLivelinessResponse = HealthCheckLivelinessResponse.builder().build()

        val roundtrippedHealthCheckLivelinessResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(healthCheckLivelinessResponse),
                jacksonTypeRef<HealthCheckLivelinessResponse>(),
            )

        assertThat(roundtrippedHealthCheckLivelinessResponse)
            .isEqualTo(healthCheckLivelinessResponse)
    }
}
