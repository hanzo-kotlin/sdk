// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking.openai

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.openai.deployments.DeploymentCompleteParams
import com.hanzo_ai.api.models.openai.deployments.DeploymentCompleteResponse
import com.hanzo_ai.api.models.openai.deployments.DeploymentEmbedParams
import com.hanzo_ai.api.models.openai.deployments.DeploymentEmbedResponse
import com.hanzo_ai.api.services.blocking.openai.deployments.ChatService

interface DeploymentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

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
        params: DeploymentCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeploymentCompleteResponse

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
        params: DeploymentEmbedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeploymentEmbedResponse

    /** A view of [DeploymentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun chat(): ChatService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /openai/deployments/{model}/completions`, but is
         * otherwise the same as [DeploymentService.complete].
         */
        @MustBeClosed
        fun complete(
            params: DeploymentCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeploymentCompleteResponse>

        /**
         * Returns a raw HTTP response for `post /openai/deployments/{model}/embeddings`, but is
         * otherwise the same as [DeploymentService.embed].
         */
        @MustBeClosed
        fun embed(
            params: DeploymentEmbedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeploymentEmbedResponse>
    }
}
