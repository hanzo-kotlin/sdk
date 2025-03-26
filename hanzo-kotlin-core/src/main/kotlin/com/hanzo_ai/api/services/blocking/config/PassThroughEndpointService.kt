// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking.config

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointCreateParams
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointCreateResponse
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointDeleteParams
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointListParams
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointResponse
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointUpdateParams
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointUpdateResponse

interface PassThroughEndpointService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create new pass-through endpoint */
    fun create(
        params: PassThroughEndpointCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PassThroughEndpointCreateResponse

    /** Update a pass-through endpoint */
    fun update(
        params: PassThroughEndpointUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PassThroughEndpointUpdateResponse

    /**
     * GET configured pass through endpoint.
     *
     * If no endpoint_id given, return all configured endpoints.
     */
    fun list(
        params: PassThroughEndpointListParams = PassThroughEndpointListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PassThroughEndpointResponse

    /** @see [list] */
    fun list(requestOptions: RequestOptions): PassThroughEndpointResponse =
        list(PassThroughEndpointListParams.none(), requestOptions)

    /**
     * Delete a pass-through endpoint
     *
     * Returns - the deleted endpoint
     */
    fun delete(
        params: PassThroughEndpointDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PassThroughEndpointResponse

    /**
     * A view of [PassThroughEndpointService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /config/pass_through_endpoint`, but is otherwise
         * the same as [PassThroughEndpointService.create].
         */
        @MustBeClosed
        fun create(
            params: PassThroughEndpointCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PassThroughEndpointCreateResponse>

        /**
         * Returns a raw HTTP response for `post /config/pass_through_endpoint/{endpoint_id}`, but
         * is otherwise the same as [PassThroughEndpointService.update].
         */
        @MustBeClosed
        fun update(
            params: PassThroughEndpointUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PassThroughEndpointUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /config/pass_through_endpoint`, but is otherwise the
         * same as [PassThroughEndpointService.list].
         */
        @MustBeClosed
        fun list(
            params: PassThroughEndpointListParams = PassThroughEndpointListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PassThroughEndpointResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PassThroughEndpointResponse> =
            list(PassThroughEndpointListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /config/pass_through_endpoint`, but is otherwise
         * the same as [PassThroughEndpointService.delete].
         */
        @MustBeClosed
        fun delete(
            params: PassThroughEndpointDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PassThroughEndpointResponse>
    }
}
