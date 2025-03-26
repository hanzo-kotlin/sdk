// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

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

interface CohereService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** [Docs](https://docs.llm.ai/docs/pass_through/cohere) */
    fun create(
        params: CohereCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereCreateResponse

    /** [Docs](https://docs.llm.ai/docs/pass_through/cohere) */
    fun retrieve(
        params: CohereRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereRetrieveResponse

    /** [Docs](https://docs.llm.ai/docs/pass_through/cohere) */
    fun update(
        params: CohereUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereUpdateResponse

    /** [Docs](https://docs.llm.ai/docs/pass_through/cohere) */
    fun delete(
        params: CohereDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereDeleteResponse

    /** [Docs](https://docs.llm.ai/docs/pass_through/cohere) */
    fun modify(
        params: CohereModifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereModifyResponse

    /** A view of [CohereService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /cohere/{endpoint}`, but is otherwise the same as
         * [CohereService.create].
         */
        @MustBeClosed
        fun create(
            params: CohereCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CohereCreateResponse>

        /**
         * Returns a raw HTTP response for `get /cohere/{endpoint}`, but is otherwise the same as
         * [CohereService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: CohereRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CohereRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put /cohere/{endpoint}`, but is otherwise the same as
         * [CohereService.update].
         */
        @MustBeClosed
        fun update(
            params: CohereUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CohereUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete /cohere/{endpoint}`, but is otherwise the same as
         * [CohereService.delete].
         */
        @MustBeClosed
        fun delete(
            params: CohereDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CohereDeleteResponse>

        /**
         * Returns a raw HTTP response for `patch /cohere/{endpoint}`, but is otherwise the same as
         * [CohereService.modify].
         */
        @MustBeClosed
        fun modify(
            params: CohereModifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CohereModifyResponse>
    }
}
