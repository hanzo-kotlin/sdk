// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.team.TeamAddMemberParams
import ai.hanzo.api.models.team.TeamAddMemberResponse
import ai.hanzo.api.models.team.TeamBlockParams
import ai.hanzo.api.models.team.TeamBlockResponse
import ai.hanzo.api.models.team.TeamCreateParams
import ai.hanzo.api.models.team.TeamCreateResponse
import ai.hanzo.api.models.team.TeamDeleteParams
import ai.hanzo.api.models.team.TeamDeleteResponse
import ai.hanzo.api.models.team.TeamDisableLoggingParams
import ai.hanzo.api.models.team.TeamDisableLoggingResponse
import ai.hanzo.api.models.team.TeamListAvailableParams
import ai.hanzo.api.models.team.TeamListAvailableResponse
import ai.hanzo.api.models.team.TeamListParams
import ai.hanzo.api.models.team.TeamListResponse
import ai.hanzo.api.models.team.TeamRemoveMemberParams
import ai.hanzo.api.models.team.TeamRemoveMemberResponse
import ai.hanzo.api.models.team.TeamRetrieveInfoParams
import ai.hanzo.api.models.team.TeamRetrieveInfoResponse
import ai.hanzo.api.models.team.TeamUnblockParams
import ai.hanzo.api.models.team.TeamUnblockResponse
import ai.hanzo.api.models.team.TeamUpdateMemberParams
import ai.hanzo.api.models.team.TeamUpdateMemberResponse
import ai.hanzo.api.models.team.TeamUpdateParams
import ai.hanzo.api.models.team.TeamUpdateResponse
import ai.hanzo.api.services.async.team.CallbackServiceAsync
import ai.hanzo.api.services.async.team.ModelServiceAsync
import com.google.errorprone.annotations.MustBeClosed

interface TeamServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TeamServiceAsync

    fun model(): ModelServiceAsync

    fun callback(): CallbackServiceAsync

    /**
     * Allow users to create a new team. Apply user permissions to their team.
     *
     * 👉 [Detailed Doc on setting team budgets](https://docs.hanzo.ai/docs/proxy/team_budgets)
     *
     * Parameters:
     * - team_alias: Optional[str] - User defined team alias
     * - team_id: Optional[str] - The team id of the user. If none passed, we'll generate it.
     * - members_with_roles: List[{"role": "admin" or "user", "user_id": "<user-id>"}] - A list of
     *   users and their roles in the team. Get user_id when making a new user via `/user/new`.
     * - metadata: Optional[dict] - Metadata for team, store information for team. Example metadata
     *   = {"extra_info": "some info"}
     * - tpm_limit: Optional[int] - The TPM (Tokens Per Minute) limit for this team - all keys with
     *   this team_id will have at max this TPM limit
     * - rpm_limit: Optional[int] - The RPM (Requests Per Minute) limit for this team - all keys
     *   associated with this team_id will have at max this RPM limit
     * - max_budget: Optional[float] - The maximum budget allocated to the team - all keys for this
     *   team_id will have at max this max_budget
     * - budget_duration: Optional[str] - The duration of the budget for the team. Doc
     *   [here](https://docs.hanzo.ai/docs/proxy/team_budgets)
     * - models: Optional[list] - A list of models associated with the team - all keys for this
     *   team_id will have at most, these models. If empty, assumes all models are allowed.
     * - blocked: bool - Flag indicating if the team is blocked or not - will stop all calls from
     *   keys with this team_id.
     * - members: Optional[List] - Control team members via `/team/member/add` and
     *   `/team/member/delete`.
     * - tags: Optional[List[str]] - Tags for
     *   [tracking spend](https://llm.vercel.app/docs/proxy/enterprise#tracking-spend-for-custom-tags)
     *   and/or doing [tag-based routing](https://llm.vercel.app/docs/proxy/tag_routing).
     * - organization_id: Optional[str] - The organization id of the team. Default is None. Create
     *   via `/organization/new`.
     * - model_aliases: Optional[dict] - Model aliases for the team.
     *   [Docs](https://docs.hanzo.ai/docs/proxy/team_based_routing#create-team-with-model-alias)
     * - guardrails: Optional[List[str]] - Guardrails for the team.
     *   [Docs](https://docs.hanzo.ai/docs/proxy/guardrails) Returns:
     * - team_id: (str) Unique team id - used for tracking spend across multiple keys for same team
     *   id.
     *
     * \_deprecated_params:
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
     * ```
     * curl --location 'http://0.0.0.0:4000/team/new'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data '{
     *            "team_alias": "QA Prod Bot",
     *            "max_budget": 0.000000001,
     *            "budget_duration": "1d"
     *        }'
     * ```
     */
    suspend fun create(
        params: TeamCreateParams = TeamCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TeamCreateResponse

    /** @see create */
    suspend fun create(requestOptions: RequestOptions): TeamCreateResponse =
        create(TeamCreateParams.none(), requestOptions)

    /**
     * Use `/team/member_add` AND `/team/member/delete` to add/remove new team members
     *
     * You can now update team budget / rate limits via /team/update
     *
     * Parameters:
     * - team_id: str - The team id of the user. Required param.
     * - team_alias: Optional[str] - User defined team alias
     * - metadata: Optional[dict] - Metadata for team, store information for team. Example metadata
     *   = {"team": "core-infra", "app": "app2", "email": "z@hanzo.ai" }
     * - tpm_limit: Optional[int] - The TPM (Tokens Per Minute) limit for this team - all keys with
     *   this team_id will have at max this TPM limit
     * - rpm_limit: Optional[int] - The RPM (Requests Per Minute) limit for this team - all keys
     *   associated with this team_id will have at max this RPM limit
     * - max_budget: Optional[float] - The maximum budget allocated to the team - all keys for this
     *   team_id will have at max this max_budget
     * - budget_duration: Optional[str] - The duration of the budget for the team. Doc
     *   [here](https://docs.hanzo.ai/docs/proxy/team_budgets)
     * - models: Optional[list] - A list of models associated with the team - all keys for this
     *   team_id will have at most, these models. If empty, assumes all models are allowed.
     * - blocked: bool - Flag indicating if the team is blocked or not - will stop all calls from
     *   keys with this team_id.
     * - tags: Optional[List[str]] - Tags for
     *   [tracking spend](https://llm.vercel.app/docs/proxy/enterprise#tracking-spend-for-custom-tags)
     *   and/or doing [tag-based routing](https://llm.vercel.app/docs/proxy/tag_routing).
     * - organization_id: Optional[str] - The organization id of the team. Default is None. Create
     *   via `/organization/new`.
     * - model_aliases: Optional[dict] - Model aliases for the team.
     *   [Docs](https://docs.hanzo.ai/docs/proxy/team_based_routing#create-team-with-model-alias)
     * - guardrails: Optional[List[str]] - Guardrails for the team.
     *   [Docs](https://docs.hanzo.ai/docs/proxy/guardrails) Example - update team TPM Limit
     *
     * ```
     * curl --location 'http://0.0.0.0:4000/team/update'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data-raw '{
     *     "team_id": "8d916b1c-510d-4894-a334-1c16a93344f5",
     *     "tpm_limit": 100
     * }'
     * ```
     *
     * Example - Update Team `max_budget` budget
     *
     * ```
     * curl --location 'http://0.0.0.0:4000/team/update'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data-raw '{
     *     "team_id": "8d916b1c-510d-4894-a334-1c16a93344f5",
     *     "max_budget": 10
     * }'
     * ```
     */
    suspend fun update(
        params: TeamUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TeamUpdateResponse

    /**
     * ```
     * curl --location --request GET 'http://0.0.0.0:4000/team/list'         --header 'Authorization: Bearer sk-1234'
     * ```
     *
     * Parameters:
     * - user_id: str - Optional. If passed will only return teams that the user_id is a member of.
     * - organization_id: str - Optional. If passed will only return teams that belong to the
     *   organization_id. Pass 'default_organization' to get all teams without organization_id.
     */
    suspend fun list(
        params: TeamListParams = TeamListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TeamListResponse

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): TeamListResponse =
        list(TeamListParams.none(), requestOptions)

    /**
     * delete team and associated team keys
     *
     * Parameters:
     * - team_ids: List[str] - Required. List of team IDs to delete. Example:
     *   ["team-1234", "team-5678"]
     *
     * ```
     * curl --location 'http://0.0.0.0:4000/team/delete'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data-raw '{
     *     "team_ids": ["8d916b1c-510d-4894-a334-1c16a93344f5"]
     * }'
     * ```
     */
    suspend fun delete(
        params: TeamDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TeamDeleteResponse

    /**
     * [BETA]
     *
     * Add new members (either via user_email or user_id) to a team
     *
     * If user doesn't exist, new user row will also be added to User Table
     *
     * Only proxy_admin or admin of team, allowed to access this endpoint.
     *
     * ```
     *
     * curl -X POST 'http://0.0.0.0:4000/team/member_add'     -H 'Authorization: Bearer sk-1234'     -H 'Content-Type: application/json'     -d '{"team_id": "45e3e396-ee08-4a61-a88e-16b3ce7e0849", "member": {"role": "user", "user_id": "dev247652@hanzo.ai"}}'
     *
     * ```
     */
    suspend fun addMember(
        params: TeamAddMemberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TeamAddMemberResponse

    /**
     * Blocks all calls from keys with this team id.
     *
     * Parameters:
     * - team_id: str - Required. The unique identifier of the team to block.
     *
     * Example:
     * ```
     * curl --location 'http://0.0.0.0:4000/team/block'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data '{
     *     "team_id": "team-1234"
     * }'
     * ```
     *
     * Returns:
     * - The updated team record with blocked=True
     */
    suspend fun block(
        params: TeamBlockParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TeamBlockResponse

    /**
     * Disable all logging callbacks for a team
     *
     * Parameters:
     * - team_id (str, required): The unique identifier for the team
     *
     * Example curl:
     * ```
     * curl -X POST 'http://localhost:4000/team/dbe2f686-a686-4896-864a-4c3924458709/disable_logging'         -H 'Authorization: Bearer sk-1234'
     * ```
     */
    suspend fun disableLogging(
        teamId: String,
        params: TeamDisableLoggingParams = TeamDisableLoggingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TeamDisableLoggingResponse =
        disableLogging(params.toBuilder().teamId(teamId).build(), requestOptions)

    /** @see disableLogging */
    suspend fun disableLogging(
        params: TeamDisableLoggingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TeamDisableLoggingResponse

    /** @see disableLogging */
    suspend fun disableLogging(
        teamId: String,
        requestOptions: RequestOptions,
    ): TeamDisableLoggingResponse =
        disableLogging(teamId, TeamDisableLoggingParams.none(), requestOptions)

    /** List Available Teams */
    suspend fun listAvailable(
        params: TeamListAvailableParams = TeamListAvailableParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TeamListAvailableResponse

    /** @see listAvailable */
    suspend fun listAvailable(requestOptions: RequestOptions): TeamListAvailableResponse =
        listAvailable(TeamListAvailableParams.none(), requestOptions)

    /**
     * [BETA]
     *
     * delete members (either via user_email or user_id) from a team
     *
     * If user doesn't exist, an exception will be raised
     *
     * ```
     * curl -X POST 'http://0.0.0.0:8000/team/member_delete'
     * -H 'Authorization: Bearer sk-1234'
     * -H 'Content-Type: application/json'
     * -d '{
     *     "team_id": "45e3e396-ee08-4a61-a88e-16b3ce7e0849",
     *     "user_id": "dev247652@hanzo.ai"
     * }'
     * ```
     */
    suspend fun removeMember(
        params: TeamRemoveMemberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TeamRemoveMemberResponse

    /**
     * get info on team + related keys
     *
     * Parameters:
     * - team_id: str - Required. The unique identifier of the team to get info on.
     *
     * ```
     * curl --location 'http://localhost:4000/team/info?team_id=your_team_id_here'     --header 'Authorization: Bearer your_api_key_here'
     * ```
     */
    suspend fun retrieveInfo(
        params: TeamRetrieveInfoParams = TeamRetrieveInfoParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TeamRetrieveInfoResponse

    /** @see retrieveInfo */
    suspend fun retrieveInfo(requestOptions: RequestOptions): TeamRetrieveInfoResponse =
        retrieveInfo(TeamRetrieveInfoParams.none(), requestOptions)

    /**
     * Blocks all calls from keys with this team id.
     *
     * Parameters:
     * - team_id: str - Required. The unique identifier of the team to unblock.
     *
     * Example:
     * ```
     * curl --location 'http://0.0.0.0:4000/team/unblock'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data '{
     *     "team_id": "team-1234"
     * }'
     * ```
     */
    suspend fun unblock(
        params: TeamUnblockParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TeamUnblockResponse

    /**
     * [BETA]
     *
     * Update team member budgets and team member role
     */
    suspend fun updateMember(
        params: TeamUpdateMemberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TeamUpdateMemberResponse

    /** A view of [TeamServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TeamServiceAsync.WithRawResponse

        fun model(): ModelServiceAsync.WithRawResponse

        fun callback(): CallbackServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /team/new`, but is otherwise the same as
         * [TeamServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: TeamCreateParams = TeamCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TeamCreateResponse>

        /** @see create */
        @MustBeClosed
        suspend fun create(requestOptions: RequestOptions): HttpResponseFor<TeamCreateResponse> =
            create(TeamCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /team/update`, but is otherwise the same as
         * [TeamServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: TeamUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TeamUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /team/list`, but is otherwise the same as
         * [TeamServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: TeamListParams = TeamListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TeamListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<TeamListResponse> =
            list(TeamListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /team/delete`, but is otherwise the same as
         * [TeamServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: TeamDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TeamDeleteResponse>

        /**
         * Returns a raw HTTP response for `post /team/member_add`, but is otherwise the same as
         * [TeamServiceAsync.addMember].
         */
        @MustBeClosed
        suspend fun addMember(
            params: TeamAddMemberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TeamAddMemberResponse>

        /**
         * Returns a raw HTTP response for `post /team/block`, but is otherwise the same as
         * [TeamServiceAsync.block].
         */
        @MustBeClosed
        suspend fun block(
            params: TeamBlockParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TeamBlockResponse>

        /**
         * Returns a raw HTTP response for `post /team/{team_id}/disable_logging`, but is otherwise
         * the same as [TeamServiceAsync.disableLogging].
         */
        @MustBeClosed
        suspend fun disableLogging(
            teamId: String,
            params: TeamDisableLoggingParams = TeamDisableLoggingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TeamDisableLoggingResponse> =
            disableLogging(params.toBuilder().teamId(teamId).build(), requestOptions)

        /** @see disableLogging */
        @MustBeClosed
        suspend fun disableLogging(
            params: TeamDisableLoggingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TeamDisableLoggingResponse>

        /** @see disableLogging */
        @MustBeClosed
        suspend fun disableLogging(
            teamId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TeamDisableLoggingResponse> =
            disableLogging(teamId, TeamDisableLoggingParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /team/available`, but is otherwise the same as
         * [TeamServiceAsync.listAvailable].
         */
        @MustBeClosed
        suspend fun listAvailable(
            params: TeamListAvailableParams = TeamListAvailableParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TeamListAvailableResponse>

        /** @see listAvailable */
        @MustBeClosed
        suspend fun listAvailable(
            requestOptions: RequestOptions
        ): HttpResponseFor<TeamListAvailableResponse> =
            listAvailable(TeamListAvailableParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /team/member_delete`, but is otherwise the same as
         * [TeamServiceAsync.removeMember].
         */
        @MustBeClosed
        suspend fun removeMember(
            params: TeamRemoveMemberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TeamRemoveMemberResponse>

        /**
         * Returns a raw HTTP response for `get /team/info`, but is otherwise the same as
         * [TeamServiceAsync.retrieveInfo].
         */
        @MustBeClosed
        suspend fun retrieveInfo(
            params: TeamRetrieveInfoParams = TeamRetrieveInfoParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TeamRetrieveInfoResponse>

        /** @see retrieveInfo */
        @MustBeClosed
        suspend fun retrieveInfo(
            requestOptions: RequestOptions
        ): HttpResponseFor<TeamRetrieveInfoResponse> =
            retrieveInfo(TeamRetrieveInfoParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /team/unblock`, but is otherwise the same as
         * [TeamServiceAsync.unblock].
         */
        @MustBeClosed
        suspend fun unblock(
            params: TeamUnblockParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TeamUnblockResponse>

        /**
         * Returns a raw HTTP response for `post /team/member_update`, but is otherwise the same as
         * [TeamServiceAsync.updateMember].
         */
        @MustBeClosed
        suspend fun updateMember(
            params: TeamUpdateMemberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TeamUpdateMemberResponse>
    }
}
