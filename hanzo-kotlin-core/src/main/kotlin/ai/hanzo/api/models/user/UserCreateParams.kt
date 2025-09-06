// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.user

import ai.hanzo.api.core.Enum
import ai.hanzo.api.core.ExcludeMissing
import ai.hanzo.api.core.JsonField
import ai.hanzo.api.core.JsonMissing
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.Params
import ai.hanzo.api.core.checkKnown
import ai.hanzo.api.core.http.Headers
import ai.hanzo.api.core.http.QueryParams
import ai.hanzo.api.core.toImmutable
import ai.hanzo.api.errors.HanzoInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/**
 * Use this to create a new INTERNAL user with a budget. Internal Users can access LLM Admin UI to
 * make keys, request access to models. This creates a new user and generates a new api key for the
 * new user. The new api key is returned.
 *
 * Returns user id, budget + new key.
 *
 * Parameters:
 * - user_id: Optional[str] - Specify a user id. If not set, a unique id will be generated.
 * - user_alias: Optional[str] - A descriptive name for you to know who this user id refers to.
 * - teams: Optional[list] - specify a list of team id's a user belongs to.
 * - user_email: Optional[str] - Specify a user email.
 * - send_invite_email: Optional[bool] - Specify if an invite email should be sent.
 * - user_role: Optional[str] - Specify a user role - "proxy_admin", "proxy_admin_viewer",
 *   "internal_user", "internal_user_viewer", "team", "customer". Info about each role here:
 *   `https://github.com/hanzoai/llm/llm/proxy/_types.py#L20`
 * - max_budget: Optional[float] - Specify max budget for a given user.
 * - budget_duration: Optional[str] - Budget is reset at the end of specified duration. If not set,
 *   budget is never reset. You can set duration as seconds ("30s"), minutes ("30m"), hours ("30h"),
 *   days ("30d"), months ("1mo").
 * - models: Optional[list] - Model_name's a user is allowed to call. (if empty, key is allowed to
 *   call all models). Set to ['no-default-models'] to block all model access. Restricting user to
 *   only team-based model access.
 * - tpm_limit: Optional[int] - Specify tpm limit for a given user (Tokens per minute)
 * - rpm_limit: Optional[int] - Specify rpm limit for a given user (Requests per minute)
 * - auto_create_key: bool - Default=True. Flag used for returning a key as part of the /user/new
 *   response
 * - aliases: Optional[dict] - Model aliases for the
 *   user - [Docs](https://llm.vercel.app/docs/proxy/virtual_keys#model-aliases)
 * - config: Optional[dict] - [DEPRECATED PARAM] User-specific config.
 * - allowed_cache_controls: Optional[list] - List of allowed cache control values.
 *   Example - ["no-cache", "no-store"]. See all values -
 *   https://docs.hanzo.ai/docs/proxy/caching#turn-on--off-caching-per-request-
 * - blocked: Optional[bool] - [Not Implemented Yet] Whether the user is blocked.
 * - guardrails: Optional[List[str]] - [Not Implemented Yet] List of active guardrails for the user
 * - permissions: Optional[dict] - [Not Implemented Yet] User-specific permissions, eg. turning off
 *   pii masking.
 * - metadata: Optional[dict] - Metadata for user, store information for user. Example metadata =
 *   {"team": "core-infra", "app": "app2", "email": "z@hanzo.ai" }
 * - max_parallel_requests: Optional[int] - Rate limit a user based on the number of parallel
 *   requests. Raises 429 error, if user's parallel requests > x.
 * - soft_budget: Optional[float] - Get alerts when user crosses given budget, doesn't block
 *   requests.
 * - model_max_budget: Optional[dict] - Model-specific max budget for user.
 *   [Docs](https://docs.hanzo.ai/docs/proxy/users#add-model-specific-budgets-to-keys)
 * - model_rpm_limit: Optional[float] - Model-specific rpm limit for user.
 *   [Docs](https://docs.hanzo.ai/docs/proxy/users#add-model-specific-limits-to-keys)
 * - model_tpm_limit: Optional[float] - Model-specific tpm limit for user.
 *   [Docs](https://docs.hanzo.ai/docs/proxy/users#add-model-specific-limits-to-keys)
 * - spend: Optional[float] - Amount spent by user. Default is 0. Will be updated by proxy whenever
 *   user is used. You can set duration as seconds ("30s"), minutes ("30m"), hours ("30h"), days
 *   ("30d"), months ("1mo").
 * - team_id: Optional[str] - [DEPRECATED PARAM] The team id of the user. Default is None.
 * - duration: Optional[str] - Duration for the key auto-created on `/user/new`. Default is None.
 * - key_alias: Optional[str] - Alias for the key auto-created on `/user/new`. Default is None.
 *
 * Returns:
 * - key: (str) The generated api key for the user
 * - expires: (datetime) Datetime object for when key expires.
 * - user_id: (str) Unique user id - used for tracking spend across multiple keys for same user id.
 * - max_budget: (float|None) Max budget for given user.
 *
 * Usage Example
 *
 * ```shell
 *  curl -X POST "http://localhost:4000/user/new"      -H "Content-Type: application/json"      -H "Authorization: Bearer sk-1234"      -d '{
 *      "username": "new_user",
 *      "email": "new_user@example.com"
 *  }'
 * ```
 */
class UserCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

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
    fun autoCreateKey(): Boolean? = body.autoCreateKey()

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

    fun _metadata(): JsonValue = body._metadata()

    fun _modelMaxBudget(): JsonValue = body._modelMaxBudget()

    fun _modelRpmLimit(): JsonValue = body._modelRpmLimit()

    fun _modelTpmLimit(): JsonValue = body._modelTpmLimit()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun models(): List<JsonValue>? = body.models()

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
    fun sendInviteEmail(): Boolean? = body.sendInviteEmail()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spend(): Double? = body.spend()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun teamId(): String? = body.teamId()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun teams(): List<JsonValue>? = body.teams()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tpmLimit(): Long? = body.tpmLimit()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userAlias(): String? = body.userAlias()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userEmail(): String? = body.userEmail()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): String? = body.userId()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userRole(): UserRole? = body.userRole()

    /**
     * Returns the raw JSON value of [allowedCacheControls].
     *
     * Unlike [allowedCacheControls], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _allowedCacheControls(): JsonField<List<JsonValue>> = body._allowedCacheControls()

    /**
     * Returns the raw JSON value of [autoCreateKey].
     *
     * Unlike [autoCreateKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _autoCreateKey(): JsonField<Boolean> = body._autoCreateKey()

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
     * Returns the raw JSON value of [duration].
     *
     * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _duration(): JsonField<String> = body._duration()

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
     * Returns the raw JSON value of [sendInviteEmail].
     *
     * Unlike [sendInviteEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sendInviteEmail(): JsonField<Boolean> = body._sendInviteEmail()

    /**
     * Returns the raw JSON value of [spend].
     *
     * Unlike [spend], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _spend(): JsonField<Double> = body._spend()

    /**
     * Returns the raw JSON value of [teamId].
     *
     * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _teamId(): JsonField<String> = body._teamId()

    /**
     * Returns the raw JSON value of [teams].
     *
     * Unlike [teams], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _teams(): JsonField<List<JsonValue>> = body._teams()

    /**
     * Returns the raw JSON value of [tpmLimit].
     *
     * Unlike [tpmLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tpmLimit(): JsonField<Long> = body._tpmLimit()

    /**
     * Returns the raw JSON value of [userAlias].
     *
     * Unlike [userAlias], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _userAlias(): JsonField<String> = body._userAlias()

    /**
     * Returns the raw JSON value of [userEmail].
     *
     * Unlike [userEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _userEmail(): JsonField<String> = body._userEmail()

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _userId(): JsonField<String> = body._userId()

    /**
     * Returns the raw JSON value of [userRole].
     *
     * Unlike [userRole], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _userRole(): JsonField<UserRole> = body._userRole()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): UserCreateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [UserCreateParams]. */
        fun builder() = Builder()
    }

    /** A builder for [UserCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(userCreateParams: UserCreateParams) = apply {
            body = userCreateParams.body.toBuilder()
            additionalHeaders = userCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = userCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [aliases]
         * - [allowedCacheControls]
         * - [autoCreateKey]
         * - [blocked]
         * - [budgetDuration]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

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

        fun autoCreateKey(autoCreateKey: Boolean) = apply { body.autoCreateKey(autoCreateKey) }

        /**
         * Sets [Builder.autoCreateKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoCreateKey] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun autoCreateKey(autoCreateKey: JsonField<Boolean>) = apply {
            body.autoCreateKey(autoCreateKey)
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

        fun config(config: JsonValue) = apply { body.config(config) }

        fun duration(duration: String?) = apply { body.duration(duration) }

        /**
         * Sets [Builder.duration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.duration] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun duration(duration: JsonField<String>) = apply { body.duration(duration) }

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

        fun sendInviteEmail(sendInviteEmail: Boolean?) = apply {
            body.sendInviteEmail(sendInviteEmail)
        }

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
            body.sendInviteEmail(sendInviteEmail)
        }

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

        fun teamId(teamId: String?) = apply { body.teamId(teamId) }

        /**
         * Sets [Builder.teamId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teamId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun teamId(teamId: JsonField<String>) = apply { body.teamId(teamId) }

        fun teams(teams: List<JsonValue>?) = apply { body.teams(teams) }

        /**
         * Sets [Builder.teams] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teams] with a well-typed `List<JsonValue>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun teams(teams: JsonField<List<JsonValue>>) = apply { body.teams(teams) }

        /**
         * Adds a single [JsonValue] to [teams].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTeam(team: JsonValue) = apply { body.addTeam(team) }

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

        fun userAlias(userAlias: String?) = apply { body.userAlias(userAlias) }

        /**
         * Sets [Builder.userAlias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userAlias] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userAlias(userAlias: JsonField<String>) = apply { body.userAlias(userAlias) }

        fun userEmail(userEmail: String?) = apply { body.userEmail(userEmail) }

        /**
         * Sets [Builder.userEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userEmail(userEmail: JsonField<String>) = apply { body.userEmail(userEmail) }

        fun userId(userId: String?) = apply { body.userId(userId) }

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { body.userId(userId) }

        fun userRole(userRole: UserRole?) = apply { body.userRole(userRole) }

        /**
         * Sets [Builder.userRole] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userRole] with a well-typed [UserRole] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userRole(userRole: JsonField<UserRole>) = apply { body.userRole(userRole) }

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
         * Returns an immutable instance of [UserCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UserCreateParams =
            UserCreateParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val aliases: JsonValue,
        private val allowedCacheControls: JsonField<List<JsonValue>>,
        private val autoCreateKey: JsonField<Boolean>,
        private val blocked: JsonField<Boolean>,
        private val budgetDuration: JsonField<String>,
        private val config: JsonValue,
        private val duration: JsonField<String>,
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
        private val sendInviteEmail: JsonField<Boolean>,
        private val spend: JsonField<Double>,
        private val teamId: JsonField<String>,
        private val teams: JsonField<List<JsonValue>>,
        private val tpmLimit: JsonField<Long>,
        private val userAlias: JsonField<String>,
        private val userEmail: JsonField<String>,
        private val userId: JsonField<String>,
        private val userRole: JsonField<UserRole>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("aliases") @ExcludeMissing aliases: JsonValue = JsonMissing.of(),
            @JsonProperty("allowed_cache_controls")
            @ExcludeMissing
            allowedCacheControls: JsonField<List<JsonValue>> = JsonMissing.of(),
            @JsonProperty("auto_create_key")
            @ExcludeMissing
            autoCreateKey: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("blocked") @ExcludeMissing blocked: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("budget_duration")
            @ExcludeMissing
            budgetDuration: JsonField<String> = JsonMissing.of(),
            @JsonProperty("config") @ExcludeMissing config: JsonValue = JsonMissing.of(),
            @JsonProperty("duration")
            @ExcludeMissing
            duration: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("send_invite_email")
            @ExcludeMissing
            sendInviteEmail: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("spend") @ExcludeMissing spend: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("team_id") @ExcludeMissing teamId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("teams")
            @ExcludeMissing
            teams: JsonField<List<JsonValue>> = JsonMissing.of(),
            @JsonProperty("tpm_limit") @ExcludeMissing tpmLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("user_alias")
            @ExcludeMissing
            userAlias: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user_email")
            @ExcludeMissing
            userEmail: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user_role")
            @ExcludeMissing
            userRole: JsonField<UserRole> = JsonMissing.of(),
        ) : this(
            aliases,
            allowedCacheControls,
            autoCreateKey,
            blocked,
            budgetDuration,
            config,
            duration,
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
            sendInviteEmail,
            spend,
            teamId,
            teams,
            tpmLimit,
            userAlias,
            userEmail,
            userId,
            userRole,
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
        fun autoCreateKey(): Boolean? = autoCreateKey.getNullable("auto_create_key")

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

        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

        @JsonProperty("model_max_budget")
        @ExcludeMissing
        fun _modelMaxBudget(): JsonValue = modelMaxBudget

        @JsonProperty("model_rpm_limit")
        @ExcludeMissing
        fun _modelRpmLimit(): JsonValue = modelRpmLimit

        @JsonProperty("model_tpm_limit")
        @ExcludeMissing
        fun _modelTpmLimit(): JsonValue = modelTpmLimit

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun models(): List<JsonValue>? = models.getNullable("models")

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
        fun teams(): List<JsonValue>? = teams.getNullable("teams")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tpmLimit(): Long? = tpmLimit.getNullable("tpm_limit")

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
         * Returns the raw JSON value of [allowedCacheControls].
         *
         * Unlike [allowedCacheControls], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allowed_cache_controls")
        @ExcludeMissing
        fun _allowedCacheControls(): JsonField<List<JsonValue>> = allowedCacheControls

        /**
         * Returns the raw JSON value of [autoCreateKey].
         *
         * Unlike [autoCreateKey], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("auto_create_key")
        @ExcludeMissing
        fun _autoCreateKey(): JsonField<Boolean> = autoCreateKey

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
         * Returns the raw JSON value of [duration].
         *
         * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<String> = duration

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
         * Returns the raw JSON value of [sendInviteEmail].
         *
         * Unlike [sendInviteEmail], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("send_invite_email")
        @ExcludeMissing
        fun _sendInviteEmail(): JsonField<Boolean> = sendInviteEmail

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
         * Returns the raw JSON value of [teams].
         *
         * Unlike [teams], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("teams") @ExcludeMissing fun _teams(): JsonField<List<JsonValue>> = teams

        /**
         * Returns the raw JSON value of [tpmLimit].
         *
         * Unlike [tpmLimit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tpm_limit") @ExcludeMissing fun _tpmLimit(): JsonField<Long> = tpmLimit

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var aliases: JsonValue = JsonMissing.of()
            private var allowedCacheControls: JsonField<MutableList<JsonValue>>? = null
            private var autoCreateKey: JsonField<Boolean> = JsonMissing.of()
            private var blocked: JsonField<Boolean> = JsonMissing.of()
            private var budgetDuration: JsonField<String> = JsonMissing.of()
            private var config: JsonValue = JsonMissing.of()
            private var duration: JsonField<String> = JsonMissing.of()
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
            private var sendInviteEmail: JsonField<Boolean> = JsonMissing.of()
            private var spend: JsonField<Double> = JsonMissing.of()
            private var teamId: JsonField<String> = JsonMissing.of()
            private var teams: JsonField<MutableList<JsonValue>>? = null
            private var tpmLimit: JsonField<Long> = JsonMissing.of()
            private var userAlias: JsonField<String> = JsonMissing.of()
            private var userEmail: JsonField<String> = JsonMissing.of()
            private var userId: JsonField<String> = JsonMissing.of()
            private var userRole: JsonField<UserRole> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                aliases = body.aliases
                allowedCacheControls = body.allowedCacheControls.map { it.toMutableList() }
                autoCreateKey = body.autoCreateKey
                blocked = body.blocked
                budgetDuration = body.budgetDuration
                config = body.config
                duration = body.duration
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
                sendInviteEmail = body.sendInviteEmail
                spend = body.spend
                teamId = body.teamId
                teams = body.teams.map { it.toMutableList() }
                tpmLimit = body.tpmLimit
                userAlias = body.userAlias
                userEmail = body.userEmail
                userId = body.userId
                userRole = body.userRole
                additionalProperties = body.additionalProperties.toMutableMap()
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

            fun autoCreateKey(autoCreateKey: Boolean) = autoCreateKey(JsonField.of(autoCreateKey))

            /**
             * Sets [Builder.autoCreateKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoCreateKey] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun autoCreateKey(autoCreateKey: JsonField<Boolean>) = apply {
                this.autoCreateKey = autoCreateKey
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

            fun sendInviteEmail(sendInviteEmail: Boolean?) =
                sendInviteEmail(JsonField.ofNullable(sendInviteEmail))

            /**
             * Alias for [Builder.sendInviteEmail].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun sendInviteEmail(sendInviteEmail: Boolean) =
                sendInviteEmail(sendInviteEmail as Boolean?)

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

            fun teamId(teamId: String?) = teamId(JsonField.ofNullable(teamId))

            /**
             * Sets [Builder.teamId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.teamId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun userAlias(userAlias: String?) = userAlias(JsonField.ofNullable(userAlias))

            /**
             * Sets [Builder.userAlias] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userAlias] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userAlias(userAlias: JsonField<String>) = apply { this.userAlias = userAlias }

            fun userEmail(userEmail: String?) = userEmail(JsonField.ofNullable(userEmail))

            /**
             * Sets [Builder.userEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userEmail] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userEmail(userEmail: JsonField<String>) = apply { this.userEmail = userEmail }

            fun userId(userId: String?) = userId(JsonField.ofNullable(userId))

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

            fun userRole(userRole: UserRole?) = userRole(JsonField.ofNullable(userRole))

            /**
             * Sets [Builder.userRole] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userRole] with a well-typed [UserRole] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    aliases,
                    (allowedCacheControls ?: JsonMissing.of()).map { it.toImmutable() },
                    autoCreateKey,
                    blocked,
                    budgetDuration,
                    config,
                    duration,
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
                    sendInviteEmail,
                    spend,
                    teamId,
                    (teams ?: JsonMissing.of()).map { it.toImmutable() },
                    tpmLimit,
                    userAlias,
                    userEmail,
                    userId,
                    userRole,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            allowedCacheControls()
            autoCreateKey()
            blocked()
            budgetDuration()
            duration()
            guardrails()
            keyAlias()
            maxBudget()
            maxParallelRequests()
            models()
            rpmLimit()
            sendInviteEmail()
            spend()
            teamId()
            teams()
            tpmLimit()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (allowedCacheControls.asKnown()?.size ?: 0) +
                (if (autoCreateKey.asKnown() == null) 0 else 1) +
                (if (blocked.asKnown() == null) 0 else 1) +
                (if (budgetDuration.asKnown() == null) 0 else 1) +
                (if (duration.asKnown() == null) 0 else 1) +
                (guardrails.asKnown()?.size ?: 0) +
                (if (keyAlias.asKnown() == null) 0 else 1) +
                (if (maxBudget.asKnown() == null) 0 else 1) +
                (if (maxParallelRequests.asKnown() == null) 0 else 1) +
                (models.asKnown()?.size ?: 0) +
                (if (rpmLimit.asKnown() == null) 0 else 1) +
                (if (sendInviteEmail.asKnown() == null) 0 else 1) +
                (if (spend.asKnown() == null) 0 else 1) +
                (if (teamId.asKnown() == null) 0 else 1) +
                (teams.asKnown()?.size ?: 0) +
                (if (tpmLimit.asKnown() == null) 0 else 1) +
                (if (userAlias.asKnown() == null) 0 else 1) +
                (if (userEmail.asKnown() == null) 0 else 1) +
                (if (userId.asKnown() == null) 0 else 1) +
                (userRole.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                aliases == other.aliases &&
                allowedCacheControls == other.allowedCacheControls &&
                autoCreateKey == other.autoCreateKey &&
                blocked == other.blocked &&
                budgetDuration == other.budgetDuration &&
                config == other.config &&
                duration == other.duration &&
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
                sendInviteEmail == other.sendInviteEmail &&
                spend == other.spend &&
                teamId == other.teamId &&
                teams == other.teams &&
                tpmLimit == other.tpmLimit &&
                userAlias == other.userAlias &&
                userEmail == other.userEmail &&
                userId == other.userId &&
                userRole == other.userRole &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                aliases,
                allowedCacheControls,
                autoCreateKey,
                blocked,
                budgetDuration,
                config,
                duration,
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
                sendInviteEmail,
                spend,
                teamId,
                teams,
                tpmLimit,
                userAlias,
                userEmail,
                userId,
                userRole,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{aliases=$aliases, allowedCacheControls=$allowedCacheControls, autoCreateKey=$autoCreateKey, blocked=$blocked, budgetDuration=$budgetDuration, config=$config, duration=$duration, guardrails=$guardrails, keyAlias=$keyAlias, maxBudget=$maxBudget, maxParallelRequests=$maxParallelRequests, metadata=$metadata, modelMaxBudget=$modelMaxBudget, modelRpmLimit=$modelRpmLimit, modelTpmLimit=$modelTpmLimit, models=$models, permissions=$permissions, rpmLimit=$rpmLimit, sendInviteEmail=$sendInviteEmail, spend=$spend, teamId=$teamId, teams=$teams, tpmLimit=$tpmLimit, userAlias=$userAlias, userEmail=$userEmail, userId=$userId, userRole=$userRole, additionalProperties=$additionalProperties}"
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

        return other is UserCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UserCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
