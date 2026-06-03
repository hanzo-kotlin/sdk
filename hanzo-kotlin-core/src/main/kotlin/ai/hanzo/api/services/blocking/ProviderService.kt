// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.provider.ProviderListBudgetsParams
import ai.hanzo.api.models.provider.ProviderListBudgetsResponse
import com.google.errorprone.annotations.MustBeClosed

interface ProviderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ProviderService

    /**
     * Provider Budget Routing - Get Budget, Spend Details
     * https://docs.hanzo.ai/docs/proxy/provider_budget_routing
     *
     * Use this endpoint to check current budget, spend and budget reset time for a provider
     *
     * Example Request
     *
     * ```bash
     * curl -X GET http://localhost:4000/provider/budgets     -H "Content-Type: application/json"     -H "Authorization: Bearer sk-1234"
     * ```
     *
     * Example Response
     *
     * ```json
     * {
     *     "providers": {
     *         "openai": {
     *             "budget_limit": 1e-12,
     *             "time_period": "1d",
     *             "spend": 0.0,
     *             "budget_reset_at": null
     *         },
     *         "azure": {
     *             "budget_limit": 100.0,
     *             "time_period": "1d",
     *             "spend": 0.0,
     *             "budget_reset_at": null
     *         },
     *         "anthropic": {
     *             "budget_limit": 100.0,
     *             "time_period": "10d",
     *             "spend": 0.0,
     *             "budget_reset_at": null
     *         },
     *         "vertex_ai": {
     *             "budget_limit": 100.0,
     *             "time_period": "12d",
     *             "spend": 0.0,
     *             "budget_reset_at": null
     *         }
     *     }
     * }
     * ```
     */
    fun listBudgets(
        params: ProviderListBudgetsParams = ProviderListBudgetsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProviderListBudgetsResponse

    /** @see listBudgets */
    fun listBudgets(requestOptions: RequestOptions): ProviderListBudgetsResponse =
        listBudgets(ProviderListBudgetsParams.none(), requestOptions)

    /** A view of [ProviderService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ProviderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /provider/budgets`, but is otherwise the same as
         * [ProviderService.listBudgets].
         */
        @MustBeClosed
        fun listBudgets(
            params: ProviderListBudgetsParams = ProviderListBudgetsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProviderListBudgetsResponse>

        /** @see listBudgets */
        @MustBeClosed
        fun listBudgets(
            requestOptions: RequestOptions
        ): HttpResponseFor<ProviderListBudgetsResponse> =
            listBudgets(ProviderListBudgetsParams.none(), requestOptions)
    }
}
