// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
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
import com.google.errorprone.annotations.MustBeClosed

interface HealthServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): HealthServiceAsync

    /**
     * 🚨 USE `/health/liveliness` to health check the proxy 🚨
     *
     * See more 👉 https://docs.litellm.ai/docs/proxy/health
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

    /** @see checkAll */
    suspend fun checkAll(requestOptions: RequestOptions): HealthCheckAllResponse =
        checkAll(HealthCheckAllParams.none(), requestOptions)

    /** Unprotected endpoint for checking if worker is alive */
    suspend fun checkLiveliness(
        params: HealthCheckLivelinessParams = HealthCheckLivelinessParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HealthCheckLivelinessResponse

    /** @see checkLiveliness */
    suspend fun checkLiveliness(requestOptions: RequestOptions): HealthCheckLivelinessResponse =
        checkLiveliness(HealthCheckLivelinessParams.none(), requestOptions)

    /** Unprotected endpoint for checking if worker is alive */
    suspend fun checkLiveness(
        params: HealthCheckLivenessParams = HealthCheckLivenessParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HealthCheckLivenessResponse

    /** @see checkLiveness */
    suspend fun checkLiveness(requestOptions: RequestOptions): HealthCheckLivenessResponse =
        checkLiveness(HealthCheckLivenessParams.none(), requestOptions)

    /** Unprotected endpoint for checking if worker can receive requests */
    suspend fun checkReadiness(
        params: HealthCheckReadinessParams = HealthCheckReadinessParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HealthCheckReadinessResponse

    /** @see checkReadiness */
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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): HealthServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /health`, but is otherwise the same as
         * [HealthServiceAsync.checkAll].
         */
        @MustBeClosed
        suspend fun checkAll(
            params: HealthCheckAllParams = HealthCheckAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HealthCheckAllResponse>

        /** @see checkAll */
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

        /** @see checkLiveliness */
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

        /** @see checkLiveness */
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

        /** @see checkReadiness */
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
