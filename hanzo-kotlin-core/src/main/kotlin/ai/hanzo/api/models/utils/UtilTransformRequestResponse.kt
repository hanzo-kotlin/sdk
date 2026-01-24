// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.utils

import ai.hanzo.api.core.ExcludeMissing
import ai.hanzo.api.core.JsonField
import ai.hanzo.api.core.JsonMissing
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.toImmutable
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
    private val rawRequestBody: JsonField<RawRequestBody>,
    private val rawRequestHeaders: JsonField<RawRequestHeaders>,
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
        rawRequestBody: JsonField<RawRequestBody> = JsonMissing.of(),
        @JsonProperty("raw_request_headers")
        @ExcludeMissing
        rawRequestHeaders: JsonField<RawRequestHeaders> = JsonMissing.of(),
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
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rawRequestBody(): RawRequestBody? = rawRequestBody.getNullable("raw_request_body")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rawRequestHeaders(): RawRequestHeaders? =
        rawRequestHeaders.getNullable("raw_request_headers")

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

    /**
     * Returns the raw JSON value of [rawRequestBody].
     *
     * Unlike [rawRequestBody], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("raw_request_body")
    @ExcludeMissing
    fun _rawRequestBody(): JsonField<RawRequestBody> = rawRequestBody

    /**
     * Returns the raw JSON value of [rawRequestHeaders].
     *
     * Unlike [rawRequestHeaders], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("raw_request_headers")
    @ExcludeMissing
    fun _rawRequestHeaders(): JsonField<RawRequestHeaders> = rawRequestHeaders

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
        private var rawRequestBody: JsonField<RawRequestBody> = JsonMissing.of()
        private var rawRequestHeaders: JsonField<RawRequestHeaders> = JsonMissing.of()
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

        fun rawRequestBody(rawRequestBody: RawRequestBody?) =
            rawRequestBody(JsonField.ofNullable(rawRequestBody))

        /**
         * Sets [Builder.rawRequestBody] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rawRequestBody] with a well-typed [RawRequestBody] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rawRequestBody(rawRequestBody: JsonField<RawRequestBody>) = apply {
            this.rawRequestBody = rawRequestBody
        }

        fun rawRequestHeaders(rawRequestHeaders: RawRequestHeaders?) =
            rawRequestHeaders(JsonField.ofNullable(rawRequestHeaders))

        /**
         * Sets [Builder.rawRequestHeaders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rawRequestHeaders] with a well-typed [RawRequestHeaders]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun rawRequestHeaders(rawRequestHeaders: JsonField<RawRequestHeaders>) = apply {
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
        rawRequestBody()?.validate()
        rawRequestHeaders()?.validate()
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
            (if (rawRequestApiBase.asKnown() == null) 0 else 1) +
            (rawRequestBody.asKnown()?.validity() ?: 0) +
            (rawRequestHeaders.asKnown()?.validity() ?: 0)

    class RawRequestBody
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

            /** Returns a mutable builder for constructing an instance of [RawRequestBody]. */
            fun builder() = Builder()
        }

        /** A builder for [RawRequestBody]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(rawRequestBody: RawRequestBody) = apply {
                additionalProperties = rawRequestBody.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [RawRequestBody].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): RawRequestBody = RawRequestBody(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): RawRequestBody = apply {
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

            return other is RawRequestBody && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "RawRequestBody{additionalProperties=$additionalProperties}"
    }

    class RawRequestHeaders
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

            /** Returns a mutable builder for constructing an instance of [RawRequestHeaders]. */
            fun builder() = Builder()
        }

        /** A builder for [RawRequestHeaders]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(rawRequestHeaders: RawRequestHeaders) = apply {
                additionalProperties = rawRequestHeaders.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [RawRequestHeaders].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): RawRequestHeaders = RawRequestHeaders(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): RawRequestHeaders = apply {
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

            return other is RawRequestHeaders && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "RawRequestHeaders{additionalProperties=$additionalProperties}"
    }

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
