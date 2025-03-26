// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.assistants.AssistantCreateParams
import com.hanzo_ai.api.models.assistants.AssistantCreateResponse
import com.hanzo_ai.api.models.assistants.AssistantDeleteParams
import com.hanzo_ai.api.models.assistants.AssistantDeleteResponse
import com.hanzo_ai.api.models.assistants.AssistantListParams
import com.hanzo_ai.api.models.assistants.AssistantListResponse

interface AssistantService {

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
    fun create(
        params: AssistantCreateParams = AssistantCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssistantCreateResponse

    /** @see [create] */
    fun create(requestOptions: RequestOptions): AssistantCreateResponse =
        create(AssistantCreateParams.none(), requestOptions)

    /**
     * Returns a list of assistants.
     *
     * API Reference docs - https://platform.openai.com/docs/api-reference/assistants/listAssistants
     */
    fun list(
        params: AssistantListParams = AssistantListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssistantListResponse

    /** @see [list] */
    fun list(requestOptions: RequestOptions): AssistantListResponse =
        list(AssistantListParams.none(), requestOptions)

    /**
     * Delete assistant
     *
     * API Reference docs -
     * https://platform.openai.com/docs/api-reference/assistants/createAssistant
     */
    fun delete(
        params: AssistantDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssistantDeleteResponse

    /** A view of [AssistantService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/assistants`, but is otherwise the same as
         * [AssistantService.create].
         */
        @MustBeClosed
        fun create(
            params: AssistantCreateParams = AssistantCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssistantCreateResponse>

        /** @see [create] */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<AssistantCreateResponse> =
            create(AssistantCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/assistants`, but is otherwise the same as
         * [AssistantService.list].
         */
        @MustBeClosed
        fun list(
            params: AssistantListParams = AssistantListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssistantListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AssistantListResponse> =
            list(AssistantListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/assistants/{assistant_id}`, but is otherwise
         * the same as [AssistantService.delete].
         */
        @MustBeClosed
        fun delete(
            params: AssistantDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssistantDeleteResponse>
    }
}
