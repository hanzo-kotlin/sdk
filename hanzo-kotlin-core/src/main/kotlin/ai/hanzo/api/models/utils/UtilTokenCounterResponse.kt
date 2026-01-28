// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.utils

import ai.hanzo.api.core.ExcludeMissing
import ai.hanzo.api.core.JsonField
import ai.hanzo.api.core.JsonMissing
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.checkRequired
import ai.hanzo.api.core.toImmutable
import ai.hanzo.api.errors.HanzoInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class UtilTokenCounterResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val modelUsed: JsonField<String>,
    private val requestModel: JsonField<String>,
    private val tokenizerType: JsonField<String>,
    private val totalTokens: JsonField<Long>,
    private val error: JsonField<Boolean>,
    private val errorMessage: JsonField<String>,
    private val originalResponse: JsonField<OriginalResponse>,
    private val statusCode: JsonField<Long>,
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
        @JsonProperty("error") @ExcludeMissing error: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("error_message")
        @ExcludeMissing
        errorMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("original_response")
        @ExcludeMissing
        originalResponse: JsonField<OriginalResponse> = JsonMissing.of(),
        @JsonProperty("status_code") @ExcludeMissing statusCode: JsonField<Long> = JsonMissing.of(),
    ) : this(
        modelUsed,
        requestModel,
        tokenizerType,
        totalTokens,
        error,
        errorMessage,
        originalResponse,
        statusCode,
        mutableMapOf(),
    )

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
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): Boolean? = error.getNullable("error")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorMessage(): String? = errorMessage.getNullable("error_message")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originalResponse(): OriginalResponse? = originalResponse.getNullable("original_response")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusCode(): Long? = statusCode.getNullable("status_code")

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

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<Boolean> = error

    /**
     * Returns the raw JSON value of [errorMessage].
     *
     * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error_message")
    @ExcludeMissing
    fun _errorMessage(): JsonField<String> = errorMessage

    /**
     * Returns the raw JSON value of [originalResponse].
     *
     * Unlike [originalResponse], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("original_response")
    @ExcludeMissing
    fun _originalResponse(): JsonField<OriginalResponse> = originalResponse

    /**
     * Returns the raw JSON value of [statusCode].
     *
     * Unlike [statusCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status_code") @ExcludeMissing fun _statusCode(): JsonField<Long> = statusCode

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
        private var error: JsonField<Boolean> = JsonMissing.of()
        private var errorMessage: JsonField<String> = JsonMissing.of()
        private var originalResponse: JsonField<OriginalResponse> = JsonMissing.of()
        private var statusCode: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(utilTokenCounterResponse: UtilTokenCounterResponse) = apply {
            modelUsed = utilTokenCounterResponse.modelUsed
            requestModel = utilTokenCounterResponse.requestModel
            tokenizerType = utilTokenCounterResponse.tokenizerType
            totalTokens = utilTokenCounterResponse.totalTokens
            error = utilTokenCounterResponse.error
            errorMessage = utilTokenCounterResponse.errorMessage
            originalResponse = utilTokenCounterResponse.originalResponse
            statusCode = utilTokenCounterResponse.statusCode
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

        fun error(error: Boolean) = error(JsonField.of(error))

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<Boolean>) = apply { this.error = error }

        fun errorMessage(errorMessage: String?) = errorMessage(JsonField.ofNullable(errorMessage))

        /**
         * Sets [Builder.errorMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorMessage(errorMessage: JsonField<String>) = apply {
            this.errorMessage = errorMessage
        }

        fun originalResponse(originalResponse: OriginalResponse?) =
            originalResponse(JsonField.ofNullable(originalResponse))

        /**
         * Sets [Builder.originalResponse] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originalResponse] with a well-typed [OriginalResponse]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun originalResponse(originalResponse: JsonField<OriginalResponse>) = apply {
            this.originalResponse = originalResponse
        }

        fun statusCode(statusCode: Long?) = statusCode(JsonField.ofNullable(statusCode))

        /**
         * Alias for [Builder.statusCode].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun statusCode(statusCode: Long) = statusCode(statusCode as Long?)

        /**
         * Sets [Builder.statusCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusCode] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun statusCode(statusCode: JsonField<Long>) = apply { this.statusCode = statusCode }

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
                error,
                errorMessage,
                originalResponse,
                statusCode,
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
        error()
        errorMessage()
        originalResponse()?.validate()
        statusCode()
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
            (if (totalTokens.asKnown() == null) 0 else 1) +
            (if (error.asKnown() == null) 0 else 1) +
            (if (errorMessage.asKnown() == null) 0 else 1) +
            (originalResponse.asKnown()?.validity() ?: 0) +
            (if (statusCode.asKnown() == null) 0 else 1)

    class OriginalResponse
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

            /** Returns a mutable builder for constructing an instance of [OriginalResponse]. */
            fun builder() = Builder()
        }

        /** A builder for [OriginalResponse]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(originalResponse: OriginalResponse) = apply {
                additionalProperties = originalResponse.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [OriginalResponse].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): OriginalResponse = OriginalResponse(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): OriginalResponse = apply {
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

            return other is OriginalResponse && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "OriginalResponse{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UtilTokenCounterResponse &&
            modelUsed == other.modelUsed &&
            requestModel == other.requestModel &&
            tokenizerType == other.tokenizerType &&
            totalTokens == other.totalTokens &&
            error == other.error &&
            errorMessage == other.errorMessage &&
            originalResponse == other.originalResponse &&
            statusCode == other.statusCode &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            modelUsed,
            requestModel,
            tokenizerType,
            totalTokens,
            error,
            errorMessage,
            originalResponse,
            statusCode,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UtilTokenCounterResponse{modelUsed=$modelUsed, requestModel=$requestModel, tokenizerType=$tokenizerType, totalTokens=$totalTokens, error=$error, errorMessage=$errorMessage, originalResponse=$originalResponse, statusCode=$statusCode, additionalProperties=$additionalProperties}"
}
