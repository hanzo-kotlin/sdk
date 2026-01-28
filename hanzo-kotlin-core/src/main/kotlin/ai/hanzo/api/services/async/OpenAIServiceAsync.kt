// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.openai.OpenAICreateParams
import ai.hanzo.api.models.openai.OpenAICreateResponse
import ai.hanzo.api.models.openai.OpenAIDeleteParams
import ai.hanzo.api.models.openai.OpenAIDeleteResponse
import ai.hanzo.api.models.openai.OpenAIPatchParams
import ai.hanzo.api.models.openai.OpenAIPatchResponse
import ai.hanzo.api.models.openai.OpenAIRetrieveParams
import ai.hanzo.api.models.openai.OpenAIRetrieveResponse
import ai.hanzo.api.models.openai.OpenAIUpdateParams
import ai.hanzo.api.models.openai.OpenAIUpdateResponse
import ai.hanzo.api.services.async.openai.DeploymentServiceAsync
import com.google.errorprone.annotations.MustBeClosed

interface OpenAIServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OpenAIServiceAsync

    fun deployments(): DeploymentServiceAsync

    /**
     * Simple pass-through for OpenAI. Use this if you want to directly send a request to OpenAI.
     */
    suspend fun create(
        endpoint: String,
        params: OpenAICreateParams = OpenAICreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OpenAICreateResponse = create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see create */
    suspend fun create(
        params: OpenAICreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OpenAICreateResponse

    /** @see create */
    suspend fun create(endpoint: String, requestOptions: RequestOptions): OpenAICreateResponse =
        create(endpoint, OpenAICreateParams.none(), requestOptions)

    /**
     * Simple pass-through for OpenAI. Use this if you want to directly send a request to OpenAI.
     */
    suspend fun retrieve(
        endpoint: String,
        params: OpenAIRetrieveParams = OpenAIRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OpenAIRetrieveResponse =
        retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: OpenAIRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OpenAIRetrieveResponse

    /** @see retrieve */
    suspend fun retrieve(endpoint: String, requestOptions: RequestOptions): OpenAIRetrieveResponse =
        retrieve(endpoint, OpenAIRetrieveParams.none(), requestOptions)

    /**
     * Simple pass-through for OpenAI. Use this if you want to directly send a request to OpenAI.
     */
    suspend fun update(
        endpoint: String,
        params: OpenAIUpdateParams = OpenAIUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OpenAIUpdateResponse = update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: OpenAIUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OpenAIUpdateResponse

    /** @see update */
    suspend fun update(endpoint: String, requestOptions: RequestOptions): OpenAIUpdateResponse =
        update(endpoint, OpenAIUpdateParams.none(), requestOptions)

    /**
     * Simple pass-through for OpenAI. Use this if you want to directly send a request to OpenAI.
     */
    suspend fun delete(
        endpoint: String,
        params: OpenAIDeleteParams = OpenAIDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OpenAIDeleteResponse = delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: OpenAIDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OpenAIDeleteResponse

    /** @see delete */
    suspend fun delete(endpoint: String, requestOptions: RequestOptions): OpenAIDeleteResponse =
        delete(endpoint, OpenAIDeleteParams.none(), requestOptions)

    /**
     * Simple pass-through for OpenAI. Use this if you want to directly send a request to OpenAI.
     */
    suspend fun patch(
        endpoint: String,
        params: OpenAIPatchParams = OpenAIPatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OpenAIPatchResponse = patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see patch */
    suspend fun patch(
        params: OpenAIPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OpenAIPatchResponse

    /** @see patch */
    suspend fun patch(endpoint: String, requestOptions: RequestOptions): OpenAIPatchResponse =
        patch(endpoint, OpenAIPatchParams.none(), requestOptions)

    /**
     * A view of [OpenAIServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): OpenAIServiceAsync.WithRawResponse

        fun deployments(): DeploymentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /openai/{endpoint}`, but is otherwise the same as
         * [OpenAIServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            endpoint: String,
            params: OpenAICreateParams = OpenAICreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OpenAICreateResponse> =
            create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        suspend fun create(
            params: OpenAICreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OpenAICreateResponse>

        /** @see create */
        @MustBeClosed
        suspend fun create(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OpenAICreateResponse> =
            create(endpoint, OpenAICreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /openai/{endpoint}`, but is otherwise the same as
         * [OpenAIServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            endpoint: String,
            params: OpenAIRetrieveParams = OpenAIRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OpenAIRetrieveResponse> =
            retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: OpenAIRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OpenAIRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OpenAIRetrieveResponse> =
            retrieve(endpoint, OpenAIRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /openai/{endpoint}`, but is otherwise the same as
         * [OpenAIServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            endpoint: String,
            params: OpenAIUpdateParams = OpenAIUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OpenAIUpdateResponse> =
            update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: OpenAIUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OpenAIUpdateResponse>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OpenAIUpdateResponse> =
            update(endpoint, OpenAIUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /openai/{endpoint}`, but is otherwise the same as
         * [OpenAIServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            endpoint: String,
            params: OpenAIDeleteParams = OpenAIDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OpenAIDeleteResponse> =
            delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: OpenAIDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OpenAIDeleteResponse>

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OpenAIDeleteResponse> =
            delete(endpoint, OpenAIDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /openai/{endpoint}`, but is otherwise the same as
         * [OpenAIServiceAsync.patch].
         */
        @MustBeClosed
        suspend fun patch(
            endpoint: String,
            params: OpenAIPatchParams = OpenAIPatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OpenAIPatchResponse> =
            patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see patch */
        @MustBeClosed
        suspend fun patch(
            params: OpenAIPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OpenAIPatchResponse>

        /** @see patch */
        @MustBeClosed
        suspend fun patch(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OpenAIPatchResponse> =
            patch(endpoint, OpenAIPatchParams.none(), requestOptions)
    }
}
