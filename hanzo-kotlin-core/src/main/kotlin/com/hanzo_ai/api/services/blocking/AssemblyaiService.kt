// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

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

interface AssemblyaiService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Assemblyai Proxy Route */
    fun create(
        params: AssemblyaiCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiCreateResponse

    /** Assemblyai Proxy Route */
    fun retrieve(
        params: AssemblyaiRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiRetrieveResponse

    /** Assemblyai Proxy Route */
    fun update(
        params: AssemblyaiUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiUpdateResponse

    /** Assemblyai Proxy Route */
    fun delete(
        params: AssemblyaiDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiDeleteResponse

    /** Assemblyai Proxy Route */
    fun patch(
        params: AssemblyaiPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiPatchResponse

    /** A view of [AssemblyaiService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /assemblyai/{endpoint}`, but is otherwise the same
         * as [AssemblyaiService.create].
         */
        @MustBeClosed
        fun create(
            params: AssemblyaiCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiCreateResponse>

        /**
         * Returns a raw HTTP response for `get /assemblyai/{endpoint}`, but is otherwise the same
         * as [AssemblyaiService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: AssemblyaiRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put /assemblyai/{endpoint}`, but is otherwise the same
         * as [AssemblyaiService.update].
         */
        @MustBeClosed
        fun update(
            params: AssemblyaiUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete /assemblyai/{endpoint}`, but is otherwise the
         * same as [AssemblyaiService.delete].
         */
        @MustBeClosed
        fun delete(
            params: AssemblyaiDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiDeleteResponse>

        /**
         * Returns a raw HTTP response for `patch /assemblyai/{endpoint}`, but is otherwise the same
         * as [AssemblyaiService.patch].
         */
        @MustBeClosed
        fun patch(
            params: AssemblyaiPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiPatchResponse>
    }
}
