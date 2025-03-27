// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.vertexai.VertexAiCreateParams
import ai.hanzo.api.models.vertexai.VertexAiCreateResponse
import ai.hanzo.api.models.vertexai.VertexAiDeleteParams
import ai.hanzo.api.models.vertexai.VertexAiDeleteResponse
import ai.hanzo.api.models.vertexai.VertexAiPatchParams
import ai.hanzo.api.models.vertexai.VertexAiPatchResponse
import ai.hanzo.api.models.vertexai.VertexAiRetrieveParams
import ai.hanzo.api.models.vertexai.VertexAiRetrieveResponse
import ai.hanzo.api.models.vertexai.VertexAiUpdateParams
import ai.hanzo.api.models.vertexai.VertexAiUpdateResponse
import com.google.errorprone.annotations.MustBeClosed

interface VertexAiService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Call LLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.hanzo.ai/docs/pass_through/vertex_ai)
     */
    fun create(
        params: VertexAiCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiCreateResponse

    /**
     * Call LLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.hanzo.ai/docs/pass_through/vertex_ai)
     */
    fun retrieve(
        params: VertexAiRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiRetrieveResponse

    /**
     * Call LLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.hanzo.ai/docs/pass_through/vertex_ai)
     */
    fun update(
        params: VertexAiUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiUpdateResponse

    /**
     * Call LLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.hanzo.ai/docs/pass_through/vertex_ai)
     */
    fun delete(
        params: VertexAiDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiDeleteResponse

    /**
     * Call LLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.hanzo.ai/docs/pass_through/vertex_ai)
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
