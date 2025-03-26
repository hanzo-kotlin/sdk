// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.hanzo_ai.api.core.ClientOptions
import com.hanzo_ai.api.services.async.global.SpendServiceAsync
import com.hanzo_ai.api.services.async.global.SpendServiceAsyncImpl

class GlobalServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    GlobalServiceAsync {

    private val withRawResponse: GlobalServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val spend: SpendServiceAsync by lazy { SpendServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): GlobalServiceAsync.WithRawResponse = withRawResponse

    override fun spend(): SpendServiceAsync = spend

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GlobalServiceAsync.WithRawResponse {

        private val spend: SpendServiceAsync.WithRawResponse by lazy {
            SpendServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun spend(): SpendServiceAsync.WithRawResponse = spend
    }
}
