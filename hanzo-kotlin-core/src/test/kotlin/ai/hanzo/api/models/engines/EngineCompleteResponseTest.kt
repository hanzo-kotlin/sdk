// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.engines

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EngineCompleteResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val engineCompleteResponse = EngineCompleteResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val engineCompleteResponse = EngineCompleteResponse.builder().build()

        val roundtrippedEngineCompleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(engineCompleteResponse),
                jacksonTypeRef<EngineCompleteResponse>(),
            )

        assertThat(roundtrippedEngineCompleteResponse).isEqualTo(engineCompleteResponse)
    }
}
