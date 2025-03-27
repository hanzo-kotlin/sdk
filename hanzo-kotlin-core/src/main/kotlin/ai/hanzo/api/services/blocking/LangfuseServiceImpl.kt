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
import ai.hanzo.api.models.langfuse.LangfuseCreateParams
import ai.hanzo.api.models.langfuse.LangfuseCreateResponse
import ai.hanzo.api.models.langfuse.LangfuseDeleteParams
import ai.hanzo.api.models.langfuse.LangfuseDeleteResponse
import ai.hanzo.api.models.langfuse.LangfusePatchParams
import ai.hanzo.api.models.langfuse.LangfusePatchResponse
import ai.hanzo.api.models.langfuse.LangfuseRetrieveParams
import ai.hanzo.api.models.langfuse.LangfuseRetrieveResponse
import ai.hanzo.api.models.langfuse.LangfuseUpdateParams
import ai.hanzo.api.models.langfuse.LangfuseUpdateResponse

class LangfuseServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LangfuseService {

    private val withRawResponse: LangfuseService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LangfuseService.WithRawResponse = withRawResponse

    override fun create(
        params: LangfuseCreateParams,
        requestOptions: RequestOptions,
    ): LangfuseCreateResponse =
        // post /langfuse/{endpoint}
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: LangfuseRetrieveParams,
        requestOptions: RequestOptions,
    ): LangfuseRetrieveResponse =
        // get /langfuse/{endpoint}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: LangfuseUpdateParams,
        requestOptions: RequestOptions,
    ): LangfuseUpdateResponse =
        // put /langfuse/{endpoint}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(
        params: LangfuseDeleteParams,
        requestOptions: RequestOptions,
    ): LangfuseDeleteResponse =
        // delete /langfuse/{endpoint}
        withRawResponse().delete(params, requestOptions).parse()

    override fun patch(
        params: LangfusePatchParams,
        requestOptions: RequestOptions,
    ): LangfusePatchResponse =
        // patch /langfuse/{endpoint}
        withRawResponse().patch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LangfuseService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<LangfuseCreateResponse> =
            jsonHandler<LangfuseCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: LangfuseCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LangfuseCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("langfuse", params._pathParam(0))
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

        private val retrieveHandler: Handler<LangfuseRetrieveResponse> =
            jsonHandler<LangfuseRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: LangfuseRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LangfuseRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("langfuse", params._pathParam(0))
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

        private val updateHandler: Handler<LangfuseUpdateResponse> =
            jsonHandler<LangfuseUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: LangfuseUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LangfuseUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("langfuse", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<LangfuseDeleteResponse> =
            jsonHandler<LangfuseDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: LangfuseDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LangfuseDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("langfuse", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
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

        private val patchHandler: Handler<LangfusePatchResponse> =
            jsonHandler<LangfusePatchResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun patch(
            params: LangfusePatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LangfusePatchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("langfuse", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { patchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
