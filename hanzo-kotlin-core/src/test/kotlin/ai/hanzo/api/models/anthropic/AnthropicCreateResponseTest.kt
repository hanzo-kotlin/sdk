// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.anthropic

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AnthropicCreateResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val anthropicCreateResponse = AnthropicCreateResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val anthropicCreateResponse = AnthropicCreateResponse.builder().build()

        val roundtrippedAnthropicCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(anthropicCreateResponse),
                jacksonTypeRef<AnthropicCreateResponse>(),
            )

        assertThat(roundtrippedAnthropicCreateResponse).isEqualTo(anthropicCreateResponse)
    }
}
