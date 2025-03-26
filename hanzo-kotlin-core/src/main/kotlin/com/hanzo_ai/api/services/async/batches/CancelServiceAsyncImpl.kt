// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.batches

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
import com.hanzo_ai.api.models.batches.cancel.CancelCancelParams
import com.hanzo_ai.api.models.batches.cancel.CancelCancelResponse

class CancelServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CancelServiceAsync {

    private val withRawResponse: CancelServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CancelServiceAsync.WithRawResponse = withRawResponse

    override suspend fun cancel(
        params: CancelCancelParams,
        requestOptions: RequestOptions,
    ): CancelCancelResponse =
        // post /batches/{batch_id}/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CancelServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val cancelHandler: Handler<CancelCancelResponse> =
            jsonHandler<CancelCancelResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun cancel(
            params: CancelCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CancelCancelResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("batches", params._pathParam(0), "cancel")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { cancelHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
