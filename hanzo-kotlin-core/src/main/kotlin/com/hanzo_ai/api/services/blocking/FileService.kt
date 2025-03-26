// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.files.FileCreateParams
import com.hanzo_ai.api.models.files.FileCreateResponse
import com.hanzo_ai.api.models.files.FileDeleteParams
import com.hanzo_ai.api.models.files.FileDeleteResponse
import com.hanzo_ai.api.models.files.FileListParams
import com.hanzo_ai.api.models.files.FileListResponse
import com.hanzo_ai.api.models.files.FileRetrieveParams
import com.hanzo_ai.api.models.files.FileRetrieveResponse
import com.hanzo_ai.api.services.blocking.files.ContentService

interface FileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

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
        params: FileListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileListResponse

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
        params: FileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileDeleteResponse

    /** A view of [FileService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun content(): ContentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /{provider}/v1/files`, but is otherwise the same as
         * [FileService.create].
         */
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
            params: FileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /{provider}/v1/files`, but is otherwise the same as
         * [FileService.list].
         */
        @MustBeClosed
        fun list(
            params: FileListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileListResponse>

        /**
         * Returns a raw HTTP response for `delete /{provider}/v1/files/{file_id}`, but is otherwise
         * the same as [FileService.delete].
         */
        @MustBeClosed
        fun delete(
            params: FileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileDeleteResponse>
    }
}
