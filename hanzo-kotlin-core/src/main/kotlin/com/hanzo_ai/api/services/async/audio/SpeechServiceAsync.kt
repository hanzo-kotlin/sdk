// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.audio

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.audio.speech.SpeechCreateParams
import com.hanzo_ai.api.models.audio.speech.SpeechCreateResponse

interface SpeechServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Same params as:
     *
     * https://platform.openai.com/docs/api-reference/audio/createSpeech
     */
    suspend fun create(
        params: SpeechCreateParams = SpeechCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SpeechCreateResponse

    /** @see [create] */
    suspend fun create(requestOptions: RequestOptions): SpeechCreateResponse =
        create(SpeechCreateParams.none(), requestOptions)

    /**
     * A view of [SpeechServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/audio/speech`, but is otherwise the same as
         * [SpeechServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: SpeechCreateParams = SpeechCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SpeechCreateResponse>

        /** @see [create] */
        @MustBeClosed
        suspend fun create(requestOptions: RequestOptions): HttpResponseFor<SpeechCreateResponse> =
            create(SpeechCreateParams.none(), requestOptions)
    }
}
