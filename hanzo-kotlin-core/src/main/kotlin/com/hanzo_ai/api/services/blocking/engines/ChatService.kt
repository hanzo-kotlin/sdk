// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking.engines

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.engines.chat.ChatCompleteParams
import com.hanzo_ai.api.models.engines.chat.ChatCompleteResponse

interface ChatService {

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
    fun complete(
        params: ChatCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatCompleteResponse

    /** A view of [ChatService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /engines/{model}/chat/completions`, but is
         * otherwise the same as [ChatService.complete].
         */
        @MustBeClosed
        fun complete(
            params: ChatCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatCompleteResponse>
    }
}
