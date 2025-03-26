// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.openai

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
import com.hanzo_ai.api.models.openai.deployments.DeploymentCompleteParams
import com.hanzo_ai.api.models.openai.deployments.DeploymentCompleteResponse
import com.hanzo_ai.api.models.openai.deployments.DeploymentEmbedParams
import com.hanzo_ai.api.models.openai.deployments.DeploymentEmbedResponse
import com.hanzo_ai.api.services.async.openai.deployments.ChatServiceAsync
import com.hanzo_ai.api.services.async.openai.deployments.ChatServiceAsyncImpl

class DeploymentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DeploymentServiceAsync {

    private val withRawResponse: DeploymentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val chat: ChatServiceAsync by lazy { ChatServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): DeploymentServiceAsync.WithRawResponse = withRawResponse

    override fun chat(): ChatServiceAsync = chat

    override suspend fun complete(
        params: DeploymentCompleteParams,
        requestOptions: RequestOptions,
    ): DeploymentCompleteResponse =
        // post /openai/deployments/{model}/completions
        withRawResponse().complete(params, requestOptions).parse()

    override suspend fun embed(
        params: DeploymentEmbedParams,
        requestOptions: RequestOptions,
    ): DeploymentEmbedResponse =
        // post /openai/deployments/{model}/embeddings
        withRawResponse().embed(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DeploymentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val chat: ChatServiceAsync.WithRawResponse by lazy {
            ChatServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun chat(): ChatServiceAsync.WithRawResponse = chat

        private val completeHandler: Handler<DeploymentCompleteResponse> =
            jsonHandler<DeploymentCompleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun complete(
            params: DeploymentCompleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeploymentCompleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("openai", "deployments", params._pathParam(0), "completions")
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

        private val embedHandler: Handler<DeploymentEmbedResponse> =
            jsonHandler<DeploymentEmbedResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun embed(
            params: DeploymentEmbedParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeploymentEmbedResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("openai", "deployments", params._pathParam(0), "embeddings")
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
