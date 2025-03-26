// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.hanzo_ai.api.core.ClientOptions
import com.hanzo_ai.api.services.async.finetuning.JobServiceAsync
import com.hanzo_ai.api.services.async.finetuning.JobServiceAsyncImpl

class FineTuningServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FineTuningServiceAsync {

    private val withRawResponse: FineTuningServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val jobs: JobServiceAsync by lazy { JobServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): FineTuningServiceAsync.WithRawResponse = withRawResponse

    override fun jobs(): JobServiceAsync = jobs

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FineTuningServiceAsync.WithRawResponse {

        private val jobs: JobServiceAsync.WithRawResponse by lazy {
            JobServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun jobs(): JobServiceAsync.WithRawResponse = jobs
    }
}
