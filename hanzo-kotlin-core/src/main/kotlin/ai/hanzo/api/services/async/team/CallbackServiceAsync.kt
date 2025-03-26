// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.team

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.team.callback.CallbackAddParams
import ai.hanzo.api.models.team.callback.CallbackAddResponse
import ai.hanzo.api.models.team.callback.CallbackRetrieveParams
import ai.hanzo.api.models.team.callback.CallbackRetrieveResponse
import com.google.errorprone.annotations.MustBeClosed

interface CallbackServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Get the success/failure callbacks and variables for a team
     *
     * Parameters:
     * - team_id (str, required): The unique identifier for the team
     *
     * Example curl:
     * ```
     * curl -X GET 'http://localhost:4000/team/dbe2f686-a686-4896-864a-4c3924458709/callback'         -H 'Authorization: Bearer sk-1234'
     * ```
     *
     * This will return the callback settings for the team with id
     * dbe2f686-a686-4896-864a-4c3924458709
     *
     * Returns { "status": "success", "data": { "team_id": team_id, "success_callbacks":
     * team_callback_settings_obj.success_callback, "failure_callbacks":
     * team_callback_settings_obj.failure_callback, "callback_vars":
     * team_callback_settings_obj.callback_vars, }, }
     */
    suspend fun retrieve(
        params: CallbackRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallbackRetrieveResponse

    /**
     * Add a success/failure callback to a team
     *
     * Use this if if you want different teams to have different success/failure callbacks
     *
     * Parameters:
     * - callback_name (Literal["langfuse", "langsmith", "gcs"], required): The name of the callback
     *   to add
     * - callback_type (Literal["success", "failure", "success_and_failure"], required): The type of
     *   callback to add. One of:
     *     - "success": Callback for successful LLM calls
     *     - "failure": Callback for failed LLM calls
     *     - "success_and_failure": Callback for both successful and failed LLM calls
     * - callback_vars (StandardCallbackDynamicParams, required): A dictionary of variables to pass
     *   to the callback
     *     - langfuse_public_key: The public key for the Langfuse callback
     *     - langfuse_secret_key: The secret key for the Langfuse callback
     *     - langfuse_secret: The secret for the Langfuse callback
     *     - langfuse_host: The host for the Langfuse callback
     *     - gcs_bucket_name: The name of the GCS bucket
     *     - gcs_path_service_account: The path to the GCS service account
     *     - langsmith_api_key: The API key for the Langsmith callback
     *     - langsmith_project: The project for the Langsmith callback
     *     - langsmith_base_url: The base URL for the Langsmith callback
     *
     * Example curl:
     * ```
     * curl -X POST 'http:/localhost:4000/team/dbe2f686-a686-4896-864a-4c3924458709/callback'         -H 'Content-Type: application/json'         -H 'Authorization: Bearer sk-1234'         -d '{
     *     "callback_name": "langfuse",
     *     "callback_type": "success",
     *     "callback_vars": {"langfuse_public_key": "pk-lf-xxxx1", "langfuse_secret_key": "sk-xxxxx"}
     *
     * }'
     * ```
     *
     * This means for the team where team_id = dbe2f686-a686-4896-864a-4c3924458709, all LLM calls
     * will be logged to langfuse using the public key pk-lf-xxxx1 and the secret key sk-xxxxx
     */
    suspend fun add(
        params: CallbackAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallbackAddResponse

    /**
     * A view of [CallbackServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /team/{team_id}/callback`, but is otherwise the same
         * as [CallbackServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: CallbackRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallbackRetrieveResponse>

        /**
         * Returns a raw HTTP response for `post /team/{team_id}/callback`, but is otherwise the
         * same as [CallbackServiceAsync.add].
         */
        @MustBeClosed
        suspend fun add(
            params: CallbackAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallbackAddResponse>
    }
}
