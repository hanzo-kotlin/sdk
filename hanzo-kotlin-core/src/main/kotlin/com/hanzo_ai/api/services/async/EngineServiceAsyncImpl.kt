// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.hanzo_ai.api.core.ClientOptions
import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.handlers.errorHandler
import com.hanzo_ai.api.core.handlers.jsonHandler
import com.hanzo_ai.api.core.handlers.withErrorHandler
import com.hanzo_ai.api.core.http.HttpMethod
import com.hanzo_ai.api.core.http.HttpRequest
import com.hanzo_ai.api.core.http.HttpResponse.Handler
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.core.http.json
import com.hanzo_ai.api.core.http.parseable
import com.hanzo_ai.api.core.prepareAsync
import com.hanzo_ai.api.models.engines.EngineCompleteParams
import com.hanzo_ai.api.models.engines.EngineCompleteResponse
import com.hanzo_ai.api.models.engines.EngineEmbedParams
import com.hanzo_ai.api.models.engines.EngineEmbedResponse
import com.hanzo_ai.api.services.async.engines.ChatServiceAsync
import com.hanzo_ai.api.services.async.engines.ChatServiceAsyncImpl

class EngineServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EngineServiceAsync {

    private val withRawResponse: EngineServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val chat: ChatServiceAsync by lazy { ChatServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): EngineServiceAsync.WithRawResponse = withRawResponse

    override fun chat(): ChatServiceAsync = chat

    override suspend fun complete(
        params: EngineCompleteParams,
        requestOptions: RequestOptions,
    ): EngineCompleteResponse =
        // post /engines/{model}/completions
        withRawResponse().complete(params, requestOptions).parse()

    override suspend fun embed(
        params: EngineEmbedParams,
        requestOptions: RequestOptions,
    ): EngineEmbedResponse =
        // post /engines/{model}/embeddings
        withRawResponse().embed(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EngineServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val chat: ChatServiceAsync.WithRawResponse by lazy {
            ChatServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun chat(): ChatServiceAsync.WithRawResponse = chat

        private val completeHandler: Handler<EngineCompleteResponse> =
            jsonHandler<EngineCompleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun complete(
            params: EngineCompleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EngineCompleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("engines", params._pathParam(0), "completions")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { completeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val embedHandler: Handler<EngineEmbedResponse> =
            jsonHandler<EngineEmbedResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun embed(
            params: EngineEmbedParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EngineEmbedResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("engines", params._pathParam(0), "embeddings")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { embedHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
