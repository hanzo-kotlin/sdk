// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.model

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

class ConfigurableClientsideParamsCustomAuth
private constructor(
    private val apiBase: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("api_base") @ExcludeMissing apiBase: JsonField<String> = JsonMissing.of()
    ) : this(apiBase, mutableMapOf())

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun apiBase(): String = apiBase.getRequired("api_base")

    /**
     * Returns the raw JSON value of [apiBase].
     *
     * Unlike [apiBase], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("api_base") @ExcludeMissing fun _apiBase(): JsonField<String> = apiBase

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
         * [ConfigurableClientsideParamsCustomAuth].
         *
         * The following fields are required:
         * ```kotlin
         * .apiBase()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ConfigurableClientsideParamsCustomAuth]. */
    class Builder internal constructor() {

        private var apiBase: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            configurableClientsideParamsCustomAuth: ConfigurableClientsideParamsCustomAuth
        ) = apply {
            apiBase = configurableClientsideParamsCustomAuth.apiBase
            additionalProperties =
                configurableClientsideParamsCustomAuth.additionalProperties.toMutableMap()
        }

        fun apiBase(apiBase: String) = apiBase(JsonField.of(apiBase))

        /**
         * Sets [Builder.apiBase] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiBase] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apiBase(apiBase: JsonField<String>) = apply { this.apiBase = apiBase }

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
         * Returns an immutable instance of [ConfigurableClientsideParamsCustomAuth].
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
        fun build(): ConfigurableClientsideParamsCustomAuth =
            ConfigurableClientsideParamsCustomAuth(
                checkRequired("apiBase", apiBase),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ConfigurableClientsideParamsCustomAuth = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int = (if (apiBase.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConfigurableClientsideParamsCustomAuth &&
            apiBase == other.apiBase &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(apiBase, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConfigurableClientsideParamsCustomAuth{apiBase=$apiBase, additionalProperties=$additionalProperties}"
}
