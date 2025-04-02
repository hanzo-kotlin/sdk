// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.vertexai

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VertexAiPatchResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val vertexAiPatchResponse = VertexAiPatchResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vertexAiPatchResponse = VertexAiPatchResponse.builder().build()

        val roundtrippedVertexAiPatchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vertexAiPatchResponse),
                jacksonTypeRef<VertexAiPatchResponse>(),
            )

        assertThat(roundtrippedVertexAiPatchResponse).isEqualTo(vertexAiPatchResponse)
    }
}
