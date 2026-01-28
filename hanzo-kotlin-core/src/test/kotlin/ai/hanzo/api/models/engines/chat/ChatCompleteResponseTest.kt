// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.engines.chat

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCompleteResponseTest {

    @Test
    fun create() {
        val chatCompleteResponse = ChatCompleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatCompleteResponse = ChatCompleteResponse.builder().build()

        val roundtrippedChatCompleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatCompleteResponse),
                jacksonTypeRef<ChatCompleteResponse>(),
            )

        assertThat(roundtrippedChatCompleteResponse).isEqualTo(chatCompleteResponse)
    }
}
