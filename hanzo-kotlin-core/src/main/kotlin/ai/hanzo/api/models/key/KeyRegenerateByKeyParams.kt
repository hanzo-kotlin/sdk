// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.Params
import ai.hanzo.api.core.http.Headers
import ai.hanzo.api.core.http.QueryParams
import ai.hanzo.api.core.immutableEmptyMap
import ai.hanzo.api.models.key.regenerate.RegenerateKeyRequest
import java.util.Objects

/**
 * Regenerate an existing API key while optionally updating its parameters.
 *
 * Parameters:
 * - key: str (path parameter) - The key to regenerate
 * - data: Optional[RegenerateKeyRequest] - Request body containing optional parameters to update
 *     - key_alias: Optional[str] - User-friendly key alias
 *     - user_id: Optional[str] - User ID associated with key
 *     - team_id: Optional[str] - Team ID associated with key
 *     - models: Optional[list] - Model_name's a user is allowed to call
 *     - tags: Optional[List[str]] - Tags for organizing keys (Enterprise only)
 *     - spend: Optional[float] - Amount spent by key
 *     - max_budget: Optional[float] - Max budget for key
 *     - model_max_budget: Optional[Dict[str, BudgetConfig]] - Model-specific budgets {"gpt-4":
 *       {"budget_limit": 0.0005, "time_period": "30d"}}
 *     - budget_duration: Optional[str] - Budget reset period ("30d", "1h", etc.)
 *     - soft_budget: Optional[float] - Soft budget limit (warning vs. hard stop). Will trigger a
 *       slack alert when this soft budget is reached.
 *     - max_parallel_requests: Optional[int] - Rate limit for parallel requests
 *     - metadata: Optional[dict] - Metadata for key. Example {"team": "core-infra", "app": "app2"}
 *     - tpm_limit: Optional[int] - Tokens per minute limit
 *     - rpm_limit: Optional[int] - Requests per minute limit
 *     - model_rpm_limit: Optional[dict] - Model-specific RPM limits {"gpt-4": 100, "claude-v1":
 *       200}
 *     - model_tpm_limit: Optional[dict] - Model-specific TPM limits {"gpt-4": 100000, "claude-v1":
 *       200000}
 *     - allowed_cache_controls: Optional[list] - List of allowed cache control values
 *     - duration: Optional[str] - Key validity duration ("30d", "1h", etc.)
 *     - permissions: Optional[dict] - Key-specific permissions
 *     - guardrails: Optional[List[str]] - List of active guardrails for the key
 *     - blocked: Optional[bool] - Whether the key is blocked
 *
 * Returns:
 * - GenerateKeyResponse containing the new key and its updated parameters
 *
 * Example:
 * ```bash
 * curl --location --request POST 'http://localhost:4000/key/sk-1234/regenerate'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data-raw '{
 *     "max_budget": 100,
 *     "metadata": {"team": "core-infra"},
 *     "models": ["gpt-4", "gpt-3.5-turbo"]
 * }'
 * ```
 *
 * Note: This is an Enterprise feature. It requires a premium license to use.
 */
class KeyRegenerateByKeyParams
private constructor(
    private val pathKey: String?,
    private val llmChangedBy: String?,
    private val regenerateKeyRequest: RegenerateKeyRequest?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun pathKey(): String? = pathKey

    /**
     * The llm-changed-by header enables tracking of actions performed by authorized users on behalf
     * of other users, providing an audit trail for accountability
     */
    fun llmChangedBy(): String? = llmChangedBy

    fun regenerateKeyRequest(): RegenerateKeyRequest? = regenerateKeyRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        regenerateKeyRequest?._additionalProperties() ?: immutableEmptyMap()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): KeyRegenerateByKeyParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [KeyRegenerateByKeyParams]. */
        fun builder() = Builder()
    }

    /** A builder for [KeyRegenerateByKeyParams]. */
    class Builder internal constructor() {

        private var pathKey: String? = null
        private var llmChangedBy: String? = null
        private var regenerateKeyRequest: RegenerateKeyRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(keyRegenerateByKeyParams: KeyRegenerateByKeyParams) = apply {
            pathKey = keyRegenerateByKeyParams.pathKey
            llmChangedBy = keyRegenerateByKeyParams.llmChangedBy
            regenerateKeyRequest = keyRegenerateByKeyParams.regenerateKeyRequest
            additionalHeaders = keyRegenerateByKeyParams.additionalHeaders.toBuilder()
            additionalQueryParams = keyRegenerateByKeyParams.additionalQueryParams.toBuilder()
        }

        fun pathKey(pathKey: String?) = apply { this.pathKey = pathKey }

        /**
         * The llm-changed-by header enables tracking of actions performed by authorized users on
         * behalf of other users, providing an audit trail for accountability
         */
        fun llmChangedBy(llmChangedBy: String?) = apply { this.llmChangedBy = llmChangedBy }

        fun regenerateKeyRequest(regenerateKeyRequest: RegenerateKeyRequest?) = apply {
            this.regenerateKeyRequest = regenerateKeyRequest
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
         * Returns an immutable instance of [KeyRegenerateByKeyParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): KeyRegenerateByKeyParams =
            KeyRegenerateByKeyParams(
                pathKey,
                llmChangedBy,
                regenerateKeyRequest,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): RegenerateKeyRequest? = regenerateKeyRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> pathKey ?: ""
            else -> ""
        }

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

        return other is KeyRegenerateByKeyParams &&
            pathKey == other.pathKey &&
            llmChangedBy == other.llmChangedBy &&
            regenerateKeyRequest == other.regenerateKeyRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            pathKey,
            llmChangedBy,
            regenerateKeyRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "KeyRegenerateByKeyParams{pathKey=$pathKey, llmChangedBy=$llmChangedBy, regenerateKeyRequest=$regenerateKeyRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
