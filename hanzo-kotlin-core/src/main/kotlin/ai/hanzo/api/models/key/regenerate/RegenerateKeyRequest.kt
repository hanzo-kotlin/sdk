// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key.regenerate

import ai.hanzo.api.core.ExcludeMissing
import ai.hanzo.api.core.JsonField
import ai.hanzo.api.core.JsonMissing
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.checkKnown
import ai.hanzo.api.core.toImmutable
import ai.hanzo.api.errors.HanzoInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class RegenerateKeyRequest
private constructor(
    private val aliases: JsonValue,
    private val allowedCacheControls: JsonField<List<JsonValue>>,
    private val blocked: JsonField<Boolean>,
    private val budgetDuration: JsonField<String>,
    private val budgetId: JsonField<String>,
    private val config: JsonValue,
    private val duration: JsonField<String>,
    private val enforcedParams: JsonField<List<String>>,
    private val guardrails: JsonField<List<String>>,
    private val key: JsonField<String>,
    private val keyAlias: JsonField<String>,
    private val maxBudget: JsonField<Double>,
    private val maxParallelRequests: JsonField<Long>,
    private val metadata: JsonValue,
    private val modelMaxBudget: JsonValue,
    private val modelRpmLimit: JsonValue,
    private val modelTpmLimit: JsonValue,
    private val models: JsonField<List<JsonValue>>,
    private val newMasterKey: JsonField<String>,
    private val permissions: JsonValue,
    private val rpmLimit: JsonField<Long>,
    private val sendInviteEmail: JsonField<Boolean>,
    private val softBudget: JsonField<Double>,
    private val spend: JsonField<Double>,
    private val tags: JsonField<List<String>>,
    private val teamId: JsonField<String>,
    private val tpmLimit: JsonField<Long>,
    private val userId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("aliases") @ExcludeMissing aliases: JsonValue = JsonMissing.of(),
        @JsonProperty("allowed_cache_controls")
        @ExcludeMissing
        allowedCacheControls: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("blocked") @ExcludeMissing blocked: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("budget_duration")
        @ExcludeMissing
        budgetDuration: JsonField<String> = JsonMissing.of(),
        @JsonProperty("budget_id") @ExcludeMissing budgetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("config") @ExcludeMissing config: JsonValue = JsonMissing.of(),
        @JsonProperty("duration") @ExcludeMissing duration: JsonField<String> = JsonMissing.of(),
        @JsonProperty("enforced_params")
        @ExcludeMissing
        enforcedParams: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("guardrails")
        @ExcludeMissing
        guardrails: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
        @JsonProperty("key_alias") @ExcludeMissing keyAlias: JsonField<String> = JsonMissing.of(),
        @JsonProperty("max_budget") @ExcludeMissing maxBudget: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("max_parallel_requests")
        @ExcludeMissing
        maxParallelRequests: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
        @JsonProperty("model_max_budget")
        @ExcludeMissing
        modelMaxBudget: JsonValue = JsonMissing.of(),
        @JsonProperty("model_rpm_limit")
        @ExcludeMissing
        modelRpmLimit: JsonValue = JsonMissing.of(),
        @JsonProperty("model_tpm_limit")
        @ExcludeMissing
        modelTpmLimit: JsonValue = JsonMissing.of(),
        @JsonProperty("models")
        @ExcludeMissing
        models: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("new_master_key")
        @ExcludeMissing
        newMasterKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("permissions") @ExcludeMissing permissions: JsonValue = JsonMissing.of(),
        @JsonProperty("rpm_limit") @ExcludeMissing rpmLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("send_invite_email")
        @ExcludeMissing
        sendInviteEmail: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("soft_budget")
        @ExcludeMissing
        softBudget: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("spend") @ExcludeMissing spend: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("team_id") @ExcludeMissing teamId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tpm_limit") @ExcludeMissing tpmLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
    ) : this(
        aliases,
        allowedCacheControls,
        blocked,
        budgetDuration,
        budgetId,
        config,
        duration,
        enforcedParams,
        guardrails,
        key,
        keyAlias,
        maxBudget,
        maxParallelRequests,
        metadata,
        modelMaxBudget,
        modelRpmLimit,
        modelTpmLimit,
        models,
        newMasterKey,
        permissions,
        rpmLimit,
        sendInviteEmail,
        softBudget,
        spend,
        tags,
        teamId,
        tpmLimit,
        userId,
        mutableMapOf(),
    )

    @JsonProperty("aliases") @ExcludeMissing fun _aliases(): JsonValue = aliases

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

    @JsonProperty("config") @ExcludeMissing fun _config(): JsonValue = config

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
    fun guardrails(): List<String>? = guardrails.getNullable("guardrails")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun key(): String? = key.getNullable("key")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun keyAlias(): String? = keyAlias.getNullable("key_alias")

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

    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

    @JsonProperty("model_max_budget")
    @ExcludeMissing
    fun _modelMaxBudget(): JsonValue = modelMaxBudget

    @JsonProperty("model_rpm_limit") @ExcludeMissing fun _modelRpmLimit(): JsonValue = modelRpmLimit

    @JsonProperty("model_tpm_limit") @ExcludeMissing fun _modelTpmLimit(): JsonValue = modelTpmLimit

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun models(): List<JsonValue>? = models.getNullable("models")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun newMasterKey(): String? = newMasterKey.getNullable("new_master_key")

    @JsonProperty("permissions") @ExcludeMissing fun _permissions(): JsonValue = permissions

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rpmLimit(): Long? = rpmLimit.getNullable("rpm_limit")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sendInviteEmail(): Boolean? = sendInviteEmail.getNullable("send_invite_email")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun softBudget(): Double? = softBudget.getNullable("soft_budget")

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
    fun tpmLimit(): Long? = tpmLimit.getNullable("tpm_limit")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): String? = userId.getNullable("user_id")

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
     * Returns the raw JSON value of [guardrails].
     *
     * Unlike [guardrails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("guardrails")
    @ExcludeMissing
    fun _guardrails(): JsonField<List<String>> = guardrails

    /**
     * Returns the raw JSON value of [key].
     *
     * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

    /**
     * Returns the raw JSON value of [keyAlias].
     *
     * Unlike [keyAlias], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("key_alias") @ExcludeMissing fun _keyAlias(): JsonField<String> = keyAlias

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
     * Returns the raw JSON value of [models].
     *
     * Unlike [models], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("models") @ExcludeMissing fun _models(): JsonField<List<JsonValue>> = models

    /**
     * Returns the raw JSON value of [newMasterKey].
     *
     * Unlike [newMasterKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("new_master_key")
    @ExcludeMissing
    fun _newMasterKey(): JsonField<String> = newMasterKey

    /**
     * Returns the raw JSON value of [rpmLimit].
     *
     * Unlike [rpmLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rpm_limit") @ExcludeMissing fun _rpmLimit(): JsonField<Long> = rpmLimit

    /**
     * Returns the raw JSON value of [sendInviteEmail].
     *
     * Unlike [sendInviteEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("send_invite_email")
    @ExcludeMissing
    fun _sendInviteEmail(): JsonField<Boolean> = sendInviteEmail

    /**
     * Returns the raw JSON value of [softBudget].
     *
     * Unlike [softBudget], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("soft_budget") @ExcludeMissing fun _softBudget(): JsonField<Double> = softBudget

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
     * Returns the raw JSON value of [tpmLimit].
     *
     * Unlike [tpmLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tpm_limit") @ExcludeMissing fun _tpmLimit(): JsonField<Long> = tpmLimit

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

        /** Returns a mutable builder for constructing an instance of [RegenerateKeyRequest]. */
        fun builder() = Builder()
    }

    /** A builder for [RegenerateKeyRequest]. */
    class Builder internal constructor() {

        private var aliases: JsonValue = JsonMissing.of()
        private var allowedCacheControls: JsonField<MutableList<JsonValue>>? = null
        private var blocked: JsonField<Boolean> = JsonMissing.of()
        private var budgetDuration: JsonField<String> = JsonMissing.of()
        private var budgetId: JsonField<String> = JsonMissing.of()
        private var config: JsonValue = JsonMissing.of()
        private var duration: JsonField<String> = JsonMissing.of()
        private var enforcedParams: JsonField<MutableList<String>>? = null
        private var guardrails: JsonField<MutableList<String>>? = null
        private var key: JsonField<String> = JsonMissing.of()
        private var keyAlias: JsonField<String> = JsonMissing.of()
        private var maxBudget: JsonField<Double> = JsonMissing.of()
        private var maxParallelRequests: JsonField<Long> = JsonMissing.of()
        private var metadata: JsonValue = JsonMissing.of()
        private var modelMaxBudget: JsonValue = JsonMissing.of()
        private var modelRpmLimit: JsonValue = JsonMissing.of()
        private var modelTpmLimit: JsonValue = JsonMissing.of()
        private var models: JsonField<MutableList<JsonValue>>? = null
        private var newMasterKey: JsonField<String> = JsonMissing.of()
        private var permissions: JsonValue = JsonMissing.of()
        private var rpmLimit: JsonField<Long> = JsonMissing.of()
        private var sendInviteEmail: JsonField<Boolean> = JsonMissing.of()
        private var softBudget: JsonField<Double> = JsonMissing.of()
        private var spend: JsonField<Double> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var teamId: JsonField<String> = JsonMissing.of()
        private var tpmLimit: JsonField<Long> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(regenerateKeyRequest: RegenerateKeyRequest) = apply {
            aliases = regenerateKeyRequest.aliases
            allowedCacheControls =
                regenerateKeyRequest.allowedCacheControls.map { it.toMutableList() }
            blocked = regenerateKeyRequest.blocked
            budgetDuration = regenerateKeyRequest.budgetDuration
            budgetId = regenerateKeyRequest.budgetId
            config = regenerateKeyRequest.config
            duration = regenerateKeyRequest.duration
            enforcedParams = regenerateKeyRequest.enforcedParams.map { it.toMutableList() }
            guardrails = regenerateKeyRequest.guardrails.map { it.toMutableList() }
            key = regenerateKeyRequest.key
            keyAlias = regenerateKeyRequest.keyAlias
            maxBudget = regenerateKeyRequest.maxBudget
            maxParallelRequests = regenerateKeyRequest.maxParallelRequests
            metadata = regenerateKeyRequest.metadata
            modelMaxBudget = regenerateKeyRequest.modelMaxBudget
            modelRpmLimit = regenerateKeyRequest.modelRpmLimit
            modelTpmLimit = regenerateKeyRequest.modelTpmLimit
            models = regenerateKeyRequest.models.map { it.toMutableList() }
            newMasterKey = regenerateKeyRequest.newMasterKey
            permissions = regenerateKeyRequest.permissions
            rpmLimit = regenerateKeyRequest.rpmLimit
            sendInviteEmail = regenerateKeyRequest.sendInviteEmail
            softBudget = regenerateKeyRequest.softBudget
            spend = regenerateKeyRequest.spend
            tags = regenerateKeyRequest.tags.map { it.toMutableList() }
            teamId = regenerateKeyRequest.teamId
            tpmLimit = regenerateKeyRequest.tpmLimit
            userId = regenerateKeyRequest.userId
            additionalProperties = regenerateKeyRequest.additionalProperties.toMutableMap()
        }

        fun aliases(aliases: JsonValue) = apply { this.aliases = aliases }

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

        fun config(config: JsonValue) = apply { this.config = config }

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

        fun key(key: String?) = key(JsonField.ofNullable(key))

        /**
         * Sets [Builder.key] to an arbitrary JSON value.
         *
         * You should usually call [Builder.key] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun key(key: JsonField<String>) = apply { this.key = key }

        fun keyAlias(keyAlias: String?) = keyAlias(JsonField.ofNullable(keyAlias))

        /**
         * Sets [Builder.keyAlias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.keyAlias] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun keyAlias(keyAlias: JsonField<String>) = apply { this.keyAlias = keyAlias }

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

        fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

        fun modelMaxBudget(modelMaxBudget: JsonValue) = apply {
            this.modelMaxBudget = modelMaxBudget
        }

        fun modelRpmLimit(modelRpmLimit: JsonValue) = apply { this.modelRpmLimit = modelRpmLimit }

        fun modelTpmLimit(modelTpmLimit: JsonValue) = apply { this.modelTpmLimit = modelTpmLimit }

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

        fun newMasterKey(newMasterKey: String?) = newMasterKey(JsonField.ofNullable(newMasterKey))

        /**
         * Sets [Builder.newMasterKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.newMasterKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun newMasterKey(newMasterKey: JsonField<String>) = apply {
            this.newMasterKey = newMasterKey
        }

        fun permissions(permissions: JsonValue) = apply { this.permissions = permissions }

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

        fun sendInviteEmail(sendInviteEmail: Boolean?) =
            sendInviteEmail(JsonField.ofNullable(sendInviteEmail))

        /**
         * Alias for [Builder.sendInviteEmail].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun sendInviteEmail(sendInviteEmail: Boolean) = sendInviteEmail(sendInviteEmail as Boolean?)

        /**
         * Sets [Builder.sendInviteEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sendInviteEmail] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sendInviteEmail(sendInviteEmail: JsonField<Boolean>) = apply {
            this.sendInviteEmail = sendInviteEmail
        }

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
         * You should usually call [Builder.softBudget] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun softBudget(softBudget: JsonField<Double>) = apply { this.softBudget = softBudget }

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
         * Returns an immutable instance of [RegenerateKeyRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RegenerateKeyRequest =
            RegenerateKeyRequest(
                aliases,
                (allowedCacheControls ?: JsonMissing.of()).map { it.toImmutable() },
                blocked,
                budgetDuration,
                budgetId,
                config,
                duration,
                (enforcedParams ?: JsonMissing.of()).map { it.toImmutable() },
                (guardrails ?: JsonMissing.of()).map { it.toImmutable() },
                key,
                keyAlias,
                maxBudget,
                maxParallelRequests,
                metadata,
                modelMaxBudget,
                modelRpmLimit,
                modelTpmLimit,
                (models ?: JsonMissing.of()).map { it.toImmutable() },
                newMasterKey,
                permissions,
                rpmLimit,
                sendInviteEmail,
                softBudget,
                spend,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                teamId,
                tpmLimit,
                userId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RegenerateKeyRequest = apply {
        if (validated) {
            return@apply
        }

        allowedCacheControls()
        blocked()
        budgetDuration()
        budgetId()
        duration()
        enforcedParams()
        guardrails()
        key()
        keyAlias()
        maxBudget()
        maxParallelRequests()
        models()
        newMasterKey()
        rpmLimit()
        sendInviteEmail()
        softBudget()
        spend()
        tags()
        teamId()
        tpmLimit()
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
        (allowedCacheControls.asKnown()?.size ?: 0) +
            (if (blocked.asKnown() == null) 0 else 1) +
            (if (budgetDuration.asKnown() == null) 0 else 1) +
            (if (budgetId.asKnown() == null) 0 else 1) +
            (if (duration.asKnown() == null) 0 else 1) +
            (enforcedParams.asKnown()?.size ?: 0) +
            (guardrails.asKnown()?.size ?: 0) +
            (if (key.asKnown() == null) 0 else 1) +
            (if (keyAlias.asKnown() == null) 0 else 1) +
            (if (maxBudget.asKnown() == null) 0 else 1) +
            (if (maxParallelRequests.asKnown() == null) 0 else 1) +
            (models.asKnown()?.size ?: 0) +
            (if (newMasterKey.asKnown() == null) 0 else 1) +
            (if (rpmLimit.asKnown() == null) 0 else 1) +
            (if (sendInviteEmail.asKnown() == null) 0 else 1) +
            (if (softBudget.asKnown() == null) 0 else 1) +
            (if (spend.asKnown() == null) 0 else 1) +
            (tags.asKnown()?.size ?: 0) +
            (if (teamId.asKnown() == null) 0 else 1) +
            (if (tpmLimit.asKnown() == null) 0 else 1) +
            (if (userId.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RegenerateKeyRequest && aliases == other.aliases && allowedCacheControls == other.allowedCacheControls && blocked == other.blocked && budgetDuration == other.budgetDuration && budgetId == other.budgetId && config == other.config && duration == other.duration && enforcedParams == other.enforcedParams && guardrails == other.guardrails && key == other.key && keyAlias == other.keyAlias && maxBudget == other.maxBudget && maxParallelRequests == other.maxParallelRequests && metadata == other.metadata && modelMaxBudget == other.modelMaxBudget && modelRpmLimit == other.modelRpmLimit && modelTpmLimit == other.modelTpmLimit && models == other.models && newMasterKey == other.newMasterKey && permissions == other.permissions && rpmLimit == other.rpmLimit && sendInviteEmail == other.sendInviteEmail && softBudget == other.softBudget && spend == other.spend && tags == other.tags && teamId == other.teamId && tpmLimit == other.tpmLimit && userId == other.userId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(aliases, allowedCacheControls, blocked, budgetDuration, budgetId, config, duration, enforcedParams, guardrails, key, keyAlias, maxBudget, maxParallelRequests, metadata, modelMaxBudget, modelRpmLimit, modelTpmLimit, models, newMasterKey, permissions, rpmLimit, sendInviteEmail, softBudget, spend, tags, teamId, tpmLimit, userId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RegenerateKeyRequest{aliases=$aliases, allowedCacheControls=$allowedCacheControls, blocked=$blocked, budgetDuration=$budgetDuration, budgetId=$budgetId, config=$config, duration=$duration, enforcedParams=$enforcedParams, guardrails=$guardrails, key=$key, keyAlias=$keyAlias, maxBudget=$maxBudget, maxParallelRequests=$maxParallelRequests, metadata=$metadata, modelMaxBudget=$modelMaxBudget, modelRpmLimit=$modelRpmLimit, modelTpmLimit=$modelTpmLimit, models=$models, newMasterKey=$newMasterKey, permissions=$permissions, rpmLimit=$rpmLimit, sendInviteEmail=$sendInviteEmail, softBudget=$softBudget, spend=$spend, tags=$tags, teamId=$teamId, tpmLimit=$tpmLimit, userId=$userId, additionalProperties=$additionalProperties}"
}
