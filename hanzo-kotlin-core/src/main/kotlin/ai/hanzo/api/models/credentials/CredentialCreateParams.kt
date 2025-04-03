// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.credentials

import ai.hanzo.api.core.ExcludeMissing
import ai.hanzo.api.core.JsonField
import ai.hanzo.api.core.JsonMissing
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.Params
import ai.hanzo.api.core.checkRequired
import ai.hanzo.api.core.http.Headers
import ai.hanzo.api.core.http.QueryParams
import ai.hanzo.api.errors.HanzoInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/**
 * [BETA] endpoint. This might change unexpectedly. Stores credential in DB. Reloads credentials in
 * memory.
 */
class CredentialCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun _credentialInfo(): JsonValue = body._credentialInfo()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun credentialName(): String = body.credentialName()

    fun _credentialValues(): JsonValue = body._credentialValues()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modelId(): String? = body.modelId()

    /**
     * Returns the raw JSON value of [credentialName].
     *
     * Unlike [credentialName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _credentialName(): JsonField<String> = body._credentialName()

    /**
     * Returns the raw JSON value of [modelId].
     *
     * Unlike [modelId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _modelId(): JsonField<String> = body._modelId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CredentialCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .credentialInfo()
         * .credentialName()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CredentialCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(credentialCreateParams: CredentialCreateParams) = apply {
            body = credentialCreateParams.body.toBuilder()
            additionalHeaders = credentialCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = credentialCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [credentialInfo]
         * - [credentialName]
         * - [credentialValues]
         * - [modelId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun credentialInfo(credentialInfo: JsonValue) = apply {
            body.credentialInfo(credentialInfo)
        }

        fun credentialName(credentialName: String) = apply { body.credentialName(credentialName) }

        /**
         * Sets [Builder.credentialName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.credentialName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun credentialName(credentialName: JsonField<String>) = apply {
            body.credentialName(credentialName)
        }

        fun credentialValues(credentialValues: JsonValue) = apply {
            body.credentialValues(credentialValues)
        }

        fun modelId(modelId: String?) = apply { body.modelId(modelId) }

        /**
         * Sets [Builder.modelId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun modelId(modelId: JsonField<String>) = apply { body.modelId(modelId) }

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
         * Returns an immutable instance of [CredentialCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .credentialInfo()
         * .credentialName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CredentialCreateParams =
            CredentialCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val credentialInfo: JsonValue,
        private val credentialName: JsonField<String>,
        private val credentialValues: JsonValue,
        private val modelId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("credential_info")
            @ExcludeMissing
            credentialInfo: JsonValue = JsonMissing.of(),
            @JsonProperty("credential_name")
            @ExcludeMissing
            credentialName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("credential_values")
            @ExcludeMissing
            credentialValues: JsonValue = JsonMissing.of(),
            @JsonProperty("model_id") @ExcludeMissing modelId: JsonField<String> = JsonMissing.of(),
        ) : this(credentialInfo, credentialName, credentialValues, modelId, mutableMapOf())

        @JsonProperty("credential_info")
        @ExcludeMissing
        fun _credentialInfo(): JsonValue = credentialInfo

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun credentialName(): String = credentialName.getRequired("credential_name")

        @JsonProperty("credential_values")
        @ExcludeMissing
        fun _credentialValues(): JsonValue = credentialValues

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun modelId(): String? = modelId.getNullable("model_id")

        /**
         * Returns the raw JSON value of [credentialName].
         *
         * Unlike [credentialName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("credential_name")
        @ExcludeMissing
        fun _credentialName(): JsonField<String> = credentialName

        /**
         * Returns the raw JSON value of [modelId].
         *
         * Unlike [modelId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model_id") @ExcludeMissing fun _modelId(): JsonField<String> = modelId

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
             * .credentialInfo()
             * .credentialName()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var credentialInfo: JsonValue? = null
            private var credentialName: JsonField<String>? = null
            private var credentialValues: JsonValue = JsonMissing.of()
            private var modelId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                credentialInfo = body.credentialInfo
                credentialName = body.credentialName
                credentialValues = body.credentialValues
                modelId = body.modelId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun credentialInfo(credentialInfo: JsonValue) = apply {
                this.credentialInfo = credentialInfo
            }

            fun credentialName(credentialName: String) =
                credentialName(JsonField.of(credentialName))

            /**
             * Sets [Builder.credentialName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.credentialName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun credentialName(credentialName: JsonField<String>) = apply {
                this.credentialName = credentialName
            }

            fun credentialValues(credentialValues: JsonValue) = apply {
                this.credentialValues = credentialValues
            }

            fun modelId(modelId: String?) = modelId(JsonField.ofNullable(modelId))

            /**
             * Sets [Builder.modelId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelId(modelId: JsonField<String>) = apply { this.modelId = modelId }

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
             * .credentialInfo()
             * .credentialName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("credentialInfo", credentialInfo),
                    checkRequired("credentialName", credentialName),
                    credentialValues,
                    modelId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            credentialName()
            modelId()
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
            (if (credentialName.asKnown() == null) 0 else 1) +
                (if (modelId.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && credentialInfo == other.credentialInfo && credentialName == other.credentialName && credentialValues == other.credentialValues && modelId == other.modelId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(credentialInfo, credentialName, credentialValues, modelId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{credentialInfo=$credentialInfo, credentialName=$credentialName, credentialValues=$credentialValues, modelId=$modelId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CredentialCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CredentialCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
