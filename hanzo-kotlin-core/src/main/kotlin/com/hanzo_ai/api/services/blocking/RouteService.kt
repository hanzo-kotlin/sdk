// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.routes.RouteListParams
import com.hanzo_ai.api.models.routes.RouteListResponse

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
