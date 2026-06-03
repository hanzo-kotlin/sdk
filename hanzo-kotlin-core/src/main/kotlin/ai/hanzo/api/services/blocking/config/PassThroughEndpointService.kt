// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.config

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointCreateParams
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointCreateResponse
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointDeleteParams
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointListParams
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointResponse
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointUpdateParams
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointUpdateResponse
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughGenericEndpoint
import com.google.errorprone.annotations.MustBeClosed

interface PassThroughEndpointService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PassThroughEndpointService

    /** Create new pass-through endpoint */
    fun create(
        params: PassThroughEndpointCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PassThroughEndpointCreateResponse

    /** @see create */
    fun create(
        passThroughGenericEndpoint: PassThroughGenericEndpoint,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PassThroughEndpointCreateResponse =
        create(
            PassThroughEndpointCreateParams.builder()
                .passThroughGenericEndpoint(passThroughGenericEndpoint)
                .build(),
            requestOptions,
        )

    /** Update a pass-through endpoint */
    fun update(
        endpointId: String,
        params: PassThroughEndpointUpdateParams = PassThroughEndpointUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PassThroughEndpointUpdateResponse =
        update(params.toBuilder().endpointId(endpointId).build(), requestOptions)

    /** @see update */
    fun update(
        params: PassThroughEndpointUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PassThroughEndpointUpdateResponse

    /** @see update */
    fun update(
        endpointId: String,
        requestOptions: RequestOptions,
    ): PassThroughEndpointUpdateResponse =
        update(endpointId, PassThroughEndpointUpdateParams.none(), requestOptions)

    /**
     * GET configured pass through endpoint.
     *
     * If no endpoint_id given, return all configured endpoints.
     */
    fun list(
        params: PassThroughEndpointListParams = PassThroughEndpointListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PassThroughEndpointResponse

    /** @see list */
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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PassThroughEndpointService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /config/pass_through_endpoint`, but is otherwise
         * the same as [PassThroughEndpointService.create].
         */
        @MustBeClosed
        fun create(
            params: PassThroughEndpointCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PassThroughEndpointCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            passThroughGenericEndpoint: PassThroughGenericEndpoint,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PassThroughEndpointCreateResponse> =
            create(
                PassThroughEndpointCreateParams.builder()
                    .passThroughGenericEndpoint(passThroughGenericEndpoint)
                    .build(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /config/pass_through_endpoint/{endpoint_id}`, but
         * is otherwise the same as [PassThroughEndpointService.update].
         */
        @MustBeClosed
        fun update(
            endpointId: String,
            params: PassThroughEndpointUpdateParams = PassThroughEndpointUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PassThroughEndpointUpdateResponse> =
            update(params.toBuilder().endpointId(endpointId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: PassThroughEndpointUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PassThroughEndpointUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            endpointId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PassThroughEndpointUpdateResponse> =
            update(endpointId, PassThroughEndpointUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /config/pass_through_endpoint`, but is otherwise the
         * same as [PassThroughEndpointService.list].
         */
        @MustBeClosed
        fun list(
            params: PassThroughEndpointListParams = PassThroughEndpointListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PassThroughEndpointResponse>

        /** @see list */
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
