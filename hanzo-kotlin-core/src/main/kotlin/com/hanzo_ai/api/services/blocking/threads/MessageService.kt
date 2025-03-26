// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking.threads

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.threads.messages.MessageCreateParams
import com.hanzo_ai.api.models.threads.messages.MessageCreateResponse
import com.hanzo_ai.api.models.threads.messages.MessageListParams
import com.hanzo_ai.api.models.threads.messages.MessageListResponse

interface MessageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a message.
     *
     * API Reference - https://platform.openai.com/docs/api-reference/messages/createMessage
     */
    fun create(
        params: MessageCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageCreateResponse

    /**
     * Returns a list of messages for a given thread.
     *
     * API Reference - https://platform.openai.com/docs/api-reference/messages/listMessages
     */
    fun list(
        params: MessageListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageListResponse

    /** A view of [MessageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/threads/{thread_id}/messages`, but is otherwise
         * the same as [MessageService.create].
         */
        @MustBeClosed
        fun create(
            params: MessageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/threads/{thread_id}/messages`, but is otherwise
         * the same as [MessageService.list].
         */
        @MustBeClosed
        fun list(
            params: MessageListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageListResponse>
    }
}
