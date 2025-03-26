// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.audio

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.audio.transcriptions.TranscriptionCreateParams
import com.hanzo_ai.api.models.audio.transcriptions.TranscriptionCreateResponse

interface TranscriptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Same params as:
     *
     * https://platform.openai.com/docs/api-reference/audio/createTranscription?lang=curl
     */
    suspend fun create(
        params: TranscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TranscriptionCreateResponse

    /**
     * A view of [TranscriptionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/audio/transcriptions`, but is otherwise the
         * same as [TranscriptionServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: TranscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TranscriptionCreateResponse>
    }
}
