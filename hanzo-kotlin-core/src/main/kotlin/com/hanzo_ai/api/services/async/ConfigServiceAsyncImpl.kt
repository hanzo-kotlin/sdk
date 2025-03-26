// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.hanzo_ai.api.core.ClientOptions
import com.hanzo_ai.api.services.async.config.PassThroughEndpointServiceAsync
import com.hanzo_ai.api.services.async.config.PassThroughEndpointServiceAsyncImpl

class ConfigServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ConfigServiceAsync {

    private val withRawResponse: ConfigServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val passThroughEndpoint: PassThroughEndpointServiceAsync by lazy {
        PassThroughEndpointServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): ConfigServiceAsync.WithRawResponse = withRawResponse

    override fun passThroughEndpoint(): PassThroughEndpointServiceAsync = passThroughEndpoint

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConfigServiceAsync.WithRawResponse {

        private val passThroughEndpoint: PassThroughEndpointServiceAsync.WithRawResponse by lazy {
            PassThroughEndpointServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun passThroughEndpoint(): PassThroughEndpointServiceAsync.WithRawResponse =
            passThroughEndpoint
    }
}
