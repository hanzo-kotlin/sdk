// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.vertexai.VertexAiCreateParams
import com.hanzo_ai.api.models.vertexai.VertexAiCreateResponse
import com.hanzo_ai.api.models.vertexai.VertexAiDeleteParams
import com.hanzo_ai.api.models.vertexai.VertexAiDeleteResponse
import com.hanzo_ai.api.models.vertexai.VertexAiPatchParams
import com.hanzo_ai.api.models.vertexai.VertexAiPatchResponse
import com.hanzo_ai.api.models.vertexai.VertexAiRetrieveParams
import com.hanzo_ai.api.models.vertexai.VertexAiRetrieveResponse
import com.hanzo_ai.api.models.vertexai.VertexAiUpdateParams
import com.hanzo_ai.api.models.vertexai.VertexAiUpdateResponse

interface VertexAiServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Call LLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.llm.ai/docs/pass_through/vertex_ai)
     */
    suspend fun create(
        params: VertexAiCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiCreateResponse

    /**
     * Call LLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.llm.ai/docs/pass_through/vertex_ai)
     */
    suspend fun retrieve(
        params: VertexAiRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiRetrieveResponse

    /**
     * Call LLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.llm.ai/docs/pass_through/vertex_ai)
     */
    suspend fun update(
        params: VertexAiUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiUpdateResponse

    /**
     * Call LLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.llm.ai/docs/pass_through/vertex_ai)
     */
    suspend fun delete(
        params: VertexAiDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiDeleteResponse

    /**
     * Call LLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.llm.ai/docs/pass_through/vertex_ai)
     */
    suspend fun patch(
        params: VertexAiPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiPatchResponse

    /**
     * A view of [VertexAiServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /vertex_ai/{endpoint}`, but is otherwise the same
         * as [VertexAiServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: VertexAiCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VertexAiCreateResponse>

        /**
         * Returns a raw HTTP response for `get /vertex_ai/{endpoint}`, but is otherwise the same as
         * [VertexAiServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: VertexAiRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VertexAiRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put /vertex_ai/{endpoint}`, but is otherwise the same as
         * [VertexAiServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: VertexAiUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VertexAiUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete /vertex_ai/{endpoint}`, but is otherwise the same
         * as [VertexAiServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: VertexAiDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VertexAiDeleteResponse>

        /**
         * Returns a raw HTTP response for `patch /vertex_ai/{endpoint}`, but is otherwise the same
         * as [VertexAiServiceAsync.patch].
         */
        @MustBeClosed
        suspend fun patch(
            params: VertexAiPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VertexAiPatchResponse>
    }
}
