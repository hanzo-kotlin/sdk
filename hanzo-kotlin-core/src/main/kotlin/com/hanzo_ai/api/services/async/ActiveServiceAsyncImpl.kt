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
import com.hanzo_ai.api.core.http.parseable
import com.hanzo_ai.api.core.prepareAsync
import com.hanzo_ai.api.models.active.ActiveListCallbacksParams
import com.hanzo_ai.api.models.active.ActiveListCallbacksResponse

class ActiveServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ActiveServiceAsync {

    private val withRawResponse: ActiveServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ActiveServiceAsync.WithRawResponse = withRawResponse

    override suspend fun listCallbacks(
        params: ActiveListCallbacksParams,
        requestOptions: RequestOptions,
    ): ActiveListCallbacksResponse =
        // get /active/callbacks
        withRawResponse().listCallbacks(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ActiveServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val listCallbacksHandler: Handler<ActiveListCallbacksResponse> =
            jsonHandler<ActiveListCallbacksResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun listCallbacks(
            params: ActiveListCallbacksParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActiveListCallbacksResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("active", "callbacks")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listCallbacksHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
