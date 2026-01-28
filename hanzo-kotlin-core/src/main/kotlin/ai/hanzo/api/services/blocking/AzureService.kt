// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.azure.AzureCallParams
import ai.hanzo.api.models.azure.AzureCallResponse
import ai.hanzo.api.models.azure.AzureCreateParams
import ai.hanzo.api.models.azure.AzureCreateResponse
import ai.hanzo.api.models.azure.AzureDeleteParams
import ai.hanzo.api.models.azure.AzureDeleteResponse
import ai.hanzo.api.models.azure.AzurePatchParams
import ai.hanzo.api.models.azure.AzurePatchResponse
import ai.hanzo.api.models.azure.AzureUpdateParams
import ai.hanzo.api.models.azure.AzureUpdateResponse
import com.google.errorprone.annotations.MustBeClosed

interface AzureService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AzureService

    /**
     * Call any azure endpoint using the proxy.
     *
     * Just use `{PROXY_BASE_URL}/azure/{endpoint:path}`
     *
     * Checks if the deployment id in the url is a litellm model name. If so, it will route using
     * the llm_router.allm_passthrough_route.
     */
    fun create(
        endpoint: String,
        params: AzureCreateParams = AzureCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AzureCreateResponse = create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see create */
    fun create(
        params: AzureCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AzureCreateResponse

    /** @see create */
    fun create(endpoint: String, requestOptions: RequestOptions): AzureCreateResponse =
        create(endpoint, AzureCreateParams.none(), requestOptions)

    /**
     * Call any azure endpoint using the proxy.
     *
     * Just use `{PROXY_BASE_URL}/azure/{endpoint:path}`
     *
     * Checks if the deployment id in the url is a litellm model name. If so, it will route using
     * the llm_router.allm_passthrough_route.
     */
    fun update(
        endpoint: String,
        params: AzureUpdateParams = AzureUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AzureUpdateResponse = update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see update */
    fun update(
        params: AzureUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AzureUpdateResponse

    /** @see update */
    fun update(endpoint: String, requestOptions: RequestOptions): AzureUpdateResponse =
        update(endpoint, AzureUpdateParams.none(), requestOptions)

    /**
     * Call any azure endpoint using the proxy.
     *
     * Just use `{PROXY_BASE_URL}/azure/{endpoint:path}`
     *
     * Checks if the deployment id in the url is a litellm model name. If so, it will route using
     * the llm_router.allm_passthrough_route.
     */
    fun delete(
        endpoint: String,
        params: AzureDeleteParams = AzureDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AzureDeleteResponse = delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: AzureDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AzureDeleteResponse

    /** @see delete */
    fun delete(endpoint: String, requestOptions: RequestOptions): AzureDeleteResponse =
        delete(endpoint, AzureDeleteParams.none(), requestOptions)

    /**
     * Call any azure endpoint using the proxy.
     *
     * Just use `{PROXY_BASE_URL}/azure/{endpoint:path}`
     *
     * Checks if the deployment id in the url is a litellm model name. If so, it will route using
     * the llm_router.allm_passthrough_route.
     */
    fun call(
        endpoint: String,
        params: AzureCallParams = AzureCallParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AzureCallResponse = call(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see call */
    fun call(
        params: AzureCallParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AzureCallResponse

    /** @see call */
    fun call(endpoint: String, requestOptions: RequestOptions): AzureCallResponse =
        call(endpoint, AzureCallParams.none(), requestOptions)

    /**
     * Call any azure endpoint using the proxy.
     *
     * Just use `{PROXY_BASE_URL}/azure/{endpoint:path}`
     *
     * Checks if the deployment id in the url is a litellm model name. If so, it will route using
     * the llm_router.allm_passthrough_route.
     */
    fun patch(
        endpoint: String,
        params: AzurePatchParams = AzurePatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AzurePatchResponse = patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see patch */
    fun patch(
        params: AzurePatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AzurePatchResponse

    /** @see patch */
    fun patch(endpoint: String, requestOptions: RequestOptions): AzurePatchResponse =
        patch(endpoint, AzurePatchParams.none(), requestOptions)

    /** A view of [AzureService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AzureService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /azure/{endpoint}`, but is otherwise the same as
         * [AzureService.create].
         */
        @MustBeClosed
        fun create(
            endpoint: String,
            params: AzureCreateParams = AzureCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AzureCreateResponse> =
            create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: AzureCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AzureCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AzureCreateResponse> =
            create(endpoint, AzureCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /azure/{endpoint}`, but is otherwise the same as
         * [AzureService.update].
         */
        @MustBeClosed
        fun update(
            endpoint: String,
            params: AzureUpdateParams = AzureUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AzureUpdateResponse> =
            update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: AzureUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AzureUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AzureUpdateResponse> =
            update(endpoint, AzureUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /azure/{endpoint}`, but is otherwise the same as
         * [AzureService.delete].
         */
        @MustBeClosed
        fun delete(
            endpoint: String,
            params: AzureDeleteParams = AzureDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AzureDeleteResponse> =
            delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AzureDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AzureDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AzureDeleteResponse> =
            delete(endpoint, AzureDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /azure/{endpoint}`, but is otherwise the same as
         * [AzureService.call].
         */
        @MustBeClosed
        fun call(
            endpoint: String,
            params: AzureCallParams = AzureCallParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AzureCallResponse> =
            call(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see call */
        @MustBeClosed
        fun call(
            params: AzureCallParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AzureCallResponse>

        /** @see call */
        @MustBeClosed
        fun call(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AzureCallResponse> =
            call(endpoint, AzureCallParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /azure/{endpoint}`, but is otherwise the same as
         * [AzureService.patch].
         */
        @MustBeClosed
        fun patch(
            endpoint: String,
            params: AzurePatchParams = AzurePatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AzurePatchResponse> =
            patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see patch */
        @MustBeClosed
        fun patch(
            params: AzurePatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AzurePatchResponse>

        /** @see patch */
        @MustBeClosed
        fun patch(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AzurePatchResponse> =
            patch(endpoint, AzurePatchParams.none(), requestOptions)
    }
}
