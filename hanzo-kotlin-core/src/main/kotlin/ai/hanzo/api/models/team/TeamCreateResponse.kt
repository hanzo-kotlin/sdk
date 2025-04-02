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

class TeamCreateResponse
private constructor(
    private val teamId: JsonField<String>,
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

        internal fun from(teamCreateResponse: TeamCreateResponse) = apply {
            teamId = teamCreateResponse.teamId
            admins = teamCreateResponse.admins.map { it.toMutableList() }
            blocked = teamCreateResponse.blocked
            budgetDuration = teamCreateResponse.budgetDuration
            budgetResetAt = teamCreateResponse.budgetResetAt
            createdAt = teamCreateResponse.createdAt
            llmModelTable = teamCreateResponse.llmModelTable
            maxBudget = teamCreateResponse.maxBudget
            maxParallelRequests = teamCreateResponse.maxParallelRequests
            members = teamCreateResponse.members.map { it.toMutableList() }
            membersWithRoles = teamCreateResponse.membersWithRoles.map { it.toMutableList() }
            metadata = teamCreateResponse.metadata
            modelId = teamCreateResponse.modelId
            models = teamCreateResponse.models.map { it.toMutableList() }
            organizationId = teamCreateResponse.organizationId
            rpmLimit = teamCreateResponse.rpmLimit
            spend = teamCreateResponse.spend
            teamAlias = teamCreateResponse.teamAlias
            tpmLimit = teamCreateResponse.tpmLimit
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

    class LlmModelTable
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

                return /* spotless:off */ other is ModelAliases && jsonValue == other.jsonValue && string == other.string /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(jsonValue, string) /* spotless:on */

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

            return /* spotless:off */ other is LlmModelTable && createdBy == other.createdBy && updatedBy == other.updatedBy && modelAliases == other.modelAliases && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(createdBy, updatedBy, modelAliases, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LlmModelTable{createdBy=$createdBy, updatedBy=$updatedBy, modelAliases=$modelAliases, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TeamCreateResponse && teamId == other.teamId && admins == other.admins && blocked == other.blocked && budgetDuration == other.budgetDuration && budgetResetAt == other.budgetResetAt && createdAt == other.createdAt && llmModelTable == other.llmModelTable && maxBudget == other.maxBudget && maxParallelRequests == other.maxParallelRequests && members == other.members && membersWithRoles == other.membersWithRoles && metadata == other.metadata && modelId == other.modelId && models == other.models && organizationId == other.organizationId && rpmLimit == other.rpmLimit && spend == other.spend && teamAlias == other.teamAlias && tpmLimit == other.tpmLimit && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(teamId, admins, blocked, budgetDuration, budgetResetAt, createdAt, llmModelTable, maxBudget, maxParallelRequests, members, membersWithRoles, metadata, modelId, models, organizationId, rpmLimit, spend, teamAlias, tpmLimit, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TeamCreateResponse{teamId=$teamId, admins=$admins, blocked=$blocked, budgetDuration=$budgetDuration, budgetResetAt=$budgetResetAt, createdAt=$createdAt, llmModelTable=$llmModelTable, maxBudget=$maxBudget, maxParallelRequests=$maxParallelRequests, members=$members, membersWithRoles=$membersWithRoles, metadata=$metadata, modelId=$modelId, models=$models, organizationId=$organizationId, rpmLimit=$rpmLimit, spend=$spend, teamAlias=$teamAlias, tpmLimit=$tpmLimit, additionalProperties=$additionalProperties}"
}
