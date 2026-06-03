// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.files.FileCreateParams
import ai.hanzo.api.models.files.FileCreateResponse
import ai.hanzo.api.models.files.FileDeleteParams
import ai.hanzo.api.models.files.FileDeleteResponse
import ai.hanzo.api.models.files.FileListParams
import ai.hanzo.api.models.files.FileListResponse
import ai.hanzo.api.models.files.FileRetrieveParams
import ai.hanzo.api.models.files.FileRetrieveResponse
import ai.hanzo.api.services.blocking.files.ContentService
import com.google.errorprone.annotations.MustBeClosed

interface FileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FileService

    fun content(): ContentService

    /**
     * Upload a file that can be used across - Assistants API, Batch API This is the equivalent of
     * POST https://api.openai.com/v1/files
     *
     * Supports Identical Params as: https://platform.openai.com/docs/api-reference/files/create
     *
     * Example Curl
     *
     * ```
     * curl http://localhost:4000/v1/files         -H "Authorization: Bearer sk-1234"         -F purpose="batch"         -F file="@mydata.jsonl"
     *
     * ```
     */
    fun create(
        provider: String,
        params: FileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileCreateResponse = create(params.toBuilder().provider(provider).build(), requestOptions)

    /** @see create */
    fun create(
        params: FileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileCreateResponse

    /**
     * Returns information about a specific file. that can be used across - Assistants API, Batch
     * API This is the equivalent of GET https://api.openai.com/v1/files/{file_id}
     *
     * Supports Identical Params as: https://platform.openai.com/docs/api-reference/files/retrieve
     *
     * Example Curl
     *
     * ```
     * curl http://localhost:4000/v1/files/file-abc123         -H "Authorization: Bearer sk-1234"
     *
     * ```
     */
    fun retrieve(
        fileId: String,
        params: FileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileRetrieveResponse = retrieve(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: FileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileRetrieveResponse

    /**
     * Returns information about a specific file. that can be used across - Assistants API, Batch
     * API This is the equivalent of GET https://api.openai.com/v1/files/
     *
     * Supports Identical Params as: https://platform.openai.com/docs/api-reference/files/list
     *
     * Example Curl
     *
     * ```
     * curl http://localhost:4000/v1/files        -H "Authorization: Bearer sk-1234"
     *
     * ```
     */
    fun list(
        provider: String,
        params: FileListParams = FileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileListResponse = list(params.toBuilder().provider(provider).build(), requestOptions)

    /** @see list */
    fun list(
        params: FileListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileListResponse

    /** @see list */
    fun list(provider: String, requestOptions: RequestOptions): FileListResponse =
        list(provider, FileListParams.none(), requestOptions)

    /**
     * Deletes a specified file. that can be used across - Assistants API, Batch API This is the
     * equivalent of DELETE https://api.openai.com/v1/files/{file_id}
     *
     * Supports Identical Params as: https://platform.openai.com/docs/api-reference/files/delete
     *
     * Example Curl
     *
     * ```
     * curl http://localhost:4000/v1/files/file-abc123     -X DELETE     -H "Authorization: Bearer $OPENAI_API_KEY"
     *
     * ```
     */
    fun delete(
        fileId: String,
        params: FileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileDeleteResponse = delete(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: FileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileDeleteResponse

    /** A view of [FileService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FileService.WithRawResponse

        fun content(): ContentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /{provider}/v1/files`, but is otherwise the same as
         * [FileService.create].
         */
        @MustBeClosed
        fun create(
            provider: String,
            params: FileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileCreateResponse> =
            create(params.toBuilder().provider(provider).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: FileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileCreateResponse>

        /**
         * Returns a raw HTTP response for `get /{provider}/v1/files/{file_id}`, but is otherwise
         * the same as [FileService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            fileId: String,
            params: FileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileRetrieveResponse> =
            retrieve(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: FileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /{provider}/v1/files`, but is otherwise the same as
         * [FileService.list].
         */
        @MustBeClosed
        fun list(
            provider: String,
            params: FileListParams = FileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileListResponse> =
            list(params.toBuilder().provider(provider).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            params: FileListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            provider: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileListResponse> = list(provider, FileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /{provider}/v1/files/{file_id}`, but is otherwise
         * the same as [FileService.delete].
         */
        @MustBeClosed
        fun delete(
            fileId: String,
            params: FileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileDeleteResponse> =
            delete(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: FileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileDeleteResponse>
    }
}
