// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.hanzo_ai.api.services.blocking.finetuning.JobService

interface FineTuningService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun jobs(): JobService

    /** A view of [FineTuningService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun jobs(): JobService.WithRawResponse
    }
}
