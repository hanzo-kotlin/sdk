// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.audio

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.audio.transcriptions.TranscriptionCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TranscriptionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val transcriptionServiceAsync = client.audio().transcriptions()

        val transcription =
            transcriptionServiceAsync.create(
                TranscriptionCreateParams.builder().file("some content".byteInputStream()).build()
            )

        transcription.validate()
    }
}
