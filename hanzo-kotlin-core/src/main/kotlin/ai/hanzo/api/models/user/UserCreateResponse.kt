// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.user

import ai.hanzo.api.core.Enum
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

class UserCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val key: JsonField<String>,
    private val token: JsonField<String>,
    private val aliases: JsonField<Aliases>,
    private val allowedCacheControls: JsonField<List<JsonValue>>,
    private val allowedPassthroughRoutes: JsonField<List<JsonValue>>,
    private val allowedRoutes: JsonField<List<JsonValue>>,
    private val allowedVectorStoreIndexes: JsonField<List<AllowedVectorStoreIndex>>,
    private val blocked: JsonField<Boolean>,
    private val budgetDuration: JsonField<String>,
    private val budgetId: JsonField<String>,
    private val config: JsonField<Config>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val duration: JsonField<String>,
    private val enforcedParams: JsonField<List<String>>,
    private val expires: JsonField<OffsetDateTime>,
    private val guardrails: JsonField<List<String>>,
    private val keyAlias: JsonField<String>,
    private val keyName: JsonField<String>,
    private val litellmBudgetTable: JsonValue,
    private val maxBudget: JsonField<Double>,
    private val maxParallelRequests: JsonField<Long>,
    private val metadata: JsonField<Metadata>,
    private val modelMaxBudget: JsonField<ModelMaxBudget>,
    private val modelRpmLimit: JsonField<ModelRpmLimit>,
    private val modelTpmLimit: JsonField<ModelTpmLimit>,
    private val models: JsonField<List<JsonValue>>,
    private val objectPermission: JsonField<ObjectPermission>,
    private val organizationId: JsonField<String>,
    private val permissions: JsonField<Permissions>,
    private val prompts: JsonField<List<String>>,
    private val routerSettings: JsonField<RouterSettings>,
    private val rpmLimit: JsonField<Long>,
    private val rpmLimitType: JsonField<RpmLimitType>,
    private val spend: JsonField<Double>,
    private val tags: JsonField<List<String>>,
    private val teamId: JsonField<String>,
    private val teams: JsonField<List<JsonValue>>,
    private val tokenId: JsonField<String>,
    private val tpmLimit: JsonField<Long>,
    private val tpmLimitType: JsonField<TpmLimitType>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val userAlias: JsonField<String>,
    private val userEmail: JsonField<String>,
    private val userId: JsonField<String>,
    private val userRole: JsonField<UserRole>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("aliases") @ExcludeMissing aliases: JsonField<Aliases> = JsonMissing.of(),
        @JsonProperty("allowed_cache_controls")
        @ExcludeMissing
        allowedCacheControls: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("allowed_passthrough_routes")
        @ExcludeMissing
        allowedPassthroughRoutes: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("allowed_routes")
        @ExcludeMissing
        allowedRoutes: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("allowed_vector_store_indexes")
        @ExcludeMissing
        allowedVectorStoreIndexes: JsonField<List<AllowedVectorStoreIndex>> = JsonMissing.of(),
        @JsonProperty("blocked") @ExcludeMissing blocked: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("budget_duration")
        @ExcludeMissing
        budgetDuration: JsonField<String> = JsonMissing.of(),
        @JsonProperty("budget_id") @ExcludeMissing budgetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("config") @ExcludeMissing config: JsonField<Config> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created_by") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("duration") @ExcludeMissing duration: JsonField<String> = JsonMissing.of(),
        @JsonProperty("enforced_params")
        @ExcludeMissing
        enforcedParams: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("expires")
        @ExcludeMissing
        expires: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("guardrails")
        @ExcludeMissing
        guardrails: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("key_alias") @ExcludeMissing keyAlias: JsonField<String> = JsonMissing.of(),
        @JsonProperty("key_name") @ExcludeMissing keyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("litellm_budget_table")
        @ExcludeMissing
        litellmBudgetTable: JsonValue = JsonMissing.of(),
        @JsonProperty("max_budget") @ExcludeMissing maxBudget: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("max_parallel_requests")
        @ExcludeMissing
        maxParallelRequests: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("model_max_budget")
        @ExcludeMissing
        modelMaxBudget: JsonField<ModelMaxBudget> = JsonMissing.of(),
        @JsonProperty("model_rpm_limit")
        @ExcludeMissing
        modelRpmLimit: JsonField<ModelRpmLimit> = JsonMissing.of(),
        @JsonProperty("model_tpm_limit")
        @ExcludeMissing
        modelTpmLimit: JsonField<ModelTpmLimit> = JsonMissing.of(),
        @JsonProperty("models")
        @ExcludeMissing
        models: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("object_permission")
        @ExcludeMissing
        objectPermission: JsonField<ObjectPermission> = JsonMissing.of(),
        @JsonProperty("organization_id")
        @ExcludeMissing
        organizationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("permissions")
        @ExcludeMissing
        permissions: JsonField<Permissions> = JsonMissing.of(),
        @JsonProperty("prompts")
        @ExcludeMissing
        prompts: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("router_settings")
        @ExcludeMissing
        routerSettings: JsonField<RouterSettings> = JsonMissing.of(),
        @JsonProperty("rpm_limit") @ExcludeMissing rpmLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("rpm_limit_type")
        @ExcludeMissing
        rpmLimitType: JsonField<RpmLimitType> = JsonMissing.of(),
        @JsonProperty("spend") @ExcludeMissing spend: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("team_id") @ExcludeMissing teamId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("teams") @ExcludeMissing teams: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("token_id") @ExcludeMissing tokenId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tpm_limit") @ExcludeMissing tpmLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("tpm_limit_type")
        @ExcludeMissing
        tpmLimitType: JsonField<TpmLimitType> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updated_by") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_alias") @ExcludeMissing userAlias: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_email") @ExcludeMissing userEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_role") @ExcludeMissing userRole: JsonField<UserRole> = JsonMissing.of(),
    ) : this(
        key,
        token,
        aliases,
        allowedCacheControls,
        allowedPassthroughRoutes,
        allowedRoutes,
        allowedVectorStoreIndexes,
        blocked,
        budgetDuration,
        budgetId,
        config,
        createdAt,
        createdBy,
        duration,
        enforcedParams,
        expires,
        guardrails,
        keyAlias,
        keyName,
        litellmBudgetTable,
        maxBudget,
        maxParallelRequests,
        metadata,
        modelMaxBudget,
        modelRpmLimit,
        modelTpmLimit,
        models,
        objectPermission,
        organizationId,
        permissions,
        prompts,
        routerSettings,
        rpmLimit,
        rpmLimitType,
        spend,
        tags,
        teamId,
        teams,
        tokenId,
        tpmLimit,
        tpmLimitType,
        updatedAt,
        updatedBy,
        userAlias,
        userEmail,
        userId,
        userRole,
        mutableMapOf(),
    )

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun key(): String = key.getRequired("key")

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
    fun allowedPassthroughRoutes(): List<JsonValue>? =
        allowedPassthroughRoutes.getNullable("allowed_passthrough_routes")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowedRoutes(): List<JsonValue>? = allowedRoutes.getNullable("allowed_routes")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowedVectorStoreIndexes(): List<AllowedVectorStoreIndex>? =
        allowedVectorStoreIndexes.getNullable("allowed_vector_store_indexes")

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
    fun budgetId(): String? = budgetId.getNullable("budget_id")

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
    fun duration(): String? = duration.getNullable("duration")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enforcedParams(): List<String>? = enforcedParams.getNullable("enforced_params")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expires(): OffsetDateTime? = expires.getNullable("expires")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun guardrails(): List<String>? = guardrails.getNullable("guardrails")

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
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = userCreateResponse.litellmBudgetTable().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("litellm_budget_table")
    @ExcludeMissing
    fun _litellmBudgetTable(): JsonValue = litellmBudgetTable

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
    fun modelRpmLimit(): ModelRpmLimit? = modelRpmLimit.getNullable("model_rpm_limit")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modelTpmLimit(): ModelTpmLimit? = modelTpmLimit.getNullable("model_tpm_limit")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun models(): List<JsonValue>? = models.getNullable("models")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectPermission(): ObjectPermission? = objectPermission.getNullable("object_permission")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun organizationId(): String? = organizationId.getNullable("organization_id")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun permissions(): Permissions? = permissions.getNullable("permissions")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prompts(): List<String>? = prompts.getNullable("prompts")

    /**
     * Set of params that you can modify via `router.update_settings()`.
     *
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
    fun rpmLimitType(): RpmLimitType? = rpmLimitType.getNullable("rpm_limit_type")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spend(): Double? = spend.getNullable("spend")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): List<String>? = tags.getNullable("tags")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun teamId(): String? = teamId.getNullable("team_id")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun teams(): List<JsonValue>? = teams.getNullable("teams")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tokenId(): String? = tokenId.getNullable("token_id")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tpmLimit(): Long? = tpmLimit.getNullable("tpm_limit")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tpmLimitType(): TpmLimitType? = tpmLimitType.getNullable("tpm_limit_type")

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
    fun userAlias(): String? = userAlias.getNullable("user_alias")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userEmail(): String? = userEmail.getNullable("user_email")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): String? = userId.getNullable("user_id")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userRole(): UserRole? = userRole.getNullable("user_role")

    /**
     * Returns the raw JSON value of [key].
     *
     * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

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
     * Returns the raw JSON value of [allowedPassthroughRoutes].
     *
     * Unlike [allowedPassthroughRoutes], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("allowed_passthrough_routes")
    @ExcludeMissing
    fun _allowedPassthroughRoutes(): JsonField<List<JsonValue>> = allowedPassthroughRoutes

    /**
     * Returns the raw JSON value of [allowedRoutes].
     *
     * Unlike [allowedRoutes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("allowed_routes")
    @ExcludeMissing
    fun _allowedRoutes(): JsonField<List<JsonValue>> = allowedRoutes

    /**
     * Returns the raw JSON value of [allowedVectorStoreIndexes].
     *
     * Unlike [allowedVectorStoreIndexes], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("allowed_vector_store_indexes")
    @ExcludeMissing
    fun _allowedVectorStoreIndexes(): JsonField<List<AllowedVectorStoreIndex>> =
        allowedVectorStoreIndexes

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
     * Returns the raw JSON value of [budgetId].
     *
     * Unlike [budgetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("budget_id") @ExcludeMissing fun _budgetId(): JsonField<String> = budgetId

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
     * Returns the raw JSON value of [duration].
     *
     * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<String> = duration

    /**
     * Returns the raw JSON value of [enforcedParams].
     *
     * Unlike [enforcedParams], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enforced_params")
    @ExcludeMissing
    fun _enforcedParams(): JsonField<List<String>> = enforcedParams

    /**
     * Returns the raw JSON value of [expires].
     *
     * Unlike [expires], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires") @ExcludeMissing fun _expires(): JsonField<OffsetDateTime> = expires

    /**
     * Returns the raw JSON value of [guardrails].
     *
     * Unlike [guardrails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("guardrails")
    @ExcludeMissing
    fun _guardrails(): JsonField<List<String>> = guardrails

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
     * Returns the raw JSON value of [modelRpmLimit].
     *
     * Unlike [modelRpmLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model_rpm_limit")
    @ExcludeMissing
    fun _modelRpmLimit(): JsonField<ModelRpmLimit> = modelRpmLimit

    /**
     * Returns the raw JSON value of [modelTpmLimit].
     *
     * Unlike [modelTpmLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model_tpm_limit")
    @ExcludeMissing
    fun _modelTpmLimit(): JsonField<ModelTpmLimit> = modelTpmLimit

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
     * Returns the raw JSON value of [organizationId].
     *
     * Unlike [organizationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("organization_id")
    @ExcludeMissing
    fun _organizationId(): JsonField<String> = organizationId

    /**
     * Returns the raw JSON value of [permissions].
     *
     * Unlike [permissions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("permissions")
    @ExcludeMissing
    fun _permissions(): JsonField<Permissions> = permissions

    /**
     * Returns the raw JSON value of [prompts].
     *
     * Unlike [prompts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompts") @ExcludeMissing fun _prompts(): JsonField<List<String>> = prompts

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
     * Returns the raw JSON value of [rpmLimitType].
     *
     * Unlike [rpmLimitType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rpm_limit_type")
    @ExcludeMissing
    fun _rpmLimitType(): JsonField<RpmLimitType> = rpmLimitType

    /**
     * Returns the raw JSON value of [spend].
     *
     * Unlike [spend], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spend") @ExcludeMissing fun _spend(): JsonField<Double> = spend

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    /**
     * Returns the raw JSON value of [teamId].
     *
     * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("team_id") @ExcludeMissing fun _teamId(): JsonField<String> = teamId

    /**
     * Returns the raw JSON value of [teams].
     *
     * Unlike [teams], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("teams") @ExcludeMissing fun _teams(): JsonField<List<JsonValue>> = teams

    /**
     * Returns the raw JSON value of [tokenId].
     *
     * Unlike [tokenId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token_id") @ExcludeMissing fun _tokenId(): JsonField<String> = tokenId

    /**
     * Returns the raw JSON value of [tpmLimit].
     *
     * Unlike [tpmLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tpm_limit") @ExcludeMissing fun _tpmLimit(): JsonField<Long> = tpmLimit

    /**
     * Returns the raw JSON value of [tpmLimitType].
     *
     * Unlike [tpmLimitType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tpm_limit_type")
    @ExcludeMissing
    fun _tpmLimitType(): JsonField<TpmLimitType> = tpmLimitType

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
     * Returns the raw JSON value of [userAlias].
     *
     * Unlike [userAlias], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_alias") @ExcludeMissing fun _userAlias(): JsonField<String> = userAlias

    /**
     * Returns the raw JSON value of [userEmail].
     *
     * Unlike [userEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_email") @ExcludeMissing fun _userEmail(): JsonField<String> = userEmail

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    /**
     * Returns the raw JSON value of [userRole].
     *
     * Unlike [userRole], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_role") @ExcludeMissing fun _userRole(): JsonField<UserRole> = userRole

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
         * Returns a mutable builder for constructing an instance of [UserCreateResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .key()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [UserCreateResponse]. */
    class Builder internal constructor() {

        private var key: JsonField<String>? = null
        private var token: JsonField<String> = JsonMissing.of()
        private var aliases: JsonField<Aliases> = JsonMissing.of()
        private var allowedCacheControls: JsonField<MutableList<JsonValue>>? = null
        private var allowedPassthroughRoutes: JsonField<MutableList<JsonValue>>? = null
        private var allowedRoutes: JsonField<MutableList<JsonValue>>? = null
        private var allowedVectorStoreIndexes: JsonField<MutableList<AllowedVectorStoreIndex>>? =
            null
        private var blocked: JsonField<Boolean> = JsonMissing.of()
        private var budgetDuration: JsonField<String> = JsonMissing.of()
        private var budgetId: JsonField<String> = JsonMissing.of()
        private var config: JsonField<Config> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var duration: JsonField<String> = JsonMissing.of()
        private var enforcedParams: JsonField<MutableList<String>>? = null
        private var expires: JsonField<OffsetDateTime> = JsonMissing.of()
        private var guardrails: JsonField<MutableList<String>>? = null
        private var keyAlias: JsonField<String> = JsonMissing.of()
        private var keyName: JsonField<String> = JsonMissing.of()
        private var litellmBudgetTable: JsonValue = JsonMissing.of()
        private var maxBudget: JsonField<Double> = JsonMissing.of()
        private var maxParallelRequests: JsonField<Long> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var modelMaxBudget: JsonField<ModelMaxBudget> = JsonMissing.of()
        private var modelRpmLimit: JsonField<ModelRpmLimit> = JsonMissing.of()
        private var modelTpmLimit: JsonField<ModelTpmLimit> = JsonMissing.of()
        private var models: JsonField<MutableList<JsonValue>>? = null
        private var objectPermission: JsonField<ObjectPermission> = JsonMissing.of()
        private var organizationId: JsonField<String> = JsonMissing.of()
        private var permissions: JsonField<Permissions> = JsonMissing.of()
        private var prompts: JsonField<MutableList<String>>? = null
        private var routerSettings: JsonField<RouterSettings> = JsonMissing.of()
        private var rpmLimit: JsonField<Long> = JsonMissing.of()
        private var rpmLimitType: JsonField<RpmLimitType> = JsonMissing.of()
        private var spend: JsonField<Double> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var teamId: JsonField<String> = JsonMissing.of()
        private var teams: JsonField<MutableList<JsonValue>>? = null
        private var tokenId: JsonField<String> = JsonMissing.of()
        private var tpmLimit: JsonField<Long> = JsonMissing.of()
        private var tpmLimitType: JsonField<TpmLimitType> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var userAlias: JsonField<String> = JsonMissing.of()
        private var userEmail: JsonField<String> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var userRole: JsonField<UserRole> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(userCreateResponse: UserCreateResponse) = apply {
            key = userCreateResponse.key
            token = userCreateResponse.token
            aliases = userCreateResponse.aliases
            allowedCacheControls =
                userCreateResponse.allowedCacheControls.map { it.toMutableList() }
            allowedPassthroughRoutes =
                userCreateResponse.allowedPassthroughRoutes.map { it.toMutableList() }
            allowedRoutes = userCreateResponse.allowedRoutes.map { it.toMutableList() }
            allowedVectorStoreIndexes =
                userCreateResponse.allowedVectorStoreIndexes.map { it.toMutableList() }
            blocked = userCreateResponse.blocked
            budgetDuration = userCreateResponse.budgetDuration
            budgetId = userCreateResponse.budgetId
            config = userCreateResponse.config
            createdAt = userCreateResponse.createdAt
            createdBy = userCreateResponse.createdBy
            duration = userCreateResponse.duration
            enforcedParams = userCreateResponse.enforcedParams.map { it.toMutableList() }
            expires = userCreateResponse.expires
            guardrails = userCreateResponse.guardrails.map { it.toMutableList() }
            keyAlias = userCreateResponse.keyAlias
            keyName = userCreateResponse.keyName
            litellmBudgetTable = userCreateResponse.litellmBudgetTable
            maxBudget = userCreateResponse.maxBudget
            maxParallelRequests = userCreateResponse.maxParallelRequests
            metadata = userCreateResponse.metadata
            modelMaxBudget = userCreateResponse.modelMaxBudget
            modelRpmLimit = userCreateResponse.modelRpmLimit
            modelTpmLimit = userCreateResponse.modelTpmLimit
            models = userCreateResponse.models.map { it.toMutableList() }
            objectPermission = userCreateResponse.objectPermission
            organizationId = userCreateResponse.organizationId
            permissions = userCreateResponse.permissions
            prompts = userCreateResponse.prompts.map { it.toMutableList() }
            routerSettings = userCreateResponse.routerSettings
            rpmLimit = userCreateResponse.rpmLimit
            rpmLimitType = userCreateResponse.rpmLimitType
            spend = userCreateResponse.spend
            tags = userCreateResponse.tags.map { it.toMutableList() }
            teamId = userCreateResponse.teamId
            teams = userCreateResponse.teams.map { it.toMutableList() }
            tokenId = userCreateResponse.tokenId
            tpmLimit = userCreateResponse.tpmLimit
            tpmLimitType = userCreateResponse.tpmLimitType
            updatedAt = userCreateResponse.updatedAt
            updatedBy = userCreateResponse.updatedBy
            userAlias = userCreateResponse.userAlias
            userEmail = userCreateResponse.userEmail
            userId = userCreateResponse.userId
            userRole = userCreateResponse.userRole
            additionalProperties = userCreateResponse.additionalProperties.toMutableMap()
        }

        fun key(key: String) = key(JsonField.of(key))

        /**
         * Sets [Builder.key] to an arbitrary JSON value.
         *
         * You should usually call [Builder.key] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun key(key: JsonField<String>) = apply { this.key = key }

        fun token(token: String?) = token(JsonField.ofNullable(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun aliases(aliases: Aliases?) = aliases(JsonField.ofNullable(aliases))

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

        fun allowedPassthroughRoutes(allowedPassthroughRoutes: List<JsonValue>?) =
            allowedPassthroughRoutes(JsonField.ofNullable(allowedPassthroughRoutes))

        /**
         * Sets [Builder.allowedPassthroughRoutes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedPassthroughRoutes] with a well-typed
         * `List<JsonValue>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun allowedPassthroughRoutes(allowedPassthroughRoutes: JsonField<List<JsonValue>>) = apply {
            this.allowedPassthroughRoutes = allowedPassthroughRoutes.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [allowedPassthroughRoutes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllowedPassthroughRoute(allowedPassthroughRoute: JsonValue) = apply {
            allowedPassthroughRoutes =
                (allowedPassthroughRoutes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("allowedPassthroughRoutes", it).add(allowedPassthroughRoute)
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

        fun allowedVectorStoreIndexes(allowedVectorStoreIndexes: List<AllowedVectorStoreIndex>?) =
            allowedVectorStoreIndexes(JsonField.ofNullable(allowedVectorStoreIndexes))

        /**
         * Sets [Builder.allowedVectorStoreIndexes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedVectorStoreIndexes] with a well-typed
         * `List<AllowedVectorStoreIndex>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun allowedVectorStoreIndexes(
            allowedVectorStoreIndexes: JsonField<List<AllowedVectorStoreIndex>>
        ) = apply {
            this.allowedVectorStoreIndexes = allowedVectorStoreIndexes.map { it.toMutableList() }
        }

        /**
         * Adds a single [AllowedVectorStoreIndex] to [allowedVectorStoreIndexes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllowedVectorStoreIndex(allowedVectorStoreIndex: AllowedVectorStoreIndex) = apply {
            allowedVectorStoreIndexes =
                (allowedVectorStoreIndexes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("allowedVectorStoreIndexes", it).add(allowedVectorStoreIndex)
                }
        }

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

        fun budgetId(budgetId: String?) = budgetId(JsonField.ofNullable(budgetId))

        /**
         * Sets [Builder.budgetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.budgetId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun budgetId(budgetId: JsonField<String>) = apply { this.budgetId = budgetId }

        fun config(config: Config?) = config(JsonField.ofNullable(config))

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

        fun duration(duration: String?) = duration(JsonField.ofNullable(duration))

        /**
         * Sets [Builder.duration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.duration] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun duration(duration: JsonField<String>) = apply { this.duration = duration }

        fun enforcedParams(enforcedParams: List<String>?) =
            enforcedParams(JsonField.ofNullable(enforcedParams))

        /**
         * Sets [Builder.enforcedParams] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enforcedParams] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enforcedParams(enforcedParams: JsonField<List<String>>) = apply {
            this.enforcedParams = enforcedParams.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [enforcedParams].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEnforcedParam(enforcedParam: String) = apply {
            enforcedParams =
                (enforcedParams ?: JsonField.of(mutableListOf())).also {
                    checkKnown("enforcedParams", it).add(enforcedParam)
                }
        }

        fun expires(expires: OffsetDateTime?) = expires(JsonField.ofNullable(expires))

        /**
         * Sets [Builder.expires] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expires] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expires(expires: JsonField<OffsetDateTime>) = apply { this.expires = expires }

        fun guardrails(guardrails: List<String>?) = guardrails(JsonField.ofNullable(guardrails))

        /**
         * Sets [Builder.guardrails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.guardrails] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun guardrails(guardrails: JsonField<List<String>>) = apply {
            this.guardrails = guardrails.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [guardrails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGuardrail(guardrail: String) = apply {
            guardrails =
                (guardrails ?: JsonField.of(mutableListOf())).also {
                    checkKnown("guardrails", it).add(guardrail)
                }
        }

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

        fun litellmBudgetTable(litellmBudgetTable: JsonValue) = apply {
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

        fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun modelMaxBudget(modelMaxBudget: ModelMaxBudget?) =
            modelMaxBudget(JsonField.ofNullable(modelMaxBudget))

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

        fun modelRpmLimit(modelRpmLimit: ModelRpmLimit?) =
            modelRpmLimit(JsonField.ofNullable(modelRpmLimit))

        /**
         * Sets [Builder.modelRpmLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelRpmLimit] with a well-typed [ModelRpmLimit] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun modelRpmLimit(modelRpmLimit: JsonField<ModelRpmLimit>) = apply {
            this.modelRpmLimit = modelRpmLimit
        }

        fun modelTpmLimit(modelTpmLimit: ModelTpmLimit?) =
            modelTpmLimit(JsonField.ofNullable(modelTpmLimit))

        /**
         * Sets [Builder.modelTpmLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelTpmLimit] with a well-typed [ModelTpmLimit] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun modelTpmLimit(modelTpmLimit: JsonField<ModelTpmLimit>) = apply {
            this.modelTpmLimit = modelTpmLimit
        }

        fun models(models: List<JsonValue>?) = models(JsonField.ofNullable(models))

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

        fun permissions(permissions: Permissions?) = permissions(JsonField.ofNullable(permissions))

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

        fun prompts(prompts: List<String>?) = prompts(JsonField.ofNullable(prompts))

        /**
         * Sets [Builder.prompts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prompts] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun prompts(prompts: JsonField<List<String>>) = apply {
            this.prompts = prompts.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [prompts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPrompt(prompt: String) = apply {
            prompts =
                (prompts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("prompts", it).add(prompt)
                }
        }

        /** Set of params that you can modify via `router.update_settings()`. */
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

        fun rpmLimitType(rpmLimitType: RpmLimitType?) =
            rpmLimitType(JsonField.ofNullable(rpmLimitType))

        /**
         * Sets [Builder.rpmLimitType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rpmLimitType] with a well-typed [RpmLimitType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rpmLimitType(rpmLimitType: JsonField<RpmLimitType>) = apply {
            this.rpmLimitType = rpmLimitType
        }

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

        fun tags(tags: List<String>?) = tags(JsonField.ofNullable(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply {
            this.tags = tags.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply {
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
        }

        fun teamId(teamId: String?) = teamId(JsonField.ofNullable(teamId))

        /**
         * Sets [Builder.teamId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teamId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun teamId(teamId: JsonField<String>) = apply { this.teamId = teamId }

        fun teams(teams: List<JsonValue>?) = teams(JsonField.ofNullable(teams))

        /**
         * Sets [Builder.teams] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teams] with a well-typed `List<JsonValue>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun teams(teams: JsonField<List<JsonValue>>) = apply {
            this.teams = teams.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [teams].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTeam(team: JsonValue) = apply {
            teams =
                (teams ?: JsonField.of(mutableListOf())).also { checkKnown("teams", it).add(team) }
        }

        fun tokenId(tokenId: String?) = tokenId(JsonField.ofNullable(tokenId))

        /**
         * Sets [Builder.tokenId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tokenId(tokenId: JsonField<String>) = apply { this.tokenId = tokenId }

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

        fun tpmLimitType(tpmLimitType: TpmLimitType?) =
            tpmLimitType(JsonField.ofNullable(tpmLimitType))

        /**
         * Sets [Builder.tpmLimitType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tpmLimitType] with a well-typed [TpmLimitType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tpmLimitType(tpmLimitType: JsonField<TpmLimitType>) = apply {
            this.tpmLimitType = tpmLimitType
        }

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

        fun userAlias(userAlias: String?) = userAlias(JsonField.ofNullable(userAlias))

        /**
         * Sets [Builder.userAlias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userAlias] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userAlias(userAlias: JsonField<String>) = apply { this.userAlias = userAlias }

        fun userEmail(userEmail: String?) = userEmail(JsonField.ofNullable(userEmail))

        /**
         * Sets [Builder.userEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userEmail(userEmail: JsonField<String>) = apply { this.userEmail = userEmail }

        fun userId(userId: String?) = userId(JsonField.ofNullable(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        fun userRole(userRole: UserRole?) = userRole(JsonField.ofNullable(userRole))

        /**
         * Sets [Builder.userRole] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userRole] with a well-typed [UserRole] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userRole(userRole: JsonField<UserRole>) = apply { this.userRole = userRole }

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
         * Returns an immutable instance of [UserCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .key()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UserCreateResponse =
            UserCreateResponse(
                checkRequired("key", key),
                token,
                aliases,
                (allowedCacheControls ?: JsonMissing.of()).map { it.toImmutable() },
                (allowedPassthroughRoutes ?: JsonMissing.of()).map { it.toImmutable() },
                (allowedRoutes ?: JsonMissing.of()).map { it.toImmutable() },
                (allowedVectorStoreIndexes ?: JsonMissing.of()).map { it.toImmutable() },
                blocked,
                budgetDuration,
                budgetId,
                config,
                createdAt,
                createdBy,
                duration,
                (enforcedParams ?: JsonMissing.of()).map { it.toImmutable() },
                expires,
                (guardrails ?: JsonMissing.of()).map { it.toImmutable() },
                keyAlias,
                keyName,
                litellmBudgetTable,
                maxBudget,
                maxParallelRequests,
                metadata,
                modelMaxBudget,
                modelRpmLimit,
                modelTpmLimit,
                (models ?: JsonMissing.of()).map { it.toImmutable() },
                objectPermission,
                organizationId,
                permissions,
                (prompts ?: JsonMissing.of()).map { it.toImmutable() },
                routerSettings,
                rpmLimit,
                rpmLimitType,
                spend,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                teamId,
                (teams ?: JsonMissing.of()).map { it.toImmutable() },
                tokenId,
                tpmLimit,
                tpmLimitType,
                updatedAt,
                updatedBy,
                userAlias,
                userEmail,
                userId,
                userRole,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UserCreateResponse = apply {
        if (validated) {
            return@apply
        }

        key()
        token()
        aliases()?.validate()
        allowedCacheControls()
        allowedPassthroughRoutes()
        allowedRoutes()
        allowedVectorStoreIndexes()?.forEach { it.validate() }
        blocked()
        budgetDuration()
        budgetId()
        config()?.validate()
        createdAt()
        createdBy()
        duration()
        enforcedParams()
        expires()
        guardrails()
        keyAlias()
        keyName()
        maxBudget()
        maxParallelRequests()
        metadata()?.validate()
        modelMaxBudget()?.validate()
        modelRpmLimit()?.validate()
        modelTpmLimit()?.validate()
        models()
        objectPermission()?.validate()
        organizationId()
        permissions()?.validate()
        prompts()
        routerSettings()?.validate()
        rpmLimit()
        rpmLimitType()?.validate()
        spend()
        tags()
        teamId()
        teams()
        tokenId()
        tpmLimit()
        tpmLimitType()?.validate()
        updatedAt()
        updatedBy()
        userAlias()
        userEmail()
        userId()
        userRole()?.validate()
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
        (if (key.asKnown() == null) 0 else 1) +
            (if (token.asKnown() == null) 0 else 1) +
            (aliases.asKnown()?.validity() ?: 0) +
            (allowedCacheControls.asKnown()?.size ?: 0) +
            (allowedPassthroughRoutes.asKnown()?.size ?: 0) +
            (allowedRoutes.asKnown()?.size ?: 0) +
            (allowedVectorStoreIndexes.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (blocked.asKnown() == null) 0 else 1) +
            (if (budgetDuration.asKnown() == null) 0 else 1) +
            (if (budgetId.asKnown() == null) 0 else 1) +
            (config.asKnown()?.validity() ?: 0) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (createdBy.asKnown() == null) 0 else 1) +
            (if (duration.asKnown() == null) 0 else 1) +
            (enforcedParams.asKnown()?.size ?: 0) +
            (if (expires.asKnown() == null) 0 else 1) +
            (guardrails.asKnown()?.size ?: 0) +
            (if (keyAlias.asKnown() == null) 0 else 1) +
            (if (keyName.asKnown() == null) 0 else 1) +
            (if (maxBudget.asKnown() == null) 0 else 1) +
            (if (maxParallelRequests.asKnown() == null) 0 else 1) +
            (metadata.asKnown()?.validity() ?: 0) +
            (modelMaxBudget.asKnown()?.validity() ?: 0) +
            (modelRpmLimit.asKnown()?.validity() ?: 0) +
            (modelTpmLimit.asKnown()?.validity() ?: 0) +
            (models.asKnown()?.size ?: 0) +
            (objectPermission.asKnown()?.validity() ?: 0) +
            (if (organizationId.asKnown() == null) 0 else 1) +
            (permissions.asKnown()?.validity() ?: 0) +
            (prompts.asKnown()?.size ?: 0) +
            (routerSettings.asKnown()?.validity() ?: 0) +
            (if (rpmLimit.asKnown() == null) 0 else 1) +
            (rpmLimitType.asKnown()?.validity() ?: 0) +
            (if (spend.asKnown() == null) 0 else 1) +
            (tags.asKnown()?.size ?: 0) +
            (if (teamId.asKnown() == null) 0 else 1) +
            (teams.asKnown()?.size ?: 0) +
            (if (tokenId.asKnown() == null) 0 else 1) +
            (if (tpmLimit.asKnown() == null) 0 else 1) +
            (tpmLimitType.asKnown()?.validity() ?: 0) +
            (if (updatedAt.asKnown() == null) 0 else 1) +
            (if (updatedBy.asKnown() == null) 0 else 1) +
            (if (userAlias.asKnown() == null) 0 else 1) +
            (if (userEmail.asKnown() == null) 0 else 1) +
            (if (userId.asKnown() == null) 0 else 1) +
            (userRole.asKnown()?.validity() ?: 0)

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

    class AllowedVectorStoreIndex
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val indexName: JsonField<String>,
        private val indexPermissions: JsonField<List<IndexPermission>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("index_name")
            @ExcludeMissing
            indexName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("index_permissions")
            @ExcludeMissing
            indexPermissions: JsonField<List<IndexPermission>> = JsonMissing.of(),
        ) : this(indexName, indexPermissions, mutableMapOf())

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun indexName(): String = indexName.getRequired("index_name")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun indexPermissions(): List<IndexPermission> =
            indexPermissions.getRequired("index_permissions")

        /**
         * Returns the raw JSON value of [indexName].
         *
         * Unlike [indexName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("index_name") @ExcludeMissing fun _indexName(): JsonField<String> = indexName

        /**
         * Returns the raw JSON value of [indexPermissions].
         *
         * Unlike [indexPermissions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("index_permissions")
        @ExcludeMissing
        fun _indexPermissions(): JsonField<List<IndexPermission>> = indexPermissions

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
             * Returns a mutable builder for constructing an instance of [AllowedVectorStoreIndex].
             *
             * The following fields are required:
             * ```kotlin
             * .indexName()
             * .indexPermissions()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [AllowedVectorStoreIndex]. */
        class Builder internal constructor() {

            private var indexName: JsonField<String>? = null
            private var indexPermissions: JsonField<MutableList<IndexPermission>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(allowedVectorStoreIndex: AllowedVectorStoreIndex) = apply {
                indexName = allowedVectorStoreIndex.indexName
                indexPermissions =
                    allowedVectorStoreIndex.indexPermissions.map { it.toMutableList() }
                additionalProperties = allowedVectorStoreIndex.additionalProperties.toMutableMap()
            }

            fun indexName(indexName: String) = indexName(JsonField.of(indexName))

            /**
             * Sets [Builder.indexName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.indexName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun indexName(indexName: JsonField<String>) = apply { this.indexName = indexName }

            fun indexPermissions(indexPermissions: List<IndexPermission>) =
                indexPermissions(JsonField.of(indexPermissions))

            /**
             * Sets [Builder.indexPermissions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.indexPermissions] with a well-typed
             * `List<IndexPermission>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun indexPermissions(indexPermissions: JsonField<List<IndexPermission>>) = apply {
                this.indexPermissions = indexPermissions.map { it.toMutableList() }
            }

            /**
             * Adds a single [IndexPermission] to [indexPermissions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addIndexPermission(indexPermission: IndexPermission) = apply {
                indexPermissions =
                    (indexPermissions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("indexPermissions", it).add(indexPermission)
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
             * Returns an immutable instance of [AllowedVectorStoreIndex].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .indexName()
             * .indexPermissions()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AllowedVectorStoreIndex =
                AllowedVectorStoreIndex(
                    checkRequired("indexName", indexName),
                    checkRequired("indexPermissions", indexPermissions).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AllowedVectorStoreIndex = apply {
            if (validated) {
                return@apply
            }

            indexName()
            indexPermissions().forEach { it.validate() }
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
            (if (indexName.asKnown() == null) 0 else 1) +
                (indexPermissions.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        class IndexPermission
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val READ = of("read")

                val WRITE = of("write")

                fun of(value: String) = IndexPermission(JsonField.of(value))
            }

            /** An enum containing [IndexPermission]'s known values. */
            enum class Known {
                READ,
                WRITE,
            }

            /**
             * An enum containing [IndexPermission]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [IndexPermission] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                READ,
                WRITE,
                /**
                 * An enum member indicating that [IndexPermission] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    READ -> Value.READ
                    WRITE -> Value.WRITE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws HanzoInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    READ -> Known.READ
                    WRITE -> Known.WRITE
                    else -> throw HanzoInvalidDataException("Unknown IndexPermission: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws HanzoInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw HanzoInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            fun validate(): IndexPermission = apply {
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

                return other is IndexPermission && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AllowedVectorStoreIndex &&
                indexName == other.indexName &&
                indexPermissions == other.indexPermissions &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(indexName, indexPermissions, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AllowedVectorStoreIndex{indexName=$indexName, indexPermissions=$indexPermissions, additionalProperties=$additionalProperties}"
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

    class ModelRpmLimit
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

            /** Returns a mutable builder for constructing an instance of [ModelRpmLimit]. */
            fun builder() = Builder()
        }

        /** A builder for [ModelRpmLimit]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(modelRpmLimit: ModelRpmLimit) = apply {
                additionalProperties = modelRpmLimit.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ModelRpmLimit].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ModelRpmLimit = ModelRpmLimit(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ModelRpmLimit = apply {
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

            return other is ModelRpmLimit && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ModelRpmLimit{additionalProperties=$additionalProperties}"
    }

    class ModelTpmLimit
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

            /** Returns a mutable builder for constructing an instance of [ModelTpmLimit]. */
            fun builder() = Builder()
        }

        /** A builder for [ModelTpmLimit]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(modelTpmLimit: ModelTpmLimit) = apply {
                additionalProperties = modelTpmLimit.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ModelTpmLimit].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ModelTpmLimit = ModelTpmLimit(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ModelTpmLimit = apply {
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

            return other is ModelTpmLimit && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ModelTpmLimit{additionalProperties=$additionalProperties}"
    }

    class ObjectPermission
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
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
            agentAccessGroups,
            agents,
            mcpAccessGroups,
            mcpServers,
            mcpToolPermissions,
            vectorStores,
            mutableMapOf(),
        )

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

            /** Returns a mutable builder for constructing an instance of [ObjectPermission]. */
            fun builder() = Builder()
        }

        /** A builder for [ObjectPermission]. */
        class Builder internal constructor() {

            private var agentAccessGroups: JsonField<MutableList<String>>? = null
            private var agents: JsonField<MutableList<String>>? = null
            private var mcpAccessGroups: JsonField<MutableList<String>>? = null
            private var mcpServers: JsonField<MutableList<String>>? = null
            private var mcpToolPermissions: JsonField<McpToolPermissions> = JsonMissing.of()
            private var vectorStores: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(objectPermission: ObjectPermission) = apply {
                agentAccessGroups = objectPermission.agentAccessGroups.map { it.toMutableList() }
                agents = objectPermission.agents.map { it.toMutableList() }
                mcpAccessGroups = objectPermission.mcpAccessGroups.map { it.toMutableList() }
                mcpServers = objectPermission.mcpServers.map { it.toMutableList() }
                mcpToolPermissions = objectPermission.mcpToolPermissions
                vectorStores = objectPermission.vectorStores.map { it.toMutableList() }
                additionalProperties = objectPermission.additionalProperties.toMutableMap()
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
             */
            fun build(): ObjectPermission =
                ObjectPermission(
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
            "ObjectPermission{agentAccessGroups=$agentAccessGroups, agents=$agents, mcpAccessGroups=$mcpAccessGroups, mcpServers=$mcpServers, mcpToolPermissions=$mcpToolPermissions, vectorStores=$vectorStores, additionalProperties=$additionalProperties}"
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

    /** Set of params that you can modify via `router.update_settings()`. */
    class RouterSettings
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val allowedFails: JsonField<Long>,
        private val contextWindowFallbacks: JsonField<List<ContextWindowFallback>>,
        private val cooldownTime: JsonField<Double>,
        private val fallbacks: JsonField<List<Fallback>>,
        private val maxRetries: JsonField<Long>,
        private val modelGroupAlias: JsonField<ModelGroupAlias>,
        private val modelGroupRetryPolicy: JsonField<ModelGroupRetryPolicy>,
        private val numRetries: JsonField<Long>,
        private val retryAfter: JsonField<Double>,
        private val routingStrategy: JsonField<String>,
        private val routingStrategyArgs: JsonField<RoutingStrategyArgs>,
        private val timeout: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("allowed_fails")
            @ExcludeMissing
            allowedFails: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("context_window_fallbacks")
            @ExcludeMissing
            contextWindowFallbacks: JsonField<List<ContextWindowFallback>> = JsonMissing.of(),
            @JsonProperty("cooldown_time")
            @ExcludeMissing
            cooldownTime: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("fallbacks")
            @ExcludeMissing
            fallbacks: JsonField<List<Fallback>> = JsonMissing.of(),
            @JsonProperty("max_retries")
            @ExcludeMissing
            maxRetries: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("model_group_alias")
            @ExcludeMissing
            modelGroupAlias: JsonField<ModelGroupAlias> = JsonMissing.of(),
            @JsonProperty("model_group_retry_policy")
            @ExcludeMissing
            modelGroupRetryPolicy: JsonField<ModelGroupRetryPolicy> = JsonMissing.of(),
            @JsonProperty("num_retries")
            @ExcludeMissing
            numRetries: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("retry_after")
            @ExcludeMissing
            retryAfter: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("routing_strategy")
            @ExcludeMissing
            routingStrategy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("routing_strategy_args")
            @ExcludeMissing
            routingStrategyArgs: JsonField<RoutingStrategyArgs> = JsonMissing.of(),
            @JsonProperty("timeout") @ExcludeMissing timeout: JsonField<Double> = JsonMissing.of(),
        ) : this(
            allowedFails,
            contextWindowFallbacks,
            cooldownTime,
            fallbacks,
            maxRetries,
            modelGroupAlias,
            modelGroupRetryPolicy,
            numRetries,
            retryAfter,
            routingStrategy,
            routingStrategyArgs,
            timeout,
            mutableMapOf(),
        )

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allowedFails(): Long? = allowedFails.getNullable("allowed_fails")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contextWindowFallbacks(): List<ContextWindowFallback>? =
            contextWindowFallbacks.getNullable("context_window_fallbacks")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cooldownTime(): Double? = cooldownTime.getNullable("cooldown_time")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fallbacks(): List<Fallback>? = fallbacks.getNullable("fallbacks")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxRetries(): Long? = maxRetries.getNullable("max_retries")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun modelGroupAlias(): ModelGroupAlias? = modelGroupAlias.getNullable("model_group_alias")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun modelGroupRetryPolicy(): ModelGroupRetryPolicy? =
            modelGroupRetryPolicy.getNullable("model_group_retry_policy")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun numRetries(): Long? = numRetries.getNullable("num_retries")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun retryAfter(): Double? = retryAfter.getNullable("retry_after")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun routingStrategy(): String? = routingStrategy.getNullable("routing_strategy")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun routingStrategyArgs(): RoutingStrategyArgs? =
            routingStrategyArgs.getNullable("routing_strategy_args")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeout(): Double? = timeout.getNullable("timeout")

        /**
         * Returns the raw JSON value of [allowedFails].
         *
         * Unlike [allowedFails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("allowed_fails")
        @ExcludeMissing
        fun _allowedFails(): JsonField<Long> = allowedFails

        /**
         * Returns the raw JSON value of [contextWindowFallbacks].
         *
         * Unlike [contextWindowFallbacks], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("context_window_fallbacks")
        @ExcludeMissing
        fun _contextWindowFallbacks(): JsonField<List<ContextWindowFallback>> =
            contextWindowFallbacks

        /**
         * Returns the raw JSON value of [cooldownTime].
         *
         * Unlike [cooldownTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("cooldown_time")
        @ExcludeMissing
        fun _cooldownTime(): JsonField<Double> = cooldownTime

        /**
         * Returns the raw JSON value of [fallbacks].
         *
         * Unlike [fallbacks], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fallbacks")
        @ExcludeMissing
        fun _fallbacks(): JsonField<List<Fallback>> = fallbacks

        /**
         * Returns the raw JSON value of [maxRetries].
         *
         * Unlike [maxRetries], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_retries") @ExcludeMissing fun _maxRetries(): JsonField<Long> = maxRetries

        /**
         * Returns the raw JSON value of [modelGroupAlias].
         *
         * Unlike [modelGroupAlias], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("model_group_alias")
        @ExcludeMissing
        fun _modelGroupAlias(): JsonField<ModelGroupAlias> = modelGroupAlias

        /**
         * Returns the raw JSON value of [modelGroupRetryPolicy].
         *
         * Unlike [modelGroupRetryPolicy], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("model_group_retry_policy")
        @ExcludeMissing
        fun _modelGroupRetryPolicy(): JsonField<ModelGroupRetryPolicy> = modelGroupRetryPolicy

        /**
         * Returns the raw JSON value of [numRetries].
         *
         * Unlike [numRetries], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("num_retries") @ExcludeMissing fun _numRetries(): JsonField<Long> = numRetries

        /**
         * Returns the raw JSON value of [retryAfter].
         *
         * Unlike [retryAfter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("retry_after")
        @ExcludeMissing
        fun _retryAfter(): JsonField<Double> = retryAfter

        /**
         * Returns the raw JSON value of [routingStrategy].
         *
         * Unlike [routingStrategy], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("routing_strategy")
        @ExcludeMissing
        fun _routingStrategy(): JsonField<String> = routingStrategy

        /**
         * Returns the raw JSON value of [routingStrategyArgs].
         *
         * Unlike [routingStrategyArgs], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("routing_strategy_args")
        @ExcludeMissing
        fun _routingStrategyArgs(): JsonField<RoutingStrategyArgs> = routingStrategyArgs

        /**
         * Returns the raw JSON value of [timeout].
         *
         * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timeout") @ExcludeMissing fun _timeout(): JsonField<Double> = timeout

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

            /** Returns a mutable builder for constructing an instance of [RouterSettings]. */
            fun builder() = Builder()
        }

        /** A builder for [RouterSettings]. */
        class Builder internal constructor() {

            private var allowedFails: JsonField<Long> = JsonMissing.of()
            private var contextWindowFallbacks: JsonField<MutableList<ContextWindowFallback>>? =
                null
            private var cooldownTime: JsonField<Double> = JsonMissing.of()
            private var fallbacks: JsonField<MutableList<Fallback>>? = null
            private var maxRetries: JsonField<Long> = JsonMissing.of()
            private var modelGroupAlias: JsonField<ModelGroupAlias> = JsonMissing.of()
            private var modelGroupRetryPolicy: JsonField<ModelGroupRetryPolicy> = JsonMissing.of()
            private var numRetries: JsonField<Long> = JsonMissing.of()
            private var retryAfter: JsonField<Double> = JsonMissing.of()
            private var routingStrategy: JsonField<String> = JsonMissing.of()
            private var routingStrategyArgs: JsonField<RoutingStrategyArgs> = JsonMissing.of()
            private var timeout: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(routerSettings: RouterSettings) = apply {
                allowedFails = routerSettings.allowedFails
                contextWindowFallbacks =
                    routerSettings.contextWindowFallbacks.map { it.toMutableList() }
                cooldownTime = routerSettings.cooldownTime
                fallbacks = routerSettings.fallbacks.map { it.toMutableList() }
                maxRetries = routerSettings.maxRetries
                modelGroupAlias = routerSettings.modelGroupAlias
                modelGroupRetryPolicy = routerSettings.modelGroupRetryPolicy
                numRetries = routerSettings.numRetries
                retryAfter = routerSettings.retryAfter
                routingStrategy = routerSettings.routingStrategy
                routingStrategyArgs = routerSettings.routingStrategyArgs
                timeout = routerSettings.timeout
                additionalProperties = routerSettings.additionalProperties.toMutableMap()
            }

            fun allowedFails(allowedFails: Long?) = allowedFails(JsonField.ofNullable(allowedFails))

            /**
             * Alias for [Builder.allowedFails].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun allowedFails(allowedFails: Long) = allowedFails(allowedFails as Long?)

            /**
             * Sets [Builder.allowedFails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowedFails] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun allowedFails(allowedFails: JsonField<Long>) = apply {
                this.allowedFails = allowedFails
            }

            fun contextWindowFallbacks(contextWindowFallbacks: List<ContextWindowFallback>?) =
                contextWindowFallbacks(JsonField.ofNullable(contextWindowFallbacks))

            /**
             * Sets [Builder.contextWindowFallbacks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contextWindowFallbacks] with a well-typed
             * `List<ContextWindowFallback>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun contextWindowFallbacks(
                contextWindowFallbacks: JsonField<List<ContextWindowFallback>>
            ) = apply {
                this.contextWindowFallbacks = contextWindowFallbacks.map { it.toMutableList() }
            }

            /**
             * Adds a single [ContextWindowFallback] to [contextWindowFallbacks].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addContextWindowFallback(contextWindowFallback: ContextWindowFallback) = apply {
                contextWindowFallbacks =
                    (contextWindowFallbacks ?: JsonField.of(mutableListOf())).also {
                        checkKnown("contextWindowFallbacks", it).add(contextWindowFallback)
                    }
            }

            fun cooldownTime(cooldownTime: Double?) =
                cooldownTime(JsonField.ofNullable(cooldownTime))

            /**
             * Alias for [Builder.cooldownTime].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun cooldownTime(cooldownTime: Double) = cooldownTime(cooldownTime as Double?)

            /**
             * Sets [Builder.cooldownTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cooldownTime] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cooldownTime(cooldownTime: JsonField<Double>) = apply {
                this.cooldownTime = cooldownTime
            }

            fun fallbacks(fallbacks: List<Fallback>?) = fallbacks(JsonField.ofNullable(fallbacks))

            /**
             * Sets [Builder.fallbacks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fallbacks] with a well-typed `List<Fallback>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fallbacks(fallbacks: JsonField<List<Fallback>>) = apply {
                this.fallbacks = fallbacks.map { it.toMutableList() }
            }

            /**
             * Adds a single [Fallback] to [fallbacks].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFallback(fallback: Fallback) = apply {
                fallbacks =
                    (fallbacks ?: JsonField.of(mutableListOf())).also {
                        checkKnown("fallbacks", it).add(fallback)
                    }
            }

            fun maxRetries(maxRetries: Long?) = maxRetries(JsonField.ofNullable(maxRetries))

            /**
             * Alias for [Builder.maxRetries].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxRetries(maxRetries: Long) = maxRetries(maxRetries as Long?)

            /**
             * Sets [Builder.maxRetries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxRetries] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxRetries(maxRetries: JsonField<Long>) = apply { this.maxRetries = maxRetries }

            fun modelGroupAlias(modelGroupAlias: ModelGroupAlias?) =
                modelGroupAlias(JsonField.ofNullable(modelGroupAlias))

            /**
             * Sets [Builder.modelGroupAlias] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelGroupAlias] with a well-typed [ModelGroupAlias]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun modelGroupAlias(modelGroupAlias: JsonField<ModelGroupAlias>) = apply {
                this.modelGroupAlias = modelGroupAlias
            }

            fun modelGroupRetryPolicy(modelGroupRetryPolicy: ModelGroupRetryPolicy?) =
                modelGroupRetryPolicy(JsonField.ofNullable(modelGroupRetryPolicy))

            /**
             * Sets [Builder.modelGroupRetryPolicy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelGroupRetryPolicy] with a well-typed
             * [ModelGroupRetryPolicy] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun modelGroupRetryPolicy(modelGroupRetryPolicy: JsonField<ModelGroupRetryPolicy>) =
                apply {
                    this.modelGroupRetryPolicy = modelGroupRetryPolicy
                }

            fun numRetries(numRetries: Long?) = numRetries(JsonField.ofNullable(numRetries))

            /**
             * Alias for [Builder.numRetries].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun numRetries(numRetries: Long) = numRetries(numRetries as Long?)

            /**
             * Sets [Builder.numRetries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numRetries] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numRetries(numRetries: JsonField<Long>) = apply { this.numRetries = numRetries }

            fun retryAfter(retryAfter: Double?) = retryAfter(JsonField.ofNullable(retryAfter))

            /**
             * Alias for [Builder.retryAfter].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun retryAfter(retryAfter: Double) = retryAfter(retryAfter as Double?)

            /**
             * Sets [Builder.retryAfter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.retryAfter] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun retryAfter(retryAfter: JsonField<Double>) = apply { this.retryAfter = retryAfter }

            fun routingStrategy(routingStrategy: String?) =
                routingStrategy(JsonField.ofNullable(routingStrategy))

            /**
             * Sets [Builder.routingStrategy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routingStrategy] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun routingStrategy(routingStrategy: JsonField<String>) = apply {
                this.routingStrategy = routingStrategy
            }

            fun routingStrategyArgs(routingStrategyArgs: RoutingStrategyArgs?) =
                routingStrategyArgs(JsonField.ofNullable(routingStrategyArgs))

            /**
             * Sets [Builder.routingStrategyArgs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routingStrategyArgs] with a well-typed
             * [RoutingStrategyArgs] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun routingStrategyArgs(routingStrategyArgs: JsonField<RoutingStrategyArgs>) = apply {
                this.routingStrategyArgs = routingStrategyArgs
            }

            fun timeout(timeout: Double?) = timeout(JsonField.ofNullable(timeout))

            /**
             * Alias for [Builder.timeout].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun timeout(timeout: Double) = timeout(timeout as Double?)

            /**
             * Sets [Builder.timeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeout] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeout(timeout: JsonField<Double>) = apply { this.timeout = timeout }

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
            fun build(): RouterSettings =
                RouterSettings(
                    allowedFails,
                    (contextWindowFallbacks ?: JsonMissing.of()).map { it.toImmutable() },
                    cooldownTime,
                    (fallbacks ?: JsonMissing.of()).map { it.toImmutable() },
                    maxRetries,
                    modelGroupAlias,
                    modelGroupRetryPolicy,
                    numRetries,
                    retryAfter,
                    routingStrategy,
                    routingStrategyArgs,
                    timeout,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RouterSettings = apply {
            if (validated) {
                return@apply
            }

            allowedFails()
            contextWindowFallbacks()?.forEach { it.validate() }
            cooldownTime()
            fallbacks()?.forEach { it.validate() }
            maxRetries()
            modelGroupAlias()?.validate()
            modelGroupRetryPolicy()?.validate()
            numRetries()
            retryAfter()
            routingStrategy()
            routingStrategyArgs()?.validate()
            timeout()
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
            (if (allowedFails.asKnown() == null) 0 else 1) +
                (contextWindowFallbacks.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (cooldownTime.asKnown() == null) 0 else 1) +
                (fallbacks.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (maxRetries.asKnown() == null) 0 else 1) +
                (modelGroupAlias.asKnown()?.validity() ?: 0) +
                (modelGroupRetryPolicy.asKnown()?.validity() ?: 0) +
                (if (numRetries.asKnown() == null) 0 else 1) +
                (if (retryAfter.asKnown() == null) 0 else 1) +
                (if (routingStrategy.asKnown() == null) 0 else 1) +
                (routingStrategyArgs.asKnown()?.validity() ?: 0) +
                (if (timeout.asKnown() == null) 0 else 1)

        class ContextWindowFallback
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
                 * Returns a mutable builder for constructing an instance of
                 * [ContextWindowFallback].
                 */
                fun builder() = Builder()
            }

            /** A builder for [ContextWindowFallback]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(contextWindowFallback: ContextWindowFallback) = apply {
                    additionalProperties = contextWindowFallback.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [ContextWindowFallback].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ContextWindowFallback =
                    ContextWindowFallback(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): ContextWindowFallback = apply {
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

                return other is ContextWindowFallback &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ContextWindowFallback{additionalProperties=$additionalProperties}"
        }

        class Fallback
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

                /** Returns a mutable builder for constructing an instance of [Fallback]. */
                fun builder() = Builder()
            }

            /** A builder for [Fallback]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(fallback: Fallback) = apply {
                    additionalProperties = fallback.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Fallback].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Fallback = Fallback(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Fallback = apply {
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

                return other is Fallback && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Fallback{additionalProperties=$additionalProperties}"
        }

        class ModelGroupAlias
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

                /** Returns a mutable builder for constructing an instance of [ModelGroupAlias]. */
                fun builder() = Builder()
            }

            /** A builder for [ModelGroupAlias]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(modelGroupAlias: ModelGroupAlias) = apply {
                    additionalProperties = modelGroupAlias.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [ModelGroupAlias].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ModelGroupAlias = ModelGroupAlias(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): ModelGroupAlias = apply {
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

                return other is ModelGroupAlias &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "ModelGroupAlias{additionalProperties=$additionalProperties}"
        }

        class ModelGroupRetryPolicy
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
                 * Returns a mutable builder for constructing an instance of
                 * [ModelGroupRetryPolicy].
                 */
                fun builder() = Builder()
            }

            /** A builder for [ModelGroupRetryPolicy]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(modelGroupRetryPolicy: ModelGroupRetryPolicy) = apply {
                    additionalProperties = modelGroupRetryPolicy.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [ModelGroupRetryPolicy].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ModelGroupRetryPolicy =
                    ModelGroupRetryPolicy(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): ModelGroupRetryPolicy = apply {
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

                return other is ModelGroupRetryPolicy &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ModelGroupRetryPolicy{additionalProperties=$additionalProperties}"
        }

        class RoutingStrategyArgs
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
                 * Returns a mutable builder for constructing an instance of [RoutingStrategyArgs].
                 */
                fun builder() = Builder()
            }

            /** A builder for [RoutingStrategyArgs]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(routingStrategyArgs: RoutingStrategyArgs) = apply {
                    additionalProperties = routingStrategyArgs.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [RoutingStrategyArgs].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): RoutingStrategyArgs =
                    RoutingStrategyArgs(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): RoutingStrategyArgs = apply {
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

                return other is RoutingStrategyArgs &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RoutingStrategyArgs{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RouterSettings &&
                allowedFails == other.allowedFails &&
                contextWindowFallbacks == other.contextWindowFallbacks &&
                cooldownTime == other.cooldownTime &&
                fallbacks == other.fallbacks &&
                maxRetries == other.maxRetries &&
                modelGroupAlias == other.modelGroupAlias &&
                modelGroupRetryPolicy == other.modelGroupRetryPolicy &&
                numRetries == other.numRetries &&
                retryAfter == other.retryAfter &&
                routingStrategy == other.routingStrategy &&
                routingStrategyArgs == other.routingStrategyArgs &&
                timeout == other.timeout &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                allowedFails,
                contextWindowFallbacks,
                cooldownTime,
                fallbacks,
                maxRetries,
                modelGroupAlias,
                modelGroupRetryPolicy,
                numRetries,
                retryAfter,
                routingStrategy,
                routingStrategyArgs,
                timeout,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RouterSettings{allowedFails=$allowedFails, contextWindowFallbacks=$contextWindowFallbacks, cooldownTime=$cooldownTime, fallbacks=$fallbacks, maxRetries=$maxRetries, modelGroupAlias=$modelGroupAlias, modelGroupRetryPolicy=$modelGroupRetryPolicy, numRetries=$numRetries, retryAfter=$retryAfter, routingStrategy=$routingStrategy, routingStrategyArgs=$routingStrategyArgs, timeout=$timeout, additionalProperties=$additionalProperties}"
    }

    class RpmLimitType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val GUARANTEED_THROUGHPUT = of("guaranteed_throughput")

            val BEST_EFFORT_THROUGHPUT = of("best_effort_throughput")

            val DYNAMIC = of("dynamic")

            fun of(value: String) = RpmLimitType(JsonField.of(value))
        }

        /** An enum containing [RpmLimitType]'s known values. */
        enum class Known {
            GUARANTEED_THROUGHPUT,
            BEST_EFFORT_THROUGHPUT,
            DYNAMIC,
        }

        /**
         * An enum containing [RpmLimitType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RpmLimitType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GUARANTEED_THROUGHPUT,
            BEST_EFFORT_THROUGHPUT,
            DYNAMIC,
            /**
             * An enum member indicating that [RpmLimitType] was instantiated with an unknown value.
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
                GUARANTEED_THROUGHPUT -> Value.GUARANTEED_THROUGHPUT
                BEST_EFFORT_THROUGHPUT -> Value.BEST_EFFORT_THROUGHPUT
                DYNAMIC -> Value.DYNAMIC
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
                GUARANTEED_THROUGHPUT -> Known.GUARANTEED_THROUGHPUT
                BEST_EFFORT_THROUGHPUT -> Known.BEST_EFFORT_THROUGHPUT
                DYNAMIC -> Known.DYNAMIC
                else -> throw HanzoInvalidDataException("Unknown RpmLimitType: $value")
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

        fun validate(): RpmLimitType = apply {
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

            return other is RpmLimitType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class TpmLimitType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val GUARANTEED_THROUGHPUT = of("guaranteed_throughput")

            val BEST_EFFORT_THROUGHPUT = of("best_effort_throughput")

            val DYNAMIC = of("dynamic")

            fun of(value: String) = TpmLimitType(JsonField.of(value))
        }

        /** An enum containing [TpmLimitType]'s known values. */
        enum class Known {
            GUARANTEED_THROUGHPUT,
            BEST_EFFORT_THROUGHPUT,
            DYNAMIC,
        }

        /**
         * An enum containing [TpmLimitType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TpmLimitType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GUARANTEED_THROUGHPUT,
            BEST_EFFORT_THROUGHPUT,
            DYNAMIC,
            /**
             * An enum member indicating that [TpmLimitType] was instantiated with an unknown value.
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
                GUARANTEED_THROUGHPUT -> Value.GUARANTEED_THROUGHPUT
                BEST_EFFORT_THROUGHPUT -> Value.BEST_EFFORT_THROUGHPUT
                DYNAMIC -> Value.DYNAMIC
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
                GUARANTEED_THROUGHPUT -> Known.GUARANTEED_THROUGHPUT
                BEST_EFFORT_THROUGHPUT -> Known.BEST_EFFORT_THROUGHPUT
                DYNAMIC -> Known.DYNAMIC
                else -> throw HanzoInvalidDataException("Unknown TpmLimitType: $value")
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

        fun validate(): TpmLimitType = apply {
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

            return other is TpmLimitType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class UserRole @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val PROXY_ADMIN = of("proxy_admin")

            val PROXY_ADMIN_VIEWER = of("proxy_admin_viewer")

            val INTERNAL_USER = of("internal_user")

            val INTERNAL_USER_VIEWER = of("internal_user_viewer")

            fun of(value: String) = UserRole(JsonField.of(value))
        }

        /** An enum containing [UserRole]'s known values. */
        enum class Known {
            PROXY_ADMIN,
            PROXY_ADMIN_VIEWER,
            INTERNAL_USER,
            INTERNAL_USER_VIEWER,
        }

        /**
         * An enum containing [UserRole]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [UserRole] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PROXY_ADMIN,
            PROXY_ADMIN_VIEWER,
            INTERNAL_USER,
            INTERNAL_USER_VIEWER,
            /** An enum member indicating that [UserRole] was instantiated with an unknown value. */
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
                PROXY_ADMIN -> Value.PROXY_ADMIN
                PROXY_ADMIN_VIEWER -> Value.PROXY_ADMIN_VIEWER
                INTERNAL_USER -> Value.INTERNAL_USER
                INTERNAL_USER_VIEWER -> Value.INTERNAL_USER_VIEWER
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
                PROXY_ADMIN -> Known.PROXY_ADMIN
                PROXY_ADMIN_VIEWER -> Known.PROXY_ADMIN_VIEWER
                INTERNAL_USER -> Known.INTERNAL_USER
                INTERNAL_USER_VIEWER -> Known.INTERNAL_USER_VIEWER
                else -> throw HanzoInvalidDataException("Unknown UserRole: $value")
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

        fun validate(): UserRole = apply {
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

            return other is UserRole && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserCreateResponse &&
            key == other.key &&
            token == other.token &&
            aliases == other.aliases &&
            allowedCacheControls == other.allowedCacheControls &&
            allowedPassthroughRoutes == other.allowedPassthroughRoutes &&
            allowedRoutes == other.allowedRoutes &&
            allowedVectorStoreIndexes == other.allowedVectorStoreIndexes &&
            blocked == other.blocked &&
            budgetDuration == other.budgetDuration &&
            budgetId == other.budgetId &&
            config == other.config &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            duration == other.duration &&
            enforcedParams == other.enforcedParams &&
            expires == other.expires &&
            guardrails == other.guardrails &&
            keyAlias == other.keyAlias &&
            keyName == other.keyName &&
            litellmBudgetTable == other.litellmBudgetTable &&
            maxBudget == other.maxBudget &&
            maxParallelRequests == other.maxParallelRequests &&
            metadata == other.metadata &&
            modelMaxBudget == other.modelMaxBudget &&
            modelRpmLimit == other.modelRpmLimit &&
            modelTpmLimit == other.modelTpmLimit &&
            models == other.models &&
            objectPermission == other.objectPermission &&
            organizationId == other.organizationId &&
            permissions == other.permissions &&
            prompts == other.prompts &&
            routerSettings == other.routerSettings &&
            rpmLimit == other.rpmLimit &&
            rpmLimitType == other.rpmLimitType &&
            spend == other.spend &&
            tags == other.tags &&
            teamId == other.teamId &&
            teams == other.teams &&
            tokenId == other.tokenId &&
            tpmLimit == other.tpmLimit &&
            tpmLimitType == other.tpmLimitType &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            userAlias == other.userAlias &&
            userEmail == other.userEmail &&
            userId == other.userId &&
            userRole == other.userRole &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            key,
            token,
            aliases,
            allowedCacheControls,
            allowedPassthroughRoutes,
            allowedRoutes,
            allowedVectorStoreIndexes,
            blocked,
            budgetDuration,
            budgetId,
            config,
            createdAt,
            createdBy,
            duration,
            enforcedParams,
            expires,
            guardrails,
            keyAlias,
            keyName,
            litellmBudgetTable,
            maxBudget,
            maxParallelRequests,
            metadata,
            modelMaxBudget,
            modelRpmLimit,
            modelTpmLimit,
            models,
            objectPermission,
            organizationId,
            permissions,
            prompts,
            routerSettings,
            rpmLimit,
            rpmLimitType,
            spend,
            tags,
            teamId,
            teams,
            tokenId,
            tpmLimit,
            tpmLimitType,
            updatedAt,
            updatedBy,
            userAlias,
            userEmail,
            userId,
            userRole,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UserCreateResponse{key=$key, token=$token, aliases=$aliases, allowedCacheControls=$allowedCacheControls, allowedPassthroughRoutes=$allowedPassthroughRoutes, allowedRoutes=$allowedRoutes, allowedVectorStoreIndexes=$allowedVectorStoreIndexes, blocked=$blocked, budgetDuration=$budgetDuration, budgetId=$budgetId, config=$config, createdAt=$createdAt, createdBy=$createdBy, duration=$duration, enforcedParams=$enforcedParams, expires=$expires, guardrails=$guardrails, keyAlias=$keyAlias, keyName=$keyName, litellmBudgetTable=$litellmBudgetTable, maxBudget=$maxBudget, maxParallelRequests=$maxParallelRequests, metadata=$metadata, modelMaxBudget=$modelMaxBudget, modelRpmLimit=$modelRpmLimit, modelTpmLimit=$modelTpmLimit, models=$models, objectPermission=$objectPermission, organizationId=$organizationId, permissions=$permissions, prompts=$prompts, routerSettings=$routerSettings, rpmLimit=$rpmLimit, rpmLimitType=$rpmLimitType, spend=$spend, tags=$tags, teamId=$teamId, teams=$teams, tokenId=$tokenId, tpmLimit=$tpmLimit, tpmLimitType=$tpmLimitType, updatedAt=$updatedAt, updatedBy=$updatedBy, userAlias=$userAlias, userEmail=$userEmail, userId=$userId, userRole=$userRole, additionalProperties=$additionalProperties}"
}
