// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.anthropic

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AnthropicDeleteResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val anthropicDeleteResponse = AnthropicDeleteResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val anthropicDeleteResponse = AnthropicDeleteResponse.builder().build()

        val roundtrippedAnthropicDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(anthropicDeleteResponse),
                jacksonTypeRef<AnthropicDeleteResponse>(),
            )

        assertThat(roundtrippedAnthropicDeleteResponse).isEqualTo(anthropicDeleteResponse)
    }
}
