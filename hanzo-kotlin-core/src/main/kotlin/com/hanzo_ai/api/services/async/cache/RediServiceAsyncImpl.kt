// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.cache

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
import com.hanzo_ai.api.core.http.parseable
import com.hanzo_ai.api.core.prepareAsync
import com.hanzo_ai.api.models.cache.redis.RediRetrieveInfoParams
import com.hanzo_ai.api.models.cache.redis.RediRetrieveInfoResponse

class RediServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RediServiceAsync {

    private val withRawResponse: RediServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RediServiceAsync.WithRawResponse = withRawResponse

    override suspend fun retrieveInfo(
        params: RediRetrieveInfoParams,
        requestOptions: RequestOptions,
    ): RediRetrieveInfoResponse =
        // get /cache/redis/info
        withRawResponse().retrieveInfo(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RediServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveInfoHandler: Handler<RediRetrieveInfoResponse> =
            jsonHandler<RediRetrieveInfoResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieveInfo(
            params: RediRetrieveInfoParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RediRetrieveInfoResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("cache", "redis", "info")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveInfoHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
