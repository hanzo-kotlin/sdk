// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiCreateParams
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiCreateResponse
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiDeleteParams
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiDeleteResponse
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiPatchParams
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiPatchResponse
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiRetrieveParams
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiRetrieveResponse
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiUpdateParams
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiUpdateResponse
import com.google.errorprone.annotations.MustBeClosed

interface EuAssemblyaiService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EuAssemblyaiService

    /** Assemblyai Proxy Route */
    fun create(
        endpoint: String,
        params: EuAssemblyaiCreateParams = EuAssemblyaiCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EuAssemblyaiCreateResponse =
        create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see create */
    fun create(
        params: EuAssemblyaiCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EuAssemblyaiCreateResponse

    /** @see create */
    fun create(endpoint: String, requestOptions: RequestOptions): EuAssemblyaiCreateResponse =
        create(endpoint, EuAssemblyaiCreateParams.none(), requestOptions)

    /** Assemblyai Proxy Route */
    fun retrieve(
        endpoint: String,
        params: EuAssemblyaiRetrieveParams = EuAssemblyaiRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EuAssemblyaiRetrieveResponse =
        retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: EuAssemblyaiRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EuAssemblyaiRetrieveResponse

    /** @see retrieve */
    fun retrieve(endpoint: String, requestOptions: RequestOptions): EuAssemblyaiRetrieveResponse =
        retrieve(endpoint, EuAssemblyaiRetrieveParams.none(), requestOptions)

    /** Assemblyai Proxy Route */
    fun update(
        endpoint: String,
        params: EuAssemblyaiUpdateParams = EuAssemblyaiUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EuAssemblyaiUpdateResponse =
        update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see update */
    fun update(
        params: EuAssemblyaiUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EuAssemblyaiUpdateResponse

    /** @see update */
    fun update(endpoint: String, requestOptions: RequestOptions): EuAssemblyaiUpdateResponse =
        update(endpoint, EuAssemblyaiUpdateParams.none(), requestOptions)

    /** Assemblyai Proxy Route */
    fun delete(
        endpoint: String,
        params: EuAssemblyaiDeleteParams = EuAssemblyaiDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EuAssemblyaiDeleteResponse =
        delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: EuAssemblyaiDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EuAssemblyaiDeleteResponse

    /** @see delete */
    fun delete(endpoint: String, requestOptions: RequestOptions): EuAssemblyaiDeleteResponse =
        delete(endpoint, EuAssemblyaiDeleteParams.none(), requestOptions)

    /** Assemblyai Proxy Route */
    fun patch(
        endpoint: String,
        params: EuAssemblyaiPatchParams = EuAssemblyaiPatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EuAssemblyaiPatchResponse =
        patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see patch */
    fun patch(
        params: EuAssemblyaiPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EuAssemblyaiPatchResponse

    /** @see patch */
    fun patch(endpoint: String, requestOptions: RequestOptions): EuAssemblyaiPatchResponse =
        patch(endpoint, EuAssemblyaiPatchParams.none(), requestOptions)

    /**
     * A view of [EuAssemblyaiService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EuAssemblyaiService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /eu.assemblyai/{endpoint}`, but is otherwise the
         * same as [EuAssemblyaiService.create].
         */
        @MustBeClosed
        fun create(
            endpoint: String,
            params: EuAssemblyaiCreateParams = EuAssemblyaiCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EuAssemblyaiCreateResponse> =
            create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: EuAssemblyaiCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EuAssemblyaiCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EuAssemblyaiCreateResponse> =
            create(endpoint, EuAssemblyaiCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /eu.assemblyai/{endpoint}`, but is otherwise the
         * same as [EuAssemblyaiService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            endpoint: String,
            params: EuAssemblyaiRetrieveParams = EuAssemblyaiRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EuAssemblyaiRetrieveResponse> =
            retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EuAssemblyaiRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EuAssemblyaiRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EuAssemblyaiRetrieveResponse> =
            retrieve(endpoint, EuAssemblyaiRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /eu.assemblyai/{endpoint}`, but is otherwise the
         * same as [EuAssemblyaiService.update].
         */
        @MustBeClosed
        fun update(
            endpoint: String,
            params: EuAssemblyaiUpdateParams = EuAssemblyaiUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EuAssemblyaiUpdateResponse> =
            update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: EuAssemblyaiUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EuAssemblyaiUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EuAssemblyaiUpdateResponse> =
            update(endpoint, EuAssemblyaiUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /eu.assemblyai/{endpoint}`, but is otherwise the
         * same as [EuAssemblyaiService.delete].
         */
        @MustBeClosed
        fun delete(
            endpoint: String,
            params: EuAssemblyaiDeleteParams = EuAssemblyaiDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EuAssemblyaiDeleteResponse> =
            delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: EuAssemblyaiDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EuAssemblyaiDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EuAssemblyaiDeleteResponse> =
            delete(endpoint, EuAssemblyaiDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /eu.assemblyai/{endpoint}`, but is otherwise the
         * same as [EuAssemblyaiService.patch].
         */
        @MustBeClosed
        fun patch(
            endpoint: String,
            params: EuAssemblyaiPatchParams = EuAssemblyaiPatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EuAssemblyaiPatchResponse> =
            patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see patch */
        @MustBeClosed
        fun patch(
            params: EuAssemblyaiPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EuAssemblyaiPatchResponse>

        /** @see patch */
        @MustBeClosed
        fun patch(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EuAssemblyaiPatchResponse> =
            patch(endpoint, EuAssemblyaiPatchParams.none(), requestOptions)
    }
}
