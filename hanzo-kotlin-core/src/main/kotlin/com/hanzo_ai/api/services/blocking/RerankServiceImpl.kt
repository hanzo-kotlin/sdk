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
import com.hanzo_ai.api.models.rerank.RerankCreateParams
import com.hanzo_ai.api.models.rerank.RerankCreateResponse
import com.hanzo_ai.api.models.rerank.RerankCreateV1Params
import com.hanzo_ai.api.models.rerank.RerankCreateV1Response
import com.hanzo_ai.api.models.rerank.RerankCreateV2Params
import com.hanzo_ai.api.models.rerank.RerankCreateV2Response

class RerankServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RerankService {

    private val withRawResponse: RerankService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RerankService.WithRawResponse = withRawResponse

    override fun create(
        params: RerankCreateParams,
        requestOptions: RequestOptions,
    ): RerankCreateResponse =
        // post /rerank
        withRawResponse().create(params, requestOptions).parse()

    override fun createV1(
        params: RerankCreateV1Params,
        requestOptions: RequestOptions,
    ): RerankCreateV1Response =
        // post /v1/rerank
        withRawResponse().createV1(params, requestOptions).parse()

    override fun createV2(
        params: RerankCreateV2Params,
        requestOptions: RequestOptions,
    ): RerankCreateV2Response =
        // post /v2/rerank
        withRawResponse().createV2(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RerankService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<RerankCreateResponse> =
            jsonHandler<RerankCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: RerankCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RerankCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("rerank")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createV1Handler: Handler<RerankCreateV1Response> =
            jsonHandler<RerankCreateV1Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun createV1(
            params: RerankCreateV1Params,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RerankCreateV1Response> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "rerank")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createV1Handler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createV2Handler: Handler<RerankCreateV2Response> =
            jsonHandler<RerankCreateV2Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun createV2(
            params: RerankCreateV2Params,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RerankCreateV2Response> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v2", "rerank")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createV2Handler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
