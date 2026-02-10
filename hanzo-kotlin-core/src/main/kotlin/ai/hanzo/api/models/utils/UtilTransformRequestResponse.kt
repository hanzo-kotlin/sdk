// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.utils

import ai.hanzo.api.core.ExcludeMissing
import ai.hanzo.api.core.JsonField
import ai.hanzo.api.core.JsonMissing
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.errors.HanzoInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class UtilTransformRequestResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val error: JsonField<String>,
    private val rawRequestApiBase: JsonField<String>,
    private val rawRequestBody: JsonValue,
    private val rawRequestHeaders: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
        @JsonProperty("raw_request_api_base")
        @ExcludeMissing
        rawRequestApiBase: JsonField<String> = JsonMissing.of(),
        @JsonProperty("raw_request_body")
        @ExcludeMissing
        rawRequestBody: JsonValue = JsonMissing.of(),
        @JsonProperty("raw_request_headers")
        @ExcludeMissing
        rawRequestHeaders: JsonValue = JsonMissing.of(),
    ) : this(error, rawRequestApiBase, rawRequestBody, rawRequestHeaders, mutableMapOf())

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): String? = error.getNullable("error")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rawRequestApiBase(): String? = rawRequestApiBase.getNullable("raw_request_api_base")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = utilTransformRequestResponse.rawRequestBody().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("raw_request_body")
    @ExcludeMissing
    fun _rawRequestBody(): JsonValue = rawRequestBody

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = utilTransformRequestResponse.rawRequestHeaders().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("raw_request_headers")
    @ExcludeMissing
    fun _rawRequestHeaders(): JsonValue = rawRequestHeaders

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

    /**
     * Returns the raw JSON value of [rawRequestApiBase].
     *
     * Unlike [rawRequestApiBase], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("raw_request_api_base")
    @ExcludeMissing
    fun _rawRequestApiBase(): JsonField<String> = rawRequestApiBase

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
         * Returns a mutable builder for constructing an instance of [UtilTransformRequestResponse].
         */
        fun builder() = Builder()
    }

    /** A builder for [UtilTransformRequestResponse]. */
    class Builder internal constructor() {

        private var error: JsonField<String> = JsonMissing.of()
        private var rawRequestApiBase: JsonField<String> = JsonMissing.of()
        private var rawRequestBody: JsonValue = JsonMissing.of()
        private var rawRequestHeaders: JsonValue = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(utilTransformRequestResponse: UtilTransformRequestResponse) = apply {
            error = utilTransformRequestResponse.error
            rawRequestApiBase = utilTransformRequestResponse.rawRequestApiBase
            rawRequestBody = utilTransformRequestResponse.rawRequestBody
            rawRequestHeaders = utilTransformRequestResponse.rawRequestHeaders
            additionalProperties = utilTransformRequestResponse.additionalProperties.toMutableMap()
        }

        fun error(error: String?) = error(JsonField.ofNullable(error))

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<String>) = apply { this.error = error }

        fun rawRequestApiBase(rawRequestApiBase: String?) =
            rawRequestApiBase(JsonField.ofNullable(rawRequestApiBase))

        /**
         * Sets [Builder.rawRequestApiBase] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rawRequestApiBase] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rawRequestApiBase(rawRequestApiBase: JsonField<String>) = apply {
            this.rawRequestApiBase = rawRequestApiBase
        }

        fun rawRequestBody(rawRequestBody: JsonValue) = apply {
            this.rawRequestBody = rawRequestBody
        }

        fun rawRequestHeaders(rawRequestHeaders: JsonValue) = apply {
            this.rawRequestHeaders = rawRequestHeaders
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
         * Returns an immutable instance of [UtilTransformRequestResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UtilTransformRequestResponse =
            UtilTransformRequestResponse(
                error,
                rawRequestApiBase,
                rawRequestBody,
                rawRequestHeaders,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UtilTransformRequestResponse = apply {
        if (validated) {
            return@apply
        }

        error()
        rawRequestApiBase()
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
        (if (error.asKnown() == null) 0 else 1) +
            (if (rawRequestApiBase.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UtilTransformRequestResponse &&
            error == other.error &&
            rawRequestApiBase == other.rawRequestApiBase &&
            rawRequestBody == other.rawRequestBody &&
            rawRequestHeaders == other.rawRequestHeaders &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            error,
            rawRequestApiBase,
            rawRequestBody,
            rawRequestHeaders,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UtilTransformRequestResponse{error=$error, rawRequestApiBase=$rawRequestApiBase, rawRequestBody=$rawRequestBody, rawRequestHeaders=$rawRequestHeaders, additionalProperties=$additionalProperties}"
}
