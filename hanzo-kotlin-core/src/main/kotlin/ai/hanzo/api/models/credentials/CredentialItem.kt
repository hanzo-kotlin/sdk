// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.credentials

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

class CredentialItem
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val credentialInfo: JsonValue,
    private val credentialName: JsonField<String>,
    private val credentialValues: JsonValue,
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
    ) : this(credentialInfo, credentialName, credentialValues, mutableMapOf())

    @JsonProperty("credential_info")
    @ExcludeMissing
    fun _credentialInfo(): JsonValue = credentialInfo

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun credentialName(): String = credentialName.getRequired("credential_name")

    @JsonProperty("credential_values")
    @ExcludeMissing
    fun _credentialValues(): JsonValue = credentialValues

    /**
     * Returns the raw JSON value of [credentialName].
     *
     * Unlike [credentialName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credential_name")
    @ExcludeMissing
    fun _credentialName(): JsonField<String> = credentialName

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

        private var credentialInfo: JsonValue? = null
        private var credentialName: JsonField<String>? = null
        private var credentialValues: JsonValue? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(credentialItem: CredentialItem) = apply {
            credentialInfo = credentialItem.credentialInfo
            credentialName = credentialItem.credentialName
            credentialValues = credentialItem.credentialValues
            additionalProperties = credentialItem.additionalProperties.toMutableMap()
        }

        fun credentialInfo(credentialInfo: JsonValue) = apply {
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

        fun credentialValues(credentialValues: JsonValue) = apply {
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

        credentialName()
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
    internal fun validity(): Int = (if (credentialName.asKnown() == null) 0 else 1)

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
