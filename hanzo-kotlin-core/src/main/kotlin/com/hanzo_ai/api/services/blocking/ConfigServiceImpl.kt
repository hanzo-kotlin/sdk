// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.hanzo_ai.api.core.ClientOptions
import com.hanzo_ai.api.services.blocking.config.PassThroughEndpointService
import com.hanzo_ai.api.services.blocking.config.PassThroughEndpointServiceImpl

class ConfigServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ConfigService {

    private val withRawResponse: ConfigService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val passThroughEndpoint: PassThroughEndpointService by lazy {
        PassThroughEndpointServiceImpl(clientOptions)
    }

    override fun withRawResponse(): ConfigService.WithRawResponse = withRawResponse

    override fun passThroughEndpoint(): PassThroughEndpointService = passThroughEndpoint

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConfigService.WithRawResponse {

        private val passThroughEndpoint: PassThroughEndpointService.WithRawResponse by lazy {
            PassThroughEndpointServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun passThroughEndpoint(): PassThroughEndpointService.WithRawResponse =
            passThroughEndpoint
    }
}
