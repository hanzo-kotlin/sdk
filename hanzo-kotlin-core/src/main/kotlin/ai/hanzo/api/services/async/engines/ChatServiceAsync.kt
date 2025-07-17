// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.engines

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.engines.chat.ChatCompleteParams
import ai.hanzo.api.models.engines.chat.ChatCompleteResponse
import com.google.errorprone.annotations.MustBeClosed

interface ChatServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ChatServiceAsync

    /**
     * Follows the exact same API spec as `OpenAI's Chat API
     * https://platform.openai.com/docs/api-reference/chat`
     *
     * ```bash
     * curl -X POST http://localhost:4000/v1/chat/completions
     * -H "Content-Type: application/json"
     * -H "Authorization: Bearer sk-1234"
     * -d '{
     *     "model": "gpt-4o",
     *     "messages": [
     *         {
     *             "role": "user",
     *             "content": "Hello!"
     *         }
     *     ]
     * }'
     * ```
     */
    suspend fun complete(
        model: String,
        params: ChatCompleteParams = ChatCompleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatCompleteResponse = complete(params.toBuilder().model(model).build(), requestOptions)

    /** @see [complete] */
    suspend fun complete(
        params: ChatCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatCompleteResponse

    /** @see [complete] */
    suspend fun complete(model: String, requestOptions: RequestOptions): ChatCompleteResponse =
        complete(model, ChatCompleteParams.none(), requestOptions)

    /** A view of [ChatServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ChatServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /engines/{model}/chat/completions`, but is
         * otherwise the same as [ChatServiceAsync.complete].
         */
        @MustBeClosed
        suspend fun complete(
            model: String,
            params: ChatCompleteParams = ChatCompleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatCompleteResponse> =
            complete(params.toBuilder().model(model).build(), requestOptions)

        /** @see [complete] */
        @MustBeClosed
        suspend fun complete(
            params: ChatCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatCompleteResponse>

        /** @see [complete] */
        @MustBeClosed
        suspend fun complete(
            model: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatCompleteResponse> =
            complete(model, ChatCompleteParams.none(), requestOptions)
    }
}
