// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking.config

import com.hanzo_ai.api.core.ClientOptions
import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.handlers.errorHandler
import com.hanzo_ai.api.core.handlers.jsonHandler
import com.hanzo_ai.api.core.handlers.withErrorHandler
import com.hanzo_ai.api.core.http.HttpMethod
import com.hanzo_ai.api.core.http.HttpRequest
import com.hanzo_ai.api.core.http.HttpResponse.Handler
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.core.http.json
import com.hanzo_ai.api.core.http.parseable
import com.hanzo_ai.api.core.prepare
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointCreateParams
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointCreateResponse
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointDeleteParams
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointListParams
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointResponse
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointUpdateParams
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointUpdateResponse

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
