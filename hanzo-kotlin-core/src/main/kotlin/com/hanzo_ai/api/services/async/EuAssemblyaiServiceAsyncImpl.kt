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
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiCreateParams
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiCreateResponse
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiDeleteParams
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiDeleteResponse
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiPatchParams
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiPatchResponse
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiRetrieveParams
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiRetrieveResponse
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiUpdateParams
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiUpdateResponse

class EuAssemblyaiServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EuAssemblyaiServiceAsync {

    private val withRawResponse: EuAssemblyaiServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EuAssemblyaiServiceAsync.WithRawResponse = withRawResponse

    override suspend fun create(
        params: EuAssemblyaiCreateParams,
        requestOptions: RequestOptions,
    ): EuAssemblyaiCreateResponse =
        // post /eu.assemblyai/{endpoint}
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: EuAssemblyaiRetrieveParams,
        requestOptions: RequestOptions,
    ): EuAssemblyaiRetrieveResponse =
        // get /eu.assemblyai/{endpoint}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: EuAssemblyaiUpdateParams,
        requestOptions: RequestOptions,
    ): EuAssemblyaiUpdateResponse =
        // put /eu.assemblyai/{endpoint}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun delete(
        params: EuAssemblyaiDeleteParams,
        requestOptions: RequestOptions,
    ): EuAssemblyaiDeleteResponse =
        // delete /eu.assemblyai/{endpoint}
        withRawResponse().delete(params, requestOptions).parse()

    override suspend fun patch(
        params: EuAssemblyaiPatchParams,
        requestOptions: RequestOptions,
    ): EuAssemblyaiPatchResponse =
        // patch /eu.assemblyai/{endpoint}
        withRawResponse().patch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EuAssemblyaiServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<EuAssemblyaiCreateResponse> =
            jsonHandler<EuAssemblyaiCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun create(
            params: EuAssemblyaiCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EuAssemblyaiCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("eu.assemblyai", params._pathParam(0))
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

        private val retrieveHandler: Handler<EuAssemblyaiRetrieveResponse> =
            jsonHandler<EuAssemblyaiRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: EuAssemblyaiRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EuAssemblyaiRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("eu.assemblyai", params._pathParam(0))
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

        private val updateHandler: Handler<EuAssemblyaiUpdateResponse> =
            jsonHandler<EuAssemblyaiUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun update(
            params: EuAssemblyaiUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EuAssemblyaiUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("eu.assemblyai", params._pathParam(0))
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

        private val deleteHandler: Handler<EuAssemblyaiDeleteResponse> =
            jsonHandler<EuAssemblyaiDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun delete(
            params: EuAssemblyaiDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EuAssemblyaiDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("eu.assemblyai", params._pathParam(0))
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

        private val patchHandler: Handler<EuAssemblyaiPatchResponse> =
            jsonHandler<EuAssemblyaiPatchResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun patch(
            params: EuAssemblyaiPatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EuAssemblyaiPatchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("eu.assemblyai", params._pathParam(0))
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
