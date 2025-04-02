// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.openai

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OpenAIUpdateResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val openaiUpdateResponse = OpenAIUpdateResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val openaiUpdateResponse = OpenAIUpdateResponse.builder().build()

        val roundtrippedOpenAIUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(openaiUpdateResponse),
                jacksonTypeRef<OpenAIUpdateResponse>(),
            )

        assertThat(roundtrippedOpenAIUpdateResponse).isEqualTo(openaiUpdateResponse)
    }
}
