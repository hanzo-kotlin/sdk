// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.cache

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
import ai.hanzo.api.core.http.parseable
import ai.hanzo.api.core.prepareAsync
import ai.hanzo.api.models.cache.redis.RediRetrieveInfoParams
import ai.hanzo.api.models.cache.redis.RediRetrieveInfoResponse

class RediServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RediServiceAsync {

    private val withRawResponse: RediServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RediServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RediServiceAsync =
        RediServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieveInfo(
        params: RediRetrieveInfoParams,
        requestOptions: RequestOptions,
    ): RediRetrieveInfoResponse =
        // get /cache/redis/info
        withRawResponse().retrieveInfo(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RediServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): RediServiceAsync.WithRawResponse =
            RediServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveInfoHandler: Handler<RediRetrieveInfoResponse> =
            jsonHandler<RediRetrieveInfoResponse>(clientOptions.jsonMapper)

        override suspend fun retrieveInfo(
            params: RediRetrieveInfoParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RediRetrieveInfoResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cache", "redis", "info")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
