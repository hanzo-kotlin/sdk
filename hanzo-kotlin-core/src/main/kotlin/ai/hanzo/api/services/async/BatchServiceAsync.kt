// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
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
import ai.hanzo.api.services.async.batches.CancelServiceAsync
import com.google.errorprone.annotations.MustBeClosed

interface BatchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BatchServiceAsync

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

    /** @see create */
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
        batchId: String,
        params: BatchRetrieveParams = BatchRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchRetrieveResponse = retrieve(params.toBuilder().batchId(batchId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: BatchRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchRetrieveResponse

    /** @see retrieve */
    suspend fun retrieve(batchId: String, requestOptions: RequestOptions): BatchRetrieveResponse =
        retrieve(batchId, BatchRetrieveParams.none(), requestOptions)

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

    /** @see list */
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
        batchId: String,
        params: BatchCancelWithProviderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchCancelWithProviderResponse =
        cancelWithProvider(params.toBuilder().batchId(batchId).build(), requestOptions)

    /** @see cancelWithProvider */
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
        provider: String,
        params: BatchCreateWithProviderParams = BatchCreateWithProviderParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchCreateWithProviderResponse =
        createWithProvider(params.toBuilder().provider(provider).build(), requestOptions)

    /** @see createWithProvider */
    suspend fun createWithProvider(
        params: BatchCreateWithProviderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchCreateWithProviderResponse

    /** @see createWithProvider */
    suspend fun createWithProvider(
        provider: String,
        requestOptions: RequestOptions,
    ): BatchCreateWithProviderResponse =
        createWithProvider(provider, BatchCreateWithProviderParams.none(), requestOptions)

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
        provider: String,
        params: BatchListWithProviderParams = BatchListWithProviderParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchListWithProviderResponse =
        listWithProvider(params.toBuilder().provider(provider).build(), requestOptions)

    /** @see listWithProvider */
    suspend fun listWithProvider(
        params: BatchListWithProviderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchListWithProviderResponse

    /** @see listWithProvider */
    suspend fun listWithProvider(
        provider: String,
        requestOptions: RequestOptions,
    ): BatchListWithProviderResponse =
        listWithProvider(provider, BatchListWithProviderParams.none(), requestOptions)

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
        batchId: String,
        params: BatchRetrieveWithProviderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchRetrieveWithProviderResponse =
        retrieveWithProvider(params.toBuilder().batchId(batchId).build(), requestOptions)

    /** @see retrieveWithProvider */
    suspend fun retrieveWithProvider(
        params: BatchRetrieveWithProviderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchRetrieveWithProviderResponse

    /** A view of [BatchServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BatchServiceAsync.WithRawResponse

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

        /** @see create */
        @MustBeClosed
        suspend fun create(requestOptions: RequestOptions): HttpResponseFor<BatchCreateResponse> =
            create(BatchCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/batches/{batch_id}`, but is otherwise the same
         * as [BatchServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            batchId: String,
            params: BatchRetrieveParams = BatchRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchRetrieveResponse> =
            retrieve(params.toBuilder().batchId(batchId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: BatchRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            batchId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchRetrieveResponse> =
            retrieve(batchId, BatchRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/batches`, but is otherwise the same as
         * [BatchServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: BatchListParams = BatchListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<BatchListResponse> =
            list(BatchListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /{provider}/v1/batches/{batch_id}/cancel`, but is
         * otherwise the same as [BatchServiceAsync.cancelWithProvider].
         */
        @MustBeClosed
        suspend fun cancelWithProvider(
            batchId: String,
            params: BatchCancelWithProviderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchCancelWithProviderResponse> =
            cancelWithProvider(params.toBuilder().batchId(batchId).build(), requestOptions)

        /** @see cancelWithProvider */
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
            provider: String,
            params: BatchCreateWithProviderParams = BatchCreateWithProviderParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchCreateWithProviderResponse> =
            createWithProvider(params.toBuilder().provider(provider).build(), requestOptions)

        /** @see createWithProvider */
        @MustBeClosed
        suspend fun createWithProvider(
            params: BatchCreateWithProviderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchCreateWithProviderResponse>

        /** @see createWithProvider */
        @MustBeClosed
        suspend fun createWithProvider(
            provider: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchCreateWithProviderResponse> =
            createWithProvider(provider, BatchCreateWithProviderParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /{provider}/v1/batches`, but is otherwise the same
         * as [BatchServiceAsync.listWithProvider].
         */
        @MustBeClosed
        suspend fun listWithProvider(
            provider: String,
            params: BatchListWithProviderParams = BatchListWithProviderParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchListWithProviderResponse> =
            listWithProvider(params.toBuilder().provider(provider).build(), requestOptions)

        /** @see listWithProvider */
        @MustBeClosed
        suspend fun listWithProvider(
            params: BatchListWithProviderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchListWithProviderResponse>

        /** @see listWithProvider */
        @MustBeClosed
        suspend fun listWithProvider(
            provider: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchListWithProviderResponse> =
            listWithProvider(provider, BatchListWithProviderParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /{provider}/v1/batches/{batch_id}`, but is otherwise
         * the same as [BatchServiceAsync.retrieveWithProvider].
         */
        @MustBeClosed
        suspend fun retrieveWithProvider(
            batchId: String,
            params: BatchRetrieveWithProviderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchRetrieveWithProviderResponse> =
            retrieveWithProvider(params.toBuilder().batchId(batchId).build(), requestOptions)

        /** @see retrieveWithProvider */
        @MustBeClosed
        suspend fun retrieveWithProvider(
            params: BatchRetrieveWithProviderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchRetrieveWithProviderResponse>
    }
}
