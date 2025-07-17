// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.services.async.finetuning.JobServiceAsync
import ai.hanzo.api.services.async.finetuning.JobServiceAsyncImpl

class FineTuningServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FineTuningServiceAsync {

    private val withRawResponse: FineTuningServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val jobs: JobServiceAsync by lazy { JobServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): FineTuningServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FineTuningServiceAsync =
        FineTuningServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun jobs(): JobServiceAsync = jobs

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FineTuningServiceAsync.WithRawResponse {

        private val jobs: JobServiceAsync.WithRawResponse by lazy {
            JobServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): FineTuningServiceAsync.WithRawResponse =
            FineTuningServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun jobs(): JobServiceAsync.WithRawResponse = jobs
    }
}
