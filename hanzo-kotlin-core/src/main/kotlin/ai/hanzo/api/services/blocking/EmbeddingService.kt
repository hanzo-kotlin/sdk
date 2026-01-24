// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.embeddings.EmbeddingCreateParams
import ai.hanzo.api.models.embeddings.EmbeddingCreateResponse
import com.google.errorprone.annotations.MustBeClosed

interface EmbeddingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EmbeddingService

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
    fun create(
        params: EmbeddingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmbeddingCreateResponse

    /** A view of [EmbeddingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EmbeddingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /embeddings`, but is otherwise the same as
         * [EmbeddingService.create].
         */
        @MustBeClosed
        fun create(
            params: EmbeddingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmbeddingCreateResponse>
    }
}
