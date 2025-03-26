// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

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
import ai.hanzo.api.core.prepareAsync
import ai.hanzo.api.models.key.GenerateKeyResponse
import ai.hanzo.api.models.key.KeyBlockParams
import ai.hanzo.api.models.key.KeyBlockResponse
import ai.hanzo.api.models.key.KeyCheckHealthParams
import ai.hanzo.api.models.key.KeyCheckHealthResponse
import ai.hanzo.api.models.key.KeyDeleteParams
import ai.hanzo.api.models.key.KeyDeleteResponse
import ai.hanzo.api.models.key.KeyGenerateParams
import ai.hanzo.api.models.key.KeyListParams
import ai.hanzo.api.models.key.KeyListResponse
import ai.hanzo.api.models.key.KeyRegenerateByKeyParams
import ai.hanzo.api.models.key.KeyRetrieveInfoParams
import ai.hanzo.api.models.key.KeyRetrieveInfoResponse
import ai.hanzo.api.models.key.KeyUnblockParams
import ai.hanzo.api.models.key.KeyUnblockResponse
import ai.hanzo.api.models.key.KeyUpdateParams
import ai.hanzo.api.models.key.KeyUpdateResponse
import ai.hanzo.api.services.async.key.RegenerateServiceAsync
import ai.hanzo.api.services.async.key.RegenerateServiceAsyncImpl

class KeyServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    KeyServiceAsync {

    private val withRawResponse: KeyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val regenerate: RegenerateServiceAsync by lazy {
        RegenerateServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): KeyServiceAsync.WithRawResponse = withRawResponse

    override fun regenerate(): RegenerateServiceAsync = regenerate

    override suspend fun update(
        params: KeyUpdateParams,
        requestOptions: RequestOptions,
    ): KeyUpdateResponse =
        // post /key/update
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: KeyListParams,
        requestOptions: RequestOptions,
    ): KeyListResponse =
        // get /key/list
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(
        params: KeyDeleteParams,
        requestOptions: RequestOptions,
    ): KeyDeleteResponse =
        // post /key/delete
        withRawResponse().delete(params, requestOptions).parse()

    override suspend fun block(
        params: KeyBlockParams,
        requestOptions: RequestOptions,
    ): KeyBlockResponse? =
        // post /key/block
        withRawResponse().block(params, requestOptions).parse()

    override suspend fun checkHealth(
        params: KeyCheckHealthParams,
        requestOptions: RequestOptions,
    ): KeyCheckHealthResponse =
        // post /key/health
        withRawResponse().checkHealth(params, requestOptions).parse()

    override suspend fun generate(
        params: KeyGenerateParams,
        requestOptions: RequestOptions,
    ): GenerateKeyResponse =
        // post /key/generate
        withRawResponse().generate(params, requestOptions).parse()

    override suspend fun regenerateByKey(
        params: KeyRegenerateByKeyParams,
        requestOptions: RequestOptions,
    ): GenerateKeyResponse? =
        // post /key/{key}/regenerate
        withRawResponse().regenerateByKey(params, requestOptions).parse()

    override suspend fun retrieveInfo(
        params: KeyRetrieveInfoParams,
        requestOptions: RequestOptions,
    ): KeyRetrieveInfoResponse =
        // get /key/info
        withRawResponse().retrieveInfo(params, requestOptions).parse()

    override suspend fun unblock(
        params: KeyUnblockParams,
        requestOptions: RequestOptions,
    ): KeyUnblockResponse =
        // post /key/unblock
        withRawResponse().unblock(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        KeyServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val regenerate: RegenerateServiceAsync.WithRawResponse by lazy {
            RegenerateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun regenerate(): RegenerateServiceAsync.WithRawResponse = regenerate

        private val updateHandler: Handler<KeyUpdateResponse> =
            jsonHandler<KeyUpdateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun update(
            params: KeyUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KeyUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("key", "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
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

        private val listHandler: Handler<KeyListResponse> =
            jsonHandler<KeyListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun list(
            params: KeyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KeyListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("key", "list")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<KeyDeleteResponse> =
            jsonHandler<KeyDeleteResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun delete(
            params: KeyDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KeyDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("key", "delete")
                    .body(json(clientOptions.jsonMapper, params._body()))
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

        private val blockHandler: Handler<KeyBlockResponse?> =
            jsonHandler<KeyBlockResponse?>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun block(
            params: KeyBlockParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KeyBlockResponse?> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("key", "block")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { blockHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it?.validate()
                        }
                    }
            }
        }

        private val checkHealthHandler: Handler<KeyCheckHealthResponse> =
            jsonHandler<KeyCheckHealthResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun checkHealth(
            params: KeyCheckHealthParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KeyCheckHealthResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("key", "health")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { checkHealthHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val generateHandler: Handler<GenerateKeyResponse> =
            jsonHandler<GenerateKeyResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun generate(
            params: KeyGenerateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GenerateKeyResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("key", "generate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { generateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val regenerateByKeyHandler: Handler<GenerateKeyResponse?> =
            jsonHandler<GenerateKeyResponse?>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun regenerateByKey(
            params: KeyRegenerateByKeyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GenerateKeyResponse?> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("key", params._pathParam(0), "regenerate")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { regenerateByKeyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it?.validate()
                        }
                    }
            }
        }

        private val retrieveInfoHandler: Handler<KeyRetrieveInfoResponse> =
            jsonHandler<KeyRetrieveInfoResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieveInfo(
            params: KeyRetrieveInfoParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KeyRetrieveInfoResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("key", "info")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveInfoHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val unblockHandler: Handler<KeyUnblockResponse> =
            jsonHandler<KeyUnblockResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun unblock(
            params: KeyUnblockParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KeyUnblockResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("key", "unblock")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { unblockHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
