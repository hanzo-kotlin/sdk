// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.vertexai

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VertexAiRetrieveResponseTest {

    @Test
    fun create() {
        val vertexAiRetrieveResponse = VertexAiRetrieveResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vertexAiRetrieveResponse = VertexAiRetrieveResponse.builder().build()

        val roundtrippedVertexAiRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vertexAiRetrieveResponse),
                jacksonTypeRef<VertexAiRetrieveResponse>(),
            )

        assertThat(roundtrippedVertexAiRetrieveResponse).isEqualTo(vertexAiRetrieveResponse)
    }
}
