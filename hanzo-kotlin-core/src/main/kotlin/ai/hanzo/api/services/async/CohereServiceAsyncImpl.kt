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
import ai.hanzo.api.models.cohere.CohereCreateParams
import ai.hanzo.api.models.cohere.CohereCreateResponse
import ai.hanzo.api.models.cohere.CohereDeleteParams
import ai.hanzo.api.models.cohere.CohereDeleteResponse
import ai.hanzo.api.models.cohere.CohereModifyParams
import ai.hanzo.api.models.cohere.CohereModifyResponse
import ai.hanzo.api.models.cohere.CohereRetrieveParams
import ai.hanzo.api.models.cohere.CohereRetrieveResponse
import ai.hanzo.api.models.cohere.CohereUpdateParams
import ai.hanzo.api.models.cohere.CohereUpdateResponse

class CohereServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CohereServiceAsync {

    private val withRawResponse: CohereServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CohereServiceAsync.WithRawResponse = withRawResponse

    override suspend fun create(
        params: CohereCreateParams,
        requestOptions: RequestOptions,
    ): CohereCreateResponse =
        // post /cohere/{endpoint}
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: CohereRetrieveParams,
        requestOptions: RequestOptions,
    ): CohereRetrieveResponse =
        // get /cohere/{endpoint}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: CohereUpdateParams,
        requestOptions: RequestOptions,
    ): CohereUpdateResponse =
        // put /cohere/{endpoint}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun delete(
        params: CohereDeleteParams,
        requestOptions: RequestOptions,
    ): CohereDeleteResponse =
        // delete /cohere/{endpoint}
        withRawResponse().delete(params, requestOptions).parse()

    override suspend fun modify(
        params: CohereModifyParams,
        requestOptions: RequestOptions,
    ): CohereModifyResponse =
        // patch /cohere/{endpoint}
        withRawResponse().modify(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CohereServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CohereCreateResponse> =
            jsonHandler<CohereCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun create(
            params: CohereCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CohereCreateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("endpoint", params.endpoint())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("cohere", params._pathParam(0))
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

        private val retrieveHandler: Handler<CohereRetrieveResponse> =
            jsonHandler<CohereRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: CohereRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CohereRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("endpoint", params.endpoint())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("cohere", params._pathParam(0))
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

        private val updateHandler: Handler<CohereUpdateResponse> =
            jsonHandler<CohereUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun update(
            params: CohereUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CohereUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("endpoint", params.endpoint())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("cohere", params._pathParam(0))
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

        private val deleteHandler: Handler<CohereDeleteResponse> =
            jsonHandler<CohereDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun delete(
            params: CohereDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CohereDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("endpoint", params.endpoint())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("cohere", params._pathParam(0))
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

        private val modifyHandler: Handler<CohereModifyResponse> =
            jsonHandler<CohereModifyResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun modify(
            params: CohereModifyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CohereModifyResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("endpoint", params.endpoint())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("cohere", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { modifyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
