// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.vertexai

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VertexAiUpdateResponseTest {

    @Test
    fun create() {
        val vertexAiUpdateResponse = VertexAiUpdateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vertexAiUpdateResponse = VertexAiUpdateResponse.builder().build()

        val roundtrippedVertexAiUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vertexAiUpdateResponse),
                jacksonTypeRef<VertexAiUpdateResponse>(),
            )

        assertThat(roundtrippedVertexAiUpdateResponse).isEqualTo(vertexAiUpdateResponse)
    }
}
