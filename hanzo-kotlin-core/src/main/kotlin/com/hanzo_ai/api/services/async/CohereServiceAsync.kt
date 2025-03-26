// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.cohere.CohereCreateParams
import com.hanzo_ai.api.models.cohere.CohereCreateResponse
import com.hanzo_ai.api.models.cohere.CohereDeleteParams
import com.hanzo_ai.api.models.cohere.CohereDeleteResponse
import com.hanzo_ai.api.models.cohere.CohereModifyParams
import com.hanzo_ai.api.models.cohere.CohereModifyResponse
import com.hanzo_ai.api.models.cohere.CohereRetrieveParams
import com.hanzo_ai.api.models.cohere.CohereRetrieveResponse
import com.hanzo_ai.api.models.cohere.CohereUpdateParams
import com.hanzo_ai.api.models.cohere.CohereUpdateResponse

interface CohereServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** [Docs](https://docs.llm.ai/docs/pass_through/cohere) */
    suspend fun create(
        params: CohereCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereCreateResponse

    /** [Docs](https://docs.llm.ai/docs/pass_through/cohere) */
    suspend fun retrieve(
        params: CohereRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereRetrieveResponse

    /** [Docs](https://docs.llm.ai/docs/pass_through/cohere) */
    suspend fun update(
        params: CohereUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereUpdateResponse

    /** [Docs](https://docs.llm.ai/docs/pass_through/cohere) */
    suspend fun delete(
        params: CohereDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereDeleteResponse

    /** [Docs](https://docs.llm.ai/docs/pass_through/cohere) */
    suspend fun modify(
        params: CohereModifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereModifyResponse

    /**
     * A view of [CohereServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /cohere/{endpoint}`, but is otherwise the same as
         * [CohereServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CohereCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CohereCreateResponse>

        /**
         * Returns a raw HTTP response for `get /cohere/{endpoint}`, but is otherwise the same as
         * [CohereServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: CohereRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CohereRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put /cohere/{endpoint}`, but is otherwise the same as
         * [CohereServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: CohereUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CohereUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete /cohere/{endpoint}`, but is otherwise the same as
         * [CohereServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: CohereDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CohereDeleteResponse>

        /**
         * Returns a raw HTTP response for `patch /cohere/{endpoint}`, but is otherwise the same as
         * [CohereServiceAsync.modify].
         */
        @MustBeClosed
        suspend fun modify(
            params: CohereModifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CohereModifyResponse>
    }
}
