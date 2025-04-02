// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.customer

import ai.hanzo.api.core.Enum
import ai.hanzo.api.core.ExcludeMissing
import ai.hanzo.api.core.JsonField
import ai.hanzo.api.core.JsonMissing
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.Params
import ai.hanzo.api.core.checkRequired
import ai.hanzo.api.core.http.Headers
import ai.hanzo.api.core.http.QueryParams
import ai.hanzo.api.errors.HanzoInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/**
 * Example curl
 *
 * Parameters:
 * - user_id: str
 * - alias: Optional[str] = None # human-friendly alias
 * - blocked: bool = False # allow/disallow requests for this end-user
 * - max_budget: Optional[float] = None
 * - budget_id: Optional[str] = None # give either a budget_id or max_budget
 * - allowed_model_region: Optional[AllowedModelRegion] = ( None # require all user requests to use
 *   models in this specific region )
 * - default_model: Optional[str] = ( None # if no equivalent model in allowed region - default all
 *   requests to this model )
 *
 * Example curl:
 * ```
 * curl --location 'http://0.0.0.0:4000/customer/update'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data '{
 *     "user_id": "test-llm-user-4",
 *     "budget_id": "paid_tier"
 * }'
 *
 * See below for all params
 * ```
 */
class CustomerUpdateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): String = body.userId()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun alias(): String? = body.alias()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowedModelRegion(): AllowedModelRegion? = body.allowedModelRegion()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun blocked(): Boolean? = body.blocked()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun budgetId(): String? = body.budgetId()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultModel(): String? = body.defaultModel()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxBudget(): Double? = body.maxBudget()

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _userId(): JsonField<String> = body._userId()

    /**
     * Returns the raw JSON value of [alias].
     *
     * Unlike [alias], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _alias(): JsonField<String> = body._alias()

    /**
     * Returns the raw JSON value of [allowedModelRegion].
     *
     * Unlike [allowedModelRegion], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _allowedModelRegion(): JsonField<AllowedModelRegion> = body._allowedModelRegion()

    /**
     * Returns the raw JSON value of [blocked].
     *
     * Unlike [blocked], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _blocked(): JsonField<Boolean> = body._blocked()

    /**
     * Returns the raw JSON value of [budgetId].
     *
     * Unlike [budgetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _budgetId(): JsonField<String> = body._budgetId()

    /**
     * Returns the raw JSON value of [defaultModel].
     *
     * Unlike [defaultModel], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _defaultModel(): JsonField<String> = body._defaultModel()

    /**
     * Returns the raw JSON value of [maxBudget].
     *
     * Unlike [maxBudget], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxBudget(): JsonField<Double> = body._maxBudget()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomerUpdateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .userId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CustomerUpdateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(customerUpdateParams: CustomerUpdateParams) = apply {
            body = customerUpdateParams.body.toBuilder()
            additionalHeaders = customerUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerUpdateParams.additionalQueryParams.toBuilder()
        }

        fun userId(userId: String) = apply { body.userId(userId) }

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { body.userId(userId) }

        fun alias(alias: String?) = apply { body.alias(alias) }

        /**
         * Sets [Builder.alias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alias] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun alias(alias: JsonField<String>) = apply { body.alias(alias) }

        fun allowedModelRegion(allowedModelRegion: AllowedModelRegion?) = apply {
            body.allowedModelRegion(allowedModelRegion)
        }

        /**
         * Sets [Builder.allowedModelRegion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedModelRegion] with a well-typed
         * [AllowedModelRegion] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun allowedModelRegion(allowedModelRegion: JsonField<AllowedModelRegion>) = apply {
            body.allowedModelRegion(allowedModelRegion)
        }

        fun blocked(blocked: Boolean) = apply { body.blocked(blocked) }

        /**
         * Sets [Builder.blocked] to an arbitrary JSON value.
         *
         * You should usually call [Builder.blocked] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun blocked(blocked: JsonField<Boolean>) = apply { body.blocked(blocked) }

        fun budgetId(budgetId: String?) = apply { body.budgetId(budgetId) }

        /**
         * Sets [Builder.budgetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.budgetId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun budgetId(budgetId: JsonField<String>) = apply { body.budgetId(budgetId) }

        fun defaultModel(defaultModel: String?) = apply { body.defaultModel(defaultModel) }

        /**
         * Sets [Builder.defaultModel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultModel] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun defaultModel(defaultModel: JsonField<String>) = apply {
            body.defaultModel(defaultModel)
        }

        fun maxBudget(maxBudget: Double?) = apply { body.maxBudget(maxBudget) }

        /**
         * Alias for [Builder.maxBudget].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxBudget(maxBudget: Double) = maxBudget(maxBudget as Double?)

        /**
         * Sets [Builder.maxBudget] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxBudget] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxBudget(maxBudget: JsonField<Double>) = apply { body.maxBudget(maxBudget) }

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
         * Returns an immutable instance of [CustomerUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerUpdateParams =
            CustomerUpdateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Update a Customer, use this to update customer budgets etc */
    class Body
    private constructor(
        private val userId: JsonField<String>,
        private val alias: JsonField<String>,
        private val allowedModelRegion: JsonField<AllowedModelRegion>,
        private val blocked: JsonField<Boolean>,
        private val budgetId: JsonField<String>,
        private val defaultModel: JsonField<String>,
        private val maxBudget: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("alias") @ExcludeMissing alias: JsonField<String> = JsonMissing.of(),
            @JsonProperty("allowed_model_region")
            @ExcludeMissing
            allowedModelRegion: JsonField<AllowedModelRegion> = JsonMissing.of(),
            @JsonProperty("blocked") @ExcludeMissing blocked: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("budget_id")
            @ExcludeMissing
            budgetId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("default_model")
            @ExcludeMissing
            defaultModel: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_budget")
            @ExcludeMissing
            maxBudget: JsonField<Double> = JsonMissing.of(),
        ) : this(
            userId,
            alias,
            allowedModelRegion,
            blocked,
            budgetId,
            defaultModel,
            maxBudget,
            mutableMapOf(),
        )

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun userId(): String = userId.getRequired("user_id")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun alias(): String? = alias.getNullable("alias")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allowedModelRegion(): AllowedModelRegion? =
            allowedModelRegion.getNullable("allowed_model_region")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun blocked(): Boolean? = blocked.getNullable("blocked")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun budgetId(): String? = budgetId.getNullable("budget_id")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultModel(): String? = defaultModel.getNullable("default_model")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxBudget(): Double? = maxBudget.getNullable("max_budget")

        /**
         * Returns the raw JSON value of [userId].
         *
         * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

        /**
         * Returns the raw JSON value of [alias].
         *
         * Unlike [alias], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("alias") @ExcludeMissing fun _alias(): JsonField<String> = alias

        /**
         * Returns the raw JSON value of [allowedModelRegion].
         *
         * Unlike [allowedModelRegion], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allowed_model_region")
        @ExcludeMissing
        fun _allowedModelRegion(): JsonField<AllowedModelRegion> = allowedModelRegion

        /**
         * Returns the raw JSON value of [blocked].
         *
         * Unlike [blocked], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("blocked") @ExcludeMissing fun _blocked(): JsonField<Boolean> = blocked

        /**
         * Returns the raw JSON value of [budgetId].
         *
         * Unlike [budgetId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("budget_id") @ExcludeMissing fun _budgetId(): JsonField<String> = budgetId

        /**
         * Returns the raw JSON value of [defaultModel].
         *
         * Unlike [defaultModel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("default_model")
        @ExcludeMissing
        fun _defaultModel(): JsonField<String> = defaultModel

        /**
         * Returns the raw JSON value of [maxBudget].
         *
         * Unlike [maxBudget], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_budget") @ExcludeMissing fun _maxBudget(): JsonField<Double> = maxBudget

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
             * .userId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var userId: JsonField<String>? = null
            private var alias: JsonField<String> = JsonMissing.of()
            private var allowedModelRegion: JsonField<AllowedModelRegion> = JsonMissing.of()
            private var blocked: JsonField<Boolean> = JsonMissing.of()
            private var budgetId: JsonField<String> = JsonMissing.of()
            private var defaultModel: JsonField<String> = JsonMissing.of()
            private var maxBudget: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                userId = body.userId
                alias = body.alias
                allowedModelRegion = body.allowedModelRegion
                blocked = body.blocked
                budgetId = body.budgetId
                defaultModel = body.defaultModel
                maxBudget = body.maxBudget
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun userId(userId: String) = userId(JsonField.of(userId))

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

            fun alias(alias: String?) = alias(JsonField.ofNullable(alias))

            /**
             * Sets [Builder.alias] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alias] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun alias(alias: JsonField<String>) = apply { this.alias = alias }

            fun allowedModelRegion(allowedModelRegion: AllowedModelRegion?) =
                allowedModelRegion(JsonField.ofNullable(allowedModelRegion))

            /**
             * Sets [Builder.allowedModelRegion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowedModelRegion] with a well-typed
             * [AllowedModelRegion] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun allowedModelRegion(allowedModelRegion: JsonField<AllowedModelRegion>) = apply {
                this.allowedModelRegion = allowedModelRegion
            }

            fun blocked(blocked: Boolean) = blocked(JsonField.of(blocked))

            /**
             * Sets [Builder.blocked] to an arbitrary JSON value.
             *
             * You should usually call [Builder.blocked] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun blocked(blocked: JsonField<Boolean>) = apply { this.blocked = blocked }

            fun budgetId(budgetId: String?) = budgetId(JsonField.ofNullable(budgetId))

            /**
             * Sets [Builder.budgetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.budgetId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun budgetId(budgetId: JsonField<String>) = apply { this.budgetId = budgetId }

            fun defaultModel(defaultModel: String?) =
                defaultModel(JsonField.ofNullable(defaultModel))

            /**
             * Sets [Builder.defaultModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultModel] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun defaultModel(defaultModel: JsonField<String>) = apply {
                this.defaultModel = defaultModel
            }

            fun maxBudget(maxBudget: Double?) = maxBudget(JsonField.ofNullable(maxBudget))

            /**
             * Alias for [Builder.maxBudget].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxBudget(maxBudget: Double) = maxBudget(maxBudget as Double?)

            /**
             * Sets [Builder.maxBudget] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxBudget] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxBudget(maxBudget: JsonField<Double>) = apply { this.maxBudget = maxBudget }

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
             * .userId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("userId", userId),
                    alias,
                    allowedModelRegion,
                    blocked,
                    budgetId,
                    defaultModel,
                    maxBudget,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            userId()
            alias()
            allowedModelRegion()?.validate()
            blocked()
            budgetId()
            defaultModel()
            maxBudget()
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
            (if (userId.asKnown() == null) 0 else 1) +
                (if (alias.asKnown() == null) 0 else 1) +
                (allowedModelRegion.asKnown()?.validity() ?: 0) +
                (if (blocked.asKnown() == null) 0 else 1) +
                (if (budgetId.asKnown() == null) 0 else 1) +
                (if (defaultModel.asKnown() == null) 0 else 1) +
                (if (maxBudget.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && userId == other.userId && alias == other.alias && allowedModelRegion == other.allowedModelRegion && blocked == other.blocked && budgetId == other.budgetId && defaultModel == other.defaultModel && maxBudget == other.maxBudget && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(userId, alias, allowedModelRegion, blocked, budgetId, defaultModel, maxBudget, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{userId=$userId, alias=$alias, allowedModelRegion=$allowedModelRegion, blocked=$blocked, budgetId=$budgetId, defaultModel=$defaultModel, maxBudget=$maxBudget, additionalProperties=$additionalProperties}"
    }

    class AllowedModelRegion
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            val EU = of("eu")

            val US = of("us")

            fun of(value: String) = AllowedModelRegion(JsonField.of(value))
        }

        /** An enum containing [AllowedModelRegion]'s known values. */
        enum class Known {
            EU,
            US,
        }

        /**
         * An enum containing [AllowedModelRegion]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AllowedModelRegion] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EU,
            US,
            /**
             * An enum member indicating that [AllowedModelRegion] was instantiated with an unknown
             * value.
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
                EU -> Value.EU
                US -> Value.US
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
                EU -> Known.EU
                US -> Known.US
                else -> throw HanzoInvalidDataException("Unknown AllowedModelRegion: $value")
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

        fun validate(): AllowedModelRegion = apply {
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

            return /* spotless:off */ other is AllowedModelRegion && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerUpdateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerUpdateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
