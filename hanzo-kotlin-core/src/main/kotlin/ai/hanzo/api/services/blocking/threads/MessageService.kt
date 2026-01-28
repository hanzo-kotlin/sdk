// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.threads

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.threads.messages.MessageCreateParams
import ai.hanzo.api.models.threads.messages.MessageCreateResponse
import ai.hanzo.api.models.threads.messages.MessageListParams
import ai.hanzo.api.models.threads.messages.MessageListResponse
import com.google.errorprone.annotations.MustBeClosed

interface MessageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MessageService

    /**
     * Create a message.
     *
     * API Reference - https://platform.openai.com/docs/api-reference/messages/createMessage
     */
    fun create(
        threadId: String,
        params: MessageCreateParams = MessageCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageCreateResponse = create(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see create */
    fun create(
        params: MessageCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageCreateResponse

    /** @see create */
    fun create(threadId: String, requestOptions: RequestOptions): MessageCreateResponse =
        create(threadId, MessageCreateParams.none(), requestOptions)

    /**
     * Returns a list of messages for a given thread.
     *
     * API Reference - https://platform.openai.com/docs/api-reference/messages/listMessages
     */
    fun list(
        threadId: String,
        params: MessageListParams = MessageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageListResponse = list(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see list */
    fun list(
        params: MessageListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageListResponse

    /** @see list */
    fun list(threadId: String, requestOptions: RequestOptions): MessageListResponse =
        list(threadId, MessageListParams.none(), requestOptions)

    /** A view of [MessageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MessageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/threads/{thread_id}/messages`, but is otherwise
         * the same as [MessageService.create].
         */
        @MustBeClosed
        fun create(
            threadId: String,
            params: MessageCreateParams = MessageCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageCreateResponse> =
            create(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: MessageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            threadId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageCreateResponse> =
            create(threadId, MessageCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/threads/{thread_id}/messages`, but is otherwise
         * the same as [MessageService.list].
         */
        @MustBeClosed
        fun list(
            threadId: String,
            params: MessageListParams = MessageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageListResponse> =
            list(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessageListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            threadId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageListResponse> =
            list(threadId, MessageListParams.none(), requestOptions)
    }
}
