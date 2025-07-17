// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

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

interface AzureServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AzureServiceAsync

    /**
     * Call any azure endpoint using the proxy.
     *
     * Just use `{PROXY_BASE_URL}/azure/{endpoint:path}`
     */
    suspend fun create(
        endpoint: String,
        params: AzureCreateParams = AzureCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AzureCreateResponse = create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [create] */
    suspend fun create(
        params: AzureCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AzureCreateResponse

    /** @see [create] */
    suspend fun create(endpoint: String, requestOptions: RequestOptions): AzureCreateResponse =
        create(endpoint, AzureCreateParams.none(), requestOptions)

    /**
     * Call any azure endpoint using the proxy.
     *
     * Just use `{PROXY_BASE_URL}/azure/{endpoint:path}`
     */
    suspend fun update(
        endpoint: String,
        params: AzureUpdateParams = AzureUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AzureUpdateResponse = update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [update] */
    suspend fun update(
        params: AzureUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AzureUpdateResponse

    /** @see [update] */
    suspend fun update(endpoint: String, requestOptions: RequestOptions): AzureUpdateResponse =
        update(endpoint, AzureUpdateParams.none(), requestOptions)

    /**
     * Call any azure endpoint using the proxy.
     *
     * Just use `{PROXY_BASE_URL}/azure/{endpoint:path}`
     */
    suspend fun delete(
        endpoint: String,
        params: AzureDeleteParams = AzureDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AzureDeleteResponse = delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [delete] */
    suspend fun delete(
        params: AzureDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AzureDeleteResponse

    /** @see [delete] */
    suspend fun delete(endpoint: String, requestOptions: RequestOptions): AzureDeleteResponse =
        delete(endpoint, AzureDeleteParams.none(), requestOptions)

    /**
     * Call any azure endpoint using the proxy.
     *
     * Just use `{PROXY_BASE_URL}/azure/{endpoint:path}`
     */
    suspend fun call(
        endpoint: String,
        params: AzureCallParams = AzureCallParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AzureCallResponse = call(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [call] */
    suspend fun call(
        params: AzureCallParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AzureCallResponse

    /** @see [call] */
    suspend fun call(endpoint: String, requestOptions: RequestOptions): AzureCallResponse =
        call(endpoint, AzureCallParams.none(), requestOptions)

    /**
     * Call any azure endpoint using the proxy.
     *
     * Just use `{PROXY_BASE_URL}/azure/{endpoint:path}`
     */
    suspend fun patch(
        endpoint: String,
        params: AzurePatchParams = AzurePatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AzurePatchResponse = patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [patch] */
    suspend fun patch(
        params: AzurePatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AzurePatchResponse

    /** @see [patch] */
    suspend fun patch(endpoint: String, requestOptions: RequestOptions): AzurePatchResponse =
        patch(endpoint, AzurePatchParams.none(), requestOptions)

    /** A view of [AzureServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AzureServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /azure/{endpoint}`, but is otherwise the same as
         * [AzureServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            endpoint: String,
            params: AzureCreateParams = AzureCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AzureCreateResponse> =
            create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [create] */
        @MustBeClosed
        suspend fun create(
            params: AzureCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AzureCreateResponse>

        /** @see [create] */
        @MustBeClosed
        suspend fun create(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AzureCreateResponse> =
            create(endpoint, AzureCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /azure/{endpoint}`, but is otherwise the same as
         * [AzureServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            endpoint: String,
            params: AzureUpdateParams = AzureUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AzureUpdateResponse> =
            update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            params: AzureUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AzureUpdateResponse>

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AzureUpdateResponse> =
            update(endpoint, AzureUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /azure/{endpoint}`, but is otherwise the same as
         * [AzureServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            endpoint: String,
            params: AzureDeleteParams = AzureDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AzureDeleteResponse> =
            delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            params: AzureDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AzureDeleteResponse>

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AzureDeleteResponse> =
            delete(endpoint, AzureDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /azure/{endpoint}`, but is otherwise the same as
         * [AzureServiceAsync.call].
         */
        @MustBeClosed
        suspend fun call(
            endpoint: String,
            params: AzureCallParams = AzureCallParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AzureCallResponse> =
            call(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [call] */
        @MustBeClosed
        suspend fun call(
            params: AzureCallParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AzureCallResponse>

        /** @see [call] */
        @MustBeClosed
        suspend fun call(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AzureCallResponse> =
            call(endpoint, AzureCallParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /azure/{endpoint}`, but is otherwise the same as
         * [AzureServiceAsync.patch].
         */
        @MustBeClosed
        suspend fun patch(
            endpoint: String,
            params: AzurePatchParams = AzurePatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AzurePatchResponse> =
            patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [patch] */
        @MustBeClosed
        suspend fun patch(
            params: AzurePatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AzurePatchResponse>

        /** @see [patch] */
        @MustBeClosed
        suspend fun patch(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AzurePatchResponse> =
            patch(endpoint, AzurePatchParams.none(), requestOptions)
    }
}
