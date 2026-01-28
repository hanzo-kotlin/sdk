// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.organization

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * This is the table that track what organizations a user belongs to and users spend within the
 * organization
 */
class OrganizationMembershipTable
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val createdAt: JsonField<OffsetDateTime>,
    private val organizationId: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val userId: JsonField<String>,
    private val budgetId: JsonField<String>,
    private val litellmBudgetTable: JsonField<BudgetTable>,
    private val spend: JsonField<Double>,
    private val user: JsonValue,
    private val userRole: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("organization_id")
        @ExcludeMissing
        organizationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("budget_id") @ExcludeMissing budgetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("litellm_budget_table")
        @ExcludeMissing
        litellmBudgetTable: JsonField<BudgetTable> = JsonMissing.of(),
        @JsonProperty("spend") @ExcludeMissing spend: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("user") @ExcludeMissing user: JsonValue = JsonMissing.of(),
        @JsonProperty("user_role") @ExcludeMissing userRole: JsonField<String> = JsonMissing.of(),
    ) : this(
        createdAt,
        organizationId,
        updatedAt,
        userId,
        budgetId,
        litellmBudgetTable,
        spend,
        user,
        userRole,
        mutableMapOf(),
    )

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun organizationId(): String = organizationId.getRequired("organization_id")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): String = userId.getRequired("user_id")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun budgetId(): String? = budgetId.getNullable("budget_id")

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
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = organizationMembershipTable.user().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("user") @ExcludeMissing fun _user(): JsonValue = user

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userRole(): String? = userRole.getNullable("user_role")

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [organizationId].
     *
     * Unlike [organizationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("organization_id")
    @ExcludeMissing
    fun _organizationId(): JsonField<String> = organizationId

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    /**
     * Returns the raw JSON value of [budgetId].
     *
     * Unlike [budgetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("budget_id") @ExcludeMissing fun _budgetId(): JsonField<String> = budgetId

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

    /**
     * Returns the raw JSON value of [userRole].
     *
     * Unlike [userRole], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_role") @ExcludeMissing fun _userRole(): JsonField<String> = userRole

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
         * Returns a mutable builder for constructing an instance of [OrganizationMembershipTable].
         *
         * The following fields are required:
         * ```kotlin
         * .createdAt()
         * .organizationId()
         * .updatedAt()
         * .userId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [OrganizationMembershipTable]. */
    class Builder internal constructor() {

        private var createdAt: JsonField<OffsetDateTime>? = null
        private var organizationId: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var userId: JsonField<String>? = null
        private var budgetId: JsonField<String> = JsonMissing.of()
        private var litellmBudgetTable: JsonField<BudgetTable> = JsonMissing.of()
        private var spend: JsonField<Double> = JsonMissing.of()
        private var user: JsonValue = JsonMissing.of()
        private var userRole: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(organizationMembershipTable: OrganizationMembershipTable) = apply {
            createdAt = organizationMembershipTable.createdAt
            organizationId = organizationMembershipTable.organizationId
            updatedAt = organizationMembershipTable.updatedAt
            userId = organizationMembershipTable.userId
            budgetId = organizationMembershipTable.budgetId
            litellmBudgetTable = organizationMembershipTable.litellmBudgetTable
            spend = organizationMembershipTable.spend
            user = organizationMembershipTable.user
            userRole = organizationMembershipTable.userRole
            additionalProperties = organizationMembershipTable.additionalProperties.toMutableMap()
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun organizationId(organizationId: String) = organizationId(JsonField.of(organizationId))

        /**
         * Sets [Builder.organizationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizationId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun organizationId(organizationId: JsonField<String>) = apply {
            this.organizationId = organizationId
        }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        fun budgetId(budgetId: String?) = budgetId(JsonField.ofNullable(budgetId))

        /**
         * Sets [Builder.budgetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.budgetId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun budgetId(budgetId: JsonField<String>) = apply { this.budgetId = budgetId }

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

        fun user(user: JsonValue) = apply { this.user = user }

        fun userRole(userRole: String?) = userRole(JsonField.ofNullable(userRole))

        /**
         * Sets [Builder.userRole] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userRole] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userRole(userRole: JsonField<String>) = apply { this.userRole = userRole }

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
         * Returns an immutable instance of [OrganizationMembershipTable].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .createdAt()
         * .organizationId()
         * .updatedAt()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OrganizationMembershipTable =
            OrganizationMembershipTable(
                checkRequired("createdAt", createdAt),
                checkRequired("organizationId", organizationId),
                checkRequired("updatedAt", updatedAt),
                checkRequired("userId", userId),
                budgetId,
                litellmBudgetTable,
                spend,
                user,
                userRole,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OrganizationMembershipTable = apply {
        if (validated) {
            return@apply
        }

        createdAt()
        organizationId()
        updatedAt()
        userId()
        budgetId()
        litellmBudgetTable()?.validate()
        spend()
        userRole()
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
        (if (createdAt.asKnown() == null) 0 else 1) +
            (if (organizationId.asKnown() == null) 0 else 1) +
            (if (updatedAt.asKnown() == null) 0 else 1) +
            (if (userId.asKnown() == null) 0 else 1) +
            (if (budgetId.asKnown() == null) 0 else 1) +
            (litellmBudgetTable.asKnown()?.validity() ?: 0) +
            (if (spend.asKnown() == null) 0 else 1) +
            (if (userRole.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OrganizationMembershipTable &&
            createdAt == other.createdAt &&
            organizationId == other.organizationId &&
            updatedAt == other.updatedAt &&
            userId == other.userId &&
            budgetId == other.budgetId &&
            litellmBudgetTable == other.litellmBudgetTable &&
            spend == other.spend &&
            user == other.user &&
            userRole == other.userRole &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            createdAt,
            organizationId,
            updatedAt,
            userId,
            budgetId,
            litellmBudgetTable,
            spend,
            user,
            userRole,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OrganizationMembershipTable{createdAt=$createdAt, organizationId=$organizationId, updatedAt=$updatedAt, userId=$userId, budgetId=$budgetId, litellmBudgetTable=$litellmBudgetTable, spend=$spend, user=$user, userRole=$userRole, additionalProperties=$additionalProperties}"
}
