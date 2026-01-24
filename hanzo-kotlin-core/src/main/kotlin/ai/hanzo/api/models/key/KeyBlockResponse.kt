// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

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

class KeyBlockResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val aliases: JsonField<Aliases>,
    private val allowedCacheControls: JsonField<List<JsonValue>>,
    private val allowedRoutes: JsonField<List<JsonValue>>,
    private val autoRotate: JsonField<Boolean>,
    private val blocked: JsonField<Boolean>,
    private val budgetDuration: JsonField<String>,
    private val budgetResetAt: JsonField<OffsetDateTime>,
    private val config: JsonField<Config>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val expires: JsonField<Expires>,
    private val keyAlias: JsonField<String>,
    private val keyName: JsonField<String>,
    private val keyRotationAt: JsonField<OffsetDateTime>,
    private val lastRotationAt: JsonField<OffsetDateTime>,
    private val litellmBudgetTable: JsonField<LitellmBudgetTable>,
    private val maxBudget: JsonField<Double>,
    private val maxParallelRequests: JsonField<Long>,
    private val metadata: JsonField<Metadata>,
    private val modelMaxBudget: JsonField<ModelMaxBudget>,
    private val modelSpend: JsonField<ModelSpend>,
    private val models: JsonField<List<JsonValue>>,
    private val objectPermission: JsonField<ObjectPermission>,
    private val objectPermissionId: JsonField<String>,
    private val orgId: JsonField<String>,
    private val permissions: JsonField<Permissions>,
    private val rotationCount: JsonField<Long>,
    private val rotationInterval: JsonField<String>,
    private val routerSettings: JsonField<RouterSettings>,
    private val rpmLimit: JsonField<Long>,
    private val softBudgetCooldown: JsonField<Boolean>,
    private val spend: JsonField<Double>,
    private val teamId: JsonField<String>,
    private val tpmLimit: JsonField<Long>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val userId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("aliases") @ExcludeMissing aliases: JsonField<Aliases> = JsonMissing.of(),
        @JsonProperty("allowed_cache_controls")
        @ExcludeMissing
        allowedCacheControls: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("allowed_routes")
        @ExcludeMissing
        allowedRoutes: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("auto_rotate")
        @ExcludeMissing
        autoRotate: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("blocked") @ExcludeMissing blocked: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("budget_duration")
        @ExcludeMissing
        budgetDuration: JsonField<String> = JsonMissing.of(),
        @JsonProperty("budget_reset_at")
        @ExcludeMissing
        budgetResetAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("config") @ExcludeMissing config: JsonField<Config> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created_by") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expires") @ExcludeMissing expires: JsonField<Expires> = JsonMissing.of(),
        @JsonProperty("key_alias") @ExcludeMissing keyAlias: JsonField<String> = JsonMissing.of(),
        @JsonProperty("key_name") @ExcludeMissing keyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("key_rotation_at")
        @ExcludeMissing
        keyRotationAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("last_rotation_at")
        @ExcludeMissing
        lastRotationAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("litellm_budget_table")
        @ExcludeMissing
        litellmBudgetTable: JsonField<LitellmBudgetTable> = JsonMissing.of(),
        @JsonProperty("max_budget") @ExcludeMissing maxBudget: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("max_parallel_requests")
        @ExcludeMissing
        maxParallelRequests: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("model_max_budget")
        @ExcludeMissing
        modelMaxBudget: JsonField<ModelMaxBudget> = JsonMissing.of(),
        @JsonProperty("model_spend")
        @ExcludeMissing
        modelSpend: JsonField<ModelSpend> = JsonMissing.of(),
        @JsonProperty("models")
        @ExcludeMissing
        models: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("object_permission")
        @ExcludeMissing
        objectPermission: JsonField<ObjectPermission> = JsonMissing.of(),
        @JsonProperty("object_permission_id")
        @ExcludeMissing
        objectPermissionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("org_id") @ExcludeMissing orgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("permissions")
        @ExcludeMissing
        permissions: JsonField<Permissions> = JsonMissing.of(),
        @JsonProperty("rotation_count")
        @ExcludeMissing
        rotationCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("rotation_interval")
        @ExcludeMissing
        rotationInterval: JsonField<String> = JsonMissing.of(),
        @JsonProperty("router_settings")
        @ExcludeMissing
        routerSettings: JsonField<RouterSettings> = JsonMissing.of(),
        @JsonProperty("rpm_limit") @ExcludeMissing rpmLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("soft_budget_cooldown")
        @ExcludeMissing
        softBudgetCooldown: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("spend") @ExcludeMissing spend: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("team_id") @ExcludeMissing teamId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tpm_limit") @ExcludeMissing tpmLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updated_by") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
    ) : this(
        token,
        aliases,
        allowedCacheControls,
        allowedRoutes,
        autoRotate,
        blocked,
        budgetDuration,
        budgetResetAt,
        config,
        createdAt,
        createdBy,
        expires,
        keyAlias,
        keyName,
        keyRotationAt,
        lastRotationAt,
        litellmBudgetTable,
        maxBudget,
        maxParallelRequests,
        metadata,
        modelMaxBudget,
        modelSpend,
        models,
        objectPermission,
        objectPermissionId,
        orgId,
        permissions,
        rotationCount,
        rotationInterval,
        routerSettings,
        rpmLimit,
        softBudgetCooldown,
        spend,
        teamId,
        tpmLimit,
        updatedAt,
        updatedBy,
        userId,
        mutableMapOf(),
    )

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun token(): String? = token.getNullable("token")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun aliases(): Aliases? = aliases.getNullable("aliases")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowedCacheControls(): List<JsonValue>? =
        allowedCacheControls.getNullable("allowed_cache_controls")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowedRoutes(): List<JsonValue>? = allowedRoutes.getNullable("allowed_routes")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun autoRotate(): Boolean? = autoRotate.getNullable("auto_rotate")

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
    fun config(): Config? = config.getNullable("config")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): String? = createdBy.getNullable("created_by")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expires(): Expires? = expires.getNullable("expires")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun keyAlias(): String? = keyAlias.getNullable("key_alias")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun keyName(): String? = keyName.getNullable("key_name")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun keyRotationAt(): OffsetDateTime? = keyRotationAt.getNullable("key_rotation_at")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastRotationAt(): OffsetDateTime? = lastRotationAt.getNullable("last_rotation_at")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun litellmBudgetTable(): LitellmBudgetTable? =
        litellmBudgetTable.getNullable("litellm_budget_table")

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
    fun metadata(): Metadata? = metadata.getNullable("metadata")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modelMaxBudget(): ModelMaxBudget? = modelMaxBudget.getNullable("model_max_budget")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modelSpend(): ModelSpend? = modelSpend.getNullable("model_spend")

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
    fun orgId(): String? = orgId.getNullable("org_id")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun permissions(): Permissions? = permissions.getNullable("permissions")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rotationCount(): Long? = rotationCount.getNullable("rotation_count")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rotationInterval(): String? = rotationInterval.getNullable("rotation_interval")

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
    fun softBudgetCooldown(): Boolean? = softBudgetCooldown.getNullable("soft_budget_cooldown")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spend(): Double? = spend.getNullable("spend")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun teamId(): String? = teamId.getNullable("team_id")

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
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedBy(): String? = updatedBy.getNullable("updated_by")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): String? = userId.getNullable("user_id")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [aliases].
     *
     * Unlike [aliases], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aliases") @ExcludeMissing fun _aliases(): JsonField<Aliases> = aliases

    /**
     * Returns the raw JSON value of [allowedCacheControls].
     *
     * Unlike [allowedCacheControls], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("allowed_cache_controls")
    @ExcludeMissing
    fun _allowedCacheControls(): JsonField<List<JsonValue>> = allowedCacheControls

    /**
     * Returns the raw JSON value of [allowedRoutes].
     *
     * Unlike [allowedRoutes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("allowed_routes")
    @ExcludeMissing
    fun _allowedRoutes(): JsonField<List<JsonValue>> = allowedRoutes

    /**
     * Returns the raw JSON value of [autoRotate].
     *
     * Unlike [autoRotate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("auto_rotate") @ExcludeMissing fun _autoRotate(): JsonField<Boolean> = autoRotate

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
     * Returns the raw JSON value of [config].
     *
     * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("config") @ExcludeMissing fun _config(): JsonField<Config> = config

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_by") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * Returns the raw JSON value of [expires].
     *
     * Unlike [expires], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires") @ExcludeMissing fun _expires(): JsonField<Expires> = expires

    /**
     * Returns the raw JSON value of [keyAlias].
     *
     * Unlike [keyAlias], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("key_alias") @ExcludeMissing fun _keyAlias(): JsonField<String> = keyAlias

    /**
     * Returns the raw JSON value of [keyName].
     *
     * Unlike [keyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("key_name") @ExcludeMissing fun _keyName(): JsonField<String> = keyName

    /**
     * Returns the raw JSON value of [keyRotationAt].
     *
     * Unlike [keyRotationAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("key_rotation_at")
    @ExcludeMissing
    fun _keyRotationAt(): JsonField<OffsetDateTime> = keyRotationAt

    /**
     * Returns the raw JSON value of [lastRotationAt].
     *
     * Unlike [lastRotationAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_rotation_at")
    @ExcludeMissing
    fun _lastRotationAt(): JsonField<OffsetDateTime> = lastRotationAt

    /**
     * Returns the raw JSON value of [litellmBudgetTable].
     *
     * Unlike [litellmBudgetTable], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("litellm_budget_table")
    @ExcludeMissing
    fun _litellmBudgetTable(): JsonField<LitellmBudgetTable> = litellmBudgetTable

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
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [modelMaxBudget].
     *
     * Unlike [modelMaxBudget], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model_max_budget")
    @ExcludeMissing
    fun _modelMaxBudget(): JsonField<ModelMaxBudget> = modelMaxBudget

    /**
     * Returns the raw JSON value of [modelSpend].
     *
     * Unlike [modelSpend], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model_spend")
    @ExcludeMissing
    fun _modelSpend(): JsonField<ModelSpend> = modelSpend

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
     * Returns the raw JSON value of [orgId].
     *
     * Unlike [orgId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("org_id") @ExcludeMissing fun _orgId(): JsonField<String> = orgId

    /**
     * Returns the raw JSON value of [permissions].
     *
     * Unlike [permissions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("permissions")
    @ExcludeMissing
    fun _permissions(): JsonField<Permissions> = permissions

    /**
     * Returns the raw JSON value of [rotationCount].
     *
     * Unlike [rotationCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rotation_count")
    @ExcludeMissing
    fun _rotationCount(): JsonField<Long> = rotationCount

    /**
     * Returns the raw JSON value of [rotationInterval].
     *
     * Unlike [rotationInterval], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("rotation_interval")
    @ExcludeMissing
    fun _rotationInterval(): JsonField<String> = rotationInterval

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
     * Returns the raw JSON value of [softBudgetCooldown].
     *
     * Unlike [softBudgetCooldown], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("soft_budget_cooldown")
    @ExcludeMissing
    fun _softBudgetCooldown(): JsonField<Boolean> = softBudgetCooldown

    /**
     * Returns the raw JSON value of [spend].
     *
     * Unlike [spend], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spend") @ExcludeMissing fun _spend(): JsonField<Double> = spend

    /**
     * Returns the raw JSON value of [teamId].
     *
     * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("team_id") @ExcludeMissing fun _teamId(): JsonField<String> = teamId

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

    /**
     * Returns the raw JSON value of [updatedBy].
     *
     * Unlike [updatedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_by") @ExcludeMissing fun _updatedBy(): JsonField<String> = updatedBy

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

        /** Returns a mutable builder for constructing an instance of [KeyBlockResponse]. */
        fun builder() = Builder()
    }

    /** A builder for [KeyBlockResponse]. */
    class Builder internal constructor() {

        private var token: JsonField<String> = JsonMissing.of()
        private var aliases: JsonField<Aliases> = JsonMissing.of()
        private var allowedCacheControls: JsonField<MutableList<JsonValue>>? = null
        private var allowedRoutes: JsonField<MutableList<JsonValue>>? = null
        private var autoRotate: JsonField<Boolean> = JsonMissing.of()
        private var blocked: JsonField<Boolean> = JsonMissing.of()
        private var budgetDuration: JsonField<String> = JsonMissing.of()
        private var budgetResetAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var config: JsonField<Config> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var expires: JsonField<Expires> = JsonMissing.of()
        private var keyAlias: JsonField<String> = JsonMissing.of()
        private var keyName: JsonField<String> = JsonMissing.of()
        private var keyRotationAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastRotationAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var litellmBudgetTable: JsonField<LitellmBudgetTable> = JsonMissing.of()
        private var maxBudget: JsonField<Double> = JsonMissing.of()
        private var maxParallelRequests: JsonField<Long> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var modelMaxBudget: JsonField<ModelMaxBudget> = JsonMissing.of()
        private var modelSpend: JsonField<ModelSpend> = JsonMissing.of()
        private var models: JsonField<MutableList<JsonValue>>? = null
        private var objectPermission: JsonField<ObjectPermission> = JsonMissing.of()
        private var objectPermissionId: JsonField<String> = JsonMissing.of()
        private var orgId: JsonField<String> = JsonMissing.of()
        private var permissions: JsonField<Permissions> = JsonMissing.of()
        private var rotationCount: JsonField<Long> = JsonMissing.of()
        private var rotationInterval: JsonField<String> = JsonMissing.of()
        private var routerSettings: JsonField<RouterSettings> = JsonMissing.of()
        private var rpmLimit: JsonField<Long> = JsonMissing.of()
        private var softBudgetCooldown: JsonField<Boolean> = JsonMissing.of()
        private var spend: JsonField<Double> = JsonMissing.of()
        private var teamId: JsonField<String> = JsonMissing.of()
        private var tpmLimit: JsonField<Long> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(keyBlockResponse: KeyBlockResponse) = apply {
            token = keyBlockResponse.token
            aliases = keyBlockResponse.aliases
            allowedCacheControls = keyBlockResponse.allowedCacheControls.map { it.toMutableList() }
            allowedRoutes = keyBlockResponse.allowedRoutes.map { it.toMutableList() }
            autoRotate = keyBlockResponse.autoRotate
            blocked = keyBlockResponse.blocked
            budgetDuration = keyBlockResponse.budgetDuration
            budgetResetAt = keyBlockResponse.budgetResetAt
            config = keyBlockResponse.config
            createdAt = keyBlockResponse.createdAt
            createdBy = keyBlockResponse.createdBy
            expires = keyBlockResponse.expires
            keyAlias = keyBlockResponse.keyAlias
            keyName = keyBlockResponse.keyName
            keyRotationAt = keyBlockResponse.keyRotationAt
            lastRotationAt = keyBlockResponse.lastRotationAt
            litellmBudgetTable = keyBlockResponse.litellmBudgetTable
            maxBudget = keyBlockResponse.maxBudget
            maxParallelRequests = keyBlockResponse.maxParallelRequests
            metadata = keyBlockResponse.metadata
            modelMaxBudget = keyBlockResponse.modelMaxBudget
            modelSpend = keyBlockResponse.modelSpend
            models = keyBlockResponse.models.map { it.toMutableList() }
            objectPermission = keyBlockResponse.objectPermission
            objectPermissionId = keyBlockResponse.objectPermissionId
            orgId = keyBlockResponse.orgId
            permissions = keyBlockResponse.permissions
            rotationCount = keyBlockResponse.rotationCount
            rotationInterval = keyBlockResponse.rotationInterval
            routerSettings = keyBlockResponse.routerSettings
            rpmLimit = keyBlockResponse.rpmLimit
            softBudgetCooldown = keyBlockResponse.softBudgetCooldown
            spend = keyBlockResponse.spend
            teamId = keyBlockResponse.teamId
            tpmLimit = keyBlockResponse.tpmLimit
            updatedAt = keyBlockResponse.updatedAt
            updatedBy = keyBlockResponse.updatedBy
            userId = keyBlockResponse.userId
            additionalProperties = keyBlockResponse.additionalProperties.toMutableMap()
        }

        fun token(token: String?) = token(JsonField.ofNullable(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun aliases(aliases: Aliases) = aliases(JsonField.of(aliases))

        /**
         * Sets [Builder.aliases] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aliases] with a well-typed [Aliases] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun aliases(aliases: JsonField<Aliases>) = apply { this.aliases = aliases }

        fun allowedCacheControls(allowedCacheControls: List<JsonValue>?) =
            allowedCacheControls(JsonField.ofNullable(allowedCacheControls))

        /**
         * Sets [Builder.allowedCacheControls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedCacheControls] with a well-typed
         * `List<JsonValue>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun allowedCacheControls(allowedCacheControls: JsonField<List<JsonValue>>) = apply {
            this.allowedCacheControls = allowedCacheControls.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [allowedCacheControls].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllowedCacheControl(allowedCacheControl: JsonValue) = apply {
            allowedCacheControls =
                (allowedCacheControls ?: JsonField.of(mutableListOf())).also {
                    checkKnown("allowedCacheControls", it).add(allowedCacheControl)
                }
        }

        fun allowedRoutes(allowedRoutes: List<JsonValue>?) =
            allowedRoutes(JsonField.ofNullable(allowedRoutes))

        /**
         * Sets [Builder.allowedRoutes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedRoutes] with a well-typed `List<JsonValue>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allowedRoutes(allowedRoutes: JsonField<List<JsonValue>>) = apply {
            this.allowedRoutes = allowedRoutes.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [allowedRoutes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllowedRoute(allowedRoute: JsonValue) = apply {
            allowedRoutes =
                (allowedRoutes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("allowedRoutes", it).add(allowedRoute)
                }
        }

        fun autoRotate(autoRotate: Boolean?) = autoRotate(JsonField.ofNullable(autoRotate))

        /**
         * Alias for [Builder.autoRotate].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun autoRotate(autoRotate: Boolean) = autoRotate(autoRotate as Boolean?)

        /**
         * Sets [Builder.autoRotate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoRotate] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun autoRotate(autoRotate: JsonField<Boolean>) = apply { this.autoRotate = autoRotate }

        fun blocked(blocked: Boolean?) = blocked(JsonField.ofNullable(blocked))

        /**
         * Alias for [Builder.blocked].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun blocked(blocked: Boolean) = blocked(blocked as Boolean?)

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

        fun config(config: Config) = config(JsonField.of(config))

        /**
         * Sets [Builder.config] to an arbitrary JSON value.
         *
         * You should usually call [Builder.config] with a well-typed [Config] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun config(config: JsonField<Config>) = apply { this.config = config }

        fun createdAt(createdAt: OffsetDateTime?) = createdAt(JsonField.ofNullable(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun createdBy(createdBy: String?) = createdBy(JsonField.ofNullable(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        fun expires(expires: Expires?) = expires(JsonField.ofNullable(expires))

        /**
         * Sets [Builder.expires] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expires] with a well-typed [Expires] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun expires(expires: JsonField<Expires>) = apply { this.expires = expires }

        /** Alias for calling [expires] with `Expires.ofString(string)`. */
        fun expires(string: String) = expires(Expires.ofString(string))

        /** Alias for calling [expires] with `Expires.ofOffsetDateTime(offsetDateTime)`. */
        fun expires(offsetDateTime: OffsetDateTime) =
            expires(Expires.ofOffsetDateTime(offsetDateTime))

        fun keyAlias(keyAlias: String?) = keyAlias(JsonField.ofNullable(keyAlias))

        /**
         * Sets [Builder.keyAlias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.keyAlias] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun keyAlias(keyAlias: JsonField<String>) = apply { this.keyAlias = keyAlias }

        fun keyName(keyName: String?) = keyName(JsonField.ofNullable(keyName))

        /**
         * Sets [Builder.keyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.keyName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun keyName(keyName: JsonField<String>) = apply { this.keyName = keyName }

        fun keyRotationAt(keyRotationAt: OffsetDateTime?) =
            keyRotationAt(JsonField.ofNullable(keyRotationAt))

        /**
         * Sets [Builder.keyRotationAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.keyRotationAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun keyRotationAt(keyRotationAt: JsonField<OffsetDateTime>) = apply {
            this.keyRotationAt = keyRotationAt
        }

        fun lastRotationAt(lastRotationAt: OffsetDateTime?) =
            lastRotationAt(JsonField.ofNullable(lastRotationAt))

        /**
         * Sets [Builder.lastRotationAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastRotationAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastRotationAt(lastRotationAt: JsonField<OffsetDateTime>) = apply {
            this.lastRotationAt = lastRotationAt
        }

        fun litellmBudgetTable(litellmBudgetTable: LitellmBudgetTable?) =
            litellmBudgetTable(JsonField.ofNullable(litellmBudgetTable))

        /**
         * Sets [Builder.litellmBudgetTable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.litellmBudgetTable] with a well-typed
         * [LitellmBudgetTable] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun litellmBudgetTable(litellmBudgetTable: JsonField<LitellmBudgetTable>) = apply {
            this.litellmBudgetTable = litellmBudgetTable
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

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun modelMaxBudget(modelMaxBudget: ModelMaxBudget) =
            modelMaxBudget(JsonField.of(modelMaxBudget))

        /**
         * Sets [Builder.modelMaxBudget] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelMaxBudget] with a well-typed [ModelMaxBudget] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun modelMaxBudget(modelMaxBudget: JsonField<ModelMaxBudget>) = apply {
            this.modelMaxBudget = modelMaxBudget
        }

        fun modelSpend(modelSpend: ModelSpend) = modelSpend(JsonField.of(modelSpend))

        /**
         * Sets [Builder.modelSpend] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelSpend] with a well-typed [ModelSpend] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun modelSpend(modelSpend: JsonField<ModelSpend>) = apply { this.modelSpend = modelSpend }

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

        fun orgId(orgId: String?) = orgId(JsonField.ofNullable(orgId))

        /**
         * Sets [Builder.orgId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orgId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun orgId(orgId: JsonField<String>) = apply { this.orgId = orgId }

        fun permissions(permissions: Permissions) = permissions(JsonField.of(permissions))

        /**
         * Sets [Builder.permissions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.permissions] with a well-typed [Permissions] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun permissions(permissions: JsonField<Permissions>) = apply {
            this.permissions = permissions
        }

        fun rotationCount(rotationCount: Long?) = rotationCount(JsonField.ofNullable(rotationCount))

        /**
         * Alias for [Builder.rotationCount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun rotationCount(rotationCount: Long) = rotationCount(rotationCount as Long?)

        /**
         * Sets [Builder.rotationCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rotationCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rotationCount(rotationCount: JsonField<Long>) = apply {
            this.rotationCount = rotationCount
        }

        fun rotationInterval(rotationInterval: String?) =
            rotationInterval(JsonField.ofNullable(rotationInterval))

        /**
         * Sets [Builder.rotationInterval] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rotationInterval] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rotationInterval(rotationInterval: JsonField<String>) = apply {
            this.rotationInterval = rotationInterval
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

        fun softBudgetCooldown(softBudgetCooldown: Boolean) =
            softBudgetCooldown(JsonField.of(softBudgetCooldown))

        /**
         * Sets [Builder.softBudgetCooldown] to an arbitrary JSON value.
         *
         * You should usually call [Builder.softBudgetCooldown] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun softBudgetCooldown(softBudgetCooldown: JsonField<Boolean>) = apply {
            this.softBudgetCooldown = softBudgetCooldown
        }

        fun spend(spend: Double) = spend(JsonField.of(spend))

        /**
         * Sets [Builder.spend] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spend] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun spend(spend: JsonField<Double>) = apply { this.spend = spend }

        fun teamId(teamId: String?) = teamId(JsonField.ofNullable(teamId))

        /**
         * Sets [Builder.teamId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teamId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun teamId(teamId: JsonField<String>) = apply { this.teamId = teamId }

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

        fun updatedBy(updatedBy: String?) = updatedBy(JsonField.ofNullable(updatedBy))

        /**
         * Sets [Builder.updatedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedBy(updatedBy: JsonField<String>) = apply { this.updatedBy = updatedBy }

        fun userId(userId: String?) = userId(JsonField.ofNullable(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Returns an immutable instance of [KeyBlockResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): KeyBlockResponse =
            KeyBlockResponse(
                token,
                aliases,
                (allowedCacheControls ?: JsonMissing.of()).map { it.toImmutable() },
                (allowedRoutes ?: JsonMissing.of()).map { it.toImmutable() },
                autoRotate,
                blocked,
                budgetDuration,
                budgetResetAt,
                config,
                createdAt,
                createdBy,
                expires,
                keyAlias,
                keyName,
                keyRotationAt,
                lastRotationAt,
                litellmBudgetTable,
                maxBudget,
                maxParallelRequests,
                metadata,
                modelMaxBudget,
                modelSpend,
                (models ?: JsonMissing.of()).map { it.toImmutable() },
                objectPermission,
                objectPermissionId,
                orgId,
                permissions,
                rotationCount,
                rotationInterval,
                routerSettings,
                rpmLimit,
                softBudgetCooldown,
                spend,
                teamId,
                tpmLimit,
                updatedAt,
                updatedBy,
                userId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): KeyBlockResponse = apply {
        if (validated) {
            return@apply
        }

        token()
        aliases()?.validate()
        allowedCacheControls()
        allowedRoutes()
        autoRotate()
        blocked()
        budgetDuration()
        budgetResetAt()
        config()?.validate()
        createdAt()
        createdBy()
        expires()?.validate()
        keyAlias()
        keyName()
        keyRotationAt()
        lastRotationAt()
        litellmBudgetTable()?.validate()
        maxBudget()
        maxParallelRequests()
        metadata()?.validate()
        modelMaxBudget()?.validate()
        modelSpend()?.validate()
        models()
        objectPermission()?.validate()
        objectPermissionId()
        orgId()
        permissions()?.validate()
        rotationCount()
        rotationInterval()
        routerSettings()?.validate()
        rpmLimit()
        softBudgetCooldown()
        spend()
        teamId()
        tpmLimit()
        updatedAt()
        updatedBy()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (token.asKnown() == null) 0 else 1) +
            (aliases.asKnown()?.validity() ?: 0) +
            (allowedCacheControls.asKnown()?.size ?: 0) +
            (allowedRoutes.asKnown()?.size ?: 0) +
            (if (autoRotate.asKnown() == null) 0 else 1) +
            (if (blocked.asKnown() == null) 0 else 1) +
            (if (budgetDuration.asKnown() == null) 0 else 1) +
            (if (budgetResetAt.asKnown() == null) 0 else 1) +
            (config.asKnown()?.validity() ?: 0) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (createdBy.asKnown() == null) 0 else 1) +
            (expires.asKnown()?.validity() ?: 0) +
            (if (keyAlias.asKnown() == null) 0 else 1) +
            (if (keyName.asKnown() == null) 0 else 1) +
            (if (keyRotationAt.asKnown() == null) 0 else 1) +
            (if (lastRotationAt.asKnown() == null) 0 else 1) +
            (litellmBudgetTable.asKnown()?.validity() ?: 0) +
            (if (maxBudget.asKnown() == null) 0 else 1) +
            (if (maxParallelRequests.asKnown() == null) 0 else 1) +
            (metadata.asKnown()?.validity() ?: 0) +
            (modelMaxBudget.asKnown()?.validity() ?: 0) +
            (modelSpend.asKnown()?.validity() ?: 0) +
            (models.asKnown()?.size ?: 0) +
            (objectPermission.asKnown()?.validity() ?: 0) +
            (if (objectPermissionId.asKnown() == null) 0 else 1) +
            (if (orgId.asKnown() == null) 0 else 1) +
            (permissions.asKnown()?.validity() ?: 0) +
            (if (rotationCount.asKnown() == null) 0 else 1) +
            (if (rotationInterval.asKnown() == null) 0 else 1) +
            (routerSettings.asKnown()?.validity() ?: 0) +
            (if (rpmLimit.asKnown() == null) 0 else 1) +
            (if (softBudgetCooldown.asKnown() == null) 0 else 1) +
            (if (spend.asKnown() == null) 0 else 1) +
            (if (teamId.asKnown() == null) 0 else 1) +
            (if (tpmLimit.asKnown() == null) 0 else 1) +
            (if (updatedAt.asKnown() == null) 0 else 1) +
            (if (updatedBy.asKnown() == null) 0 else 1) +
            (if (userId.asKnown() == null) 0 else 1)

    class Aliases
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

            /** Returns a mutable builder for constructing an instance of [Aliases]. */
            fun builder() = Builder()
        }

        /** A builder for [Aliases]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(aliases: Aliases) = apply {
                additionalProperties = aliases.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Aliases].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Aliases = Aliases(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Aliases = apply {
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

            return other is Aliases && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Aliases{additionalProperties=$additionalProperties}"
    }

    class Config
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

            /** Returns a mutable builder for constructing an instance of [Config]. */
            fun builder() = Builder()
        }

        /** A builder for [Config]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(config: Config) = apply {
                additionalProperties = config.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Config].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Config = Config(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Config = apply {
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

            return other is Config && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Config{additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = Expires.Deserializer::class)
    @JsonSerialize(using = Expires.Serializer::class)
    class Expires
    private constructor(
        private val string: String? = null,
        private val offsetDateTime: OffsetDateTime? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): String? = string

        fun offsetDateTime(): OffsetDateTime? = offsetDateTime

        fun isString(): Boolean = string != null

        fun isOffsetDateTime(): Boolean = offsetDateTime != null

        fun asString(): String = string.getOrThrow("string")

        fun asOffsetDateTime(): OffsetDateTime = offsetDateTime.getOrThrow("offsetDateTime")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                offsetDateTime != null -> visitor.visitOffsetDateTime(offsetDateTime)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Expires = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitOffsetDateTime(offsetDateTime: OffsetDateTime) {}
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
                    override fun visitString(string: String) = 1

                    override fun visitOffsetDateTime(offsetDateTime: OffsetDateTime) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Expires &&
                string == other.string &&
                offsetDateTime == other.offsetDateTime
        }

        override fun hashCode(): Int = Objects.hash(string, offsetDateTime)

        override fun toString(): String =
            when {
                string != null -> "Expires{string=$string}"
                offsetDateTime != null -> "Expires{offsetDateTime=$offsetDateTime}"
                _json != null -> "Expires{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Expires")
            }

        companion object {

            fun ofString(string: String) = Expires(string = string)

            fun ofOffsetDateTime(offsetDateTime: OffsetDateTime) =
                Expires(offsetDateTime = offsetDateTime)
        }

        /**
         * An interface that defines how to map each variant of [Expires] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitOffsetDateTime(offsetDateTime: OffsetDateTime): T

            /**
             * Maps an unknown variant of [Expires] to a value of type [T].
             *
             * An instance of [Expires] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws HanzoInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HanzoInvalidDataException("Unknown Expires: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Expires>(Expires::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Expires {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                                Expires(offsetDateTime = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Expires(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Expires(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Expires>(Expires::class) {

            override fun serialize(
                value: Expires,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.offsetDateTime != null -> generator.writeObject(value.offsetDateTime)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Expires")
                }
            }
        }
    }

    class LitellmBudgetTable
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

            /** Returns a mutable builder for constructing an instance of [LitellmBudgetTable]. */
            fun builder() = Builder()
        }

        /** A builder for [LitellmBudgetTable]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(litellmBudgetTable: LitellmBudgetTable) = apply {
                additionalProperties = litellmBudgetTable.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [LitellmBudgetTable].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): LitellmBudgetTable = LitellmBudgetTable(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): LitellmBudgetTable = apply {
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

            return other is LitellmBudgetTable && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "LitellmBudgetTable{additionalProperties=$additionalProperties}"
    }

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

    class ModelMaxBudget
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

            /** Returns a mutable builder for constructing an instance of [ModelMaxBudget]. */
            fun builder() = Builder()
        }

        /** A builder for [ModelMaxBudget]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(modelMaxBudget: ModelMaxBudget) = apply {
                additionalProperties = modelMaxBudget.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ModelMaxBudget].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ModelMaxBudget = ModelMaxBudget(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ModelMaxBudget = apply {
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

            return other is ModelMaxBudget && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ModelMaxBudget{additionalProperties=$additionalProperties}"
    }

    class ModelSpend
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

            /** Returns a mutable builder for constructing an instance of [ModelSpend]. */
            fun builder() = Builder()
        }

        /** A builder for [ModelSpend]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(modelSpend: ModelSpend) = apply {
                additionalProperties = modelSpend.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ModelSpend].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ModelSpend = ModelSpend(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ModelSpend = apply {
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

            return other is ModelSpend && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ModelSpend{additionalProperties=$additionalProperties}"
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

    class Permissions
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

            /** Returns a mutable builder for constructing an instance of [Permissions]. */
            fun builder() = Builder()
        }

        /** A builder for [Permissions]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(permissions: Permissions) = apply {
                additionalProperties = permissions.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Permissions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Permissions = Permissions(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Permissions = apply {
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

            return other is Permissions && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Permissions{additionalProperties=$additionalProperties}"
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

        return other is KeyBlockResponse &&
            token == other.token &&
            aliases == other.aliases &&
            allowedCacheControls == other.allowedCacheControls &&
            allowedRoutes == other.allowedRoutes &&
            autoRotate == other.autoRotate &&
            blocked == other.blocked &&
            budgetDuration == other.budgetDuration &&
            budgetResetAt == other.budgetResetAt &&
            config == other.config &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            expires == other.expires &&
            keyAlias == other.keyAlias &&
            keyName == other.keyName &&
            keyRotationAt == other.keyRotationAt &&
            lastRotationAt == other.lastRotationAt &&
            litellmBudgetTable == other.litellmBudgetTable &&
            maxBudget == other.maxBudget &&
            maxParallelRequests == other.maxParallelRequests &&
            metadata == other.metadata &&
            modelMaxBudget == other.modelMaxBudget &&
            modelSpend == other.modelSpend &&
            models == other.models &&
            objectPermission == other.objectPermission &&
            objectPermissionId == other.objectPermissionId &&
            orgId == other.orgId &&
            permissions == other.permissions &&
            rotationCount == other.rotationCount &&
            rotationInterval == other.rotationInterval &&
            routerSettings == other.routerSettings &&
            rpmLimit == other.rpmLimit &&
            softBudgetCooldown == other.softBudgetCooldown &&
            spend == other.spend &&
            teamId == other.teamId &&
            tpmLimit == other.tpmLimit &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            userId == other.userId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            aliases,
            allowedCacheControls,
            allowedRoutes,
            autoRotate,
            blocked,
            budgetDuration,
            budgetResetAt,
            config,
            createdAt,
            createdBy,
            expires,
            keyAlias,
            keyName,
            keyRotationAt,
            lastRotationAt,
            litellmBudgetTable,
            maxBudget,
            maxParallelRequests,
            metadata,
            modelMaxBudget,
            modelSpend,
            models,
            objectPermission,
            objectPermissionId,
            orgId,
            permissions,
            rotationCount,
            rotationInterval,
            routerSettings,
            rpmLimit,
            softBudgetCooldown,
            spend,
            teamId,
            tpmLimit,
            updatedAt,
            updatedBy,
            userId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "KeyBlockResponse{token=$token, aliases=$aliases, allowedCacheControls=$allowedCacheControls, allowedRoutes=$allowedRoutes, autoRotate=$autoRotate, blocked=$blocked, budgetDuration=$budgetDuration, budgetResetAt=$budgetResetAt, config=$config, createdAt=$createdAt, createdBy=$createdBy, expires=$expires, keyAlias=$keyAlias, keyName=$keyName, keyRotationAt=$keyRotationAt, lastRotationAt=$lastRotationAt, litellmBudgetTable=$litellmBudgetTable, maxBudget=$maxBudget, maxParallelRequests=$maxParallelRequests, metadata=$metadata, modelMaxBudget=$modelMaxBudget, modelSpend=$modelSpend, models=$models, objectPermission=$objectPermission, objectPermissionId=$objectPermissionId, orgId=$orgId, permissions=$permissions, rotationCount=$rotationCount, rotationInterval=$rotationInterval, routerSettings=$routerSettings, rpmLimit=$rpmLimit, softBudgetCooldown=$softBudgetCooldown, spend=$spend, teamId=$teamId, tpmLimit=$tpmLimit, updatedAt=$updatedAt, updatedBy=$updatedBy, userId=$userId, additionalProperties=$additionalProperties}"
}
