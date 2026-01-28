// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.gemini

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GeminiCreateResponseTest {

    @Test
    fun create() {
        val geminiCreateResponse = GeminiCreateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val geminiCreateResponse = GeminiCreateResponse.builder().build()

        val roundtrippedGeminiCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(geminiCreateResponse),
                jacksonTypeRef<GeminiCreateResponse>(),
            )

        assertThat(roundtrippedGeminiCreateResponse).isEqualTo(geminiCreateResponse)
    }
}
