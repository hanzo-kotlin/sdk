// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking.audio

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClient
import com.hanzo_ai.api.models.audio.transcriptions.TranscriptionCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TranscriptionServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
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
                TranscriptionCreateParams.builder().file("some content".toByteArray()).build()
            )

        transcription.validate()
    }
}
