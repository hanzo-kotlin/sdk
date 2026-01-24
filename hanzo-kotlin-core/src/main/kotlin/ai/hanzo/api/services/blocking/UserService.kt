// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.user.UserCreateParams
import ai.hanzo.api.models.user.UserCreateResponse
import ai.hanzo.api.models.user.UserDeleteParams
import ai.hanzo.api.models.user.UserDeleteResponse
import ai.hanzo.api.models.user.UserRetrieveInfoParams
import ai.hanzo.api.models.user.UserRetrieveInfoResponse
import ai.hanzo.api.models.user.UserUpdateParams
import ai.hanzo.api.models.user.UserUpdateResponse
import com.google.errorprone.annotations.MustBeClosed

interface UserService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserService

    /**
     * Use this to create a new INTERNAL user with a budget. Internal Users can access LiteLLM Admin
     * UI to make keys, request access to models. This creates a new user and generates a new api
     * key for the new user. The new api key is returned.
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
     *   `https://github.com/BerriAI/litellm/litellm/proxy/_types.py#L20`
     * - max_budget: Optional[float] - Specify max budget for a given user.
     * - budget_duration: Optional[str] - Budget is reset at the end of specified duration. If not
     *   set, budget is never reset. You can set duration as seconds ("30s"), minutes ("30m"), hours
     *   ("30h"), days ("30d"), months ("1mo").
     * - models: Optional[list] - Model_name's a user is allowed to call. (if empty, key is allowed
     *   to call all models). Set to ['no-default-models'] to block all model access. Restricting
     *   user to only team-based model access.
     * - tpm_limit: Optional[int] - Specify tpm limit for a given user (Tokens per minute)
     * - rpm_limit: Optional[int] - Specify rpm limit for a given user (Requests per minute)
     * - auto_create_key: bool - Default=True. Flag used for returning a key as part of the
     *   /user/new response
     * - aliases: Optional[dict] - Model aliases for the
     *   user - [Docs](https://litellm.vercel.app/docs/proxy/virtual_keys#model-aliases)
     * - config: Optional[dict] - [DEPRECATED PARAM] User-specific config.
     * - allowed_cache_controls: Optional[list] - List of allowed cache control values.
     *   Example - ["no-cache", "no-store"]. See all values -
     *   https://docs.litellm.ai/docs/proxy/caching#turn-on--off-caching-per-request-
     * - blocked: Optional[bool] - [Not Implemented Yet] Whether the user is blocked.
     * - guardrails: Optional[List[str]] - [Not Implemented Yet] List of active guardrails for the
     *   user
     * - permissions: Optional[dict] - [Not Implemented Yet] User-specific permissions, eg. turning
     *   off pii masking.
     * - metadata: Optional[dict] - Metadata for user, store information for user. Example metadata
     *   = {"team": "core-infra", "app": "app2", "email": "ishaan@berri.ai" }
     * - max_parallel_requests: Optional[int] - Rate limit a user based on the number of parallel
     *   requests. Raises 429 error, if user's parallel requests > x.
     * - soft_budget: Optional[float] - Get alerts when user crosses given budget, doesn't block
     *   requests.
     * - model_max_budget: Optional[dict] - Model-specific max budget for user.
     *   [Docs](https://docs.litellm.ai/docs/proxy/users#add-model-specific-budgets-to-keys)
     * - model_rpm_limit: Optional[float] - Model-specific rpm limit for user.
     *   [Docs](https://docs.litellm.ai/docs/proxy/users#add-model-specific-limits-to-keys)
     * - model_tpm_limit: Optional[float] - Model-specific tpm limit for user.
     *   [Docs](https://docs.litellm.ai/docs/proxy/users#add-model-specific-limits-to-keys)
     * - spend: Optional[float] - Amount spent by user. Default is 0. Will be updated by proxy
     *   whenever user is used. You can set duration as seconds ("30s"), minutes ("30m"), hours
     *   ("30h"), days ("30d"), months ("1mo").
     * - team_id: Optional[str] - [DEPRECATED PARAM] The team id of the user. Default is None.
     * - duration: Optional[str] - Duration for the key auto-created on `/user/new`. Default is
     *   None.
     * - key_alias: Optional[str] - Alias for the key auto-created on `/user/new`. Default is None.
     * - sso_user_id: Optional[str] - The id of the user in the SSO provider.
     * - object_permission: Optional[LiteLLM_ObjectPermissionBase] - internal user-specific object
     *   permission. Example - {"vector_stores": ["vector_store_1", "vector_store_2"]}. IF null or
     *   {} then no object permission.
     * - prompts: Optional[List[str]] - List of allowed prompts for the user. If specified, the user
     *   will only be able to use these specific prompts.
     * - organizations: List[str] - List of organization id's the user is a member of Returns:
     * - key: (str) The generated api key for the user
     * - expires: (datetime) Datetime object for when key expires.
     * - user_id: (str) Unique user id - used for tracking spend across multiple keys for same user
     *   id.
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
    fun create(
        params: UserCreateParams = UserCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserCreateResponse

    /** @see create */
    fun create(requestOptions: RequestOptions): UserCreateResponse =
        create(UserCreateParams.none(), requestOptions)

    /**
     * Example curl
     *
     * ```
     * curl --location 'http://0.0.0.0:4000/user/update'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data '{
     *     "user_id": "test-litellm-user-4",
     *     "user_role": "proxy_admin_viewer"
     * }'
     * ```
     *
     * Parameters:
     * - user_id: Optional[str] - Specify a user id. If not set, a unique id will be generated.
     * - user_email: Optional[str] - Specify a user email.
     * - password: Optional[str] - Specify a user password.
     * - user_alias: Optional[str] - A descriptive name for you to know who this user id refers to.
     * - teams: Optional[list] - specify a list of team id's a user belongs to.
     * - send_invite_email: Optional[bool] - Specify if an invite email should be sent.
     * - user_role: Optional[str] - Specify a user role - "proxy_admin", "proxy_admin_viewer",
     *   "internal_user", "internal_user_viewer", "team", "customer". Info about each role here:
     *   `https://github.com/BerriAI/litellm/litellm/proxy/_types.py#L20`
     * - max_budget: Optional[float] - Specify max budget for a given user.
     * - budget_duration: Optional[str] - Budget is reset at the end of specified duration. If not
     *   set, budget is never reset. You can set duration as seconds ("30s"), minutes ("30m"), hours
     *   ("30h"), days ("30d"), months ("1mo").
     * - models: Optional[list] - Model_name's a user is allowed to call. (if empty, key is allowed
     *   to call all models)
     * - tpm_limit: Optional[int] - Specify tpm limit for a given user (Tokens per minute)
     * - rpm_limit: Optional[int] - Specify rpm limit for a given user (Requests per minute)
     * - auto_create_key: bool - Default=True. Flag used for returning a key as part of the
     *   /user/new response
     * - aliases: Optional[dict] - Model aliases for the
     *   user - [Docs](https://litellm.vercel.app/docs/proxy/virtual_keys#model-aliases)
     * - config: Optional[dict] - [DEPRECATED PARAM] User-specific config.
     * - allowed_cache_controls: Optional[list] - List of allowed cache control values.
     *   Example - ["no-cache", "no-store"]. See all values -
     *   https://docs.litellm.ai/docs/proxy/caching#turn-on--off-caching-per-request-
     * - blocked: Optional[bool] - [Not Implemented Yet] Whether the user is blocked.
     * - guardrails: Optional[List[str]] - [Not Implemented Yet] List of active guardrails for the
     *   user
     * - permissions: Optional[dict] - [Not Implemented Yet] User-specific permissions, eg. turning
     *   off pii masking.
     * - metadata: Optional[dict] - Metadata for user, store information for user. Example metadata
     *   = {"team": "core-infra", "app": "app2", "email": "ishaan@berri.ai" }
     * - max_parallel_requests: Optional[int] - Rate limit a user based on the number of parallel
     *   requests. Raises 429 error, if user's parallel requests > x.
     * - soft_budget: Optional[float] - Get alerts when user crosses given budget, doesn't block
     *   requests.
     * - model_max_budget: Optional[dict] - Model-specific max budget for user.
     *   [Docs](https://docs.litellm.ai/docs/proxy/users#add-model-specific-budgets-to-keys)
     * - model_rpm_limit: Optional[float] - Model-specific rpm limit for user.
     *   [Docs](https://docs.litellm.ai/docs/proxy/users#add-model-specific-limits-to-keys)
     * - model_tpm_limit: Optional[float] - Model-specific tpm limit for user.
     *   [Docs](https://docs.litellm.ai/docs/proxy/users#add-model-specific-limits-to-keys)
     * - spend: Optional[float] - Amount spent by user. Default is 0. Will be updated by proxy
     *   whenever user is used. You can set duration as seconds ("30s"), minutes ("30m"), hours
     *   ("30h"), days ("30d"), months ("1mo").
     * - team_id: Optional[str] - [DEPRECATED PARAM] The team id of the user. Default is None.
     * - duration: Optional[str] - [NOT IMPLEMENTED].
     * - key_alias: Optional[str] - [NOT IMPLEMENTED].
     * - object_permission: Optional[LiteLLM_ObjectPermissionBase] - internal user-specific object
     *   permission. Example - {"vector_stores": ["vector_store_1", "vector_store_2"]}. IF null or
     *   {} then no object permission.
     * - prompts: Optional[List[str]] - List of allowed prompts for the user. If specified, the user
     *   will only be able to use these specific prompts.
     */
    fun update(
        params: UserUpdateParams = UserUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserUpdateResponse

    /** @see update */
    fun update(requestOptions: RequestOptions): UserUpdateResponse =
        update(UserUpdateParams.none(), requestOptions)

    /**
     * delete user and associated user keys
     *
     * ```
     * curl --location 'http://0.0.0.0:4000/user/delete'
     * --header 'Authorization: Bearer sk-1234'
     * --header 'Content-Type: application/json'
     * --data-raw '{
     *     "user_ids": ["45e3e396-ee08-4a61-a88e-16b3ce7e0849"]
     * }'
     * ```
     *
     * Parameters:
     * - user_ids: List[str] - The list of user id's to be deleted.
     */
    fun delete(
        params: UserDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserDeleteResponse

    /**
     * [10/07/2024] Note: To get all users (+pagination), use `/user/list` endpoint.
     *
     * Use this to get user information. (user row + all user key info)
     *
     * Example request
     *
     * ```
     * curl -X GET 'http://localhost:4000/user/info?user_id=krrish7%40berri.ai'     --header 'Authorization: Bearer sk-1234'
     * ```
     */
    fun retrieveInfo(
        params: UserRetrieveInfoParams = UserRetrieveInfoParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserRetrieveInfoResponse

    /** @see retrieveInfo */
    fun retrieveInfo(requestOptions: RequestOptions): UserRetrieveInfoResponse =
        retrieveInfo(UserRetrieveInfoParams.none(), requestOptions)

    /** A view of [UserService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /user/new`, but is otherwise the same as
         * [UserService.create].
         */
        @MustBeClosed
        fun create(
            params: UserCreateParams = UserCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<UserCreateResponse> =
            create(UserCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /user/update`, but is otherwise the same as
         * [UserService.update].
         */
        @MustBeClosed
        fun update(
            params: UserUpdateParams = UserUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(requestOptions: RequestOptions): HttpResponseFor<UserUpdateResponse> =
            update(UserUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /user/delete`, but is otherwise the same as
         * [UserService.delete].
         */
        @MustBeClosed
        fun delete(
            params: UserDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserDeleteResponse>

        /**
         * Returns a raw HTTP response for `get /user/info`, but is otherwise the same as
         * [UserService.retrieveInfo].
         */
        @MustBeClosed
        fun retrieveInfo(
            params: UserRetrieveInfoParams = UserRetrieveInfoParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserRetrieveInfoResponse>

        /** @see retrieveInfo */
        @MustBeClosed
        fun retrieveInfo(
            requestOptions: RequestOptions
        ): HttpResponseFor<UserRetrieveInfoResponse> =
            retrieveInfo(UserRetrieveInfoParams.none(), requestOptions)
    }
}
