// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.global.spend

import ai.hanzo.api.core.BaseDeserializer
import ai.hanzo.api.core.BaseSerializer
import ai.hanzo.api.core.ExcludeMissing
import ai.hanzo.api.core.JsonField
import ai.hanzo.api.core.JsonMissing
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.allMaxBy
import ai.hanzo.api.core.checkRequired
import ai.hanzo.api.core.getOrThrow
import ai.hanzo.api.core.toImmutable
import ai.hanzo.api.errors.HanzoInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class SpendRetrieveReportResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val apiKey: JsonField<String>,
    private val callType: JsonField<String>,
    private val endTime: JsonField<EndTime>,
    private val messages: JsonField<Messages>,
    private val requestId: JsonField<String>,
    private val response: JsonField<Response>,
    private val startTime: JsonField<StartTime>,
    private val apiBase: JsonField<String>,
    private val cacheHit: JsonField<String>,
    private val cacheKey: JsonField<String>,
    private val completionTokens: JsonField<Long>,
    private val metadata: JsonValue,
    private val model: JsonField<String>,
    private val promptTokens: JsonField<Long>,
    private val requestTags: JsonValue,
    private val requesterIpAddress: JsonField<String>,
    private val spend: JsonField<Double>,
    private val totalTokens: JsonField<Long>,
    private val user: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("api_key") @ExcludeMissing apiKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("call_type") @ExcludeMissing callType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("endTime") @ExcludeMissing endTime: JsonField<EndTime> = JsonMissing.of(),
        @JsonProperty("messages") @ExcludeMissing messages: JsonField<Messages> = JsonMissing.of(),
        @JsonProperty("request_id") @ExcludeMissing requestId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("response") @ExcludeMissing response: JsonField<Response> = JsonMissing.of(),
        @JsonProperty("startTime")
        @ExcludeMissing
        startTime: JsonField<StartTime> = JsonMissing.of(),
        @JsonProperty("api_base") @ExcludeMissing apiBase: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cache_hit") @ExcludeMissing cacheHit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cache_key") @ExcludeMissing cacheKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("completion_tokens")
        @ExcludeMissing
        completionTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
        @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prompt_tokens")
        @ExcludeMissing
        promptTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("request_tags") @ExcludeMissing requestTags: JsonValue = JsonMissing.of(),
        @JsonProperty("requester_ip_address")
        @ExcludeMissing
        requesterIpAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("spend") @ExcludeMissing spend: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("total_tokens")
        @ExcludeMissing
        totalTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("user") @ExcludeMissing user: JsonField<String> = JsonMissing.of(),
    ) : this(
        apiKey,
        callType,
        endTime,
        messages,
        requestId,
        response,
        startTime,
        apiBase,
        cacheHit,
        cacheKey,
        completionTokens,
        metadata,
        model,
        promptTokens,
        requestTags,
        requesterIpAddress,
        spend,
        totalTokens,
        user,
        mutableMapOf(),
    )

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun apiKey(): String = apiKey.getRequired("api_key")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun callType(): String = callType.getRequired("call_type")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endTime(): EndTime? = endTime.getNullable("endTime")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messages(): Messages? = messages.getNullable("messages")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requestId(): String = requestId.getRequired("request_id")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun response(): Response? = response.getNullable("response")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startTime(): StartTime? = startTime.getNullable("startTime")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiBase(): String? = apiBase.getNullable("api_base")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cacheHit(): String? = cacheHit.getNullable("cache_hit")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cacheKey(): String? = cacheKey.getNullable("cache_key")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completionTokens(): Long? = completionTokens.getNullable("completion_tokens")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = spendRetrieveReportResponse.metadata().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): String? = model.getNullable("model")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptTokens(): Long? = promptTokens.getNullable("prompt_tokens")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = spendRetrieveReportResponse.requestTags().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("request_tags") @ExcludeMissing fun _requestTags(): JsonValue = requestTags

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requesterIpAddress(): String? = requesterIpAddress.getNullable("requester_ip_address")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spend(): Double? = spend.getNullable("spend")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalTokens(): Long? = totalTokens.getNullable("total_tokens")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun user(): String? = user.getNullable("user")

    /**
     * Returns the raw JSON value of [apiKey].
     *
     * Unlike [apiKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("api_key") @ExcludeMissing fun _apiKey(): JsonField<String> = apiKey

    /**
     * Returns the raw JSON value of [callType].
     *
     * Unlike [callType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call_type") @ExcludeMissing fun _callType(): JsonField<String> = callType

    /**
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endTime") @ExcludeMissing fun _endTime(): JsonField<EndTime> = endTime

    /**
     * Returns the raw JSON value of [messages].
     *
     * Unlike [messages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("messages") @ExcludeMissing fun _messages(): JsonField<Messages> = messages

    /**
     * Returns the raw JSON value of [requestId].
     *
     * Unlike [requestId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("request_id") @ExcludeMissing fun _requestId(): JsonField<String> = requestId

    /**
     * Returns the raw JSON value of [response].
     *
     * Unlike [response], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("response") @ExcludeMissing fun _response(): JsonField<Response> = response

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startTime") @ExcludeMissing fun _startTime(): JsonField<StartTime> = startTime

    /**
     * Returns the raw JSON value of [apiBase].
     *
     * Unlike [apiBase], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("api_base") @ExcludeMissing fun _apiBase(): JsonField<String> = apiBase

    /**
     * Returns the raw JSON value of [cacheHit].
     *
     * Unlike [cacheHit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cache_hit") @ExcludeMissing fun _cacheHit(): JsonField<String> = cacheHit

    /**
     * Returns the raw JSON value of [cacheKey].
     *
     * Unlike [cacheKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cache_key") @ExcludeMissing fun _cacheKey(): JsonField<String> = cacheKey

    /**
     * Returns the raw JSON value of [completionTokens].
     *
     * Unlike [completionTokens], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("completion_tokens")
    @ExcludeMissing
    fun _completionTokens(): JsonField<Long> = completionTokens

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

    /**
     * Returns the raw JSON value of [promptTokens].
     *
     * Unlike [promptTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompt_tokens")
    @ExcludeMissing
    fun _promptTokens(): JsonField<Long> = promptTokens

    /**
     * Returns the raw JSON value of [requesterIpAddress].
     *
     * Unlike [requesterIpAddress], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("requester_ip_address")
    @ExcludeMissing
    fun _requesterIpAddress(): JsonField<String> = requesterIpAddress

    /**
     * Returns the raw JSON value of [spend].
     *
     * Unlike [spend], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spend") @ExcludeMissing fun _spend(): JsonField<Double> = spend

    /**
     * Returns the raw JSON value of [totalTokens].
     *
     * Unlike [totalTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_tokens") @ExcludeMissing fun _totalTokens(): JsonField<Long> = totalTokens

    /**
     * Returns the raw JSON value of [user].
     *
     * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<String> = user

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SpendRetrieveReportResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .apiKey()
         * .callType()
         * .endTime()
         * .messages()
         * .requestId()
         * .response()
         * .startTime()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SpendRetrieveReportResponse]. */
    class Builder internal constructor() {

        private var apiKey: JsonField<String>? = null
        private var callType: JsonField<String>? = null
        private var endTime: JsonField<EndTime>? = null
        private var messages: JsonField<Messages>? = null
        private var requestId: JsonField<String>? = null
        private var response: JsonField<Response>? = null
        private var startTime: JsonField<StartTime>? = null
        private var apiBase: JsonField<String> = JsonMissing.of()
        private var cacheHit: JsonField<String> = JsonMissing.of()
        private var cacheKey: JsonField<String> = JsonMissing.of()
        private var completionTokens: JsonField<Long> = JsonMissing.of()
        private var metadata: JsonValue = JsonMissing.of()
        private var model: JsonField<String> = JsonMissing.of()
        private var promptTokens: JsonField<Long> = JsonMissing.of()
        private var requestTags: JsonValue = JsonMissing.of()
        private var requesterIpAddress: JsonField<String> = JsonMissing.of()
        private var spend: JsonField<Double> = JsonMissing.of()
        private var totalTokens: JsonField<Long> = JsonMissing.of()
        private var user: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(spendRetrieveReportResponse: SpendRetrieveReportResponse) = apply {
            apiKey = spendRetrieveReportResponse.apiKey
            callType = spendRetrieveReportResponse.callType
            endTime = spendRetrieveReportResponse.endTime
            messages = spendRetrieveReportResponse.messages
            requestId = spendRetrieveReportResponse.requestId
            response = spendRetrieveReportResponse.response
            startTime = spendRetrieveReportResponse.startTime
            apiBase = spendRetrieveReportResponse.apiBase
            cacheHit = spendRetrieveReportResponse.cacheHit
            cacheKey = spendRetrieveReportResponse.cacheKey
            completionTokens = spendRetrieveReportResponse.completionTokens
            metadata = spendRetrieveReportResponse.metadata
            model = spendRetrieveReportResponse.model
            promptTokens = spendRetrieveReportResponse.promptTokens
            requestTags = spendRetrieveReportResponse.requestTags
            requesterIpAddress = spendRetrieveReportResponse.requesterIpAddress
            spend = spendRetrieveReportResponse.spend
            totalTokens = spendRetrieveReportResponse.totalTokens
            user = spendRetrieveReportResponse.user
            additionalProperties = spendRetrieveReportResponse.additionalProperties.toMutableMap()
        }

        fun apiKey(apiKey: String) = apiKey(JsonField.of(apiKey))

        /**
         * Sets [Builder.apiKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiKey] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apiKey(apiKey: JsonField<String>) = apply { this.apiKey = apiKey }

        fun callType(callType: String) = callType(JsonField.of(callType))

        /**
         * Sets [Builder.callType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun callType(callType: JsonField<String>) = apply { this.callType = callType }

        fun endTime(endTime: EndTime?) = endTime(JsonField.ofNullable(endTime))

        /**
         * Sets [Builder.endTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endTime] with a well-typed [EndTime] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun endTime(endTime: JsonField<EndTime>) = apply { this.endTime = endTime }

        /** Alias for calling [endTime] with `EndTime.ofString(string)`. */
        fun endTime(string: String) = endTime(EndTime.ofString(string))

        /** Alias for calling [endTime] with `EndTime.ofOffsetDate(offsetDate)`. */
        fun endTime(offsetDate: OffsetDateTime) = endTime(EndTime.ofOffsetDate(offsetDate))

        fun messages(messages: Messages?) = messages(JsonField.ofNullable(messages))

        /**
         * Sets [Builder.messages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messages] with a well-typed [Messages] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun messages(messages: JsonField<Messages>) = apply { this.messages = messages }

        /** Alias for calling [messages] with `Messages.ofString(string)`. */
        fun messages(string: String) = messages(Messages.ofString(string))

        /** Alias for calling [messages] with `Messages.ofJsonValues(jsonValues)`. */
        fun messagesOfJsonValues(jsonValues: List<JsonValue>) =
            messages(Messages.ofJsonValues(jsonValues))

        /** Alias for calling [messages] with `Messages.ofJsonValue(jsonValue)`. */
        fun messages(jsonValue: JsonValue) = messages(Messages.ofJsonValue(jsonValue))

        fun requestId(requestId: String) = requestId(JsonField.of(requestId))

        /**
         * Sets [Builder.requestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun requestId(requestId: JsonField<String>) = apply { this.requestId = requestId }

        fun response(response: Response?) = response(JsonField.ofNullable(response))

        /**
         * Sets [Builder.response] to an arbitrary JSON value.
         *
         * You should usually call [Builder.response] with a well-typed [Response] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun response(response: JsonField<Response>) = apply { this.response = response }

        /** Alias for calling [response] with `Response.ofString(string)`. */
        fun response(string: String) = response(Response.ofString(string))

        /** Alias for calling [response] with `Response.ofJsonValues(jsonValues)`. */
        fun responseOfJsonValues(jsonValues: List<JsonValue>) =
            response(Response.ofJsonValues(jsonValues))

        /** Alias for calling [response] with `Response.ofJsonValue(jsonValue)`. */
        fun response(jsonValue: JsonValue) = response(Response.ofJsonValue(jsonValue))

        fun startTime(startTime: StartTime?) = startTime(JsonField.ofNullable(startTime))

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [StartTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startTime(startTime: JsonField<StartTime>) = apply { this.startTime = startTime }

        /** Alias for calling [startTime] with `StartTime.ofString(string)`. */
        fun startTime(string: String) = startTime(StartTime.ofString(string))

        /** Alias for calling [startTime] with `StartTime.ofOffsetDate(offsetDate)`. */
        fun startTime(offsetDate: OffsetDateTime) = startTime(StartTime.ofOffsetDate(offsetDate))

        fun apiBase(apiBase: String?) = apiBase(JsonField.ofNullable(apiBase))

        /**
         * Sets [Builder.apiBase] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiBase] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apiBase(apiBase: JsonField<String>) = apply { this.apiBase = apiBase }

        fun cacheHit(cacheHit: String?) = cacheHit(JsonField.ofNullable(cacheHit))

        /**
         * Sets [Builder.cacheHit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cacheHit] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cacheHit(cacheHit: JsonField<String>) = apply { this.cacheHit = cacheHit }

        fun cacheKey(cacheKey: String?) = cacheKey(JsonField.ofNullable(cacheKey))

        /**
         * Sets [Builder.cacheKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cacheKey] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cacheKey(cacheKey: JsonField<String>) = apply { this.cacheKey = cacheKey }

        fun completionTokens(completionTokens: Long?) =
            completionTokens(JsonField.ofNullable(completionTokens))

        /**
         * Alias for [Builder.completionTokens].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun completionTokens(completionTokens: Long) = completionTokens(completionTokens as Long?)

        /**
         * Sets [Builder.completionTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completionTokens] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun completionTokens(completionTokens: JsonField<Long>) = apply {
            this.completionTokens = completionTokens
        }

        fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

        fun model(model: String?) = model(JsonField.ofNullable(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { this.model = model }

        fun promptTokens(promptTokens: Long?) = promptTokens(JsonField.ofNullable(promptTokens))

        /**
         * Alias for [Builder.promptTokens].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun promptTokens(promptTokens: Long) = promptTokens(promptTokens as Long?)

        /**
         * Sets [Builder.promptTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun promptTokens(promptTokens: JsonField<Long>) = apply { this.promptTokens = promptTokens }

        fun requestTags(requestTags: JsonValue) = apply { this.requestTags = requestTags }

        fun requesterIpAddress(requesterIpAddress: String?) =
            requesterIpAddress(JsonField.ofNullable(requesterIpAddress))

        /**
         * Sets [Builder.requesterIpAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requesterIpAddress] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requesterIpAddress(requesterIpAddress: JsonField<String>) = apply {
            this.requesterIpAddress = requesterIpAddress
        }

        fun spend(spend: Double?) = spend(JsonField.ofNullable(spend))

        /**
         * Alias for [Builder.spend].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun spend(spend: Double) = spend(spend as Double?)

        /**
         * Sets [Builder.spend] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spend] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun spend(spend: JsonField<Double>) = apply { this.spend = spend }

        fun totalTokens(totalTokens: Long?) = totalTokens(JsonField.ofNullable(totalTokens))

        /**
         * Alias for [Builder.totalTokens].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun totalTokens(totalTokens: Long) = totalTokens(totalTokens as Long?)

        /**
         * Sets [Builder.totalTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalTokens(totalTokens: JsonField<Long>) = apply { this.totalTokens = totalTokens }

        fun user(user: String?) = user(JsonField.ofNullable(user))

        /**
         * Sets [Builder.user] to an arbitrary JSON value.
         *
         * You should usually call [Builder.user] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun user(user: JsonField<String>) = apply { this.user = user }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [SpendRetrieveReportResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .apiKey()
         * .callType()
         * .endTime()
         * .messages()
         * .requestId()
         * .response()
         * .startTime()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SpendRetrieveReportResponse =
            SpendRetrieveReportResponse(
                checkRequired("apiKey", apiKey),
                checkRequired("callType", callType),
                checkRequired("endTime", endTime),
                checkRequired("messages", messages),
                checkRequired("requestId", requestId),
                checkRequired("response", response),
                checkRequired("startTime", startTime),
                apiBase,
                cacheHit,
                cacheKey,
                completionTokens,
                metadata,
                model,
                promptTokens,
                requestTags,
                requesterIpAddress,
                spend,
                totalTokens,
                user,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SpendRetrieveReportResponse = apply {
        if (validated) {
            return@apply
        }

        apiKey()
        callType()
        endTime()?.validate()
        messages()?.validate()
        requestId()
        response()?.validate()
        startTime()?.validate()
        apiBase()
        cacheHit()
        cacheKey()
        completionTokens()
        model()
        promptTokens()
        requesterIpAddress()
        spend()
        totalTokens()
        user()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (apiKey.asKnown() == null) 0 else 1) +
            (if (callType.asKnown() == null) 0 else 1) +
            (endTime.asKnown()?.validity() ?: 0) +
            (messages.asKnown()?.validity() ?: 0) +
            (if (requestId.asKnown() == null) 0 else 1) +
            (response.asKnown()?.validity() ?: 0) +
            (startTime.asKnown()?.validity() ?: 0) +
            (if (apiBase.asKnown() == null) 0 else 1) +
            (if (cacheHit.asKnown() == null) 0 else 1) +
            (if (cacheKey.asKnown() == null) 0 else 1) +
            (if (completionTokens.asKnown() == null) 0 else 1) +
            (if (model.asKnown() == null) 0 else 1) +
            (if (promptTokens.asKnown() == null) 0 else 1) +
            (if (requesterIpAddress.asKnown() == null) 0 else 1) +
            (if (spend.asKnown() == null) 0 else 1) +
            (if (totalTokens.asKnown() == null) 0 else 1) +
            (if (user.asKnown() == null) 0 else 1)

    @JsonDeserialize(using = EndTime.Deserializer::class)
    @JsonSerialize(using = EndTime.Serializer::class)
    class EndTime
    private constructor(
        private val string: String? = null,
        private val offsetDate: OffsetDateTime? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): String? = string

        fun offsetDate(): OffsetDateTime? = offsetDate

        fun isString(): Boolean = string != null

        fun isOffsetDate(): Boolean = offsetDate != null

        fun asString(): String = string.getOrThrow("string")

        fun asOffsetDate(): OffsetDateTime = offsetDate.getOrThrow("offsetDate")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                offsetDate != null -> visitor.visitOffsetDate(offsetDate)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): EndTime = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitOffsetDate(offsetDate: OffsetDateTime) {}
                }
            )
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
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitString(string: String) = 1

                    override fun visitOffsetDate(offsetDate: OffsetDateTime) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EndTime && string == other.string && offsetDate == other.offsetDate
        }

        override fun hashCode(): Int = Objects.hash(string, offsetDate)

        override fun toString(): String =
            when {
                string != null -> "EndTime{string=$string}"
                offsetDate != null -> "EndTime{offsetDate=$offsetDate}"
                _json != null -> "EndTime{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid EndTime")
            }

        companion object {

            fun ofString(string: String) = EndTime(string = string)

            fun ofOffsetDate(offsetDate: OffsetDateTime) = EndTime(offsetDate = offsetDate)
        }

        /**
         * An interface that defines how to map each variant of [EndTime] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitOffsetDate(offsetDate: OffsetDateTime): T

            /**
             * Maps an unknown variant of [EndTime] to a value of type [T].
             *
             * An instance of [EndTime] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws HanzoInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HanzoInvalidDataException("Unknown EndTime: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<EndTime>(EndTime::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): EndTime {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                                EndTime(offsetDate = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                EndTime(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> EndTime(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<EndTime>(EndTime::class) {

            override fun serialize(
                value: EndTime,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.offsetDate != null -> generator.writeObject(value.offsetDate)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid EndTime")
                }
            }
        }
    }

    @JsonDeserialize(using = Messages.Deserializer::class)
    @JsonSerialize(using = Messages.Serializer::class)
    class Messages
    private constructor(
        private val string: String? = null,
        private val jsonValues: List<JsonValue>? = null,
        private val jsonValue: JsonValue? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): String? = string

        fun jsonValues(): List<JsonValue>? = jsonValues

        fun jsonValue(): JsonValue? = jsonValue

        fun isString(): Boolean = string != null

        fun isJsonValues(): Boolean = jsonValues != null

        fun isJsonValue(): Boolean = jsonValue != null

        fun asString(): String = string.getOrThrow("string")

        fun asJsonValues(): List<JsonValue> = jsonValues.getOrThrow("jsonValues")

        fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                jsonValues != null -> visitor.visitJsonValues(jsonValues)
                jsonValue != null -> visitor.visitJsonValue(jsonValue)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Messages = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitJsonValues(jsonValues: List<JsonValue>) {}

                    override fun visitJsonValue(jsonValue: JsonValue) {}
                }
            )
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
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitString(string: String) = 1

                    override fun visitJsonValues(jsonValues: List<JsonValue>) = jsonValues.size

                    override fun visitJsonValue(jsonValue: JsonValue) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Messages &&
                string == other.string &&
                jsonValues == other.jsonValues &&
                jsonValue == other.jsonValue
        }

        override fun hashCode(): Int = Objects.hash(string, jsonValues, jsonValue)

        override fun toString(): String =
            when {
                string != null -> "Messages{string=$string}"
                jsonValues != null -> "Messages{jsonValues=$jsonValues}"
                jsonValue != null -> "Messages{jsonValue=$jsonValue}"
                _json != null -> "Messages{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Messages")
            }

        companion object {

            fun ofString(string: String) = Messages(string = string)

            fun ofJsonValues(jsonValues: List<JsonValue>) =
                Messages(jsonValues = jsonValues.toImmutable())

            fun ofJsonValue(jsonValue: JsonValue) = Messages(jsonValue = jsonValue)
        }

        /**
         * An interface that defines how to map each variant of [Messages] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitJsonValues(jsonValues: List<JsonValue>): T

            fun visitJsonValue(jsonValue: JsonValue): T

            /**
             * Maps an unknown variant of [Messages] to a value of type [T].
             *
             * An instance of [Messages] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws HanzoInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HanzoInvalidDataException("Unknown Messages: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Messages>(Messages::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Messages {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Messages(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<JsonValue>>())?.let {
                                Messages(jsonValues = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                                Messages(jsonValue = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants.
                    0 -> Messages(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Messages>(Messages::class) {

            override fun serialize(
                value: Messages,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.jsonValues != null -> generator.writeObject(value.jsonValues)
                    value.jsonValue != null -> generator.writeObject(value.jsonValue)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Messages")
                }
            }
        }
    }

    @JsonDeserialize(using = Response.Deserializer::class)
    @JsonSerialize(using = Response.Serializer::class)
    class Response
    private constructor(
        private val string: String? = null,
        private val jsonValues: List<JsonValue>? = null,
        private val jsonValue: JsonValue? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): String? = string

        fun jsonValues(): List<JsonValue>? = jsonValues

        fun jsonValue(): JsonValue? = jsonValue

        fun isString(): Boolean = string != null

        fun isJsonValues(): Boolean = jsonValues != null

        fun isJsonValue(): Boolean = jsonValue != null

        fun asString(): String = string.getOrThrow("string")

        fun asJsonValues(): List<JsonValue> = jsonValues.getOrThrow("jsonValues")

        fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                jsonValues != null -> visitor.visitJsonValues(jsonValues)
                jsonValue != null -> visitor.visitJsonValue(jsonValue)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitJsonValues(jsonValues: List<JsonValue>) {}

                    override fun visitJsonValue(jsonValue: JsonValue) {}
                }
            )
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
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitString(string: String) = 1

                    override fun visitJsonValues(jsonValues: List<JsonValue>) = jsonValues.size

                    override fun visitJsonValue(jsonValue: JsonValue) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Response &&
                string == other.string &&
                jsonValues == other.jsonValues &&
                jsonValue == other.jsonValue
        }

        override fun hashCode(): Int = Objects.hash(string, jsonValues, jsonValue)

        override fun toString(): String =
            when {
                string != null -> "Response{string=$string}"
                jsonValues != null -> "Response{jsonValues=$jsonValues}"
                jsonValue != null -> "Response{jsonValue=$jsonValue}"
                _json != null -> "Response{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Response")
            }

        companion object {

            fun ofString(string: String) = Response(string = string)

            fun ofJsonValues(jsonValues: List<JsonValue>) =
                Response(jsonValues = jsonValues.toImmutable())

            fun ofJsonValue(jsonValue: JsonValue) = Response(jsonValue = jsonValue)
        }

        /**
         * An interface that defines how to map each variant of [Response] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitJsonValues(jsonValues: List<JsonValue>): T

            fun visitJsonValue(jsonValue: JsonValue): T

            /**
             * Maps an unknown variant of [Response] to a value of type [T].
             *
             * An instance of [Response] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws HanzoInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HanzoInvalidDataException("Unknown Response: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Response>(Response::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Response {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Response(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<JsonValue>>())?.let {
                                Response(jsonValues = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                                Response(jsonValue = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants.
                    0 -> Response(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Response>(Response::class) {

            override fun serialize(
                value: Response,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.jsonValues != null -> generator.writeObject(value.jsonValues)
                    value.jsonValue != null -> generator.writeObject(value.jsonValue)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Response")
                }
            }
        }
    }

    @JsonDeserialize(using = StartTime.Deserializer::class)
    @JsonSerialize(using = StartTime.Serializer::class)
    class StartTime
    private constructor(
        private val string: String? = null,
        private val offsetDate: OffsetDateTime? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): String? = string

        fun offsetDate(): OffsetDateTime? = offsetDate

        fun isString(): Boolean = string != null

        fun isOffsetDate(): Boolean = offsetDate != null

        fun asString(): String = string.getOrThrow("string")

        fun asOffsetDate(): OffsetDateTime = offsetDate.getOrThrow("offsetDate")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                offsetDate != null -> visitor.visitOffsetDate(offsetDate)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): StartTime = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitOffsetDate(offsetDate: OffsetDateTime) {}
                }
            )
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
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitString(string: String) = 1

                    override fun visitOffsetDate(offsetDate: OffsetDateTime) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is StartTime && string == other.string && offsetDate == other.offsetDate
        }

        override fun hashCode(): Int = Objects.hash(string, offsetDate)

        override fun toString(): String =
            when {
                string != null -> "StartTime{string=$string}"
                offsetDate != null -> "StartTime{offsetDate=$offsetDate}"
                _json != null -> "StartTime{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid StartTime")
            }

        companion object {

            fun ofString(string: String) = StartTime(string = string)

            fun ofOffsetDate(offsetDate: OffsetDateTime) = StartTime(offsetDate = offsetDate)
        }

        /**
         * An interface that defines how to map each variant of [StartTime] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitOffsetDate(offsetDate: OffsetDateTime): T

            /**
             * Maps an unknown variant of [StartTime] to a value of type [T].
             *
             * An instance of [StartTime] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws HanzoInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HanzoInvalidDataException("Unknown StartTime: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<StartTime>(StartTime::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): StartTime {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                                StartTime(offsetDate = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                StartTime(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> StartTime(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<StartTime>(StartTime::class) {

            override fun serialize(
                value: StartTime,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.offsetDate != null -> generator.writeObject(value.offsetDate)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid StartTime")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SpendRetrieveReportResponse &&
            apiKey == other.apiKey &&
            callType == other.callType &&
            endTime == other.endTime &&
            messages == other.messages &&
            requestId == other.requestId &&
            response == other.response &&
            startTime == other.startTime &&
            apiBase == other.apiBase &&
            cacheHit == other.cacheHit &&
            cacheKey == other.cacheKey &&
            completionTokens == other.completionTokens &&
            metadata == other.metadata &&
            model == other.model &&
            promptTokens == other.promptTokens &&
            requestTags == other.requestTags &&
            requesterIpAddress == other.requesterIpAddress &&
            spend == other.spend &&
            totalTokens == other.totalTokens &&
            user == other.user &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            apiKey,
            callType,
            endTime,
            messages,
            requestId,
            response,
            startTime,
            apiBase,
            cacheHit,
            cacheKey,
            completionTokens,
            metadata,
            model,
            promptTokens,
            requestTags,
            requesterIpAddress,
            spend,
            totalTokens,
            user,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SpendRetrieveReportResponse{apiKey=$apiKey, callType=$callType, endTime=$endTime, messages=$messages, requestId=$requestId, response=$response, startTime=$startTime, apiBase=$apiBase, cacheHit=$cacheHit, cacheKey=$cacheKey, completionTokens=$completionTokens, metadata=$metadata, model=$model, promptTokens=$promptTokens, requestTags=$requestTags, requesterIpAddress=$requesterIpAddress, spend=$spend, totalTokens=$totalTokens, user=$user, additionalProperties=$additionalProperties}"
}
