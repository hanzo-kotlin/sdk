// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.audio

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import ai.hanzo.api.models.audio.transcriptions.TranscriptionCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TranscriptionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val transcriptionService = client.audio().transcriptions()

        val transcription =
            transcriptionService.create(
                TranscriptionCreateParams.builder().file("some content".byteInputStream()).build()
            )

        transcription.validate()
    }
}
