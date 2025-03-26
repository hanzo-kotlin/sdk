// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.add

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

class IpAddress
private constructor(
    private val ip: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("ip") @ExcludeMissing ip: JsonField<String> = JsonMissing.of()
    ) : this(ip, mutableMapOf())

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ip(): String = ip.getRequired("ip")

    /**
     * Returns the raw JSON value of [ip].
     *
     * Unlike [ip], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ip") @ExcludeMissing fun _ip(): JsonField<String> = ip

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
         * Returns a mutable builder for constructing an instance of [IpAddress].
         *
         * The following fields are required:
         * ```kotlin
         * .ip()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [IpAddress]. */
    class Builder internal constructor() {

        private var ip: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ipAddress: IpAddress) = apply {
            ip = ipAddress.ip
            additionalProperties = ipAddress.additionalProperties.toMutableMap()
        }

        fun ip(ip: String) = ip(JsonField.of(ip))

        /**
         * Sets [Builder.ip] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ip] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ip(ip: JsonField<String>) = apply { this.ip = ip }

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
         * Returns an immutable instance of [IpAddress].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .ip()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IpAddress =
            IpAddress(checkRequired("ip", ip), additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): IpAddress = apply {
        if (validated) {
            return@apply
        }

        ip()
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IpAddress && ip == other.ip && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(ip, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "IpAddress{ip=$ip, additionalProperties=$additionalProperties}"
}
