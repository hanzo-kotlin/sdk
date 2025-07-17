// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.services.blocking.images.GenerationService
import ai.hanzo.api.services.blocking.images.GenerationServiceImpl

class ImageServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ImageService {

    private val withRawResponse: ImageService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val generations: GenerationService by lazy { GenerationServiceImpl(clientOptions) }

    override fun withRawResponse(): ImageService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ImageService =
        ImageServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun generations(): GenerationService = generations

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ImageService.WithRawResponse {

        private val generations: GenerationService.WithRawResponse by lazy {
            GenerationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ImageService.WithRawResponse =
            ImageServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun generations(): GenerationService.WithRawResponse = generations
    }
}
