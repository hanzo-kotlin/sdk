// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.gemini

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GeminiUpdateResponseTest {

    @Test
    fun create() {
        val geminiUpdateResponse = GeminiUpdateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val geminiUpdateResponse = GeminiUpdateResponse.builder().build()

        val roundtrippedGeminiUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(geminiUpdateResponse),
                jacksonTypeRef<GeminiUpdateResponse>(),
            )

        assertThat(roundtrippedGeminiUpdateResponse).isEqualTo(geminiUpdateResponse)
    }
}
