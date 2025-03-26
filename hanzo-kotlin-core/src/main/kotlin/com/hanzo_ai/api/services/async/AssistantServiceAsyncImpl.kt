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
import com.hanzo_ai.api.models.assistants.AssistantCreateParams
import com.hanzo_ai.api.models.assistants.AssistantCreateResponse
import com.hanzo_ai.api.models.assistants.AssistantDeleteParams
import com.hanzo_ai.api.models.assistants.AssistantDeleteResponse
import com.hanzo_ai.api.models.assistants.AssistantListParams
import com.hanzo_ai.api.models.assistants.AssistantListResponse

class AssistantServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AssistantServiceAsync {

    private val withRawResponse: AssistantServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AssistantServiceAsync.WithRawResponse = withRawResponse

    override suspend fun create(
        params: AssistantCreateParams,
        requestOptions: RequestOptions,
    ): AssistantCreateResponse =
        // post /v1/assistants
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun list(
        params: AssistantListParams,
        requestOptions: RequestOptions,
    ): AssistantListResponse =
        // get /v1/assistants
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(
        params: AssistantDeleteParams,
        requestOptions: RequestOptions,
    ): AssistantDeleteResponse =
        // delete /v1/assistants/{assistant_id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AssistantServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<AssistantCreateResponse> =
            jsonHandler<AssistantCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun create(
            params: AssistantCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssistantCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "assistants")
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

        private val listHandler: Handler<AssistantListResponse> =
            jsonHandler<AssistantListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: AssistantListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssistantListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "assistants")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val deleteHandler: Handler<AssistantDeleteResponse> =
            jsonHandler<AssistantDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun delete(
            params: AssistantDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssistantDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "assistants", params._pathParam(0))
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
    }
}
