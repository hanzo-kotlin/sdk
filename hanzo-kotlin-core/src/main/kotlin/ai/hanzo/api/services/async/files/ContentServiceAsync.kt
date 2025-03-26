// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.files

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.files.content.ContentRetrieveParams
import ai.hanzo.api.models.files.content.ContentRetrieveResponse
import com.google.errorprone.annotations.MustBeClosed

interface ContentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns information about a specific file. that can be used across - Assistants API, Batch
     * API This is the equivalent of GET https://api.openai.com/v1/files/{file_id}/content
     *
     * Supports Identical Params as:
     * https://platform.openai.com/docs/api-reference/files/retrieve-contents
     *
     * Example Curl
     *
     * ```
     * curl http://localhost:4000/v1/files/file-abc123/content         -H "Authorization: Bearer sk-1234"
     *
     * ```
     */
    suspend fun retrieve(
        params: ContentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContentRetrieveResponse

    /**
     * A view of [ContentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /{provider}/v1/files/{file_id}/content`, but is
         * otherwise the same as [ContentServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: ContentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContentRetrieveResponse>
    }
}
