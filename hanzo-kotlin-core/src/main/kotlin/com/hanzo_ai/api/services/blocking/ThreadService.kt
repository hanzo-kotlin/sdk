// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.threads.ThreadCreateParams
import com.hanzo_ai.api.models.threads.ThreadCreateResponse
import com.hanzo_ai.api.models.threads.ThreadRetrieveParams
import com.hanzo_ai.api.models.threads.ThreadRetrieveResponse
import com.hanzo_ai.api.services.blocking.threads.MessageService
import com.hanzo_ai.api.services.blocking.threads.RunService

interface ThreadService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun messages(): MessageService

    fun runs(): RunService

    /**
     * Create a thread.
     *
     * API Reference - https://platform.openai.com/docs/api-reference/threads/createThread
     */
    fun create(
        params: ThreadCreateParams = ThreadCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadCreateResponse

    /** @see [create] */
    fun create(requestOptions: RequestOptions): ThreadCreateResponse =
        create(ThreadCreateParams.none(), requestOptions)

    /**
     * Retrieves a thread.
     *
     * API Reference - https://platform.openai.com/docs/api-reference/threads/getThread
     */
    fun retrieve(
        params: ThreadRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadRetrieveResponse

    /** A view of [ThreadService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun messages(): MessageService.WithRawResponse

        fun runs(): RunService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/threads`, but is otherwise the same as
         * [ThreadService.create].
         */
        @MustBeClosed
        fun create(
            params: ThreadCreateParams = ThreadCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadCreateResponse>

        /** @see [create] */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<ThreadCreateResponse> =
            create(ThreadCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/threads/{thread_id}`, but is otherwise the same
         * as [ThreadService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ThreadRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadRetrieveResponse>
    }
}
