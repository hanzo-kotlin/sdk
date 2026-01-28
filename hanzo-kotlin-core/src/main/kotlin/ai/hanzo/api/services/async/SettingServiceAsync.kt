// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.settings.SettingRetrieveParams
import ai.hanzo.api.models.settings.SettingRetrieveResponse
import com.google.errorprone.annotations.MustBeClosed

interface SettingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SettingServiceAsync

    /**
     * Returns a list of litellm level settings
     *
     * This is useful for debugging and ensuring the proxy server is configured correctly.
     *
     * Response schema:
     * ```
     * {
     *     "alerting": _alerting,
     *     "litellm.callbacks": litellm_callbacks,
     *     "litellm.input_callback": litellm_input_callbacks,
     *     "litellm.failure_callback": litellm_failure_callbacks,
     *     "litellm.success_callback": litellm_success_callbacks,
     *     "litellm._async_success_callback": litellm_async_success_callbacks,
     *     "litellm._async_failure_callback": litellm_async_failure_callbacks,
     *     "litellm._async_input_callback": litellm_async_input_callbacks,
     *     "all_litellm_callbacks": all_litellm_callbacks,
     *     "num_callbacks": len(all_litellm_callbacks),
     *     "num_alerting": _num_alerting,
     *     "litellm.request_timeout": litellm.request_timeout,
     * }
     * ```
     */
    suspend fun retrieve(
        params: SettingRetrieveParams = SettingRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingRetrieveResponse

    /** @see retrieve */
    suspend fun retrieve(requestOptions: RequestOptions): SettingRetrieveResponse =
        retrieve(SettingRetrieveParams.none(), requestOptions)

    /**
     * A view of [SettingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SettingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /settings`, but is otherwise the same as
         * [SettingServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: SettingRetrieveParams = SettingRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            requestOptions: RequestOptions
        ): HttpResponseFor<SettingRetrieveResponse> =
            retrieve(SettingRetrieveParams.none(), requestOptions)
    }
}
