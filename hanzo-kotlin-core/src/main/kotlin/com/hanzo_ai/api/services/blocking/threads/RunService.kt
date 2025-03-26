// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking.threads

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.threads.runs.RunCreateParams
import com.hanzo_ai.api.models.threads.runs.RunCreateResponse

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
        params: RunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunCreateResponse

    /** A view of [RunService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/threads/{thread_id}/runs`, but is otherwise the
         * same as [RunService.create].
         */
        @MustBeClosed
        fun create(
            params: RunCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunCreateResponse>
    }
}
