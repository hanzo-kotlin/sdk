// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team.callback

import ai.hanzo.api.core.Enum
import ai.hanzo.api.core.ExcludeMissing
import ai.hanzo.api.core.JsonField
import ai.hanzo.api.core.JsonMissing
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.Params
import ai.hanzo.api.core.checkRequired
import ai.hanzo.api.core.http.Headers
import ai.hanzo.api.core.http.QueryParams
import ai.hanzo.api.core.toImmutable
import ai.hanzo.api.errors.HanzoInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/**
 * Add a success/failure callback to a team
 *
 * Use this if if you want different teams to have different success/failure callbacks
 *
 * Parameters:
 * - callback_name (Literal["langfuse", "langsmith", "gcs"], required): The name of the callback to
 *   add
 * - callback_type (Literal["success", "failure", "success_and_failure"], required): The type of
 *   callback to add. One of:
 *     - "success": Callback for successful LLM calls
 *     - "failure": Callback for failed LLM calls
 *     - "success_and_failure": Callback for both successful and failed LLM calls
 * - callback_vars (StandardCallbackDynamicParams, required): A dictionary of variables to pass to
 *   the callback
 *     - langfuse_public_key: The public key for the Langfuse callback
 *     - langfuse_secret_key: The secret key for the Langfuse callback
 *     - langfuse_secret: The secret for the Langfuse callback
 *     - langfuse_host: The host for the Langfuse callback
 *     - gcs_bucket_name: The name of the GCS bucket
 *     - gcs_path_service_account: The path to the GCS service account
 *     - langsmith_api_key: The API key for the Langsmith callback
 *     - langsmith_project: The project for the Langsmith callback
 *     - langsmith_base_url: The base URL for the Langsmith callback
 *
 * Example curl:
 * ```
 * curl -X POST 'http:/localhost:4000/team/dbe2f686-a686-4896-864a-4c3924458709/callback'         -H 'Content-Type: application/json'         -H 'Authorization: Bearer sk-1234'         -d '{
 *     "callback_name": "langfuse",
 *     "callback_type": "success",
 *     "callback_vars": {"langfuse_public_key": "pk-lf-xxxx1", "langfuse_secret_key": "sk-xxxxx"}
 *
 * }'
 * ```
 *
 * This means for the team where team_id = dbe2f686-a686-4896-864a-4c3924458709, all LLM calls will
 * be logged to langfuse using the public key pk-lf-xxxx1 and the secret key sk-xxxxx
 */
class CallbackAddParams
private constructor(
    private val teamId: String?,
    private val llmChangedBy: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun teamId(): String? = teamId

    /**
     * The llm-changed-by header enables tracking of actions performed by authorized users on behalf
     * of other users, providing an audit trail for accountability
     */
    fun llmChangedBy(): String? = llmChangedBy

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun callbackName(): String = body.callbackName()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun callbackVars(): CallbackVars = body.callbackVars()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callbackType(): CallbackType? = body.callbackType()

    /**
     * Returns the raw JSON value of [callbackName].
     *
     * Unlike [callbackName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _callbackName(): JsonField<String> = body._callbackName()

    /**
     * Returns the raw JSON value of [callbackVars].
     *
     * Unlike [callbackVars], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _callbackVars(): JsonField<CallbackVars> = body._callbackVars()

    /**
     * Returns the raw JSON value of [callbackType].
     *
     * Unlike [callbackType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _callbackType(): JsonField<CallbackType> = body._callbackType()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CallbackAddParams].
         *
         * The following fields are required:
         * ```kotlin
         * .callbackName()
         * .callbackVars()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CallbackAddParams]. */
    class Builder internal constructor() {

        private var teamId: String? = null
        private var llmChangedBy: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(callbackAddParams: CallbackAddParams) = apply {
            teamId = callbackAddParams.teamId
            llmChangedBy = callbackAddParams.llmChangedBy
            body = callbackAddParams.body.toBuilder()
            additionalHeaders = callbackAddParams.additionalHeaders.toBuilder()
            additionalQueryParams = callbackAddParams.additionalQueryParams.toBuilder()
        }

        fun teamId(teamId: String?) = apply { this.teamId = teamId }

        /**
         * The llm-changed-by header enables tracking of actions performed by authorized users on
         * behalf of other users, providing an audit trail for accountability
         */
        fun llmChangedBy(llmChangedBy: String?) = apply { this.llmChangedBy = llmChangedBy }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [callbackName]
         * - [callbackVars]
         * - [callbackType]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun callbackName(callbackName: String) = apply { body.callbackName(callbackName) }

        /**
         * Sets [Builder.callbackName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callbackName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callbackName(callbackName: JsonField<String>) = apply {
            body.callbackName(callbackName)
        }

        fun callbackVars(callbackVars: CallbackVars) = apply { body.callbackVars(callbackVars) }

        /**
         * Sets [Builder.callbackVars] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callbackVars] with a well-typed [CallbackVars] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun callbackVars(callbackVars: JsonField<CallbackVars>) = apply {
            body.callbackVars(callbackVars)
        }

        fun callbackType(callbackType: CallbackType?) = apply { body.callbackType(callbackType) }

        /**
         * Sets [Builder.callbackType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callbackType] with a well-typed [CallbackType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun callbackType(callbackType: JsonField<CallbackType>) = apply {
            body.callbackType(callbackType)
        }

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
         * Returns an immutable instance of [CallbackAddParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .callbackName()
         * .callbackVars()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CallbackAddParams =
            CallbackAddParams(
                teamId,
                llmChangedBy,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> teamId ?: ""
            else -> ""
        }

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                llmChangedBy?.let { put("llm-changed-by", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val callbackName: JsonField<String>,
        private val callbackVars: JsonField<CallbackVars>,
        private val callbackType: JsonField<CallbackType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("callback_name")
            @ExcludeMissing
            callbackName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("callback_vars")
            @ExcludeMissing
            callbackVars: JsonField<CallbackVars> = JsonMissing.of(),
            @JsonProperty("callback_type")
            @ExcludeMissing
            callbackType: JsonField<CallbackType> = JsonMissing.of(),
        ) : this(callbackName, callbackVars, callbackType, mutableMapOf())

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun callbackName(): String = callbackName.getRequired("callback_name")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun callbackVars(): CallbackVars = callbackVars.getRequired("callback_vars")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callbackType(): CallbackType? = callbackType.getNullable("callback_type")

        /**
         * Returns the raw JSON value of [callbackName].
         *
         * Unlike [callbackName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("callback_name")
        @ExcludeMissing
        fun _callbackName(): JsonField<String> = callbackName

        /**
         * Returns the raw JSON value of [callbackVars].
         *
         * Unlike [callbackVars], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("callback_vars")
        @ExcludeMissing
        fun _callbackVars(): JsonField<CallbackVars> = callbackVars

        /**
         * Returns the raw JSON value of [callbackType].
         *
         * Unlike [callbackType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("callback_type")
        @ExcludeMissing
        fun _callbackType(): JsonField<CallbackType> = callbackType

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
             * .callbackName()
             * .callbackVars()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var callbackName: JsonField<String>? = null
            private var callbackVars: JsonField<CallbackVars>? = null
            private var callbackType: JsonField<CallbackType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                callbackName = body.callbackName
                callbackVars = body.callbackVars
                callbackType = body.callbackType
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun callbackName(callbackName: String) = callbackName(JsonField.of(callbackName))

            /**
             * Sets [Builder.callbackName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callbackName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callbackName(callbackName: JsonField<String>) = apply {
                this.callbackName = callbackName
            }

            fun callbackVars(callbackVars: CallbackVars) = callbackVars(JsonField.of(callbackVars))

            /**
             * Sets [Builder.callbackVars] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callbackVars] with a well-typed [CallbackVars] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callbackVars(callbackVars: JsonField<CallbackVars>) = apply {
                this.callbackVars = callbackVars
            }

            fun callbackType(callbackType: CallbackType?) =
                callbackType(JsonField.ofNullable(callbackType))

            /**
             * Sets [Builder.callbackType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callbackType] with a well-typed [CallbackType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callbackType(callbackType: JsonField<CallbackType>) = apply {
                this.callbackType = callbackType
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .callbackName()
             * .callbackVars()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("callbackName", callbackName),
                    checkRequired("callbackVars", callbackVars),
                    callbackType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            callbackName()
            callbackVars().validate()
            callbackType()?.validate()
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
            (if (callbackName.asKnown() == null) 0 else 1) +
                (callbackVars.asKnown()?.validity() ?: 0) +
                (callbackType.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                callbackName == other.callbackName &&
                callbackVars == other.callbackVars &&
                callbackType == other.callbackType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(callbackName, callbackVars, callbackType, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{callbackName=$callbackName, callbackVars=$callbackVars, callbackType=$callbackType, additionalProperties=$additionalProperties}"
    }

    class CallbackVars
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

            /** Returns a mutable builder for constructing an instance of [CallbackVars]. */
            fun builder() = Builder()
        }

        /** A builder for [CallbackVars]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(callbackVars: CallbackVars) = apply {
                additionalProperties = callbackVars.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [CallbackVars].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CallbackVars = CallbackVars(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): CallbackVars = apply {
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

            return other is CallbackVars && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "CallbackVars{additionalProperties=$additionalProperties}"
    }

    class CallbackType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val SUCCESS = of("success")

            val FAILURE = of("failure")

            val SUCCESS_AND_FAILURE = of("success_and_failure")

            fun of(value: String) = CallbackType(JsonField.of(value))
        }

        /** An enum containing [CallbackType]'s known values. */
        enum class Known {
            SUCCESS,
            FAILURE,
            SUCCESS_AND_FAILURE,
        }

        /**
         * An enum containing [CallbackType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CallbackType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SUCCESS,
            FAILURE,
            SUCCESS_AND_FAILURE,
            /**
             * An enum member indicating that [CallbackType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                SUCCESS -> Value.SUCCESS
                FAILURE -> Value.FAILURE
                SUCCESS_AND_FAILURE -> Value.SUCCESS_AND_FAILURE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HanzoInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                SUCCESS -> Known.SUCCESS
                FAILURE -> Known.FAILURE
                SUCCESS_AND_FAILURE -> Known.SUCCESS_AND_FAILURE
                else -> throw HanzoInvalidDataException("Unknown CallbackType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HanzoInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw HanzoInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): CallbackType = apply {
            if (validated) {
                return@apply
            }

            known()
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
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CallbackType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CallbackAddParams &&
            teamId == other.teamId &&
            llmChangedBy == other.llmChangedBy &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(teamId, llmChangedBy, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CallbackAddParams{teamId=$teamId, llmChangedBy=$llmChangedBy, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
