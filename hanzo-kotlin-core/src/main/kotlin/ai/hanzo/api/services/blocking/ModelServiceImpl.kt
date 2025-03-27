// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

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
import ai.hanzo.api.models.model.ModelCreateParams
import ai.hanzo.api.models.model.ModelCreateResponse
import ai.hanzo.api.models.model.ModelDeleteParams
import ai.hanzo.api.models.model.ModelDeleteResponse
import ai.hanzo.api.services.blocking.model.InfoService
import ai.hanzo.api.services.blocking.model.InfoServiceImpl
import ai.hanzo.api.services.blocking.model.UpdateService
import ai.hanzo.api.services.blocking.model.UpdateServiceImpl

class ModelServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ModelService {

    private val withRawResponse: ModelService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val info: InfoService by lazy { InfoServiceImpl(clientOptions) }

    private val update: UpdateService by lazy { UpdateServiceImpl(clientOptions) }

    override fun withRawResponse(): ModelService.WithRawResponse = withRawResponse

    override fun info(): InfoService = info

    override fun update(): UpdateService = update

    override fun create(
        params: ModelCreateParams,
        requestOptions: RequestOptions,
    ): ModelCreateResponse =
        // post /model/new
        withRawResponse().create(params, requestOptions).parse()

    override fun delete(
        params: ModelDeleteParams,
        requestOptions: RequestOptions,
    ): ModelDeleteResponse =
        // post /model/delete
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ModelService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val info: InfoService.WithRawResponse by lazy {
            InfoServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val update: UpdateService.WithRawResponse by lazy {
            UpdateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun info(): InfoService.WithRawResponse = info

        override fun update(): UpdateService.WithRawResponse = update

        private val createHandler: Handler<ModelCreateResponse> =
            jsonHandler<ModelCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: ModelCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ModelCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("model", "new")
                    .body(json(clientOptions.jsonMapper, params._body()))
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

        private val deleteHandler: Handler<ModelDeleteResponse> =
            jsonHandler<ModelDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: ModelDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ModelDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("model", "delete")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
