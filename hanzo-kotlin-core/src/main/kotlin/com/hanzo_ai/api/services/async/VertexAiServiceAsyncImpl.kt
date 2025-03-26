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
import com.hanzo_ai.api.models.vertexai.VertexAiCreateParams
import com.hanzo_ai.api.models.vertexai.VertexAiCreateResponse
import com.hanzo_ai.api.models.vertexai.VertexAiDeleteParams
import com.hanzo_ai.api.models.vertexai.VertexAiDeleteResponse
import com.hanzo_ai.api.models.vertexai.VertexAiPatchParams
import com.hanzo_ai.api.models.vertexai.VertexAiPatchResponse
import com.hanzo_ai.api.models.vertexai.VertexAiRetrieveParams
import com.hanzo_ai.api.models.vertexai.VertexAiRetrieveResponse
import com.hanzo_ai.api.models.vertexai.VertexAiUpdateParams
import com.hanzo_ai.api.models.vertexai.VertexAiUpdateResponse

class VertexAiServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    VertexAiServiceAsync {

    private val withRawResponse: VertexAiServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VertexAiServiceAsync.WithRawResponse = withRawResponse

    override suspend fun create(
        params: VertexAiCreateParams,
        requestOptions: RequestOptions,
    ): VertexAiCreateResponse =
        // post /vertex_ai/{endpoint}
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: VertexAiRetrieveParams,
        requestOptions: RequestOptions,
    ): VertexAiRetrieveResponse =
        // get /vertex_ai/{endpoint}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: VertexAiUpdateParams,
        requestOptions: RequestOptions,
    ): VertexAiUpdateResponse =
        // put /vertex_ai/{endpoint}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun delete(
        params: VertexAiDeleteParams,
        requestOptions: RequestOptions,
    ): VertexAiDeleteResponse =
        // delete /vertex_ai/{endpoint}
        withRawResponse().delete(params, requestOptions).parse()

    override suspend fun patch(
        params: VertexAiPatchParams,
        requestOptions: RequestOptions,
    ): VertexAiPatchResponse =
        // patch /vertex_ai/{endpoint}
        withRawResponse().patch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VertexAiServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<VertexAiCreateResponse> =
            jsonHandler<VertexAiCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun create(
            params: VertexAiCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VertexAiCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("vertex_ai", params._pathParam(0))
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

        private val retrieveHandler: Handler<VertexAiRetrieveResponse> =
            jsonHandler<VertexAiRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: VertexAiRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VertexAiRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("vertex_ai", params._pathParam(0))
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

        private val updateHandler: Handler<VertexAiUpdateResponse> =
            jsonHandler<VertexAiUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun update(
            params: VertexAiUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VertexAiUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("vertex_ai", params._pathParam(0))
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

        private val deleteHandler: Handler<VertexAiDeleteResponse> =
            jsonHandler<VertexAiDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun delete(
            params: VertexAiDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VertexAiDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("vertex_ai", params._pathParam(0))
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

        private val patchHandler: Handler<VertexAiPatchResponse> =
            jsonHandler<VertexAiPatchResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun patch(
            params: VertexAiPatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VertexAiPatchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("vertex_ai", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { patchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
