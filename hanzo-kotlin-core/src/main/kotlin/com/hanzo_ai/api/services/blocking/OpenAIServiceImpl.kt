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
import com.hanzo_ai.api.models.openai.OpenAICreateParams
import com.hanzo_ai.api.models.openai.OpenAICreateResponse
import com.hanzo_ai.api.models.openai.OpenAIDeleteParams
import com.hanzo_ai.api.models.openai.OpenAIDeleteResponse
import com.hanzo_ai.api.models.openai.OpenAIPatchParams
import com.hanzo_ai.api.models.openai.OpenAIPatchResponse
import com.hanzo_ai.api.models.openai.OpenAIRetrieveParams
import com.hanzo_ai.api.models.openai.OpenAIRetrieveResponse
import com.hanzo_ai.api.models.openai.OpenAIUpdateParams
import com.hanzo_ai.api.models.openai.OpenAIUpdateResponse
import com.hanzo_ai.api.services.blocking.openai.DeploymentService
import com.hanzo_ai.api.services.blocking.openai.DeploymentServiceImpl

class OpenAIServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OpenAIService {

    private val withRawResponse: OpenAIService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val deployments: DeploymentService by lazy { DeploymentServiceImpl(clientOptions) }

    override fun withRawResponse(): OpenAIService.WithRawResponse = withRawResponse

    override fun deployments(): DeploymentService = deployments

    override fun create(
        params: OpenAICreateParams,
        requestOptions: RequestOptions,
    ): OpenAICreateResponse =
        // post /openai/{endpoint}
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: OpenAIRetrieveParams,
        requestOptions: RequestOptions,
    ): OpenAIRetrieveResponse =
        // get /openai/{endpoint}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: OpenAIUpdateParams,
        requestOptions: RequestOptions,
    ): OpenAIUpdateResponse =
        // put /openai/{endpoint}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(
        params: OpenAIDeleteParams,
        requestOptions: RequestOptions,
    ): OpenAIDeleteResponse =
        // delete /openai/{endpoint}
        withRawResponse().delete(params, requestOptions).parse()

    override fun patch(
        params: OpenAIPatchParams,
        requestOptions: RequestOptions,
    ): OpenAIPatchResponse =
        // patch /openai/{endpoint}
        withRawResponse().patch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OpenAIService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val deployments: DeploymentService.WithRawResponse by lazy {
            DeploymentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun deployments(): DeploymentService.WithRawResponse = deployments

        private val createHandler: Handler<OpenAICreateResponse> =
            jsonHandler<OpenAICreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: OpenAICreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OpenAICreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("openai", params._pathParam(0))
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

        private val retrieveHandler: Handler<OpenAIRetrieveResponse> =
            jsonHandler<OpenAIRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: OpenAIRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OpenAIRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("openai", params._pathParam(0))
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

        private val updateHandler: Handler<OpenAIUpdateResponse> =
            jsonHandler<OpenAIUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: OpenAIUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OpenAIUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("openai", params._pathParam(0))
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

        private val deleteHandler: Handler<OpenAIDeleteResponse> =
            jsonHandler<OpenAIDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: OpenAIDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OpenAIDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("openai", params._pathParam(0))
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

        private val patchHandler: Handler<OpenAIPatchResponse> =
            jsonHandler<OpenAIPatchResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun patch(
            params: OpenAIPatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OpenAIPatchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("openai", params._pathParam(0))
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
