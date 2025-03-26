// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.key

import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.core.Params
import com.hanzo_ai.api.core.checkRequired
import com.hanzo_ai.api.core.http.Headers
import com.hanzo_ai.api.core.http.QueryParams
import java.util.Objects

/**
 * Unblock a Virtual key to allow it to make requests again.
 *
 * Parameters:
 * - key: str - The key to unblock. Can be either the unhashed key (sk-...) or the hashed key value
 *
 * Example:
 * ```bash
 * curl --location 'http://0.0.0.0:4000/key/unblock'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data '{
 *     "key": "sk-Fn8Ej39NxjAXrvpUGKghGw"
 * }'
 * ```
 *
 * Note: This is an admin-only endpoint. Only proxy admins can unblock keys.
 */
class KeyUnblockParams
private constructor(
    private val llmChangedBy: String?,
    private val blockKeyRequest: BlockKeyRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The llm-changed-by header enables tracking of actions performed by authorized users on behalf
     * of other users, providing an audit trail for accountability
     */
    fun llmChangedBy(): String? = llmChangedBy

    fun blockKeyRequest(): BlockKeyRequest = blockKeyRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        blockKeyRequest._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [KeyUnblockParams].
         *
         * The following fields are required:
         * ```kotlin
         * .blockKeyRequest()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [KeyUnblockParams]. */
    class Builder internal constructor() {

        private var llmChangedBy: String? = null
        private var blockKeyRequest: BlockKeyRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(keyUnblockParams: KeyUnblockParams) = apply {
            llmChangedBy = keyUnblockParams.llmChangedBy
            blockKeyRequest = keyUnblockParams.blockKeyRequest
            additionalHeaders = keyUnblockParams.additionalHeaders.toBuilder()
            additionalQueryParams = keyUnblockParams.additionalQueryParams.toBuilder()
        }

        /**
         * The llm-changed-by header enables tracking of actions performed by authorized users on
         * behalf of other users, providing an audit trail for accountability
         */
        fun llmChangedBy(llmChangedBy: String?) = apply { this.llmChangedBy = llmChangedBy }

        fun blockKeyRequest(blockKeyRequest: BlockKeyRequest) = apply {
            this.blockKeyRequest = blockKeyRequest
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
         * Returns an immutable instance of [KeyUnblockParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .blockKeyRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): KeyUnblockParams =
            KeyUnblockParams(
                llmChangedBy,
                checkRequired("blockKeyRequest", blockKeyRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    internal fun _body(): BlockKeyRequest = blockKeyRequest

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                llmChangedBy?.let { put("llm-changed-by", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is KeyUnblockParams && llmChangedBy == other.llmChangedBy && blockKeyRequest == other.blockKeyRequest && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(llmChangedBy, blockKeyRequest, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "KeyUnblockParams{llmChangedBy=$llmChangedBy, blockKeyRequest=$blockKeyRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
