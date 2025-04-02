// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.audio.speech

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SpeechCreateResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val speechCreateResponse = SpeechCreateResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val speechCreateResponse = SpeechCreateResponse.builder().build()

        val roundtrippedSpeechCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(speechCreateResponse),
                jacksonTypeRef<SpeechCreateResponse>(),
            )

        assertThat(roundtrippedSpeechCreateResponse).isEqualTo(speechCreateResponse)
    }
}
