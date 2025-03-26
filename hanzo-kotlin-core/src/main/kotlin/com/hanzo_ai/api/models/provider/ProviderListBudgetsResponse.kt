// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.provider

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hanzo_ai.api.core.ExcludeMissing
import com.hanzo_ai.api.core.JsonField
import com.hanzo_ai.api.core.JsonMissing
import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.core.toImmutable
import com.hanzo_ai.api.errors.HanzoInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * Complete provider budget configuration and status. Maps provider names to their budget configs.
 */
class ProviderListBudgetsResponse
private constructor(
    private val providers: JsonField<Providers>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("providers")
        @ExcludeMissing
        providers: JsonField<Providers> = JsonMissing.of()
    ) : this(providers, mutableMapOf())

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun providers(): Providers? = providers.getNullable("providers")

    /**
     * Returns the raw JSON value of [providers].
     *
     * Unlike [providers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("providers") @ExcludeMissing fun _providers(): JsonField<Providers> = providers

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
         * Returns a mutable builder for constructing an instance of [ProviderListBudgetsResponse].
         */
        fun builder() = Builder()
    }

    /** A builder for [ProviderListBudgetsResponse]. */
    class Builder internal constructor() {

        private var providers: JsonField<Providers> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(providerListBudgetsResponse: ProviderListBudgetsResponse) = apply {
            providers = providerListBudgetsResponse.providers
            additionalProperties = providerListBudgetsResponse.additionalProperties.toMutableMap()
        }

        fun providers(providers: Providers) = providers(JsonField.of(providers))

        /**
         * Sets [Builder.providers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providers] with a well-typed [Providers] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun providers(providers: JsonField<Providers>) = apply { this.providers = providers }

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
         * Returns an immutable instance of [ProviderListBudgetsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ProviderListBudgetsResponse =
            ProviderListBudgetsResponse(providers, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ProviderListBudgetsResponse = apply {
        if (validated) {
            return@apply
        }

        providers()?.validate()
        validated = true
    }

    class Providers
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

            /** Returns a mutable builder for constructing an instance of [Providers]. */
            fun builder() = Builder()
        }

        /** A builder for [Providers]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(providers: Providers) = apply {
                additionalProperties = providers.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Providers].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Providers = Providers(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Providers = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Providers && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Providers{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProviderListBudgetsResponse && providers == other.providers && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(providers, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProviderListBudgetsResponse{providers=$providers, additionalProperties=$additionalProperties}"
}
