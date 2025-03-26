// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.customer

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hanzo_ai.api.core.Enum
import com.hanzo_ai.api.core.ExcludeMissing
import com.hanzo_ai.api.core.JsonField
import com.hanzo_ai.api.core.JsonMissing
import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.core.Params
import com.hanzo_ai.api.core.checkRequired
import com.hanzo_ai.api.core.http.Headers
import com.hanzo_ai.api.core.http.QueryParams
import com.hanzo_ai.api.core.toImmutable
import com.hanzo_ai.api.errors.HanzoInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * Allow creating a new Customer
 *
 * Parameters:
 * - user_id: str - The unique identifier for the user.
 * - alias: Optional[str] - A human-friendly alias for the user.
 * - blocked: bool - Flag to allow or disallow requests for this end-user. Default is False.
 * - max_budget: Optional[float] - The maximum budget allocated to the user. Either 'max_budget' or
 *   'budget_id' should be provided, not both.
 * - budget_id: Optional[str] - The identifier for an existing budget allocated to the user. Either
 *   'max_budget' or 'budget_id' should be provided, not both.
 * - allowed_model_region: Optional[Union[Literal["eu"], Literal["us"]]] - Require all user requests
 *   to use models in this specific region.
 * - default_model: Optional[str] - If no equivalent model in the allowed region, default all
 *   requests to this model.
 * - metadata: Optional[dict] = Metadata for customer, store information for customer. Example
 *   metadata = {"data_training_opt_out": True}
 * - budget_duration: Optional[str] - Budget is reset at the end of specified duration. If not set,
 *   budget is never reset. You can set duration as seconds ("30s"), minutes ("30m"), hours ("30h"),
 *   days ("30d").
 * - tpm_limit: Optional[int] - [Not Implemented Yet] Specify tpm limit for a given customer (Tokens
 *   per minute)
 * - rpm_limit: Optional[int] - [Not Implemented Yet] Specify rpm limit for a given customer
 *   (Requests per minute)
 * - model_max_budget: Optional[dict] - [Not Implemented Yet] Specify max budget for a given model.
 *   Example: {"openai/gpt-4o-mini": {"max_budget": 100.0, "budget_duration": "1d"}}
 * - max_parallel_requests: Optional[int] - [Not Implemented Yet] Specify max parallel requests for
 *   a given customer.
 * - soft_budget: Optional[float] - [Not Implemented Yet] Get alerts when customer crosses given
 *   budget, doesn't block requests.
 * - Allow specifying allowed regions
 * - Allow specifying default model
 *
 * Example curl:
 * ```
 * curl --location 'http://0.0.0.0:4000/customer/new'         --header 'Authorization: Bearer sk-1234'         --header 'Content-Type: application/json'         --data '{
 *         "user_id" : "z-jaff-3",
 *         "allowed_region": "eu",
 *         "budget_id": "free_tier",
 *         "default_model": "azure/gpt-3.5-turbo-eu" <- all calls from this user, use this model?
 *     }'
 *
 *     # return end-user object
 * ```
 *
 * NOTE: This used to be called `/end_user/new`, we will still be maintaining compatibility for
 * /end_user/XXX for these endpoints
 */
class CustomerCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): String = body.userId()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun alias(): String? = body.alias()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowedModelRegion(): AllowedModelRegion? = body.allowedModelRegion()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun blocked(): Boolean? = body.blocked()

    /**
     * Max duration budget should be set for (e.g. '1hr', '1d', '28d')
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun budgetDuration(): String? = body.budgetDuration()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun budgetId(): String? = body.budgetId()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultModel(): String? = body.defaultModel()

    /**
     * Requests will fail if this budget (in USD) is exceeded.
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxBudget(): Double? = body.maxBudget()

    /**
     * Max concurrent requests allowed for this budget id.
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxParallelRequests(): Long? = body.maxParallelRequests()

    /**
     * Max budget for each model (e.g. {'gpt-4o': {'max_budget': '0.0000001', 'budget_duration':
     * '1d', 'tpm_limit': 1000, 'rpm_limit': 1000}})
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modelMaxBudget(): ModelMaxBudget? = body.modelMaxBudget()

    /**
     * Max requests per minute, allowed for this budget id.
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rpmLimit(): Long? = body.rpmLimit()

    /**
     * Requests will NOT fail if this is exceeded. Will fire alerting though.
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun softBudget(): Double? = body.softBudget()

    /**
     * Max tokens per minute, allowed for this budget id.
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tpmLimit(): Long? = body.tpmLimit()

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _userId(): JsonField<String> = body._userId()

    /**
     * Returns the raw JSON value of [alias].
     *
     * Unlike [alias], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _alias(): JsonField<String> = body._alias()

    /**
     * Returns the raw JSON value of [allowedModelRegion].
     *
     * Unlike [allowedModelRegion], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _allowedModelRegion(): JsonField<AllowedModelRegion> = body._allowedModelRegion()

    /**
     * Returns the raw JSON value of [blocked].
     *
     * Unlike [blocked], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _blocked(): JsonField<Boolean> = body._blocked()

    /**
     * Returns the raw JSON value of [budgetDuration].
     *
     * Unlike [budgetDuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _budgetDuration(): JsonField<String> = body._budgetDuration()

    /**
     * Returns the raw JSON value of [budgetId].
     *
     * Unlike [budgetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _budgetId(): JsonField<String> = body._budgetId()

    /**
     * Returns the raw JSON value of [defaultModel].
     *
     * Unlike [defaultModel], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _defaultModel(): JsonField<String> = body._defaultModel()

    /**
     * Returns the raw JSON value of [maxBudget].
     *
     * Unlike [maxBudget], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxBudget(): JsonField<Double> = body._maxBudget()

    /**
     * Returns the raw JSON value of [maxParallelRequests].
     *
     * Unlike [maxParallelRequests], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _maxParallelRequests(): JsonField<Long> = body._maxParallelRequests()

    /**
     * Returns the raw JSON value of [modelMaxBudget].
     *
     * Unlike [modelMaxBudget], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _modelMaxBudget(): JsonField<ModelMaxBudget> = body._modelMaxBudget()

    /**
     * Returns the raw JSON value of [rpmLimit].
     *
     * Unlike [rpmLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rpmLimit(): JsonField<Long> = body._rpmLimit()

    /**
     * Returns the raw JSON value of [softBudget].
     *
     * Unlike [softBudget], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _softBudget(): JsonField<Double> = body._softBudget()

    /**
     * Returns the raw JSON value of [tpmLimit].
     *
     * Unlike [tpmLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tpmLimit(): JsonField<Long> = body._tpmLimit()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomerCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .userId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CustomerCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(customerCreateParams: CustomerCreateParams) = apply {
            body = customerCreateParams.body.toBuilder()
            additionalHeaders = customerCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerCreateParams.additionalQueryParams.toBuilder()
        }

        fun userId(userId: String) = apply { body.userId(userId) }

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { body.userId(userId) }

        fun alias(alias: String?) = apply { body.alias(alias) }

        /**
         * Sets [Builder.alias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alias] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun alias(alias: JsonField<String>) = apply { body.alias(alias) }

        fun allowedModelRegion(allowedModelRegion: AllowedModelRegion?) = apply {
            body.allowedModelRegion(allowedModelRegion)
        }

        /**
         * Sets [Builder.allowedModelRegion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedModelRegion] with a well-typed
         * [AllowedModelRegion] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun allowedModelRegion(allowedModelRegion: JsonField<AllowedModelRegion>) = apply {
            body.allowedModelRegion(allowedModelRegion)
        }

        fun blocked(blocked: Boolean) = apply { body.blocked(blocked) }

        /**
         * Sets [Builder.blocked] to an arbitrary JSON value.
         *
         * You should usually call [Builder.blocked] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun blocked(blocked: JsonField<Boolean>) = apply { body.blocked(blocked) }

        /** Max duration budget should be set for (e.g. '1hr', '1d', '28d') */
        fun budgetDuration(budgetDuration: String?) = apply { body.budgetDuration(budgetDuration) }

        /**
         * Sets [Builder.budgetDuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.budgetDuration] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun budgetDuration(budgetDuration: JsonField<String>) = apply {
            body.budgetDuration(budgetDuration)
        }

        fun budgetId(budgetId: String?) = apply { body.budgetId(budgetId) }

        /**
         * Sets [Builder.budgetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.budgetId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun budgetId(budgetId: JsonField<String>) = apply { body.budgetId(budgetId) }

        fun defaultModel(defaultModel: String?) = apply { body.defaultModel(defaultModel) }

        /**
         * Sets [Builder.defaultModel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultModel] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun defaultModel(defaultModel: JsonField<String>) = apply {
            body.defaultModel(defaultModel)
        }

        /** Requests will fail if this budget (in USD) is exceeded. */
        fun maxBudget(maxBudget: Double?) = apply { body.maxBudget(maxBudget) }

        /**
         * Alias for [Builder.maxBudget].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxBudget(maxBudget: Double) = maxBudget(maxBudget as Double?)

        /**
         * Sets [Builder.maxBudget] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxBudget] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxBudget(maxBudget: JsonField<Double>) = apply { body.maxBudget(maxBudget) }

        /** Max concurrent requests allowed for this budget id. */
        fun maxParallelRequests(maxParallelRequests: Long?) = apply {
            body.maxParallelRequests(maxParallelRequests)
        }

        /**
         * Alias for [Builder.maxParallelRequests].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxParallelRequests(maxParallelRequests: Long) =
            maxParallelRequests(maxParallelRequests as Long?)

        /**
         * Sets [Builder.maxParallelRequests] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxParallelRequests] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxParallelRequests(maxParallelRequests: JsonField<Long>) = apply {
            body.maxParallelRequests(maxParallelRequests)
        }

        /**
         * Max budget for each model (e.g. {'gpt-4o': {'max_budget': '0.0000001', 'budget_duration':
         * '1d', 'tpm_limit': 1000, 'rpm_limit': 1000}})
         */
        fun modelMaxBudget(modelMaxBudget: ModelMaxBudget?) = apply {
            body.modelMaxBudget(modelMaxBudget)
        }

        /**
         * Sets [Builder.modelMaxBudget] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelMaxBudget] with a well-typed [ModelMaxBudget] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun modelMaxBudget(modelMaxBudget: JsonField<ModelMaxBudget>) = apply {
            body.modelMaxBudget(modelMaxBudget)
        }

        /** Max requests per minute, allowed for this budget id. */
        fun rpmLimit(rpmLimit: Long?) = apply { body.rpmLimit(rpmLimit) }

        /**
         * Alias for [Builder.rpmLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun rpmLimit(rpmLimit: Long) = rpmLimit(rpmLimit as Long?)

        /**
         * Sets [Builder.rpmLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rpmLimit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rpmLimit(rpmLimit: JsonField<Long>) = apply { body.rpmLimit(rpmLimit) }

        /** Requests will NOT fail if this is exceeded. Will fire alerting though. */
        fun softBudget(softBudget: Double?) = apply { body.softBudget(softBudget) }

        /**
         * Alias for [Builder.softBudget].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun softBudget(softBudget: Double) = softBudget(softBudget as Double?)

        /**
         * Sets [Builder.softBudget] to an arbitrary JSON value.
         *
         * You should usually call [Builder.softBudget] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun softBudget(softBudget: JsonField<Double>) = apply { body.softBudget(softBudget) }

        /** Max tokens per minute, allowed for this budget id. */
        fun tpmLimit(tpmLimit: Long?) = apply { body.tpmLimit(tpmLimit) }

        /**
         * Alias for [Builder.tpmLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun tpmLimit(tpmLimit: Long) = tpmLimit(tpmLimit as Long?)

        /**
         * Sets [Builder.tpmLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tpmLimit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tpmLimit(tpmLimit: JsonField<Long>) = apply { body.tpmLimit(tpmLimit) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
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
         * Returns an immutable instance of [CustomerCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerCreateParams =
            CustomerCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Create a new customer, allocate a budget to them */
    class Body
    private constructor(
        private val userId: JsonField<String>,
        private val alias: JsonField<String>,
        private val allowedModelRegion: JsonField<AllowedModelRegion>,
        private val blocked: JsonField<Boolean>,
        private val budgetDuration: JsonField<String>,
        private val budgetId: JsonField<String>,
        private val defaultModel: JsonField<String>,
        private val maxBudget: JsonField<Double>,
        private val maxParallelRequests: JsonField<Long>,
        private val modelMaxBudget: JsonField<ModelMaxBudget>,
        private val rpmLimit: JsonField<Long>,
        private val softBudget: JsonField<Double>,
        private val tpmLimit: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("alias") @ExcludeMissing alias: JsonField<String> = JsonMissing.of(),
            @JsonProperty("allowed_model_region")
            @ExcludeMissing
            allowedModelRegion: JsonField<AllowedModelRegion> = JsonMissing.of(),
            @JsonProperty("blocked") @ExcludeMissing blocked: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("budget_duration")
            @ExcludeMissing
            budgetDuration: JsonField<String> = JsonMissing.of(),
            @JsonProperty("budget_id")
            @ExcludeMissing
            budgetId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("default_model")
            @ExcludeMissing
            defaultModel: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_budget")
            @ExcludeMissing
            maxBudget: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("max_parallel_requests")
            @ExcludeMissing
            maxParallelRequests: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("model_max_budget")
            @ExcludeMissing
            modelMaxBudget: JsonField<ModelMaxBudget> = JsonMissing.of(),
            @JsonProperty("rpm_limit") @ExcludeMissing rpmLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("soft_budget")
            @ExcludeMissing
            softBudget: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("tpm_limit") @ExcludeMissing tpmLimit: JsonField<Long> = JsonMissing.of(),
        ) : this(
            userId,
            alias,
            allowedModelRegion,
            blocked,
            budgetDuration,
            budgetId,
            defaultModel,
            maxBudget,
            maxParallelRequests,
            modelMaxBudget,
            rpmLimit,
            softBudget,
            tpmLimit,
            mutableMapOf(),
        )

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun userId(): String = userId.getRequired("user_id")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun alias(): String? = alias.getNullable("alias")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allowedModelRegion(): AllowedModelRegion? =
            allowedModelRegion.getNullable("allowed_model_region")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun blocked(): Boolean? = blocked.getNullable("blocked")

        /**
         * Max duration budget should be set for (e.g. '1hr', '1d', '28d')
         *
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun budgetDuration(): String? = budgetDuration.getNullable("budget_duration")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun budgetId(): String? = budgetId.getNullable("budget_id")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultModel(): String? = defaultModel.getNullable("default_model")

        /**
         * Requests will fail if this budget (in USD) is exceeded.
         *
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxBudget(): Double? = maxBudget.getNullable("max_budget")

        /**
         * Max concurrent requests allowed for this budget id.
         *
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxParallelRequests(): Long? = maxParallelRequests.getNullable("max_parallel_requests")

        /**
         * Max budget for each model (e.g. {'gpt-4o': {'max_budget': '0.0000001', 'budget_duration':
         * '1d', 'tpm_limit': 1000, 'rpm_limit': 1000}})
         *
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun modelMaxBudget(): ModelMaxBudget? = modelMaxBudget.getNullable("model_max_budget")

        /**
         * Max requests per minute, allowed for this budget id.
         *
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rpmLimit(): Long? = rpmLimit.getNullable("rpm_limit")

        /**
         * Requests will NOT fail if this is exceeded. Will fire alerting though.
         *
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun softBudget(): Double? = softBudget.getNullable("soft_budget")

        /**
         * Max tokens per minute, allowed for this budget id.
         *
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tpmLimit(): Long? = tpmLimit.getNullable("tpm_limit")

        /**
         * Returns the raw JSON value of [userId].
         *
         * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

        /**
         * Returns the raw JSON value of [alias].
         *
         * Unlike [alias], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("alias") @ExcludeMissing fun _alias(): JsonField<String> = alias

        /**
         * Returns the raw JSON value of [allowedModelRegion].
         *
         * Unlike [allowedModelRegion], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allowed_model_region")
        @ExcludeMissing
        fun _allowedModelRegion(): JsonField<AllowedModelRegion> = allowedModelRegion

        /**
         * Returns the raw JSON value of [blocked].
         *
         * Unlike [blocked], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("blocked") @ExcludeMissing fun _blocked(): JsonField<Boolean> = blocked

        /**
         * Returns the raw JSON value of [budgetDuration].
         *
         * Unlike [budgetDuration], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("budget_duration")
        @ExcludeMissing
        fun _budgetDuration(): JsonField<String> = budgetDuration

        /**
         * Returns the raw JSON value of [budgetId].
         *
         * Unlike [budgetId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("budget_id") @ExcludeMissing fun _budgetId(): JsonField<String> = budgetId

        /**
         * Returns the raw JSON value of [defaultModel].
         *
         * Unlike [defaultModel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("default_model")
        @ExcludeMissing
        fun _defaultModel(): JsonField<String> = defaultModel

        /**
         * Returns the raw JSON value of [maxBudget].
         *
         * Unlike [maxBudget], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_budget") @ExcludeMissing fun _maxBudget(): JsonField<Double> = maxBudget

        /**
         * Returns the raw JSON value of [maxParallelRequests].
         *
         * Unlike [maxParallelRequests], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("max_parallel_requests")
        @ExcludeMissing
        fun _maxParallelRequests(): JsonField<Long> = maxParallelRequests

        /**
         * Returns the raw JSON value of [modelMaxBudget].
         *
         * Unlike [modelMaxBudget], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("model_max_budget")
        @ExcludeMissing
        fun _modelMaxBudget(): JsonField<ModelMaxBudget> = modelMaxBudget

        /**
         * Returns the raw JSON value of [rpmLimit].
         *
         * Unlike [rpmLimit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rpm_limit") @ExcludeMissing fun _rpmLimit(): JsonField<Long> = rpmLimit

        /**
         * Returns the raw JSON value of [softBudget].
         *
         * Unlike [softBudget], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("soft_budget")
        @ExcludeMissing
        fun _softBudget(): JsonField<Double> = softBudget

        /**
         * Returns the raw JSON value of [tpmLimit].
         *
         * Unlike [tpmLimit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tpm_limit") @ExcludeMissing fun _tpmLimit(): JsonField<Long> = tpmLimit

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .userId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var userId: JsonField<String>? = null
            private var alias: JsonField<String> = JsonMissing.of()
            private var allowedModelRegion: JsonField<AllowedModelRegion> = JsonMissing.of()
            private var blocked: JsonField<Boolean> = JsonMissing.of()
            private var budgetDuration: JsonField<String> = JsonMissing.of()
            private var budgetId: JsonField<String> = JsonMissing.of()
            private var defaultModel: JsonField<String> = JsonMissing.of()
            private var maxBudget: JsonField<Double> = JsonMissing.of()
            private var maxParallelRequests: JsonField<Long> = JsonMissing.of()
            private var modelMaxBudget: JsonField<ModelMaxBudget> = JsonMissing.of()
            private var rpmLimit: JsonField<Long> = JsonMissing.of()
            private var softBudget: JsonField<Double> = JsonMissing.of()
            private var tpmLimit: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                userId = body.userId
                alias = body.alias
                allowedModelRegion = body.allowedModelRegion
                blocked = body.blocked
                budgetDuration = body.budgetDuration
                budgetId = body.budgetId
                defaultModel = body.defaultModel
                maxBudget = body.maxBudget
                maxParallelRequests = body.maxParallelRequests
                modelMaxBudget = body.modelMaxBudget
                rpmLimit = body.rpmLimit
                softBudget = body.softBudget
                tpmLimit = body.tpmLimit
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun userId(userId: String) = userId(JsonField.of(userId))

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

            fun alias(alias: String?) = alias(JsonField.ofNullable(alias))

            /**
             * Sets [Builder.alias] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alias] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun alias(alias: JsonField<String>) = apply { this.alias = alias }

            fun allowedModelRegion(allowedModelRegion: AllowedModelRegion?) =
                allowedModelRegion(JsonField.ofNullable(allowedModelRegion))

            /**
             * Sets [Builder.allowedModelRegion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowedModelRegion] with a well-typed
             * [AllowedModelRegion] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun allowedModelRegion(allowedModelRegion: JsonField<AllowedModelRegion>) = apply {
                this.allowedModelRegion = allowedModelRegion
            }

            fun blocked(blocked: Boolean) = blocked(JsonField.of(blocked))

            /**
             * Sets [Builder.blocked] to an arbitrary JSON value.
             *
             * You should usually call [Builder.blocked] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun blocked(blocked: JsonField<Boolean>) = apply { this.blocked = blocked }

            /** Max duration budget should be set for (e.g. '1hr', '1d', '28d') */
            fun budgetDuration(budgetDuration: String?) =
                budgetDuration(JsonField.ofNullable(budgetDuration))

            /**
             * Sets [Builder.budgetDuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.budgetDuration] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun budgetDuration(budgetDuration: JsonField<String>) = apply {
                this.budgetDuration = budgetDuration
            }

            fun budgetId(budgetId: String?) = budgetId(JsonField.ofNullable(budgetId))

            /**
             * Sets [Builder.budgetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.budgetId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun budgetId(budgetId: JsonField<String>) = apply { this.budgetId = budgetId }

            fun defaultModel(defaultModel: String?) =
                defaultModel(JsonField.ofNullable(defaultModel))

            /**
             * Sets [Builder.defaultModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultModel] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun defaultModel(defaultModel: JsonField<String>) = apply {
                this.defaultModel = defaultModel
            }

            /** Requests will fail if this budget (in USD) is exceeded. */
            fun maxBudget(maxBudget: Double?) = maxBudget(JsonField.ofNullable(maxBudget))

            /**
             * Alias for [Builder.maxBudget].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxBudget(maxBudget: Double) = maxBudget(maxBudget as Double?)

            /**
             * Sets [Builder.maxBudget] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxBudget] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxBudget(maxBudget: JsonField<Double>) = apply { this.maxBudget = maxBudget }

            /** Max concurrent requests allowed for this budget id. */
            fun maxParallelRequests(maxParallelRequests: Long?) =
                maxParallelRequests(JsonField.ofNullable(maxParallelRequests))

            /**
             * Alias for [Builder.maxParallelRequests].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxParallelRequests(maxParallelRequests: Long) =
                maxParallelRequests(maxParallelRequests as Long?)

            /**
             * Sets [Builder.maxParallelRequests] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxParallelRequests] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxParallelRequests(maxParallelRequests: JsonField<Long>) = apply {
                this.maxParallelRequests = maxParallelRequests
            }

            /**
             * Max budget for each model (e.g. {'gpt-4o': {'max_budget': '0.0000001',
             * 'budget_duration': '1d', 'tpm_limit': 1000, 'rpm_limit': 1000}})
             */
            fun modelMaxBudget(modelMaxBudget: ModelMaxBudget?) =
                modelMaxBudget(JsonField.ofNullable(modelMaxBudget))

            /**
             * Sets [Builder.modelMaxBudget] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelMaxBudget] with a well-typed [ModelMaxBudget]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun modelMaxBudget(modelMaxBudget: JsonField<ModelMaxBudget>) = apply {
                this.modelMaxBudget = modelMaxBudget
            }

            /** Max requests per minute, allowed for this budget id. */
            fun rpmLimit(rpmLimit: Long?) = rpmLimit(JsonField.ofNullable(rpmLimit))

            /**
             * Alias for [Builder.rpmLimit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun rpmLimit(rpmLimit: Long) = rpmLimit(rpmLimit as Long?)

            /**
             * Sets [Builder.rpmLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rpmLimit] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rpmLimit(rpmLimit: JsonField<Long>) = apply { this.rpmLimit = rpmLimit }

            /** Requests will NOT fail if this is exceeded. Will fire alerting though. */
            fun softBudget(softBudget: Double?) = softBudget(JsonField.ofNullable(softBudget))

            /**
             * Alias for [Builder.softBudget].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun softBudget(softBudget: Double) = softBudget(softBudget as Double?)

            /**
             * Sets [Builder.softBudget] to an arbitrary JSON value.
             *
             * You should usually call [Builder.softBudget] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun softBudget(softBudget: JsonField<Double>) = apply { this.softBudget = softBudget }

            /** Max tokens per minute, allowed for this budget id. */
            fun tpmLimit(tpmLimit: Long?) = tpmLimit(JsonField.ofNullable(tpmLimit))

            /**
             * Alias for [Builder.tpmLimit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun tpmLimit(tpmLimit: Long) = tpmLimit(tpmLimit as Long?)

            /**
             * Sets [Builder.tpmLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tpmLimit] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tpmLimit(tpmLimit: JsonField<Long>) = apply { this.tpmLimit = tpmLimit }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .userId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("userId", userId),
                    alias,
                    allowedModelRegion,
                    blocked,
                    budgetDuration,
                    budgetId,
                    defaultModel,
                    maxBudget,
                    maxParallelRequests,
                    modelMaxBudget,
                    rpmLimit,
                    softBudget,
                    tpmLimit,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            userId()
            alias()
            allowedModelRegion()
            blocked()
            budgetDuration()
            budgetId()
            defaultModel()
            maxBudget()
            maxParallelRequests()
            modelMaxBudget()?.validate()
            rpmLimit()
            softBudget()
            tpmLimit()
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && userId == other.userId && alias == other.alias && allowedModelRegion == other.allowedModelRegion && blocked == other.blocked && budgetDuration == other.budgetDuration && budgetId == other.budgetId && defaultModel == other.defaultModel && maxBudget == other.maxBudget && maxParallelRequests == other.maxParallelRequests && modelMaxBudget == other.modelMaxBudget && rpmLimit == other.rpmLimit && softBudget == other.softBudget && tpmLimit == other.tpmLimit && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(userId, alias, allowedModelRegion, blocked, budgetDuration, budgetId, defaultModel, maxBudget, maxParallelRequests, modelMaxBudget, rpmLimit, softBudget, tpmLimit, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{userId=$userId, alias=$alias, allowedModelRegion=$allowedModelRegion, blocked=$blocked, budgetDuration=$budgetDuration, budgetId=$budgetId, defaultModel=$defaultModel, maxBudget=$maxBudget, maxParallelRequests=$maxParallelRequests, modelMaxBudget=$modelMaxBudget, rpmLimit=$rpmLimit, softBudget=$softBudget, tpmLimit=$tpmLimit, additionalProperties=$additionalProperties}"
    }

    class AllowedModelRegion
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            val EU = of("eu")

            val US = of("us")

            fun of(value: String) = AllowedModelRegion(JsonField.of(value))
        }

        /** An enum containing [AllowedModelRegion]'s known values. */
        enum class Known {
            EU,
            US,
        }

        /**
         * An enum containing [AllowedModelRegion]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AllowedModelRegion] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EU,
            US,
            /**
             * An enum member indicating that [AllowedModelRegion] was instantiated with an unknown
             * value.
             */
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
                EU -> Value.EU
                US -> Value.US
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
                EU -> Known.EU
                US -> Known.US
                else -> throw HanzoInvalidDataException("Unknown AllowedModelRegion: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AllowedModelRegion && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Max budget for each model (e.g. {'gpt-4o': {'max_budget': '0.0000001', 'budget_duration':
     * '1d', 'tpm_limit': 1000, 'rpm_limit': 1000}})
     */
    class ModelMaxBudget
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ModelMaxBudget]. */
            fun builder() = Builder()
        }

        /** A builder for [ModelMaxBudget]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(modelMaxBudget: ModelMaxBudget) = apply {
                additionalProperties = modelMaxBudget.additionalProperties.toMutableMap()
            }

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
             * Returns an immutable instance of [ModelMaxBudget].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ModelMaxBudget = ModelMaxBudget(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ModelMaxBudget = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ModelMaxBudget && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "ModelMaxBudget{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
