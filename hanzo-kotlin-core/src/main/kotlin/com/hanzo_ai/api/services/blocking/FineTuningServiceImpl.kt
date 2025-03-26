// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.hanzo_ai.api.core.ClientOptions
import com.hanzo_ai.api.services.blocking.finetuning.JobService
import com.hanzo_ai.api.services.blocking.finetuning.JobServiceImpl

class FineTuningServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FineTuningService {

    private val withRawResponse: FineTuningService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val jobs: JobService by lazy { JobServiceImpl(clientOptions) }

    override fun withRawResponse(): FineTuningService.WithRawResponse = withRawResponse

    override fun jobs(): JobService = jobs

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FineTuningService.WithRawResponse {

        private val jobs: JobService.WithRawResponse by lazy {
            JobServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun jobs(): JobService.WithRawResponse = jobs
    }
}
