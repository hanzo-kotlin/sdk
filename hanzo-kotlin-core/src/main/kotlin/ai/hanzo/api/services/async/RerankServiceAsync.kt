// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.rerank.RerankCreateParams
import ai.hanzo.api.models.rerank.RerankCreateResponse
import ai.hanzo.api.models.rerank.RerankCreateV1Params
import ai.hanzo.api.models.rerank.RerankCreateV1Response
import ai.hanzo.api.models.rerank.RerankCreateV2Params
import ai.hanzo.api.models.rerank.RerankCreateV2Response
import com.google.errorprone.annotations.MustBeClosed

interface RerankServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Rerank */
    suspend fun create(
        params: RerankCreateParams = RerankCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RerankCreateResponse

    /** @see [create] */
    suspend fun create(requestOptions: RequestOptions): RerankCreateResponse =
        create(RerankCreateParams.none(), requestOptions)

    /** Rerank */
    suspend fun createV1(
        params: RerankCreateV1Params = RerankCreateV1Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RerankCreateV1Response

    /** @see [createV1] */
    suspend fun createV1(requestOptions: RequestOptions): RerankCreateV1Response =
        createV1(RerankCreateV1Params.none(), requestOptions)

    /** Rerank */
    suspend fun createV2(
        params: RerankCreateV2Params = RerankCreateV2Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RerankCreateV2Response

    /** @see [createV2] */
    suspend fun createV2(requestOptions: RequestOptions): RerankCreateV2Response =
        createV2(RerankCreateV2Params.none(), requestOptions)

    /**
     * A view of [RerankServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /rerank`, but is otherwise the same as
         * [RerankServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: RerankCreateParams = RerankCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RerankCreateResponse>

        /** @see [create] */
        @MustBeClosed
        suspend fun create(requestOptions: RequestOptions): HttpResponseFor<RerankCreateResponse> =
            create(RerankCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/rerank`, but is otherwise the same as
         * [RerankServiceAsync.createV1].
         */
        @MustBeClosed
        suspend fun createV1(
            params: RerankCreateV1Params = RerankCreateV1Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RerankCreateV1Response>

        /** @see [createV1] */
        @MustBeClosed
        suspend fun createV1(
            requestOptions: RequestOptions
        ): HttpResponseFor<RerankCreateV1Response> =
            createV1(RerankCreateV1Params.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v2/rerank`, but is otherwise the same as
         * [RerankServiceAsync.createV2].
         */
        @MustBeClosed
        suspend fun createV2(
            params: RerankCreateV2Params = RerankCreateV2Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RerankCreateV2Response>

        /** @see [createV2] */
        @MustBeClosed
        suspend fun createV2(
            requestOptions: RequestOptions
        ): HttpResponseFor<RerankCreateV2Response> =
            createV2(RerankCreateV2Params.none(), requestOptions)
    }
}
