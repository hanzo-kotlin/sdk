// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.assemblyai.AssemblyaiCreateParams
import ai.hanzo.api.models.assemblyai.AssemblyaiCreateResponse
import ai.hanzo.api.models.assemblyai.AssemblyaiDeleteParams
import ai.hanzo.api.models.assemblyai.AssemblyaiDeleteResponse
import ai.hanzo.api.models.assemblyai.AssemblyaiPatchParams
import ai.hanzo.api.models.assemblyai.AssemblyaiPatchResponse
import ai.hanzo.api.models.assemblyai.AssemblyaiRetrieveParams
import ai.hanzo.api.models.assemblyai.AssemblyaiRetrieveResponse
import ai.hanzo.api.models.assemblyai.AssemblyaiUpdateParams
import ai.hanzo.api.models.assemblyai.AssemblyaiUpdateResponse
import com.google.errorprone.annotations.MustBeClosed

interface AssemblyaiServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Assemblyai Proxy Route */
    suspend fun create(
        endpoint: String,
        params: AssemblyaiCreateParams = AssemblyaiCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiCreateResponse =
        create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [create] */
    suspend fun create(
        params: AssemblyaiCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiCreateResponse

    /** @see [create] */
    suspend fun create(endpoint: String, requestOptions: RequestOptions): AssemblyaiCreateResponse =
        create(endpoint, AssemblyaiCreateParams.none(), requestOptions)

    /** Assemblyai Proxy Route */
    suspend fun retrieve(
        endpoint: String,
        params: AssemblyaiRetrieveParams = AssemblyaiRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiRetrieveResponse =
        retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: AssemblyaiRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiRetrieveResponse

    /** @see [retrieve] */
    suspend fun retrieve(
        endpoint: String,
        requestOptions: RequestOptions,
    ): AssemblyaiRetrieveResponse =
        retrieve(endpoint, AssemblyaiRetrieveParams.none(), requestOptions)

    /** Assemblyai Proxy Route */
    suspend fun update(
        endpoint: String,
        params: AssemblyaiUpdateParams = AssemblyaiUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiUpdateResponse =
        update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [update] */
    suspend fun update(
        params: AssemblyaiUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiUpdateResponse

    /** @see [update] */
    suspend fun update(endpoint: String, requestOptions: RequestOptions): AssemblyaiUpdateResponse =
        update(endpoint, AssemblyaiUpdateParams.none(), requestOptions)

    /** Assemblyai Proxy Route */
    suspend fun delete(
        endpoint: String,
        params: AssemblyaiDeleteParams = AssemblyaiDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiDeleteResponse =
        delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [delete] */
    suspend fun delete(
        params: AssemblyaiDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiDeleteResponse

    /** @see [delete] */
    suspend fun delete(endpoint: String, requestOptions: RequestOptions): AssemblyaiDeleteResponse =
        delete(endpoint, AssemblyaiDeleteParams.none(), requestOptions)

    /** Assemblyai Proxy Route */
    suspend fun patch(
        endpoint: String,
        params: AssemblyaiPatchParams = AssemblyaiPatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiPatchResponse =
        patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [patch] */
    suspend fun patch(
        params: AssemblyaiPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiPatchResponse

    /** @see [patch] */
    suspend fun patch(endpoint: String, requestOptions: RequestOptions): AssemblyaiPatchResponse =
        patch(endpoint, AssemblyaiPatchParams.none(), requestOptions)

    /**
     * A view of [AssemblyaiServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /assemblyai/{endpoint}`, but is otherwise the same
         * as [AssemblyaiServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            endpoint: String,
            params: AssemblyaiCreateParams = AssemblyaiCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiCreateResponse> =
            create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [create] */
        @MustBeClosed
        suspend fun create(
            params: AssemblyaiCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiCreateResponse>

        /** @see [create] */
        @MustBeClosed
        suspend fun create(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssemblyaiCreateResponse> =
            create(endpoint, AssemblyaiCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /assemblyai/{endpoint}`, but is otherwise the same
         * as [AssemblyaiServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            endpoint: String,
            params: AssemblyaiRetrieveParams = AssemblyaiRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiRetrieveResponse> =
            retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: AssemblyaiRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssemblyaiRetrieveResponse> =
            retrieve(endpoint, AssemblyaiRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /assemblyai/{endpoint}`, but is otherwise the same
         * as [AssemblyaiServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            endpoint: String,
            params: AssemblyaiUpdateParams = AssemblyaiUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiUpdateResponse> =
            update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            params: AssemblyaiUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiUpdateResponse>

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssemblyaiUpdateResponse> =
            update(endpoint, AssemblyaiUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /assemblyai/{endpoint}`, but is otherwise the
         * same as [AssemblyaiServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            endpoint: String,
            params: AssemblyaiDeleteParams = AssemblyaiDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiDeleteResponse> =
            delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            params: AssemblyaiDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiDeleteResponse>

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssemblyaiDeleteResponse> =
            delete(endpoint, AssemblyaiDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /assemblyai/{endpoint}`, but is otherwise the same
         * as [AssemblyaiServiceAsync.patch].
         */
        @MustBeClosed
        suspend fun patch(
            endpoint: String,
            params: AssemblyaiPatchParams = AssemblyaiPatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiPatchResponse> =
            patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [patch] */
        @MustBeClosed
        suspend fun patch(
            params: AssemblyaiPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiPatchResponse>

        /** @see [patch] */
        @MustBeClosed
        suspend fun patch(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssemblyaiPatchResponse> =
            patch(endpoint, AssemblyaiPatchParams.none(), requestOptions)
    }
}
