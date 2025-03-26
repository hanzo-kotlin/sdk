// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking.threads

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
import com.hanzo_ai.api.models.threads.messages.MessageCreateParams
import com.hanzo_ai.api.models.threads.messages.MessageCreateResponse
import com.hanzo_ai.api.models.threads.messages.MessageListParams
import com.hanzo_ai.api.models.threads.messages.MessageListResponse

class MessageServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MessageService {

    private val withRawResponse: MessageService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MessageService.WithRawResponse = withRawResponse

    override fun create(
        params: MessageCreateParams,
        requestOptions: RequestOptions,
    ): MessageCreateResponse =
        // post /v1/threads/{thread_id}/messages
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: MessageListParams,
        requestOptions: RequestOptions,
    ): MessageListResponse =
        // get /v1/threads/{thread_id}/messages
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MessageService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<MessageCreateResponse> =
            jsonHandler<MessageCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: MessageCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "threads", params._pathParam(0), "messages")
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

        private val listHandler: Handler<MessageListResponse> =
            jsonHandler<MessageListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: MessageListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "threads", params._pathParam(0), "messages")
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
    }
}
