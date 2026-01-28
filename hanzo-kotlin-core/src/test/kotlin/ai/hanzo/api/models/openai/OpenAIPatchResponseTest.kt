// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.openai

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OpenAIPatchResponseTest {

    @Test
    fun create() {
        val openaiPatchResponse = OpenAIPatchResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val openaiPatchResponse = OpenAIPatchResponse.builder().build()

        val roundtrippedOpenAIPatchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(openaiPatchResponse),
                jacksonTypeRef<OpenAIPatchResponse>(),
            )

        assertThat(roundtrippedOpenAIPatchResponse).isEqualTo(openaiPatchResponse)
    }
}
