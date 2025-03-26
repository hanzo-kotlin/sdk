// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
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

interface HealthService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * 🚨 USE `/health/liveliness` to health check the proxy 🚨
     *
     * See more 👉 https://docs.llm.ai/docs/proxy/health
     *
     * Check the health of all the endpoints in config.yaml
     *
     * To run health checks in the background, add this to config.yaml:
     * ```
     * general_settings:
     *     # ... other settings
     *     background_health_checks: True
     * ```
     *
     * else, the health checks will be run on models when /health is called.
     */
    fun checkAll(
        params: HealthCheckAllParams = HealthCheckAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HealthCheckAllResponse

    /** @see [checkAll] */
    fun checkAll(requestOptions: RequestOptions): HealthCheckAllResponse =
        checkAll(HealthCheckAllParams.none(), requestOptions)

    /** Unprotected endpoint for checking if worker is alive */
    fun checkLiveliness(
        params: HealthCheckLivelinessParams = HealthCheckLivelinessParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HealthCheckLivelinessResponse

    /** @see [checkLiveliness] */
    fun checkLiveliness(requestOptions: RequestOptions): HealthCheckLivelinessResponse =
        checkLiveliness(HealthCheckLivelinessParams.none(), requestOptions)

    /** Unprotected endpoint for checking if worker is alive */
    fun checkLiveness(
        params: HealthCheckLivenessParams = HealthCheckLivenessParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HealthCheckLivenessResponse

    /** @see [checkLiveness] */
    fun checkLiveness(requestOptions: RequestOptions): HealthCheckLivenessResponse =
        checkLiveness(HealthCheckLivenessParams.none(), requestOptions)

    /** Unprotected endpoint for checking if worker can receive requests */
    fun checkReadiness(
        params: HealthCheckReadinessParams = HealthCheckReadinessParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HealthCheckReadinessResponse

    /** @see [checkReadiness] */
    fun checkReadiness(requestOptions: RequestOptions): HealthCheckReadinessResponse =
        checkReadiness(HealthCheckReadinessParams.none(), requestOptions)

    /**
     * Use this admin-only endpoint to check if the service is healthy.
     *
     * Example:
     * ```
     * curl -L -X GET 'http://0.0.0.0:4000/health/services?service=datadog'     -H 'Authorization: Bearer sk-1234'
     * ```
     */
    fun checkServices(
        params: HealthCheckServicesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HealthCheckServicesResponse

    /** A view of [HealthService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /health`, but is otherwise the same as
         * [HealthService.checkAll].
         */
        @MustBeClosed
        fun checkAll(
            params: HealthCheckAllParams = HealthCheckAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HealthCheckAllResponse>

        /** @see [checkAll] */
        @MustBeClosed
        fun checkAll(requestOptions: RequestOptions): HttpResponseFor<HealthCheckAllResponse> =
            checkAll(HealthCheckAllParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /health/liveliness`, but is otherwise the same as
         * [HealthService.checkLiveliness].
         */
        @MustBeClosed
        fun checkLiveliness(
            params: HealthCheckLivelinessParams = HealthCheckLivelinessParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HealthCheckLivelinessResponse>

        /** @see [checkLiveliness] */
        @MustBeClosed
        fun checkLiveliness(
            requestOptions: RequestOptions
        ): HttpResponseFor<HealthCheckLivelinessResponse> =
            checkLiveliness(HealthCheckLivelinessParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /health/liveness`, but is otherwise the same as
         * [HealthService.checkLiveness].
         */
        @MustBeClosed
        fun checkLiveness(
            params: HealthCheckLivenessParams = HealthCheckLivenessParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HealthCheckLivenessResponse>

        /** @see [checkLiveness] */
        @MustBeClosed
        fun checkLiveness(
            requestOptions: RequestOptions
        ): HttpResponseFor<HealthCheckLivenessResponse> =
            checkLiveness(HealthCheckLivenessParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /health/readiness`, but is otherwise the same as
         * [HealthService.checkReadiness].
         */
        @MustBeClosed
        fun checkReadiness(
            params: HealthCheckReadinessParams = HealthCheckReadinessParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HealthCheckReadinessResponse>

        /** @see [checkReadiness] */
        @MustBeClosed
        fun checkReadiness(
            requestOptions: RequestOptions
        ): HttpResponseFor<HealthCheckReadinessResponse> =
            checkReadiness(HealthCheckReadinessParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /health/services`, but is otherwise the same as
         * [HealthService.checkServices].
         */
        @MustBeClosed
        fun checkServices(
            params: HealthCheckServicesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HealthCheckServicesResponse>
    }
}
