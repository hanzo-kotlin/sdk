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
import ai.hanzo.api.models.anthropic.AnthropicCreateParams
import ai.hanzo.api.models.anthropic.AnthropicCreateResponse
import ai.hanzo.api.models.anthropic.AnthropicDeleteParams
import ai.hanzo.api.models.anthropic.AnthropicDeleteResponse
import ai.hanzo.api.models.anthropic.AnthropicModifyParams
import ai.hanzo.api.models.anthropic.AnthropicModifyResponse
import ai.hanzo.api.models.anthropic.AnthropicRetrieveParams
import ai.hanzo.api.models.anthropic.AnthropicRetrieveResponse
import ai.hanzo.api.models.anthropic.AnthropicUpdateParams
import ai.hanzo.api.models.anthropic.AnthropicUpdateResponse

class AnthropicServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AnthropicService {

    private val withRawResponse: AnthropicService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AnthropicService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AnthropicService =
        AnthropicServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: AnthropicCreateParams,
        requestOptions: RequestOptions,
    ): AnthropicCreateResponse =
        // post /anthropic/{endpoint}
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: AnthropicRetrieveParams,
        requestOptions: RequestOptions,
    ): AnthropicRetrieveResponse =
        // get /anthropic/{endpoint}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: AnthropicUpdateParams,
        requestOptions: RequestOptions,
    ): AnthropicUpdateResponse =
        // put /anthropic/{endpoint}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(
        params: AnthropicDeleteParams,
        requestOptions: RequestOptions,
    ): AnthropicDeleteResponse =
        // delete /anthropic/{endpoint}
        withRawResponse().delete(params, requestOptions).parse()

    override fun modify(
        params: AnthropicModifyParams,
        requestOptions: RequestOptions,
    ): AnthropicModifyResponse =
        // patch /anthropic/{endpoint}
        withRawResponse().modify(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AnthropicService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AnthropicService.WithRawResponse =
            AnthropicServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<AnthropicCreateResponse> =
            jsonHandler<AnthropicCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AnthropicCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnthropicCreateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("endpoint", params.endpoint())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("anthropic", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<AnthropicRetrieveResponse> =
            jsonHandler<AnthropicRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AnthropicRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnthropicRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("endpoint", params.endpoint())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("anthropic", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<AnthropicUpdateResponse> =
            jsonHandler<AnthropicUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: AnthropicUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnthropicUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("endpoint", params.endpoint())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("anthropic", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
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

        private val deleteHandler: Handler<AnthropicDeleteResponse> =
            jsonHandler<AnthropicDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: AnthropicDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnthropicDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("endpoint", params.endpoint())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("anthropic", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
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

        private val modifyHandler: Handler<AnthropicModifyResponse> =
            jsonHandler<AnthropicModifyResponse>(clientOptions.jsonMapper)

        override fun modify(
            params: AnthropicModifyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnthropicModifyResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("endpoint", params.endpoint())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("anthropic", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
