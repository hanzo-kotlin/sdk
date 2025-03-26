// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.hanzo_ai.api.core.ClientOptions
import com.hanzo_ai.api.services.blocking.chat.CompletionService
import com.hanzo_ai.api.services.blocking.chat.CompletionServiceImpl

class ChatServiceImpl internal constructor(private val clientOptions: ClientOptions) : ChatService {

    private val withRawResponse: ChatService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val completions: CompletionService by lazy { CompletionServiceImpl(clientOptions) }

    override fun withRawResponse(): ChatService.WithRawResponse = withRawResponse

    override fun completions(): CompletionService = completions

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ChatService.WithRawResponse {

        private val completions: CompletionService.WithRawResponse by lazy {
            CompletionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun completions(): CompletionService.WithRawResponse = completions
    }
}
