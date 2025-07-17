// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.handlers.errorHandler
import ai.hanzo.api.core.handlers.jsonHandler
import ai.hanzo.api.core.handlers.withErrorHandler
import ai.hanzo.api.core.http.HttpMethod
import ai.hanzo.api.core.http.HttpRequest
import ai.hanzo.api.core.http.HttpResponse.Handler
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.core.http.json
import ai.hanzo.api.core.http.parseable
import ai.hanzo.api.core.prepare
import ai.hanzo.api.models.rerank.RerankCreateParams
import ai.hanzo.api.models.rerank.RerankCreateResponse
import ai.hanzo.api.models.rerank.RerankCreateV1Params
import ai.hanzo.api.models.rerank.RerankCreateV1Response
import ai.hanzo.api.models.rerank.RerankCreateV2Params
import ai.hanzo.api.models.rerank.RerankCreateV2Response

class RerankServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RerankService {

    private val withRawResponse: RerankService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RerankService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RerankService =
        RerankServiceImpl(clientOptions.toBuilder().apply(modifier).build())

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

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): RerankService.WithRawResponse =
            RerankServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

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
                    .baseUrl(clientOptions.baseUrl())
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
                    .baseUrl(clientOptions.baseUrl())
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
                    .baseUrl(clientOptions.baseUrl())
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
