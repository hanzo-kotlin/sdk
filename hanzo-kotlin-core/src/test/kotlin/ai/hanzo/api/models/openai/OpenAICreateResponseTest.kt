// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.openai

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OpenAICreateResponseTest {

    @Test
    fun create() {
        val openaiCreateResponse = OpenAICreateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val openaiCreateResponse = OpenAICreateResponse.builder().build()

        val roundtrippedOpenAICreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(openaiCreateResponse),
                jacksonTypeRef<OpenAICreateResponse>(),
            )

        assertThat(roundtrippedOpenAICreateResponse).isEqualTo(openaiCreateResponse)
    }
}
