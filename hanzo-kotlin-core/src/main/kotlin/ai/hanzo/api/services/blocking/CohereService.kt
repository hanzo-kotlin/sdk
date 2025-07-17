// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.ClientOptions
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

interface CohereService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CohereService

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/cohere) */
    fun create(
        endpoint: String,
        params: CohereCreateParams = CohereCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereCreateResponse = create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [create] */
    fun create(
        params: CohereCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereCreateResponse

    /** @see [create] */
    fun create(endpoint: String, requestOptions: RequestOptions): CohereCreateResponse =
        create(endpoint, CohereCreateParams.none(), requestOptions)

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/cohere) */
    fun retrieve(
        endpoint: String,
        params: CohereRetrieveParams = CohereRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereRetrieveResponse =
        retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: CohereRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereRetrieveResponse

    /** @see [retrieve] */
    fun retrieve(endpoint: String, requestOptions: RequestOptions): CohereRetrieveResponse =
        retrieve(endpoint, CohereRetrieveParams.none(), requestOptions)

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/cohere) */
    fun update(
        endpoint: String,
        params: CohereUpdateParams = CohereUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereUpdateResponse = update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [update] */
    fun update(
        params: CohereUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereUpdateResponse

    /** @see [update] */
    fun update(endpoint: String, requestOptions: RequestOptions): CohereUpdateResponse =
        update(endpoint, CohereUpdateParams.none(), requestOptions)

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/cohere) */
    fun delete(
        endpoint: String,
        params: CohereDeleteParams = CohereDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereDeleteResponse = delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        params: CohereDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereDeleteResponse

    /** @see [delete] */
    fun delete(endpoint: String, requestOptions: RequestOptions): CohereDeleteResponse =
        delete(endpoint, CohereDeleteParams.none(), requestOptions)

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/cohere) */
    fun modify(
        endpoint: String,
        params: CohereModifyParams = CohereModifyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereModifyResponse = modify(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [modify] */
    fun modify(
        params: CohereModifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CohereModifyResponse

    /** @see [modify] */
    fun modify(endpoint: String, requestOptions: RequestOptions): CohereModifyResponse =
        modify(endpoint, CohereModifyParams.none(), requestOptions)

    /** A view of [CohereService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CohereService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cohere/{endpoint}`, but is otherwise the same as
         * [CohereService.create].
         */
        @MustBeClosed
        fun create(
            endpoint: String,
            params: CohereCreateParams = CohereCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CohereCreateResponse> =
            create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CohereCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CohereCreateResponse>

        /** @see [create] */
        @MustBeClosed
        fun create(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CohereCreateResponse> =
            create(endpoint, CohereCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cohere/{endpoint}`, but is otherwise the same as
         * [CohereService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            endpoint: String,
            params: CohereRetrieveParams = CohereRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CohereRetrieveResponse> =
            retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CohereRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CohereRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CohereRetrieveResponse> =
            retrieve(endpoint, CohereRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /cohere/{endpoint}`, but is otherwise the same as
         * [CohereService.update].
         */
        @MustBeClosed
        fun update(
            endpoint: String,
            params: CohereUpdateParams = CohereUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CohereUpdateResponse> =
            update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: CohereUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CohereUpdateResponse>

        /** @see [update] */
        @MustBeClosed
        fun update(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CohereUpdateResponse> =
            update(endpoint, CohereUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /cohere/{endpoint}`, but is otherwise the same as
         * [CohereService.delete].
         */
        @MustBeClosed
        fun delete(
            endpoint: String,
            params: CohereDeleteParams = CohereDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CohereDeleteResponse> =
            delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: CohereDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CohereDeleteResponse>

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CohereDeleteResponse> =
            delete(endpoint, CohereDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /cohere/{endpoint}`, but is otherwise the same as
         * [CohereService.modify].
         */
        @MustBeClosed
        fun modify(
            endpoint: String,
            params: CohereModifyParams = CohereModifyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CohereModifyResponse> =
            modify(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [modify] */
        @MustBeClosed
        fun modify(
            params: CohereModifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CohereModifyResponse>

        /** @see [modify] */
        @MustBeClosed
        fun modify(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CohereModifyResponse> =
            modify(endpoint, CohereModifyParams.none(), requestOptions)
    }
}
