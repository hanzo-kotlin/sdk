// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiCreateParams
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiCreateResponse
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiDeleteParams
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiDeleteResponse
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiPatchParams
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiPatchResponse
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiRetrieveParams
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiRetrieveResponse
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiUpdateParams
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiUpdateResponse

interface EuAssemblyaiServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Assemblyai Proxy Route */
    suspend fun create(
        params: EuAssemblyaiCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EuAssemblyaiCreateResponse

    /** Assemblyai Proxy Route */
    suspend fun retrieve(
        params: EuAssemblyaiRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EuAssemblyaiRetrieveResponse

    /** Assemblyai Proxy Route */
    suspend fun update(
        params: EuAssemblyaiUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EuAssemblyaiUpdateResponse

    /** Assemblyai Proxy Route */
    suspend fun delete(
        params: EuAssemblyaiDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EuAssemblyaiDeleteResponse

    /** Assemblyai Proxy Route */
    suspend fun patch(
        params: EuAssemblyaiPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EuAssemblyaiPatchResponse

    /**
     * A view of [EuAssemblyaiServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /eu.assemblyai/{endpoint}`, but is otherwise the
         * same as [EuAssemblyaiServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: EuAssemblyaiCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EuAssemblyaiCreateResponse>

        /**
         * Returns a raw HTTP response for `get /eu.assemblyai/{endpoint}`, but is otherwise the
         * same as [EuAssemblyaiServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: EuAssemblyaiRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EuAssemblyaiRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put /eu.assemblyai/{endpoint}`, but is otherwise the
         * same as [EuAssemblyaiServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: EuAssemblyaiUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EuAssemblyaiUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete /eu.assemblyai/{endpoint}`, but is otherwise the
         * same as [EuAssemblyaiServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: EuAssemblyaiDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EuAssemblyaiDeleteResponse>

        /**
         * Returns a raw HTTP response for `patch /eu.assemblyai/{endpoint}`, but is otherwise the
         * same as [EuAssemblyaiServiceAsync.patch].
         */
        @MustBeClosed
        suspend fun patch(
            params: EuAssemblyaiPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EuAssemblyaiPatchResponse>
    }
}
