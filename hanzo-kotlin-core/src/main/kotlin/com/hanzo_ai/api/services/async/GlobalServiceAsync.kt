// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.hanzo_ai.api.services.async.global.SpendServiceAsync

interface GlobalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun spend(): SpendServiceAsync

    /**
     * A view of [GlobalServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun spend(): SpendServiceAsync.WithRawResponse
    }
}
