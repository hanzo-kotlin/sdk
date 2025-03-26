// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

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
import com.hanzo_ai.api.core.http.parseable
import com.hanzo_ai.api.core.prepareAsync
import com.hanzo_ai.api.models.health.HealthCheckAllParams
import com.hanzo_ai.api.models.health.HealthCheckAllResponse
import com.hanzo_ai.api.models.health.HealthCheckLivelinessParams
import com.hanzo_ai.api.models.health.HealthCheckLivelinessResponse
import com.hanzo_ai.api.models.health.HealthCheckLivenessParams
import com.hanzo_ai.api.models.health.HealthCheckLivenessResponse
import com.hanzo_ai.api.models.health.HealthCheckReadinessParams
import com.hanzo_ai.api.models.health.HealthCheckReadinessResponse
import com.hanzo_ai.api.models.health.HealthCheckServicesParams
import com.hanzo_ai.api.models.health.HealthCheckServicesResponse

class HealthServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    HealthServiceAsync {

    private val withRawResponse: HealthServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): HealthServiceAsync.WithRawResponse = withRawResponse

    override suspend fun checkAll(
        params: HealthCheckAllParams,
        requestOptions: RequestOptions,
    ): HealthCheckAllResponse =
        // get /health
        withRawResponse().checkAll(params, requestOptions).parse()

    override suspend fun checkLiveliness(
        params: HealthCheckLivelinessParams,
        requestOptions: RequestOptions,
    ): HealthCheckLivelinessResponse =
        // get /health/liveliness
        withRawResponse().checkLiveliness(params, requestOptions).parse()

    override suspend fun checkLiveness(
        params: HealthCheckLivenessParams,
        requestOptions: RequestOptions,
    ): HealthCheckLivenessResponse =
        // get /health/liveness
        withRawResponse().checkLiveness(params, requestOptions).parse()

    override suspend fun checkReadiness(
        params: HealthCheckReadinessParams,
        requestOptions: RequestOptions,
    ): HealthCheckReadinessResponse =
        // get /health/readiness
        withRawResponse().checkReadiness(params, requestOptions).parse()

    override suspend fun checkServices(
        params: HealthCheckServicesParams,
        requestOptions: RequestOptions,
    ): HealthCheckServicesResponse =
        // get /health/services
        withRawResponse().checkServices(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HealthServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val checkAllHandler: Handler<HealthCheckAllResponse> =
            jsonHandler<HealthCheckAllResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun checkAll(
            params: HealthCheckAllParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HealthCheckAllResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("health")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { checkAllHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val checkLivelinessHandler: Handler<HealthCheckLivelinessResponse> =
            jsonHandler<HealthCheckLivelinessResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun checkLiveliness(
            params: HealthCheckLivelinessParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HealthCheckLivelinessResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("health", "liveliness")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { checkLivelinessHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val checkLivenessHandler: Handler<HealthCheckLivenessResponse> =
            jsonHandler<HealthCheckLivenessResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun checkLiveness(
            params: HealthCheckLivenessParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HealthCheckLivenessResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("health", "liveness")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { checkLivenessHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val checkReadinessHandler: Handler<HealthCheckReadinessResponse> =
            jsonHandler<HealthCheckReadinessResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun checkReadiness(
            params: HealthCheckReadinessParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HealthCheckReadinessResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("health", "readiness")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { checkReadinessHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val checkServicesHandler: Handler<HealthCheckServicesResponse> =
            jsonHandler<HealthCheckServicesResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun checkServices(
            params: HealthCheckServicesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HealthCheckServicesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("health", "services")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { checkServicesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
