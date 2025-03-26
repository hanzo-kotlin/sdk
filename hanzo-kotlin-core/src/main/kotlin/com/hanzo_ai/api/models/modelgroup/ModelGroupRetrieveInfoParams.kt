// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.modelgroup

import com.hanzo_ai.api.core.Params
import com.hanzo_ai.api.core.http.Headers
import com.hanzo_ai.api.core.http.QueryParams
import java.util.Objects

/**
 * Get information about all the deployments on llm proxy, including config.yaml descriptions
 * (except api key and api base)
 * - /model_group/info returns all model groups. End users of proxy should use /model_group/info
 *   since those models will be used for /chat/completions, /embeddings, etc.
 * - /model_group/info?model_group=rerank-english-v3.0 returns all model groups for a specific model
 *   group (`model_name` in config.yaml)
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
 * Example Request (Specific Wildcard Model Group): (e.g. `model_name: openai&#47;*` on config.yaml)
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
class ModelGroupRetrieveInfoParams
private constructor(
    private val modelGroup: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun modelGroup(): String? = modelGroup

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): ModelGroupRetrieveInfoParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [ModelGroupRetrieveInfoParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [ModelGroupRetrieveInfoParams]. */
    class Builder internal constructor() {

        private var modelGroup: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(modelGroupRetrieveInfoParams: ModelGroupRetrieveInfoParams) = apply {
            modelGroup = modelGroupRetrieveInfoParams.modelGroup
            additionalHeaders = modelGroupRetrieveInfoParams.additionalHeaders.toBuilder()
            additionalQueryParams = modelGroupRetrieveInfoParams.additionalQueryParams.toBuilder()
        }

        fun modelGroup(modelGroup: String?) = apply { this.modelGroup = modelGroup }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ModelGroupRetrieveInfoParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ModelGroupRetrieveInfoParams =
            ModelGroupRetrieveInfoParams(
                modelGroup,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                modelGroup?.let { put("model_group", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ModelGroupRetrieveInfoParams && modelGroup == other.modelGroup && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(modelGroup, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ModelGroupRetrieveInfoParams{modelGroup=$modelGroup, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
