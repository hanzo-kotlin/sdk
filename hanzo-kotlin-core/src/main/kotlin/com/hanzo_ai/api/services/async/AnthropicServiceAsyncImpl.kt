// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

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
import com.hanzo_ai.api.models.anthropic.AnthropicCreateParams
import com.hanzo_ai.api.models.anthropic.AnthropicCreateResponse
import com.hanzo_ai.api.models.anthropic.AnthropicDeleteParams
import com.hanzo_ai.api.models.anthropic.AnthropicDeleteResponse
import com.hanzo_ai.api.models.anthropic.AnthropicModifyParams
import com.hanzo_ai.api.models.anthropic.AnthropicModifyResponse
import com.hanzo_ai.api.models.anthropic.AnthropicRetrieveParams
import com.hanzo_ai.api.models.anthropic.AnthropicRetrieveResponse
import com.hanzo_ai.api.models.anthropic.AnthropicUpdateParams
import com.hanzo_ai.api.models.anthropic.AnthropicUpdateResponse

class AnthropicServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AnthropicServiceAsync {

    private val withRawResponse: AnthropicServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AnthropicServiceAsync.WithRawResponse = withRawResponse

    override suspend fun create(
        params: AnthropicCreateParams,
        requestOptions: RequestOptions,
    ): AnthropicCreateResponse =
        // post /anthropic/{endpoint}
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: AnthropicRetrieveParams,
        requestOptions: RequestOptions,
    ): AnthropicRetrieveResponse =
        // get /anthropic/{endpoint}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: AnthropicUpdateParams,
        requestOptions: RequestOptions,
    ): AnthropicUpdateResponse =
        // put /anthropic/{endpoint}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun delete(
        params: AnthropicDeleteParams,
        requestOptions: RequestOptions,
    ): AnthropicDeleteResponse =
        // delete /anthropic/{endpoint}
        withRawResponse().delete(params, requestOptions).parse()

    override suspend fun modify(
        params: AnthropicModifyParams,
        requestOptions: RequestOptions,
    ): AnthropicModifyResponse =
        // patch /anthropic/{endpoint}
        withRawResponse().modify(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AnthropicServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<AnthropicCreateResponse> =
            jsonHandler<AnthropicCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun create(
            params: AnthropicCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnthropicCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("anthropic", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val retrieveHandler: Handler<AnthropicRetrieveResponse> =
            jsonHandler<AnthropicRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: AnthropicRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnthropicRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("anthropic", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<AnthropicUpdateResponse> =
            jsonHandler<AnthropicUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun update(
            params: AnthropicUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnthropicUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("anthropic", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<AnthropicDeleteResponse> =
            jsonHandler<AnthropicDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun delete(
            params: AnthropicDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnthropicDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("anthropic", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val modifyHandler: Handler<AnthropicModifyResponse> =
            jsonHandler<AnthropicModifyResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun modify(
            params: AnthropicModifyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnthropicModifyResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("anthropic", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { modifyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
