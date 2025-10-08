// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team

import ai.hanzo.api.core.BaseDeserializer
import ai.hanzo.api.core.BaseSerializer
import ai.hanzo.api.core.ExcludeMissing
import ai.hanzo.api.core.JsonField
import ai.hanzo.api.core.JsonMissing
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.allMaxBy
import ai.hanzo.api.core.checkKnown
import ai.hanzo.api.core.checkRequired
import ai.hanzo.api.core.getOrThrow
import ai.hanzo.api.core.toImmutable
import ai.hanzo.api.errors.HanzoInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class TeamAddMemberResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val teamId: JsonField<String>,
    private val updatedTeamMemberships: JsonField<List<UpdatedTeamMembership>>,
    private val updatedUsers: JsonField<List<UpdatedUser>>,
    private val admins: JsonField<List<JsonValue>>,
    private val blocked: JsonField<Boolean>,
    private val budgetDuration: JsonField<String>,
    private val budgetResetAt: JsonField<OffsetDateTime>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val llmModelTable: JsonField<LlmModelTable>,
    private val maxBudget: JsonField<Double>,
    private val maxParallelRequests: JsonField<Long>,
    private val members: JsonField<List<JsonValue>>,
    private val membersWithRoles: JsonField<List<Member>>,
    private val metadata: JsonValue,
    private val modelId: JsonField<Long>,
    private val models: JsonField<List<JsonValue>>,
    private val organizationId: JsonField<String>,
    private val rpmLimit: JsonField<Long>,
    private val spend: JsonField<Double>,
    private val teamAlias: JsonField<String>,
    private val tpmLimit: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("team_id") @ExcludeMissing teamId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_team_memberships")
        @ExcludeMissing
        updatedTeamMemberships: JsonField<List<UpdatedTeamMembership>> = JsonMissing.of(),
        @JsonProperty("updated_users")
        @ExcludeMissing
        updatedUsers: JsonField<List<UpdatedUser>> = JsonMissing.of(),
        @JsonProperty("admins")
        @ExcludeMissing
        admins: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("blocked") @ExcludeMissing blocked: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("budget_duration")
        @ExcludeMissing
        budgetDuration: JsonField<String> = JsonMissing.of(),
        @JsonProperty("budget_reset_at")
        @ExcludeMissing
        budgetResetAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("llm_model_table")
        @ExcludeMissing
        llmModelTable: JsonField<LlmModelTable> = JsonMissing.of(),
        @JsonProperty("max_budget") @ExcludeMissing maxBudget: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("max_parallel_requests")
        @ExcludeMissing
        maxParallelRequests: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("members")
        @ExcludeMissing
        members: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("members_with_roles")
        @ExcludeMissing
        membersWithRoles: JsonField<List<Member>> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
        @JsonProperty("model_id") @ExcludeMissing modelId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("models")
        @ExcludeMissing
        models: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("organization_id")
        @ExcludeMissing
        organizationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rpm_limit") @ExcludeMissing rpmLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("spend") @ExcludeMissing spend: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("team_alias") @ExcludeMissing teamAlias: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tpm_limit") @ExcludeMissing tpmLimit: JsonField<Long> = JsonMissing.of(),
    ) : this(
        teamId,
        updatedTeamMemberships,
        updatedUsers,
        admins,
        blocked,
        budgetDuration,
        budgetResetAt,
        createdAt,
        llmModelTable,
        maxBudget,
        maxParallelRequests,
        members,
        membersWithRoles,
        metadata,
        modelId,
        models,
        organizationId,
        rpmLimit,
        spend,
        teamAlias,
        tpmLimit,
        mutableMapOf(),
    )

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun teamId(): String = teamId.getRequired("team_id")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedTeamMemberships(): List<UpdatedTeamMembership> =
        updatedTeamMemberships.getRequired("updated_team_memberships")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedUsers(): List<UpdatedUser> = updatedUsers.getRequired("updated_users")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun admins(): List<JsonValue>? = admins.getNullable("admins")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun blocked(): Boolean? = blocked.getNullable("blocked")

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
    fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun llmModelTable(): LlmModelTable? = llmModelTable.getNullable("llm_model_table")

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

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun members(): List<JsonValue>? = members.getNullable("members")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun membersWithRoles(): List<Member>? = membersWithRoles.getNullable("members_with_roles")

    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modelId(): Long? = modelId.getNullable("model_id")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun models(): List<JsonValue>? = models.getNullable("models")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun organizationId(): String? = organizationId.getNullable("organization_id")

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
    fun teamAlias(): String? = teamAlias.getNullable("team_alias")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tpmLimit(): Long? = tpmLimit.getNullable("tpm_limit")

    /**
     * Returns the raw JSON value of [teamId].
     *
     * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("team_id") @ExcludeMissing fun _teamId(): JsonField<String> = teamId

    /**
     * Returns the raw JSON value of [updatedTeamMemberships].
     *
     * Unlike [updatedTeamMemberships], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("updated_team_memberships")
    @ExcludeMissing
    fun _updatedTeamMemberships(): JsonField<List<UpdatedTeamMembership>> = updatedTeamMemberships

    /**
     * Returns the raw JSON value of [updatedUsers].
     *
     * Unlike [updatedUsers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_users")
    @ExcludeMissing
    fun _updatedUsers(): JsonField<List<UpdatedUser>> = updatedUsers

    /**
     * Returns the raw JSON value of [admins].
     *
     * Unlike [admins], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("admins") @ExcludeMissing fun _admins(): JsonField<List<JsonValue>> = admins

    /**
     * Returns the raw JSON value of [blocked].
     *
     * Unlike [blocked], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("blocked") @ExcludeMissing fun _blocked(): JsonField<Boolean> = blocked

    /**
     * Returns the raw JSON value of [budgetDuration].
     *
     * Unlike [budgetDuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("budget_duration")
    @ExcludeMissing
    fun _budgetDuration(): JsonField<String> = budgetDuration

    /**
     * Returns the raw JSON value of [budgetResetAt].
     *
     * Unlike [budgetResetAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("budget_reset_at")
    @ExcludeMissing
    fun _budgetResetAt(): JsonField<OffsetDateTime> = budgetResetAt

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [llmModelTable].
     *
     * Unlike [llmModelTable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("llm_model_table")
    @ExcludeMissing
    fun _llmModelTable(): JsonField<LlmModelTable> = llmModelTable

    /**
     * Returns the raw JSON value of [maxBudget].
     *
     * Unlike [maxBudget], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_budget") @ExcludeMissing fun _maxBudget(): JsonField<Double> = maxBudget

    /**
     * Returns the raw JSON value of [maxParallelRequests].
     *
     * Unlike [maxParallelRequests], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("max_parallel_requests")
    @ExcludeMissing
    fun _maxParallelRequests(): JsonField<Long> = maxParallelRequests

    /**
     * Returns the raw JSON value of [members].
     *
     * Unlike [members], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("members") @ExcludeMissing fun _members(): JsonField<List<JsonValue>> = members

    /**
     * Returns the raw JSON value of [membersWithRoles].
     *
     * Unlike [membersWithRoles], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("members_with_roles")
    @ExcludeMissing
    fun _membersWithRoles(): JsonField<List<Member>> = membersWithRoles

    /**
     * Returns the raw JSON value of [modelId].
     *
     * Unlike [modelId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model_id") @ExcludeMissing fun _modelId(): JsonField<Long> = modelId

    /**
     * Returns the raw JSON value of [models].
     *
     * Unlike [models], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("models") @ExcludeMissing fun _models(): JsonField<List<JsonValue>> = models

    /**
     * Returns the raw JSON value of [organizationId].
     *
     * Unlike [organizationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("organization_id")
    @ExcludeMissing
    fun _organizationId(): JsonField<String> = organizationId

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
     * Returns the raw JSON value of [teamAlias].
     *
     * Unlike [teamAlias], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("team_alias") @ExcludeMissing fun _teamAlias(): JsonField<String> = teamAlias

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

        /**
         * Returns a mutable builder for constructing an instance of [TeamAddMemberResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .teamId()
         * .updatedTeamMemberships()
         * .updatedUsers()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [TeamAddMemberResponse]. */
    class Builder internal constructor() {

        private var teamId: JsonField<String>? = null
        private var updatedTeamMemberships: JsonField<MutableList<UpdatedTeamMembership>>? = null
        private var updatedUsers: JsonField<MutableList<UpdatedUser>>? = null
        private var admins: JsonField<MutableList<JsonValue>>? = null
        private var blocked: JsonField<Boolean> = JsonMissing.of()
        private var budgetDuration: JsonField<String> = JsonMissing.of()
        private var budgetResetAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var llmModelTable: JsonField<LlmModelTable> = JsonMissing.of()
        private var maxBudget: JsonField<Double> = JsonMissing.of()
        private var maxParallelRequests: JsonField<Long> = JsonMissing.of()
        private var members: JsonField<MutableList<JsonValue>>? = null
        private var membersWithRoles: JsonField<MutableList<Member>>? = null
        private var metadata: JsonValue = JsonMissing.of()
        private var modelId: JsonField<Long> = JsonMissing.of()
        private var models: JsonField<MutableList<JsonValue>>? = null
        private var organizationId: JsonField<String> = JsonMissing.of()
        private var rpmLimit: JsonField<Long> = JsonMissing.of()
        private var spend: JsonField<Double> = JsonMissing.of()
        private var teamAlias: JsonField<String> = JsonMissing.of()
        private var tpmLimit: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(teamAddMemberResponse: TeamAddMemberResponse) = apply {
            teamId = teamAddMemberResponse.teamId
            updatedTeamMemberships =
                teamAddMemberResponse.updatedTeamMemberships.map { it.toMutableList() }
            updatedUsers = teamAddMemberResponse.updatedUsers.map { it.toMutableList() }
            admins = teamAddMemberResponse.admins.map { it.toMutableList() }
            blocked = teamAddMemberResponse.blocked
            budgetDuration = teamAddMemberResponse.budgetDuration
            budgetResetAt = teamAddMemberResponse.budgetResetAt
            createdAt = teamAddMemberResponse.createdAt
            llmModelTable = teamAddMemberResponse.llmModelTable
            maxBudget = teamAddMemberResponse.maxBudget
            maxParallelRequests = teamAddMemberResponse.maxParallelRequests
            members = teamAddMemberResponse.members.map { it.toMutableList() }
            membersWithRoles = teamAddMemberResponse.membersWithRoles.map { it.toMutableList() }
            metadata = teamAddMemberResponse.metadata
            modelId = teamAddMemberResponse.modelId
            models = teamAddMemberResponse.models.map { it.toMutableList() }
            organizationId = teamAddMemberResponse.organizationId
            rpmLimit = teamAddMemberResponse.rpmLimit
            spend = teamAddMemberResponse.spend
            teamAlias = teamAddMemberResponse.teamAlias
            tpmLimit = teamAddMemberResponse.tpmLimit
            additionalProperties = teamAddMemberResponse.additionalProperties.toMutableMap()
        }

        fun teamId(teamId: String) = teamId(JsonField.of(teamId))

        /**
         * Sets [Builder.teamId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teamId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun teamId(teamId: JsonField<String>) = apply { this.teamId = teamId }

        fun updatedTeamMemberships(updatedTeamMemberships: List<UpdatedTeamMembership>) =
            updatedTeamMemberships(JsonField.of(updatedTeamMemberships))

        /**
         * Sets [Builder.updatedTeamMemberships] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedTeamMemberships] with a well-typed
         * `List<UpdatedTeamMembership>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun updatedTeamMemberships(updatedTeamMemberships: JsonField<List<UpdatedTeamMembership>>) =
            apply {
                this.updatedTeamMemberships = updatedTeamMemberships.map { it.toMutableList() }
            }

        /**
         * Adds a single [UpdatedTeamMembership] to [updatedTeamMemberships].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUpdatedTeamMembership(updatedTeamMembership: UpdatedTeamMembership) = apply {
            updatedTeamMemberships =
                (updatedTeamMemberships ?: JsonField.of(mutableListOf())).also {
                    checkKnown("updatedTeamMemberships", it).add(updatedTeamMembership)
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

        fun admins(admins: List<JsonValue>) = admins(JsonField.of(admins))

        /**
         * Sets [Builder.admins] to an arbitrary JSON value.
         *
         * You should usually call [Builder.admins] with a well-typed `List<JsonValue>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun admins(admins: JsonField<List<JsonValue>>) = apply {
            this.admins = admins.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [admins].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAdmin(admin: JsonValue) = apply {
            admins =
                (admins ?: JsonField.of(mutableListOf())).also {
                    checkKnown("admins", it).add(admin)
                }
        }

        fun blocked(blocked: Boolean) = blocked(JsonField.of(blocked))

        /**
         * Sets [Builder.blocked] to an arbitrary JSON value.
         *
         * You should usually call [Builder.blocked] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun blocked(blocked: JsonField<Boolean>) = apply { this.blocked = blocked }

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
         * You should usually call [Builder.budgetResetAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun budgetResetAt(budgetResetAt: JsonField<OffsetDateTime>) = apply {
            this.budgetResetAt = budgetResetAt
        }

        fun createdAt(createdAt: OffsetDateTime?) = createdAt(JsonField.ofNullable(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun llmModelTable(llmModelTable: LlmModelTable?) =
            llmModelTable(JsonField.ofNullable(llmModelTable))

        /**
         * Sets [Builder.llmModelTable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.llmModelTable] with a well-typed [LlmModelTable] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun llmModelTable(llmModelTable: JsonField<LlmModelTable>) = apply {
            this.llmModelTable = llmModelTable
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
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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

        fun members(members: List<JsonValue>) = members(JsonField.of(members))

        /**
         * Sets [Builder.members] to an arbitrary JSON value.
         *
         * You should usually call [Builder.members] with a well-typed `List<JsonValue>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun members(members: JsonField<List<JsonValue>>) = apply {
            this.members = members.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [members].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMember(member: JsonValue) = apply {
            members =
                (members ?: JsonField.of(mutableListOf())).also {
                    checkKnown("members", it).add(member)
                }
        }

        fun membersWithRoles(membersWithRoles: List<Member>) =
            membersWithRoles(JsonField.of(membersWithRoles))

        /**
         * Sets [Builder.membersWithRoles] to an arbitrary JSON value.
         *
         * You should usually call [Builder.membersWithRoles] with a well-typed `List<Member>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun membersWithRoles(membersWithRoles: JsonField<List<Member>>) = apply {
            this.membersWithRoles = membersWithRoles.map { it.toMutableList() }
        }

        /**
         * Adds a single [Member] to [membersWithRoles].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMembersWithRole(membersWithRole: Member) = apply {
            membersWithRoles =
                (membersWithRoles ?: JsonField.of(mutableListOf())).also {
                    checkKnown("membersWithRoles", it).add(membersWithRole)
                }
        }

        fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

        fun modelId(modelId: Long?) = modelId(JsonField.ofNullable(modelId))

        /**
         * Alias for [Builder.modelId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun modelId(modelId: Long) = modelId(modelId as Long?)

        /**
         * Sets [Builder.modelId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun modelId(modelId: JsonField<Long>) = apply { this.modelId = modelId }

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

        fun organizationId(organizationId: String?) =
            organizationId(JsonField.ofNullable(organizationId))

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
         * You should usually call [Builder.rpmLimit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rpmLimit(rpmLimit: JsonField<Long>) = apply { this.rpmLimit = rpmLimit }

        fun spend(spend: Double?) = spend(JsonField.ofNullable(spend))

        /**
         * Alias for [Builder.spend].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun spend(spend: Double) = spend(spend as Double?)

        /**
         * Sets [Builder.spend] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spend] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun spend(spend: JsonField<Double>) = apply { this.spend = spend }

        fun teamAlias(teamAlias: String?) = teamAlias(JsonField.ofNullable(teamAlias))

        /**
         * Sets [Builder.teamAlias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teamAlias] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun teamAlias(teamAlias: JsonField<String>) = apply { this.teamAlias = teamAlias }

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
         * You should usually call [Builder.tpmLimit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Returns an immutable instance of [TeamAddMemberResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .teamId()
         * .updatedTeamMemberships()
         * .updatedUsers()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TeamAddMemberResponse =
            TeamAddMemberResponse(
                checkRequired("teamId", teamId),
                checkRequired("updatedTeamMemberships", updatedTeamMemberships).map {
                    it.toImmutable()
                },
                checkRequired("updatedUsers", updatedUsers).map { it.toImmutable() },
                (admins ?: JsonMissing.of()).map { it.toImmutable() },
                blocked,
                budgetDuration,
                budgetResetAt,
                createdAt,
                llmModelTable,
                maxBudget,
                maxParallelRequests,
                (members ?: JsonMissing.of()).map { it.toImmutable() },
                (membersWithRoles ?: JsonMissing.of()).map { it.toImmutable() },
                metadata,
                modelId,
                (models ?: JsonMissing.of()).map { it.toImmutable() },
                organizationId,
                rpmLimit,
                spend,
                teamAlias,
                tpmLimit,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TeamAddMemberResponse = apply {
        if (validated) {
            return@apply
        }

        teamId()
        updatedTeamMemberships().forEach { it.validate() }
        updatedUsers().forEach { it.validate() }
        admins()
        blocked()
        budgetDuration()
        budgetResetAt()
        createdAt()
        llmModelTable()?.validate()
        maxBudget()
        maxParallelRequests()
        members()
        membersWithRoles()?.forEach { it.validate() }
        modelId()
        models()
        organizationId()
        rpmLimit()
        spend()
        teamAlias()
        tpmLimit()
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
        (if (teamId.asKnown() == null) 0 else 1) +
            (updatedTeamMemberships.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (updatedUsers.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (admins.asKnown()?.size ?: 0) +
            (if (blocked.asKnown() == null) 0 else 1) +
            (if (budgetDuration.asKnown() == null) 0 else 1) +
            (if (budgetResetAt.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (llmModelTable.asKnown()?.validity() ?: 0) +
            (if (maxBudget.asKnown() == null) 0 else 1) +
            (if (maxParallelRequests.asKnown() == null) 0 else 1) +
            (members.asKnown()?.size ?: 0) +
            (membersWithRoles.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (modelId.asKnown() == null) 0 else 1) +
            (models.asKnown()?.size ?: 0) +
            (if (organizationId.asKnown() == null) 0 else 1) +
            (if (rpmLimit.asKnown() == null) 0 else 1) +
            (if (spend.asKnown() == null) 0 else 1) +
            (if (teamAlias.asKnown() == null) 0 else 1) +
            (if (tpmLimit.asKnown() == null) 0 else 1)

    class UpdatedTeamMembership
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val budgetId: JsonField<String>,
        private val llmBudgetTable: JsonField<LlmBudgetTable>,
        private val teamId: JsonField<String>,
        private val userId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("budget_id")
            @ExcludeMissing
            budgetId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("llm_budget_table")
            @ExcludeMissing
            llmBudgetTable: JsonField<LlmBudgetTable> = JsonMissing.of(),
            @JsonProperty("team_id") @ExcludeMissing teamId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        ) : this(budgetId, llmBudgetTable, teamId, userId, mutableMapOf())

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun budgetId(): String = budgetId.getRequired("budget_id")

        /**
         * Represents user-controllable params for a LLM_BudgetTable record
         *
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun llmBudgetTable(): LlmBudgetTable? = llmBudgetTable.getNullable("llm_budget_table")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun teamId(): String = teamId.getRequired("team_id")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun userId(): String = userId.getRequired("user_id")

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
         * Returns the raw JSON value of [teamId].
         *
         * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("team_id") @ExcludeMissing fun _teamId(): JsonField<String> = teamId

        /**
         * Returns the raw JSON value of [userId].
         *
         * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

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
             * Returns a mutable builder for constructing an instance of [UpdatedTeamMembership].
             *
             * The following fields are required:
             * ```kotlin
             * .budgetId()
             * .llmBudgetTable()
             * .teamId()
             * .userId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [UpdatedTeamMembership]. */
        class Builder internal constructor() {

            private var budgetId: JsonField<String>? = null
            private var llmBudgetTable: JsonField<LlmBudgetTable>? = null
            private var teamId: JsonField<String>? = null
            private var userId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(updatedTeamMembership: UpdatedTeamMembership) = apply {
                budgetId = updatedTeamMembership.budgetId
                llmBudgetTable = updatedTeamMembership.llmBudgetTable
                teamId = updatedTeamMembership.teamId
                userId = updatedTeamMembership.userId
                additionalProperties = updatedTeamMembership.additionalProperties.toMutableMap()
            }

            fun budgetId(budgetId: String) = budgetId(JsonField.of(budgetId))

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

            fun teamId(teamId: String) = teamId(JsonField.of(teamId))

            /**
             * Sets [Builder.teamId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.teamId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun teamId(teamId: JsonField<String>) = apply { this.teamId = teamId }

            fun userId(userId: String) = userId(JsonField.of(userId))

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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
             * Returns an immutable instance of [UpdatedTeamMembership].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .budgetId()
             * .llmBudgetTable()
             * .teamId()
             * .userId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UpdatedTeamMembership =
                UpdatedTeamMembership(
                    checkRequired("budgetId", budgetId),
                    checkRequired("llmBudgetTable", llmBudgetTable),
                    checkRequired("teamId", teamId),
                    checkRequired("userId", userId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UpdatedTeamMembership = apply {
            if (validated) {
                return@apply
            }

            budgetId()
            llmBudgetTable()?.validate()
            teamId()
            userId()
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
            (if (budgetId.asKnown() == null) 0 else 1) +
                (llmBudgetTable.asKnown()?.validity() ?: 0) +
                (if (teamId.asKnown() == null) 0 else 1) +
                (if (userId.asKnown() == null) 0 else 1)

        /** Represents user-controllable params for a LLM_BudgetTable record */
        class LlmBudgetTable
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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
                (if (budgetDuration.asKnown() == null) 0 else 1) +
                    (if (maxBudget.asKnown() == null) 0 else 1) +
                    (if (maxParallelRequests.asKnown() == null) 0 else 1) +
                    (if (rpmLimit.asKnown() == null) 0 else 1) +
                    (if (softBudget.asKnown() == null) 0 else 1) +
                    (if (tpmLimit.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LlmBudgetTable &&
                    budgetDuration == other.budgetDuration &&
                    maxBudget == other.maxBudget &&
                    maxParallelRequests == other.maxParallelRequests &&
                    modelMaxBudget == other.modelMaxBudget &&
                    rpmLimit == other.rpmLimit &&
                    softBudget == other.softBudget &&
                    tpmLimit == other.tpmLimit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    budgetDuration,
                    maxBudget,
                    maxParallelRequests,
                    modelMaxBudget,
                    rpmLimit,
                    softBudget,
                    tpmLimit,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LlmBudgetTable{budgetDuration=$budgetDuration, maxBudget=$maxBudget, maxParallelRequests=$maxParallelRequests, modelMaxBudget=$modelMaxBudget, rpmLimit=$rpmLimit, softBudget=$softBudget, tpmLimit=$tpmLimit, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UpdatedTeamMembership &&
                budgetId == other.budgetId &&
                llmBudgetTable == other.llmBudgetTable &&
                teamId == other.teamId &&
                userId == other.userId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(budgetId, llmBudgetTable, teamId, userId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UpdatedTeamMembership{budgetId=$budgetId, llmBudgetTable=$llmBudgetTable, teamId=$teamId, userId=$userId, additionalProperties=$additionalProperties}"
    }

    class UpdatedUser
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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
                (if (budgetDuration.asKnown() == null) 0 else 1) +
                (if (budgetResetAt.asKnown() == null) 0 else 1) +
                (if (maxBudget.asKnown() == null) 0 else 1) +
                (models.asKnown()?.size ?: 0) +
                (organizationMemberships.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (rpmLimit.asKnown() == null) 0 else 1) +
                (if (spend.asKnown() == null) 0 else 1) +
                (if (ssoUserId.asKnown() == null) 0 else 1) +
                (teams.asKnown()?.size ?: 0) +
                (if (tpmLimit.asKnown() == null) 0 else 1) +
                (if (userEmail.asKnown() == null) 0 else 1) +
                (if (userRole.asKnown() == null) 0 else 1)

        /**
         * This is the table that track what organizations a user belongs to and users spend within
         * the organization
         */
        class OrganizationMembership
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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
                (if (createdAt.asKnown() == null) 0 else 1) +
                    (if (organizationId.asKnown() == null) 0 else 1) +
                    (if (updatedAt.asKnown() == null) 0 else 1) +
                    (if (userId.asKnown() == null) 0 else 1) +
                    (if (budgetId.asKnown() == null) 0 else 1) +
                    (llmBudgetTable.asKnown()?.validity() ?: 0) +
                    (if (spend.asKnown() == null) 0 else 1) +
                    (if (userRole.asKnown() == null) 0 else 1)

            /** Represents user-controllable params for a LLM_BudgetTable record */
            class LlmBudgetTable
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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
                    (if (budgetDuration.asKnown() == null) 0 else 1) +
                        (if (maxBudget.asKnown() == null) 0 else 1) +
                        (if (maxParallelRequests.asKnown() == null) 0 else 1) +
                        (if (rpmLimit.asKnown() == null) 0 else 1) +
                        (if (softBudget.asKnown() == null) 0 else 1) +
                        (if (tpmLimit.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is LlmBudgetTable &&
                        budgetDuration == other.budgetDuration &&
                        maxBudget == other.maxBudget &&
                        maxParallelRequests == other.maxParallelRequests &&
                        modelMaxBudget == other.modelMaxBudget &&
                        rpmLimit == other.rpmLimit &&
                        softBudget == other.softBudget &&
                        tpmLimit == other.tpmLimit &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        budgetDuration,
                        maxBudget,
                        maxParallelRequests,
                        modelMaxBudget,
                        rpmLimit,
                        softBudget,
                        tpmLimit,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LlmBudgetTable{budgetDuration=$budgetDuration, maxBudget=$maxBudget, maxParallelRequests=$maxParallelRequests, modelMaxBudget=$modelMaxBudget, rpmLimit=$rpmLimit, softBudget=$softBudget, tpmLimit=$tpmLimit, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OrganizationMembership &&
                    createdAt == other.createdAt &&
                    organizationId == other.organizationId &&
                    updatedAt == other.updatedAt &&
                    userId == other.userId &&
                    budgetId == other.budgetId &&
                    llmBudgetTable == other.llmBudgetTable &&
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
                    llmBudgetTable,
                    spend,
                    user,
                    userRole,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OrganizationMembership{createdAt=$createdAt, organizationId=$organizationId, updatedAt=$updatedAt, userId=$userId, budgetId=$budgetId, llmBudgetTable=$llmBudgetTable, spend=$spend, user=$user, userRole=$userRole, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UpdatedUser &&
                userId == other.userId &&
                budgetDuration == other.budgetDuration &&
                budgetResetAt == other.budgetResetAt &&
                maxBudget == other.maxBudget &&
                metadata == other.metadata &&
                modelMaxBudget == other.modelMaxBudget &&
                modelSpend == other.modelSpend &&
                models == other.models &&
                organizationMemberships == other.organizationMemberships &&
                rpmLimit == other.rpmLimit &&
                spend == other.spend &&
                ssoUserId == other.ssoUserId &&
                teams == other.teams &&
                tpmLimit == other.tpmLimit &&
                userEmail == other.userEmail &&
                userRole == other.userRole &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
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
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UpdatedUser{userId=$userId, budgetDuration=$budgetDuration, budgetResetAt=$budgetResetAt, maxBudget=$maxBudget, metadata=$metadata, modelMaxBudget=$modelMaxBudget, modelSpend=$modelSpend, models=$models, organizationMemberships=$organizationMemberships, rpmLimit=$rpmLimit, spend=$spend, ssoUserId=$ssoUserId, teams=$teams, tpmLimit=$tpmLimit, userEmail=$userEmail, userRole=$userRole, additionalProperties=$additionalProperties}"
    }

    class LlmModelTable
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val createdBy: JsonField<String>,
        private val updatedBy: JsonField<String>,
        private val modelAliases: JsonField<ModelAliases>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("created_by")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_by")
            @ExcludeMissing
            updatedBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("model_aliases")
            @ExcludeMissing
            modelAliases: JsonField<ModelAliases> = JsonMissing.of(),
        ) : this(createdBy, updatedBy, modelAliases, mutableMapOf())

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdBy(): String = createdBy.getRequired("created_by")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedBy(): String = updatedBy.getRequired("updated_by")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun modelAliases(): ModelAliases? = modelAliases.getNullable("model_aliases")

        /**
         * Returns the raw JSON value of [createdBy].
         *
         * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_by") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

        /**
         * Returns the raw JSON value of [updatedBy].
         *
         * Unlike [updatedBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_by") @ExcludeMissing fun _updatedBy(): JsonField<String> = updatedBy

        /**
         * Returns the raw JSON value of [modelAliases].
         *
         * Unlike [modelAliases], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("model_aliases")
        @ExcludeMissing
        fun _modelAliases(): JsonField<ModelAliases> = modelAliases

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
             * Returns a mutable builder for constructing an instance of [LlmModelTable].
             *
             * The following fields are required:
             * ```kotlin
             * .createdBy()
             * .updatedBy()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [LlmModelTable]. */
        class Builder internal constructor() {

            private var createdBy: JsonField<String>? = null
            private var updatedBy: JsonField<String>? = null
            private var modelAliases: JsonField<ModelAliases> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(llmModelTable: LlmModelTable) = apply {
                createdBy = llmModelTable.createdBy
                updatedBy = llmModelTable.updatedBy
                modelAliases = llmModelTable.modelAliases
                additionalProperties = llmModelTable.additionalProperties.toMutableMap()
            }

            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /**
             * Sets [Builder.createdBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

            fun updatedBy(updatedBy: String) = updatedBy(JsonField.of(updatedBy))

            /**
             * Sets [Builder.updatedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedBy(updatedBy: JsonField<String>) = apply { this.updatedBy = updatedBy }

            fun modelAliases(modelAliases: ModelAliases?) =
                modelAliases(JsonField.ofNullable(modelAliases))

            /**
             * Sets [Builder.modelAliases] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelAliases] with a well-typed [ModelAliases] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelAliases(modelAliases: JsonField<ModelAliases>) = apply {
                this.modelAliases = modelAliases
            }

            /** Alias for calling [modelAliases] with `ModelAliases.ofJsonValue(jsonValue)`. */
            fun modelAliases(jsonValue: JsonValue) =
                modelAliases(ModelAliases.ofJsonValue(jsonValue))

            /** Alias for calling [modelAliases] with `ModelAliases.ofString(string)`. */
            fun modelAliases(string: String) = modelAliases(ModelAliases.ofString(string))

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
             * Returns an immutable instance of [LlmModelTable].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .createdBy()
             * .updatedBy()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): LlmModelTable =
                LlmModelTable(
                    checkRequired("createdBy", createdBy),
                    checkRequired("updatedBy", updatedBy),
                    modelAliases,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): LlmModelTable = apply {
            if (validated) {
                return@apply
            }

            createdBy()
            updatedBy()
            modelAliases()?.validate()
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
            (if (createdBy.asKnown() == null) 0 else 1) +
                (if (updatedBy.asKnown() == null) 0 else 1) +
                (modelAliases.asKnown()?.validity() ?: 0)

        @JsonDeserialize(using = ModelAliases.Deserializer::class)
        @JsonSerialize(using = ModelAliases.Serializer::class)
        class ModelAliases
        private constructor(
            private val jsonValue: JsonValue? = null,
            private val string: String? = null,
            private val _json: JsonValue? = null,
        ) {

            fun jsonValue(): JsonValue? = jsonValue

            fun string(): String? = string

            fun isJsonValue(): Boolean = jsonValue != null

            fun isString(): Boolean = string != null

            fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

            fun asString(): String = string.getOrThrow("string")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    jsonValue != null -> visitor.visitJsonValue(jsonValue)
                    string != null -> visitor.visitString(string)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): ModelAliases = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitJsonValue(jsonValue: JsonValue) {}

                        override fun visitString(string: String) {}
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitJsonValue(jsonValue: JsonValue) = 1

                        override fun visitString(string: String) = 1

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ModelAliases &&
                    jsonValue == other.jsonValue &&
                    string == other.string
            }

            override fun hashCode(): Int = Objects.hash(jsonValue, string)

            override fun toString(): String =
                when {
                    jsonValue != null -> "ModelAliases{jsonValue=$jsonValue}"
                    string != null -> "ModelAliases{string=$string}"
                    _json != null -> "ModelAliases{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid ModelAliases")
                }

            companion object {

                fun ofJsonValue(jsonValue: JsonValue) = ModelAliases(jsonValue = jsonValue)

                fun ofString(string: String) = ModelAliases(string = string)
            }

            /**
             * An interface that defines how to map each variant of [ModelAliases] to a value of
             * type [T].
             */
            interface Visitor<out T> {

                fun visitJsonValue(jsonValue: JsonValue): T

                fun visitString(string: String): T

                /**
                 * Maps an unknown variant of [ModelAliases] to a value of type [T].
                 *
                 * An instance of [ModelAliases] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws HanzoInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw HanzoInvalidDataException("Unknown ModelAliases: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<ModelAliases>(ModelAliases::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): ModelAliases {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    ModelAliases(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                                    ModelAliases(jsonValue = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants.
                        0 -> ModelAliases(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<ModelAliases>(ModelAliases::class) {

                override fun serialize(
                    value: ModelAliases,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.jsonValue != null -> generator.writeObject(value.jsonValue)
                        value.string != null -> generator.writeObject(value.string)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid ModelAliases")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LlmModelTable &&
                createdBy == other.createdBy &&
                updatedBy == other.updatedBy &&
                modelAliases == other.modelAliases &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(createdBy, updatedBy, modelAliases, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LlmModelTable{createdBy=$createdBy, updatedBy=$updatedBy, modelAliases=$modelAliases, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TeamAddMemberResponse &&
            teamId == other.teamId &&
            updatedTeamMemberships == other.updatedTeamMemberships &&
            updatedUsers == other.updatedUsers &&
            admins == other.admins &&
            blocked == other.blocked &&
            budgetDuration == other.budgetDuration &&
            budgetResetAt == other.budgetResetAt &&
            createdAt == other.createdAt &&
            llmModelTable == other.llmModelTable &&
            maxBudget == other.maxBudget &&
            maxParallelRequests == other.maxParallelRequests &&
            members == other.members &&
            membersWithRoles == other.membersWithRoles &&
            metadata == other.metadata &&
            modelId == other.modelId &&
            models == other.models &&
            organizationId == other.organizationId &&
            rpmLimit == other.rpmLimit &&
            spend == other.spend &&
            teamAlias == other.teamAlias &&
            tpmLimit == other.tpmLimit &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            teamId,
            updatedTeamMemberships,
            updatedUsers,
            admins,
            blocked,
            budgetDuration,
            budgetResetAt,
            createdAt,
            llmModelTable,
            maxBudget,
            maxParallelRequests,
            members,
            membersWithRoles,
            metadata,
            modelId,
            models,
            organizationId,
            rpmLimit,
            spend,
            teamAlias,
            tpmLimit,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TeamAddMemberResponse{teamId=$teamId, updatedTeamMemberships=$updatedTeamMemberships, updatedUsers=$updatedUsers, admins=$admins, blocked=$blocked, budgetDuration=$budgetDuration, budgetResetAt=$budgetResetAt, createdAt=$createdAt, llmModelTable=$llmModelTable, maxBudget=$maxBudget, maxParallelRequests=$maxParallelRequests, members=$members, membersWithRoles=$membersWithRoles, metadata=$metadata, modelId=$modelId, models=$models, organizationId=$organizationId, rpmLimit=$rpmLimit, spend=$spend, teamAlias=$teamAlias, tpmLimit=$tpmLimit, additionalProperties=$additionalProperties}"
}
