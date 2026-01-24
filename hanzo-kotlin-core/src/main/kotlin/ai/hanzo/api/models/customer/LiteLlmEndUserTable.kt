// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.customer

import ai.hanzo.api.core.Enum
import ai.hanzo.api.core.ExcludeMissing
import ai.hanzo.api.core.JsonField
import ai.hanzo.api.core.JsonMissing
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.checkRequired
import ai.hanzo.api.errors.HanzoInvalidDataException
import ai.hanzo.api.models.organization.BudgetTable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class LiteLlmEndUserTable
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val blocked: JsonField<Boolean>,
    private val userId: JsonField<String>,
    private val alias: JsonField<String>,
    private val allowedModelRegion: JsonField<AllowedModelRegion>,
    private val defaultModel: JsonField<String>,
    private val litellmBudgetTable: JsonField<BudgetTable>,
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
        @JsonProperty("litellm_budget_table")
        @ExcludeMissing
        litellmBudgetTable: JsonField<BudgetTable> = JsonMissing.of(),
        @JsonProperty("spend") @ExcludeMissing spend: JsonField<Double> = JsonMissing.of(),
    ) : this(
        blocked,
        userId,
        alias,
        allowedModelRegion,
        defaultModel,
        litellmBudgetTable,
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
     * Represents user-controllable params for a LiteLLM_BudgetTable record
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun litellmBudgetTable(): BudgetTable? = litellmBudgetTable.getNullable("litellm_budget_table")

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
     * Returns the raw JSON value of [litellmBudgetTable].
     *
     * Unlike [litellmBudgetTable], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("litellm_budget_table")
    @ExcludeMissing
    fun _litellmBudgetTable(): JsonField<BudgetTable> = litellmBudgetTable

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
         * Returns a mutable builder for constructing an instance of [LiteLlmEndUserTable].
         *
         * The following fields are required:
         * ```kotlin
         * .blocked()
         * .userId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LiteLlmEndUserTable]. */
    class Builder internal constructor() {

        private var blocked: JsonField<Boolean>? = null
        private var userId: JsonField<String>? = null
        private var alias: JsonField<String> = JsonMissing.of()
        private var allowedModelRegion: JsonField<AllowedModelRegion> = JsonMissing.of()
        private var defaultModel: JsonField<String> = JsonMissing.of()
        private var litellmBudgetTable: JsonField<BudgetTable> = JsonMissing.of()
        private var spend: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(liteLlmEndUserTable: LiteLlmEndUserTable) = apply {
            blocked = liteLlmEndUserTable.blocked
            userId = liteLlmEndUserTable.userId
            alias = liteLlmEndUserTable.alias
            allowedModelRegion = liteLlmEndUserTable.allowedModelRegion
            defaultModel = liteLlmEndUserTable.defaultModel
            litellmBudgetTable = liteLlmEndUserTable.litellmBudgetTable
            spend = liteLlmEndUserTable.spend
            additionalProperties = liteLlmEndUserTable.additionalProperties.toMutableMap()
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

        /** Represents user-controllable params for a LiteLLM_BudgetTable record */
        fun litellmBudgetTable(litellmBudgetTable: BudgetTable?) =
            litellmBudgetTable(JsonField.ofNullable(litellmBudgetTable))

        /**
         * Sets [Builder.litellmBudgetTable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.litellmBudgetTable] with a well-typed [BudgetTable]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun litellmBudgetTable(litellmBudgetTable: JsonField<BudgetTable>) = apply {
            this.litellmBudgetTable = litellmBudgetTable
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
         * Returns an immutable instance of [LiteLlmEndUserTable].
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
        fun build(): LiteLlmEndUserTable =
            LiteLlmEndUserTable(
                checkRequired("blocked", blocked),
                checkRequired("userId", userId),
                alias,
                allowedModelRegion,
                defaultModel,
                litellmBudgetTable,
                spend,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LiteLlmEndUserTable = apply {
        if (validated) {
            return@apply
        }

        blocked()
        userId()
        alias()
        allowedModelRegion()?.validate()
        defaultModel()
        litellmBudgetTable()?.validate()
        spend()
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
        (if (blocked.asKnown() == null) 0 else 1) +
            (if (userId.asKnown() == null) 0 else 1) +
            (if (alias.asKnown() == null) 0 else 1) +
            (allowedModelRegion.asKnown()?.validity() ?: 0) +
            (if (defaultModel.asKnown() == null) 0 else 1) +
            (litellmBudgetTable.asKnown()?.validity() ?: 0) +
            (if (spend.asKnown() == null) 0 else 1)

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

            return other is AllowedModelRegion && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LiteLlmEndUserTable &&
            blocked == other.blocked &&
            userId == other.userId &&
            alias == other.alias &&
            allowedModelRegion == other.allowedModelRegion &&
            defaultModel == other.defaultModel &&
            litellmBudgetTable == other.litellmBudgetTable &&
            spend == other.spend &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            blocked,
            userId,
            alias,
            allowedModelRegion,
            defaultModel,
            litellmBudgetTable,
            spend,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LiteLlmEndUserTable{blocked=$blocked, userId=$userId, alias=$alias, allowedModelRegion=$allowedModelRegion, defaultModel=$defaultModel, litellmBudgetTable=$litellmBudgetTable, spend=$spend, additionalProperties=$additionalProperties}"
}
