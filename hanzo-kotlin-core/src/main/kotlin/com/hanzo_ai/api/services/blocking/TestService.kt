// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.test.TestPingParams
import com.hanzo_ai.api.models.test.TestPingResponse

interface TestService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * [DEPRECATED] use `/health/liveliness` instead.
     *
     * A test endpoint that pings the proxy server to check if it's healthy.
     *
     * Parameters: request (Request): The incoming request.
     *
     * Returns: dict: A dictionary containing the route of the request URL.
     */
    fun ping(
        params: TestPingParams = TestPingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestPingResponse

    /** @see [ping] */
    fun ping(requestOptions: RequestOptions): TestPingResponse =
        ping(TestPingParams.none(), requestOptions)

    /** A view of [TestService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /test`, but is otherwise the same as
         * [TestService.ping].
         */
        @MustBeClosed
        fun ping(
            params: TestPingParams = TestPingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestPingResponse>

        /** @see [ping] */
        @MustBeClosed
        fun ping(requestOptions: RequestOptions): HttpResponseFor<TestPingResponse> =
            ping(TestPingParams.none(), requestOptions)
    }
}
