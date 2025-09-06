// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.threads.messages

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageCreateResponseTest {

    @Test
    fun create() {
        val messageCreateResponse = MessageCreateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageCreateResponse = MessageCreateResponse.builder().build()

        val roundtrippedMessageCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageCreateResponse),
                jacksonTypeRef<MessageCreateResponse>(),
            )

        assertThat(roundtrippedMessageCreateResponse).isEqualTo(messageCreateResponse)
    }
}
