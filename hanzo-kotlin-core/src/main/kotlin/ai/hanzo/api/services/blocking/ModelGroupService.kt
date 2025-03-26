// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.modelgroup.ModelGroupRetrieveInfoParams
import ai.hanzo.api.models.modelgroup.ModelGroupRetrieveInfoResponse
import com.google.errorprone.annotations.MustBeClosed

interface ModelGroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Get information about all the deployments on llm proxy, including config.yaml descriptions
     * (except api key and api base)
     * - /model_group/info returns all model groups. End users of proxy should use /model_group/info
     *   since those models will be used for /chat/completions, /embeddings, etc.
     * - /model_group/info?model_group=rerank-english-v3.0 returns all model groups for a specific
     *   model group (`model_name` in config.yaml)
     *
     * Example Request (All Models):
     * ```shell
     * curl -X 'GET'     'http://localhost:4000/model_group/info'     -H 'accept: application/json'     -H 'x-api-key: sk-1234'
     * ```
     *
     * Example Request (Specific Model Group):
     * ```shell
     * curl -X 'GET'     'http://localhost:4000/model_group/info?model_group=rerank-english-v3.0'     -H 'accept: application/json'     -H 'Authorization: Bearer sk-1234'
     * ```
     *
     * Example Request (Specific Wildcard Model Group): (e.g. `model_name: openai&#47;*` on
     * config.yaml)
     *
     * ```shell
     * curl -X 'GET'     'http://localhost:4000/model_group/info?model_group=openai/tts-1'
     * -H 'accept: application/json'     -H 'Authorization: Bearersk-1234'
     * ```
     *
     * Learn how to use and set wildcard models [here](https://docs.llm.ai/docs/wildcard_routing)
     *
     * Example Response:
     * ```json
     * {
     *   "data": [
     *     {
     *       "model_group": "rerank-english-v3.0",
     *       "providers": ["cohere"],
     *       "max_input_tokens": null,
     *       "max_output_tokens": null,
     *       "input_cost_per_token": 0.0,
     *       "output_cost_per_token": 0.0,
     *       "mode": null,
     *       "tpm": null,
     *       "rpm": null,
     *       "supports_parallel_function_calling": false,
     *       "supports_vision": false,
     *       "supports_function_calling": false,
     *       "supported_openai_params": [
     *         "stream",
     *         "temperature",
     *         "max_tokens",
     *         "logit_bias",
     *         "top_p",
     *         "frequency_penalty",
     *         "presence_penalty",
     *         "stop",
     *         "n",
     *         "extra_headers"
     *       ]
     *     },
     *     {
     *       "model_group": "gpt-3.5-turbo",
     *       "providers": ["openai"],
     *       "max_input_tokens": 16385.0,
     *       "max_output_tokens": 4096.0,
     *       "input_cost_per_token": 1.5e-6,
     *       "output_cost_per_token": 2e-6,
     *       "mode": "chat",
     *       "tpm": null,
     *       "rpm": null,
     *       "supports_parallel_function_calling": false,
     *       "supports_vision": false,
     *       "supports_function_calling": true,
     *       "supported_openai_params": [
     *         "frequency_penalty",
     *         "logit_bias",
     *         "logprobs",
     *         "top_logprobs",
     *         "max_tokens",
     *         "max_completion_tokens",
     *         "n",
     *         "presence_penalty",
     *         "seed",
     *         "stop",
     *         "stream",
     *         "stream_options",
     *         "temperature",
     *         "top_p",
     *         "tools",
     *         "tool_choice",
     *         "function_call",
     *         "functions",
     *         "max_retries",
     *         "extra_headers",
     *         "parallel_tool_calls",
     *         "response_format"
     *       ]
     *     },
     *     {
     *       "model_group": "llava-hf",
     *       "providers": ["openai"],
     *       "max_input_tokens": null,
     *       "max_output_tokens": null,
     *       "input_cost_per_token": 0.0,
     *       "output_cost_per_token": 0.0,
     *       "mode": null,
     *       "tpm": null,
     *       "rpm": null,
     *       "supports_parallel_function_calling": false,
     *       "supports_vision": true,
     *       "supports_function_calling": false,
     *       "supported_openai_params": [
     *         "frequency_penalty",
     *         "logit_bias",
     *         "logprobs",
     *         "top_logprobs",
     *         "max_tokens",
     *         "max_completion_tokens",
     *         "n",
     *         "presence_penalty",
     *         "seed",
     *         "stop",
     *         "stream",
     *         "stream_options",
     *         "temperature",
     *         "top_p",
     *         "tools",
     *         "tool_choice",
     *         "function_call",
     *         "functions",
     *         "max_retries",
     *         "extra_headers",
     *         "parallel_tool_calls",
     *         "response_format"
     *       ]
     *     }
     *   ]
     * }
     * ```
     */
    fun retrieveInfo(
        params: ModelGroupRetrieveInfoParams = ModelGroupRetrieveInfoParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ModelGroupRetrieveInfoResponse

    /** @see [retrieveInfo] */
    fun retrieveInfo(requestOptions: RequestOptions): ModelGroupRetrieveInfoResponse =
        retrieveInfo(ModelGroupRetrieveInfoParams.none(), requestOptions)

    /** A view of [ModelGroupService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /model_group/info`, but is otherwise the same as
         * [ModelGroupService.retrieveInfo].
         */
        @MustBeClosed
        fun retrieveInfo(
            params: ModelGroupRetrieveInfoParams = ModelGroupRetrieveInfoParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ModelGroupRetrieveInfoResponse>

        /** @see [retrieveInfo] */
        @MustBeClosed
        fun retrieveInfo(
            requestOptions: RequestOptions
        ): HttpResponseFor<ModelGroupRetrieveInfoResponse> =
            retrieveInfo(ModelGroupRetrieveInfoParams.none(), requestOptions)
    }
}
