// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

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
import ai.hanzo.api.core.prepare
import ai.hanzo.api.models.assistants.AssistantCreateParams
import ai.hanzo.api.models.assistants.AssistantCreateResponse
import ai.hanzo.api.models.assistants.AssistantDeleteParams
import ai.hanzo.api.models.assistants.AssistantDeleteResponse
import ai.hanzo.api.models.assistants.AssistantListParams
import ai.hanzo.api.models.assistants.AssistantListResponse

class AssistantServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AssistantService {

    private val withRawResponse: AssistantService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AssistantService.WithRawResponse = withRawResponse

    override fun create(
        params: AssistantCreateParams,
        requestOptions: RequestOptions,
    ): AssistantCreateResponse =
        // post /v1/assistants
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: AssistantListParams,
        requestOptions: RequestOptions,
    ): AssistantListResponse =
        // get /v1/assistants
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: AssistantDeleteParams,
        requestOptions: RequestOptions,
    ): AssistantDeleteResponse =
        // delete /v1/assistants/{assistant_id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AssistantService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<AssistantCreateResponse> =
            jsonHandler<AssistantCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: AssistantCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssistantCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "assistants")
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

        private val listHandler: Handler<AssistantListResponse> =
            jsonHandler<AssistantListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: AssistantListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssistantListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "assistants")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val deleteHandler: Handler<AssistantDeleteResponse> =
            jsonHandler<AssistantDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: AssistantDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssistantDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("assistantId", params.assistantId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "assistants", params._pathParam(0))
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
    }
}
