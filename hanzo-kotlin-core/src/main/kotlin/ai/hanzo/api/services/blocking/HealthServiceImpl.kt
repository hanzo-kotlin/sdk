// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.handlers.errorBodyHandler
import ai.hanzo.api.core.handlers.errorHandler
import ai.hanzo.api.core.handlers.jsonHandler
import ai.hanzo.api.core.http.HttpMethod
import ai.hanzo.api.core.http.HttpRequest
import ai.hanzo.api.core.http.HttpResponse
import ai.hanzo.api.core.http.HttpResponse.Handler
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.core.http.parseable
import ai.hanzo.api.core.prepare
import ai.hanzo.api.models.health.HealthCheckAllParams
import ai.hanzo.api.models.health.HealthCheckAllResponse
import ai.hanzo.api.models.health.HealthCheckLivelinessParams
import ai.hanzo.api.models.health.HealthCheckLivelinessResponse
import ai.hanzo.api.models.health.HealthCheckLivenessParams
import ai.hanzo.api.models.health.HealthCheckLivenessResponse
import ai.hanzo.api.models.health.HealthCheckReadinessParams
import ai.hanzo.api.models.health.HealthCheckReadinessResponse
import ai.hanzo.api.models.health.HealthCheckServicesParams
import ai.hanzo.api.models.health.HealthCheckServicesResponse

class HealthServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    HealthService {

    private val withRawResponse: HealthService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): HealthService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): HealthService =
        HealthServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun checkAll(
        params: HealthCheckAllParams,
        requestOptions: RequestOptions,
    ): HealthCheckAllResponse =
        // get /health
        withRawResponse().checkAll(params, requestOptions).parse()

    override fun checkLiveliness(
        params: HealthCheckLivelinessParams,
        requestOptions: RequestOptions,
    ): HealthCheckLivelinessResponse =
        // get /health/liveliness
        withRawResponse().checkLiveliness(params, requestOptions).parse()

    override fun checkLiveness(
        params: HealthCheckLivenessParams,
        requestOptions: RequestOptions,
    ): HealthCheckLivenessResponse =
        // get /health/liveness
        withRawResponse().checkLiveness(params, requestOptions).parse()

    override fun checkReadiness(
        params: HealthCheckReadinessParams,
        requestOptions: RequestOptions,
    ): HealthCheckReadinessResponse =
        // get /health/readiness
        withRawResponse().checkReadiness(params, requestOptions).parse()

    override fun checkServices(
        params: HealthCheckServicesParams,
        requestOptions: RequestOptions,
    ): HealthCheckServicesResponse =
        // get /health/services
        withRawResponse().checkServices(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HealthService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): HealthService.WithRawResponse =
            HealthServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val checkAllHandler: Handler<HealthCheckAllResponse> =
            jsonHandler<HealthCheckAllResponse>(clientOptions.jsonMapper)

        override fun checkAll(
            params: HealthCheckAllParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HealthCheckAllResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("health")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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

        override fun checkLiveliness(
            params: HealthCheckLivelinessParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HealthCheckLivelinessResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("health", "liveliness")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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

        override fun checkLiveness(
            params: HealthCheckLivenessParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HealthCheckLivenessResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("health", "liveness")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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

        override fun checkReadiness(
            params: HealthCheckReadinessParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HealthCheckReadinessResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("health", "readiness")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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

        override fun checkServices(
            params: HealthCheckServicesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HealthCheckServicesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("health", "services")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
