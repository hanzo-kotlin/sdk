// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.provider

import ai.hanzo.api.core.Params
import ai.hanzo.api.core.http.Headers
import ai.hanzo.api.core.http.QueryParams
import java.util.Objects

/**
 * Provider Budget Routing - Get Budget, Spend Details
 * https://docs.llm.ai/docs/proxy/provider_budget_routing
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
 *   "providers": {
 *     "openai": {
 *       "budget_limit": 1e-12,
 *       "time_period": "1d",
 *       "spend": 0.0,
 *       "budget_reset_at": null
 *     },
 *     "azure": {
 *       "budget_limit": 100.0,
 *       "time_period": "1d",
 *       "spend": 0.0,
 *       "budget_reset_at": null
 *     },
 *     "anthropic": {
 *       "budget_limit": 100.0,
 *       "time_period": "10d",
 *       "spend": 0.0,
 *       "budget_reset_at": null
 *     },
 *     "vertex_ai": {
 *       "budget_limit": 100.0,
 *       "time_period": "12d",
 *       "spend": 0.0,
 *       "budget_reset_at": null
 *     }
 *   }
 * }
 * ```
 */
class ProviderListBudgetsParams
private constructor(
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): ProviderListBudgetsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [ProviderListBudgetsParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [ProviderListBudgetsParams]. */
    class Builder internal constructor() {

        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(providerListBudgetsParams: ProviderListBudgetsParams) = apply {
            additionalHeaders = providerListBudgetsParams.additionalHeaders.toBuilder()
            additionalQueryParams = providerListBudgetsParams.additionalQueryParams.toBuilder()
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ProviderListBudgetsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ProviderListBudgetsParams =
            ProviderListBudgetsParams(additionalHeaders.build(), additionalQueryParams.build())
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProviderListBudgetsParams && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ProviderListBudgetsParams{additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
