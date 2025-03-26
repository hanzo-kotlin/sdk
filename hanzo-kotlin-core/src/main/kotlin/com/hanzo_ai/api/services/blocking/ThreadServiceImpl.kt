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
import com.hanzo_ai.api.models.threads.ThreadCreateParams
import com.hanzo_ai.api.models.threads.ThreadCreateResponse
import com.hanzo_ai.api.models.threads.ThreadRetrieveParams
import com.hanzo_ai.api.models.threads.ThreadRetrieveResponse
import com.hanzo_ai.api.services.blocking.threads.MessageService
import com.hanzo_ai.api.services.blocking.threads.MessageServiceImpl
import com.hanzo_ai.api.services.blocking.threads.RunService
import com.hanzo_ai.api.services.blocking.threads.RunServiceImpl

class ThreadServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ThreadService {

    private val withRawResponse: ThreadService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val messages: MessageService by lazy { MessageServiceImpl(clientOptions) }

    private val runs: RunService by lazy { RunServiceImpl(clientOptions) }

    override fun withRawResponse(): ThreadService.WithRawResponse = withRawResponse

    override fun messages(): MessageService = messages

    override fun runs(): RunService = runs

    override fun create(
        params: ThreadCreateParams,
        requestOptions: RequestOptions,
    ): ThreadCreateResponse =
        // post /v1/threads
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ThreadRetrieveParams,
        requestOptions: RequestOptions,
    ): ThreadRetrieveResponse =
        // get /v1/threads/{thread_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ThreadService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val messages: MessageService.WithRawResponse by lazy {
            MessageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val runs: RunService.WithRawResponse by lazy {
            RunServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun messages(): MessageService.WithRawResponse = messages

        override fun runs(): RunService.WithRawResponse = runs

        private val createHandler: Handler<ThreadCreateResponse> =
            jsonHandler<ThreadCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: ThreadCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ThreadCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "threads")
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

        private val retrieveHandler: Handler<ThreadRetrieveResponse> =
            jsonHandler<ThreadRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: ThreadRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ThreadRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "threads", params._pathParam(0))
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
    }
}
