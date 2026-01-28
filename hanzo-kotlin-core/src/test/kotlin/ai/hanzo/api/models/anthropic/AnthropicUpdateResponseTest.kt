// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.anthropic

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnthropicUpdateResponseTest {

    @Test
    fun create() {
        val anthropicUpdateResponse = AnthropicUpdateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val anthropicUpdateResponse = AnthropicUpdateResponse.builder().build()

        val roundtrippedAnthropicUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(anthropicUpdateResponse),
                jacksonTypeRef<AnthropicUpdateResponse>(),
            )

        assertThat(roundtrippedAnthropicUpdateResponse).isEqualTo(anthropicUpdateResponse)
    }
}
