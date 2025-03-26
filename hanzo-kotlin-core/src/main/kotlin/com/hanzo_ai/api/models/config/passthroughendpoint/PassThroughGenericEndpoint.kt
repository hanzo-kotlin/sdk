// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.config.passthroughendpoint

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hanzo_ai.api.core.ExcludeMissing
import com.hanzo_ai.api.core.JsonField
import com.hanzo_ai.api.core.JsonMissing
import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.core.checkRequired
import com.hanzo_ai.api.errors.HanzoInvalidDataException
import java.util.Collections
import java.util.Objects

class PassThroughGenericEndpoint
private constructor(
    private val headers: JsonValue,
    private val path: JsonField<String>,
    private val target: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("headers") @ExcludeMissing headers: JsonValue = JsonMissing.of(),
        @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
        @JsonProperty("target") @ExcludeMissing target: JsonField<String> = JsonMissing.of(),
    ) : this(headers, path, target, mutableMapOf())

    /**
     * Key-value pairs of headers to be forwarded with the request. You can set any key value pair
     * here and it will be forwarded to your target endpoint
     */
    @JsonProperty("headers") @ExcludeMissing fun _headers(): JsonValue = headers

    /**
     * The route to be added to the LLM Proxy Server.
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun path(): String = path.getRequired("path")

    /**
     * The URL to which requests for this path should be forwarded.
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun target(): String = target.getRequired("target")

    /**
     * Returns the raw JSON value of [path].
     *
     * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

    /**
     * Returns the raw JSON value of [target].
     *
     * Unlike [target], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("target") @ExcludeMissing fun _target(): JsonField<String> = target

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
         * Returns a mutable builder for constructing an instance of [PassThroughGenericEndpoint].
         *
         * The following fields are required:
         * ```kotlin
         * .headers()
         * .path()
         * .target()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PassThroughGenericEndpoint]. */
    class Builder internal constructor() {

        private var headers: JsonValue? = null
        private var path: JsonField<String>? = null
        private var target: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(passThroughGenericEndpoint: PassThroughGenericEndpoint) = apply {
            headers = passThroughGenericEndpoint.headers
            path = passThroughGenericEndpoint.path
            target = passThroughGenericEndpoint.target
            additionalProperties = passThroughGenericEndpoint.additionalProperties.toMutableMap()
        }

        /**
         * Key-value pairs of headers to be forwarded with the request. You can set any key value
         * pair here and it will be forwarded to your target endpoint
         */
        fun headers(headers: JsonValue) = apply { this.headers = headers }

        /** The route to be added to the LLM Proxy Server. */
        fun path(path: String) = path(JsonField.of(path))

        /**
         * Sets [Builder.path] to an arbitrary JSON value.
         *
         * You should usually call [Builder.path] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun path(path: JsonField<String>) = apply { this.path = path }

        /** The URL to which requests for this path should be forwarded. */
        fun target(target: String) = target(JsonField.of(target))

        /**
         * Sets [Builder.target] to an arbitrary JSON value.
         *
         * You should usually call [Builder.target] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun target(target: JsonField<String>) = apply { this.target = target }

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
         * Returns an immutable instance of [PassThroughGenericEndpoint].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .headers()
         * .path()
         * .target()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PassThroughGenericEndpoint =
            PassThroughGenericEndpoint(
                checkRequired("headers", headers),
                checkRequired("path", path),
                checkRequired("target", target),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PassThroughGenericEndpoint = apply {
        if (validated) {
            return@apply
        }

        path()
        target()
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PassThroughGenericEndpoint && headers == other.headers && path == other.path && target == other.target && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(headers, path, target, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PassThroughGenericEndpoint{headers=$headers, path=$path, target=$target, additionalProperties=$additionalProperties}"
}
