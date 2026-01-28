// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team

import ai.hanzo.api.core.Enum
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
import java.util.Collections
import java.util.Objects

/**
 * Allow users to create a new team. Apply user permissions to their team.
 *
 * 👉 [Detailed Doc on setting team budgets](https://docs.litellm.ai/docs/proxy/team_budgets)
 *
 * Parameters:
 * - team_alias: Optional[str] - User defined team alias
 * - team_id: Optional[str] - The team id of the user. If none passed, we'll generate it.
 * - members_with_roles: List[{"role": "admin" or "user", "user_id": "<user-id>"}] - A list of users
 *   and their roles in the team. Get user_id when making a new user via `/user/new`.
 * - team_member_permissions: Optional[List[str]] - A list of routes that non-admin team members can
 *   access. example: ["/key/generate", "/key/update", "/key/delete"]
 * - metadata: Optional[dict] - Metadata for team, store information for team. Example metadata =
 *   {"extra_info": "some info"}
 * - model_rpm_limit: Optional[Dict[str, int]] - The RPM (Requests Per Minute) limit for this team -
 *   applied across all keys for this team.
 * - model_tpm_limit: Optional[Dict[str, int]] - The TPM (Tokens Per Minute) limit for this team -
 *   applied across all keys for this team.
 * - tpm_limit: Optional[int] - The TPM (Tokens Per Minute) limit for this team - all keys with this
 *   team_id will have at max this TPM limit
 * - rpm_limit: Optional[int] - The RPM (Requests Per Minute) limit for this team - all keys
 *   associated with this team_id will have at max this RPM limit
 * - rpm_limit_type: Optional[Literal["guaranteed_throughput", "best_effort_throughput"]] - The type
 *   of RPM limit enforcement. Use "guaranteed_throughput" to raise an error if overallocating RPM,
 *   or "best_effort_throughput" for best effort enforcement.
 * - tpm_limit_type: Optional[Literal["guaranteed_throughput", "best_effort_throughput"]] - The type
 *   of TPM limit enforcement. Use "guaranteed_throughput" to raise an error if overallocating TPM,
 *   or "best_effort_throughput" for best effort enforcement.
 * - max_budget: Optional[float] - The maximum budget allocated to the team - all keys for this
 *   team_id will have at max this max_budget
 * - budget_duration: Optional[str] - The duration of the budget for the team. Doc
 *   [here](https://docs.litellm.ai/docs/proxy/team_budgets)
 * - models: Optional[list] - A list of models associated with the team - all keys for this team_id
 *   will have at most, these models. If empty, assumes all models are allowed.
 * - blocked: bool - Flag indicating if the team is blocked or not - will stop all calls from keys
 *   with this team_id.
 * - members: Optional[List] - Control team members via `/team/member/add` and
 *   `/team/member/delete`.
 * - tags: Optional[List[str]] - Tags for
 *   [tracking spend](https://litellm.vercel.app/docs/proxy/enterprise#tracking-spend-for-custom-tags)
 *   and/or doing [tag-based routing](https://litellm.vercel.app/docs/proxy/tag_routing).
 * - prompts: Optional[List[str]] - List of prompts that the team is allowed to use.
 * - organization_id: Optional[str] - The organization id of the team. Default is None. Create via
 *   `/organization/new`.
 * - model_aliases: Optional[dict] - Model aliases for the team.
 *   [Docs](https://docs.litellm.ai/docs/proxy/team_based_routing#create-team-with-model-alias)
 * - guardrails: Optional[List[str]] - Guardrails for the team.
 *   [Docs](https://docs.litellm.ai/docs/proxy/guardrails)
 * - disable_global_guardrails: Optional[bool] - Whether to disable global guardrails for the key.
 * - object_permission: Optional[LiteLLM_ObjectPermissionBase] - team-specific object permission.
 *   Example - {"vector_stores": ["vector_store_1", "vector_store_2"], "agents":
 *   ["agent_1", "agent_2"], "agent_access_groups": ["dev_group"]}. IF null or {} then no object
 *   permission.
 * - team_member_budget: Optional[float] - The maximum budget allocated to an individual team
 *   member.
 * - team_member_rpm_limit: Optional[int] - The RPM (Requests Per Minute) limit for individual team
 *   members.
 * - team_member_tpm_limit: Optional[int] - The TPM (Tokens Per Minute) limit for individual team
 *   members.
 * - team_member_key_duration: Optional[str] - The duration for a team member's key. e.g. "1d",
 *   "1w", "1mo"
 * - allowed_passthrough_routes: Optional[List[str]] - List of allowed pass through routes for the
 *   team.
 * - allowed_vector_store_indexes: Optional[List[dict]] - List of allowed vector store indexes for
 *   the key. Example - [{"index_name": "my-index", "index_permissions": ["write", "read"]}]. If
 *   specified, the key will only be able to use these specific vector store indexes. Create index,
 *   using `/v1/indexes` endpoint.
 * - secret_manager_settings: Optional[dict] - Secret manager settings for the team.
 *   [Docs](https://docs.litellm.ai/docs/secret_managers/overview)
 * - router_settings: Optional[UpdateRouterConfig] - team-specific router settings. Example -
 *   {"model_group_retry_policy": {"max_retries": 5}}. IF null or {} then no router settings.
 *
 * Returns:
 * - team_id: (str) Unique team id - used for tracking spend across multiple keys for same team id.
 *
 * _deprecated_params:
 * - admins: list - A list of user_id's for the admin role
 * - users: list - A list of user_id's for the user role
 *
 * Example Request:
 * ```
 * curl --location 'http://0.0.0.0:4000/team/new'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data '{
 *   "team_alias": "my-new-team_2",
 *   "members_with_roles": [{"role": "admin", "user_id": "user-1234"},
 *     {"role": "user", "user_id": "user-2434"}]
 * }'
 *
 * ```
 *  ```
 * curl --location 'http://0.0.0.0:4000/team/new'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data '{
 *             "team_alias": "QA Prod Bot",
 *             "max_budget": 0.000000001,
 *             "budget_duration": "1d"
 *         }'
 * ```
 */
class TeamCreateParams
private constructor(
    private val litellmChangedBy: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The litellm-changed-by header enables tracking of actions performed by authorized users on
     * behalf of other users, providing an audit trail for accountability
     */
    fun litellmChangedBy(): String? = litellmChangedBy

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun admins(): List<JsonValue>? = body.admins()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowedPassthroughRoutes(): List<JsonValue>? = body.allowedPassthroughRoutes()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowedVectorStoreIndexes(): List<AllowedVectorStoreIndex>? =
        body.allowedVectorStoreIndexes()

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
    fun guardrails(): List<String>? = body.guardrails()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxBudget(): Double? = body.maxBudget()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun members(): List<JsonValue>? = body.members()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun membersWithRoles(): List<Member>? = body.membersWithRoles()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Metadata? = body.metadata()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modelAliases(): ModelAliases? = body.modelAliases()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modelRpmLimit(): ModelRpmLimit? = body.modelRpmLimit()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modelTpmLimit(): ModelTpmLimit? = body.modelTpmLimit()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun models(): List<JsonValue>? = body.models()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectPermission(): ObjectPermission? = body.objectPermission()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun organizationId(): String? = body.organizationId()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prompts(): List<String>? = body.prompts()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun routerSettings(): RouterSettings? = body.routerSettings()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rpmLimit(): Long? = body.rpmLimit()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rpmLimitType(): RpmLimitType? = body.rpmLimitType()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secretManagerSettings(): SecretManagerSettings? = body.secretManagerSettings()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): List<JsonValue>? = body.tags()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun teamAlias(): String? = body.teamAlias()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun teamId(): String? = body.teamId()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun teamMemberBudget(): Double? = body.teamMemberBudget()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun teamMemberKeyDuration(): String? = body.teamMemberKeyDuration()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun teamMemberPermissions(): List<String>? = body.teamMemberPermissions()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun teamMemberRpmLimit(): Long? = body.teamMemberRpmLimit()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun teamMemberTpmLimit(): Long? = body.teamMemberTpmLimit()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tpmLimit(): Long? = body.tpmLimit()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tpmLimitType(): TpmLimitType? = body.tpmLimitType()

    /**
     * Returns the raw JSON value of [admins].
     *
     * Unlike [admins], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _admins(): JsonField<List<JsonValue>> = body._admins()

    /**
     * Returns the raw JSON value of [allowedPassthroughRoutes].
     *
     * Unlike [allowedPassthroughRoutes], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _allowedPassthroughRoutes(): JsonField<List<JsonValue>> = body._allowedPassthroughRoutes()

    /**
     * Returns the raw JSON value of [allowedVectorStoreIndexes].
     *
     * Unlike [allowedVectorStoreIndexes], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _allowedVectorStoreIndexes(): JsonField<List<AllowedVectorStoreIndex>> =
        body._allowedVectorStoreIndexes()

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
     * Returns the raw JSON value of [guardrails].
     *
     * Unlike [guardrails], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _guardrails(): JsonField<List<String>> = body._guardrails()

    /**
     * Returns the raw JSON value of [maxBudget].
     *
     * Unlike [maxBudget], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxBudget(): JsonField<Double> = body._maxBudget()

    /**
     * Returns the raw JSON value of [members].
     *
     * Unlike [members], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _members(): JsonField<List<JsonValue>> = body._members()

    /**
     * Returns the raw JSON value of [membersWithRoles].
     *
     * Unlike [membersWithRoles], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _membersWithRoles(): JsonField<List<Member>> = body._membersWithRoles()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [modelAliases].
     *
     * Unlike [modelAliases], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _modelAliases(): JsonField<ModelAliases> = body._modelAliases()

    /**
     * Returns the raw JSON value of [modelRpmLimit].
     *
     * Unlike [modelRpmLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _modelRpmLimit(): JsonField<ModelRpmLimit> = body._modelRpmLimit()

    /**
     * Returns the raw JSON value of [modelTpmLimit].
     *
     * Unlike [modelTpmLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _modelTpmLimit(): JsonField<ModelTpmLimit> = body._modelTpmLimit()

    /**
     * Returns the raw JSON value of [models].
     *
     * Unlike [models], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _models(): JsonField<List<JsonValue>> = body._models()

    /**
     * Returns the raw JSON value of [objectPermission].
     *
     * Unlike [objectPermission], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _objectPermission(): JsonField<ObjectPermission> = body._objectPermission()

    /**
     * Returns the raw JSON value of [organizationId].
     *
     * Unlike [organizationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _organizationId(): JsonField<String> = body._organizationId()

    /**
     * Returns the raw JSON value of [prompts].
     *
     * Unlike [prompts], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _prompts(): JsonField<List<String>> = body._prompts()

    /**
     * Returns the raw JSON value of [routerSettings].
     *
     * Unlike [routerSettings], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _routerSettings(): JsonField<RouterSettings> = body._routerSettings()

    /**
     * Returns the raw JSON value of [rpmLimit].
     *
     * Unlike [rpmLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rpmLimit(): JsonField<Long> = body._rpmLimit()

    /**
     * Returns the raw JSON value of [rpmLimitType].
     *
     * Unlike [rpmLimitType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rpmLimitType(): JsonField<RpmLimitType> = body._rpmLimitType()

    /**
     * Returns the raw JSON value of [secretManagerSettings].
     *
     * Unlike [secretManagerSettings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _secretManagerSettings(): JsonField<SecretManagerSettings> = body._secretManagerSettings()

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tags(): JsonField<List<JsonValue>> = body._tags()

    /**
     * Returns the raw JSON value of [teamAlias].
     *
     * Unlike [teamAlias], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _teamAlias(): JsonField<String> = body._teamAlias()

    /**
     * Returns the raw JSON value of [teamId].
     *
     * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _teamId(): JsonField<String> = body._teamId()

    /**
     * Returns the raw JSON value of [teamMemberBudget].
     *
     * Unlike [teamMemberBudget], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _teamMemberBudget(): JsonField<Double> = body._teamMemberBudget()

    /**
     * Returns the raw JSON value of [teamMemberKeyDuration].
     *
     * Unlike [teamMemberKeyDuration], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _teamMemberKeyDuration(): JsonField<String> = body._teamMemberKeyDuration()

    /**
     * Returns the raw JSON value of [teamMemberPermissions].
     *
     * Unlike [teamMemberPermissions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _teamMemberPermissions(): JsonField<List<String>> = body._teamMemberPermissions()

    /**
     * Returns the raw JSON value of [teamMemberRpmLimit].
     *
     * Unlike [teamMemberRpmLimit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _teamMemberRpmLimit(): JsonField<Long> = body._teamMemberRpmLimit()

    /**
     * Returns the raw JSON value of [teamMemberTpmLimit].
     *
     * Unlike [teamMemberTpmLimit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _teamMemberTpmLimit(): JsonField<Long> = body._teamMemberTpmLimit()

    /**
     * Returns the raw JSON value of [tpmLimit].
     *
     * Unlike [tpmLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tpmLimit(): JsonField<Long> = body._tpmLimit()

    /**
     * Returns the raw JSON value of [tpmLimitType].
     *
     * Unlike [tpmLimitType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tpmLimitType(): JsonField<TpmLimitType> = body._tpmLimitType()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): TeamCreateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [TeamCreateParams]. */
        fun builder() = Builder()
    }

    /** A builder for [TeamCreateParams]. */
    class Builder internal constructor() {

        private var litellmChangedBy: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(teamCreateParams: TeamCreateParams) = apply {
            litellmChangedBy = teamCreateParams.litellmChangedBy
            body = teamCreateParams.body.toBuilder()
            additionalHeaders = teamCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = teamCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * The litellm-changed-by header enables tracking of actions performed by authorized users
         * on behalf of other users, providing an audit trail for accountability
         */
        fun litellmChangedBy(litellmChangedBy: String?) = apply {
            this.litellmChangedBy = litellmChangedBy
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [admins]
         * - [allowedPassthroughRoutes]
         * - [allowedVectorStoreIndexes]
         * - [blocked]
         * - [budgetDuration]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun admins(admins: List<JsonValue>) = apply { body.admins(admins) }

        /**
         * Sets [Builder.admins] to an arbitrary JSON value.
         *
         * You should usually call [Builder.admins] with a well-typed `List<JsonValue>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun admins(admins: JsonField<List<JsonValue>>) = apply { body.admins(admins) }

        /**
         * Adds a single [JsonValue] to [admins].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAdmin(admin: JsonValue) = apply { body.addAdmin(admin) }

        fun allowedPassthroughRoutes(allowedPassthroughRoutes: List<JsonValue>?) = apply {
            body.allowedPassthroughRoutes(allowedPassthroughRoutes)
        }

        /**
         * Sets [Builder.allowedPassthroughRoutes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedPassthroughRoutes] with a well-typed
         * `List<JsonValue>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun allowedPassthroughRoutes(allowedPassthroughRoutes: JsonField<List<JsonValue>>) = apply {
            body.allowedPassthroughRoutes(allowedPassthroughRoutes)
        }

        /**
         * Adds a single [JsonValue] to [allowedPassthroughRoutes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllowedPassthroughRoute(allowedPassthroughRoute: JsonValue) = apply {
            body.addAllowedPassthroughRoute(allowedPassthroughRoute)
        }

        fun allowedVectorStoreIndexes(allowedVectorStoreIndexes: List<AllowedVectorStoreIndex>?) =
            apply {
                body.allowedVectorStoreIndexes(allowedVectorStoreIndexes)
            }

        /**
         * Sets [Builder.allowedVectorStoreIndexes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedVectorStoreIndexes] with a well-typed
         * `List<AllowedVectorStoreIndex>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun allowedVectorStoreIndexes(
            allowedVectorStoreIndexes: JsonField<List<AllowedVectorStoreIndex>>
        ) = apply { body.allowedVectorStoreIndexes(allowedVectorStoreIndexes) }

        /**
         * Adds a single [AllowedVectorStoreIndex] to [allowedVectorStoreIndexes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllowedVectorStoreIndex(allowedVectorStoreIndex: AllowedVectorStoreIndex) = apply {
            body.addAllowedVectorStoreIndex(allowedVectorStoreIndex)
        }

        fun blocked(blocked: Boolean) = apply { body.blocked(blocked) }

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

        fun members(members: List<JsonValue>) = apply { body.members(members) }

        /**
         * Sets [Builder.members] to an arbitrary JSON value.
         *
         * You should usually call [Builder.members] with a well-typed `List<JsonValue>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun members(members: JsonField<List<JsonValue>>) = apply { body.members(members) }

        /**
         * Adds a single [JsonValue] to [members].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMember(member: JsonValue) = apply { body.addMember(member) }

        fun membersWithRoles(membersWithRoles: List<Member>) = apply {
            body.membersWithRoles(membersWithRoles)
        }

        /**
         * Sets [Builder.membersWithRoles] to an arbitrary JSON value.
         *
         * You should usually call [Builder.membersWithRoles] with a well-typed `List<Member>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun membersWithRoles(membersWithRoles: JsonField<List<Member>>) = apply {
            body.membersWithRoles(membersWithRoles)
        }

        /**
         * Adds a single [Member] to [membersWithRoles].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMembersWithRole(membersWithRole: Member) = apply {
            body.addMembersWithRole(membersWithRole)
        }

        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        fun modelAliases(modelAliases: ModelAliases?) = apply { body.modelAliases(modelAliases) }

        /**
         * Sets [Builder.modelAliases] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelAliases] with a well-typed [ModelAliases] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun modelAliases(modelAliases: JsonField<ModelAliases>) = apply {
            body.modelAliases(modelAliases)
        }

        fun modelRpmLimit(modelRpmLimit: ModelRpmLimit?) = apply {
            body.modelRpmLimit(modelRpmLimit)
        }

        /**
         * Sets [Builder.modelRpmLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelRpmLimit] with a well-typed [ModelRpmLimit] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun modelRpmLimit(modelRpmLimit: JsonField<ModelRpmLimit>) = apply {
            body.modelRpmLimit(modelRpmLimit)
        }

        fun modelTpmLimit(modelTpmLimit: ModelTpmLimit?) = apply {
            body.modelTpmLimit(modelTpmLimit)
        }

        /**
         * Sets [Builder.modelTpmLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelTpmLimit] with a well-typed [ModelTpmLimit] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun modelTpmLimit(modelTpmLimit: JsonField<ModelTpmLimit>) = apply {
            body.modelTpmLimit(modelTpmLimit)
        }

        fun models(models: List<JsonValue>) = apply { body.models(models) }

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

        fun objectPermission(objectPermission: ObjectPermission?) = apply {
            body.objectPermission(objectPermission)
        }

        /**
         * Sets [Builder.objectPermission] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectPermission] with a well-typed [ObjectPermission]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun objectPermission(objectPermission: JsonField<ObjectPermission>) = apply {
            body.objectPermission(objectPermission)
        }

        fun organizationId(organizationId: String?) = apply { body.organizationId(organizationId) }

        /**
         * Sets [Builder.organizationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizationId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun organizationId(organizationId: JsonField<String>) = apply {
            body.organizationId(organizationId)
        }

        fun prompts(prompts: List<String>?) = apply { body.prompts(prompts) }

        /**
         * Sets [Builder.prompts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prompts] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun prompts(prompts: JsonField<List<String>>) = apply { body.prompts(prompts) }

        /**
         * Adds a single [String] to [prompts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPrompt(prompt: String) = apply { body.addPrompt(prompt) }

        fun routerSettings(routerSettings: RouterSettings?) = apply {
            body.routerSettings(routerSettings)
        }

        /**
         * Sets [Builder.routerSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routerSettings] with a well-typed [RouterSettings] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun routerSettings(routerSettings: JsonField<RouterSettings>) = apply {
            body.routerSettings(routerSettings)
        }

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

        fun rpmLimitType(rpmLimitType: RpmLimitType?) = apply { body.rpmLimitType(rpmLimitType) }

        /**
         * Sets [Builder.rpmLimitType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rpmLimitType] with a well-typed [RpmLimitType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rpmLimitType(rpmLimitType: JsonField<RpmLimitType>) = apply {
            body.rpmLimitType(rpmLimitType)
        }

        fun secretManagerSettings(secretManagerSettings: SecretManagerSettings?) = apply {
            body.secretManagerSettings(secretManagerSettings)
        }

        /**
         * Sets [Builder.secretManagerSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secretManagerSettings] with a well-typed
         * [SecretManagerSettings] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun secretManagerSettings(secretManagerSettings: JsonField<SecretManagerSettings>) = apply {
            body.secretManagerSettings(secretManagerSettings)
        }

        fun tags(tags: List<JsonValue>?) = apply { body.tags(tags) }

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<JsonValue>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<JsonValue>>) = apply { body.tags(tags) }

        /**
         * Adds a single [JsonValue] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: JsonValue) = apply { body.addTag(tag) }

        fun teamAlias(teamAlias: String?) = apply { body.teamAlias(teamAlias) }

        /**
         * Sets [Builder.teamAlias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teamAlias] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun teamAlias(teamAlias: JsonField<String>) = apply { body.teamAlias(teamAlias) }

        fun teamId(teamId: String?) = apply { body.teamId(teamId) }

        /**
         * Sets [Builder.teamId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teamId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun teamId(teamId: JsonField<String>) = apply { body.teamId(teamId) }

        fun teamMemberBudget(teamMemberBudget: Double?) = apply {
            body.teamMemberBudget(teamMemberBudget)
        }

        /**
         * Alias for [Builder.teamMemberBudget].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun teamMemberBudget(teamMemberBudget: Double) =
            teamMemberBudget(teamMemberBudget as Double?)

        /**
         * Sets [Builder.teamMemberBudget] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teamMemberBudget] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun teamMemberBudget(teamMemberBudget: JsonField<Double>) = apply {
            body.teamMemberBudget(teamMemberBudget)
        }

        fun teamMemberKeyDuration(teamMemberKeyDuration: String?) = apply {
            body.teamMemberKeyDuration(teamMemberKeyDuration)
        }

        /**
         * Sets [Builder.teamMemberKeyDuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teamMemberKeyDuration] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun teamMemberKeyDuration(teamMemberKeyDuration: JsonField<String>) = apply {
            body.teamMemberKeyDuration(teamMemberKeyDuration)
        }

        fun teamMemberPermissions(teamMemberPermissions: List<String>?) = apply {
            body.teamMemberPermissions(teamMemberPermissions)
        }

        /**
         * Sets [Builder.teamMemberPermissions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teamMemberPermissions] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun teamMemberPermissions(teamMemberPermissions: JsonField<List<String>>) = apply {
            body.teamMemberPermissions(teamMemberPermissions)
        }

        /**
         * Adds a single [String] to [teamMemberPermissions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTeamMemberPermission(teamMemberPermission: String) = apply {
            body.addTeamMemberPermission(teamMemberPermission)
        }

        fun teamMemberRpmLimit(teamMemberRpmLimit: Long?) = apply {
            body.teamMemberRpmLimit(teamMemberRpmLimit)
        }

        /**
         * Alias for [Builder.teamMemberRpmLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun teamMemberRpmLimit(teamMemberRpmLimit: Long) =
            teamMemberRpmLimit(teamMemberRpmLimit as Long?)

        /**
         * Sets [Builder.teamMemberRpmLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teamMemberRpmLimit] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun teamMemberRpmLimit(teamMemberRpmLimit: JsonField<Long>) = apply {
            body.teamMemberRpmLimit(teamMemberRpmLimit)
        }

        fun teamMemberTpmLimit(teamMemberTpmLimit: Long?) = apply {
            body.teamMemberTpmLimit(teamMemberTpmLimit)
        }

        /**
         * Alias for [Builder.teamMemberTpmLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun teamMemberTpmLimit(teamMemberTpmLimit: Long) =
            teamMemberTpmLimit(teamMemberTpmLimit as Long?)

        /**
         * Sets [Builder.teamMemberTpmLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teamMemberTpmLimit] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun teamMemberTpmLimit(teamMemberTpmLimit: JsonField<Long>) = apply {
            body.teamMemberTpmLimit(teamMemberTpmLimit)
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

        fun tpmLimitType(tpmLimitType: TpmLimitType?) = apply { body.tpmLimitType(tpmLimitType) }

        /**
         * Sets [Builder.tpmLimitType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tpmLimitType] with a well-typed [TpmLimitType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tpmLimitType(tpmLimitType: JsonField<TpmLimitType>) = apply {
            body.tpmLimitType(tpmLimitType)
        }

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
         * Returns an immutable instance of [TeamCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TeamCreateParams =
            TeamCreateParams(
                litellmChangedBy,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                litellmChangedBy?.let { put("litellm-changed-by", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val admins: JsonField<List<JsonValue>>,
        private val allowedPassthroughRoutes: JsonField<List<JsonValue>>,
        private val allowedVectorStoreIndexes: JsonField<List<AllowedVectorStoreIndex>>,
        private val blocked: JsonField<Boolean>,
        private val budgetDuration: JsonField<String>,
        private val guardrails: JsonField<List<String>>,
        private val maxBudget: JsonField<Double>,
        private val members: JsonField<List<JsonValue>>,
        private val membersWithRoles: JsonField<List<Member>>,
        private val metadata: JsonField<Metadata>,
        private val modelAliases: JsonField<ModelAliases>,
        private val modelRpmLimit: JsonField<ModelRpmLimit>,
        private val modelTpmLimit: JsonField<ModelTpmLimit>,
        private val models: JsonField<List<JsonValue>>,
        private val objectPermission: JsonField<ObjectPermission>,
        private val organizationId: JsonField<String>,
        private val prompts: JsonField<List<String>>,
        private val routerSettings: JsonField<RouterSettings>,
        private val rpmLimit: JsonField<Long>,
        private val rpmLimitType: JsonField<RpmLimitType>,
        private val secretManagerSettings: JsonField<SecretManagerSettings>,
        private val tags: JsonField<List<JsonValue>>,
        private val teamAlias: JsonField<String>,
        private val teamId: JsonField<String>,
        private val teamMemberBudget: JsonField<Double>,
        private val teamMemberKeyDuration: JsonField<String>,
        private val teamMemberPermissions: JsonField<List<String>>,
        private val teamMemberRpmLimit: JsonField<Long>,
        private val teamMemberTpmLimit: JsonField<Long>,
        private val tpmLimit: JsonField<Long>,
        private val tpmLimitType: JsonField<TpmLimitType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("admins")
            @ExcludeMissing
            admins: JsonField<List<JsonValue>> = JsonMissing.of(),
            @JsonProperty("allowed_passthrough_routes")
            @ExcludeMissing
            allowedPassthroughRoutes: JsonField<List<JsonValue>> = JsonMissing.of(),
            @JsonProperty("allowed_vector_store_indexes")
            @ExcludeMissing
            allowedVectorStoreIndexes: JsonField<List<AllowedVectorStoreIndex>> = JsonMissing.of(),
            @JsonProperty("blocked") @ExcludeMissing blocked: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("budget_duration")
            @ExcludeMissing
            budgetDuration: JsonField<String> = JsonMissing.of(),
            @JsonProperty("guardrails")
            @ExcludeMissing
            guardrails: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("max_budget")
            @ExcludeMissing
            maxBudget: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("members")
            @ExcludeMissing
            members: JsonField<List<JsonValue>> = JsonMissing.of(),
            @JsonProperty("members_with_roles")
            @ExcludeMissing
            membersWithRoles: JsonField<List<Member>> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("model_aliases")
            @ExcludeMissing
            modelAliases: JsonField<ModelAliases> = JsonMissing.of(),
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
            @JsonProperty("secret_manager_settings")
            @ExcludeMissing
            secretManagerSettings: JsonField<SecretManagerSettings> = JsonMissing.of(),
            @JsonProperty("tags")
            @ExcludeMissing
            tags: JsonField<List<JsonValue>> = JsonMissing.of(),
            @JsonProperty("team_alias")
            @ExcludeMissing
            teamAlias: JsonField<String> = JsonMissing.of(),
            @JsonProperty("team_id") @ExcludeMissing teamId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("team_member_budget")
            @ExcludeMissing
            teamMemberBudget: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("team_member_key_duration")
            @ExcludeMissing
            teamMemberKeyDuration: JsonField<String> = JsonMissing.of(),
            @JsonProperty("team_member_permissions")
            @ExcludeMissing
            teamMemberPermissions: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("team_member_rpm_limit")
            @ExcludeMissing
            teamMemberRpmLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("team_member_tpm_limit")
            @ExcludeMissing
            teamMemberTpmLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("tpm_limit") @ExcludeMissing tpmLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("tpm_limit_type")
            @ExcludeMissing
            tpmLimitType: JsonField<TpmLimitType> = JsonMissing.of(),
        ) : this(
            admins,
            allowedPassthroughRoutes,
            allowedVectorStoreIndexes,
            blocked,
            budgetDuration,
            guardrails,
            maxBudget,
            members,
            membersWithRoles,
            metadata,
            modelAliases,
            modelRpmLimit,
            modelTpmLimit,
            models,
            objectPermission,
            organizationId,
            prompts,
            routerSettings,
            rpmLimit,
            rpmLimitType,
            secretManagerSettings,
            tags,
            teamAlias,
            teamId,
            teamMemberBudget,
            teamMemberKeyDuration,
            teamMemberPermissions,
            teamMemberRpmLimit,
            teamMemberTpmLimit,
            tpmLimit,
            tpmLimitType,
            mutableMapOf(),
        )

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun admins(): List<JsonValue>? = admins.getNullable("admins")

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
        fun guardrails(): List<String>? = guardrails.getNullable("guardrails")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxBudget(): Double? = maxBudget.getNullable("max_budget")

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
        fun modelAliases(): ModelAliases? = modelAliases.getNullable("model_aliases")

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
        fun objectPermission(): ObjectPermission? =
            objectPermission.getNullable("object_permission")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun organizationId(): String? = organizationId.getNullable("organization_id")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun prompts(): List<String>? = prompts.getNullable("prompts")

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
        fun rpmLimitType(): RpmLimitType? = rpmLimitType.getNullable("rpm_limit_type")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun secretManagerSettings(): SecretManagerSettings? =
            secretManagerSettings.getNullable("secret_manager_settings")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tags(): List<JsonValue>? = tags.getNullable("tags")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun teamAlias(): String? = teamAlias.getNullable("team_alias")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun teamId(): String? = teamId.getNullable("team_id")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun teamMemberBudget(): Double? = teamMemberBudget.getNullable("team_member_budget")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun teamMemberKeyDuration(): String? =
            teamMemberKeyDuration.getNullable("team_member_key_duration")

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
        fun teamMemberRpmLimit(): Long? = teamMemberRpmLimit.getNullable("team_member_rpm_limit")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun teamMemberTpmLimit(): Long? = teamMemberTpmLimit.getNullable("team_member_tpm_limit")

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
         * Returns the raw JSON value of [admins].
         *
         * Unlike [admins], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("admins") @ExcludeMissing fun _admins(): JsonField<List<JsonValue>> = admins

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
         * Unlike [budgetDuration], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("budget_duration")
        @ExcludeMissing
        fun _budgetDuration(): JsonField<String> = budgetDuration

        /**
         * Returns the raw JSON value of [guardrails].
         *
         * Unlike [guardrails], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("guardrails")
        @ExcludeMissing
        fun _guardrails(): JsonField<List<String>> = guardrails

        /**
         * Returns the raw JSON value of [maxBudget].
         *
         * Unlike [maxBudget], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_budget") @ExcludeMissing fun _maxBudget(): JsonField<Double> = maxBudget

        /**
         * Returns the raw JSON value of [members].
         *
         * Unlike [members], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("members")
        @ExcludeMissing
        fun _members(): JsonField<List<JsonValue>> = members

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
         * Returns the raw JSON value of [modelAliases].
         *
         * Unlike [modelAliases], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("model_aliases")
        @ExcludeMissing
        fun _modelAliases(): JsonField<ModelAliases> = modelAliases

        /**
         * Returns the raw JSON value of [modelRpmLimit].
         *
         * Unlike [modelRpmLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("model_rpm_limit")
        @ExcludeMissing
        fun _modelRpmLimit(): JsonField<ModelRpmLimit> = modelRpmLimit

        /**
         * Returns the raw JSON value of [modelTpmLimit].
         *
         * Unlike [modelTpmLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [organizationId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("organization_id")
        @ExcludeMissing
        fun _organizationId(): JsonField<String> = organizationId

        /**
         * Returns the raw JSON value of [prompts].
         *
         * Unlike [prompts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prompts") @ExcludeMissing fun _prompts(): JsonField<List<String>> = prompts

        /**
         * Returns the raw JSON value of [routerSettings].
         *
         * Unlike [routerSettings], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [rpmLimitType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rpm_limit_type")
        @ExcludeMissing
        fun _rpmLimitType(): JsonField<RpmLimitType> = rpmLimitType

        /**
         * Returns the raw JSON value of [secretManagerSettings].
         *
         * Unlike [secretManagerSettings], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("secret_manager_settings")
        @ExcludeMissing
        fun _secretManagerSettings(): JsonField<SecretManagerSettings> = secretManagerSettings

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<JsonValue>> = tags

        /**
         * Returns the raw JSON value of [teamAlias].
         *
         * Unlike [teamAlias], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("team_alias") @ExcludeMissing fun _teamAlias(): JsonField<String> = teamAlias

        /**
         * Returns the raw JSON value of [teamId].
         *
         * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("team_id") @ExcludeMissing fun _teamId(): JsonField<String> = teamId

        /**
         * Returns the raw JSON value of [teamMemberBudget].
         *
         * Unlike [teamMemberBudget], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("team_member_budget")
        @ExcludeMissing
        fun _teamMemberBudget(): JsonField<Double> = teamMemberBudget

        /**
         * Returns the raw JSON value of [teamMemberKeyDuration].
         *
         * Unlike [teamMemberKeyDuration], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("team_member_key_duration")
        @ExcludeMissing
        fun _teamMemberKeyDuration(): JsonField<String> = teamMemberKeyDuration

        /**
         * Returns the raw JSON value of [teamMemberPermissions].
         *
         * Unlike [teamMemberPermissions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("team_member_permissions")
        @ExcludeMissing
        fun _teamMemberPermissions(): JsonField<List<String>> = teamMemberPermissions

        /**
         * Returns the raw JSON value of [teamMemberRpmLimit].
         *
         * Unlike [teamMemberRpmLimit], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("team_member_rpm_limit")
        @ExcludeMissing
        fun _teamMemberRpmLimit(): JsonField<Long> = teamMemberRpmLimit

        /**
         * Returns the raw JSON value of [teamMemberTpmLimit].
         *
         * Unlike [teamMemberTpmLimit], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("team_member_tpm_limit")
        @ExcludeMissing
        fun _teamMemberTpmLimit(): JsonField<Long> = teamMemberTpmLimit

        /**
         * Returns the raw JSON value of [tpmLimit].
         *
         * Unlike [tpmLimit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tpm_limit") @ExcludeMissing fun _tpmLimit(): JsonField<Long> = tpmLimit

        /**
         * Returns the raw JSON value of [tpmLimitType].
         *
         * Unlike [tpmLimitType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tpm_limit_type")
        @ExcludeMissing
        fun _tpmLimitType(): JsonField<TpmLimitType> = tpmLimitType

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

            private var admins: JsonField<MutableList<JsonValue>>? = null
            private var allowedPassthroughRoutes: JsonField<MutableList<JsonValue>>? = null
            private var allowedVectorStoreIndexes:
                JsonField<MutableList<AllowedVectorStoreIndex>>? =
                null
            private var blocked: JsonField<Boolean> = JsonMissing.of()
            private var budgetDuration: JsonField<String> = JsonMissing.of()
            private var guardrails: JsonField<MutableList<String>>? = null
            private var maxBudget: JsonField<Double> = JsonMissing.of()
            private var members: JsonField<MutableList<JsonValue>>? = null
            private var membersWithRoles: JsonField<MutableList<Member>>? = null
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var modelAliases: JsonField<ModelAliases> = JsonMissing.of()
            private var modelRpmLimit: JsonField<ModelRpmLimit> = JsonMissing.of()
            private var modelTpmLimit: JsonField<ModelTpmLimit> = JsonMissing.of()
            private var models: JsonField<MutableList<JsonValue>>? = null
            private var objectPermission: JsonField<ObjectPermission> = JsonMissing.of()
            private var organizationId: JsonField<String> = JsonMissing.of()
            private var prompts: JsonField<MutableList<String>>? = null
            private var routerSettings: JsonField<RouterSettings> = JsonMissing.of()
            private var rpmLimit: JsonField<Long> = JsonMissing.of()
            private var rpmLimitType: JsonField<RpmLimitType> = JsonMissing.of()
            private var secretManagerSettings: JsonField<SecretManagerSettings> = JsonMissing.of()
            private var tags: JsonField<MutableList<JsonValue>>? = null
            private var teamAlias: JsonField<String> = JsonMissing.of()
            private var teamId: JsonField<String> = JsonMissing.of()
            private var teamMemberBudget: JsonField<Double> = JsonMissing.of()
            private var teamMemberKeyDuration: JsonField<String> = JsonMissing.of()
            private var teamMemberPermissions: JsonField<MutableList<String>>? = null
            private var teamMemberRpmLimit: JsonField<Long> = JsonMissing.of()
            private var teamMemberTpmLimit: JsonField<Long> = JsonMissing.of()
            private var tpmLimit: JsonField<Long> = JsonMissing.of()
            private var tpmLimitType: JsonField<TpmLimitType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                admins = body.admins.map { it.toMutableList() }
                allowedPassthroughRoutes = body.allowedPassthroughRoutes.map { it.toMutableList() }
                allowedVectorStoreIndexes =
                    body.allowedVectorStoreIndexes.map { it.toMutableList() }
                blocked = body.blocked
                budgetDuration = body.budgetDuration
                guardrails = body.guardrails.map { it.toMutableList() }
                maxBudget = body.maxBudget
                members = body.members.map { it.toMutableList() }
                membersWithRoles = body.membersWithRoles.map { it.toMutableList() }
                metadata = body.metadata
                modelAliases = body.modelAliases
                modelRpmLimit = body.modelRpmLimit
                modelTpmLimit = body.modelTpmLimit
                models = body.models.map { it.toMutableList() }
                objectPermission = body.objectPermission
                organizationId = body.organizationId
                prompts = body.prompts.map { it.toMutableList() }
                routerSettings = body.routerSettings
                rpmLimit = body.rpmLimit
                rpmLimitType = body.rpmLimitType
                secretManagerSettings = body.secretManagerSettings
                tags = body.tags.map { it.toMutableList() }
                teamAlias = body.teamAlias
                teamId = body.teamId
                teamMemberBudget = body.teamMemberBudget
                teamMemberKeyDuration = body.teamMemberKeyDuration
                teamMemberPermissions = body.teamMemberPermissions.map { it.toMutableList() }
                teamMemberRpmLimit = body.teamMemberRpmLimit
                teamMemberTpmLimit = body.teamMemberTpmLimit
                tpmLimit = body.tpmLimit
                tpmLimitType = body.tpmLimitType
                additionalProperties = body.additionalProperties.toMutableMap()
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

            fun allowedPassthroughRoutes(allowedPassthroughRoutes: List<JsonValue>?) =
                allowedPassthroughRoutes(JsonField.ofNullable(allowedPassthroughRoutes))

            /**
             * Sets [Builder.allowedPassthroughRoutes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowedPassthroughRoutes] with a well-typed
             * `List<JsonValue>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun allowedPassthroughRoutes(allowedPassthroughRoutes: JsonField<List<JsonValue>>) =
                apply {
                    this.allowedPassthroughRoutes =
                        allowedPassthroughRoutes.map { it.toMutableList() }
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

            fun allowedVectorStoreIndexes(
                allowedVectorStoreIndexes: List<AllowedVectorStoreIndex>?
            ) = allowedVectorStoreIndexes(JsonField.ofNullable(allowedVectorStoreIndexes))

            /**
             * Sets [Builder.allowedVectorStoreIndexes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowedVectorStoreIndexes] with a well-typed
             * `List<AllowedVectorStoreIndex>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun allowedVectorStoreIndexes(
                allowedVectorStoreIndexes: JsonField<List<AllowedVectorStoreIndex>>
            ) = apply {
                this.allowedVectorStoreIndexes =
                    allowedVectorStoreIndexes.map { it.toMutableList() }
            }

            /**
             * Adds a single [AllowedVectorStoreIndex] to [allowedVectorStoreIndexes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAllowedVectorStoreIndex(allowedVectorStoreIndex: AllowedVectorStoreIndex) =
                apply {
                    allowedVectorStoreIndexes =
                        (allowedVectorStoreIndexes ?: JsonField.of(mutableListOf())).also {
                            checkKnown("allowedVectorStoreIndexes", it).add(allowedVectorStoreIndex)
                        }
                }

            fun blocked(blocked: Boolean) = blocked(JsonField.of(blocked))

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
             * You should usually call [Builder.membersWithRoles] with a well-typed `List<Member>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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

            fun modelRpmLimit(modelRpmLimit: ModelRpmLimit?) =
                modelRpmLimit(JsonField.ofNullable(modelRpmLimit))

            /**
             * Sets [Builder.modelRpmLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelRpmLimit] with a well-typed [ModelRpmLimit]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun modelRpmLimit(modelRpmLimit: JsonField<ModelRpmLimit>) = apply {
                this.modelRpmLimit = modelRpmLimit
            }

            fun modelTpmLimit(modelTpmLimit: ModelTpmLimit?) =
                modelTpmLimit(JsonField.ofNullable(modelTpmLimit))

            /**
             * Sets [Builder.modelTpmLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelTpmLimit] with a well-typed [ModelTpmLimit]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun modelTpmLimit(modelTpmLimit: JsonField<ModelTpmLimit>) = apply {
                this.modelTpmLimit = modelTpmLimit
            }

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

            fun objectPermission(objectPermission: ObjectPermission?) =
                objectPermission(JsonField.ofNullable(objectPermission))

            /**
             * Sets [Builder.objectPermission] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objectPermission] with a well-typed
             * [ObjectPermission] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
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

            fun prompts(prompts: List<String>?) = prompts(JsonField.ofNullable(prompts))

            /**
             * Sets [Builder.prompts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prompts] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun routerSettings(routerSettings: RouterSettings?) =
                routerSettings(JsonField.ofNullable(routerSettings))

            /**
             * Sets [Builder.routerSettings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routerSettings] with a well-typed [RouterSettings]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * You should usually call [Builder.rpmLimit] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun secretManagerSettings(secretManagerSettings: SecretManagerSettings?) =
                secretManagerSettings(JsonField.ofNullable(secretManagerSettings))

            /**
             * Sets [Builder.secretManagerSettings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secretManagerSettings] with a well-typed
             * [SecretManagerSettings] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun secretManagerSettings(secretManagerSettings: JsonField<SecretManagerSettings>) =
                apply {
                    this.secretManagerSettings = secretManagerSettings
                }

            fun tags(tags: List<JsonValue>?) = tags(JsonField.ofNullable(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<JsonValue>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tags(tags: JsonField<List<JsonValue>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

            /**
             * Adds a single [JsonValue] to [tags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTag(tag: JsonValue) = apply {
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
            }

            fun teamAlias(teamAlias: String?) = teamAlias(JsonField.ofNullable(teamAlias))

            /**
             * Sets [Builder.teamAlias] to an arbitrary JSON value.
             *
             * You should usually call [Builder.teamAlias] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun teamAlias(teamAlias: JsonField<String>) = apply { this.teamAlias = teamAlias }

            fun teamId(teamId: String?) = teamId(JsonField.ofNullable(teamId))

            /**
             * Sets [Builder.teamId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.teamId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun teamId(teamId: JsonField<String>) = apply { this.teamId = teamId }

            fun teamMemberBudget(teamMemberBudget: Double?) =
                teamMemberBudget(JsonField.ofNullable(teamMemberBudget))

            /**
             * Alias for [Builder.teamMemberBudget].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun teamMemberBudget(teamMemberBudget: Double) =
                teamMemberBudget(teamMemberBudget as Double?)

            /**
             * Sets [Builder.teamMemberBudget] to an arbitrary JSON value.
             *
             * You should usually call [Builder.teamMemberBudget] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun teamMemberBudget(teamMemberBudget: JsonField<Double>) = apply {
                this.teamMemberBudget = teamMemberBudget
            }

            fun teamMemberKeyDuration(teamMemberKeyDuration: String?) =
                teamMemberKeyDuration(JsonField.ofNullable(teamMemberKeyDuration))

            /**
             * Sets [Builder.teamMemberKeyDuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.teamMemberKeyDuration] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun teamMemberKeyDuration(teamMemberKeyDuration: JsonField<String>) = apply {
                this.teamMemberKeyDuration = teamMemberKeyDuration
            }

            fun teamMemberPermissions(teamMemberPermissions: List<String>?) =
                teamMemberPermissions(JsonField.ofNullable(teamMemberPermissions))

            /**
             * Sets [Builder.teamMemberPermissions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.teamMemberPermissions] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
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

            fun teamMemberRpmLimit(teamMemberRpmLimit: Long?) =
                teamMemberRpmLimit(JsonField.ofNullable(teamMemberRpmLimit))

            /**
             * Alias for [Builder.teamMemberRpmLimit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun teamMemberRpmLimit(teamMemberRpmLimit: Long) =
                teamMemberRpmLimit(teamMemberRpmLimit as Long?)

            /**
             * Sets [Builder.teamMemberRpmLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.teamMemberRpmLimit] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun teamMemberRpmLimit(teamMemberRpmLimit: JsonField<Long>) = apply {
                this.teamMemberRpmLimit = teamMemberRpmLimit
            }

            fun teamMemberTpmLimit(teamMemberTpmLimit: Long?) =
                teamMemberTpmLimit(JsonField.ofNullable(teamMemberTpmLimit))

            /**
             * Alias for [Builder.teamMemberTpmLimit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun teamMemberTpmLimit(teamMemberTpmLimit: Long) =
                teamMemberTpmLimit(teamMemberTpmLimit as Long?)

            /**
             * Sets [Builder.teamMemberTpmLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.teamMemberTpmLimit] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun teamMemberTpmLimit(teamMemberTpmLimit: JsonField<Long>) = apply {
                this.teamMemberTpmLimit = teamMemberTpmLimit
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
                    (admins ?: JsonMissing.of()).map { it.toImmutable() },
                    (allowedPassthroughRoutes ?: JsonMissing.of()).map { it.toImmutable() },
                    (allowedVectorStoreIndexes ?: JsonMissing.of()).map { it.toImmutable() },
                    blocked,
                    budgetDuration,
                    (guardrails ?: JsonMissing.of()).map { it.toImmutable() },
                    maxBudget,
                    (members ?: JsonMissing.of()).map { it.toImmutable() },
                    (membersWithRoles ?: JsonMissing.of()).map { it.toImmutable() },
                    metadata,
                    modelAliases,
                    modelRpmLimit,
                    modelTpmLimit,
                    (models ?: JsonMissing.of()).map { it.toImmutable() },
                    objectPermission,
                    organizationId,
                    (prompts ?: JsonMissing.of()).map { it.toImmutable() },
                    routerSettings,
                    rpmLimit,
                    rpmLimitType,
                    secretManagerSettings,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    teamAlias,
                    teamId,
                    teamMemberBudget,
                    teamMemberKeyDuration,
                    (teamMemberPermissions ?: JsonMissing.of()).map { it.toImmutable() },
                    teamMemberRpmLimit,
                    teamMemberTpmLimit,
                    tpmLimit,
                    tpmLimitType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            admins()
            allowedPassthroughRoutes()
            allowedVectorStoreIndexes()?.forEach { it.validate() }
            blocked()
            budgetDuration()
            guardrails()
            maxBudget()
            members()
            membersWithRoles()?.forEach { it.validate() }
            metadata()?.validate()
            modelAliases()?.validate()
            modelRpmLimit()?.validate()
            modelTpmLimit()?.validate()
            models()
            objectPermission()?.validate()
            organizationId()
            prompts()
            routerSettings()?.validate()
            rpmLimit()
            rpmLimitType()?.validate()
            secretManagerSettings()?.validate()
            tags()
            teamAlias()
            teamId()
            teamMemberBudget()
            teamMemberKeyDuration()
            teamMemberPermissions()
            teamMemberRpmLimit()
            teamMemberTpmLimit()
            tpmLimit()
            tpmLimitType()?.validate()
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
            (admins.asKnown()?.size ?: 0) +
                (allowedPassthroughRoutes.asKnown()?.size ?: 0) +
                (allowedVectorStoreIndexes.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (blocked.asKnown() == null) 0 else 1) +
                (if (budgetDuration.asKnown() == null) 0 else 1) +
                (guardrails.asKnown()?.size ?: 0) +
                (if (maxBudget.asKnown() == null) 0 else 1) +
                (members.asKnown()?.size ?: 0) +
                (membersWithRoles.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (metadata.asKnown()?.validity() ?: 0) +
                (modelAliases.asKnown()?.validity() ?: 0) +
                (modelRpmLimit.asKnown()?.validity() ?: 0) +
                (modelTpmLimit.asKnown()?.validity() ?: 0) +
                (models.asKnown()?.size ?: 0) +
                (objectPermission.asKnown()?.validity() ?: 0) +
                (if (organizationId.asKnown() == null) 0 else 1) +
                (prompts.asKnown()?.size ?: 0) +
                (routerSettings.asKnown()?.validity() ?: 0) +
                (if (rpmLimit.asKnown() == null) 0 else 1) +
                (rpmLimitType.asKnown()?.validity() ?: 0) +
                (secretManagerSettings.asKnown()?.validity() ?: 0) +
                (tags.asKnown()?.size ?: 0) +
                (if (teamAlias.asKnown() == null) 0 else 1) +
                (if (teamId.asKnown() == null) 0 else 1) +
                (if (teamMemberBudget.asKnown() == null) 0 else 1) +
                (if (teamMemberKeyDuration.asKnown() == null) 0 else 1) +
                (teamMemberPermissions.asKnown()?.size ?: 0) +
                (if (teamMemberRpmLimit.asKnown() == null) 0 else 1) +
                (if (teamMemberTpmLimit.asKnown() == null) 0 else 1) +
                (if (tpmLimit.asKnown() == null) 0 else 1) +
                (tpmLimitType.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                admins == other.admins &&
                allowedPassthroughRoutes == other.allowedPassthroughRoutes &&
                allowedVectorStoreIndexes == other.allowedVectorStoreIndexes &&
                blocked == other.blocked &&
                budgetDuration == other.budgetDuration &&
                guardrails == other.guardrails &&
                maxBudget == other.maxBudget &&
                members == other.members &&
                membersWithRoles == other.membersWithRoles &&
                metadata == other.metadata &&
                modelAliases == other.modelAliases &&
                modelRpmLimit == other.modelRpmLimit &&
                modelTpmLimit == other.modelTpmLimit &&
                models == other.models &&
                objectPermission == other.objectPermission &&
                organizationId == other.organizationId &&
                prompts == other.prompts &&
                routerSettings == other.routerSettings &&
                rpmLimit == other.rpmLimit &&
                rpmLimitType == other.rpmLimitType &&
                secretManagerSettings == other.secretManagerSettings &&
                tags == other.tags &&
                teamAlias == other.teamAlias &&
                teamId == other.teamId &&
                teamMemberBudget == other.teamMemberBudget &&
                teamMemberKeyDuration == other.teamMemberKeyDuration &&
                teamMemberPermissions == other.teamMemberPermissions &&
                teamMemberRpmLimit == other.teamMemberRpmLimit &&
                teamMemberTpmLimit == other.teamMemberTpmLimit &&
                tpmLimit == other.tpmLimit &&
                tpmLimitType == other.tpmLimitType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                admins,
                allowedPassthroughRoutes,
                allowedVectorStoreIndexes,
                blocked,
                budgetDuration,
                guardrails,
                maxBudget,
                members,
                membersWithRoles,
                metadata,
                modelAliases,
                modelRpmLimit,
                modelTpmLimit,
                models,
                objectPermission,
                organizationId,
                prompts,
                routerSettings,
                rpmLimit,
                rpmLimitType,
                secretManagerSettings,
                tags,
                teamAlias,
                teamId,
                teamMemberBudget,
                teamMemberKeyDuration,
                teamMemberPermissions,
                teamMemberRpmLimit,
                teamMemberTpmLimit,
                tpmLimit,
                tpmLimitType,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{admins=$admins, allowedPassthroughRoutes=$allowedPassthroughRoutes, allowedVectorStoreIndexes=$allowedVectorStoreIndexes, blocked=$blocked, budgetDuration=$budgetDuration, guardrails=$guardrails, maxBudget=$maxBudget, members=$members, membersWithRoles=$membersWithRoles, metadata=$metadata, modelAliases=$modelAliases, modelRpmLimit=$modelRpmLimit, modelTpmLimit=$modelTpmLimit, models=$models, objectPermission=$objectPermission, organizationId=$organizationId, prompts=$prompts, routerSettings=$routerSettings, rpmLimit=$rpmLimit, rpmLimitType=$rpmLimitType, secretManagerSettings=$secretManagerSettings, tags=$tags, teamAlias=$teamAlias, teamId=$teamId, teamMemberBudget=$teamMemberBudget, teamMemberKeyDuration=$teamMemberKeyDuration, teamMemberPermissions=$teamMemberPermissions, teamMemberRpmLimit=$teamMemberRpmLimit, teamMemberTpmLimit=$teamMemberTpmLimit, tpmLimit=$tpmLimit, tpmLimitType=$tpmLimitType, additionalProperties=$additionalProperties}"
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

    class ModelAliases
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

            /** Returns a mutable builder for constructing an instance of [ModelAliases]. */
            fun builder() = Builder()
        }

        /** A builder for [ModelAliases]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(modelAliases: ModelAliases) = apply {
                additionalProperties = modelAliases.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ModelAliases].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ModelAliases = ModelAliases(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ModelAliases = apply {
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

            return other is ModelAliases && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ModelAliases{additionalProperties=$additionalProperties}"
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

            fun of(value: String) = RpmLimitType(JsonField.of(value))
        }

        /** An enum containing [RpmLimitType]'s known values. */
        enum class Known {
            GUARANTEED_THROUGHPUT,
            BEST_EFFORT_THROUGHPUT,
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

    class SecretManagerSettings
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
             * Returns a mutable builder for constructing an instance of [SecretManagerSettings].
             */
            fun builder() = Builder()
        }

        /** A builder for [SecretManagerSettings]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(secretManagerSettings: SecretManagerSettings) = apply {
                additionalProperties = secretManagerSettings.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [SecretManagerSettings].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SecretManagerSettings =
                SecretManagerSettings(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): SecretManagerSettings = apply {
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

            return other is SecretManagerSettings &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SecretManagerSettings{additionalProperties=$additionalProperties}"
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

            fun of(value: String) = TpmLimitType(JsonField.of(value))
        }

        /** An enum containing [TpmLimitType]'s known values. */
        enum class Known {
            GUARANTEED_THROUGHPUT,
            BEST_EFFORT_THROUGHPUT,
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TeamCreateParams &&
            litellmChangedBy == other.litellmChangedBy &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(litellmChangedBy, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TeamCreateParams{litellmChangedBy=$litellmChangedBy, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
