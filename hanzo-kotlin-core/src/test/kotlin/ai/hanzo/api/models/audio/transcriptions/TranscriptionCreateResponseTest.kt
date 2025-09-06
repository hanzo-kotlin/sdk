// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.audio.transcriptions

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionCreateResponseTest {

    @Test
    fun create() {
        val transcriptionCreateResponse = TranscriptionCreateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionCreateResponse = TranscriptionCreateResponse.builder().build()

        val roundtrippedTranscriptionCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionCreateResponse),
                jacksonTypeRef<TranscriptionCreateResponse>(),
            )

        assertThat(roundtrippedTranscriptionCreateResponse).isEqualTo(transcriptionCreateResponse)
    }
}
