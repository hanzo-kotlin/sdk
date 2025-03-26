// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.services.blocking.config.PassThroughEndpointService

interface ConfigService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun passThroughEndpoint(): PassThroughEndpointService

    /** A view of [ConfigService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun passThroughEndpoint(): PassThroughEndpointService.WithRawResponse
    }
}
