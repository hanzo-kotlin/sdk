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
        endpoint: String,
        params: VertexAiCreateParams = VertexAiCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiCreateResponse =
        create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [create] */
    fun create(
        params: VertexAiCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiCreateResponse

    /** @see [create] */
    fun create(endpoint: String, requestOptions: RequestOptions): VertexAiCreateResponse =
        create(endpoint, VertexAiCreateParams.none(), requestOptions)

    /**
     * Call LLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.hanzo.ai/docs/pass_through/vertex_ai)
     */
    fun retrieve(
        endpoint: String,
        params: VertexAiRetrieveParams = VertexAiRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiRetrieveResponse =
        retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: VertexAiRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiRetrieveResponse

    /** @see [retrieve] */
    fun retrieve(endpoint: String, requestOptions: RequestOptions): VertexAiRetrieveResponse =
        retrieve(endpoint, VertexAiRetrieveParams.none(), requestOptions)

    /**
     * Call LLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.hanzo.ai/docs/pass_through/vertex_ai)
     */
    fun update(
        endpoint: String,
        params: VertexAiUpdateParams = VertexAiUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiUpdateResponse =
        update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [update] */
    fun update(
        params: VertexAiUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiUpdateResponse

    /** @see [update] */
    fun update(endpoint: String, requestOptions: RequestOptions): VertexAiUpdateResponse =
        update(endpoint, VertexAiUpdateParams.none(), requestOptions)

    /**
     * Call LLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.hanzo.ai/docs/pass_through/vertex_ai)
     */
    fun delete(
        endpoint: String,
        params: VertexAiDeleteParams = VertexAiDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiDeleteResponse =
        delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        params: VertexAiDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiDeleteResponse

    /** @see [delete] */
    fun delete(endpoint: String, requestOptions: RequestOptions): VertexAiDeleteResponse =
        delete(endpoint, VertexAiDeleteParams.none(), requestOptions)

    /**
     * Call LLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.hanzo.ai/docs/pass_through/vertex_ai)
     */
    fun patch(
        endpoint: String,
        params: VertexAiPatchParams = VertexAiPatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiPatchResponse = patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [patch] */
    fun patch(
        params: VertexAiPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiPatchResponse

    /** @see [patch] */
    fun patch(endpoint: String, requestOptions: RequestOptions): VertexAiPatchResponse =
        patch(endpoint, VertexAiPatchParams.none(), requestOptions)

    /** A view of [VertexAiService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /vertex_ai/{endpoint}`, but is otherwise the same
         * as [VertexAiService.create].
         */
        @MustBeClosed
        fun create(
            endpoint: String,
            params: VertexAiCreateParams = VertexAiCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VertexAiCreateResponse> =
            create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: VertexAiCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VertexAiCreateResponse>

        /** @see [create] */
        @MustBeClosed
        fun create(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VertexAiCreateResponse> =
            create(endpoint, VertexAiCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /vertex_ai/{endpoint}`, but is otherwise the same as
         * [VertexAiService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            endpoint: String,
            params: VertexAiRetrieveParams = VertexAiRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VertexAiRetrieveResponse> =
            retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: VertexAiRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VertexAiRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VertexAiRetrieveResponse> =
            retrieve(endpoint, VertexAiRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /vertex_ai/{endpoint}`, but is otherwise the same as
         * [VertexAiService.update].
         */
        @MustBeClosed
        fun update(
            endpoint: String,
            params: VertexAiUpdateParams = VertexAiUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VertexAiUpdateResponse> =
            update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: VertexAiUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VertexAiUpdateResponse>

        /** @see [update] */
        @MustBeClosed
        fun update(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VertexAiUpdateResponse> =
            update(endpoint, VertexAiUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /vertex_ai/{endpoint}`, but is otherwise the same
         * as [VertexAiService.delete].
         */
        @MustBeClosed
        fun delete(
            endpoint: String,
            params: VertexAiDeleteParams = VertexAiDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VertexAiDeleteResponse> =
            delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: VertexAiDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VertexAiDeleteResponse>

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VertexAiDeleteResponse> =
            delete(endpoint, VertexAiDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /vertex_ai/{endpoint}`, but is otherwise the same
         * as [VertexAiService.patch].
         */
        @MustBeClosed
        fun patch(
            endpoint: String,
            params: VertexAiPatchParams = VertexAiPatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VertexAiPatchResponse> =
            patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [patch] */
        @MustBeClosed
        fun patch(
            params: VertexAiPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VertexAiPatchResponse>

        /** @see [patch] */
        @MustBeClosed
        fun patch(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VertexAiPatchResponse> =
            patch(endpoint, VertexAiPatchParams.none(), requestOptions)
    }
}
