// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
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

interface VertexAiServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): VertexAiServiceAsync

    /**
     * Call LiteLLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.litellm.ai/docs/pass_through/vertex_ai)
     */
    suspend fun create(
        endpoint: String,
        params: VertexAiCreateParams = VertexAiCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiCreateResponse =
        create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see create */
    suspend fun create(
        params: VertexAiCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiCreateResponse

    /** @see create */
    suspend fun create(endpoint: String, requestOptions: RequestOptions): VertexAiCreateResponse =
        create(endpoint, VertexAiCreateParams.none(), requestOptions)

    /**
     * Call LiteLLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.litellm.ai/docs/pass_through/vertex_ai)
     */
    suspend fun retrieve(
        endpoint: String,
        params: VertexAiRetrieveParams = VertexAiRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiRetrieveResponse =
        retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: VertexAiRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiRetrieveResponse

    /** @see retrieve */
    suspend fun retrieve(
        endpoint: String,
        requestOptions: RequestOptions,
    ): VertexAiRetrieveResponse = retrieve(endpoint, VertexAiRetrieveParams.none(), requestOptions)

    /**
     * Call LiteLLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.litellm.ai/docs/pass_through/vertex_ai)
     */
    suspend fun update(
        endpoint: String,
        params: VertexAiUpdateParams = VertexAiUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiUpdateResponse =
        update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: VertexAiUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiUpdateResponse

    /** @see update */
    suspend fun update(endpoint: String, requestOptions: RequestOptions): VertexAiUpdateResponse =
        update(endpoint, VertexAiUpdateParams.none(), requestOptions)

    /**
     * Call LiteLLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.litellm.ai/docs/pass_through/vertex_ai)
     */
    suspend fun delete(
        endpoint: String,
        params: VertexAiDeleteParams = VertexAiDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiDeleteResponse =
        delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: VertexAiDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiDeleteResponse

    /** @see delete */
    suspend fun delete(endpoint: String, requestOptions: RequestOptions): VertexAiDeleteResponse =
        delete(endpoint, VertexAiDeleteParams.none(), requestOptions)

    /**
     * Call LiteLLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.litellm.ai/docs/pass_through/vertex_ai)
     */
    suspend fun patch(
        endpoint: String,
        params: VertexAiPatchParams = VertexAiPatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiPatchResponse = patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see patch */
    suspend fun patch(
        params: VertexAiPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VertexAiPatchResponse

    /** @see patch */
    suspend fun patch(endpoint: String, requestOptions: RequestOptions): VertexAiPatchResponse =
        patch(endpoint, VertexAiPatchParams.none(), requestOptions)

    /**
     * A view of [VertexAiServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): VertexAiServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /vertex_ai/{endpoint}`, but is otherwise the same
         * as [VertexAiServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            endpoint: String,
            params: VertexAiCreateParams = VertexAiCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VertexAiCreateResponse> =
            create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        suspend fun create(
            params: VertexAiCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VertexAiCreateResponse>

        /** @see create */
        @MustBeClosed
        suspend fun create(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VertexAiCreateResponse> =
            create(endpoint, VertexAiCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /vertex_ai/{endpoint}`, but is otherwise the same as
         * [VertexAiServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            endpoint: String,
            params: VertexAiRetrieveParams = VertexAiRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VertexAiRetrieveResponse> =
            retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: VertexAiRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VertexAiRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VertexAiRetrieveResponse> =
            retrieve(endpoint, VertexAiRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /vertex_ai/{endpoint}`, but is otherwise the same as
         * [VertexAiServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            endpoint: String,
            params: VertexAiUpdateParams = VertexAiUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VertexAiUpdateResponse> =
            update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: VertexAiUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VertexAiUpdateResponse>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VertexAiUpdateResponse> =
            update(endpoint, VertexAiUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /vertex_ai/{endpoint}`, but is otherwise the same
         * as [VertexAiServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            endpoint: String,
            params: VertexAiDeleteParams = VertexAiDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VertexAiDeleteResponse> =
            delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: VertexAiDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VertexAiDeleteResponse>

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VertexAiDeleteResponse> =
            delete(endpoint, VertexAiDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /vertex_ai/{endpoint}`, but is otherwise the same
         * as [VertexAiServiceAsync.patch].
         */
        @MustBeClosed
        suspend fun patch(
            endpoint: String,
            params: VertexAiPatchParams = VertexAiPatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VertexAiPatchResponse> =
            patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see patch */
        @MustBeClosed
        suspend fun patch(
            params: VertexAiPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VertexAiPatchResponse>

        /** @see patch */
        @MustBeClosed
        suspend fun patch(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VertexAiPatchResponse> =
            patch(endpoint, VertexAiPatchParams.none(), requestOptions)
    }
}
