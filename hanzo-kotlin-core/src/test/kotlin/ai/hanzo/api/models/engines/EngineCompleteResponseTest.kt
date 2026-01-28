// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.engines

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EngineCompleteResponseTest {

    @Test
    fun create() {
        val engineCompleteResponse = EngineCompleteResponse.builder().build()
    }

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
