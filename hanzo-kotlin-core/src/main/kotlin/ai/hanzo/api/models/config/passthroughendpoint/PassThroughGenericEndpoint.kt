// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.config.passthroughendpoint

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

class PassThroughGenericEndpoint
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val path: JsonField<String>,
    private val target: JsonField<String>,
    private val id: JsonField<String>,
    private val auth: JsonField<Boolean>,
    private val costPerRequest: JsonField<Double>,
    private val guardrails: JsonField<Guardrails>,
    private val headers: JsonField<Headers>,
    private val includeSubpath: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
        @JsonProperty("target") @ExcludeMissing target: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("auth") @ExcludeMissing auth: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("cost_per_request")
        @ExcludeMissing
        costPerRequest: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("guardrails")
        @ExcludeMissing
        guardrails: JsonField<Guardrails> = JsonMissing.of(),
        @JsonProperty("headers") @ExcludeMissing headers: JsonField<Headers> = JsonMissing.of(),
        @JsonProperty("include_subpath")
        @ExcludeMissing
        includeSubpath: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        path,
        target,
        id,
        auth,
        costPerRequest,
        guardrails,
        headers,
        includeSubpath,
        mutableMapOf(),
    )

    /**
     * The route to be added to the LiteLLM Proxy Server.
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
     * Optional unique identifier for the pass-through endpoint. If not provided, endpoints will be
     * identified by path for backwards compatibility.
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): String? = id.getNullable("id")

    /**
     * Whether authentication is required for the pass-through endpoint. If True, requests to the
     * endpoint will require a valid LiteLLM API key.
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun auth(): Boolean? = auth.getNullable("auth")

    /**
     * The USD cost per request to the target endpoint. This is used to calculate the cost of the
     * request to the target endpoint.
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun costPerRequest(): Double? = costPerRequest.getNullable("cost_per_request")

    /**
     * Guardrails configuration for this passthrough endpoint. Dict keys are guardrail names, values
     * are optional settings for field targeting. When set, all org/team/key level guardrails will
     * also execute. Defaults to None (no guardrails execute).
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun guardrails(): Guardrails? = guardrails.getNullable("guardrails")

    /**
     * Key-value pairs of headers to be forwarded with the request. You can set any key value pair
     * here and it will be forwarded to your target endpoint
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun headers(): Headers? = headers.getNullable("headers")

    /**
     * If True, requests to subpaths of the path will be forwarded to the target endpoint. For
     * example, if the path is /bria and include_subpath is True, requests to
     * /bria/v1/text-to-image/base/2.3 will be forwarded to the target endpoint.
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeSubpath(): Boolean? = includeSubpath.getNullable("include_subpath")

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

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [auth].
     *
     * Unlike [auth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("auth") @ExcludeMissing fun _auth(): JsonField<Boolean> = auth

    /**
     * Returns the raw JSON value of [costPerRequest].
     *
     * Unlike [costPerRequest], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cost_per_request")
    @ExcludeMissing
    fun _costPerRequest(): JsonField<Double> = costPerRequest

    /**
     * Returns the raw JSON value of [guardrails].
     *
     * Unlike [guardrails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("guardrails")
    @ExcludeMissing
    fun _guardrails(): JsonField<Guardrails> = guardrails

    /**
     * Returns the raw JSON value of [headers].
     *
     * Unlike [headers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("headers") @ExcludeMissing fun _headers(): JsonField<Headers> = headers

    /**
     * Returns the raw JSON value of [includeSubpath].
     *
     * Unlike [includeSubpath], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("include_subpath")
    @ExcludeMissing
    fun _includeSubpath(): JsonField<Boolean> = includeSubpath

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
         * .path()
         * .target()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PassThroughGenericEndpoint]. */
    class Builder internal constructor() {

        private var path: JsonField<String>? = null
        private var target: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var auth: JsonField<Boolean> = JsonMissing.of()
        private var costPerRequest: JsonField<Double> = JsonMissing.of()
        private var guardrails: JsonField<Guardrails> = JsonMissing.of()
        private var headers: JsonField<Headers> = JsonMissing.of()
        private var includeSubpath: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(passThroughGenericEndpoint: PassThroughGenericEndpoint) = apply {
            path = passThroughGenericEndpoint.path
            target = passThroughGenericEndpoint.target
            id = passThroughGenericEndpoint.id
            auth = passThroughGenericEndpoint.auth
            costPerRequest = passThroughGenericEndpoint.costPerRequest
            guardrails = passThroughGenericEndpoint.guardrails
            headers = passThroughGenericEndpoint.headers
            includeSubpath = passThroughGenericEndpoint.includeSubpath
            additionalProperties = passThroughGenericEndpoint.additionalProperties.toMutableMap()
        }

        /** The route to be added to the LiteLLM Proxy Server. */
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

        /**
         * Optional unique identifier for the pass-through endpoint. If not provided, endpoints will
         * be identified by path for backwards compatibility.
         */
        fun id(id: String?) = id(JsonField.ofNullable(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Whether authentication is required for the pass-through endpoint. If True, requests to
         * the endpoint will require a valid LiteLLM API key.
         */
        fun auth(auth: Boolean) = auth(JsonField.of(auth))

        /**
         * Sets [Builder.auth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.auth] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun auth(auth: JsonField<Boolean>) = apply { this.auth = auth }

        /**
         * The USD cost per request to the target endpoint. This is used to calculate the cost of
         * the request to the target endpoint.
         */
        fun costPerRequest(costPerRequest: Double) = costPerRequest(JsonField.of(costPerRequest))

        /**
         * Sets [Builder.costPerRequest] to an arbitrary JSON value.
         *
         * You should usually call [Builder.costPerRequest] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun costPerRequest(costPerRequest: JsonField<Double>) = apply {
            this.costPerRequest = costPerRequest
        }

        /**
         * Guardrails configuration for this passthrough endpoint. Dict keys are guardrail names,
         * values are optional settings for field targeting. When set, all org/team/key level
         * guardrails will also execute. Defaults to None (no guardrails execute).
         */
        fun guardrails(guardrails: Guardrails?) = guardrails(JsonField.ofNullable(guardrails))

        /**
         * Sets [Builder.guardrails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.guardrails] with a well-typed [Guardrails] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun guardrails(guardrails: JsonField<Guardrails>) = apply { this.guardrails = guardrails }

        /**
         * Key-value pairs of headers to be forwarded with the request. You can set any key value
         * pair here and it will be forwarded to your target endpoint
         */
        fun headers(headers: Headers) = headers(JsonField.of(headers))

        /**
         * Sets [Builder.headers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headers] with a well-typed [Headers] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun headers(headers: JsonField<Headers>) = apply { this.headers = headers }

        /**
         * If True, requests to subpaths of the path will be forwarded to the target endpoint. For
         * example, if the path is /bria and include_subpath is True, requests to
         * /bria/v1/text-to-image/base/2.3 will be forwarded to the target endpoint.
         */
        fun includeSubpath(includeSubpath: Boolean) = includeSubpath(JsonField.of(includeSubpath))

        /**
         * Sets [Builder.includeSubpath] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeSubpath] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includeSubpath(includeSubpath: JsonField<Boolean>) = apply {
            this.includeSubpath = includeSubpath
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
         * Returns an immutable instance of [PassThroughGenericEndpoint].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .path()
         * .target()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PassThroughGenericEndpoint =
            PassThroughGenericEndpoint(
                checkRequired("path", path),
                checkRequired("target", target),
                id,
                auth,
                costPerRequest,
                guardrails,
                headers,
                includeSubpath,
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
        id()
        auth()
        costPerRequest()
        guardrails()?.validate()
        headers()?.validate()
        includeSubpath()
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
        (if (path.asKnown() == null) 0 else 1) +
            (if (target.asKnown() == null) 0 else 1) +
            (if (id.asKnown() == null) 0 else 1) +
            (if (auth.asKnown() == null) 0 else 1) +
            (if (costPerRequest.asKnown() == null) 0 else 1) +
            (guardrails.asKnown()?.validity() ?: 0) +
            (headers.asKnown()?.validity() ?: 0) +
            (if (includeSubpath.asKnown() == null) 0 else 1)

    /**
     * Guardrails configuration for this passthrough endpoint. Dict keys are guardrail names, values
     * are optional settings for field targeting. When set, all org/team/key level guardrails will
     * also execute. Defaults to None (no guardrails execute).
     */
    class Guardrails
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

            /** Returns a mutable builder for constructing an instance of [Guardrails]. */
            fun builder() = Builder()
        }

        /** A builder for [Guardrails]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(guardrails: Guardrails) = apply {
                additionalProperties = guardrails.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Guardrails].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Guardrails = Guardrails(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Guardrails = apply {
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

            return other is Guardrails && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Guardrails{additionalProperties=$additionalProperties}"
    }

    /**
     * Key-value pairs of headers to be forwarded with the request. You can set any key value pair
     * here and it will be forwarded to your target endpoint
     */
    class Headers
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

            /** Returns a mutable builder for constructing an instance of [Headers]. */
            fun builder() = Builder()
        }

        /** A builder for [Headers]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(headers: Headers) = apply {
                additionalProperties = headers.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Headers].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Headers = Headers(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Headers = apply {
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

            return other is Headers && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Headers{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PassThroughGenericEndpoint &&
            path == other.path &&
            target == other.target &&
            id == other.id &&
            auth == other.auth &&
            costPerRequest == other.costPerRequest &&
            guardrails == other.guardrails &&
            headers == other.headers &&
            includeSubpath == other.includeSubpath &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            path,
            target,
            id,
            auth,
            costPerRequest,
            guardrails,
            headers,
            includeSubpath,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PassThroughGenericEndpoint{path=$path, target=$target, id=$id, auth=$auth, costPerRequest=$costPerRequest, guardrails=$guardrails, headers=$headers, includeSubpath=$includeSubpath, additionalProperties=$additionalProperties}"
}
