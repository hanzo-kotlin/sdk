// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.hanzo_ai.api.core.ClientOptions
import com.hanzo_ai.api.services.blocking.audio.SpeechService
import com.hanzo_ai.api.services.blocking.audio.SpeechServiceImpl
import com.hanzo_ai.api.services.blocking.audio.TranscriptionService
import com.hanzo_ai.api.services.blocking.audio.TranscriptionServiceImpl

class AudioServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AudioService {

    private val withRawResponse: AudioService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val speech: SpeechService by lazy { SpeechServiceImpl(clientOptions) }

    private val transcriptions: TranscriptionService by lazy {
        TranscriptionServiceImpl(clientOptions)
    }

    override fun withRawResponse(): AudioService.WithRawResponse = withRawResponse

    override fun speech(): SpeechService = speech

    override fun transcriptions(): TranscriptionService = transcriptions

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AudioService.WithRawResponse {

        private val speech: SpeechService.WithRawResponse by lazy {
            SpeechServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val transcriptions: TranscriptionService.WithRawResponse by lazy {
            TranscriptionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun speech(): SpeechService.WithRawResponse = speech

        override fun transcriptions(): TranscriptionService.WithRawResponse = transcriptions
    }
}
