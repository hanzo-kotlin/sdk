// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.audio.speech

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpeechCreateResponseTest {

    @Test
    fun create() {
        val speechCreateResponse = SpeechCreateResponse.builder().build()
    }

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
