// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.assistants.AssistantCreateParams
import ai.hanzo.api.models.assistants.AssistantCreateResponse
import ai.hanzo.api.models.assistants.AssistantDeleteParams
import ai.hanzo.api.models.assistants.AssistantDeleteResponse
import ai.hanzo.api.models.assistants.AssistantListParams
import ai.hanzo.api.models.assistants.AssistantListResponse
import com.google.errorprone.annotations.MustBeClosed

interface AssistantServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create assistant
     *
     * API Reference docs -
     * https://platform.openai.com/docs/api-reference/assistants/createAssistant
     */
    suspend fun create(
        params: AssistantCreateParams = AssistantCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssistantCreateResponse

    /** @see [create] */
    suspend fun create(requestOptions: RequestOptions): AssistantCreateResponse =
        create(AssistantCreateParams.none(), requestOptions)

    /**
     * Returns a list of assistants.
     *
     * API Reference docs - https://platform.openai.com/docs/api-reference/assistants/listAssistants
     */
    suspend fun list(
        params: AssistantListParams = AssistantListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssistantListResponse

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): AssistantListResponse =
        list(AssistantListParams.none(), requestOptions)

    /**
     * Delete assistant
     *
     * API Reference docs -
     * https://platform.openai.com/docs/api-reference/assistants/createAssistant
     */
    suspend fun delete(
        assistantId: String,
        params: AssistantDeleteParams = AssistantDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssistantDeleteResponse =
        delete(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see [delete] */
    suspend fun delete(
        params: AssistantDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssistantDeleteResponse

    /** @see [delete] */
    suspend fun delete(
        assistantId: String,
        requestOptions: RequestOptions,
    ): AssistantDeleteResponse = delete(assistantId, AssistantDeleteParams.none(), requestOptions)

    /**
     * A view of [AssistantServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/assistants`, but is otherwise the same as
         * [AssistantServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: AssistantCreateParams = AssistantCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssistantCreateResponse>

        /** @see [create] */
        @MustBeClosed
        suspend fun create(
            requestOptions: RequestOptions
        ): HttpResponseFor<AssistantCreateResponse> =
            create(AssistantCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/assistants`, but is otherwise the same as
         * [AssistantServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: AssistantListParams = AssistantListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssistantListResponse>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<AssistantListResponse> =
            list(AssistantListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/assistants/{assistant_id}`, but is otherwise
         * the same as [AssistantServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            assistantId: String,
            params: AssistantDeleteParams = AssistantDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssistantDeleteResponse> =
            delete(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            params: AssistantDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssistantDeleteResponse>

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            assistantId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssistantDeleteResponse> =
            delete(assistantId, AssistantDeleteParams.none(), requestOptions)
    }
}
