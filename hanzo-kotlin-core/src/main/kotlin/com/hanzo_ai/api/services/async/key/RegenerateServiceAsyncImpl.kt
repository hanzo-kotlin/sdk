// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.key

import com.hanzo_ai.api.core.ClientOptions

class RegenerateServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RegenerateServiceAsync {

    private val withRawResponse: RegenerateServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RegenerateServiceAsync.WithRawResponse = withRawResponse

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RegenerateServiceAsync.WithRawResponse
}
