// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking.key

import com.hanzo_ai.api.core.ClientOptions

class RegenerateServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RegenerateService {

    private val withRawResponse: RegenerateService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RegenerateService.WithRawResponse = withRawResponse

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RegenerateService.WithRawResponse
}
