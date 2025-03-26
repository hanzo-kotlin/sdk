// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.engines.EngineCompleteParams
import com.hanzo_ai.api.models.engines.EngineCompleteResponse
import com.hanzo_ai.api.models.engines.EngineEmbedParams
import com.hanzo_ai.api.models.engines.EngineEmbedResponse
import com.hanzo_ai.api.services.async.engines.ChatServiceAsync

interface EngineServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun chat(): ChatServiceAsync

    /**
     * Follows the exact same API spec as `OpenAI's Completions API
     * https://platform.openai.com/docs/api-reference/completions`
     *
     * ```bash
     * curl -X POST http://localhost:4000/v1/completions
     * -H "Content-Type: application/json"
     * -H "Authorization: Bearer sk-1234"
     * -d '{
     *     "model": "gpt-3.5-turbo-instruct",
     *     "prompt": "Once upon a time",
     *     "max_tokens": 50,
     *     "temperature": 0.7
     * }'
     * ```
     */
    suspend fun complete(
        params: EngineCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EngineCompleteResponse

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
    suspend fun embed(
        params: EngineEmbedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EngineEmbedResponse

    /**
     * A view of [EngineServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun chat(): ChatServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /engines/{model}/completions`, but is otherwise the
         * same as [EngineServiceAsync.complete].
         */
        @MustBeClosed
        suspend fun complete(
            params: EngineCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EngineCompleteResponse>

        /**
         * Returns a raw HTTP response for `post /engines/{model}/embeddings`, but is otherwise the
         * same as [EngineServiceAsync.embed].
         */
        @MustBeClosed
        suspend fun embed(
            params: EngineEmbedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EngineEmbedResponse>
    }
}
