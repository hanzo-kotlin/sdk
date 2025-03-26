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
import com.hanzo_ai.api.models.model.ModelCreateParams
import com.hanzo_ai.api.models.model.ModelCreateResponse
import com.hanzo_ai.api.models.model.ModelDeleteParams
import com.hanzo_ai.api.models.model.ModelDeleteResponse
import com.hanzo_ai.api.services.async.model.InfoServiceAsync
import com.hanzo_ai.api.services.async.model.InfoServiceAsyncImpl
import com.hanzo_ai.api.services.async.model.UpdateServiceAsync
import com.hanzo_ai.api.services.async.model.UpdateServiceAsyncImpl

class ModelServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ModelServiceAsync {

    private val withRawResponse: ModelServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val info: InfoServiceAsync by lazy { InfoServiceAsyncImpl(clientOptions) }

    private val update: UpdateServiceAsync by lazy { UpdateServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ModelServiceAsync.WithRawResponse = withRawResponse

    override fun info(): InfoServiceAsync = info

    override fun update(): UpdateServiceAsync = update

    override suspend fun create(
        params: ModelCreateParams,
        requestOptions: RequestOptions,
    ): ModelCreateResponse =
        // post /model/new
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun delete(
        params: ModelDeleteParams,
        requestOptions: RequestOptions,
    ): ModelDeleteResponse =
        // post /model/delete
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ModelServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val info: InfoServiceAsync.WithRawResponse by lazy {
            InfoServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val update: UpdateServiceAsync.WithRawResponse by lazy {
            UpdateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun info(): InfoServiceAsync.WithRawResponse = info

        override fun update(): UpdateServiceAsync.WithRawResponse = update

        private val createHandler: Handler<ModelCreateResponse> =
            jsonHandler<ModelCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun create(
            params: ModelCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ModelCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("model", "new")
                    .body(json(clientOptions.jsonMapper, params._body()))
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

        private val deleteHandler: Handler<ModelDeleteResponse> =
            jsonHandler<ModelDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun delete(
            params: ModelDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ModelDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("model", "delete")
                    .body(json(clientOptions.jsonMapper, params._body()))
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
    }
}
