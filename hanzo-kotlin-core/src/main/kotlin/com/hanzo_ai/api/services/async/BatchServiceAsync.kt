// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.batches.BatchCancelWithProviderParams
import com.hanzo_ai.api.models.batches.BatchCancelWithProviderResponse
import com.hanzo_ai.api.models.batches.BatchCreateParams
import com.hanzo_ai.api.models.batches.BatchCreateResponse
import com.hanzo_ai.api.models.batches.BatchCreateWithProviderParams
import com.hanzo_ai.api.models.batches.BatchCreateWithProviderResponse
import com.hanzo_ai.api.models.batches.BatchListParams
import com.hanzo_ai.api.models.batches.BatchListResponse
import com.hanzo_ai.api.models.batches.BatchListWithProviderParams
import com.hanzo_ai.api.models.batches.BatchListWithProviderResponse
import com.hanzo_ai.api.models.batches.BatchRetrieveParams
import com.hanzo_ai.api.models.batches.BatchRetrieveResponse
import com.hanzo_ai.api.models.batches.BatchRetrieveWithProviderParams
import com.hanzo_ai.api.models.batches.BatchRetrieveWithProviderResponse
import com.hanzo_ai.api.services.async.batches.CancelServiceAsync

interface BatchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun cancel(): CancelServiceAsync

    /**
     * Create large batches of API requests for asynchronous processing. This is the equivalent of
     * POST https://api.openai.com/v1/batch Supports Identical Params as:
     * https://platform.openai.com/docs/api-reference/batch
     *
     * Example Curl
     *
     * ```
     * curl http://localhost:4000/v1/batches         -H "Authorization: Bearer sk-1234"         -H "Content-Type: application/json"         -d '{
     *         "input_file_id": "file-abc123",
     *         "endpoint": "/v1/chat/completions",
     *         "completion_window": "24h"
     * }'
     * ```
     */
    suspend fun create(
        params: BatchCreateParams = BatchCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchCreateResponse

    /** @see [create] */
    suspend fun create(requestOptions: RequestOptions): BatchCreateResponse =
        create(BatchCreateParams.none(), requestOptions)

    /**
     * Retrieves a batch. This is the equivalent of GET https://api.openai.com/v1/batches/{batch_id}
     * Supports Identical Params as: https://platform.openai.com/docs/api-reference/batch/retrieve
     *
     * Example Curl
     *
     * ```
     * curl http://localhost:4000/v1/batches/batch_abc123     -H "Authorization: Bearer sk-1234"     -H "Content-Type: application/json"
     * ```
     */
    suspend fun retrieve(
        params: BatchRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchRetrieveResponse

    /**
     * Lists This is the equivalent of GET https://api.openai.com/v1/batches/ Supports Identical
     * Params as: https://platform.openai.com/docs/api-reference/batch/list
     *
     * Example Curl
     *
     * ```
     * curl http://localhost:4000/v1/batches?limit=2     -H "Authorization: Bearer sk-1234"     -H "Content-Type: application/json"
     * ```
     */
    suspend fun list(
        params: BatchListParams = BatchListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchListResponse

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): BatchListResponse =
        list(BatchListParams.none(), requestOptions)

    /**
     * Cancel a batch. This is the equivalent of POST
     * https://api.openai.com/v1/batches/{batch_id}/cancel
     *
     * Supports Identical Params as: https://platform.openai.com/docs/api-reference/batch/cancel
     *
     * Example Curl
     *
     * ```
     * curl http://localhost:4000/v1/batches/batch_abc123/cancel         -H "Authorization: Bearer sk-1234"         -H "Content-Type: application/json"         -X POST
     *
     * ```
     */
    suspend fun cancelWithProvider(
        params: BatchCancelWithProviderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchCancelWithProviderResponse

    /**
     * Create large batches of API requests for asynchronous processing. This is the equivalent of
     * POST https://api.openai.com/v1/batch Supports Identical Params as:
     * https://platform.openai.com/docs/api-reference/batch
     *
     * Example Curl
     *
     * ```
     * curl http://localhost:4000/v1/batches         -H "Authorization: Bearer sk-1234"         -H "Content-Type: application/json"         -d '{
     *         "input_file_id": "file-abc123",
     *         "endpoint": "/v1/chat/completions",
     *         "completion_window": "24h"
     * }'
     * ```
     */
    suspend fun createWithProvider(
        params: BatchCreateWithProviderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchCreateWithProviderResponse

    /**
     * Lists This is the equivalent of GET https://api.openai.com/v1/batches/ Supports Identical
     * Params as: https://platform.openai.com/docs/api-reference/batch/list
     *
     * Example Curl
     *
     * ```
     * curl http://localhost:4000/v1/batches?limit=2     -H "Authorization: Bearer sk-1234"     -H "Content-Type: application/json"
     * ```
     */
    suspend fun listWithProvider(
        params: BatchListWithProviderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchListWithProviderResponse

    /**
     * Retrieves a batch. This is the equivalent of GET https://api.openai.com/v1/batches/{batch_id}
     * Supports Identical Params as: https://platform.openai.com/docs/api-reference/batch/retrieve
     *
     * Example Curl
     *
     * ```
     * curl http://localhost:4000/v1/batches/batch_abc123     -H "Authorization: Bearer sk-1234"     -H "Content-Type: application/json"
     * ```
     */
    suspend fun retrieveWithProvider(
        params: BatchRetrieveWithProviderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchRetrieveWithProviderResponse

    /** A view of [BatchServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun cancel(): CancelServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/batches`, but is otherwise the same as
         * [BatchServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: BatchCreateParams = BatchCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchCreateResponse>

        /** @see [create] */
        @MustBeClosed
        suspend fun create(requestOptions: RequestOptions): HttpResponseFor<BatchCreateResponse> =
            create(BatchCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/batches/{batch_id}`, but is otherwise the same
         * as [BatchServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: BatchRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /v1/batches`, but is otherwise the same as
         * [BatchServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: BatchListParams = BatchListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchListResponse>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<BatchListResponse> =
            list(BatchListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /{provider}/v1/batches/{batch_id}/cancel`, but is
         * otherwise the same as [BatchServiceAsync.cancelWithProvider].
         */
        @MustBeClosed
        suspend fun cancelWithProvider(
            params: BatchCancelWithProviderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchCancelWithProviderResponse>

        /**
         * Returns a raw HTTP response for `post /{provider}/v1/batches`, but is otherwise the same
         * as [BatchServiceAsync.createWithProvider].
         */
        @MustBeClosed
        suspend fun createWithProvider(
            params: BatchCreateWithProviderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchCreateWithProviderResponse>

        /**
         * Returns a raw HTTP response for `get /{provider}/v1/batches`, but is otherwise the same
         * as [BatchServiceAsync.listWithProvider].
         */
        @MustBeClosed
        suspend fun listWithProvider(
            params: BatchListWithProviderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchListWithProviderResponse>

        /**
         * Returns a raw HTTP response for `get /{provider}/v1/batches/{batch_id}`, but is otherwise
         * the same as [BatchServiceAsync.retrieveWithProvider].
         */
        @MustBeClosed
        suspend fun retrieveWithProvider(
            params: BatchRetrieveWithProviderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchRetrieveWithProviderResponse>
    }
}
