// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.checkRequired
import ai.hanzo.api.core.handlers.errorHandler
import ai.hanzo.api.core.handlers.jsonHandler
import ai.hanzo.api.core.handlers.withErrorHandler
import ai.hanzo.api.core.http.HttpMethod
import ai.hanzo.api.core.http.HttpRequest
import ai.hanzo.api.core.http.HttpResponse.Handler
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.core.http.json
import ai.hanzo.api.core.http.parseable
import ai.hanzo.api.core.prepareAsync
import ai.hanzo.api.models.assemblyai.AssemblyaiCreateParams
import ai.hanzo.api.models.assemblyai.AssemblyaiCreateResponse
import ai.hanzo.api.models.assemblyai.AssemblyaiDeleteParams
import ai.hanzo.api.models.assemblyai.AssemblyaiDeleteResponse
import ai.hanzo.api.models.assemblyai.AssemblyaiPatchParams
import ai.hanzo.api.models.assemblyai.AssemblyaiPatchResponse
import ai.hanzo.api.models.assemblyai.AssemblyaiRetrieveParams
import ai.hanzo.api.models.assemblyai.AssemblyaiRetrieveResponse
import ai.hanzo.api.models.assemblyai.AssemblyaiUpdateParams
import ai.hanzo.api.models.assemblyai.AssemblyaiUpdateResponse

class AssemblyaiServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AssemblyaiServiceAsync {

    private val withRawResponse: AssemblyaiServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AssemblyaiServiceAsync.WithRawResponse = withRawResponse

    override suspend fun create(
        params: AssemblyaiCreateParams,
        requestOptions: RequestOptions,
    ): AssemblyaiCreateResponse =
        // post /assemblyai/{endpoint}
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: AssemblyaiRetrieveParams,
        requestOptions: RequestOptions,
    ): AssemblyaiRetrieveResponse =
        // get /assemblyai/{endpoint}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: AssemblyaiUpdateParams,
        requestOptions: RequestOptions,
    ): AssemblyaiUpdateResponse =
        // put /assemblyai/{endpoint}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun delete(
        params: AssemblyaiDeleteParams,
        requestOptions: RequestOptions,
    ): AssemblyaiDeleteResponse =
        // delete /assemblyai/{endpoint}
        withRawResponse().delete(params, requestOptions).parse()

    override suspend fun patch(
        params: AssemblyaiPatchParams,
        requestOptions: RequestOptions,
    ): AssemblyaiPatchResponse =
        // patch /assemblyai/{endpoint}
        withRawResponse().patch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AssemblyaiServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<AssemblyaiCreateResponse> =
            jsonHandler<AssemblyaiCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun create(
            params: AssemblyaiCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssemblyaiCreateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("endpoint", params.endpoint())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("assemblyai", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val retrieveHandler: Handler<AssemblyaiRetrieveResponse> =
            jsonHandler<AssemblyaiRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: AssemblyaiRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssemblyaiRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("endpoint", params.endpoint())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("assemblyai", params._pathParam(0))
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

        private val updateHandler: Handler<AssemblyaiUpdateResponse> =
            jsonHandler<AssemblyaiUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun update(
            params: AssemblyaiUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssemblyaiUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("endpoint", params.endpoint())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("assemblyai", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val deleteHandler: Handler<AssemblyaiDeleteResponse> =
            jsonHandler<AssemblyaiDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun delete(
            params: AssemblyaiDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssemblyaiDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("endpoint", params.endpoint())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("assemblyai", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val patchHandler: Handler<AssemblyaiPatchResponse> =
            jsonHandler<AssemblyaiPatchResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun patch(
            params: AssemblyaiPatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssemblyaiPatchResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("endpoint", params.endpoint())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("assemblyai", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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
