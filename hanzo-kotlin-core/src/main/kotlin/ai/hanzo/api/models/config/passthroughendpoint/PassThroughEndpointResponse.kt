// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.config.passthroughendpoint

import ai.hanzo.api.core.ExcludeMissing
import ai.hanzo.api.core.JsonField
import ai.hanzo.api.core.JsonMissing
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.checkKnown
import ai.hanzo.api.core.checkRequired
import ai.hanzo.api.core.toImmutable
import ai.hanzo.api.errors.HanzoInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class PassThroughEndpointResponse
private constructor(
    private val endpoints: JsonField<List<PassThroughGenericEndpoint>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("endpoints")
        @ExcludeMissing
        endpoints: JsonField<List<PassThroughGenericEndpoint>> = JsonMissing.of()
    ) : this(endpoints, mutableMapOf())

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endpoints(): List<PassThroughGenericEndpoint> = endpoints.getRequired("endpoints")

    /**
     * Returns the raw JSON value of [endpoints].
     *
     * Unlike [endpoints], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endpoints")
    @ExcludeMissing
    fun _endpoints(): JsonField<List<PassThroughGenericEndpoint>> = endpoints

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
         * Returns a mutable builder for constructing an instance of [PassThroughEndpointResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .endpoints()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PassThroughEndpointResponse]. */
    class Builder internal constructor() {

        private var endpoints: JsonField<MutableList<PassThroughGenericEndpoint>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(passThroughEndpointResponse: PassThroughEndpointResponse) = apply {
            endpoints = passThroughEndpointResponse.endpoints.map { it.toMutableList() }
            additionalProperties = passThroughEndpointResponse.additionalProperties.toMutableMap()
        }

        fun endpoints(endpoints: List<PassThroughGenericEndpoint>) =
            endpoints(JsonField.of(endpoints))

        /**
         * Sets [Builder.endpoints] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endpoints] with a well-typed
         * `List<PassThroughGenericEndpoint>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun endpoints(endpoints: JsonField<List<PassThroughGenericEndpoint>>) = apply {
            this.endpoints = endpoints.map { it.toMutableList() }
        }

        /**
         * Adds a single [PassThroughGenericEndpoint] to [endpoints].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEndpoint(endpoint: PassThroughGenericEndpoint) = apply {
            endpoints =
                (endpoints ?: JsonField.of(mutableListOf())).also {
                    checkKnown("endpoints", it).add(endpoint)
                }
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
         * Returns an immutable instance of [PassThroughEndpointResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .endpoints()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PassThroughEndpointResponse =
            PassThroughEndpointResponse(
                checkRequired("endpoints", endpoints).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PassThroughEndpointResponse = apply {
        if (validated) {
            return@apply
        }

        endpoints().forEach { it.validate() }
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
    internal fun validity(): Int = (endpoints.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PassThroughEndpointResponse &&
            endpoints == other.endpoints &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(endpoints, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PassThroughEndpointResponse{endpoints=$endpoints, additionalProperties=$additionalProperties}"
}
