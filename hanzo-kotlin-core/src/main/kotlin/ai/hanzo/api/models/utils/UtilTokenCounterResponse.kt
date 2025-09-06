// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.utils

import ai.hanzo.api.core.ExcludeMissing
import ai.hanzo.api.core.JsonField
import ai.hanzo.api.core.JsonMissing
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.checkRequired
import ai.hanzo.api.errors.HanzoInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class UtilTokenCounterResponse
private constructor(
    private val modelUsed: JsonField<String>,
    private val requestModel: JsonField<String>,
    private val tokenizerType: JsonField<String>,
    private val totalTokens: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("model_used") @ExcludeMissing modelUsed: JsonField<String> = JsonMissing.of(),
        @JsonProperty("request_model")
        @ExcludeMissing
        requestModel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tokenizer_type")
        @ExcludeMissing
        tokenizerType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_tokens")
        @ExcludeMissing
        totalTokens: JsonField<Long> = JsonMissing.of(),
    ) : this(modelUsed, requestModel, tokenizerType, totalTokens, mutableMapOf())

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun modelUsed(): String = modelUsed.getRequired("model_used")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requestModel(): String = requestModel.getRequired("request_model")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tokenizerType(): String = tokenizerType.getRequired("tokenizer_type")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalTokens(): Long = totalTokens.getRequired("total_tokens")

    /**
     * Returns the raw JSON value of [modelUsed].
     *
     * Unlike [modelUsed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model_used") @ExcludeMissing fun _modelUsed(): JsonField<String> = modelUsed

    /**
     * Returns the raw JSON value of [requestModel].
     *
     * Unlike [requestModel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("request_model")
    @ExcludeMissing
    fun _requestModel(): JsonField<String> = requestModel

    /**
     * Returns the raw JSON value of [tokenizerType].
     *
     * Unlike [tokenizerType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tokenizer_type")
    @ExcludeMissing
    fun _tokenizerType(): JsonField<String> = tokenizerType

    /**
     * Returns the raw JSON value of [totalTokens].
     *
     * Unlike [totalTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_tokens") @ExcludeMissing fun _totalTokens(): JsonField<Long> = totalTokens

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
         * Returns a mutable builder for constructing an instance of [UtilTokenCounterResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .modelUsed()
         * .requestModel()
         * .tokenizerType()
         * .totalTokens()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [UtilTokenCounterResponse]. */
    class Builder internal constructor() {

        private var modelUsed: JsonField<String>? = null
        private var requestModel: JsonField<String>? = null
        private var tokenizerType: JsonField<String>? = null
        private var totalTokens: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(utilTokenCounterResponse: UtilTokenCounterResponse) = apply {
            modelUsed = utilTokenCounterResponse.modelUsed
            requestModel = utilTokenCounterResponse.requestModel
            tokenizerType = utilTokenCounterResponse.tokenizerType
            totalTokens = utilTokenCounterResponse.totalTokens
            additionalProperties = utilTokenCounterResponse.additionalProperties.toMutableMap()
        }

        fun modelUsed(modelUsed: String) = modelUsed(JsonField.of(modelUsed))

        /**
         * Sets [Builder.modelUsed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelUsed] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun modelUsed(modelUsed: JsonField<String>) = apply { this.modelUsed = modelUsed }

        fun requestModel(requestModel: String) = requestModel(JsonField.of(requestModel))

        /**
         * Sets [Builder.requestModel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestModel] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun requestModel(requestModel: JsonField<String>) = apply {
            this.requestModel = requestModel
        }

        fun tokenizerType(tokenizerType: String) = tokenizerType(JsonField.of(tokenizerType))

        /**
         * Sets [Builder.tokenizerType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenizerType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tokenizerType(tokenizerType: JsonField<String>) = apply {
            this.tokenizerType = tokenizerType
        }

        fun totalTokens(totalTokens: Long) = totalTokens(JsonField.of(totalTokens))

        /**
         * Sets [Builder.totalTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalTokens(totalTokens: JsonField<Long>) = apply { this.totalTokens = totalTokens }

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
         * Returns an immutable instance of [UtilTokenCounterResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .modelUsed()
         * .requestModel()
         * .tokenizerType()
         * .totalTokens()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UtilTokenCounterResponse =
            UtilTokenCounterResponse(
                checkRequired("modelUsed", modelUsed),
                checkRequired("requestModel", requestModel),
                checkRequired("tokenizerType", tokenizerType),
                checkRequired("totalTokens", totalTokens),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UtilTokenCounterResponse = apply {
        if (validated) {
            return@apply
        }

        modelUsed()
        requestModel()
        tokenizerType()
        totalTokens()
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
        (if (modelUsed.asKnown() == null) 0 else 1) +
            (if (requestModel.asKnown() == null) 0 else 1) +
            (if (tokenizerType.asKnown() == null) 0 else 1) +
            (if (totalTokens.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UtilTokenCounterResponse &&
            modelUsed == other.modelUsed &&
            requestModel == other.requestModel &&
            tokenizerType == other.tokenizerType &&
            totalTokens == other.totalTokens &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(modelUsed, requestModel, tokenizerType, totalTokens, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UtilTokenCounterResponse{modelUsed=$modelUsed, requestModel=$requestModel, tokenizerType=$tokenizerType, totalTokens=$totalTokens, additionalProperties=$additionalProperties}"
}
