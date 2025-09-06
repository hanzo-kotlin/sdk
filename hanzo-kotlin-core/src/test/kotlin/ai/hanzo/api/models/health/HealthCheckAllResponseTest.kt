// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.health

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HealthCheckAllResponseTest {

    @Test
    fun create() {
        val healthCheckAllResponse = HealthCheckAllResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val healthCheckAllResponse = HealthCheckAllResponse.builder().build()

        val roundtrippedHealthCheckAllResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(healthCheckAllResponse),
                jacksonTypeRef<HealthCheckAllResponse>(),
            )

        assertThat(roundtrippedHealthCheckAllResponse).isEqualTo(healthCheckAllResponse)
    }
}
