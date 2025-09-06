// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.key.GenerateKeyResponse
import ai.hanzo.api.models.key.KeyBlockParams
import ai.hanzo.api.models.key.KeyBlockResponse
import ai.hanzo.api.models.key.KeyCheckHealthParams
import ai.hanzo.api.models.key.KeyCheckHealthResponse
import ai.hanzo.api.models.key.KeyDeleteParams
import ai.hanzo.api.models.key.KeyDeleteResponse
import ai.hanzo.api.models.key.KeyGenerateParams
import ai.hanzo.api.models.key.KeyListParams
import ai.hanzo.api.models.key.KeyListResponse
import ai.hanzo.api.models.key.KeyRegenerateByKeyParams
import ai.hanzo.api.models.key.KeyRetrieveInfoParams
import ai.hanzo.api.models.key.KeyRetrieveInfoResponse
import ai.hanzo.api.models.key.KeyUnblockParams
import ai.hanzo.api.models.key.KeyUnblockResponse
import ai.hanzo.api.models.key.KeyUpdateParams
import ai.hanzo.api.models.key.KeyUpdateResponse
import ai.hanzo.api.services.async.key.RegenerateServiceAsync
import com.google.errorprone.annotations.MustBeClosed

interface KeyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): KeyServiceAsync

    fun regenerate(): RegenerateServiceAsync

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
     * - enforced_params: Optional[List[str]] - List of enforced params for the key (Enterprise
     *   only).
     *   [Docs](https://docs.hanzo.ai/docs/proxy/enterprise#enforce-required-params-for-llm-requests)
     * - spend: Optional[float] - Amount spent by key
     * - max_budget: Optional[float] - Max budget for key
     * - model_max_budget: Optional[Dict[str, BudgetConfig]] - Model-specific budgets {"gpt-4":
     *   {"budget_limit": 0.0005, "time_period": "30d"}}
     * - budget_duration: Optional[str] - Budget reset period ("30d", "1h", etc.)
     * - soft_budget: Optional[float] - [TODO] Soft budget limit (warning vs. hard stop). Will
     *   trigger a slack alert when this soft budget is reached.
     * - max_parallel_requests: Optional[int] - Rate limit for parallel requests
     * - metadata: Optional[dict] - Metadata for key. Example {"team": "core-infra", "app": "app2"}
     * - tpm_limit: Optional[int] - Tokens per minute limit
     * - rpm_limit: Optional[int] - Requests per minute limit
     * - model_rpm_limit: Optional[dict] - Model-specific RPM limits {"gpt-4": 100, "claude-v1":
     *   200}
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
     * - temp_budget_expiry: Optional[str] - Expiry time for the temporary budget increase
     *   (Enterprise only).
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
    suspend fun update(
        params: KeyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KeyUpdateResponse

    /**
     * List all keys for a given user / team / organization.
     *
     * Returns: { "keys": List[str] or List[UserAPIKeyAuth], "total_count": int, "current_page":
     * int, "total_pages": int, }
     */
    suspend fun list(
        params: KeyListParams = KeyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KeyListResponse

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): KeyListResponse =
        list(KeyListParams.none(), requestOptions)

    /**
     * Delete a key from the key management system.
     *
     * Parameters::
     * - keys (List[str]): A list of keys or hashed keys to delete. Example {"keys":
     *   ["sk-QWrxEynunsNpV1zT48HIrw", "837e17519f44683334df5291321d97b8bf1098cd490e49e215f6fea935aa28be"]}
     * - key_aliases (List[str]): A list of key aliases to delete. Can be passed instead of
     *   `keys`.Example {"key_aliases": ["alias1", "alias2"]}
     *
     * Returns:
     * - deleted_keys (List[str]): A list of deleted keys. Example {"deleted_keys":
     *   ["sk-QWrxEynunsNpV1zT48HIrw", "837e17519f44683334df5291321d97b8bf1098cd490e49e215f6fea935aa28be"]}
     *
     * Example:
     * ```bash
     * curl --location 'http://0.0.0.0:4000/key/delete'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data '{
     *     "keys": ["sk-QWrxEynunsNpV1zT48HIrw"]
     * }'
     * ```
     *
     * Raises: HTTPException: If an error occurs during key deletion.
     */
    suspend fun delete(
        params: KeyDeleteParams = KeyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KeyDeleteResponse

    /** @see delete */
    suspend fun delete(requestOptions: RequestOptions): KeyDeleteResponse =
        delete(KeyDeleteParams.none(), requestOptions)

    /**
     * Block an Virtual key from making any requests.
     *
     * Parameters:
     * - key: str - The key to block. Can be either the unhashed key (sk-...) or the hashed key
     *   value
     *
     * Example:
     * ```bash
     * curl --location 'http://0.0.0.0:4000/key/block'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data '{
     *     "key": "sk-Fn8Ej39NxjAXrvpUGKghGw"
     * }'
     * ```
     *
     * Note: This is an admin-only endpoint. Only proxy admins can block keys.
     */
    suspend fun block(
        params: KeyBlockParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KeyBlockResponse?

    /**
     * Check the health of the key
     *
     * Checks:
     * - If key based logging is configured correctly - sends a test log
     *
     * Usage
     *
     * Pass the key in the request header
     *
     * ```bash
     * curl -X POST "http://localhost:4000/key/health"      -H "Authorization: Bearer sk-1234"      -H "Content-Type: application/json"
     * ```
     *
     * Response when logging callbacks are setup correctly:
     * ```json
     * {
     *   "key": "healthy",
     *   "logging_callbacks": {
     *     "callbacks": ["gcs_bucket"],
     *     "status": "healthy",
     *     "details": "No logger exceptions triggered, system is healthy. Manually check if logs were sent to ['gcs_bucket']"
     *   }
     * }
     * ```
     *
     * Response when logging callbacks are not setup correctly:
     * ```json
     * {
     *   "key": "unhealthy",
     *   "logging_callbacks": {
     *     "callbacks": ["gcs_bucket"],
     *     "status": "unhealthy",
     *     "details": "Logger exceptions triggered, system is unhealthy: Failed to load vertex credentials. Check to see if credentials containing partial/invalid information."
     *   }
     * }
     * ```
     */
    suspend fun checkHealth(
        params: KeyCheckHealthParams = KeyCheckHealthParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KeyCheckHealthResponse

    /** @see checkHealth */
    suspend fun checkHealth(requestOptions: RequestOptions): KeyCheckHealthResponse =
        checkHealth(KeyCheckHealthParams.none(), requestOptions)

    /**
     * Generate an API key based on the provided data.
     *
     * Docs: https://docs.hanzo.ai/docs/proxy/virtual_keys
     *
     * Parameters:
     * - duration: Optional[str] - Specify the length of time the token is valid for. You can set
     *   duration as seconds ("30s"), minutes ("30m"), hours ("30h"), days ("30d").
     * - key_alias: Optional[str] - User defined key alias
     * - key: Optional[str] - User defined key value. If not set, a 16-digit unique sk-key is
     *   created for you.
     * - team_id: Optional[str] - The team id of the key
     * - user_id: Optional[str] - The user id of the key
     * - budget_id: Optional[str] - The budget id associated with the key. Created by calling
     *   `/budget/new`.
     * - models: Optional[list] - Model_name's a user is allowed to call. (if empty, key is allowed
     *   to call all models)
     * - aliases: Optional[dict] - Any alias mappings, on top of anything in the config.yaml model
     *   list. -
     *   https://docs.hanzo.ai/docs/proxy/virtual_keys#managing-auth---upgradedowngrade-models
     * - config: Optional[dict] - any key-specific configs, overrides config in config.yaml
     * - spend: Optional[int] - Amount spent by key. Default is 0. Will be updated by proxy whenever
     *   key is used. https://docs.hanzo.ai/docs/proxy/virtual_keys#managing-auth---tracking-spend
     * - send_invite_email: Optional[bool] - Whether to send an invite email to the user_id, with
     *   the generate key
     * - max_budget: Optional[float] - Specify max budget for a given key.
     * - budget_duration: Optional[str] - Budget is reset at the end of specified duration. If not
     *   set, budget is never reset. You can set duration as seconds ("30s"), minutes ("30m"), hours
     *   ("30h"), days ("30d").
     * - max_parallel_requests: Optional[int] - Rate limit a user based on the number of parallel
     *   requests. Raises 429 error, if user's parallel requests > x.
     * - metadata: Optional[dict] - Metadata for key, store information for key. Example metadata =
     *   {"team": "core-infra", "app": "app2", "email": "z@hanzo.ai" }
     * - guardrails: Optional[List[str]] - List of active guardrails for the key
     * - permissions: Optional[dict] - key-specific permissions. Currently just used for turning off
     *   pii masking (if connected). Example - {"pii": false}
     * - model_max_budget: Optional[Dict[str, BudgetConfig]] - Model-specific budgets {"gpt-4":
     *   {"budget_limit": 0.0005, "time_period": "30d"}}}. IF null or {} then no model specific
     *   budget.
     * - model_rpm_limit: Optional[dict] - key-specific model rpm limit. Example -
     *   {"text-davinci-002": 1000, "gpt-3.5-turbo": 1000}. IF null or {} then no model specific rpm
     *   limit.
     * - model_tpm_limit: Optional[dict] - key-specific model tpm limit. Example -
     *   {"text-davinci-002": 1000, "gpt-3.5-turbo": 1000}. IF null or {} then no model specific tpm
     *   limit.
     * - allowed_cache_controls: Optional[list] - List of allowed cache control values.
     *   Example - ["no-cache", "no-store"]. See all values -
     *   https://docs.hanzo.ai/docs/proxy/caching#turn-on--off-caching-per-request
     * - blocked: Optional[bool] - Whether the key is blocked.
     * - rpm_limit: Optional[int] - Specify rpm limit for a given key (Requests per minute)
     * - tpm_limit: Optional[int] - Specify tpm limit for a given key (Tokens per minute)
     * - soft_budget: Optional[float] - Specify soft budget for a given key. Will trigger a slack
     *   alert when this soft budget is reached.
     * - tags: Optional[List[str]] - Tags for
     *   [tracking spend](https://llm.vercel.app/docs/proxy/enterprise#tracking-spend-for-custom-tags)
     *   and/or doing [tag-based routing](https://llm.vercel.app/docs/proxy/tag_routing).
     * - enforced_params: Optional[List[str]] - List of enforced params for the key (Enterprise
     *   only).
     *   [Docs](https://docs.hanzo.ai/docs/proxy/enterprise#enforce-required-params-for-llm-requests)
     *
     * Examples:
     * 1. Allow users to turn on/off pii masking
     *
     * ```bash
     * curl --location 'http://0.0.0.0:4000/key/generate'         --header 'Authorization: Bearer sk-1234'         --header 'Content-Type: application/json'         --data '{
     *         "permissions": {"allow_pii_controls": true}
     * }'
     * ```
     *
     * Returns:
     * - key: (str) The generated api key
     * - expires: (datetime) Datetime object for when key expires.
     * - user_id: (str) Unique user id - used for tracking spend across multiple keys for same user
     *   id.
     */
    suspend fun generate(
        params: KeyGenerateParams = KeyGenerateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GenerateKeyResponse

    /** @see generate */
    suspend fun generate(requestOptions: RequestOptions): GenerateKeyResponse =
        generate(KeyGenerateParams.none(), requestOptions)

    /**
     * Regenerate an existing API key while optionally updating its parameters.
     *
     * Parameters:
     * - key: str (path parameter) - The key to regenerate
     * - data: Optional[RegenerateKeyRequest] - Request body containing optional parameters to
     *   update
     *     - key_alias: Optional[str] - User-friendly key alias
     *     - user_id: Optional[str] - User ID associated with key
     *     - team_id: Optional[str] - Team ID associated with key
     *     - models: Optional[list] - Model_name's a user is allowed to call
     *     - tags: Optional[List[str]] - Tags for organizing keys (Enterprise only)
     *     - spend: Optional[float] - Amount spent by key
     *     - max_budget: Optional[float] - Max budget for key
     *     - model_max_budget: Optional[Dict[str, BudgetConfig]] - Model-specific budgets {"gpt-4":
     *       {"budget_limit": 0.0005, "time_period": "30d"}}
     *     - budget_duration: Optional[str] - Budget reset period ("30d", "1h", etc.)
     *     - soft_budget: Optional[float] - Soft budget limit (warning vs. hard stop). Will trigger
     *       a slack alert when this soft budget is reached.
     *     - max_parallel_requests: Optional[int] - Rate limit for parallel requests
     *     - metadata: Optional[dict] - Metadata for key. Example {"team": "core-infra", "app":
     *       "app2"}
     *     - tpm_limit: Optional[int] - Tokens per minute limit
     *     - rpm_limit: Optional[int] - Requests per minute limit
     *     - model_rpm_limit: Optional[dict] - Model-specific RPM limits {"gpt-4": 100, "claude-v1":
     *       200}
     *     - model_tpm_limit: Optional[dict] - Model-specific TPM limits {"gpt-4": 100000,
     *       "claude-v1": 200000}
     *     - allowed_cache_controls: Optional[list] - List of allowed cache control values
     *     - duration: Optional[str] - Key validity duration ("30d", "1h", etc.)
     *     - permissions: Optional[dict] - Key-specific permissions
     *     - guardrails: Optional[List[str]] - List of active guardrails for the key
     *     - blocked: Optional[bool] - Whether the key is blocked
     *
     * Returns:
     * - GenerateKeyResponse containing the new key and its updated parameters
     *
     * Example:
     * ```bash
     * curl --location --request POST 'http://localhost:4000/key/sk-1234/regenerate'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data-raw '{
     *     "max_budget": 100,
     *     "metadata": {"team": "core-infra"},
     *     "models": ["gpt-4", "gpt-3.5-turbo"]
     * }'
     * ```
     *
     * Note: This is an Enterprise feature. It requires a premium license to use.
     */
    suspend fun regenerateByKey(
        pathKey: String,
        params: KeyRegenerateByKeyParams = KeyRegenerateByKeyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GenerateKeyResponse? =
        regenerateByKey(params.toBuilder().pathKey(pathKey).build(), requestOptions)

    /** @see regenerateByKey */
    suspend fun regenerateByKey(
        params: KeyRegenerateByKeyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GenerateKeyResponse?

    /** @see regenerateByKey */
    suspend fun regenerateByKey(
        pathKey: String,
        requestOptions: RequestOptions,
    ): GenerateKeyResponse? =
        regenerateByKey(pathKey, KeyRegenerateByKeyParams.none(), requestOptions)

    /**
     * Retrieve information about a key. Parameters: key: Optional[str] = Query parameter
     * representing the key in the request user_api_key_dict: UserAPIKeyAuth = Dependency
     * representing the user's API key Returns: Dict containing the key and its associated
     * information
     *
     * Example Curl:
     * ```
     * curl -X GET "http://0.0.0.0:4000/key/info?key=sk-02Wr4IAlN3NvPXvL5JVvDA" -H "Authorization: Bearer sk-1234"
     * ```
     *
     * Example Curl - if no key is passed, it will use the Key Passed in Authorization Header
     *
     * ```
     * curl -X GET "http://0.0.0.0:4000/key/info" -H "Authorization: Bearer sk-02Wr4IAlN3NvPXvL5JVvDA"
     * ```
     */
    suspend fun retrieveInfo(
        params: KeyRetrieveInfoParams = KeyRetrieveInfoParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KeyRetrieveInfoResponse

    /** @see retrieveInfo */
    suspend fun retrieveInfo(requestOptions: RequestOptions): KeyRetrieveInfoResponse =
        retrieveInfo(KeyRetrieveInfoParams.none(), requestOptions)

    /**
     * Unblock a Virtual key to allow it to make requests again.
     *
     * Parameters:
     * - key: str - The key to unblock. Can be either the unhashed key (sk-...) or the hashed key
     *   value
     *
     * Example:
     * ```bash
     * curl --location 'http://0.0.0.0:4000/key/unblock'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data '{
     *     "key": "sk-Fn8Ej39NxjAXrvpUGKghGw"
     * }'
     * ```
     *
     * Note: This is an admin-only endpoint. Only proxy admins can unblock keys.
     */
    suspend fun unblock(
        params: KeyUnblockParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KeyUnblockResponse

    /** A view of [KeyServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): KeyServiceAsync.WithRawResponse

        fun regenerate(): RegenerateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /key/update`, but is otherwise the same as
         * [KeyServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: KeyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KeyUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /key/list`, but is otherwise the same as
         * [KeyServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: KeyListParams = KeyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KeyListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<KeyListResponse> =
            list(KeyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /key/delete`, but is otherwise the same as
         * [KeyServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: KeyDeleteParams = KeyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KeyDeleteResponse>

        /** @see delete */
        @MustBeClosed
        suspend fun delete(requestOptions: RequestOptions): HttpResponseFor<KeyDeleteResponse> =
            delete(KeyDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /key/block`, but is otherwise the same as
         * [KeyServiceAsync.block].
         */
        @MustBeClosed
        suspend fun block(
            params: KeyBlockParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KeyBlockResponse?>

        /**
         * Returns a raw HTTP response for `post /key/health`, but is otherwise the same as
         * [KeyServiceAsync.checkHealth].
         */
        @MustBeClosed
        suspend fun checkHealth(
            params: KeyCheckHealthParams = KeyCheckHealthParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KeyCheckHealthResponse>

        /** @see checkHealth */
        @MustBeClosed
        suspend fun checkHealth(
            requestOptions: RequestOptions
        ): HttpResponseFor<KeyCheckHealthResponse> =
            checkHealth(KeyCheckHealthParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /key/generate`, but is otherwise the same as
         * [KeyServiceAsync.generate].
         */
        @MustBeClosed
        suspend fun generate(
            params: KeyGenerateParams = KeyGenerateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GenerateKeyResponse>

        /** @see generate */
        @MustBeClosed
        suspend fun generate(requestOptions: RequestOptions): HttpResponseFor<GenerateKeyResponse> =
            generate(KeyGenerateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /key/{key}/regenerate`, but is otherwise the same
         * as [KeyServiceAsync.regenerateByKey].
         */
        @MustBeClosed
        suspend fun regenerateByKey(
            pathKey: String,
            params: KeyRegenerateByKeyParams = KeyRegenerateByKeyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GenerateKeyResponse?> =
            regenerateByKey(params.toBuilder().pathKey(pathKey).build(), requestOptions)

        /** @see regenerateByKey */
        @MustBeClosed
        suspend fun regenerateByKey(
            params: KeyRegenerateByKeyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GenerateKeyResponse?>

        /** @see regenerateByKey */
        @MustBeClosed
        suspend fun regenerateByKey(
            pathKey: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GenerateKeyResponse?> =
            regenerateByKey(pathKey, KeyRegenerateByKeyParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /key/info`, but is otherwise the same as
         * [KeyServiceAsync.retrieveInfo].
         */
        @MustBeClosed
        suspend fun retrieveInfo(
            params: KeyRetrieveInfoParams = KeyRetrieveInfoParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KeyRetrieveInfoResponse>

        /** @see retrieveInfo */
        @MustBeClosed
        suspend fun retrieveInfo(
            requestOptions: RequestOptions
        ): HttpResponseFor<KeyRetrieveInfoResponse> =
            retrieveInfo(KeyRetrieveInfoParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /key/unblock`, but is otherwise the same as
         * [KeyServiceAsync.unblock].
         */
        @MustBeClosed
        suspend fun unblock(
            params: KeyUnblockParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KeyUnblockResponse>
    }
}
