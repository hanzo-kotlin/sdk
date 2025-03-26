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
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiCreateParams
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiCreateResponse
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiDeleteParams
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiDeleteResponse
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiPatchParams
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiPatchResponse
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiRetrieveParams
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiRetrieveResponse
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiUpdateParams
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiUpdateResponse

class EuAssemblyaiServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EuAssemblyaiService {

    private val withRawResponse: EuAssemblyaiService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EuAssemblyaiService.WithRawResponse = withRawResponse

    override fun create(
        params: EuAssemblyaiCreateParams,
        requestOptions: RequestOptions,
    ): EuAssemblyaiCreateResponse =
        // post /eu.assemblyai/{endpoint}
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: EuAssemblyaiRetrieveParams,
        requestOptions: RequestOptions,
    ): EuAssemblyaiRetrieveResponse =
        // get /eu.assemblyai/{endpoint}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: EuAssemblyaiUpdateParams,
        requestOptions: RequestOptions,
    ): EuAssemblyaiUpdateResponse =
        // put /eu.assemblyai/{endpoint}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(
        params: EuAssemblyaiDeleteParams,
        requestOptions: RequestOptions,
    ): EuAssemblyaiDeleteResponse =
        // delete /eu.assemblyai/{endpoint}
        withRawResponse().delete(params, requestOptions).parse()

    override fun patch(
        params: EuAssemblyaiPatchParams,
        requestOptions: RequestOptions,
    ): EuAssemblyaiPatchResponse =
        // patch /eu.assemblyai/{endpoint}
        withRawResponse().patch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EuAssemblyaiService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<EuAssemblyaiCreateResponse> =
            jsonHandler<EuAssemblyaiCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: EuAssemblyaiCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EuAssemblyaiCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("eu.assemblyai", params._pathParam(0))
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

        private val retrieveHandler: Handler<EuAssemblyaiRetrieveResponse> =
            jsonHandler<EuAssemblyaiRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: EuAssemblyaiRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EuAssemblyaiRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("eu.assemblyai", params._pathParam(0))
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

        private val updateHandler: Handler<EuAssemblyaiUpdateResponse> =
            jsonHandler<EuAssemblyaiUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: EuAssemblyaiUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EuAssemblyaiUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("eu.assemblyai", params._pathParam(0))
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

        private val deleteHandler: Handler<EuAssemblyaiDeleteResponse> =
            jsonHandler<EuAssemblyaiDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: EuAssemblyaiDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EuAssemblyaiDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("eu.assemblyai", params._pathParam(0))
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

        private val patchHandler: Handler<EuAssemblyaiPatchResponse> =
            jsonHandler<EuAssemblyaiPatchResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun patch(
            params: EuAssemblyaiPatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EuAssemblyaiPatchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("eu.assemblyai", params._pathParam(0))
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
