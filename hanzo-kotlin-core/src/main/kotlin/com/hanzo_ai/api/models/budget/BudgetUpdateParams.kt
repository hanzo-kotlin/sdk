// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.budget

import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.core.Params
import com.hanzo_ai.api.core.checkRequired
import com.hanzo_ai.api.core.http.Headers
import com.hanzo_ai.api.core.http.QueryParams
import java.util.Objects

/**
 * Update an existing budget object.
 *
 * Parameters:
 * - budget_duration: Optional[str] - Budget reset period ("30d", "1h", etc.)
 * - budget_id: Optional[str] - The id of the budget. If not provided, a new id will be generated.
 * - max_budget: Optional[float] - The max budget for the budget.
 * - soft_budget: Optional[float] - The soft budget for the budget.
 * - max_parallel_requests: Optional[int] - The max number of parallel requests for the budget.
 * - tpm_limit: Optional[int] - The tokens per minute limit for the budget.
 * - rpm_limit: Optional[int] - The requests per minute limit for the budget.
 * - model_max_budget: Optional[dict] - Specify max budget for a given model. Example:
 *   {"openai/gpt-4o-mini": {"max_budget": 100.0, "budget_duration": "1d", "tpm_limit": 100000,
 *   "rpm_limit": 100000}}
 */
class BudgetUpdateParams
private constructor(
    private val budgetNew: BudgetNew,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun budgetNew(): BudgetNew = budgetNew

    fun _additionalBodyProperties(): Map<String, JsonValue> = budgetNew._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BudgetUpdateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .budgetNew()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BudgetUpdateParams]. */
    class Builder internal constructor() {

        private var budgetNew: BudgetNew? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(budgetUpdateParams: BudgetUpdateParams) = apply {
            budgetNew = budgetUpdateParams.budgetNew
            additionalHeaders = budgetUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = budgetUpdateParams.additionalQueryParams.toBuilder()
        }

        fun budgetNew(budgetNew: BudgetNew) = apply { this.budgetNew = budgetNew }

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
         * Returns an immutable instance of [BudgetUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .budgetNew()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BudgetUpdateParams =
            BudgetUpdateParams(
                checkRequired("budgetNew", budgetNew),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    internal fun _body(): BudgetNew = budgetNew

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BudgetUpdateParams && budgetNew == other.budgetNew && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(budgetNew, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BudgetUpdateParams{budgetNew=$budgetNew, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
