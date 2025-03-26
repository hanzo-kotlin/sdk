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
import com.hanzo_ai.api.models.utils.UtilGetSupportedOpenAIParamsParams
import com.hanzo_ai.api.models.utils.UtilGetSupportedOpenAIParamsResponse
import com.hanzo_ai.api.models.utils.UtilTokenCounterParams
import com.hanzo_ai.api.models.utils.UtilTokenCounterResponse
import com.hanzo_ai.api.models.utils.UtilTransformRequestParams
import com.hanzo_ai.api.models.utils.UtilTransformRequestResponse

class UtilServiceImpl internal constructor(private val clientOptions: ClientOptions) : UtilService {

    private val withRawResponse: UtilService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UtilService.WithRawResponse = withRawResponse

    override fun getSupportedOpenAIParams(
        params: UtilGetSupportedOpenAIParamsParams,
        requestOptions: RequestOptions,
    ): UtilGetSupportedOpenAIParamsResponse =
        // get /utils/supported_openai_params
        withRawResponse().getSupportedOpenAIParams(params, requestOptions).parse()

    override fun tokenCounter(
        params: UtilTokenCounterParams,
        requestOptions: RequestOptions,
    ): UtilTokenCounterResponse =
        // post /utils/token_counter
        withRawResponse().tokenCounter(params, requestOptions).parse()

    override fun transformRequest(
        params: UtilTransformRequestParams,
        requestOptions: RequestOptions,
    ): UtilTransformRequestResponse =
        // post /utils/transform_request
        withRawResponse().transformRequest(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UtilService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val getSupportedOpenAIParamsHandler: Handler<UtilGetSupportedOpenAIParamsResponse> =
            jsonHandler<UtilGetSupportedOpenAIParamsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun getSupportedOpenAIParams(
            params: UtilGetSupportedOpenAIParamsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UtilGetSupportedOpenAIParamsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("utils", "supported_openai_params")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { getSupportedOpenAIParamsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val tokenCounterHandler: Handler<UtilTokenCounterResponse> =
            jsonHandler<UtilTokenCounterResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun tokenCounter(
            params: UtilTokenCounterParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UtilTokenCounterResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("utils", "token_counter")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { tokenCounterHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val transformRequestHandler: Handler<UtilTransformRequestResponse> =
            jsonHandler<UtilTransformRequestResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun transformRequest(
            params: UtilTransformRequestParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UtilTransformRequestResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("utils", "transform_request")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { transformRequestHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
