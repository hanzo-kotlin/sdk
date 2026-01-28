// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.credentials

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

class CredentialItem
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val credentialInfo: JsonField<CredentialInfo>,
    private val credentialName: JsonField<String>,
    private val credentialValues: JsonField<CredentialValues>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("credential_info")
        @ExcludeMissing
        credentialInfo: JsonField<CredentialInfo> = JsonMissing.of(),
        @JsonProperty("credential_name")
        @ExcludeMissing
        credentialName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credential_values")
        @ExcludeMissing
        credentialValues: JsonField<CredentialValues> = JsonMissing.of(),
    ) : this(credentialInfo, credentialName, credentialValues, mutableMapOf())

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun credentialInfo(): CredentialInfo = credentialInfo.getRequired("credential_info")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun credentialName(): String = credentialName.getRequired("credential_name")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun credentialValues(): CredentialValues = credentialValues.getRequired("credential_values")

    /**
     * Returns the raw JSON value of [credentialInfo].
     *
     * Unlike [credentialInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credential_info")
    @ExcludeMissing
    fun _credentialInfo(): JsonField<CredentialInfo> = credentialInfo

    /**
     * Returns the raw JSON value of [credentialName].
     *
     * Unlike [credentialName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credential_name")
    @ExcludeMissing
    fun _credentialName(): JsonField<String> = credentialName

    /**
     * Returns the raw JSON value of [credentialValues].
     *
     * Unlike [credentialValues], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("credential_values")
    @ExcludeMissing
    fun _credentialValues(): JsonField<CredentialValues> = credentialValues

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
         * Returns a mutable builder for constructing an instance of [CredentialItem].
         *
         * The following fields are required:
         * ```kotlin
         * .credentialInfo()
         * .credentialName()
         * .credentialValues()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CredentialItem]. */
    class Builder internal constructor() {

        private var credentialInfo: JsonField<CredentialInfo>? = null
        private var credentialName: JsonField<String>? = null
        private var credentialValues: JsonField<CredentialValues>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(credentialItem: CredentialItem) = apply {
            credentialInfo = credentialItem.credentialInfo
            credentialName = credentialItem.credentialName
            credentialValues = credentialItem.credentialValues
            additionalProperties = credentialItem.additionalProperties.toMutableMap()
        }

        fun credentialInfo(credentialInfo: CredentialInfo) =
            credentialInfo(JsonField.of(credentialInfo))

        /**
         * Sets [Builder.credentialInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.credentialInfo] with a well-typed [CredentialInfo] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun credentialInfo(credentialInfo: JsonField<CredentialInfo>) = apply {
            this.credentialInfo = credentialInfo
        }

        fun credentialName(credentialName: String) = credentialName(JsonField.of(credentialName))

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

        fun credentialValues(credentialValues: CredentialValues) =
            credentialValues(JsonField.of(credentialValues))

        /**
         * Sets [Builder.credentialValues] to an arbitrary JSON value.
         *
         * You should usually call [Builder.credentialValues] with a well-typed [CredentialValues]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun credentialValues(credentialValues: JsonField<CredentialValues>) = apply {
            this.credentialValues = credentialValues
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
         * Returns an immutable instance of [CredentialItem].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .credentialInfo()
         * .credentialName()
         * .credentialValues()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CredentialItem =
            CredentialItem(
                checkRequired("credentialInfo", credentialInfo),
                checkRequired("credentialName", credentialName),
                checkRequired("credentialValues", credentialValues),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CredentialItem = apply {
        if (validated) {
            return@apply
        }

        credentialInfo().validate()
        credentialName()
        credentialValues().validate()
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
        (credentialInfo.asKnown()?.validity() ?: 0) +
            (if (credentialName.asKnown() == null) 0 else 1) +
            (credentialValues.asKnown()?.validity() ?: 0)

    class CredentialInfo
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

            /** Returns a mutable builder for constructing an instance of [CredentialInfo]. */
            fun builder() = Builder()
        }

        /** A builder for [CredentialInfo]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(credentialInfo: CredentialInfo) = apply {
                additionalProperties = credentialInfo.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [CredentialInfo].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CredentialInfo = CredentialInfo(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): CredentialInfo = apply {
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

            return other is CredentialInfo && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "CredentialInfo{additionalProperties=$additionalProperties}"
    }

    class CredentialValues
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

            /** Returns a mutable builder for constructing an instance of [CredentialValues]. */
            fun builder() = Builder()
        }

        /** A builder for [CredentialValues]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(credentialValues: CredentialValues) = apply {
                additionalProperties = credentialValues.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [CredentialValues].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CredentialValues = CredentialValues(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): CredentialValues = apply {
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

            return other is CredentialValues && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "CredentialValues{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CredentialItem &&
            credentialInfo == other.credentialInfo &&
            credentialName == other.credentialName &&
            credentialValues == other.credentialValues &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(credentialInfo, credentialName, credentialValues, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CredentialItem{credentialInfo=$credentialInfo, credentialName=$credentialName, credentialValues=$credentialValues, additionalProperties=$additionalProperties}"
}
