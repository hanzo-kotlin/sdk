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
import com.hanzo_ai.api.models.bedrock.BedrockCreateParams
import com.hanzo_ai.api.models.bedrock.BedrockCreateResponse
import com.hanzo_ai.api.models.bedrock.BedrockDeleteParams
import com.hanzo_ai.api.models.bedrock.BedrockDeleteResponse
import com.hanzo_ai.api.models.bedrock.BedrockPatchParams
import com.hanzo_ai.api.models.bedrock.BedrockPatchResponse
import com.hanzo_ai.api.models.bedrock.BedrockRetrieveParams
import com.hanzo_ai.api.models.bedrock.BedrockRetrieveResponse
import com.hanzo_ai.api.models.bedrock.BedrockUpdateParams
import com.hanzo_ai.api.models.bedrock.BedrockUpdateResponse

class BedrockServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BedrockServiceAsync {

    private val withRawResponse: BedrockServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BedrockServiceAsync.WithRawResponse = withRawResponse

    override suspend fun create(
        params: BedrockCreateParams,
        requestOptions: RequestOptions,
    ): BedrockCreateResponse =
        // post /bedrock/{endpoint}
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: BedrockRetrieveParams,
        requestOptions: RequestOptions,
    ): BedrockRetrieveResponse =
        // get /bedrock/{endpoint}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: BedrockUpdateParams,
        requestOptions: RequestOptions,
    ): BedrockUpdateResponse =
        // put /bedrock/{endpoint}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun delete(
        params: BedrockDeleteParams,
        requestOptions: RequestOptions,
    ): BedrockDeleteResponse =
        // delete /bedrock/{endpoint}
        withRawResponse().delete(params, requestOptions).parse()

    override suspend fun patch(
        params: BedrockPatchParams,
        requestOptions: RequestOptions,
    ): BedrockPatchResponse =
        // patch /bedrock/{endpoint}
        withRawResponse().patch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BedrockServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<BedrockCreateResponse> =
            jsonHandler<BedrockCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun create(
            params: BedrockCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BedrockCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("bedrock", params._pathParam(0))
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

        private val retrieveHandler: Handler<BedrockRetrieveResponse> =
            jsonHandler<BedrockRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: BedrockRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BedrockRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("bedrock", params._pathParam(0))
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

        private val updateHandler: Handler<BedrockUpdateResponse> =
            jsonHandler<BedrockUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun update(
            params: BedrockUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BedrockUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("bedrock", params._pathParam(0))
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

        private val deleteHandler: Handler<BedrockDeleteResponse> =
            jsonHandler<BedrockDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun delete(
            params: BedrockDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BedrockDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("bedrock", params._pathParam(0))
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

        private val patchHandler: Handler<BedrockPatchResponse> =
            jsonHandler<BedrockPatchResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun patch(
            params: BedrockPatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BedrockPatchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("bedrock", params._pathParam(0))
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
