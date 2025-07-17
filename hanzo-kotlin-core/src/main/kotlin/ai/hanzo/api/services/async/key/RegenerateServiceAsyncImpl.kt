// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.key

import ai.hanzo.api.core.ClientOptions

class RegenerateServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RegenerateServiceAsync {

    private val withRawResponse: RegenerateServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RegenerateServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RegenerateServiceAsync =
        RegenerateServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RegenerateServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): RegenerateServiceAsync.WithRawResponse =
            RegenerateServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )
    }
}
