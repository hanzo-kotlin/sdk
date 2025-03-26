// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.openai.deployments

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.openai.deployments.chat.ChatCompleteParams
import com.hanzo_ai.api.models.openai.deployments.chat.ChatCompleteResponse

interface ChatServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

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
        params: ChatCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatCompleteResponse

    /** A view of [ChatServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /openai/deployments/{model}/chat/completions`, but
         * is otherwise the same as [ChatServiceAsync.complete].
         */
        @MustBeClosed
        suspend fun complete(
            params: ChatCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatCompleteResponse>
    }
}
