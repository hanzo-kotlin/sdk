// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.cache

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.cache.redis.RediRetrieveInfoParams
import ai.hanzo.api.models.cache.redis.RediRetrieveInfoResponse
import com.google.errorprone.annotations.MustBeClosed

interface RediService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RediService

    /** Endpoint for getting /redis/info */
    fun retrieveInfo(
        params: RediRetrieveInfoParams = RediRetrieveInfoParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RediRetrieveInfoResponse

    /** @see retrieveInfo */
    fun retrieveInfo(requestOptions: RequestOptions): RediRetrieveInfoResponse =
        retrieveInfo(RediRetrieveInfoParams.none(), requestOptions)

    /** A view of [RediService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RediService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /cache/redis/info`, but is otherwise the same as
         * [RediService.retrieveInfo].
         */
        @MustBeClosed
        fun retrieveInfo(
            params: RediRetrieveInfoParams = RediRetrieveInfoParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RediRetrieveInfoResponse>

        /** @see retrieveInfo */
        @MustBeClosed
        fun retrieveInfo(
            requestOptions: RequestOptions
        ): HttpResponseFor<RediRetrieveInfoResponse> =
            retrieveInfo(RediRetrieveInfoParams.none(), requestOptions)
    }
}
