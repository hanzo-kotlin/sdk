// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.key

import ai.hanzo.api.core.ClientOptions

class RegenerateServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RegenerateService {

    private val withRawResponse: RegenerateService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RegenerateService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RegenerateService =
        RegenerateServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RegenerateService.WithRawResponse {

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): RegenerateService.WithRawResponse =
            RegenerateServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )
    }
}
