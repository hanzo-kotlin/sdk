// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.config

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
import ai.hanzo.api.core.prepareAsync
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointCreateParams
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointCreateResponse
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointDeleteParams
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointListParams
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointResponse
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointUpdateParams
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointUpdateResponse

class PassThroughEndpointServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : PassThroughEndpointServiceAsync {

    private val withRawResponse: PassThroughEndpointServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PassThroughEndpointServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): PassThroughEndpointServiceAsync =
        PassThroughEndpointServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: PassThroughEndpointCreateParams,
        requestOptions: RequestOptions,
    ): PassThroughEndpointCreateResponse =
        // post /config/pass_through_endpoint
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun update(
        params: PassThroughEndpointUpdateParams,
        requestOptions: RequestOptions,
    ): PassThroughEndpointUpdateResponse =
        // post /config/pass_through_endpoint/{endpoint_id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: PassThroughEndpointListParams,
        requestOptions: RequestOptions,
    ): PassThroughEndpointResponse =
        // get /config/pass_through_endpoint
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(
        params: PassThroughEndpointDeleteParams,
        requestOptions: RequestOptions,
    ): PassThroughEndpointResponse =
        // delete /config/pass_through_endpoint
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PassThroughEndpointServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PassThroughEndpointServiceAsync.WithRawResponse =
            PassThroughEndpointServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<PassThroughEndpointCreateResponse> =
            jsonHandler<PassThroughEndpointCreateResponse>(clientOptions.jsonMapper)

        override suspend fun create(
            params: PassThroughEndpointCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PassThroughEndpointCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("config", "pass_through_endpoint")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val updateHandler: Handler<PassThroughEndpointUpdateResponse> =
            jsonHandler<PassThroughEndpointUpdateResponse>(clientOptions.jsonMapper)

        override suspend fun update(
            params: PassThroughEndpointUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PassThroughEndpointUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("endpointId", params.endpointId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("config", "pass_through_endpoint", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val listHandler: Handler<PassThroughEndpointResponse> =
            jsonHandler<PassThroughEndpointResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: PassThroughEndpointListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PassThroughEndpointResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("config", "pass_through_endpoint")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val deleteHandler: Handler<PassThroughEndpointResponse> =
            jsonHandler<PassThroughEndpointResponse>(clientOptions.jsonMapper)

        override suspend fun delete(
            params: PassThroughEndpointDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PassThroughEndpointResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("config", "pass_through_endpoint")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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
    }
}
