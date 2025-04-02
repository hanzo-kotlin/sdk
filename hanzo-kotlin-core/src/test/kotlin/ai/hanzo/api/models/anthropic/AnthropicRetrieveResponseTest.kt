// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.anthropic

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AnthropicRetrieveResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val anthropicRetrieveResponse = AnthropicRetrieveResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val anthropicRetrieveResponse = AnthropicRetrieveResponse.builder().build()

        val roundtrippedAnthropicRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(anthropicRetrieveResponse),
                jacksonTypeRef<AnthropicRetrieveResponse>(),
            )

        assertThat(roundtrippedAnthropicRetrieveResponse).isEqualTo(anthropicRetrieveResponse)
    }
}
