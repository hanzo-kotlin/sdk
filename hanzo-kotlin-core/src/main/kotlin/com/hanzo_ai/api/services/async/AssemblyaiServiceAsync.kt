// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.assemblyai.AssemblyaiCreateParams
import com.hanzo_ai.api.models.assemblyai.AssemblyaiCreateResponse
import com.hanzo_ai.api.models.assemblyai.AssemblyaiDeleteParams
import com.hanzo_ai.api.models.assemblyai.AssemblyaiDeleteResponse
import com.hanzo_ai.api.models.assemblyai.AssemblyaiPatchParams
import com.hanzo_ai.api.models.assemblyai.AssemblyaiPatchResponse
import com.hanzo_ai.api.models.assemblyai.AssemblyaiRetrieveParams
import com.hanzo_ai.api.models.assemblyai.AssemblyaiRetrieveResponse
import com.hanzo_ai.api.models.assemblyai.AssemblyaiUpdateParams
import com.hanzo_ai.api.models.assemblyai.AssemblyaiUpdateResponse

interface AssemblyaiServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Assemblyai Proxy Route */
    suspend fun create(
        params: AssemblyaiCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiCreateResponse

    /** Assemblyai Proxy Route */
    suspend fun retrieve(
        params: AssemblyaiRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiRetrieveResponse

    /** Assemblyai Proxy Route */
    suspend fun update(
        params: AssemblyaiUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiUpdateResponse

    /** Assemblyai Proxy Route */
    suspend fun delete(
        params: AssemblyaiDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiDeleteResponse

    /** Assemblyai Proxy Route */
    suspend fun patch(
        params: AssemblyaiPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiPatchResponse

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
            params: AssemblyaiCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiCreateResponse>

        /**
         * Returns a raw HTTP response for `get /assemblyai/{endpoint}`, but is otherwise the same
         * as [AssemblyaiServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: AssemblyaiRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put /assemblyai/{endpoint}`, but is otherwise the same
         * as [AssemblyaiServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: AssemblyaiUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete /assemblyai/{endpoint}`, but is otherwise the
         * same as [AssemblyaiServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: AssemblyaiDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiDeleteResponse>

        /**
         * Returns a raw HTTP response for `patch /assemblyai/{endpoint}`, but is otherwise the same
         * as [AssemblyaiServiceAsync.patch].
         */
        @MustBeClosed
        suspend fun patch(
            params: AssemblyaiPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiPatchResponse>
    }
}
