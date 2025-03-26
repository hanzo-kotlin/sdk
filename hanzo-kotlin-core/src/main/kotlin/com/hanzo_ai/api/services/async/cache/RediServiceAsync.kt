// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.cache

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.cache.redis.RediRetrieveInfoParams
import com.hanzo_ai.api.models.cache.redis.RediRetrieveInfoResponse

interface RediServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Endpoint for getting /redis/info */
    suspend fun retrieveInfo(
        params: RediRetrieveInfoParams = RediRetrieveInfoParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RediRetrieveInfoResponse

    /** @see [retrieveInfo] */
    suspend fun retrieveInfo(requestOptions: RequestOptions): RediRetrieveInfoResponse =
        retrieveInfo(RediRetrieveInfoParams.none(), requestOptions)

    /** A view of [RediServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /cache/redis/info`, but is otherwise the same as
         * [RediServiceAsync.retrieveInfo].
         */
        @MustBeClosed
        suspend fun retrieveInfo(
            params: RediRetrieveInfoParams = RediRetrieveInfoParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RediRetrieveInfoResponse>

        /** @see [retrieveInfo] */
        @MustBeClosed
        suspend fun retrieveInfo(
            requestOptions: RequestOptions
        ): HttpResponseFor<RediRetrieveInfoResponse> =
            retrieveInfo(RediRetrieveInfoParams.none(), requestOptions)
    }
}
