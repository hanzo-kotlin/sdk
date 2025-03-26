// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.threads.ThreadCreateParams
import com.hanzo_ai.api.models.threads.ThreadCreateResponse
import com.hanzo_ai.api.models.threads.ThreadRetrieveParams
import com.hanzo_ai.api.models.threads.ThreadRetrieveResponse
import com.hanzo_ai.api.services.async.threads.MessageServiceAsync
import com.hanzo_ai.api.services.async.threads.RunServiceAsync

interface ThreadServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun messages(): MessageServiceAsync

    fun runs(): RunServiceAsync

    /**
     * Create a thread.
     *
     * API Reference - https://platform.openai.com/docs/api-reference/threads/createThread
     */
    suspend fun create(
        params: ThreadCreateParams = ThreadCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadCreateResponse

    /** @see [create] */
    suspend fun create(requestOptions: RequestOptions): ThreadCreateResponse =
        create(ThreadCreateParams.none(), requestOptions)

    /**
     * Retrieves a thread.
     *
     * API Reference - https://platform.openai.com/docs/api-reference/threads/getThread
     */
    suspend fun retrieve(
        params: ThreadRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadRetrieveResponse

    /**
     * A view of [ThreadServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun messages(): MessageServiceAsync.WithRawResponse

        fun runs(): RunServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/threads`, but is otherwise the same as
         * [ThreadServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: ThreadCreateParams = ThreadCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadCreateResponse>

        /** @see [create] */
        @MustBeClosed
        suspend fun create(requestOptions: RequestOptions): HttpResponseFor<ThreadCreateResponse> =
            create(ThreadCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/threads/{thread_id}`, but is otherwise the same
         * as [ThreadServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: ThreadRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadRetrieveResponse>
    }
}
