// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.model.update

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.Params
import ai.hanzo.api.core.checkRequired
import ai.hanzo.api.core.http.Headers
import ai.hanzo.api.core.http.QueryParams
import java.util.Objects

/**
 * PATCH Endpoint for partial model updates.
 *
 * Only updates the fields specified in the request while preserving other existing values. Follows
 * proper PATCH semantics by only modifying provided fields.
 *
 * Args: model_id: The ID of the model to update patch_data: The fields to update and their new
 * values user_api_key_dict: User authentication information
 *
 * Returns: Updated model information
 *
 * Raises: ProxyException: For various error conditions including authentication and database errors
 */
class UpdatePartialParams
private constructor(
    private val modelId: String,
    private val updateDeployment: UpdateDeployment,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun modelId(): String = modelId

    fun updateDeployment(): UpdateDeployment = updateDeployment

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        updateDeployment._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UpdatePartialParams].
         *
         * The following fields are required:
         * ```kotlin
         * .modelId()
         * .updateDeployment()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [UpdatePartialParams]. */
    class Builder internal constructor() {

        private var modelId: String? = null
        private var updateDeployment: UpdateDeployment? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(updatePartialParams: UpdatePartialParams) = apply {
            modelId = updatePartialParams.modelId
            updateDeployment = updatePartialParams.updateDeployment
            additionalHeaders = updatePartialParams.additionalHeaders.toBuilder()
            additionalQueryParams = updatePartialParams.additionalQueryParams.toBuilder()
        }

        fun modelId(modelId: String) = apply { this.modelId = modelId }

        fun updateDeployment(updateDeployment: UpdateDeployment) = apply {
            this.updateDeployment = updateDeployment
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
         * Returns an immutable instance of [UpdatePartialParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .modelId()
         * .updateDeployment()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UpdatePartialParams =
            UpdatePartialParams(
                checkRequired("modelId", modelId),
                checkRequired("updateDeployment", updateDeployment),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    internal fun _body(): UpdateDeployment = updateDeployment

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> modelId
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UpdatePartialParams && modelId == other.modelId && updateDeployment == other.updateDeployment && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(modelId, updateDeployment, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "UpdatePartialParams{modelId=$modelId, updateDeployment=$updateDeployment, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
