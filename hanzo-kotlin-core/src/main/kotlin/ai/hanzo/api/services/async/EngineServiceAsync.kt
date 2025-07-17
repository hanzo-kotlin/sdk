// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.engines.EngineCompleteParams
import ai.hanzo.api.models.engines.EngineCompleteResponse
import ai.hanzo.api.models.engines.EngineEmbedParams
import ai.hanzo.api.models.engines.EngineEmbedResponse
import ai.hanzo.api.services.async.engines.ChatServiceAsync
import com.google.errorprone.annotations.MustBeClosed

interface EngineServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EngineServiceAsync

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
        model: String,
        params: EngineCompleteParams = EngineCompleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EngineCompleteResponse = complete(params.toBuilder().model(model).build(), requestOptions)

    /** @see [complete] */
    suspend fun complete(
        params: EngineCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EngineCompleteResponse

    /** @see [complete] */
    suspend fun complete(model: String, requestOptions: RequestOptions): EngineCompleteResponse =
        complete(model, EngineCompleteParams.none(), requestOptions)

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
        model: String,
        params: EngineEmbedParams = EngineEmbedParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EngineEmbedResponse = embed(params.toBuilder().model(model).build(), requestOptions)

    /** @see [embed] */
    suspend fun embed(
        params: EngineEmbedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EngineEmbedResponse

    /** @see [embed] */
    suspend fun embed(model: String, requestOptions: RequestOptions): EngineEmbedResponse =
        embed(model, EngineEmbedParams.none(), requestOptions)

    /**
     * A view of [EngineServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EngineServiceAsync.WithRawResponse

        fun chat(): ChatServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /engines/{model}/completions`, but is otherwise the
         * same as [EngineServiceAsync.complete].
         */
        @MustBeClosed
        suspend fun complete(
            model: String,
            params: EngineCompleteParams = EngineCompleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EngineCompleteResponse> =
            complete(params.toBuilder().model(model).build(), requestOptions)

        /** @see [complete] */
        @MustBeClosed
        suspend fun complete(
            params: EngineCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EngineCompleteResponse>

        /** @see [complete] */
        @MustBeClosed
        suspend fun complete(
            model: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EngineCompleteResponse> =
            complete(model, EngineCompleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /engines/{model}/embeddings`, but is otherwise the
         * same as [EngineServiceAsync.embed].
         */
        @MustBeClosed
        suspend fun embed(
            model: String,
            params: EngineEmbedParams = EngineEmbedParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EngineEmbedResponse> =
            embed(params.toBuilder().model(model).build(), requestOptions)

        /** @see [embed] */
        @MustBeClosed
        suspend fun embed(
            params: EngineEmbedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EngineEmbedResponse>

        /** @see [embed] */
        @MustBeClosed
        suspend fun embed(
            model: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EngineEmbedResponse> =
            embed(model, EngineEmbedParams.none(), requestOptions)
    }
}
