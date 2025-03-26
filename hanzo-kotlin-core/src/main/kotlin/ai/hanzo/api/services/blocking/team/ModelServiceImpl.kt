// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.team

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
import ai.hanzo.api.models.team.model.ModelAddParams
import ai.hanzo.api.models.team.model.ModelAddResponse
import ai.hanzo.api.models.team.model.ModelRemoveParams
import ai.hanzo.api.models.team.model.ModelRemoveResponse

class ModelServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ModelService {

    private val withRawResponse: ModelService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ModelService.WithRawResponse = withRawResponse

    override fun add(params: ModelAddParams, requestOptions: RequestOptions): ModelAddResponse =
        // post /team/model/add
        withRawResponse().add(params, requestOptions).parse()

    override fun remove(
        params: ModelRemoveParams,
        requestOptions: RequestOptions,
    ): ModelRemoveResponse =
        // post /team/model/delete
        withRawResponse().remove(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ModelService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val addHandler: Handler<ModelAddResponse> =
            jsonHandler<ModelAddResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun add(
            params: ModelAddParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ModelAddResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("team", "model", "add")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val removeHandler: Handler<ModelRemoveResponse> =
            jsonHandler<ModelRemoveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun remove(
            params: ModelRemoveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ModelRemoveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("team", "model", "delete")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { removeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
