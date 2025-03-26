// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

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

interface VertexAiService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Call LLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.llm.ai/docs/pass_through/vertex_ai)
     */
    fun create(
        params: VertexAiCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiCreateResponse

    /**
     * Call LLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.llm.ai/docs/pass_through/vertex_ai)
     */
    fun retrieve(
        params: VertexAiRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiRetrieveResponse

    /**
     * Call LLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.llm.ai/docs/pass_through/vertex_ai)
     */
    fun update(
        params: VertexAiUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiUpdateResponse

    /**
     * Call LLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.llm.ai/docs/pass_through/vertex_ai)
     */
    fun delete(
        params: VertexAiDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiDeleteResponse

    /**
     * Call LLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.llm.ai/docs/pass_through/vertex_ai)
     */
    fun patch(
        params: VertexAiPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiPatchResponse

    /** A view of [VertexAiService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /vertex_ai/{endpoint}`, but is otherwise the same
         * as [VertexAiService.create].
         */
        @MustBeClosed
        fun create(
            params: VertexAiCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VertexAiCreateResponse>

        /**
         * Returns a raw HTTP response for `get /vertex_ai/{endpoint}`, but is otherwise the same as
         * [VertexAiService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: VertexAiRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VertexAiRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put /vertex_ai/{endpoint}`, but is otherwise the same as
         * [VertexAiService.update].
         */
        @MustBeClosed
        fun update(
            params: VertexAiUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VertexAiUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete /vertex_ai/{endpoint}`, but is otherwise the same
         * as [VertexAiService.delete].
         */
        @MustBeClosed
        fun delete(
            params: VertexAiDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VertexAiDeleteResponse>

        /**
         * Returns a raw HTTP response for `patch /vertex_ai/{endpoint}`, but is otherwise the same
         * as [VertexAiService.patch].
         */
        @MustBeClosed
        fun patch(
            params: VertexAiPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VertexAiPatchResponse>
    }
}
