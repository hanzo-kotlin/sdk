// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
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
import ai.hanzo.api.core.prepare
import ai.hanzo.api.models.cache.CacheDeleteParams
import ai.hanzo.api.models.cache.CacheDeleteResponse
import ai.hanzo.api.models.cache.CacheFlushAllParams
import ai.hanzo.api.models.cache.CacheFlushAllResponse
import ai.hanzo.api.models.cache.CachePingParams
import ai.hanzo.api.models.cache.CachePingResponse
import ai.hanzo.api.services.blocking.cache.RediService
import ai.hanzo.api.services.blocking.cache.RediServiceImpl

class CacheServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CacheService {

    private val withRawResponse: CacheService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val redis: RediService by lazy { RediServiceImpl(clientOptions) }

    override fun withRawResponse(): CacheService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CacheService =
        CacheServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun redis(): RediService = redis

    override fun delete(
        params: CacheDeleteParams,
        requestOptions: RequestOptions,
    ): CacheDeleteResponse =
        // post /cache/delete
        withRawResponse().delete(params, requestOptions).parse()

    override fun flushAll(
        params: CacheFlushAllParams,
        requestOptions: RequestOptions,
    ): CacheFlushAllResponse =
        // post /cache/flushall
        withRawResponse().flushAll(params, requestOptions).parse()

    override fun ping(params: CachePingParams, requestOptions: RequestOptions): CachePingResponse =
        // get /cache/ping
        withRawResponse().ping(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CacheService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val redis: RediService.WithRawResponse by lazy {
            RediServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CacheService.WithRawResponse =
            CacheServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun redis(): RediService.WithRawResponse = redis

        private val deleteHandler: Handler<CacheDeleteResponse> =
            jsonHandler<CacheDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: CacheDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CacheDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cache", "delete")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val flushAllHandler: Handler<CacheFlushAllResponse> =
            jsonHandler<CacheFlushAllResponse>(clientOptions.jsonMapper)

        override fun flushAll(
            params: CacheFlushAllParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CacheFlushAllResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cache", "flushall")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { flushAllHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val pingHandler: Handler<CachePingResponse> =
            jsonHandler<CachePingResponse>(clientOptions.jsonMapper)

        override fun ping(
            params: CachePingParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CachePingResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cache", "ping")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { pingHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
