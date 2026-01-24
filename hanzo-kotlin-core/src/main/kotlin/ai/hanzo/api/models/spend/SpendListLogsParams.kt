// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.spend

import ai.hanzo.api.core.Params
import ai.hanzo.api.core.http.Headers
import ai.hanzo.api.core.http.QueryParams
import java.util.Objects

/**
 * [DEPRECATED] This endpoint is not paginated and can cause performance issues. Please use
 * `/spend/logs/v2` instead for paginated access to spend logs.
 *
 * View all spend logs, if request_id is provided, only logs for that request_id will be returned
 *
 * When start_date and end_date are provided:
 * - summarize=true (default): Returns aggregated spend data grouped by date (maintains backward
 *   compatibility)
 * - summarize=false: Returns filtered individual log entries within the date range
 *
 * Example Request for all logs
 *
 * ```
 * curl -X GET "http://0.0.0.0:8000/spend/logs" -H "Authorization: Bearer sk-1234"
 * ```
 *
 * Example Request for specific request_id
 *
 * ```
 * curl -X GET "http://0.0.0.0:8000/spend/logs?request_id=chatcmpl-6dcb2540-d3d7-4e49-bb27-291f863f112e" -H "Authorization: Bearer sk-1234"
 * ```
 *
 * Example Request for specific api_key
 *
 * ```
 * curl -X GET "http://0.0.0.0:8000/spend/logs?api_key=sk-test-example-key-123" -H "Authorization: Bearer sk-1234"
 * ```
 *
 * Example Request for specific user_id
 *
 * ```
 * curl -X GET "http://0.0.0.0:8000/spend/logs?user_id=ishaan@berri.ai" -H "Authorization: Bearer sk-1234"
 * ```
 *
 * Example Request for date range with individual logs (unsummarized)
 *
 * ```
 * curl -X GET "http://0.0.0.0:8000/spend/logs?start_date=2024-01-01&end_date=2024-01-02&summarize=false" -H "Authorization: Bearer sk-1234"
 * ```
 */
class SpendListLogsParams
private constructor(
    private val apiKey: String?,
    private val endDate: String?,
    private val requestId: String?,
    private val startDate: String?,
    private val summarize: Boolean?,
    private val userId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Get spend logs based on api key */
    fun apiKey(): String? = apiKey

    /** Time till which to view key spend */
    fun endDate(): String? = endDate

    /**
     * request_id to get spend logs for specific request_id. If none passed then pass spend logs for
     * all requests
     */
    fun requestId(): String? = requestId

    /** Time from which to start viewing key spend */
    fun startDate(): String? = startDate

    /**
     * When start_date and end_date are provided, summarize=true returns aggregated data by date
     * (legacy behavior), summarize=false returns filtered individual logs
     */
    fun summarize(): Boolean? = summarize

    /** Get spend logs based on user_id */
    fun userId(): String? = userId

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): SpendListLogsParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [SpendListLogsParams]. */
        fun builder() = Builder()
    }

    /** A builder for [SpendListLogsParams]. */
    class Builder internal constructor() {

        private var apiKey: String? = null
        private var endDate: String? = null
        private var requestId: String? = null
        private var startDate: String? = null
        private var summarize: Boolean? = null
        private var userId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(spendListLogsParams: SpendListLogsParams) = apply {
            apiKey = spendListLogsParams.apiKey
            endDate = spendListLogsParams.endDate
            requestId = spendListLogsParams.requestId
            startDate = spendListLogsParams.startDate
            summarize = spendListLogsParams.summarize
            userId = spendListLogsParams.userId
            additionalHeaders = spendListLogsParams.additionalHeaders.toBuilder()
            additionalQueryParams = spendListLogsParams.additionalQueryParams.toBuilder()
        }

        /** Get spend logs based on api key */
        fun apiKey(apiKey: String?) = apply { this.apiKey = apiKey }

        /** Time till which to view key spend */
        fun endDate(endDate: String?) = apply { this.endDate = endDate }

        /**
         * request_id to get spend logs for specific request_id. If none passed then pass spend logs
         * for all requests
         */
        fun requestId(requestId: String?) = apply { this.requestId = requestId }

        /** Time from which to start viewing key spend */
        fun startDate(startDate: String?) = apply { this.startDate = startDate }

        /**
         * When start_date and end_date are provided, summarize=true returns aggregated data by date
         * (legacy behavior), summarize=false returns filtered individual logs
         */
        fun summarize(summarize: Boolean?) = apply { this.summarize = summarize }

        /**
         * Alias for [Builder.summarize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun summarize(summarize: Boolean) = summarize(summarize as Boolean?)

        /** Get spend logs based on user_id */
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
         * Returns an immutable instance of [SpendListLogsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SpendListLogsParams =
            SpendListLogsParams(
                apiKey,
                endDate,
                requestId,
                startDate,
                summarize,
                userId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                apiKey?.let { put("api_key", it) }
                endDate?.let { put("end_date", it) }
                requestId?.let { put("request_id", it) }
                startDate?.let { put("start_date", it) }
                summarize?.let { put("summarize", it.toString()) }
                userId?.let { put("user_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SpendListLogsParams &&
            apiKey == other.apiKey &&
            endDate == other.endDate &&
            requestId == other.requestId &&
            startDate == other.startDate &&
            summarize == other.summarize &&
            userId == other.userId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            apiKey,
            endDate,
            requestId,
            startDate,
            summarize,
            userId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SpendListLogsParams{apiKey=$apiKey, endDate=$endDate, requestId=$requestId, startDate=$startDate, summarize=$summarize, userId=$userId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
