// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.cache

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

class CachePingResponse
private constructor(
    private val cacheType: JsonField<String>,
    private val status: JsonField<String>,
    private val healthCheckCacheParams: JsonValue,
    private val llmCacheParams: JsonField<String>,
    private val pingResponse: JsonField<Boolean>,
    private val setCacheResponse: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("cache_type") @ExcludeMissing cacheType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("health_check_cache_params")
        @ExcludeMissing
        healthCheckCacheParams: JsonValue = JsonMissing.of(),
        @JsonProperty("llm_cache_params")
        @ExcludeMissing
        llmCacheParams: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ping_response")
        @ExcludeMissing
        pingResponse: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("set_cache_response")
        @ExcludeMissing
        setCacheResponse: JsonField<String> = JsonMissing.of(),
    ) : this(
        cacheType,
        status,
        healthCheckCacheParams,
        llmCacheParams,
        pingResponse,
        setCacheResponse,
        mutableMapOf(),
    )

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cacheType(): String = cacheType.getRequired("cache_type")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): String = status.getRequired("status")

    @JsonProperty("health_check_cache_params")
    @ExcludeMissing
    fun _healthCheckCacheParams(): JsonValue = healthCheckCacheParams

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun llmCacheParams(): String? = llmCacheParams.getNullable("llm_cache_params")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pingResponse(): Boolean? = pingResponse.getNullable("ping_response")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun setCacheResponse(): String? = setCacheResponse.getNullable("set_cache_response")

    /**
     * Returns the raw JSON value of [cacheType].
     *
     * Unlike [cacheType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cache_type") @ExcludeMissing fun _cacheType(): JsonField<String> = cacheType

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [llmCacheParams].
     *
     * Unlike [llmCacheParams], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("llm_cache_params")
    @ExcludeMissing
    fun _llmCacheParams(): JsonField<String> = llmCacheParams

    /**
     * Returns the raw JSON value of [pingResponse].
     *
     * Unlike [pingResponse], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ping_response")
    @ExcludeMissing
    fun _pingResponse(): JsonField<Boolean> = pingResponse

    /**
     * Returns the raw JSON value of [setCacheResponse].
     *
     * Unlike [setCacheResponse], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("set_cache_response")
    @ExcludeMissing
    fun _setCacheResponse(): JsonField<String> = setCacheResponse

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
         * Returns a mutable builder for constructing an instance of [CachePingResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .cacheType()
         * .status()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CachePingResponse]. */
    class Builder internal constructor() {

        private var cacheType: JsonField<String>? = null
        private var status: JsonField<String>? = null
        private var healthCheckCacheParams: JsonValue = JsonMissing.of()
        private var llmCacheParams: JsonField<String> = JsonMissing.of()
        private var pingResponse: JsonField<Boolean> = JsonMissing.of()
        private var setCacheResponse: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(cachePingResponse: CachePingResponse) = apply {
            cacheType = cachePingResponse.cacheType
            status = cachePingResponse.status
            healthCheckCacheParams = cachePingResponse.healthCheckCacheParams
            llmCacheParams = cachePingResponse.llmCacheParams
            pingResponse = cachePingResponse.pingResponse
            setCacheResponse = cachePingResponse.setCacheResponse
            additionalProperties = cachePingResponse.additionalProperties.toMutableMap()
        }

        fun cacheType(cacheType: String) = cacheType(JsonField.of(cacheType))

        /**
         * Sets [Builder.cacheType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cacheType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cacheType(cacheType: JsonField<String>) = apply { this.cacheType = cacheType }

        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        fun healthCheckCacheParams(healthCheckCacheParams: JsonValue) = apply {
            this.healthCheckCacheParams = healthCheckCacheParams
        }

        fun llmCacheParams(llmCacheParams: String?) =
            llmCacheParams(JsonField.ofNullable(llmCacheParams))

        /**
         * Sets [Builder.llmCacheParams] to an arbitrary JSON value.
         *
         * You should usually call [Builder.llmCacheParams] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun llmCacheParams(llmCacheParams: JsonField<String>) = apply {
            this.llmCacheParams = llmCacheParams
        }

        fun pingResponse(pingResponse: Boolean?) = pingResponse(JsonField.ofNullable(pingResponse))

        /**
         * Alias for [Builder.pingResponse].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pingResponse(pingResponse: Boolean) = pingResponse(pingResponse as Boolean?)

        /**
         * Sets [Builder.pingResponse] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pingResponse] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pingResponse(pingResponse: JsonField<Boolean>) = apply {
            this.pingResponse = pingResponse
        }

        fun setCacheResponse(setCacheResponse: String?) =
            setCacheResponse(JsonField.ofNullable(setCacheResponse))

        /**
         * Sets [Builder.setCacheResponse] to an arbitrary JSON value.
         *
         * You should usually call [Builder.setCacheResponse] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun setCacheResponse(setCacheResponse: JsonField<String>) = apply {
            this.setCacheResponse = setCacheResponse
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
         * Returns an immutable instance of [CachePingResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .cacheType()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CachePingResponse =
            CachePingResponse(
                checkRequired("cacheType", cacheType),
                checkRequired("status", status),
                healthCheckCacheParams,
                llmCacheParams,
                pingResponse,
                setCacheResponse,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CachePingResponse = apply {
        if (validated) {
            return@apply
        }

        cacheType()
        status()
        llmCacheParams()
        pingResponse()
        setCacheResponse()
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
        (if (cacheType.asKnown() == null) 0 else 1) +
            (if (status.asKnown() == null) 0 else 1) +
            (if (llmCacheParams.asKnown() == null) 0 else 1) +
            (if (pingResponse.asKnown() == null) 0 else 1) +
            (if (setCacheResponse.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CachePingResponse &&
            cacheType == other.cacheType &&
            status == other.status &&
            healthCheckCacheParams == other.healthCheckCacheParams &&
            llmCacheParams == other.llmCacheParams &&
            pingResponse == other.pingResponse &&
            setCacheResponse == other.setCacheResponse &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            cacheType,
            status,
            healthCheckCacheParams,
            llmCacheParams,
            pingResponse,
            setCacheResponse,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CachePingResponse{cacheType=$cacheType, status=$status, healthCheckCacheParams=$healthCheckCacheParams, llmCacheParams=$llmCacheParams, pingResponse=$pingResponse, setCacheResponse=$setCacheResponse, additionalProperties=$additionalProperties}"
}
