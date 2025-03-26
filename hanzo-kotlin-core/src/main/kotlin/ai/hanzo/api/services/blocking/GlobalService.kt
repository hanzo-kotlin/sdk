// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.services.blocking.global.SpendService

interface GlobalService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun spend(): SpendService

    /** A view of [GlobalService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun spend(): SpendService.WithRawResponse
    }
}
