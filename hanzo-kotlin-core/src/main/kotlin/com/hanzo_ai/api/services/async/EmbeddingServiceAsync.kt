// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.embeddings.EmbeddingCreateParams
import com.hanzo_ai.api.models.embeddings.EmbeddingCreateResponse

interface EmbeddingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Follows the exact same API spec as `OpenAI's Embeddings API
     * https://platform.openai.com/docs/api-reference/embeddings`
     *
     * ```bash
     * curl -X POST http://localhost:4000/v1/embeddings
     * -H "Content-Type: application/json"
     * -H "Authorization: Bearer sk-1234"
     * -d '{
     *     "model": "text-embedding-ada-002",
     *     "input": "The quick brown fox jumps over the lazy dog"
     * }'
     * ```
     */
    suspend fun create(
        params: EmbeddingCreateParams = EmbeddingCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmbeddingCreateResponse

    /** @see [create] */
    suspend fun create(requestOptions: RequestOptions): EmbeddingCreateResponse =
        create(EmbeddingCreateParams.none(), requestOptions)

    /**
     * A view of [EmbeddingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /embeddings`, but is otherwise the same as
         * [EmbeddingServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: EmbeddingCreateParams = EmbeddingCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmbeddingCreateResponse>

        /** @see [create] */
        @MustBeClosed
        suspend fun create(
            requestOptions: RequestOptions
        ): HttpResponseFor<EmbeddingCreateResponse> =
            create(EmbeddingCreateParams.none(), requestOptions)
    }
}
