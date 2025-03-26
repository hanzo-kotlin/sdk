// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.customer

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hanzo_ai.api.core.Enum
import com.hanzo_ai.api.core.ExcludeMissing
import com.hanzo_ai.api.core.JsonField
import com.hanzo_ai.api.core.JsonMissing
import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.core.checkRequired
import com.hanzo_ai.api.errors.HanzoInvalidDataException
import java.util.Collections
import java.util.Objects

class CustomerRetrieveInfoResponse
private constructor(
    private val blocked: JsonField<Boolean>,
    private val userId: JsonField<String>,
    private val alias: JsonField<String>,
    private val allowedModelRegion: JsonField<AllowedModelRegion>,
    private val defaultModel: JsonField<String>,
    private val llmBudgetTable: JsonField<LlmBudgetTable>,
    private val spend: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("blocked") @ExcludeMissing blocked: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("alias") @ExcludeMissing alias: JsonField<String> = JsonMissing.of(),
        @JsonProperty("allowed_model_region")
        @ExcludeMissing
        allowedModelRegion: JsonField<AllowedModelRegion> = JsonMissing.of(),
        @JsonProperty("default_model")
        @ExcludeMissing
        defaultModel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("llm_budget_table")
        @ExcludeMissing
        llmBudgetTable: JsonField<LlmBudgetTable> = JsonMissing.of(),
        @JsonProperty("spend") @ExcludeMissing spend: JsonField<Double> = JsonMissing.of(),
    ) : this(
        blocked,
        userId,
        alias,
        allowedModelRegion,
        defaultModel,
        llmBudgetTable,
        spend,
        mutableMapOf(),
    )

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun blocked(): Boolean = blocked.getRequired("blocked")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
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
    fun defaultModel(): String? = defaultModel.getNullable("default_model")

    /**
     * Represents user-controllable params for a LLM_BudgetTable record
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun llmBudgetTable(): LlmBudgetTable? = llmBudgetTable.getNullable("llm_budget_table")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spend(): Double? = spend.getNullable("spend")

    /**
     * Returns the raw JSON value of [blocked].
     *
     * Unlike [blocked], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("blocked") @ExcludeMissing fun _blocked(): JsonField<Boolean> = blocked

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
     * Unlike [allowedModelRegion], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("allowed_model_region")
    @ExcludeMissing
    fun _allowedModelRegion(): JsonField<AllowedModelRegion> = allowedModelRegion

    /**
     * Returns the raw JSON value of [defaultModel].
     *
     * Unlike [defaultModel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("default_model")
    @ExcludeMissing
    fun _defaultModel(): JsonField<String> = defaultModel

    /**
     * Returns the raw JSON value of [llmBudgetTable].
     *
     * Unlike [llmBudgetTable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("llm_budget_table")
    @ExcludeMissing
    fun _llmBudgetTable(): JsonField<LlmBudgetTable> = llmBudgetTable

    /**
     * Returns the raw JSON value of [spend].
     *
     * Unlike [spend], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spend") @ExcludeMissing fun _spend(): JsonField<Double> = spend

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
         * Returns a mutable builder for constructing an instance of [CustomerRetrieveInfoResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .blocked()
         * .userId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CustomerRetrieveInfoResponse]. */
    class Builder internal constructor() {

        private var blocked: JsonField<Boolean>? = null
        private var userId: JsonField<String>? = null
        private var alias: JsonField<String> = JsonMissing.of()
        private var allowedModelRegion: JsonField<AllowedModelRegion> = JsonMissing.of()
        private var defaultModel: JsonField<String> = JsonMissing.of()
        private var llmBudgetTable: JsonField<LlmBudgetTable> = JsonMissing.of()
        private var spend: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(customerRetrieveInfoResponse: CustomerRetrieveInfoResponse) = apply {
            blocked = customerRetrieveInfoResponse.blocked
            userId = customerRetrieveInfoResponse.userId
            alias = customerRetrieveInfoResponse.alias
            allowedModelRegion = customerRetrieveInfoResponse.allowedModelRegion
            defaultModel = customerRetrieveInfoResponse.defaultModel
            llmBudgetTable = customerRetrieveInfoResponse.llmBudgetTable
            spend = customerRetrieveInfoResponse.spend
            additionalProperties = customerRetrieveInfoResponse.additionalProperties.toMutableMap()
        }

        fun blocked(blocked: Boolean) = blocked(JsonField.of(blocked))

        /**
         * Sets [Builder.blocked] to an arbitrary JSON value.
         *
         * You should usually call [Builder.blocked] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun blocked(blocked: JsonField<Boolean>) = apply { this.blocked = blocked }

        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        fun alias(alias: String?) = alias(JsonField.ofNullable(alias))

        /**
         * Sets [Builder.alias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alias] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun alias(alias: JsonField<String>) = apply { this.alias = alias }

        fun allowedModelRegion(allowedModelRegion: AllowedModelRegion?) =
            allowedModelRegion(JsonField.ofNullable(allowedModelRegion))

        /**
         * Sets [Builder.allowedModelRegion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedModelRegion] with a well-typed
         * [AllowedModelRegion] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun allowedModelRegion(allowedModelRegion: JsonField<AllowedModelRegion>) = apply {
            this.allowedModelRegion = allowedModelRegion
        }

        fun defaultModel(defaultModel: String?) = defaultModel(JsonField.ofNullable(defaultModel))

        /**
         * Sets [Builder.defaultModel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultModel] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun defaultModel(defaultModel: JsonField<String>) = apply {
            this.defaultModel = defaultModel
        }

        /** Represents user-controllable params for a LLM_BudgetTable record */
        fun llmBudgetTable(llmBudgetTable: LlmBudgetTable?) =
            llmBudgetTable(JsonField.ofNullable(llmBudgetTable))

        /**
         * Sets [Builder.llmBudgetTable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.llmBudgetTable] with a well-typed [LlmBudgetTable] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun llmBudgetTable(llmBudgetTable: JsonField<LlmBudgetTable>) = apply {
            this.llmBudgetTable = llmBudgetTable
        }

        fun spend(spend: Double) = spend(JsonField.of(spend))

        /**
         * Sets [Builder.spend] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spend] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun spend(spend: JsonField<Double>) = apply { this.spend = spend }

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
         * Returns an immutable instance of [CustomerRetrieveInfoResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .blocked()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerRetrieveInfoResponse =
            CustomerRetrieveInfoResponse(
                checkRequired("blocked", blocked),
                checkRequired("userId", userId),
                alias,
                allowedModelRegion,
                defaultModel,
                llmBudgetTable,
                spend,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CustomerRetrieveInfoResponse = apply {
        if (validated) {
            return@apply
        }

        blocked()
        userId()
        alias()
        allowedModelRegion()
        defaultModel()
        llmBudgetTable()?.validate()
        spend()
        validated = true
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AllowedModelRegion && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Represents user-controllable params for a LLM_BudgetTable record */
    class LlmBudgetTable
    private constructor(
        private val budgetDuration: JsonField<String>,
        private val maxBudget: JsonField<Double>,
        private val maxParallelRequests: JsonField<Long>,
        private val modelMaxBudget: JsonValue,
        private val rpmLimit: JsonField<Long>,
        private val softBudget: JsonField<Double>,
        private val tpmLimit: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("budget_duration")
            @ExcludeMissing
            budgetDuration: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_budget")
            @ExcludeMissing
            maxBudget: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("max_parallel_requests")
            @ExcludeMissing
            maxParallelRequests: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("model_max_budget")
            @ExcludeMissing
            modelMaxBudget: JsonValue = JsonMissing.of(),
            @JsonProperty("rpm_limit") @ExcludeMissing rpmLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("soft_budget")
            @ExcludeMissing
            softBudget: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("tpm_limit") @ExcludeMissing tpmLimit: JsonField<Long> = JsonMissing.of(),
        ) : this(
            budgetDuration,
            maxBudget,
            maxParallelRequests,
            modelMaxBudget,
            rpmLimit,
            softBudget,
            tpmLimit,
            mutableMapOf(),
        )

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun budgetDuration(): String? = budgetDuration.getNullable("budget_duration")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxBudget(): Double? = maxBudget.getNullable("max_budget")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxParallelRequests(): Long? = maxParallelRequests.getNullable("max_parallel_requests")

        @JsonProperty("model_max_budget")
        @ExcludeMissing
        fun _modelMaxBudget(): JsonValue = modelMaxBudget

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rpmLimit(): Long? = rpmLimit.getNullable("rpm_limit")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun softBudget(): Double? = softBudget.getNullable("soft_budget")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tpmLimit(): Long? = tpmLimit.getNullable("tpm_limit")

        /**
         * Returns the raw JSON value of [budgetDuration].
         *
         * Unlike [budgetDuration], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("budget_duration")
        @ExcludeMissing
        fun _budgetDuration(): JsonField<String> = budgetDuration

        /**
         * Returns the raw JSON value of [maxBudget].
         *
         * Unlike [maxBudget], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_budget") @ExcludeMissing fun _maxBudget(): JsonField<Double> = maxBudget

        /**
         * Returns the raw JSON value of [maxParallelRequests].
         *
         * Unlike [maxParallelRequests], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("max_parallel_requests")
        @ExcludeMissing
        fun _maxParallelRequests(): JsonField<Long> = maxParallelRequests

        /**
         * Returns the raw JSON value of [rpmLimit].
         *
         * Unlike [rpmLimit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rpm_limit") @ExcludeMissing fun _rpmLimit(): JsonField<Long> = rpmLimit

        /**
         * Returns the raw JSON value of [softBudget].
         *
         * Unlike [softBudget], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("soft_budget")
        @ExcludeMissing
        fun _softBudget(): JsonField<Double> = softBudget

        /**
         * Returns the raw JSON value of [tpmLimit].
         *
         * Unlike [tpmLimit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tpm_limit") @ExcludeMissing fun _tpmLimit(): JsonField<Long> = tpmLimit

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

            /** Returns a mutable builder for constructing an instance of [LlmBudgetTable]. */
            fun builder() = Builder()
        }

        /** A builder for [LlmBudgetTable]. */
        class Builder internal constructor() {

            private var budgetDuration: JsonField<String> = JsonMissing.of()
            private var maxBudget: JsonField<Double> = JsonMissing.of()
            private var maxParallelRequests: JsonField<Long> = JsonMissing.of()
            private var modelMaxBudget: JsonValue = JsonMissing.of()
            private var rpmLimit: JsonField<Long> = JsonMissing.of()
            private var softBudget: JsonField<Double> = JsonMissing.of()
            private var tpmLimit: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(llmBudgetTable: LlmBudgetTable) = apply {
                budgetDuration = llmBudgetTable.budgetDuration
                maxBudget = llmBudgetTable.maxBudget
                maxParallelRequests = llmBudgetTable.maxParallelRequests
                modelMaxBudget = llmBudgetTable.modelMaxBudget
                rpmLimit = llmBudgetTable.rpmLimit
                softBudget = llmBudgetTable.softBudget
                tpmLimit = llmBudgetTable.tpmLimit
                additionalProperties = llmBudgetTable.additionalProperties.toMutableMap()
            }

            fun budgetDuration(budgetDuration: String?) =
                budgetDuration(JsonField.ofNullable(budgetDuration))

            /**
             * Sets [Builder.budgetDuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.budgetDuration] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun budgetDuration(budgetDuration: JsonField<String>) = apply {
                this.budgetDuration = budgetDuration
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

            fun maxParallelRequests(maxParallelRequests: Long?) =
                maxParallelRequests(JsonField.ofNullable(maxParallelRequests))

            /**
             * Alias for [Builder.maxParallelRequests].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxParallelRequests(maxParallelRequests: Long) =
                maxParallelRequests(maxParallelRequests as Long?)

            /**
             * Sets [Builder.maxParallelRequests] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxParallelRequests] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxParallelRequests(maxParallelRequests: JsonField<Long>) = apply {
                this.maxParallelRequests = maxParallelRequests
            }

            fun modelMaxBudget(modelMaxBudget: JsonValue) = apply {
                this.modelMaxBudget = modelMaxBudget
            }

            fun rpmLimit(rpmLimit: Long?) = rpmLimit(JsonField.ofNullable(rpmLimit))

            /**
             * Alias for [Builder.rpmLimit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun rpmLimit(rpmLimit: Long) = rpmLimit(rpmLimit as Long?)

            /**
             * Sets [Builder.rpmLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rpmLimit] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rpmLimit(rpmLimit: JsonField<Long>) = apply { this.rpmLimit = rpmLimit }

            fun softBudget(softBudget: Double?) = softBudget(JsonField.ofNullable(softBudget))

            /**
             * Alias for [Builder.softBudget].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun softBudget(softBudget: Double) = softBudget(softBudget as Double?)

            /**
             * Sets [Builder.softBudget] to an arbitrary JSON value.
             *
             * You should usually call [Builder.softBudget] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun softBudget(softBudget: JsonField<Double>) = apply { this.softBudget = softBudget }

            fun tpmLimit(tpmLimit: Long?) = tpmLimit(JsonField.ofNullable(tpmLimit))

            /**
             * Alias for [Builder.tpmLimit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun tpmLimit(tpmLimit: Long) = tpmLimit(tpmLimit as Long?)

            /**
             * Sets [Builder.tpmLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tpmLimit] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tpmLimit(tpmLimit: JsonField<Long>) = apply { this.tpmLimit = tpmLimit }

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
             * Returns an immutable instance of [LlmBudgetTable].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): LlmBudgetTable =
                LlmBudgetTable(
                    budgetDuration,
                    maxBudget,
                    maxParallelRequests,
                    modelMaxBudget,
                    rpmLimit,
                    softBudget,
                    tpmLimit,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): LlmBudgetTable = apply {
            if (validated) {
                return@apply
            }

            budgetDuration()
            maxBudget()
            maxParallelRequests()
            rpmLimit()
            softBudget()
            tpmLimit()
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LlmBudgetTable && budgetDuration == other.budgetDuration && maxBudget == other.maxBudget && maxParallelRequests == other.maxParallelRequests && modelMaxBudget == other.modelMaxBudget && rpmLimit == other.rpmLimit && softBudget == other.softBudget && tpmLimit == other.tpmLimit && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(budgetDuration, maxBudget, maxParallelRequests, modelMaxBudget, rpmLimit, softBudget, tpmLimit, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LlmBudgetTable{budgetDuration=$budgetDuration, maxBudget=$maxBudget, maxParallelRequests=$maxParallelRequests, modelMaxBudget=$modelMaxBudget, rpmLimit=$rpmLimit, softBudget=$softBudget, tpmLimit=$tpmLimit, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerRetrieveInfoResponse && blocked == other.blocked && userId == other.userId && alias == other.alias && allowedModelRegion == other.allowedModelRegion && defaultModel == other.defaultModel && llmBudgetTable == other.llmBudgetTable && spend == other.spend && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(blocked, userId, alias, allowedModelRegion, defaultModel, llmBudgetTable, spend, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerRetrieveInfoResponse{blocked=$blocked, userId=$userId, alias=$alias, allowedModelRegion=$allowedModelRegion, defaultModel=$defaultModel, llmBudgetTable=$llmBudgetTable, spend=$spend, additionalProperties=$additionalProperties}"
}
