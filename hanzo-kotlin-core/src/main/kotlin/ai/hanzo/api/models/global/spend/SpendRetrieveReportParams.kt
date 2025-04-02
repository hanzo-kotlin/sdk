// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.global.spend

import ai.hanzo.api.core.Enum
import ai.hanzo.api.core.JsonField
import ai.hanzo.api.core.Params
import ai.hanzo.api.core.http.Headers
import ai.hanzo.api.core.http.QueryParams
import ai.hanzo.api.errors.HanzoInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects

/**
 * Get Daily Spend per Team, based on specific startTime and endTime. Per team, view usage by each
 * key, model
 * [ { "group-by-day": "2024-05-10", "teams": [ { "team_name": "team-1" "spend": 10, "keys": [ "key": "1213", "usage": { "model-1": { "cost": 12.50, "input_tokens": 1000, "output_tokens": 5000, "requests": 100 }, "audio-modelname1": { "cost": 25.50, "seconds": 25, "requests": 50 }, } } ]
 * ] }
 */
class SpendRetrieveReportParams
private constructor(
    private val apiKey: String?,
    private val customerId: String?,
    private val endDate: String?,
    private val groupBy: GroupBy?,
    private val internalUserId: String?,
    private val startDate: String?,
    private val teamId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** View spend for a specific api_key. Example api_key='sk-1234 */
    fun apiKey(): String? = apiKey

    /**
     * View spend for a specific customer_id. Example customer_id='1234. Can be used in conjunction
     * with team_id as well.
     */
    fun customerId(): String? = customerId

    /** Time till which to view spend */
    fun endDate(): String? = endDate

    /** Group spend by internal team or customer or api_key */
    fun groupBy(): GroupBy? = groupBy

    /** View spend for a specific internal_user_id. Example internal_user_id='1234 */
    fun internalUserId(): String? = internalUserId

    /** Time from which to start viewing spend */
    fun startDate(): String? = startDate

    /** View spend for a specific team_id. Example team_id='1234 */
    fun teamId(): String? = teamId

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): SpendRetrieveReportParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [SpendRetrieveReportParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [SpendRetrieveReportParams]. */
    class Builder internal constructor() {

        private var apiKey: String? = null
        private var customerId: String? = null
        private var endDate: String? = null
        private var groupBy: GroupBy? = null
        private var internalUserId: String? = null
        private var startDate: String? = null
        private var teamId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(spendRetrieveReportParams: SpendRetrieveReportParams) = apply {
            apiKey = spendRetrieveReportParams.apiKey
            customerId = spendRetrieveReportParams.customerId
            endDate = spendRetrieveReportParams.endDate
            groupBy = spendRetrieveReportParams.groupBy
            internalUserId = spendRetrieveReportParams.internalUserId
            startDate = spendRetrieveReportParams.startDate
            teamId = spendRetrieveReportParams.teamId
            additionalHeaders = spendRetrieveReportParams.additionalHeaders.toBuilder()
            additionalQueryParams = spendRetrieveReportParams.additionalQueryParams.toBuilder()
        }

        /** View spend for a specific api_key. Example api_key='sk-1234 */
        fun apiKey(apiKey: String?) = apply { this.apiKey = apiKey }

        /**
         * View spend for a specific customer_id. Example customer_id='1234. Can be used in
         * conjunction with team_id as well.
         */
        fun customerId(customerId: String?) = apply { this.customerId = customerId }

        /** Time till which to view spend */
        fun endDate(endDate: String?) = apply { this.endDate = endDate }

        /** Group spend by internal team or customer or api_key */
        fun groupBy(groupBy: GroupBy?) = apply { this.groupBy = groupBy }

        /** View spend for a specific internal_user_id. Example internal_user_id='1234 */
        fun internalUserId(internalUserId: String?) = apply { this.internalUserId = internalUserId }

        /** Time from which to start viewing spend */
        fun startDate(startDate: String?) = apply { this.startDate = startDate }

        /** View spend for a specific team_id. Example team_id='1234 */
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
         * Returns an immutable instance of [SpendRetrieveReportParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SpendRetrieveReportParams =
            SpendRetrieveReportParams(
                apiKey,
                customerId,
                endDate,
                groupBy,
                internalUserId,
                startDate,
                teamId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                apiKey?.let { put("api_key", it) }
                customerId?.let { put("customer_id", it) }
                endDate?.let { put("end_date", it) }
                groupBy?.let { put("group_by", it.toString()) }
                internalUserId?.let { put("internal_user_id", it) }
                startDate?.let { put("start_date", it) }
                teamId?.let { put("team_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Group spend by internal team or customer or api_key */
    class GroupBy @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val TEAM = of("team")

            val CUSTOMER = of("customer")

            val API_KEY = of("api_key")

            fun of(value: String) = GroupBy(JsonField.of(value))
        }

        /** An enum containing [GroupBy]'s known values. */
        enum class Known {
            TEAM,
            CUSTOMER,
            API_KEY,
        }

        /**
         * An enum containing [GroupBy]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [GroupBy] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TEAM,
            CUSTOMER,
            API_KEY,
            /** An enum member indicating that [GroupBy] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                TEAM -> Value.TEAM
                CUSTOMER -> Value.CUSTOMER
                API_KEY -> Value.API_KEY
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HanzoInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                TEAM -> Known.TEAM
                CUSTOMER -> Known.CUSTOMER
                API_KEY -> Known.API_KEY
                else -> throw HanzoInvalidDataException("Unknown GroupBy: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HanzoInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw HanzoInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): GroupBy = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HanzoInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is GroupBy && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SpendRetrieveReportParams && apiKey == other.apiKey && customerId == other.customerId && endDate == other.endDate && groupBy == other.groupBy && internalUserId == other.internalUserId && startDate == other.startDate && teamId == other.teamId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(apiKey, customerId, endDate, groupBy, internalUserId, startDate, teamId, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SpendRetrieveReportParams{apiKey=$apiKey, customerId=$customerId, endDate=$endDate, groupBy=$groupBy, internalUserId=$internalUserId, startDate=$startDate, teamId=$teamId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
