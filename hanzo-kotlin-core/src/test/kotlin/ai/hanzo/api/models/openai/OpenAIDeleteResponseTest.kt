// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.openai

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OpenAIDeleteResponseTest {

    @Test
    fun create() {
        val openaiDeleteResponse = OpenAIDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val openaiDeleteResponse = OpenAIDeleteResponse.builder().build()

        val roundtrippedOpenAIDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(openaiDeleteResponse),
                jacksonTypeRef<OpenAIDeleteResponse>(),
            )

        assertThat(roundtrippedOpenAIDeleteResponse).isEqualTo(openaiDeleteResponse)
    }
}
