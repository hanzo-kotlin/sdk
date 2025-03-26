// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.services.async.audio.SpeechServiceAsync
import ai.hanzo.api.services.async.audio.SpeechServiceAsyncImpl
import ai.hanzo.api.services.async.audio.TranscriptionServiceAsync
import ai.hanzo.api.services.async.audio.TranscriptionServiceAsyncImpl

class AudioServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AudioServiceAsync {

    private val withRawResponse: AudioServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val speech: SpeechServiceAsync by lazy { SpeechServiceAsyncImpl(clientOptions) }

    private val transcriptions: TranscriptionServiceAsync by lazy {
        TranscriptionServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): AudioServiceAsync.WithRawResponse = withRawResponse

    override fun speech(): SpeechServiceAsync = speech

    override fun transcriptions(): TranscriptionServiceAsync = transcriptions

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AudioServiceAsync.WithRawResponse {

        private val speech: SpeechServiceAsync.WithRawResponse by lazy {
            SpeechServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val transcriptions: TranscriptionServiceAsync.WithRawResponse by lazy {
            TranscriptionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun speech(): SpeechServiceAsync.WithRawResponse = speech

        override fun transcriptions(): TranscriptionServiceAsync.WithRawResponse = transcriptions
    }
}
