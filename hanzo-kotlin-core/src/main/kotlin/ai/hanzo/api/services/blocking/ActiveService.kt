// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.active.ActiveListCallbacksParams
import ai.hanzo.api.models.active.ActiveListCallbacksResponse
import com.google.errorprone.annotations.MustBeClosed

interface ActiveService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ActiveService

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
    fun listCallbacks(
        params: ActiveListCallbacksParams = ActiveListCallbacksParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActiveListCallbacksResponse

    /** @see listCallbacks */
    fun listCallbacks(requestOptions: RequestOptions): ActiveListCallbacksResponse =
        listCallbacks(ActiveListCallbacksParams.none(), requestOptions)

    /** A view of [ActiveService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ActiveService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/callbacks`, but is otherwise the same as
         * [ActiveService.listCallbacks].
         */
        @MustBeClosed
        fun listCallbacks(
            params: ActiveListCallbacksParams = ActiveListCallbacksParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActiveListCallbacksResponse>

        /** @see listCallbacks */
        @MustBeClosed
        fun listCallbacks(
            requestOptions: RequestOptions
        ): HttpResponseFor<ActiveListCallbacksResponse> =
            listCallbacks(ActiveListCallbacksParams.none(), requestOptions)
    }
}
