// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.model

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.handlers.errorHandler
import ai.hanzo.api.core.handlers.jsonHandler
import ai.hanzo.api.core.handlers.withErrorHandler
import ai.hanzo.api.core.http.HttpMethod
import ai.hanzo.api.core.http.HttpRequest
import ai.hanzo.api.core.http.HttpResponse.Handler
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.core.http.json
import ai.hanzo.api.core.http.parseable
import ai.hanzo.api.core.prepare
import ai.hanzo.api.models.model.update.UpdateFullParams
import ai.hanzo.api.models.model.update.UpdateFullResponse
import ai.hanzo.api.models.model.update.UpdatePartialParams
import ai.hanzo.api.models.model.update.UpdatePartialResponse

class UpdateServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    UpdateService {

    private val withRawResponse: UpdateService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UpdateService.WithRawResponse = withRawResponse

    override fun full(
        params: UpdateFullParams,
        requestOptions: RequestOptions,
    ): UpdateFullResponse =
        // post /model/update
        withRawResponse().full(params, requestOptions).parse()

    override fun partial(
        params: UpdatePartialParams,
        requestOptions: RequestOptions,
    ): UpdatePartialResponse =
        // patch /model/{model_id}/update
        withRawResponse().partial(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UpdateService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val fullHandler: Handler<UpdateFullResponse> =
            jsonHandler<UpdateFullResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun full(
            params: UpdateFullParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UpdateFullResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("model", "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun partial(
            params: UpdatePartialParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UpdatePartialResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("model", params._pathParam(0), "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
