// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.services.blocking.config.PassThroughEndpointService
import ai.hanzo.api.services.blocking.config.PassThroughEndpointServiceImpl

class ConfigServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ConfigService {

    private val withRawResponse: ConfigService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val passThroughEndpoint: PassThroughEndpointService by lazy {
        PassThroughEndpointServiceImpl(clientOptions)
    }

    override fun withRawResponse(): ConfigService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ConfigService =
        ConfigServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun passThroughEndpoint(): PassThroughEndpointService = passThroughEndpoint

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConfigService.WithRawResponse {

        private val passThroughEndpoint: PassThroughEndpointService.WithRawResponse by lazy {
            PassThroughEndpointServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ConfigService.WithRawResponse =
            ConfigServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun passThroughEndpoint(): PassThroughEndpointService.WithRawResponse =
            passThroughEndpoint
    }
}
