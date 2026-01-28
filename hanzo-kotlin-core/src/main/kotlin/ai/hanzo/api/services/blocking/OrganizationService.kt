// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.organization.OrganizationAddMemberParams
import ai.hanzo.api.models.organization.OrganizationAddMemberResponse
import ai.hanzo.api.models.organization.OrganizationCreateParams
import ai.hanzo.api.models.organization.OrganizationCreateResponse
import ai.hanzo.api.models.organization.OrganizationDeleteMemberParams
import ai.hanzo.api.models.organization.OrganizationDeleteMemberResponse
import ai.hanzo.api.models.organization.OrganizationDeleteParams
import ai.hanzo.api.models.organization.OrganizationListParams
import ai.hanzo.api.models.organization.OrganizationMembershipTable
import ai.hanzo.api.models.organization.OrganizationTableWithMembers
import ai.hanzo.api.models.organization.OrganizationUpdateMemberParams
import ai.hanzo.api.models.organization.OrganizationUpdateParams
import ai.hanzo.api.services.blocking.organization.InfoService
import com.google.errorprone.annotations.MustBeClosed

interface OrganizationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OrganizationService

    fun info(): InfoService

    /**
     * Allow orgs to own teams
     *
     * Set org level budgets + model access.
     *
     * Only admins can create orgs.
     *
     * # Parameters
     * - organization_alias: *str* - The name of the organization.
     * - models: *List* - The models the organization has access to.
     * - budget_id: *Optional[str]* - The id for a budget (tpm/rpm/max budget) for the organization.
     *
     * ### IF NO BUDGET ID - CREATE ONE WITH THESE PARAMS ###
     * - max_budget: *Optional[float]* - Max budget for org
     * - tpm_limit: *Optional[int]* - Max tpm limit for org
     * - rpm_limit: *Optional[int]* - Max rpm limit for org
     * - model_rpm_limit: *Optional[Dict[str, int]]* - The RPM (Requests Per Minute) limit per model
     *   for this organization.
     * - model_tpm_limit: *Optional[Dict[str, int]]* - The TPM (Tokens Per Minute) limit per model
     *   for this organization.
     * - max_parallel_requests: *Optional[int]* - [Not Implemented Yet] Max parallel requests for
     *   org
     * - soft_budget: *Optional[float]* - [Not Implemented Yet] Get a slack alert when this soft
     *   budget is reached. Don't block requests.
     * - model_max_budget: *Optional[dict]* - Max budget for a specific model
     * - budget_duration: *Optional[str]* - Frequency of reseting org budget
     * - metadata: *Optional[dict]* - Metadata for organization, store information for organization.
     *   Example metadata - {"extra_info": "some info"}
     * - blocked: *bool* - Flag indicating if the org is blocked or not - will stop all calls from
     *   keys with this org_id.
     * - tags: *Optional[List[str]]* - Tags for
     *   [tracking spend](https://litellm.vercel.app/docs/proxy/enterprise#tracking-spend-for-custom-tags)
     *   and/or doing [tag-based routing](https://litellm.vercel.app/docs/proxy/tag_routing).
     * - organization_id: *Optional[str]* - The organization id of the team. Default is None. Create
     *   via `/organization/new`.
     * - model_aliases: Optional[dict] - Model aliases for the team.
     *   [Docs](https://docs.litellm.ai/docs/proxy/team_based_routing#create-team-with-model-alias)
     * - object_permission: Optional[LiteLLM_ObjectPermissionBase] - organization-specific object
     *   permission. Example - {"vector_stores": ["vector_store_1", "vector_store_2"]}. IF null or
     *   {} then no object permission. Case 1: Create new org **without** a budget_id
     *
     * ```bash
     * curl --location 'http://0.0.0.0:4000/organization/new'
     * --header 'Authorization: Bearer sk-1234'
     * --header 'Content-Type: application/json'
     * --data '{
     *     "organization_alias": "my-secret-org",
     *     "models": ["model1", "model2"],
     *     "max_budget": 100
     * }'
     *
     *
     * ```
     *
     * Case 2: Create new org **with** a budget_id
     *
     * ```bash
     * curl --location 'http://0.0.0.0:4000/organization/new'
     * --header 'Authorization: Bearer sk-1234'
     * --header 'Content-Type: application/json'
     * --data '{
     *     "organization_alias": "my-secret-org",
     *     "models": ["model1", "model2"],
     *     "budget_id": "428eeaa8-f3ac-4e85-a8fb-7dc8d7aa8689"
     * }'
     * ```
     */
    fun create(
        params: OrganizationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrganizationCreateResponse

    /** Update an organization */
    fun update(
        params: OrganizationUpdateParams = OrganizationUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrganizationTableWithMembers

    /** @see update */
    fun update(requestOptions: RequestOptions): OrganizationTableWithMembers =
        update(OrganizationUpdateParams.none(), requestOptions)

    /**
     * Get a list of organizations with optional filtering.
     *
     * Parameters: org_id: Optional[str] Filter organizations by exact organization_id match
     * org_alias: Optional[str] Filter organizations by partial organization_alias match
     * (case-insensitive)
     *
     * Example:
     * ```
     * curl --location --request GET 'http://0.0.0.0:4000/organization/list?org_alias=my-org'         --header 'Authorization: Bearer sk-1234'
     * ```
     *
     * Example with org_id:
     * ```
     * curl --location --request GET 'http://0.0.0.0:4000/organization/list?org_id=123e4567-e89b-12d3-a456-426614174000'         --header 'Authorization: Bearer sk-1234'
     * ```
     */
    fun list(
        params: OrganizationListParams = OrganizationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<OrganizationTableWithMembers>

    /** @see list */
    fun list(requestOptions: RequestOptions): List<OrganizationTableWithMembers> =
        list(OrganizationListParams.none(), requestOptions)

    /**
     * Delete an organization
     *
     * # Parameters:
     * - organization_ids: List[str] - The organization ids to delete.
     */
    fun delete(
        params: OrganizationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<OrganizationTableWithMembers>

    /**
     * [BETA]
     *
     * Add new members (either via user_email or user_id) to an organization
     *
     * If user doesn't exist, new user row will also be added to User Table
     *
     * Only proxy_admin or org_admin of organization, allowed to access this endpoint.
     *
     * # Parameters:
     * - organization_id: str (required)
     * - member: Union[List[Member], Member] (required)
     *     - role: Literal[LitellmUserRoles] (required)
     *     - user_id: Optional[str]
     *     - user_email: Optional[str]
     *
     * Note: Either user_id or user_email must be provided for each member.
     *
     * Example:
     * ```
     * curl -X POST 'http://0.0.0.0:4000/organization/member_add'     -H 'Authorization: Bearer sk-1234'     -H 'Content-Type: application/json'     -d '{
     *     "organization_id": "45e3e396-ee08-4a61-a88e-16b3ce7e0849",
     *     "member": {
     *         "role": "internal_user",
     *         "user_id": "krrish247652@berri.ai"
     *     },
     *     "max_budget_in_organization": 100.0
     * }'
     * ```
     *
     * The following is executed in this function:
     * 1. Check if organization exists
     * 2. Creates a new Internal User if the user_id or user_email is not found in LiteLLM_UserTable
     * 3. Add Internal User to the `LiteLLM_OrganizationMembership` table
     */
    fun addMember(
        params: OrganizationAddMemberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrganizationAddMemberResponse

    /** Delete a member from an organization */
    fun deleteMember(
        params: OrganizationDeleteMemberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrganizationDeleteMemberResponse

    /** Update a member's role in an organization */
    fun updateMember(
        params: OrganizationUpdateMemberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrganizationMembershipTable

    /**
     * A view of [OrganizationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): OrganizationService.WithRawResponse

        fun info(): InfoService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organization/new`, but is otherwise the same as
         * [OrganizationService.create].
         */
        @MustBeClosed
        fun create(
            params: OrganizationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrganizationCreateResponse>

        /**
         * Returns a raw HTTP response for `patch /organization/update`, but is otherwise the same
         * as [OrganizationService.update].
         */
        @MustBeClosed
        fun update(
            params: OrganizationUpdateParams = OrganizationUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrganizationTableWithMembers>

        /** @see update */
        @MustBeClosed
        fun update(requestOptions: RequestOptions): HttpResponseFor<OrganizationTableWithMembers> =
            update(OrganizationUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /organization/list`, but is otherwise the same as
         * [OrganizationService.list].
         */
        @MustBeClosed
        fun list(
            params: OrganizationListParams = OrganizationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<OrganizationTableWithMembers>>

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<OrganizationTableWithMembers>> =
            list(OrganizationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organization/delete`, but is otherwise the same
         * as [OrganizationService.delete].
         */
        @MustBeClosed
        fun delete(
            params: OrganizationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<OrganizationTableWithMembers>>

        /**
         * Returns a raw HTTP response for `post /organization/member_add`, but is otherwise the
         * same as [OrganizationService.addMember].
         */
        @MustBeClosed
        fun addMember(
            params: OrganizationAddMemberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrganizationAddMemberResponse>

        /**
         * Returns a raw HTTP response for `delete /organization/member_delete`, but is otherwise
         * the same as [OrganizationService.deleteMember].
         */
        @MustBeClosed
        fun deleteMember(
            params: OrganizationDeleteMemberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrganizationDeleteMemberResponse>

        /**
         * Returns a raw HTTP response for `patch /organization/member_update`, but is otherwise the
         * same as [OrganizationService.updateMember].
         */
        @MustBeClosed
        fun updateMember(
            params: OrganizationUpdateMemberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrganizationMembershipTable>
    }
}
