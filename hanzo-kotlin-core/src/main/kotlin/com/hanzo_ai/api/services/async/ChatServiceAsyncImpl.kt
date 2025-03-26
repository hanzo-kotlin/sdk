// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.hanzo_ai.api.core.ClientOptions
import com.hanzo_ai.api.services.async.chat.CompletionServiceAsync
import com.hanzo_ai.api.services.async.chat.CompletionServiceAsyncImpl

class ChatServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ChatServiceAsync {

    private val withRawResponse: ChatServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val completions: CompletionServiceAsync by lazy {
        CompletionServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): ChatServiceAsync.WithRawResponse = withRawResponse

    override fun completions(): CompletionServiceAsync = completions

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ChatServiceAsync.WithRawResponse {

        private val completions: CompletionServiceAsync.WithRawResponse by lazy {
            CompletionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun completions(): CompletionServiceAsync.WithRawResponse = completions
    }
}
