// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking.audio

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.audio.transcriptions.TranscriptionCreateParams
import com.hanzo_ai.api.models.audio.transcriptions.TranscriptionCreateResponse

interface TranscriptionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Same params as:
     *
     * https://platform.openai.com/docs/api-reference/audio/createTranscription?lang=curl
     */
    fun create(
        params: TranscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TranscriptionCreateResponse

    /**
     * A view of [TranscriptionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/audio/transcriptions`, but is otherwise the
         * same as [TranscriptionService.create].
         */
        @MustBeClosed
        fun create(
            params: TranscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TranscriptionCreateResponse>
    }
}
