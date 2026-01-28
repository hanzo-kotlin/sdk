// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.gemini

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GeminiRetrieveResponseTest {

    @Test
    fun create() {
        val geminiRetrieveResponse = GeminiRetrieveResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val geminiRetrieveResponse = GeminiRetrieveResponse.builder().build()

        val roundtrippedGeminiRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(geminiRetrieveResponse),
                jacksonTypeRef<GeminiRetrieveResponse>(),
            )

        assertThat(roundtrippedGeminiRetrieveResponse).isEqualTo(geminiRetrieveResponse)
    }
}
