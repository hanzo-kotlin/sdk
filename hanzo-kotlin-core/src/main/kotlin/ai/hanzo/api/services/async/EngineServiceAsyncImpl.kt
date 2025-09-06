// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.checkRequired
import ai.hanzo.api.core.handlers.errorBodyHandler
import ai.hanzo.api.core.handlers.errorHandler
import ai.hanzo.api.core.handlers.jsonHandler
import ai.hanzo.api.core.http.HttpMethod
import ai.hanzo.api.core.http.HttpRequest
import ai.hanzo.api.core.http.HttpResponse
import ai.hanzo.api.core.http.HttpResponse.Handler
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.core.http.json
import ai.hanzo.api.core.http.parseable
import ai.hanzo.api.core.prepareAsync
import ai.hanzo.api.models.engines.EngineCompleteParams
import ai.hanzo.api.models.engines.EngineCompleteResponse
import ai.hanzo.api.models.engines.EngineEmbedParams
import ai.hanzo.api.models.engines.EngineEmbedResponse
import ai.hanzo.api.services.async.engines.ChatServiceAsync
import ai.hanzo.api.services.async.engines.ChatServiceAsyncImpl

class EngineServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EngineServiceAsync {

    private val withRawResponse: EngineServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val chat: ChatServiceAsync by lazy { ChatServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): EngineServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EngineServiceAsync =
        EngineServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

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

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val chat: ChatServiceAsync.WithRawResponse by lazy {
            ChatServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EngineServiceAsync.WithRawResponse =
            EngineServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun chat(): ChatServiceAsync.WithRawResponse = chat

        private val completeHandler: Handler<EngineCompleteResponse> =
            jsonHandler<EngineCompleteResponse>(clientOptions.jsonMapper)

        override suspend fun complete(
            params: EngineCompleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EngineCompleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("model", params.model())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("engines", params._pathParam(0), "completions")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
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

        override suspend fun embed(
            params: EngineEmbedParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EngineEmbedResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("model", params.model())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("engines", params._pathParam(0), "embeddings")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
