// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.routes.RouteListParams
import ai.hanzo.api.models.routes.RouteListResponse
import com.google.errorprone.annotations.MustBeClosed

interface RouteService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get a list of available routes in the FastAPI application. */
    fun list(
        params: RouteListParams = RouteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RouteListResponse

    /** @see [list] */
    fun list(requestOptions: RequestOptions): RouteListResponse =
        list(RouteListParams.none(), requestOptions)

    /** A view of [RouteService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /routes`, but is otherwise the same as
         * [RouteService.list].
         */
        @MustBeClosed
        fun list(
            params: RouteListParams = RouteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RouteListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<RouteListResponse> =
            list(RouteListParams.none(), requestOptions)
    }
}
