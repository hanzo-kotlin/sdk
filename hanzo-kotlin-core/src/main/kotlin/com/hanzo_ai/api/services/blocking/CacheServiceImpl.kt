// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

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
import com.hanzo_ai.api.core.prepare
import com.hanzo_ai.api.models.cache.CacheDeleteParams
import com.hanzo_ai.api.models.cache.CacheDeleteResponse
import com.hanzo_ai.api.models.cache.CacheFlushAllParams
import com.hanzo_ai.api.models.cache.CacheFlushAllResponse
import com.hanzo_ai.api.models.cache.CachePingParams
import com.hanzo_ai.api.models.cache.CachePingResponse
import com.hanzo_ai.api.services.blocking.cache.RediService
import com.hanzo_ai.api.services.blocking.cache.RediServiceImpl

class CacheServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CacheService {

    private val withRawResponse: CacheService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val redis: RediService by lazy { RediServiceImpl(clientOptions) }

    override fun withRawResponse(): CacheService.WithRawResponse = withRawResponse

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

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val redis: RediService.WithRawResponse by lazy {
            RediServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun redis(): RediService.WithRawResponse = redis

        private val deleteHandler: Handler<CacheDeleteResponse> =
            jsonHandler<CacheDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: CacheDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CacheDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("cache", "delete")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
                .withErrorHandler(errorHandler)

        override fun flushAll(
            params: CacheFlushAllParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CacheFlushAllResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("cache", "flushall")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
            jsonHandler<CachePingResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun ping(
            params: CachePingParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CachePingResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("cache", "ping")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
