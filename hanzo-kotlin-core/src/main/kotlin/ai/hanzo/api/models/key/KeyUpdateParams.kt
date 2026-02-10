// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

import ai.hanzo.api.core.ExcludeMissing
import ai.hanzo.api.core.JsonField
import ai.hanzo.api.core.JsonMissing
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.Params
import ai.hanzo.api.core.checkKnown
import ai.hanzo.api.core.checkRequired
import ai.hanzo.api.core.http.Headers
import ai.hanzo.api.core.http.QueryParams
import ai.hanzo.api.core.toImmutable
import ai.hanzo.api.errors.HanzoInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * Update an existing API key's parameters.
 *
 * Parameters:
 * - key: str - The key to update
 * - key_alias: Optional[str] - User-friendly key alias
 * - user_id: Optional[str] - User ID associated with key
 * - team_id: Optional[str] - Team ID associated with key
 * - budget_id: Optional[str] - The budget id associated with the key. Created by calling
 *   `/budget/new`.
 * - models: Optional[list] - Model_name's a user is allowed to call
 * - tags: Optional[List[str]] - Tags for organizing keys (Enterprise only)
 * - enforced_params: Optional[List[str]] - List of enforced params for the key (Enterprise only).
 *   [Docs](https://docs.hanzo.ai/docs/proxy/enterprise#enforce-required-params-for-llm-requests)
 * - spend: Optional[float] - Amount spent by key
 * - max_budget: Optional[float] - Max budget for key
 * - model_max_budget: Optional[Dict[str, BudgetConfig]] - Model-specific budgets {"gpt-4":
 *   {"budget_limit": 0.0005, "time_period": "30d"}}
 * - budget_duration: Optional[str] - Budget reset period ("30d", "1h", etc.)
 * - soft_budget: Optional[float] - [TODO] Soft budget limit (warning vs. hard stop). Will trigger a
 *   slack alert when this soft budget is reached.
 * - max_parallel_requests: Optional[int] - Rate limit for parallel requests
 * - metadata: Optional[dict] - Metadata for key. Example {"team": "core-infra", "app": "app2"}
 * - tpm_limit: Optional[int] - Tokens per minute limit
 * - rpm_limit: Optional[int] - Requests per minute limit
 * - model_rpm_limit: Optional[dict] - Model-specific RPM limits {"gpt-4": 100, "claude-v1": 200}
 * - model_tpm_limit: Optional[dict] - Model-specific TPM limits {"gpt-4": 100000, "claude-v1":
 *   200000}
 * - allowed_cache_controls: Optional[list] - List of allowed cache control values
 * - duration: Optional[str] - Key validity duration ("30d", "1h", etc.)
 * - permissions: Optional[dict] - Key-specific permissions
 * - send_invite_email: Optional[bool] - Send invite email to user_id
 * - guardrails: Optional[List[str]] - List of active guardrails for the key
 * - blocked: Optional[bool] - Whether the key is blocked
 * - aliases: Optional[dict] - Model aliases for the
 *   key - [Docs](https://llm.vercel.app/docs/proxy/virtual_keys#model-aliases)
 * - config: Optional[dict] - [DEPRECATED PARAM] Key-specific config.
 * - temp_budget_increase: Optional[float] - Temporary budget increase for the key (Enterprise
 *   only).
 * - temp_budget_expiry: Optional[str] - Expiry time for the temporary budget increase (Enterprise
 *   only).
 *
 * Example:
 * ```bash
 * curl --location 'http://0.0.0.0:4000/key/update'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data '{
 *     "key": "sk-1234",
 *     "key_alias": "my-key",
 *     "user_id": "user-1234",
 *     "team_id": "team-1234",
 *     "max_budget": 100,
 *     "metadata": {"any_key": "any-val"},
 * }'
 * ```
 */
class KeyUpdateParams
private constructor(
    private val llmChangedBy: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The llm-changed-by header enables tracking of actions performed by authorized users on behalf
     * of other users, providing an audit trail for accountability
     */
    fun llmChangedBy(): String? = llmChangedBy

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun key(): String = body.key()

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = keyUpdateParams.aliases().convert(MyClass::class.java)
     * ```
     */
    fun _aliases(): JsonValue = body._aliases()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowedCacheControls(): List<JsonValue>? = body.allowedCacheControls()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun blocked(): Boolean? = body.blocked()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun budgetDuration(): String? = body.budgetDuration()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun budgetId(): String? = body.budgetId()

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = keyUpdateParams.config().convert(MyClass::class.java)
     * ```
     */
    fun _config(): JsonValue = body._config()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun duration(): String? = body.duration()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enforcedParams(): List<String>? = body.enforcedParams()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun guardrails(): List<String>? = body.guardrails()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun keyAlias(): String? = body.keyAlias()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxBudget(): Double? = body.maxBudget()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxParallelRequests(): Long? = body.maxParallelRequests()

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = keyUpdateParams.metadata().convert(MyClass::class.java)
     * ```
     */
    fun _metadata(): JsonValue = body._metadata()

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = keyUpdateParams.modelMaxBudget().convert(MyClass::class.java)
     * ```
     */
    fun _modelMaxBudget(): JsonValue = body._modelMaxBudget()

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = keyUpdateParams.modelRpmLimit().convert(MyClass::class.java)
     * ```
     */
    fun _modelRpmLimit(): JsonValue = body._modelRpmLimit()

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = keyUpdateParams.modelTpmLimit().convert(MyClass::class.java)
     * ```
     */
    fun _modelTpmLimit(): JsonValue = body._modelTpmLimit()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun models(): List<JsonValue>? = body.models()

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = keyUpdateParams.permissions().convert(MyClass::class.java)
     * ```
     */
    fun _permissions(): JsonValue = body._permissions()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rpmLimit(): Long? = body.rpmLimit()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spend(): Double? = body.spend()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): List<String>? = body.tags()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun teamId(): String? = body.teamId()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tempBudgetExpiry(): OffsetDateTime? = body.tempBudgetExpiry()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tempBudgetIncrease(): Double? = body.tempBudgetIncrease()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tpmLimit(): Long? = body.tpmLimit()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): String? = body.userId()

    /**
     * Returns the raw JSON value of [key].
     *
     * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _key(): JsonField<String> = body._key()

    /**
     * Returns the raw JSON value of [allowedCacheControls].
     *
     * Unlike [allowedCacheControls], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _allowedCacheControls(): JsonField<List<JsonValue>> = body._allowedCacheControls()

    /**
     * Returns the raw JSON value of [blocked].
     *
     * Unlike [blocked], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _blocked(): JsonField<Boolean> = body._blocked()

    /**
     * Returns the raw JSON value of [budgetDuration].
     *
     * Unlike [budgetDuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _budgetDuration(): JsonField<String> = body._budgetDuration()

    /**
     * Returns the raw JSON value of [budgetId].
     *
     * Unlike [budgetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _budgetId(): JsonField<String> = body._budgetId()

    /**
     * Returns the raw JSON value of [duration].
     *
     * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _duration(): JsonField<String> = body._duration()

    /**
     * Returns the raw JSON value of [enforcedParams].
     *
     * Unlike [enforcedParams], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _enforcedParams(): JsonField<List<String>> = body._enforcedParams()

    /**
     * Returns the raw JSON value of [guardrails].
     *
     * Unlike [guardrails], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _guardrails(): JsonField<List<String>> = body._guardrails()

    /**
     * Returns the raw JSON value of [keyAlias].
     *
     * Unlike [keyAlias], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _keyAlias(): JsonField<String> = body._keyAlias()

    /**
     * Returns the raw JSON value of [maxBudget].
     *
     * Unlike [maxBudget], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxBudget(): JsonField<Double> = body._maxBudget()

    /**
     * Returns the raw JSON value of [maxParallelRequests].
     *
     * Unlike [maxParallelRequests], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _maxParallelRequests(): JsonField<Long> = body._maxParallelRequests()

    /**
     * Returns the raw JSON value of [models].
     *
     * Unlike [models], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _models(): JsonField<List<JsonValue>> = body._models()

    /**
     * Returns the raw JSON value of [rpmLimit].
     *
     * Unlike [rpmLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rpmLimit(): JsonField<Long> = body._rpmLimit()

    /**
     * Returns the raw JSON value of [spend].
     *
     * Unlike [spend], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _spend(): JsonField<Double> = body._spend()

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tags(): JsonField<List<String>> = body._tags()

    /**
     * Returns the raw JSON value of [teamId].
     *
     * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _teamId(): JsonField<String> = body._teamId()

    /**
     * Returns the raw JSON value of [tempBudgetExpiry].
     *
     * Unlike [tempBudgetExpiry], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _tempBudgetExpiry(): JsonField<OffsetDateTime> = body._tempBudgetExpiry()

    /**
     * Returns the raw JSON value of [tempBudgetIncrease].
     *
     * Unlike [tempBudgetIncrease], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _tempBudgetIncrease(): JsonField<Double> = body._tempBudgetIncrease()

    /**
     * Returns the raw JSON value of [tpmLimit].
     *
     * Unlike [tpmLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tpmLimit(): JsonField<Long> = body._tpmLimit()

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _userId(): JsonField<String> = body._userId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [KeyUpdateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .key()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [KeyUpdateParams]. */
    class Builder internal constructor() {

        private var llmChangedBy: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(keyUpdateParams: KeyUpdateParams) = apply {
            llmChangedBy = keyUpdateParams.llmChangedBy
            body = keyUpdateParams.body.toBuilder()
            additionalHeaders = keyUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = keyUpdateParams.additionalQueryParams.toBuilder()
        }

        /**
         * The llm-changed-by header enables tracking of actions performed by authorized users on
         * behalf of other users, providing an audit trail for accountability
         */
        fun llmChangedBy(llmChangedBy: String?) = apply { this.llmChangedBy = llmChangedBy }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [key]
         * - [aliases]
         * - [allowedCacheControls]
         * - [blocked]
         * - [budgetDuration]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun key(key: String) = apply { body.key(key) }

        /**
         * Sets [Builder.key] to an arbitrary JSON value.
         *
         * You should usually call [Builder.key] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun key(key: JsonField<String>) = apply { body.key(key) }

        fun aliases(aliases: JsonValue) = apply { body.aliases(aliases) }

        fun allowedCacheControls(allowedCacheControls: List<JsonValue>?) = apply {
            body.allowedCacheControls(allowedCacheControls)
        }

        /**
         * Sets [Builder.allowedCacheControls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedCacheControls] with a well-typed
         * `List<JsonValue>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun allowedCacheControls(allowedCacheControls: JsonField<List<JsonValue>>) = apply {
            body.allowedCacheControls(allowedCacheControls)
        }

        /**
         * Adds a single [JsonValue] to [allowedCacheControls].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllowedCacheControl(allowedCacheControl: JsonValue) = apply {
            body.addAllowedCacheControl(allowedCacheControl)
        }

        fun blocked(blocked: Boolean?) = apply { body.blocked(blocked) }

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
        fun blocked(blocked: JsonField<Boolean>) = apply { body.blocked(blocked) }

        fun budgetDuration(budgetDuration: String?) = apply { body.budgetDuration(budgetDuration) }

        /**
         * Sets [Builder.budgetDuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.budgetDuration] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun budgetDuration(budgetDuration: JsonField<String>) = apply {
            body.budgetDuration(budgetDuration)
        }

        fun budgetId(budgetId: String?) = apply { body.budgetId(budgetId) }

        /**
         * Sets [Builder.budgetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.budgetId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun budgetId(budgetId: JsonField<String>) = apply { body.budgetId(budgetId) }

        fun config(config: JsonValue) = apply { body.config(config) }

        fun duration(duration: String?) = apply { body.duration(duration) }

        /**
         * Sets [Builder.duration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.duration] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun duration(duration: JsonField<String>) = apply { body.duration(duration) }

        fun enforcedParams(enforcedParams: List<String>?) = apply {
            body.enforcedParams(enforcedParams)
        }

        /**
         * Sets [Builder.enforcedParams] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enforcedParams] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enforcedParams(enforcedParams: JsonField<List<String>>) = apply {
            body.enforcedParams(enforcedParams)
        }

        /**
         * Adds a single [String] to [enforcedParams].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEnforcedParam(enforcedParam: String) = apply { body.addEnforcedParam(enforcedParam) }

        fun guardrails(guardrails: List<String>?) = apply { body.guardrails(guardrails) }

        /**
         * Sets [Builder.guardrails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.guardrails] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun guardrails(guardrails: JsonField<List<String>>) = apply { body.guardrails(guardrails) }

        /**
         * Adds a single [String] to [guardrails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGuardrail(guardrail: String) = apply { body.addGuardrail(guardrail) }

        fun keyAlias(keyAlias: String?) = apply { body.keyAlias(keyAlias) }

        /**
         * Sets [Builder.keyAlias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.keyAlias] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun keyAlias(keyAlias: JsonField<String>) = apply { body.keyAlias(keyAlias) }

        fun maxBudget(maxBudget: Double?) = apply { body.maxBudget(maxBudget) }

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
        fun maxBudget(maxBudget: JsonField<Double>) = apply { body.maxBudget(maxBudget) }

        fun maxParallelRequests(maxParallelRequests: Long?) = apply {
            body.maxParallelRequests(maxParallelRequests)
        }

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
            body.maxParallelRequests(maxParallelRequests)
        }

        fun metadata(metadata: JsonValue) = apply { body.metadata(metadata) }

        fun modelMaxBudget(modelMaxBudget: JsonValue) = apply {
            body.modelMaxBudget(modelMaxBudget)
        }

        fun modelRpmLimit(modelRpmLimit: JsonValue) = apply { body.modelRpmLimit(modelRpmLimit) }

        fun modelTpmLimit(modelTpmLimit: JsonValue) = apply { body.modelTpmLimit(modelTpmLimit) }

        fun models(models: List<JsonValue>?) = apply { body.models(models) }

        /**
         * Sets [Builder.models] to an arbitrary JSON value.
         *
         * You should usually call [Builder.models] with a well-typed `List<JsonValue>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun models(models: JsonField<List<JsonValue>>) = apply { body.models(models) }

        /**
         * Adds a single [JsonValue] to [models].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addModel(model: JsonValue) = apply { body.addModel(model) }

        fun permissions(permissions: JsonValue) = apply { body.permissions(permissions) }

        fun rpmLimit(rpmLimit: Long?) = apply { body.rpmLimit(rpmLimit) }

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
        fun rpmLimit(rpmLimit: JsonField<Long>) = apply { body.rpmLimit(rpmLimit) }

        fun spend(spend: Double?) = apply { body.spend(spend) }

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
        fun spend(spend: JsonField<Double>) = apply { body.spend(spend) }

        fun tags(tags: List<String>?) = apply { body.tags(tags) }

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply { body.tags(tags) }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply { body.addTag(tag) }

        fun teamId(teamId: String?) = apply { body.teamId(teamId) }

        /**
         * Sets [Builder.teamId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teamId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun teamId(teamId: JsonField<String>) = apply { body.teamId(teamId) }

        fun tempBudgetExpiry(tempBudgetExpiry: OffsetDateTime?) = apply {
            body.tempBudgetExpiry(tempBudgetExpiry)
        }

        /**
         * Sets [Builder.tempBudgetExpiry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tempBudgetExpiry] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun tempBudgetExpiry(tempBudgetExpiry: JsonField<OffsetDateTime>) = apply {
            body.tempBudgetExpiry(tempBudgetExpiry)
        }

        fun tempBudgetIncrease(tempBudgetIncrease: Double?) = apply {
            body.tempBudgetIncrease(tempBudgetIncrease)
        }

        /**
         * Alias for [Builder.tempBudgetIncrease].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun tempBudgetIncrease(tempBudgetIncrease: Double) =
            tempBudgetIncrease(tempBudgetIncrease as Double?)

        /**
         * Sets [Builder.tempBudgetIncrease] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tempBudgetIncrease] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tempBudgetIncrease(tempBudgetIncrease: JsonField<Double>) = apply {
            body.tempBudgetIncrease(tempBudgetIncrease)
        }

        fun tpmLimit(tpmLimit: Long?) = apply { body.tpmLimit(tpmLimit) }

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
        fun tpmLimit(tpmLimit: JsonField<Long>) = apply { body.tpmLimit(tpmLimit) }

        fun userId(userId: String?) = apply { body.userId(userId) }

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { body.userId(userId) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [KeyUpdateParams].
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
        fun build(): KeyUpdateParams =
            KeyUpdateParams(
                llmChangedBy,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                llmChangedBy?.let { put("llm-changed-by", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val key: JsonField<String>,
        private val aliases: JsonValue,
        private val allowedCacheControls: JsonField<List<JsonValue>>,
        private val blocked: JsonField<Boolean>,
        private val budgetDuration: JsonField<String>,
        private val budgetId: JsonField<String>,
        private val config: JsonValue,
        private val duration: JsonField<String>,
        private val enforcedParams: JsonField<List<String>>,
        private val guardrails: JsonField<List<String>>,
        private val keyAlias: JsonField<String>,
        private val maxBudget: JsonField<Double>,
        private val maxParallelRequests: JsonField<Long>,
        private val metadata: JsonValue,
        private val modelMaxBudget: JsonValue,
        private val modelRpmLimit: JsonValue,
        private val modelTpmLimit: JsonValue,
        private val models: JsonField<List<JsonValue>>,
        private val permissions: JsonValue,
        private val rpmLimit: JsonField<Long>,
        private val spend: JsonField<Double>,
        private val tags: JsonField<List<String>>,
        private val teamId: JsonField<String>,
        private val tempBudgetExpiry: JsonField<OffsetDateTime>,
        private val tempBudgetIncrease: JsonField<Double>,
        private val tpmLimit: JsonField<Long>,
        private val userId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aliases") @ExcludeMissing aliases: JsonValue = JsonMissing.of(),
            @JsonProperty("allowed_cache_controls")
            @ExcludeMissing
            allowedCacheControls: JsonField<List<JsonValue>> = JsonMissing.of(),
            @JsonProperty("blocked") @ExcludeMissing blocked: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("budget_duration")
            @ExcludeMissing
            budgetDuration: JsonField<String> = JsonMissing.of(),
            @JsonProperty("budget_id")
            @ExcludeMissing
            budgetId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("config") @ExcludeMissing config: JsonValue = JsonMissing.of(),
            @JsonProperty("duration")
            @ExcludeMissing
            duration: JsonField<String> = JsonMissing.of(),
            @JsonProperty("enforced_params")
            @ExcludeMissing
            enforcedParams: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("guardrails")
            @ExcludeMissing
            guardrails: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("key_alias")
            @ExcludeMissing
            keyAlias: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_budget")
            @ExcludeMissing
            maxBudget: JsonField<Double> = JsonMissing.of(),
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
            @JsonProperty("permissions") @ExcludeMissing permissions: JsonValue = JsonMissing.of(),
            @JsonProperty("rpm_limit") @ExcludeMissing rpmLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("spend") @ExcludeMissing spend: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("team_id") @ExcludeMissing teamId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("temp_budget_expiry")
            @ExcludeMissing
            tempBudgetExpiry: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("temp_budget_increase")
            @ExcludeMissing
            tempBudgetIncrease: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("tpm_limit") @ExcludeMissing tpmLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        ) : this(
            key,
            aliases,
            allowedCacheControls,
            blocked,
            budgetDuration,
            budgetId,
            config,
            duration,
            enforcedParams,
            guardrails,
            keyAlias,
            maxBudget,
            maxParallelRequests,
            metadata,
            modelMaxBudget,
            modelRpmLimit,
            modelTpmLimit,
            models,
            permissions,
            rpmLimit,
            spend,
            tags,
            teamId,
            tempBudgetExpiry,
            tempBudgetIncrease,
            tpmLimit,
            userId,
            mutableMapOf(),
        )

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun key(): String = key.getRequired("key")

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = body.aliases().convert(MyClass::class.java)
         * ```
         */
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

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = body.config().convert(MyClass::class.java)
         * ```
         */
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

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = body.metadata().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = body.modelMaxBudget().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("model_max_budget")
        @ExcludeMissing
        fun _modelMaxBudget(): JsonValue = modelMaxBudget

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = body.modelRpmLimit().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("model_rpm_limit")
        @ExcludeMissing
        fun _modelRpmLimit(): JsonValue = modelRpmLimit

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = body.modelTpmLimit().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("model_tpm_limit")
        @ExcludeMissing
        fun _modelTpmLimit(): JsonValue = modelTpmLimit

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun models(): List<JsonValue>? = models.getNullable("models")

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = body.permissions().convert(MyClass::class.java)
         * ```
         */
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
        fun tempBudgetExpiry(): OffsetDateTime? = tempBudgetExpiry.getNullable("temp_budget_expiry")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tempBudgetIncrease(): Double? = tempBudgetIncrease.getNullable("temp_budget_increase")

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
         * Returns the raw JSON value of [key].
         *
         * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

        /**
         * Returns the raw JSON value of [allowedCacheControls].
         *
         * Unlike [allowedCacheControls], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Unlike [budgetDuration], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [enforcedParams], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [maxParallelRequests], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Returns the raw JSON value of [tempBudgetExpiry].
         *
         * Unlike [tempBudgetExpiry], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("temp_budget_expiry")
        @ExcludeMissing
        fun _tempBudgetExpiry(): JsonField<OffsetDateTime> = tempBudgetExpiry

        /**
         * Returns the raw JSON value of [tempBudgetIncrease].
         *
         * Unlike [tempBudgetIncrease], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("temp_budget_increase")
        @ExcludeMissing
        fun _tempBudgetIncrease(): JsonField<Double> = tempBudgetIncrease

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

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .key()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var key: JsonField<String>? = null
            private var aliases: JsonValue = JsonMissing.of()
            private var allowedCacheControls: JsonField<MutableList<JsonValue>>? = null
            private var blocked: JsonField<Boolean> = JsonMissing.of()
            private var budgetDuration: JsonField<String> = JsonMissing.of()
            private var budgetId: JsonField<String> = JsonMissing.of()
            private var config: JsonValue = JsonMissing.of()
            private var duration: JsonField<String> = JsonMissing.of()
            private var enforcedParams: JsonField<MutableList<String>>? = null
            private var guardrails: JsonField<MutableList<String>>? = null
            private var keyAlias: JsonField<String> = JsonMissing.of()
            private var maxBudget: JsonField<Double> = JsonMissing.of()
            private var maxParallelRequests: JsonField<Long> = JsonMissing.of()
            private var metadata: JsonValue = JsonMissing.of()
            private var modelMaxBudget: JsonValue = JsonMissing.of()
            private var modelRpmLimit: JsonValue = JsonMissing.of()
            private var modelTpmLimit: JsonValue = JsonMissing.of()
            private var models: JsonField<MutableList<JsonValue>>? = null
            private var permissions: JsonValue = JsonMissing.of()
            private var rpmLimit: JsonField<Long> = JsonMissing.of()
            private var spend: JsonField<Double> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var teamId: JsonField<String> = JsonMissing.of()
            private var tempBudgetExpiry: JsonField<OffsetDateTime> = JsonMissing.of()
            private var tempBudgetIncrease: JsonField<Double> = JsonMissing.of()
            private var tpmLimit: JsonField<Long> = JsonMissing.of()
            private var userId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                key = body.key
                aliases = body.aliases
                allowedCacheControls = body.allowedCacheControls.map { it.toMutableList() }
                blocked = body.blocked
                budgetDuration = body.budgetDuration
                budgetId = body.budgetId
                config = body.config
                duration = body.duration
                enforcedParams = body.enforcedParams.map { it.toMutableList() }
                guardrails = body.guardrails.map { it.toMutableList() }
                keyAlias = body.keyAlias
                maxBudget = body.maxBudget
                maxParallelRequests = body.maxParallelRequests
                metadata = body.metadata
                modelMaxBudget = body.modelMaxBudget
                modelRpmLimit = body.modelRpmLimit
                modelTpmLimit = body.modelTpmLimit
                models = body.models.map { it.toMutableList() }
                permissions = body.permissions
                rpmLimit = body.rpmLimit
                spend = body.spend
                tags = body.tags.map { it.toMutableList() }
                teamId = body.teamId
                tempBudgetExpiry = body.tempBudgetExpiry
                tempBudgetIncrease = body.tempBudgetIncrease
                tpmLimit = body.tpmLimit
                userId = body.userId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun key(key: String) = key(JsonField.of(key))

            /**
             * Sets [Builder.key] to an arbitrary JSON value.
             *
             * You should usually call [Builder.key] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun key(key: JsonField<String>) = apply { this.key = key }

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
             * You should usually call [Builder.blocked] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.budgetId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun budgetId(budgetId: JsonField<String>) = apply { this.budgetId = budgetId }

            fun config(config: JsonValue) = apply { this.config = config }

            fun duration(duration: String?) = duration(JsonField.ofNullable(duration))

            /**
             * Sets [Builder.duration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duration] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duration(duration: JsonField<String>) = apply { this.duration = duration }

            fun enforcedParams(enforcedParams: List<String>?) =
                enforcedParams(JsonField.ofNullable(enforcedParams))

            /**
             * Sets [Builder.enforcedParams] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enforcedParams] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            fun keyAlias(keyAlias: String?) = keyAlias(JsonField.ofNullable(keyAlias))

            /**
             * Sets [Builder.keyAlias] to an arbitrary JSON value.
             *
             * You should usually call [Builder.keyAlias] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

            fun modelMaxBudget(modelMaxBudget: JsonValue) = apply {
                this.modelMaxBudget = modelMaxBudget
            }

            fun modelRpmLimit(modelRpmLimit: JsonValue) = apply {
                this.modelRpmLimit = modelRpmLimit
            }

            fun modelTpmLimit(modelTpmLimit: JsonValue) = apply {
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
             * You should usually call [Builder.rpmLimit] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.spend] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun spend(spend: JsonField<Double>) = apply { this.spend = spend }

            fun tags(tags: List<String>?) = tags(JsonField.ofNullable(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
            }

            fun teamId(teamId: String?) = teamId(JsonField.ofNullable(teamId))

            /**
             * Sets [Builder.teamId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.teamId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun teamId(teamId: JsonField<String>) = apply { this.teamId = teamId }

            fun tempBudgetExpiry(tempBudgetExpiry: OffsetDateTime?) =
                tempBudgetExpiry(JsonField.ofNullable(tempBudgetExpiry))

            /**
             * Sets [Builder.tempBudgetExpiry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tempBudgetExpiry] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun tempBudgetExpiry(tempBudgetExpiry: JsonField<OffsetDateTime>) = apply {
                this.tempBudgetExpiry = tempBudgetExpiry
            }

            fun tempBudgetIncrease(tempBudgetIncrease: Double?) =
                tempBudgetIncrease(JsonField.ofNullable(tempBudgetIncrease))

            /**
             * Alias for [Builder.tempBudgetIncrease].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun tempBudgetIncrease(tempBudgetIncrease: Double) =
                tempBudgetIncrease(tempBudgetIncrease as Double?)

            /**
             * Sets [Builder.tempBudgetIncrease] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tempBudgetIncrease] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tempBudgetIncrease(tempBudgetIncrease: JsonField<Double>) = apply {
                this.tempBudgetIncrease = tempBudgetIncrease
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

            fun userId(userId: String?) = userId(JsonField.ofNullable(userId))

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
             * Returns an immutable instance of [Body].
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
            fun build(): Body =
                Body(
                    checkRequired("key", key),
                    aliases,
                    (allowedCacheControls ?: JsonMissing.of()).map { it.toImmutable() },
                    blocked,
                    budgetDuration,
                    budgetId,
                    config,
                    duration,
                    (enforcedParams ?: JsonMissing.of()).map { it.toImmutable() },
                    (guardrails ?: JsonMissing.of()).map { it.toImmutable() },
                    keyAlias,
                    maxBudget,
                    maxParallelRequests,
                    metadata,
                    modelMaxBudget,
                    modelRpmLimit,
                    modelTpmLimit,
                    (models ?: JsonMissing.of()).map { it.toImmutable() },
                    permissions,
                    rpmLimit,
                    spend,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    teamId,
                    tempBudgetExpiry,
                    tempBudgetIncrease,
                    tpmLimit,
                    userId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            key()
            allowedCacheControls()
            blocked()
            budgetDuration()
            budgetId()
            duration()
            enforcedParams()
            guardrails()
            keyAlias()
            maxBudget()
            maxParallelRequests()
            models()
            rpmLimit()
            spend()
            tags()
            teamId()
            tempBudgetExpiry()
            tempBudgetIncrease()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (key.asKnown() == null) 0 else 1) +
                (allowedCacheControls.asKnown()?.size ?: 0) +
                (if (blocked.asKnown() == null) 0 else 1) +
                (if (budgetDuration.asKnown() == null) 0 else 1) +
                (if (budgetId.asKnown() == null) 0 else 1) +
                (if (duration.asKnown() == null) 0 else 1) +
                (enforcedParams.asKnown()?.size ?: 0) +
                (guardrails.asKnown()?.size ?: 0) +
                (if (keyAlias.asKnown() == null) 0 else 1) +
                (if (maxBudget.asKnown() == null) 0 else 1) +
                (if (maxParallelRequests.asKnown() == null) 0 else 1) +
                (models.asKnown()?.size ?: 0) +
                (if (rpmLimit.asKnown() == null) 0 else 1) +
                (if (spend.asKnown() == null) 0 else 1) +
                (tags.asKnown()?.size ?: 0) +
                (if (teamId.asKnown() == null) 0 else 1) +
                (if (tempBudgetExpiry.asKnown() == null) 0 else 1) +
                (if (tempBudgetIncrease.asKnown() == null) 0 else 1) +
                (if (tpmLimit.asKnown() == null) 0 else 1) +
                (if (userId.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                key == other.key &&
                aliases == other.aliases &&
                allowedCacheControls == other.allowedCacheControls &&
                blocked == other.blocked &&
                budgetDuration == other.budgetDuration &&
                budgetId == other.budgetId &&
                config == other.config &&
                duration == other.duration &&
                enforcedParams == other.enforcedParams &&
                guardrails == other.guardrails &&
                keyAlias == other.keyAlias &&
                maxBudget == other.maxBudget &&
                maxParallelRequests == other.maxParallelRequests &&
                metadata == other.metadata &&
                modelMaxBudget == other.modelMaxBudget &&
                modelRpmLimit == other.modelRpmLimit &&
                modelTpmLimit == other.modelTpmLimit &&
                models == other.models &&
                permissions == other.permissions &&
                rpmLimit == other.rpmLimit &&
                spend == other.spend &&
                tags == other.tags &&
                teamId == other.teamId &&
                tempBudgetExpiry == other.tempBudgetExpiry &&
                tempBudgetIncrease == other.tempBudgetIncrease &&
                tpmLimit == other.tpmLimit &&
                userId == other.userId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                key,
                aliases,
                allowedCacheControls,
                blocked,
                budgetDuration,
                budgetId,
                config,
                duration,
                enforcedParams,
                guardrails,
                keyAlias,
                maxBudget,
                maxParallelRequests,
                metadata,
                modelMaxBudget,
                modelRpmLimit,
                modelTpmLimit,
                models,
                permissions,
                rpmLimit,
                spend,
                tags,
                teamId,
                tempBudgetExpiry,
                tempBudgetIncrease,
                tpmLimit,
                userId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{key=$key, aliases=$aliases, allowedCacheControls=$allowedCacheControls, blocked=$blocked, budgetDuration=$budgetDuration, budgetId=$budgetId, config=$config, duration=$duration, enforcedParams=$enforcedParams, guardrails=$guardrails, keyAlias=$keyAlias, maxBudget=$maxBudget, maxParallelRequests=$maxParallelRequests, metadata=$metadata, modelMaxBudget=$modelMaxBudget, modelRpmLimit=$modelRpmLimit, modelTpmLimit=$modelTpmLimit, models=$models, permissions=$permissions, rpmLimit=$rpmLimit, spend=$spend, tags=$tags, teamId=$teamId, tempBudgetExpiry=$tempBudgetExpiry, tempBudgetIncrease=$tempBudgetIncrease, tpmLimit=$tpmLimit, userId=$userId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is KeyUpdateParams &&
            llmChangedBy == other.llmChangedBy &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(llmChangedBy, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "KeyUpdateParams{llmChangedBy=$llmChangedBy, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
