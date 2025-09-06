// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.credentials.CredentialCreateParams
import ai.hanzo.api.models.credentials.CredentialCreateResponse
import ai.hanzo.api.models.credentials.CredentialDeleteParams
import ai.hanzo.api.models.credentials.CredentialDeleteResponse
import ai.hanzo.api.models.credentials.CredentialListParams
import ai.hanzo.api.models.credentials.CredentialListResponse
import com.google.errorprone.annotations.MustBeClosed

interface CredentialService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CredentialService

    /**
     * [BETA] endpoint. This might change unexpectedly. Stores credential in DB. Reloads credentials
     * in memory.
     */
    fun create(
        params: CredentialCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CredentialCreateResponse

    /** [BETA] endpoint. This might change unexpectedly. */
    fun list(
        params: CredentialListParams = CredentialListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CredentialListResponse

    /** @see list */
    fun list(requestOptions: RequestOptions): CredentialListResponse =
        list(CredentialListParams.none(), requestOptions)

    /** [BETA] endpoint. This might change unexpectedly. */
    fun delete(
        credentialName: String,
        params: CredentialDeleteParams = CredentialDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CredentialDeleteResponse =
        delete(params.toBuilder().credentialName(credentialName).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: CredentialDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CredentialDeleteResponse

    /** @see delete */
    fun delete(credentialName: String, requestOptions: RequestOptions): CredentialDeleteResponse =
        delete(credentialName, CredentialDeleteParams.none(), requestOptions)

    /** A view of [CredentialService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CredentialService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /credentials`, but is otherwise the same as
         * [CredentialService.create].
         */
        @MustBeClosed
        fun create(
            params: CredentialCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CredentialCreateResponse>

        /**
         * Returns a raw HTTP response for `get /credentials`, but is otherwise the same as
         * [CredentialService.list].
         */
        @MustBeClosed
        fun list(
            params: CredentialListParams = CredentialListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CredentialListResponse>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CredentialListResponse> =
            list(CredentialListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /credentials/{credential_name}`, but is otherwise
         * the same as [CredentialService.delete].
         */
        @MustBeClosed
        fun delete(
            credentialName: String,
            params: CredentialDeleteParams = CredentialDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CredentialDeleteResponse> =
            delete(params.toBuilder().credentialName(credentialName).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CredentialDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CredentialDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            credentialName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CredentialDeleteResponse> =
            delete(credentialName, CredentialDeleteParams.none(), requestOptions)
    }
}
