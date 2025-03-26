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
import com.hanzo_ai.api.models.langfuse.LangfuseCreateParams
import com.hanzo_ai.api.models.langfuse.LangfuseCreateResponse
import com.hanzo_ai.api.models.langfuse.LangfuseDeleteParams
import com.hanzo_ai.api.models.langfuse.LangfuseDeleteResponse
import com.hanzo_ai.api.models.langfuse.LangfusePatchParams
import com.hanzo_ai.api.models.langfuse.LangfusePatchResponse
import com.hanzo_ai.api.models.langfuse.LangfuseRetrieveParams
import com.hanzo_ai.api.models.langfuse.LangfuseRetrieveResponse
import com.hanzo_ai.api.models.langfuse.LangfuseUpdateParams
import com.hanzo_ai.api.models.langfuse.LangfuseUpdateResponse

class LangfuseServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LangfuseService {

    private val withRawResponse: LangfuseService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LangfuseService.WithRawResponse = withRawResponse

    override fun create(
        params: LangfuseCreateParams,
        requestOptions: RequestOptions,
    ): LangfuseCreateResponse =
        // post /langfuse/{endpoint}
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: LangfuseRetrieveParams,
        requestOptions: RequestOptions,
    ): LangfuseRetrieveResponse =
        // get /langfuse/{endpoint}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: LangfuseUpdateParams,
        requestOptions: RequestOptions,
    ): LangfuseUpdateResponse =
        // put /langfuse/{endpoint}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(
        params: LangfuseDeleteParams,
        requestOptions: RequestOptions,
    ): LangfuseDeleteResponse =
        // delete /langfuse/{endpoint}
        withRawResponse().delete(params, requestOptions).parse()

    override fun patch(
        params: LangfusePatchParams,
        requestOptions: RequestOptions,
    ): LangfusePatchResponse =
        // patch /langfuse/{endpoint}
        withRawResponse().patch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LangfuseService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<LangfuseCreateResponse> =
            jsonHandler<LangfuseCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: LangfuseCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LangfuseCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("langfuse", params._pathParam(0))
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

        private val retrieveHandler: Handler<LangfuseRetrieveResponse> =
            jsonHandler<LangfuseRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: LangfuseRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LangfuseRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("langfuse", params._pathParam(0))
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

        private val updateHandler: Handler<LangfuseUpdateResponse> =
            jsonHandler<LangfuseUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: LangfuseUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LangfuseUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("langfuse", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val deleteHandler: Handler<LangfuseDeleteResponse> =
            jsonHandler<LangfuseDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: LangfuseDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LangfuseDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("langfuse", params._pathParam(0))
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

        private val patchHandler: Handler<LangfusePatchResponse> =
            jsonHandler<LangfusePatchResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun patch(
            params: LangfusePatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LangfusePatchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("langfuse", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
