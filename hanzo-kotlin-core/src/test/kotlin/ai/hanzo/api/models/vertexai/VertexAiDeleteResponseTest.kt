// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.vertexai

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VertexAiDeleteResponseTest {

    @Test
    fun create() {
        val vertexAiDeleteResponse = VertexAiDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vertexAiDeleteResponse = VertexAiDeleteResponse.builder().build()

        val roundtrippedVertexAiDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vertexAiDeleteResponse),
                jacksonTypeRef<VertexAiDeleteResponse>(),
            )

        assertThat(roundtrippedVertexAiDeleteResponse).isEqualTo(vertexAiDeleteResponse)
    }
}
