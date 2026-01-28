// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.checkRequired
import ai.hanzo.api.core.handlers.errorBodyHandler
import ai.hanzo.api.core.handlers.errorHandler
import ai.hanzo.api.core.handlers.jsonHandler
import ai.hanzo.api.core.http.HttpMethod
import ai.hanzo.api.core.http.HttpRequest
import ai.hanzo.api.core.http.HttpResponse
import ai.hanzo.api.core.http.HttpResponse.Handler
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.core.http.json
import ai.hanzo.api.core.http.parseable
import ai.hanzo.api.core.prepare
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
import ai.hanzo.api.services.blocking.key.RegenerateService
import ai.hanzo.api.services.blocking.key.RegenerateServiceImpl

class KeyServiceImpl internal constructor(private val clientOptions: ClientOptions) : KeyService {

    private val withRawResponse: KeyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val regenerate: RegenerateService by lazy { RegenerateServiceImpl(clientOptions) }

    override fun withRawResponse(): KeyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): KeyService =
        KeyServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun regenerate(): RegenerateService = regenerate

    override fun update(
        params: KeyUpdateParams,
        requestOptions: RequestOptions,
    ): KeyUpdateResponse =
        // post /key/update
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: KeyListParams, requestOptions: RequestOptions): KeyListResponse =
        // get /key/list
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: KeyDeleteParams,
        requestOptions: RequestOptions,
    ): KeyDeleteResponse =
        // post /key/delete
        withRawResponse().delete(params, requestOptions).parse()

    override fun block(params: KeyBlockParams, requestOptions: RequestOptions): KeyBlockResponse? =
        // post /key/block
        withRawResponse().block(params, requestOptions).parse()

    override fun checkHealth(
        params: KeyCheckHealthParams,
        requestOptions: RequestOptions,
    ): KeyCheckHealthResponse =
        // post /key/health
        withRawResponse().checkHealth(params, requestOptions).parse()

    override fun generate(
        params: KeyGenerateParams,
        requestOptions: RequestOptions,
    ): GenerateKeyResponse =
        // post /key/generate
        withRawResponse().generate(params, requestOptions).parse()

    override fun regenerateByKey(
        params: KeyRegenerateByKeyParams,
        requestOptions: RequestOptions,
    ): GenerateKeyResponse? =
        // post /key/{key}/regenerate
        withRawResponse().regenerateByKey(params, requestOptions).parse()

    override fun retrieveInfo(
        params: KeyRetrieveInfoParams,
        requestOptions: RequestOptions,
    ): KeyRetrieveInfoResponse =
        // get /key/info
        withRawResponse().retrieveInfo(params, requestOptions).parse()

    override fun unblock(
        params: KeyUnblockParams,
        requestOptions: RequestOptions,
    ): KeyUnblockResponse =
        // post /key/unblock
        withRawResponse().unblock(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        KeyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val regenerate: RegenerateService.WithRawResponse by lazy {
            RegenerateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): KeyService.WithRawResponse =
            KeyServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun regenerate(): RegenerateService.WithRawResponse = regenerate

        private val updateHandler: Handler<KeyUpdateResponse> =
            jsonHandler<KeyUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: KeyUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KeyUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("key", "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
            jsonHandler<KeyListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: KeyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KeyListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("key", "list")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
            jsonHandler<KeyDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: KeyDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KeyDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("key", "delete")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
            jsonHandler<KeyBlockResponse?>(clientOptions.jsonMapper)

        override fun block(
            params: KeyBlockParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KeyBlockResponse?> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("key", "block")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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

        override fun checkHealth(
            params: KeyCheckHealthParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KeyCheckHealthResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("key", "health")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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

        override fun generate(
            params: KeyGenerateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GenerateKeyResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("key", "generate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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

        override fun regenerateByKey(
            params: KeyRegenerateByKeyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GenerateKeyResponse?> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathKey", params.pathKey())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("key", params._pathParam(0), "regenerate")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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

        override fun retrieveInfo(
            params: KeyRetrieveInfoParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KeyRetrieveInfoResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("key", "info")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
            jsonHandler<KeyUnblockResponse>(clientOptions.jsonMapper)

        override fun unblock(
            params: KeyUnblockParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KeyUnblockResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("key", "unblock")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
