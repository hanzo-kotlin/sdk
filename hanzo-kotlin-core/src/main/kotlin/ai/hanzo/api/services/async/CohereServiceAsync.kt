// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.cohere.CohereCreateParams
import ai.hanzo.api.models.cohere.CohereCreateResponse
import ai.hanzo.api.models.cohere.CohereDeleteParams
import ai.hanzo.api.models.cohere.CohereDeleteResponse
import ai.hanzo.api.models.cohere.CohereModifyParams
import ai.hanzo.api.models.cohere.CohereModifyResponse
import ai.hanzo.api.models.cohere.CohereRetrieveParams
import ai.hanzo.api.models.cohere.CohereRetrieveResponse
import ai.hanzo.api.models.cohere.CohereUpdateParams
import ai.hanzo.api.models.cohere.CohereUpdateResponse
import com.google.errorprone.annotations.MustBeClosed

interface CohereServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/cohere) */
    suspend fun create(
        params: CohereCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereCreateResponse

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/cohere) */
    suspend fun retrieve(
        params: CohereRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereRetrieveResponse

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/cohere) */
    suspend fun update(
        params: CohereUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereUpdateResponse

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/cohere) */
    suspend fun delete(
        params: CohereDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereDeleteResponse

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/cohere) */
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
