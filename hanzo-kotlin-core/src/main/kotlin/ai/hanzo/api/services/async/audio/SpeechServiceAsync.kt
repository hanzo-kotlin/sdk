// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.audio

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.audio.speech.SpeechCreateParams
import ai.hanzo.api.models.audio.speech.SpeechCreateResponse
import com.google.errorprone.annotations.MustBeClosed

interface SpeechServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SpeechServiceAsync

    /**
     * Same params as:
     *
     * https://platform.openai.com/docs/api-reference/audio/createSpeech
     */
    suspend fun create(
        params: SpeechCreateParams = SpeechCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SpeechCreateResponse

    /** @see create */
    suspend fun create(requestOptions: RequestOptions): SpeechCreateResponse =
        create(SpeechCreateParams.none(), requestOptions)

    /**
     * A view of [SpeechServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SpeechServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/audio/speech`, but is otherwise the same as
         * [SpeechServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: SpeechCreateParams = SpeechCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SpeechCreateResponse>

        /** @see create */
        @MustBeClosed
        suspend fun create(requestOptions: RequestOptions): HttpResponseFor<SpeechCreateResponse> =
            create(SpeechCreateParams.none(), requestOptions)
    }
}
