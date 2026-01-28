// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.embeddings

import ai.hanzo.api.core.BaseDeserializer
import ai.hanzo.api.core.BaseSerializer
import ai.hanzo.api.core.ExcludeMissing
import ai.hanzo.api.core.JsonField
import ai.hanzo.api.core.JsonMissing
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.Params
import ai.hanzo.api.core.allMaxBy
import ai.hanzo.api.core.checkKnown
import ai.hanzo.api.core.checkRequired
import ai.hanzo.api.core.getOrThrow
import ai.hanzo.api.core.http.Headers
import ai.hanzo.api.core.http.QueryParams
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
import java.util.Collections
import java.util.Objects

/**
 * Follows the exact same API spec as `OpenAI's Embeddings API
 * https://platform.openai.com/docs/api-reference/embeddings`
 *
 * ```bash
 * curl -X POST http://localhost:4000/v1/embeddings
 * -H "Content-Type: application/json"
 * -H "Authorization: Bearer sk-1234"
 * -d '{
 *     "model": "text-embedding-ada-002",
 *     "input": "The quick brown fox jumps over the lazy dog"
 * }'
 * ```
 */
class EmbeddingCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun model(): String = body.model()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiBase(): String? = body.apiBase()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiKey(): String? = body.apiKey()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiType(): String? = body.apiType()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiVersion(): String? = body.apiVersion()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun caching(): Boolean? = body.caching()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customLlmProvider(): CustomLlmProvider? = body.customLlmProvider()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun input(): List<String>? = body.input()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun litellmCallId(): String? = body.litellmCallId()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun litellmLoggingObj(): LitellmLoggingObj? = body.litellmLoggingObj()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun loggerFn(): String? = body.loggerFn()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeout(): Long? = body.timeout()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun user(): String? = body.user()

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _model(): JsonField<String> = body._model()

    /**
     * Returns the raw JSON value of [apiBase].
     *
     * Unlike [apiBase], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _apiBase(): JsonField<String> = body._apiBase()

    /**
     * Returns the raw JSON value of [apiKey].
     *
     * Unlike [apiKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _apiKey(): JsonField<String> = body._apiKey()

    /**
     * Returns the raw JSON value of [apiType].
     *
     * Unlike [apiType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _apiType(): JsonField<String> = body._apiType()

    /**
     * Returns the raw JSON value of [apiVersion].
     *
     * Unlike [apiVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _apiVersion(): JsonField<String> = body._apiVersion()

    /**
     * Returns the raw JSON value of [caching].
     *
     * Unlike [caching], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _caching(): JsonField<Boolean> = body._caching()

    /**
     * Returns the raw JSON value of [customLlmProvider].
     *
     * Unlike [customLlmProvider], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _customLlmProvider(): JsonField<CustomLlmProvider> = body._customLlmProvider()

    /**
     * Returns the raw JSON value of [input].
     *
     * Unlike [input], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _input(): JsonField<List<String>> = body._input()

    /**
     * Returns the raw JSON value of [litellmCallId].
     *
     * Unlike [litellmCallId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _litellmCallId(): JsonField<String> = body._litellmCallId()

    /**
     * Returns the raw JSON value of [litellmLoggingObj].
     *
     * Unlike [litellmLoggingObj], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _litellmLoggingObj(): JsonField<LitellmLoggingObj> = body._litellmLoggingObj()

    /**
     * Returns the raw JSON value of [loggerFn].
     *
     * Unlike [loggerFn], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _loggerFn(): JsonField<String> = body._loggerFn()

    /**
     * Returns the raw JSON value of [timeout].
     *
     * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timeout(): JsonField<Long> = body._timeout()

    /**
     * Returns the raw JSON value of [user].
     *
     * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _user(): JsonField<String> = body._user()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmbeddingCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .model()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EmbeddingCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(embeddingCreateParams: EmbeddingCreateParams) = apply {
            body = embeddingCreateParams.body.toBuilder()
            additionalHeaders = embeddingCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = embeddingCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [model]
         * - [apiBase]
         * - [apiKey]
         * - [apiType]
         * - [apiVersion]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun model(model: String) = apply { body.model(model) }

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { body.model(model) }

        fun apiBase(apiBase: String?) = apply { body.apiBase(apiBase) }

        /**
         * Sets [Builder.apiBase] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiBase] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apiBase(apiBase: JsonField<String>) = apply { body.apiBase(apiBase) }

        fun apiKey(apiKey: String?) = apply { body.apiKey(apiKey) }

        /**
         * Sets [Builder.apiKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiKey] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apiKey(apiKey: JsonField<String>) = apply { body.apiKey(apiKey) }

        fun apiType(apiType: String?) = apply { body.apiType(apiType) }

        /**
         * Sets [Builder.apiType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apiType(apiType: JsonField<String>) = apply { body.apiType(apiType) }

        fun apiVersion(apiVersion: String?) = apply { body.apiVersion(apiVersion) }

        /**
         * Sets [Builder.apiVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiVersion] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun apiVersion(apiVersion: JsonField<String>) = apply { body.apiVersion(apiVersion) }

        fun caching(caching: Boolean) = apply { body.caching(caching) }

        /**
         * Sets [Builder.caching] to an arbitrary JSON value.
         *
         * You should usually call [Builder.caching] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun caching(caching: JsonField<Boolean>) = apply { body.caching(caching) }

        fun customLlmProvider(customLlmProvider: CustomLlmProvider?) = apply {
            body.customLlmProvider(customLlmProvider)
        }

        /**
         * Sets [Builder.customLlmProvider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customLlmProvider] with a well-typed [CustomLlmProvider]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun customLlmProvider(customLlmProvider: JsonField<CustomLlmProvider>) = apply {
            body.customLlmProvider(customLlmProvider)
        }

        /** Alias for calling [customLlmProvider] with `CustomLlmProvider.ofString(string)`. */
        fun customLlmProvider(string: String) = apply { body.customLlmProvider(string) }

        /**
         * Alias for calling [customLlmProvider] with
         * `CustomLlmProvider.ofUnionMember1(unionMember1)`.
         */
        fun customLlmProvider(unionMember1: CustomLlmProvider.UnionMember1) = apply {
            body.customLlmProvider(unionMember1)
        }

        fun input(input: List<String>) = apply { body.input(input) }

        /**
         * Sets [Builder.input] to an arbitrary JSON value.
         *
         * You should usually call [Builder.input] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun input(input: JsonField<List<String>>) = apply { body.input(input) }

        /**
         * Adds a single [String] to [Builder.input].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInput(input: String) = apply { body.addInput(input) }

        fun litellmCallId(litellmCallId: String?) = apply { body.litellmCallId(litellmCallId) }

        /**
         * Sets [Builder.litellmCallId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.litellmCallId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun litellmCallId(litellmCallId: JsonField<String>) = apply {
            body.litellmCallId(litellmCallId)
        }

        fun litellmLoggingObj(litellmLoggingObj: LitellmLoggingObj?) = apply {
            body.litellmLoggingObj(litellmLoggingObj)
        }

        /**
         * Sets [Builder.litellmLoggingObj] to an arbitrary JSON value.
         *
         * You should usually call [Builder.litellmLoggingObj] with a well-typed [LitellmLoggingObj]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun litellmLoggingObj(litellmLoggingObj: JsonField<LitellmLoggingObj>) = apply {
            body.litellmLoggingObj(litellmLoggingObj)
        }

        fun loggerFn(loggerFn: String?) = apply { body.loggerFn(loggerFn) }

        /**
         * Sets [Builder.loggerFn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.loggerFn] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun loggerFn(loggerFn: JsonField<String>) = apply { body.loggerFn(loggerFn) }

        fun timeout(timeout: Long) = apply { body.timeout(timeout) }

        /**
         * Sets [Builder.timeout] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeout] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timeout(timeout: JsonField<Long>) = apply { body.timeout(timeout) }

        fun user(user: String?) = apply { body.user(user) }

        /**
         * Sets [Builder.user] to an arbitrary JSON value.
         *
         * You should usually call [Builder.user] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun user(user: JsonField<String>) = apply { body.user(user) }

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
         * Returns an immutable instance of [EmbeddingCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .model()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmbeddingCreateParams =
            EmbeddingCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val model: JsonField<String>,
        private val apiBase: JsonField<String>,
        private val apiKey: JsonField<String>,
        private val apiType: JsonField<String>,
        private val apiVersion: JsonField<String>,
        private val caching: JsonField<Boolean>,
        private val customLlmProvider: JsonField<CustomLlmProvider>,
        private val input: JsonField<List<String>>,
        private val litellmCallId: JsonField<String>,
        private val litellmLoggingObj: JsonField<LitellmLoggingObj>,
        private val loggerFn: JsonField<String>,
        private val timeout: JsonField<Long>,
        private val user: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("api_base") @ExcludeMissing apiBase: JsonField<String> = JsonMissing.of(),
            @JsonProperty("api_key") @ExcludeMissing apiKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("api_type") @ExcludeMissing apiType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("api_version")
            @ExcludeMissing
            apiVersion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("caching") @ExcludeMissing caching: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("custom_llm_provider")
            @ExcludeMissing
            customLlmProvider: JsonField<CustomLlmProvider> = JsonMissing.of(),
            @JsonProperty("input")
            @ExcludeMissing
            input: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("litellm_call_id")
            @ExcludeMissing
            litellmCallId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("litellm_logging_obj")
            @ExcludeMissing
            litellmLoggingObj: JsonField<LitellmLoggingObj> = JsonMissing.of(),
            @JsonProperty("logger_fn")
            @ExcludeMissing
            loggerFn: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timeout") @ExcludeMissing timeout: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("user") @ExcludeMissing user: JsonField<String> = JsonMissing.of(),
        ) : this(
            model,
            apiBase,
            apiKey,
            apiType,
            apiVersion,
            caching,
            customLlmProvider,
            input,
            litellmCallId,
            litellmLoggingObj,
            loggerFn,
            timeout,
            user,
            mutableMapOf(),
        )

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun model(): String = model.getRequired("model")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun apiBase(): String? = apiBase.getNullable("api_base")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun apiKey(): String? = apiKey.getNullable("api_key")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun apiType(): String? = apiType.getNullable("api_type")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun apiVersion(): String? = apiVersion.getNullable("api_version")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun caching(): Boolean? = caching.getNullable("caching")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customLlmProvider(): CustomLlmProvider? =
            customLlmProvider.getNullable("custom_llm_provider")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun input(): List<String>? = input.getNullable("input")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun litellmCallId(): String? = litellmCallId.getNullable("litellm_call_id")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun litellmLoggingObj(): LitellmLoggingObj? =
            litellmLoggingObj.getNullable("litellm_logging_obj")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun loggerFn(): String? = loggerFn.getNullable("logger_fn")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeout(): Long? = timeout.getNullable("timeout")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun user(): String? = user.getNullable("user")

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [apiBase].
         *
         * Unlike [apiBase], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("api_base") @ExcludeMissing fun _apiBase(): JsonField<String> = apiBase

        /**
         * Returns the raw JSON value of [apiKey].
         *
         * Unlike [apiKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("api_key") @ExcludeMissing fun _apiKey(): JsonField<String> = apiKey

        /**
         * Returns the raw JSON value of [apiType].
         *
         * Unlike [apiType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("api_type") @ExcludeMissing fun _apiType(): JsonField<String> = apiType

        /**
         * Returns the raw JSON value of [apiVersion].
         *
         * Unlike [apiVersion], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("api_version")
        @ExcludeMissing
        fun _apiVersion(): JsonField<String> = apiVersion

        /**
         * Returns the raw JSON value of [caching].
         *
         * Unlike [caching], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("caching") @ExcludeMissing fun _caching(): JsonField<Boolean> = caching

        /**
         * Returns the raw JSON value of [customLlmProvider].
         *
         * Unlike [customLlmProvider], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_llm_provider")
        @ExcludeMissing
        fun _customLlmProvider(): JsonField<CustomLlmProvider> = customLlmProvider

        /**
         * Returns the raw JSON value of [input].
         *
         * Unlike [input], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("input") @ExcludeMissing fun _input(): JsonField<List<String>> = input

        /**
         * Returns the raw JSON value of [litellmCallId].
         *
         * Unlike [litellmCallId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("litellm_call_id")
        @ExcludeMissing
        fun _litellmCallId(): JsonField<String> = litellmCallId

        /**
         * Returns the raw JSON value of [litellmLoggingObj].
         *
         * Unlike [litellmLoggingObj], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("litellm_logging_obj")
        @ExcludeMissing
        fun _litellmLoggingObj(): JsonField<LitellmLoggingObj> = litellmLoggingObj

        /**
         * Returns the raw JSON value of [loggerFn].
         *
         * Unlike [loggerFn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("logger_fn") @ExcludeMissing fun _loggerFn(): JsonField<String> = loggerFn

        /**
         * Returns the raw JSON value of [timeout].
         *
         * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timeout") @ExcludeMissing fun _timeout(): JsonField<Long> = timeout

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .model()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var model: JsonField<String>? = null
            private var apiBase: JsonField<String> = JsonMissing.of()
            private var apiKey: JsonField<String> = JsonMissing.of()
            private var apiType: JsonField<String> = JsonMissing.of()
            private var apiVersion: JsonField<String> = JsonMissing.of()
            private var caching: JsonField<Boolean> = JsonMissing.of()
            private var customLlmProvider: JsonField<CustomLlmProvider> = JsonMissing.of()
            private var input: JsonField<MutableList<String>>? = null
            private var litellmCallId: JsonField<String> = JsonMissing.of()
            private var litellmLoggingObj: JsonField<LitellmLoggingObj> = JsonMissing.of()
            private var loggerFn: JsonField<String> = JsonMissing.of()
            private var timeout: JsonField<Long> = JsonMissing.of()
            private var user: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                model = body.model
                apiBase = body.apiBase
                apiKey = body.apiKey
                apiType = body.apiType
                apiVersion = body.apiVersion
                caching = body.caching
                customLlmProvider = body.customLlmProvider
                input = body.input.map { it.toMutableList() }
                litellmCallId = body.litellmCallId
                litellmLoggingObj = body.litellmLoggingObj
                loggerFn = body.loggerFn
                timeout = body.timeout
                user = body.user
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            fun apiBase(apiBase: String?) = apiBase(JsonField.ofNullable(apiBase))

            /**
             * Sets [Builder.apiBase] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiBase] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiBase(apiBase: JsonField<String>) = apply { this.apiBase = apiBase }

            fun apiKey(apiKey: String?) = apiKey(JsonField.ofNullable(apiKey))

            /**
             * Sets [Builder.apiKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiKey] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiKey(apiKey: JsonField<String>) = apply { this.apiKey = apiKey }

            fun apiType(apiType: String?) = apiType(JsonField.ofNullable(apiType))

            /**
             * Sets [Builder.apiType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiType(apiType: JsonField<String>) = apply { this.apiType = apiType }

            fun apiVersion(apiVersion: String?) = apiVersion(JsonField.ofNullable(apiVersion))

            /**
             * Sets [Builder.apiVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiVersion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiVersion(apiVersion: JsonField<String>) = apply { this.apiVersion = apiVersion }

            fun caching(caching: Boolean) = caching(JsonField.of(caching))

            /**
             * Sets [Builder.caching] to an arbitrary JSON value.
             *
             * You should usually call [Builder.caching] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun caching(caching: JsonField<Boolean>) = apply { this.caching = caching }

            fun customLlmProvider(customLlmProvider: CustomLlmProvider?) =
                customLlmProvider(JsonField.ofNullable(customLlmProvider))

            /**
             * Sets [Builder.customLlmProvider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customLlmProvider] with a well-typed
             * [CustomLlmProvider] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun customLlmProvider(customLlmProvider: JsonField<CustomLlmProvider>) = apply {
                this.customLlmProvider = customLlmProvider
            }

            /** Alias for calling [customLlmProvider] with `CustomLlmProvider.ofString(string)`. */
            fun customLlmProvider(string: String) =
                customLlmProvider(CustomLlmProvider.ofString(string))

            /**
             * Alias for calling [customLlmProvider] with
             * `CustomLlmProvider.ofUnionMember1(unionMember1)`.
             */
            fun customLlmProvider(unionMember1: CustomLlmProvider.UnionMember1) =
                customLlmProvider(CustomLlmProvider.ofUnionMember1(unionMember1))

            fun input(input: List<String>) = input(JsonField.of(input))

            /**
             * Sets [Builder.input] to an arbitrary JSON value.
             *
             * You should usually call [Builder.input] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun input(input: JsonField<List<String>>) = apply {
                this.input = input.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.input].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addInput(input: String) = apply {
                this.input =
                    (this.input ?: JsonField.of(mutableListOf())).also {
                        checkKnown("input", it).add(input)
                    }
            }

            fun litellmCallId(litellmCallId: String?) =
                litellmCallId(JsonField.ofNullable(litellmCallId))

            /**
             * Sets [Builder.litellmCallId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.litellmCallId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun litellmCallId(litellmCallId: JsonField<String>) = apply {
                this.litellmCallId = litellmCallId
            }

            fun litellmLoggingObj(litellmLoggingObj: LitellmLoggingObj?) =
                litellmLoggingObj(JsonField.ofNullable(litellmLoggingObj))

            /**
             * Sets [Builder.litellmLoggingObj] to an arbitrary JSON value.
             *
             * You should usually call [Builder.litellmLoggingObj] with a well-typed
             * [LitellmLoggingObj] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun litellmLoggingObj(litellmLoggingObj: JsonField<LitellmLoggingObj>) = apply {
                this.litellmLoggingObj = litellmLoggingObj
            }

            fun loggerFn(loggerFn: String?) = loggerFn(JsonField.ofNullable(loggerFn))

            /**
             * Sets [Builder.loggerFn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loggerFn] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun loggerFn(loggerFn: JsonField<String>) = apply { this.loggerFn = loggerFn }

            fun timeout(timeout: Long) = timeout(JsonField.of(timeout))

            /**
             * Sets [Builder.timeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeout] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeout(timeout: JsonField<Long>) = apply { this.timeout = timeout }

            fun user(user: String?) = user(JsonField.ofNullable(user))

            /**
             * Sets [Builder.user] to an arbitrary JSON value.
             *
             * You should usually call [Builder.user] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .model()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("model", model),
                    apiBase,
                    apiKey,
                    apiType,
                    apiVersion,
                    caching,
                    customLlmProvider,
                    (input ?: JsonMissing.of()).map { it.toImmutable() },
                    litellmCallId,
                    litellmLoggingObj,
                    loggerFn,
                    timeout,
                    user,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            model()
            apiBase()
            apiKey()
            apiType()
            apiVersion()
            caching()
            customLlmProvider()?.validate()
            input()
            litellmCallId()
            litellmLoggingObj()?.validate()
            loggerFn()
            timeout()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (model.asKnown() == null) 0 else 1) +
                (if (apiBase.asKnown() == null) 0 else 1) +
                (if (apiKey.asKnown() == null) 0 else 1) +
                (if (apiType.asKnown() == null) 0 else 1) +
                (if (apiVersion.asKnown() == null) 0 else 1) +
                (if (caching.asKnown() == null) 0 else 1) +
                (customLlmProvider.asKnown()?.validity() ?: 0) +
                (input.asKnown()?.size ?: 0) +
                (if (litellmCallId.asKnown() == null) 0 else 1) +
                (litellmLoggingObj.asKnown()?.validity() ?: 0) +
                (if (loggerFn.asKnown() == null) 0 else 1) +
                (if (timeout.asKnown() == null) 0 else 1) +
                (if (user.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                model == other.model &&
                apiBase == other.apiBase &&
                apiKey == other.apiKey &&
                apiType == other.apiType &&
                apiVersion == other.apiVersion &&
                caching == other.caching &&
                customLlmProvider == other.customLlmProvider &&
                input == other.input &&
                litellmCallId == other.litellmCallId &&
                litellmLoggingObj == other.litellmLoggingObj &&
                loggerFn == other.loggerFn &&
                timeout == other.timeout &&
                user == other.user &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                model,
                apiBase,
                apiKey,
                apiType,
                apiVersion,
                caching,
                customLlmProvider,
                input,
                litellmCallId,
                litellmLoggingObj,
                loggerFn,
                timeout,
                user,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{model=$model, apiBase=$apiBase, apiKey=$apiKey, apiType=$apiType, apiVersion=$apiVersion, caching=$caching, customLlmProvider=$customLlmProvider, input=$input, litellmCallId=$litellmCallId, litellmLoggingObj=$litellmLoggingObj, loggerFn=$loggerFn, timeout=$timeout, user=$user, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = CustomLlmProvider.Deserializer::class)
    @JsonSerialize(using = CustomLlmProvider.Serializer::class)
    class CustomLlmProvider
    private constructor(
        private val string: String? = null,
        private val unionMember1: UnionMember1? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): String? = string

        fun unionMember1(): UnionMember1? = unionMember1

        fun isString(): Boolean = string != null

        fun isUnionMember1(): Boolean = unionMember1 != null

        fun asString(): String = string.getOrThrow("string")

        fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): CustomLlmProvider = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitUnionMember1(unionMember1: UnionMember1) {
                        unionMember1.validate()
                    }
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

                    override fun visitUnionMember1(unionMember1: UnionMember1) =
                        unionMember1.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CustomLlmProvider &&
                string == other.string &&
                unionMember1 == other.unionMember1
        }

        override fun hashCode(): Int = Objects.hash(string, unionMember1)

        override fun toString(): String =
            when {
                string != null -> "CustomLlmProvider{string=$string}"
                unionMember1 != null -> "CustomLlmProvider{unionMember1=$unionMember1}"
                _json != null -> "CustomLlmProvider{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid CustomLlmProvider")
            }

        companion object {

            fun ofString(string: String) = CustomLlmProvider(string = string)

            fun ofUnionMember1(unionMember1: UnionMember1) =
                CustomLlmProvider(unionMember1 = unionMember1)
        }

        /**
         * An interface that defines how to map each variant of [CustomLlmProvider] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitUnionMember1(unionMember1: UnionMember1): T

            /**
             * Maps an unknown variant of [CustomLlmProvider] to a value of type [T].
             *
             * An instance of [CustomLlmProvider] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws HanzoInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HanzoInvalidDataException("Unknown CustomLlmProvider: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<CustomLlmProvider>(CustomLlmProvider::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): CustomLlmProvider {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                                CustomLlmProvider(unionMember1 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                CustomLlmProvider(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> CustomLlmProvider(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<CustomLlmProvider>(CustomLlmProvider::class) {

            override fun serialize(
                value: CustomLlmProvider,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid CustomLlmProvider")
                }
            }
        }

        class UnionMember1
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

                /** Returns a mutable builder for constructing an instance of [UnionMember1]. */
                fun builder() = Builder()
            }

            /** A builder for [UnionMember1]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(unionMember1: UnionMember1) = apply {
                    additionalProperties = unionMember1.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [UnionMember1].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UnionMember1 = UnionMember1(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): UnionMember1 = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnionMember1 && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "UnionMember1{additionalProperties=$additionalProperties}"
        }
    }

    class LitellmLoggingObj
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

            /** Returns a mutable builder for constructing an instance of [LitellmLoggingObj]. */
            fun builder() = Builder()
        }

        /** A builder for [LitellmLoggingObj]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(litellmLoggingObj: LitellmLoggingObj) = apply {
                additionalProperties = litellmLoggingObj.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [LitellmLoggingObj].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): LitellmLoggingObj = LitellmLoggingObj(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): LitellmLoggingObj = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LitellmLoggingObj && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "LitellmLoggingObj{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmbeddingCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EmbeddingCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
