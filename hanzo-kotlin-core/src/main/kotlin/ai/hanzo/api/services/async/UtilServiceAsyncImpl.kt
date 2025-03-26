// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

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
import ai.hanzo.api.core.prepareAsync
import ai.hanzo.api.models.utils.UtilGetSupportedOpenAIParamsParams
import ai.hanzo.api.models.utils.UtilGetSupportedOpenAIParamsResponse
import ai.hanzo.api.models.utils.UtilTokenCounterParams
import ai.hanzo.api.models.utils.UtilTokenCounterResponse
import ai.hanzo.api.models.utils.UtilTransformRequestParams
import ai.hanzo.api.models.utils.UtilTransformRequestResponse

class UtilServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UtilServiceAsync {

    private val withRawResponse: UtilServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UtilServiceAsync.WithRawResponse = withRawResponse

    override suspend fun getSupportedOpenAIParams(
        params: UtilGetSupportedOpenAIParamsParams,
        requestOptions: RequestOptions,
    ): UtilGetSupportedOpenAIParamsResponse =
        // get /utils/supported_openai_params
        withRawResponse().getSupportedOpenAIParams(params, requestOptions).parse()

    override suspend fun tokenCounter(
        params: UtilTokenCounterParams,
        requestOptions: RequestOptions,
    ): UtilTokenCounterResponse =
        // post /utils/token_counter
        withRawResponse().tokenCounter(params, requestOptions).parse()

    override suspend fun transformRequest(
        params: UtilTransformRequestParams,
        requestOptions: RequestOptions,
    ): UtilTransformRequestResponse =
        // post /utils/transform_request
        withRawResponse().transformRequest(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UtilServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val getSupportedOpenAIParamsHandler: Handler<UtilGetSupportedOpenAIParamsResponse> =
            jsonHandler<UtilGetSupportedOpenAIParamsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun getSupportedOpenAIParams(
            params: UtilGetSupportedOpenAIParamsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UtilGetSupportedOpenAIParamsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("utils", "supported_openai_params")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun tokenCounter(
            params: UtilTokenCounterParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UtilTokenCounterResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("utils", "token_counter")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun transformRequest(
            params: UtilTransformRequestParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UtilTransformRequestResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("utils", "transform_request")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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
