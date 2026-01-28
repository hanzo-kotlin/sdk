// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.engines

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EngineEmbedResponseTest {

    @Test
    fun create() {
        val engineEmbedResponse = EngineEmbedResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val engineEmbedResponse = EngineEmbedResponse.builder().build()

        val roundtrippedEngineEmbedResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(engineEmbedResponse),
                jacksonTypeRef<EngineEmbedResponse>(),
            )

        assertThat(roundtrippedEngineEmbedResponse).isEqualTo(engineEmbedResponse)
    }
}
