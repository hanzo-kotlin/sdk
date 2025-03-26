// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.organization

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class OrganizationAddMemberResponse
private constructor(
    private val organizationId: JsonField<String>,
    private val updatedOrganizationMemberships: JsonField<List<UpdatedOrganizationMembership>>,
    private val updatedUsers: JsonField<List<UpdatedUser>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("organization_id")
        @ExcludeMissing
        organizationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_organization_memberships")
        @ExcludeMissing
        updatedOrganizationMemberships: JsonField<List<UpdatedOrganizationMembership>> =
            JsonMissing.of(),
        @JsonProperty("updated_users")
        @ExcludeMissing
        updatedUsers: JsonField<List<UpdatedUser>> = JsonMissing.of(),
    ) : this(organizationId, updatedOrganizationMemberships, updatedUsers, mutableMapOf())

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun organizationId(): String = organizationId.getRequired("organization_id")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedOrganizationMemberships(): List<UpdatedOrganizationMembership> =
        updatedOrganizationMemberships.getRequired("updated_organization_memberships")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedUsers(): List<UpdatedUser> = updatedUsers.getRequired("updated_users")

    /**
     * Returns the raw JSON value of [organizationId].
     *
     * Unlike [organizationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("organization_id")
    @ExcludeMissing
    fun _organizationId(): JsonField<String> = organizationId

    /**
     * Returns the raw JSON value of [updatedOrganizationMemberships].
     *
     * Unlike [updatedOrganizationMemberships], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("updated_organization_memberships")
    @ExcludeMissing
    fun _updatedOrganizationMemberships(): JsonField<List<UpdatedOrganizationMembership>> =
        updatedOrganizationMemberships

    /**
     * Returns the raw JSON value of [updatedUsers].
     *
     * Unlike [updatedUsers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_users")
    @ExcludeMissing
    fun _updatedUsers(): JsonField<List<UpdatedUser>> = updatedUsers

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
         * Returns a mutable builder for constructing an instance of
         * [OrganizationAddMemberResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .organizationId()
         * .updatedOrganizationMemberships()
         * .updatedUsers()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [OrganizationAddMemberResponse]. */
    class Builder internal constructor() {

        private var organizationId: JsonField<String>? = null
        private var updatedOrganizationMemberships:
            JsonField<MutableList<UpdatedOrganizationMembership>>? =
            null
        private var updatedUsers: JsonField<MutableList<UpdatedUser>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(organizationAddMemberResponse: OrganizationAddMemberResponse) = apply {
            organizationId = organizationAddMemberResponse.organizationId
            updatedOrganizationMemberships =
                organizationAddMemberResponse.updatedOrganizationMemberships.map {
                    it.toMutableList()
                }
            updatedUsers = organizationAddMemberResponse.updatedUsers.map { it.toMutableList() }
            additionalProperties = organizationAddMemberResponse.additionalProperties.toMutableMap()
        }

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

        fun updatedOrganizationMemberships(
            updatedOrganizationMemberships: List<UpdatedOrganizationMembership>
        ) = updatedOrganizationMemberships(JsonField.of(updatedOrganizationMemberships))

        /**
         * Sets [Builder.updatedOrganizationMemberships] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedOrganizationMemberships] with a well-typed
         * `List<UpdatedOrganizationMembership>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun updatedOrganizationMemberships(
            updatedOrganizationMemberships: JsonField<List<UpdatedOrganizationMembership>>
        ) = apply {
            this.updatedOrganizationMemberships =
                updatedOrganizationMemberships.map { it.toMutableList() }
        }

        /**
         * Adds a single [UpdatedOrganizationMembership] to [updatedOrganizationMemberships].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUpdatedOrganizationMembership(
            updatedOrganizationMembership: UpdatedOrganizationMembership
        ) = apply {
            updatedOrganizationMemberships =
                (updatedOrganizationMemberships ?: JsonField.of(mutableListOf())).also {
                    checkKnown("updatedOrganizationMemberships", it)
                        .add(updatedOrganizationMembership)
                }
        }

        fun updatedUsers(updatedUsers: List<UpdatedUser>) = updatedUsers(JsonField.of(updatedUsers))

        /**
         * Sets [Builder.updatedUsers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedUsers] with a well-typed `List<UpdatedUser>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun updatedUsers(updatedUsers: JsonField<List<UpdatedUser>>) = apply {
            this.updatedUsers = updatedUsers.map { it.toMutableList() }
        }

        /**
         * Adds a single [UpdatedUser] to [updatedUsers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUpdatedUser(updatedUser: UpdatedUser) = apply {
            updatedUsers =
                (updatedUsers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("updatedUsers", it).add(updatedUser)
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
         * Returns an immutable instance of [OrganizationAddMemberResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .organizationId()
         * .updatedOrganizationMemberships()
         * .updatedUsers()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OrganizationAddMemberResponse =
            OrganizationAddMemberResponse(
                checkRequired("organizationId", organizationId),
                checkRequired("updatedOrganizationMemberships", updatedOrganizationMemberships)
                    .map { it.toImmutable() },
                checkRequired("updatedUsers", updatedUsers).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OrganizationAddMemberResponse = apply {
        if (validated) {
            return@apply
        }

        organizationId()
        updatedOrganizationMemberships().forEach { it.validate() }
        updatedUsers().forEach { it.validate() }
        validated = true
    }

    /**
     * This is the table that track what organizations a user belongs to and users spend within the
     * organization
     */
    class UpdatedOrganizationMembership
    private constructor(
        private val createdAt: JsonField<OffsetDateTime>,
        private val organizationId: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val userId: JsonField<String>,
        private val budgetId: JsonField<String>,
        private val llmBudgetTable: JsonField<LlmBudgetTable>,
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
            @JsonProperty("budget_id")
            @ExcludeMissing
            budgetId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("llm_budget_table")
            @ExcludeMissing
            llmBudgetTable: JsonField<LlmBudgetTable> = JsonMissing.of(),
            @JsonProperty("spend") @ExcludeMissing spend: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("user") @ExcludeMissing user: JsonValue = JsonMissing.of(),
            @JsonProperty("user_role")
            @ExcludeMissing
            userRole: JsonField<String> = JsonMissing.of(),
        ) : this(
            createdAt,
            organizationId,
            updatedAt,
            userId,
            budgetId,
            llmBudgetTable,
            spend,
            user,
            userRole,
            mutableMapOf(),
        )

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun organizationId(): String = organizationId.getRequired("organization_id")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun userId(): String = userId.getRequired("user_id")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun budgetId(): String? = budgetId.getNullable("budget_id")

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
         * Unlike [organizationId], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Returns the raw JSON value of [llmBudgetTable].
         *
         * Unlike [llmBudgetTable], this method doesn't throw if the JSON field has an unexpected
         * type.
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
             * Returns a mutable builder for constructing an instance of
             * [UpdatedOrganizationMembership].
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

        /** A builder for [UpdatedOrganizationMembership]. */
        class Builder internal constructor() {

            private var createdAt: JsonField<OffsetDateTime>? = null
            private var organizationId: JsonField<String>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var userId: JsonField<String>? = null
            private var budgetId: JsonField<String> = JsonMissing.of()
            private var llmBudgetTable: JsonField<LlmBudgetTable> = JsonMissing.of()
            private var spend: JsonField<Double> = JsonMissing.of()
            private var user: JsonValue = JsonMissing.of()
            private var userRole: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(updatedOrganizationMembership: UpdatedOrganizationMembership) =
                apply {
                    createdAt = updatedOrganizationMembership.createdAt
                    organizationId = updatedOrganizationMembership.organizationId
                    updatedAt = updatedOrganizationMembership.updatedAt
                    userId = updatedOrganizationMembership.userId
                    budgetId = updatedOrganizationMembership.budgetId
                    llmBudgetTable = updatedOrganizationMembership.llmBudgetTable
                    spend = updatedOrganizationMembership.spend
                    user = updatedOrganizationMembership.user
                    userRole = updatedOrganizationMembership.userRole
                    additionalProperties =
                        updatedOrganizationMembership.additionalProperties.toMutableMap()
                }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun organizationId(organizationId: String) =
                organizationId(JsonField.of(organizationId))

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
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
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

            fun budgetId(budgetId: String?) = budgetId(JsonField.ofNullable(budgetId))

            /**
             * Sets [Builder.budgetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.budgetId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun budgetId(budgetId: JsonField<String>) = apply { this.budgetId = budgetId }

            /** Represents user-controllable params for a LLM_BudgetTable record */
            fun llmBudgetTable(llmBudgetTable: LlmBudgetTable?) =
                llmBudgetTable(JsonField.ofNullable(llmBudgetTable))

            /**
             * Sets [Builder.llmBudgetTable] to an arbitrary JSON value.
             *
             * You should usually call [Builder.llmBudgetTable] with a well-typed [LlmBudgetTable]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun llmBudgetTable(llmBudgetTable: JsonField<LlmBudgetTable>) = apply {
                this.llmBudgetTable = llmBudgetTable
            }

            fun spend(spend: Double) = spend(JsonField.of(spend))

            /**
             * Sets [Builder.spend] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spend] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun spend(spend: JsonField<Double>) = apply { this.spend = spend }

            fun user(user: JsonValue) = apply { this.user = user }

            fun userRole(userRole: String?) = userRole(JsonField.ofNullable(userRole))

            /**
             * Sets [Builder.userRole] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userRole] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [UpdatedOrganizationMembership].
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
            fun build(): UpdatedOrganizationMembership =
                UpdatedOrganizationMembership(
                    checkRequired("createdAt", createdAt),
                    checkRequired("organizationId", organizationId),
                    checkRequired("updatedAt", updatedAt),
                    checkRequired("userId", userId),
                    budgetId,
                    llmBudgetTable,
                    spend,
                    user,
                    userRole,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UpdatedOrganizationMembership = apply {
            if (validated) {
                return@apply
            }

            createdAt()
            organizationId()
            updatedAt()
            userId()
            budgetId()
            llmBudgetTable()?.validate()
            spend()
            userRole()
            validated = true
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
                @JsonProperty("rpm_limit")
                @ExcludeMissing
                rpmLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("soft_budget")
                @ExcludeMissing
                softBudget: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("tpm_limit")
                @ExcludeMissing
                tpmLimit: JsonField<Long> = JsonMissing.of(),
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
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun budgetDuration(): String? = budgetDuration.getNullable("budget_duration")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun maxBudget(): Double? = maxBudget.getNullable("max_budget")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun maxParallelRequests(): Long? =
                maxParallelRequests.getNullable("max_parallel_requests")

            @JsonProperty("model_max_budget")
            @ExcludeMissing
            fun _modelMaxBudget(): JsonValue = modelMaxBudget

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun rpmLimit(): Long? = rpmLimit.getNullable("rpm_limit")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun softBudget(): Double? = softBudget.getNullable("soft_budget")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tpmLimit(): Long? = tpmLimit.getNullable("tpm_limit")

            /**
             * Returns the raw JSON value of [budgetDuration].
             *
             * Unlike [budgetDuration], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("budget_duration")
            @ExcludeMissing
            fun _budgetDuration(): JsonField<String> = budgetDuration

            /**
             * Returns the raw JSON value of [maxBudget].
             *
             * Unlike [maxBudget], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("max_budget")
            @ExcludeMissing
            fun _maxBudget(): JsonField<Double> = maxBudget

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
             * Unlike [rpmLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("rpm_limit") @ExcludeMissing fun _rpmLimit(): JsonField<Long> = rpmLimit

            /**
             * Returns the raw JSON value of [softBudget].
             *
             * Unlike [softBudget], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("soft_budget")
            @ExcludeMissing
            fun _softBudget(): JsonField<Double> = softBudget

            /**
             * Returns the raw JSON value of [tpmLimit].
             *
             * Unlike [tpmLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * You should usually call [Builder.maxBudget] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * You should usually call [Builder.maxParallelRequests] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * You should usually call [Builder.rpmLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun softBudget(softBudget: JsonField<Double>) = apply {
                    this.softBudget = softBudget
                }

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
                 * You should usually call [Builder.tpmLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tpmLimit(tpmLimit: JsonField<Long>) = apply { this.tpmLimit = tpmLimit }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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

            return /* spotless:off */ other is UpdatedOrganizationMembership && createdAt == other.createdAt && organizationId == other.organizationId && updatedAt == other.updatedAt && userId == other.userId && budgetId == other.budgetId && llmBudgetTable == other.llmBudgetTable && spend == other.spend && user == other.user && userRole == other.userRole && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(createdAt, organizationId, updatedAt, userId, budgetId, llmBudgetTable, spend, user, userRole, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UpdatedOrganizationMembership{createdAt=$createdAt, organizationId=$organizationId, updatedAt=$updatedAt, userId=$userId, budgetId=$budgetId, llmBudgetTable=$llmBudgetTable, spend=$spend, user=$user, userRole=$userRole, additionalProperties=$additionalProperties}"
    }

    class UpdatedUser
    private constructor(
        private val userId: JsonField<String>,
        private val budgetDuration: JsonField<String>,
        private val budgetResetAt: JsonField<OffsetDateTime>,
        private val maxBudget: JsonField<Double>,
        private val metadata: JsonValue,
        private val modelMaxBudget: JsonValue,
        private val modelSpend: JsonValue,
        private val models: JsonField<List<JsonValue>>,
        private val organizationMemberships: JsonField<List<OrganizationMembership>>,
        private val rpmLimit: JsonField<Long>,
        private val spend: JsonField<Double>,
        private val ssoUserId: JsonField<String>,
        private val teams: JsonField<List<String>>,
        private val tpmLimit: JsonField<Long>,
        private val userEmail: JsonField<String>,
        private val userRole: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("budget_duration")
            @ExcludeMissing
            budgetDuration: JsonField<String> = JsonMissing.of(),
            @JsonProperty("budget_reset_at")
            @ExcludeMissing
            budgetResetAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("max_budget")
            @ExcludeMissing
            maxBudget: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
            @JsonProperty("model_max_budget")
            @ExcludeMissing
            modelMaxBudget: JsonValue = JsonMissing.of(),
            @JsonProperty("model_spend") @ExcludeMissing modelSpend: JsonValue = JsonMissing.of(),
            @JsonProperty("models")
            @ExcludeMissing
            models: JsonField<List<JsonValue>> = JsonMissing.of(),
            @JsonProperty("organization_memberships")
            @ExcludeMissing
            organizationMemberships: JsonField<List<OrganizationMembership>> = JsonMissing.of(),
            @JsonProperty("rpm_limit") @ExcludeMissing rpmLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("spend") @ExcludeMissing spend: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("sso_user_id")
            @ExcludeMissing
            ssoUserId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("teams")
            @ExcludeMissing
            teams: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("tpm_limit") @ExcludeMissing tpmLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("user_email")
            @ExcludeMissing
            userEmail: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user_role")
            @ExcludeMissing
            userRole: JsonField<String> = JsonMissing.of(),
        ) : this(
            userId,
            budgetDuration,
            budgetResetAt,
            maxBudget,
            metadata,
            modelMaxBudget,
            modelSpend,
            models,
            organizationMemberships,
            rpmLimit,
            spend,
            ssoUserId,
            teams,
            tpmLimit,
            userEmail,
            userRole,
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
        fun budgetDuration(): String? = budgetDuration.getNullable("budget_duration")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun budgetResetAt(): OffsetDateTime? = budgetResetAt.getNullable("budget_reset_at")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxBudget(): Double? = maxBudget.getNullable("max_budget")

        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

        @JsonProperty("model_max_budget")
        @ExcludeMissing
        fun _modelMaxBudget(): JsonValue = modelMaxBudget

        @JsonProperty("model_spend") @ExcludeMissing fun _modelSpend(): JsonValue = modelSpend

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun models(): List<JsonValue>? = models.getNullable("models")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun organizationMemberships(): List<OrganizationMembership>? =
            organizationMemberships.getNullable("organization_memberships")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rpmLimit(): Long? = rpmLimit.getNullable("rpm_limit")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun spend(): Double? = spend.getNullable("spend")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ssoUserId(): String? = ssoUserId.getNullable("sso_user_id")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun teams(): List<String>? = teams.getNullable("teams")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tpmLimit(): Long? = tpmLimit.getNullable("tpm_limit")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userEmail(): String? = userEmail.getNullable("user_email")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userRole(): String? = userRole.getNullable("user_role")

        /**
         * Returns the raw JSON value of [userId].
         *
         * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

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
         * Returns the raw JSON value of [budgetResetAt].
         *
         * Unlike [budgetResetAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("budget_reset_at")
        @ExcludeMissing
        fun _budgetResetAt(): JsonField<OffsetDateTime> = budgetResetAt

        /**
         * Returns the raw JSON value of [maxBudget].
         *
         * Unlike [maxBudget], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_budget") @ExcludeMissing fun _maxBudget(): JsonField<Double> = maxBudget

        /**
         * Returns the raw JSON value of [models].
         *
         * Unlike [models], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("models") @ExcludeMissing fun _models(): JsonField<List<JsonValue>> = models

        /**
         * Returns the raw JSON value of [organizationMemberships].
         *
         * Unlike [organizationMemberships], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("organization_memberships")
        @ExcludeMissing
        fun _organizationMemberships(): JsonField<List<OrganizationMembership>> =
            organizationMemberships

        /**
         * Returns the raw JSON value of [rpmLimit].
         *
         * Unlike [rpmLimit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rpm_limit") @ExcludeMissing fun _rpmLimit(): JsonField<Long> = rpmLimit

        /**
         * Returns the raw JSON value of [spend].
         *
         * Unlike [spend], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("spend") @ExcludeMissing fun _spend(): JsonField<Double> = spend

        /**
         * Returns the raw JSON value of [ssoUserId].
         *
         * Unlike [ssoUserId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sso_user_id") @ExcludeMissing fun _ssoUserId(): JsonField<String> = ssoUserId

        /**
         * Returns the raw JSON value of [teams].
         *
         * Unlike [teams], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("teams") @ExcludeMissing fun _teams(): JsonField<List<String>> = teams

        /**
         * Returns the raw JSON value of [tpmLimit].
         *
         * Unlike [tpmLimit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tpm_limit") @ExcludeMissing fun _tpmLimit(): JsonField<Long> = tpmLimit

        /**
         * Returns the raw JSON value of [userEmail].
         *
         * Unlike [userEmail], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_email") @ExcludeMissing fun _userEmail(): JsonField<String> = userEmail

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
             * Returns a mutable builder for constructing an instance of [UpdatedUser].
             *
             * The following fields are required:
             * ```kotlin
             * .userId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [UpdatedUser]. */
        class Builder internal constructor() {

            private var userId: JsonField<String>? = null
            private var budgetDuration: JsonField<String> = JsonMissing.of()
            private var budgetResetAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var maxBudget: JsonField<Double> = JsonMissing.of()
            private var metadata: JsonValue = JsonMissing.of()
            private var modelMaxBudget: JsonValue = JsonMissing.of()
            private var modelSpend: JsonValue = JsonMissing.of()
            private var models: JsonField<MutableList<JsonValue>>? = null
            private var organizationMemberships: JsonField<MutableList<OrganizationMembership>>? =
                null
            private var rpmLimit: JsonField<Long> = JsonMissing.of()
            private var spend: JsonField<Double> = JsonMissing.of()
            private var ssoUserId: JsonField<String> = JsonMissing.of()
            private var teams: JsonField<MutableList<String>>? = null
            private var tpmLimit: JsonField<Long> = JsonMissing.of()
            private var userEmail: JsonField<String> = JsonMissing.of()
            private var userRole: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(updatedUser: UpdatedUser) = apply {
                userId = updatedUser.userId
                budgetDuration = updatedUser.budgetDuration
                budgetResetAt = updatedUser.budgetResetAt
                maxBudget = updatedUser.maxBudget
                metadata = updatedUser.metadata
                modelMaxBudget = updatedUser.modelMaxBudget
                modelSpend = updatedUser.modelSpend
                models = updatedUser.models.map { it.toMutableList() }
                organizationMemberships =
                    updatedUser.organizationMemberships.map { it.toMutableList() }
                rpmLimit = updatedUser.rpmLimit
                spend = updatedUser.spend
                ssoUserId = updatedUser.ssoUserId
                teams = updatedUser.teams.map { it.toMutableList() }
                tpmLimit = updatedUser.tpmLimit
                userEmail = updatedUser.userEmail
                userRole = updatedUser.userRole
                additionalProperties = updatedUser.additionalProperties.toMutableMap()
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

            fun budgetResetAt(budgetResetAt: OffsetDateTime?) =
                budgetResetAt(JsonField.ofNullable(budgetResetAt))

            /**
             * Sets [Builder.budgetResetAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.budgetResetAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun budgetResetAt(budgetResetAt: JsonField<OffsetDateTime>) = apply {
                this.budgetResetAt = budgetResetAt
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

            fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

            fun modelMaxBudget(modelMaxBudget: JsonValue) = apply {
                this.modelMaxBudget = modelMaxBudget
            }

            fun modelSpend(modelSpend: JsonValue) = apply { this.modelSpend = modelSpend }

            fun models(models: List<JsonValue>) = models(JsonField.of(models))

            /**
             * Sets [Builder.models] to an arbitrary JSON value.
             *
             * You should usually call [Builder.models] with a well-typed `List<JsonValue>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun models(models: JsonField<List<JsonValue>>) = apply {
                this.models = models.map { it.toMutableList() }
            }

            /**
             * Adds a single [JsonValue] to [models].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addModel(model: JsonValue) = apply {
                models =
                    (models ?: JsonField.of(mutableListOf())).also {
                        checkKnown("models", it).add(model)
                    }
            }

            fun organizationMemberships(organizationMemberships: List<OrganizationMembership>?) =
                organizationMemberships(JsonField.ofNullable(organizationMemberships))

            /**
             * Sets [Builder.organizationMemberships] to an arbitrary JSON value.
             *
             * You should usually call [Builder.organizationMemberships] with a well-typed
             * `List<OrganizationMembership>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun organizationMemberships(
                organizationMemberships: JsonField<List<OrganizationMembership>>
            ) = apply {
                this.organizationMemberships = organizationMemberships.map { it.toMutableList() }
            }

            /**
             * Adds a single [OrganizationMembership] to [organizationMemberships].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOrganizationMembership(organizationMembership: OrganizationMembership) = apply {
                organizationMemberships =
                    (organizationMemberships ?: JsonField.of(mutableListOf())).also {
                        checkKnown("organizationMemberships", it).add(organizationMembership)
                    }
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

            fun spend(spend: Double) = spend(JsonField.of(spend))

            /**
             * Sets [Builder.spend] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spend] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun spend(spend: JsonField<Double>) = apply { this.spend = spend }

            fun ssoUserId(ssoUserId: String?) = ssoUserId(JsonField.ofNullable(ssoUserId))

            /**
             * Sets [Builder.ssoUserId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ssoUserId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ssoUserId(ssoUserId: JsonField<String>) = apply { this.ssoUserId = ssoUserId }

            fun teams(teams: List<String>) = teams(JsonField.of(teams))

            /**
             * Sets [Builder.teams] to an arbitrary JSON value.
             *
             * You should usually call [Builder.teams] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun teams(teams: JsonField<List<String>>) = apply {
                this.teams = teams.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [teams].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTeam(team: String) = apply {
                teams =
                    (teams ?: JsonField.of(mutableListOf())).also {
                        checkKnown("teams", it).add(team)
                    }
            }

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

            fun userEmail(userEmail: String?) = userEmail(JsonField.ofNullable(userEmail))

            /**
             * Sets [Builder.userEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userEmail] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userEmail(userEmail: JsonField<String>) = apply { this.userEmail = userEmail }

            fun userRole(userRole: String?) = userRole(JsonField.ofNullable(userRole))

            /**
             * Sets [Builder.userRole] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userRole] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [UpdatedUser].
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
            fun build(): UpdatedUser =
                UpdatedUser(
                    checkRequired("userId", userId),
                    budgetDuration,
                    budgetResetAt,
                    maxBudget,
                    metadata,
                    modelMaxBudget,
                    modelSpend,
                    (models ?: JsonMissing.of()).map { it.toImmutable() },
                    (organizationMemberships ?: JsonMissing.of()).map { it.toImmutable() },
                    rpmLimit,
                    spend,
                    ssoUserId,
                    (teams ?: JsonMissing.of()).map { it.toImmutable() },
                    tpmLimit,
                    userEmail,
                    userRole,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UpdatedUser = apply {
            if (validated) {
                return@apply
            }

            userId()
            budgetDuration()
            budgetResetAt()
            maxBudget()
            models()
            organizationMemberships()?.forEach { it.validate() }
            rpmLimit()
            spend()
            ssoUserId()
            teams()
            tpmLimit()
            userEmail()
            userRole()
            validated = true
        }

        /**
         * This is the table that track what organizations a user belongs to and users spend within
         * the organization
         */
        class OrganizationMembership
        private constructor(
            private val createdAt: JsonField<OffsetDateTime>,
            private val organizationId: JsonField<String>,
            private val updatedAt: JsonField<OffsetDateTime>,
            private val userId: JsonField<String>,
            private val budgetId: JsonField<String>,
            private val llmBudgetTable: JsonField<LlmBudgetTable>,
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
                @JsonProperty("user_id")
                @ExcludeMissing
                userId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("budget_id")
                @ExcludeMissing
                budgetId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("llm_budget_table")
                @ExcludeMissing
                llmBudgetTable: JsonField<LlmBudgetTable> = JsonMissing.of(),
                @JsonProperty("spend") @ExcludeMissing spend: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("user") @ExcludeMissing user: JsonValue = JsonMissing.of(),
                @JsonProperty("user_role")
                @ExcludeMissing
                userRole: JsonField<String> = JsonMissing.of(),
            ) : this(
                createdAt,
                organizationId,
                updatedAt,
                userId,
                budgetId,
                llmBudgetTable,
                spend,
                user,
                userRole,
                mutableMapOf(),
            )

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun organizationId(): String = organizationId.getRequired("organization_id")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun userId(): String = userId.getRequired("user_id")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun budgetId(): String? = budgetId.getNullable("budget_id")

            /**
             * Represents user-controllable params for a LLM_BudgetTable record
             *
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun llmBudgetTable(): LlmBudgetTable? = llmBudgetTable.getNullable("llm_budget_table")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun spend(): Double? = spend.getNullable("spend")

            @JsonProperty("user") @ExcludeMissing fun _user(): JsonValue = user

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userRole(): String? = userRole.getNullable("user_role")

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [organizationId].
             *
             * Unlike [organizationId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("organization_id")
            @ExcludeMissing
            fun _organizationId(): JsonField<String> = organizationId

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Unlike [budgetId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("budget_id") @ExcludeMissing fun _budgetId(): JsonField<String> = budgetId

            /**
             * Returns the raw JSON value of [llmBudgetTable].
             *
             * Unlike [llmBudgetTable], this method doesn't throw if the JSON field has an
             * unexpected type.
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

            /**
             * Returns the raw JSON value of [userRole].
             *
             * Unlike [userRole], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * Returns a mutable builder for constructing an instance of
                 * [OrganizationMembership].
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

            /** A builder for [OrganizationMembership]. */
            class Builder internal constructor() {

                private var createdAt: JsonField<OffsetDateTime>? = null
                private var organizationId: JsonField<String>? = null
                private var updatedAt: JsonField<OffsetDateTime>? = null
                private var userId: JsonField<String>? = null
                private var budgetId: JsonField<String> = JsonMissing.of()
                private var llmBudgetTable: JsonField<LlmBudgetTable> = JsonMissing.of()
                private var spend: JsonField<Double> = JsonMissing.of()
                private var user: JsonValue = JsonMissing.of()
                private var userRole: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(organizationMembership: OrganizationMembership) = apply {
                    createdAt = organizationMembership.createdAt
                    organizationId = organizationMembership.organizationId
                    updatedAt = organizationMembership.updatedAt
                    userId = organizationMembership.userId
                    budgetId = organizationMembership.budgetId
                    llmBudgetTable = organizationMembership.llmBudgetTable
                    spend = organizationMembership.spend
                    user = organizationMembership.user
                    userRole = organizationMembership.userRole
                    additionalProperties =
                        organizationMembership.additionalProperties.toMutableMap()
                }

                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                fun organizationId(organizationId: String) =
                    organizationId(JsonField.of(organizationId))

                /**
                 * Sets [Builder.organizationId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.organizationId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun organizationId(organizationId: JsonField<String>) = apply {
                    this.organizationId = organizationId
                }

                fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                    this.updatedAt = updatedAt
                }

                fun userId(userId: String) = userId(JsonField.of(userId))

                /**
                 * Sets [Builder.userId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userId(userId: JsonField<String>) = apply { this.userId = userId }

                fun budgetId(budgetId: String?) = budgetId(JsonField.ofNullable(budgetId))

                /**
                 * Sets [Builder.budgetId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.budgetId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun budgetId(budgetId: JsonField<String>) = apply { this.budgetId = budgetId }

                /** Represents user-controllable params for a LLM_BudgetTable record */
                fun llmBudgetTable(llmBudgetTable: LlmBudgetTable?) =
                    llmBudgetTable(JsonField.ofNullable(llmBudgetTable))

                /**
                 * Sets [Builder.llmBudgetTable] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.llmBudgetTable] with a well-typed
                 * [LlmBudgetTable] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun llmBudgetTable(llmBudgetTable: JsonField<LlmBudgetTable>) = apply {
                    this.llmBudgetTable = llmBudgetTable
                }

                fun spend(spend: Double) = spend(JsonField.of(spend))

                /**
                 * Sets [Builder.spend] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.spend] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun spend(spend: JsonField<Double>) = apply { this.spend = spend }

                fun user(user: JsonValue) = apply { this.user = user }

                fun userRole(userRole: String?) = userRole(JsonField.ofNullable(userRole))

                /**
                 * Sets [Builder.userRole] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userRole] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userRole(userRole: JsonField<String>) = apply { this.userRole = userRole }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [OrganizationMembership].
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
                fun build(): OrganizationMembership =
                    OrganizationMembership(
                        checkRequired("createdAt", createdAt),
                        checkRequired("organizationId", organizationId),
                        checkRequired("updatedAt", updatedAt),
                        checkRequired("userId", userId),
                        budgetId,
                        llmBudgetTable,
                        spend,
                        user,
                        userRole,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): OrganizationMembership = apply {
                if (validated) {
                    return@apply
                }

                createdAt()
                organizationId()
                updatedAt()
                userId()
                budgetId()
                llmBudgetTable()?.validate()
                spend()
                userRole()
                validated = true
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
                    @JsonProperty("rpm_limit")
                    @ExcludeMissing
                    rpmLimit: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("soft_budget")
                    @ExcludeMissing
                    softBudget: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("tpm_limit")
                    @ExcludeMissing
                    tpmLimit: JsonField<Long> = JsonMissing.of(),
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
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun budgetDuration(): String? = budgetDuration.getNullable("budget_duration")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun maxBudget(): Double? = maxBudget.getNullable("max_budget")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun maxParallelRequests(): Long? =
                    maxParallelRequests.getNullable("max_parallel_requests")

                @JsonProperty("model_max_budget")
                @ExcludeMissing
                fun _modelMaxBudget(): JsonValue = modelMaxBudget

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun rpmLimit(): Long? = rpmLimit.getNullable("rpm_limit")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun softBudget(): Double? = softBudget.getNullable("soft_budget")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun tpmLimit(): Long? = tpmLimit.getNullable("tpm_limit")

                /**
                 * Returns the raw JSON value of [budgetDuration].
                 *
                 * Unlike [budgetDuration], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("budget_duration")
                @ExcludeMissing
                fun _budgetDuration(): JsonField<String> = budgetDuration

                /**
                 * Returns the raw JSON value of [maxBudget].
                 *
                 * Unlike [maxBudget], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("max_budget")
                @ExcludeMissing
                fun _maxBudget(): JsonField<Double> = maxBudget

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
                 * Unlike [rpmLimit], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("rpm_limit")
                @ExcludeMissing
                fun _rpmLimit(): JsonField<Long> = rpmLimit

                /**
                 * Returns the raw JSON value of [softBudget].
                 *
                 * Unlike [softBudget], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("soft_budget")
                @ExcludeMissing
                fun _softBudget(): JsonField<Double> = softBudget

                /**
                 * Returns the raw JSON value of [tpmLimit].
                 *
                 * Unlike [tpmLimit], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("tpm_limit")
                @ExcludeMissing
                fun _tpmLimit(): JsonField<Long> = tpmLimit

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
                     * Returns a mutable builder for constructing an instance of [LlmBudgetTable].
                     */
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
                     * You should usually call [Builder.budgetDuration] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                     * You should usually call [Builder.maxBudget] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun maxBudget(maxBudget: JsonField<Double>) = apply {
                        this.maxBudget = maxBudget
                    }

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
                     * You should usually call [Builder.maxParallelRequests] with a well-typed
                     * [Long] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                     * You should usually call [Builder.rpmLimit] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun rpmLimit(rpmLimit: JsonField<Long>) = apply { this.rpmLimit = rpmLimit }

                    fun softBudget(softBudget: Double?) =
                        softBudget(JsonField.ofNullable(softBudget))

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
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun softBudget(softBudget: JsonField<Double>) = apply {
                        this.softBudget = softBudget
                    }

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
                     * You should usually call [Builder.tpmLimit] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun tpmLimit(tpmLimit: JsonField<Long>) = apply { this.tpmLimit = tpmLimit }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

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

                return /* spotless:off */ other is OrganizationMembership && createdAt == other.createdAt && organizationId == other.organizationId && updatedAt == other.updatedAt && userId == other.userId && budgetId == other.budgetId && llmBudgetTable == other.llmBudgetTable && spend == other.spend && user == other.user && userRole == other.userRole && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(createdAt, organizationId, updatedAt, userId, budgetId, llmBudgetTable, spend, user, userRole, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OrganizationMembership{createdAt=$createdAt, organizationId=$organizationId, updatedAt=$updatedAt, userId=$userId, budgetId=$budgetId, llmBudgetTable=$llmBudgetTable, spend=$spend, user=$user, userRole=$userRole, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UpdatedUser && userId == other.userId && budgetDuration == other.budgetDuration && budgetResetAt == other.budgetResetAt && maxBudget == other.maxBudget && metadata == other.metadata && modelMaxBudget == other.modelMaxBudget && modelSpend == other.modelSpend && models == other.models && organizationMemberships == other.organizationMemberships && rpmLimit == other.rpmLimit && spend == other.spend && ssoUserId == other.ssoUserId && teams == other.teams && tpmLimit == other.tpmLimit && userEmail == other.userEmail && userRole == other.userRole && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(userId, budgetDuration, budgetResetAt, maxBudget, metadata, modelMaxBudget, modelSpend, models, organizationMemberships, rpmLimit, spend, ssoUserId, teams, tpmLimit, userEmail, userRole, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UpdatedUser{userId=$userId, budgetDuration=$budgetDuration, budgetResetAt=$budgetResetAt, maxBudget=$maxBudget, metadata=$metadata, modelMaxBudget=$modelMaxBudget, modelSpend=$modelSpend, models=$models, organizationMemberships=$organizationMemberships, rpmLimit=$rpmLimit, spend=$spend, ssoUserId=$ssoUserId, teams=$teams, tpmLimit=$tpmLimit, userEmail=$userEmail, userRole=$userRole, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OrganizationAddMemberResponse && organizationId == other.organizationId && updatedOrganizationMemberships == other.updatedOrganizationMemberships && updatedUsers == other.updatedUsers && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(organizationId, updatedOrganizationMemberships, updatedUsers, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OrganizationAddMemberResponse{organizationId=$organizationId, updatedOrganizationMemberships=$updatedOrganizationMemberships, updatedUsers=$updatedUsers, additionalProperties=$additionalProperties}"
}
