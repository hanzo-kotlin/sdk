// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team

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

class TeamCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val teamId: JsonField<String>,
    private val admins: JsonField<List<JsonValue>>,
    private val blocked: JsonField<Boolean>,
    private val budgetDuration: JsonField<String>,
    private val budgetResetAt: JsonField<OffsetDateTime>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val litellmModelTable: JsonValue,
    private val maxBudget: JsonField<Double>,
    private val maxParallelRequests: JsonField<Long>,
    private val members: JsonField<List<JsonValue>>,
    private val membersWithRoles: JsonField<List<Member>>,
    private val metadata: JsonField<Metadata>,
    private val modelId: JsonField<Long>,
    private val models: JsonField<List<JsonValue>>,
    private val objectPermission: JsonField<ObjectPermission>,
    private val objectPermissionId: JsonField<String>,
    private val organizationId: JsonField<String>,
    private val routerSettings: JsonField<RouterSettings>,
    private val rpmLimit: JsonField<Long>,
    private val spend: JsonField<Double>,
    private val teamAlias: JsonField<String>,
    private val teamMemberPermissions: JsonField<List<String>>,
    private val tpmLimit: JsonField<Long>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("team_id") @ExcludeMissing teamId: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("litellm_model_table")
        @ExcludeMissing
        litellmModelTable: JsonValue = JsonMissing.of(),
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
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("model_id") @ExcludeMissing modelId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("models")
        @ExcludeMissing
        models: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("object_permission")
        @ExcludeMissing
        objectPermission: JsonField<ObjectPermission> = JsonMissing.of(),
        @JsonProperty("object_permission_id")
        @ExcludeMissing
        objectPermissionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("organization_id")
        @ExcludeMissing
        organizationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("router_settings")
        @ExcludeMissing
        routerSettings: JsonField<RouterSettings> = JsonMissing.of(),
        @JsonProperty("rpm_limit") @ExcludeMissing rpmLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("spend") @ExcludeMissing spend: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("team_alias") @ExcludeMissing teamAlias: JsonField<String> = JsonMissing.of(),
        @JsonProperty("team_member_permissions")
        @ExcludeMissing
        teamMemberPermissions: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("tpm_limit") @ExcludeMissing tpmLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        teamId,
        admins,
        blocked,
        budgetDuration,
        budgetResetAt,
        createdAt,
        litellmModelTable,
        maxBudget,
        maxParallelRequests,
        members,
        membersWithRoles,
        metadata,
        modelId,
        models,
        objectPermission,
        objectPermissionId,
        organizationId,
        routerSettings,
        rpmLimit,
        spend,
        teamAlias,
        teamMemberPermissions,
        tpmLimit,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun teamId(): String = teamId.getRequired("team_id")

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
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = teamCreateResponse.litellmModelTable().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("litellm_model_table")
    @ExcludeMissing
    fun _litellmModelTable(): JsonValue = litellmModelTable

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

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Metadata? = metadata.getNullable("metadata")

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
     * Represents a LiteLLM_ObjectPermissionTable record
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectPermission(): ObjectPermission? = objectPermission.getNullable("object_permission")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectPermissionId(): String? = objectPermissionId.getNullable("object_permission_id")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun organizationId(): String? = organizationId.getNullable("organization_id")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun routerSettings(): RouterSettings? = routerSettings.getNullable("router_settings")

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
    fun teamMemberPermissions(): List<String>? =
        teamMemberPermissions.getNullable("team_member_permissions")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tpmLimit(): Long? = tpmLimit.getNullable("tpm_limit")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

    /**
     * Returns the raw JSON value of [teamId].
     *
     * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("team_id") @ExcludeMissing fun _teamId(): JsonField<String> = teamId

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
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

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
     * Returns the raw JSON value of [objectPermission].
     *
     * Unlike [objectPermission], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("object_permission")
    @ExcludeMissing
    fun _objectPermission(): JsonField<ObjectPermission> = objectPermission

    /**
     * Returns the raw JSON value of [objectPermissionId].
     *
     * Unlike [objectPermissionId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("object_permission_id")
    @ExcludeMissing
    fun _objectPermissionId(): JsonField<String> = objectPermissionId

    /**
     * Returns the raw JSON value of [organizationId].
     *
     * Unlike [organizationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("organization_id")
    @ExcludeMissing
    fun _organizationId(): JsonField<String> = organizationId

    /**
     * Returns the raw JSON value of [routerSettings].
     *
     * Unlike [routerSettings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("router_settings")
    @ExcludeMissing
    fun _routerSettings(): JsonField<RouterSettings> = routerSettings

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
     * Returns the raw JSON value of [teamMemberPermissions].
     *
     * Unlike [teamMemberPermissions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("team_member_permissions")
    @ExcludeMissing
    fun _teamMemberPermissions(): JsonField<List<String>> = teamMemberPermissions

    /**
     * Returns the raw JSON value of [tpmLimit].
     *
     * Unlike [tpmLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tpm_limit") @ExcludeMissing fun _tpmLimit(): JsonField<Long> = tpmLimit

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [TeamCreateResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .teamId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [TeamCreateResponse]. */
    class Builder internal constructor() {

        private var teamId: JsonField<String>? = null
        private var admins: JsonField<MutableList<JsonValue>>? = null
        private var blocked: JsonField<Boolean> = JsonMissing.of()
        private var budgetDuration: JsonField<String> = JsonMissing.of()
        private var budgetResetAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var litellmModelTable: JsonValue = JsonMissing.of()
        private var maxBudget: JsonField<Double> = JsonMissing.of()
        private var maxParallelRequests: JsonField<Long> = JsonMissing.of()
        private var members: JsonField<MutableList<JsonValue>>? = null
        private var membersWithRoles: JsonField<MutableList<Member>>? = null
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var modelId: JsonField<Long> = JsonMissing.of()
        private var models: JsonField<MutableList<JsonValue>>? = null
        private var objectPermission: JsonField<ObjectPermission> = JsonMissing.of()
        private var objectPermissionId: JsonField<String> = JsonMissing.of()
        private var organizationId: JsonField<String> = JsonMissing.of()
        private var routerSettings: JsonField<RouterSettings> = JsonMissing.of()
        private var rpmLimit: JsonField<Long> = JsonMissing.of()
        private var spend: JsonField<Double> = JsonMissing.of()
        private var teamAlias: JsonField<String> = JsonMissing.of()
        private var teamMemberPermissions: JsonField<MutableList<String>>? = null
        private var tpmLimit: JsonField<Long> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(teamCreateResponse: TeamCreateResponse) = apply {
            teamId = teamCreateResponse.teamId
            admins = teamCreateResponse.admins.map { it.toMutableList() }
            blocked = teamCreateResponse.blocked
            budgetDuration = teamCreateResponse.budgetDuration
            budgetResetAt = teamCreateResponse.budgetResetAt
            createdAt = teamCreateResponse.createdAt
            litellmModelTable = teamCreateResponse.litellmModelTable
            maxBudget = teamCreateResponse.maxBudget
            maxParallelRequests = teamCreateResponse.maxParallelRequests
            members = teamCreateResponse.members.map { it.toMutableList() }
            membersWithRoles = teamCreateResponse.membersWithRoles.map { it.toMutableList() }
            metadata = teamCreateResponse.metadata
            modelId = teamCreateResponse.modelId
            models = teamCreateResponse.models.map { it.toMutableList() }
            objectPermission = teamCreateResponse.objectPermission
            objectPermissionId = teamCreateResponse.objectPermissionId
            organizationId = teamCreateResponse.organizationId
            routerSettings = teamCreateResponse.routerSettings
            rpmLimit = teamCreateResponse.rpmLimit
            spend = teamCreateResponse.spend
            teamAlias = teamCreateResponse.teamAlias
            teamMemberPermissions =
                teamCreateResponse.teamMemberPermissions.map { it.toMutableList() }
            tpmLimit = teamCreateResponse.tpmLimit
            updatedAt = teamCreateResponse.updatedAt
            additionalProperties = teamCreateResponse.additionalProperties.toMutableMap()
        }

        fun teamId(teamId: String) = teamId(JsonField.of(teamId))

        /**
         * Sets [Builder.teamId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teamId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun teamId(teamId: JsonField<String>) = apply { this.teamId = teamId }

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

        fun litellmModelTable(litellmModelTable: JsonValue) = apply {
            this.litellmModelTable = litellmModelTable
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

        fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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

        /** Represents a LiteLLM_ObjectPermissionTable record */
        fun objectPermission(objectPermission: ObjectPermission?) =
            objectPermission(JsonField.ofNullable(objectPermission))

        /**
         * Sets [Builder.objectPermission] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectPermission] with a well-typed [ObjectPermission]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun objectPermission(objectPermission: JsonField<ObjectPermission>) = apply {
            this.objectPermission = objectPermission
        }

        fun objectPermissionId(objectPermissionId: String?) =
            objectPermissionId(JsonField.ofNullable(objectPermissionId))

        /**
         * Sets [Builder.objectPermissionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectPermissionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun objectPermissionId(objectPermissionId: JsonField<String>) = apply {
            this.objectPermissionId = objectPermissionId
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

        fun routerSettings(routerSettings: RouterSettings?) =
            routerSettings(JsonField.ofNullable(routerSettings))

        /**
         * Sets [Builder.routerSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routerSettings] with a well-typed [RouterSettings] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun routerSettings(routerSettings: JsonField<RouterSettings>) = apply {
            this.routerSettings = routerSettings
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

        fun teamMemberPermissions(teamMemberPermissions: List<String>?) =
            teamMemberPermissions(JsonField.ofNullable(teamMemberPermissions))

        /**
         * Sets [Builder.teamMemberPermissions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teamMemberPermissions] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun teamMemberPermissions(teamMemberPermissions: JsonField<List<String>>) = apply {
            this.teamMemberPermissions = teamMemberPermissions.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [teamMemberPermissions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTeamMemberPermission(teamMemberPermission: String) = apply {
            teamMemberPermissions =
                (teamMemberPermissions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("teamMemberPermissions", it).add(teamMemberPermission)
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
         * You should usually call [Builder.tpmLimit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tpmLimit(tpmLimit: JsonField<Long>) = apply { this.tpmLimit = tpmLimit }

        fun updatedAt(updatedAt: OffsetDateTime?) = updatedAt(JsonField.ofNullable(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [TeamCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .teamId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TeamCreateResponse =
            TeamCreateResponse(
                checkRequired("teamId", teamId),
                (admins ?: JsonMissing.of()).map { it.toImmutable() },
                blocked,
                budgetDuration,
                budgetResetAt,
                createdAt,
                litellmModelTable,
                maxBudget,
                maxParallelRequests,
                (members ?: JsonMissing.of()).map { it.toImmutable() },
                (membersWithRoles ?: JsonMissing.of()).map { it.toImmutable() },
                metadata,
                modelId,
                (models ?: JsonMissing.of()).map { it.toImmutable() },
                objectPermission,
                objectPermissionId,
                organizationId,
                routerSettings,
                rpmLimit,
                spend,
                teamAlias,
                (teamMemberPermissions ?: JsonMissing.of()).map { it.toImmutable() },
                tpmLimit,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TeamCreateResponse = apply {
        if (validated) {
            return@apply
        }

        teamId()
        admins()
        blocked()
        budgetDuration()
        budgetResetAt()
        createdAt()
        maxBudget()
        maxParallelRequests()
        members()
        membersWithRoles()?.forEach { it.validate() }
        metadata()?.validate()
        modelId()
        models()
        objectPermission()?.validate()
        objectPermissionId()
        organizationId()
        routerSettings()?.validate()
        rpmLimit()
        spend()
        teamAlias()
        teamMemberPermissions()
        tpmLimit()
        updatedAt()
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
            (admins.asKnown()?.size ?: 0) +
            (if (blocked.asKnown() == null) 0 else 1) +
            (if (budgetDuration.asKnown() == null) 0 else 1) +
            (if (budgetResetAt.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (maxBudget.asKnown() == null) 0 else 1) +
            (if (maxParallelRequests.asKnown() == null) 0 else 1) +
            (members.asKnown()?.size ?: 0) +
            (membersWithRoles.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (metadata.asKnown()?.validity() ?: 0) +
            (if (modelId.asKnown() == null) 0 else 1) +
            (models.asKnown()?.size ?: 0) +
            (objectPermission.asKnown()?.validity() ?: 0) +
            (if (objectPermissionId.asKnown() == null) 0 else 1) +
            (if (organizationId.asKnown() == null) 0 else 1) +
            (routerSettings.asKnown()?.validity() ?: 0) +
            (if (rpmLimit.asKnown() == null) 0 else 1) +
            (if (spend.asKnown() == null) 0 else 1) +
            (if (teamAlias.asKnown() == null) 0 else 1) +
            (teamMemberPermissions.asKnown()?.size ?: 0) +
            (if (tpmLimit.asKnown() == null) 0 else 1) +
            (if (updatedAt.asKnown() == null) 0 else 1)

    class Metadata
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

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
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

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    /** Represents a LiteLLM_ObjectPermissionTable record */
    class ObjectPermission
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val objectPermissionId: JsonField<String>,
        private val agentAccessGroups: JsonField<List<String>>,
        private val agents: JsonField<List<String>>,
        private val mcpAccessGroups: JsonField<List<String>>,
        private val mcpServers: JsonField<List<String>>,
        private val mcpToolPermissions: JsonField<McpToolPermissions>,
        private val vectorStores: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("object_permission_id")
            @ExcludeMissing
            objectPermissionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("agent_access_groups")
            @ExcludeMissing
            agentAccessGroups: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("agents")
            @ExcludeMissing
            agents: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("mcp_access_groups")
            @ExcludeMissing
            mcpAccessGroups: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("mcp_servers")
            @ExcludeMissing
            mcpServers: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("mcp_tool_permissions")
            @ExcludeMissing
            mcpToolPermissions: JsonField<McpToolPermissions> = JsonMissing.of(),
            @JsonProperty("vector_stores")
            @ExcludeMissing
            vectorStores: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            objectPermissionId,
            agentAccessGroups,
            agents,
            mcpAccessGroups,
            mcpServers,
            mcpToolPermissions,
            vectorStores,
            mutableMapOf(),
        )

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun objectPermissionId(): String = objectPermissionId.getRequired("object_permission_id")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun agentAccessGroups(): List<String>? =
            agentAccessGroups.getNullable("agent_access_groups")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun agents(): List<String>? = agents.getNullable("agents")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mcpAccessGroups(): List<String>? = mcpAccessGroups.getNullable("mcp_access_groups")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mcpServers(): List<String>? = mcpServers.getNullable("mcp_servers")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mcpToolPermissions(): McpToolPermissions? =
            mcpToolPermissions.getNullable("mcp_tool_permissions")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun vectorStores(): List<String>? = vectorStores.getNullable("vector_stores")

        /**
         * Returns the raw JSON value of [objectPermissionId].
         *
         * Unlike [objectPermissionId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("object_permission_id")
        @ExcludeMissing
        fun _objectPermissionId(): JsonField<String> = objectPermissionId

        /**
         * Returns the raw JSON value of [agentAccessGroups].
         *
         * Unlike [agentAccessGroups], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("agent_access_groups")
        @ExcludeMissing
        fun _agentAccessGroups(): JsonField<List<String>> = agentAccessGroups

        /**
         * Returns the raw JSON value of [agents].
         *
         * Unlike [agents], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agents") @ExcludeMissing fun _agents(): JsonField<List<String>> = agents

        /**
         * Returns the raw JSON value of [mcpAccessGroups].
         *
         * Unlike [mcpAccessGroups], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("mcp_access_groups")
        @ExcludeMissing
        fun _mcpAccessGroups(): JsonField<List<String>> = mcpAccessGroups

        /**
         * Returns the raw JSON value of [mcpServers].
         *
         * Unlike [mcpServers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mcp_servers")
        @ExcludeMissing
        fun _mcpServers(): JsonField<List<String>> = mcpServers

        /**
         * Returns the raw JSON value of [mcpToolPermissions].
         *
         * Unlike [mcpToolPermissions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("mcp_tool_permissions")
        @ExcludeMissing
        fun _mcpToolPermissions(): JsonField<McpToolPermissions> = mcpToolPermissions

        /**
         * Returns the raw JSON value of [vectorStores].
         *
         * Unlike [vectorStores], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("vector_stores")
        @ExcludeMissing
        fun _vectorStores(): JsonField<List<String>> = vectorStores

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
             * Returns a mutable builder for constructing an instance of [ObjectPermission].
             *
             * The following fields are required:
             * ```kotlin
             * .objectPermissionId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ObjectPermission]. */
        class Builder internal constructor() {

            private var objectPermissionId: JsonField<String>? = null
            private var agentAccessGroups: JsonField<MutableList<String>>? = null
            private var agents: JsonField<MutableList<String>>? = null
            private var mcpAccessGroups: JsonField<MutableList<String>>? = null
            private var mcpServers: JsonField<MutableList<String>>? = null
            private var mcpToolPermissions: JsonField<McpToolPermissions> = JsonMissing.of()
            private var vectorStores: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(objectPermission: ObjectPermission) = apply {
                objectPermissionId = objectPermission.objectPermissionId
                agentAccessGroups = objectPermission.agentAccessGroups.map { it.toMutableList() }
                agents = objectPermission.agents.map { it.toMutableList() }
                mcpAccessGroups = objectPermission.mcpAccessGroups.map { it.toMutableList() }
                mcpServers = objectPermission.mcpServers.map { it.toMutableList() }
                mcpToolPermissions = objectPermission.mcpToolPermissions
                vectorStores = objectPermission.vectorStores.map { it.toMutableList() }
                additionalProperties = objectPermission.additionalProperties.toMutableMap()
            }

            fun objectPermissionId(objectPermissionId: String) =
                objectPermissionId(JsonField.of(objectPermissionId))

            /**
             * Sets [Builder.objectPermissionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objectPermissionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objectPermissionId(objectPermissionId: JsonField<String>) = apply {
                this.objectPermissionId = objectPermissionId
            }

            fun agentAccessGroups(agentAccessGroups: List<String>?) =
                agentAccessGroups(JsonField.ofNullable(agentAccessGroups))

            /**
             * Sets [Builder.agentAccessGroups] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agentAccessGroups] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun agentAccessGroups(agentAccessGroups: JsonField<List<String>>) = apply {
                this.agentAccessGroups = agentAccessGroups.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [agentAccessGroups].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAgentAccessGroup(agentAccessGroup: String) = apply {
                agentAccessGroups =
                    (agentAccessGroups ?: JsonField.of(mutableListOf())).also {
                        checkKnown("agentAccessGroups", it).add(agentAccessGroup)
                    }
            }

            fun agents(agents: List<String>?) = agents(JsonField.ofNullable(agents))

            /**
             * Sets [Builder.agents] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agents] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun agents(agents: JsonField<List<String>>) = apply {
                this.agents = agents.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [agents].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAgent(agent: String) = apply {
                agents =
                    (agents ?: JsonField.of(mutableListOf())).also {
                        checkKnown("agents", it).add(agent)
                    }
            }

            fun mcpAccessGroups(mcpAccessGroups: List<String>?) =
                mcpAccessGroups(JsonField.ofNullable(mcpAccessGroups))

            /**
             * Sets [Builder.mcpAccessGroups] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mcpAccessGroups] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun mcpAccessGroups(mcpAccessGroups: JsonField<List<String>>) = apply {
                this.mcpAccessGroups = mcpAccessGroups.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [mcpAccessGroups].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMcpAccessGroup(mcpAccessGroup: String) = apply {
                mcpAccessGroups =
                    (mcpAccessGroups ?: JsonField.of(mutableListOf())).also {
                        checkKnown("mcpAccessGroups", it).add(mcpAccessGroup)
                    }
            }

            fun mcpServers(mcpServers: List<String>?) = mcpServers(JsonField.ofNullable(mcpServers))

            /**
             * Sets [Builder.mcpServers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mcpServers] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mcpServers(mcpServers: JsonField<List<String>>) = apply {
                this.mcpServers = mcpServers.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [mcpServers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMcpServer(mcpServer: String) = apply {
                mcpServers =
                    (mcpServers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("mcpServers", it).add(mcpServer)
                    }
            }

            fun mcpToolPermissions(mcpToolPermissions: McpToolPermissions?) =
                mcpToolPermissions(JsonField.ofNullable(mcpToolPermissions))

            /**
             * Sets [Builder.mcpToolPermissions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mcpToolPermissions] with a well-typed
             * [McpToolPermissions] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun mcpToolPermissions(mcpToolPermissions: JsonField<McpToolPermissions>) = apply {
                this.mcpToolPermissions = mcpToolPermissions
            }

            fun vectorStores(vectorStores: List<String>?) =
                vectorStores(JsonField.ofNullable(vectorStores))

            /**
             * Sets [Builder.vectorStores] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vectorStores] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vectorStores(vectorStores: JsonField<List<String>>) = apply {
                this.vectorStores = vectorStores.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [vectorStores].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addVectorStore(vectorStore: String) = apply {
                vectorStores =
                    (vectorStores ?: JsonField.of(mutableListOf())).also {
                        checkKnown("vectorStores", it).add(vectorStore)
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
             * Returns an immutable instance of [ObjectPermission].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .objectPermissionId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ObjectPermission =
                ObjectPermission(
                    checkRequired("objectPermissionId", objectPermissionId),
                    (agentAccessGroups ?: JsonMissing.of()).map { it.toImmutable() },
                    (agents ?: JsonMissing.of()).map { it.toImmutable() },
                    (mcpAccessGroups ?: JsonMissing.of()).map { it.toImmutable() },
                    (mcpServers ?: JsonMissing.of()).map { it.toImmutable() },
                    mcpToolPermissions,
                    (vectorStores ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ObjectPermission = apply {
            if (validated) {
                return@apply
            }

            objectPermissionId()
            agentAccessGroups()
            agents()
            mcpAccessGroups()
            mcpServers()
            mcpToolPermissions()?.validate()
            vectorStores()
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
            (if (objectPermissionId.asKnown() == null) 0 else 1) +
                (agentAccessGroups.asKnown()?.size ?: 0) +
                (agents.asKnown()?.size ?: 0) +
                (mcpAccessGroups.asKnown()?.size ?: 0) +
                (mcpServers.asKnown()?.size ?: 0) +
                (mcpToolPermissions.asKnown()?.validity() ?: 0) +
                (vectorStores.asKnown()?.size ?: 0)

        class McpToolPermissions
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

                /**
                 * Returns a mutable builder for constructing an instance of [McpToolPermissions].
                 */
                fun builder() = Builder()
            }

            /** A builder for [McpToolPermissions]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(mcpToolPermissions: McpToolPermissions) = apply {
                    additionalProperties = mcpToolPermissions.additionalProperties.toMutableMap()
                }

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
                 * Returns an immutable instance of [McpToolPermissions].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): McpToolPermissions =
                    McpToolPermissions(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): McpToolPermissions = apply {
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

                return other is McpToolPermissions &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "McpToolPermissions{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ObjectPermission &&
                objectPermissionId == other.objectPermissionId &&
                agentAccessGroups == other.agentAccessGroups &&
                agents == other.agents &&
                mcpAccessGroups == other.mcpAccessGroups &&
                mcpServers == other.mcpServers &&
                mcpToolPermissions == other.mcpToolPermissions &&
                vectorStores == other.vectorStores &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                objectPermissionId,
                agentAccessGroups,
                agents,
                mcpAccessGroups,
                mcpServers,
                mcpToolPermissions,
                vectorStores,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ObjectPermission{objectPermissionId=$objectPermissionId, agentAccessGroups=$agentAccessGroups, agents=$agents, mcpAccessGroups=$mcpAccessGroups, mcpServers=$mcpServers, mcpToolPermissions=$mcpToolPermissions, vectorStores=$vectorStores, additionalProperties=$additionalProperties}"
    }

    class RouterSettings
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

            /** Returns a mutable builder for constructing an instance of [RouterSettings]. */
            fun builder() = Builder()
        }

        /** A builder for [RouterSettings]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(routerSettings: RouterSettings) = apply {
                additionalProperties = routerSettings.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [RouterSettings].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): RouterSettings = RouterSettings(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): RouterSettings = apply {
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

            return other is RouterSettings && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "RouterSettings{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TeamCreateResponse &&
            teamId == other.teamId &&
            admins == other.admins &&
            blocked == other.blocked &&
            budgetDuration == other.budgetDuration &&
            budgetResetAt == other.budgetResetAt &&
            createdAt == other.createdAt &&
            litellmModelTable == other.litellmModelTable &&
            maxBudget == other.maxBudget &&
            maxParallelRequests == other.maxParallelRequests &&
            members == other.members &&
            membersWithRoles == other.membersWithRoles &&
            metadata == other.metadata &&
            modelId == other.modelId &&
            models == other.models &&
            objectPermission == other.objectPermission &&
            objectPermissionId == other.objectPermissionId &&
            organizationId == other.organizationId &&
            routerSettings == other.routerSettings &&
            rpmLimit == other.rpmLimit &&
            spend == other.spend &&
            teamAlias == other.teamAlias &&
            teamMemberPermissions == other.teamMemberPermissions &&
            tpmLimit == other.tpmLimit &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            teamId,
            admins,
            blocked,
            budgetDuration,
            budgetResetAt,
            createdAt,
            litellmModelTable,
            maxBudget,
            maxParallelRequests,
            members,
            membersWithRoles,
            metadata,
            modelId,
            models,
            objectPermission,
            objectPermissionId,
            organizationId,
            routerSettings,
            rpmLimit,
            spend,
            teamAlias,
            teamMemberPermissions,
            tpmLimit,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TeamCreateResponse{teamId=$teamId, admins=$admins, blocked=$blocked, budgetDuration=$budgetDuration, budgetResetAt=$budgetResetAt, createdAt=$createdAt, litellmModelTable=$litellmModelTable, maxBudget=$maxBudget, maxParallelRequests=$maxParallelRequests, members=$members, membersWithRoles=$membersWithRoles, metadata=$metadata, modelId=$modelId, models=$models, objectPermission=$objectPermission, objectPermissionId=$objectPermissionId, organizationId=$organizationId, routerSettings=$routerSettings, rpmLimit=$rpmLimit, spend=$spend, teamAlias=$teamAlias, teamMemberPermissions=$teamMemberPermissions, tpmLimit=$tpmLimit, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
