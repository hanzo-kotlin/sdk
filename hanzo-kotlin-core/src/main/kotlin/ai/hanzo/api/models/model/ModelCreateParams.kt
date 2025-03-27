// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.model

import ai.hanzo.api.core.BaseDeserializer
import ai.hanzo.api.core.BaseSerializer
import ai.hanzo.api.core.ExcludeMissing
import ai.hanzo.api.core.JsonField
import ai.hanzo.api.core.JsonMissing
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.Params
import ai.hanzo.api.core.checkKnown
import ai.hanzo.api.core.checkRequired
import ai.hanzo.api.core.getOrThrow
import ai.hanzo.api.core.http.Headers
import ai.hanzo.api.core.http.QueryParams
import ai.hanzo.api.core.toImmutable
import ai.hanzo.api.errors.HanzoInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Collections
import java.util.Objects

/** Allows adding new models to the model list in the config.yaml */
class ModelCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * LLM Params with 'model' requirement - used for completions
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun llmParams(): LlmParams = body.llmParams()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun modelInfo(): ModelInfo = body.modelInfo()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun modelName(): String = body.modelName()

    /**
     * Returns the raw JSON value of [llmParams].
     *
     * Unlike [llmParams], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _llmParams(): JsonField<LlmParams> = body._llmParams()

    /**
     * Returns the raw JSON value of [modelInfo].
     *
     * Unlike [modelInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _modelInfo(): JsonField<ModelInfo> = body._modelInfo()

    /**
     * Returns the raw JSON value of [modelName].
     *
     * Unlike [modelName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _modelName(): JsonField<String> = body._modelName()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ModelCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .llmParams()
         * .modelInfo()
         * .modelName()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ModelCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(modelCreateParams: ModelCreateParams) = apply {
            body = modelCreateParams.body.toBuilder()
            additionalHeaders = modelCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = modelCreateParams.additionalQueryParams.toBuilder()
        }

        /** LLM Params with 'model' requirement - used for completions */
        fun llmParams(llmParams: LlmParams) = apply { body.llmParams(llmParams) }

        /**
         * Sets [Builder.llmParams] to an arbitrary JSON value.
         *
         * You should usually call [Builder.llmParams] with a well-typed [LlmParams] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun llmParams(llmParams: JsonField<LlmParams>) = apply { body.llmParams(llmParams) }

        fun modelInfo(modelInfo: ModelInfo) = apply { body.modelInfo(modelInfo) }

        /**
         * Sets [Builder.modelInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelInfo] with a well-typed [ModelInfo] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun modelInfo(modelInfo: JsonField<ModelInfo>) = apply { body.modelInfo(modelInfo) }

        fun modelName(modelName: String) = apply { body.modelName(modelName) }

        /**
         * Sets [Builder.modelName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun modelName(modelName: JsonField<String>) = apply { body.modelName(modelName) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [ModelCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .llmParams()
         * .modelInfo()
         * .modelName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ModelCreateParams =
            ModelCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val llmParams: JsonField<LlmParams>,
        private val modelInfo: JsonField<ModelInfo>,
        private val modelName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("llm_params")
            @ExcludeMissing
            llmParams: JsonField<LlmParams> = JsonMissing.of(),
            @JsonProperty("model_info")
            @ExcludeMissing
            modelInfo: JsonField<ModelInfo> = JsonMissing.of(),
            @JsonProperty("model_name")
            @ExcludeMissing
            modelName: JsonField<String> = JsonMissing.of(),
        ) : this(llmParams, modelInfo, modelName, mutableMapOf())

        /**
         * LLM Params with 'model' requirement - used for completions
         *
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun llmParams(): LlmParams = llmParams.getRequired("llm_params")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun modelInfo(): ModelInfo = modelInfo.getRequired("model_info")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun modelName(): String = modelName.getRequired("model_name")

        /**
         * Returns the raw JSON value of [llmParams].
         *
         * Unlike [llmParams], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("llm_params")
        @ExcludeMissing
        fun _llmParams(): JsonField<LlmParams> = llmParams

        /**
         * Returns the raw JSON value of [modelInfo].
         *
         * Unlike [modelInfo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model_info")
        @ExcludeMissing
        fun _modelInfo(): JsonField<ModelInfo> = modelInfo

        /**
         * Returns the raw JSON value of [modelName].
         *
         * Unlike [modelName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model_name") @ExcludeMissing fun _modelName(): JsonField<String> = modelName

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .llmParams()
             * .modelInfo()
             * .modelName()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var llmParams: JsonField<LlmParams>? = null
            private var modelInfo: JsonField<ModelInfo>? = null
            private var modelName: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                llmParams = body.llmParams
                modelInfo = body.modelInfo
                modelName = body.modelName
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** LLM Params with 'model' requirement - used for completions */
            fun llmParams(llmParams: LlmParams) = llmParams(JsonField.of(llmParams))

            /**
             * Sets [Builder.llmParams] to an arbitrary JSON value.
             *
             * You should usually call [Builder.llmParams] with a well-typed [LlmParams] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun llmParams(llmParams: JsonField<LlmParams>) = apply { this.llmParams = llmParams }

            fun modelInfo(modelInfo: ModelInfo) = modelInfo(JsonField.of(modelInfo))

            /**
             * Sets [Builder.modelInfo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelInfo] with a well-typed [ModelInfo] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelInfo(modelInfo: JsonField<ModelInfo>) = apply { this.modelInfo = modelInfo }

            fun modelName(modelName: String) = modelName(JsonField.of(modelName))

            /**
             * Sets [Builder.modelName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelName(modelName: JsonField<String>) = apply { this.modelName = modelName }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .llmParams()
             * .modelInfo()
             * .modelName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("llmParams", llmParams),
                    checkRequired("modelInfo", modelInfo),
                    checkRequired("modelName", modelName),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            llmParams().validate()
            modelInfo().validate()
            modelName()
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && llmParams == other.llmParams && modelInfo == other.modelInfo && modelName == other.modelName && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(llmParams, modelInfo, modelName, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{llmParams=$llmParams, modelInfo=$modelInfo, modelName=$modelName, additionalProperties=$additionalProperties}"
    }

    /** LLM Params with 'model' requirement - used for completions */
    class LlmParams
    private constructor(
        private val model: JsonField<String>,
        private val apiBase: JsonField<String>,
        private val apiKey: JsonField<String>,
        private val apiVersion: JsonField<String>,
        private val awsAccessKeyId: JsonField<String>,
        private val awsRegionName: JsonField<String>,
        private val awsSecretAccessKey: JsonField<String>,
        private val budgetDuration: JsonField<String>,
        private val configurableClientsideAuthParams:
            JsonField<List<ConfigurableClientsideAuthParam>>,
        private val customLlmProvider: JsonField<String>,
        private val inputCostPerSecond: JsonField<Double>,
        private val inputCostPerToken: JsonField<Double>,
        private val llmTraceId: JsonField<String>,
        private val maxBudget: JsonField<Double>,
        private val maxFileSizeMb: JsonField<Double>,
        private val maxRetries: JsonField<Long>,
        private val mergeReasoningContentInChoices: JsonField<Boolean>,
        private val modelInfo: JsonValue,
        private val organization: JsonField<String>,
        private val outputCostPerSecond: JsonField<Double>,
        private val outputCostPerToken: JsonField<Double>,
        private val regionName: JsonField<String>,
        private val rpm: JsonField<Long>,
        private val streamTimeout: JsonField<StreamTimeout>,
        private val timeout: JsonField<Timeout>,
        private val tpm: JsonField<Long>,
        private val useInPassThrough: JsonField<Boolean>,
        private val vertexCredentials: JsonField<VertexCredentials>,
        private val vertexLocation: JsonField<String>,
        private val vertexProject: JsonField<String>,
        private val watsonxRegionName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("api_base") @ExcludeMissing apiBase: JsonField<String> = JsonMissing.of(),
            @JsonProperty("api_key") @ExcludeMissing apiKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("api_version")
            @ExcludeMissing
            apiVersion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aws_access_key_id")
            @ExcludeMissing
            awsAccessKeyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aws_region_name")
            @ExcludeMissing
            awsRegionName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aws_secret_access_key")
            @ExcludeMissing
            awsSecretAccessKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("budget_duration")
            @ExcludeMissing
            budgetDuration: JsonField<String> = JsonMissing.of(),
            @JsonProperty("configurable_clientside_auth_params")
            @ExcludeMissing
            configurableClientsideAuthParams: JsonField<List<ConfigurableClientsideAuthParam>> =
                JsonMissing.of(),
            @JsonProperty("custom_llm_provider")
            @ExcludeMissing
            customLlmProvider: JsonField<String> = JsonMissing.of(),
            @JsonProperty("input_cost_per_second")
            @ExcludeMissing
            inputCostPerSecond: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("input_cost_per_token")
            @ExcludeMissing
            inputCostPerToken: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("llm_trace_id")
            @ExcludeMissing
            llmTraceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_budget")
            @ExcludeMissing
            maxBudget: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("max_file_size_mb")
            @ExcludeMissing
            maxFileSizeMb: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("max_retries")
            @ExcludeMissing
            maxRetries: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("merge_reasoning_content_in_choices")
            @ExcludeMissing
            mergeReasoningContentInChoices: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("model_info") @ExcludeMissing modelInfo: JsonValue = JsonMissing.of(),
            @JsonProperty("organization")
            @ExcludeMissing
            organization: JsonField<String> = JsonMissing.of(),
            @JsonProperty("output_cost_per_second")
            @ExcludeMissing
            outputCostPerSecond: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("output_cost_per_token")
            @ExcludeMissing
            outputCostPerToken: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("region_name")
            @ExcludeMissing
            regionName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rpm") @ExcludeMissing rpm: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("stream_timeout")
            @ExcludeMissing
            streamTimeout: JsonField<StreamTimeout> = JsonMissing.of(),
            @JsonProperty("timeout") @ExcludeMissing timeout: JsonField<Timeout> = JsonMissing.of(),
            @JsonProperty("tpm") @ExcludeMissing tpm: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("use_in_pass_through")
            @ExcludeMissing
            useInPassThrough: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("vertex_credentials")
            @ExcludeMissing
            vertexCredentials: JsonField<VertexCredentials> = JsonMissing.of(),
            @JsonProperty("vertex_location")
            @ExcludeMissing
            vertexLocation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("vertex_project")
            @ExcludeMissing
            vertexProject: JsonField<String> = JsonMissing.of(),
            @JsonProperty("watsonx_region_name")
            @ExcludeMissing
            watsonxRegionName: JsonField<String> = JsonMissing.of(),
        ) : this(
            model,
            apiBase,
            apiKey,
            apiVersion,
            awsAccessKeyId,
            awsRegionName,
            awsSecretAccessKey,
            budgetDuration,
            configurableClientsideAuthParams,
            customLlmProvider,
            inputCostPerSecond,
            inputCostPerToken,
            llmTraceId,
            maxBudget,
            maxFileSizeMb,
            maxRetries,
            mergeReasoningContentInChoices,
            modelInfo,
            organization,
            outputCostPerSecond,
            outputCostPerToken,
            regionName,
            rpm,
            streamTimeout,
            timeout,
            tpm,
            useInPassThrough,
            vertexCredentials,
            vertexLocation,
            vertexProject,
            watsonxRegionName,
            mutableMapOf(),
        )

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun model(): String = model.getRequired("model")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun apiBase(): String? = apiBase.getNullable("api_base")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun apiKey(): String? = apiKey.getNullable("api_key")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun apiVersion(): String? = apiVersion.getNullable("api_version")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun awsAccessKeyId(): String? = awsAccessKeyId.getNullable("aws_access_key_id")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun awsRegionName(): String? = awsRegionName.getNullable("aws_region_name")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun awsSecretAccessKey(): String? = awsSecretAccessKey.getNullable("aws_secret_access_key")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun budgetDuration(): String? = budgetDuration.getNullable("budget_duration")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun configurableClientsideAuthParams(): List<ConfigurableClientsideAuthParam>? =
            configurableClientsideAuthParams.getNullable("configurable_clientside_auth_params")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customLlmProvider(): String? = customLlmProvider.getNullable("custom_llm_provider")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inputCostPerSecond(): Double? = inputCostPerSecond.getNullable("input_cost_per_second")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inputCostPerToken(): Double? = inputCostPerToken.getNullable("input_cost_per_token")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun llmTraceId(): String? = llmTraceId.getNullable("llm_trace_id")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxBudget(): Double? = maxBudget.getNullable("max_budget")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxFileSizeMb(): Double? = maxFileSizeMb.getNullable("max_file_size_mb")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxRetries(): Long? = maxRetries.getNullable("max_retries")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mergeReasoningContentInChoices(): Boolean? =
            mergeReasoningContentInChoices.getNullable("merge_reasoning_content_in_choices")

        @JsonProperty("model_info") @ExcludeMissing fun _modelInfo(): JsonValue = modelInfo

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun organization(): String? = organization.getNullable("organization")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outputCostPerSecond(): Double? =
            outputCostPerSecond.getNullable("output_cost_per_second")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outputCostPerToken(): Double? = outputCostPerToken.getNullable("output_cost_per_token")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun regionName(): String? = regionName.getNullable("region_name")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rpm(): Long? = rpm.getNullable("rpm")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun streamTimeout(): StreamTimeout? = streamTimeout.getNullable("stream_timeout")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeout(): Timeout? = timeout.getNullable("timeout")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tpm(): Long? = tpm.getNullable("tpm")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun useInPassThrough(): Boolean? = useInPassThrough.getNullable("use_in_pass_through")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun vertexCredentials(): VertexCredentials? =
            vertexCredentials.getNullable("vertex_credentials")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun vertexLocation(): String? = vertexLocation.getNullable("vertex_location")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun vertexProject(): String? = vertexProject.getNullable("vertex_project")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun watsonxRegionName(): String? = watsonxRegionName.getNullable("watsonx_region_name")

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [apiBase].
         *
         * Unlike [apiBase], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("api_base") @ExcludeMissing fun _apiBase(): JsonField<String> = apiBase

        /**
         * Returns the raw JSON value of [apiKey].
         *
         * Unlike [apiKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("api_key") @ExcludeMissing fun _apiKey(): JsonField<String> = apiKey

        /**
         * Returns the raw JSON value of [apiVersion].
         *
         * Unlike [apiVersion], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("api_version")
        @ExcludeMissing
        fun _apiVersion(): JsonField<String> = apiVersion

        /**
         * Returns the raw JSON value of [awsAccessKeyId].
         *
         * Unlike [awsAccessKeyId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("aws_access_key_id")
        @ExcludeMissing
        fun _awsAccessKeyId(): JsonField<String> = awsAccessKeyId

        /**
         * Returns the raw JSON value of [awsRegionName].
         *
         * Unlike [awsRegionName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("aws_region_name")
        @ExcludeMissing
        fun _awsRegionName(): JsonField<String> = awsRegionName

        /**
         * Returns the raw JSON value of [awsSecretAccessKey].
         *
         * Unlike [awsSecretAccessKey], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("aws_secret_access_key")
        @ExcludeMissing
        fun _awsSecretAccessKey(): JsonField<String> = awsSecretAccessKey

        /**
         * Returns the raw JSON value of [budgetDuration].
         *
         * Unlike [budgetDuration], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("budget_duration")
        @ExcludeMissing
        fun _budgetDuration(): JsonField<String> = budgetDuration

        /**
         * Returns the raw JSON value of [configurableClientsideAuthParams].
         *
         * Unlike [configurableClientsideAuthParams], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("configurable_clientside_auth_params")
        @ExcludeMissing
        fun _configurableClientsideAuthParams(): JsonField<List<ConfigurableClientsideAuthParam>> =
            configurableClientsideAuthParams

        /**
         * Returns the raw JSON value of [customLlmProvider].
         *
         * Unlike [customLlmProvider], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_llm_provider")
        @ExcludeMissing
        fun _customLlmProvider(): JsonField<String> = customLlmProvider

        /**
         * Returns the raw JSON value of [inputCostPerSecond].
         *
         * Unlike [inputCostPerSecond], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("input_cost_per_second")
        @ExcludeMissing
        fun _inputCostPerSecond(): JsonField<Double> = inputCostPerSecond

        /**
         * Returns the raw JSON value of [inputCostPerToken].
         *
         * Unlike [inputCostPerToken], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("input_cost_per_token")
        @ExcludeMissing
        fun _inputCostPerToken(): JsonField<Double> = inputCostPerToken

        /**
         * Returns the raw JSON value of [llmTraceId].
         *
         * Unlike [llmTraceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("llm_trace_id")
        @ExcludeMissing
        fun _llmTraceId(): JsonField<String> = llmTraceId

        /**
         * Returns the raw JSON value of [maxBudget].
         *
         * Unlike [maxBudget], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_budget") @ExcludeMissing fun _maxBudget(): JsonField<Double> = maxBudget

        /**
         * Returns the raw JSON value of [maxFileSizeMb].
         *
         * Unlike [maxFileSizeMb], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("max_file_size_mb")
        @ExcludeMissing
        fun _maxFileSizeMb(): JsonField<Double> = maxFileSizeMb

        /**
         * Returns the raw JSON value of [maxRetries].
         *
         * Unlike [maxRetries], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_retries") @ExcludeMissing fun _maxRetries(): JsonField<Long> = maxRetries

        /**
         * Returns the raw JSON value of [mergeReasoningContentInChoices].
         *
         * Unlike [mergeReasoningContentInChoices], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("merge_reasoning_content_in_choices")
        @ExcludeMissing
        fun _mergeReasoningContentInChoices(): JsonField<Boolean> = mergeReasoningContentInChoices

        /**
         * Returns the raw JSON value of [organization].
         *
         * Unlike [organization], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("organization")
        @ExcludeMissing
        fun _organization(): JsonField<String> = organization

        /**
         * Returns the raw JSON value of [outputCostPerSecond].
         *
         * Unlike [outputCostPerSecond], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("output_cost_per_second")
        @ExcludeMissing
        fun _outputCostPerSecond(): JsonField<Double> = outputCostPerSecond

        /**
         * Returns the raw JSON value of [outputCostPerToken].
         *
         * Unlike [outputCostPerToken], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("output_cost_per_token")
        @ExcludeMissing
        fun _outputCostPerToken(): JsonField<Double> = outputCostPerToken

        /**
         * Returns the raw JSON value of [regionName].
         *
         * Unlike [regionName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region_name")
        @ExcludeMissing
        fun _regionName(): JsonField<String> = regionName

        /**
         * Returns the raw JSON value of [rpm].
         *
         * Unlike [rpm], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rpm") @ExcludeMissing fun _rpm(): JsonField<Long> = rpm

        /**
         * Returns the raw JSON value of [streamTimeout].
         *
         * Unlike [streamTimeout], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("stream_timeout")
        @ExcludeMissing
        fun _streamTimeout(): JsonField<StreamTimeout> = streamTimeout

        /**
         * Returns the raw JSON value of [timeout].
         *
         * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timeout") @ExcludeMissing fun _timeout(): JsonField<Timeout> = timeout

        /**
         * Returns the raw JSON value of [tpm].
         *
         * Unlike [tpm], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tpm") @ExcludeMissing fun _tpm(): JsonField<Long> = tpm

        /**
         * Returns the raw JSON value of [useInPassThrough].
         *
         * Unlike [useInPassThrough], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("use_in_pass_through")
        @ExcludeMissing
        fun _useInPassThrough(): JsonField<Boolean> = useInPassThrough

        /**
         * Returns the raw JSON value of [vertexCredentials].
         *
         * Unlike [vertexCredentials], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("vertex_credentials")
        @ExcludeMissing
        fun _vertexCredentials(): JsonField<VertexCredentials> = vertexCredentials

        /**
         * Returns the raw JSON value of [vertexLocation].
         *
         * Unlike [vertexLocation], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("vertex_location")
        @ExcludeMissing
        fun _vertexLocation(): JsonField<String> = vertexLocation

        /**
         * Returns the raw JSON value of [vertexProject].
         *
         * Unlike [vertexProject], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("vertex_project")
        @ExcludeMissing
        fun _vertexProject(): JsonField<String> = vertexProject

        /**
         * Returns the raw JSON value of [watsonxRegionName].
         *
         * Unlike [watsonxRegionName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("watsonx_region_name")
        @ExcludeMissing
        fun _watsonxRegionName(): JsonField<String> = watsonxRegionName

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [LlmParams].
             *
             * The following fields are required:
             * ```kotlin
             * .model()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [LlmParams]. */
        class Builder internal constructor() {

            private var model: JsonField<String>? = null
            private var apiBase: JsonField<String> = JsonMissing.of()
            private var apiKey: JsonField<String> = JsonMissing.of()
            private var apiVersion: JsonField<String> = JsonMissing.of()
            private var awsAccessKeyId: JsonField<String> = JsonMissing.of()
            private var awsRegionName: JsonField<String> = JsonMissing.of()
            private var awsSecretAccessKey: JsonField<String> = JsonMissing.of()
            private var budgetDuration: JsonField<String> = JsonMissing.of()
            private var configurableClientsideAuthParams:
                JsonField<MutableList<ConfigurableClientsideAuthParam>>? =
                null
            private var customLlmProvider: JsonField<String> = JsonMissing.of()
            private var inputCostPerSecond: JsonField<Double> = JsonMissing.of()
            private var inputCostPerToken: JsonField<Double> = JsonMissing.of()
            private var llmTraceId: JsonField<String> = JsonMissing.of()
            private var maxBudget: JsonField<Double> = JsonMissing.of()
            private var maxFileSizeMb: JsonField<Double> = JsonMissing.of()
            private var maxRetries: JsonField<Long> = JsonMissing.of()
            private var mergeReasoningContentInChoices: JsonField<Boolean> = JsonMissing.of()
            private var modelInfo: JsonValue = JsonMissing.of()
            private var organization: JsonField<String> = JsonMissing.of()
            private var outputCostPerSecond: JsonField<Double> = JsonMissing.of()
            private var outputCostPerToken: JsonField<Double> = JsonMissing.of()
            private var regionName: JsonField<String> = JsonMissing.of()
            private var rpm: JsonField<Long> = JsonMissing.of()
            private var streamTimeout: JsonField<StreamTimeout> = JsonMissing.of()
            private var timeout: JsonField<Timeout> = JsonMissing.of()
            private var tpm: JsonField<Long> = JsonMissing.of()
            private var useInPassThrough: JsonField<Boolean> = JsonMissing.of()
            private var vertexCredentials: JsonField<VertexCredentials> = JsonMissing.of()
            private var vertexLocation: JsonField<String> = JsonMissing.of()
            private var vertexProject: JsonField<String> = JsonMissing.of()
            private var watsonxRegionName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(llmParams: LlmParams) = apply {
                model = llmParams.model
                apiBase = llmParams.apiBase
                apiKey = llmParams.apiKey
                apiVersion = llmParams.apiVersion
                awsAccessKeyId = llmParams.awsAccessKeyId
                awsRegionName = llmParams.awsRegionName
                awsSecretAccessKey = llmParams.awsSecretAccessKey
                budgetDuration = llmParams.budgetDuration
                configurableClientsideAuthParams =
                    llmParams.configurableClientsideAuthParams.map { it.toMutableList() }
                customLlmProvider = llmParams.customLlmProvider
                inputCostPerSecond = llmParams.inputCostPerSecond
                inputCostPerToken = llmParams.inputCostPerToken
                llmTraceId = llmParams.llmTraceId
                maxBudget = llmParams.maxBudget
                maxFileSizeMb = llmParams.maxFileSizeMb
                maxRetries = llmParams.maxRetries
                mergeReasoningContentInChoices = llmParams.mergeReasoningContentInChoices
                modelInfo = llmParams.modelInfo
                organization = llmParams.organization
                outputCostPerSecond = llmParams.outputCostPerSecond
                outputCostPerToken = llmParams.outputCostPerToken
                regionName = llmParams.regionName
                rpm = llmParams.rpm
                streamTimeout = llmParams.streamTimeout
                timeout = llmParams.timeout
                tpm = llmParams.tpm
                useInPassThrough = llmParams.useInPassThrough
                vertexCredentials = llmParams.vertexCredentials
                vertexLocation = llmParams.vertexLocation
                vertexProject = llmParams.vertexProject
                watsonxRegionName = llmParams.watsonxRegionName
                additionalProperties = llmParams.additionalProperties.toMutableMap()
            }

            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            fun apiBase(apiBase: String?) = apiBase(JsonField.ofNullable(apiBase))

            /**
             * Sets [Builder.apiBase] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiBase] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiBase(apiBase: JsonField<String>) = apply { this.apiBase = apiBase }

            fun apiKey(apiKey: String?) = apiKey(JsonField.ofNullable(apiKey))

            /**
             * Sets [Builder.apiKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiKey] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiKey(apiKey: JsonField<String>) = apply { this.apiKey = apiKey }

            fun apiVersion(apiVersion: String?) = apiVersion(JsonField.ofNullable(apiVersion))

            /**
             * Sets [Builder.apiVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiVersion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiVersion(apiVersion: JsonField<String>) = apply { this.apiVersion = apiVersion }

            fun awsAccessKeyId(awsAccessKeyId: String?) =
                awsAccessKeyId(JsonField.ofNullable(awsAccessKeyId))

            /**
             * Sets [Builder.awsAccessKeyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awsAccessKeyId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun awsAccessKeyId(awsAccessKeyId: JsonField<String>) = apply {
                this.awsAccessKeyId = awsAccessKeyId
            }

            fun awsRegionName(awsRegionName: String?) =
                awsRegionName(JsonField.ofNullable(awsRegionName))

            /**
             * Sets [Builder.awsRegionName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awsRegionName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun awsRegionName(awsRegionName: JsonField<String>) = apply {
                this.awsRegionName = awsRegionName
            }

            fun awsSecretAccessKey(awsSecretAccessKey: String?) =
                awsSecretAccessKey(JsonField.ofNullable(awsSecretAccessKey))

            /**
             * Sets [Builder.awsSecretAccessKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awsSecretAccessKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun awsSecretAccessKey(awsSecretAccessKey: JsonField<String>) = apply {
                this.awsSecretAccessKey = awsSecretAccessKey
            }

            fun budgetDuration(budgetDuration: String?) =
                budgetDuration(JsonField.ofNullable(budgetDuration))

            /**
             * Sets [Builder.budgetDuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.budgetDuration] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun budgetDuration(budgetDuration: JsonField<String>) = apply {
                this.budgetDuration = budgetDuration
            }

            fun configurableClientsideAuthParams(
                configurableClientsideAuthParams: List<ConfigurableClientsideAuthParam>?
            ) =
                configurableClientsideAuthParams(
                    JsonField.ofNullable(configurableClientsideAuthParams)
                )

            /**
             * Sets [Builder.configurableClientsideAuthParams] to an arbitrary JSON value.
             *
             * You should usually call [Builder.configurableClientsideAuthParams] with a well-typed
             * `List<ConfigurableClientsideAuthParam>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun configurableClientsideAuthParams(
                configurableClientsideAuthParams: JsonField<List<ConfigurableClientsideAuthParam>>
            ) = apply {
                this.configurableClientsideAuthParams =
                    configurableClientsideAuthParams.map { it.toMutableList() }
            }

            /**
             * Adds a single [ConfigurableClientsideAuthParam] to
             * [configurableClientsideAuthParams].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addConfigurableClientsideAuthParam(
                configurableClientsideAuthParam: ConfigurableClientsideAuthParam
            ) = apply {
                configurableClientsideAuthParams =
                    (configurableClientsideAuthParams ?: JsonField.of(mutableListOf())).also {
                        checkKnown("configurableClientsideAuthParams", it)
                            .add(configurableClientsideAuthParam)
                    }
            }

            /**
             * Alias for calling [addConfigurableClientsideAuthParam] with
             * `ConfigurableClientsideAuthParam.ofString(string)`.
             */
            fun addConfigurableClientsideAuthParam(string: String) =
                addConfigurableClientsideAuthParam(ConfigurableClientsideAuthParam.ofString(string))

            /**
             * Alias for calling [addConfigurableClientsideAuthParam] with
             * `ConfigurableClientsideAuthParam.ofParamsCustomAuth(paramsCustomAuth)`.
             */
            fun addConfigurableClientsideAuthParam(
                paramsCustomAuth: ConfigurableClientsideParamsCustomAuth
            ) =
                addConfigurableClientsideAuthParam(
                    ConfigurableClientsideAuthParam.ofParamsCustomAuth(paramsCustomAuth)
                )

            fun customLlmProvider(customLlmProvider: String?) =
                customLlmProvider(JsonField.ofNullable(customLlmProvider))

            /**
             * Sets [Builder.customLlmProvider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customLlmProvider] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customLlmProvider(customLlmProvider: JsonField<String>) = apply {
                this.customLlmProvider = customLlmProvider
            }

            fun inputCostPerSecond(inputCostPerSecond: Double?) =
                inputCostPerSecond(JsonField.ofNullable(inputCostPerSecond))

            /**
             * Alias for [Builder.inputCostPerSecond].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun inputCostPerSecond(inputCostPerSecond: Double) =
                inputCostPerSecond(inputCostPerSecond as Double?)

            /**
             * Sets [Builder.inputCostPerSecond] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputCostPerSecond] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inputCostPerSecond(inputCostPerSecond: JsonField<Double>) = apply {
                this.inputCostPerSecond = inputCostPerSecond
            }

            fun inputCostPerToken(inputCostPerToken: Double?) =
                inputCostPerToken(JsonField.ofNullable(inputCostPerToken))

            /**
             * Alias for [Builder.inputCostPerToken].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun inputCostPerToken(inputCostPerToken: Double) =
                inputCostPerToken(inputCostPerToken as Double?)

            /**
             * Sets [Builder.inputCostPerToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputCostPerToken] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inputCostPerToken(inputCostPerToken: JsonField<Double>) = apply {
                this.inputCostPerToken = inputCostPerToken
            }

            fun llmTraceId(llmTraceId: String?) = llmTraceId(JsonField.ofNullable(llmTraceId))

            /**
             * Sets [Builder.llmTraceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.llmTraceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun llmTraceId(llmTraceId: JsonField<String>) = apply { this.llmTraceId = llmTraceId }

            fun maxBudget(maxBudget: Double?) = maxBudget(JsonField.ofNullable(maxBudget))

            /**
             * Alias for [Builder.maxBudget].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxBudget(maxBudget: Double) = maxBudget(maxBudget as Double?)

            /**
             * Sets [Builder.maxBudget] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxBudget] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxBudget(maxBudget: JsonField<Double>) = apply { this.maxBudget = maxBudget }

            fun maxFileSizeMb(maxFileSizeMb: Double?) =
                maxFileSizeMb(JsonField.ofNullable(maxFileSizeMb))

            /**
             * Alias for [Builder.maxFileSizeMb].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxFileSizeMb(maxFileSizeMb: Double) = maxFileSizeMb(maxFileSizeMb as Double?)

            /**
             * Sets [Builder.maxFileSizeMb] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxFileSizeMb] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxFileSizeMb(maxFileSizeMb: JsonField<Double>) = apply {
                this.maxFileSizeMb = maxFileSizeMb
            }

            fun maxRetries(maxRetries: Long?) = maxRetries(JsonField.ofNullable(maxRetries))

            /**
             * Alias for [Builder.maxRetries].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxRetries(maxRetries: Long) = maxRetries(maxRetries as Long?)

            /**
             * Sets [Builder.maxRetries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxRetries] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxRetries(maxRetries: JsonField<Long>) = apply { this.maxRetries = maxRetries }

            fun mergeReasoningContentInChoices(mergeReasoningContentInChoices: Boolean?) =
                mergeReasoningContentInChoices(JsonField.ofNullable(mergeReasoningContentInChoices))

            /**
             * Alias for [Builder.mergeReasoningContentInChoices].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun mergeReasoningContentInChoices(mergeReasoningContentInChoices: Boolean) =
                mergeReasoningContentInChoices(mergeReasoningContentInChoices as Boolean?)

            /**
             * Sets [Builder.mergeReasoningContentInChoices] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mergeReasoningContentInChoices] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun mergeReasoningContentInChoices(mergeReasoningContentInChoices: JsonField<Boolean>) =
                apply {
                    this.mergeReasoningContentInChoices = mergeReasoningContentInChoices
                }

            fun modelInfo(modelInfo: JsonValue) = apply { this.modelInfo = modelInfo }

            fun organization(organization: String?) =
                organization(JsonField.ofNullable(organization))

            /**
             * Sets [Builder.organization] to an arbitrary JSON value.
             *
             * You should usually call [Builder.organization] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun organization(organization: JsonField<String>) = apply {
                this.organization = organization
            }

            fun outputCostPerSecond(outputCostPerSecond: Double?) =
                outputCostPerSecond(JsonField.ofNullable(outputCostPerSecond))

            /**
             * Alias for [Builder.outputCostPerSecond].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun outputCostPerSecond(outputCostPerSecond: Double) =
                outputCostPerSecond(outputCostPerSecond as Double?)

            /**
             * Sets [Builder.outputCostPerSecond] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputCostPerSecond] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun outputCostPerSecond(outputCostPerSecond: JsonField<Double>) = apply {
                this.outputCostPerSecond = outputCostPerSecond
            }

            fun outputCostPerToken(outputCostPerToken: Double?) =
                outputCostPerToken(JsonField.ofNullable(outputCostPerToken))

            /**
             * Alias for [Builder.outputCostPerToken].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun outputCostPerToken(outputCostPerToken: Double) =
                outputCostPerToken(outputCostPerToken as Double?)

            /**
             * Sets [Builder.outputCostPerToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputCostPerToken] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputCostPerToken(outputCostPerToken: JsonField<Double>) = apply {
                this.outputCostPerToken = outputCostPerToken
            }

            fun regionName(regionName: String?) = regionName(JsonField.ofNullable(regionName))

            /**
             * Sets [Builder.regionName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.regionName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun regionName(regionName: JsonField<String>) = apply { this.regionName = regionName }

            fun rpm(rpm: Long?) = rpm(JsonField.ofNullable(rpm))

            /**
             * Alias for [Builder.rpm].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun rpm(rpm: Long) = rpm(rpm as Long?)

            /**
             * Sets [Builder.rpm] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rpm] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun rpm(rpm: JsonField<Long>) = apply { this.rpm = rpm }

            fun streamTimeout(streamTimeout: StreamTimeout?) =
                streamTimeout(JsonField.ofNullable(streamTimeout))

            /**
             * Sets [Builder.streamTimeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.streamTimeout] with a well-typed [StreamTimeout]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun streamTimeout(streamTimeout: JsonField<StreamTimeout>) = apply {
                this.streamTimeout = streamTimeout
            }

            /** Alias for calling [streamTimeout] with `StreamTimeout.ofDouble(double)`. */
            fun streamTimeout(double: Double) = streamTimeout(StreamTimeout.ofDouble(double))

            /** Alias for calling [streamTimeout] with `StreamTimeout.ofString(string)`. */
            fun streamTimeout(string: String) = streamTimeout(StreamTimeout.ofString(string))

            fun timeout(timeout: Timeout?) = timeout(JsonField.ofNullable(timeout))

            /**
             * Sets [Builder.timeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeout] with a well-typed [Timeout] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeout(timeout: JsonField<Timeout>) = apply { this.timeout = timeout }

            /** Alias for calling [timeout] with `Timeout.ofDouble(double)`. */
            fun timeout(double: Double) = timeout(Timeout.ofDouble(double))

            /** Alias for calling [timeout] with `Timeout.ofString(string)`. */
            fun timeout(string: String) = timeout(Timeout.ofString(string))

            fun tpm(tpm: Long?) = tpm(JsonField.ofNullable(tpm))

            /**
             * Alias for [Builder.tpm].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun tpm(tpm: Long) = tpm(tpm as Long?)

            /**
             * Sets [Builder.tpm] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tpm] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tpm(tpm: JsonField<Long>) = apply { this.tpm = tpm }

            fun useInPassThrough(useInPassThrough: Boolean?) =
                useInPassThrough(JsonField.ofNullable(useInPassThrough))

            /**
             * Alias for [Builder.useInPassThrough].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun useInPassThrough(useInPassThrough: Boolean) =
                useInPassThrough(useInPassThrough as Boolean?)

            /**
             * Sets [Builder.useInPassThrough] to an arbitrary JSON value.
             *
             * You should usually call [Builder.useInPassThrough] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun useInPassThrough(useInPassThrough: JsonField<Boolean>) = apply {
                this.useInPassThrough = useInPassThrough
            }

            fun vertexCredentials(vertexCredentials: VertexCredentials?) =
                vertexCredentials(JsonField.ofNullable(vertexCredentials))

            /**
             * Sets [Builder.vertexCredentials] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vertexCredentials] with a well-typed
             * [VertexCredentials] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun vertexCredentials(vertexCredentials: JsonField<VertexCredentials>) = apply {
                this.vertexCredentials = vertexCredentials
            }

            /**
             * Alias for calling [vertexCredentials] with
             * `VertexCredentials.ofJsonValue(jsonValue)`.
             */
            fun vertexCredentials(jsonValue: JsonValue) =
                vertexCredentials(VertexCredentials.ofJsonValue(jsonValue))

            /** Alias for calling [vertexCredentials] with `VertexCredentials.ofString(string)`. */
            fun vertexCredentials(string: String) =
                vertexCredentials(VertexCredentials.ofString(string))

            fun vertexLocation(vertexLocation: String?) =
                vertexLocation(JsonField.ofNullable(vertexLocation))

            /**
             * Sets [Builder.vertexLocation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vertexLocation] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vertexLocation(vertexLocation: JsonField<String>) = apply {
                this.vertexLocation = vertexLocation
            }

            fun vertexProject(vertexProject: String?) =
                vertexProject(JsonField.ofNullable(vertexProject))

            /**
             * Sets [Builder.vertexProject] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vertexProject] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vertexProject(vertexProject: JsonField<String>) = apply {
                this.vertexProject = vertexProject
            }

            fun watsonxRegionName(watsonxRegionName: String?) =
                watsonxRegionName(JsonField.ofNullable(watsonxRegionName))

            /**
             * Sets [Builder.watsonxRegionName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.watsonxRegionName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun watsonxRegionName(watsonxRegionName: JsonField<String>) = apply {
                this.watsonxRegionName = watsonxRegionName
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [LlmParams].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .model()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): LlmParams =
                LlmParams(
                    checkRequired("model", model),
                    apiBase,
                    apiKey,
                    apiVersion,
                    awsAccessKeyId,
                    awsRegionName,
                    awsSecretAccessKey,
                    budgetDuration,
                    (configurableClientsideAuthParams ?: JsonMissing.of()).map { it.toImmutable() },
                    customLlmProvider,
                    inputCostPerSecond,
                    inputCostPerToken,
                    llmTraceId,
                    maxBudget,
                    maxFileSizeMb,
                    maxRetries,
                    mergeReasoningContentInChoices,
                    modelInfo,
                    organization,
                    outputCostPerSecond,
                    outputCostPerToken,
                    regionName,
                    rpm,
                    streamTimeout,
                    timeout,
                    tpm,
                    useInPassThrough,
                    vertexCredentials,
                    vertexLocation,
                    vertexProject,
                    watsonxRegionName,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): LlmParams = apply {
            if (validated) {
                return@apply
            }

            model()
            apiBase()
            apiKey()
            apiVersion()
            awsAccessKeyId()
            awsRegionName()
            awsSecretAccessKey()
            budgetDuration()
            configurableClientsideAuthParams()?.forEach { it.validate() }
            customLlmProvider()
            inputCostPerSecond()
            inputCostPerToken()
            llmTraceId()
            maxBudget()
            maxFileSizeMb()
            maxRetries()
            mergeReasoningContentInChoices()
            organization()
            outputCostPerSecond()
            outputCostPerToken()
            regionName()
            rpm()
            streamTimeout()?.validate()
            timeout()?.validate()
            tpm()
            useInPassThrough()
            vertexCredentials()?.validate()
            vertexLocation()
            vertexProject()
            watsonxRegionName()
            validated = true
        }

        @JsonDeserialize(using = ConfigurableClientsideAuthParam.Deserializer::class)
        @JsonSerialize(using = ConfigurableClientsideAuthParam.Serializer::class)
        class ConfigurableClientsideAuthParam
        private constructor(
            private val string: String? = null,
            private val paramsCustomAuth: ConfigurableClientsideParamsCustomAuth? = null,
            private val _json: JsonValue? = null,
        ) {

            fun string(): String? = string

            fun paramsCustomAuth(): ConfigurableClientsideParamsCustomAuth? = paramsCustomAuth

            fun isString(): Boolean = string != null

            fun isParamsCustomAuth(): Boolean = paramsCustomAuth != null

            fun asString(): String = string.getOrThrow("string")

            fun asParamsCustomAuth(): ConfigurableClientsideParamsCustomAuth =
                paramsCustomAuth.getOrThrow("paramsCustomAuth")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    string != null -> visitor.visitString(string)
                    paramsCustomAuth != null -> visitor.visitParamsCustomAuth(paramsCustomAuth)
                    else -> visitor.unknown(_json)
                }
            }

            private var validated: Boolean = false

            fun validate(): ConfigurableClientsideAuthParam = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitString(string: String) {}

                        override fun visitParamsCustomAuth(
                            paramsCustomAuth: ConfigurableClientsideParamsCustomAuth
                        ) {
                            paramsCustomAuth.validate()
                        }
                    }
                )
                validated = true
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ConfigurableClientsideAuthParam && string == other.string && paramsCustomAuth == other.paramsCustomAuth /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, paramsCustomAuth) /* spotless:on */

            override fun toString(): String =
                when {
                    string != null -> "ConfigurableClientsideAuthParam{string=$string}"
                    paramsCustomAuth != null ->
                        "ConfigurableClientsideAuthParam{paramsCustomAuth=$paramsCustomAuth}"
                    _json != null -> "ConfigurableClientsideAuthParam{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid ConfigurableClientsideAuthParam")
                }

            companion object {

                fun ofString(string: String) = ConfigurableClientsideAuthParam(string = string)

                fun ofParamsCustomAuth(paramsCustomAuth: ConfigurableClientsideParamsCustomAuth) =
                    ConfigurableClientsideAuthParam(paramsCustomAuth = paramsCustomAuth)
            }

            /**
             * An interface that defines how to map each variant of
             * [ConfigurableClientsideAuthParam] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitParamsCustomAuth(
                    paramsCustomAuth: ConfigurableClientsideParamsCustomAuth
                ): T

                /**
                 * Maps an unknown variant of [ConfigurableClientsideAuthParam] to a value of type
                 * [T].
                 *
                 * An instance of [ConfigurableClientsideAuthParam] can contain an unknown variant
                 * if it was deserialized from data that doesn't match any known variant. For
                 * example, if the SDK is on an older version than the API, then the API may respond
                 * with new variants that the SDK is unaware of.
                 *
                 * @throws HanzoInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw HanzoInvalidDataException(
                        "Unknown ConfigurableClientsideAuthParam: $json"
                    )
                }
            }

            internal class Deserializer :
                BaseDeserializer<ConfigurableClientsideAuthParam>(
                    ConfigurableClientsideAuthParam::class
                ) {

                override fun ObjectCodec.deserialize(
                    node: JsonNode
                ): ConfigurableClientsideAuthParam {
                    val json = JsonValue.fromJsonNode(node)

                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                        return ConfigurableClientsideAuthParam(string = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<ConfigurableClientsideParamsCustomAuth>()) {
                            it.validate()
                        }
                        ?.let {
                            return ConfigurableClientsideAuthParam(
                                paramsCustomAuth = it,
                                _json = json,
                            )
                        }

                    return ConfigurableClientsideAuthParam(_json = json)
                }
            }

            internal class Serializer :
                BaseSerializer<ConfigurableClientsideAuthParam>(
                    ConfigurableClientsideAuthParam::class
                ) {

                override fun serialize(
                    value: ConfigurableClientsideAuthParam,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.string != null -> generator.writeObject(value.string)
                        value.paramsCustomAuth != null ->
                            generator.writeObject(value.paramsCustomAuth)
                        value._json != null -> generator.writeObject(value._json)
                        else ->
                            throw IllegalStateException("Invalid ConfigurableClientsideAuthParam")
                    }
                }
            }
        }

        @JsonDeserialize(using = StreamTimeout.Deserializer::class)
        @JsonSerialize(using = StreamTimeout.Serializer::class)
        class StreamTimeout
        private constructor(
            private val double: Double? = null,
            private val string: String? = null,
            private val _json: JsonValue? = null,
        ) {

            fun double(): Double? = double

            fun string(): String? = string

            fun isDouble(): Boolean = double != null

            fun isString(): Boolean = string != null

            fun asDouble(): Double = double.getOrThrow("double")

            fun asString(): String = string.getOrThrow("string")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    double != null -> visitor.visitDouble(double)
                    string != null -> visitor.visitString(string)
                    else -> visitor.unknown(_json)
                }
            }

            private var validated: Boolean = false

            fun validate(): StreamTimeout = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitDouble(double: Double) {}

                        override fun visitString(string: String) {}
                    }
                )
                validated = true
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is StreamTimeout && double == other.double && string == other.string /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(double, string) /* spotless:on */

            override fun toString(): String =
                when {
                    double != null -> "StreamTimeout{double=$double}"
                    string != null -> "StreamTimeout{string=$string}"
                    _json != null -> "StreamTimeout{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid StreamTimeout")
                }

            companion object {

                fun ofDouble(double: Double) = StreamTimeout(double = double)

                fun ofString(string: String) = StreamTimeout(string = string)
            }

            /**
             * An interface that defines how to map each variant of [StreamTimeout] to a value of
             * type [T].
             */
            interface Visitor<out T> {

                fun visitDouble(double: Double): T

                fun visitString(string: String): T

                /**
                 * Maps an unknown variant of [StreamTimeout] to a value of type [T].
                 *
                 * An instance of [StreamTimeout] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws HanzoInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw HanzoInvalidDataException("Unknown StreamTimeout: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<StreamTimeout>(StreamTimeout::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): StreamTimeout {
                    val json = JsonValue.fromJsonNode(node)

                    tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                        return StreamTimeout(double = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                        return StreamTimeout(string = it, _json = json)
                    }

                    return StreamTimeout(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<StreamTimeout>(StreamTimeout::class) {

                override fun serialize(
                    value: StreamTimeout,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.double != null -> generator.writeObject(value.double)
                        value.string != null -> generator.writeObject(value.string)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid StreamTimeout")
                    }
                }
            }
        }

        @JsonDeserialize(using = Timeout.Deserializer::class)
        @JsonSerialize(using = Timeout.Serializer::class)
        class Timeout
        private constructor(
            private val double: Double? = null,
            private val string: String? = null,
            private val _json: JsonValue? = null,
        ) {

            fun double(): Double? = double

            fun string(): String? = string

            fun isDouble(): Boolean = double != null

            fun isString(): Boolean = string != null

            fun asDouble(): Double = double.getOrThrow("double")

            fun asString(): String = string.getOrThrow("string")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    double != null -> visitor.visitDouble(double)
                    string != null -> visitor.visitString(string)
                    else -> visitor.unknown(_json)
                }
            }

            private var validated: Boolean = false

            fun validate(): Timeout = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitDouble(double: Double) {}

                        override fun visitString(string: String) {}
                    }
                )
                validated = true
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Timeout && double == other.double && string == other.string /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(double, string) /* spotless:on */

            override fun toString(): String =
                when {
                    double != null -> "Timeout{double=$double}"
                    string != null -> "Timeout{string=$string}"
                    _json != null -> "Timeout{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Timeout")
                }

            companion object {

                fun ofDouble(double: Double) = Timeout(double = double)

                fun ofString(string: String) = Timeout(string = string)
            }

            /**
             * An interface that defines how to map each variant of [Timeout] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitDouble(double: Double): T

                fun visitString(string: String): T

                /**
                 * Maps an unknown variant of [Timeout] to a value of type [T].
                 *
                 * An instance of [Timeout] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws HanzoInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw HanzoInvalidDataException("Unknown Timeout: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Timeout>(Timeout::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Timeout {
                    val json = JsonValue.fromJsonNode(node)

                    tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                        return Timeout(double = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                        return Timeout(string = it, _json = json)
                    }

                    return Timeout(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Timeout>(Timeout::class) {

                override fun serialize(
                    value: Timeout,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.double != null -> generator.writeObject(value.double)
                        value.string != null -> generator.writeObject(value.string)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Timeout")
                    }
                }
            }
        }

        @JsonDeserialize(using = VertexCredentials.Deserializer::class)
        @JsonSerialize(using = VertexCredentials.Serializer::class)
        class VertexCredentials
        private constructor(
            private val jsonValue: JsonValue? = null,
            private val string: String? = null,
            private val _json: JsonValue? = null,
        ) {

            fun jsonValue(): JsonValue? = jsonValue

            fun string(): String? = string

            fun isJsonValue(): Boolean = jsonValue != null

            fun isString(): Boolean = string != null

            fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

            fun asString(): String = string.getOrThrow("string")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    jsonValue != null -> visitor.visitJsonValue(jsonValue)
                    string != null -> visitor.visitString(string)
                    else -> visitor.unknown(_json)
                }
            }

            private var validated: Boolean = false

            fun validate(): VertexCredentials = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitJsonValue(jsonValue: JsonValue) {}

                        override fun visitString(string: String) {}
                    }
                )
                validated = true
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is VertexCredentials && jsonValue == other.jsonValue && string == other.string /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(jsonValue, string) /* spotless:on */

            override fun toString(): String =
                when {
                    jsonValue != null -> "VertexCredentials{jsonValue=$jsonValue}"
                    string != null -> "VertexCredentials{string=$string}"
                    _json != null -> "VertexCredentials{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid VertexCredentials")
                }

            companion object {

                fun ofJsonValue(jsonValue: JsonValue) = VertexCredentials(jsonValue = jsonValue)

                fun ofString(string: String) = VertexCredentials(string = string)
            }

            /**
             * An interface that defines how to map each variant of [VertexCredentials] to a value
             * of type [T].
             */
            interface Visitor<out T> {

                fun visitJsonValue(jsonValue: JsonValue): T

                fun visitString(string: String): T

                /**
                 * Maps an unknown variant of [VertexCredentials] to a value of type [T].
                 *
                 * An instance of [VertexCredentials] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws HanzoInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw HanzoInvalidDataException("Unknown VertexCredentials: $json")
                }
            }

            internal class Deserializer :
                BaseDeserializer<VertexCredentials>(VertexCredentials::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): VertexCredentials {
                    val json = JsonValue.fromJsonNode(node)

                    tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                        return VertexCredentials(jsonValue = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                        return VertexCredentials(string = it, _json = json)
                    }

                    return VertexCredentials(_json = json)
                }
            }

            internal class Serializer :
                BaseSerializer<VertexCredentials>(VertexCredentials::class) {

                override fun serialize(
                    value: VertexCredentials,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.jsonValue != null -> generator.writeObject(value.jsonValue)
                        value.string != null -> generator.writeObject(value.string)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid VertexCredentials")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LlmParams && model == other.model && apiBase == other.apiBase && apiKey == other.apiKey && apiVersion == other.apiVersion && awsAccessKeyId == other.awsAccessKeyId && awsRegionName == other.awsRegionName && awsSecretAccessKey == other.awsSecretAccessKey && budgetDuration == other.budgetDuration && configurableClientsideAuthParams == other.configurableClientsideAuthParams && customLlmProvider == other.customLlmProvider && inputCostPerSecond == other.inputCostPerSecond && inputCostPerToken == other.inputCostPerToken && llmTraceId == other.llmTraceId && maxBudget == other.maxBudget && maxFileSizeMb == other.maxFileSizeMb && maxRetries == other.maxRetries && mergeReasoningContentInChoices == other.mergeReasoningContentInChoices && modelInfo == other.modelInfo && organization == other.organization && outputCostPerSecond == other.outputCostPerSecond && outputCostPerToken == other.outputCostPerToken && regionName == other.regionName && rpm == other.rpm && streamTimeout == other.streamTimeout && timeout == other.timeout && tpm == other.tpm && useInPassThrough == other.useInPassThrough && vertexCredentials == other.vertexCredentials && vertexLocation == other.vertexLocation && vertexProject == other.vertexProject && watsonxRegionName == other.watsonxRegionName && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(model, apiBase, apiKey, apiVersion, awsAccessKeyId, awsRegionName, awsSecretAccessKey, budgetDuration, configurableClientsideAuthParams, customLlmProvider, inputCostPerSecond, inputCostPerToken, llmTraceId, maxBudget, maxFileSizeMb, maxRetries, mergeReasoningContentInChoices, modelInfo, organization, outputCostPerSecond, outputCostPerToken, regionName, rpm, streamTimeout, timeout, tpm, useInPassThrough, vertexCredentials, vertexLocation, vertexProject, watsonxRegionName, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LlmParams{model=$model, apiBase=$apiBase, apiKey=$apiKey, apiVersion=$apiVersion, awsAccessKeyId=$awsAccessKeyId, awsRegionName=$awsRegionName, awsSecretAccessKey=$awsSecretAccessKey, budgetDuration=$budgetDuration, configurableClientsideAuthParams=$configurableClientsideAuthParams, customLlmProvider=$customLlmProvider, inputCostPerSecond=$inputCostPerSecond, inputCostPerToken=$inputCostPerToken, llmTraceId=$llmTraceId, maxBudget=$maxBudget, maxFileSizeMb=$maxFileSizeMb, maxRetries=$maxRetries, mergeReasoningContentInChoices=$mergeReasoningContentInChoices, modelInfo=$modelInfo, organization=$organization, outputCostPerSecond=$outputCostPerSecond, outputCostPerToken=$outputCostPerToken, regionName=$regionName, rpm=$rpm, streamTimeout=$streamTimeout, timeout=$timeout, tpm=$tpm, useInPassThrough=$useInPassThrough, vertexCredentials=$vertexCredentials, vertexLocation=$vertexLocation, vertexProject=$vertexProject, watsonxRegionName=$watsonxRegionName, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ModelCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ModelCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
