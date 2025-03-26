// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

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
     * Call any azure endpoint using the proxy.
     *
     * Just use `{PROXY_BASE_URL}/azure/{endpoint:path}`
     */
    suspend fun create(
        params: AzureCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AzureCreateResponse

    /**
     * Call any azure endpoint using the proxy.
     *
     * Just use `{PROXY_BASE_URL}/azure/{endpoint:path}`
     */
    suspend fun update(
        params: AzureUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AzureUpdateResponse

    /**
     * Call any azure endpoint using the proxy.
     *
     * Just use `{PROXY_BASE_URL}/azure/{endpoint:path}`
     */
    suspend fun delete(
        params: AzureDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AzureDeleteResponse

    /**
     * Call any azure endpoint using the proxy.
     *
     * Just use `{PROXY_BASE_URL}/azure/{endpoint:path}`
     */
    suspend fun call(
        params: AzureCallParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AzureCallResponse

    /**
     * Call any azure endpoint using the proxy.
     *
     * Just use `{PROXY_BASE_URL}/azure/{endpoint:path}`
     */
    suspend fun patch(
        params: AzurePatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AzurePatchResponse

    /** A view of [AzureServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /azure/{endpoint}`, but is otherwise the same as
         * [AzureServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: AzureCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AzureCreateResponse>

        /**
         * Returns a raw HTTP response for `put /azure/{endpoint}`, but is otherwise the same as
         * [AzureServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: AzureUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AzureUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete /azure/{endpoint}`, but is otherwise the same as
         * [AzureServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: AzureDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AzureDeleteResponse>

        /**
         * Returns a raw HTTP response for `get /azure/{endpoint}`, but is otherwise the same as
         * [AzureServiceAsync.call].
         */
        @MustBeClosed
        suspend fun call(
            params: AzureCallParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AzureCallResponse>

        /**
         * Returns a raw HTTP response for `patch /azure/{endpoint}`, but is otherwise the same as
         * [AzureServiceAsync.patch].
         */
        @MustBeClosed
        suspend fun patch(
            params: AzurePatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AzurePatchResponse>
    }
}
