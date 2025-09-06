// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.anthropic

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnthropicModifyResponseTest {

    @Test
    fun create() {
        val anthropicModifyResponse = AnthropicModifyResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val anthropicModifyResponse = AnthropicModifyResponse.builder().build()

        val roundtrippedAnthropicModifyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(anthropicModifyResponse),
                jacksonTypeRef<AnthropicModifyResponse>(),
            )

        assertThat(roundtrippedAnthropicModifyResponse).isEqualTo(anthropicModifyResponse)
    }
}
