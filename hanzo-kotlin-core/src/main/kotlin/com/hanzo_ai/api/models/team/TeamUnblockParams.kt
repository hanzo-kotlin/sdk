// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.team

import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.core.Params
import com.hanzo_ai.api.core.checkRequired
import com.hanzo_ai.api.core.http.Headers
import com.hanzo_ai.api.core.http.QueryParams
import java.util.Objects

/**
 * Blocks all calls from keys with this team id.
 *
 * Parameters:
 * - team_id: str - Required. The unique identifier of the team to unblock.
 *
 * Example:
 * ```
 * curl --location 'http://0.0.0.0:4000/team/unblock'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data '{
 *     "team_id": "team-1234"
 * }'
 * ```
 */
class TeamUnblockParams
private constructor(
    private val blockTeamRequest: BlockTeamRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun blockTeamRequest(): BlockTeamRequest = blockTeamRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        blockTeamRequest._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TeamUnblockParams].
         *
         * The following fields are required:
         * ```kotlin
         * .blockTeamRequest()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [TeamUnblockParams]. */
    class Builder internal constructor() {

        private var blockTeamRequest: BlockTeamRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(teamUnblockParams: TeamUnblockParams) = apply {
            blockTeamRequest = teamUnblockParams.blockTeamRequest
            additionalHeaders = teamUnblockParams.additionalHeaders.toBuilder()
            additionalQueryParams = teamUnblockParams.additionalQueryParams.toBuilder()
        }

        fun blockTeamRequest(blockTeamRequest: BlockTeamRequest) = apply {
            this.blockTeamRequest = blockTeamRequest
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
         * Returns an immutable instance of [TeamUnblockParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .blockTeamRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TeamUnblockParams =
            TeamUnblockParams(
                checkRequired("blockTeamRequest", blockTeamRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    internal fun _body(): BlockTeamRequest = blockTeamRequest

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TeamUnblockParams && blockTeamRequest == other.blockTeamRequest && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(blockTeamRequest, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TeamUnblockParams{blockTeamRequest=$blockTeamRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
