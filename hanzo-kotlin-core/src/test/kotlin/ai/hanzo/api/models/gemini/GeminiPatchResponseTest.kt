// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.gemini

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GeminiPatchResponseTest {

    @Test
    fun create() {
        val geminiPatchResponse = GeminiPatchResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val geminiPatchResponse = GeminiPatchResponse.builder().build()

        val roundtrippedGeminiPatchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(geminiPatchResponse),
                jacksonTypeRef<GeminiPatchResponse>(),
            )

        assertThat(roundtrippedGeminiPatchResponse).isEqualTo(geminiPatchResponse)
    }
}
