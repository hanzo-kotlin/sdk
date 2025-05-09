// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.threads

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.threads.runs.RunCreateParams
import ai.hanzo.api.models.threads.runs.RunCreateResponse
import com.google.errorprone.annotations.MustBeClosed

interface RunService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a run.
     *
     * API Reference: https://platform.openai.com/docs/api-reference/runs/createRun
     */
    fun create(
        threadId: String,
        params: RunCreateParams = RunCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunCreateResponse = create(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see [create] */
    fun create(
        params: RunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunCreateResponse

    /** @see [create] */
    fun create(threadId: String, requestOptions: RequestOptions): RunCreateResponse =
        create(threadId, RunCreateParams.none(), requestOptions)

    /** A view of [RunService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/threads/{thread_id}/runs`, but is otherwise the
         * same as [RunService.create].
         */
        @MustBeClosed
        fun create(
            threadId: String,
            params: RunCreateParams = RunCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunCreateResponse> =
            create(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: RunCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunCreateResponse>

        /** @see [create] */
        @MustBeClosed
        fun create(
            threadId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunCreateResponse> =
            create(threadId, RunCreateParams.none(), requestOptions)
    }
}
