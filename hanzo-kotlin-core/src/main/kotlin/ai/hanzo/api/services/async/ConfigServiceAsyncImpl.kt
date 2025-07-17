// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.services.async.config.PassThroughEndpointServiceAsync
import ai.hanzo.api.services.async.config.PassThroughEndpointServiceAsyncImpl

class ConfigServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ConfigServiceAsync {

    private val withRawResponse: ConfigServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val passThroughEndpoint: PassThroughEndpointServiceAsync by lazy {
        PassThroughEndpointServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): ConfigServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ConfigServiceAsync =
        ConfigServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun passThroughEndpoint(): PassThroughEndpointServiceAsync = passThroughEndpoint

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConfigServiceAsync.WithRawResponse {

        private val passThroughEndpoint: PassThroughEndpointServiceAsync.WithRawResponse by lazy {
            PassThroughEndpointServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ConfigServiceAsync.WithRawResponse =
            ConfigServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun passThroughEndpoint(): PassThroughEndpointServiceAsync.WithRawResponse =
            passThroughEndpoint
    }
}
