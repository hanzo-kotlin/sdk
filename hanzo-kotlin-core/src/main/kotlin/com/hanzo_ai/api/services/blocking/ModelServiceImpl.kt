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
import com.hanzo_ai.api.models.model.ModelCreateParams
import com.hanzo_ai.api.models.model.ModelCreateResponse
import com.hanzo_ai.api.models.model.ModelDeleteParams
import com.hanzo_ai.api.models.model.ModelDeleteResponse
import com.hanzo_ai.api.services.blocking.model.InfoService
import com.hanzo_ai.api.services.blocking.model.InfoServiceImpl
import com.hanzo_ai.api.services.blocking.model.UpdateService
import com.hanzo_ai.api.services.blocking.model.UpdateServiceImpl

class ModelServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ModelService {

    private val withRawResponse: ModelService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val info: InfoService by lazy { InfoServiceImpl(clientOptions) }

    private val update: UpdateService by lazy { UpdateServiceImpl(clientOptions) }

    override fun withRawResponse(): ModelService.WithRawResponse = withRawResponse

    override fun info(): InfoService = info

    override fun update(): UpdateService = update

    override fun create(
        params: ModelCreateParams,
        requestOptions: RequestOptions,
    ): ModelCreateResponse =
        // post /model/new
        withRawResponse().create(params, requestOptions).parse()

    override fun delete(
        params: ModelDeleteParams,
        requestOptions: RequestOptions,
    ): ModelDeleteResponse =
        // post /model/delete
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ModelService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val info: InfoService.WithRawResponse by lazy {
            InfoServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val update: UpdateService.WithRawResponse by lazy {
            UpdateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun info(): InfoService.WithRawResponse = info

        override fun update(): UpdateService.WithRawResponse = update

        private val createHandler: Handler<ModelCreateResponse> =
            jsonHandler<ModelCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: ModelCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ModelCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("model", "new")
                    .body(json(clientOptions.jsonMapper, params._body()))
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

        private val deleteHandler: Handler<ModelDeleteResponse> =
            jsonHandler<ModelDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: ModelDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ModelDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("model", "delete")
                    .body(json(clientOptions.jsonMapper, params._body()))
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
