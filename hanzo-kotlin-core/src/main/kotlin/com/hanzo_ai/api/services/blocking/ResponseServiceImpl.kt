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
import com.hanzo_ai.api.models.responses.ResponseCreateParams
import com.hanzo_ai.api.models.responses.ResponseCreateResponse
import com.hanzo_ai.api.models.responses.ResponseDeleteParams
import com.hanzo_ai.api.models.responses.ResponseDeleteResponse
import com.hanzo_ai.api.models.responses.ResponseRetrieveParams
import com.hanzo_ai.api.models.responses.ResponseRetrieveResponse
import com.hanzo_ai.api.services.blocking.responses.InputItemService
import com.hanzo_ai.api.services.blocking.responses.InputItemServiceImpl

class ResponseServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ResponseService {

    private val withRawResponse: ResponseService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val inputItems: InputItemService by lazy { InputItemServiceImpl(clientOptions) }

    override fun withRawResponse(): ResponseService.WithRawResponse = withRawResponse

    override fun inputItems(): InputItemService = inputItems

    override fun create(
        params: ResponseCreateParams,
        requestOptions: RequestOptions,
    ): ResponseCreateResponse =
        // post /v1/responses
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ResponseRetrieveParams,
        requestOptions: RequestOptions,
    ): ResponseRetrieveResponse =
        // get /v1/responses/{response_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun delete(
        params: ResponseDeleteParams,
        requestOptions: RequestOptions,
    ): ResponseDeleteResponse =
        // delete /v1/responses/{response_id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ResponseService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val inputItems: InputItemService.WithRawResponse by lazy {
            InputItemServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun inputItems(): InputItemService.WithRawResponse = inputItems

        private val createHandler: Handler<ResponseCreateResponse> =
            jsonHandler<ResponseCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: ResponseCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResponseCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "responses")
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

        private val retrieveHandler: Handler<ResponseRetrieveResponse> =
            jsonHandler<ResponseRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: ResponseRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResponseRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "responses", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val deleteHandler: Handler<ResponseDeleteResponse> =
            jsonHandler<ResponseDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: ResponseDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResponseDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "responses", params._pathParam(0))
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
    }
}
