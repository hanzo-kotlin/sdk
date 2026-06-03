// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.openai

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.openai.deployments.DeploymentCompleteParams
import ai.hanzo.api.models.openai.deployments.DeploymentCompleteResponse
import ai.hanzo.api.models.openai.deployments.DeploymentEmbedParams
import ai.hanzo.api.models.openai.deployments.DeploymentEmbedResponse
import ai.hanzo.api.services.blocking.openai.deployments.ChatService
import com.google.errorprone.annotations.MustBeClosed

interface DeploymentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DeploymentService

    fun chat(): ChatService

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
    fun complete(
        model: String,
        params: DeploymentCompleteParams = DeploymentCompleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeploymentCompleteResponse =
        complete(params.toBuilder().model(model).build(), requestOptions)

    /** @see complete */
    fun complete(
        params: DeploymentCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeploymentCompleteResponse

    /** @see complete */
    fun complete(model: String, requestOptions: RequestOptions): DeploymentCompleteResponse =
        complete(model, DeploymentCompleteParams.none(), requestOptions)

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
    fun embed(
        model: String,
        params: DeploymentEmbedParams = DeploymentEmbedParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeploymentEmbedResponse = embed(params.toBuilder().model(model).build(), requestOptions)

    /** @see embed */
    fun embed(
        params: DeploymentEmbedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeploymentEmbedResponse

    /** @see embed */
    fun embed(model: String, requestOptions: RequestOptions): DeploymentEmbedResponse =
        embed(model, DeploymentEmbedParams.none(), requestOptions)

    /** A view of [DeploymentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DeploymentService.WithRawResponse

        fun chat(): ChatService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /openai/deployments/{model}/completions`, but is
         * otherwise the same as [DeploymentService.complete].
         */
        @MustBeClosed
        fun complete(
            model: String,
            params: DeploymentCompleteParams = DeploymentCompleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeploymentCompleteResponse> =
            complete(params.toBuilder().model(model).build(), requestOptions)

        /** @see complete */
        @MustBeClosed
        fun complete(
            params: DeploymentCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeploymentCompleteResponse>

        /** @see complete */
        @MustBeClosed
        fun complete(
            model: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeploymentCompleteResponse> =
            complete(model, DeploymentCompleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /openai/deployments/{model}/embeddings`, but is
         * otherwise the same as [DeploymentService.embed].
         */
        @MustBeClosed
        fun embed(
            model: String,
            params: DeploymentEmbedParams = DeploymentEmbedParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeploymentEmbedResponse> =
            embed(params.toBuilder().model(model).build(), requestOptions)

        /** @see embed */
        @MustBeClosed
        fun embed(
            params: DeploymentEmbedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeploymentEmbedResponse>

        /** @see embed */
        @MustBeClosed
        fun embed(
            model: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeploymentEmbedResponse> =
            embed(model, DeploymentEmbedParams.none(), requestOptions)
    }
}
