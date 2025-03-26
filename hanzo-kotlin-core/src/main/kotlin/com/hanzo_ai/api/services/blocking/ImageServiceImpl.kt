// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.hanzo_ai.api.core.ClientOptions
import com.hanzo_ai.api.services.blocking.images.GenerationService
import com.hanzo_ai.api.services.blocking.images.GenerationServiceImpl

class ImageServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ImageService {

    private val withRawResponse: ImageService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val generations: GenerationService by lazy { GenerationServiceImpl(clientOptions) }

    override fun withRawResponse(): ImageService.WithRawResponse = withRawResponse

    override fun generations(): GenerationService = generations

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ImageService.WithRawResponse {

        private val generations: GenerationService.WithRawResponse by lazy {
            GenerationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun generations(): GenerationService.WithRawResponse = generations
    }
}
