// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

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

    /** Assemblyai Proxy Route */
    fun create(
        params: EuAssemblyaiCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EuAssemblyaiCreateResponse

    /** Assemblyai Proxy Route */
    fun retrieve(
        params: EuAssemblyaiRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EuAssemblyaiRetrieveResponse

    /** Assemblyai Proxy Route */
    fun update(
        params: EuAssemblyaiUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EuAssemblyaiUpdateResponse

    /** Assemblyai Proxy Route */
    fun delete(
        params: EuAssemblyaiDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EuAssemblyaiDeleteResponse

    /** Assemblyai Proxy Route */
    fun patch(
        params: EuAssemblyaiPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EuAssemblyaiPatchResponse

    /**
     * A view of [EuAssemblyaiService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /eu.assemblyai/{endpoint}`, but is otherwise the
         * same as [EuAssemblyaiService.create].
         */
        @MustBeClosed
        fun create(
            params: EuAssemblyaiCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EuAssemblyaiCreateResponse>

        /**
         * Returns a raw HTTP response for `get /eu.assemblyai/{endpoint}`, but is otherwise the
         * same as [EuAssemblyaiService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: EuAssemblyaiRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EuAssemblyaiRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put /eu.assemblyai/{endpoint}`, but is otherwise the
         * same as [EuAssemblyaiService.update].
         */
        @MustBeClosed
        fun update(
            params: EuAssemblyaiUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EuAssemblyaiUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete /eu.assemblyai/{endpoint}`, but is otherwise the
         * same as [EuAssemblyaiService.delete].
         */
        @MustBeClosed
        fun delete(
            params: EuAssemblyaiDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EuAssemblyaiDeleteResponse>

        /**
         * Returns a raw HTTP response for `patch /eu.assemblyai/{endpoint}`, but is otherwise the
         * same as [EuAssemblyaiService.patch].
         */
        @MustBeClosed
        fun patch(
            params: EuAssemblyaiPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EuAssemblyaiPatchResponse>
    }
}
