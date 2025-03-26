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
import com.hanzo_ai.api.models.batches.BatchCancelWithProviderParams
import com.hanzo_ai.api.models.batches.BatchCancelWithProviderResponse
import com.hanzo_ai.api.models.batches.BatchCreateParams
import com.hanzo_ai.api.models.batches.BatchCreateResponse
import com.hanzo_ai.api.models.batches.BatchCreateWithProviderParams
import com.hanzo_ai.api.models.batches.BatchCreateWithProviderResponse
import com.hanzo_ai.api.models.batches.BatchListParams
import com.hanzo_ai.api.models.batches.BatchListResponse
import com.hanzo_ai.api.models.batches.BatchListWithProviderParams
import com.hanzo_ai.api.models.batches.BatchListWithProviderResponse
import com.hanzo_ai.api.models.batches.BatchRetrieveParams
import com.hanzo_ai.api.models.batches.BatchRetrieveResponse
import com.hanzo_ai.api.models.batches.BatchRetrieveWithProviderParams
import com.hanzo_ai.api.models.batches.BatchRetrieveWithProviderResponse
import com.hanzo_ai.api.services.blocking.batches.CancelService
import com.hanzo_ai.api.services.blocking.batches.CancelServiceImpl

class BatchServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BatchService {

    private val withRawResponse: BatchService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val cancel: CancelService by lazy { CancelServiceImpl(clientOptions) }

    override fun withRawResponse(): BatchService.WithRawResponse = withRawResponse

    override fun cancel(): CancelService = cancel

    override fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions,
    ): BatchCreateResponse =
        // post /v1/batches
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: BatchRetrieveParams,
        requestOptions: RequestOptions,
    ): BatchRetrieveResponse =
        // get /v1/batches/{batch_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: BatchListParams, requestOptions: RequestOptions): BatchListResponse =
        // get /v1/batches
        withRawResponse().list(params, requestOptions).parse()

    override fun cancelWithProvider(
        params: BatchCancelWithProviderParams,
        requestOptions: RequestOptions,
    ): BatchCancelWithProviderResponse =
        // post /{provider}/v1/batches/{batch_id}/cancel
        withRawResponse().cancelWithProvider(params, requestOptions).parse()

    override fun createWithProvider(
        params: BatchCreateWithProviderParams,
        requestOptions: RequestOptions,
    ): BatchCreateWithProviderResponse =
        // post /{provider}/v1/batches
        withRawResponse().createWithProvider(params, requestOptions).parse()

    override fun listWithProvider(
        params: BatchListWithProviderParams,
        requestOptions: RequestOptions,
    ): BatchListWithProviderResponse =
        // get /{provider}/v1/batches
        withRawResponse().listWithProvider(params, requestOptions).parse()

    override fun retrieveWithProvider(
        params: BatchRetrieveWithProviderParams,
        requestOptions: RequestOptions,
    ): BatchRetrieveWithProviderResponse =
        // get /{provider}/v1/batches/{batch_id}
        withRawResponse().retrieveWithProvider(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BatchService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val cancel: CancelService.WithRawResponse by lazy {
            CancelServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun cancel(): CancelService.WithRawResponse = cancel

        private val createHandler: Handler<BatchCreateResponse> =
            jsonHandler<BatchCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "batches")
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

        private val retrieveHandler: Handler<BatchRetrieveResponse> =
            jsonHandler<BatchRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: BatchRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "batches", params._pathParam(0))
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

        private val listHandler: Handler<BatchListResponse> =
            jsonHandler<BatchListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: BatchListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "batches")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val cancelWithProviderHandler: Handler<BatchCancelWithProviderResponse> =
            jsonHandler<BatchCancelWithProviderResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun cancelWithProvider(
            params: BatchCancelWithProviderParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchCancelWithProviderResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        params._pathParam(0),
                        "v1",
                        "batches",
                        params._pathParam(1),
                        "cancel",
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { cancelWithProviderHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createWithProviderHandler: Handler<BatchCreateWithProviderResponse> =
            jsonHandler<BatchCreateWithProviderResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun createWithProvider(
            params: BatchCreateWithProviderParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchCreateWithProviderResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(params._pathParam(0), "v1", "batches")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createWithProviderHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listWithProviderHandler: Handler<BatchListWithProviderResponse> =
            jsonHandler<BatchListWithProviderResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun listWithProvider(
            params: BatchListWithProviderParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchListWithProviderResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(params._pathParam(0), "v1", "batches")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listWithProviderHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveWithProviderHandler: Handler<BatchRetrieveWithProviderResponse> =
            jsonHandler<BatchRetrieveWithProviderResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieveWithProvider(
            params: BatchRetrieveWithProviderParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchRetrieveWithProviderResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(params._pathParam(0), "v1", "batches", params._pathParam(1))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveWithProviderHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
