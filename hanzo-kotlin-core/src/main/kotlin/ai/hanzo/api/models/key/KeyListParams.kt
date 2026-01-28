// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

import ai.hanzo.api.core.Params
import ai.hanzo.api.core.http.Headers
import ai.hanzo.api.core.http.QueryParams
import ai.hanzo.api.core.toImmutable
import java.util.Objects

/**
 * List all keys for a given user / team / organization.
 *
 * Parameters: expand: Optional[List[str]] - Expand related objects (e.g. 'user' to include user
 * information) status: Optional[str] - Filter by status. Currently supports "deleted" to query
 * deleted keys.
 *
 * Returns: { "keys": List[str] or List[UserAPIKeyAuth], "total_count": int, "current_page": int,
 * "total_pages": int, }
 *
 * When expand includes "user", each key object will include a "user" field with the associated user
 * object. Note: When expand=user is specified, full key objects are returned regardless of the
 * return_full_object parameter.
 */
class KeyListParams
private constructor(
    private val expand: List<String>?,
    private val includeCreatedByKeys: Boolean?,
    private val includeTeamKeys: Boolean?,
    private val keyAlias: String?,
    private val keyHash: String?,
    private val organizationId: String?,
    private val page: Long?,
    private val returnFullObject: Boolean?,
    private val size: Long?,
    private val sortBy: String?,
    private val sortOrder: String?,
    private val status: String?,
    private val teamId: String?,
    private val userId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Expand related objects (e.g. 'user') */
    fun expand(): List<String>? = expand

    /** Include keys created by the user */
    fun includeCreatedByKeys(): Boolean? = includeCreatedByKeys

    /** Include all keys for teams that user is an admin of. */
    fun includeTeamKeys(): Boolean? = includeTeamKeys

    /** Filter keys by key alias */
    fun keyAlias(): String? = keyAlias

    /** Filter keys by key hash */
    fun keyHash(): String? = keyHash

    /** Filter keys by organization ID */
    fun organizationId(): String? = organizationId

    /** Page number */
    fun page(): Long? = page

    /** Return full key object */
    fun returnFullObject(): Boolean? = returnFullObject

    /** Page size */
    fun size(): Long? = size

    /** Column to sort by (e.g. 'user_id', 'created_at', 'spend') */
    fun sortBy(): String? = sortBy

    /** Sort order ('asc' or 'desc') */
    fun sortOrder(): String? = sortOrder

    /** Filter by status (e.g. 'deleted') */
    fun status(): String? = status

    /** Filter keys by team ID */
    fun teamId(): String? = teamId

    /** Filter keys by user ID */
    fun userId(): String? = userId

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): KeyListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [KeyListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [KeyListParams]. */
    class Builder internal constructor() {

        private var expand: MutableList<String>? = null
        private var includeCreatedByKeys: Boolean? = null
        private var includeTeamKeys: Boolean? = null
        private var keyAlias: String? = null
        private var keyHash: String? = null
        private var organizationId: String? = null
        private var page: Long? = null
        private var returnFullObject: Boolean? = null
        private var size: Long? = null
        private var sortBy: String? = null
        private var sortOrder: String? = null
        private var status: String? = null
        private var teamId: String? = null
        private var userId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(keyListParams: KeyListParams) = apply {
            expand = keyListParams.expand?.toMutableList()
            includeCreatedByKeys = keyListParams.includeCreatedByKeys
            includeTeamKeys = keyListParams.includeTeamKeys
            keyAlias = keyListParams.keyAlias
            keyHash = keyListParams.keyHash
            organizationId = keyListParams.organizationId
            page = keyListParams.page
            returnFullObject = keyListParams.returnFullObject
            size = keyListParams.size
            sortBy = keyListParams.sortBy
            sortOrder = keyListParams.sortOrder
            status = keyListParams.status
            teamId = keyListParams.teamId
            userId = keyListParams.userId
            additionalHeaders = keyListParams.additionalHeaders.toBuilder()
            additionalQueryParams = keyListParams.additionalQueryParams.toBuilder()
        }

        /** Expand related objects (e.g. 'user') */
        fun expand(expand: List<String>?) = apply { this.expand = expand?.toMutableList() }

        /**
         * Adds a single [String] to [Builder.expand].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExpand(expand: String) = apply {
            this.expand = (this.expand ?: mutableListOf()).apply { add(expand) }
        }

        /** Include keys created by the user */
        fun includeCreatedByKeys(includeCreatedByKeys: Boolean?) = apply {
            this.includeCreatedByKeys = includeCreatedByKeys
        }

        /**
         * Alias for [Builder.includeCreatedByKeys].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeCreatedByKeys(includeCreatedByKeys: Boolean) =
            includeCreatedByKeys(includeCreatedByKeys as Boolean?)

        /** Include all keys for teams that user is an admin of. */
        fun includeTeamKeys(includeTeamKeys: Boolean?) = apply {
            this.includeTeamKeys = includeTeamKeys
        }

        /**
         * Alias for [Builder.includeTeamKeys].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeTeamKeys(includeTeamKeys: Boolean) = includeTeamKeys(includeTeamKeys as Boolean?)

        /** Filter keys by key alias */
        fun keyAlias(keyAlias: String?) = apply { this.keyAlias = keyAlias }

        /** Filter keys by key hash */
        fun keyHash(keyHash: String?) = apply { this.keyHash = keyHash }

        /** Filter keys by organization ID */
        fun organizationId(organizationId: String?) = apply { this.organizationId = organizationId }

        /** Page number */
        fun page(page: Long?) = apply { this.page = page }

        /**
         * Alias for [Builder.page].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun page(page: Long) = page(page as Long?)

        /** Return full key object */
        fun returnFullObject(returnFullObject: Boolean?) = apply {
            this.returnFullObject = returnFullObject
        }

        /**
         * Alias for [Builder.returnFullObject].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun returnFullObject(returnFullObject: Boolean) =
            returnFullObject(returnFullObject as Boolean?)

        /** Page size */
        fun size(size: Long?) = apply { this.size = size }

        /**
         * Alias for [Builder.size].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun size(size: Long) = size(size as Long?)

        /** Column to sort by (e.g. 'user_id', 'created_at', 'spend') */
        fun sortBy(sortBy: String?) = apply { this.sortBy = sortBy }

        /** Sort order ('asc' or 'desc') */
        fun sortOrder(sortOrder: String?) = apply { this.sortOrder = sortOrder }

        /** Filter by status (e.g. 'deleted') */
        fun status(status: String?) = apply { this.status = status }

        /** Filter keys by team ID */
        fun teamId(teamId: String?) = apply { this.teamId = teamId }

        /** Filter keys by user ID */
        fun userId(userId: String?) = apply { this.userId = userId }

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
         * Returns an immutable instance of [KeyListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): KeyListParams =
            KeyListParams(
                expand?.toImmutable(),
                includeCreatedByKeys,
                includeTeamKeys,
                keyAlias,
                keyHash,
                organizationId,
                page,
                returnFullObject,
                size,
                sortBy,
                sortOrder,
                status,
                teamId,
                userId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                expand?.let { put("expand", it.joinToString(",")) }
                includeCreatedByKeys?.let { put("include_created_by_keys", it.toString()) }
                includeTeamKeys?.let { put("include_team_keys", it.toString()) }
                keyAlias?.let { put("key_alias", it) }
                keyHash?.let { put("key_hash", it) }
                organizationId?.let { put("organization_id", it) }
                page?.let { put("page", it.toString()) }
                returnFullObject?.let { put("return_full_object", it.toString()) }
                size?.let { put("size", it.toString()) }
                sortBy?.let { put("sort_by", it) }
                sortOrder?.let { put("sort_order", it) }
                status?.let { put("status", it) }
                teamId?.let { put("team_id", it) }
                userId?.let { put("user_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is KeyListParams &&
            expand == other.expand &&
            includeCreatedByKeys == other.includeCreatedByKeys &&
            includeTeamKeys == other.includeTeamKeys &&
            keyAlias == other.keyAlias &&
            keyHash == other.keyHash &&
            organizationId == other.organizationId &&
            page == other.page &&
            returnFullObject == other.returnFullObject &&
            size == other.size &&
            sortBy == other.sortBy &&
            sortOrder == other.sortOrder &&
            status == other.status &&
            teamId == other.teamId &&
            userId == other.userId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            expand,
            includeCreatedByKeys,
            includeTeamKeys,
            keyAlias,
            keyHash,
            organizationId,
            page,
            returnFullObject,
            size,
            sortBy,
            sortOrder,
            status,
            teamId,
            userId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "KeyListParams{expand=$expand, includeCreatedByKeys=$includeCreatedByKeys, includeTeamKeys=$includeTeamKeys, keyAlias=$keyAlias, keyHash=$keyHash, organizationId=$organizationId, page=$page, returnFullObject=$returnFullObject, size=$size, sortBy=$sortBy, sortOrder=$sortOrder, status=$status, teamId=$teamId, userId=$userId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
