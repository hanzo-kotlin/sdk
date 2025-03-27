// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.batches.BatchCancelWithProviderParams
import ai.hanzo.api.models.batches.BatchCancelWithProviderResponse
import ai.hanzo.api.models.batches.BatchCreateParams
import ai.hanzo.api.models.batches.BatchCreateResponse
import ai.hanzo.api.models.batches.BatchCreateWithProviderParams
import ai.hanzo.api.models.batches.BatchCreateWithProviderResponse
import ai.hanzo.api.models.batches.BatchListParams
import ai.hanzo.api.models.batches.BatchListResponse
import ai.hanzo.api.models.batches.BatchListWithProviderParams
import ai.hanzo.api.models.batches.BatchListWithProviderResponse
import ai.hanzo.api.models.batches.BatchRetrieveParams
import ai.hanzo.api.models.batches.BatchRetrieveResponse
import ai.hanzo.api.models.batches.BatchRetrieveWithProviderParams
import ai.hanzo.api.models.batches.BatchRetrieveWithProviderResponse
import ai.hanzo.api.services.blocking.batches.CancelService
import com.google.errorprone.annotations.MustBeClosed

interface BatchService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun cancel(): CancelService

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
    fun create(
        params: BatchCreateParams = BatchCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchCreateResponse

    /** @see [create] */
    fun create(requestOptions: RequestOptions): BatchCreateResponse =
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
    fun retrieve(
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
    fun list(
        params: BatchListParams = BatchListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchListResponse

    /** @see [list] */
    fun list(requestOptions: RequestOptions): BatchListResponse =
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
    fun cancelWithProvider(
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
    fun createWithProvider(
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
    fun listWithProvider(
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
    fun retrieveWithProvider(
        params: BatchRetrieveWithProviderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchRetrieveWithProviderResponse

    /** A view of [BatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun cancel(): CancelService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/batches`, but is otherwise the same as
         * [BatchService.create].
         */
        @MustBeClosed
        fun create(
            params: BatchCreateParams = BatchCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchCreateResponse>

        /** @see [create] */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<BatchCreateResponse> =
            create(BatchCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/batches/{batch_id}`, but is otherwise the same
         * as [BatchService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: BatchRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /v1/batches`, but is otherwise the same as
         * [BatchService.list].
         */
        @MustBeClosed
        fun list(
            params: BatchListParams = BatchListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BatchListResponse> =
            list(BatchListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /{provider}/v1/batches/{batch_id}/cancel`, but is
         * otherwise the same as [BatchService.cancelWithProvider].
         */
        @MustBeClosed
        fun cancelWithProvider(
            params: BatchCancelWithProviderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchCancelWithProviderResponse>

        /**
         * Returns a raw HTTP response for `post /{provider}/v1/batches`, but is otherwise the same
         * as [BatchService.createWithProvider].
         */
        @MustBeClosed
        fun createWithProvider(
            params: BatchCreateWithProviderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchCreateWithProviderResponse>

        /**
         * Returns a raw HTTP response for `get /{provider}/v1/batches`, but is otherwise the same
         * as [BatchService.listWithProvider].
         */
        @MustBeClosed
        fun listWithProvider(
            params: BatchListWithProviderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchListWithProviderResponse>

        /**
         * Returns a raw HTTP response for `get /{provider}/v1/batches/{batch_id}`, but is otherwise
         * the same as [BatchService.retrieveWithProvider].
         */
        @MustBeClosed
        fun retrieveWithProvider(
            params: BatchRetrieveWithProviderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchRetrieveWithProviderResponse>
    }
}
