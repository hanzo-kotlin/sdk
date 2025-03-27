// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.services.async.config.PassThroughEndpointServiceAsync

interface ConfigServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun passThroughEndpoint(): PassThroughEndpointServiceAsync

    /**
     * A view of [ConfigServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun passThroughEndpoint(): PassThroughEndpointServiceAsync.WithRawResponse
    }
}
