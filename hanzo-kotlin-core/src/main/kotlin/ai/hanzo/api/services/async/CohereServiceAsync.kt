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
        endpoint: String,
        params: CohereCreateParams = CohereCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereCreateResponse = create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [create] */
    suspend fun create(
        params: CohereCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereCreateResponse

    /** @see [create] */
    suspend fun create(endpoint: String, requestOptions: RequestOptions): CohereCreateResponse =
        create(endpoint, CohereCreateParams.none(), requestOptions)

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/cohere) */
    suspend fun retrieve(
        endpoint: String,
        params: CohereRetrieveParams = CohereRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereRetrieveResponse =
        retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: CohereRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereRetrieveResponse

    /** @see [retrieve] */
    suspend fun retrieve(endpoint: String, requestOptions: RequestOptions): CohereRetrieveResponse =
        retrieve(endpoint, CohereRetrieveParams.none(), requestOptions)

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/cohere) */
    suspend fun update(
        endpoint: String,
        params: CohereUpdateParams = CohereUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereUpdateResponse = update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [update] */
    suspend fun update(
        params: CohereUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereUpdateResponse

    /** @see [update] */
    suspend fun update(endpoint: String, requestOptions: RequestOptions): CohereUpdateResponse =
        update(endpoint, CohereUpdateParams.none(), requestOptions)

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/cohere) */
    suspend fun delete(
        endpoint: String,
        params: CohereDeleteParams = CohereDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereDeleteResponse = delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [delete] */
    suspend fun delete(
        params: CohereDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereDeleteResponse

    /** @see [delete] */
    suspend fun delete(endpoint: String, requestOptions: RequestOptions): CohereDeleteResponse =
        delete(endpoint, CohereDeleteParams.none(), requestOptions)

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/cohere) */
    suspend fun modify(
        endpoint: String,
        params: CohereModifyParams = CohereModifyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereModifyResponse = modify(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [modify] */
    suspend fun modify(
        params: CohereModifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereModifyResponse

    /** @see [modify] */
    suspend fun modify(endpoint: String, requestOptions: RequestOptions): CohereModifyResponse =
        modify(endpoint, CohereModifyParams.none(), requestOptions)

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
            endpoint: String,
            params: CohereCreateParams = CohereCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CohereCreateResponse> =
            create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [create] */
        @MustBeClosed
        suspend fun create(
            params: CohereCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CohereCreateResponse>

        /** @see [create] */
        @MustBeClosed
        suspend fun create(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CohereCreateResponse> =
            create(endpoint, CohereCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cohere/{endpoint}`, but is otherwise the same as
         * [CohereServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            endpoint: String,
            params: CohereRetrieveParams = CohereRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CohereRetrieveResponse> =
            retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: CohereRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CohereRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CohereRetrieveResponse> =
            retrieve(endpoint, CohereRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /cohere/{endpoint}`, but is otherwise the same as
         * [CohereServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            endpoint: String,
            params: CohereUpdateParams = CohereUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CohereUpdateResponse> =
            update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            params: CohereUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CohereUpdateResponse>

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CohereUpdateResponse> =
            update(endpoint, CohereUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /cohere/{endpoint}`, but is otherwise the same as
         * [CohereServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            endpoint: String,
            params: CohereDeleteParams = CohereDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CohereDeleteResponse> =
            delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            params: CohereDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CohereDeleteResponse>

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CohereDeleteResponse> =
            delete(endpoint, CohereDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /cohere/{endpoint}`, but is otherwise the same as
         * [CohereServiceAsync.modify].
         */
        @MustBeClosed
        suspend fun modify(
            endpoint: String,
            params: CohereModifyParams = CohereModifyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CohereModifyResponse> =
            modify(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [modify] */
        @MustBeClosed
        suspend fun modify(
            params: CohereModifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CohereModifyResponse>

        /** @see [modify] */
        @MustBeClosed
        suspend fun modify(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CohereModifyResponse> =
            modify(endpoint, CohereModifyParams.none(), requestOptions)
    }
}
