// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.key

import ai.hanzo.api.core.ClientOptions

class RegenerateServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RegenerateService {

    private val withRawResponse: RegenerateService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RegenerateService.WithRawResponse = withRawResponse

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RegenerateService.WithRawResponse
}
