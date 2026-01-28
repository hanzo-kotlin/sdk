// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.model.update

import ai.hanzo.api.core.BaseDeserializer
import ai.hanzo.api.core.BaseSerializer
import ai.hanzo.api.core.Enum
import ai.hanzo.api.core.ExcludeMissing
import ai.hanzo.api.core.JsonField
import ai.hanzo.api.core.JsonMissing
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.allMaxBy
import ai.hanzo.api.core.checkKnown
import ai.hanzo.api.core.checkRequired
import ai.hanzo.api.core.getOrThrow
import ai.hanzo.api.core.toImmutable
import ai.hanzo.api.errors.HanzoInvalidDataException
import ai.hanzo.api.models.model.ModelInfo
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

class UpdateDeployment
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val litellmParams: JsonField<LitellmParams>,
    private val modelInfo: JsonField<ModelInfo>,
    private val modelName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("litellm_params")
        @ExcludeMissing
        litellmParams: JsonField<LitellmParams> = JsonMissing.of(),
        @JsonProperty("model_info")
        @ExcludeMissing
        modelInfo: JsonField<ModelInfo> = JsonMissing.of(),
        @JsonProperty("model_name") @ExcludeMissing modelName: JsonField<String> = JsonMissing.of(),
    ) : this(litellmParams, modelInfo, modelName, mutableMapOf())

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun litellmParams(): LitellmParams? = litellmParams.getNullable("litellm_params")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modelInfo(): ModelInfo? = modelInfo.getNullable("model_info")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modelName(): String? = modelName.getNullable("model_name")

    /**
     * Returns the raw JSON value of [litellmParams].
     *
     * Unlike [litellmParams], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("litellm_params")
    @ExcludeMissing
    fun _litellmParams(): JsonField<LitellmParams> = litellmParams

    /**
     * Returns the raw JSON value of [modelInfo].
     *
     * Unlike [modelInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model_info") @ExcludeMissing fun _modelInfo(): JsonField<ModelInfo> = modelInfo

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

        /** Returns a mutable builder for constructing an instance of [UpdateDeployment]. */
        fun builder() = Builder()
    }

    /** A builder for [UpdateDeployment]. */
    class Builder internal constructor() {

        private var litellmParams: JsonField<LitellmParams> = JsonMissing.of()
        private var modelInfo: JsonField<ModelInfo> = JsonMissing.of()
        private var modelName: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(updateDeployment: UpdateDeployment) = apply {
            litellmParams = updateDeployment.litellmParams
            modelInfo = updateDeployment.modelInfo
            modelName = updateDeployment.modelName
            additionalProperties = updateDeployment.additionalProperties.toMutableMap()
        }

        fun litellmParams(litellmParams: LitellmParams?) =
            litellmParams(JsonField.ofNullable(litellmParams))

        /**
         * Sets [Builder.litellmParams] to an arbitrary JSON value.
         *
         * You should usually call [Builder.litellmParams] with a well-typed [LitellmParams] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun litellmParams(litellmParams: JsonField<LitellmParams>) = apply {
            this.litellmParams = litellmParams
        }

        fun modelInfo(modelInfo: ModelInfo?) = modelInfo(JsonField.ofNullable(modelInfo))

        /**
         * Sets [Builder.modelInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelInfo] with a well-typed [ModelInfo] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun modelInfo(modelInfo: JsonField<ModelInfo>) = apply { this.modelInfo = modelInfo }

        fun modelName(modelName: String?) = modelName(JsonField.ofNullable(modelName))

        /**
         * Sets [Builder.modelName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Returns an immutable instance of [UpdateDeployment].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UpdateDeployment =
            UpdateDeployment(
                litellmParams,
                modelInfo,
                modelName,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UpdateDeployment = apply {
        if (validated) {
            return@apply
        }

        litellmParams()?.validate()
        modelInfo()?.validate()
        modelName()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: HanzoInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (litellmParams.asKnown()?.validity() ?: 0) +
            (modelInfo.asKnown()?.validity() ?: 0) +
            (if (modelName.asKnown() == null) 0 else 1)

    class LitellmParams
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val apiBase: JsonField<String>,
        private val apiKey: JsonField<String>,
        private val apiVersion: JsonField<String>,
        private val autoRouterConfig: JsonField<String>,
        private val autoRouterConfigPath: JsonField<String>,
        private val autoRouterDefaultModel: JsonField<String>,
        private val autoRouterEmbeddingModel: JsonField<String>,
        private val awsAccessKeyId: JsonField<String>,
        private val awsBedrockRuntimeEndpoint: JsonField<String>,
        private val awsRegionName: JsonField<String>,
        private val awsSecretAccessKey: JsonField<String>,
        private val budgetDuration: JsonField<String>,
        private val cacheCreationInputAudioTokenCost: JsonField<Double>,
        private val cacheCreationInputTokenCost: JsonField<Double>,
        private val cacheCreationInputTokenCostAbove1hr: JsonField<Double>,
        private val cacheCreationInputTokenCostAbove200kTokens: JsonField<Double>,
        private val cacheReadInputAudioTokenCost: JsonField<Double>,
        private val cacheReadInputTokenCost: JsonField<Double>,
        private val cacheReadInputTokenCostAbove200kTokens: JsonField<Double>,
        private val cacheReadInputTokenCostFlex: JsonField<Double>,
        private val cacheReadInputTokenCostPriority: JsonField<Double>,
        private val citationCostPerToken: JsonField<Double>,
        private val configurableClientsideAuthParams:
            JsonField<List<ConfigurableClientsideAuthParam>>,
        private val customLlmProvider: JsonField<String>,
        private val gcsBucketName: JsonField<String>,
        private val inputCostPerAudioPerSecond: JsonField<Double>,
        private val inputCostPerAudioPerSecondAbove128kTokens: JsonField<Double>,
        private val inputCostPerAudioToken: JsonField<Double>,
        private val inputCostPerCharacter: JsonField<Double>,
        private val inputCostPerCharacterAbove128kTokens: JsonField<Double>,
        private val inputCostPerImage: JsonField<Double>,
        private val inputCostPerImageAbove128kTokens: JsonField<Double>,
        private val inputCostPerPixel: JsonField<Double>,
        private val inputCostPerQuery: JsonField<Double>,
        private val inputCostPerSecond: JsonField<Double>,
        private val inputCostPerToken: JsonField<Double>,
        private val inputCostPerTokenAbove128kTokens: JsonField<Double>,
        private val inputCostPerTokenAbove200kTokens: JsonField<Double>,
        private val inputCostPerTokenBatches: JsonField<Double>,
        private val inputCostPerTokenCacheHit: JsonField<Double>,
        private val inputCostPerTokenFlex: JsonField<Double>,
        private val inputCostPerTokenPriority: JsonField<Double>,
        private val inputCostPerVideoPerSecond: JsonField<Double>,
        private val inputCostPerVideoPerSecondAbove128kTokens: JsonField<Double>,
        private val inputCostPerVideoPerSecondAbove15sInterval: JsonField<Double>,
        private val inputCostPerVideoPerSecondAbove8sInterval: JsonField<Double>,
        private val litellmCredentialName: JsonField<String>,
        private val litellmTraceId: JsonField<String>,
        private val maxBudget: JsonField<Double>,
        private val maxFileSizeMb: JsonField<Double>,
        private val maxRetries: JsonField<Long>,
        private val mergeReasoningContentInChoices: JsonField<Boolean>,
        private val milvusTextField: JsonField<String>,
        private val mockResponse: JsonField<MockResponse>,
        private val model: JsonField<String>,
        private val modelInfo: JsonField<ModelInfo>,
        private val organization: JsonField<String>,
        private val outputCostPerAudioPerSecond: JsonField<Double>,
        private val outputCostPerAudioToken: JsonField<Double>,
        private val outputCostPerCharacter: JsonField<Double>,
        private val outputCostPerCharacterAbove128kTokens: JsonField<Double>,
        private val outputCostPerImage: JsonField<Double>,
        private val outputCostPerImageToken: JsonField<Double>,
        private val outputCostPerPixel: JsonField<Double>,
        private val outputCostPerReasoningToken: JsonField<Double>,
        private val outputCostPerSecond: JsonField<Double>,
        private val outputCostPerToken: JsonField<Double>,
        private val outputCostPerTokenAbove128kTokens: JsonField<Double>,
        private val outputCostPerTokenAbove200kTokens: JsonField<Double>,
        private val outputCostPerTokenBatches: JsonField<Double>,
        private val outputCostPerTokenFlex: JsonField<Double>,
        private val outputCostPerTokenPriority: JsonField<Double>,
        private val outputCostPerVideoPerSecond: JsonField<Double>,
        private val regionName: JsonField<String>,
        private val rpm: JsonField<Long>,
        private val s3BucketName: JsonField<String>,
        private val s3EncryptionKeyId: JsonField<String>,
        private val searchContextCostPerQuery: JsonField<SearchContextCostPerQuery>,
        private val streamTimeout: JsonField<StreamTimeout>,
        private val tieredPricing: JsonField<List<TieredPricing>>,
        private val timeout: JsonField<Timeout>,
        private val tpm: JsonField<Long>,
        private val useInPassThrough: JsonField<Boolean>,
        private val useLitellmProxy: JsonField<Boolean>,
        private val vectorStoreId: JsonField<String>,
        private val vertexCredentials: JsonField<VertexCredentials>,
        private val vertexLocation: JsonField<String>,
        private val vertexProject: JsonField<String>,
        private val watsonxRegionName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("api_base") @ExcludeMissing apiBase: JsonField<String> = JsonMissing.of(),
            @JsonProperty("api_key") @ExcludeMissing apiKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("api_version")
            @ExcludeMissing
            apiVersion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("auto_router_config")
            @ExcludeMissing
            autoRouterConfig: JsonField<String> = JsonMissing.of(),
            @JsonProperty("auto_router_config_path")
            @ExcludeMissing
            autoRouterConfigPath: JsonField<String> = JsonMissing.of(),
            @JsonProperty("auto_router_default_model")
            @ExcludeMissing
            autoRouterDefaultModel: JsonField<String> = JsonMissing.of(),
            @JsonProperty("auto_router_embedding_model")
            @ExcludeMissing
            autoRouterEmbeddingModel: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aws_access_key_id")
            @ExcludeMissing
            awsAccessKeyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aws_bedrock_runtime_endpoint")
            @ExcludeMissing
            awsBedrockRuntimeEndpoint: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aws_region_name")
            @ExcludeMissing
            awsRegionName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aws_secret_access_key")
            @ExcludeMissing
            awsSecretAccessKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("budget_duration")
            @ExcludeMissing
            budgetDuration: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cache_creation_input_audio_token_cost")
            @ExcludeMissing
            cacheCreationInputAudioTokenCost: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("cache_creation_input_token_cost")
            @ExcludeMissing
            cacheCreationInputTokenCost: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("cache_creation_input_token_cost_above_1hr")
            @ExcludeMissing
            cacheCreationInputTokenCostAbove1hr: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("cache_creation_input_token_cost_above_200k_tokens")
            @ExcludeMissing
            cacheCreationInputTokenCostAbove200kTokens: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("cache_read_input_audio_token_cost")
            @ExcludeMissing
            cacheReadInputAudioTokenCost: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("cache_read_input_token_cost")
            @ExcludeMissing
            cacheReadInputTokenCost: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("cache_read_input_token_cost_above_200k_tokens")
            @ExcludeMissing
            cacheReadInputTokenCostAbove200kTokens: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("cache_read_input_token_cost_flex")
            @ExcludeMissing
            cacheReadInputTokenCostFlex: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("cache_read_input_token_cost_priority")
            @ExcludeMissing
            cacheReadInputTokenCostPriority: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("citation_cost_per_token")
            @ExcludeMissing
            citationCostPerToken: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("configurable_clientside_auth_params")
            @ExcludeMissing
            configurableClientsideAuthParams: JsonField<List<ConfigurableClientsideAuthParam>> =
                JsonMissing.of(),
            @JsonProperty("custom_llm_provider")
            @ExcludeMissing
            customLlmProvider: JsonField<String> = JsonMissing.of(),
            @JsonProperty("gcs_bucket_name")
            @ExcludeMissing
            gcsBucketName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("input_cost_per_audio_per_second")
            @ExcludeMissing
            inputCostPerAudioPerSecond: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("input_cost_per_audio_per_second_above_128k_tokens")
            @ExcludeMissing
            inputCostPerAudioPerSecondAbove128kTokens: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("input_cost_per_audio_token")
            @ExcludeMissing
            inputCostPerAudioToken: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("input_cost_per_character")
            @ExcludeMissing
            inputCostPerCharacter: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("input_cost_per_character_above_128k_tokens")
            @ExcludeMissing
            inputCostPerCharacterAbove128kTokens: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("input_cost_per_image")
            @ExcludeMissing
            inputCostPerImage: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("input_cost_per_image_above_128k_tokens")
            @ExcludeMissing
            inputCostPerImageAbove128kTokens: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("input_cost_per_pixel")
            @ExcludeMissing
            inputCostPerPixel: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("input_cost_per_query")
            @ExcludeMissing
            inputCostPerQuery: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("input_cost_per_second")
            @ExcludeMissing
            inputCostPerSecond: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("input_cost_per_token")
            @ExcludeMissing
            inputCostPerToken: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("input_cost_per_token_above_128k_tokens")
            @ExcludeMissing
            inputCostPerTokenAbove128kTokens: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("input_cost_per_token_above_200k_tokens")
            @ExcludeMissing
            inputCostPerTokenAbove200kTokens: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("input_cost_per_token_batches")
            @ExcludeMissing
            inputCostPerTokenBatches: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("input_cost_per_token_cache_hit")
            @ExcludeMissing
            inputCostPerTokenCacheHit: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("input_cost_per_token_flex")
            @ExcludeMissing
            inputCostPerTokenFlex: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("input_cost_per_token_priority")
            @ExcludeMissing
            inputCostPerTokenPriority: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("input_cost_per_video_per_second")
            @ExcludeMissing
            inputCostPerVideoPerSecond: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("input_cost_per_video_per_second_above_128k_tokens")
            @ExcludeMissing
            inputCostPerVideoPerSecondAbove128kTokens: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("input_cost_per_video_per_second_above_15s_interval")
            @ExcludeMissing
            inputCostPerVideoPerSecondAbove15sInterval: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("input_cost_per_video_per_second_above_8s_interval")
            @ExcludeMissing
            inputCostPerVideoPerSecondAbove8sInterval: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("litellm_credential_name")
            @ExcludeMissing
            litellmCredentialName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("litellm_trace_id")
            @ExcludeMissing
            litellmTraceId: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("milvus_text_field")
            @ExcludeMissing
            milvusTextField: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mock_response")
            @ExcludeMissing
            mockResponse: JsonField<MockResponse> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("model_info")
            @ExcludeMissing
            modelInfo: JsonField<ModelInfo> = JsonMissing.of(),
            @JsonProperty("organization")
            @ExcludeMissing
            organization: JsonField<String> = JsonMissing.of(),
            @JsonProperty("output_cost_per_audio_per_second")
            @ExcludeMissing
            outputCostPerAudioPerSecond: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("output_cost_per_audio_token")
            @ExcludeMissing
            outputCostPerAudioToken: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("output_cost_per_character")
            @ExcludeMissing
            outputCostPerCharacter: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("output_cost_per_character_above_128k_tokens")
            @ExcludeMissing
            outputCostPerCharacterAbove128kTokens: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("output_cost_per_image")
            @ExcludeMissing
            outputCostPerImage: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("output_cost_per_image_token")
            @ExcludeMissing
            outputCostPerImageToken: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("output_cost_per_pixel")
            @ExcludeMissing
            outputCostPerPixel: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("output_cost_per_reasoning_token")
            @ExcludeMissing
            outputCostPerReasoningToken: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("output_cost_per_second")
            @ExcludeMissing
            outputCostPerSecond: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("output_cost_per_token")
            @ExcludeMissing
            outputCostPerToken: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("output_cost_per_token_above_128k_tokens")
            @ExcludeMissing
            outputCostPerTokenAbove128kTokens: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("output_cost_per_token_above_200k_tokens")
            @ExcludeMissing
            outputCostPerTokenAbove200kTokens: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("output_cost_per_token_batches")
            @ExcludeMissing
            outputCostPerTokenBatches: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("output_cost_per_token_flex")
            @ExcludeMissing
            outputCostPerTokenFlex: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("output_cost_per_token_priority")
            @ExcludeMissing
            outputCostPerTokenPriority: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("output_cost_per_video_per_second")
            @ExcludeMissing
            outputCostPerVideoPerSecond: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("region_name")
            @ExcludeMissing
            regionName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rpm") @ExcludeMissing rpm: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("s3_bucket_name")
            @ExcludeMissing
            s3BucketName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("s3_encryption_key_id")
            @ExcludeMissing
            s3EncryptionKeyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("search_context_cost_per_query")
            @ExcludeMissing
            searchContextCostPerQuery: JsonField<SearchContextCostPerQuery> = JsonMissing.of(),
            @JsonProperty("stream_timeout")
            @ExcludeMissing
            streamTimeout: JsonField<StreamTimeout> = JsonMissing.of(),
            @JsonProperty("tiered_pricing")
            @ExcludeMissing
            tieredPricing: JsonField<List<TieredPricing>> = JsonMissing.of(),
            @JsonProperty("timeout") @ExcludeMissing timeout: JsonField<Timeout> = JsonMissing.of(),
            @JsonProperty("tpm") @ExcludeMissing tpm: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("use_in_pass_through")
            @ExcludeMissing
            useInPassThrough: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("use_litellm_proxy")
            @ExcludeMissing
            useLitellmProxy: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("vector_store_id")
            @ExcludeMissing
            vectorStoreId: JsonField<String> = JsonMissing.of(),
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
            apiBase,
            apiKey,
            apiVersion,
            autoRouterConfig,
            autoRouterConfigPath,
            autoRouterDefaultModel,
            autoRouterEmbeddingModel,
            awsAccessKeyId,
            awsBedrockRuntimeEndpoint,
            awsRegionName,
            awsSecretAccessKey,
            budgetDuration,
            cacheCreationInputAudioTokenCost,
            cacheCreationInputTokenCost,
            cacheCreationInputTokenCostAbove1hr,
            cacheCreationInputTokenCostAbove200kTokens,
            cacheReadInputAudioTokenCost,
            cacheReadInputTokenCost,
            cacheReadInputTokenCostAbove200kTokens,
            cacheReadInputTokenCostFlex,
            cacheReadInputTokenCostPriority,
            citationCostPerToken,
            configurableClientsideAuthParams,
            customLlmProvider,
            gcsBucketName,
            inputCostPerAudioPerSecond,
            inputCostPerAudioPerSecondAbove128kTokens,
            inputCostPerAudioToken,
            inputCostPerCharacter,
            inputCostPerCharacterAbove128kTokens,
            inputCostPerImage,
            inputCostPerImageAbove128kTokens,
            inputCostPerPixel,
            inputCostPerQuery,
            inputCostPerSecond,
            inputCostPerToken,
            inputCostPerTokenAbove128kTokens,
            inputCostPerTokenAbove200kTokens,
            inputCostPerTokenBatches,
            inputCostPerTokenCacheHit,
            inputCostPerTokenFlex,
            inputCostPerTokenPriority,
            inputCostPerVideoPerSecond,
            inputCostPerVideoPerSecondAbove128kTokens,
            inputCostPerVideoPerSecondAbove15sInterval,
            inputCostPerVideoPerSecondAbove8sInterval,
            litellmCredentialName,
            litellmTraceId,
            maxBudget,
            maxFileSizeMb,
            maxRetries,
            mergeReasoningContentInChoices,
            milvusTextField,
            mockResponse,
            model,
            modelInfo,
            organization,
            outputCostPerAudioPerSecond,
            outputCostPerAudioToken,
            outputCostPerCharacter,
            outputCostPerCharacterAbove128kTokens,
            outputCostPerImage,
            outputCostPerImageToken,
            outputCostPerPixel,
            outputCostPerReasoningToken,
            outputCostPerSecond,
            outputCostPerToken,
            outputCostPerTokenAbove128kTokens,
            outputCostPerTokenAbove200kTokens,
            outputCostPerTokenBatches,
            outputCostPerTokenFlex,
            outputCostPerTokenPriority,
            outputCostPerVideoPerSecond,
            regionName,
            rpm,
            s3BucketName,
            s3EncryptionKeyId,
            searchContextCostPerQuery,
            streamTimeout,
            tieredPricing,
            timeout,
            tpm,
            useInPassThrough,
            useLitellmProxy,
            vectorStoreId,
            vertexCredentials,
            vertexLocation,
            vertexProject,
            watsonxRegionName,
            mutableMapOf(),
        )

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
        fun autoRouterConfig(): String? = autoRouterConfig.getNullable("auto_router_config")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun autoRouterConfigPath(): String? =
            autoRouterConfigPath.getNullable("auto_router_config_path")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun autoRouterDefaultModel(): String? =
            autoRouterDefaultModel.getNullable("auto_router_default_model")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun autoRouterEmbeddingModel(): String? =
            autoRouterEmbeddingModel.getNullable("auto_router_embedding_model")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun awsAccessKeyId(): String? = awsAccessKeyId.getNullable("aws_access_key_id")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun awsBedrockRuntimeEndpoint(): String? =
            awsBedrockRuntimeEndpoint.getNullable("aws_bedrock_runtime_endpoint")

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
        fun cacheCreationInputAudioTokenCost(): Double? =
            cacheCreationInputAudioTokenCost.getNullable("cache_creation_input_audio_token_cost")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cacheCreationInputTokenCost(): Double? =
            cacheCreationInputTokenCost.getNullable("cache_creation_input_token_cost")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cacheCreationInputTokenCostAbove1hr(): Double? =
            cacheCreationInputTokenCostAbove1hr.getNullable(
                "cache_creation_input_token_cost_above_1hr"
            )

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cacheCreationInputTokenCostAbove200kTokens(): Double? =
            cacheCreationInputTokenCostAbove200kTokens.getNullable(
                "cache_creation_input_token_cost_above_200k_tokens"
            )

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cacheReadInputAudioTokenCost(): Double? =
            cacheReadInputAudioTokenCost.getNullable("cache_read_input_audio_token_cost")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cacheReadInputTokenCost(): Double? =
            cacheReadInputTokenCost.getNullable("cache_read_input_token_cost")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cacheReadInputTokenCostAbove200kTokens(): Double? =
            cacheReadInputTokenCostAbove200kTokens.getNullable(
                "cache_read_input_token_cost_above_200k_tokens"
            )

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cacheReadInputTokenCostFlex(): Double? =
            cacheReadInputTokenCostFlex.getNullable("cache_read_input_token_cost_flex")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cacheReadInputTokenCostPriority(): Double? =
            cacheReadInputTokenCostPriority.getNullable("cache_read_input_token_cost_priority")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun citationCostPerToken(): Double? =
            citationCostPerToken.getNullable("citation_cost_per_token")

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
        fun gcsBucketName(): String? = gcsBucketName.getNullable("gcs_bucket_name")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inputCostPerAudioPerSecond(): Double? =
            inputCostPerAudioPerSecond.getNullable("input_cost_per_audio_per_second")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inputCostPerAudioPerSecondAbove128kTokens(): Double? =
            inputCostPerAudioPerSecondAbove128kTokens.getNullable(
                "input_cost_per_audio_per_second_above_128k_tokens"
            )

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inputCostPerAudioToken(): Double? =
            inputCostPerAudioToken.getNullable("input_cost_per_audio_token")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inputCostPerCharacter(): Double? =
            inputCostPerCharacter.getNullable("input_cost_per_character")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inputCostPerCharacterAbove128kTokens(): Double? =
            inputCostPerCharacterAbove128kTokens.getNullable(
                "input_cost_per_character_above_128k_tokens"
            )

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inputCostPerImage(): Double? = inputCostPerImage.getNullable("input_cost_per_image")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inputCostPerImageAbove128kTokens(): Double? =
            inputCostPerImageAbove128kTokens.getNullable("input_cost_per_image_above_128k_tokens")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inputCostPerPixel(): Double? = inputCostPerPixel.getNullable("input_cost_per_pixel")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inputCostPerQuery(): Double? = inputCostPerQuery.getNullable("input_cost_per_query")

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
        fun inputCostPerTokenAbove128kTokens(): Double? =
            inputCostPerTokenAbove128kTokens.getNullable("input_cost_per_token_above_128k_tokens")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inputCostPerTokenAbove200kTokens(): Double? =
            inputCostPerTokenAbove200kTokens.getNullable("input_cost_per_token_above_200k_tokens")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inputCostPerTokenBatches(): Double? =
            inputCostPerTokenBatches.getNullable("input_cost_per_token_batches")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inputCostPerTokenCacheHit(): Double? =
            inputCostPerTokenCacheHit.getNullable("input_cost_per_token_cache_hit")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inputCostPerTokenFlex(): Double? =
            inputCostPerTokenFlex.getNullable("input_cost_per_token_flex")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inputCostPerTokenPriority(): Double? =
            inputCostPerTokenPriority.getNullable("input_cost_per_token_priority")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inputCostPerVideoPerSecond(): Double? =
            inputCostPerVideoPerSecond.getNullable("input_cost_per_video_per_second")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inputCostPerVideoPerSecondAbove128kTokens(): Double? =
            inputCostPerVideoPerSecondAbove128kTokens.getNullable(
                "input_cost_per_video_per_second_above_128k_tokens"
            )

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inputCostPerVideoPerSecondAbove15sInterval(): Double? =
            inputCostPerVideoPerSecondAbove15sInterval.getNullable(
                "input_cost_per_video_per_second_above_15s_interval"
            )

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inputCostPerVideoPerSecondAbove8sInterval(): Double? =
            inputCostPerVideoPerSecondAbove8sInterval.getNullable(
                "input_cost_per_video_per_second_above_8s_interval"
            )

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun litellmCredentialName(): String? =
            litellmCredentialName.getNullable("litellm_credential_name")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun litellmTraceId(): String? = litellmTraceId.getNullable("litellm_trace_id")

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

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun milvusTextField(): String? = milvusTextField.getNullable("milvus_text_field")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mockResponse(): MockResponse? = mockResponse.getNullable("mock_response")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun model(): String? = model.getNullable("model")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun modelInfo(): ModelInfo? = modelInfo.getNullable("model_info")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun organization(): String? = organization.getNullable("organization")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outputCostPerAudioPerSecond(): Double? =
            outputCostPerAudioPerSecond.getNullable("output_cost_per_audio_per_second")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outputCostPerAudioToken(): Double? =
            outputCostPerAudioToken.getNullable("output_cost_per_audio_token")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outputCostPerCharacter(): Double? =
            outputCostPerCharacter.getNullable("output_cost_per_character")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outputCostPerCharacterAbove128kTokens(): Double? =
            outputCostPerCharacterAbove128kTokens.getNullable(
                "output_cost_per_character_above_128k_tokens"
            )

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outputCostPerImage(): Double? = outputCostPerImage.getNullable("output_cost_per_image")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outputCostPerImageToken(): Double? =
            outputCostPerImageToken.getNullable("output_cost_per_image_token")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outputCostPerPixel(): Double? = outputCostPerPixel.getNullable("output_cost_per_pixel")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outputCostPerReasoningToken(): Double? =
            outputCostPerReasoningToken.getNullable("output_cost_per_reasoning_token")

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
        fun outputCostPerTokenAbove128kTokens(): Double? =
            outputCostPerTokenAbove128kTokens.getNullable("output_cost_per_token_above_128k_tokens")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outputCostPerTokenAbove200kTokens(): Double? =
            outputCostPerTokenAbove200kTokens.getNullable("output_cost_per_token_above_200k_tokens")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outputCostPerTokenBatches(): Double? =
            outputCostPerTokenBatches.getNullable("output_cost_per_token_batches")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outputCostPerTokenFlex(): Double? =
            outputCostPerTokenFlex.getNullable("output_cost_per_token_flex")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outputCostPerTokenPriority(): Double? =
            outputCostPerTokenPriority.getNullable("output_cost_per_token_priority")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outputCostPerVideoPerSecond(): Double? =
            outputCostPerVideoPerSecond.getNullable("output_cost_per_video_per_second")

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
        fun s3BucketName(): String? = s3BucketName.getNullable("s3_bucket_name")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun s3EncryptionKeyId(): String? = s3EncryptionKeyId.getNullable("s3_encryption_key_id")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun searchContextCostPerQuery(): SearchContextCostPerQuery? =
            searchContextCostPerQuery.getNullable("search_context_cost_per_query")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun streamTimeout(): StreamTimeout? = streamTimeout.getNullable("stream_timeout")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tieredPricing(): List<TieredPricing>? = tieredPricing.getNullable("tiered_pricing")

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
        fun useLitellmProxy(): Boolean? = useLitellmProxy.getNullable("use_litellm_proxy")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun vectorStoreId(): String? = vectorStoreId.getNullable("vector_store_id")

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
         * Returns the raw JSON value of [autoRouterConfig].
         *
         * Unlike [autoRouterConfig], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("auto_router_config")
        @ExcludeMissing
        fun _autoRouterConfig(): JsonField<String> = autoRouterConfig

        /**
         * Returns the raw JSON value of [autoRouterConfigPath].
         *
         * Unlike [autoRouterConfigPath], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("auto_router_config_path")
        @ExcludeMissing
        fun _autoRouterConfigPath(): JsonField<String> = autoRouterConfigPath

        /**
         * Returns the raw JSON value of [autoRouterDefaultModel].
         *
         * Unlike [autoRouterDefaultModel], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("auto_router_default_model")
        @ExcludeMissing
        fun _autoRouterDefaultModel(): JsonField<String> = autoRouterDefaultModel

        /**
         * Returns the raw JSON value of [autoRouterEmbeddingModel].
         *
         * Unlike [autoRouterEmbeddingModel], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("auto_router_embedding_model")
        @ExcludeMissing
        fun _autoRouterEmbeddingModel(): JsonField<String> = autoRouterEmbeddingModel

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
         * Returns the raw JSON value of [awsBedrockRuntimeEndpoint].
         *
         * Unlike [awsBedrockRuntimeEndpoint], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("aws_bedrock_runtime_endpoint")
        @ExcludeMissing
        fun _awsBedrockRuntimeEndpoint(): JsonField<String> = awsBedrockRuntimeEndpoint

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
         * Returns the raw JSON value of [cacheCreationInputAudioTokenCost].
         *
         * Unlike [cacheCreationInputAudioTokenCost], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("cache_creation_input_audio_token_cost")
        @ExcludeMissing
        fun _cacheCreationInputAudioTokenCost(): JsonField<Double> =
            cacheCreationInputAudioTokenCost

        /**
         * Returns the raw JSON value of [cacheCreationInputTokenCost].
         *
         * Unlike [cacheCreationInputTokenCost], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("cache_creation_input_token_cost")
        @ExcludeMissing
        fun _cacheCreationInputTokenCost(): JsonField<Double> = cacheCreationInputTokenCost

        /**
         * Returns the raw JSON value of [cacheCreationInputTokenCostAbove1hr].
         *
         * Unlike [cacheCreationInputTokenCostAbove1hr], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("cache_creation_input_token_cost_above_1hr")
        @ExcludeMissing
        fun _cacheCreationInputTokenCostAbove1hr(): JsonField<Double> =
            cacheCreationInputTokenCostAbove1hr

        /**
         * Returns the raw JSON value of [cacheCreationInputTokenCostAbove200kTokens].
         *
         * Unlike [cacheCreationInputTokenCostAbove200kTokens], this method doesn't throw if the
         * JSON field has an unexpected type.
         */
        @JsonProperty("cache_creation_input_token_cost_above_200k_tokens")
        @ExcludeMissing
        fun _cacheCreationInputTokenCostAbove200kTokens(): JsonField<Double> =
            cacheCreationInputTokenCostAbove200kTokens

        /**
         * Returns the raw JSON value of [cacheReadInputAudioTokenCost].
         *
         * Unlike [cacheReadInputAudioTokenCost], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("cache_read_input_audio_token_cost")
        @ExcludeMissing
        fun _cacheReadInputAudioTokenCost(): JsonField<Double> = cacheReadInputAudioTokenCost

        /**
         * Returns the raw JSON value of [cacheReadInputTokenCost].
         *
         * Unlike [cacheReadInputTokenCost], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("cache_read_input_token_cost")
        @ExcludeMissing
        fun _cacheReadInputTokenCost(): JsonField<Double> = cacheReadInputTokenCost

        /**
         * Returns the raw JSON value of [cacheReadInputTokenCostAbove200kTokens].
         *
         * Unlike [cacheReadInputTokenCostAbove200kTokens], this method doesn't throw if the JSON
         * field has an unexpected type.
         */
        @JsonProperty("cache_read_input_token_cost_above_200k_tokens")
        @ExcludeMissing
        fun _cacheReadInputTokenCostAbove200kTokens(): JsonField<Double> =
            cacheReadInputTokenCostAbove200kTokens

        /**
         * Returns the raw JSON value of [cacheReadInputTokenCostFlex].
         *
         * Unlike [cacheReadInputTokenCostFlex], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("cache_read_input_token_cost_flex")
        @ExcludeMissing
        fun _cacheReadInputTokenCostFlex(): JsonField<Double> = cacheReadInputTokenCostFlex

        /**
         * Returns the raw JSON value of [cacheReadInputTokenCostPriority].
         *
         * Unlike [cacheReadInputTokenCostPriority], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("cache_read_input_token_cost_priority")
        @ExcludeMissing
        fun _cacheReadInputTokenCostPriority(): JsonField<Double> = cacheReadInputTokenCostPriority

        /**
         * Returns the raw JSON value of [citationCostPerToken].
         *
         * Unlike [citationCostPerToken], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("citation_cost_per_token")
        @ExcludeMissing
        fun _citationCostPerToken(): JsonField<Double> = citationCostPerToken

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
         * Returns the raw JSON value of [gcsBucketName].
         *
         * Unlike [gcsBucketName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("gcs_bucket_name")
        @ExcludeMissing
        fun _gcsBucketName(): JsonField<String> = gcsBucketName

        /**
         * Returns the raw JSON value of [inputCostPerAudioPerSecond].
         *
         * Unlike [inputCostPerAudioPerSecond], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("input_cost_per_audio_per_second")
        @ExcludeMissing
        fun _inputCostPerAudioPerSecond(): JsonField<Double> = inputCostPerAudioPerSecond

        /**
         * Returns the raw JSON value of [inputCostPerAudioPerSecondAbove128kTokens].
         *
         * Unlike [inputCostPerAudioPerSecondAbove128kTokens], this method doesn't throw if the JSON
         * field has an unexpected type.
         */
        @JsonProperty("input_cost_per_audio_per_second_above_128k_tokens")
        @ExcludeMissing
        fun _inputCostPerAudioPerSecondAbove128kTokens(): JsonField<Double> =
            inputCostPerAudioPerSecondAbove128kTokens

        /**
         * Returns the raw JSON value of [inputCostPerAudioToken].
         *
         * Unlike [inputCostPerAudioToken], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("input_cost_per_audio_token")
        @ExcludeMissing
        fun _inputCostPerAudioToken(): JsonField<Double> = inputCostPerAudioToken

        /**
         * Returns the raw JSON value of [inputCostPerCharacter].
         *
         * Unlike [inputCostPerCharacter], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("input_cost_per_character")
        @ExcludeMissing
        fun _inputCostPerCharacter(): JsonField<Double> = inputCostPerCharacter

        /**
         * Returns the raw JSON value of [inputCostPerCharacterAbove128kTokens].
         *
         * Unlike [inputCostPerCharacterAbove128kTokens], this method doesn't throw if the JSON
         * field has an unexpected type.
         */
        @JsonProperty("input_cost_per_character_above_128k_tokens")
        @ExcludeMissing
        fun _inputCostPerCharacterAbove128kTokens(): JsonField<Double> =
            inputCostPerCharacterAbove128kTokens

        /**
         * Returns the raw JSON value of [inputCostPerImage].
         *
         * Unlike [inputCostPerImage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("input_cost_per_image")
        @ExcludeMissing
        fun _inputCostPerImage(): JsonField<Double> = inputCostPerImage

        /**
         * Returns the raw JSON value of [inputCostPerImageAbove128kTokens].
         *
         * Unlike [inputCostPerImageAbove128kTokens], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("input_cost_per_image_above_128k_tokens")
        @ExcludeMissing
        fun _inputCostPerImageAbove128kTokens(): JsonField<Double> =
            inputCostPerImageAbove128kTokens

        /**
         * Returns the raw JSON value of [inputCostPerPixel].
         *
         * Unlike [inputCostPerPixel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("input_cost_per_pixel")
        @ExcludeMissing
        fun _inputCostPerPixel(): JsonField<Double> = inputCostPerPixel

        /**
         * Returns the raw JSON value of [inputCostPerQuery].
         *
         * Unlike [inputCostPerQuery], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("input_cost_per_query")
        @ExcludeMissing
        fun _inputCostPerQuery(): JsonField<Double> = inputCostPerQuery

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
         * Returns the raw JSON value of [inputCostPerTokenAbove128kTokens].
         *
         * Unlike [inputCostPerTokenAbove128kTokens], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("input_cost_per_token_above_128k_tokens")
        @ExcludeMissing
        fun _inputCostPerTokenAbove128kTokens(): JsonField<Double> =
            inputCostPerTokenAbove128kTokens

        /**
         * Returns the raw JSON value of [inputCostPerTokenAbove200kTokens].
         *
         * Unlike [inputCostPerTokenAbove200kTokens], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("input_cost_per_token_above_200k_tokens")
        @ExcludeMissing
        fun _inputCostPerTokenAbove200kTokens(): JsonField<Double> =
            inputCostPerTokenAbove200kTokens

        /**
         * Returns the raw JSON value of [inputCostPerTokenBatches].
         *
         * Unlike [inputCostPerTokenBatches], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("input_cost_per_token_batches")
        @ExcludeMissing
        fun _inputCostPerTokenBatches(): JsonField<Double> = inputCostPerTokenBatches

        /**
         * Returns the raw JSON value of [inputCostPerTokenCacheHit].
         *
         * Unlike [inputCostPerTokenCacheHit], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("input_cost_per_token_cache_hit")
        @ExcludeMissing
        fun _inputCostPerTokenCacheHit(): JsonField<Double> = inputCostPerTokenCacheHit

        /**
         * Returns the raw JSON value of [inputCostPerTokenFlex].
         *
         * Unlike [inputCostPerTokenFlex], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("input_cost_per_token_flex")
        @ExcludeMissing
        fun _inputCostPerTokenFlex(): JsonField<Double> = inputCostPerTokenFlex

        /**
         * Returns the raw JSON value of [inputCostPerTokenPriority].
         *
         * Unlike [inputCostPerTokenPriority], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("input_cost_per_token_priority")
        @ExcludeMissing
        fun _inputCostPerTokenPriority(): JsonField<Double> = inputCostPerTokenPriority

        /**
         * Returns the raw JSON value of [inputCostPerVideoPerSecond].
         *
         * Unlike [inputCostPerVideoPerSecond], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("input_cost_per_video_per_second")
        @ExcludeMissing
        fun _inputCostPerVideoPerSecond(): JsonField<Double> = inputCostPerVideoPerSecond

        /**
         * Returns the raw JSON value of [inputCostPerVideoPerSecondAbove128kTokens].
         *
         * Unlike [inputCostPerVideoPerSecondAbove128kTokens], this method doesn't throw if the JSON
         * field has an unexpected type.
         */
        @JsonProperty("input_cost_per_video_per_second_above_128k_tokens")
        @ExcludeMissing
        fun _inputCostPerVideoPerSecondAbove128kTokens(): JsonField<Double> =
            inputCostPerVideoPerSecondAbove128kTokens

        /**
         * Returns the raw JSON value of [inputCostPerVideoPerSecondAbove15sInterval].
         *
         * Unlike [inputCostPerVideoPerSecondAbove15sInterval], this method doesn't throw if the
         * JSON field has an unexpected type.
         */
        @JsonProperty("input_cost_per_video_per_second_above_15s_interval")
        @ExcludeMissing
        fun _inputCostPerVideoPerSecondAbove15sInterval(): JsonField<Double> =
            inputCostPerVideoPerSecondAbove15sInterval

        /**
         * Returns the raw JSON value of [inputCostPerVideoPerSecondAbove8sInterval].
         *
         * Unlike [inputCostPerVideoPerSecondAbove8sInterval], this method doesn't throw if the JSON
         * field has an unexpected type.
         */
        @JsonProperty("input_cost_per_video_per_second_above_8s_interval")
        @ExcludeMissing
        fun _inputCostPerVideoPerSecondAbove8sInterval(): JsonField<Double> =
            inputCostPerVideoPerSecondAbove8sInterval

        /**
         * Returns the raw JSON value of [litellmCredentialName].
         *
         * Unlike [litellmCredentialName], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("litellm_credential_name")
        @ExcludeMissing
        fun _litellmCredentialName(): JsonField<String> = litellmCredentialName

        /**
         * Returns the raw JSON value of [litellmTraceId].
         *
         * Unlike [litellmTraceId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("litellm_trace_id")
        @ExcludeMissing
        fun _litellmTraceId(): JsonField<String> = litellmTraceId

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
         * Returns the raw JSON value of [milvusTextField].
         *
         * Unlike [milvusTextField], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("milvus_text_field")
        @ExcludeMissing
        fun _milvusTextField(): JsonField<String> = milvusTextField

        /**
         * Returns the raw JSON value of [mockResponse].
         *
         * Unlike [mockResponse], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("mock_response")
        @ExcludeMissing
        fun _mockResponse(): JsonField<MockResponse> = mockResponse

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [modelInfo].
         *
         * Unlike [modelInfo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model_info")
        @ExcludeMissing
        fun _modelInfo(): JsonField<ModelInfo> = modelInfo

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
         * Returns the raw JSON value of [outputCostPerAudioPerSecond].
         *
         * Unlike [outputCostPerAudioPerSecond], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("output_cost_per_audio_per_second")
        @ExcludeMissing
        fun _outputCostPerAudioPerSecond(): JsonField<Double> = outputCostPerAudioPerSecond

        /**
         * Returns the raw JSON value of [outputCostPerAudioToken].
         *
         * Unlike [outputCostPerAudioToken], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("output_cost_per_audio_token")
        @ExcludeMissing
        fun _outputCostPerAudioToken(): JsonField<Double> = outputCostPerAudioToken

        /**
         * Returns the raw JSON value of [outputCostPerCharacter].
         *
         * Unlike [outputCostPerCharacter], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("output_cost_per_character")
        @ExcludeMissing
        fun _outputCostPerCharacter(): JsonField<Double> = outputCostPerCharacter

        /**
         * Returns the raw JSON value of [outputCostPerCharacterAbove128kTokens].
         *
         * Unlike [outputCostPerCharacterAbove128kTokens], this method doesn't throw if the JSON
         * field has an unexpected type.
         */
        @JsonProperty("output_cost_per_character_above_128k_tokens")
        @ExcludeMissing
        fun _outputCostPerCharacterAbove128kTokens(): JsonField<Double> =
            outputCostPerCharacterAbove128kTokens

        /**
         * Returns the raw JSON value of [outputCostPerImage].
         *
         * Unlike [outputCostPerImage], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("output_cost_per_image")
        @ExcludeMissing
        fun _outputCostPerImage(): JsonField<Double> = outputCostPerImage

        /**
         * Returns the raw JSON value of [outputCostPerImageToken].
         *
         * Unlike [outputCostPerImageToken], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("output_cost_per_image_token")
        @ExcludeMissing
        fun _outputCostPerImageToken(): JsonField<Double> = outputCostPerImageToken

        /**
         * Returns the raw JSON value of [outputCostPerPixel].
         *
         * Unlike [outputCostPerPixel], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("output_cost_per_pixel")
        @ExcludeMissing
        fun _outputCostPerPixel(): JsonField<Double> = outputCostPerPixel

        /**
         * Returns the raw JSON value of [outputCostPerReasoningToken].
         *
         * Unlike [outputCostPerReasoningToken], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("output_cost_per_reasoning_token")
        @ExcludeMissing
        fun _outputCostPerReasoningToken(): JsonField<Double> = outputCostPerReasoningToken

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
         * Returns the raw JSON value of [outputCostPerTokenAbove128kTokens].
         *
         * Unlike [outputCostPerTokenAbove128kTokens], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("output_cost_per_token_above_128k_tokens")
        @ExcludeMissing
        fun _outputCostPerTokenAbove128kTokens(): JsonField<Double> =
            outputCostPerTokenAbove128kTokens

        /**
         * Returns the raw JSON value of [outputCostPerTokenAbove200kTokens].
         *
         * Unlike [outputCostPerTokenAbove200kTokens], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("output_cost_per_token_above_200k_tokens")
        @ExcludeMissing
        fun _outputCostPerTokenAbove200kTokens(): JsonField<Double> =
            outputCostPerTokenAbove200kTokens

        /**
         * Returns the raw JSON value of [outputCostPerTokenBatches].
         *
         * Unlike [outputCostPerTokenBatches], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("output_cost_per_token_batches")
        @ExcludeMissing
        fun _outputCostPerTokenBatches(): JsonField<Double> = outputCostPerTokenBatches

        /**
         * Returns the raw JSON value of [outputCostPerTokenFlex].
         *
         * Unlike [outputCostPerTokenFlex], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("output_cost_per_token_flex")
        @ExcludeMissing
        fun _outputCostPerTokenFlex(): JsonField<Double> = outputCostPerTokenFlex

        /**
         * Returns the raw JSON value of [outputCostPerTokenPriority].
         *
         * Unlike [outputCostPerTokenPriority], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("output_cost_per_token_priority")
        @ExcludeMissing
        fun _outputCostPerTokenPriority(): JsonField<Double> = outputCostPerTokenPriority

        /**
         * Returns the raw JSON value of [outputCostPerVideoPerSecond].
         *
         * Unlike [outputCostPerVideoPerSecond], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("output_cost_per_video_per_second")
        @ExcludeMissing
        fun _outputCostPerVideoPerSecond(): JsonField<Double> = outputCostPerVideoPerSecond

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
         * Returns the raw JSON value of [s3BucketName].
         *
         * Unlike [s3BucketName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("s3_bucket_name")
        @ExcludeMissing
        fun _s3BucketName(): JsonField<String> = s3BucketName

        /**
         * Returns the raw JSON value of [s3EncryptionKeyId].
         *
         * Unlike [s3EncryptionKeyId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("s3_encryption_key_id")
        @ExcludeMissing
        fun _s3EncryptionKeyId(): JsonField<String> = s3EncryptionKeyId

        /**
         * Returns the raw JSON value of [searchContextCostPerQuery].
         *
         * Unlike [searchContextCostPerQuery], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("search_context_cost_per_query")
        @ExcludeMissing
        fun _searchContextCostPerQuery(): JsonField<SearchContextCostPerQuery> =
            searchContextCostPerQuery

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
         * Returns the raw JSON value of [tieredPricing].
         *
         * Unlike [tieredPricing], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tiered_pricing")
        @ExcludeMissing
        fun _tieredPricing(): JsonField<List<TieredPricing>> = tieredPricing

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
         * Returns the raw JSON value of [useLitellmProxy].
         *
         * Unlike [useLitellmProxy], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("use_litellm_proxy")
        @ExcludeMissing
        fun _useLitellmProxy(): JsonField<Boolean> = useLitellmProxy

        /**
         * Returns the raw JSON value of [vectorStoreId].
         *
         * Unlike [vectorStoreId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("vector_store_id")
        @ExcludeMissing
        fun _vectorStoreId(): JsonField<String> = vectorStoreId

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

            /** Returns a mutable builder for constructing an instance of [LitellmParams]. */
            fun builder() = Builder()
        }

        /** A builder for [LitellmParams]. */
        class Builder internal constructor() {

            private var apiBase: JsonField<String> = JsonMissing.of()
            private var apiKey: JsonField<String> = JsonMissing.of()
            private var apiVersion: JsonField<String> = JsonMissing.of()
            private var autoRouterConfig: JsonField<String> = JsonMissing.of()
            private var autoRouterConfigPath: JsonField<String> = JsonMissing.of()
            private var autoRouterDefaultModel: JsonField<String> = JsonMissing.of()
            private var autoRouterEmbeddingModel: JsonField<String> = JsonMissing.of()
            private var awsAccessKeyId: JsonField<String> = JsonMissing.of()
            private var awsBedrockRuntimeEndpoint: JsonField<String> = JsonMissing.of()
            private var awsRegionName: JsonField<String> = JsonMissing.of()
            private var awsSecretAccessKey: JsonField<String> = JsonMissing.of()
            private var budgetDuration: JsonField<String> = JsonMissing.of()
            private var cacheCreationInputAudioTokenCost: JsonField<Double> = JsonMissing.of()
            private var cacheCreationInputTokenCost: JsonField<Double> = JsonMissing.of()
            private var cacheCreationInputTokenCostAbove1hr: JsonField<Double> = JsonMissing.of()
            private var cacheCreationInputTokenCostAbove200kTokens: JsonField<Double> =
                JsonMissing.of()
            private var cacheReadInputAudioTokenCost: JsonField<Double> = JsonMissing.of()
            private var cacheReadInputTokenCost: JsonField<Double> = JsonMissing.of()
            private var cacheReadInputTokenCostAbove200kTokens: JsonField<Double> = JsonMissing.of()
            private var cacheReadInputTokenCostFlex: JsonField<Double> = JsonMissing.of()
            private var cacheReadInputTokenCostPriority: JsonField<Double> = JsonMissing.of()
            private var citationCostPerToken: JsonField<Double> = JsonMissing.of()
            private var configurableClientsideAuthParams:
                JsonField<MutableList<ConfigurableClientsideAuthParam>>? =
                null
            private var customLlmProvider: JsonField<String> = JsonMissing.of()
            private var gcsBucketName: JsonField<String> = JsonMissing.of()
            private var inputCostPerAudioPerSecond: JsonField<Double> = JsonMissing.of()
            private var inputCostPerAudioPerSecondAbove128kTokens: JsonField<Double> =
                JsonMissing.of()
            private var inputCostPerAudioToken: JsonField<Double> = JsonMissing.of()
            private var inputCostPerCharacter: JsonField<Double> = JsonMissing.of()
            private var inputCostPerCharacterAbove128kTokens: JsonField<Double> = JsonMissing.of()
            private var inputCostPerImage: JsonField<Double> = JsonMissing.of()
            private var inputCostPerImageAbove128kTokens: JsonField<Double> = JsonMissing.of()
            private var inputCostPerPixel: JsonField<Double> = JsonMissing.of()
            private var inputCostPerQuery: JsonField<Double> = JsonMissing.of()
            private var inputCostPerSecond: JsonField<Double> = JsonMissing.of()
            private var inputCostPerToken: JsonField<Double> = JsonMissing.of()
            private var inputCostPerTokenAbove128kTokens: JsonField<Double> = JsonMissing.of()
            private var inputCostPerTokenAbove200kTokens: JsonField<Double> = JsonMissing.of()
            private var inputCostPerTokenBatches: JsonField<Double> = JsonMissing.of()
            private var inputCostPerTokenCacheHit: JsonField<Double> = JsonMissing.of()
            private var inputCostPerTokenFlex: JsonField<Double> = JsonMissing.of()
            private var inputCostPerTokenPriority: JsonField<Double> = JsonMissing.of()
            private var inputCostPerVideoPerSecond: JsonField<Double> = JsonMissing.of()
            private var inputCostPerVideoPerSecondAbove128kTokens: JsonField<Double> =
                JsonMissing.of()
            private var inputCostPerVideoPerSecondAbove15sInterval: JsonField<Double> =
                JsonMissing.of()
            private var inputCostPerVideoPerSecondAbove8sInterval: JsonField<Double> =
                JsonMissing.of()
            private var litellmCredentialName: JsonField<String> = JsonMissing.of()
            private var litellmTraceId: JsonField<String> = JsonMissing.of()
            private var maxBudget: JsonField<Double> = JsonMissing.of()
            private var maxFileSizeMb: JsonField<Double> = JsonMissing.of()
            private var maxRetries: JsonField<Long> = JsonMissing.of()
            private var mergeReasoningContentInChoices: JsonField<Boolean> = JsonMissing.of()
            private var milvusTextField: JsonField<String> = JsonMissing.of()
            private var mockResponse: JsonField<MockResponse> = JsonMissing.of()
            private var model: JsonField<String> = JsonMissing.of()
            private var modelInfo: JsonField<ModelInfo> = JsonMissing.of()
            private var organization: JsonField<String> = JsonMissing.of()
            private var outputCostPerAudioPerSecond: JsonField<Double> = JsonMissing.of()
            private var outputCostPerAudioToken: JsonField<Double> = JsonMissing.of()
            private var outputCostPerCharacter: JsonField<Double> = JsonMissing.of()
            private var outputCostPerCharacterAbove128kTokens: JsonField<Double> = JsonMissing.of()
            private var outputCostPerImage: JsonField<Double> = JsonMissing.of()
            private var outputCostPerImageToken: JsonField<Double> = JsonMissing.of()
            private var outputCostPerPixel: JsonField<Double> = JsonMissing.of()
            private var outputCostPerReasoningToken: JsonField<Double> = JsonMissing.of()
            private var outputCostPerSecond: JsonField<Double> = JsonMissing.of()
            private var outputCostPerToken: JsonField<Double> = JsonMissing.of()
            private var outputCostPerTokenAbove128kTokens: JsonField<Double> = JsonMissing.of()
            private var outputCostPerTokenAbove200kTokens: JsonField<Double> = JsonMissing.of()
            private var outputCostPerTokenBatches: JsonField<Double> = JsonMissing.of()
            private var outputCostPerTokenFlex: JsonField<Double> = JsonMissing.of()
            private var outputCostPerTokenPriority: JsonField<Double> = JsonMissing.of()
            private var outputCostPerVideoPerSecond: JsonField<Double> = JsonMissing.of()
            private var regionName: JsonField<String> = JsonMissing.of()
            private var rpm: JsonField<Long> = JsonMissing.of()
            private var s3BucketName: JsonField<String> = JsonMissing.of()
            private var s3EncryptionKeyId: JsonField<String> = JsonMissing.of()
            private var searchContextCostPerQuery: JsonField<SearchContextCostPerQuery> =
                JsonMissing.of()
            private var streamTimeout: JsonField<StreamTimeout> = JsonMissing.of()
            private var tieredPricing: JsonField<MutableList<TieredPricing>>? = null
            private var timeout: JsonField<Timeout> = JsonMissing.of()
            private var tpm: JsonField<Long> = JsonMissing.of()
            private var useInPassThrough: JsonField<Boolean> = JsonMissing.of()
            private var useLitellmProxy: JsonField<Boolean> = JsonMissing.of()
            private var vectorStoreId: JsonField<String> = JsonMissing.of()
            private var vertexCredentials: JsonField<VertexCredentials> = JsonMissing.of()
            private var vertexLocation: JsonField<String> = JsonMissing.of()
            private var vertexProject: JsonField<String> = JsonMissing.of()
            private var watsonxRegionName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(litellmParams: LitellmParams) = apply {
                apiBase = litellmParams.apiBase
                apiKey = litellmParams.apiKey
                apiVersion = litellmParams.apiVersion
                autoRouterConfig = litellmParams.autoRouterConfig
                autoRouterConfigPath = litellmParams.autoRouterConfigPath
                autoRouterDefaultModel = litellmParams.autoRouterDefaultModel
                autoRouterEmbeddingModel = litellmParams.autoRouterEmbeddingModel
                awsAccessKeyId = litellmParams.awsAccessKeyId
                awsBedrockRuntimeEndpoint = litellmParams.awsBedrockRuntimeEndpoint
                awsRegionName = litellmParams.awsRegionName
                awsSecretAccessKey = litellmParams.awsSecretAccessKey
                budgetDuration = litellmParams.budgetDuration
                cacheCreationInputAudioTokenCost = litellmParams.cacheCreationInputAudioTokenCost
                cacheCreationInputTokenCost = litellmParams.cacheCreationInputTokenCost
                cacheCreationInputTokenCostAbove1hr =
                    litellmParams.cacheCreationInputTokenCostAbove1hr
                cacheCreationInputTokenCostAbove200kTokens =
                    litellmParams.cacheCreationInputTokenCostAbove200kTokens
                cacheReadInputAudioTokenCost = litellmParams.cacheReadInputAudioTokenCost
                cacheReadInputTokenCost = litellmParams.cacheReadInputTokenCost
                cacheReadInputTokenCostAbove200kTokens =
                    litellmParams.cacheReadInputTokenCostAbove200kTokens
                cacheReadInputTokenCostFlex = litellmParams.cacheReadInputTokenCostFlex
                cacheReadInputTokenCostPriority = litellmParams.cacheReadInputTokenCostPriority
                citationCostPerToken = litellmParams.citationCostPerToken
                configurableClientsideAuthParams =
                    litellmParams.configurableClientsideAuthParams.map { it.toMutableList() }
                customLlmProvider = litellmParams.customLlmProvider
                gcsBucketName = litellmParams.gcsBucketName
                inputCostPerAudioPerSecond = litellmParams.inputCostPerAudioPerSecond
                inputCostPerAudioPerSecondAbove128kTokens =
                    litellmParams.inputCostPerAudioPerSecondAbove128kTokens
                inputCostPerAudioToken = litellmParams.inputCostPerAudioToken
                inputCostPerCharacter = litellmParams.inputCostPerCharacter
                inputCostPerCharacterAbove128kTokens =
                    litellmParams.inputCostPerCharacterAbove128kTokens
                inputCostPerImage = litellmParams.inputCostPerImage
                inputCostPerImageAbove128kTokens = litellmParams.inputCostPerImageAbove128kTokens
                inputCostPerPixel = litellmParams.inputCostPerPixel
                inputCostPerQuery = litellmParams.inputCostPerQuery
                inputCostPerSecond = litellmParams.inputCostPerSecond
                inputCostPerToken = litellmParams.inputCostPerToken
                inputCostPerTokenAbove128kTokens = litellmParams.inputCostPerTokenAbove128kTokens
                inputCostPerTokenAbove200kTokens = litellmParams.inputCostPerTokenAbove200kTokens
                inputCostPerTokenBatches = litellmParams.inputCostPerTokenBatches
                inputCostPerTokenCacheHit = litellmParams.inputCostPerTokenCacheHit
                inputCostPerTokenFlex = litellmParams.inputCostPerTokenFlex
                inputCostPerTokenPriority = litellmParams.inputCostPerTokenPriority
                inputCostPerVideoPerSecond = litellmParams.inputCostPerVideoPerSecond
                inputCostPerVideoPerSecondAbove128kTokens =
                    litellmParams.inputCostPerVideoPerSecondAbove128kTokens
                inputCostPerVideoPerSecondAbove15sInterval =
                    litellmParams.inputCostPerVideoPerSecondAbove15sInterval
                inputCostPerVideoPerSecondAbove8sInterval =
                    litellmParams.inputCostPerVideoPerSecondAbove8sInterval
                litellmCredentialName = litellmParams.litellmCredentialName
                litellmTraceId = litellmParams.litellmTraceId
                maxBudget = litellmParams.maxBudget
                maxFileSizeMb = litellmParams.maxFileSizeMb
                maxRetries = litellmParams.maxRetries
                mergeReasoningContentInChoices = litellmParams.mergeReasoningContentInChoices
                milvusTextField = litellmParams.milvusTextField
                mockResponse = litellmParams.mockResponse
                model = litellmParams.model
                modelInfo = litellmParams.modelInfo
                organization = litellmParams.organization
                outputCostPerAudioPerSecond = litellmParams.outputCostPerAudioPerSecond
                outputCostPerAudioToken = litellmParams.outputCostPerAudioToken
                outputCostPerCharacter = litellmParams.outputCostPerCharacter
                outputCostPerCharacterAbove128kTokens =
                    litellmParams.outputCostPerCharacterAbove128kTokens
                outputCostPerImage = litellmParams.outputCostPerImage
                outputCostPerImageToken = litellmParams.outputCostPerImageToken
                outputCostPerPixel = litellmParams.outputCostPerPixel
                outputCostPerReasoningToken = litellmParams.outputCostPerReasoningToken
                outputCostPerSecond = litellmParams.outputCostPerSecond
                outputCostPerToken = litellmParams.outputCostPerToken
                outputCostPerTokenAbove128kTokens = litellmParams.outputCostPerTokenAbove128kTokens
                outputCostPerTokenAbove200kTokens = litellmParams.outputCostPerTokenAbove200kTokens
                outputCostPerTokenBatches = litellmParams.outputCostPerTokenBatches
                outputCostPerTokenFlex = litellmParams.outputCostPerTokenFlex
                outputCostPerTokenPriority = litellmParams.outputCostPerTokenPriority
                outputCostPerVideoPerSecond = litellmParams.outputCostPerVideoPerSecond
                regionName = litellmParams.regionName
                rpm = litellmParams.rpm
                s3BucketName = litellmParams.s3BucketName
                s3EncryptionKeyId = litellmParams.s3EncryptionKeyId
                searchContextCostPerQuery = litellmParams.searchContextCostPerQuery
                streamTimeout = litellmParams.streamTimeout
                tieredPricing = litellmParams.tieredPricing.map { it.toMutableList() }
                timeout = litellmParams.timeout
                tpm = litellmParams.tpm
                useInPassThrough = litellmParams.useInPassThrough
                useLitellmProxy = litellmParams.useLitellmProxy
                vectorStoreId = litellmParams.vectorStoreId
                vertexCredentials = litellmParams.vertexCredentials
                vertexLocation = litellmParams.vertexLocation
                vertexProject = litellmParams.vertexProject
                watsonxRegionName = litellmParams.watsonxRegionName
                additionalProperties = litellmParams.additionalProperties.toMutableMap()
            }

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

            fun autoRouterConfig(autoRouterConfig: String?) =
                autoRouterConfig(JsonField.ofNullable(autoRouterConfig))

            /**
             * Sets [Builder.autoRouterConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoRouterConfig] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun autoRouterConfig(autoRouterConfig: JsonField<String>) = apply {
                this.autoRouterConfig = autoRouterConfig
            }

            fun autoRouterConfigPath(autoRouterConfigPath: String?) =
                autoRouterConfigPath(JsonField.ofNullable(autoRouterConfigPath))

            /**
             * Sets [Builder.autoRouterConfigPath] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoRouterConfigPath] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun autoRouterConfigPath(autoRouterConfigPath: JsonField<String>) = apply {
                this.autoRouterConfigPath = autoRouterConfigPath
            }

            fun autoRouterDefaultModel(autoRouterDefaultModel: String?) =
                autoRouterDefaultModel(JsonField.ofNullable(autoRouterDefaultModel))

            /**
             * Sets [Builder.autoRouterDefaultModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoRouterDefaultModel] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun autoRouterDefaultModel(autoRouterDefaultModel: JsonField<String>) = apply {
                this.autoRouterDefaultModel = autoRouterDefaultModel
            }

            fun autoRouterEmbeddingModel(autoRouterEmbeddingModel: String?) =
                autoRouterEmbeddingModel(JsonField.ofNullable(autoRouterEmbeddingModel))

            /**
             * Sets [Builder.autoRouterEmbeddingModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoRouterEmbeddingModel] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun autoRouterEmbeddingModel(autoRouterEmbeddingModel: JsonField<String>) = apply {
                this.autoRouterEmbeddingModel = autoRouterEmbeddingModel
            }

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

            fun awsBedrockRuntimeEndpoint(awsBedrockRuntimeEndpoint: String?) =
                awsBedrockRuntimeEndpoint(JsonField.ofNullable(awsBedrockRuntimeEndpoint))

            /**
             * Sets [Builder.awsBedrockRuntimeEndpoint] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awsBedrockRuntimeEndpoint] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun awsBedrockRuntimeEndpoint(awsBedrockRuntimeEndpoint: JsonField<String>) = apply {
                this.awsBedrockRuntimeEndpoint = awsBedrockRuntimeEndpoint
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

            fun cacheCreationInputAudioTokenCost(cacheCreationInputAudioTokenCost: Double?) =
                cacheCreationInputAudioTokenCost(
                    JsonField.ofNullable(cacheCreationInputAudioTokenCost)
                )

            /**
             * Alias for [Builder.cacheCreationInputAudioTokenCost].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun cacheCreationInputAudioTokenCost(cacheCreationInputAudioTokenCost: Double) =
                cacheCreationInputAudioTokenCost(cacheCreationInputAudioTokenCost as Double?)

            /**
             * Sets [Builder.cacheCreationInputAudioTokenCost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cacheCreationInputAudioTokenCost] with a well-typed
             * [Double] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun cacheCreationInputAudioTokenCost(
                cacheCreationInputAudioTokenCost: JsonField<Double>
            ) = apply { this.cacheCreationInputAudioTokenCost = cacheCreationInputAudioTokenCost }

            fun cacheCreationInputTokenCost(cacheCreationInputTokenCost: Double?) =
                cacheCreationInputTokenCost(JsonField.ofNullable(cacheCreationInputTokenCost))

            /**
             * Alias for [Builder.cacheCreationInputTokenCost].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun cacheCreationInputTokenCost(cacheCreationInputTokenCost: Double) =
                cacheCreationInputTokenCost(cacheCreationInputTokenCost as Double?)

            /**
             * Sets [Builder.cacheCreationInputTokenCost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cacheCreationInputTokenCost] with a well-typed
             * [Double] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun cacheCreationInputTokenCost(cacheCreationInputTokenCost: JsonField<Double>) =
                apply {
                    this.cacheCreationInputTokenCost = cacheCreationInputTokenCost
                }

            fun cacheCreationInputTokenCostAbove1hr(cacheCreationInputTokenCostAbove1hr: Double?) =
                cacheCreationInputTokenCostAbove1hr(
                    JsonField.ofNullable(cacheCreationInputTokenCostAbove1hr)
                )

            /**
             * Alias for [Builder.cacheCreationInputTokenCostAbove1hr].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun cacheCreationInputTokenCostAbove1hr(cacheCreationInputTokenCostAbove1hr: Double) =
                cacheCreationInputTokenCostAbove1hr(cacheCreationInputTokenCostAbove1hr as Double?)

            /**
             * Sets [Builder.cacheCreationInputTokenCostAbove1hr] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cacheCreationInputTokenCostAbove1hr] with a
             * well-typed [Double] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun cacheCreationInputTokenCostAbove1hr(
                cacheCreationInputTokenCostAbove1hr: JsonField<Double>
            ) = apply {
                this.cacheCreationInputTokenCostAbove1hr = cacheCreationInputTokenCostAbove1hr
            }

            fun cacheCreationInputTokenCostAbove200kTokens(
                cacheCreationInputTokenCostAbove200kTokens: Double?
            ) =
                cacheCreationInputTokenCostAbove200kTokens(
                    JsonField.ofNullable(cacheCreationInputTokenCostAbove200kTokens)
                )

            /**
             * Alias for [Builder.cacheCreationInputTokenCostAbove200kTokens].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun cacheCreationInputTokenCostAbove200kTokens(
                cacheCreationInputTokenCostAbove200kTokens: Double
            ) =
                cacheCreationInputTokenCostAbove200kTokens(
                    cacheCreationInputTokenCostAbove200kTokens as Double?
                )

            /**
             * Sets [Builder.cacheCreationInputTokenCostAbove200kTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cacheCreationInputTokenCostAbove200kTokens] with a
             * well-typed [Double] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun cacheCreationInputTokenCostAbove200kTokens(
                cacheCreationInputTokenCostAbove200kTokens: JsonField<Double>
            ) = apply {
                this.cacheCreationInputTokenCostAbove200kTokens =
                    cacheCreationInputTokenCostAbove200kTokens
            }

            fun cacheReadInputAudioTokenCost(cacheReadInputAudioTokenCost: Double?) =
                cacheReadInputAudioTokenCost(JsonField.ofNullable(cacheReadInputAudioTokenCost))

            /**
             * Alias for [Builder.cacheReadInputAudioTokenCost].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun cacheReadInputAudioTokenCost(cacheReadInputAudioTokenCost: Double) =
                cacheReadInputAudioTokenCost(cacheReadInputAudioTokenCost as Double?)

            /**
             * Sets [Builder.cacheReadInputAudioTokenCost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cacheReadInputAudioTokenCost] with a well-typed
             * [Double] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun cacheReadInputAudioTokenCost(cacheReadInputAudioTokenCost: JsonField<Double>) =
                apply {
                    this.cacheReadInputAudioTokenCost = cacheReadInputAudioTokenCost
                }

            fun cacheReadInputTokenCost(cacheReadInputTokenCost: Double?) =
                cacheReadInputTokenCost(JsonField.ofNullable(cacheReadInputTokenCost))

            /**
             * Alias for [Builder.cacheReadInputTokenCost].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun cacheReadInputTokenCost(cacheReadInputTokenCost: Double) =
                cacheReadInputTokenCost(cacheReadInputTokenCost as Double?)

            /**
             * Sets [Builder.cacheReadInputTokenCost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cacheReadInputTokenCost] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun cacheReadInputTokenCost(cacheReadInputTokenCost: JsonField<Double>) = apply {
                this.cacheReadInputTokenCost = cacheReadInputTokenCost
            }

            fun cacheReadInputTokenCostAbove200kTokens(
                cacheReadInputTokenCostAbove200kTokens: Double?
            ) =
                cacheReadInputTokenCostAbove200kTokens(
                    JsonField.ofNullable(cacheReadInputTokenCostAbove200kTokens)
                )

            /**
             * Alias for [Builder.cacheReadInputTokenCostAbove200kTokens].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun cacheReadInputTokenCostAbove200kTokens(
                cacheReadInputTokenCostAbove200kTokens: Double
            ) =
                cacheReadInputTokenCostAbove200kTokens(
                    cacheReadInputTokenCostAbove200kTokens as Double?
                )

            /**
             * Sets [Builder.cacheReadInputTokenCostAbove200kTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cacheReadInputTokenCostAbove200kTokens] with a
             * well-typed [Double] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun cacheReadInputTokenCostAbove200kTokens(
                cacheReadInputTokenCostAbove200kTokens: JsonField<Double>
            ) = apply {
                this.cacheReadInputTokenCostAbove200kTokens = cacheReadInputTokenCostAbove200kTokens
            }

            fun cacheReadInputTokenCostFlex(cacheReadInputTokenCostFlex: Double?) =
                cacheReadInputTokenCostFlex(JsonField.ofNullable(cacheReadInputTokenCostFlex))

            /**
             * Alias for [Builder.cacheReadInputTokenCostFlex].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun cacheReadInputTokenCostFlex(cacheReadInputTokenCostFlex: Double) =
                cacheReadInputTokenCostFlex(cacheReadInputTokenCostFlex as Double?)

            /**
             * Sets [Builder.cacheReadInputTokenCostFlex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cacheReadInputTokenCostFlex] with a well-typed
             * [Double] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun cacheReadInputTokenCostFlex(cacheReadInputTokenCostFlex: JsonField<Double>) =
                apply {
                    this.cacheReadInputTokenCostFlex = cacheReadInputTokenCostFlex
                }

            fun cacheReadInputTokenCostPriority(cacheReadInputTokenCostPriority: Double?) =
                cacheReadInputTokenCostPriority(
                    JsonField.ofNullable(cacheReadInputTokenCostPriority)
                )

            /**
             * Alias for [Builder.cacheReadInputTokenCostPriority].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun cacheReadInputTokenCostPriority(cacheReadInputTokenCostPriority: Double) =
                cacheReadInputTokenCostPriority(cacheReadInputTokenCostPriority as Double?)

            /**
             * Sets [Builder.cacheReadInputTokenCostPriority] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cacheReadInputTokenCostPriority] with a well-typed
             * [Double] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun cacheReadInputTokenCostPriority(
                cacheReadInputTokenCostPriority: JsonField<Double>
            ) = apply { this.cacheReadInputTokenCostPriority = cacheReadInputTokenCostPriority }

            fun citationCostPerToken(citationCostPerToken: Double?) =
                citationCostPerToken(JsonField.ofNullable(citationCostPerToken))

            /**
             * Alias for [Builder.citationCostPerToken].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun citationCostPerToken(citationCostPerToken: Double) =
                citationCostPerToken(citationCostPerToken as Double?)

            /**
             * Sets [Builder.citationCostPerToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.citationCostPerToken] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun citationCostPerToken(citationCostPerToken: JsonField<Double>) = apply {
                this.citationCostPerToken = citationCostPerToken
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
             * `ConfigurableClientsideAuthParam.ofParamsCustomAuthInput(paramsCustomAuthInput)`.
             */
            fun addConfigurableClientsideAuthParam(
                paramsCustomAuthInput:
                    ConfigurableClientsideAuthParam.ConfigurableClientsideParamsCustomAuthInput
            ) =
                addConfigurableClientsideAuthParam(
                    ConfigurableClientsideAuthParam.ofParamsCustomAuthInput(paramsCustomAuthInput)
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

            fun gcsBucketName(gcsBucketName: String?) =
                gcsBucketName(JsonField.ofNullable(gcsBucketName))

            /**
             * Sets [Builder.gcsBucketName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gcsBucketName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gcsBucketName(gcsBucketName: JsonField<String>) = apply {
                this.gcsBucketName = gcsBucketName
            }

            fun inputCostPerAudioPerSecond(inputCostPerAudioPerSecond: Double?) =
                inputCostPerAudioPerSecond(JsonField.ofNullable(inputCostPerAudioPerSecond))

            /**
             * Alias for [Builder.inputCostPerAudioPerSecond].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun inputCostPerAudioPerSecond(inputCostPerAudioPerSecond: Double) =
                inputCostPerAudioPerSecond(inputCostPerAudioPerSecond as Double?)

            /**
             * Sets [Builder.inputCostPerAudioPerSecond] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputCostPerAudioPerSecond] with a well-typed
             * [Double] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun inputCostPerAudioPerSecond(inputCostPerAudioPerSecond: JsonField<Double>) = apply {
                this.inputCostPerAudioPerSecond = inputCostPerAudioPerSecond
            }

            fun inputCostPerAudioPerSecondAbove128kTokens(
                inputCostPerAudioPerSecondAbove128kTokens: Double?
            ) =
                inputCostPerAudioPerSecondAbove128kTokens(
                    JsonField.ofNullable(inputCostPerAudioPerSecondAbove128kTokens)
                )

            /**
             * Alias for [Builder.inputCostPerAudioPerSecondAbove128kTokens].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun inputCostPerAudioPerSecondAbove128kTokens(
                inputCostPerAudioPerSecondAbove128kTokens: Double
            ) =
                inputCostPerAudioPerSecondAbove128kTokens(
                    inputCostPerAudioPerSecondAbove128kTokens as Double?
                )

            /**
             * Sets [Builder.inputCostPerAudioPerSecondAbove128kTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputCostPerAudioPerSecondAbove128kTokens] with a
             * well-typed [Double] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun inputCostPerAudioPerSecondAbove128kTokens(
                inputCostPerAudioPerSecondAbove128kTokens: JsonField<Double>
            ) = apply {
                this.inputCostPerAudioPerSecondAbove128kTokens =
                    inputCostPerAudioPerSecondAbove128kTokens
            }

            fun inputCostPerAudioToken(inputCostPerAudioToken: Double?) =
                inputCostPerAudioToken(JsonField.ofNullable(inputCostPerAudioToken))

            /**
             * Alias for [Builder.inputCostPerAudioToken].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun inputCostPerAudioToken(inputCostPerAudioToken: Double) =
                inputCostPerAudioToken(inputCostPerAudioToken as Double?)

            /**
             * Sets [Builder.inputCostPerAudioToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputCostPerAudioToken] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun inputCostPerAudioToken(inputCostPerAudioToken: JsonField<Double>) = apply {
                this.inputCostPerAudioToken = inputCostPerAudioToken
            }

            fun inputCostPerCharacter(inputCostPerCharacter: Double?) =
                inputCostPerCharacter(JsonField.ofNullable(inputCostPerCharacter))

            /**
             * Alias for [Builder.inputCostPerCharacter].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun inputCostPerCharacter(inputCostPerCharacter: Double) =
                inputCostPerCharacter(inputCostPerCharacter as Double?)

            /**
             * Sets [Builder.inputCostPerCharacter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputCostPerCharacter] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun inputCostPerCharacter(inputCostPerCharacter: JsonField<Double>) = apply {
                this.inputCostPerCharacter = inputCostPerCharacter
            }

            fun inputCostPerCharacterAbove128kTokens(
                inputCostPerCharacterAbove128kTokens: Double?
            ) =
                inputCostPerCharacterAbove128kTokens(
                    JsonField.ofNullable(inputCostPerCharacterAbove128kTokens)
                )

            /**
             * Alias for [Builder.inputCostPerCharacterAbove128kTokens].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun inputCostPerCharacterAbove128kTokens(inputCostPerCharacterAbove128kTokens: Double) =
                inputCostPerCharacterAbove128kTokens(
                    inputCostPerCharacterAbove128kTokens as Double?
                )

            /**
             * Sets [Builder.inputCostPerCharacterAbove128kTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputCostPerCharacterAbove128kTokens] with a
             * well-typed [Double] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun inputCostPerCharacterAbove128kTokens(
                inputCostPerCharacterAbove128kTokens: JsonField<Double>
            ) = apply {
                this.inputCostPerCharacterAbove128kTokens = inputCostPerCharacterAbove128kTokens
            }

            fun inputCostPerImage(inputCostPerImage: Double?) =
                inputCostPerImage(JsonField.ofNullable(inputCostPerImage))

            /**
             * Alias for [Builder.inputCostPerImage].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun inputCostPerImage(inputCostPerImage: Double) =
                inputCostPerImage(inputCostPerImage as Double?)

            /**
             * Sets [Builder.inputCostPerImage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputCostPerImage] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inputCostPerImage(inputCostPerImage: JsonField<Double>) = apply {
                this.inputCostPerImage = inputCostPerImage
            }

            fun inputCostPerImageAbove128kTokens(inputCostPerImageAbove128kTokens: Double?) =
                inputCostPerImageAbove128kTokens(
                    JsonField.ofNullable(inputCostPerImageAbove128kTokens)
                )

            /**
             * Alias for [Builder.inputCostPerImageAbove128kTokens].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun inputCostPerImageAbove128kTokens(inputCostPerImageAbove128kTokens: Double) =
                inputCostPerImageAbove128kTokens(inputCostPerImageAbove128kTokens as Double?)

            /**
             * Sets [Builder.inputCostPerImageAbove128kTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputCostPerImageAbove128kTokens] with a well-typed
             * [Double] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun inputCostPerImageAbove128kTokens(
                inputCostPerImageAbove128kTokens: JsonField<Double>
            ) = apply { this.inputCostPerImageAbove128kTokens = inputCostPerImageAbove128kTokens }

            fun inputCostPerPixel(inputCostPerPixel: Double?) =
                inputCostPerPixel(JsonField.ofNullable(inputCostPerPixel))

            /**
             * Alias for [Builder.inputCostPerPixel].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun inputCostPerPixel(inputCostPerPixel: Double) =
                inputCostPerPixel(inputCostPerPixel as Double?)

            /**
             * Sets [Builder.inputCostPerPixel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputCostPerPixel] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inputCostPerPixel(inputCostPerPixel: JsonField<Double>) = apply {
                this.inputCostPerPixel = inputCostPerPixel
            }

            fun inputCostPerQuery(inputCostPerQuery: Double?) =
                inputCostPerQuery(JsonField.ofNullable(inputCostPerQuery))

            /**
             * Alias for [Builder.inputCostPerQuery].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun inputCostPerQuery(inputCostPerQuery: Double) =
                inputCostPerQuery(inputCostPerQuery as Double?)

            /**
             * Sets [Builder.inputCostPerQuery] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputCostPerQuery] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inputCostPerQuery(inputCostPerQuery: JsonField<Double>) = apply {
                this.inputCostPerQuery = inputCostPerQuery
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

            fun inputCostPerTokenAbove128kTokens(inputCostPerTokenAbove128kTokens: Double?) =
                inputCostPerTokenAbove128kTokens(
                    JsonField.ofNullable(inputCostPerTokenAbove128kTokens)
                )

            /**
             * Alias for [Builder.inputCostPerTokenAbove128kTokens].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun inputCostPerTokenAbove128kTokens(inputCostPerTokenAbove128kTokens: Double) =
                inputCostPerTokenAbove128kTokens(inputCostPerTokenAbove128kTokens as Double?)

            /**
             * Sets [Builder.inputCostPerTokenAbove128kTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputCostPerTokenAbove128kTokens] with a well-typed
             * [Double] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun inputCostPerTokenAbove128kTokens(
                inputCostPerTokenAbove128kTokens: JsonField<Double>
            ) = apply { this.inputCostPerTokenAbove128kTokens = inputCostPerTokenAbove128kTokens }

            fun inputCostPerTokenAbove200kTokens(inputCostPerTokenAbove200kTokens: Double?) =
                inputCostPerTokenAbove200kTokens(
                    JsonField.ofNullable(inputCostPerTokenAbove200kTokens)
                )

            /**
             * Alias for [Builder.inputCostPerTokenAbove200kTokens].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun inputCostPerTokenAbove200kTokens(inputCostPerTokenAbove200kTokens: Double) =
                inputCostPerTokenAbove200kTokens(inputCostPerTokenAbove200kTokens as Double?)

            /**
             * Sets [Builder.inputCostPerTokenAbove200kTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputCostPerTokenAbove200kTokens] with a well-typed
             * [Double] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun inputCostPerTokenAbove200kTokens(
                inputCostPerTokenAbove200kTokens: JsonField<Double>
            ) = apply { this.inputCostPerTokenAbove200kTokens = inputCostPerTokenAbove200kTokens }

            fun inputCostPerTokenBatches(inputCostPerTokenBatches: Double?) =
                inputCostPerTokenBatches(JsonField.ofNullable(inputCostPerTokenBatches))

            /**
             * Alias for [Builder.inputCostPerTokenBatches].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun inputCostPerTokenBatches(inputCostPerTokenBatches: Double) =
                inputCostPerTokenBatches(inputCostPerTokenBatches as Double?)

            /**
             * Sets [Builder.inputCostPerTokenBatches] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputCostPerTokenBatches] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun inputCostPerTokenBatches(inputCostPerTokenBatches: JsonField<Double>) = apply {
                this.inputCostPerTokenBatches = inputCostPerTokenBatches
            }

            fun inputCostPerTokenCacheHit(inputCostPerTokenCacheHit: Double?) =
                inputCostPerTokenCacheHit(JsonField.ofNullable(inputCostPerTokenCacheHit))

            /**
             * Alias for [Builder.inputCostPerTokenCacheHit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun inputCostPerTokenCacheHit(inputCostPerTokenCacheHit: Double) =
                inputCostPerTokenCacheHit(inputCostPerTokenCacheHit as Double?)

            /**
             * Sets [Builder.inputCostPerTokenCacheHit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputCostPerTokenCacheHit] with a well-typed
             * [Double] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun inputCostPerTokenCacheHit(inputCostPerTokenCacheHit: JsonField<Double>) = apply {
                this.inputCostPerTokenCacheHit = inputCostPerTokenCacheHit
            }

            fun inputCostPerTokenFlex(inputCostPerTokenFlex: Double?) =
                inputCostPerTokenFlex(JsonField.ofNullable(inputCostPerTokenFlex))

            /**
             * Alias for [Builder.inputCostPerTokenFlex].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun inputCostPerTokenFlex(inputCostPerTokenFlex: Double) =
                inputCostPerTokenFlex(inputCostPerTokenFlex as Double?)

            /**
             * Sets [Builder.inputCostPerTokenFlex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputCostPerTokenFlex] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun inputCostPerTokenFlex(inputCostPerTokenFlex: JsonField<Double>) = apply {
                this.inputCostPerTokenFlex = inputCostPerTokenFlex
            }

            fun inputCostPerTokenPriority(inputCostPerTokenPriority: Double?) =
                inputCostPerTokenPriority(JsonField.ofNullable(inputCostPerTokenPriority))

            /**
             * Alias for [Builder.inputCostPerTokenPriority].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun inputCostPerTokenPriority(inputCostPerTokenPriority: Double) =
                inputCostPerTokenPriority(inputCostPerTokenPriority as Double?)

            /**
             * Sets [Builder.inputCostPerTokenPriority] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputCostPerTokenPriority] with a well-typed
             * [Double] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun inputCostPerTokenPriority(inputCostPerTokenPriority: JsonField<Double>) = apply {
                this.inputCostPerTokenPriority = inputCostPerTokenPriority
            }

            fun inputCostPerVideoPerSecond(inputCostPerVideoPerSecond: Double?) =
                inputCostPerVideoPerSecond(JsonField.ofNullable(inputCostPerVideoPerSecond))

            /**
             * Alias for [Builder.inputCostPerVideoPerSecond].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun inputCostPerVideoPerSecond(inputCostPerVideoPerSecond: Double) =
                inputCostPerVideoPerSecond(inputCostPerVideoPerSecond as Double?)

            /**
             * Sets [Builder.inputCostPerVideoPerSecond] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputCostPerVideoPerSecond] with a well-typed
             * [Double] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun inputCostPerVideoPerSecond(inputCostPerVideoPerSecond: JsonField<Double>) = apply {
                this.inputCostPerVideoPerSecond = inputCostPerVideoPerSecond
            }

            fun inputCostPerVideoPerSecondAbove128kTokens(
                inputCostPerVideoPerSecondAbove128kTokens: Double?
            ) =
                inputCostPerVideoPerSecondAbove128kTokens(
                    JsonField.ofNullable(inputCostPerVideoPerSecondAbove128kTokens)
                )

            /**
             * Alias for [Builder.inputCostPerVideoPerSecondAbove128kTokens].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun inputCostPerVideoPerSecondAbove128kTokens(
                inputCostPerVideoPerSecondAbove128kTokens: Double
            ) =
                inputCostPerVideoPerSecondAbove128kTokens(
                    inputCostPerVideoPerSecondAbove128kTokens as Double?
                )

            /**
             * Sets [Builder.inputCostPerVideoPerSecondAbove128kTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputCostPerVideoPerSecondAbove128kTokens] with a
             * well-typed [Double] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun inputCostPerVideoPerSecondAbove128kTokens(
                inputCostPerVideoPerSecondAbove128kTokens: JsonField<Double>
            ) = apply {
                this.inputCostPerVideoPerSecondAbove128kTokens =
                    inputCostPerVideoPerSecondAbove128kTokens
            }

            fun inputCostPerVideoPerSecondAbove15sInterval(
                inputCostPerVideoPerSecondAbove15sInterval: Double?
            ) =
                inputCostPerVideoPerSecondAbove15sInterval(
                    JsonField.ofNullable(inputCostPerVideoPerSecondAbove15sInterval)
                )

            /**
             * Alias for [Builder.inputCostPerVideoPerSecondAbove15sInterval].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun inputCostPerVideoPerSecondAbove15sInterval(
                inputCostPerVideoPerSecondAbove15sInterval: Double
            ) =
                inputCostPerVideoPerSecondAbove15sInterval(
                    inputCostPerVideoPerSecondAbove15sInterval as Double?
                )

            /**
             * Sets [Builder.inputCostPerVideoPerSecondAbove15sInterval] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputCostPerVideoPerSecondAbove15sInterval] with a
             * well-typed [Double] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun inputCostPerVideoPerSecondAbove15sInterval(
                inputCostPerVideoPerSecondAbove15sInterval: JsonField<Double>
            ) = apply {
                this.inputCostPerVideoPerSecondAbove15sInterval =
                    inputCostPerVideoPerSecondAbove15sInterval
            }

            fun inputCostPerVideoPerSecondAbove8sInterval(
                inputCostPerVideoPerSecondAbove8sInterval: Double?
            ) =
                inputCostPerVideoPerSecondAbove8sInterval(
                    JsonField.ofNullable(inputCostPerVideoPerSecondAbove8sInterval)
                )

            /**
             * Alias for [Builder.inputCostPerVideoPerSecondAbove8sInterval].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun inputCostPerVideoPerSecondAbove8sInterval(
                inputCostPerVideoPerSecondAbove8sInterval: Double
            ) =
                inputCostPerVideoPerSecondAbove8sInterval(
                    inputCostPerVideoPerSecondAbove8sInterval as Double?
                )

            /**
             * Sets [Builder.inputCostPerVideoPerSecondAbove8sInterval] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputCostPerVideoPerSecondAbove8sInterval] with a
             * well-typed [Double] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun inputCostPerVideoPerSecondAbove8sInterval(
                inputCostPerVideoPerSecondAbove8sInterval: JsonField<Double>
            ) = apply {
                this.inputCostPerVideoPerSecondAbove8sInterval =
                    inputCostPerVideoPerSecondAbove8sInterval
            }

            fun litellmCredentialName(litellmCredentialName: String?) =
                litellmCredentialName(JsonField.ofNullable(litellmCredentialName))

            /**
             * Sets [Builder.litellmCredentialName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.litellmCredentialName] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun litellmCredentialName(litellmCredentialName: JsonField<String>) = apply {
                this.litellmCredentialName = litellmCredentialName
            }

            fun litellmTraceId(litellmTraceId: String?) =
                litellmTraceId(JsonField.ofNullable(litellmTraceId))

            /**
             * Sets [Builder.litellmTraceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.litellmTraceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun litellmTraceId(litellmTraceId: JsonField<String>) = apply {
                this.litellmTraceId = litellmTraceId
            }

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

            fun milvusTextField(milvusTextField: String?) =
                milvusTextField(JsonField.ofNullable(milvusTextField))

            /**
             * Sets [Builder.milvusTextField] to an arbitrary JSON value.
             *
             * You should usually call [Builder.milvusTextField] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun milvusTextField(milvusTextField: JsonField<String>) = apply {
                this.milvusTextField = milvusTextField
            }

            fun mockResponse(mockResponse: MockResponse?) =
                mockResponse(JsonField.ofNullable(mockResponse))

            /**
             * Sets [Builder.mockResponse] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mockResponse] with a well-typed [MockResponse] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mockResponse(mockResponse: JsonField<MockResponse>) = apply {
                this.mockResponse = mockResponse
            }

            /** Alias for calling [mockResponse] with `MockResponse.ofString(string)`. */
            fun mockResponse(string: String) = mockResponse(MockResponse.ofString(string))

            /** Alias for calling [mockResponse] with `MockResponse.ofModel(model)`. */
            fun mockResponse(model: MockResponse.ModelResponse) =
                mockResponse(MockResponse.ofModel(model))

            /** Alias for calling [mockResponse] with `MockResponse.ofJsonValue(jsonValue)`. */
            fun mockResponse(jsonValue: JsonValue) =
                mockResponse(MockResponse.ofJsonValue(jsonValue))

            fun model(model: String?) = model(JsonField.ofNullable(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            fun modelInfo(modelInfo: ModelInfo?) = modelInfo(JsonField.ofNullable(modelInfo))

            /**
             * Sets [Builder.modelInfo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelInfo] with a well-typed [ModelInfo] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelInfo(modelInfo: JsonField<ModelInfo>) = apply { this.modelInfo = modelInfo }

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

            fun outputCostPerAudioPerSecond(outputCostPerAudioPerSecond: Double?) =
                outputCostPerAudioPerSecond(JsonField.ofNullable(outputCostPerAudioPerSecond))

            /**
             * Alias for [Builder.outputCostPerAudioPerSecond].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun outputCostPerAudioPerSecond(outputCostPerAudioPerSecond: Double) =
                outputCostPerAudioPerSecond(outputCostPerAudioPerSecond as Double?)

            /**
             * Sets [Builder.outputCostPerAudioPerSecond] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputCostPerAudioPerSecond] with a well-typed
             * [Double] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun outputCostPerAudioPerSecond(outputCostPerAudioPerSecond: JsonField<Double>) =
                apply {
                    this.outputCostPerAudioPerSecond = outputCostPerAudioPerSecond
                }

            fun outputCostPerAudioToken(outputCostPerAudioToken: Double?) =
                outputCostPerAudioToken(JsonField.ofNullable(outputCostPerAudioToken))

            /**
             * Alias for [Builder.outputCostPerAudioToken].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun outputCostPerAudioToken(outputCostPerAudioToken: Double) =
                outputCostPerAudioToken(outputCostPerAudioToken as Double?)

            /**
             * Sets [Builder.outputCostPerAudioToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputCostPerAudioToken] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun outputCostPerAudioToken(outputCostPerAudioToken: JsonField<Double>) = apply {
                this.outputCostPerAudioToken = outputCostPerAudioToken
            }

            fun outputCostPerCharacter(outputCostPerCharacter: Double?) =
                outputCostPerCharacter(JsonField.ofNullable(outputCostPerCharacter))

            /**
             * Alias for [Builder.outputCostPerCharacter].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun outputCostPerCharacter(outputCostPerCharacter: Double) =
                outputCostPerCharacter(outputCostPerCharacter as Double?)

            /**
             * Sets [Builder.outputCostPerCharacter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputCostPerCharacter] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun outputCostPerCharacter(outputCostPerCharacter: JsonField<Double>) = apply {
                this.outputCostPerCharacter = outputCostPerCharacter
            }

            fun outputCostPerCharacterAbove128kTokens(
                outputCostPerCharacterAbove128kTokens: Double?
            ) =
                outputCostPerCharacterAbove128kTokens(
                    JsonField.ofNullable(outputCostPerCharacterAbove128kTokens)
                )

            /**
             * Alias for [Builder.outputCostPerCharacterAbove128kTokens].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun outputCostPerCharacterAbove128kTokens(
                outputCostPerCharacterAbove128kTokens: Double
            ) =
                outputCostPerCharacterAbove128kTokens(
                    outputCostPerCharacterAbove128kTokens as Double?
                )

            /**
             * Sets [Builder.outputCostPerCharacterAbove128kTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputCostPerCharacterAbove128kTokens] with a
             * well-typed [Double] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun outputCostPerCharacterAbove128kTokens(
                outputCostPerCharacterAbove128kTokens: JsonField<Double>
            ) = apply {
                this.outputCostPerCharacterAbove128kTokens = outputCostPerCharacterAbove128kTokens
            }

            fun outputCostPerImage(outputCostPerImage: Double?) =
                outputCostPerImage(JsonField.ofNullable(outputCostPerImage))

            /**
             * Alias for [Builder.outputCostPerImage].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun outputCostPerImage(outputCostPerImage: Double) =
                outputCostPerImage(outputCostPerImage as Double?)

            /**
             * Sets [Builder.outputCostPerImage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputCostPerImage] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputCostPerImage(outputCostPerImage: JsonField<Double>) = apply {
                this.outputCostPerImage = outputCostPerImage
            }

            fun outputCostPerImageToken(outputCostPerImageToken: Double?) =
                outputCostPerImageToken(JsonField.ofNullable(outputCostPerImageToken))

            /**
             * Alias for [Builder.outputCostPerImageToken].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun outputCostPerImageToken(outputCostPerImageToken: Double) =
                outputCostPerImageToken(outputCostPerImageToken as Double?)

            /**
             * Sets [Builder.outputCostPerImageToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputCostPerImageToken] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun outputCostPerImageToken(outputCostPerImageToken: JsonField<Double>) = apply {
                this.outputCostPerImageToken = outputCostPerImageToken
            }

            fun outputCostPerPixel(outputCostPerPixel: Double?) =
                outputCostPerPixel(JsonField.ofNullable(outputCostPerPixel))

            /**
             * Alias for [Builder.outputCostPerPixel].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun outputCostPerPixel(outputCostPerPixel: Double) =
                outputCostPerPixel(outputCostPerPixel as Double?)

            /**
             * Sets [Builder.outputCostPerPixel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputCostPerPixel] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputCostPerPixel(outputCostPerPixel: JsonField<Double>) = apply {
                this.outputCostPerPixel = outputCostPerPixel
            }

            fun outputCostPerReasoningToken(outputCostPerReasoningToken: Double?) =
                outputCostPerReasoningToken(JsonField.ofNullable(outputCostPerReasoningToken))

            /**
             * Alias for [Builder.outputCostPerReasoningToken].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun outputCostPerReasoningToken(outputCostPerReasoningToken: Double) =
                outputCostPerReasoningToken(outputCostPerReasoningToken as Double?)

            /**
             * Sets [Builder.outputCostPerReasoningToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputCostPerReasoningToken] with a well-typed
             * [Double] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun outputCostPerReasoningToken(outputCostPerReasoningToken: JsonField<Double>) =
                apply {
                    this.outputCostPerReasoningToken = outputCostPerReasoningToken
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

            fun outputCostPerTokenAbove128kTokens(outputCostPerTokenAbove128kTokens: Double?) =
                outputCostPerTokenAbove128kTokens(
                    JsonField.ofNullable(outputCostPerTokenAbove128kTokens)
                )

            /**
             * Alias for [Builder.outputCostPerTokenAbove128kTokens].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun outputCostPerTokenAbove128kTokens(outputCostPerTokenAbove128kTokens: Double) =
                outputCostPerTokenAbove128kTokens(outputCostPerTokenAbove128kTokens as Double?)

            /**
             * Sets [Builder.outputCostPerTokenAbove128kTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputCostPerTokenAbove128kTokens] with a well-typed
             * [Double] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun outputCostPerTokenAbove128kTokens(
                outputCostPerTokenAbove128kTokens: JsonField<Double>
            ) = apply { this.outputCostPerTokenAbove128kTokens = outputCostPerTokenAbove128kTokens }

            fun outputCostPerTokenAbove200kTokens(outputCostPerTokenAbove200kTokens: Double?) =
                outputCostPerTokenAbove200kTokens(
                    JsonField.ofNullable(outputCostPerTokenAbove200kTokens)
                )

            /**
             * Alias for [Builder.outputCostPerTokenAbove200kTokens].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun outputCostPerTokenAbove200kTokens(outputCostPerTokenAbove200kTokens: Double) =
                outputCostPerTokenAbove200kTokens(outputCostPerTokenAbove200kTokens as Double?)

            /**
             * Sets [Builder.outputCostPerTokenAbove200kTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputCostPerTokenAbove200kTokens] with a well-typed
             * [Double] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun outputCostPerTokenAbove200kTokens(
                outputCostPerTokenAbove200kTokens: JsonField<Double>
            ) = apply { this.outputCostPerTokenAbove200kTokens = outputCostPerTokenAbove200kTokens }

            fun outputCostPerTokenBatches(outputCostPerTokenBatches: Double?) =
                outputCostPerTokenBatches(JsonField.ofNullable(outputCostPerTokenBatches))

            /**
             * Alias for [Builder.outputCostPerTokenBatches].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun outputCostPerTokenBatches(outputCostPerTokenBatches: Double) =
                outputCostPerTokenBatches(outputCostPerTokenBatches as Double?)

            /**
             * Sets [Builder.outputCostPerTokenBatches] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputCostPerTokenBatches] with a well-typed
             * [Double] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun outputCostPerTokenBatches(outputCostPerTokenBatches: JsonField<Double>) = apply {
                this.outputCostPerTokenBatches = outputCostPerTokenBatches
            }

            fun outputCostPerTokenFlex(outputCostPerTokenFlex: Double?) =
                outputCostPerTokenFlex(JsonField.ofNullable(outputCostPerTokenFlex))

            /**
             * Alias for [Builder.outputCostPerTokenFlex].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun outputCostPerTokenFlex(outputCostPerTokenFlex: Double) =
                outputCostPerTokenFlex(outputCostPerTokenFlex as Double?)

            /**
             * Sets [Builder.outputCostPerTokenFlex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputCostPerTokenFlex] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun outputCostPerTokenFlex(outputCostPerTokenFlex: JsonField<Double>) = apply {
                this.outputCostPerTokenFlex = outputCostPerTokenFlex
            }

            fun outputCostPerTokenPriority(outputCostPerTokenPriority: Double?) =
                outputCostPerTokenPriority(JsonField.ofNullable(outputCostPerTokenPriority))

            /**
             * Alias for [Builder.outputCostPerTokenPriority].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun outputCostPerTokenPriority(outputCostPerTokenPriority: Double) =
                outputCostPerTokenPriority(outputCostPerTokenPriority as Double?)

            /**
             * Sets [Builder.outputCostPerTokenPriority] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputCostPerTokenPriority] with a well-typed
             * [Double] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun outputCostPerTokenPriority(outputCostPerTokenPriority: JsonField<Double>) = apply {
                this.outputCostPerTokenPriority = outputCostPerTokenPriority
            }

            fun outputCostPerVideoPerSecond(outputCostPerVideoPerSecond: Double?) =
                outputCostPerVideoPerSecond(JsonField.ofNullable(outputCostPerVideoPerSecond))

            /**
             * Alias for [Builder.outputCostPerVideoPerSecond].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun outputCostPerVideoPerSecond(outputCostPerVideoPerSecond: Double) =
                outputCostPerVideoPerSecond(outputCostPerVideoPerSecond as Double?)

            /**
             * Sets [Builder.outputCostPerVideoPerSecond] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputCostPerVideoPerSecond] with a well-typed
             * [Double] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun outputCostPerVideoPerSecond(outputCostPerVideoPerSecond: JsonField<Double>) =
                apply {
                    this.outputCostPerVideoPerSecond = outputCostPerVideoPerSecond
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

            fun s3BucketName(s3BucketName: String?) =
                s3BucketName(JsonField.ofNullable(s3BucketName))

            /**
             * Sets [Builder.s3BucketName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.s3BucketName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun s3BucketName(s3BucketName: JsonField<String>) = apply {
                this.s3BucketName = s3BucketName
            }

            fun s3EncryptionKeyId(s3EncryptionKeyId: String?) =
                s3EncryptionKeyId(JsonField.ofNullable(s3EncryptionKeyId))

            /**
             * Sets [Builder.s3EncryptionKeyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.s3EncryptionKeyId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun s3EncryptionKeyId(s3EncryptionKeyId: JsonField<String>) = apply {
                this.s3EncryptionKeyId = s3EncryptionKeyId
            }

            fun searchContextCostPerQuery(searchContextCostPerQuery: SearchContextCostPerQuery?) =
                searchContextCostPerQuery(JsonField.ofNullable(searchContextCostPerQuery))

            /**
             * Sets [Builder.searchContextCostPerQuery] to an arbitrary JSON value.
             *
             * You should usually call [Builder.searchContextCostPerQuery] with a well-typed
             * [SearchContextCostPerQuery] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun searchContextCostPerQuery(
                searchContextCostPerQuery: JsonField<SearchContextCostPerQuery>
            ) = apply { this.searchContextCostPerQuery = searchContextCostPerQuery }

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

            fun tieredPricing(tieredPricing: List<TieredPricing>?) =
                tieredPricing(JsonField.ofNullable(tieredPricing))

            /**
             * Sets [Builder.tieredPricing] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tieredPricing] with a well-typed
             * `List<TieredPricing>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun tieredPricing(tieredPricing: JsonField<List<TieredPricing>>) = apply {
                this.tieredPricing = tieredPricing.map { it.toMutableList() }
            }

            /**
             * Adds a single [TieredPricing] to [Builder.tieredPricing].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTieredPricing(tieredPricing: TieredPricing) = apply {
                this.tieredPricing =
                    (this.tieredPricing ?: JsonField.of(mutableListOf())).also {
                        checkKnown("tieredPricing", it).add(tieredPricing)
                    }
            }

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

            fun useLitellmProxy(useLitellmProxy: Boolean?) =
                useLitellmProxy(JsonField.ofNullable(useLitellmProxy))

            /**
             * Alias for [Builder.useLitellmProxy].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun useLitellmProxy(useLitellmProxy: Boolean) =
                useLitellmProxy(useLitellmProxy as Boolean?)

            /**
             * Sets [Builder.useLitellmProxy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.useLitellmProxy] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun useLitellmProxy(useLitellmProxy: JsonField<Boolean>) = apply {
                this.useLitellmProxy = useLitellmProxy
            }

            fun vectorStoreId(vectorStoreId: String?) =
                vectorStoreId(JsonField.ofNullable(vectorStoreId))

            /**
             * Sets [Builder.vectorStoreId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vectorStoreId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vectorStoreId(vectorStoreId: JsonField<String>) = apply {
                this.vectorStoreId = vectorStoreId
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

            /** Alias for calling [vertexCredentials] with `VertexCredentials.ofString(string)`. */
            fun vertexCredentials(string: String) =
                vertexCredentials(VertexCredentials.ofString(string))

            /**
             * Alias for calling [vertexCredentials] with
             * `VertexCredentials.ofUnionMember1(unionMember1)`.
             */
            fun vertexCredentials(unionMember1: VertexCredentials.UnionMember1) =
                vertexCredentials(VertexCredentials.ofUnionMember1(unionMember1))

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
             * Returns an immutable instance of [LitellmParams].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): LitellmParams =
                LitellmParams(
                    apiBase,
                    apiKey,
                    apiVersion,
                    autoRouterConfig,
                    autoRouterConfigPath,
                    autoRouterDefaultModel,
                    autoRouterEmbeddingModel,
                    awsAccessKeyId,
                    awsBedrockRuntimeEndpoint,
                    awsRegionName,
                    awsSecretAccessKey,
                    budgetDuration,
                    cacheCreationInputAudioTokenCost,
                    cacheCreationInputTokenCost,
                    cacheCreationInputTokenCostAbove1hr,
                    cacheCreationInputTokenCostAbove200kTokens,
                    cacheReadInputAudioTokenCost,
                    cacheReadInputTokenCost,
                    cacheReadInputTokenCostAbove200kTokens,
                    cacheReadInputTokenCostFlex,
                    cacheReadInputTokenCostPriority,
                    citationCostPerToken,
                    (configurableClientsideAuthParams ?: JsonMissing.of()).map { it.toImmutable() },
                    customLlmProvider,
                    gcsBucketName,
                    inputCostPerAudioPerSecond,
                    inputCostPerAudioPerSecondAbove128kTokens,
                    inputCostPerAudioToken,
                    inputCostPerCharacter,
                    inputCostPerCharacterAbove128kTokens,
                    inputCostPerImage,
                    inputCostPerImageAbove128kTokens,
                    inputCostPerPixel,
                    inputCostPerQuery,
                    inputCostPerSecond,
                    inputCostPerToken,
                    inputCostPerTokenAbove128kTokens,
                    inputCostPerTokenAbove200kTokens,
                    inputCostPerTokenBatches,
                    inputCostPerTokenCacheHit,
                    inputCostPerTokenFlex,
                    inputCostPerTokenPriority,
                    inputCostPerVideoPerSecond,
                    inputCostPerVideoPerSecondAbove128kTokens,
                    inputCostPerVideoPerSecondAbove15sInterval,
                    inputCostPerVideoPerSecondAbove8sInterval,
                    litellmCredentialName,
                    litellmTraceId,
                    maxBudget,
                    maxFileSizeMb,
                    maxRetries,
                    mergeReasoningContentInChoices,
                    milvusTextField,
                    mockResponse,
                    model,
                    modelInfo,
                    organization,
                    outputCostPerAudioPerSecond,
                    outputCostPerAudioToken,
                    outputCostPerCharacter,
                    outputCostPerCharacterAbove128kTokens,
                    outputCostPerImage,
                    outputCostPerImageToken,
                    outputCostPerPixel,
                    outputCostPerReasoningToken,
                    outputCostPerSecond,
                    outputCostPerToken,
                    outputCostPerTokenAbove128kTokens,
                    outputCostPerTokenAbove200kTokens,
                    outputCostPerTokenBatches,
                    outputCostPerTokenFlex,
                    outputCostPerTokenPriority,
                    outputCostPerVideoPerSecond,
                    regionName,
                    rpm,
                    s3BucketName,
                    s3EncryptionKeyId,
                    searchContextCostPerQuery,
                    streamTimeout,
                    (tieredPricing ?: JsonMissing.of()).map { it.toImmutable() },
                    timeout,
                    tpm,
                    useInPassThrough,
                    useLitellmProxy,
                    vectorStoreId,
                    vertexCredentials,
                    vertexLocation,
                    vertexProject,
                    watsonxRegionName,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): LitellmParams = apply {
            if (validated) {
                return@apply
            }

            apiBase()
            apiKey()
            apiVersion()
            autoRouterConfig()
            autoRouterConfigPath()
            autoRouterDefaultModel()
            autoRouterEmbeddingModel()
            awsAccessKeyId()
            awsBedrockRuntimeEndpoint()
            awsRegionName()
            awsSecretAccessKey()
            budgetDuration()
            cacheCreationInputAudioTokenCost()
            cacheCreationInputTokenCost()
            cacheCreationInputTokenCostAbove1hr()
            cacheCreationInputTokenCostAbove200kTokens()
            cacheReadInputAudioTokenCost()
            cacheReadInputTokenCost()
            cacheReadInputTokenCostAbove200kTokens()
            cacheReadInputTokenCostFlex()
            cacheReadInputTokenCostPriority()
            citationCostPerToken()
            configurableClientsideAuthParams()?.forEach { it.validate() }
            customLlmProvider()
            gcsBucketName()
            inputCostPerAudioPerSecond()
            inputCostPerAudioPerSecondAbove128kTokens()
            inputCostPerAudioToken()
            inputCostPerCharacter()
            inputCostPerCharacterAbove128kTokens()
            inputCostPerImage()
            inputCostPerImageAbove128kTokens()
            inputCostPerPixel()
            inputCostPerQuery()
            inputCostPerSecond()
            inputCostPerToken()
            inputCostPerTokenAbove128kTokens()
            inputCostPerTokenAbove200kTokens()
            inputCostPerTokenBatches()
            inputCostPerTokenCacheHit()
            inputCostPerTokenFlex()
            inputCostPerTokenPriority()
            inputCostPerVideoPerSecond()
            inputCostPerVideoPerSecondAbove128kTokens()
            inputCostPerVideoPerSecondAbove15sInterval()
            inputCostPerVideoPerSecondAbove8sInterval()
            litellmCredentialName()
            litellmTraceId()
            maxBudget()
            maxFileSizeMb()
            maxRetries()
            mergeReasoningContentInChoices()
            milvusTextField()
            mockResponse()?.validate()
            model()
            modelInfo()?.validate()
            organization()
            outputCostPerAudioPerSecond()
            outputCostPerAudioToken()
            outputCostPerCharacter()
            outputCostPerCharacterAbove128kTokens()
            outputCostPerImage()
            outputCostPerImageToken()
            outputCostPerPixel()
            outputCostPerReasoningToken()
            outputCostPerSecond()
            outputCostPerToken()
            outputCostPerTokenAbove128kTokens()
            outputCostPerTokenAbove200kTokens()
            outputCostPerTokenBatches()
            outputCostPerTokenFlex()
            outputCostPerTokenPriority()
            outputCostPerVideoPerSecond()
            regionName()
            rpm()
            s3BucketName()
            s3EncryptionKeyId()
            searchContextCostPerQuery()?.validate()
            streamTimeout()?.validate()
            tieredPricing()?.forEach { it.validate() }
            timeout()?.validate()
            tpm()
            useInPassThrough()
            useLitellmProxy()
            vectorStoreId()
            vertexCredentials()?.validate()
            vertexLocation()
            vertexProject()
            watsonxRegionName()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HanzoInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (apiBase.asKnown() == null) 0 else 1) +
                (if (apiKey.asKnown() == null) 0 else 1) +
                (if (apiVersion.asKnown() == null) 0 else 1) +
                (if (autoRouterConfig.asKnown() == null) 0 else 1) +
                (if (autoRouterConfigPath.asKnown() == null) 0 else 1) +
                (if (autoRouterDefaultModel.asKnown() == null) 0 else 1) +
                (if (autoRouterEmbeddingModel.asKnown() == null) 0 else 1) +
                (if (awsAccessKeyId.asKnown() == null) 0 else 1) +
                (if (awsBedrockRuntimeEndpoint.asKnown() == null) 0 else 1) +
                (if (awsRegionName.asKnown() == null) 0 else 1) +
                (if (awsSecretAccessKey.asKnown() == null) 0 else 1) +
                (if (budgetDuration.asKnown() == null) 0 else 1) +
                (if (cacheCreationInputAudioTokenCost.asKnown() == null) 0 else 1) +
                (if (cacheCreationInputTokenCost.asKnown() == null) 0 else 1) +
                (if (cacheCreationInputTokenCostAbove1hr.asKnown() == null) 0 else 1) +
                (if (cacheCreationInputTokenCostAbove200kTokens.asKnown() == null) 0 else 1) +
                (if (cacheReadInputAudioTokenCost.asKnown() == null) 0 else 1) +
                (if (cacheReadInputTokenCost.asKnown() == null) 0 else 1) +
                (if (cacheReadInputTokenCostAbove200kTokens.asKnown() == null) 0 else 1) +
                (if (cacheReadInputTokenCostFlex.asKnown() == null) 0 else 1) +
                (if (cacheReadInputTokenCostPriority.asKnown() == null) 0 else 1) +
                (if (citationCostPerToken.asKnown() == null) 0 else 1) +
                (configurableClientsideAuthParams.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (customLlmProvider.asKnown() == null) 0 else 1) +
                (if (gcsBucketName.asKnown() == null) 0 else 1) +
                (if (inputCostPerAudioPerSecond.asKnown() == null) 0 else 1) +
                (if (inputCostPerAudioPerSecondAbove128kTokens.asKnown() == null) 0 else 1) +
                (if (inputCostPerAudioToken.asKnown() == null) 0 else 1) +
                (if (inputCostPerCharacter.asKnown() == null) 0 else 1) +
                (if (inputCostPerCharacterAbove128kTokens.asKnown() == null) 0 else 1) +
                (if (inputCostPerImage.asKnown() == null) 0 else 1) +
                (if (inputCostPerImageAbove128kTokens.asKnown() == null) 0 else 1) +
                (if (inputCostPerPixel.asKnown() == null) 0 else 1) +
                (if (inputCostPerQuery.asKnown() == null) 0 else 1) +
                (if (inputCostPerSecond.asKnown() == null) 0 else 1) +
                (if (inputCostPerToken.asKnown() == null) 0 else 1) +
                (if (inputCostPerTokenAbove128kTokens.asKnown() == null) 0 else 1) +
                (if (inputCostPerTokenAbove200kTokens.asKnown() == null) 0 else 1) +
                (if (inputCostPerTokenBatches.asKnown() == null) 0 else 1) +
                (if (inputCostPerTokenCacheHit.asKnown() == null) 0 else 1) +
                (if (inputCostPerTokenFlex.asKnown() == null) 0 else 1) +
                (if (inputCostPerTokenPriority.asKnown() == null) 0 else 1) +
                (if (inputCostPerVideoPerSecond.asKnown() == null) 0 else 1) +
                (if (inputCostPerVideoPerSecondAbove128kTokens.asKnown() == null) 0 else 1) +
                (if (inputCostPerVideoPerSecondAbove15sInterval.asKnown() == null) 0 else 1) +
                (if (inputCostPerVideoPerSecondAbove8sInterval.asKnown() == null) 0 else 1) +
                (if (litellmCredentialName.asKnown() == null) 0 else 1) +
                (if (litellmTraceId.asKnown() == null) 0 else 1) +
                (if (maxBudget.asKnown() == null) 0 else 1) +
                (if (maxFileSizeMb.asKnown() == null) 0 else 1) +
                (if (maxRetries.asKnown() == null) 0 else 1) +
                (if (mergeReasoningContentInChoices.asKnown() == null) 0 else 1) +
                (if (milvusTextField.asKnown() == null) 0 else 1) +
                (mockResponse.asKnown()?.validity() ?: 0) +
                (if (model.asKnown() == null) 0 else 1) +
                (modelInfo.asKnown()?.validity() ?: 0) +
                (if (organization.asKnown() == null) 0 else 1) +
                (if (outputCostPerAudioPerSecond.asKnown() == null) 0 else 1) +
                (if (outputCostPerAudioToken.asKnown() == null) 0 else 1) +
                (if (outputCostPerCharacter.asKnown() == null) 0 else 1) +
                (if (outputCostPerCharacterAbove128kTokens.asKnown() == null) 0 else 1) +
                (if (outputCostPerImage.asKnown() == null) 0 else 1) +
                (if (outputCostPerImageToken.asKnown() == null) 0 else 1) +
                (if (outputCostPerPixel.asKnown() == null) 0 else 1) +
                (if (outputCostPerReasoningToken.asKnown() == null) 0 else 1) +
                (if (outputCostPerSecond.asKnown() == null) 0 else 1) +
                (if (outputCostPerToken.asKnown() == null) 0 else 1) +
                (if (outputCostPerTokenAbove128kTokens.asKnown() == null) 0 else 1) +
                (if (outputCostPerTokenAbove200kTokens.asKnown() == null) 0 else 1) +
                (if (outputCostPerTokenBatches.asKnown() == null) 0 else 1) +
                (if (outputCostPerTokenFlex.asKnown() == null) 0 else 1) +
                (if (outputCostPerTokenPriority.asKnown() == null) 0 else 1) +
                (if (outputCostPerVideoPerSecond.asKnown() == null) 0 else 1) +
                (if (regionName.asKnown() == null) 0 else 1) +
                (if (rpm.asKnown() == null) 0 else 1) +
                (if (s3BucketName.asKnown() == null) 0 else 1) +
                (if (s3EncryptionKeyId.asKnown() == null) 0 else 1) +
                (searchContextCostPerQuery.asKnown()?.validity() ?: 0) +
                (streamTimeout.asKnown()?.validity() ?: 0) +
                (tieredPricing.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (timeout.asKnown()?.validity() ?: 0) +
                (if (tpm.asKnown() == null) 0 else 1) +
                (if (useInPassThrough.asKnown() == null) 0 else 1) +
                (if (useLitellmProxy.asKnown() == null) 0 else 1) +
                (if (vectorStoreId.asKnown() == null) 0 else 1) +
                (vertexCredentials.asKnown()?.validity() ?: 0) +
                (if (vertexLocation.asKnown() == null) 0 else 1) +
                (if (vertexProject.asKnown() == null) 0 else 1) +
                (if (watsonxRegionName.asKnown() == null) 0 else 1)

        @JsonDeserialize(using = ConfigurableClientsideAuthParam.Deserializer::class)
        @JsonSerialize(using = ConfigurableClientsideAuthParam.Serializer::class)
        class ConfigurableClientsideAuthParam
        private constructor(
            private val string: String? = null,
            private val paramsCustomAuthInput: ConfigurableClientsideParamsCustomAuthInput? = null,
            private val _json: JsonValue? = null,
        ) {

            fun string(): String? = string

            fun paramsCustomAuthInput(): ConfigurableClientsideParamsCustomAuthInput? =
                paramsCustomAuthInput

            fun isString(): Boolean = string != null

            fun isParamsCustomAuthInput(): Boolean = paramsCustomAuthInput != null

            fun asString(): String = string.getOrThrow("string")

            fun asParamsCustomAuthInput(): ConfigurableClientsideParamsCustomAuthInput =
                paramsCustomAuthInput.getOrThrow("paramsCustomAuthInput")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    paramsCustomAuthInput != null ->
                        visitor.visitParamsCustomAuthInput(paramsCustomAuthInput)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): ConfigurableClientsideAuthParam = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitString(string: String) {}

                        override fun visitParamsCustomAuthInput(
                            paramsCustomAuthInput: ConfigurableClientsideParamsCustomAuthInput
                        ) {
                            paramsCustomAuthInput.validate()
                        }
                    }
                )
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: HanzoInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitString(string: String) = 1

                        override fun visitParamsCustomAuthInput(
                            paramsCustomAuthInput: ConfigurableClientsideParamsCustomAuthInput
                        ) = paramsCustomAuthInput.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ConfigurableClientsideAuthParam &&
                    string == other.string &&
                    paramsCustomAuthInput == other.paramsCustomAuthInput
            }

            override fun hashCode(): Int = Objects.hash(string, paramsCustomAuthInput)

            override fun toString(): String =
                when {
                    string != null -> "ConfigurableClientsideAuthParam{string=$string}"
                    paramsCustomAuthInput != null ->
                        "ConfigurableClientsideAuthParam{paramsCustomAuthInput=$paramsCustomAuthInput}"
                    _json != null -> "ConfigurableClientsideAuthParam{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid ConfigurableClientsideAuthParam")
                }

            companion object {

                fun ofString(string: String) = ConfigurableClientsideAuthParam(string = string)

                fun ofParamsCustomAuthInput(
                    paramsCustomAuthInput: ConfigurableClientsideParamsCustomAuthInput
                ) = ConfigurableClientsideAuthParam(paramsCustomAuthInput = paramsCustomAuthInput)
            }

            /**
             * An interface that defines how to map each variant of
             * [ConfigurableClientsideAuthParam] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitParamsCustomAuthInput(
                    paramsCustomAuthInput: ConfigurableClientsideParamsCustomAuthInput
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

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<
                                            ConfigurableClientsideParamsCustomAuthInput
                                        >(),
                                    )
                                    ?.let {
                                        ConfigurableClientsideAuthParam(
                                            paramsCustomAuthInput = it,
                                            _json = json,
                                        )
                                    },
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    ConfigurableClientsideAuthParam(string = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> ConfigurableClientsideAuthParam(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
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
                        value.paramsCustomAuthInput != null ->
                            generator.writeObject(value.paramsCustomAuthInput)
                        value._json != null -> generator.writeObject(value._json)
                        else ->
                            throw IllegalStateException("Invalid ConfigurableClientsideAuthParam")
                    }
                }
            }

            class ConfigurableClientsideParamsCustomAuthInput
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val apiBase: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("api_base")
                    @ExcludeMissing
                    apiBase: JsonField<String> = JsonMissing.of()
                ) : this(apiBase, mutableMapOf())

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun apiBase(): String = apiBase.getRequired("api_base")

                /**
                 * Returns the raw JSON value of [apiBase].
                 *
                 * Unlike [apiBase], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("api_base")
                @ExcludeMissing
                fun _apiBase(): JsonField<String> = apiBase

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
                     * Returns a mutable builder for constructing an instance of
                     * [ConfigurableClientsideParamsCustomAuthInput].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .apiBase()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [ConfigurableClientsideParamsCustomAuthInput]. */
                class Builder internal constructor() {

                    private var apiBase: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(
                        configurableClientsideParamsCustomAuthInput:
                            ConfigurableClientsideParamsCustomAuthInput
                    ) = apply {
                        apiBase = configurableClientsideParamsCustomAuthInput.apiBase
                        additionalProperties =
                            configurableClientsideParamsCustomAuthInput.additionalProperties
                                .toMutableMap()
                    }

                    fun apiBase(apiBase: String) = apiBase(JsonField.of(apiBase))

                    /**
                     * Sets [Builder.apiBase] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.apiBase] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun apiBase(apiBase: JsonField<String>) = apply { this.apiBase = apiBase }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of
                     * [ConfigurableClientsideParamsCustomAuthInput].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .apiBase()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): ConfigurableClientsideParamsCustomAuthInput =
                        ConfigurableClientsideParamsCustomAuthInput(
                            checkRequired("apiBase", apiBase),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): ConfigurableClientsideParamsCustomAuthInput = apply {
                    if (validated) {
                        return@apply
                    }

                    apiBase()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: HanzoInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int = (if (apiBase.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ConfigurableClientsideParamsCustomAuthInput &&
                        apiBase == other.apiBase &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(apiBase, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ConfigurableClientsideParamsCustomAuthInput{apiBase=$apiBase, additionalProperties=$additionalProperties}"
            }
        }

        @JsonDeserialize(using = MockResponse.Deserializer::class)
        @JsonSerialize(using = MockResponse.Serializer::class)
        class MockResponse
        private constructor(
            private val string: String? = null,
            private val model: ModelResponse? = null,
            private val jsonValue: JsonValue? = null,
            private val _json: JsonValue? = null,
        ) {

            fun string(): String? = string

            fun model(): ModelResponse? = model

            fun jsonValue(): JsonValue? = jsonValue

            fun isString(): Boolean = string != null

            fun isModel(): Boolean = model != null

            fun isJsonValue(): Boolean = jsonValue != null

            fun asString(): String = string.getOrThrow("string")

            fun asModel(): ModelResponse = model.getOrThrow("model")

            fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    model != null -> visitor.visitModel(model)
                    jsonValue != null -> visitor.visitJsonValue(jsonValue)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): MockResponse = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitString(string: String) {}

                        override fun visitModel(model: ModelResponse) {
                            model.validate()
                        }

                        override fun visitJsonValue(jsonValue: JsonValue) {}
                    }
                )
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: HanzoInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitString(string: String) = 1

                        override fun visitModel(model: ModelResponse) = model.validity()

                        override fun visitJsonValue(jsonValue: JsonValue) = 1

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MockResponse &&
                    string == other.string &&
                    model == other.model &&
                    jsonValue == other.jsonValue
            }

            override fun hashCode(): Int = Objects.hash(string, model, jsonValue)

            override fun toString(): String =
                when {
                    string != null -> "MockResponse{string=$string}"
                    model != null -> "MockResponse{model=$model}"
                    jsonValue != null -> "MockResponse{jsonValue=$jsonValue}"
                    _json != null -> "MockResponse{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid MockResponse")
                }

            companion object {

                fun ofString(string: String) = MockResponse(string = string)

                fun ofModel(model: ModelResponse) = MockResponse(model = model)

                fun ofJsonValue(jsonValue: JsonValue) = MockResponse(jsonValue = jsonValue)
            }

            /**
             * An interface that defines how to map each variant of [MockResponse] to a value of
             * type [T].
             */
            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitModel(model: ModelResponse): T

                fun visitJsonValue(jsonValue: JsonValue): T

                /**
                 * Maps an unknown variant of [MockResponse] to a value of type [T].
                 *
                 * An instance of [MockResponse] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws HanzoInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw HanzoInvalidDataException("Unknown MockResponse: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<MockResponse>(MockResponse::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): MockResponse {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<ModelResponse>())?.let {
                                    MockResponse(model = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    MockResponse(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                                    MockResponse(jsonValue = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants.
                        0 -> MockResponse(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<MockResponse>(MockResponse::class) {

                override fun serialize(
                    value: MockResponse,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.string != null -> generator.writeObject(value.string)
                        value.model != null -> generator.writeObject(value.model)
                        value.jsonValue != null -> generator.writeObject(value.jsonValue)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid MockResponse")
                    }
                }
            }

            class ModelResponse
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val choices: JsonField<List<Choice>>,
                private val created: JsonField<Long>,
                private val object_: JsonField<String>,
                private val model: JsonField<String>,
                private val systemFingerprint: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("choices")
                    @ExcludeMissing
                    choices: JsonField<List<Choice>> = JsonMissing.of(),
                    @JsonProperty("created")
                    @ExcludeMissing
                    created: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("object")
                    @ExcludeMissing
                    object_: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("model")
                    @ExcludeMissing
                    model: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("system_fingerprint")
                    @ExcludeMissing
                    systemFingerprint: JsonField<String> = JsonMissing.of(),
                ) : this(id, choices, created, object_, model, systemFingerprint, mutableMapOf())

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun choices(): List<Choice> = choices.getRequired("choices")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun created(): Long = created.getRequired("created")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun object_(): String = object_.getRequired("object")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun model(): String? = model.getNullable("model")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun systemFingerprint(): String? =
                    systemFingerprint.getNullable("system_fingerprint")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [choices].
                 *
                 * Unlike [choices], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("choices")
                @ExcludeMissing
                fun _choices(): JsonField<List<Choice>> = choices

                /**
                 * Returns the raw JSON value of [created].
                 *
                 * Unlike [created], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<Long> = created

                /**
                 * Returns the raw JSON value of [object_].
                 *
                 * Unlike [object_], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

                /**
                 * Returns the raw JSON value of [model].
                 *
                 * Unlike [model], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

                /**
                 * Returns the raw JSON value of [systemFingerprint].
                 *
                 * Unlike [systemFingerprint], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("system_fingerprint")
                @ExcludeMissing
                fun _systemFingerprint(): JsonField<String> = systemFingerprint

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
                     * Returns a mutable builder for constructing an instance of [ModelResponse].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .choices()
                     * .created()
                     * .object_()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [ModelResponse]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var choices: JsonField<MutableList<Choice>>? = null
                    private var created: JsonField<Long>? = null
                    private var object_: JsonField<String>? = null
                    private var model: JsonField<String> = JsonMissing.of()
                    private var systemFingerprint: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(modelResponse: ModelResponse) = apply {
                        id = modelResponse.id
                        choices = modelResponse.choices.map { it.toMutableList() }
                        created = modelResponse.created
                        object_ = modelResponse.object_
                        model = modelResponse.model
                        systemFingerprint = modelResponse.systemFingerprint
                        additionalProperties = modelResponse.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun choices(choices: List<Choice>) = choices(JsonField.of(choices))

                    /**
                     * Sets [Builder.choices] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.choices] with a well-typed `List<Choice>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun choices(choices: JsonField<List<Choice>>) = apply {
                        this.choices = choices.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Choice] to [choices].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addChoice(choice: Choice) = apply {
                        choices =
                            (choices ?: JsonField.of(mutableListOf())).also {
                                checkKnown("choices", it).add(choice)
                            }
                    }

                    /** Alias for calling [addChoice] with `Choice.ofChoices(choices)`. */
                    fun addChoice(choices: Choice.Choices) = addChoice(Choice.ofChoices(choices))

                    /**
                     * Alias for calling [addChoice] with
                     * `Choice.ofStreamingChoices(streamingChoices)`.
                     */
                    fun addChoice(streamingChoices: Choice.StreamingChoices) =
                        addChoice(Choice.ofStreamingChoices(streamingChoices))

                    fun created(created: Long) = created(JsonField.of(created))

                    /**
                     * Sets [Builder.created] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.created] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun created(created: JsonField<Long>) = apply { this.created = created }

                    fun object_(object_: String) = object_(JsonField.of(object_))

                    /**
                     * Sets [Builder.object_] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.object_] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

                    fun model(model: String?) = model(JsonField.ofNullable(model))

                    /**
                     * Sets [Builder.model] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.model] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun model(model: JsonField<String>) = apply { this.model = model }

                    fun systemFingerprint(systemFingerprint: String?) =
                        systemFingerprint(JsonField.ofNullable(systemFingerprint))

                    /**
                     * Sets [Builder.systemFingerprint] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.systemFingerprint] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun systemFingerprint(systemFingerprint: JsonField<String>) = apply {
                        this.systemFingerprint = systemFingerprint
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [ModelResponse].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .choices()
                     * .created()
                     * .object_()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): ModelResponse =
                        ModelResponse(
                            checkRequired("id", id),
                            checkRequired("choices", choices).map { it.toImmutable() },
                            checkRequired("created", created),
                            checkRequired("object_", object_),
                            model,
                            systemFingerprint,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): ModelResponse = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    choices().forEach { it.validate() }
                    created()
                    object_()
                    model()
                    systemFingerprint()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: HanzoInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (if (id.asKnown() == null) 0 else 1) +
                        (choices.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                        (if (created.asKnown() == null) 0 else 1) +
                        (if (object_.asKnown() == null) 0 else 1) +
                        (if (model.asKnown() == null) 0 else 1) +
                        (if (systemFingerprint.asKnown() == null) 0 else 1)

                @JsonDeserialize(using = Choice.Deserializer::class)
                @JsonSerialize(using = Choice.Serializer::class)
                class Choice
                private constructor(
                    private val choices: Choices? = null,
                    private val streamingChoices: StreamingChoices? = null,
                    private val _json: JsonValue? = null,
                ) {

                    fun choices(): Choices? = choices

                    fun streamingChoices(): StreamingChoices? = streamingChoices

                    fun isChoices(): Boolean = choices != null

                    fun isStreamingChoices(): Boolean = streamingChoices != null

                    fun asChoices(): Choices = choices.getOrThrow("choices")

                    fun asStreamingChoices(): StreamingChoices =
                        streamingChoices.getOrThrow("streamingChoices")

                    fun _json(): JsonValue? = _json

                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            choices != null -> visitor.visitChoices(choices)
                            streamingChoices != null ->
                                visitor.visitStreamingChoices(streamingChoices)
                            else -> visitor.unknown(_json)
                        }

                    private var validated: Boolean = false

                    fun validate(): Choice = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitChoices(choices: Choices) {
                                    choices.validate()
                                }

                                override fun visitStreamingChoices(
                                    streamingChoices: StreamingChoices
                                ) {
                                    streamingChoices.validate()
                                }
                            }
                        )
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: HanzoInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    internal fun validity(): Int =
                        accept(
                            object : Visitor<Int> {
                                override fun visitChoices(choices: Choices) = choices.validity()

                                override fun visitStreamingChoices(
                                    streamingChoices: StreamingChoices
                                ) = streamingChoices.validity()

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Choice &&
                            choices == other.choices &&
                            streamingChoices == other.streamingChoices
                    }

                    override fun hashCode(): Int = Objects.hash(choices, streamingChoices)

                    override fun toString(): String =
                        when {
                            choices != null -> "Choice{choices=$choices}"
                            streamingChoices != null -> "Choice{streamingChoices=$streamingChoices}"
                            _json != null -> "Choice{_unknown=$_json}"
                            else -> throw IllegalStateException("Invalid Choice")
                        }

                    companion object {

                        fun ofChoices(choices: Choices) = Choice(choices = choices)

                        fun ofStreamingChoices(streamingChoices: StreamingChoices) =
                            Choice(streamingChoices = streamingChoices)
                    }

                    /**
                     * An interface that defines how to map each variant of [Choice] to a value of
                     * type [T].
                     */
                    interface Visitor<out T> {

                        fun visitChoices(choices: Choices): T

                        fun visitStreamingChoices(streamingChoices: StreamingChoices): T

                        /**
                         * Maps an unknown variant of [Choice] to a value of type [T].
                         *
                         * An instance of [Choice] can contain an unknown variant if it was
                         * deserialized from data that doesn't match any known variant. For example,
                         * if the SDK is on an older version than the API, then the API may respond
                         * with new variants that the SDK is unaware of.
                         *
                         * @throws HanzoInvalidDataException in the default implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw HanzoInvalidDataException("Unknown Choice: $json")
                        }
                    }

                    internal class Deserializer : BaseDeserializer<Choice>(Choice::class) {

                        override fun ObjectCodec.deserialize(node: JsonNode): Choice {
                            val json = JsonValue.fromJsonNode(node)

                            val bestMatches =
                                sequenceOf(
                                        tryDeserialize(node, jacksonTypeRef<Choices>())?.let {
                                            Choice(choices = it, _json = json)
                                        },
                                        tryDeserialize(node, jacksonTypeRef<StreamingChoices>())
                                            ?.let { Choice(streamingChoices = it, _json = json) },
                                    )
                                    .filterNotNull()
                                    .allMaxBy { it.validity() }
                                    .toList()
                            return when (bestMatches.size) {
                                // This can happen if what we're deserializing is completely
                                // incompatible with all the possible variants (e.g. deserializing
                                // from boolean).
                                0 -> Choice(_json = json)
                                1 -> bestMatches.single()
                                // If there's more than one match with the highest validity, then
                                // use the first completely valid match, or simply the first match
                                // if none are completely valid.
                                else ->
                                    bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                            }
                        }
                    }

                    internal class Serializer : BaseSerializer<Choice>(Choice::class) {

                        override fun serialize(
                            value: Choice,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.choices != null -> generator.writeObject(value.choices)
                                value.streamingChoices != null ->
                                    generator.writeObject(value.streamingChoices)
                                value._json != null -> generator.writeObject(value._json)
                                else -> throw IllegalStateException("Invalid Choice")
                            }
                        }
                    }

                    class Choices
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val finishReason: JsonField<String>,
                        private val index: JsonField<Long>,
                        private val message: JsonField<Message>,
                        private val logprobs: JsonField<Logprobs>,
                        private val providerSpecificFields: JsonField<ProviderSpecificFields>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("finish_reason")
                            @ExcludeMissing
                            finishReason: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("index")
                            @ExcludeMissing
                            index: JsonField<Long> = JsonMissing.of(),
                            @JsonProperty("message")
                            @ExcludeMissing
                            message: JsonField<Message> = JsonMissing.of(),
                            @JsonProperty("logprobs")
                            @ExcludeMissing
                            logprobs: JsonField<Logprobs> = JsonMissing.of(),
                            @JsonProperty("provider_specific_fields")
                            @ExcludeMissing
                            providerSpecificFields: JsonField<ProviderSpecificFields> =
                                JsonMissing.of(),
                        ) : this(
                            finishReason,
                            index,
                            message,
                            logprobs,
                            providerSpecificFields,
                            mutableMapOf(),
                        )

                        /**
                         * @throws HanzoInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun finishReason(): String = finishReason.getRequired("finish_reason")

                        /**
                         * @throws HanzoInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun index(): Long = index.getRequired("index")

                        /**
                         * @throws HanzoInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun message(): Message = message.getRequired("message")

                        /**
                         * @throws HanzoInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun logprobs(): Logprobs? = logprobs.getNullable("logprobs")

                        /**
                         * @throws HanzoInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun providerSpecificFields(): ProviderSpecificFields? =
                            providerSpecificFields.getNullable("provider_specific_fields")

                        /**
                         * Returns the raw JSON value of [finishReason].
                         *
                         * Unlike [finishReason], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("finish_reason")
                        @ExcludeMissing
                        fun _finishReason(): JsonField<String> = finishReason

                        /**
                         * Returns the raw JSON value of [index].
                         *
                         * Unlike [index], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("index") @ExcludeMissing fun _index(): JsonField<Long> = index

                        /**
                         * Returns the raw JSON value of [message].
                         *
                         * Unlike [message], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("message")
                        @ExcludeMissing
                        fun _message(): JsonField<Message> = message

                        /**
                         * Returns the raw JSON value of [logprobs].
                         *
                         * Unlike [logprobs], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("logprobs")
                        @ExcludeMissing
                        fun _logprobs(): JsonField<Logprobs> = logprobs

                        /**
                         * Returns the raw JSON value of [providerSpecificFields].
                         *
                         * Unlike [providerSpecificFields], this method doesn't throw if the JSON
                         * field has an unexpected type.
                         */
                        @JsonProperty("provider_specific_fields")
                        @ExcludeMissing
                        fun _providerSpecificFields(): JsonField<ProviderSpecificFields> =
                            providerSpecificFields

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
                             * Returns a mutable builder for constructing an instance of [Choices].
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .finishReason()
                             * .index()
                             * .message()
                             * ```
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [Choices]. */
                        class Builder internal constructor() {

                            private var finishReason: JsonField<String>? = null
                            private var index: JsonField<Long>? = null
                            private var message: JsonField<Message>? = null
                            private var logprobs: JsonField<Logprobs> = JsonMissing.of()
                            private var providerSpecificFields: JsonField<ProviderSpecificFields> =
                                JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(choices: Choices) = apply {
                                finishReason = choices.finishReason
                                index = choices.index
                                message = choices.message
                                logprobs = choices.logprobs
                                providerSpecificFields = choices.providerSpecificFields
                                additionalProperties = choices.additionalProperties.toMutableMap()
                            }

                            fun finishReason(finishReason: String) =
                                finishReason(JsonField.of(finishReason))

                            /**
                             * Sets [Builder.finishReason] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.finishReason] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun finishReason(finishReason: JsonField<String>) = apply {
                                this.finishReason = finishReason
                            }

                            fun index(index: Long) = index(JsonField.of(index))

                            /**
                             * Sets [Builder.index] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.index] with a well-typed [Long]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun index(index: JsonField<Long>) = apply { this.index = index }

                            fun message(message: Message) = message(JsonField.of(message))

                            /**
                             * Sets [Builder.message] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.message] with a well-typed [Message]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun message(message: JsonField<Message>) = apply {
                                this.message = message
                            }

                            fun logprobs(logprobs: Logprobs?) =
                                logprobs(JsonField.ofNullable(logprobs))

                            /**
                             * Sets [Builder.logprobs] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.logprobs] with a well-typed
                             * [Logprobs] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun logprobs(logprobs: JsonField<Logprobs>) = apply {
                                this.logprobs = logprobs
                            }

                            /** Alias for calling [logprobs] with `Logprobs.ofChoice(choice)`. */
                            fun logprobs(choice: Logprobs.ChoiceLogprobs) =
                                logprobs(Logprobs.ofChoice(choice))

                            /**
                             * Alias for calling [logprobs] with `Logprobs.ofJsonValue(jsonValue)`.
                             */
                            fun logprobs(jsonValue: JsonValue) =
                                logprobs(Logprobs.ofJsonValue(jsonValue))

                            fun providerSpecificFields(
                                providerSpecificFields: ProviderSpecificFields?
                            ) = providerSpecificFields(JsonField.ofNullable(providerSpecificFields))

                            /**
                             * Sets [Builder.providerSpecificFields] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.providerSpecificFields] with a
                             * well-typed [ProviderSpecificFields] value instead. This method is
                             * primarily for setting the field to an undocumented or not yet
                             * supported value.
                             */
                            fun providerSpecificFields(
                                providerSpecificFields: JsonField<ProviderSpecificFields>
                            ) = apply { this.providerSpecificFields = providerSpecificFields }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Choices].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .finishReason()
                             * .index()
                             * .message()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): Choices =
                                Choices(
                                    checkRequired("finishReason", finishReason),
                                    checkRequired("index", index),
                                    checkRequired("message", message),
                                    logprobs,
                                    providerSpecificFields,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Choices = apply {
                            if (validated) {
                                return@apply
                            }

                            finishReason()
                            index()
                            message().validate()
                            logprobs()?.validate()
                            providerSpecificFields()?.validate()
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: HanzoInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            (if (finishReason.asKnown() == null) 0 else 1) +
                                (if (index.asKnown() == null) 0 else 1) +
                                (message.asKnown()?.validity() ?: 0) +
                                (logprobs.asKnown()?.validity() ?: 0) +
                                (providerSpecificFields.asKnown()?.validity() ?: 0)

                        class Message
                        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                        private constructor(
                            private val content: JsonField<String>,
                            private val functionCall: JsonField<FunctionCall>,
                            private val role: JsonField<Role>,
                            private val toolCalls: JsonField<List<ToolCall>>,
                            private val annotations: JsonField<List<Annotation>>,
                            private val audio: JsonField<Audio>,
                            private val images: JsonField<List<Image>>,
                            private val providerSpecificFields: JsonField<ProviderSpecificFields>,
                            private val reasoningContent: JsonField<String>,
                            private val thinkingBlocks: JsonField<List<ThinkingBlock>>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("content")
                                @ExcludeMissing
                                content: JsonField<String> = JsonMissing.of(),
                                @JsonProperty("function_call")
                                @ExcludeMissing
                                functionCall: JsonField<FunctionCall> = JsonMissing.of(),
                                @JsonProperty("role")
                                @ExcludeMissing
                                role: JsonField<Role> = JsonMissing.of(),
                                @JsonProperty("tool_calls")
                                @ExcludeMissing
                                toolCalls: JsonField<List<ToolCall>> = JsonMissing.of(),
                                @JsonProperty("annotations")
                                @ExcludeMissing
                                annotations: JsonField<List<Annotation>> = JsonMissing.of(),
                                @JsonProperty("audio")
                                @ExcludeMissing
                                audio: JsonField<Audio> = JsonMissing.of(),
                                @JsonProperty("images")
                                @ExcludeMissing
                                images: JsonField<List<Image>> = JsonMissing.of(),
                                @JsonProperty("provider_specific_fields")
                                @ExcludeMissing
                                providerSpecificFields: JsonField<ProviderSpecificFields> =
                                    JsonMissing.of(),
                                @JsonProperty("reasoning_content")
                                @ExcludeMissing
                                reasoningContent: JsonField<String> = JsonMissing.of(),
                                @JsonProperty("thinking_blocks")
                                @ExcludeMissing
                                thinkingBlocks: JsonField<List<ThinkingBlock>> = JsonMissing.of(),
                            ) : this(
                                content,
                                functionCall,
                                role,
                                toolCalls,
                                annotations,
                                audio,
                                images,
                                providerSpecificFields,
                                reasoningContent,
                                thinkingBlocks,
                                mutableMapOf(),
                            )

                            /**
                             * @throws HanzoInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun content(): String? = content.getNullable("content")

                            /**
                             * @throws HanzoInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun functionCall(): FunctionCall? =
                                functionCall.getNullable("function_call")

                            /**
                             * @throws HanzoInvalidDataException if the JSON field has an unexpected
                             *   type or is unexpectedly missing or null (e.g. if the server
                             *   responded with an unexpected value).
                             */
                            fun role(): Role = role.getRequired("role")

                            /**
                             * @throws HanzoInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun toolCalls(): List<ToolCall>? = toolCalls.getNullable("tool_calls")

                            /**
                             * @throws HanzoInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun annotations(): List<Annotation>? =
                                annotations.getNullable("annotations")

                            /**
                             * @throws HanzoInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun audio(): Audio? = audio.getNullable("audio")

                            /**
                             * @throws HanzoInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun images(): List<Image>? = images.getNullable("images")

                            /**
                             * @throws HanzoInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun providerSpecificFields(): ProviderSpecificFields? =
                                providerSpecificFields.getNullable("provider_specific_fields")

                            /**
                             * @throws HanzoInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun reasoningContent(): String? =
                                reasoningContent.getNullable("reasoning_content")

                            /**
                             * @throws HanzoInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun thinkingBlocks(): List<ThinkingBlock>? =
                                thinkingBlocks.getNullable("thinking_blocks")

                            /**
                             * Returns the raw JSON value of [content].
                             *
                             * Unlike [content], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("content")
                            @ExcludeMissing
                            fun _content(): JsonField<String> = content

                            /**
                             * Returns the raw JSON value of [functionCall].
                             *
                             * Unlike [functionCall], this method doesn't throw if the JSON field
                             * has an unexpected type.
                             */
                            @JsonProperty("function_call")
                            @ExcludeMissing
                            fun _functionCall(): JsonField<FunctionCall> = functionCall

                            /**
                             * Returns the raw JSON value of [role].
                             *
                             * Unlike [role], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("role")
                            @ExcludeMissing
                            fun _role(): JsonField<Role> = role

                            /**
                             * Returns the raw JSON value of [toolCalls].
                             *
                             * Unlike [toolCalls], this method doesn't throw if the JSON field has
                             * an unexpected type.
                             */
                            @JsonProperty("tool_calls")
                            @ExcludeMissing
                            fun _toolCalls(): JsonField<List<ToolCall>> = toolCalls

                            /**
                             * Returns the raw JSON value of [annotations].
                             *
                             * Unlike [annotations], this method doesn't throw if the JSON field has
                             * an unexpected type.
                             */
                            @JsonProperty("annotations")
                            @ExcludeMissing
                            fun _annotations(): JsonField<List<Annotation>> = annotations

                            /**
                             * Returns the raw JSON value of [audio].
                             *
                             * Unlike [audio], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("audio")
                            @ExcludeMissing
                            fun _audio(): JsonField<Audio> = audio

                            /**
                             * Returns the raw JSON value of [images].
                             *
                             * Unlike [images], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("images")
                            @ExcludeMissing
                            fun _images(): JsonField<List<Image>> = images

                            /**
                             * Returns the raw JSON value of [providerSpecificFields].
                             *
                             * Unlike [providerSpecificFields], this method doesn't throw if the
                             * JSON field has an unexpected type.
                             */
                            @JsonProperty("provider_specific_fields")
                            @ExcludeMissing
                            fun _providerSpecificFields(): JsonField<ProviderSpecificFields> =
                                providerSpecificFields

                            /**
                             * Returns the raw JSON value of [reasoningContent].
                             *
                             * Unlike [reasoningContent], this method doesn't throw if the JSON
                             * field has an unexpected type.
                             */
                            @JsonProperty("reasoning_content")
                            @ExcludeMissing
                            fun _reasoningContent(): JsonField<String> = reasoningContent

                            /**
                             * Returns the raw JSON value of [thinkingBlocks].
                             *
                             * Unlike [thinkingBlocks], this method doesn't throw if the JSON field
                             * has an unexpected type.
                             */
                            @JsonProperty("thinking_blocks")
                            @ExcludeMissing
                            fun _thinkingBlocks(): JsonField<List<ThinkingBlock>> = thinkingBlocks

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
                                 * Returns a mutable builder for constructing an instance of
                                 * [Message].
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .content()
                                 * .functionCall()
                                 * .role()
                                 * .toolCalls()
                                 * ```
                                 */
                                fun builder() = Builder()
                            }

                            /** A builder for [Message]. */
                            class Builder internal constructor() {

                                private var content: JsonField<String>? = null
                                private var functionCall: JsonField<FunctionCall>? = null
                                private var role: JsonField<Role>? = null
                                private var toolCalls: JsonField<MutableList<ToolCall>>? = null
                                private var annotations: JsonField<MutableList<Annotation>>? = null
                                private var audio: JsonField<Audio> = JsonMissing.of()
                                private var images: JsonField<MutableList<Image>>? = null
                                private var providerSpecificFields:
                                    JsonField<ProviderSpecificFields> =
                                    JsonMissing.of()
                                private var reasoningContent: JsonField<String> = JsonMissing.of()
                                private var thinkingBlocks: JsonField<MutableList<ThinkingBlock>>? =
                                    null
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(message: Message) = apply {
                                    content = message.content
                                    functionCall = message.functionCall
                                    role = message.role
                                    toolCalls = message.toolCalls.map { it.toMutableList() }
                                    annotations = message.annotations.map { it.toMutableList() }
                                    audio = message.audio
                                    images = message.images.map { it.toMutableList() }
                                    providerSpecificFields = message.providerSpecificFields
                                    reasoningContent = message.reasoningContent
                                    thinkingBlocks =
                                        message.thinkingBlocks.map { it.toMutableList() }
                                    additionalProperties =
                                        message.additionalProperties.toMutableMap()
                                }

                                fun content(content: String?) =
                                    content(JsonField.ofNullable(content))

                                /**
                                 * Sets [Builder.content] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.content] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun content(content: JsonField<String>) = apply {
                                    this.content = content
                                }

                                fun functionCall(functionCall: FunctionCall?) =
                                    functionCall(JsonField.ofNullable(functionCall))

                                /**
                                 * Sets [Builder.functionCall] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.functionCall] with a well-typed
                                 * [FunctionCall] value instead. This method is primarily for
                                 * setting the field to an undocumented or not yet supported value.
                                 */
                                fun functionCall(functionCall: JsonField<FunctionCall>) = apply {
                                    this.functionCall = functionCall
                                }

                                fun role(role: Role) = role(JsonField.of(role))

                                /**
                                 * Sets [Builder.role] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.role] with a well-typed [Role]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun role(role: JsonField<Role>) = apply { this.role = role }

                                fun toolCalls(toolCalls: List<ToolCall>?) =
                                    toolCalls(JsonField.ofNullable(toolCalls))

                                /**
                                 * Sets [Builder.toolCalls] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.toolCalls] with a well-typed
                                 * `List<ToolCall>` value instead. This method is primarily for
                                 * setting the field to an undocumented or not yet supported value.
                                 */
                                fun toolCalls(toolCalls: JsonField<List<ToolCall>>) = apply {
                                    this.toolCalls = toolCalls.map { it.toMutableList() }
                                }

                                /**
                                 * Adds a single [ToolCall] to [toolCalls].
                                 *
                                 * @throws IllegalStateException if the field was previously set to
                                 *   a non-list.
                                 */
                                fun addToolCall(toolCall: ToolCall) = apply {
                                    toolCalls =
                                        (toolCalls ?: JsonField.of(mutableListOf())).also {
                                            checkKnown("toolCalls", it).add(toolCall)
                                        }
                                }

                                fun annotations(annotations: List<Annotation>?) =
                                    annotations(JsonField.ofNullable(annotations))

                                /**
                                 * Sets [Builder.annotations] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.annotations] with a well-typed
                                 * `List<Annotation>` value instead. This method is primarily for
                                 * setting the field to an undocumented or not yet supported value.
                                 */
                                fun annotations(annotations: JsonField<List<Annotation>>) = apply {
                                    this.annotations = annotations.map { it.toMutableList() }
                                }

                                /**
                                 * Adds a single [Annotation] to [annotations].
                                 *
                                 * @throws IllegalStateException if the field was previously set to
                                 *   a non-list.
                                 */
                                fun addAnnotation(annotation: Annotation) = apply {
                                    annotations =
                                        (annotations ?: JsonField.of(mutableListOf())).also {
                                            checkKnown("annotations", it).add(annotation)
                                        }
                                }

                                fun audio(audio: Audio?) = audio(JsonField.ofNullable(audio))

                                /**
                                 * Sets [Builder.audio] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.audio] with a well-typed [Audio]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun audio(audio: JsonField<Audio>) = apply { this.audio = audio }

                                fun images(images: List<Image>?) =
                                    images(JsonField.ofNullable(images))

                                /**
                                 * Sets [Builder.images] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.images] with a well-typed
                                 * `List<Image>` value instead. This method is primarily for setting
                                 * the field to an undocumented or not yet supported value.
                                 */
                                fun images(images: JsonField<List<Image>>) = apply {
                                    this.images = images.map { it.toMutableList() }
                                }

                                /**
                                 * Adds a single [Image] to [images].
                                 *
                                 * @throws IllegalStateException if the field was previously set to
                                 *   a non-list.
                                 */
                                fun addImage(image: Image) = apply {
                                    images =
                                        (images ?: JsonField.of(mutableListOf())).also {
                                            checkKnown("images", it).add(image)
                                        }
                                }

                                fun providerSpecificFields(
                                    providerSpecificFields: ProviderSpecificFields?
                                ) =
                                    providerSpecificFields(
                                        JsonField.ofNullable(providerSpecificFields)
                                    )

                                /**
                                 * Sets [Builder.providerSpecificFields] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.providerSpecificFields] with a
                                 * well-typed [ProviderSpecificFields] value instead. This method is
                                 * primarily for setting the field to an undocumented or not yet
                                 * supported value.
                                 */
                                fun providerSpecificFields(
                                    providerSpecificFields: JsonField<ProviderSpecificFields>
                                ) = apply { this.providerSpecificFields = providerSpecificFields }

                                fun reasoningContent(reasoningContent: String?) =
                                    reasoningContent(JsonField.ofNullable(reasoningContent))

                                /**
                                 * Sets [Builder.reasoningContent] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.reasoningContent] with a
                                 * well-typed [String] value instead. This method is primarily for
                                 * setting the field to an undocumented or not yet supported value.
                                 */
                                fun reasoningContent(reasoningContent: JsonField<String>) = apply {
                                    this.reasoningContent = reasoningContent
                                }

                                fun thinkingBlocks(thinkingBlocks: List<ThinkingBlock>?) =
                                    thinkingBlocks(JsonField.ofNullable(thinkingBlocks))

                                /**
                                 * Sets [Builder.thinkingBlocks] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.thinkingBlocks] with a
                                 * well-typed `List<ThinkingBlock>` value instead. This method is
                                 * primarily for setting the field to an undocumented or not yet
                                 * supported value.
                                 */
                                fun thinkingBlocks(thinkingBlocks: JsonField<List<ThinkingBlock>>) =
                                    apply {
                                        this.thinkingBlocks =
                                            thinkingBlocks.map { it.toMutableList() }
                                    }

                                /**
                                 * Adds a single [ThinkingBlock] to [thinkingBlocks].
                                 *
                                 * @throws IllegalStateException if the field was previously set to
                                 *   a non-list.
                                 */
                                fun addThinkingBlock(thinkingBlock: ThinkingBlock) = apply {
                                    thinkingBlocks =
                                        (thinkingBlocks ?: JsonField.of(mutableListOf())).also {
                                            checkKnown("thinkingBlocks", it).add(thinkingBlock)
                                        }
                                }

                                /**
                                 * Alias for calling [addThinkingBlock] with
                                 * `ThinkingBlock.ofChatCompletion(chatCompletion)`.
                                 */
                                fun addThinkingBlock(
                                    chatCompletion: ThinkingBlock.ChatCompletionThinkingBlock
                                ) = addThinkingBlock(ThinkingBlock.ofChatCompletion(chatCompletion))

                                /**
                                 * Alias for calling [addThinkingBlock] with
                                 * `ThinkingBlock.ofChatCompletionRedacted(chatCompletionRedacted)`.
                                 */
                                fun addThinkingBlock(
                                    chatCompletionRedacted:
                                        ThinkingBlock.ChatCompletionRedactedThinkingBlock
                                ) =
                                    addThinkingBlock(
                                        ThinkingBlock.ofChatCompletionRedacted(
                                            chatCompletionRedacted
                                        )
                                    )

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [Message].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .content()
                                 * .functionCall()
                                 * .role()
                                 * .toolCalls()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): Message =
                                    Message(
                                        checkRequired("content", content),
                                        checkRequired("functionCall", functionCall),
                                        checkRequired("role", role),
                                        checkRequired("toolCalls", toolCalls).map {
                                            it.toImmutable()
                                        },
                                        (annotations ?: JsonMissing.of()).map { it.toImmutable() },
                                        audio,
                                        (images ?: JsonMissing.of()).map { it.toImmutable() },
                                        providerSpecificFields,
                                        reasoningContent,
                                        (thinkingBlocks ?: JsonMissing.of()).map {
                                            it.toImmutable()
                                        },
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            fun validate(): Message = apply {
                                if (validated) {
                                    return@apply
                                }

                                content()
                                functionCall()?.validate()
                                role().validate()
                                toolCalls()?.forEach { it.validate() }
                                annotations()?.forEach { it.validate() }
                                audio()?.validate()
                                images()?.forEach { it.validate() }
                                providerSpecificFields()?.validate()
                                reasoningContent()
                                thinkingBlocks()?.forEach { it.validate() }
                                validated = true
                            }

                            fun isValid(): Boolean =
                                try {
                                    validate()
                                    true
                                } catch (e: HanzoInvalidDataException) {
                                    false
                                }

                            /**
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                (if (content.asKnown() == null) 0 else 1) +
                                    (functionCall.asKnown()?.validity() ?: 0) +
                                    (role.asKnown()?.validity() ?: 0) +
                                    (toolCalls.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                                    (annotations.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                                    (audio.asKnown()?.validity() ?: 0) +
                                    (images.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                                    (providerSpecificFields.asKnown()?.validity() ?: 0) +
                                    (if (reasoningContent.asKnown() == null) 0 else 1) +
                                    (thinkingBlocks.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

                            class FunctionCall
                            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                            private constructor(
                                private val arguments: JsonField<String>,
                                private val name: JsonField<String>,
                                private val additionalProperties: MutableMap<String, JsonValue>,
                            ) {

                                @JsonCreator
                                private constructor(
                                    @JsonProperty("arguments")
                                    @ExcludeMissing
                                    arguments: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("name")
                                    @ExcludeMissing
                                    name: JsonField<String> = JsonMissing.of(),
                                ) : this(arguments, name, mutableMapOf())

                                /**
                                 * @throws HanzoInvalidDataException if the JSON field has an
                                 *   unexpected type or is unexpectedly missing or null (e.g. if the
                                 *   server responded with an unexpected value).
                                 */
                                fun arguments(): String = arguments.getRequired("arguments")

                                /**
                                 * @throws HanzoInvalidDataException if the JSON field has an
                                 *   unexpected type (e.g. if the server responded with an
                                 *   unexpected value).
                                 */
                                fun name(): String? = name.getNullable("name")

                                /**
                                 * Returns the raw JSON value of [arguments].
                                 *
                                 * Unlike [arguments], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("arguments")
                                @ExcludeMissing
                                fun _arguments(): JsonField<String> = arguments

                                /**
                                 * Returns the raw JSON value of [name].
                                 *
                                 * Unlike [name], this method doesn't throw if the JSON field has an
                                 * unexpected type.
                                 */
                                @JsonProperty("name")
                                @ExcludeMissing
                                fun _name(): JsonField<String> = name

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
                                     * Returns a mutable builder for constructing an instance of
                                     * [FunctionCall].
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .arguments()
                                     * ```
                                     */
                                    fun builder() = Builder()
                                }

                                /** A builder for [FunctionCall]. */
                                class Builder internal constructor() {

                                    private var arguments: JsonField<String>? = null
                                    private var name: JsonField<String> = JsonMissing.of()
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    internal fun from(functionCall: FunctionCall) = apply {
                                        arguments = functionCall.arguments
                                        name = functionCall.name
                                        additionalProperties =
                                            functionCall.additionalProperties.toMutableMap()
                                    }

                                    fun arguments(arguments: String) =
                                        arguments(JsonField.of(arguments))

                                    /**
                                     * Sets [Builder.arguments] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.arguments] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun arguments(arguments: JsonField<String>) = apply {
                                        this.arguments = arguments
                                    }

                                    fun name(name: String?) = name(JsonField.ofNullable(name))

                                    /**
                                     * Sets [Builder.name] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.name] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun name(name: JsonField<String>) = apply { this.name = name }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [FunctionCall].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .arguments()
                                     * ```
                                     *
                                     * @throws IllegalStateException if any required field is unset.
                                     */
                                    fun build(): FunctionCall =
                                        FunctionCall(
                                            checkRequired("arguments", arguments),
                                            name,
                                            additionalProperties.toMutableMap(),
                                        )
                                }

                                private var validated: Boolean = false

                                fun validate(): FunctionCall = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    arguments()
                                    name()
                                    validated = true
                                }

                                fun isValid(): Boolean =
                                    try {
                                        validate()
                                        true
                                    } catch (e: HanzoInvalidDataException) {
                                        false
                                    }

                                /**
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    (if (arguments.asKnown() == null) 0 else 1) +
                                        (if (name.asKnown() == null) 0 else 1)

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is FunctionCall &&
                                        arguments == other.arguments &&
                                        name == other.name &&
                                        additionalProperties == other.additionalProperties
                                }

                                private val hashCode: Int by lazy {
                                    Objects.hash(arguments, name, additionalProperties)
                                }

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "FunctionCall{arguments=$arguments, name=$name, additionalProperties=$additionalProperties}"
                            }

                            class Role
                            @JsonCreator
                            private constructor(private val value: JsonField<String>) : Enum {

                                /**
                                 * Returns this class instance's raw value.
                                 *
                                 * This is usually only useful if this instance was deserialized
                                 * from data that doesn't match any known member, and you want to
                                 * know that value. For example, if the SDK is on an older version
                                 * than the API, then the API may respond with new members that the
                                 * SDK is unaware of.
                                 */
                                @com.fasterxml.jackson.annotation.JsonValue
                                fun _value(): JsonField<String> = value

                                companion object {

                                    val ASSISTANT = of("assistant")

                                    val USER = of("user")

                                    val SYSTEM = of("system")

                                    val TOOL = of("tool")

                                    val FUNCTION = of("function")

                                    fun of(value: String) = Role(JsonField.of(value))
                                }

                                /** An enum containing [Role]'s known values. */
                                enum class Known {
                                    ASSISTANT,
                                    USER,
                                    SYSTEM,
                                    TOOL,
                                    FUNCTION,
                                }

                                /**
                                 * An enum containing [Role]'s known values, as well as an
                                 * [_UNKNOWN] member.
                                 *
                                 * An instance of [Role] can contain an unknown value in a couple of
                                 * cases:
                                 * - It was deserialized from data that doesn't match any known
                                 *   member. For example, if the SDK is on an older version than the
                                 *   API, then the API may respond with new members that the SDK is
                                 *   unaware of.
                                 * - It was constructed with an arbitrary value using the [of]
                                 *   method.
                                 */
                                enum class Value {
                                    ASSISTANT,
                                    USER,
                                    SYSTEM,
                                    TOOL,
                                    FUNCTION,
                                    /**
                                     * An enum member indicating that [Role] was instantiated with
                                     * an unknown value.
                                     */
                                    _UNKNOWN,
                                }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value, or [Value._UNKNOWN] if the class was instantiated with an
                                 * unknown value.
                                 *
                                 * Use the [known] method instead if you're certain the value is
                                 * always known or if you want to throw for the unknown case.
                                 */
                                fun value(): Value =
                                    when (this) {
                                        ASSISTANT -> Value.ASSISTANT
                                        USER -> Value.USER
                                        SYSTEM -> Value.SYSTEM
                                        TOOL -> Value.TOOL
                                        FUNCTION -> Value.FUNCTION
                                        else -> Value._UNKNOWN
                                    }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value.
                                 *
                                 * Use the [value] method instead if you're uncertain the value is
                                 * always known and don't want to throw for the unknown case.
                                 *
                                 * @throws HanzoInvalidDataException if this class instance's value
                                 *   is a not a known member.
                                 */
                                fun known(): Known =
                                    when (this) {
                                        ASSISTANT -> Known.ASSISTANT
                                        USER -> Known.USER
                                        SYSTEM -> Known.SYSTEM
                                        TOOL -> Known.TOOL
                                        FUNCTION -> Known.FUNCTION
                                        else ->
                                            throw HanzoInvalidDataException("Unknown Role: $value")
                                    }

                                /**
                                 * Returns this class instance's primitive wire representation.
                                 *
                                 * This differs from the [toString] method because that method is
                                 * primarily for debugging and generally doesn't throw.
                                 *
                                 * @throws HanzoInvalidDataException if this class instance's value
                                 *   does not have the expected primitive type.
                                 */
                                fun asString(): String =
                                    _value().asString()
                                        ?: throw HanzoInvalidDataException("Value is not a String")

                                private var validated: Boolean = false

                                fun validate(): Role = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    known()
                                    validated = true
                                }

                                fun isValid(): Boolean =
                                    try {
                                        validate()
                                        true
                                    } catch (e: HanzoInvalidDataException) {
                                        false
                                    }

                                /**
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    if (value() == Value._UNKNOWN) 0 else 1

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Role && value == other.value
                                }

                                override fun hashCode() = value.hashCode()

                                override fun toString() = value.toString()
                            }

                            class ToolCall
                            @JsonCreator
                            private constructor(
                                @com.fasterxml.jackson.annotation.JsonValue
                                private val additionalProperties: Map<String, JsonValue>
                            ) {

                                @JsonAnyGetter
                                @ExcludeMissing
                                fun _additionalProperties(): Map<String, JsonValue> =
                                    additionalProperties

                                fun toBuilder() = Builder().from(this)

                                companion object {

                                    /**
                                     * Returns a mutable builder for constructing an instance of
                                     * [ToolCall].
                                     */
                                    fun builder() = Builder()
                                }

                                /** A builder for [ToolCall]. */
                                class Builder internal constructor() {

                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    internal fun from(toolCall: ToolCall) = apply {
                                        additionalProperties =
                                            toolCall.additionalProperties.toMutableMap()
                                    }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [ToolCall].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     */
                                    fun build(): ToolCall =
                                        ToolCall(additionalProperties.toImmutable())
                                }

                                private var validated: Boolean = false

                                fun validate(): ToolCall = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    validated = true
                                }

                                fun isValid(): Boolean =
                                    try {
                                        validate()
                                        true
                                    } catch (e: HanzoInvalidDataException) {
                                        false
                                    }

                                /**
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    additionalProperties.count { (_, value) ->
                                        !value.isNull() && !value.isMissing()
                                    }

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is ToolCall &&
                                        additionalProperties == other.additionalProperties
                                }

                                private val hashCode: Int by lazy {
                                    Objects.hash(additionalProperties)
                                }

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "ToolCall{additionalProperties=$additionalProperties}"
                            }

                            class Annotation
                            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                            private constructor(
                                private val type: JsonField<Type>,
                                private val urlCitation: JsonField<UrlCitation>,
                                private val additionalProperties: MutableMap<String, JsonValue>,
                            ) {

                                @JsonCreator
                                private constructor(
                                    @JsonProperty("type")
                                    @ExcludeMissing
                                    type: JsonField<Type> = JsonMissing.of(),
                                    @JsonProperty("url_citation")
                                    @ExcludeMissing
                                    urlCitation: JsonField<UrlCitation> = JsonMissing.of(),
                                ) : this(type, urlCitation, mutableMapOf())

                                /**
                                 * @throws HanzoInvalidDataException if the JSON field has an
                                 *   unexpected type (e.g. if the server responded with an
                                 *   unexpected value).
                                 */
                                fun type(): Type? = type.getNullable("type")

                                /**
                                 * @throws HanzoInvalidDataException if the JSON field has an
                                 *   unexpected type (e.g. if the server responded with an
                                 *   unexpected value).
                                 */
                                fun urlCitation(): UrlCitation? =
                                    urlCitation.getNullable("url_citation")

                                /**
                                 * Returns the raw JSON value of [type].
                                 *
                                 * Unlike [type], this method doesn't throw if the JSON field has an
                                 * unexpected type.
                                 */
                                @JsonProperty("type")
                                @ExcludeMissing
                                fun _type(): JsonField<Type> = type

                                /**
                                 * Returns the raw JSON value of [urlCitation].
                                 *
                                 * Unlike [urlCitation], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("url_citation")
                                @ExcludeMissing
                                fun _urlCitation(): JsonField<UrlCitation> = urlCitation

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
                                     * Returns a mutable builder for constructing an instance of
                                     * [Annotation].
                                     */
                                    fun builder() = Builder()
                                }

                                /** A builder for [Annotation]. */
                                class Builder internal constructor() {

                                    private var type: JsonField<Type> = JsonMissing.of()
                                    private var urlCitation: JsonField<UrlCitation> =
                                        JsonMissing.of()
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    internal fun from(annotation: Annotation) = apply {
                                        type = annotation.type
                                        urlCitation = annotation.urlCitation
                                        additionalProperties =
                                            annotation.additionalProperties.toMutableMap()
                                    }

                                    fun type(type: Type) = type(JsonField.of(type))

                                    /**
                                     * Sets [Builder.type] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.type] with a well-typed
                                     * [Type] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun type(type: JsonField<Type>) = apply { this.type = type }

                                    fun urlCitation(urlCitation: UrlCitation) =
                                        urlCitation(JsonField.of(urlCitation))

                                    /**
                                     * Sets [Builder.urlCitation] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.urlCitation] with a
                                     * well-typed [UrlCitation] value instead. This method is
                                     * primarily for setting the field to an undocumented or not yet
                                     * supported value.
                                     */
                                    fun urlCitation(urlCitation: JsonField<UrlCitation>) = apply {
                                        this.urlCitation = urlCitation
                                    }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [Annotation].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     */
                                    fun build(): Annotation =
                                        Annotation(
                                            type,
                                            urlCitation,
                                            additionalProperties.toMutableMap(),
                                        )
                                }

                                private var validated: Boolean = false

                                fun validate(): Annotation = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    type()?.validate()
                                    urlCitation()?.validate()
                                    validated = true
                                }

                                fun isValid(): Boolean =
                                    try {
                                        validate()
                                        true
                                    } catch (e: HanzoInvalidDataException) {
                                        false
                                    }

                                /**
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    (type.asKnown()?.validity() ?: 0) +
                                        (urlCitation.asKnown()?.validity() ?: 0)

                                class Type
                                @JsonCreator
                                private constructor(private val value: JsonField<String>) : Enum {

                                    /**
                                     * Returns this class instance's raw value.
                                     *
                                     * This is usually only useful if this instance was deserialized
                                     * from data that doesn't match any known member, and you want
                                     * to know that value. For example, if the SDK is on an older
                                     * version than the API, then the API may respond with new
                                     * members that the SDK is unaware of.
                                     */
                                    @com.fasterxml.jackson.annotation.JsonValue
                                    fun _value(): JsonField<String> = value

                                    companion object {

                                        val URL_CITATION = of("url_citation")

                                        fun of(value: String) = Type(JsonField.of(value))
                                    }

                                    /** An enum containing [Type]'s known values. */
                                    enum class Known {
                                        URL_CITATION
                                    }

                                    /**
                                     * An enum containing [Type]'s known values, as well as an
                                     * [_UNKNOWN] member.
                                     *
                                     * An instance of [Type] can contain an unknown value in a
                                     * couple of cases:
                                     * - It was deserialized from data that doesn't match any known
                                     *   member. For example, if the SDK is on an older version than
                                     *   the API, then the API may respond with new members that the
                                     *   SDK is unaware of.
                                     * - It was constructed with an arbitrary value using the [of]
                                     *   method.
                                     */
                                    enum class Value {
                                        URL_CITATION,
                                        /**
                                         * An enum member indicating that [Type] was instantiated
                                         * with an unknown value.
                                         */
                                        _UNKNOWN,
                                    }

                                    /**
                                     * Returns an enum member corresponding to this class instance's
                                     * value, or [Value._UNKNOWN] if the class was instantiated with
                                     * an unknown value.
                                     *
                                     * Use the [known] method instead if you're certain the value is
                                     * always known or if you want to throw for the unknown case.
                                     */
                                    fun value(): Value =
                                        when (this) {
                                            URL_CITATION -> Value.URL_CITATION
                                            else -> Value._UNKNOWN
                                        }

                                    /**
                                     * Returns an enum member corresponding to this class instance's
                                     * value.
                                     *
                                     * Use the [value] method instead if you're uncertain the value
                                     * is always known and don't want to throw for the unknown case.
                                     *
                                     * @throws HanzoInvalidDataException if this class instance's
                                     *   value is a not a known member.
                                     */
                                    fun known(): Known =
                                        when (this) {
                                            URL_CITATION -> Known.URL_CITATION
                                            else ->
                                                throw HanzoInvalidDataException(
                                                    "Unknown Type: $value"
                                                )
                                        }

                                    /**
                                     * Returns this class instance's primitive wire representation.
                                     *
                                     * This differs from the [toString] method because that method
                                     * is primarily for debugging and generally doesn't throw.
                                     *
                                     * @throws HanzoInvalidDataException if this class instance's
                                     *   value does not have the expected primitive type.
                                     */
                                    fun asString(): String =
                                        _value().asString()
                                            ?: throw HanzoInvalidDataException(
                                                "Value is not a String"
                                            )

                                    private var validated: Boolean = false

                                    fun validate(): Type = apply {
                                        if (validated) {
                                            return@apply
                                        }

                                        known()
                                        validated = true
                                    }

                                    fun isValid(): Boolean =
                                        try {
                                            validate()
                                            true
                                        } catch (e: HanzoInvalidDataException) {
                                            false
                                        }

                                    /**
                                     * Returns a score indicating how many valid values are
                                     * contained in this object recursively.
                                     *
                                     * Used for best match union deserialization.
                                     */
                                    internal fun validity(): Int =
                                        if (value() == Value._UNKNOWN) 0 else 1

                                    override fun equals(other: Any?): Boolean {
                                        if (this === other) {
                                            return true
                                        }

                                        return other is Type && value == other.value
                                    }

                                    override fun hashCode() = value.hashCode()

                                    override fun toString() = value.toString()
                                }

                                class UrlCitation
                                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                                private constructor(
                                    private val endIndex: JsonField<Long>,
                                    private val startIndex: JsonField<Long>,
                                    private val title: JsonField<String>,
                                    private val url: JsonField<String>,
                                    private val additionalProperties: MutableMap<String, JsonValue>,
                                ) {

                                    @JsonCreator
                                    private constructor(
                                        @JsonProperty("end_index")
                                        @ExcludeMissing
                                        endIndex: JsonField<Long> = JsonMissing.of(),
                                        @JsonProperty("start_index")
                                        @ExcludeMissing
                                        startIndex: JsonField<Long> = JsonMissing.of(),
                                        @JsonProperty("title")
                                        @ExcludeMissing
                                        title: JsonField<String> = JsonMissing.of(),
                                        @JsonProperty("url")
                                        @ExcludeMissing
                                        url: JsonField<String> = JsonMissing.of(),
                                    ) : this(endIndex, startIndex, title, url, mutableMapOf())

                                    /**
                                     * @throws HanzoInvalidDataException if the JSON field has an
                                     *   unexpected type (e.g. if the server responded with an
                                     *   unexpected value).
                                     */
                                    fun endIndex(): Long? = endIndex.getNullable("end_index")

                                    /**
                                     * @throws HanzoInvalidDataException if the JSON field has an
                                     *   unexpected type (e.g. if the server responded with an
                                     *   unexpected value).
                                     */
                                    fun startIndex(): Long? = startIndex.getNullable("start_index")

                                    /**
                                     * @throws HanzoInvalidDataException if the JSON field has an
                                     *   unexpected type (e.g. if the server responded with an
                                     *   unexpected value).
                                     */
                                    fun title(): String? = title.getNullable("title")

                                    /**
                                     * @throws HanzoInvalidDataException if the JSON field has an
                                     *   unexpected type (e.g. if the server responded with an
                                     *   unexpected value).
                                     */
                                    fun url(): String? = url.getNullable("url")

                                    /**
                                     * Returns the raw JSON value of [endIndex].
                                     *
                                     * Unlike [endIndex], this method doesn't throw if the JSON
                                     * field has an unexpected type.
                                     */
                                    @JsonProperty("end_index")
                                    @ExcludeMissing
                                    fun _endIndex(): JsonField<Long> = endIndex

                                    /**
                                     * Returns the raw JSON value of [startIndex].
                                     *
                                     * Unlike [startIndex], this method doesn't throw if the JSON
                                     * field has an unexpected type.
                                     */
                                    @JsonProperty("start_index")
                                    @ExcludeMissing
                                    fun _startIndex(): JsonField<Long> = startIndex

                                    /**
                                     * Returns the raw JSON value of [title].
                                     *
                                     * Unlike [title], this method doesn't throw if the JSON field
                                     * has an unexpected type.
                                     */
                                    @JsonProperty("title")
                                    @ExcludeMissing
                                    fun _title(): JsonField<String> = title

                                    /**
                                     * Returns the raw JSON value of [url].
                                     *
                                     * Unlike [url], this method doesn't throw if the JSON field has
                                     * an unexpected type.
                                     */
                                    @JsonProperty("url")
                                    @ExcludeMissing
                                    fun _url(): JsonField<String> = url

                                    @JsonAnySetter
                                    private fun putAdditionalProperty(
                                        key: String,
                                        value: JsonValue,
                                    ) {
                                        additionalProperties.put(key, value)
                                    }

                                    @JsonAnyGetter
                                    @ExcludeMissing
                                    fun _additionalProperties(): Map<String, JsonValue> =
                                        Collections.unmodifiableMap(additionalProperties)

                                    fun toBuilder() = Builder().from(this)

                                    companion object {

                                        /**
                                         * Returns a mutable builder for constructing an instance of
                                         * [UrlCitation].
                                         */
                                        fun builder() = Builder()
                                    }

                                    /** A builder for [UrlCitation]. */
                                    class Builder internal constructor() {

                                        private var endIndex: JsonField<Long> = JsonMissing.of()
                                        private var startIndex: JsonField<Long> = JsonMissing.of()
                                        private var title: JsonField<String> = JsonMissing.of()
                                        private var url: JsonField<String> = JsonMissing.of()
                                        private var additionalProperties:
                                            MutableMap<String, JsonValue> =
                                            mutableMapOf()

                                        internal fun from(urlCitation: UrlCitation) = apply {
                                            endIndex = urlCitation.endIndex
                                            startIndex = urlCitation.startIndex
                                            title = urlCitation.title
                                            url = urlCitation.url
                                            additionalProperties =
                                                urlCitation.additionalProperties.toMutableMap()
                                        }

                                        fun endIndex(endIndex: Long) =
                                            endIndex(JsonField.of(endIndex))

                                        /**
                                         * Sets [Builder.endIndex] to an arbitrary JSON value.
                                         *
                                         * You should usually call [Builder.endIndex] with a
                                         * well-typed [Long] value instead. This method is primarily
                                         * for setting the field to an undocumented or not yet
                                         * supported value.
                                         */
                                        fun endIndex(endIndex: JsonField<Long>) = apply {
                                            this.endIndex = endIndex
                                        }

                                        fun startIndex(startIndex: Long) =
                                            startIndex(JsonField.of(startIndex))

                                        /**
                                         * Sets [Builder.startIndex] to an arbitrary JSON value.
                                         *
                                         * You should usually call [Builder.startIndex] with a
                                         * well-typed [Long] value instead. This method is primarily
                                         * for setting the field to an undocumented or not yet
                                         * supported value.
                                         */
                                        fun startIndex(startIndex: JsonField<Long>) = apply {
                                            this.startIndex = startIndex
                                        }

                                        fun title(title: String) = title(JsonField.of(title))

                                        /**
                                         * Sets [Builder.title] to an arbitrary JSON value.
                                         *
                                         * You should usually call [Builder.title] with a well-typed
                                         * [String] value instead. This method is primarily for
                                         * setting the field to an undocumented or not yet supported
                                         * value.
                                         */
                                        fun title(title: JsonField<String>) = apply {
                                            this.title = title
                                        }

                                        fun url(url: String) = url(JsonField.of(url))

                                        /**
                                         * Sets [Builder.url] to an arbitrary JSON value.
                                         *
                                         * You should usually call [Builder.url] with a well-typed
                                         * [String] value instead. This method is primarily for
                                         * setting the field to an undocumented or not yet supported
                                         * value.
                                         */
                                        fun url(url: JsonField<String>) = apply { this.url = url }

                                        fun additionalProperties(
                                            additionalProperties: Map<String, JsonValue>
                                        ) = apply {
                                            this.additionalProperties.clear()
                                            putAllAdditionalProperties(additionalProperties)
                                        }

                                        fun putAdditionalProperty(key: String, value: JsonValue) =
                                            apply {
                                                additionalProperties.put(key, value)
                                            }

                                        fun putAllAdditionalProperties(
                                            additionalProperties: Map<String, JsonValue>
                                        ) = apply {
                                            this.additionalProperties.putAll(additionalProperties)
                                        }

                                        fun removeAdditionalProperty(key: String) = apply {
                                            additionalProperties.remove(key)
                                        }

                                        fun removeAllAdditionalProperties(keys: Set<String>) =
                                            apply {
                                                keys.forEach(::removeAdditionalProperty)
                                            }

                                        /**
                                         * Returns an immutable instance of [UrlCitation].
                                         *
                                         * Further updates to this [Builder] will not mutate the
                                         * returned instance.
                                         */
                                        fun build(): UrlCitation =
                                            UrlCitation(
                                                endIndex,
                                                startIndex,
                                                title,
                                                url,
                                                additionalProperties.toMutableMap(),
                                            )
                                    }

                                    private var validated: Boolean = false

                                    fun validate(): UrlCitation = apply {
                                        if (validated) {
                                            return@apply
                                        }

                                        endIndex()
                                        startIndex()
                                        title()
                                        url()
                                        validated = true
                                    }

                                    fun isValid(): Boolean =
                                        try {
                                            validate()
                                            true
                                        } catch (e: HanzoInvalidDataException) {
                                            false
                                        }

                                    /**
                                     * Returns a score indicating how many valid values are
                                     * contained in this object recursively.
                                     *
                                     * Used for best match union deserialization.
                                     */
                                    internal fun validity(): Int =
                                        (if (endIndex.asKnown() == null) 0 else 1) +
                                            (if (startIndex.asKnown() == null) 0 else 1) +
                                            (if (title.asKnown() == null) 0 else 1) +
                                            (if (url.asKnown() == null) 0 else 1)

                                    override fun equals(other: Any?): Boolean {
                                        if (this === other) {
                                            return true
                                        }

                                        return other is UrlCitation &&
                                            endIndex == other.endIndex &&
                                            startIndex == other.startIndex &&
                                            title == other.title &&
                                            url == other.url &&
                                            additionalProperties == other.additionalProperties
                                    }

                                    private val hashCode: Int by lazy {
                                        Objects.hash(
                                            endIndex,
                                            startIndex,
                                            title,
                                            url,
                                            additionalProperties,
                                        )
                                    }

                                    override fun hashCode(): Int = hashCode

                                    override fun toString() =
                                        "UrlCitation{endIndex=$endIndex, startIndex=$startIndex, title=$title, url=$url, additionalProperties=$additionalProperties}"
                                }

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Annotation &&
                                        type == other.type &&
                                        urlCitation == other.urlCitation &&
                                        additionalProperties == other.additionalProperties
                                }

                                private val hashCode: Int by lazy {
                                    Objects.hash(type, urlCitation, additionalProperties)
                                }

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "Annotation{type=$type, urlCitation=$urlCitation, additionalProperties=$additionalProperties}"
                            }

                            class Audio
                            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                            private constructor(
                                private val id: JsonField<String>,
                                private val data: JsonField<String>,
                                private val expiresAt: JsonField<Long>,
                                private val transcript: JsonField<String>,
                                private val additionalProperties: MutableMap<String, JsonValue>,
                            ) {

                                @JsonCreator
                                private constructor(
                                    @JsonProperty("id")
                                    @ExcludeMissing
                                    id: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("data")
                                    @ExcludeMissing
                                    data: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("expires_at")
                                    @ExcludeMissing
                                    expiresAt: JsonField<Long> = JsonMissing.of(),
                                    @JsonProperty("transcript")
                                    @ExcludeMissing
                                    transcript: JsonField<String> = JsonMissing.of(),
                                ) : this(id, data, expiresAt, transcript, mutableMapOf())

                                /**
                                 * @throws HanzoInvalidDataException if the JSON field has an
                                 *   unexpected type or is unexpectedly missing or null (e.g. if the
                                 *   server responded with an unexpected value).
                                 */
                                fun id(): String = id.getRequired("id")

                                /**
                                 * @throws HanzoInvalidDataException if the JSON field has an
                                 *   unexpected type or is unexpectedly missing or null (e.g. if the
                                 *   server responded with an unexpected value).
                                 */
                                fun data(): String = data.getRequired("data")

                                /**
                                 * @throws HanzoInvalidDataException if the JSON field has an
                                 *   unexpected type or is unexpectedly missing or null (e.g. if the
                                 *   server responded with an unexpected value).
                                 */
                                fun expiresAt(): Long = expiresAt.getRequired("expires_at")

                                /**
                                 * @throws HanzoInvalidDataException if the JSON field has an
                                 *   unexpected type or is unexpectedly missing or null (e.g. if the
                                 *   server responded with an unexpected value).
                                 */
                                fun transcript(): String = transcript.getRequired("transcript")

                                /**
                                 * Returns the raw JSON value of [id].
                                 *
                                 * Unlike [id], this method doesn't throw if the JSON field has an
                                 * unexpected type.
                                 */
                                @JsonProperty("id")
                                @ExcludeMissing
                                fun _id(): JsonField<String> = id

                                /**
                                 * Returns the raw JSON value of [data].
                                 *
                                 * Unlike [data], this method doesn't throw if the JSON field has an
                                 * unexpected type.
                                 */
                                @JsonProperty("data")
                                @ExcludeMissing
                                fun _data(): JsonField<String> = data

                                /**
                                 * Returns the raw JSON value of [expiresAt].
                                 *
                                 * Unlike [expiresAt], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("expires_at")
                                @ExcludeMissing
                                fun _expiresAt(): JsonField<Long> = expiresAt

                                /**
                                 * Returns the raw JSON value of [transcript].
                                 *
                                 * Unlike [transcript], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("transcript")
                                @ExcludeMissing
                                fun _transcript(): JsonField<String> = transcript

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
                                     * Returns a mutable builder for constructing an instance of
                                     * [Audio].
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .id()
                                     * .data()
                                     * .expiresAt()
                                     * .transcript()
                                     * ```
                                     */
                                    fun builder() = Builder()
                                }

                                /** A builder for [Audio]. */
                                class Builder internal constructor() {

                                    private var id: JsonField<String>? = null
                                    private var data: JsonField<String>? = null
                                    private var expiresAt: JsonField<Long>? = null
                                    private var transcript: JsonField<String>? = null
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    internal fun from(audio: Audio) = apply {
                                        id = audio.id
                                        data = audio.data
                                        expiresAt = audio.expiresAt
                                        transcript = audio.transcript
                                        additionalProperties =
                                            audio.additionalProperties.toMutableMap()
                                    }

                                    fun id(id: String) = id(JsonField.of(id))

                                    /**
                                     * Sets [Builder.id] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.id] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun id(id: JsonField<String>) = apply { this.id = id }

                                    fun data(data: String) = data(JsonField.of(data))

                                    /**
                                     * Sets [Builder.data] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.data] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun data(data: JsonField<String>) = apply { this.data = data }

                                    fun expiresAt(expiresAt: Long) =
                                        expiresAt(JsonField.of(expiresAt))

                                    /**
                                     * Sets [Builder.expiresAt] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.expiresAt] with a well-typed
                                     * [Long] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun expiresAt(expiresAt: JsonField<Long>) = apply {
                                        this.expiresAt = expiresAt
                                    }

                                    fun transcript(transcript: String) =
                                        transcript(JsonField.of(transcript))

                                    /**
                                     * Sets [Builder.transcript] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.transcript] with a
                                     * well-typed [String] value instead. This method is primarily
                                     * for setting the field to an undocumented or not yet supported
                                     * value.
                                     */
                                    fun transcript(transcript: JsonField<String>) = apply {
                                        this.transcript = transcript
                                    }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [Audio].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .id()
                                     * .data()
                                     * .expiresAt()
                                     * .transcript()
                                     * ```
                                     *
                                     * @throws IllegalStateException if any required field is unset.
                                     */
                                    fun build(): Audio =
                                        Audio(
                                            checkRequired("id", id),
                                            checkRequired("data", data),
                                            checkRequired("expiresAt", expiresAt),
                                            checkRequired("transcript", transcript),
                                            additionalProperties.toMutableMap(),
                                        )
                                }

                                private var validated: Boolean = false

                                fun validate(): Audio = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    id()
                                    data()
                                    expiresAt()
                                    transcript()
                                    validated = true
                                }

                                fun isValid(): Boolean =
                                    try {
                                        validate()
                                        true
                                    } catch (e: HanzoInvalidDataException) {
                                        false
                                    }

                                /**
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    (if (id.asKnown() == null) 0 else 1) +
                                        (if (data.asKnown() == null) 0 else 1) +
                                        (if (expiresAt.asKnown() == null) 0 else 1) +
                                        (if (transcript.asKnown() == null) 0 else 1)

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Audio &&
                                        id == other.id &&
                                        data == other.data &&
                                        expiresAt == other.expiresAt &&
                                        transcript == other.transcript &&
                                        additionalProperties == other.additionalProperties
                                }

                                private val hashCode: Int by lazy {
                                    Objects.hash(
                                        id,
                                        data,
                                        expiresAt,
                                        transcript,
                                        additionalProperties,
                                    )
                                }

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "Audio{id=$id, data=$data, expiresAt=$expiresAt, transcript=$transcript, additionalProperties=$additionalProperties}"
                            }

                            class Image
                            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                            private constructor(
                                private val imageUrl: JsonField<ImageUrl>,
                                private val index: JsonField<Long>,
                                private val type: JsonValue,
                                private val additionalProperties: MutableMap<String, JsonValue>,
                            ) {

                                @JsonCreator
                                private constructor(
                                    @JsonProperty("image_url")
                                    @ExcludeMissing
                                    imageUrl: JsonField<ImageUrl> = JsonMissing.of(),
                                    @JsonProperty("index")
                                    @ExcludeMissing
                                    index: JsonField<Long> = JsonMissing.of(),
                                    @JsonProperty("type")
                                    @ExcludeMissing
                                    type: JsonValue = JsonMissing.of(),
                                ) : this(imageUrl, index, type, mutableMapOf())

                                /**
                                 * @throws HanzoInvalidDataException if the JSON field has an
                                 *   unexpected type or is unexpectedly missing or null (e.g. if the
                                 *   server responded with an unexpected value).
                                 */
                                fun imageUrl(): ImageUrl = imageUrl.getRequired("image_url")

                                /**
                                 * @throws HanzoInvalidDataException if the JSON field has an
                                 *   unexpected type or is unexpectedly missing or null (e.g. if the
                                 *   server responded with an unexpected value).
                                 */
                                fun index(): Long = index.getRequired("index")

                                /**
                                 * Expected to always return the following:
                                 * ```kotlin
                                 * JsonValue.from("image_url")
                                 * ```
                                 *
                                 * However, this method can be useful for debugging and logging
                                 * (e.g. if the server responded with an unexpected value).
                                 */
                                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                                /**
                                 * Returns the raw JSON value of [imageUrl].
                                 *
                                 * Unlike [imageUrl], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("image_url")
                                @ExcludeMissing
                                fun _imageUrl(): JsonField<ImageUrl> = imageUrl

                                /**
                                 * Returns the raw JSON value of [index].
                                 *
                                 * Unlike [index], this method doesn't throw if the JSON field has
                                 * an unexpected type.
                                 */
                                @JsonProperty("index")
                                @ExcludeMissing
                                fun _index(): JsonField<Long> = index

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
                                     * Returns a mutable builder for constructing an instance of
                                     * [Image].
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .imageUrl()
                                     * .index()
                                     * ```
                                     */
                                    fun builder() = Builder()
                                }

                                /** A builder for [Image]. */
                                class Builder internal constructor() {

                                    private var imageUrl: JsonField<ImageUrl>? = null
                                    private var index: JsonField<Long>? = null
                                    private var type: JsonValue = JsonValue.from("image_url")
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    internal fun from(image: Image) = apply {
                                        imageUrl = image.imageUrl
                                        index = image.index
                                        type = image.type
                                        additionalProperties =
                                            image.additionalProperties.toMutableMap()
                                    }

                                    fun imageUrl(imageUrl: ImageUrl) =
                                        imageUrl(JsonField.of(imageUrl))

                                    /**
                                     * Sets [Builder.imageUrl] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.imageUrl] with a well-typed
                                     * [ImageUrl] value instead. This method is primarily for
                                     * setting the field to an undocumented or not yet supported
                                     * value.
                                     */
                                    fun imageUrl(imageUrl: JsonField<ImageUrl>) = apply {
                                        this.imageUrl = imageUrl
                                    }

                                    fun index(index: Long) = index(JsonField.of(index))

                                    /**
                                     * Sets [Builder.index] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.index] with a well-typed
                                     * [Long] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun index(index: JsonField<Long>) = apply { this.index = index }

                                    /**
                                     * Sets the field to an arbitrary JSON value.
                                     *
                                     * It is usually unnecessary to call this method because the
                                     * field defaults to the following:
                                     * ```kotlin
                                     * JsonValue.from("image_url")
                                     * ```
                                     *
                                     * This method is primarily for setting the field to an
                                     * undocumented or not yet supported value.
                                     */
                                    fun type(type: JsonValue) = apply { this.type = type }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [Image].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .imageUrl()
                                     * .index()
                                     * ```
                                     *
                                     * @throws IllegalStateException if any required field is unset.
                                     */
                                    fun build(): Image =
                                        Image(
                                            checkRequired("imageUrl", imageUrl),
                                            checkRequired("index", index),
                                            type,
                                            additionalProperties.toMutableMap(),
                                        )
                                }

                                private var validated: Boolean = false

                                fun validate(): Image = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    imageUrl().validate()
                                    index()
                                    _type().let {
                                        if (it != JsonValue.from("image_url")) {
                                            throw HanzoInvalidDataException(
                                                "'type' is invalid, received $it"
                                            )
                                        }
                                    }
                                    validated = true
                                }

                                fun isValid(): Boolean =
                                    try {
                                        validate()
                                        true
                                    } catch (e: HanzoInvalidDataException) {
                                        false
                                    }

                                /**
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    (imageUrl.asKnown()?.validity() ?: 0) +
                                        (if (index.asKnown() == null) 0 else 1) +
                                        type.let { if (it == JsonValue.from("image_url")) 1 else 0 }

                                class ImageUrl
                                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                                private constructor(
                                    private val url: JsonField<String>,
                                    private val detail: JsonField<String>,
                                    private val additionalProperties: MutableMap<String, JsonValue>,
                                ) {

                                    @JsonCreator
                                    private constructor(
                                        @JsonProperty("url")
                                        @ExcludeMissing
                                        url: JsonField<String> = JsonMissing.of(),
                                        @JsonProperty("detail")
                                        @ExcludeMissing
                                        detail: JsonField<String> = JsonMissing.of(),
                                    ) : this(url, detail, mutableMapOf())

                                    /**
                                     * @throws HanzoInvalidDataException if the JSON field has an
                                     *   unexpected type or is unexpectedly missing or null (e.g. if
                                     *   the server responded with an unexpected value).
                                     */
                                    fun url(): String = url.getRequired("url")

                                    /**
                                     * @throws HanzoInvalidDataException if the JSON field has an
                                     *   unexpected type (e.g. if the server responded with an
                                     *   unexpected value).
                                     */
                                    fun detail(): String? = detail.getNullable("detail")

                                    /**
                                     * Returns the raw JSON value of [url].
                                     *
                                     * Unlike [url], this method doesn't throw if the JSON field has
                                     * an unexpected type.
                                     */
                                    @JsonProperty("url")
                                    @ExcludeMissing
                                    fun _url(): JsonField<String> = url

                                    /**
                                     * Returns the raw JSON value of [detail].
                                     *
                                     * Unlike [detail], this method doesn't throw if the JSON field
                                     * has an unexpected type.
                                     */
                                    @JsonProperty("detail")
                                    @ExcludeMissing
                                    fun _detail(): JsonField<String> = detail

                                    @JsonAnySetter
                                    private fun putAdditionalProperty(
                                        key: String,
                                        value: JsonValue,
                                    ) {
                                        additionalProperties.put(key, value)
                                    }

                                    @JsonAnyGetter
                                    @ExcludeMissing
                                    fun _additionalProperties(): Map<String, JsonValue> =
                                        Collections.unmodifiableMap(additionalProperties)

                                    fun toBuilder() = Builder().from(this)

                                    companion object {

                                        /**
                                         * Returns a mutable builder for constructing an instance of
                                         * [ImageUrl].
                                         *
                                         * The following fields are required:
                                         * ```kotlin
                                         * .url()
                                         * ```
                                         */
                                        fun builder() = Builder()
                                    }

                                    /** A builder for [ImageUrl]. */
                                    class Builder internal constructor() {

                                        private var url: JsonField<String>? = null
                                        private var detail: JsonField<String> = JsonMissing.of()
                                        private var additionalProperties:
                                            MutableMap<String, JsonValue> =
                                            mutableMapOf()

                                        internal fun from(imageUrl: ImageUrl) = apply {
                                            url = imageUrl.url
                                            detail = imageUrl.detail
                                            additionalProperties =
                                                imageUrl.additionalProperties.toMutableMap()
                                        }

                                        fun url(url: String) = url(JsonField.of(url))

                                        /**
                                         * Sets [Builder.url] to an arbitrary JSON value.
                                         *
                                         * You should usually call [Builder.url] with a well-typed
                                         * [String] value instead. This method is primarily for
                                         * setting the field to an undocumented or not yet supported
                                         * value.
                                         */
                                        fun url(url: JsonField<String>) = apply { this.url = url }

                                        fun detail(detail: String?) =
                                            detail(JsonField.ofNullable(detail))

                                        /**
                                         * Sets [Builder.detail] to an arbitrary JSON value.
                                         *
                                         * You should usually call [Builder.detail] with a
                                         * well-typed [String] value instead. This method is
                                         * primarily for setting the field to an undocumented or not
                                         * yet supported value.
                                         */
                                        fun detail(detail: JsonField<String>) = apply {
                                            this.detail = detail
                                        }

                                        fun additionalProperties(
                                            additionalProperties: Map<String, JsonValue>
                                        ) = apply {
                                            this.additionalProperties.clear()
                                            putAllAdditionalProperties(additionalProperties)
                                        }

                                        fun putAdditionalProperty(key: String, value: JsonValue) =
                                            apply {
                                                additionalProperties.put(key, value)
                                            }

                                        fun putAllAdditionalProperties(
                                            additionalProperties: Map<String, JsonValue>
                                        ) = apply {
                                            this.additionalProperties.putAll(additionalProperties)
                                        }

                                        fun removeAdditionalProperty(key: String) = apply {
                                            additionalProperties.remove(key)
                                        }

                                        fun removeAllAdditionalProperties(keys: Set<String>) =
                                            apply {
                                                keys.forEach(::removeAdditionalProperty)
                                            }

                                        /**
                                         * Returns an immutable instance of [ImageUrl].
                                         *
                                         * Further updates to this [Builder] will not mutate the
                                         * returned instance.
                                         *
                                         * The following fields are required:
                                         * ```kotlin
                                         * .url()
                                         * ```
                                         *
                                         * @throws IllegalStateException if any required field is
                                         *   unset.
                                         */
                                        fun build(): ImageUrl =
                                            ImageUrl(
                                                checkRequired("url", url),
                                                detail,
                                                additionalProperties.toMutableMap(),
                                            )
                                    }

                                    private var validated: Boolean = false

                                    fun validate(): ImageUrl = apply {
                                        if (validated) {
                                            return@apply
                                        }

                                        url()
                                        detail()
                                        validated = true
                                    }

                                    fun isValid(): Boolean =
                                        try {
                                            validate()
                                            true
                                        } catch (e: HanzoInvalidDataException) {
                                            false
                                        }

                                    /**
                                     * Returns a score indicating how many valid values are
                                     * contained in this object recursively.
                                     *
                                     * Used for best match union deserialization.
                                     */
                                    internal fun validity(): Int =
                                        (if (url.asKnown() == null) 0 else 1) +
                                            (if (detail.asKnown() == null) 0 else 1)

                                    override fun equals(other: Any?): Boolean {
                                        if (this === other) {
                                            return true
                                        }

                                        return other is ImageUrl &&
                                            url == other.url &&
                                            detail == other.detail &&
                                            additionalProperties == other.additionalProperties
                                    }

                                    private val hashCode: Int by lazy {
                                        Objects.hash(url, detail, additionalProperties)
                                    }

                                    override fun hashCode(): Int = hashCode

                                    override fun toString() =
                                        "ImageUrl{url=$url, detail=$detail, additionalProperties=$additionalProperties}"
                                }

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Image &&
                                        imageUrl == other.imageUrl &&
                                        index == other.index &&
                                        type == other.type &&
                                        additionalProperties == other.additionalProperties
                                }

                                private val hashCode: Int by lazy {
                                    Objects.hash(imageUrl, index, type, additionalProperties)
                                }

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "Image{imageUrl=$imageUrl, index=$index, type=$type, additionalProperties=$additionalProperties}"
                            }

                            class ProviderSpecificFields
                            @JsonCreator
                            private constructor(
                                @com.fasterxml.jackson.annotation.JsonValue
                                private val additionalProperties: Map<String, JsonValue>
                            ) {

                                @JsonAnyGetter
                                @ExcludeMissing
                                fun _additionalProperties(): Map<String, JsonValue> =
                                    additionalProperties

                                fun toBuilder() = Builder().from(this)

                                companion object {

                                    /**
                                     * Returns a mutable builder for constructing an instance of
                                     * [ProviderSpecificFields].
                                     */
                                    fun builder() = Builder()
                                }

                                /** A builder for [ProviderSpecificFields]. */
                                class Builder internal constructor() {

                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    internal fun from(
                                        providerSpecificFields: ProviderSpecificFields
                                    ) = apply {
                                        additionalProperties =
                                            providerSpecificFields.additionalProperties
                                                .toMutableMap()
                                    }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [ProviderSpecificFields].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     */
                                    fun build(): ProviderSpecificFields =
                                        ProviderSpecificFields(additionalProperties.toImmutable())
                                }

                                private var validated: Boolean = false

                                fun validate(): ProviderSpecificFields = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    validated = true
                                }

                                fun isValid(): Boolean =
                                    try {
                                        validate()
                                        true
                                    } catch (e: HanzoInvalidDataException) {
                                        false
                                    }

                                /**
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    additionalProperties.count { (_, value) ->
                                        !value.isNull() && !value.isMissing()
                                    }

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is ProviderSpecificFields &&
                                        additionalProperties == other.additionalProperties
                                }

                                private val hashCode: Int by lazy {
                                    Objects.hash(additionalProperties)
                                }

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "ProviderSpecificFields{additionalProperties=$additionalProperties}"
                            }

                            @JsonDeserialize(using = ThinkingBlock.Deserializer::class)
                            @JsonSerialize(using = ThinkingBlock.Serializer::class)
                            class ThinkingBlock
                            private constructor(
                                private val chatCompletion: ChatCompletionThinkingBlock? = null,
                                private val chatCompletionRedacted:
                                    ChatCompletionRedactedThinkingBlock? =
                                    null,
                                private val _json: JsonValue? = null,
                            ) {

                                fun chatCompletion(): ChatCompletionThinkingBlock? = chatCompletion

                                fun chatCompletionRedacted(): ChatCompletionRedactedThinkingBlock? =
                                    chatCompletionRedacted

                                fun isChatCompletion(): Boolean = chatCompletion != null

                                fun isChatCompletionRedacted(): Boolean =
                                    chatCompletionRedacted != null

                                fun asChatCompletion(): ChatCompletionThinkingBlock =
                                    chatCompletion.getOrThrow("chatCompletion")

                                fun asChatCompletionRedacted():
                                    ChatCompletionRedactedThinkingBlock =
                                    chatCompletionRedacted.getOrThrow("chatCompletionRedacted")

                                fun _json(): JsonValue? = _json

                                fun <T> accept(visitor: Visitor<T>): T =
                                    when {
                                        chatCompletion != null ->
                                            visitor.visitChatCompletion(chatCompletion)
                                        chatCompletionRedacted != null ->
                                            visitor.visitChatCompletionRedacted(
                                                chatCompletionRedacted
                                            )
                                        else -> visitor.unknown(_json)
                                    }

                                private var validated: Boolean = false

                                fun validate(): ThinkingBlock = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    accept(
                                        object : Visitor<Unit> {
                                            override fun visitChatCompletion(
                                                chatCompletion: ChatCompletionThinkingBlock
                                            ) {
                                                chatCompletion.validate()
                                            }

                                            override fun visitChatCompletionRedacted(
                                                chatCompletionRedacted:
                                                    ChatCompletionRedactedThinkingBlock
                                            ) {
                                                chatCompletionRedacted.validate()
                                            }
                                        }
                                    )
                                    validated = true
                                }

                                fun isValid(): Boolean =
                                    try {
                                        validate()
                                        true
                                    } catch (e: HanzoInvalidDataException) {
                                        false
                                    }

                                /**
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    accept(
                                        object : Visitor<Int> {
                                            override fun visitChatCompletion(
                                                chatCompletion: ChatCompletionThinkingBlock
                                            ) = chatCompletion.validity()

                                            override fun visitChatCompletionRedacted(
                                                chatCompletionRedacted:
                                                    ChatCompletionRedactedThinkingBlock
                                            ) = chatCompletionRedacted.validity()

                                            override fun unknown(json: JsonValue?) = 0
                                        }
                                    )

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is ThinkingBlock &&
                                        chatCompletion == other.chatCompletion &&
                                        chatCompletionRedacted == other.chatCompletionRedacted
                                }

                                override fun hashCode(): Int =
                                    Objects.hash(chatCompletion, chatCompletionRedacted)

                                override fun toString(): String =
                                    when {
                                        chatCompletion != null ->
                                            "ThinkingBlock{chatCompletion=$chatCompletion}"
                                        chatCompletionRedacted != null ->
                                            "ThinkingBlock{chatCompletionRedacted=$chatCompletionRedacted}"
                                        _json != null -> "ThinkingBlock{_unknown=$_json}"
                                        else -> throw IllegalStateException("Invalid ThinkingBlock")
                                    }

                                companion object {

                                    fun ofChatCompletion(
                                        chatCompletion: ChatCompletionThinkingBlock
                                    ) = ThinkingBlock(chatCompletion = chatCompletion)

                                    fun ofChatCompletionRedacted(
                                        chatCompletionRedacted: ChatCompletionRedactedThinkingBlock
                                    ) =
                                        ThinkingBlock(
                                            chatCompletionRedacted = chatCompletionRedacted
                                        )
                                }

                                /**
                                 * An interface that defines how to map each variant of
                                 * [ThinkingBlock] to a value of type [T].
                                 */
                                interface Visitor<out T> {

                                    fun visitChatCompletion(
                                        chatCompletion: ChatCompletionThinkingBlock
                                    ): T

                                    fun visitChatCompletionRedacted(
                                        chatCompletionRedacted: ChatCompletionRedactedThinkingBlock
                                    ): T

                                    /**
                                     * Maps an unknown variant of [ThinkingBlock] to a value of type
                                     * [T].
                                     *
                                     * An instance of [ThinkingBlock] can contain an unknown variant
                                     * if it was deserialized from data that doesn't match any known
                                     * variant. For example, if the SDK is on an older version than
                                     * the API, then the API may respond with new variants that the
                                     * SDK is unaware of.
                                     *
                                     * @throws HanzoInvalidDataException in the default
                                     *   implementation.
                                     */
                                    fun unknown(json: JsonValue?): T {
                                        throw HanzoInvalidDataException(
                                            "Unknown ThinkingBlock: $json"
                                        )
                                    }
                                }

                                internal class Deserializer :
                                    BaseDeserializer<ThinkingBlock>(ThinkingBlock::class) {

                                    override fun ObjectCodec.deserialize(
                                        node: JsonNode
                                    ): ThinkingBlock {
                                        val json = JsonValue.fromJsonNode(node)

                                        val bestMatches =
                                            sequenceOf(
                                                    tryDeserialize(
                                                            node,
                                                            jacksonTypeRef<
                                                                ChatCompletionThinkingBlock
                                                            >(),
                                                        )
                                                        ?.let {
                                                            ThinkingBlock(
                                                                chatCompletion = it,
                                                                _json = json,
                                                            )
                                                        },
                                                    tryDeserialize(
                                                            node,
                                                            jacksonTypeRef<
                                                                ChatCompletionRedactedThinkingBlock
                                                            >(),
                                                        )
                                                        ?.let {
                                                            ThinkingBlock(
                                                                chatCompletionRedacted = it,
                                                                _json = json,
                                                            )
                                                        },
                                                )
                                                .filterNotNull()
                                                .allMaxBy { it.validity() }
                                                .toList()
                                        return when (bestMatches.size) {
                                            // This can happen if what we're deserializing is
                                            // completely incompatible with all the possible
                                            // variants (e.g. deserializing from boolean).
                                            0 -> ThinkingBlock(_json = json)
                                            1 -> bestMatches.single()
                                            // If there's more than one match with the highest
                                            // validity, then use the first completely valid match,
                                            // or simply the first match if none are completely
                                            // valid.
                                            else ->
                                                bestMatches.firstOrNull { it.isValid() }
                                                    ?: bestMatches.first()
                                        }
                                    }
                                }

                                internal class Serializer :
                                    BaseSerializer<ThinkingBlock>(ThinkingBlock::class) {

                                    override fun serialize(
                                        value: ThinkingBlock,
                                        generator: JsonGenerator,
                                        provider: SerializerProvider,
                                    ) {
                                        when {
                                            value.chatCompletion != null ->
                                                generator.writeObject(value.chatCompletion)
                                            value.chatCompletionRedacted != null ->
                                                generator.writeObject(value.chatCompletionRedacted)
                                            value._json != null ->
                                                generator.writeObject(value._json)
                                            else ->
                                                throw IllegalStateException("Invalid ThinkingBlock")
                                        }
                                    }
                                }

                                class ChatCompletionThinkingBlock
                                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                                private constructor(
                                    private val type: JsonValue,
                                    private val cacheControl: JsonField<CacheControl>,
                                    private val signature: JsonField<String>,
                                    private val thinking: JsonField<String>,
                                    private val additionalProperties: MutableMap<String, JsonValue>,
                                ) {

                                    @JsonCreator
                                    private constructor(
                                        @JsonProperty("type")
                                        @ExcludeMissing
                                        type: JsonValue = JsonMissing.of(),
                                        @JsonProperty("cache_control")
                                        @ExcludeMissing
                                        cacheControl: JsonField<CacheControl> = JsonMissing.of(),
                                        @JsonProperty("signature")
                                        @ExcludeMissing
                                        signature: JsonField<String> = JsonMissing.of(),
                                        @JsonProperty("thinking")
                                        @ExcludeMissing
                                        thinking: JsonField<String> = JsonMissing.of(),
                                    ) : this(
                                        type,
                                        cacheControl,
                                        signature,
                                        thinking,
                                        mutableMapOf(),
                                    )

                                    /**
                                     * Expected to always return the following:
                                     * ```kotlin
                                     * JsonValue.from("thinking")
                                     * ```
                                     *
                                     * However, this method can be useful for debugging and logging
                                     * (e.g. if the server responded with an unexpected value).
                                     */
                                    @JsonProperty("type")
                                    @ExcludeMissing
                                    fun _type(): JsonValue = type

                                    /**
                                     * @throws HanzoInvalidDataException if the JSON field has an
                                     *   unexpected type (e.g. if the server responded with an
                                     *   unexpected value).
                                     */
                                    fun cacheControl(): CacheControl? =
                                        cacheControl.getNullable("cache_control")

                                    /**
                                     * @throws HanzoInvalidDataException if the JSON field has an
                                     *   unexpected type (e.g. if the server responded with an
                                     *   unexpected value).
                                     */
                                    fun signature(): String? = signature.getNullable("signature")

                                    /**
                                     * @throws HanzoInvalidDataException if the JSON field has an
                                     *   unexpected type (e.g. if the server responded with an
                                     *   unexpected value).
                                     */
                                    fun thinking(): String? = thinking.getNullable("thinking")

                                    /**
                                     * Returns the raw JSON value of [cacheControl].
                                     *
                                     * Unlike [cacheControl], this method doesn't throw if the JSON
                                     * field has an unexpected type.
                                     */
                                    @JsonProperty("cache_control")
                                    @ExcludeMissing
                                    fun _cacheControl(): JsonField<CacheControl> = cacheControl

                                    /**
                                     * Returns the raw JSON value of [signature].
                                     *
                                     * Unlike [signature], this method doesn't throw if the JSON
                                     * field has an unexpected type.
                                     */
                                    @JsonProperty("signature")
                                    @ExcludeMissing
                                    fun _signature(): JsonField<String> = signature

                                    /**
                                     * Returns the raw JSON value of [thinking].
                                     *
                                     * Unlike [thinking], this method doesn't throw if the JSON
                                     * field has an unexpected type.
                                     */
                                    @JsonProperty("thinking")
                                    @ExcludeMissing
                                    fun _thinking(): JsonField<String> = thinking

                                    @JsonAnySetter
                                    private fun putAdditionalProperty(
                                        key: String,
                                        value: JsonValue,
                                    ) {
                                        additionalProperties.put(key, value)
                                    }

                                    @JsonAnyGetter
                                    @ExcludeMissing
                                    fun _additionalProperties(): Map<String, JsonValue> =
                                        Collections.unmodifiableMap(additionalProperties)

                                    fun toBuilder() = Builder().from(this)

                                    companion object {

                                        /**
                                         * Returns a mutable builder for constructing an instance of
                                         * [ChatCompletionThinkingBlock].
                                         */
                                        fun builder() = Builder()
                                    }

                                    /** A builder for [ChatCompletionThinkingBlock]. */
                                    class Builder internal constructor() {

                                        private var type: JsonValue = JsonValue.from("thinking")
                                        private var cacheControl: JsonField<CacheControl> =
                                            JsonMissing.of()
                                        private var signature: JsonField<String> = JsonMissing.of()
                                        private var thinking: JsonField<String> = JsonMissing.of()
                                        private var additionalProperties:
                                            MutableMap<String, JsonValue> =
                                            mutableMapOf()

                                        internal fun from(
                                            chatCompletionThinkingBlock: ChatCompletionThinkingBlock
                                        ) = apply {
                                            type = chatCompletionThinkingBlock.type
                                            cacheControl = chatCompletionThinkingBlock.cacheControl
                                            signature = chatCompletionThinkingBlock.signature
                                            thinking = chatCompletionThinkingBlock.thinking
                                            additionalProperties =
                                                chatCompletionThinkingBlock.additionalProperties
                                                    .toMutableMap()
                                        }

                                        /**
                                         * Sets the field to an arbitrary JSON value.
                                         *
                                         * It is usually unnecessary to call this method because the
                                         * field defaults to the following:
                                         * ```kotlin
                                         * JsonValue.from("thinking")
                                         * ```
                                         *
                                         * This method is primarily for setting the field to an
                                         * undocumented or not yet supported value.
                                         */
                                        fun type(type: JsonValue) = apply { this.type = type }

                                        fun cacheControl(cacheControl: CacheControl?) =
                                            cacheControl(JsonField.ofNullable(cacheControl))

                                        /**
                                         * Sets [Builder.cacheControl] to an arbitrary JSON value.
                                         *
                                         * You should usually call [Builder.cacheControl] with a
                                         * well-typed [CacheControl] value instead. This method is
                                         * primarily for setting the field to an undocumented or not
                                         * yet supported value.
                                         */
                                        fun cacheControl(cacheControl: JsonField<CacheControl>) =
                                            apply {
                                                this.cacheControl = cacheControl
                                            }

                                        /**
                                         * Alias for calling [cacheControl] with
                                         * `CacheControl.ofUnionMember0(unionMember0)`.
                                         */
                                        fun cacheControl(unionMember0: CacheControl.UnionMember0) =
                                            cacheControl(CacheControl.ofUnionMember0(unionMember0))

                                        /**
                                         * Alias for calling [cacheControl] with
                                         * `CacheControl.ofChatCompletionCachedContent()`.
                                         */
                                        fun cacheControlChatCompletionCachedContent() =
                                            cacheControl(
                                                CacheControl.ofChatCompletionCachedContent()
                                            )

                                        fun signature(signature: String) =
                                            signature(JsonField.of(signature))

                                        /**
                                         * Sets [Builder.signature] to an arbitrary JSON value.
                                         *
                                         * You should usually call [Builder.signature] with a
                                         * well-typed [String] value instead. This method is
                                         * primarily for setting the field to an undocumented or not
                                         * yet supported value.
                                         */
                                        fun signature(signature: JsonField<String>) = apply {
                                            this.signature = signature
                                        }

                                        fun thinking(thinking: String) =
                                            thinking(JsonField.of(thinking))

                                        /**
                                         * Sets [Builder.thinking] to an arbitrary JSON value.
                                         *
                                         * You should usually call [Builder.thinking] with a
                                         * well-typed [String] value instead. This method is
                                         * primarily for setting the field to an undocumented or not
                                         * yet supported value.
                                         */
                                        fun thinking(thinking: JsonField<String>) = apply {
                                            this.thinking = thinking
                                        }

                                        fun additionalProperties(
                                            additionalProperties: Map<String, JsonValue>
                                        ) = apply {
                                            this.additionalProperties.clear()
                                            putAllAdditionalProperties(additionalProperties)
                                        }

                                        fun putAdditionalProperty(key: String, value: JsonValue) =
                                            apply {
                                                additionalProperties.put(key, value)
                                            }

                                        fun putAllAdditionalProperties(
                                            additionalProperties: Map<String, JsonValue>
                                        ) = apply {
                                            this.additionalProperties.putAll(additionalProperties)
                                        }

                                        fun removeAdditionalProperty(key: String) = apply {
                                            additionalProperties.remove(key)
                                        }

                                        fun removeAllAdditionalProperties(keys: Set<String>) =
                                            apply {
                                                keys.forEach(::removeAdditionalProperty)
                                            }

                                        /**
                                         * Returns an immutable instance of
                                         * [ChatCompletionThinkingBlock].
                                         *
                                         * Further updates to this [Builder] will not mutate the
                                         * returned instance.
                                         */
                                        fun build(): ChatCompletionThinkingBlock =
                                            ChatCompletionThinkingBlock(
                                                type,
                                                cacheControl,
                                                signature,
                                                thinking,
                                                additionalProperties.toMutableMap(),
                                            )
                                    }

                                    private var validated: Boolean = false

                                    fun validate(): ChatCompletionThinkingBlock = apply {
                                        if (validated) {
                                            return@apply
                                        }

                                        _type().let {
                                            if (it != JsonValue.from("thinking")) {
                                                throw HanzoInvalidDataException(
                                                    "'type' is invalid, received $it"
                                                )
                                            }
                                        }
                                        cacheControl()?.validate()
                                        signature()
                                        thinking()
                                        validated = true
                                    }

                                    fun isValid(): Boolean =
                                        try {
                                            validate()
                                            true
                                        } catch (e: HanzoInvalidDataException) {
                                            false
                                        }

                                    /**
                                     * Returns a score indicating how many valid values are
                                     * contained in this object recursively.
                                     *
                                     * Used for best match union deserialization.
                                     */
                                    internal fun validity(): Int =
                                        type.let {
                                            if (it == JsonValue.from("thinking")) 1 else 0
                                        } +
                                            (cacheControl.asKnown()?.validity() ?: 0) +
                                            (if (signature.asKnown() == null) 0 else 1) +
                                            (if (thinking.asKnown() == null) 0 else 1)

                                    @JsonDeserialize(using = CacheControl.Deserializer::class)
                                    @JsonSerialize(using = CacheControl.Serializer::class)
                                    class CacheControl
                                    private constructor(
                                        private val unionMember0: UnionMember0? = null,
                                        private val chatCompletionCachedContent: JsonValue? = null,
                                        private val _json: JsonValue? = null,
                                    ) {

                                        fun unionMember0(): UnionMember0? = unionMember0

                                        fun chatCompletionCachedContent(): JsonValue? =
                                            chatCompletionCachedContent

                                        fun isUnionMember0(): Boolean = unionMember0 != null

                                        fun isChatCompletionCachedContent(): Boolean =
                                            chatCompletionCachedContent != null

                                        fun asUnionMember0(): UnionMember0 =
                                            unionMember0.getOrThrow("unionMember0")

                                        fun asChatCompletionCachedContent(): JsonValue =
                                            chatCompletionCachedContent.getOrThrow(
                                                "chatCompletionCachedContent"
                                            )

                                        fun _json(): JsonValue? = _json

                                        fun <T> accept(visitor: Visitor<T>): T =
                                            when {
                                                unionMember0 != null ->
                                                    visitor.visitUnionMember0(unionMember0)
                                                chatCompletionCachedContent != null ->
                                                    visitor.visitChatCompletionCachedContent(
                                                        chatCompletionCachedContent
                                                    )
                                                else -> visitor.unknown(_json)
                                            }

                                        private var validated: Boolean = false

                                        fun validate(): CacheControl = apply {
                                            if (validated) {
                                                return@apply
                                            }

                                            accept(
                                                object : Visitor<Unit> {
                                                    override fun visitUnionMember0(
                                                        unionMember0: UnionMember0
                                                    ) {
                                                        unionMember0.validate()
                                                    }

                                                    override fun visitChatCompletionCachedContent(
                                                        chatCompletionCachedContent: JsonValue
                                                    ) {
                                                        chatCompletionCachedContent.let {
                                                            if (
                                                                it !=
                                                                    JsonValue.from(
                                                                        mapOf("type" to "ephemeral")
                                                                    )
                                                            ) {
                                                                throw HanzoInvalidDataException(
                                                                    "'chatCompletionCachedContent' is invalid, received $it"
                                                                )
                                                            }
                                                        }
                                                    }
                                                }
                                            )
                                            validated = true
                                        }

                                        fun isValid(): Boolean =
                                            try {
                                                validate()
                                                true
                                            } catch (e: HanzoInvalidDataException) {
                                                false
                                            }

                                        /**
                                         * Returns a score indicating how many valid values are
                                         * contained in this object recursively.
                                         *
                                         * Used for best match union deserialization.
                                         */
                                        internal fun validity(): Int =
                                            accept(
                                                object : Visitor<Int> {
                                                    override fun visitUnionMember0(
                                                        unionMember0: UnionMember0
                                                    ) = unionMember0.validity()

                                                    override fun visitChatCompletionCachedContent(
                                                        chatCompletionCachedContent: JsonValue
                                                    ) =
                                                        chatCompletionCachedContent.let {
                                                            if (
                                                                it ==
                                                                    JsonValue.from(
                                                                        mapOf("type" to "ephemeral")
                                                                    )
                                                            )
                                                                1
                                                            else 0
                                                        }

                                                    override fun unknown(json: JsonValue?) = 0
                                                }
                                            )

                                        override fun equals(other: Any?): Boolean {
                                            if (this === other) {
                                                return true
                                            }

                                            return other is CacheControl &&
                                                unionMember0 == other.unionMember0 &&
                                                chatCompletionCachedContent ==
                                                    other.chatCompletionCachedContent
                                        }

                                        override fun hashCode(): Int =
                                            Objects.hash(unionMember0, chatCompletionCachedContent)

                                        override fun toString(): String =
                                            when {
                                                unionMember0 != null ->
                                                    "CacheControl{unionMember0=$unionMember0}"
                                                chatCompletionCachedContent != null ->
                                                    "CacheControl{chatCompletionCachedContent=$chatCompletionCachedContent}"
                                                _json != null -> "CacheControl{_unknown=$_json}"
                                                else ->
                                                    throw IllegalStateException(
                                                        "Invalid CacheControl"
                                                    )
                                            }

                                        companion object {

                                            fun ofUnionMember0(unionMember0: UnionMember0) =
                                                CacheControl(unionMember0 = unionMember0)

                                            fun ofChatCompletionCachedContent() =
                                                CacheControl(
                                                    chatCompletionCachedContent =
                                                        JsonValue.from(mapOf("type" to "ephemeral"))
                                                )
                                        }

                                        /**
                                         * An interface that defines how to map each variant of
                                         * [CacheControl] to a value of type [T].
                                         */
                                        interface Visitor<out T> {

                                            fun visitUnionMember0(unionMember0: UnionMember0): T

                                            fun visitChatCompletionCachedContent(
                                                chatCompletionCachedContent: JsonValue
                                            ): T

                                            /**
                                             * Maps an unknown variant of [CacheControl] to a value
                                             * of type [T].
                                             *
                                             * An instance of [CacheControl] can contain an unknown
                                             * variant if it was deserialized from data that doesn't
                                             * match any known variant. For example, if the SDK is
                                             * on an older version than the API, then the API may
                                             * respond with new variants that the SDK is unaware of.
                                             *
                                             * @throws HanzoInvalidDataException in the default
                                             *   implementation.
                                             */
                                            fun unknown(json: JsonValue?): T {
                                                throw HanzoInvalidDataException(
                                                    "Unknown CacheControl: $json"
                                                )
                                            }
                                        }

                                        internal class Deserializer :
                                            BaseDeserializer<CacheControl>(CacheControl::class) {

                                            override fun ObjectCodec.deserialize(
                                                node: JsonNode
                                            ): CacheControl {
                                                val json = JsonValue.fromJsonNode(node)

                                                val bestMatches =
                                                    sequenceOf(
                                                            tryDeserialize(
                                                                    node,
                                                                    jacksonTypeRef<JsonValue>(),
                                                                )
                                                                ?.let {
                                                                    CacheControl(
                                                                        chatCompletionCachedContent =
                                                                            it,
                                                                        _json = json,
                                                                    )
                                                                }
                                                                ?.takeIf { it.isValid() },
                                                            tryDeserialize(
                                                                    node,
                                                                    jacksonTypeRef<UnionMember0>(),
                                                                )
                                                                ?.let {
                                                                    CacheControl(
                                                                        unionMember0 = it,
                                                                        _json = json,
                                                                    )
                                                                },
                                                        )
                                                        .filterNotNull()
                                                        .allMaxBy { it.validity() }
                                                        .toList()
                                                return when (bestMatches.size) {
                                                    // This can happen if what we're deserializing
                                                    // is completely incompatible with all the
                                                    // possible variants (e.g. deserializing from
                                                    // boolean).
                                                    0 -> CacheControl(_json = json)
                                                    1 -> bestMatches.single()
                                                    // If there's more than one match with the
                                                    // highest validity, then use the first
                                                    // completely valid match, or simply the first
                                                    // match if none are completely valid.
                                                    else ->
                                                        bestMatches.firstOrNull { it.isValid() }
                                                            ?: bestMatches.first()
                                                }
                                            }
                                        }

                                        internal class Serializer :
                                            BaseSerializer<CacheControl>(CacheControl::class) {

                                            override fun serialize(
                                                value: CacheControl,
                                                generator: JsonGenerator,
                                                provider: SerializerProvider,
                                            ) {
                                                when {
                                                    value.unionMember0 != null ->
                                                        generator.writeObject(value.unionMember0)
                                                    value.chatCompletionCachedContent != null ->
                                                        generator.writeObject(
                                                            value.chatCompletionCachedContent
                                                        )
                                                    value._json != null ->
                                                        generator.writeObject(value._json)
                                                    else ->
                                                        throw IllegalStateException(
                                                            "Invalid CacheControl"
                                                        )
                                                }
                                            }
                                        }

                                        class UnionMember0
                                        @JsonCreator
                                        private constructor(
                                            @com.fasterxml.jackson.annotation.JsonValue
                                            private val additionalProperties: Map<String, JsonValue>
                                        ) {

                                            @JsonAnyGetter
                                            @ExcludeMissing
                                            fun _additionalProperties(): Map<String, JsonValue> =
                                                additionalProperties

                                            fun toBuilder() = Builder().from(this)

                                            companion object {

                                                /**
                                                 * Returns a mutable builder for constructing an
                                                 * instance of [UnionMember0].
                                                 */
                                                fun builder() = Builder()
                                            }

                                            /** A builder for [UnionMember0]. */
                                            class Builder internal constructor() {

                                                private var additionalProperties:
                                                    MutableMap<String, JsonValue> =
                                                    mutableMapOf()

                                                internal fun from(unionMember0: UnionMember0) =
                                                    apply {
                                                        additionalProperties =
                                                            unionMember0.additionalProperties
                                                                .toMutableMap()
                                                    }

                                                fun additionalProperties(
                                                    additionalProperties: Map<String, JsonValue>
                                                ) = apply {
                                                    this.additionalProperties.clear()
                                                    putAllAdditionalProperties(additionalProperties)
                                                }

                                                fun putAdditionalProperty(
                                                    key: String,
                                                    value: JsonValue,
                                                ) = apply { additionalProperties.put(key, value) }

                                                fun putAllAdditionalProperties(
                                                    additionalProperties: Map<String, JsonValue>
                                                ) = apply {
                                                    this.additionalProperties.putAll(
                                                        additionalProperties
                                                    )
                                                }

                                                fun removeAdditionalProperty(key: String) = apply {
                                                    additionalProperties.remove(key)
                                                }

                                                fun removeAllAdditionalProperties(
                                                    keys: Set<String>
                                                ) = apply {
                                                    keys.forEach(::removeAdditionalProperty)
                                                }

                                                /**
                                                 * Returns an immutable instance of [UnionMember0].
                                                 *
                                                 * Further updates to this [Builder] will not mutate
                                                 * the returned instance.
                                                 */
                                                fun build(): UnionMember0 =
                                                    UnionMember0(additionalProperties.toImmutable())
                                            }

                                            private var validated: Boolean = false

                                            fun validate(): UnionMember0 = apply {
                                                if (validated) {
                                                    return@apply
                                                }

                                                validated = true
                                            }

                                            fun isValid(): Boolean =
                                                try {
                                                    validate()
                                                    true
                                                } catch (e: HanzoInvalidDataException) {
                                                    false
                                                }

                                            /**
                                             * Returns a score indicating how many valid values are
                                             * contained in this object recursively.
                                             *
                                             * Used for best match union deserialization.
                                             */
                                            internal fun validity(): Int =
                                                additionalProperties.count { (_, value) ->
                                                    !value.isNull() && !value.isMissing()
                                                }

                                            override fun equals(other: Any?): Boolean {
                                                if (this === other) {
                                                    return true
                                                }

                                                return other is UnionMember0 &&
                                                    additionalProperties ==
                                                        other.additionalProperties
                                            }

                                            private val hashCode: Int by lazy {
                                                Objects.hash(additionalProperties)
                                            }

                                            override fun hashCode(): Int = hashCode

                                            override fun toString() =
                                                "UnionMember0{additionalProperties=$additionalProperties}"
                                        }
                                    }

                                    override fun equals(other: Any?): Boolean {
                                        if (this === other) {
                                            return true
                                        }

                                        return other is ChatCompletionThinkingBlock &&
                                            type == other.type &&
                                            cacheControl == other.cacheControl &&
                                            signature == other.signature &&
                                            thinking == other.thinking &&
                                            additionalProperties == other.additionalProperties
                                    }

                                    private val hashCode: Int by lazy {
                                        Objects.hash(
                                            type,
                                            cacheControl,
                                            signature,
                                            thinking,
                                            additionalProperties,
                                        )
                                    }

                                    override fun hashCode(): Int = hashCode

                                    override fun toString() =
                                        "ChatCompletionThinkingBlock{type=$type, cacheControl=$cacheControl, signature=$signature, thinking=$thinking, additionalProperties=$additionalProperties}"
                                }

                                class ChatCompletionRedactedThinkingBlock
                                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                                private constructor(
                                    private val type: JsonValue,
                                    private val cacheControl: JsonField<CacheControl>,
                                    private val data: JsonField<String>,
                                    private val additionalProperties: MutableMap<String, JsonValue>,
                                ) {

                                    @JsonCreator
                                    private constructor(
                                        @JsonProperty("type")
                                        @ExcludeMissing
                                        type: JsonValue = JsonMissing.of(),
                                        @JsonProperty("cache_control")
                                        @ExcludeMissing
                                        cacheControl: JsonField<CacheControl> = JsonMissing.of(),
                                        @JsonProperty("data")
                                        @ExcludeMissing
                                        data: JsonField<String> = JsonMissing.of(),
                                    ) : this(type, cacheControl, data, mutableMapOf())

                                    /**
                                     * Expected to always return the following:
                                     * ```kotlin
                                     * JsonValue.from("redacted_thinking")
                                     * ```
                                     *
                                     * However, this method can be useful for debugging and logging
                                     * (e.g. if the server responded with an unexpected value).
                                     */
                                    @JsonProperty("type")
                                    @ExcludeMissing
                                    fun _type(): JsonValue = type

                                    /**
                                     * @throws HanzoInvalidDataException if the JSON field has an
                                     *   unexpected type (e.g. if the server responded with an
                                     *   unexpected value).
                                     */
                                    fun cacheControl(): CacheControl? =
                                        cacheControl.getNullable("cache_control")

                                    /**
                                     * @throws HanzoInvalidDataException if the JSON field has an
                                     *   unexpected type (e.g. if the server responded with an
                                     *   unexpected value).
                                     */
                                    fun data(): String? = data.getNullable("data")

                                    /**
                                     * Returns the raw JSON value of [cacheControl].
                                     *
                                     * Unlike [cacheControl], this method doesn't throw if the JSON
                                     * field has an unexpected type.
                                     */
                                    @JsonProperty("cache_control")
                                    @ExcludeMissing
                                    fun _cacheControl(): JsonField<CacheControl> = cacheControl

                                    /**
                                     * Returns the raw JSON value of [data].
                                     *
                                     * Unlike [data], this method doesn't throw if the JSON field
                                     * has an unexpected type.
                                     */
                                    @JsonProperty("data")
                                    @ExcludeMissing
                                    fun _data(): JsonField<String> = data

                                    @JsonAnySetter
                                    private fun putAdditionalProperty(
                                        key: String,
                                        value: JsonValue,
                                    ) {
                                        additionalProperties.put(key, value)
                                    }

                                    @JsonAnyGetter
                                    @ExcludeMissing
                                    fun _additionalProperties(): Map<String, JsonValue> =
                                        Collections.unmodifiableMap(additionalProperties)

                                    fun toBuilder() = Builder().from(this)

                                    companion object {

                                        /**
                                         * Returns a mutable builder for constructing an instance of
                                         * [ChatCompletionRedactedThinkingBlock].
                                         */
                                        fun builder() = Builder()
                                    }

                                    /** A builder for [ChatCompletionRedactedThinkingBlock]. */
                                    class Builder internal constructor() {

                                        private var type: JsonValue =
                                            JsonValue.from("redacted_thinking")
                                        private var cacheControl: JsonField<CacheControl> =
                                            JsonMissing.of()
                                        private var data: JsonField<String> = JsonMissing.of()
                                        private var additionalProperties:
                                            MutableMap<String, JsonValue> =
                                            mutableMapOf()

                                        internal fun from(
                                            chatCompletionRedactedThinkingBlock:
                                                ChatCompletionRedactedThinkingBlock
                                        ) = apply {
                                            type = chatCompletionRedactedThinkingBlock.type
                                            cacheControl =
                                                chatCompletionRedactedThinkingBlock.cacheControl
                                            data = chatCompletionRedactedThinkingBlock.data
                                            additionalProperties =
                                                chatCompletionRedactedThinkingBlock
                                                    .additionalProperties
                                                    .toMutableMap()
                                        }

                                        /**
                                         * Sets the field to an arbitrary JSON value.
                                         *
                                         * It is usually unnecessary to call this method because the
                                         * field defaults to the following:
                                         * ```kotlin
                                         * JsonValue.from("redacted_thinking")
                                         * ```
                                         *
                                         * This method is primarily for setting the field to an
                                         * undocumented or not yet supported value.
                                         */
                                        fun type(type: JsonValue) = apply { this.type = type }

                                        fun cacheControl(cacheControl: CacheControl?) =
                                            cacheControl(JsonField.ofNullable(cacheControl))

                                        /**
                                         * Sets [Builder.cacheControl] to an arbitrary JSON value.
                                         *
                                         * You should usually call [Builder.cacheControl] with a
                                         * well-typed [CacheControl] value instead. This method is
                                         * primarily for setting the field to an undocumented or not
                                         * yet supported value.
                                         */
                                        fun cacheControl(cacheControl: JsonField<CacheControl>) =
                                            apply {
                                                this.cacheControl = cacheControl
                                            }

                                        /**
                                         * Alias for calling [cacheControl] with
                                         * `CacheControl.ofUnionMember0(unionMember0)`.
                                         */
                                        fun cacheControl(unionMember0: CacheControl.UnionMember0) =
                                            cacheControl(CacheControl.ofUnionMember0(unionMember0))

                                        /**
                                         * Alias for calling [cacheControl] with
                                         * `CacheControl.ofChatCompletionCachedContent()`.
                                         */
                                        fun cacheControlChatCompletionCachedContent() =
                                            cacheControl(
                                                CacheControl.ofChatCompletionCachedContent()
                                            )

                                        fun data(data: String) = data(JsonField.of(data))

                                        /**
                                         * Sets [Builder.data] to an arbitrary JSON value.
                                         *
                                         * You should usually call [Builder.data] with a well-typed
                                         * [String] value instead. This method is primarily for
                                         * setting the field to an undocumented or not yet supported
                                         * value.
                                         */
                                        fun data(data: JsonField<String>) = apply {
                                            this.data = data
                                        }

                                        fun additionalProperties(
                                            additionalProperties: Map<String, JsonValue>
                                        ) = apply {
                                            this.additionalProperties.clear()
                                            putAllAdditionalProperties(additionalProperties)
                                        }

                                        fun putAdditionalProperty(key: String, value: JsonValue) =
                                            apply {
                                                additionalProperties.put(key, value)
                                            }

                                        fun putAllAdditionalProperties(
                                            additionalProperties: Map<String, JsonValue>
                                        ) = apply {
                                            this.additionalProperties.putAll(additionalProperties)
                                        }

                                        fun removeAdditionalProperty(key: String) = apply {
                                            additionalProperties.remove(key)
                                        }

                                        fun removeAllAdditionalProperties(keys: Set<String>) =
                                            apply {
                                                keys.forEach(::removeAdditionalProperty)
                                            }

                                        /**
                                         * Returns an immutable instance of
                                         * [ChatCompletionRedactedThinkingBlock].
                                         *
                                         * Further updates to this [Builder] will not mutate the
                                         * returned instance.
                                         */
                                        fun build(): ChatCompletionRedactedThinkingBlock =
                                            ChatCompletionRedactedThinkingBlock(
                                                type,
                                                cacheControl,
                                                data,
                                                additionalProperties.toMutableMap(),
                                            )
                                    }

                                    private var validated: Boolean = false

                                    fun validate(): ChatCompletionRedactedThinkingBlock = apply {
                                        if (validated) {
                                            return@apply
                                        }

                                        _type().let {
                                            if (it != JsonValue.from("redacted_thinking")) {
                                                throw HanzoInvalidDataException(
                                                    "'type' is invalid, received $it"
                                                )
                                            }
                                        }
                                        cacheControl()?.validate()
                                        data()
                                        validated = true
                                    }

                                    fun isValid(): Boolean =
                                        try {
                                            validate()
                                            true
                                        } catch (e: HanzoInvalidDataException) {
                                            false
                                        }

                                    /**
                                     * Returns a score indicating how many valid values are
                                     * contained in this object recursively.
                                     *
                                     * Used for best match union deserialization.
                                     */
                                    internal fun validity(): Int =
                                        type.let {
                                            if (it == JsonValue.from("redacted_thinking")) 1 else 0
                                        } +
                                            (cacheControl.asKnown()?.validity() ?: 0) +
                                            (if (data.asKnown() == null) 0 else 1)

                                    @JsonDeserialize(using = CacheControl.Deserializer::class)
                                    @JsonSerialize(using = CacheControl.Serializer::class)
                                    class CacheControl
                                    private constructor(
                                        private val unionMember0: UnionMember0? = null,
                                        private val chatCompletionCachedContent: JsonValue? = null,
                                        private val _json: JsonValue? = null,
                                    ) {

                                        fun unionMember0(): UnionMember0? = unionMember0

                                        fun chatCompletionCachedContent(): JsonValue? =
                                            chatCompletionCachedContent

                                        fun isUnionMember0(): Boolean = unionMember0 != null

                                        fun isChatCompletionCachedContent(): Boolean =
                                            chatCompletionCachedContent != null

                                        fun asUnionMember0(): UnionMember0 =
                                            unionMember0.getOrThrow("unionMember0")

                                        fun asChatCompletionCachedContent(): JsonValue =
                                            chatCompletionCachedContent.getOrThrow(
                                                "chatCompletionCachedContent"
                                            )

                                        fun _json(): JsonValue? = _json

                                        fun <T> accept(visitor: Visitor<T>): T =
                                            when {
                                                unionMember0 != null ->
                                                    visitor.visitUnionMember0(unionMember0)
                                                chatCompletionCachedContent != null ->
                                                    visitor.visitChatCompletionCachedContent(
                                                        chatCompletionCachedContent
                                                    )
                                                else -> visitor.unknown(_json)
                                            }

                                        private var validated: Boolean = false

                                        fun validate(): CacheControl = apply {
                                            if (validated) {
                                                return@apply
                                            }

                                            accept(
                                                object : Visitor<Unit> {
                                                    override fun visitUnionMember0(
                                                        unionMember0: UnionMember0
                                                    ) {
                                                        unionMember0.validate()
                                                    }

                                                    override fun visitChatCompletionCachedContent(
                                                        chatCompletionCachedContent: JsonValue
                                                    ) {
                                                        chatCompletionCachedContent.let {
                                                            if (
                                                                it !=
                                                                    JsonValue.from(
                                                                        mapOf("type" to "ephemeral")
                                                                    )
                                                            ) {
                                                                throw HanzoInvalidDataException(
                                                                    "'chatCompletionCachedContent' is invalid, received $it"
                                                                )
                                                            }
                                                        }
                                                    }
                                                }
                                            )
                                            validated = true
                                        }

                                        fun isValid(): Boolean =
                                            try {
                                                validate()
                                                true
                                            } catch (e: HanzoInvalidDataException) {
                                                false
                                            }

                                        /**
                                         * Returns a score indicating how many valid values are
                                         * contained in this object recursively.
                                         *
                                         * Used for best match union deserialization.
                                         */
                                        internal fun validity(): Int =
                                            accept(
                                                object : Visitor<Int> {
                                                    override fun visitUnionMember0(
                                                        unionMember0: UnionMember0
                                                    ) = unionMember0.validity()

                                                    override fun visitChatCompletionCachedContent(
                                                        chatCompletionCachedContent: JsonValue
                                                    ) =
                                                        chatCompletionCachedContent.let {
                                                            if (
                                                                it ==
                                                                    JsonValue.from(
                                                                        mapOf("type" to "ephemeral")
                                                                    )
                                                            )
                                                                1
                                                            else 0
                                                        }

                                                    override fun unknown(json: JsonValue?) = 0
                                                }
                                            )

                                        override fun equals(other: Any?): Boolean {
                                            if (this === other) {
                                                return true
                                            }

                                            return other is CacheControl &&
                                                unionMember0 == other.unionMember0 &&
                                                chatCompletionCachedContent ==
                                                    other.chatCompletionCachedContent
                                        }

                                        override fun hashCode(): Int =
                                            Objects.hash(unionMember0, chatCompletionCachedContent)

                                        override fun toString(): String =
                                            when {
                                                unionMember0 != null ->
                                                    "CacheControl{unionMember0=$unionMember0}"
                                                chatCompletionCachedContent != null ->
                                                    "CacheControl{chatCompletionCachedContent=$chatCompletionCachedContent}"
                                                _json != null -> "CacheControl{_unknown=$_json}"
                                                else ->
                                                    throw IllegalStateException(
                                                        "Invalid CacheControl"
                                                    )
                                            }

                                        companion object {

                                            fun ofUnionMember0(unionMember0: UnionMember0) =
                                                CacheControl(unionMember0 = unionMember0)

                                            fun ofChatCompletionCachedContent() =
                                                CacheControl(
                                                    chatCompletionCachedContent =
                                                        JsonValue.from(mapOf("type" to "ephemeral"))
                                                )
                                        }

                                        /**
                                         * An interface that defines how to map each variant of
                                         * [CacheControl] to a value of type [T].
                                         */
                                        interface Visitor<out T> {

                                            fun visitUnionMember0(unionMember0: UnionMember0): T

                                            fun visitChatCompletionCachedContent(
                                                chatCompletionCachedContent: JsonValue
                                            ): T

                                            /**
                                             * Maps an unknown variant of [CacheControl] to a value
                                             * of type [T].
                                             *
                                             * An instance of [CacheControl] can contain an unknown
                                             * variant if it was deserialized from data that doesn't
                                             * match any known variant. For example, if the SDK is
                                             * on an older version than the API, then the API may
                                             * respond with new variants that the SDK is unaware of.
                                             *
                                             * @throws HanzoInvalidDataException in the default
                                             *   implementation.
                                             */
                                            fun unknown(json: JsonValue?): T {
                                                throw HanzoInvalidDataException(
                                                    "Unknown CacheControl: $json"
                                                )
                                            }
                                        }

                                        internal class Deserializer :
                                            BaseDeserializer<CacheControl>(CacheControl::class) {

                                            override fun ObjectCodec.deserialize(
                                                node: JsonNode
                                            ): CacheControl {
                                                val json = JsonValue.fromJsonNode(node)

                                                val bestMatches =
                                                    sequenceOf(
                                                            tryDeserialize(
                                                                    node,
                                                                    jacksonTypeRef<JsonValue>(),
                                                                )
                                                                ?.let {
                                                                    CacheControl(
                                                                        chatCompletionCachedContent =
                                                                            it,
                                                                        _json = json,
                                                                    )
                                                                }
                                                                ?.takeIf { it.isValid() },
                                                            tryDeserialize(
                                                                    node,
                                                                    jacksonTypeRef<UnionMember0>(),
                                                                )
                                                                ?.let {
                                                                    CacheControl(
                                                                        unionMember0 = it,
                                                                        _json = json,
                                                                    )
                                                                },
                                                        )
                                                        .filterNotNull()
                                                        .allMaxBy { it.validity() }
                                                        .toList()
                                                return when (bestMatches.size) {
                                                    // This can happen if what we're deserializing
                                                    // is completely incompatible with all the
                                                    // possible variants (e.g. deserializing from
                                                    // boolean).
                                                    0 -> CacheControl(_json = json)
                                                    1 -> bestMatches.single()
                                                    // If there's more than one match with the
                                                    // highest validity, then use the first
                                                    // completely valid match, or simply the first
                                                    // match if none are completely valid.
                                                    else ->
                                                        bestMatches.firstOrNull { it.isValid() }
                                                            ?: bestMatches.first()
                                                }
                                            }
                                        }

                                        internal class Serializer :
                                            BaseSerializer<CacheControl>(CacheControl::class) {

                                            override fun serialize(
                                                value: CacheControl,
                                                generator: JsonGenerator,
                                                provider: SerializerProvider,
                                            ) {
                                                when {
                                                    value.unionMember0 != null ->
                                                        generator.writeObject(value.unionMember0)
                                                    value.chatCompletionCachedContent != null ->
                                                        generator.writeObject(
                                                            value.chatCompletionCachedContent
                                                        )
                                                    value._json != null ->
                                                        generator.writeObject(value._json)
                                                    else ->
                                                        throw IllegalStateException(
                                                            "Invalid CacheControl"
                                                        )
                                                }
                                            }
                                        }

                                        class UnionMember0
                                        @JsonCreator
                                        private constructor(
                                            @com.fasterxml.jackson.annotation.JsonValue
                                            private val additionalProperties: Map<String, JsonValue>
                                        ) {

                                            @JsonAnyGetter
                                            @ExcludeMissing
                                            fun _additionalProperties(): Map<String, JsonValue> =
                                                additionalProperties

                                            fun toBuilder() = Builder().from(this)

                                            companion object {

                                                /**
                                                 * Returns a mutable builder for constructing an
                                                 * instance of [UnionMember0].
                                                 */
                                                fun builder() = Builder()
                                            }

                                            /** A builder for [UnionMember0]. */
                                            class Builder internal constructor() {

                                                private var additionalProperties:
                                                    MutableMap<String, JsonValue> =
                                                    mutableMapOf()

                                                internal fun from(unionMember0: UnionMember0) =
                                                    apply {
                                                        additionalProperties =
                                                            unionMember0.additionalProperties
                                                                .toMutableMap()
                                                    }

                                                fun additionalProperties(
                                                    additionalProperties: Map<String, JsonValue>
                                                ) = apply {
                                                    this.additionalProperties.clear()
                                                    putAllAdditionalProperties(additionalProperties)
                                                }

                                                fun putAdditionalProperty(
                                                    key: String,
                                                    value: JsonValue,
                                                ) = apply { additionalProperties.put(key, value) }

                                                fun putAllAdditionalProperties(
                                                    additionalProperties: Map<String, JsonValue>
                                                ) = apply {
                                                    this.additionalProperties.putAll(
                                                        additionalProperties
                                                    )
                                                }

                                                fun removeAdditionalProperty(key: String) = apply {
                                                    additionalProperties.remove(key)
                                                }

                                                fun removeAllAdditionalProperties(
                                                    keys: Set<String>
                                                ) = apply {
                                                    keys.forEach(::removeAdditionalProperty)
                                                }

                                                /**
                                                 * Returns an immutable instance of [UnionMember0].
                                                 *
                                                 * Further updates to this [Builder] will not mutate
                                                 * the returned instance.
                                                 */
                                                fun build(): UnionMember0 =
                                                    UnionMember0(additionalProperties.toImmutable())
                                            }

                                            private var validated: Boolean = false

                                            fun validate(): UnionMember0 = apply {
                                                if (validated) {
                                                    return@apply
                                                }

                                                validated = true
                                            }

                                            fun isValid(): Boolean =
                                                try {
                                                    validate()
                                                    true
                                                } catch (e: HanzoInvalidDataException) {
                                                    false
                                                }

                                            /**
                                             * Returns a score indicating how many valid values are
                                             * contained in this object recursively.
                                             *
                                             * Used for best match union deserialization.
                                             */
                                            internal fun validity(): Int =
                                                additionalProperties.count { (_, value) ->
                                                    !value.isNull() && !value.isMissing()
                                                }

                                            override fun equals(other: Any?): Boolean {
                                                if (this === other) {
                                                    return true
                                                }

                                                return other is UnionMember0 &&
                                                    additionalProperties ==
                                                        other.additionalProperties
                                            }

                                            private val hashCode: Int by lazy {
                                                Objects.hash(additionalProperties)
                                            }

                                            override fun hashCode(): Int = hashCode

                                            override fun toString() =
                                                "UnionMember0{additionalProperties=$additionalProperties}"
                                        }
                                    }

                                    override fun equals(other: Any?): Boolean {
                                        if (this === other) {
                                            return true
                                        }

                                        return other is ChatCompletionRedactedThinkingBlock &&
                                            type == other.type &&
                                            cacheControl == other.cacheControl &&
                                            data == other.data &&
                                            additionalProperties == other.additionalProperties
                                    }

                                    private val hashCode: Int by lazy {
                                        Objects.hash(type, cacheControl, data, additionalProperties)
                                    }

                                    override fun hashCode(): Int = hashCode

                                    override fun toString() =
                                        "ChatCompletionRedactedThinkingBlock{type=$type, cacheControl=$cacheControl, data=$data, additionalProperties=$additionalProperties}"
                                }
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Message &&
                                    content == other.content &&
                                    functionCall == other.functionCall &&
                                    role == other.role &&
                                    toolCalls == other.toolCalls &&
                                    annotations == other.annotations &&
                                    audio == other.audio &&
                                    images == other.images &&
                                    providerSpecificFields == other.providerSpecificFields &&
                                    reasoningContent == other.reasoningContent &&
                                    thinkingBlocks == other.thinkingBlocks &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy {
                                Objects.hash(
                                    content,
                                    functionCall,
                                    role,
                                    toolCalls,
                                    annotations,
                                    audio,
                                    images,
                                    providerSpecificFields,
                                    reasoningContent,
                                    thinkingBlocks,
                                    additionalProperties,
                                )
                            }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "Message{content=$content, functionCall=$functionCall, role=$role, toolCalls=$toolCalls, annotations=$annotations, audio=$audio, images=$images, providerSpecificFields=$providerSpecificFields, reasoningContent=$reasoningContent, thinkingBlocks=$thinkingBlocks, additionalProperties=$additionalProperties}"
                        }

                        @JsonDeserialize(using = Logprobs.Deserializer::class)
                        @JsonSerialize(using = Logprobs.Serializer::class)
                        class Logprobs
                        private constructor(
                            private val choice: ChoiceLogprobs? = null,
                            private val jsonValue: JsonValue? = null,
                            private val _json: JsonValue? = null,
                        ) {

                            fun choice(): ChoiceLogprobs? = choice

                            fun jsonValue(): JsonValue? = jsonValue

                            fun isChoice(): Boolean = choice != null

                            fun isJsonValue(): Boolean = jsonValue != null

                            fun asChoice(): ChoiceLogprobs = choice.getOrThrow("choice")

                            fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

                            fun _json(): JsonValue? = _json

                            fun <T> accept(visitor: Visitor<T>): T =
                                when {
                                    choice != null -> visitor.visitChoice(choice)
                                    jsonValue != null -> visitor.visitJsonValue(jsonValue)
                                    else -> visitor.unknown(_json)
                                }

                            private var validated: Boolean = false

                            fun validate(): Logprobs = apply {
                                if (validated) {
                                    return@apply
                                }

                                accept(
                                    object : Visitor<Unit> {
                                        override fun visitChoice(choice: ChoiceLogprobs) {
                                            choice.validate()
                                        }

                                        override fun visitJsonValue(jsonValue: JsonValue) {}
                                    }
                                )
                                validated = true
                            }

                            fun isValid(): Boolean =
                                try {
                                    validate()
                                    true
                                } catch (e: HanzoInvalidDataException) {
                                    false
                                }

                            /**
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                accept(
                                    object : Visitor<Int> {
                                        override fun visitChoice(choice: ChoiceLogprobs) =
                                            choice.validity()

                                        override fun visitJsonValue(jsonValue: JsonValue) = 1

                                        override fun unknown(json: JsonValue?) = 0
                                    }
                                )

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Logprobs &&
                                    choice == other.choice &&
                                    jsonValue == other.jsonValue
                            }

                            override fun hashCode(): Int = Objects.hash(choice, jsonValue)

                            override fun toString(): String =
                                when {
                                    choice != null -> "Logprobs{choice=$choice}"
                                    jsonValue != null -> "Logprobs{jsonValue=$jsonValue}"
                                    _json != null -> "Logprobs{_unknown=$_json}"
                                    else -> throw IllegalStateException("Invalid Logprobs")
                                }

                            companion object {

                                fun ofChoice(choice: ChoiceLogprobs) = Logprobs(choice = choice)

                                fun ofJsonValue(jsonValue: JsonValue) =
                                    Logprobs(jsonValue = jsonValue)
                            }

                            /**
                             * An interface that defines how to map each variant of [Logprobs] to a
                             * value of type [T].
                             */
                            interface Visitor<out T> {

                                fun visitChoice(choice: ChoiceLogprobs): T

                                fun visitJsonValue(jsonValue: JsonValue): T

                                /**
                                 * Maps an unknown variant of [Logprobs] to a value of type [T].
                                 *
                                 * An instance of [Logprobs] can contain an unknown variant if it
                                 * was deserialized from data that doesn't match any known variant.
                                 * For example, if the SDK is on an older version than the API, then
                                 * the API may respond with new variants that the SDK is unaware of.
                                 *
                                 * @throws HanzoInvalidDataException in the default implementation.
                                 */
                                fun unknown(json: JsonValue?): T {
                                    throw HanzoInvalidDataException("Unknown Logprobs: $json")
                                }
                            }

                            internal class Deserializer :
                                BaseDeserializer<Logprobs>(Logprobs::class) {

                                override fun ObjectCodec.deserialize(node: JsonNode): Logprobs {
                                    val json = JsonValue.fromJsonNode(node)

                                    val bestMatches =
                                        sequenceOf(
                                                tryDeserialize(
                                                        node,
                                                        jacksonTypeRef<ChoiceLogprobs>(),
                                                    )
                                                    ?.let { Logprobs(choice = it, _json = json) },
                                                tryDeserialize(node, jacksonTypeRef<JsonValue>())
                                                    ?.let { Logprobs(jsonValue = it, _json = json) },
                                            )
                                            .filterNotNull()
                                            .allMaxBy { it.validity() }
                                            .toList()
                                    return when (bestMatches.size) {
                                        // This can happen if what we're deserializing is completely
                                        // incompatible with all the possible variants.
                                        0 -> Logprobs(_json = json)
                                        1 -> bestMatches.single()
                                        // If there's more than one match with the highest validity,
                                        // then use the first completely valid match, or simply the
                                        // first match if none are completely valid.
                                        else ->
                                            bestMatches.firstOrNull { it.isValid() }
                                                ?: bestMatches.first()
                                    }
                                }
                            }

                            internal class Serializer : BaseSerializer<Logprobs>(Logprobs::class) {

                                override fun serialize(
                                    value: Logprobs,
                                    generator: JsonGenerator,
                                    provider: SerializerProvider,
                                ) {
                                    when {
                                        value.choice != null -> generator.writeObject(value.choice)
                                        value.jsonValue != null ->
                                            generator.writeObject(value.jsonValue)
                                        value._json != null -> generator.writeObject(value._json)
                                        else -> throw IllegalStateException("Invalid Logprobs")
                                    }
                                }
                            }

                            class ChoiceLogprobs
                            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                            private constructor(
                                private val content: JsonField<List<Content>>,
                                private val additionalProperties: MutableMap<String, JsonValue>,
                            ) {

                                @JsonCreator
                                private constructor(
                                    @JsonProperty("content")
                                    @ExcludeMissing
                                    content: JsonField<List<Content>> = JsonMissing.of()
                                ) : this(content, mutableMapOf())

                                /**
                                 * @throws HanzoInvalidDataException if the JSON field has an
                                 *   unexpected type (e.g. if the server responded with an
                                 *   unexpected value).
                                 */
                                fun content(): List<Content>? = content.getNullable("content")

                                /**
                                 * Returns the raw JSON value of [content].
                                 *
                                 * Unlike [content], this method doesn't throw if the JSON field has
                                 * an unexpected type.
                                 */
                                @JsonProperty("content")
                                @ExcludeMissing
                                fun _content(): JsonField<List<Content>> = content

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
                                     * Returns a mutable builder for constructing an instance of
                                     * [ChoiceLogprobs].
                                     */
                                    fun builder() = Builder()
                                }

                                /** A builder for [ChoiceLogprobs]. */
                                class Builder internal constructor() {

                                    private var content: JsonField<MutableList<Content>>? = null
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    internal fun from(choiceLogprobs: ChoiceLogprobs) = apply {
                                        content = choiceLogprobs.content.map { it.toMutableList() }
                                        additionalProperties =
                                            choiceLogprobs.additionalProperties.toMutableMap()
                                    }

                                    fun content(content: List<Content>?) =
                                        content(JsonField.ofNullable(content))

                                    /**
                                     * Sets [Builder.content] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.content] with a well-typed
                                     * `List<Content>` value instead. This method is primarily for
                                     * setting the field to an undocumented or not yet supported
                                     * value.
                                     */
                                    fun content(content: JsonField<List<Content>>) = apply {
                                        this.content = content.map { it.toMutableList() }
                                    }

                                    /**
                                     * Adds a single [Content] to [Builder.content].
                                     *
                                     * @throws IllegalStateException if the field was previously set
                                     *   to a non-list.
                                     */
                                    fun addContent(content: Content) = apply {
                                        this.content =
                                            (this.content ?: JsonField.of(mutableListOf())).also {
                                                checkKnown("content", it).add(content)
                                            }
                                    }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [ChoiceLogprobs].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     */
                                    fun build(): ChoiceLogprobs =
                                        ChoiceLogprobs(
                                            (content ?: JsonMissing.of()).map { it.toImmutable() },
                                            additionalProperties.toMutableMap(),
                                        )
                                }

                                private var validated: Boolean = false

                                fun validate(): ChoiceLogprobs = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    content()?.forEach { it.validate() }
                                    validated = true
                                }

                                fun isValid(): Boolean =
                                    try {
                                        validate()
                                        true
                                    } catch (e: HanzoInvalidDataException) {
                                        false
                                    }

                                /**
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    (content.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

                                class Content
                                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                                private constructor(
                                    private val token: JsonField<String>,
                                    private val logprob: JsonField<Double>,
                                    private val topLogprobs: JsonField<List<TopLogprob>>,
                                    private val bytes: JsonField<List<Long>>,
                                    private val additionalProperties: MutableMap<String, JsonValue>,
                                ) {

                                    @JsonCreator
                                    private constructor(
                                        @JsonProperty("token")
                                        @ExcludeMissing
                                        token: JsonField<String> = JsonMissing.of(),
                                        @JsonProperty("logprob")
                                        @ExcludeMissing
                                        logprob: JsonField<Double> = JsonMissing.of(),
                                        @JsonProperty("top_logprobs")
                                        @ExcludeMissing
                                        topLogprobs: JsonField<List<TopLogprob>> = JsonMissing.of(),
                                        @JsonProperty("bytes")
                                        @ExcludeMissing
                                        bytes: JsonField<List<Long>> = JsonMissing.of(),
                                    ) : this(token, logprob, topLogprobs, bytes, mutableMapOf())

                                    /**
                                     * @throws HanzoInvalidDataException if the JSON field has an
                                     *   unexpected type or is unexpectedly missing or null (e.g. if
                                     *   the server responded with an unexpected value).
                                     */
                                    fun token(): String = token.getRequired("token")

                                    /**
                                     * @throws HanzoInvalidDataException if the JSON field has an
                                     *   unexpected type or is unexpectedly missing or null (e.g. if
                                     *   the server responded with an unexpected value).
                                     */
                                    fun logprob(): Double = logprob.getRequired("logprob")

                                    /**
                                     * @throws HanzoInvalidDataException if the JSON field has an
                                     *   unexpected type or is unexpectedly missing or null (e.g. if
                                     *   the server responded with an unexpected value).
                                     */
                                    fun topLogprobs(): List<TopLogprob> =
                                        topLogprobs.getRequired("top_logprobs")

                                    /**
                                     * @throws HanzoInvalidDataException if the JSON field has an
                                     *   unexpected type (e.g. if the server responded with an
                                     *   unexpected value).
                                     */
                                    fun bytes(): List<Long>? = bytes.getNullable("bytes")

                                    /**
                                     * Returns the raw JSON value of [token].
                                     *
                                     * Unlike [token], this method doesn't throw if the JSON field
                                     * has an unexpected type.
                                     */
                                    @JsonProperty("token")
                                    @ExcludeMissing
                                    fun _token(): JsonField<String> = token

                                    /**
                                     * Returns the raw JSON value of [logprob].
                                     *
                                     * Unlike [logprob], this method doesn't throw if the JSON field
                                     * has an unexpected type.
                                     */
                                    @JsonProperty("logprob")
                                    @ExcludeMissing
                                    fun _logprob(): JsonField<Double> = logprob

                                    /**
                                     * Returns the raw JSON value of [topLogprobs].
                                     *
                                     * Unlike [topLogprobs], this method doesn't throw if the JSON
                                     * field has an unexpected type.
                                     */
                                    @JsonProperty("top_logprobs")
                                    @ExcludeMissing
                                    fun _topLogprobs(): JsonField<List<TopLogprob>> = topLogprobs

                                    /**
                                     * Returns the raw JSON value of [bytes].
                                     *
                                     * Unlike [bytes], this method doesn't throw if the JSON field
                                     * has an unexpected type.
                                     */
                                    @JsonProperty("bytes")
                                    @ExcludeMissing
                                    fun _bytes(): JsonField<List<Long>> = bytes

                                    @JsonAnySetter
                                    private fun putAdditionalProperty(
                                        key: String,
                                        value: JsonValue,
                                    ) {
                                        additionalProperties.put(key, value)
                                    }

                                    @JsonAnyGetter
                                    @ExcludeMissing
                                    fun _additionalProperties(): Map<String, JsonValue> =
                                        Collections.unmodifiableMap(additionalProperties)

                                    fun toBuilder() = Builder().from(this)

                                    companion object {

                                        /**
                                         * Returns a mutable builder for constructing an instance of
                                         * [Content].
                                         *
                                         * The following fields are required:
                                         * ```kotlin
                                         * .token()
                                         * .logprob()
                                         * .topLogprobs()
                                         * ```
                                         */
                                        fun builder() = Builder()
                                    }

                                    /** A builder for [Content]. */
                                    class Builder internal constructor() {

                                        private var token: JsonField<String>? = null
                                        private var logprob: JsonField<Double>? = null
                                        private var topLogprobs:
                                            JsonField<MutableList<TopLogprob>>? =
                                            null
                                        private var bytes: JsonField<MutableList<Long>>? = null
                                        private var additionalProperties:
                                            MutableMap<String, JsonValue> =
                                            mutableMapOf()

                                        internal fun from(content: Content) = apply {
                                            token = content.token
                                            logprob = content.logprob
                                            topLogprobs =
                                                content.topLogprobs.map { it.toMutableList() }
                                            bytes = content.bytes.map { it.toMutableList() }
                                            additionalProperties =
                                                content.additionalProperties.toMutableMap()
                                        }

                                        fun token(token: String) = token(JsonField.of(token))

                                        /**
                                         * Sets [Builder.token] to an arbitrary JSON value.
                                         *
                                         * You should usually call [Builder.token] with a well-typed
                                         * [String] value instead. This method is primarily for
                                         * setting the field to an undocumented or not yet supported
                                         * value.
                                         */
                                        fun token(token: JsonField<String>) = apply {
                                            this.token = token
                                        }

                                        fun logprob(logprob: Double) =
                                            logprob(JsonField.of(logprob))

                                        /**
                                         * Sets [Builder.logprob] to an arbitrary JSON value.
                                         *
                                         * You should usually call [Builder.logprob] with a
                                         * well-typed [Double] value instead. This method is
                                         * primarily for setting the field to an undocumented or not
                                         * yet supported value.
                                         */
                                        fun logprob(logprob: JsonField<Double>) = apply {
                                            this.logprob = logprob
                                        }

                                        fun topLogprobs(topLogprobs: List<TopLogprob>) =
                                            topLogprobs(JsonField.of(topLogprobs))

                                        /**
                                         * Sets [Builder.topLogprobs] to an arbitrary JSON value.
                                         *
                                         * You should usually call [Builder.topLogprobs] with a
                                         * well-typed `List<TopLogprob>` value instead. This method
                                         * is primarily for setting the field to an undocumented or
                                         * not yet supported value.
                                         */
                                        fun topLogprobs(topLogprobs: JsonField<List<TopLogprob>>) =
                                            apply {
                                                this.topLogprobs =
                                                    topLogprobs.map { it.toMutableList() }
                                            }

                                        /**
                                         * Adds a single [TopLogprob] to [topLogprobs].
                                         *
                                         * @throws IllegalStateException if the field was previously
                                         *   set to a non-list.
                                         */
                                        fun addTopLogprob(topLogprob: TopLogprob) = apply {
                                            topLogprobs =
                                                (topLogprobs ?: JsonField.of(mutableListOf()))
                                                    .also {
                                                        checkKnown("topLogprobs", it)
                                                            .add(topLogprob)
                                                    }
                                        }

                                        fun bytes(bytes: List<Long>?) =
                                            bytes(JsonField.ofNullable(bytes))

                                        /**
                                         * Sets [Builder.bytes] to an arbitrary JSON value.
                                         *
                                         * You should usually call [Builder.bytes] with a well-typed
                                         * `List<Long>` value instead. This method is primarily for
                                         * setting the field to an undocumented or not yet supported
                                         * value.
                                         */
                                        fun bytes(bytes: JsonField<List<Long>>) = apply {
                                            this.bytes = bytes.map { it.toMutableList() }
                                        }

                                        /**
                                         * Adds a single [Long] to [bytes].
                                         *
                                         * @throws IllegalStateException if the field was previously
                                         *   set to a non-list.
                                         */
                                        fun addByte(byte: Long) = apply {
                                            bytes =
                                                (bytes ?: JsonField.of(mutableListOf())).also {
                                                    checkKnown("bytes", it).add(byte)
                                                }
                                        }

                                        fun additionalProperties(
                                            additionalProperties: Map<String, JsonValue>
                                        ) = apply {
                                            this.additionalProperties.clear()
                                            putAllAdditionalProperties(additionalProperties)
                                        }

                                        fun putAdditionalProperty(key: String, value: JsonValue) =
                                            apply {
                                                additionalProperties.put(key, value)
                                            }

                                        fun putAllAdditionalProperties(
                                            additionalProperties: Map<String, JsonValue>
                                        ) = apply {
                                            this.additionalProperties.putAll(additionalProperties)
                                        }

                                        fun removeAdditionalProperty(key: String) = apply {
                                            additionalProperties.remove(key)
                                        }

                                        fun removeAllAdditionalProperties(keys: Set<String>) =
                                            apply {
                                                keys.forEach(::removeAdditionalProperty)
                                            }

                                        /**
                                         * Returns an immutable instance of [Content].
                                         *
                                         * Further updates to this [Builder] will not mutate the
                                         * returned instance.
                                         *
                                         * The following fields are required:
                                         * ```kotlin
                                         * .token()
                                         * .logprob()
                                         * .topLogprobs()
                                         * ```
                                         *
                                         * @throws IllegalStateException if any required field is
                                         *   unset.
                                         */
                                        fun build(): Content =
                                            Content(
                                                checkRequired("token", token),
                                                checkRequired("logprob", logprob),
                                                checkRequired("topLogprobs", topLogprobs).map {
                                                    it.toImmutable()
                                                },
                                                (bytes ?: JsonMissing.of()).map {
                                                    it.toImmutable()
                                                },
                                                additionalProperties.toMutableMap(),
                                            )
                                    }

                                    private var validated: Boolean = false

                                    fun validate(): Content = apply {
                                        if (validated) {
                                            return@apply
                                        }

                                        token()
                                        logprob()
                                        topLogprobs().forEach { it.validate() }
                                        bytes()
                                        validated = true
                                    }

                                    fun isValid(): Boolean =
                                        try {
                                            validate()
                                            true
                                        } catch (e: HanzoInvalidDataException) {
                                            false
                                        }

                                    /**
                                     * Returns a score indicating how many valid values are
                                     * contained in this object recursively.
                                     *
                                     * Used for best match union deserialization.
                                     */
                                    internal fun validity(): Int =
                                        (if (token.asKnown() == null) 0 else 1) +
                                            (if (logprob.asKnown() == null) 0 else 1) +
                                            (topLogprobs.asKnown()?.sumOf { it.validity().toInt() }
                                                ?: 0) +
                                            (bytes.asKnown()?.size ?: 0)

                                    class TopLogprob
                                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                                    private constructor(
                                        private val token: JsonField<String>,
                                        private val logprob: JsonField<Double>,
                                        private val bytes: JsonField<List<Long>>,
                                        private val additionalProperties:
                                            MutableMap<String, JsonValue>,
                                    ) {

                                        @JsonCreator
                                        private constructor(
                                            @JsonProperty("token")
                                            @ExcludeMissing
                                            token: JsonField<String> = JsonMissing.of(),
                                            @JsonProperty("logprob")
                                            @ExcludeMissing
                                            logprob: JsonField<Double> = JsonMissing.of(),
                                            @JsonProperty("bytes")
                                            @ExcludeMissing
                                            bytes: JsonField<List<Long>> = JsonMissing.of(),
                                        ) : this(token, logprob, bytes, mutableMapOf())

                                        /**
                                         * @throws HanzoInvalidDataException if the JSON field has
                                         *   an unexpected type or is unexpectedly missing or null
                                         *   (e.g. if the server responded with an unexpected
                                         *   value).
                                         */
                                        fun token(): String = token.getRequired("token")

                                        /**
                                         * @throws HanzoInvalidDataException if the JSON field has
                                         *   an unexpected type or is unexpectedly missing or null
                                         *   (e.g. if the server responded with an unexpected
                                         *   value).
                                         */
                                        fun logprob(): Double = logprob.getRequired("logprob")

                                        /**
                                         * @throws HanzoInvalidDataException if the JSON field has
                                         *   an unexpected type (e.g. if the server responded with
                                         *   an unexpected value).
                                         */
                                        fun bytes(): List<Long>? = bytes.getNullable("bytes")

                                        /**
                                         * Returns the raw JSON value of [token].
                                         *
                                         * Unlike [token], this method doesn't throw if the JSON
                                         * field has an unexpected type.
                                         */
                                        @JsonProperty("token")
                                        @ExcludeMissing
                                        fun _token(): JsonField<String> = token

                                        /**
                                         * Returns the raw JSON value of [logprob].
                                         *
                                         * Unlike [logprob], this method doesn't throw if the JSON
                                         * field has an unexpected type.
                                         */
                                        @JsonProperty("logprob")
                                        @ExcludeMissing
                                        fun _logprob(): JsonField<Double> = logprob

                                        /**
                                         * Returns the raw JSON value of [bytes].
                                         *
                                         * Unlike [bytes], this method doesn't throw if the JSON
                                         * field has an unexpected type.
                                         */
                                        @JsonProperty("bytes")
                                        @ExcludeMissing
                                        fun _bytes(): JsonField<List<Long>> = bytes

                                        @JsonAnySetter
                                        private fun putAdditionalProperty(
                                            key: String,
                                            value: JsonValue,
                                        ) {
                                            additionalProperties.put(key, value)
                                        }

                                        @JsonAnyGetter
                                        @ExcludeMissing
                                        fun _additionalProperties(): Map<String, JsonValue> =
                                            Collections.unmodifiableMap(additionalProperties)

                                        fun toBuilder() = Builder().from(this)

                                        companion object {

                                            /**
                                             * Returns a mutable builder for constructing an
                                             * instance of [TopLogprob].
                                             *
                                             * The following fields are required:
                                             * ```kotlin
                                             * .token()
                                             * .logprob()
                                             * ```
                                             */
                                            fun builder() = Builder()
                                        }

                                        /** A builder for [TopLogprob]. */
                                        class Builder internal constructor() {

                                            private var token: JsonField<String>? = null
                                            private var logprob: JsonField<Double>? = null
                                            private var bytes: JsonField<MutableList<Long>>? = null
                                            private var additionalProperties:
                                                MutableMap<String, JsonValue> =
                                                mutableMapOf()

                                            internal fun from(topLogprob: TopLogprob) = apply {
                                                token = topLogprob.token
                                                logprob = topLogprob.logprob
                                                bytes = topLogprob.bytes.map { it.toMutableList() }
                                                additionalProperties =
                                                    topLogprob.additionalProperties.toMutableMap()
                                            }

                                            fun token(token: String) = token(JsonField.of(token))

                                            /**
                                             * Sets [Builder.token] to an arbitrary JSON value.
                                             *
                                             * You should usually call [Builder.token] with a
                                             * well-typed [String] value instead. This method is
                                             * primarily for setting the field to an undocumented or
                                             * not yet supported value.
                                             */
                                            fun token(token: JsonField<String>) = apply {
                                                this.token = token
                                            }

                                            fun logprob(logprob: Double) =
                                                logprob(JsonField.of(logprob))

                                            /**
                                             * Sets [Builder.logprob] to an arbitrary JSON value.
                                             *
                                             * You should usually call [Builder.logprob] with a
                                             * well-typed [Double] value instead. This method is
                                             * primarily for setting the field to an undocumented or
                                             * not yet supported value.
                                             */
                                            fun logprob(logprob: JsonField<Double>) = apply {
                                                this.logprob = logprob
                                            }

                                            fun bytes(bytes: List<Long>?) =
                                                bytes(JsonField.ofNullable(bytes))

                                            /**
                                             * Sets [Builder.bytes] to an arbitrary JSON value.
                                             *
                                             * You should usually call [Builder.bytes] with a
                                             * well-typed `List<Long>` value instead. This method is
                                             * primarily for setting the field to an undocumented or
                                             * not yet supported value.
                                             */
                                            fun bytes(bytes: JsonField<List<Long>>) = apply {
                                                this.bytes = bytes.map { it.toMutableList() }
                                            }

                                            /**
                                             * Adds a single [Long] to [bytes].
                                             *
                                             * @throws IllegalStateException if the field was
                                             *   previously set to a non-list.
                                             */
                                            fun addByte(byte: Long) = apply {
                                                bytes =
                                                    (bytes ?: JsonField.of(mutableListOf())).also {
                                                        checkKnown("bytes", it).add(byte)
                                                    }
                                            }

                                            fun additionalProperties(
                                                additionalProperties: Map<String, JsonValue>
                                            ) = apply {
                                                this.additionalProperties.clear()
                                                putAllAdditionalProperties(additionalProperties)
                                            }

                                            fun putAdditionalProperty(
                                                key: String,
                                                value: JsonValue,
                                            ) = apply { additionalProperties.put(key, value) }

                                            fun putAllAdditionalProperties(
                                                additionalProperties: Map<String, JsonValue>
                                            ) = apply {
                                                this.additionalProperties.putAll(
                                                    additionalProperties
                                                )
                                            }

                                            fun removeAdditionalProperty(key: String) = apply {
                                                additionalProperties.remove(key)
                                            }

                                            fun removeAllAdditionalProperties(keys: Set<String>) =
                                                apply {
                                                    keys.forEach(::removeAdditionalProperty)
                                                }

                                            /**
                                             * Returns an immutable instance of [TopLogprob].
                                             *
                                             * Further updates to this [Builder] will not mutate the
                                             * returned instance.
                                             *
                                             * The following fields are required:
                                             * ```kotlin
                                             * .token()
                                             * .logprob()
                                             * ```
                                             *
                                             * @throws IllegalStateException if any required field
                                             *   is unset.
                                             */
                                            fun build(): TopLogprob =
                                                TopLogprob(
                                                    checkRequired("token", token),
                                                    checkRequired("logprob", logprob),
                                                    (bytes ?: JsonMissing.of()).map {
                                                        it.toImmutable()
                                                    },
                                                    additionalProperties.toMutableMap(),
                                                )
                                        }

                                        private var validated: Boolean = false

                                        fun validate(): TopLogprob = apply {
                                            if (validated) {
                                                return@apply
                                            }

                                            token()
                                            logprob()
                                            bytes()
                                            validated = true
                                        }

                                        fun isValid(): Boolean =
                                            try {
                                                validate()
                                                true
                                            } catch (e: HanzoInvalidDataException) {
                                                false
                                            }

                                        /**
                                         * Returns a score indicating how many valid values are
                                         * contained in this object recursively.
                                         *
                                         * Used for best match union deserialization.
                                         */
                                        internal fun validity(): Int =
                                            (if (token.asKnown() == null) 0 else 1) +
                                                (if (logprob.asKnown() == null) 0 else 1) +
                                                (bytes.asKnown()?.size ?: 0)

                                        override fun equals(other: Any?): Boolean {
                                            if (this === other) {
                                                return true
                                            }

                                            return other is TopLogprob &&
                                                token == other.token &&
                                                logprob == other.logprob &&
                                                bytes == other.bytes &&
                                                additionalProperties == other.additionalProperties
                                        }

                                        private val hashCode: Int by lazy {
                                            Objects.hash(
                                                token,
                                                logprob,
                                                bytes,
                                                additionalProperties,
                                            )
                                        }

                                        override fun hashCode(): Int = hashCode

                                        override fun toString() =
                                            "TopLogprob{token=$token, logprob=$logprob, bytes=$bytes, additionalProperties=$additionalProperties}"
                                    }

                                    override fun equals(other: Any?): Boolean {
                                        if (this === other) {
                                            return true
                                        }

                                        return other is Content &&
                                            token == other.token &&
                                            logprob == other.logprob &&
                                            topLogprobs == other.topLogprobs &&
                                            bytes == other.bytes &&
                                            additionalProperties == other.additionalProperties
                                    }

                                    private val hashCode: Int by lazy {
                                        Objects.hash(
                                            token,
                                            logprob,
                                            topLogprobs,
                                            bytes,
                                            additionalProperties,
                                        )
                                    }

                                    override fun hashCode(): Int = hashCode

                                    override fun toString() =
                                        "Content{token=$token, logprob=$logprob, topLogprobs=$topLogprobs, bytes=$bytes, additionalProperties=$additionalProperties}"
                                }

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is ChoiceLogprobs &&
                                        content == other.content &&
                                        additionalProperties == other.additionalProperties
                                }

                                private val hashCode: Int by lazy {
                                    Objects.hash(content, additionalProperties)
                                }

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "ChoiceLogprobs{content=$content, additionalProperties=$additionalProperties}"
                            }
                        }

                        class ProviderSpecificFields
                        @JsonCreator
                        private constructor(
                            @com.fasterxml.jackson.annotation.JsonValue
                            private val additionalProperties: Map<String, JsonValue>
                        ) {

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            fun toBuilder() = Builder().from(this)

                            companion object {

                                /**
                                 * Returns a mutable builder for constructing an instance of
                                 * [ProviderSpecificFields].
                                 */
                                fun builder() = Builder()
                            }

                            /** A builder for [ProviderSpecificFields]. */
                            class Builder internal constructor() {

                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(providerSpecificFields: ProviderSpecificFields) =
                                    apply {
                                        additionalProperties =
                                            providerSpecificFields.additionalProperties
                                                .toMutableMap()
                                    }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [ProviderSpecificFields].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 */
                                fun build(): ProviderSpecificFields =
                                    ProviderSpecificFields(additionalProperties.toImmutable())
                            }

                            private var validated: Boolean = false

                            fun validate(): ProviderSpecificFields = apply {
                                if (validated) {
                                    return@apply
                                }

                                validated = true
                            }

                            fun isValid(): Boolean =
                                try {
                                    validate()
                                    true
                                } catch (e: HanzoInvalidDataException) {
                                    false
                                }

                            /**
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                additionalProperties.count { (_, value) ->
                                    !value.isNull() && !value.isMissing()
                                }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is ProviderSpecificFields &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "ProviderSpecificFields{additionalProperties=$additionalProperties}"
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Choices &&
                                finishReason == other.finishReason &&
                                index == other.index &&
                                message == other.message &&
                                logprobs == other.logprobs &&
                                providerSpecificFields == other.providerSpecificFields &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(
                                finishReason,
                                index,
                                message,
                                logprobs,
                                providerSpecificFields,
                                additionalProperties,
                            )
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Choices{finishReason=$finishReason, index=$index, message=$message, logprobs=$logprobs, providerSpecificFields=$providerSpecificFields, additionalProperties=$additionalProperties}"
                    }

                    class StreamingChoices
                    @JsonCreator
                    private constructor(
                        @com.fasterxml.jackson.annotation.JsonValue
                        private val additionalProperties: Map<String, JsonValue>
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            /**
                             * Returns a mutable builder for constructing an instance of
                             * [StreamingChoices].
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [StreamingChoices]. */
                        class Builder internal constructor() {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(streamingChoices: StreamingChoices) = apply {
                                additionalProperties =
                                    streamingChoices.additionalProperties.toMutableMap()
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [StreamingChoices].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): StreamingChoices =
                                StreamingChoices(additionalProperties.toImmutable())
                        }

                        private var validated: Boolean = false

                        fun validate(): StreamingChoices = apply {
                            if (validated) {
                                return@apply
                            }

                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: HanzoInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            additionalProperties.count { (_, value) ->
                                !value.isNull() && !value.isMissing()
                            }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is StreamingChoices &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "StreamingChoices{additionalProperties=$additionalProperties}"
                    }
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ModelResponse &&
                        id == other.id &&
                        choices == other.choices &&
                        created == other.created &&
                        object_ == other.object_ &&
                        model == other.model &&
                        systemFingerprint == other.systemFingerprint &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        id,
                        choices,
                        created,
                        object_,
                        model,
                        systemFingerprint,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ModelResponse{id=$id, choices=$choices, created=$created, object_=$object_, model=$model, systemFingerprint=$systemFingerprint, additionalProperties=$additionalProperties}"
            }
        }

        class ModelInfo
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [ModelInfo]. */
                fun builder() = Builder()
            }

            /** A builder for [ModelInfo]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(modelInfo: ModelInfo) = apply {
                    additionalProperties = modelInfo.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [ModelInfo].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ModelInfo = ModelInfo(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): ModelInfo = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: HanzoInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ModelInfo && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "ModelInfo{additionalProperties=$additionalProperties}"
        }

        class SearchContextCostPerQuery
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [SearchContextCostPerQuery].
                 */
                fun builder() = Builder()
            }

            /** A builder for [SearchContextCostPerQuery]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(searchContextCostPerQuery: SearchContextCostPerQuery) = apply {
                    additionalProperties =
                        searchContextCostPerQuery.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [SearchContextCostPerQuery].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): SearchContextCostPerQuery =
                    SearchContextCostPerQuery(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): SearchContextCostPerQuery = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: HanzoInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SearchContextCostPerQuery &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SearchContextCostPerQuery{additionalProperties=$additionalProperties}"
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

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    double != null -> visitor.visitDouble(double)
                    string != null -> visitor.visitString(string)
                    else -> visitor.unknown(_json)
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

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: HanzoInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitDouble(double: Double) = 1

                        override fun visitString(string: String) = 1

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is StreamTimeout && double == other.double && string == other.string
            }

            override fun hashCode(): Int = Objects.hash(double, string)

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

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    StreamTimeout(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                    StreamTimeout(double = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> StreamTimeout(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
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

        class TieredPricing
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [TieredPricing]. */
                fun builder() = Builder()
            }

            /** A builder for [TieredPricing]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tieredPricing: TieredPricing) = apply {
                    additionalProperties = tieredPricing.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [TieredPricing].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): TieredPricing = TieredPricing(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): TieredPricing = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: HanzoInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TieredPricing && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "TieredPricing{additionalProperties=$additionalProperties}"
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

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    double != null -> visitor.visitDouble(double)
                    string != null -> visitor.visitString(string)
                    else -> visitor.unknown(_json)
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

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: HanzoInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitDouble(double: Double) = 1

                        override fun visitString(string: String) = 1

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Timeout && double == other.double && string == other.string
            }

            override fun hashCode(): Int = Objects.hash(double, string)

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

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    Timeout(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                    Timeout(double = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> Timeout(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
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
            private val string: String? = null,
            private val unionMember1: UnionMember1? = null,
            private val _json: JsonValue? = null,
        ) {

            fun string(): String? = string

            fun unionMember1(): UnionMember1? = unionMember1

            fun isString(): Boolean = string != null

            fun isUnionMember1(): Boolean = unionMember1 != null

            fun asString(): String = string.getOrThrow("string")

            fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): VertexCredentials = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitString(string: String) {}

                        override fun visitUnionMember1(unionMember1: UnionMember1) {
                            unionMember1.validate()
                        }
                    }
                )
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: HanzoInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitString(string: String) = 1

                        override fun visitUnionMember1(unionMember1: UnionMember1) =
                            unionMember1.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is VertexCredentials &&
                    string == other.string &&
                    unionMember1 == other.unionMember1
            }

            override fun hashCode(): Int = Objects.hash(string, unionMember1)

            override fun toString(): String =
                when {
                    string != null -> "VertexCredentials{string=$string}"
                    unionMember1 != null -> "VertexCredentials{unionMember1=$unionMember1}"
                    _json != null -> "VertexCredentials{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid VertexCredentials")
                }

            companion object {

                fun ofString(string: String) = VertexCredentials(string = string)

                fun ofUnionMember1(unionMember1: UnionMember1) =
                    VertexCredentials(unionMember1 = unionMember1)
            }

            /**
             * An interface that defines how to map each variant of [VertexCredentials] to a value
             * of type [T].
             */
            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitUnionMember1(unionMember1: UnionMember1): T

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

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                                    VertexCredentials(unionMember1 = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    VertexCredentials(string = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> VertexCredentials(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
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
                        value.string != null -> generator.writeObject(value.string)
                        value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid VertexCredentials")
                    }
                }
            }

            class UnionMember1
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [UnionMember1]. */
                    fun builder() = Builder()
                }

                /** A builder for [UnionMember1]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(unionMember1: UnionMember1) = apply {
                        additionalProperties = unionMember1.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [UnionMember1].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): UnionMember1 = UnionMember1(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): UnionMember1 = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: HanzoInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is UnionMember1 &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "UnionMember1{additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LitellmParams &&
                apiBase == other.apiBase &&
                apiKey == other.apiKey &&
                apiVersion == other.apiVersion &&
                autoRouterConfig == other.autoRouterConfig &&
                autoRouterConfigPath == other.autoRouterConfigPath &&
                autoRouterDefaultModel == other.autoRouterDefaultModel &&
                autoRouterEmbeddingModel == other.autoRouterEmbeddingModel &&
                awsAccessKeyId == other.awsAccessKeyId &&
                awsBedrockRuntimeEndpoint == other.awsBedrockRuntimeEndpoint &&
                awsRegionName == other.awsRegionName &&
                awsSecretAccessKey == other.awsSecretAccessKey &&
                budgetDuration == other.budgetDuration &&
                cacheCreationInputAudioTokenCost == other.cacheCreationInputAudioTokenCost &&
                cacheCreationInputTokenCost == other.cacheCreationInputTokenCost &&
                cacheCreationInputTokenCostAbove1hr == other.cacheCreationInputTokenCostAbove1hr &&
                cacheCreationInputTokenCostAbove200kTokens ==
                    other.cacheCreationInputTokenCostAbove200kTokens &&
                cacheReadInputAudioTokenCost == other.cacheReadInputAudioTokenCost &&
                cacheReadInputTokenCost == other.cacheReadInputTokenCost &&
                cacheReadInputTokenCostAbove200kTokens ==
                    other.cacheReadInputTokenCostAbove200kTokens &&
                cacheReadInputTokenCostFlex == other.cacheReadInputTokenCostFlex &&
                cacheReadInputTokenCostPriority == other.cacheReadInputTokenCostPriority &&
                citationCostPerToken == other.citationCostPerToken &&
                configurableClientsideAuthParams == other.configurableClientsideAuthParams &&
                customLlmProvider == other.customLlmProvider &&
                gcsBucketName == other.gcsBucketName &&
                inputCostPerAudioPerSecond == other.inputCostPerAudioPerSecond &&
                inputCostPerAudioPerSecondAbove128kTokens ==
                    other.inputCostPerAudioPerSecondAbove128kTokens &&
                inputCostPerAudioToken == other.inputCostPerAudioToken &&
                inputCostPerCharacter == other.inputCostPerCharacter &&
                inputCostPerCharacterAbove128kTokens ==
                    other.inputCostPerCharacterAbove128kTokens &&
                inputCostPerImage == other.inputCostPerImage &&
                inputCostPerImageAbove128kTokens == other.inputCostPerImageAbove128kTokens &&
                inputCostPerPixel == other.inputCostPerPixel &&
                inputCostPerQuery == other.inputCostPerQuery &&
                inputCostPerSecond == other.inputCostPerSecond &&
                inputCostPerToken == other.inputCostPerToken &&
                inputCostPerTokenAbove128kTokens == other.inputCostPerTokenAbove128kTokens &&
                inputCostPerTokenAbove200kTokens == other.inputCostPerTokenAbove200kTokens &&
                inputCostPerTokenBatches == other.inputCostPerTokenBatches &&
                inputCostPerTokenCacheHit == other.inputCostPerTokenCacheHit &&
                inputCostPerTokenFlex == other.inputCostPerTokenFlex &&
                inputCostPerTokenPriority == other.inputCostPerTokenPriority &&
                inputCostPerVideoPerSecond == other.inputCostPerVideoPerSecond &&
                inputCostPerVideoPerSecondAbove128kTokens ==
                    other.inputCostPerVideoPerSecondAbove128kTokens &&
                inputCostPerVideoPerSecondAbove15sInterval ==
                    other.inputCostPerVideoPerSecondAbove15sInterval &&
                inputCostPerVideoPerSecondAbove8sInterval ==
                    other.inputCostPerVideoPerSecondAbove8sInterval &&
                litellmCredentialName == other.litellmCredentialName &&
                litellmTraceId == other.litellmTraceId &&
                maxBudget == other.maxBudget &&
                maxFileSizeMb == other.maxFileSizeMb &&
                maxRetries == other.maxRetries &&
                mergeReasoningContentInChoices == other.mergeReasoningContentInChoices &&
                milvusTextField == other.milvusTextField &&
                mockResponse == other.mockResponse &&
                model == other.model &&
                modelInfo == other.modelInfo &&
                organization == other.organization &&
                outputCostPerAudioPerSecond == other.outputCostPerAudioPerSecond &&
                outputCostPerAudioToken == other.outputCostPerAudioToken &&
                outputCostPerCharacter == other.outputCostPerCharacter &&
                outputCostPerCharacterAbove128kTokens ==
                    other.outputCostPerCharacterAbove128kTokens &&
                outputCostPerImage == other.outputCostPerImage &&
                outputCostPerImageToken == other.outputCostPerImageToken &&
                outputCostPerPixel == other.outputCostPerPixel &&
                outputCostPerReasoningToken == other.outputCostPerReasoningToken &&
                outputCostPerSecond == other.outputCostPerSecond &&
                outputCostPerToken == other.outputCostPerToken &&
                outputCostPerTokenAbove128kTokens == other.outputCostPerTokenAbove128kTokens &&
                outputCostPerTokenAbove200kTokens == other.outputCostPerTokenAbove200kTokens &&
                outputCostPerTokenBatches == other.outputCostPerTokenBatches &&
                outputCostPerTokenFlex == other.outputCostPerTokenFlex &&
                outputCostPerTokenPriority == other.outputCostPerTokenPriority &&
                outputCostPerVideoPerSecond == other.outputCostPerVideoPerSecond &&
                regionName == other.regionName &&
                rpm == other.rpm &&
                s3BucketName == other.s3BucketName &&
                s3EncryptionKeyId == other.s3EncryptionKeyId &&
                searchContextCostPerQuery == other.searchContextCostPerQuery &&
                streamTimeout == other.streamTimeout &&
                tieredPricing == other.tieredPricing &&
                timeout == other.timeout &&
                tpm == other.tpm &&
                useInPassThrough == other.useInPassThrough &&
                useLitellmProxy == other.useLitellmProxy &&
                vectorStoreId == other.vectorStoreId &&
                vertexCredentials == other.vertexCredentials &&
                vertexLocation == other.vertexLocation &&
                vertexProject == other.vertexProject &&
                watsonxRegionName == other.watsonxRegionName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                apiBase,
                apiKey,
                apiVersion,
                autoRouterConfig,
                autoRouterConfigPath,
                autoRouterDefaultModel,
                autoRouterEmbeddingModel,
                awsAccessKeyId,
                awsBedrockRuntimeEndpoint,
                awsRegionName,
                awsSecretAccessKey,
                budgetDuration,
                cacheCreationInputAudioTokenCost,
                cacheCreationInputTokenCost,
                cacheCreationInputTokenCostAbove1hr,
                cacheCreationInputTokenCostAbove200kTokens,
                cacheReadInputAudioTokenCost,
                cacheReadInputTokenCost,
                cacheReadInputTokenCostAbove200kTokens,
                cacheReadInputTokenCostFlex,
                cacheReadInputTokenCostPriority,
                citationCostPerToken,
                configurableClientsideAuthParams,
                customLlmProvider,
                gcsBucketName,
                inputCostPerAudioPerSecond,
                inputCostPerAudioPerSecondAbove128kTokens,
                inputCostPerAudioToken,
                inputCostPerCharacter,
                inputCostPerCharacterAbove128kTokens,
                inputCostPerImage,
                inputCostPerImageAbove128kTokens,
                inputCostPerPixel,
                inputCostPerQuery,
                inputCostPerSecond,
                inputCostPerToken,
                inputCostPerTokenAbove128kTokens,
                inputCostPerTokenAbove200kTokens,
                inputCostPerTokenBatches,
                inputCostPerTokenCacheHit,
                inputCostPerTokenFlex,
                inputCostPerTokenPriority,
                inputCostPerVideoPerSecond,
                inputCostPerVideoPerSecondAbove128kTokens,
                inputCostPerVideoPerSecondAbove15sInterval,
                inputCostPerVideoPerSecondAbove8sInterval,
                litellmCredentialName,
                litellmTraceId,
                maxBudget,
                maxFileSizeMb,
                maxRetries,
                mergeReasoningContentInChoices,
                milvusTextField,
                mockResponse,
                model,
                modelInfo,
                organization,
                outputCostPerAudioPerSecond,
                outputCostPerAudioToken,
                outputCostPerCharacter,
                outputCostPerCharacterAbove128kTokens,
                outputCostPerImage,
                outputCostPerImageToken,
                outputCostPerPixel,
                outputCostPerReasoningToken,
                outputCostPerSecond,
                outputCostPerToken,
                outputCostPerTokenAbove128kTokens,
                outputCostPerTokenAbove200kTokens,
                outputCostPerTokenBatches,
                outputCostPerTokenFlex,
                outputCostPerTokenPriority,
                outputCostPerVideoPerSecond,
                regionName,
                rpm,
                s3BucketName,
                s3EncryptionKeyId,
                searchContextCostPerQuery,
                streamTimeout,
                tieredPricing,
                timeout,
                tpm,
                useInPassThrough,
                useLitellmProxy,
                vectorStoreId,
                vertexCredentials,
                vertexLocation,
                vertexProject,
                watsonxRegionName,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LitellmParams{apiBase=$apiBase, apiKey=$apiKey, apiVersion=$apiVersion, autoRouterConfig=$autoRouterConfig, autoRouterConfigPath=$autoRouterConfigPath, autoRouterDefaultModel=$autoRouterDefaultModel, autoRouterEmbeddingModel=$autoRouterEmbeddingModel, awsAccessKeyId=$awsAccessKeyId, awsBedrockRuntimeEndpoint=$awsBedrockRuntimeEndpoint, awsRegionName=$awsRegionName, awsSecretAccessKey=$awsSecretAccessKey, budgetDuration=$budgetDuration, cacheCreationInputAudioTokenCost=$cacheCreationInputAudioTokenCost, cacheCreationInputTokenCost=$cacheCreationInputTokenCost, cacheCreationInputTokenCostAbove1hr=$cacheCreationInputTokenCostAbove1hr, cacheCreationInputTokenCostAbove200kTokens=$cacheCreationInputTokenCostAbove200kTokens, cacheReadInputAudioTokenCost=$cacheReadInputAudioTokenCost, cacheReadInputTokenCost=$cacheReadInputTokenCost, cacheReadInputTokenCostAbove200kTokens=$cacheReadInputTokenCostAbove200kTokens, cacheReadInputTokenCostFlex=$cacheReadInputTokenCostFlex, cacheReadInputTokenCostPriority=$cacheReadInputTokenCostPriority, citationCostPerToken=$citationCostPerToken, configurableClientsideAuthParams=$configurableClientsideAuthParams, customLlmProvider=$customLlmProvider, gcsBucketName=$gcsBucketName, inputCostPerAudioPerSecond=$inputCostPerAudioPerSecond, inputCostPerAudioPerSecondAbove128kTokens=$inputCostPerAudioPerSecondAbove128kTokens, inputCostPerAudioToken=$inputCostPerAudioToken, inputCostPerCharacter=$inputCostPerCharacter, inputCostPerCharacterAbove128kTokens=$inputCostPerCharacterAbove128kTokens, inputCostPerImage=$inputCostPerImage, inputCostPerImageAbove128kTokens=$inputCostPerImageAbove128kTokens, inputCostPerPixel=$inputCostPerPixel, inputCostPerQuery=$inputCostPerQuery, inputCostPerSecond=$inputCostPerSecond, inputCostPerToken=$inputCostPerToken, inputCostPerTokenAbove128kTokens=$inputCostPerTokenAbove128kTokens, inputCostPerTokenAbove200kTokens=$inputCostPerTokenAbove200kTokens, inputCostPerTokenBatches=$inputCostPerTokenBatches, inputCostPerTokenCacheHit=$inputCostPerTokenCacheHit, inputCostPerTokenFlex=$inputCostPerTokenFlex, inputCostPerTokenPriority=$inputCostPerTokenPriority, inputCostPerVideoPerSecond=$inputCostPerVideoPerSecond, inputCostPerVideoPerSecondAbove128kTokens=$inputCostPerVideoPerSecondAbove128kTokens, inputCostPerVideoPerSecondAbove15sInterval=$inputCostPerVideoPerSecondAbove15sInterval, inputCostPerVideoPerSecondAbove8sInterval=$inputCostPerVideoPerSecondAbove8sInterval, litellmCredentialName=$litellmCredentialName, litellmTraceId=$litellmTraceId, maxBudget=$maxBudget, maxFileSizeMb=$maxFileSizeMb, maxRetries=$maxRetries, mergeReasoningContentInChoices=$mergeReasoningContentInChoices, milvusTextField=$milvusTextField, mockResponse=$mockResponse, model=$model, modelInfo=$modelInfo, organization=$organization, outputCostPerAudioPerSecond=$outputCostPerAudioPerSecond, outputCostPerAudioToken=$outputCostPerAudioToken, outputCostPerCharacter=$outputCostPerCharacter, outputCostPerCharacterAbove128kTokens=$outputCostPerCharacterAbove128kTokens, outputCostPerImage=$outputCostPerImage, outputCostPerImageToken=$outputCostPerImageToken, outputCostPerPixel=$outputCostPerPixel, outputCostPerReasoningToken=$outputCostPerReasoningToken, outputCostPerSecond=$outputCostPerSecond, outputCostPerToken=$outputCostPerToken, outputCostPerTokenAbove128kTokens=$outputCostPerTokenAbove128kTokens, outputCostPerTokenAbove200kTokens=$outputCostPerTokenAbove200kTokens, outputCostPerTokenBatches=$outputCostPerTokenBatches, outputCostPerTokenFlex=$outputCostPerTokenFlex, outputCostPerTokenPriority=$outputCostPerTokenPriority, outputCostPerVideoPerSecond=$outputCostPerVideoPerSecond, regionName=$regionName, rpm=$rpm, s3BucketName=$s3BucketName, s3EncryptionKeyId=$s3EncryptionKeyId, searchContextCostPerQuery=$searchContextCostPerQuery, streamTimeout=$streamTimeout, tieredPricing=$tieredPricing, timeout=$timeout, tpm=$tpm, useInPassThrough=$useInPassThrough, useLitellmProxy=$useLitellmProxy, vectorStoreId=$vectorStoreId, vertexCredentials=$vertexCredentials, vertexLocation=$vertexLocation, vertexProject=$vertexProject, watsonxRegionName=$watsonxRegionName, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UpdateDeployment &&
            litellmParams == other.litellmParams &&
            modelInfo == other.modelInfo &&
            modelName == other.modelName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(litellmParams, modelInfo, modelName, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UpdateDeployment{litellmParams=$litellmParams, modelInfo=$modelInfo, modelName=$modelName, additionalProperties=$additionalProperties}"
}
