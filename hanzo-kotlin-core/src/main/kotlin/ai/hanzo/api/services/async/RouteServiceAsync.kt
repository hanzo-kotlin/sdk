// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.routes.RouteListParams
import ai.hanzo.api.models.routes.RouteListResponse
import com.google.errorprone.annotations.MustBeClosed

interface RouteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get a list of available routes in the FastAPI application. */
    suspend fun list(
        params: RouteListParams = RouteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RouteListResponse

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): RouteListResponse =
        list(RouteListParams.none(), requestOptions)

    /** A view of [RouteServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /routes`, but is otherwise the same as
         * [RouteServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: RouteListParams = RouteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RouteListResponse>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<RouteListResponse> =
            list(RouteListParams.none(), requestOptions)
    }
}
