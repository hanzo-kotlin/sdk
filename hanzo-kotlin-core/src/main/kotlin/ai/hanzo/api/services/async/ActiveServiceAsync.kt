// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.active.ActiveListCallbacksParams
import ai.hanzo.api.models.active.ActiveListCallbacksResponse
import com.google.errorprone.annotations.MustBeClosed

interface ActiveServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ActiveServiceAsync

    /**
     * Returns a list of llm level settings
     *
     * This is useful for debugging and ensuring the proxy server is configured correctly.
     *
     * Response schema:
     * ```
     * {
     *     "alerting": _alerting,
     *     "llm.callbacks": llm_callbacks,
     *     "llm.input_callback": llm_input_callbacks,
     *     "llm.failure_callback": llm_failure_callbacks,
     *     "llm.success_callback": llm_success_callbacks,
     *     "llm._async_success_callback": llm_async_success_callbacks,
     *     "llm._async_failure_callback": llm_async_failure_callbacks,
     *     "llm._async_input_callback": llm_async_input_callbacks,
     *     "all_llm_callbacks": all_llm_callbacks,
     *     "num_callbacks": len(all_llm_callbacks),
     *     "num_alerting": _num_alerting,
     *     "llm.request_timeout": llm.request_timeout,
     * }
     * ```
     */
    suspend fun listCallbacks(
        params: ActiveListCallbacksParams = ActiveListCallbacksParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActiveListCallbacksResponse

    /** @see [listCallbacks] */
    suspend fun listCallbacks(requestOptions: RequestOptions): ActiveListCallbacksResponse =
        listCallbacks(ActiveListCallbacksParams.none(), requestOptions)

    /**
     * A view of [ActiveServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ActiveServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/callbacks`, but is otherwise the same as
         * [ActiveServiceAsync.listCallbacks].
         */
        @MustBeClosed
        suspend fun listCallbacks(
            params: ActiveListCallbacksParams = ActiveListCallbacksParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActiveListCallbacksResponse>

        /** @see [listCallbacks] */
        @MustBeClosed
        suspend fun listCallbacks(
            requestOptions: RequestOptions
        ): HttpResponseFor<ActiveListCallbacksResponse> =
            listCallbacks(ActiveListCallbacksParams.none(), requestOptions)
    }
}
