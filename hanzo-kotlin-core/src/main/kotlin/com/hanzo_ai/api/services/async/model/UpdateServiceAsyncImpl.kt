// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.model

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
import com.hanzo_ai.api.models.model.update.UpdateFullParams
import com.hanzo_ai.api.models.model.update.UpdateFullResponse
import com.hanzo_ai.api.models.model.update.UpdatePartialParams
import com.hanzo_ai.api.models.model.update.UpdatePartialResponse

class UpdateServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UpdateServiceAsync {

    private val withRawResponse: UpdateServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UpdateServiceAsync.WithRawResponse = withRawResponse

    override suspend fun full(
        params: UpdateFullParams,
        requestOptions: RequestOptions,
    ): UpdateFullResponse =
        // post /model/update
        withRawResponse().full(params, requestOptions).parse()

    override suspend fun partial(
        params: UpdatePartialParams,
        requestOptions: RequestOptions,
    ): UpdatePartialResponse =
        // patch /model/{model_id}/update
        withRawResponse().partial(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UpdateServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val fullHandler: Handler<UpdateFullResponse> =
            jsonHandler<UpdateFullResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun full(
            params: UpdateFullParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UpdateFullResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("model", "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { fullHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val partialHandler: Handler<UpdatePartialResponse> =
            jsonHandler<UpdatePartialResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun partial(
            params: UpdatePartialParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UpdatePartialResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("model", params._pathParam(0), "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { partialHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
