// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.config

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
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointCreateParams
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointCreateResponse
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointDeleteParams
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointListParams
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointResponse
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointUpdateParams
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointUpdateResponse

class PassThroughEndpointServiceImpl
internal constructor(private val clientOptions: ClientOptions) : PassThroughEndpointService {

    private val withRawResponse: PassThroughEndpointService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PassThroughEndpointService.WithRawResponse = withRawResponse

    override fun create(
        params: PassThroughEndpointCreateParams,
        requestOptions: RequestOptions,
    ): PassThroughEndpointCreateResponse =
        // post /config/pass_through_endpoint
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: PassThroughEndpointUpdateParams,
        requestOptions: RequestOptions,
    ): PassThroughEndpointUpdateResponse =
        // post /config/pass_through_endpoint/{endpoint_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: PassThroughEndpointListParams,
        requestOptions: RequestOptions,
    ): PassThroughEndpointResponse =
        // get /config/pass_through_endpoint
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: PassThroughEndpointDeleteParams,
        requestOptions: RequestOptions,
    ): PassThroughEndpointResponse =
        // delete /config/pass_through_endpoint
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PassThroughEndpointService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<PassThroughEndpointCreateResponse> =
            jsonHandler<PassThroughEndpointCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: PassThroughEndpointCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PassThroughEndpointCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("config", "pass_through_endpoint")
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

        private val updateHandler: Handler<PassThroughEndpointUpdateResponse> =
            jsonHandler<PassThroughEndpointUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: PassThroughEndpointUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PassThroughEndpointUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("endpointId", params.endpointId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("config", "pass_through_endpoint", params._pathParam(0))
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

        private val listHandler: Handler<PassThroughEndpointResponse> =
            jsonHandler<PassThroughEndpointResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: PassThroughEndpointListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PassThroughEndpointResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("config", "pass_through_endpoint")
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

        private val deleteHandler: Handler<PassThroughEndpointResponse> =
            jsonHandler<PassThroughEndpointResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: PassThroughEndpointDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PassThroughEndpointResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("config", "pass_through_endpoint")
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
