// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.models

import ai.hanzo.api.core.Params
import ai.hanzo.api.core.http.Headers
import ai.hanzo.api.core.http.QueryParams
import java.util.Objects

/**
 * Use `/model/info` - to get detailed model information, example - pricing, mode, etc.
 *
 * This is just for compatibility with openai projects like aider.
 *
 * Query Parameters:
 * - include_metadata: Include additional metadata in the response with fallback information
 * - fallback_type: Type of fallbacks to include ("general", "context_window", "content_policy")
 *   Defaults to "general" when include_metadata=true
 */
class ModelListParams
private constructor(
    private val fallbackType: String?,
    private val includeMetadata: Boolean?,
    private val includeModelAccessGroups: Boolean?,
    private val onlyModelAccessGroups: Boolean?,
    private val returnWildcardRoutes: Boolean?,
    private val teamId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun fallbackType(): String? = fallbackType

    fun includeMetadata(): Boolean? = includeMetadata

    fun includeModelAccessGroups(): Boolean? = includeModelAccessGroups

    fun onlyModelAccessGroups(): Boolean? = onlyModelAccessGroups

    fun returnWildcardRoutes(): Boolean? = returnWildcardRoutes

    fun teamId(): String? = teamId

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): ModelListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ModelListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [ModelListParams]. */
    class Builder internal constructor() {

        private var fallbackType: String? = null
        private var includeMetadata: Boolean? = null
        private var includeModelAccessGroups: Boolean? = null
        private var onlyModelAccessGroups: Boolean? = null
        private var returnWildcardRoutes: Boolean? = null
        private var teamId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(modelListParams: ModelListParams) = apply {
            fallbackType = modelListParams.fallbackType
            includeMetadata = modelListParams.includeMetadata
            includeModelAccessGroups = modelListParams.includeModelAccessGroups
            onlyModelAccessGroups = modelListParams.onlyModelAccessGroups
            returnWildcardRoutes = modelListParams.returnWildcardRoutes
            teamId = modelListParams.teamId
            additionalHeaders = modelListParams.additionalHeaders.toBuilder()
            additionalQueryParams = modelListParams.additionalQueryParams.toBuilder()
        }

        fun fallbackType(fallbackType: String?) = apply { this.fallbackType = fallbackType }

        fun includeMetadata(includeMetadata: Boolean?) = apply {
            this.includeMetadata = includeMetadata
        }

        /**
         * Alias for [Builder.includeMetadata].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeMetadata(includeMetadata: Boolean) = includeMetadata(includeMetadata as Boolean?)

        fun includeModelAccessGroups(includeModelAccessGroups: Boolean?) = apply {
            this.includeModelAccessGroups = includeModelAccessGroups
        }

        /**
         * Alias for [Builder.includeModelAccessGroups].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeModelAccessGroups(includeModelAccessGroups: Boolean) =
            includeModelAccessGroups(includeModelAccessGroups as Boolean?)

        fun onlyModelAccessGroups(onlyModelAccessGroups: Boolean?) = apply {
            this.onlyModelAccessGroups = onlyModelAccessGroups
        }

        /**
         * Alias for [Builder.onlyModelAccessGroups].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun onlyModelAccessGroups(onlyModelAccessGroups: Boolean) =
            onlyModelAccessGroups(onlyModelAccessGroups as Boolean?)

        fun returnWildcardRoutes(returnWildcardRoutes: Boolean?) = apply {
            this.returnWildcardRoutes = returnWildcardRoutes
        }

        /**
         * Alias for [Builder.returnWildcardRoutes].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun returnWildcardRoutes(returnWildcardRoutes: Boolean) =
            returnWildcardRoutes(returnWildcardRoutes as Boolean?)

        fun teamId(teamId: String?) = apply { this.teamId = teamId }

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
         * Returns an immutable instance of [ModelListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ModelListParams =
            ModelListParams(
                fallbackType,
                includeMetadata,
                includeModelAccessGroups,
                onlyModelAccessGroups,
                returnWildcardRoutes,
                teamId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                fallbackType?.let { put("fallback_type", it) }
                includeMetadata?.let { put("include_metadata", it.toString()) }
                includeModelAccessGroups?.let { put("include_model_access_groups", it.toString()) }
                onlyModelAccessGroups?.let { put("only_model_access_groups", it.toString()) }
                returnWildcardRoutes?.let { put("return_wildcard_routes", it.toString()) }
                teamId?.let { put("team_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ModelListParams &&
            fallbackType == other.fallbackType &&
            includeMetadata == other.includeMetadata &&
            includeModelAccessGroups == other.includeModelAccessGroups &&
            onlyModelAccessGroups == other.onlyModelAccessGroups &&
            returnWildcardRoutes == other.returnWildcardRoutes &&
            teamId == other.teamId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            fallbackType,
            includeMetadata,
            includeModelAccessGroups,
            onlyModelAccessGroups,
            returnWildcardRoutes,
            teamId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ModelListParams{fallbackType=$fallbackType, includeMetadata=$includeMetadata, includeModelAccessGroups=$includeModelAccessGroups, onlyModelAccessGroups=$onlyModelAccessGroups, returnWildcardRoutes=$returnWildcardRoutes, teamId=$teamId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
