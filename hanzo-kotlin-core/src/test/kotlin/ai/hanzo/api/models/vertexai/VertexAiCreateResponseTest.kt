// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.vertexai

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VertexAiCreateResponseTest {

    @Test
    fun create() {
        val vertexAiCreateResponse = VertexAiCreateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vertexAiCreateResponse = VertexAiCreateResponse.builder().build()

        val roundtrippedVertexAiCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vertexAiCreateResponse),
                jacksonTypeRef<VertexAiCreateResponse>(),
            )

        assertThat(roundtrippedVertexAiCreateResponse).isEqualTo(vertexAiCreateResponse)
    }
}
