// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.team

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
import com.hanzo_ai.api.models.team.callback.CallbackAddParams
import com.hanzo_ai.api.models.team.callback.CallbackAddResponse
import com.hanzo_ai.api.models.team.callback.CallbackRetrieveParams
import com.hanzo_ai.api.models.team.callback.CallbackRetrieveResponse

class CallbackServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CallbackServiceAsync {

    private val withRawResponse: CallbackServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CallbackServiceAsync.WithRawResponse = withRawResponse

    override suspend fun retrieve(
        params: CallbackRetrieveParams,
        requestOptions: RequestOptions,
    ): CallbackRetrieveResponse =
        // get /team/{team_id}/callback
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun add(
        params: CallbackAddParams,
        requestOptions: RequestOptions,
    ): CallbackAddResponse =
        // post /team/{team_id}/callback
        withRawResponse().add(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CallbackServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<CallbackRetrieveResponse> =
            jsonHandler<CallbackRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: CallbackRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallbackRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("team", params._pathParam(0), "callback")
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

        private val addHandler: Handler<CallbackAddResponse> =
            jsonHandler<CallbackAddResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun add(
            params: CallbackAddParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallbackAddResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("team", params._pathParam(0), "callback")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { addHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
