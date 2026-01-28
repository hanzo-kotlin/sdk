// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.gemini

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GeminiDeleteResponseTest {

    @Test
    fun create() {
        val geminiDeleteResponse = GeminiDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val geminiDeleteResponse = GeminiDeleteResponse.builder().build()

        val roundtrippedGeminiDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(geminiDeleteResponse),
                jacksonTypeRef<GeminiDeleteResponse>(),
            )

        assertThat(roundtrippedGeminiDeleteResponse).isEqualTo(geminiDeleteResponse)
    }
}
