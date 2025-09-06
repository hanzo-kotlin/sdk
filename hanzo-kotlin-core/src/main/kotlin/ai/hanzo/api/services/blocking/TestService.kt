// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.test.TestPingParams
import ai.hanzo.api.models.test.TestPingResponse
import com.google.errorprone.annotations.MustBeClosed

interface TestService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TestService

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

    /** @see ping */
    fun ping(requestOptions: RequestOptions): TestPingResponse =
        ping(TestPingParams.none(), requestOptions)

    /** A view of [TestService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TestService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /test`, but is otherwise the same as
         * [TestService.ping].
         */
        @MustBeClosed
        fun ping(
            params: TestPingParams = TestPingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestPingResponse>

        /** @see ping */
        @MustBeClosed
        fun ping(requestOptions: RequestOptions): HttpResponseFor<TestPingResponse> =
            ping(TestPingParams.none(), requestOptions)
    }
}
