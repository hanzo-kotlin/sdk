// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.credentials.CredentialCreateParams
import com.hanzo_ai.api.models.credentials.CredentialCreateResponse
import com.hanzo_ai.api.models.credentials.CredentialDeleteParams
import com.hanzo_ai.api.models.credentials.CredentialDeleteResponse
import com.hanzo_ai.api.models.credentials.CredentialListParams
import com.hanzo_ai.api.models.credentials.CredentialListResponse

interface CredentialServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * [BETA] endpoint. This might change unexpectedly. Stores credential in DB. Reloads credentials
     * in memory.
     */
    suspend fun create(
        params: CredentialCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CredentialCreateResponse

    /** [BETA] endpoint. This might change unexpectedly. */
    suspend fun list(
        params: CredentialListParams = CredentialListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CredentialListResponse

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): CredentialListResponse =
        list(CredentialListParams.none(), requestOptions)

    /** [BETA] endpoint. This might change unexpectedly. */
    suspend fun delete(
        params: CredentialDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CredentialDeleteResponse

    /**
     * A view of [CredentialServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /credentials`, but is otherwise the same as
         * [CredentialServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CredentialCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CredentialCreateResponse>

        /**
         * Returns a raw HTTP response for `get /credentials`, but is otherwise the same as
         * [CredentialServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CredentialListParams = CredentialListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CredentialListResponse>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<CredentialListResponse> =
            list(CredentialListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /credentials/{credential_name}`, but is otherwise
         * the same as [CredentialServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: CredentialDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CredentialDeleteResponse>
    }
}
