// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

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

interface HealthServiceAsync {

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
    suspend fun checkAll(
        params: HealthCheckAllParams = HealthCheckAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HealthCheckAllResponse

    /** @see [checkAll] */
    suspend fun checkAll(requestOptions: RequestOptions): HealthCheckAllResponse =
        checkAll(HealthCheckAllParams.none(), requestOptions)

    /** Unprotected endpoint for checking if worker is alive */
    suspend fun checkLiveliness(
        params: HealthCheckLivelinessParams = HealthCheckLivelinessParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HealthCheckLivelinessResponse

    /** @see [checkLiveliness] */
    suspend fun checkLiveliness(requestOptions: RequestOptions): HealthCheckLivelinessResponse =
        checkLiveliness(HealthCheckLivelinessParams.none(), requestOptions)

    /** Unprotected endpoint for checking if worker is alive */
    suspend fun checkLiveness(
        params: HealthCheckLivenessParams = HealthCheckLivenessParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HealthCheckLivenessResponse

    /** @see [checkLiveness] */
    suspend fun checkLiveness(requestOptions: RequestOptions): HealthCheckLivenessResponse =
        checkLiveness(HealthCheckLivenessParams.none(), requestOptions)

    /** Unprotected endpoint for checking if worker can receive requests */
    suspend fun checkReadiness(
        params: HealthCheckReadinessParams = HealthCheckReadinessParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HealthCheckReadinessResponse

    /** @see [checkReadiness] */
    suspend fun checkReadiness(requestOptions: RequestOptions): HealthCheckReadinessResponse =
        checkReadiness(HealthCheckReadinessParams.none(), requestOptions)

    /**
     * Use this admin-only endpoint to check if the service is healthy.
     *
     * Example:
     * ```
     * curl -L -X GET 'http://0.0.0.0:4000/health/services?service=datadog'     -H 'Authorization: Bearer sk-1234'
     * ```
     */
    suspend fun checkServices(
        params: HealthCheckServicesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HealthCheckServicesResponse

    /**
     * A view of [HealthServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /health`, but is otherwise the same as
         * [HealthServiceAsync.checkAll].
         */
        @MustBeClosed
        suspend fun checkAll(
            params: HealthCheckAllParams = HealthCheckAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HealthCheckAllResponse>

        /** @see [checkAll] */
        @MustBeClosed
        suspend fun checkAll(
            requestOptions: RequestOptions
        ): HttpResponseFor<HealthCheckAllResponse> =
            checkAll(HealthCheckAllParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /health/liveliness`, but is otherwise the same as
         * [HealthServiceAsync.checkLiveliness].
         */
        @MustBeClosed
        suspend fun checkLiveliness(
            params: HealthCheckLivelinessParams = HealthCheckLivelinessParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HealthCheckLivelinessResponse>

        /** @see [checkLiveliness] */
        @MustBeClosed
        suspend fun checkLiveliness(
            requestOptions: RequestOptions
        ): HttpResponseFor<HealthCheckLivelinessResponse> =
            checkLiveliness(HealthCheckLivelinessParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /health/liveness`, but is otherwise the same as
         * [HealthServiceAsync.checkLiveness].
         */
        @MustBeClosed
        suspend fun checkLiveness(
            params: HealthCheckLivenessParams = HealthCheckLivenessParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HealthCheckLivenessResponse>

        /** @see [checkLiveness] */
        @MustBeClosed
        suspend fun checkLiveness(
            requestOptions: RequestOptions
        ): HttpResponseFor<HealthCheckLivenessResponse> =
            checkLiveness(HealthCheckLivenessParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /health/readiness`, but is otherwise the same as
         * [HealthServiceAsync.checkReadiness].
         */
        @MustBeClosed
        suspend fun checkReadiness(
            params: HealthCheckReadinessParams = HealthCheckReadinessParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HealthCheckReadinessResponse>

        /** @see [checkReadiness] */
        @MustBeClosed
        suspend fun checkReadiness(
            requestOptions: RequestOptions
        ): HttpResponseFor<HealthCheckReadinessResponse> =
            checkReadiness(HealthCheckReadinessParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /health/services`, but is otherwise the same as
         * [HealthServiceAsync.checkServices].
         */
        @MustBeClosed
        suspend fun checkServices(
            params: HealthCheckServicesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HealthCheckServicesResponse>
    }
}
