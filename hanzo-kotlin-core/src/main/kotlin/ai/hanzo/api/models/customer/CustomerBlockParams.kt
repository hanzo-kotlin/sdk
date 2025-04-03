// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.customer

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.Params
import ai.hanzo.api.core.checkRequired
import ai.hanzo.api.core.http.Headers
import ai.hanzo.api.core.http.QueryParams
import java.util.Objects

/**
 * [BETA] Reject calls with this end-user id
 *
 * Parameters:
 * - user_ids (List[str], required): The unique `user_id`s for the users to block
 *
 *   (any /chat/completion call with this user={end-user-id} param, will be rejected.)
 *
 *   ``` curl -X POST "http://0.0.0.0:8000/user/block" -H "Authorization: Bearer sk-1234" -d '{
 *   "user_ids": [<user_id>, ...] }' ```
 */
class CustomerBlockParams
private constructor(
    private val blockUsers: BlockUsers,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun blockUsers(): BlockUsers = blockUsers

    fun _additionalBodyProperties(): Map<String, JsonValue> = blockUsers._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomerBlockParams].
         *
         * The following fields are required:
         * ```kotlin
         * .blockUsers()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CustomerBlockParams]. */
    class Builder internal constructor() {

        private var blockUsers: BlockUsers? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(customerBlockParams: CustomerBlockParams) = apply {
            blockUsers = customerBlockParams.blockUsers
            additionalHeaders = customerBlockParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerBlockParams.additionalQueryParams.toBuilder()
        }

        fun blockUsers(blockUsers: BlockUsers) = apply { this.blockUsers = blockUsers }

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
         * Returns an immutable instance of [CustomerBlockParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .blockUsers()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerBlockParams =
            CustomerBlockParams(
                checkRequired("blockUsers", blockUsers),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): BlockUsers = blockUsers

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerBlockParams && blockUsers == other.blockUsers && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(blockUsers, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerBlockParams{blockUsers=$blockUsers, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
