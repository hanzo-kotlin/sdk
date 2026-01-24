// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.chat.completions

import ai.hanzo.api.core.BaseDeserializer
import ai.hanzo.api.core.BaseSerializer
import ai.hanzo.api.core.Enum
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
 * Follows the exact same API spec as `OpenAI's Chat API
 * https://platform.openai.com/docs/api-reference/chat`
 *
 * ```bash
 * curl -X POST http://localhost:4000/v1/chat/completions
 * -H "Content-Type: application/json"
 * -H "Authorization: Bearer sk-1234"
 * -d '{
 *     "model": "gpt-4o",
 *     "messages": [
 *         {
 *             "role": "user",
 *             "content": "Hello!"
 *         }
 *     ]
 * }'
 * ```
 */
class CompletionCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messages(): List<Message> = body.messages()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun model(): String = body.model()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun caching(): Boolean? = body.caching()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contextWindowFallbackDict(): ContextWindowFallbackDict? = body.contextWindowFallbackDict()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fallbacks(): List<String>? = body.fallbacks()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun frequencyPenalty(): Double? = body.frequencyPenalty()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun functionCall(): FunctionCall? = body.functionCall()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun functions(): List<Function>? = body.functions()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun guardrails(): List<String>? = body.guardrails()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun logitBias(): LogitBias? = body.logitBias()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun logprobs(): Boolean? = body.logprobs()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxTokens(): Long? = body.maxTokens()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Metadata? = body.metadata()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun n(): Long? = body.n()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numRetries(): Long? = body.numRetries()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parallelToolCalls(): Boolean? = body.parallelToolCalls()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun presencePenalty(): Double? = body.presencePenalty()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun responseFormat(): ResponseFormat? = body.responseFormat()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun seed(): Long? = body.seed()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun serviceTier(): String? = body.serviceTier()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stop(): Stop? = body.stop()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stream(): Boolean? = body.stream()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun streamOptions(): StreamOptions? = body.streamOptions()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun temperature(): Double? = body.temperature()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toolChoice(): ToolChoice? = body.toolChoice()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tools(): List<Tool>? = body.tools()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun topLogprobs(): Long? = body.topLogprobs()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun topP(): Double? = body.topP()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun user(): String? = body.user()

    /**
     * Returns the raw JSON value of [messages].
     *
     * Unlike [messages], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _messages(): JsonField<List<Message>> = body._messages()

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _model(): JsonField<String> = body._model()

    /**
     * Returns the raw JSON value of [caching].
     *
     * Unlike [caching], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _caching(): JsonField<Boolean> = body._caching()

    /**
     * Returns the raw JSON value of [contextWindowFallbackDict].
     *
     * Unlike [contextWindowFallbackDict], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _contextWindowFallbackDict(): JsonField<ContextWindowFallbackDict> =
        body._contextWindowFallbackDict()

    /**
     * Returns the raw JSON value of [fallbacks].
     *
     * Unlike [fallbacks], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fallbacks(): JsonField<List<String>> = body._fallbacks()

    /**
     * Returns the raw JSON value of [frequencyPenalty].
     *
     * Unlike [frequencyPenalty], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _frequencyPenalty(): JsonField<Double> = body._frequencyPenalty()

    /**
     * Returns the raw JSON value of [functionCall].
     *
     * Unlike [functionCall], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _functionCall(): JsonField<FunctionCall> = body._functionCall()

    /**
     * Returns the raw JSON value of [functions].
     *
     * Unlike [functions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _functions(): JsonField<List<Function>> = body._functions()

    /**
     * Returns the raw JSON value of [guardrails].
     *
     * Unlike [guardrails], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _guardrails(): JsonField<List<String>> = body._guardrails()

    /**
     * Returns the raw JSON value of [logitBias].
     *
     * Unlike [logitBias], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _logitBias(): JsonField<LogitBias> = body._logitBias()

    /**
     * Returns the raw JSON value of [logprobs].
     *
     * Unlike [logprobs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _logprobs(): JsonField<Boolean> = body._logprobs()

    /**
     * Returns the raw JSON value of [maxTokens].
     *
     * Unlike [maxTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxTokens(): JsonField<Long> = body._maxTokens()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [n].
     *
     * Unlike [n], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _n(): JsonField<Long> = body._n()

    /**
     * Returns the raw JSON value of [numRetries].
     *
     * Unlike [numRetries], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _numRetries(): JsonField<Long> = body._numRetries()

    /**
     * Returns the raw JSON value of [parallelToolCalls].
     *
     * Unlike [parallelToolCalls], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _parallelToolCalls(): JsonField<Boolean> = body._parallelToolCalls()

    /**
     * Returns the raw JSON value of [presencePenalty].
     *
     * Unlike [presencePenalty], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _presencePenalty(): JsonField<Double> = body._presencePenalty()

    /**
     * Returns the raw JSON value of [responseFormat].
     *
     * Unlike [responseFormat], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _responseFormat(): JsonField<ResponseFormat> = body._responseFormat()

    /**
     * Returns the raw JSON value of [seed].
     *
     * Unlike [seed], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _seed(): JsonField<Long> = body._seed()

    /**
     * Returns the raw JSON value of [serviceTier].
     *
     * Unlike [serviceTier], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _serviceTier(): JsonField<String> = body._serviceTier()

    /**
     * Returns the raw JSON value of [stop].
     *
     * Unlike [stop], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _stop(): JsonField<Stop> = body._stop()

    /**
     * Returns the raw JSON value of [stream].
     *
     * Unlike [stream], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _stream(): JsonField<Boolean> = body._stream()

    /**
     * Returns the raw JSON value of [streamOptions].
     *
     * Unlike [streamOptions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _streamOptions(): JsonField<StreamOptions> = body._streamOptions()

    /**
     * Returns the raw JSON value of [temperature].
     *
     * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _temperature(): JsonField<Double> = body._temperature()

    /**
     * Returns the raw JSON value of [toolChoice].
     *
     * Unlike [toolChoice], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _toolChoice(): JsonField<ToolChoice> = body._toolChoice()

    /**
     * Returns the raw JSON value of [tools].
     *
     * Unlike [tools], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tools(): JsonField<List<Tool>> = body._tools()

    /**
     * Returns the raw JSON value of [topLogprobs].
     *
     * Unlike [topLogprobs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _topLogprobs(): JsonField<Long> = body._topLogprobs()

    /**
     * Returns the raw JSON value of [topP].
     *
     * Unlike [topP], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _topP(): JsonField<Double> = body._topP()

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
         * Returns a mutable builder for constructing an instance of [CompletionCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .messages()
         * .model()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CompletionCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(completionCreateParams: CompletionCreateParams) = apply {
            body = completionCreateParams.body.toBuilder()
            additionalHeaders = completionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = completionCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [messages]
         * - [model]
         * - [caching]
         * - [contextWindowFallbackDict]
         * - [fallbacks]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun messages(messages: List<Message>) = apply { body.messages(messages) }

        /**
         * Sets [Builder.messages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messages] with a well-typed `List<Message>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messages(messages: JsonField<List<Message>>) = apply { body.messages(messages) }

        /**
         * Adds a single [Message] to [messages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMessage(message: Message) = apply { body.addMessage(message) }

        /**
         * Alias for calling [addMessage] with `Message.ofChatCompletionUser(chatCompletionUser)`.
         */
        fun addMessage(chatCompletionUser: Message.ChatCompletionUserMessage) = apply {
            body.addMessage(chatCompletionUser)
        }

        /**
         * Alias for calling [addMessage] with
         * `Message.ofChatCompletionAssistant(chatCompletionAssistant)`.
         */
        fun addMessage(chatCompletionAssistant: Message.ChatCompletionAssistantMessage) = apply {
            body.addMessage(chatCompletionAssistant)
        }

        /**
         * Alias for calling [addMessage] with `Message.ofChatCompletionTool(chatCompletionTool)`.
         */
        fun addMessage(chatCompletionTool: Message.ChatCompletionToolMessage) = apply {
            body.addMessage(chatCompletionTool)
        }

        /**
         * Alias for calling [addMessage] with
         * `Message.ofChatCompletionSystem(chatCompletionSystem)`.
         */
        fun addMessage(chatCompletionSystem: Message.ChatCompletionSystemMessage) = apply {
            body.addMessage(chatCompletionSystem)
        }

        /**
         * Alias for calling [addMessage] with
         * `Message.ofChatCompletionFunction(chatCompletionFunction)`.
         */
        fun addMessage(chatCompletionFunction: Message.ChatCompletionFunctionMessage) = apply {
            body.addMessage(chatCompletionFunction)
        }

        /**
         * Alias for calling [addMessage] with
         * `Message.ofChatCompletionDeveloper(chatCompletionDeveloper)`.
         */
        fun addMessage(chatCompletionDeveloper: Message.ChatCompletionDeveloperMessage) = apply {
            body.addMessage(chatCompletionDeveloper)
        }

        fun model(model: String) = apply { body.model(model) }

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { body.model(model) }

        fun caching(caching: Boolean?) = apply { body.caching(caching) }

        /**
         * Alias for [Builder.caching].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun caching(caching: Boolean) = caching(caching as Boolean?)

        /**
         * Sets [Builder.caching] to an arbitrary JSON value.
         *
         * You should usually call [Builder.caching] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun caching(caching: JsonField<Boolean>) = apply { body.caching(caching) }

        fun contextWindowFallbackDict(contextWindowFallbackDict: ContextWindowFallbackDict?) =
            apply {
                body.contextWindowFallbackDict(contextWindowFallbackDict)
            }

        /**
         * Sets [Builder.contextWindowFallbackDict] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contextWindowFallbackDict] with a well-typed
         * [ContextWindowFallbackDict] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun contextWindowFallbackDict(
            contextWindowFallbackDict: JsonField<ContextWindowFallbackDict>
        ) = apply { body.contextWindowFallbackDict(contextWindowFallbackDict) }

        fun fallbacks(fallbacks: List<String>?) = apply { body.fallbacks(fallbacks) }

        /**
         * Sets [Builder.fallbacks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fallbacks] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fallbacks(fallbacks: JsonField<List<String>>) = apply { body.fallbacks(fallbacks) }

        /**
         * Adds a single [String] to [fallbacks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFallback(fallback: String) = apply { body.addFallback(fallback) }

        fun frequencyPenalty(frequencyPenalty: Double?) = apply {
            body.frequencyPenalty(frequencyPenalty)
        }

        /**
         * Alias for [Builder.frequencyPenalty].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun frequencyPenalty(frequencyPenalty: Double) =
            frequencyPenalty(frequencyPenalty as Double?)

        /**
         * Sets [Builder.frequencyPenalty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frequencyPenalty] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun frequencyPenalty(frequencyPenalty: JsonField<Double>) = apply {
            body.frequencyPenalty(frequencyPenalty)
        }

        fun functionCall(functionCall: FunctionCall?) = apply { body.functionCall(functionCall) }

        /**
         * Sets [Builder.functionCall] to an arbitrary JSON value.
         *
         * You should usually call [Builder.functionCall] with a well-typed [FunctionCall] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun functionCall(functionCall: JsonField<FunctionCall>) = apply {
            body.functionCall(functionCall)
        }

        /** Alias for calling [functionCall] with `FunctionCall.ofString(string)`. */
        fun functionCall(string: String) = apply { body.functionCall(string) }

        /** Alias for calling [functionCall] with `FunctionCall.ofUnionMember1(unionMember1)`. */
        fun functionCall(unionMember1: FunctionCall.UnionMember1) = apply {
            body.functionCall(unionMember1)
        }

        fun functions(functions: List<Function>?) = apply { body.functions(functions) }

        /**
         * Sets [Builder.functions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.functions] with a well-typed `List<Function>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun functions(functions: JsonField<List<Function>>) = apply { body.functions(functions) }

        /**
         * Adds a single [Function] to [functions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFunction(function: Function) = apply { body.addFunction(function) }

        fun guardrails(guardrails: List<String>?) = apply { body.guardrails(guardrails) }

        /**
         * Sets [Builder.guardrails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.guardrails] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun guardrails(guardrails: JsonField<List<String>>) = apply { body.guardrails(guardrails) }

        /**
         * Adds a single [String] to [guardrails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGuardrail(guardrail: String) = apply { body.addGuardrail(guardrail) }

        fun logitBias(logitBias: LogitBias?) = apply { body.logitBias(logitBias) }

        /**
         * Sets [Builder.logitBias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logitBias] with a well-typed [LogitBias] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun logitBias(logitBias: JsonField<LogitBias>) = apply { body.logitBias(logitBias) }

        fun logprobs(logprobs: Boolean?) = apply { body.logprobs(logprobs) }

        /**
         * Alias for [Builder.logprobs].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun logprobs(logprobs: Boolean) = logprobs(logprobs as Boolean?)

        /**
         * Sets [Builder.logprobs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logprobs] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun logprobs(logprobs: JsonField<Boolean>) = apply { body.logprobs(logprobs) }

        fun maxTokens(maxTokens: Long?) = apply { body.maxTokens(maxTokens) }

        /**
         * Alias for [Builder.maxTokens].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxTokens(maxTokens: Long) = maxTokens(maxTokens as Long?)

        /**
         * Sets [Builder.maxTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxTokens] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxTokens(maxTokens: JsonField<Long>) = apply { body.maxTokens(maxTokens) }

        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        fun n(n: Long?) = apply { body.n(n) }

        /**
         * Alias for [Builder.n].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun n(n: Long) = n(n as Long?)

        /**
         * Sets [Builder.n] to an arbitrary JSON value.
         *
         * You should usually call [Builder.n] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun n(n: JsonField<Long>) = apply { body.n(n) }

        fun numRetries(numRetries: Long?) = apply { body.numRetries(numRetries) }

        /**
         * Alias for [Builder.numRetries].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun numRetries(numRetries: Long) = numRetries(numRetries as Long?)

        /**
         * Sets [Builder.numRetries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numRetries] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numRetries(numRetries: JsonField<Long>) = apply { body.numRetries(numRetries) }

        fun parallelToolCalls(parallelToolCalls: Boolean?) = apply {
            body.parallelToolCalls(parallelToolCalls)
        }

        /**
         * Alias for [Builder.parallelToolCalls].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun parallelToolCalls(parallelToolCalls: Boolean) =
            parallelToolCalls(parallelToolCalls as Boolean?)

        /**
         * Sets [Builder.parallelToolCalls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parallelToolCalls] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parallelToolCalls(parallelToolCalls: JsonField<Boolean>) = apply {
            body.parallelToolCalls(parallelToolCalls)
        }

        fun presencePenalty(presencePenalty: Double?) = apply {
            body.presencePenalty(presencePenalty)
        }

        /**
         * Alias for [Builder.presencePenalty].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun presencePenalty(presencePenalty: Double) = presencePenalty(presencePenalty as Double?)

        /**
         * Sets [Builder.presencePenalty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.presencePenalty] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun presencePenalty(presencePenalty: JsonField<Double>) = apply {
            body.presencePenalty(presencePenalty)
        }

        fun responseFormat(responseFormat: ResponseFormat?) = apply {
            body.responseFormat(responseFormat)
        }

        /**
         * Sets [Builder.responseFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.responseFormat] with a well-typed [ResponseFormat] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun responseFormat(responseFormat: JsonField<ResponseFormat>) = apply {
            body.responseFormat(responseFormat)
        }

        fun seed(seed: Long?) = apply { body.seed(seed) }

        /**
         * Alias for [Builder.seed].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun seed(seed: Long) = seed(seed as Long?)

        /**
         * Sets [Builder.seed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seed] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun seed(seed: JsonField<Long>) = apply { body.seed(seed) }

        fun serviceTier(serviceTier: String?) = apply { body.serviceTier(serviceTier) }

        /**
         * Sets [Builder.serviceTier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serviceTier] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun serviceTier(serviceTier: JsonField<String>) = apply { body.serviceTier(serviceTier) }

        fun stop(stop: Stop?) = apply { body.stop(stop) }

        /**
         * Sets [Builder.stop] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stop] with a well-typed [Stop] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stop(stop: JsonField<Stop>) = apply { body.stop(stop) }

        /** Alias for calling [stop] with `Stop.ofString(string)`. */
        fun stop(string: String) = apply { body.stop(string) }

        /** Alias for calling [stop] with `Stop.ofStrings(strings)`. */
        fun stopOfStrings(strings: List<String>) = apply { body.stopOfStrings(strings) }

        fun stream(stream: Boolean?) = apply { body.stream(stream) }

        /**
         * Alias for [Builder.stream].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun stream(stream: Boolean) = stream(stream as Boolean?)

        /**
         * Sets [Builder.stream] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stream] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stream(stream: JsonField<Boolean>) = apply { body.stream(stream) }

        fun streamOptions(streamOptions: StreamOptions?) = apply {
            body.streamOptions(streamOptions)
        }

        /**
         * Sets [Builder.streamOptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.streamOptions] with a well-typed [StreamOptions] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun streamOptions(streamOptions: JsonField<StreamOptions>) = apply {
            body.streamOptions(streamOptions)
        }

        fun temperature(temperature: Double?) = apply { body.temperature(temperature) }

        /**
         * Alias for [Builder.temperature].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun temperature(temperature: Double) = temperature(temperature as Double?)

        /**
         * Sets [Builder.temperature] to an arbitrary JSON value.
         *
         * You should usually call [Builder.temperature] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun temperature(temperature: JsonField<Double>) = apply { body.temperature(temperature) }

        fun toolChoice(toolChoice: ToolChoice?) = apply { body.toolChoice(toolChoice) }

        /**
         * Sets [Builder.toolChoice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolChoice] with a well-typed [ToolChoice] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun toolChoice(toolChoice: JsonField<ToolChoice>) = apply { body.toolChoice(toolChoice) }

        /** Alias for calling [toolChoice] with `ToolChoice.ofString(string)`. */
        fun toolChoice(string: String) = apply { body.toolChoice(string) }

        /** Alias for calling [toolChoice] with `ToolChoice.ofUnionMember1(unionMember1)`. */
        fun toolChoice(unionMember1: ToolChoice.UnionMember1) = apply {
            body.toolChoice(unionMember1)
        }

        fun tools(tools: List<Tool>?) = apply { body.tools(tools) }

        /**
         * Sets [Builder.tools] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tools] with a well-typed `List<Tool>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tools(tools: JsonField<List<Tool>>) = apply { body.tools(tools) }

        /**
         * Adds a single [Tool] to [tools].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTool(tool: Tool) = apply { body.addTool(tool) }

        fun topLogprobs(topLogprobs: Long?) = apply { body.topLogprobs(topLogprobs) }

        /**
         * Alias for [Builder.topLogprobs].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun topLogprobs(topLogprobs: Long) = topLogprobs(topLogprobs as Long?)

        /**
         * Sets [Builder.topLogprobs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topLogprobs] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun topLogprobs(topLogprobs: JsonField<Long>) = apply { body.topLogprobs(topLogprobs) }

        fun topP(topP: Double?) = apply { body.topP(topP) }

        /**
         * Alias for [Builder.topP].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun topP(topP: Double) = topP(topP as Double?)

        /**
         * Sets [Builder.topP] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topP] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun topP(topP: JsonField<Double>) = apply { body.topP(topP) }

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
         * Returns an immutable instance of [CompletionCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .messages()
         * .model()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CompletionCreateParams =
            CompletionCreateParams(
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
        private val messages: JsonField<List<Message>>,
        private val model: JsonField<String>,
        private val caching: JsonField<Boolean>,
        private val contextWindowFallbackDict: JsonField<ContextWindowFallbackDict>,
        private val fallbacks: JsonField<List<String>>,
        private val frequencyPenalty: JsonField<Double>,
        private val functionCall: JsonField<FunctionCall>,
        private val functions: JsonField<List<Function>>,
        private val guardrails: JsonField<List<String>>,
        private val logitBias: JsonField<LogitBias>,
        private val logprobs: JsonField<Boolean>,
        private val maxTokens: JsonField<Long>,
        private val metadata: JsonField<Metadata>,
        private val n: JsonField<Long>,
        private val numRetries: JsonField<Long>,
        private val parallelToolCalls: JsonField<Boolean>,
        private val presencePenalty: JsonField<Double>,
        private val responseFormat: JsonField<ResponseFormat>,
        private val seed: JsonField<Long>,
        private val serviceTier: JsonField<String>,
        private val stop: JsonField<Stop>,
        private val stream: JsonField<Boolean>,
        private val streamOptions: JsonField<StreamOptions>,
        private val temperature: JsonField<Double>,
        private val toolChoice: JsonField<ToolChoice>,
        private val tools: JsonField<List<Tool>>,
        private val topLogprobs: JsonField<Long>,
        private val topP: JsonField<Double>,
        private val user: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("messages")
            @ExcludeMissing
            messages: JsonField<List<Message>> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("caching") @ExcludeMissing caching: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("context_window_fallback_dict")
            @ExcludeMissing
            contextWindowFallbackDict: JsonField<ContextWindowFallbackDict> = JsonMissing.of(),
            @JsonProperty("fallbacks")
            @ExcludeMissing
            fallbacks: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("frequency_penalty")
            @ExcludeMissing
            frequencyPenalty: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("function_call")
            @ExcludeMissing
            functionCall: JsonField<FunctionCall> = JsonMissing.of(),
            @JsonProperty("functions")
            @ExcludeMissing
            functions: JsonField<List<Function>> = JsonMissing.of(),
            @JsonProperty("guardrails")
            @ExcludeMissing
            guardrails: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("logit_bias")
            @ExcludeMissing
            logitBias: JsonField<LogitBias> = JsonMissing.of(),
            @JsonProperty("logprobs")
            @ExcludeMissing
            logprobs: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("max_tokens")
            @ExcludeMissing
            maxTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("n") @ExcludeMissing n: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("num_retries")
            @ExcludeMissing
            numRetries: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("parallel_tool_calls")
            @ExcludeMissing
            parallelToolCalls: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("presence_penalty")
            @ExcludeMissing
            presencePenalty: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("response_format")
            @ExcludeMissing
            responseFormat: JsonField<ResponseFormat> = JsonMissing.of(),
            @JsonProperty("seed") @ExcludeMissing seed: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("service_tier")
            @ExcludeMissing
            serviceTier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("stop") @ExcludeMissing stop: JsonField<Stop> = JsonMissing.of(),
            @JsonProperty("stream") @ExcludeMissing stream: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("stream_options")
            @ExcludeMissing
            streamOptions: JsonField<StreamOptions> = JsonMissing.of(),
            @JsonProperty("temperature")
            @ExcludeMissing
            temperature: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("tool_choice")
            @ExcludeMissing
            toolChoice: JsonField<ToolChoice> = JsonMissing.of(),
            @JsonProperty("tools") @ExcludeMissing tools: JsonField<List<Tool>> = JsonMissing.of(),
            @JsonProperty("top_logprobs")
            @ExcludeMissing
            topLogprobs: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("top_p") @ExcludeMissing topP: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("user") @ExcludeMissing user: JsonField<String> = JsonMissing.of(),
        ) : this(
            messages,
            model,
            caching,
            contextWindowFallbackDict,
            fallbacks,
            frequencyPenalty,
            functionCall,
            functions,
            guardrails,
            logitBias,
            logprobs,
            maxTokens,
            metadata,
            n,
            numRetries,
            parallelToolCalls,
            presencePenalty,
            responseFormat,
            seed,
            serviceTier,
            stop,
            stream,
            streamOptions,
            temperature,
            toolChoice,
            tools,
            topLogprobs,
            topP,
            user,
            mutableMapOf(),
        )

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun messages(): List<Message> = messages.getRequired("messages")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun model(): String = model.getRequired("model")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun caching(): Boolean? = caching.getNullable("caching")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contextWindowFallbackDict(): ContextWindowFallbackDict? =
            contextWindowFallbackDict.getNullable("context_window_fallback_dict")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fallbacks(): List<String>? = fallbacks.getNullable("fallbacks")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun frequencyPenalty(): Double? = frequencyPenalty.getNullable("frequency_penalty")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun functionCall(): FunctionCall? = functionCall.getNullable("function_call")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun functions(): List<Function>? = functions.getNullable("functions")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun guardrails(): List<String>? = guardrails.getNullable("guardrails")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun logitBias(): LogitBias? = logitBias.getNullable("logit_bias")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun logprobs(): Boolean? = logprobs.getNullable("logprobs")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxTokens(): Long? = maxTokens.getNullable("max_tokens")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun n(): Long? = n.getNullable("n")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun numRetries(): Long? = numRetries.getNullable("num_retries")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun parallelToolCalls(): Boolean? = parallelToolCalls.getNullable("parallel_tool_calls")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun presencePenalty(): Double? = presencePenalty.getNullable("presence_penalty")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun responseFormat(): ResponseFormat? = responseFormat.getNullable("response_format")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun seed(): Long? = seed.getNullable("seed")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun serviceTier(): String? = serviceTier.getNullable("service_tier")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun stop(): Stop? = stop.getNullable("stop")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun stream(): Boolean? = stream.getNullable("stream")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun streamOptions(): StreamOptions? = streamOptions.getNullable("stream_options")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun temperature(): Double? = temperature.getNullable("temperature")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun toolChoice(): ToolChoice? = toolChoice.getNullable("tool_choice")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tools(): List<Tool>? = tools.getNullable("tools")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun topLogprobs(): Long? = topLogprobs.getNullable("top_logprobs")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun topP(): Double? = topP.getNullable("top_p")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun user(): String? = user.getNullable("user")

        /**
         * Returns the raw JSON value of [messages].
         *
         * Unlike [messages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("messages")
        @ExcludeMissing
        fun _messages(): JsonField<List<Message>> = messages

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [caching].
         *
         * Unlike [caching], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("caching") @ExcludeMissing fun _caching(): JsonField<Boolean> = caching

        /**
         * Returns the raw JSON value of [contextWindowFallbackDict].
         *
         * Unlike [contextWindowFallbackDict], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("context_window_fallback_dict")
        @ExcludeMissing
        fun _contextWindowFallbackDict(): JsonField<ContextWindowFallbackDict> =
            contextWindowFallbackDict

        /**
         * Returns the raw JSON value of [fallbacks].
         *
         * Unlike [fallbacks], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fallbacks")
        @ExcludeMissing
        fun _fallbacks(): JsonField<List<String>> = fallbacks

        /**
         * Returns the raw JSON value of [frequencyPenalty].
         *
         * Unlike [frequencyPenalty], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("frequency_penalty")
        @ExcludeMissing
        fun _frequencyPenalty(): JsonField<Double> = frequencyPenalty

        /**
         * Returns the raw JSON value of [functionCall].
         *
         * Unlike [functionCall], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("function_call")
        @ExcludeMissing
        fun _functionCall(): JsonField<FunctionCall> = functionCall

        /**
         * Returns the raw JSON value of [functions].
         *
         * Unlike [functions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("functions")
        @ExcludeMissing
        fun _functions(): JsonField<List<Function>> = functions

        /**
         * Returns the raw JSON value of [guardrails].
         *
         * Unlike [guardrails], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("guardrails")
        @ExcludeMissing
        fun _guardrails(): JsonField<List<String>> = guardrails

        /**
         * Returns the raw JSON value of [logitBias].
         *
         * Unlike [logitBias], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("logit_bias")
        @ExcludeMissing
        fun _logitBias(): JsonField<LogitBias> = logitBias

        /**
         * Returns the raw JSON value of [logprobs].
         *
         * Unlike [logprobs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("logprobs") @ExcludeMissing fun _logprobs(): JsonField<Boolean> = logprobs

        /**
         * Returns the raw JSON value of [maxTokens].
         *
         * Unlike [maxTokens], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_tokens") @ExcludeMissing fun _maxTokens(): JsonField<Long> = maxTokens

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [n].
         *
         * Unlike [n], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("n") @ExcludeMissing fun _n(): JsonField<Long> = n

        /**
         * Returns the raw JSON value of [numRetries].
         *
         * Unlike [numRetries], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("num_retries") @ExcludeMissing fun _numRetries(): JsonField<Long> = numRetries

        /**
         * Returns the raw JSON value of [parallelToolCalls].
         *
         * Unlike [parallelToolCalls], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("parallel_tool_calls")
        @ExcludeMissing
        fun _parallelToolCalls(): JsonField<Boolean> = parallelToolCalls

        /**
         * Returns the raw JSON value of [presencePenalty].
         *
         * Unlike [presencePenalty], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("presence_penalty")
        @ExcludeMissing
        fun _presencePenalty(): JsonField<Double> = presencePenalty

        /**
         * Returns the raw JSON value of [responseFormat].
         *
         * Unlike [responseFormat], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("response_format")
        @ExcludeMissing
        fun _responseFormat(): JsonField<ResponseFormat> = responseFormat

        /**
         * Returns the raw JSON value of [seed].
         *
         * Unlike [seed], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("seed") @ExcludeMissing fun _seed(): JsonField<Long> = seed

        /**
         * Returns the raw JSON value of [serviceTier].
         *
         * Unlike [serviceTier], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("service_tier")
        @ExcludeMissing
        fun _serviceTier(): JsonField<String> = serviceTier

        /**
         * Returns the raw JSON value of [stop].
         *
         * Unlike [stop], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stop") @ExcludeMissing fun _stop(): JsonField<Stop> = stop

        /**
         * Returns the raw JSON value of [stream].
         *
         * Unlike [stream], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stream") @ExcludeMissing fun _stream(): JsonField<Boolean> = stream

        /**
         * Returns the raw JSON value of [streamOptions].
         *
         * Unlike [streamOptions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("stream_options")
        @ExcludeMissing
        fun _streamOptions(): JsonField<StreamOptions> = streamOptions

        /**
         * Returns the raw JSON value of [temperature].
         *
         * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("temperature")
        @ExcludeMissing
        fun _temperature(): JsonField<Double> = temperature

        /**
         * Returns the raw JSON value of [toolChoice].
         *
         * Unlike [toolChoice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tool_choice")
        @ExcludeMissing
        fun _toolChoice(): JsonField<ToolChoice> = toolChoice

        /**
         * Returns the raw JSON value of [tools].
         *
         * Unlike [tools], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tools") @ExcludeMissing fun _tools(): JsonField<List<Tool>> = tools

        /**
         * Returns the raw JSON value of [topLogprobs].
         *
         * Unlike [topLogprobs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("top_logprobs")
        @ExcludeMissing
        fun _topLogprobs(): JsonField<Long> = topLogprobs

        /**
         * Returns the raw JSON value of [topP].
         *
         * Unlike [topP], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("top_p") @ExcludeMissing fun _topP(): JsonField<Double> = topP

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
             * .messages()
             * .model()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var messages: JsonField<MutableList<Message>>? = null
            private var model: JsonField<String>? = null
            private var caching: JsonField<Boolean> = JsonMissing.of()
            private var contextWindowFallbackDict: JsonField<ContextWindowFallbackDict> =
                JsonMissing.of()
            private var fallbacks: JsonField<MutableList<String>>? = null
            private var frequencyPenalty: JsonField<Double> = JsonMissing.of()
            private var functionCall: JsonField<FunctionCall> = JsonMissing.of()
            private var functions: JsonField<MutableList<Function>>? = null
            private var guardrails: JsonField<MutableList<String>>? = null
            private var logitBias: JsonField<LogitBias> = JsonMissing.of()
            private var logprobs: JsonField<Boolean> = JsonMissing.of()
            private var maxTokens: JsonField<Long> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var n: JsonField<Long> = JsonMissing.of()
            private var numRetries: JsonField<Long> = JsonMissing.of()
            private var parallelToolCalls: JsonField<Boolean> = JsonMissing.of()
            private var presencePenalty: JsonField<Double> = JsonMissing.of()
            private var responseFormat: JsonField<ResponseFormat> = JsonMissing.of()
            private var seed: JsonField<Long> = JsonMissing.of()
            private var serviceTier: JsonField<String> = JsonMissing.of()
            private var stop: JsonField<Stop> = JsonMissing.of()
            private var stream: JsonField<Boolean> = JsonMissing.of()
            private var streamOptions: JsonField<StreamOptions> = JsonMissing.of()
            private var temperature: JsonField<Double> = JsonMissing.of()
            private var toolChoice: JsonField<ToolChoice> = JsonMissing.of()
            private var tools: JsonField<MutableList<Tool>>? = null
            private var topLogprobs: JsonField<Long> = JsonMissing.of()
            private var topP: JsonField<Double> = JsonMissing.of()
            private var user: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                messages = body.messages.map { it.toMutableList() }
                model = body.model
                caching = body.caching
                contextWindowFallbackDict = body.contextWindowFallbackDict
                fallbacks = body.fallbacks.map { it.toMutableList() }
                frequencyPenalty = body.frequencyPenalty
                functionCall = body.functionCall
                functions = body.functions.map { it.toMutableList() }
                guardrails = body.guardrails.map { it.toMutableList() }
                logitBias = body.logitBias
                logprobs = body.logprobs
                maxTokens = body.maxTokens
                metadata = body.metadata
                n = body.n
                numRetries = body.numRetries
                parallelToolCalls = body.parallelToolCalls
                presencePenalty = body.presencePenalty
                responseFormat = body.responseFormat
                seed = body.seed
                serviceTier = body.serviceTier
                stop = body.stop
                stream = body.stream
                streamOptions = body.streamOptions
                temperature = body.temperature
                toolChoice = body.toolChoice
                tools = body.tools.map { it.toMutableList() }
                topLogprobs = body.topLogprobs
                topP = body.topP
                user = body.user
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun messages(messages: List<Message>) = messages(JsonField.of(messages))

            /**
             * Sets [Builder.messages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messages] with a well-typed `List<Message>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun messages(messages: JsonField<List<Message>>) = apply {
                this.messages = messages.map { it.toMutableList() }
            }

            /**
             * Adds a single [Message] to [messages].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMessage(message: Message) = apply {
                messages =
                    (messages ?: JsonField.of(mutableListOf())).also {
                        checkKnown("messages", it).add(message)
                    }
            }

            /**
             * Alias for calling [addMessage] with
             * `Message.ofChatCompletionUser(chatCompletionUser)`.
             */
            fun addMessage(chatCompletionUser: Message.ChatCompletionUserMessage) =
                addMessage(Message.ofChatCompletionUser(chatCompletionUser))

            /**
             * Alias for calling [addMessage] with
             * `Message.ofChatCompletionAssistant(chatCompletionAssistant)`.
             */
            fun addMessage(chatCompletionAssistant: Message.ChatCompletionAssistantMessage) =
                addMessage(Message.ofChatCompletionAssistant(chatCompletionAssistant))

            /**
             * Alias for calling [addMessage] with
             * `Message.ofChatCompletionTool(chatCompletionTool)`.
             */
            fun addMessage(chatCompletionTool: Message.ChatCompletionToolMessage) =
                addMessage(Message.ofChatCompletionTool(chatCompletionTool))

            /**
             * Alias for calling [addMessage] with
             * `Message.ofChatCompletionSystem(chatCompletionSystem)`.
             */
            fun addMessage(chatCompletionSystem: Message.ChatCompletionSystemMessage) =
                addMessage(Message.ofChatCompletionSystem(chatCompletionSystem))

            /**
             * Alias for calling [addMessage] with
             * `Message.ofChatCompletionFunction(chatCompletionFunction)`.
             */
            fun addMessage(chatCompletionFunction: Message.ChatCompletionFunctionMessage) =
                addMessage(Message.ofChatCompletionFunction(chatCompletionFunction))

            /**
             * Alias for calling [addMessage] with
             * `Message.ofChatCompletionDeveloper(chatCompletionDeveloper)`.
             */
            fun addMessage(chatCompletionDeveloper: Message.ChatCompletionDeveloperMessage) =
                addMessage(Message.ofChatCompletionDeveloper(chatCompletionDeveloper))

            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            fun caching(caching: Boolean?) = caching(JsonField.ofNullable(caching))

            /**
             * Alias for [Builder.caching].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun caching(caching: Boolean) = caching(caching as Boolean?)

            /**
             * Sets [Builder.caching] to an arbitrary JSON value.
             *
             * You should usually call [Builder.caching] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun caching(caching: JsonField<Boolean>) = apply { this.caching = caching }

            fun contextWindowFallbackDict(contextWindowFallbackDict: ContextWindowFallbackDict?) =
                contextWindowFallbackDict(JsonField.ofNullable(contextWindowFallbackDict))

            /**
             * Sets [Builder.contextWindowFallbackDict] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contextWindowFallbackDict] with a well-typed
             * [ContextWindowFallbackDict] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun contextWindowFallbackDict(
                contextWindowFallbackDict: JsonField<ContextWindowFallbackDict>
            ) = apply { this.contextWindowFallbackDict = contextWindowFallbackDict }

            fun fallbacks(fallbacks: List<String>?) = fallbacks(JsonField.ofNullable(fallbacks))

            /**
             * Sets [Builder.fallbacks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fallbacks] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fallbacks(fallbacks: JsonField<List<String>>) = apply {
                this.fallbacks = fallbacks.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [fallbacks].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFallback(fallback: String) = apply {
                fallbacks =
                    (fallbacks ?: JsonField.of(mutableListOf())).also {
                        checkKnown("fallbacks", it).add(fallback)
                    }
            }

            fun frequencyPenalty(frequencyPenalty: Double?) =
                frequencyPenalty(JsonField.ofNullable(frequencyPenalty))

            /**
             * Alias for [Builder.frequencyPenalty].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun frequencyPenalty(frequencyPenalty: Double) =
                frequencyPenalty(frequencyPenalty as Double?)

            /**
             * Sets [Builder.frequencyPenalty] to an arbitrary JSON value.
             *
             * You should usually call [Builder.frequencyPenalty] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun frequencyPenalty(frequencyPenalty: JsonField<Double>) = apply {
                this.frequencyPenalty = frequencyPenalty
            }

            fun functionCall(functionCall: FunctionCall?) =
                functionCall(JsonField.ofNullable(functionCall))

            /**
             * Sets [Builder.functionCall] to an arbitrary JSON value.
             *
             * You should usually call [Builder.functionCall] with a well-typed [FunctionCall] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun functionCall(functionCall: JsonField<FunctionCall>) = apply {
                this.functionCall = functionCall
            }

            /** Alias for calling [functionCall] with `FunctionCall.ofString(string)`. */
            fun functionCall(string: String) = functionCall(FunctionCall.ofString(string))

            /**
             * Alias for calling [functionCall] with `FunctionCall.ofUnionMember1(unionMember1)`.
             */
            fun functionCall(unionMember1: FunctionCall.UnionMember1) =
                functionCall(FunctionCall.ofUnionMember1(unionMember1))

            fun functions(functions: List<Function>?) = functions(JsonField.ofNullable(functions))

            /**
             * Sets [Builder.functions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.functions] with a well-typed `List<Function>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun functions(functions: JsonField<List<Function>>) = apply {
                this.functions = functions.map { it.toMutableList() }
            }

            /**
             * Adds a single [Function] to [functions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFunction(function: Function) = apply {
                functions =
                    (functions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("functions", it).add(function)
                    }
            }

            fun guardrails(guardrails: List<String>?) = guardrails(JsonField.ofNullable(guardrails))

            /**
             * Sets [Builder.guardrails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.guardrails] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun guardrails(guardrails: JsonField<List<String>>) = apply {
                this.guardrails = guardrails.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [guardrails].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addGuardrail(guardrail: String) = apply {
                guardrails =
                    (guardrails ?: JsonField.of(mutableListOf())).also {
                        checkKnown("guardrails", it).add(guardrail)
                    }
            }

            fun logitBias(logitBias: LogitBias?) = logitBias(JsonField.ofNullable(logitBias))

            /**
             * Sets [Builder.logitBias] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logitBias] with a well-typed [LogitBias] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun logitBias(logitBias: JsonField<LogitBias>) = apply { this.logitBias = logitBias }

            fun logprobs(logprobs: Boolean?) = logprobs(JsonField.ofNullable(logprobs))

            /**
             * Alias for [Builder.logprobs].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun logprobs(logprobs: Boolean) = logprobs(logprobs as Boolean?)

            /**
             * Sets [Builder.logprobs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logprobs] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun logprobs(logprobs: JsonField<Boolean>) = apply { this.logprobs = logprobs }

            fun maxTokens(maxTokens: Long?) = maxTokens(JsonField.ofNullable(maxTokens))

            /**
             * Alias for [Builder.maxTokens].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxTokens(maxTokens: Long) = maxTokens(maxTokens as Long?)

            /**
             * Sets [Builder.maxTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxTokens] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxTokens(maxTokens: JsonField<Long>) = apply { this.maxTokens = maxTokens }

            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun n(n: Long?) = n(JsonField.ofNullable(n))

            /**
             * Alias for [Builder.n].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun n(n: Long) = n(n as Long?)

            /**
             * Sets [Builder.n] to an arbitrary JSON value.
             *
             * You should usually call [Builder.n] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun n(n: JsonField<Long>) = apply { this.n = n }

            fun numRetries(numRetries: Long?) = numRetries(JsonField.ofNullable(numRetries))

            /**
             * Alias for [Builder.numRetries].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun numRetries(numRetries: Long) = numRetries(numRetries as Long?)

            /**
             * Sets [Builder.numRetries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numRetries] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numRetries(numRetries: JsonField<Long>) = apply { this.numRetries = numRetries }

            fun parallelToolCalls(parallelToolCalls: Boolean?) =
                parallelToolCalls(JsonField.ofNullable(parallelToolCalls))

            /**
             * Alias for [Builder.parallelToolCalls].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun parallelToolCalls(parallelToolCalls: Boolean) =
                parallelToolCalls(parallelToolCalls as Boolean?)

            /**
             * Sets [Builder.parallelToolCalls] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parallelToolCalls] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parallelToolCalls(parallelToolCalls: JsonField<Boolean>) = apply {
                this.parallelToolCalls = parallelToolCalls
            }

            fun presencePenalty(presencePenalty: Double?) =
                presencePenalty(JsonField.ofNullable(presencePenalty))

            /**
             * Alias for [Builder.presencePenalty].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun presencePenalty(presencePenalty: Double) =
                presencePenalty(presencePenalty as Double?)

            /**
             * Sets [Builder.presencePenalty] to an arbitrary JSON value.
             *
             * You should usually call [Builder.presencePenalty] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun presencePenalty(presencePenalty: JsonField<Double>) = apply {
                this.presencePenalty = presencePenalty
            }

            fun responseFormat(responseFormat: ResponseFormat?) =
                responseFormat(JsonField.ofNullable(responseFormat))

            /**
             * Sets [Builder.responseFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.responseFormat] with a well-typed [ResponseFormat]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun responseFormat(responseFormat: JsonField<ResponseFormat>) = apply {
                this.responseFormat = responseFormat
            }

            fun seed(seed: Long?) = seed(JsonField.ofNullable(seed))

            /**
             * Alias for [Builder.seed].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun seed(seed: Long) = seed(seed as Long?)

            /**
             * Sets [Builder.seed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.seed] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun seed(seed: JsonField<Long>) = apply { this.seed = seed }

            fun serviceTier(serviceTier: String?) = serviceTier(JsonField.ofNullable(serviceTier))

            /**
             * Sets [Builder.serviceTier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.serviceTier] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun serviceTier(serviceTier: JsonField<String>) = apply {
                this.serviceTier = serviceTier
            }

            fun stop(stop: Stop?) = stop(JsonField.ofNullable(stop))

            /**
             * Sets [Builder.stop] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stop] with a well-typed [Stop] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun stop(stop: JsonField<Stop>) = apply { this.stop = stop }

            /** Alias for calling [stop] with `Stop.ofString(string)`. */
            fun stop(string: String) = stop(Stop.ofString(string))

            /** Alias for calling [stop] with `Stop.ofStrings(strings)`. */
            fun stopOfStrings(strings: List<String>) = stop(Stop.ofStrings(strings))

            fun stream(stream: Boolean?) = stream(JsonField.ofNullable(stream))

            /**
             * Alias for [Builder.stream].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun stream(stream: Boolean) = stream(stream as Boolean?)

            /**
             * Sets [Builder.stream] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stream] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stream(stream: JsonField<Boolean>) = apply { this.stream = stream }

            fun streamOptions(streamOptions: StreamOptions?) =
                streamOptions(JsonField.ofNullable(streamOptions))

            /**
             * Sets [Builder.streamOptions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.streamOptions] with a well-typed [StreamOptions]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun streamOptions(streamOptions: JsonField<StreamOptions>) = apply {
                this.streamOptions = streamOptions
            }

            fun temperature(temperature: Double?) = temperature(JsonField.ofNullable(temperature))

            /**
             * Alias for [Builder.temperature].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun temperature(temperature: Double) = temperature(temperature as Double?)

            /**
             * Sets [Builder.temperature] to an arbitrary JSON value.
             *
             * You should usually call [Builder.temperature] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun temperature(temperature: JsonField<Double>) = apply {
                this.temperature = temperature
            }

            fun toolChoice(toolChoice: ToolChoice?) = toolChoice(JsonField.ofNullable(toolChoice))

            /**
             * Sets [Builder.toolChoice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toolChoice] with a well-typed [ToolChoice] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun toolChoice(toolChoice: JsonField<ToolChoice>) = apply {
                this.toolChoice = toolChoice
            }

            /** Alias for calling [toolChoice] with `ToolChoice.ofString(string)`. */
            fun toolChoice(string: String) = toolChoice(ToolChoice.ofString(string))

            /** Alias for calling [toolChoice] with `ToolChoice.ofUnionMember1(unionMember1)`. */
            fun toolChoice(unionMember1: ToolChoice.UnionMember1) =
                toolChoice(ToolChoice.ofUnionMember1(unionMember1))

            fun tools(tools: List<Tool>?) = tools(JsonField.ofNullable(tools))

            /**
             * Sets [Builder.tools] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tools] with a well-typed `List<Tool>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tools(tools: JsonField<List<Tool>>) = apply {
                this.tools = tools.map { it.toMutableList() }
            }

            /**
             * Adds a single [Tool] to [tools].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTool(tool: Tool) = apply {
                tools =
                    (tools ?: JsonField.of(mutableListOf())).also {
                        checkKnown("tools", it).add(tool)
                    }
            }

            fun topLogprobs(topLogprobs: Long?) = topLogprobs(JsonField.ofNullable(topLogprobs))

            /**
             * Alias for [Builder.topLogprobs].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun topLogprobs(topLogprobs: Long) = topLogprobs(topLogprobs as Long?)

            /**
             * Sets [Builder.topLogprobs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.topLogprobs] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun topLogprobs(topLogprobs: JsonField<Long>) = apply { this.topLogprobs = topLogprobs }

            fun topP(topP: Double?) = topP(JsonField.ofNullable(topP))

            /**
             * Alias for [Builder.topP].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun topP(topP: Double) = topP(topP as Double?)

            /**
             * Sets [Builder.topP] to an arbitrary JSON value.
             *
             * You should usually call [Builder.topP] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun topP(topP: JsonField<Double>) = apply { this.topP = topP }

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
             * .messages()
             * .model()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("messages", messages).map { it.toImmutable() },
                    checkRequired("model", model),
                    caching,
                    contextWindowFallbackDict,
                    (fallbacks ?: JsonMissing.of()).map { it.toImmutable() },
                    frequencyPenalty,
                    functionCall,
                    (functions ?: JsonMissing.of()).map { it.toImmutable() },
                    (guardrails ?: JsonMissing.of()).map { it.toImmutable() },
                    logitBias,
                    logprobs,
                    maxTokens,
                    metadata,
                    n,
                    numRetries,
                    parallelToolCalls,
                    presencePenalty,
                    responseFormat,
                    seed,
                    serviceTier,
                    stop,
                    stream,
                    streamOptions,
                    temperature,
                    toolChoice,
                    (tools ?: JsonMissing.of()).map { it.toImmutable() },
                    topLogprobs,
                    topP,
                    user,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            messages().forEach { it.validate() }
            model()
            caching()
            contextWindowFallbackDict()?.validate()
            fallbacks()
            frequencyPenalty()
            functionCall()?.validate()
            functions()?.forEach { it.validate() }
            guardrails()
            logitBias()?.validate()
            logprobs()
            maxTokens()
            metadata()?.validate()
            n()
            numRetries()
            parallelToolCalls()
            presencePenalty()
            responseFormat()?.validate()
            seed()
            serviceTier()
            stop()?.validate()
            stream()
            streamOptions()?.validate()
            temperature()
            toolChoice()?.validate()
            tools()?.forEach { it.validate() }
            topLogprobs()
            topP()
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
            (messages.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (model.asKnown() == null) 0 else 1) +
                (if (caching.asKnown() == null) 0 else 1) +
                (contextWindowFallbackDict.asKnown()?.validity() ?: 0) +
                (fallbacks.asKnown()?.size ?: 0) +
                (if (frequencyPenalty.asKnown() == null) 0 else 1) +
                (functionCall.asKnown()?.validity() ?: 0) +
                (functions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (guardrails.asKnown()?.size ?: 0) +
                (logitBias.asKnown()?.validity() ?: 0) +
                (if (logprobs.asKnown() == null) 0 else 1) +
                (if (maxTokens.asKnown() == null) 0 else 1) +
                (metadata.asKnown()?.validity() ?: 0) +
                (if (n.asKnown() == null) 0 else 1) +
                (if (numRetries.asKnown() == null) 0 else 1) +
                (if (parallelToolCalls.asKnown() == null) 0 else 1) +
                (if (presencePenalty.asKnown() == null) 0 else 1) +
                (responseFormat.asKnown()?.validity() ?: 0) +
                (if (seed.asKnown() == null) 0 else 1) +
                (if (serviceTier.asKnown() == null) 0 else 1) +
                (stop.asKnown()?.validity() ?: 0) +
                (if (stream.asKnown() == null) 0 else 1) +
                (streamOptions.asKnown()?.validity() ?: 0) +
                (if (temperature.asKnown() == null) 0 else 1) +
                (toolChoice.asKnown()?.validity() ?: 0) +
                (tools.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (topLogprobs.asKnown() == null) 0 else 1) +
                (if (topP.asKnown() == null) 0 else 1) +
                (if (user.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                messages == other.messages &&
                model == other.model &&
                caching == other.caching &&
                contextWindowFallbackDict == other.contextWindowFallbackDict &&
                fallbacks == other.fallbacks &&
                frequencyPenalty == other.frequencyPenalty &&
                functionCall == other.functionCall &&
                functions == other.functions &&
                guardrails == other.guardrails &&
                logitBias == other.logitBias &&
                logprobs == other.logprobs &&
                maxTokens == other.maxTokens &&
                metadata == other.metadata &&
                n == other.n &&
                numRetries == other.numRetries &&
                parallelToolCalls == other.parallelToolCalls &&
                presencePenalty == other.presencePenalty &&
                responseFormat == other.responseFormat &&
                seed == other.seed &&
                serviceTier == other.serviceTier &&
                stop == other.stop &&
                stream == other.stream &&
                streamOptions == other.streamOptions &&
                temperature == other.temperature &&
                toolChoice == other.toolChoice &&
                tools == other.tools &&
                topLogprobs == other.topLogprobs &&
                topP == other.topP &&
                user == other.user &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                messages,
                model,
                caching,
                contextWindowFallbackDict,
                fallbacks,
                frequencyPenalty,
                functionCall,
                functions,
                guardrails,
                logitBias,
                logprobs,
                maxTokens,
                metadata,
                n,
                numRetries,
                parallelToolCalls,
                presencePenalty,
                responseFormat,
                seed,
                serviceTier,
                stop,
                stream,
                streamOptions,
                temperature,
                toolChoice,
                tools,
                topLogprobs,
                topP,
                user,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{messages=$messages, model=$model, caching=$caching, contextWindowFallbackDict=$contextWindowFallbackDict, fallbacks=$fallbacks, frequencyPenalty=$frequencyPenalty, functionCall=$functionCall, functions=$functions, guardrails=$guardrails, logitBias=$logitBias, logprobs=$logprobs, maxTokens=$maxTokens, metadata=$metadata, n=$n, numRetries=$numRetries, parallelToolCalls=$parallelToolCalls, presencePenalty=$presencePenalty, responseFormat=$responseFormat, seed=$seed, serviceTier=$serviceTier, stop=$stop, stream=$stream, streamOptions=$streamOptions, temperature=$temperature, toolChoice=$toolChoice, tools=$tools, topLogprobs=$topLogprobs, topP=$topP, user=$user, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = Message.Deserializer::class)
    @JsonSerialize(using = Message.Serializer::class)
    class Message
    private constructor(
        private val chatCompletionUser: ChatCompletionUserMessage? = null,
        private val chatCompletionAssistant: ChatCompletionAssistantMessage? = null,
        private val chatCompletionTool: ChatCompletionToolMessage? = null,
        private val chatCompletionSystem: ChatCompletionSystemMessage? = null,
        private val chatCompletionFunction: ChatCompletionFunctionMessage? = null,
        private val chatCompletionDeveloper: ChatCompletionDeveloperMessage? = null,
        private val _json: JsonValue? = null,
    ) {

        fun chatCompletionUser(): ChatCompletionUserMessage? = chatCompletionUser

        fun chatCompletionAssistant(): ChatCompletionAssistantMessage? = chatCompletionAssistant

        fun chatCompletionTool(): ChatCompletionToolMessage? = chatCompletionTool

        fun chatCompletionSystem(): ChatCompletionSystemMessage? = chatCompletionSystem

        fun chatCompletionFunction(): ChatCompletionFunctionMessage? = chatCompletionFunction

        fun chatCompletionDeveloper(): ChatCompletionDeveloperMessage? = chatCompletionDeveloper

        fun isChatCompletionUser(): Boolean = chatCompletionUser != null

        fun isChatCompletionAssistant(): Boolean = chatCompletionAssistant != null

        fun isChatCompletionTool(): Boolean = chatCompletionTool != null

        fun isChatCompletionSystem(): Boolean = chatCompletionSystem != null

        fun isChatCompletionFunction(): Boolean = chatCompletionFunction != null

        fun isChatCompletionDeveloper(): Boolean = chatCompletionDeveloper != null

        fun asChatCompletionUser(): ChatCompletionUserMessage =
            chatCompletionUser.getOrThrow("chatCompletionUser")

        fun asChatCompletionAssistant(): ChatCompletionAssistantMessage =
            chatCompletionAssistant.getOrThrow("chatCompletionAssistant")

        fun asChatCompletionTool(): ChatCompletionToolMessage =
            chatCompletionTool.getOrThrow("chatCompletionTool")

        fun asChatCompletionSystem(): ChatCompletionSystemMessage =
            chatCompletionSystem.getOrThrow("chatCompletionSystem")

        fun asChatCompletionFunction(): ChatCompletionFunctionMessage =
            chatCompletionFunction.getOrThrow("chatCompletionFunction")

        fun asChatCompletionDeveloper(): ChatCompletionDeveloperMessage =
            chatCompletionDeveloper.getOrThrow("chatCompletionDeveloper")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                chatCompletionUser != null -> visitor.visitChatCompletionUser(chatCompletionUser)
                chatCompletionAssistant != null ->
                    visitor.visitChatCompletionAssistant(chatCompletionAssistant)
                chatCompletionTool != null -> visitor.visitChatCompletionTool(chatCompletionTool)
                chatCompletionSystem != null ->
                    visitor.visitChatCompletionSystem(chatCompletionSystem)
                chatCompletionFunction != null ->
                    visitor.visitChatCompletionFunction(chatCompletionFunction)
                chatCompletionDeveloper != null ->
                    visitor.visitChatCompletionDeveloper(chatCompletionDeveloper)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Message = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitChatCompletionUser(
                        chatCompletionUser: ChatCompletionUserMessage
                    ) {
                        chatCompletionUser.validate()
                    }

                    override fun visitChatCompletionAssistant(
                        chatCompletionAssistant: ChatCompletionAssistantMessage
                    ) {
                        chatCompletionAssistant.validate()
                    }

                    override fun visitChatCompletionTool(
                        chatCompletionTool: ChatCompletionToolMessage
                    ) {
                        chatCompletionTool.validate()
                    }

                    override fun visitChatCompletionSystem(
                        chatCompletionSystem: ChatCompletionSystemMessage
                    ) {
                        chatCompletionSystem.validate()
                    }

                    override fun visitChatCompletionFunction(
                        chatCompletionFunction: ChatCompletionFunctionMessage
                    ) {
                        chatCompletionFunction.validate()
                    }

                    override fun visitChatCompletionDeveloper(
                        chatCompletionDeveloper: ChatCompletionDeveloperMessage
                    ) {
                        chatCompletionDeveloper.validate()
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
                    override fun visitChatCompletionUser(
                        chatCompletionUser: ChatCompletionUserMessage
                    ) = chatCompletionUser.validity()

                    override fun visitChatCompletionAssistant(
                        chatCompletionAssistant: ChatCompletionAssistantMessage
                    ) = chatCompletionAssistant.validity()

                    override fun visitChatCompletionTool(
                        chatCompletionTool: ChatCompletionToolMessage
                    ) = chatCompletionTool.validity()

                    override fun visitChatCompletionSystem(
                        chatCompletionSystem: ChatCompletionSystemMessage
                    ) = chatCompletionSystem.validity()

                    override fun visitChatCompletionFunction(
                        chatCompletionFunction: ChatCompletionFunctionMessage
                    ) = chatCompletionFunction.validity()

                    override fun visitChatCompletionDeveloper(
                        chatCompletionDeveloper: ChatCompletionDeveloperMessage
                    ) = chatCompletionDeveloper.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Message &&
                chatCompletionUser == other.chatCompletionUser &&
                chatCompletionAssistant == other.chatCompletionAssistant &&
                chatCompletionTool == other.chatCompletionTool &&
                chatCompletionSystem == other.chatCompletionSystem &&
                chatCompletionFunction == other.chatCompletionFunction &&
                chatCompletionDeveloper == other.chatCompletionDeveloper
        }

        override fun hashCode(): Int =
            Objects.hash(
                chatCompletionUser,
                chatCompletionAssistant,
                chatCompletionTool,
                chatCompletionSystem,
                chatCompletionFunction,
                chatCompletionDeveloper,
            )

        override fun toString(): String =
            when {
                chatCompletionUser != null -> "Message{chatCompletionUser=$chatCompletionUser}"
                chatCompletionAssistant != null ->
                    "Message{chatCompletionAssistant=$chatCompletionAssistant}"
                chatCompletionTool != null -> "Message{chatCompletionTool=$chatCompletionTool}"
                chatCompletionSystem != null ->
                    "Message{chatCompletionSystem=$chatCompletionSystem}"
                chatCompletionFunction != null ->
                    "Message{chatCompletionFunction=$chatCompletionFunction}"
                chatCompletionDeveloper != null ->
                    "Message{chatCompletionDeveloper=$chatCompletionDeveloper}"
                _json != null -> "Message{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Message")
            }

        companion object {

            fun ofChatCompletionUser(chatCompletionUser: ChatCompletionUserMessage) =
                Message(chatCompletionUser = chatCompletionUser)

            fun ofChatCompletionAssistant(chatCompletionAssistant: ChatCompletionAssistantMessage) =
                Message(chatCompletionAssistant = chatCompletionAssistant)

            fun ofChatCompletionTool(chatCompletionTool: ChatCompletionToolMessage) =
                Message(chatCompletionTool = chatCompletionTool)

            fun ofChatCompletionSystem(chatCompletionSystem: ChatCompletionSystemMessage) =
                Message(chatCompletionSystem = chatCompletionSystem)

            fun ofChatCompletionFunction(chatCompletionFunction: ChatCompletionFunctionMessage) =
                Message(chatCompletionFunction = chatCompletionFunction)

            fun ofChatCompletionDeveloper(chatCompletionDeveloper: ChatCompletionDeveloperMessage) =
                Message(chatCompletionDeveloper = chatCompletionDeveloper)
        }

        /**
         * An interface that defines how to map each variant of [Message] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitChatCompletionUser(chatCompletionUser: ChatCompletionUserMessage): T

            fun visitChatCompletionAssistant(
                chatCompletionAssistant: ChatCompletionAssistantMessage
            ): T

            fun visitChatCompletionTool(chatCompletionTool: ChatCompletionToolMessage): T

            fun visitChatCompletionSystem(chatCompletionSystem: ChatCompletionSystemMessage): T

            fun visitChatCompletionFunction(
                chatCompletionFunction: ChatCompletionFunctionMessage
            ): T

            fun visitChatCompletionDeveloper(
                chatCompletionDeveloper: ChatCompletionDeveloperMessage
            ): T

            /**
             * Maps an unknown variant of [Message] to a value of type [T].
             *
             * An instance of [Message] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws HanzoInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HanzoInvalidDataException("Unknown Message: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Message>(Message::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Message {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<ChatCompletionUserMessage>())?.let {
                                Message(chatCompletionUser = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ChatCompletionAssistantMessage>())
                                ?.let { Message(chatCompletionAssistant = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<ChatCompletionToolMessage>())?.let {
                                Message(chatCompletionTool = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ChatCompletionSystemMessage>())
                                ?.let { Message(chatCompletionSystem = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<ChatCompletionFunctionMessage>())
                                ?.let { Message(chatCompletionFunction = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<ChatCompletionDeveloperMessage>())
                                ?.let { Message(chatCompletionDeveloper = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Message(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Message>(Message::class) {

            override fun serialize(
                value: Message,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.chatCompletionUser != null ->
                        generator.writeObject(value.chatCompletionUser)
                    value.chatCompletionAssistant != null ->
                        generator.writeObject(value.chatCompletionAssistant)
                    value.chatCompletionTool != null ->
                        generator.writeObject(value.chatCompletionTool)
                    value.chatCompletionSystem != null ->
                        generator.writeObject(value.chatCompletionSystem)
                    value.chatCompletionFunction != null ->
                        generator.writeObject(value.chatCompletionFunction)
                    value.chatCompletionDeveloper != null ->
                        generator.writeObject(value.chatCompletionDeveloper)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Message")
                }
            }
        }

        class ChatCompletionUserMessage
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<Content>,
            private val role: JsonValue,
            private val cacheControl: JsonField<CacheControl>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<Content> = JsonMissing.of(),
                @JsonProperty("role") @ExcludeMissing role: JsonValue = JsonMissing.of(),
                @JsonProperty("cache_control")
                @ExcludeMissing
                cacheControl: JsonField<CacheControl> = JsonMissing.of(),
            ) : this(content, role, cacheControl, mutableMapOf())

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): Content = content.getRequired("content")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("user")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("role") @ExcludeMissing fun _role(): JsonValue = role

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun cacheControl(): CacheControl? = cacheControl.getNullable("cache_control")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

            /**
             * Returns the raw JSON value of [cacheControl].
             *
             * Unlike [cacheControl], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("cache_control")
            @ExcludeMissing
            fun _cacheControl(): JsonField<CacheControl> = cacheControl

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
                 * Returns a mutable builder for constructing an instance of
                 * [ChatCompletionUserMessage].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .content()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [ChatCompletionUserMessage]. */
            class Builder internal constructor() {

                private var content: JsonField<Content>? = null
                private var role: JsonValue = JsonValue.from("user")
                private var cacheControl: JsonField<CacheControl> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(chatCompletionUserMessage: ChatCompletionUserMessage) = apply {
                    content = chatCompletionUserMessage.content
                    role = chatCompletionUserMessage.role
                    cacheControl = chatCompletionUserMessage.cacheControl
                    additionalProperties =
                        chatCompletionUserMessage.additionalProperties.toMutableMap()
                }

                fun content(content: Content) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [Content] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<Content>) = apply { this.content = content }

                /** Alias for calling [content] with `Content.ofString(string)`. */
                fun content(string: String) = content(Content.ofString(string))

                /**
                 * Alias for calling [content] with
                 * `Content.ofUnnamedSchemaWithArrayParent4s(unnamedSchemaWithArrayParent4s)`.
                 */
                fun contentOfUnnamedSchemaWithArrayParent4s(
                    unnamedSchemaWithArrayParent4s: List<Content.UnnamedSchemaWithArrayParent4>
                ) =
                    content(
                        Content.ofUnnamedSchemaWithArrayParent4s(unnamedSchemaWithArrayParent4s)
                    )

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("user")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun role(role: JsonValue) = apply { this.role = role }

                fun cacheControl(cacheControl: CacheControl) =
                    cacheControl(JsonField.of(cacheControl))

                /**
                 * Sets [Builder.cacheControl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cacheControl] with a well-typed [CacheControl]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun cacheControl(cacheControl: JsonField<CacheControl>) = apply {
                    this.cacheControl = cacheControl
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
                 * Returns an immutable instance of [ChatCompletionUserMessage].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .content()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ChatCompletionUserMessage =
                    ChatCompletionUserMessage(
                        checkRequired("content", content),
                        role,
                        cacheControl,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ChatCompletionUserMessage = apply {
                if (validated) {
                    return@apply
                }

                content().validate()
                _role().let {
                    if (it != JsonValue.from("user")) {
                        throw HanzoInvalidDataException("'role' is invalid, received $it")
                    }
                }
                cacheControl()?.validate()
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
                (content.asKnown()?.validity() ?: 0) +
                    role.let { if (it == JsonValue.from("user")) 1 else 0 } +
                    (cacheControl.asKnown()?.validity() ?: 0)

            @JsonDeserialize(using = Content.Deserializer::class)
            @JsonSerialize(using = Content.Serializer::class)
            class Content
            private constructor(
                private val string: String? = null,
                private val unnamedSchemaWithArrayParent4s: List<UnnamedSchemaWithArrayParent4>? =
                    null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): String? = string

                fun unnamedSchemaWithArrayParent4s(): List<UnnamedSchemaWithArrayParent4>? =
                    unnamedSchemaWithArrayParent4s

                fun isString(): Boolean = string != null

                fun isUnnamedSchemaWithArrayParent4s(): Boolean =
                    unnamedSchemaWithArrayParent4s != null

                fun asString(): String = string.getOrThrow("string")

                fun asUnnamedSchemaWithArrayParent4s(): List<UnnamedSchemaWithArrayParent4> =
                    unnamedSchemaWithArrayParent4s.getOrThrow("unnamedSchemaWithArrayParent4s")

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        unnamedSchemaWithArrayParent4s != null ->
                            visitor.visitUnnamedSchemaWithArrayParent4s(
                                unnamedSchemaWithArrayParent4s
                            )
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Content = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitString(string: String) {}

                            override fun visitUnnamedSchemaWithArrayParent4s(
                                unnamedSchemaWithArrayParent4s: List<UnnamedSchemaWithArrayParent4>
                            ) {
                                unnamedSchemaWithArrayParent4s.forEach { it.validate() }
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

                            override fun visitUnnamedSchemaWithArrayParent4s(
                                unnamedSchemaWithArrayParent4s: List<UnnamedSchemaWithArrayParent4>
                            ) = unnamedSchemaWithArrayParent4s.sumOf { it.validity().toInt() }

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Content &&
                        string == other.string &&
                        unnamedSchemaWithArrayParent4s == other.unnamedSchemaWithArrayParent4s
                }

                override fun hashCode(): Int = Objects.hash(string, unnamedSchemaWithArrayParent4s)

                override fun toString(): String =
                    when {
                        string != null -> "Content{string=$string}"
                        unnamedSchemaWithArrayParent4s != null ->
                            "Content{unnamedSchemaWithArrayParent4s=$unnamedSchemaWithArrayParent4s}"
                        _json != null -> "Content{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Content")
                    }

                companion object {

                    fun ofString(string: String) = Content(string = string)

                    fun ofUnnamedSchemaWithArrayParent4s(
                        unnamedSchemaWithArrayParent4s: List<UnnamedSchemaWithArrayParent4>
                    ) =
                        Content(
                            unnamedSchemaWithArrayParent4s =
                                unnamedSchemaWithArrayParent4s.toImmutable()
                        )
                }

                /**
                 * An interface that defines how to map each variant of [Content] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitUnnamedSchemaWithArrayParent4s(
                        unnamedSchemaWithArrayParent4s: List<UnnamedSchemaWithArrayParent4>
                    ): T

                    /**
                     * Maps an unknown variant of [Content] to a value of type [T].
                     *
                     * An instance of [Content] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws HanzoInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw HanzoInvalidDataException("Unknown Content: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Content>(Content::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Content {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Content(string = it, _json = json)
                                    },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<List<UnnamedSchemaWithArrayParent4>>(),
                                        )
                                        ?.let {
                                            Content(
                                                unnamedSchemaWithArrayParent4s = it,
                                                _json = json,
                                            )
                                        },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> Content(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Content>(Content::class) {

                    override fun serialize(
                        value: Content,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.unnamedSchemaWithArrayParent4s != null ->
                                generator.writeObject(value.unnamedSchemaWithArrayParent4s)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Content")
                        }
                    }
                }

                @JsonDeserialize(using = UnnamedSchemaWithArrayParent4.Deserializer::class)
                @JsonSerialize(using = UnnamedSchemaWithArrayParent4.Serializer::class)
                class UnnamedSchemaWithArrayParent4
                private constructor(
                    private val chatCompletionTextObject: ChatCompletionTextObject? = null,
                    private val chatCompletionImageObject: ChatCompletionImageObject? = null,
                    private val chatCompletionAudioObject: ChatCompletionAudioObject? = null,
                    private val chatCompletionDocumentObject: ChatCompletionDocumentObject? = null,
                    private val chatCompletionVideoObject: ChatCompletionVideoObject? = null,
                    private val chatCompletionFileObject: ChatCompletionFileObject? = null,
                    private val _json: JsonValue? = null,
                ) {

                    fun chatCompletionTextObject(): ChatCompletionTextObject? =
                        chatCompletionTextObject

                    fun chatCompletionImageObject(): ChatCompletionImageObject? =
                        chatCompletionImageObject

                    fun chatCompletionAudioObject(): ChatCompletionAudioObject? =
                        chatCompletionAudioObject

                    fun chatCompletionDocumentObject(): ChatCompletionDocumentObject? =
                        chatCompletionDocumentObject

                    fun chatCompletionVideoObject(): ChatCompletionVideoObject? =
                        chatCompletionVideoObject

                    fun chatCompletionFileObject(): ChatCompletionFileObject? =
                        chatCompletionFileObject

                    fun isChatCompletionTextObject(): Boolean = chatCompletionTextObject != null

                    fun isChatCompletionImageObject(): Boolean = chatCompletionImageObject != null

                    fun isChatCompletionAudioObject(): Boolean = chatCompletionAudioObject != null

                    fun isChatCompletionDocumentObject(): Boolean =
                        chatCompletionDocumentObject != null

                    fun isChatCompletionVideoObject(): Boolean = chatCompletionVideoObject != null

                    fun isChatCompletionFileObject(): Boolean = chatCompletionFileObject != null

                    fun asChatCompletionTextObject(): ChatCompletionTextObject =
                        chatCompletionTextObject.getOrThrow("chatCompletionTextObject")

                    fun asChatCompletionImageObject(): ChatCompletionImageObject =
                        chatCompletionImageObject.getOrThrow("chatCompletionImageObject")

                    fun asChatCompletionAudioObject(): ChatCompletionAudioObject =
                        chatCompletionAudioObject.getOrThrow("chatCompletionAudioObject")

                    fun asChatCompletionDocumentObject(): ChatCompletionDocumentObject =
                        chatCompletionDocumentObject.getOrThrow("chatCompletionDocumentObject")

                    fun asChatCompletionVideoObject(): ChatCompletionVideoObject =
                        chatCompletionVideoObject.getOrThrow("chatCompletionVideoObject")

                    fun asChatCompletionFileObject(): ChatCompletionFileObject =
                        chatCompletionFileObject.getOrThrow("chatCompletionFileObject")

                    fun _json(): JsonValue? = _json

                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            chatCompletionTextObject != null ->
                                visitor.visitChatCompletionTextObject(chatCompletionTextObject)
                            chatCompletionImageObject != null ->
                                visitor.visitChatCompletionImageObject(chatCompletionImageObject)
                            chatCompletionAudioObject != null ->
                                visitor.visitChatCompletionAudioObject(chatCompletionAudioObject)
                            chatCompletionDocumentObject != null ->
                                visitor.visitChatCompletionDocumentObject(
                                    chatCompletionDocumentObject
                                )
                            chatCompletionVideoObject != null ->
                                visitor.visitChatCompletionVideoObject(chatCompletionVideoObject)
                            chatCompletionFileObject != null ->
                                visitor.visitChatCompletionFileObject(chatCompletionFileObject)
                            else -> visitor.unknown(_json)
                        }

                    private var validated: Boolean = false

                    fun validate(): UnnamedSchemaWithArrayParent4 = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitChatCompletionTextObject(
                                    chatCompletionTextObject: ChatCompletionTextObject
                                ) {
                                    chatCompletionTextObject.validate()
                                }

                                override fun visitChatCompletionImageObject(
                                    chatCompletionImageObject: ChatCompletionImageObject
                                ) {
                                    chatCompletionImageObject.validate()
                                }

                                override fun visitChatCompletionAudioObject(
                                    chatCompletionAudioObject: ChatCompletionAudioObject
                                ) {
                                    chatCompletionAudioObject.validate()
                                }

                                override fun visitChatCompletionDocumentObject(
                                    chatCompletionDocumentObject: ChatCompletionDocumentObject
                                ) {
                                    chatCompletionDocumentObject.validate()
                                }

                                override fun visitChatCompletionVideoObject(
                                    chatCompletionVideoObject: ChatCompletionVideoObject
                                ) {
                                    chatCompletionVideoObject.validate()
                                }

                                override fun visitChatCompletionFileObject(
                                    chatCompletionFileObject: ChatCompletionFileObject
                                ) {
                                    chatCompletionFileObject.validate()
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
                                override fun visitChatCompletionTextObject(
                                    chatCompletionTextObject: ChatCompletionTextObject
                                ) = chatCompletionTextObject.validity()

                                override fun visitChatCompletionImageObject(
                                    chatCompletionImageObject: ChatCompletionImageObject
                                ) = chatCompletionImageObject.validity()

                                override fun visitChatCompletionAudioObject(
                                    chatCompletionAudioObject: ChatCompletionAudioObject
                                ) = chatCompletionAudioObject.validity()

                                override fun visitChatCompletionDocumentObject(
                                    chatCompletionDocumentObject: ChatCompletionDocumentObject
                                ) = chatCompletionDocumentObject.validity()

                                override fun visitChatCompletionVideoObject(
                                    chatCompletionVideoObject: ChatCompletionVideoObject
                                ) = chatCompletionVideoObject.validity()

                                override fun visitChatCompletionFileObject(
                                    chatCompletionFileObject: ChatCompletionFileObject
                                ) = chatCompletionFileObject.validity()

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is UnnamedSchemaWithArrayParent4 &&
                            chatCompletionTextObject == other.chatCompletionTextObject &&
                            chatCompletionImageObject == other.chatCompletionImageObject &&
                            chatCompletionAudioObject == other.chatCompletionAudioObject &&
                            chatCompletionDocumentObject == other.chatCompletionDocumentObject &&
                            chatCompletionVideoObject == other.chatCompletionVideoObject &&
                            chatCompletionFileObject == other.chatCompletionFileObject
                    }

                    override fun hashCode(): Int =
                        Objects.hash(
                            chatCompletionTextObject,
                            chatCompletionImageObject,
                            chatCompletionAudioObject,
                            chatCompletionDocumentObject,
                            chatCompletionVideoObject,
                            chatCompletionFileObject,
                        )

                    override fun toString(): String =
                        when {
                            chatCompletionTextObject != null ->
                                "UnnamedSchemaWithArrayParent4{chatCompletionTextObject=$chatCompletionTextObject}"
                            chatCompletionImageObject != null ->
                                "UnnamedSchemaWithArrayParent4{chatCompletionImageObject=$chatCompletionImageObject}"
                            chatCompletionAudioObject != null ->
                                "UnnamedSchemaWithArrayParent4{chatCompletionAudioObject=$chatCompletionAudioObject}"
                            chatCompletionDocumentObject != null ->
                                "UnnamedSchemaWithArrayParent4{chatCompletionDocumentObject=$chatCompletionDocumentObject}"
                            chatCompletionVideoObject != null ->
                                "UnnamedSchemaWithArrayParent4{chatCompletionVideoObject=$chatCompletionVideoObject}"
                            chatCompletionFileObject != null ->
                                "UnnamedSchemaWithArrayParent4{chatCompletionFileObject=$chatCompletionFileObject}"
                            _json != null -> "UnnamedSchemaWithArrayParent4{_unknown=$_json}"
                            else ->
                                throw IllegalStateException("Invalid UnnamedSchemaWithArrayParent4")
                        }

                    companion object {

                        fun ofChatCompletionTextObject(
                            chatCompletionTextObject: ChatCompletionTextObject
                        ) =
                            UnnamedSchemaWithArrayParent4(
                                chatCompletionTextObject = chatCompletionTextObject
                            )

                        fun ofChatCompletionImageObject(
                            chatCompletionImageObject: ChatCompletionImageObject
                        ) =
                            UnnamedSchemaWithArrayParent4(
                                chatCompletionImageObject = chatCompletionImageObject
                            )

                        fun ofChatCompletionAudioObject(
                            chatCompletionAudioObject: ChatCompletionAudioObject
                        ) =
                            UnnamedSchemaWithArrayParent4(
                                chatCompletionAudioObject = chatCompletionAudioObject
                            )

                        fun ofChatCompletionDocumentObject(
                            chatCompletionDocumentObject: ChatCompletionDocumentObject
                        ) =
                            UnnamedSchemaWithArrayParent4(
                                chatCompletionDocumentObject = chatCompletionDocumentObject
                            )

                        fun ofChatCompletionVideoObject(
                            chatCompletionVideoObject: ChatCompletionVideoObject
                        ) =
                            UnnamedSchemaWithArrayParent4(
                                chatCompletionVideoObject = chatCompletionVideoObject
                            )

                        fun ofChatCompletionFileObject(
                            chatCompletionFileObject: ChatCompletionFileObject
                        ) =
                            UnnamedSchemaWithArrayParent4(
                                chatCompletionFileObject = chatCompletionFileObject
                            )
                    }

                    /**
                     * An interface that defines how to map each variant of
                     * [UnnamedSchemaWithArrayParent4] to a value of type [T].
                     */
                    interface Visitor<out T> {

                        fun visitChatCompletionTextObject(
                            chatCompletionTextObject: ChatCompletionTextObject
                        ): T

                        fun visitChatCompletionImageObject(
                            chatCompletionImageObject: ChatCompletionImageObject
                        ): T

                        fun visitChatCompletionAudioObject(
                            chatCompletionAudioObject: ChatCompletionAudioObject
                        ): T

                        fun visitChatCompletionDocumentObject(
                            chatCompletionDocumentObject: ChatCompletionDocumentObject
                        ): T

                        fun visitChatCompletionVideoObject(
                            chatCompletionVideoObject: ChatCompletionVideoObject
                        ): T

                        fun visitChatCompletionFileObject(
                            chatCompletionFileObject: ChatCompletionFileObject
                        ): T

                        /**
                         * Maps an unknown variant of [UnnamedSchemaWithArrayParent4] to a value of
                         * type [T].
                         *
                         * An instance of [UnnamedSchemaWithArrayParent4] can contain an unknown
                         * variant if it was deserialized from data that doesn't match any known
                         * variant. For example, if the SDK is on an older version than the API,
                         * then the API may respond with new variants that the SDK is unaware of.
                         *
                         * @throws HanzoInvalidDataException in the default implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw HanzoInvalidDataException(
                                "Unknown UnnamedSchemaWithArrayParent4: $json"
                            )
                        }
                    }

                    internal class Deserializer :
                        BaseDeserializer<UnnamedSchemaWithArrayParent4>(
                            UnnamedSchemaWithArrayParent4::class
                        ) {

                        override fun ObjectCodec.deserialize(
                            node: JsonNode
                        ): UnnamedSchemaWithArrayParent4 {
                            val json = JsonValue.fromJsonNode(node)

                            val bestMatches =
                                sequenceOf(
                                        tryDeserialize(
                                                node,
                                                jacksonTypeRef<ChatCompletionTextObject>(),
                                            )
                                            ?.let {
                                                UnnamedSchemaWithArrayParent4(
                                                    chatCompletionTextObject = it,
                                                    _json = json,
                                                )
                                            },
                                        tryDeserialize(
                                                node,
                                                jacksonTypeRef<ChatCompletionImageObject>(),
                                            )
                                            ?.let {
                                                UnnamedSchemaWithArrayParent4(
                                                    chatCompletionImageObject = it,
                                                    _json = json,
                                                )
                                            },
                                        tryDeserialize(
                                                node,
                                                jacksonTypeRef<ChatCompletionAudioObject>(),
                                            )
                                            ?.let {
                                                UnnamedSchemaWithArrayParent4(
                                                    chatCompletionAudioObject = it,
                                                    _json = json,
                                                )
                                            },
                                        tryDeserialize(
                                                node,
                                                jacksonTypeRef<ChatCompletionDocumentObject>(),
                                            )
                                            ?.let {
                                                UnnamedSchemaWithArrayParent4(
                                                    chatCompletionDocumentObject = it,
                                                    _json = json,
                                                )
                                            },
                                        tryDeserialize(
                                                node,
                                                jacksonTypeRef<ChatCompletionVideoObject>(),
                                            )
                                            ?.let {
                                                UnnamedSchemaWithArrayParent4(
                                                    chatCompletionVideoObject = it,
                                                    _json = json,
                                                )
                                            },
                                        tryDeserialize(
                                                node,
                                                jacksonTypeRef<ChatCompletionFileObject>(),
                                            )
                                            ?.let {
                                                UnnamedSchemaWithArrayParent4(
                                                    chatCompletionFileObject = it,
                                                    _json = json,
                                                )
                                            },
                                    )
                                    .filterNotNull()
                                    .allMaxBy { it.validity() }
                                    .toList()
                            return when (bestMatches.size) {
                                // This can happen if what we're deserializing is completely
                                // incompatible with all the possible variants (e.g. deserializing
                                // from boolean).
                                0 -> UnnamedSchemaWithArrayParent4(_json = json)
                                1 -> bestMatches.single()
                                // If there's more than one match with the highest validity, then
                                // use the first completely valid match, or simply the first match
                                // if none are completely valid.
                                else ->
                                    bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                            }
                        }
                    }

                    internal class Serializer :
                        BaseSerializer<UnnamedSchemaWithArrayParent4>(
                            UnnamedSchemaWithArrayParent4::class
                        ) {

                        override fun serialize(
                            value: UnnamedSchemaWithArrayParent4,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.chatCompletionTextObject != null ->
                                    generator.writeObject(value.chatCompletionTextObject)
                                value.chatCompletionImageObject != null ->
                                    generator.writeObject(value.chatCompletionImageObject)
                                value.chatCompletionAudioObject != null ->
                                    generator.writeObject(value.chatCompletionAudioObject)
                                value.chatCompletionDocumentObject != null ->
                                    generator.writeObject(value.chatCompletionDocumentObject)
                                value.chatCompletionVideoObject != null ->
                                    generator.writeObject(value.chatCompletionVideoObject)
                                value.chatCompletionFileObject != null ->
                                    generator.writeObject(value.chatCompletionFileObject)
                                value._json != null -> generator.writeObject(value._json)
                                else ->
                                    throw IllegalStateException(
                                        "Invalid UnnamedSchemaWithArrayParent4"
                                    )
                            }
                        }
                    }

                    class ChatCompletionTextObject
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val text: JsonField<String>,
                        private val type: JsonValue,
                        private val cacheControl: JsonField<CacheControl>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("text")
                            @ExcludeMissing
                            text: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("type")
                            @ExcludeMissing
                            type: JsonValue = JsonMissing.of(),
                            @JsonProperty("cache_control")
                            @ExcludeMissing
                            cacheControl: JsonField<CacheControl> = JsonMissing.of(),
                        ) : this(text, type, cacheControl, mutableMapOf())

                        /**
                         * @throws HanzoInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun text(): String = text.getRequired("text")

                        /**
                         * Expected to always return the following:
                         * ```kotlin
                         * JsonValue.from("text")
                         * ```
                         *
                         * However, this method can be useful for debugging and logging (e.g. if the
                         * server responded with an unexpected value).
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                        /**
                         * @throws HanzoInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun cacheControl(): CacheControl? =
                            cacheControl.getNullable("cache_control")

                        /**
                         * Returns the raw JSON value of [text].
                         *
                         * Unlike [text], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                        /**
                         * Returns the raw JSON value of [cacheControl].
                         *
                         * Unlike [cacheControl], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("cache_control")
                        @ExcludeMissing
                        fun _cacheControl(): JsonField<CacheControl> = cacheControl

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
                             * Returns a mutable builder for constructing an instance of
                             * [ChatCompletionTextObject].
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .text()
                             * ```
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [ChatCompletionTextObject]. */
                        class Builder internal constructor() {

                            private var text: JsonField<String>? = null
                            private var type: JsonValue = JsonValue.from("text")
                            private var cacheControl: JsonField<CacheControl> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(chatCompletionTextObject: ChatCompletionTextObject) =
                                apply {
                                    text = chatCompletionTextObject.text
                                    type = chatCompletionTextObject.type
                                    cacheControl = chatCompletionTextObject.cacheControl
                                    additionalProperties =
                                        chatCompletionTextObject.additionalProperties.toMutableMap()
                                }

                            fun text(text: String) = text(JsonField.of(text))

                            /**
                             * Sets [Builder.text] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.text] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun text(text: JsonField<String>) = apply { this.text = text }

                            /**
                             * Sets the field to an arbitrary JSON value.
                             *
                             * It is usually unnecessary to call this method because the field
                             * defaults to the following:
                             * ```kotlin
                             * JsonValue.from("text")
                             * ```
                             *
                             * This method is primarily for setting the field to an undocumented or
                             * not yet supported value.
                             */
                            fun type(type: JsonValue) = apply { this.type = type }

                            fun cacheControl(cacheControl: CacheControl) =
                                cacheControl(JsonField.of(cacheControl))

                            /**
                             * Sets [Builder.cacheControl] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.cacheControl] with a well-typed
                             * [CacheControl] value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
                             */
                            fun cacheControl(cacheControl: JsonField<CacheControl>) = apply {
                                this.cacheControl = cacheControl
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [ChatCompletionTextObject].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .text()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): ChatCompletionTextObject =
                                ChatCompletionTextObject(
                                    checkRequired("text", text),
                                    type,
                                    cacheControl,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): ChatCompletionTextObject = apply {
                            if (validated) {
                                return@apply
                            }

                            text()
                            _type().let {
                                if (it != JsonValue.from("text")) {
                                    throw HanzoInvalidDataException(
                                        "'type' is invalid, received $it"
                                    )
                                }
                            }
                            cacheControl()?.validate()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            (if (text.asKnown() == null) 0 else 1) +
                                type.let { if (it == JsonValue.from("text")) 1 else 0 } +
                                (cacheControl.asKnown()?.validity() ?: 0)

                        class CacheControl
                        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                        private constructor(
                            private val type: JsonValue,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonValue = JsonMissing.of()
                            ) : this(type, mutableMapOf())

                            /**
                             * Expected to always return the following:
                             * ```kotlin
                             * JsonValue.from("ephemeral")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
                             */
                            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

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
                                 * Returns a mutable builder for constructing an instance of
                                 * [CacheControl].
                                 */
                                fun builder() = Builder()
                            }

                            /** A builder for [CacheControl]. */
                            class Builder internal constructor() {

                                private var type: JsonValue = JsonValue.from("ephemeral")
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(cacheControl: CacheControl) = apply {
                                    type = cacheControl.type
                                    additionalProperties =
                                        cacheControl.additionalProperties.toMutableMap()
                                }

                                /**
                                 * Sets the field to an arbitrary JSON value.
                                 *
                                 * It is usually unnecessary to call this method because the field
                                 * defaults to the following:
                                 * ```kotlin
                                 * JsonValue.from("ephemeral")
                                 * ```
                                 *
                                 * This method is primarily for setting the field to an undocumented
                                 * or not yet supported value.
                                 */
                                fun type(type: JsonValue) = apply { this.type = type }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [CacheControl].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 */
                                fun build(): CacheControl =
                                    CacheControl(type, additionalProperties.toMutableMap())
                            }

                            private var validated: Boolean = false

                            fun validate(): CacheControl = apply {
                                if (validated) {
                                    return@apply
                                }

                                _type().let {
                                    if (it != JsonValue.from("ephemeral")) {
                                        throw HanzoInvalidDataException(
                                            "'type' is invalid, received $it"
                                        )
                                    }
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                type.let { if (it == JsonValue.from("ephemeral")) 1 else 0 }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is CacheControl &&
                                    type == other.type &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy {
                                Objects.hash(type, additionalProperties)
                            }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "CacheControl{type=$type, additionalProperties=$additionalProperties}"
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ChatCompletionTextObject &&
                                text == other.text &&
                                type == other.type &&
                                cacheControl == other.cacheControl &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(text, type, cacheControl, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "ChatCompletionTextObject{text=$text, type=$type, cacheControl=$cacheControl, additionalProperties=$additionalProperties}"
                    }

                    class ChatCompletionImageObject
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val imageUrl: JsonField<ImageUrl>,
                        private val type: JsonValue,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("image_url")
                            @ExcludeMissing
                            imageUrl: JsonField<ImageUrl> = JsonMissing.of(),
                            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                        ) : this(imageUrl, type, mutableMapOf())

                        /**
                         * @throws HanzoInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun imageUrl(): ImageUrl = imageUrl.getRequired("image_url")

                        /**
                         * Expected to always return the following:
                         * ```kotlin
                         * JsonValue.from("image_url")
                         * ```
                         *
                         * However, this method can be useful for debugging and logging (e.g. if the
                         * server responded with an unexpected value).
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                        /**
                         * Returns the raw JSON value of [imageUrl].
                         *
                         * Unlike [imageUrl], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("image_url")
                        @ExcludeMissing
                        fun _imageUrl(): JsonField<ImageUrl> = imageUrl

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
                             * Returns a mutable builder for constructing an instance of
                             * [ChatCompletionImageObject].
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .imageUrl()
                             * ```
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [ChatCompletionImageObject]. */
                        class Builder internal constructor() {

                            private var imageUrl: JsonField<ImageUrl>? = null
                            private var type: JsonValue = JsonValue.from("image_url")
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(
                                chatCompletionImageObject: ChatCompletionImageObject
                            ) = apply {
                                imageUrl = chatCompletionImageObject.imageUrl
                                type = chatCompletionImageObject.type
                                additionalProperties =
                                    chatCompletionImageObject.additionalProperties.toMutableMap()
                            }

                            fun imageUrl(imageUrl: ImageUrl) = imageUrl(JsonField.of(imageUrl))

                            /**
                             * Sets [Builder.imageUrl] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.imageUrl] with a well-typed
                             * [ImageUrl] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun imageUrl(imageUrl: JsonField<ImageUrl>) = apply {
                                this.imageUrl = imageUrl
                            }

                            /** Alias for calling [imageUrl] with `ImageUrl.ofString(string)`. */
                            fun imageUrl(string: String) = imageUrl(ImageUrl.ofString(string))

                            /**
                             * Alias for calling [imageUrl] with
                             * `ImageUrl.ofChatCompletionImageUrlObject(chatCompletionImageUrlObject)`.
                             */
                            fun imageUrl(
                                chatCompletionImageUrlObject: ImageUrl.ChatCompletionImageUrlObject
                            ) =
                                imageUrl(
                                    ImageUrl.ofChatCompletionImageUrlObject(
                                        chatCompletionImageUrlObject
                                    )
                                )

                            /**
                             * Sets the field to an arbitrary JSON value.
                             *
                             * It is usually unnecessary to call this method because the field
                             * defaults to the following:
                             * ```kotlin
                             * JsonValue.from("image_url")
                             * ```
                             *
                             * This method is primarily for setting the field to an undocumented or
                             * not yet supported value.
                             */
                            fun type(type: JsonValue) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [ChatCompletionImageObject].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .imageUrl()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): ChatCompletionImageObject =
                                ChatCompletionImageObject(
                                    checkRequired("imageUrl", imageUrl),
                                    type,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): ChatCompletionImageObject = apply {
                            if (validated) {
                                return@apply
                            }

                            imageUrl().validate()
                            _type().let {
                                if (it != JsonValue.from("image_url")) {
                                    throw HanzoInvalidDataException(
                                        "'type' is invalid, received $it"
                                    )
                                }
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            (imageUrl.asKnown()?.validity() ?: 0) +
                                type.let { if (it == JsonValue.from("image_url")) 1 else 0 }

                        @JsonDeserialize(using = ImageUrl.Deserializer::class)
                        @JsonSerialize(using = ImageUrl.Serializer::class)
                        class ImageUrl
                        private constructor(
                            private val string: String? = null,
                            private val chatCompletionImageUrlObject:
                                ChatCompletionImageUrlObject? =
                                null,
                            private val _json: JsonValue? = null,
                        ) {

                            fun string(): String? = string

                            fun chatCompletionImageUrlObject(): ChatCompletionImageUrlObject? =
                                chatCompletionImageUrlObject

                            fun isString(): Boolean = string != null

                            fun isChatCompletionImageUrlObject(): Boolean =
                                chatCompletionImageUrlObject != null

                            fun asString(): String = string.getOrThrow("string")

                            fun asChatCompletionImageUrlObject(): ChatCompletionImageUrlObject =
                                chatCompletionImageUrlObject.getOrThrow(
                                    "chatCompletionImageUrlObject"
                                )

                            fun _json(): JsonValue? = _json

                            fun <T> accept(visitor: Visitor<T>): T =
                                when {
                                    string != null -> visitor.visitString(string)
                                    chatCompletionImageUrlObject != null ->
                                        visitor.visitChatCompletionImageUrlObject(
                                            chatCompletionImageUrlObject
                                        )
                                    else -> visitor.unknown(_json)
                                }

                            private var validated: Boolean = false

                            fun validate(): ImageUrl = apply {
                                if (validated) {
                                    return@apply
                                }

                                accept(
                                    object : Visitor<Unit> {
                                        override fun visitString(string: String) {}

                                        override fun visitChatCompletionImageUrlObject(
                                            chatCompletionImageUrlObject:
                                                ChatCompletionImageUrlObject
                                        ) {
                                            chatCompletionImageUrlObject.validate()
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                accept(
                                    object : Visitor<Int> {
                                        override fun visitString(string: String) = 1

                                        override fun visitChatCompletionImageUrlObject(
                                            chatCompletionImageUrlObject:
                                                ChatCompletionImageUrlObject
                                        ) = chatCompletionImageUrlObject.validity()

                                        override fun unknown(json: JsonValue?) = 0
                                    }
                                )

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is ImageUrl &&
                                    string == other.string &&
                                    chatCompletionImageUrlObject ==
                                        other.chatCompletionImageUrlObject
                            }

                            override fun hashCode(): Int =
                                Objects.hash(string, chatCompletionImageUrlObject)

                            override fun toString(): String =
                                when {
                                    string != null -> "ImageUrl{string=$string}"
                                    chatCompletionImageUrlObject != null ->
                                        "ImageUrl{chatCompletionImageUrlObject=$chatCompletionImageUrlObject}"
                                    _json != null -> "ImageUrl{_unknown=$_json}"
                                    else -> throw IllegalStateException("Invalid ImageUrl")
                                }

                            companion object {

                                fun ofString(string: String) = ImageUrl(string = string)

                                fun ofChatCompletionImageUrlObject(
                                    chatCompletionImageUrlObject: ChatCompletionImageUrlObject
                                ) =
                                    ImageUrl(
                                        chatCompletionImageUrlObject = chatCompletionImageUrlObject
                                    )
                            }

                            /**
                             * An interface that defines how to map each variant of [ImageUrl] to a
                             * value of type [T].
                             */
                            interface Visitor<out T> {

                                fun visitString(string: String): T

                                fun visitChatCompletionImageUrlObject(
                                    chatCompletionImageUrlObject: ChatCompletionImageUrlObject
                                ): T

                                /**
                                 * Maps an unknown variant of [ImageUrl] to a value of type [T].
                                 *
                                 * An instance of [ImageUrl] can contain an unknown variant if it
                                 * was deserialized from data that doesn't match any known variant.
                                 * For example, if the SDK is on an older version than the API, then
                                 * the API may respond with new variants that the SDK is unaware of.
                                 *
                                 * @throws HanzoInvalidDataException in the default implementation.
                                 */
                                fun unknown(json: JsonValue?): T {
                                    throw HanzoInvalidDataException("Unknown ImageUrl: $json")
                                }
                            }

                            internal class Deserializer :
                                BaseDeserializer<ImageUrl>(ImageUrl::class) {

                                override fun ObjectCodec.deserialize(node: JsonNode): ImageUrl {
                                    val json = JsonValue.fromJsonNode(node)

                                    val bestMatches =
                                        sequenceOf(
                                                tryDeserialize(
                                                        node,
                                                        jacksonTypeRef<
                                                            ChatCompletionImageUrlObject
                                                        >(),
                                                    )
                                                    ?.let {
                                                        ImageUrl(
                                                            chatCompletionImageUrlObject = it,
                                                            _json = json,
                                                        )
                                                    },
                                                tryDeserialize(node, jacksonTypeRef<String>())
                                                    ?.let { ImageUrl(string = it, _json = json) },
                                            )
                                            .filterNotNull()
                                            .allMaxBy { it.validity() }
                                            .toList()
                                    return when (bestMatches.size) {
                                        // This can happen if what we're deserializing is completely
                                        // incompatible with all the possible variants (e.g.
                                        // deserializing from boolean).
                                        0 -> ImageUrl(_json = json)
                                        1 -> bestMatches.single()
                                        // If there's more than one match with the highest validity,
                                        // then use the first completely valid match, or simply the
                                        // first match if none are completely valid.
                                        else ->
                                            bestMatches.firstOrNull { it.isValid() }
                                                ?: bestMatches.first()
                                    }
                                }
                            }

                            internal class Serializer : BaseSerializer<ImageUrl>(ImageUrl::class) {

                                override fun serialize(
                                    value: ImageUrl,
                                    generator: JsonGenerator,
                                    provider: SerializerProvider,
                                ) {
                                    when {
                                        value.string != null -> generator.writeObject(value.string)
                                        value.chatCompletionImageUrlObject != null ->
                                            generator.writeObject(
                                                value.chatCompletionImageUrlObject
                                            )
                                        value._json != null -> generator.writeObject(value._json)
                                        else -> throw IllegalStateException("Invalid ImageUrl")
                                    }
                                }
                            }

                            class ChatCompletionImageUrlObject
                            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                            private constructor(
                                private val url: JsonField<String>,
                                private val detail: JsonField<String>,
                                private val format: JsonField<String>,
                                private val additionalProperties: MutableMap<String, JsonValue>,
                            ) {

                                @JsonCreator
                                private constructor(
                                    @JsonProperty("url")
                                    @ExcludeMissing
                                    url: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("detail")
                                    @ExcludeMissing
                                    detail: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("format")
                                    @ExcludeMissing
                                    format: JsonField<String> = JsonMissing.of(),
                                ) : this(url, detail, format, mutableMapOf())

                                /**
                                 * @throws HanzoInvalidDataException if the JSON field has an
                                 *   unexpected type or is unexpectedly missing or null (e.g. if the
                                 *   server responded with an unexpected value).
                                 */
                                fun url(): String = url.getRequired("url")

                                /**
                                 * @throws HanzoInvalidDataException if the JSON field has an
                                 *   unexpected type (e.g. if the server responded with an
                                 *   unexpected value).
                                 */
                                fun detail(): String? = detail.getNullable("detail")

                                /**
                                 * @throws HanzoInvalidDataException if the JSON field has an
                                 *   unexpected type (e.g. if the server responded with an
                                 *   unexpected value).
                                 */
                                fun format(): String? = format.getNullable("format")

                                /**
                                 * Returns the raw JSON value of [url].
                                 *
                                 * Unlike [url], this method doesn't throw if the JSON field has an
                                 * unexpected type.
                                 */
                                @JsonProperty("url")
                                @ExcludeMissing
                                fun _url(): JsonField<String> = url

                                /**
                                 * Returns the raw JSON value of [detail].
                                 *
                                 * Unlike [detail], this method doesn't throw if the JSON field has
                                 * an unexpected type.
                                 */
                                @JsonProperty("detail")
                                @ExcludeMissing
                                fun _detail(): JsonField<String> = detail

                                /**
                                 * Returns the raw JSON value of [format].
                                 *
                                 * Unlike [format], this method doesn't throw if the JSON field has
                                 * an unexpected type.
                                 */
                                @JsonProperty("format")
                                @ExcludeMissing
                                fun _format(): JsonField<String> = format

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
                                     * Returns a mutable builder for constructing an instance of
                                     * [ChatCompletionImageUrlObject].
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .url()
                                     * ```
                                     */
                                    fun builder() = Builder()
                                }

                                /** A builder for [ChatCompletionImageUrlObject]. */
                                class Builder internal constructor() {

                                    private var url: JsonField<String>? = null
                                    private var detail: JsonField<String> = JsonMissing.of()
                                    private var format: JsonField<String> = JsonMissing.of()
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    internal fun from(
                                        chatCompletionImageUrlObject: ChatCompletionImageUrlObject
                                    ) = apply {
                                        url = chatCompletionImageUrlObject.url
                                        detail = chatCompletionImageUrlObject.detail
                                        format = chatCompletionImageUrlObject.format
                                        additionalProperties =
                                            chatCompletionImageUrlObject.additionalProperties
                                                .toMutableMap()
                                    }

                                    fun url(url: String) = url(JsonField.of(url))

                                    /**
                                     * Sets [Builder.url] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.url] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun url(url: JsonField<String>) = apply { this.url = url }

                                    fun detail(detail: String) = detail(JsonField.of(detail))

                                    /**
                                     * Sets [Builder.detail] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.detail] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun detail(detail: JsonField<String>) = apply {
                                        this.detail = detail
                                    }

                                    fun format(format: String) = format(JsonField.of(format))

                                    /**
                                     * Sets [Builder.format] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.format] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun format(format: JsonField<String>) = apply {
                                        this.format = format
                                    }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of
                                     * [ChatCompletionImageUrlObject].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .url()
                                     * ```
                                     *
                                     * @throws IllegalStateException if any required field is unset.
                                     */
                                    fun build(): ChatCompletionImageUrlObject =
                                        ChatCompletionImageUrlObject(
                                            checkRequired("url", url),
                                            detail,
                                            format,
                                            additionalProperties.toMutableMap(),
                                        )
                                }

                                private var validated: Boolean = false

                                fun validate(): ChatCompletionImageUrlObject = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    url()
                                    detail()
                                    format()
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    (if (url.asKnown() == null) 0 else 1) +
                                        (if (detail.asKnown() == null) 0 else 1) +
                                        (if (format.asKnown() == null) 0 else 1)

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is ChatCompletionImageUrlObject &&
                                        url == other.url &&
                                        detail == other.detail &&
                                        format == other.format &&
                                        additionalProperties == other.additionalProperties
                                }

                                private val hashCode: Int by lazy {
                                    Objects.hash(url, detail, format, additionalProperties)
                                }

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "ChatCompletionImageUrlObject{url=$url, detail=$detail, format=$format, additionalProperties=$additionalProperties}"
                            }
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ChatCompletionImageObject &&
                                imageUrl == other.imageUrl &&
                                type == other.type &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(imageUrl, type, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "ChatCompletionImageObject{imageUrl=$imageUrl, type=$type, additionalProperties=$additionalProperties}"
                    }

                    class ChatCompletionAudioObject
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val inputAudio: JsonField<InputAudio>,
                        private val type: JsonValue,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("input_audio")
                            @ExcludeMissing
                            inputAudio: JsonField<InputAudio> = JsonMissing.of(),
                            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                        ) : this(inputAudio, type, mutableMapOf())

                        /**
                         * @throws HanzoInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun inputAudio(): InputAudio = inputAudio.getRequired("input_audio")

                        /**
                         * Expected to always return the following:
                         * ```kotlin
                         * JsonValue.from("input_audio")
                         * ```
                         *
                         * However, this method can be useful for debugging and logging (e.g. if the
                         * server responded with an unexpected value).
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                        /**
                         * Returns the raw JSON value of [inputAudio].
                         *
                         * Unlike [inputAudio], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("input_audio")
                        @ExcludeMissing
                        fun _inputAudio(): JsonField<InputAudio> = inputAudio

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
                             * Returns a mutable builder for constructing an instance of
                             * [ChatCompletionAudioObject].
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .inputAudio()
                             * ```
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [ChatCompletionAudioObject]. */
                        class Builder internal constructor() {

                            private var inputAudio: JsonField<InputAudio>? = null
                            private var type: JsonValue = JsonValue.from("input_audio")
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(
                                chatCompletionAudioObject: ChatCompletionAudioObject
                            ) = apply {
                                inputAudio = chatCompletionAudioObject.inputAudio
                                type = chatCompletionAudioObject.type
                                additionalProperties =
                                    chatCompletionAudioObject.additionalProperties.toMutableMap()
                            }

                            fun inputAudio(inputAudio: InputAudio) =
                                inputAudio(JsonField.of(inputAudio))

                            /**
                             * Sets [Builder.inputAudio] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.inputAudio] with a well-typed
                             * [InputAudio] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun inputAudio(inputAudio: JsonField<InputAudio>) = apply {
                                this.inputAudio = inputAudio
                            }

                            /**
                             * Sets the field to an arbitrary JSON value.
                             *
                             * It is usually unnecessary to call this method because the field
                             * defaults to the following:
                             * ```kotlin
                             * JsonValue.from("input_audio")
                             * ```
                             *
                             * This method is primarily for setting the field to an undocumented or
                             * not yet supported value.
                             */
                            fun type(type: JsonValue) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [ChatCompletionAudioObject].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .inputAudio()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): ChatCompletionAudioObject =
                                ChatCompletionAudioObject(
                                    checkRequired("inputAudio", inputAudio),
                                    type,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): ChatCompletionAudioObject = apply {
                            if (validated) {
                                return@apply
                            }

                            inputAudio().validate()
                            _type().let {
                                if (it != JsonValue.from("input_audio")) {
                                    throw HanzoInvalidDataException(
                                        "'type' is invalid, received $it"
                                    )
                                }
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            (inputAudio.asKnown()?.validity() ?: 0) +
                                type.let { if (it == JsonValue.from("input_audio")) 1 else 0 }

                        class InputAudio
                        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                        private constructor(
                            private val data: JsonField<String>,
                            private val format: JsonField<Format>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("data")
                                @ExcludeMissing
                                data: JsonField<String> = JsonMissing.of(),
                                @JsonProperty("format")
                                @ExcludeMissing
                                format: JsonField<Format> = JsonMissing.of(),
                            ) : this(data, format, mutableMapOf())

                            /**
                             * @throws HanzoInvalidDataException if the JSON field has an unexpected
                             *   type or is unexpectedly missing or null (e.g. if the server
                             *   responded with an unexpected value).
                             */
                            fun data(): String = data.getRequired("data")

                            /**
                             * @throws HanzoInvalidDataException if the JSON field has an unexpected
                             *   type or is unexpectedly missing or null (e.g. if the server
                             *   responded with an unexpected value).
                             */
                            fun format(): Format = format.getRequired("format")

                            /**
                             * Returns the raw JSON value of [data].
                             *
                             * Unlike [data], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("data")
                            @ExcludeMissing
                            fun _data(): JsonField<String> = data

                            /**
                             * Returns the raw JSON value of [format].
                             *
                             * Unlike [format], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("format")
                            @ExcludeMissing
                            fun _format(): JsonField<Format> = format

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
                                 * Returns a mutable builder for constructing an instance of
                                 * [InputAudio].
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .data()
                                 * .format()
                                 * ```
                                 */
                                fun builder() = Builder()
                            }

                            /** A builder for [InputAudio]. */
                            class Builder internal constructor() {

                                private var data: JsonField<String>? = null
                                private var format: JsonField<Format>? = null
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(inputAudio: InputAudio) = apply {
                                    data = inputAudio.data
                                    format = inputAudio.format
                                    additionalProperties =
                                        inputAudio.additionalProperties.toMutableMap()
                                }

                                fun data(data: String) = data(JsonField.of(data))

                                /**
                                 * Sets [Builder.data] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.data] with a well-typed [String]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun data(data: JsonField<String>) = apply { this.data = data }

                                fun format(format: Format) = format(JsonField.of(format))

                                /**
                                 * Sets [Builder.format] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.format] with a well-typed
                                 * [Format] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun format(format: JsonField<Format>) = apply {
                                    this.format = format
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [InputAudio].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .data()
                                 * .format()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): InputAudio =
                                    InputAudio(
                                        checkRequired("data", data),
                                        checkRequired("format", format),
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            fun validate(): InputAudio = apply {
                                if (validated) {
                                    return@apply
                                }

                                data()
                                format().validate()
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                (if (data.asKnown() == null) 0 else 1) +
                                    (format.asKnown()?.validity() ?: 0)

                            class Format
                            @JsonCreator
                            private constructor(private val value: JsonField<String>) : Enum {

                                /**
                                 * Returns this class instance's raw value.
                                 *
                                 * This is usually only useful if this instance was deserialized
                                 * from data that doesn't match any known member, and you want to
                                 * know that value. For example, if the SDK is on an older version
                                 * than the API, then the API may respond with new members that the
                                 * SDK is unaware of.
                                 */
                                @com.fasterxml.jackson.annotation.JsonValue
                                fun _value(): JsonField<String> = value

                                companion object {

                                    val WAV = of("wav")

                                    val MP3 = of("mp3")

                                    fun of(value: String) = Format(JsonField.of(value))
                                }

                                /** An enum containing [Format]'s known values. */
                                enum class Known {
                                    WAV,
                                    MP3,
                                }

                                /**
                                 * An enum containing [Format]'s known values, as well as an
                                 * [_UNKNOWN] member.
                                 *
                                 * An instance of [Format] can contain an unknown value in a couple
                                 * of cases:
                                 * - It was deserialized from data that doesn't match any known
                                 *   member. For example, if the SDK is on an older version than the
                                 *   API, then the API may respond with new members that the SDK is
                                 *   unaware of.
                                 * - It was constructed with an arbitrary value using the [of]
                                 *   method.
                                 */
                                enum class Value {
                                    WAV,
                                    MP3,
                                    /**
                                     * An enum member indicating that [Format] was instantiated with
                                     * an unknown value.
                                     */
                                    _UNKNOWN,
                                }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value, or [Value._UNKNOWN] if the class was instantiated with an
                                 * unknown value.
                                 *
                                 * Use the [known] method instead if you're certain the value is
                                 * always known or if you want to throw for the unknown case.
                                 */
                                fun value(): Value =
                                    when (this) {
                                        WAV -> Value.WAV
                                        MP3 -> Value.MP3
                                        else -> Value._UNKNOWN
                                    }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value.
                                 *
                                 * Use the [value] method instead if you're uncertain the value is
                                 * always known and don't want to throw for the unknown case.
                                 *
                                 * @throws HanzoInvalidDataException if this class instance's value
                                 *   is a not a known member.
                                 */
                                fun known(): Known =
                                    when (this) {
                                        WAV -> Known.WAV
                                        MP3 -> Known.MP3
                                        else ->
                                            throw HanzoInvalidDataException(
                                                "Unknown Format: $value"
                                            )
                                    }

                                /**
                                 * Returns this class instance's primitive wire representation.
                                 *
                                 * This differs from the [toString] method because that method is
                                 * primarily for debugging and generally doesn't throw.
                                 *
                                 * @throws HanzoInvalidDataException if this class instance's value
                                 *   does not have the expected primitive type.
                                 */
                                fun asString(): String =
                                    _value().asString()
                                        ?: throw HanzoInvalidDataException("Value is not a String")

                                private var validated: Boolean = false

                                fun validate(): Format = apply {
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    if (value() == Value._UNKNOWN) 0 else 1

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Format && value == other.value
                                }

                                override fun hashCode() = value.hashCode()

                                override fun toString() = value.toString()
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is InputAudio &&
                                    data == other.data &&
                                    format == other.format &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy {
                                Objects.hash(data, format, additionalProperties)
                            }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "InputAudio{data=$data, format=$format, additionalProperties=$additionalProperties}"
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ChatCompletionAudioObject &&
                                inputAudio == other.inputAudio &&
                                type == other.type &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(inputAudio, type, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "ChatCompletionAudioObject{inputAudio=$inputAudio, type=$type, additionalProperties=$additionalProperties}"
                    }

                    class ChatCompletionDocumentObject
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val citations: JsonField<Citations>,
                        private val context: JsonField<String>,
                        private val source: JsonField<Source>,
                        private val title: JsonField<String>,
                        private val type: JsonValue,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("citations")
                            @ExcludeMissing
                            citations: JsonField<Citations> = JsonMissing.of(),
                            @JsonProperty("context")
                            @ExcludeMissing
                            context: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("source")
                            @ExcludeMissing
                            source: JsonField<Source> = JsonMissing.of(),
                            @JsonProperty("title")
                            @ExcludeMissing
                            title: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                        ) : this(citations, context, source, title, type, mutableMapOf())

                        /**
                         * @throws HanzoInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun citations(): Citations? = citations.getNullable("citations")

                        /**
                         * @throws HanzoInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun context(): String = context.getRequired("context")

                        /**
                         * @throws HanzoInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun source(): Source = source.getRequired("source")

                        /**
                         * @throws HanzoInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun title(): String = title.getRequired("title")

                        /**
                         * Expected to always return the following:
                         * ```kotlin
                         * JsonValue.from("document")
                         * ```
                         *
                         * However, this method can be useful for debugging and logging (e.g. if the
                         * server responded with an unexpected value).
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                        /**
                         * Returns the raw JSON value of [citations].
                         *
                         * Unlike [citations], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("citations")
                        @ExcludeMissing
                        fun _citations(): JsonField<Citations> = citations

                        /**
                         * Returns the raw JSON value of [context].
                         *
                         * Unlike [context], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("context")
                        @ExcludeMissing
                        fun _context(): JsonField<String> = context

                        /**
                         * Returns the raw JSON value of [source].
                         *
                         * Unlike [source], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("source")
                        @ExcludeMissing
                        fun _source(): JsonField<Source> = source

                        /**
                         * Returns the raw JSON value of [title].
                         *
                         * Unlike [title], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("title")
                        @ExcludeMissing
                        fun _title(): JsonField<String> = title

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
                             * Returns a mutable builder for constructing an instance of
                             * [ChatCompletionDocumentObject].
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .citations()
                             * .context()
                             * .source()
                             * .title()
                             * ```
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [ChatCompletionDocumentObject]. */
                        class Builder internal constructor() {

                            private var citations: JsonField<Citations>? = null
                            private var context: JsonField<String>? = null
                            private var source: JsonField<Source>? = null
                            private var title: JsonField<String>? = null
                            private var type: JsonValue = JsonValue.from("document")
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(
                                chatCompletionDocumentObject: ChatCompletionDocumentObject
                            ) = apply {
                                citations = chatCompletionDocumentObject.citations
                                context = chatCompletionDocumentObject.context
                                source = chatCompletionDocumentObject.source
                                title = chatCompletionDocumentObject.title
                                type = chatCompletionDocumentObject.type
                                additionalProperties =
                                    chatCompletionDocumentObject.additionalProperties.toMutableMap()
                            }

                            fun citations(citations: Citations?) =
                                citations(JsonField.ofNullable(citations))

                            /**
                             * Sets [Builder.citations] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.citations] with a well-typed
                             * [Citations] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun citations(citations: JsonField<Citations>) = apply {
                                this.citations = citations
                            }

                            fun context(context: String) = context(JsonField.of(context))

                            /**
                             * Sets [Builder.context] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.context] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun context(context: JsonField<String>) = apply {
                                this.context = context
                            }

                            fun source(source: Source) = source(JsonField.of(source))

                            /**
                             * Sets [Builder.source] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.source] with a well-typed [Source]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun source(source: JsonField<Source>) = apply { this.source = source }

                            fun title(title: String) = title(JsonField.of(title))

                            /**
                             * Sets [Builder.title] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.title] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun title(title: JsonField<String>) = apply { this.title = title }

                            /**
                             * Sets the field to an arbitrary JSON value.
                             *
                             * It is usually unnecessary to call this method because the field
                             * defaults to the following:
                             * ```kotlin
                             * JsonValue.from("document")
                             * ```
                             *
                             * This method is primarily for setting the field to an undocumented or
                             * not yet supported value.
                             */
                            fun type(type: JsonValue) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [ChatCompletionDocumentObject].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .citations()
                             * .context()
                             * .source()
                             * .title()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): ChatCompletionDocumentObject =
                                ChatCompletionDocumentObject(
                                    checkRequired("citations", citations),
                                    checkRequired("context", context),
                                    checkRequired("source", source),
                                    checkRequired("title", title),
                                    type,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): ChatCompletionDocumentObject = apply {
                            if (validated) {
                                return@apply
                            }

                            citations()?.validate()
                            context()
                            source().validate()
                            title()
                            _type().let {
                                if (it != JsonValue.from("document")) {
                                    throw HanzoInvalidDataException(
                                        "'type' is invalid, received $it"
                                    )
                                }
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            (citations.asKnown()?.validity() ?: 0) +
                                (if (context.asKnown() == null) 0 else 1) +
                                (source.asKnown()?.validity() ?: 0) +
                                (if (title.asKnown() == null) 0 else 1) +
                                type.let { if (it == JsonValue.from("document")) 1 else 0 }

                        class Citations
                        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                        private constructor(
                            private val enabled: JsonField<Boolean>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("enabled")
                                @ExcludeMissing
                                enabled: JsonField<Boolean> = JsonMissing.of()
                            ) : this(enabled, mutableMapOf())

                            /**
                             * @throws HanzoInvalidDataException if the JSON field has an unexpected
                             *   type or is unexpectedly missing or null (e.g. if the server
                             *   responded with an unexpected value).
                             */
                            fun enabled(): Boolean = enabled.getRequired("enabled")

                            /**
                             * Returns the raw JSON value of [enabled].
                             *
                             * Unlike [enabled], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("enabled")
                            @ExcludeMissing
                            fun _enabled(): JsonField<Boolean> = enabled

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
                                 * Returns a mutable builder for constructing an instance of
                                 * [Citations].
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .enabled()
                                 * ```
                                 */
                                fun builder() = Builder()
                            }

                            /** A builder for [Citations]. */
                            class Builder internal constructor() {

                                private var enabled: JsonField<Boolean>? = null
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(citations: Citations) = apply {
                                    enabled = citations.enabled
                                    additionalProperties =
                                        citations.additionalProperties.toMutableMap()
                                }

                                fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

                                /**
                                 * Sets [Builder.enabled] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.enabled] with a well-typed
                                 * [Boolean] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun enabled(enabled: JsonField<Boolean>) = apply {
                                    this.enabled = enabled
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [Citations].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .enabled()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): Citations =
                                    Citations(
                                        checkRequired("enabled", enabled),
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            fun validate(): Citations = apply {
                                if (validated) {
                                    return@apply
                                }

                                enabled()
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int = (if (enabled.asKnown() == null) 0 else 1)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Citations &&
                                    enabled == other.enabled &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy {
                                Objects.hash(enabled, additionalProperties)
                            }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "Citations{enabled=$enabled, additionalProperties=$additionalProperties}"
                        }

                        class Source
                        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                        private constructor(
                            private val data: JsonField<String>,
                            private val mediaType: JsonField<String>,
                            private val type: JsonValue,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("data")
                                @ExcludeMissing
                                data: JsonField<String> = JsonMissing.of(),
                                @JsonProperty("media_type")
                                @ExcludeMissing
                                mediaType: JsonField<String> = JsonMissing.of(),
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonValue = JsonMissing.of(),
                            ) : this(data, mediaType, type, mutableMapOf())

                            /**
                             * @throws HanzoInvalidDataException if the JSON field has an unexpected
                             *   type or is unexpectedly missing or null (e.g. if the server
                             *   responded with an unexpected value).
                             */
                            fun data(): String = data.getRequired("data")

                            /**
                             * @throws HanzoInvalidDataException if the JSON field has an unexpected
                             *   type or is unexpectedly missing or null (e.g. if the server
                             *   responded with an unexpected value).
                             */
                            fun mediaType(): String = mediaType.getRequired("media_type")

                            /**
                             * Expected to always return the following:
                             * ```kotlin
                             * JsonValue.from("text")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
                             */
                            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                            /**
                             * Returns the raw JSON value of [data].
                             *
                             * Unlike [data], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("data")
                            @ExcludeMissing
                            fun _data(): JsonField<String> = data

                            /**
                             * Returns the raw JSON value of [mediaType].
                             *
                             * Unlike [mediaType], this method doesn't throw if the JSON field has
                             * an unexpected type.
                             */
                            @JsonProperty("media_type")
                            @ExcludeMissing
                            fun _mediaType(): JsonField<String> = mediaType

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
                                 * Returns a mutable builder for constructing an instance of
                                 * [Source].
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .data()
                                 * .mediaType()
                                 * ```
                                 */
                                fun builder() = Builder()
                            }

                            /** A builder for [Source]. */
                            class Builder internal constructor() {

                                private var data: JsonField<String>? = null
                                private var mediaType: JsonField<String>? = null
                                private var type: JsonValue = JsonValue.from("text")
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(source: Source) = apply {
                                    data = source.data
                                    mediaType = source.mediaType
                                    type = source.type
                                    additionalProperties =
                                        source.additionalProperties.toMutableMap()
                                }

                                fun data(data: String) = data(JsonField.of(data))

                                /**
                                 * Sets [Builder.data] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.data] with a well-typed [String]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun data(data: JsonField<String>) = apply { this.data = data }

                                fun mediaType(mediaType: String) =
                                    mediaType(JsonField.of(mediaType))

                                /**
                                 * Sets [Builder.mediaType] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.mediaType] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun mediaType(mediaType: JsonField<String>) = apply {
                                    this.mediaType = mediaType
                                }

                                /**
                                 * Sets the field to an arbitrary JSON value.
                                 *
                                 * It is usually unnecessary to call this method because the field
                                 * defaults to the following:
                                 * ```kotlin
                                 * JsonValue.from("text")
                                 * ```
                                 *
                                 * This method is primarily for setting the field to an undocumented
                                 * or not yet supported value.
                                 */
                                fun type(type: JsonValue) = apply { this.type = type }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [Source].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```kotlin
                                 * .data()
                                 * .mediaType()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): Source =
                                    Source(
                                        checkRequired("data", data),
                                        checkRequired("mediaType", mediaType),
                                        type,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            fun validate(): Source = apply {
                                if (validated) {
                                    return@apply
                                }

                                data()
                                mediaType()
                                _type().let {
                                    if (it != JsonValue.from("text")) {
                                        throw HanzoInvalidDataException(
                                            "'type' is invalid, received $it"
                                        )
                                    }
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                (if (data.asKnown() == null) 0 else 1) +
                                    (if (mediaType.asKnown() == null) 0 else 1) +
                                    type.let { if (it == JsonValue.from("text")) 1 else 0 }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Source &&
                                    data == other.data &&
                                    mediaType == other.mediaType &&
                                    type == other.type &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy {
                                Objects.hash(data, mediaType, type, additionalProperties)
                            }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "Source{data=$data, mediaType=$mediaType, type=$type, additionalProperties=$additionalProperties}"
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ChatCompletionDocumentObject &&
                                citations == other.citations &&
                                context == other.context &&
                                source == other.source &&
                                title == other.title &&
                                type == other.type &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(
                                citations,
                                context,
                                source,
                                title,
                                type,
                                additionalProperties,
                            )
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "ChatCompletionDocumentObject{citations=$citations, context=$context, source=$source, title=$title, type=$type, additionalProperties=$additionalProperties}"
                    }

                    class ChatCompletionVideoObject
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val type: JsonValue,
                        private val videoUrl: JsonField<VideoUrl>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("type")
                            @ExcludeMissing
                            type: JsonValue = JsonMissing.of(),
                            @JsonProperty("video_url")
                            @ExcludeMissing
                            videoUrl: JsonField<VideoUrl> = JsonMissing.of(),
                        ) : this(type, videoUrl, mutableMapOf())

                        /**
                         * Expected to always return the following:
                         * ```kotlin
                         * JsonValue.from("video_url")
                         * ```
                         *
                         * However, this method can be useful for debugging and logging (e.g. if the
                         * server responded with an unexpected value).
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                        /**
                         * @throws HanzoInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun videoUrl(): VideoUrl = videoUrl.getRequired("video_url")

                        /**
                         * Returns the raw JSON value of [videoUrl].
                         *
                         * Unlike [videoUrl], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("video_url")
                        @ExcludeMissing
                        fun _videoUrl(): JsonField<VideoUrl> = videoUrl

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
                             * Returns a mutable builder for constructing an instance of
                             * [ChatCompletionVideoObject].
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .videoUrl()
                             * ```
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [ChatCompletionVideoObject]. */
                        class Builder internal constructor() {

                            private var type: JsonValue = JsonValue.from("video_url")
                            private var videoUrl: JsonField<VideoUrl>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(
                                chatCompletionVideoObject: ChatCompletionVideoObject
                            ) = apply {
                                type = chatCompletionVideoObject.type
                                videoUrl = chatCompletionVideoObject.videoUrl
                                additionalProperties =
                                    chatCompletionVideoObject.additionalProperties.toMutableMap()
                            }

                            /**
                             * Sets the field to an arbitrary JSON value.
                             *
                             * It is usually unnecessary to call this method because the field
                             * defaults to the following:
                             * ```kotlin
                             * JsonValue.from("video_url")
                             * ```
                             *
                             * This method is primarily for setting the field to an undocumented or
                             * not yet supported value.
                             */
                            fun type(type: JsonValue) = apply { this.type = type }

                            fun videoUrl(videoUrl: VideoUrl) = videoUrl(JsonField.of(videoUrl))

                            /**
                             * Sets [Builder.videoUrl] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.videoUrl] with a well-typed
                             * [VideoUrl] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun videoUrl(videoUrl: JsonField<VideoUrl>) = apply {
                                this.videoUrl = videoUrl
                            }

                            /** Alias for calling [videoUrl] with `VideoUrl.ofString(string)`. */
                            fun videoUrl(string: String) = videoUrl(VideoUrl.ofString(string))

                            /**
                             * Alias for calling [videoUrl] with
                             * `VideoUrl.ofChatCompletionVideoUrlObject(chatCompletionVideoUrlObject)`.
                             */
                            fun videoUrl(
                                chatCompletionVideoUrlObject: VideoUrl.ChatCompletionVideoUrlObject
                            ) =
                                videoUrl(
                                    VideoUrl.ofChatCompletionVideoUrlObject(
                                        chatCompletionVideoUrlObject
                                    )
                                )

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [ChatCompletionVideoObject].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .videoUrl()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): ChatCompletionVideoObject =
                                ChatCompletionVideoObject(
                                    type,
                                    checkRequired("videoUrl", videoUrl),
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): ChatCompletionVideoObject = apply {
                            if (validated) {
                                return@apply
                            }

                            _type().let {
                                if (it != JsonValue.from("video_url")) {
                                    throw HanzoInvalidDataException(
                                        "'type' is invalid, received $it"
                                    )
                                }
                            }
                            videoUrl().validate()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            type.let { if (it == JsonValue.from("video_url")) 1 else 0 } +
                                (videoUrl.asKnown()?.validity() ?: 0)

                        @JsonDeserialize(using = VideoUrl.Deserializer::class)
                        @JsonSerialize(using = VideoUrl.Serializer::class)
                        class VideoUrl
                        private constructor(
                            private val string: String? = null,
                            private val chatCompletionVideoUrlObject:
                                ChatCompletionVideoUrlObject? =
                                null,
                            private val _json: JsonValue? = null,
                        ) {

                            fun string(): String? = string

                            fun chatCompletionVideoUrlObject(): ChatCompletionVideoUrlObject? =
                                chatCompletionVideoUrlObject

                            fun isString(): Boolean = string != null

                            fun isChatCompletionVideoUrlObject(): Boolean =
                                chatCompletionVideoUrlObject != null

                            fun asString(): String = string.getOrThrow("string")

                            fun asChatCompletionVideoUrlObject(): ChatCompletionVideoUrlObject =
                                chatCompletionVideoUrlObject.getOrThrow(
                                    "chatCompletionVideoUrlObject"
                                )

                            fun _json(): JsonValue? = _json

                            fun <T> accept(visitor: Visitor<T>): T =
                                when {
                                    string != null -> visitor.visitString(string)
                                    chatCompletionVideoUrlObject != null ->
                                        visitor.visitChatCompletionVideoUrlObject(
                                            chatCompletionVideoUrlObject
                                        )
                                    else -> visitor.unknown(_json)
                                }

                            private var validated: Boolean = false

                            fun validate(): VideoUrl = apply {
                                if (validated) {
                                    return@apply
                                }

                                accept(
                                    object : Visitor<Unit> {
                                        override fun visitString(string: String) {}

                                        override fun visitChatCompletionVideoUrlObject(
                                            chatCompletionVideoUrlObject:
                                                ChatCompletionVideoUrlObject
                                        ) {
                                            chatCompletionVideoUrlObject.validate()
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                accept(
                                    object : Visitor<Int> {
                                        override fun visitString(string: String) = 1

                                        override fun visitChatCompletionVideoUrlObject(
                                            chatCompletionVideoUrlObject:
                                                ChatCompletionVideoUrlObject
                                        ) = chatCompletionVideoUrlObject.validity()

                                        override fun unknown(json: JsonValue?) = 0
                                    }
                                )

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is VideoUrl &&
                                    string == other.string &&
                                    chatCompletionVideoUrlObject ==
                                        other.chatCompletionVideoUrlObject
                            }

                            override fun hashCode(): Int =
                                Objects.hash(string, chatCompletionVideoUrlObject)

                            override fun toString(): String =
                                when {
                                    string != null -> "VideoUrl{string=$string}"
                                    chatCompletionVideoUrlObject != null ->
                                        "VideoUrl{chatCompletionVideoUrlObject=$chatCompletionVideoUrlObject}"
                                    _json != null -> "VideoUrl{_unknown=$_json}"
                                    else -> throw IllegalStateException("Invalid VideoUrl")
                                }

                            companion object {

                                fun ofString(string: String) = VideoUrl(string = string)

                                fun ofChatCompletionVideoUrlObject(
                                    chatCompletionVideoUrlObject: ChatCompletionVideoUrlObject
                                ) =
                                    VideoUrl(
                                        chatCompletionVideoUrlObject = chatCompletionVideoUrlObject
                                    )
                            }

                            /**
                             * An interface that defines how to map each variant of [VideoUrl] to a
                             * value of type [T].
                             */
                            interface Visitor<out T> {

                                fun visitString(string: String): T

                                fun visitChatCompletionVideoUrlObject(
                                    chatCompletionVideoUrlObject: ChatCompletionVideoUrlObject
                                ): T

                                /**
                                 * Maps an unknown variant of [VideoUrl] to a value of type [T].
                                 *
                                 * An instance of [VideoUrl] can contain an unknown variant if it
                                 * was deserialized from data that doesn't match any known variant.
                                 * For example, if the SDK is on an older version than the API, then
                                 * the API may respond with new variants that the SDK is unaware of.
                                 *
                                 * @throws HanzoInvalidDataException in the default implementation.
                                 */
                                fun unknown(json: JsonValue?): T {
                                    throw HanzoInvalidDataException("Unknown VideoUrl: $json")
                                }
                            }

                            internal class Deserializer :
                                BaseDeserializer<VideoUrl>(VideoUrl::class) {

                                override fun ObjectCodec.deserialize(node: JsonNode): VideoUrl {
                                    val json = JsonValue.fromJsonNode(node)

                                    val bestMatches =
                                        sequenceOf(
                                                tryDeserialize(
                                                        node,
                                                        jacksonTypeRef<
                                                            ChatCompletionVideoUrlObject
                                                        >(),
                                                    )
                                                    ?.let {
                                                        VideoUrl(
                                                            chatCompletionVideoUrlObject = it,
                                                            _json = json,
                                                        )
                                                    },
                                                tryDeserialize(node, jacksonTypeRef<String>())
                                                    ?.let { VideoUrl(string = it, _json = json) },
                                            )
                                            .filterNotNull()
                                            .allMaxBy { it.validity() }
                                            .toList()
                                    return when (bestMatches.size) {
                                        // This can happen if what we're deserializing is completely
                                        // incompatible with all the possible variants (e.g.
                                        // deserializing from boolean).
                                        0 -> VideoUrl(_json = json)
                                        1 -> bestMatches.single()
                                        // If there's more than one match with the highest validity,
                                        // then use the first completely valid match, or simply the
                                        // first match if none are completely valid.
                                        else ->
                                            bestMatches.firstOrNull { it.isValid() }
                                                ?: bestMatches.first()
                                    }
                                }
                            }

                            internal class Serializer : BaseSerializer<VideoUrl>(VideoUrl::class) {

                                override fun serialize(
                                    value: VideoUrl,
                                    generator: JsonGenerator,
                                    provider: SerializerProvider,
                                ) {
                                    when {
                                        value.string != null -> generator.writeObject(value.string)
                                        value.chatCompletionVideoUrlObject != null ->
                                            generator.writeObject(
                                                value.chatCompletionVideoUrlObject
                                            )
                                        value._json != null -> generator.writeObject(value._json)
                                        else -> throw IllegalStateException("Invalid VideoUrl")
                                    }
                                }
                            }

                            class ChatCompletionVideoUrlObject
                            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                            private constructor(
                                private val url: JsonField<String>,
                                private val detail: JsonField<String>,
                                private val additionalProperties: MutableMap<String, JsonValue>,
                            ) {

                                @JsonCreator
                                private constructor(
                                    @JsonProperty("url")
                                    @ExcludeMissing
                                    url: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("detail")
                                    @ExcludeMissing
                                    detail: JsonField<String> = JsonMissing.of(),
                                ) : this(url, detail, mutableMapOf())

                                /**
                                 * @throws HanzoInvalidDataException if the JSON field has an
                                 *   unexpected type or is unexpectedly missing or null (e.g. if the
                                 *   server responded with an unexpected value).
                                 */
                                fun url(): String = url.getRequired("url")

                                /**
                                 * @throws HanzoInvalidDataException if the JSON field has an
                                 *   unexpected type (e.g. if the server responded with an
                                 *   unexpected value).
                                 */
                                fun detail(): String? = detail.getNullable("detail")

                                /**
                                 * Returns the raw JSON value of [url].
                                 *
                                 * Unlike [url], this method doesn't throw if the JSON field has an
                                 * unexpected type.
                                 */
                                @JsonProperty("url")
                                @ExcludeMissing
                                fun _url(): JsonField<String> = url

                                /**
                                 * Returns the raw JSON value of [detail].
                                 *
                                 * Unlike [detail], this method doesn't throw if the JSON field has
                                 * an unexpected type.
                                 */
                                @JsonProperty("detail")
                                @ExcludeMissing
                                fun _detail(): JsonField<String> = detail

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
                                     * Returns a mutable builder for constructing an instance of
                                     * [ChatCompletionVideoUrlObject].
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .url()
                                     * ```
                                     */
                                    fun builder() = Builder()
                                }

                                /** A builder for [ChatCompletionVideoUrlObject]. */
                                class Builder internal constructor() {

                                    private var url: JsonField<String>? = null
                                    private var detail: JsonField<String> = JsonMissing.of()
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    internal fun from(
                                        chatCompletionVideoUrlObject: ChatCompletionVideoUrlObject
                                    ) = apply {
                                        url = chatCompletionVideoUrlObject.url
                                        detail = chatCompletionVideoUrlObject.detail
                                        additionalProperties =
                                            chatCompletionVideoUrlObject.additionalProperties
                                                .toMutableMap()
                                    }

                                    fun url(url: String) = url(JsonField.of(url))

                                    /**
                                     * Sets [Builder.url] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.url] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun url(url: JsonField<String>) = apply { this.url = url }

                                    fun detail(detail: String) = detail(JsonField.of(detail))

                                    /**
                                     * Sets [Builder.detail] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.detail] with a well-typed
                                     * [String] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun detail(detail: JsonField<String>) = apply {
                                        this.detail = detail
                                    }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of
                                     * [ChatCompletionVideoUrlObject].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     *
                                     * The following fields are required:
                                     * ```kotlin
                                     * .url()
                                     * ```
                                     *
                                     * @throws IllegalStateException if any required field is unset.
                                     */
                                    fun build(): ChatCompletionVideoUrlObject =
                                        ChatCompletionVideoUrlObject(
                                            checkRequired("url", url),
                                            detail,
                                            additionalProperties.toMutableMap(),
                                        )
                                }

                                private var validated: Boolean = false

                                fun validate(): ChatCompletionVideoUrlObject = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    url()
                                    detail()
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    (if (url.asKnown() == null) 0 else 1) +
                                        (if (detail.asKnown() == null) 0 else 1)

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is ChatCompletionVideoUrlObject &&
                                        url == other.url &&
                                        detail == other.detail &&
                                        additionalProperties == other.additionalProperties
                                }

                                private val hashCode: Int by lazy {
                                    Objects.hash(url, detail, additionalProperties)
                                }

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "ChatCompletionVideoUrlObject{url=$url, detail=$detail, additionalProperties=$additionalProperties}"
                            }
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ChatCompletionVideoObject &&
                                type == other.type &&
                                videoUrl == other.videoUrl &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(type, videoUrl, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "ChatCompletionVideoObject{type=$type, videoUrl=$videoUrl, additionalProperties=$additionalProperties}"
                    }

                    class ChatCompletionFileObject
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val file: JsonField<File>,
                        private val type: JsonValue,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("file")
                            @ExcludeMissing
                            file: JsonField<File> = JsonMissing.of(),
                            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                        ) : this(file, type, mutableMapOf())

                        /**
                         * @throws HanzoInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun file(): File = file.getRequired("file")

                        /**
                         * Expected to always return the following:
                         * ```kotlin
                         * JsonValue.from("file")
                         * ```
                         *
                         * However, this method can be useful for debugging and logging (e.g. if the
                         * server responded with an unexpected value).
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                        /**
                         * Returns the raw JSON value of [file].
                         *
                         * Unlike [file], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("file") @ExcludeMissing fun _file(): JsonField<File> = file

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
                             * Returns a mutable builder for constructing an instance of
                             * [ChatCompletionFileObject].
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .file()
                             * ```
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [ChatCompletionFileObject]. */
                        class Builder internal constructor() {

                            private var file: JsonField<File>? = null
                            private var type: JsonValue = JsonValue.from("file")
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(chatCompletionFileObject: ChatCompletionFileObject) =
                                apply {
                                    file = chatCompletionFileObject.file
                                    type = chatCompletionFileObject.type
                                    additionalProperties =
                                        chatCompletionFileObject.additionalProperties.toMutableMap()
                                }

                            fun file(file: File) = file(JsonField.of(file))

                            /**
                             * Sets [Builder.file] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.file] with a well-typed [File] value
                             * instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun file(file: JsonField<File>) = apply { this.file = file }

                            /**
                             * Sets the field to an arbitrary JSON value.
                             *
                             * It is usually unnecessary to call this method because the field
                             * defaults to the following:
                             * ```kotlin
                             * JsonValue.from("file")
                             * ```
                             *
                             * This method is primarily for setting the field to an undocumented or
                             * not yet supported value.
                             */
                            fun type(type: JsonValue) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [ChatCompletionFileObject].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .file()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): ChatCompletionFileObject =
                                ChatCompletionFileObject(
                                    checkRequired("file", file),
                                    type,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): ChatCompletionFileObject = apply {
                            if (validated) {
                                return@apply
                            }

                            file().validate()
                            _type().let {
                                if (it != JsonValue.from("file")) {
                                    throw HanzoInvalidDataException(
                                        "'type' is invalid, received $it"
                                    )
                                }
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            (file.asKnown()?.validity() ?: 0) +
                                type.let { if (it == JsonValue.from("file")) 1 else 0 }

                        class File
                        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                        private constructor(
                            private val fileData: JsonField<String>,
                            private val fileId: JsonField<String>,
                            private val filename: JsonField<String>,
                            private val format: JsonField<String>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("file_data")
                                @ExcludeMissing
                                fileData: JsonField<String> = JsonMissing.of(),
                                @JsonProperty("file_id")
                                @ExcludeMissing
                                fileId: JsonField<String> = JsonMissing.of(),
                                @JsonProperty("filename")
                                @ExcludeMissing
                                filename: JsonField<String> = JsonMissing.of(),
                                @JsonProperty("format")
                                @ExcludeMissing
                                format: JsonField<String> = JsonMissing.of(),
                            ) : this(fileData, fileId, filename, format, mutableMapOf())

                            /**
                             * @throws HanzoInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun fileData(): String? = fileData.getNullable("file_data")

                            /**
                             * @throws HanzoInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun fileId(): String? = fileId.getNullable("file_id")

                            /**
                             * @throws HanzoInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun filename(): String? = filename.getNullable("filename")

                            /**
                             * @throws HanzoInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun format(): String? = format.getNullable("format")

                            /**
                             * Returns the raw JSON value of [fileData].
                             *
                             * Unlike [fileData], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("file_data")
                            @ExcludeMissing
                            fun _fileData(): JsonField<String> = fileData

                            /**
                             * Returns the raw JSON value of [fileId].
                             *
                             * Unlike [fileId], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("file_id")
                            @ExcludeMissing
                            fun _fileId(): JsonField<String> = fileId

                            /**
                             * Returns the raw JSON value of [filename].
                             *
                             * Unlike [filename], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("filename")
                            @ExcludeMissing
                            fun _filename(): JsonField<String> = filename

                            /**
                             * Returns the raw JSON value of [format].
                             *
                             * Unlike [format], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("format")
                            @ExcludeMissing
                            fun _format(): JsonField<String> = format

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
                                 * Returns a mutable builder for constructing an instance of [File].
                                 */
                                fun builder() = Builder()
                            }

                            /** A builder for [File]. */
                            class Builder internal constructor() {

                                private var fileData: JsonField<String> = JsonMissing.of()
                                private var fileId: JsonField<String> = JsonMissing.of()
                                private var filename: JsonField<String> = JsonMissing.of()
                                private var format: JsonField<String> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(file: File) = apply {
                                    fileData = file.fileData
                                    fileId = file.fileId
                                    filename = file.filename
                                    format = file.format
                                    additionalProperties = file.additionalProperties.toMutableMap()
                                }

                                fun fileData(fileData: String) = fileData(JsonField.of(fileData))

                                /**
                                 * Sets [Builder.fileData] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.fileData] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun fileData(fileData: JsonField<String>) = apply {
                                    this.fileData = fileData
                                }

                                fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                                /**
                                 * Sets [Builder.fileId] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.fileId] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun fileId(fileId: JsonField<String>) = apply {
                                    this.fileId = fileId
                                }

                                fun filename(filename: String) = filename(JsonField.of(filename))

                                /**
                                 * Sets [Builder.filename] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.filename] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun filename(filename: JsonField<String>) = apply {
                                    this.filename = filename
                                }

                                fun format(format: String) = format(JsonField.of(format))

                                /**
                                 * Sets [Builder.format] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.format] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun format(format: JsonField<String>) = apply {
                                    this.format = format
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [File].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 */
                                fun build(): File =
                                    File(
                                        fileData,
                                        fileId,
                                        filename,
                                        format,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            fun validate(): File = apply {
                                if (validated) {
                                    return@apply
                                }

                                fileData()
                                fileId()
                                filename()
                                format()
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                (if (fileData.asKnown() == null) 0 else 1) +
                                    (if (fileId.asKnown() == null) 0 else 1) +
                                    (if (filename.asKnown() == null) 0 else 1) +
                                    (if (format.asKnown() == null) 0 else 1)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is File &&
                                    fileData == other.fileData &&
                                    fileId == other.fileId &&
                                    filename == other.filename &&
                                    format == other.format &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy {
                                Objects.hash(
                                    fileData,
                                    fileId,
                                    filename,
                                    format,
                                    additionalProperties,
                                )
                            }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "File{fileData=$fileData, fileId=$fileId, filename=$filename, format=$format, additionalProperties=$additionalProperties}"
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ChatCompletionFileObject &&
                                file == other.file &&
                                type == other.type &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(file, type, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "ChatCompletionFileObject{file=$file, type=$type, additionalProperties=$additionalProperties}"
                    }
                }
            }

            class CacheControl
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val type: JsonValue,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of()
                ) : this(type, mutableMapOf())

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("ephemeral")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

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

                    /** Returns a mutable builder for constructing an instance of [CacheControl]. */
                    fun builder() = Builder()
                }

                /** A builder for [CacheControl]. */
                class Builder internal constructor() {

                    private var type: JsonValue = JsonValue.from("ephemeral")
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(cacheControl: CacheControl) = apply {
                        type = cacheControl.type
                        additionalProperties = cacheControl.additionalProperties.toMutableMap()
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("ephemeral")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

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
                     * Returns an immutable instance of [CacheControl].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): CacheControl =
                        CacheControl(type, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): CacheControl = apply {
                    if (validated) {
                        return@apply
                    }

                    _type().let {
                        if (it != JsonValue.from("ephemeral")) {
                            throw HanzoInvalidDataException("'type' is invalid, received $it")
                        }
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
                    type.let { if (it == JsonValue.from("ephemeral")) 1 else 0 }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CacheControl &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CacheControl{type=$type, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ChatCompletionUserMessage &&
                    content == other.content &&
                    role == other.role &&
                    cacheControl == other.cacheControl &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(content, role, cacheControl, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ChatCompletionUserMessage{content=$content, role=$role, cacheControl=$cacheControl, additionalProperties=$additionalProperties}"
        }

        class ChatCompletionAssistantMessage
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val role: JsonValue,
            private val cacheControl: JsonField<CacheControl>,
            private val content: JsonField<Content>,
            private val functionCall: JsonField<FunctionCall>,
            private val name: JsonField<String>,
            private val reasoningContent: JsonField<String>,
            private val thinkingBlocks: JsonField<List<ThinkingBlock>>,
            private val toolCalls: JsonField<List<ToolCall>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("role") @ExcludeMissing role: JsonValue = JsonMissing.of(),
                @JsonProperty("cache_control")
                @ExcludeMissing
                cacheControl: JsonField<CacheControl> = JsonMissing.of(),
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<Content> = JsonMissing.of(),
                @JsonProperty("function_call")
                @ExcludeMissing
                functionCall: JsonField<FunctionCall> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reasoning_content")
                @ExcludeMissing
                reasoningContent: JsonField<String> = JsonMissing.of(),
                @JsonProperty("thinking_blocks")
                @ExcludeMissing
                thinkingBlocks: JsonField<List<ThinkingBlock>> = JsonMissing.of(),
                @JsonProperty("tool_calls")
                @ExcludeMissing
                toolCalls: JsonField<List<ToolCall>> = JsonMissing.of(),
            ) : this(
                role,
                cacheControl,
                content,
                functionCall,
                name,
                reasoningContent,
                thinkingBlocks,
                toolCalls,
                mutableMapOf(),
            )

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("assistant")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("role") @ExcludeMissing fun _role(): JsonValue = role

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun cacheControl(): CacheControl? = cacheControl.getNullable("cache_control")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun content(): Content? = content.getNullable("content")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun functionCall(): FunctionCall? = functionCall.getNullable("function_call")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): String? = name.getNullable("name")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun reasoningContent(): String? = reasoningContent.getNullable("reasoning_content")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun thinkingBlocks(): List<ThinkingBlock>? =
                thinkingBlocks.getNullable("thinking_blocks")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun toolCalls(): List<ToolCall>? = toolCalls.getNullable("tool_calls")

            /**
             * Returns the raw JSON value of [cacheControl].
             *
             * Unlike [cacheControl], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("cache_control")
            @ExcludeMissing
            fun _cacheControl(): JsonField<CacheControl> = cacheControl

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

            /**
             * Returns the raw JSON value of [functionCall].
             *
             * Unlike [functionCall], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("function_call")
            @ExcludeMissing
            fun _functionCall(): JsonField<FunctionCall> = functionCall

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [reasoningContent].
             *
             * Unlike [reasoningContent], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("reasoning_content")
            @ExcludeMissing
            fun _reasoningContent(): JsonField<String> = reasoningContent

            /**
             * Returns the raw JSON value of [thinkingBlocks].
             *
             * Unlike [thinkingBlocks], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("thinking_blocks")
            @ExcludeMissing
            fun _thinkingBlocks(): JsonField<List<ThinkingBlock>> = thinkingBlocks

            /**
             * Returns the raw JSON value of [toolCalls].
             *
             * Unlike [toolCalls], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tool_calls")
            @ExcludeMissing
            fun _toolCalls(): JsonField<List<ToolCall>> = toolCalls

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
                 * Returns a mutable builder for constructing an instance of
                 * [ChatCompletionAssistantMessage].
                 */
                fun builder() = Builder()
            }

            /** A builder for [ChatCompletionAssistantMessage]. */
            class Builder internal constructor() {

                private var role: JsonValue = JsonValue.from("assistant")
                private var cacheControl: JsonField<CacheControl> = JsonMissing.of()
                private var content: JsonField<Content> = JsonMissing.of()
                private var functionCall: JsonField<FunctionCall> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var reasoningContent: JsonField<String> = JsonMissing.of()
                private var thinkingBlocks: JsonField<MutableList<ThinkingBlock>>? = null
                private var toolCalls: JsonField<MutableList<ToolCall>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(chatCompletionAssistantMessage: ChatCompletionAssistantMessage) =
                    apply {
                        role = chatCompletionAssistantMessage.role
                        cacheControl = chatCompletionAssistantMessage.cacheControl
                        content = chatCompletionAssistantMessage.content
                        functionCall = chatCompletionAssistantMessage.functionCall
                        name = chatCompletionAssistantMessage.name
                        reasoningContent = chatCompletionAssistantMessage.reasoningContent
                        thinkingBlocks =
                            chatCompletionAssistantMessage.thinkingBlocks.map { it.toMutableList() }
                        toolCalls =
                            chatCompletionAssistantMessage.toolCalls.map { it.toMutableList() }
                        additionalProperties =
                            chatCompletionAssistantMessage.additionalProperties.toMutableMap()
                    }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("assistant")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun role(role: JsonValue) = apply { this.role = role }

                fun cacheControl(cacheControl: CacheControl) =
                    cacheControl(JsonField.of(cacheControl))

                /**
                 * Sets [Builder.cacheControl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cacheControl] with a well-typed [CacheControl]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun cacheControl(cacheControl: JsonField<CacheControl>) = apply {
                    this.cacheControl = cacheControl
                }

                fun content(content: Content?) = content(JsonField.ofNullable(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [Content] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<Content>) = apply { this.content = content }

                /** Alias for calling [content] with `Content.ofString(string)`. */
                fun content(string: String) = content(Content.ofString(string))

                /**
                 * Alias for calling [content] with
                 * `Content.ofUnnamedSchemaWithArrayParent5s(unnamedSchemaWithArrayParent5s)`.
                 */
                fun contentOfUnnamedSchemaWithArrayParent5s(
                    unnamedSchemaWithArrayParent5s: List<Content.UnnamedSchemaWithArrayParent5>
                ) =
                    content(
                        Content.ofUnnamedSchemaWithArrayParent5s(unnamedSchemaWithArrayParent5s)
                    )

                fun functionCall(functionCall: FunctionCall?) =
                    functionCall(JsonField.ofNullable(functionCall))

                /**
                 * Sets [Builder.functionCall] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.functionCall] with a well-typed [FunctionCall]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun functionCall(functionCall: JsonField<FunctionCall>) = apply {
                    this.functionCall = functionCall
                }

                fun name(name: String?) = name(JsonField.ofNullable(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun reasoningContent(reasoningContent: String?) =
                    reasoningContent(JsonField.ofNullable(reasoningContent))

                /**
                 * Sets [Builder.reasoningContent] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reasoningContent] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun reasoningContent(reasoningContent: JsonField<String>) = apply {
                    this.reasoningContent = reasoningContent
                }

                fun thinkingBlocks(thinkingBlocks: List<ThinkingBlock>?) =
                    thinkingBlocks(JsonField.ofNullable(thinkingBlocks))

                /**
                 * Sets [Builder.thinkingBlocks] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.thinkingBlocks] with a well-typed
                 * `List<ThinkingBlock>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun thinkingBlocks(thinkingBlocks: JsonField<List<ThinkingBlock>>) = apply {
                    this.thinkingBlocks = thinkingBlocks.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ThinkingBlock] to [thinkingBlocks].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addThinkingBlock(thinkingBlock: ThinkingBlock) = apply {
                    thinkingBlocks =
                        (thinkingBlocks ?: JsonField.of(mutableListOf())).also {
                            checkKnown("thinkingBlocks", it).add(thinkingBlock)
                        }
                }

                /**
                 * Alias for calling [addThinkingBlock] with
                 * `ThinkingBlock.ofChatCompletion(chatCompletion)`.
                 */
                fun addThinkingBlock(chatCompletion: ThinkingBlock.ChatCompletionThinkingBlock) =
                    addThinkingBlock(ThinkingBlock.ofChatCompletion(chatCompletion))

                /**
                 * Alias for calling [addThinkingBlock] with
                 * `ThinkingBlock.ofChatCompletionRedacted(chatCompletionRedacted)`.
                 */
                fun addThinkingBlock(
                    chatCompletionRedacted: ThinkingBlock.ChatCompletionRedactedThinkingBlock
                ) = addThinkingBlock(ThinkingBlock.ofChatCompletionRedacted(chatCompletionRedacted))

                fun toolCalls(toolCalls: List<ToolCall>?) =
                    toolCalls(JsonField.ofNullable(toolCalls))

                /**
                 * Sets [Builder.toolCalls] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.toolCalls] with a well-typed `List<ToolCall>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun toolCalls(toolCalls: JsonField<List<ToolCall>>) = apply {
                    this.toolCalls = toolCalls.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ToolCall] to [toolCalls].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addToolCall(toolCall: ToolCall) = apply {
                    toolCalls =
                        (toolCalls ?: JsonField.of(mutableListOf())).also {
                            checkKnown("toolCalls", it).add(toolCall)
                        }
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
                 * Returns an immutable instance of [ChatCompletionAssistantMessage].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ChatCompletionAssistantMessage =
                    ChatCompletionAssistantMessage(
                        role,
                        cacheControl,
                        content,
                        functionCall,
                        name,
                        reasoningContent,
                        (thinkingBlocks ?: JsonMissing.of()).map { it.toImmutable() },
                        (toolCalls ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ChatCompletionAssistantMessage = apply {
                if (validated) {
                    return@apply
                }

                _role().let {
                    if (it != JsonValue.from("assistant")) {
                        throw HanzoInvalidDataException("'role' is invalid, received $it")
                    }
                }
                cacheControl()?.validate()
                content()?.validate()
                functionCall()?.validate()
                name()
                reasoningContent()
                thinkingBlocks()?.forEach { it.validate() }
                toolCalls()?.forEach { it.validate() }
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
                role.let { if (it == JsonValue.from("assistant")) 1 else 0 } +
                    (cacheControl.asKnown()?.validity() ?: 0) +
                    (content.asKnown()?.validity() ?: 0) +
                    (functionCall.asKnown()?.validity() ?: 0) +
                    (if (name.asKnown() == null) 0 else 1) +
                    (if (reasoningContent.asKnown() == null) 0 else 1) +
                    (thinkingBlocks.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (toolCalls.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

            class CacheControl
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val type: JsonValue,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of()
                ) : this(type, mutableMapOf())

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("ephemeral")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

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

                    /** Returns a mutable builder for constructing an instance of [CacheControl]. */
                    fun builder() = Builder()
                }

                /** A builder for [CacheControl]. */
                class Builder internal constructor() {

                    private var type: JsonValue = JsonValue.from("ephemeral")
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(cacheControl: CacheControl) = apply {
                        type = cacheControl.type
                        additionalProperties = cacheControl.additionalProperties.toMutableMap()
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("ephemeral")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

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
                     * Returns an immutable instance of [CacheControl].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): CacheControl =
                        CacheControl(type, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): CacheControl = apply {
                    if (validated) {
                        return@apply
                    }

                    _type().let {
                        if (it != JsonValue.from("ephemeral")) {
                            throw HanzoInvalidDataException("'type' is invalid, received $it")
                        }
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
                    type.let { if (it == JsonValue.from("ephemeral")) 1 else 0 }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CacheControl &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CacheControl{type=$type, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(using = Content.Deserializer::class)
            @JsonSerialize(using = Content.Serializer::class)
            class Content
            private constructor(
                private val string: String? = null,
                private val unnamedSchemaWithArrayParent5s: List<UnnamedSchemaWithArrayParent5>? =
                    null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): String? = string

                fun unnamedSchemaWithArrayParent5s(): List<UnnamedSchemaWithArrayParent5>? =
                    unnamedSchemaWithArrayParent5s

                fun isString(): Boolean = string != null

                fun isUnnamedSchemaWithArrayParent5s(): Boolean =
                    unnamedSchemaWithArrayParent5s != null

                fun asString(): String = string.getOrThrow("string")

                fun asUnnamedSchemaWithArrayParent5s(): List<UnnamedSchemaWithArrayParent5> =
                    unnamedSchemaWithArrayParent5s.getOrThrow("unnamedSchemaWithArrayParent5s")

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        unnamedSchemaWithArrayParent5s != null ->
                            visitor.visitUnnamedSchemaWithArrayParent5s(
                                unnamedSchemaWithArrayParent5s
                            )
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Content = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitString(string: String) {}

                            override fun visitUnnamedSchemaWithArrayParent5s(
                                unnamedSchemaWithArrayParent5s: List<UnnamedSchemaWithArrayParent5>
                            ) {
                                unnamedSchemaWithArrayParent5s.forEach { it.validate() }
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

                            override fun visitUnnamedSchemaWithArrayParent5s(
                                unnamedSchemaWithArrayParent5s: List<UnnamedSchemaWithArrayParent5>
                            ) = unnamedSchemaWithArrayParent5s.sumOf { it.validity().toInt() }

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Content &&
                        string == other.string &&
                        unnamedSchemaWithArrayParent5s == other.unnamedSchemaWithArrayParent5s
                }

                override fun hashCode(): Int = Objects.hash(string, unnamedSchemaWithArrayParent5s)

                override fun toString(): String =
                    when {
                        string != null -> "Content{string=$string}"
                        unnamedSchemaWithArrayParent5s != null ->
                            "Content{unnamedSchemaWithArrayParent5s=$unnamedSchemaWithArrayParent5s}"
                        _json != null -> "Content{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Content")
                    }

                companion object {

                    fun ofString(string: String) = Content(string = string)

                    fun ofUnnamedSchemaWithArrayParent5s(
                        unnamedSchemaWithArrayParent5s: List<UnnamedSchemaWithArrayParent5>
                    ) =
                        Content(
                            unnamedSchemaWithArrayParent5s =
                                unnamedSchemaWithArrayParent5s.toImmutable()
                        )
                }

                /**
                 * An interface that defines how to map each variant of [Content] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitUnnamedSchemaWithArrayParent5s(
                        unnamedSchemaWithArrayParent5s: List<UnnamedSchemaWithArrayParent5>
                    ): T

                    /**
                     * Maps an unknown variant of [Content] to a value of type [T].
                     *
                     * An instance of [Content] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws HanzoInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw HanzoInvalidDataException("Unknown Content: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Content>(Content::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Content {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Content(string = it, _json = json)
                                    },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<List<UnnamedSchemaWithArrayParent5>>(),
                                        )
                                        ?.let {
                                            Content(
                                                unnamedSchemaWithArrayParent5s = it,
                                                _json = json,
                                            )
                                        },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> Content(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Content>(Content::class) {

                    override fun serialize(
                        value: Content,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.unnamedSchemaWithArrayParent5s != null ->
                                generator.writeObject(value.unnamedSchemaWithArrayParent5s)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Content")
                        }
                    }
                }

                @JsonDeserialize(using = UnnamedSchemaWithArrayParent5.Deserializer::class)
                @JsonSerialize(using = UnnamedSchemaWithArrayParent5.Serializer::class)
                class UnnamedSchemaWithArrayParent5
                private constructor(
                    private val chatCompletionTextObject: ChatCompletionTextObject? = null,
                    private val chatCompletionThinkingBlock: ChatCompletionThinkingBlock? = null,
                    private val _json: JsonValue? = null,
                ) {

                    fun chatCompletionTextObject(): ChatCompletionTextObject? =
                        chatCompletionTextObject

                    fun chatCompletionThinkingBlock(): ChatCompletionThinkingBlock? =
                        chatCompletionThinkingBlock

                    fun isChatCompletionTextObject(): Boolean = chatCompletionTextObject != null

                    fun isChatCompletionThinkingBlock(): Boolean =
                        chatCompletionThinkingBlock != null

                    fun asChatCompletionTextObject(): ChatCompletionTextObject =
                        chatCompletionTextObject.getOrThrow("chatCompletionTextObject")

                    fun asChatCompletionThinkingBlock(): ChatCompletionThinkingBlock =
                        chatCompletionThinkingBlock.getOrThrow("chatCompletionThinkingBlock")

                    fun _json(): JsonValue? = _json

                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            chatCompletionTextObject != null ->
                                visitor.visitChatCompletionTextObject(chatCompletionTextObject)
                            chatCompletionThinkingBlock != null ->
                                visitor.visitChatCompletionThinkingBlock(
                                    chatCompletionThinkingBlock
                                )
                            else -> visitor.unknown(_json)
                        }

                    private var validated: Boolean = false

                    fun validate(): UnnamedSchemaWithArrayParent5 = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitChatCompletionTextObject(
                                    chatCompletionTextObject: ChatCompletionTextObject
                                ) {
                                    chatCompletionTextObject.validate()
                                }

                                override fun visitChatCompletionThinkingBlock(
                                    chatCompletionThinkingBlock: ChatCompletionThinkingBlock
                                ) {
                                    chatCompletionThinkingBlock.validate()
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
                                override fun visitChatCompletionTextObject(
                                    chatCompletionTextObject: ChatCompletionTextObject
                                ) = chatCompletionTextObject.validity()

                                override fun visitChatCompletionThinkingBlock(
                                    chatCompletionThinkingBlock: ChatCompletionThinkingBlock
                                ) = chatCompletionThinkingBlock.validity()

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is UnnamedSchemaWithArrayParent5 &&
                            chatCompletionTextObject == other.chatCompletionTextObject &&
                            chatCompletionThinkingBlock == other.chatCompletionThinkingBlock
                    }

                    override fun hashCode(): Int =
                        Objects.hash(chatCompletionTextObject, chatCompletionThinkingBlock)

                    override fun toString(): String =
                        when {
                            chatCompletionTextObject != null ->
                                "UnnamedSchemaWithArrayParent5{chatCompletionTextObject=$chatCompletionTextObject}"
                            chatCompletionThinkingBlock != null ->
                                "UnnamedSchemaWithArrayParent5{chatCompletionThinkingBlock=$chatCompletionThinkingBlock}"
                            _json != null -> "UnnamedSchemaWithArrayParent5{_unknown=$_json}"
                            else ->
                                throw IllegalStateException("Invalid UnnamedSchemaWithArrayParent5")
                        }

                    companion object {

                        fun ofChatCompletionTextObject(
                            chatCompletionTextObject: ChatCompletionTextObject
                        ) =
                            UnnamedSchemaWithArrayParent5(
                                chatCompletionTextObject = chatCompletionTextObject
                            )

                        fun ofChatCompletionThinkingBlock(
                            chatCompletionThinkingBlock: ChatCompletionThinkingBlock
                        ) =
                            UnnamedSchemaWithArrayParent5(
                                chatCompletionThinkingBlock = chatCompletionThinkingBlock
                            )
                    }

                    /**
                     * An interface that defines how to map each variant of
                     * [UnnamedSchemaWithArrayParent5] to a value of type [T].
                     */
                    interface Visitor<out T> {

                        fun visitChatCompletionTextObject(
                            chatCompletionTextObject: ChatCompletionTextObject
                        ): T

                        fun visitChatCompletionThinkingBlock(
                            chatCompletionThinkingBlock: ChatCompletionThinkingBlock
                        ): T

                        /**
                         * Maps an unknown variant of [UnnamedSchemaWithArrayParent5] to a value of
                         * type [T].
                         *
                         * An instance of [UnnamedSchemaWithArrayParent5] can contain an unknown
                         * variant if it was deserialized from data that doesn't match any known
                         * variant. For example, if the SDK is on an older version than the API,
                         * then the API may respond with new variants that the SDK is unaware of.
                         *
                         * @throws HanzoInvalidDataException in the default implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw HanzoInvalidDataException(
                                "Unknown UnnamedSchemaWithArrayParent5: $json"
                            )
                        }
                    }

                    internal class Deserializer :
                        BaseDeserializer<UnnamedSchemaWithArrayParent5>(
                            UnnamedSchemaWithArrayParent5::class
                        ) {

                        override fun ObjectCodec.deserialize(
                            node: JsonNode
                        ): UnnamedSchemaWithArrayParent5 {
                            val json = JsonValue.fromJsonNode(node)

                            val bestMatches =
                                sequenceOf(
                                        tryDeserialize(
                                                node,
                                                jacksonTypeRef<ChatCompletionTextObject>(),
                                            )
                                            ?.let {
                                                UnnamedSchemaWithArrayParent5(
                                                    chatCompletionTextObject = it,
                                                    _json = json,
                                                )
                                            },
                                        tryDeserialize(
                                                node,
                                                jacksonTypeRef<ChatCompletionThinkingBlock>(),
                                            )
                                            ?.let {
                                                UnnamedSchemaWithArrayParent5(
                                                    chatCompletionThinkingBlock = it,
                                                    _json = json,
                                                )
                                            },
                                    )
                                    .filterNotNull()
                                    .allMaxBy { it.validity() }
                                    .toList()
                            return when (bestMatches.size) {
                                // This can happen if what we're deserializing is completely
                                // incompatible with all the possible variants (e.g. deserializing
                                // from boolean).
                                0 -> UnnamedSchemaWithArrayParent5(_json = json)
                                1 -> bestMatches.single()
                                // If there's more than one match with the highest validity, then
                                // use the first completely valid match, or simply the first match
                                // if none are completely valid.
                                else ->
                                    bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                            }
                        }
                    }

                    internal class Serializer :
                        BaseSerializer<UnnamedSchemaWithArrayParent5>(
                            UnnamedSchemaWithArrayParent5::class
                        ) {

                        override fun serialize(
                            value: UnnamedSchemaWithArrayParent5,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.chatCompletionTextObject != null ->
                                    generator.writeObject(value.chatCompletionTextObject)
                                value.chatCompletionThinkingBlock != null ->
                                    generator.writeObject(value.chatCompletionThinkingBlock)
                                value._json != null -> generator.writeObject(value._json)
                                else ->
                                    throw IllegalStateException(
                                        "Invalid UnnamedSchemaWithArrayParent5"
                                    )
                            }
                        }
                    }

                    class ChatCompletionTextObject
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val text: JsonField<String>,
                        private val type: JsonValue,
                        private val cacheControl: JsonField<CacheControl>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("text")
                            @ExcludeMissing
                            text: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("type")
                            @ExcludeMissing
                            type: JsonValue = JsonMissing.of(),
                            @JsonProperty("cache_control")
                            @ExcludeMissing
                            cacheControl: JsonField<CacheControl> = JsonMissing.of(),
                        ) : this(text, type, cacheControl, mutableMapOf())

                        /**
                         * @throws HanzoInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun text(): String = text.getRequired("text")

                        /**
                         * Expected to always return the following:
                         * ```kotlin
                         * JsonValue.from("text")
                         * ```
                         *
                         * However, this method can be useful for debugging and logging (e.g. if the
                         * server responded with an unexpected value).
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                        /**
                         * @throws HanzoInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun cacheControl(): CacheControl? =
                            cacheControl.getNullable("cache_control")

                        /**
                         * Returns the raw JSON value of [text].
                         *
                         * Unlike [text], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                        /**
                         * Returns the raw JSON value of [cacheControl].
                         *
                         * Unlike [cacheControl], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("cache_control")
                        @ExcludeMissing
                        fun _cacheControl(): JsonField<CacheControl> = cacheControl

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
                             * Returns a mutable builder for constructing an instance of
                             * [ChatCompletionTextObject].
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .text()
                             * ```
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [ChatCompletionTextObject]. */
                        class Builder internal constructor() {

                            private var text: JsonField<String>? = null
                            private var type: JsonValue = JsonValue.from("text")
                            private var cacheControl: JsonField<CacheControl> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(chatCompletionTextObject: ChatCompletionTextObject) =
                                apply {
                                    text = chatCompletionTextObject.text
                                    type = chatCompletionTextObject.type
                                    cacheControl = chatCompletionTextObject.cacheControl
                                    additionalProperties =
                                        chatCompletionTextObject.additionalProperties.toMutableMap()
                                }

                            fun text(text: String) = text(JsonField.of(text))

                            /**
                             * Sets [Builder.text] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.text] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun text(text: JsonField<String>) = apply { this.text = text }

                            /**
                             * Sets the field to an arbitrary JSON value.
                             *
                             * It is usually unnecessary to call this method because the field
                             * defaults to the following:
                             * ```kotlin
                             * JsonValue.from("text")
                             * ```
                             *
                             * This method is primarily for setting the field to an undocumented or
                             * not yet supported value.
                             */
                            fun type(type: JsonValue) = apply { this.type = type }

                            fun cacheControl(cacheControl: CacheControl) =
                                cacheControl(JsonField.of(cacheControl))

                            /**
                             * Sets [Builder.cacheControl] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.cacheControl] with a well-typed
                             * [CacheControl] value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
                             */
                            fun cacheControl(cacheControl: JsonField<CacheControl>) = apply {
                                this.cacheControl = cacheControl
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [ChatCompletionTextObject].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .text()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): ChatCompletionTextObject =
                                ChatCompletionTextObject(
                                    checkRequired("text", text),
                                    type,
                                    cacheControl,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): ChatCompletionTextObject = apply {
                            if (validated) {
                                return@apply
                            }

                            text()
                            _type().let {
                                if (it != JsonValue.from("text")) {
                                    throw HanzoInvalidDataException(
                                        "'type' is invalid, received $it"
                                    )
                                }
                            }
                            cacheControl()?.validate()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            (if (text.asKnown() == null) 0 else 1) +
                                type.let { if (it == JsonValue.from("text")) 1 else 0 } +
                                (cacheControl.asKnown()?.validity() ?: 0)

                        class CacheControl
                        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                        private constructor(
                            private val type: JsonValue,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonValue = JsonMissing.of()
                            ) : this(type, mutableMapOf())

                            /**
                             * Expected to always return the following:
                             * ```kotlin
                             * JsonValue.from("ephemeral")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
                             */
                            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

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
                                 * Returns a mutable builder for constructing an instance of
                                 * [CacheControl].
                                 */
                                fun builder() = Builder()
                            }

                            /** A builder for [CacheControl]. */
                            class Builder internal constructor() {

                                private var type: JsonValue = JsonValue.from("ephemeral")
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(cacheControl: CacheControl) = apply {
                                    type = cacheControl.type
                                    additionalProperties =
                                        cacheControl.additionalProperties.toMutableMap()
                                }

                                /**
                                 * Sets the field to an arbitrary JSON value.
                                 *
                                 * It is usually unnecessary to call this method because the field
                                 * defaults to the following:
                                 * ```kotlin
                                 * JsonValue.from("ephemeral")
                                 * ```
                                 *
                                 * This method is primarily for setting the field to an undocumented
                                 * or not yet supported value.
                                 */
                                fun type(type: JsonValue) = apply { this.type = type }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [CacheControl].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 */
                                fun build(): CacheControl =
                                    CacheControl(type, additionalProperties.toMutableMap())
                            }

                            private var validated: Boolean = false

                            fun validate(): CacheControl = apply {
                                if (validated) {
                                    return@apply
                                }

                                _type().let {
                                    if (it != JsonValue.from("ephemeral")) {
                                        throw HanzoInvalidDataException(
                                            "'type' is invalid, received $it"
                                        )
                                    }
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                type.let { if (it == JsonValue.from("ephemeral")) 1 else 0 }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is CacheControl &&
                                    type == other.type &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy {
                                Objects.hash(type, additionalProperties)
                            }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "CacheControl{type=$type, additionalProperties=$additionalProperties}"
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ChatCompletionTextObject &&
                                text == other.text &&
                                type == other.type &&
                                cacheControl == other.cacheControl &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(text, type, cacheControl, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "ChatCompletionTextObject{text=$text, type=$type, cacheControl=$cacheControl, additionalProperties=$additionalProperties}"
                    }

                    class ChatCompletionThinkingBlock
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val type: JsonValue,
                        private val cacheControl: JsonField<CacheControl>,
                        private val signature: JsonField<String>,
                        private val thinking: JsonField<String>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("type")
                            @ExcludeMissing
                            type: JsonValue = JsonMissing.of(),
                            @JsonProperty("cache_control")
                            @ExcludeMissing
                            cacheControl: JsonField<CacheControl> = JsonMissing.of(),
                            @JsonProperty("signature")
                            @ExcludeMissing
                            signature: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("thinking")
                            @ExcludeMissing
                            thinking: JsonField<String> = JsonMissing.of(),
                        ) : this(type, cacheControl, signature, thinking, mutableMapOf())

                        /**
                         * Expected to always return the following:
                         * ```kotlin
                         * JsonValue.from("thinking")
                         * ```
                         *
                         * However, this method can be useful for debugging and logging (e.g. if the
                         * server responded with an unexpected value).
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                        /**
                         * @throws HanzoInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun cacheControl(): CacheControl? =
                            cacheControl.getNullable("cache_control")

                        /**
                         * @throws HanzoInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun signature(): String? = signature.getNullable("signature")

                        /**
                         * @throws HanzoInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun thinking(): String? = thinking.getNullable("thinking")

                        /**
                         * Returns the raw JSON value of [cacheControl].
                         *
                         * Unlike [cacheControl], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("cache_control")
                        @ExcludeMissing
                        fun _cacheControl(): JsonField<CacheControl> = cacheControl

                        /**
                         * Returns the raw JSON value of [signature].
                         *
                         * Unlike [signature], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("signature")
                        @ExcludeMissing
                        fun _signature(): JsonField<String> = signature

                        /**
                         * Returns the raw JSON value of [thinking].
                         *
                         * Unlike [thinking], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("thinking")
                        @ExcludeMissing
                        fun _thinking(): JsonField<String> = thinking

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
                             * Returns a mutable builder for constructing an instance of
                             * [ChatCompletionThinkingBlock].
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [ChatCompletionThinkingBlock]. */
                        class Builder internal constructor() {

                            private var type: JsonValue = JsonValue.from("thinking")
                            private var cacheControl: JsonField<CacheControl> = JsonMissing.of()
                            private var signature: JsonField<String> = JsonMissing.of()
                            private var thinking: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(
                                chatCompletionThinkingBlock: ChatCompletionThinkingBlock
                            ) = apply {
                                type = chatCompletionThinkingBlock.type
                                cacheControl = chatCompletionThinkingBlock.cacheControl
                                signature = chatCompletionThinkingBlock.signature
                                thinking = chatCompletionThinkingBlock.thinking
                                additionalProperties =
                                    chatCompletionThinkingBlock.additionalProperties.toMutableMap()
                            }

                            /**
                             * Sets the field to an arbitrary JSON value.
                             *
                             * It is usually unnecessary to call this method because the field
                             * defaults to the following:
                             * ```kotlin
                             * JsonValue.from("thinking")
                             * ```
                             *
                             * This method is primarily for setting the field to an undocumented or
                             * not yet supported value.
                             */
                            fun type(type: JsonValue) = apply { this.type = type }

                            fun cacheControl(cacheControl: CacheControl?) =
                                cacheControl(JsonField.ofNullable(cacheControl))

                            /**
                             * Sets [Builder.cacheControl] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.cacheControl] with a well-typed
                             * [CacheControl] value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
                             */
                            fun cacheControl(cacheControl: JsonField<CacheControl>) = apply {
                                this.cacheControl = cacheControl
                            }

                            /**
                             * Alias for calling [cacheControl] with
                             * `CacheControl.ofUnionMember0(unionMember0)`.
                             */
                            fun cacheControl(unionMember0: CacheControl.UnionMember0) =
                                cacheControl(CacheControl.ofUnionMember0(unionMember0))

                            /**
                             * Alias for calling [cacheControl] with
                             * `CacheControl.ofChatCompletionCachedContent()`.
                             */
                            fun cacheControlChatCompletionCachedContent() =
                                cacheControl(CacheControl.ofChatCompletionCachedContent())

                            fun signature(signature: String) = signature(JsonField.of(signature))

                            /**
                             * Sets [Builder.signature] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.signature] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun signature(signature: JsonField<String>) = apply {
                                this.signature = signature
                            }

                            fun thinking(thinking: String) = thinking(JsonField.of(thinking))

                            /**
                             * Sets [Builder.thinking] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.thinking] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun thinking(thinking: JsonField<String>) = apply {
                                this.thinking = thinking
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [ChatCompletionThinkingBlock].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): ChatCompletionThinkingBlock =
                                ChatCompletionThinkingBlock(
                                    type,
                                    cacheControl,
                                    signature,
                                    thinking,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): ChatCompletionThinkingBlock = apply {
                            if (validated) {
                                return@apply
                            }

                            _type().let {
                                if (it != JsonValue.from("thinking")) {
                                    throw HanzoInvalidDataException(
                                        "'type' is invalid, received $it"
                                    )
                                }
                            }
                            cacheControl()?.validate()
                            signature()
                            thinking()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            type.let { if (it == JsonValue.from("thinking")) 1 else 0 } +
                                (cacheControl.asKnown()?.validity() ?: 0) +
                                (if (signature.asKnown() == null) 0 else 1) +
                                (if (thinking.asKnown() == null) 0 else 1)

                        @JsonDeserialize(using = CacheControl.Deserializer::class)
                        @JsonSerialize(using = CacheControl.Serializer::class)
                        class CacheControl
                        private constructor(
                            private val unionMember0: UnionMember0? = null,
                            private val chatCompletionCachedContent: JsonValue? = null,
                            private val _json: JsonValue? = null,
                        ) {

                            fun unionMember0(): UnionMember0? = unionMember0

                            fun chatCompletionCachedContent(): JsonValue? =
                                chatCompletionCachedContent

                            fun isUnionMember0(): Boolean = unionMember0 != null

                            fun isChatCompletionCachedContent(): Boolean =
                                chatCompletionCachedContent != null

                            fun asUnionMember0(): UnionMember0 =
                                unionMember0.getOrThrow("unionMember0")

                            fun asChatCompletionCachedContent(): JsonValue =
                                chatCompletionCachedContent.getOrThrow(
                                    "chatCompletionCachedContent"
                                )

                            fun _json(): JsonValue? = _json

                            fun <T> accept(visitor: Visitor<T>): T =
                                when {
                                    unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                                    chatCompletionCachedContent != null ->
                                        visitor.visitChatCompletionCachedContent(
                                            chatCompletionCachedContent
                                        )
                                    else -> visitor.unknown(_json)
                                }

                            private var validated: Boolean = false

                            fun validate(): CacheControl = apply {
                                if (validated) {
                                    return@apply
                                }

                                accept(
                                    object : Visitor<Unit> {
                                        override fun visitUnionMember0(unionMember0: UnionMember0) {
                                            unionMember0.validate()
                                        }

                                        override fun visitChatCompletionCachedContent(
                                            chatCompletionCachedContent: JsonValue
                                        ) {
                                            chatCompletionCachedContent.let {
                                                if (
                                                    it !=
                                                        JsonValue.from(mapOf("type" to "ephemeral"))
                                                ) {
                                                    throw HanzoInvalidDataException(
                                                        "'chatCompletionCachedContent' is invalid, received $it"
                                                    )
                                                }
                                            }
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                accept(
                                    object : Visitor<Int> {
                                        override fun visitUnionMember0(unionMember0: UnionMember0) =
                                            unionMember0.validity()

                                        override fun visitChatCompletionCachedContent(
                                            chatCompletionCachedContent: JsonValue
                                        ) =
                                            chatCompletionCachedContent.let {
                                                if (
                                                    it ==
                                                        JsonValue.from(mapOf("type" to "ephemeral"))
                                                )
                                                    1
                                                else 0
                                            }

                                        override fun unknown(json: JsonValue?) = 0
                                    }
                                )

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is CacheControl &&
                                    unionMember0 == other.unionMember0 &&
                                    chatCompletionCachedContent == other.chatCompletionCachedContent
                            }

                            override fun hashCode(): Int =
                                Objects.hash(unionMember0, chatCompletionCachedContent)

                            override fun toString(): String =
                                when {
                                    unionMember0 != null ->
                                        "CacheControl{unionMember0=$unionMember0}"
                                    chatCompletionCachedContent != null ->
                                        "CacheControl{chatCompletionCachedContent=$chatCompletionCachedContent}"
                                    _json != null -> "CacheControl{_unknown=$_json}"
                                    else -> throw IllegalStateException("Invalid CacheControl")
                                }

                            companion object {

                                fun ofUnionMember0(unionMember0: UnionMember0) =
                                    CacheControl(unionMember0 = unionMember0)

                                fun ofChatCompletionCachedContent() =
                                    CacheControl(
                                        chatCompletionCachedContent =
                                            JsonValue.from(mapOf("type" to "ephemeral"))
                                    )
                            }

                            /**
                             * An interface that defines how to map each variant of [CacheControl]
                             * to a value of type [T].
                             */
                            interface Visitor<out T> {

                                fun visitUnionMember0(unionMember0: UnionMember0): T

                                fun visitChatCompletionCachedContent(
                                    chatCompletionCachedContent: JsonValue
                                ): T

                                /**
                                 * Maps an unknown variant of [CacheControl] to a value of type [T].
                                 *
                                 * An instance of [CacheControl] can contain an unknown variant if
                                 * it was deserialized from data that doesn't match any known
                                 * variant. For example, if the SDK is on an older version than the
                                 * API, then the API may respond with new variants that the SDK is
                                 * unaware of.
                                 *
                                 * @throws HanzoInvalidDataException in the default implementation.
                                 */
                                fun unknown(json: JsonValue?): T {
                                    throw HanzoInvalidDataException("Unknown CacheControl: $json")
                                }
                            }

                            internal class Deserializer :
                                BaseDeserializer<CacheControl>(CacheControl::class) {

                                override fun ObjectCodec.deserialize(node: JsonNode): CacheControl {
                                    val json = JsonValue.fromJsonNode(node)

                                    val bestMatches =
                                        sequenceOf(
                                                tryDeserialize(node, jacksonTypeRef<JsonValue>())
                                                    ?.let {
                                                        CacheControl(
                                                            chatCompletionCachedContent = it,
                                                            _json = json,
                                                        )
                                                    }
                                                    ?.takeIf { it.isValid() },
                                                tryDeserialize(node, jacksonTypeRef<UnionMember0>())
                                                    ?.let {
                                                        CacheControl(
                                                            unionMember0 = it,
                                                            _json = json,
                                                        )
                                                    },
                                            )
                                            .filterNotNull()
                                            .allMaxBy { it.validity() }
                                            .toList()
                                    return when (bestMatches.size) {
                                        // This can happen if what we're deserializing is completely
                                        // incompatible with all the possible variants (e.g.
                                        // deserializing from boolean).
                                        0 -> CacheControl(_json = json)
                                        1 -> bestMatches.single()
                                        // If there's more than one match with the highest validity,
                                        // then use the first completely valid match, or simply the
                                        // first match if none are completely valid.
                                        else ->
                                            bestMatches.firstOrNull { it.isValid() }
                                                ?: bestMatches.first()
                                    }
                                }
                            }

                            internal class Serializer :
                                BaseSerializer<CacheControl>(CacheControl::class) {

                                override fun serialize(
                                    value: CacheControl,
                                    generator: JsonGenerator,
                                    provider: SerializerProvider,
                                ) {
                                    when {
                                        value.unionMember0 != null ->
                                            generator.writeObject(value.unionMember0)
                                        value.chatCompletionCachedContent != null ->
                                            generator.writeObject(value.chatCompletionCachedContent)
                                        value._json != null -> generator.writeObject(value._json)
                                        else -> throw IllegalStateException("Invalid CacheControl")
                                    }
                                }
                            }

                            class UnionMember0
                            @JsonCreator
                            private constructor(
                                @com.fasterxml.jackson.annotation.JsonValue
                                private val additionalProperties: Map<String, JsonValue>
                            ) {

                                @JsonAnyGetter
                                @ExcludeMissing
                                fun _additionalProperties(): Map<String, JsonValue> =
                                    additionalProperties

                                fun toBuilder() = Builder().from(this)

                                companion object {

                                    /**
                                     * Returns a mutable builder for constructing an instance of
                                     * [UnionMember0].
                                     */
                                    fun builder() = Builder()
                                }

                                /** A builder for [UnionMember0]. */
                                class Builder internal constructor() {

                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    internal fun from(unionMember0: UnionMember0) = apply {
                                        additionalProperties =
                                            unionMember0.additionalProperties.toMutableMap()
                                    }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [UnionMember0].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     */
                                    fun build(): UnionMember0 =
                                        UnionMember0(additionalProperties.toImmutable())
                                }

                                private var validated: Boolean = false

                                fun validate(): UnionMember0 = apply {
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                internal fun validity(): Int =
                                    additionalProperties.count { (_, value) ->
                                        !value.isNull() && !value.isMissing()
                                    }

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is UnionMember0 &&
                                        additionalProperties == other.additionalProperties
                                }

                                private val hashCode: Int by lazy {
                                    Objects.hash(additionalProperties)
                                }

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "UnionMember0{additionalProperties=$additionalProperties}"
                            }
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ChatCompletionThinkingBlock &&
                                type == other.type &&
                                cacheControl == other.cacheControl &&
                                signature == other.signature &&
                                thinking == other.thinking &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(
                                type,
                                cacheControl,
                                signature,
                                thinking,
                                additionalProperties,
                            )
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "ChatCompletionThinkingBlock{type=$type, cacheControl=$cacheControl, signature=$signature, thinking=$thinking, additionalProperties=$additionalProperties}"
                    }
                }
            }

            class FunctionCall
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val arguments: JsonField<String>,
                private val name: JsonField<String>,
                private val providerSpecificFields: JsonField<ProviderSpecificFields>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("arguments")
                    @ExcludeMissing
                    arguments: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("provider_specific_fields")
                    @ExcludeMissing
                    providerSpecificFields: JsonField<ProviderSpecificFields> = JsonMissing.of(),
                ) : this(arguments, name, providerSpecificFields, mutableMapOf())

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun arguments(): String? = arguments.getNullable("arguments")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun name(): String? = name.getNullable("name")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun providerSpecificFields(): ProviderSpecificFields? =
                    providerSpecificFields.getNullable("provider_specific_fields")

                /**
                 * Returns the raw JSON value of [arguments].
                 *
                 * Unlike [arguments], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("arguments")
                @ExcludeMissing
                fun _arguments(): JsonField<String> = arguments

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [providerSpecificFields].
                 *
                 * Unlike [providerSpecificFields], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("provider_specific_fields")
                @ExcludeMissing
                fun _providerSpecificFields(): JsonField<ProviderSpecificFields> =
                    providerSpecificFields

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

                    /** Returns a mutable builder for constructing an instance of [FunctionCall]. */
                    fun builder() = Builder()
                }

                /** A builder for [FunctionCall]. */
                class Builder internal constructor() {

                    private var arguments: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var providerSpecificFields: JsonField<ProviderSpecificFields> =
                        JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(functionCall: FunctionCall) = apply {
                        arguments = functionCall.arguments
                        name = functionCall.name
                        providerSpecificFields = functionCall.providerSpecificFields
                        additionalProperties = functionCall.additionalProperties.toMutableMap()
                    }

                    fun arguments(arguments: String) = arguments(JsonField.of(arguments))

                    /**
                     * Sets [Builder.arguments] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.arguments] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun arguments(arguments: JsonField<String>) = apply {
                        this.arguments = arguments
                    }

                    fun name(name: String?) = name(JsonField.ofNullable(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun providerSpecificFields(providerSpecificFields: ProviderSpecificFields?) =
                        providerSpecificFields(JsonField.ofNullable(providerSpecificFields))

                    /**
                     * Sets [Builder.providerSpecificFields] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.providerSpecificFields] with a well-typed
                     * [ProviderSpecificFields] value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun providerSpecificFields(
                        providerSpecificFields: JsonField<ProviderSpecificFields>
                    ) = apply { this.providerSpecificFields = providerSpecificFields }

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
                     * Returns an immutable instance of [FunctionCall].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): FunctionCall =
                        FunctionCall(
                            arguments,
                            name,
                            providerSpecificFields,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): FunctionCall = apply {
                    if (validated) {
                        return@apply
                    }

                    arguments()
                    name()
                    providerSpecificFields()?.validate()
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
                    (if (arguments.asKnown() == null) 0 else 1) +
                        (if (name.asKnown() == null) 0 else 1) +
                        (providerSpecificFields.asKnown()?.validity() ?: 0)

                class ProviderSpecificFields
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

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [ProviderSpecificFields].
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [ProviderSpecificFields]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(providerSpecificFields: ProviderSpecificFields) = apply {
                            additionalProperties =
                                providerSpecificFields.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [ProviderSpecificFields].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): ProviderSpecificFields =
                            ProviderSpecificFields(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): ProviderSpecificFields = apply {
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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ProviderSpecificFields &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "ProviderSpecificFields{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is FunctionCall &&
                        arguments == other.arguments &&
                        name == other.name &&
                        providerSpecificFields == other.providerSpecificFields &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(arguments, name, providerSpecificFields, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "FunctionCall{arguments=$arguments, name=$name, providerSpecificFields=$providerSpecificFields, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(using = ThinkingBlock.Deserializer::class)
            @JsonSerialize(using = ThinkingBlock.Serializer::class)
            class ThinkingBlock
            private constructor(
                private val chatCompletion: ChatCompletionThinkingBlock? = null,
                private val chatCompletionRedacted: ChatCompletionRedactedThinkingBlock? = null,
                private val _json: JsonValue? = null,
            ) {

                fun chatCompletion(): ChatCompletionThinkingBlock? = chatCompletion

                fun chatCompletionRedacted(): ChatCompletionRedactedThinkingBlock? =
                    chatCompletionRedacted

                fun isChatCompletion(): Boolean = chatCompletion != null

                fun isChatCompletionRedacted(): Boolean = chatCompletionRedacted != null

                fun asChatCompletion(): ChatCompletionThinkingBlock =
                    chatCompletion.getOrThrow("chatCompletion")

                fun asChatCompletionRedacted(): ChatCompletionRedactedThinkingBlock =
                    chatCompletionRedacted.getOrThrow("chatCompletionRedacted")

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        chatCompletion != null -> visitor.visitChatCompletion(chatCompletion)
                        chatCompletionRedacted != null ->
                            visitor.visitChatCompletionRedacted(chatCompletionRedacted)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): ThinkingBlock = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitChatCompletion(
                                chatCompletion: ChatCompletionThinkingBlock
                            ) {
                                chatCompletion.validate()
                            }

                            override fun visitChatCompletionRedacted(
                                chatCompletionRedacted: ChatCompletionRedactedThinkingBlock
                            ) {
                                chatCompletionRedacted.validate()
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
                            override fun visitChatCompletion(
                                chatCompletion: ChatCompletionThinkingBlock
                            ) = chatCompletion.validity()

                            override fun visitChatCompletionRedacted(
                                chatCompletionRedacted: ChatCompletionRedactedThinkingBlock
                            ) = chatCompletionRedacted.validity()

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ThinkingBlock &&
                        chatCompletion == other.chatCompletion &&
                        chatCompletionRedacted == other.chatCompletionRedacted
                }

                override fun hashCode(): Int = Objects.hash(chatCompletion, chatCompletionRedacted)

                override fun toString(): String =
                    when {
                        chatCompletion != null -> "ThinkingBlock{chatCompletion=$chatCompletion}"
                        chatCompletionRedacted != null ->
                            "ThinkingBlock{chatCompletionRedacted=$chatCompletionRedacted}"
                        _json != null -> "ThinkingBlock{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid ThinkingBlock")
                    }

                companion object {

                    fun ofChatCompletion(chatCompletion: ChatCompletionThinkingBlock) =
                        ThinkingBlock(chatCompletion = chatCompletion)

                    fun ofChatCompletionRedacted(
                        chatCompletionRedacted: ChatCompletionRedactedThinkingBlock
                    ) = ThinkingBlock(chatCompletionRedacted = chatCompletionRedacted)
                }

                /**
                 * An interface that defines how to map each variant of [ThinkingBlock] to a value
                 * of type [T].
                 */
                interface Visitor<out T> {

                    fun visitChatCompletion(chatCompletion: ChatCompletionThinkingBlock): T

                    fun visitChatCompletionRedacted(
                        chatCompletionRedacted: ChatCompletionRedactedThinkingBlock
                    ): T

                    /**
                     * Maps an unknown variant of [ThinkingBlock] to a value of type [T].
                     *
                     * An instance of [ThinkingBlock] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws HanzoInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw HanzoInvalidDataException("Unknown ThinkingBlock: $json")
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<ThinkingBlock>(ThinkingBlock::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): ThinkingBlock {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<ChatCompletionThinkingBlock>(),
                                        )
                                        ?.let { ThinkingBlock(chatCompletion = it, _json = json) },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<ChatCompletionRedactedThinkingBlock>(),
                                        )
                                        ?.let {
                                            ThinkingBlock(chatCompletionRedacted = it, _json = json)
                                        },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> ThinkingBlock(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<ThinkingBlock>(ThinkingBlock::class) {

                    override fun serialize(
                        value: ThinkingBlock,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.chatCompletion != null ->
                                generator.writeObject(value.chatCompletion)
                            value.chatCompletionRedacted != null ->
                                generator.writeObject(value.chatCompletionRedacted)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid ThinkingBlock")
                        }
                    }
                }

                class ChatCompletionThinkingBlock
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val type: JsonValue,
                    private val cacheControl: JsonField<CacheControl>,
                    private val signature: JsonField<String>,
                    private val thinking: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                        @JsonProperty("cache_control")
                        @ExcludeMissing
                        cacheControl: JsonField<CacheControl> = JsonMissing.of(),
                        @JsonProperty("signature")
                        @ExcludeMissing
                        signature: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("thinking")
                        @ExcludeMissing
                        thinking: JsonField<String> = JsonMissing.of(),
                    ) : this(type, cacheControl, signature, thinking, mutableMapOf())

                    /**
                     * Expected to always return the following:
                     * ```kotlin
                     * JsonValue.from("thinking")
                     * ```
                     *
                     * However, this method can be useful for debugging and logging (e.g. if the
                     * server responded with an unexpected value).
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                    /**
                     * @throws HanzoInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun cacheControl(): CacheControl? = cacheControl.getNullable("cache_control")

                    /**
                     * @throws HanzoInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun signature(): String? = signature.getNullable("signature")

                    /**
                     * @throws HanzoInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun thinking(): String? = thinking.getNullable("thinking")

                    /**
                     * Returns the raw JSON value of [cacheControl].
                     *
                     * Unlike [cacheControl], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("cache_control")
                    @ExcludeMissing
                    fun _cacheControl(): JsonField<CacheControl> = cacheControl

                    /**
                     * Returns the raw JSON value of [signature].
                     *
                     * Unlike [signature], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("signature")
                    @ExcludeMissing
                    fun _signature(): JsonField<String> = signature

                    /**
                     * Returns the raw JSON value of [thinking].
                     *
                     * Unlike [thinking], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("thinking")
                    @ExcludeMissing
                    fun _thinking(): JsonField<String> = thinking

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
                         * Returns a mutable builder for constructing an instance of
                         * [ChatCompletionThinkingBlock].
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [ChatCompletionThinkingBlock]. */
                    class Builder internal constructor() {

                        private var type: JsonValue = JsonValue.from("thinking")
                        private var cacheControl: JsonField<CacheControl> = JsonMissing.of()
                        private var signature: JsonField<String> = JsonMissing.of()
                        private var thinking: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            chatCompletionThinkingBlock: ChatCompletionThinkingBlock
                        ) = apply {
                            type = chatCompletionThinkingBlock.type
                            cacheControl = chatCompletionThinkingBlock.cacheControl
                            signature = chatCompletionThinkingBlock.signature
                            thinking = chatCompletionThinkingBlock.thinking
                            additionalProperties =
                                chatCompletionThinkingBlock.additionalProperties.toMutableMap()
                        }

                        /**
                         * Sets the field to an arbitrary JSON value.
                         *
                         * It is usually unnecessary to call this method because the field defaults
                         * to the following:
                         * ```kotlin
                         * JsonValue.from("thinking")
                         * ```
                         *
                         * This method is primarily for setting the field to an undocumented or not
                         * yet supported value.
                         */
                        fun type(type: JsonValue) = apply { this.type = type }

                        fun cacheControl(cacheControl: CacheControl?) =
                            cacheControl(JsonField.ofNullable(cacheControl))

                        /**
                         * Sets [Builder.cacheControl] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.cacheControl] with a well-typed
                         * [CacheControl] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun cacheControl(cacheControl: JsonField<CacheControl>) = apply {
                            this.cacheControl = cacheControl
                        }

                        /**
                         * Alias for calling [cacheControl] with
                         * `CacheControl.ofUnionMember0(unionMember0)`.
                         */
                        fun cacheControl(unionMember0: CacheControl.UnionMember0) =
                            cacheControl(CacheControl.ofUnionMember0(unionMember0))

                        /**
                         * Alias for calling [cacheControl] with
                         * `CacheControl.ofChatCompletionCachedContent()`.
                         */
                        fun cacheControlChatCompletionCachedContent() =
                            cacheControl(CacheControl.ofChatCompletionCachedContent())

                        fun signature(signature: String) = signature(JsonField.of(signature))

                        /**
                         * Sets [Builder.signature] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.signature] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun signature(signature: JsonField<String>) = apply {
                            this.signature = signature
                        }

                        fun thinking(thinking: String) = thinking(JsonField.of(thinking))

                        /**
                         * Sets [Builder.thinking] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.thinking] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun thinking(thinking: JsonField<String>) = apply {
                            this.thinking = thinking
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [ChatCompletionThinkingBlock].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): ChatCompletionThinkingBlock =
                            ChatCompletionThinkingBlock(
                                type,
                                cacheControl,
                                signature,
                                thinking,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): ChatCompletionThinkingBlock = apply {
                        if (validated) {
                            return@apply
                        }

                        _type().let {
                            if (it != JsonValue.from("thinking")) {
                                throw HanzoInvalidDataException("'type' is invalid, received $it")
                            }
                        }
                        cacheControl()?.validate()
                        signature()
                        thinking()
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
                        type.let { if (it == JsonValue.from("thinking")) 1 else 0 } +
                            (cacheControl.asKnown()?.validity() ?: 0) +
                            (if (signature.asKnown() == null) 0 else 1) +
                            (if (thinking.asKnown() == null) 0 else 1)

                    @JsonDeserialize(using = CacheControl.Deserializer::class)
                    @JsonSerialize(using = CacheControl.Serializer::class)
                    class CacheControl
                    private constructor(
                        private val unionMember0: UnionMember0? = null,
                        private val chatCompletionCachedContent: JsonValue? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        fun unionMember0(): UnionMember0? = unionMember0

                        fun chatCompletionCachedContent(): JsonValue? = chatCompletionCachedContent

                        fun isUnionMember0(): Boolean = unionMember0 != null

                        fun isChatCompletionCachedContent(): Boolean =
                            chatCompletionCachedContent != null

                        fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

                        fun asChatCompletionCachedContent(): JsonValue =
                            chatCompletionCachedContent.getOrThrow("chatCompletionCachedContent")

                        fun _json(): JsonValue? = _json

                        fun <T> accept(visitor: Visitor<T>): T =
                            when {
                                unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                                chatCompletionCachedContent != null ->
                                    visitor.visitChatCompletionCachedContent(
                                        chatCompletionCachedContent
                                    )
                                else -> visitor.unknown(_json)
                            }

                        private var validated: Boolean = false

                        fun validate(): CacheControl = apply {
                            if (validated) {
                                return@apply
                            }

                            accept(
                                object : Visitor<Unit> {
                                    override fun visitUnionMember0(unionMember0: UnionMember0) {
                                        unionMember0.validate()
                                    }

                                    override fun visitChatCompletionCachedContent(
                                        chatCompletionCachedContent: JsonValue
                                    ) {
                                        chatCompletionCachedContent.let {
                                            if (
                                                it != JsonValue.from(mapOf("type" to "ephemeral"))
                                            ) {
                                                throw HanzoInvalidDataException(
                                                    "'chatCompletionCachedContent' is invalid, received $it"
                                                )
                                            }
                                        }
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            accept(
                                object : Visitor<Int> {
                                    override fun visitUnionMember0(unionMember0: UnionMember0) =
                                        unionMember0.validity()

                                    override fun visitChatCompletionCachedContent(
                                        chatCompletionCachedContent: JsonValue
                                    ) =
                                        chatCompletionCachedContent.let {
                                            if (it == JsonValue.from(mapOf("type" to "ephemeral")))
                                                1
                                            else 0
                                        }

                                    override fun unknown(json: JsonValue?) = 0
                                }
                            )

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is CacheControl &&
                                unionMember0 == other.unionMember0 &&
                                chatCompletionCachedContent == other.chatCompletionCachedContent
                        }

                        override fun hashCode(): Int =
                            Objects.hash(unionMember0, chatCompletionCachedContent)

                        override fun toString(): String =
                            when {
                                unionMember0 != null -> "CacheControl{unionMember0=$unionMember0}"
                                chatCompletionCachedContent != null ->
                                    "CacheControl{chatCompletionCachedContent=$chatCompletionCachedContent}"
                                _json != null -> "CacheControl{_unknown=$_json}"
                                else -> throw IllegalStateException("Invalid CacheControl")
                            }

                        companion object {

                            fun ofUnionMember0(unionMember0: UnionMember0) =
                                CacheControl(unionMember0 = unionMember0)

                            fun ofChatCompletionCachedContent() =
                                CacheControl(
                                    chatCompletionCachedContent =
                                        JsonValue.from(mapOf("type" to "ephemeral"))
                                )
                        }

                        /**
                         * An interface that defines how to map each variant of [CacheControl] to a
                         * value of type [T].
                         */
                        interface Visitor<out T> {

                            fun visitUnionMember0(unionMember0: UnionMember0): T

                            fun visitChatCompletionCachedContent(
                                chatCompletionCachedContent: JsonValue
                            ): T

                            /**
                             * Maps an unknown variant of [CacheControl] to a value of type [T].
                             *
                             * An instance of [CacheControl] can contain an unknown variant if it
                             * was deserialized from data that doesn't match any known variant. For
                             * example, if the SDK is on an older version than the API, then the API
                             * may respond with new variants that the SDK is unaware of.
                             *
                             * @throws HanzoInvalidDataException in the default implementation.
                             */
                            fun unknown(json: JsonValue?): T {
                                throw HanzoInvalidDataException("Unknown CacheControl: $json")
                            }
                        }

                        internal class Deserializer :
                            BaseDeserializer<CacheControl>(CacheControl::class) {

                            override fun ObjectCodec.deserialize(node: JsonNode): CacheControl {
                                val json = JsonValue.fromJsonNode(node)

                                val bestMatches =
                                    sequenceOf(
                                            tryDeserialize(node, jacksonTypeRef<JsonValue>())
                                                ?.let {
                                                    CacheControl(
                                                        chatCompletionCachedContent = it,
                                                        _json = json,
                                                    )
                                                }
                                                ?.takeIf { it.isValid() },
                                            tryDeserialize(node, jacksonTypeRef<UnionMember0>())
                                                ?.let {
                                                    CacheControl(unionMember0 = it, _json = json)
                                                },
                                        )
                                        .filterNotNull()
                                        .allMaxBy { it.validity() }
                                        .toList()
                                return when (bestMatches.size) {
                                    // This can happen if what we're deserializing is completely
                                    // incompatible with all the possible variants (e.g.
                                    // deserializing from boolean).
                                    0 -> CacheControl(_json = json)
                                    1 -> bestMatches.single()
                                    // If there's more than one match with the highest validity,
                                    // then use the first completely valid match, or simply the
                                    // first match if none are completely valid.
                                    else ->
                                        bestMatches.firstOrNull { it.isValid() }
                                            ?: bestMatches.first()
                                }
                            }
                        }

                        internal class Serializer :
                            BaseSerializer<CacheControl>(CacheControl::class) {

                            override fun serialize(
                                value: CacheControl,
                                generator: JsonGenerator,
                                provider: SerializerProvider,
                            ) {
                                when {
                                    value.unionMember0 != null ->
                                        generator.writeObject(value.unionMember0)
                                    value.chatCompletionCachedContent != null ->
                                        generator.writeObject(value.chatCompletionCachedContent)
                                    value._json != null -> generator.writeObject(value._json)
                                    else -> throw IllegalStateException("Invalid CacheControl")
                                }
                            }
                        }

                        class UnionMember0
                        @JsonCreator
                        private constructor(
                            @com.fasterxml.jackson.annotation.JsonValue
                            private val additionalProperties: Map<String, JsonValue>
                        ) {

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            fun toBuilder() = Builder().from(this)

                            companion object {

                                /**
                                 * Returns a mutable builder for constructing an instance of
                                 * [UnionMember0].
                                 */
                                fun builder() = Builder()
                            }

                            /** A builder for [UnionMember0]. */
                            class Builder internal constructor() {

                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(unionMember0: UnionMember0) = apply {
                                    additionalProperties =
                                        unionMember0.additionalProperties.toMutableMap()
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [UnionMember0].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 */
                                fun build(): UnionMember0 =
                                    UnionMember0(additionalProperties.toImmutable())
                            }

                            private var validated: Boolean = false

                            fun validate(): UnionMember0 = apply {
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                additionalProperties.count { (_, value) ->
                                    !value.isNull() && !value.isMissing()
                                }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is UnionMember0 &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "UnionMember0{additionalProperties=$additionalProperties}"
                        }
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ChatCompletionThinkingBlock &&
                            type == other.type &&
                            cacheControl == other.cacheControl &&
                            signature == other.signature &&
                            thinking == other.thinking &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(type, cacheControl, signature, thinking, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "ChatCompletionThinkingBlock{type=$type, cacheControl=$cacheControl, signature=$signature, thinking=$thinking, additionalProperties=$additionalProperties}"
                }

                class ChatCompletionRedactedThinkingBlock
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val type: JsonValue,
                    private val cacheControl: JsonField<CacheControl>,
                    private val data: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                        @JsonProperty("cache_control")
                        @ExcludeMissing
                        cacheControl: JsonField<CacheControl> = JsonMissing.of(),
                        @JsonProperty("data")
                        @ExcludeMissing
                        data: JsonField<String> = JsonMissing.of(),
                    ) : this(type, cacheControl, data, mutableMapOf())

                    /**
                     * Expected to always return the following:
                     * ```kotlin
                     * JsonValue.from("redacted_thinking")
                     * ```
                     *
                     * However, this method can be useful for debugging and logging (e.g. if the
                     * server responded with an unexpected value).
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                    /**
                     * @throws HanzoInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun cacheControl(): CacheControl? = cacheControl.getNullable("cache_control")

                    /**
                     * @throws HanzoInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun data(): String? = data.getNullable("data")

                    /**
                     * Returns the raw JSON value of [cacheControl].
                     *
                     * Unlike [cacheControl], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("cache_control")
                    @ExcludeMissing
                    fun _cacheControl(): JsonField<CacheControl> = cacheControl

                    /**
                     * Returns the raw JSON value of [data].
                     *
                     * Unlike [data], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<String> = data

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
                         * Returns a mutable builder for constructing an instance of
                         * [ChatCompletionRedactedThinkingBlock].
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [ChatCompletionRedactedThinkingBlock]. */
                    class Builder internal constructor() {

                        private var type: JsonValue = JsonValue.from("redacted_thinking")
                        private var cacheControl: JsonField<CacheControl> = JsonMissing.of()
                        private var data: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            chatCompletionRedactedThinkingBlock: ChatCompletionRedactedThinkingBlock
                        ) = apply {
                            type = chatCompletionRedactedThinkingBlock.type
                            cacheControl = chatCompletionRedactedThinkingBlock.cacheControl
                            data = chatCompletionRedactedThinkingBlock.data
                            additionalProperties =
                                chatCompletionRedactedThinkingBlock.additionalProperties
                                    .toMutableMap()
                        }

                        /**
                         * Sets the field to an arbitrary JSON value.
                         *
                         * It is usually unnecessary to call this method because the field defaults
                         * to the following:
                         * ```kotlin
                         * JsonValue.from("redacted_thinking")
                         * ```
                         *
                         * This method is primarily for setting the field to an undocumented or not
                         * yet supported value.
                         */
                        fun type(type: JsonValue) = apply { this.type = type }

                        fun cacheControl(cacheControl: CacheControl?) =
                            cacheControl(JsonField.ofNullable(cacheControl))

                        /**
                         * Sets [Builder.cacheControl] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.cacheControl] with a well-typed
                         * [CacheControl] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun cacheControl(cacheControl: JsonField<CacheControl>) = apply {
                            this.cacheControl = cacheControl
                        }

                        /**
                         * Alias for calling [cacheControl] with
                         * `CacheControl.ofUnionMember0(unionMember0)`.
                         */
                        fun cacheControl(unionMember0: CacheControl.UnionMember0) =
                            cacheControl(CacheControl.ofUnionMember0(unionMember0))

                        /**
                         * Alias for calling [cacheControl] with
                         * `CacheControl.ofChatCompletionCachedContent()`.
                         */
                        fun cacheControlChatCompletionCachedContent() =
                            cacheControl(CacheControl.ofChatCompletionCachedContent())

                        fun data(data: String) = data(JsonField.of(data))

                        /**
                         * Sets [Builder.data] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.data] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun data(data: JsonField<String>) = apply { this.data = data }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [ChatCompletionRedactedThinkingBlock].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): ChatCompletionRedactedThinkingBlock =
                            ChatCompletionRedactedThinkingBlock(
                                type,
                                cacheControl,
                                data,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): ChatCompletionRedactedThinkingBlock = apply {
                        if (validated) {
                            return@apply
                        }

                        _type().let {
                            if (it != JsonValue.from("redacted_thinking")) {
                                throw HanzoInvalidDataException("'type' is invalid, received $it")
                            }
                        }
                        cacheControl()?.validate()
                        data()
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
                        type.let { if (it == JsonValue.from("redacted_thinking")) 1 else 0 } +
                            (cacheControl.asKnown()?.validity() ?: 0) +
                            (if (data.asKnown() == null) 0 else 1)

                    @JsonDeserialize(using = CacheControl.Deserializer::class)
                    @JsonSerialize(using = CacheControl.Serializer::class)
                    class CacheControl
                    private constructor(
                        private val unionMember0: UnionMember0? = null,
                        private val chatCompletionCachedContent: JsonValue? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        fun unionMember0(): UnionMember0? = unionMember0

                        fun chatCompletionCachedContent(): JsonValue? = chatCompletionCachedContent

                        fun isUnionMember0(): Boolean = unionMember0 != null

                        fun isChatCompletionCachedContent(): Boolean =
                            chatCompletionCachedContent != null

                        fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

                        fun asChatCompletionCachedContent(): JsonValue =
                            chatCompletionCachedContent.getOrThrow("chatCompletionCachedContent")

                        fun _json(): JsonValue? = _json

                        fun <T> accept(visitor: Visitor<T>): T =
                            when {
                                unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                                chatCompletionCachedContent != null ->
                                    visitor.visitChatCompletionCachedContent(
                                        chatCompletionCachedContent
                                    )
                                else -> visitor.unknown(_json)
                            }

                        private var validated: Boolean = false

                        fun validate(): CacheControl = apply {
                            if (validated) {
                                return@apply
                            }

                            accept(
                                object : Visitor<Unit> {
                                    override fun visitUnionMember0(unionMember0: UnionMember0) {
                                        unionMember0.validate()
                                    }

                                    override fun visitChatCompletionCachedContent(
                                        chatCompletionCachedContent: JsonValue
                                    ) {
                                        chatCompletionCachedContent.let {
                                            if (
                                                it != JsonValue.from(mapOf("type" to "ephemeral"))
                                            ) {
                                                throw HanzoInvalidDataException(
                                                    "'chatCompletionCachedContent' is invalid, received $it"
                                                )
                                            }
                                        }
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            accept(
                                object : Visitor<Int> {
                                    override fun visitUnionMember0(unionMember0: UnionMember0) =
                                        unionMember0.validity()

                                    override fun visitChatCompletionCachedContent(
                                        chatCompletionCachedContent: JsonValue
                                    ) =
                                        chatCompletionCachedContent.let {
                                            if (it == JsonValue.from(mapOf("type" to "ephemeral")))
                                                1
                                            else 0
                                        }

                                    override fun unknown(json: JsonValue?) = 0
                                }
                            )

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is CacheControl &&
                                unionMember0 == other.unionMember0 &&
                                chatCompletionCachedContent == other.chatCompletionCachedContent
                        }

                        override fun hashCode(): Int =
                            Objects.hash(unionMember0, chatCompletionCachedContent)

                        override fun toString(): String =
                            when {
                                unionMember0 != null -> "CacheControl{unionMember0=$unionMember0}"
                                chatCompletionCachedContent != null ->
                                    "CacheControl{chatCompletionCachedContent=$chatCompletionCachedContent}"
                                _json != null -> "CacheControl{_unknown=$_json}"
                                else -> throw IllegalStateException("Invalid CacheControl")
                            }

                        companion object {

                            fun ofUnionMember0(unionMember0: UnionMember0) =
                                CacheControl(unionMember0 = unionMember0)

                            fun ofChatCompletionCachedContent() =
                                CacheControl(
                                    chatCompletionCachedContent =
                                        JsonValue.from(mapOf("type" to "ephemeral"))
                                )
                        }

                        /**
                         * An interface that defines how to map each variant of [CacheControl] to a
                         * value of type [T].
                         */
                        interface Visitor<out T> {

                            fun visitUnionMember0(unionMember0: UnionMember0): T

                            fun visitChatCompletionCachedContent(
                                chatCompletionCachedContent: JsonValue
                            ): T

                            /**
                             * Maps an unknown variant of [CacheControl] to a value of type [T].
                             *
                             * An instance of [CacheControl] can contain an unknown variant if it
                             * was deserialized from data that doesn't match any known variant. For
                             * example, if the SDK is on an older version than the API, then the API
                             * may respond with new variants that the SDK is unaware of.
                             *
                             * @throws HanzoInvalidDataException in the default implementation.
                             */
                            fun unknown(json: JsonValue?): T {
                                throw HanzoInvalidDataException("Unknown CacheControl: $json")
                            }
                        }

                        internal class Deserializer :
                            BaseDeserializer<CacheControl>(CacheControl::class) {

                            override fun ObjectCodec.deserialize(node: JsonNode): CacheControl {
                                val json = JsonValue.fromJsonNode(node)

                                val bestMatches =
                                    sequenceOf(
                                            tryDeserialize(node, jacksonTypeRef<JsonValue>())
                                                ?.let {
                                                    CacheControl(
                                                        chatCompletionCachedContent = it,
                                                        _json = json,
                                                    )
                                                }
                                                ?.takeIf { it.isValid() },
                                            tryDeserialize(node, jacksonTypeRef<UnionMember0>())
                                                ?.let {
                                                    CacheControl(unionMember0 = it, _json = json)
                                                },
                                        )
                                        .filterNotNull()
                                        .allMaxBy { it.validity() }
                                        .toList()
                                return when (bestMatches.size) {
                                    // This can happen if what we're deserializing is completely
                                    // incompatible with all the possible variants (e.g.
                                    // deserializing from boolean).
                                    0 -> CacheControl(_json = json)
                                    1 -> bestMatches.single()
                                    // If there's more than one match with the highest validity,
                                    // then use the first completely valid match, or simply the
                                    // first match if none are completely valid.
                                    else ->
                                        bestMatches.firstOrNull { it.isValid() }
                                            ?: bestMatches.first()
                                }
                            }
                        }

                        internal class Serializer :
                            BaseSerializer<CacheControl>(CacheControl::class) {

                            override fun serialize(
                                value: CacheControl,
                                generator: JsonGenerator,
                                provider: SerializerProvider,
                            ) {
                                when {
                                    value.unionMember0 != null ->
                                        generator.writeObject(value.unionMember0)
                                    value.chatCompletionCachedContent != null ->
                                        generator.writeObject(value.chatCompletionCachedContent)
                                    value._json != null -> generator.writeObject(value._json)
                                    else -> throw IllegalStateException("Invalid CacheControl")
                                }
                            }
                        }

                        class UnionMember0
                        @JsonCreator
                        private constructor(
                            @com.fasterxml.jackson.annotation.JsonValue
                            private val additionalProperties: Map<String, JsonValue>
                        ) {

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            fun toBuilder() = Builder().from(this)

                            companion object {

                                /**
                                 * Returns a mutable builder for constructing an instance of
                                 * [UnionMember0].
                                 */
                                fun builder() = Builder()
                            }

                            /** A builder for [UnionMember0]. */
                            class Builder internal constructor() {

                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(unionMember0: UnionMember0) = apply {
                                    additionalProperties =
                                        unionMember0.additionalProperties.toMutableMap()
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [UnionMember0].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 */
                                fun build(): UnionMember0 =
                                    UnionMember0(additionalProperties.toImmutable())
                            }

                            private var validated: Boolean = false

                            fun validate(): UnionMember0 = apply {
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                additionalProperties.count { (_, value) ->
                                    !value.isNull() && !value.isMissing()
                                }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is UnionMember0 &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "UnionMember0{additionalProperties=$additionalProperties}"
                        }
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ChatCompletionRedactedThinkingBlock &&
                            type == other.type &&
                            cacheControl == other.cacheControl &&
                            data == other.data &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(type, cacheControl, data, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "ChatCompletionRedactedThinkingBlock{type=$type, cacheControl=$cacheControl, data=$data, additionalProperties=$additionalProperties}"
                }
            }

            class ToolCall
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val function: JsonField<Function>,
                private val type: JsonValue,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("function")
                    @ExcludeMissing
                    function: JsonField<Function> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                ) : this(id, function, type, mutableMapOf())

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun id(): String? = id.getNullable("id")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun function(): Function = function.getRequired("function")

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("function")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [function].
                 *
                 * Unlike [function], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("function")
                @ExcludeMissing
                fun _function(): JsonField<Function> = function

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
                     * Returns a mutable builder for constructing an instance of [ToolCall].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .function()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [ToolCall]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var function: JsonField<Function>? = null
                    private var type: JsonValue = JsonValue.from("function")
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(toolCall: ToolCall) = apply {
                        id = toolCall.id
                        function = toolCall.function
                        type = toolCall.type
                        additionalProperties = toolCall.additionalProperties.toMutableMap()
                    }

                    fun id(id: String?) = id(JsonField.ofNullable(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun function(function: Function) = function(JsonField.of(function))

                    /**
                     * Sets [Builder.function] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.function] with a well-typed [Function] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun function(function: JsonField<Function>) = apply { this.function = function }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("function")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

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
                     * Returns an immutable instance of [ToolCall].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .function()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): ToolCall =
                        ToolCall(
                            checkRequired("id", id),
                            checkRequired("function", function),
                            type,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): ToolCall = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    function().validate()
                    _type().let {
                        if (it != JsonValue.from("function")) {
                            throw HanzoInvalidDataException("'type' is invalid, received $it")
                        }
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
                    (if (id.asKnown() == null) 0 else 1) +
                        (function.asKnown()?.validity() ?: 0) +
                        type.let { if (it == JsonValue.from("function")) 1 else 0 }

                class Function
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val arguments: JsonField<String>,
                    private val name: JsonField<String>,
                    private val providerSpecificFields: JsonField<ProviderSpecificFields>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("arguments")
                        @ExcludeMissing
                        arguments: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("name")
                        @ExcludeMissing
                        name: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("provider_specific_fields")
                        @ExcludeMissing
                        providerSpecificFields: JsonField<ProviderSpecificFields> = JsonMissing.of(),
                    ) : this(arguments, name, providerSpecificFields, mutableMapOf())

                    /**
                     * @throws HanzoInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun arguments(): String? = arguments.getNullable("arguments")

                    /**
                     * @throws HanzoInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun name(): String? = name.getNullable("name")

                    /**
                     * @throws HanzoInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun providerSpecificFields(): ProviderSpecificFields? =
                        providerSpecificFields.getNullable("provider_specific_fields")

                    /**
                     * Returns the raw JSON value of [arguments].
                     *
                     * Unlike [arguments], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("arguments")
                    @ExcludeMissing
                    fun _arguments(): JsonField<String> = arguments

                    /**
                     * Returns the raw JSON value of [name].
                     *
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                    /**
                     * Returns the raw JSON value of [providerSpecificFields].
                     *
                     * Unlike [providerSpecificFields], this method doesn't throw if the JSON field
                     * has an unexpected type.
                     */
                    @JsonProperty("provider_specific_fields")
                    @ExcludeMissing
                    fun _providerSpecificFields(): JsonField<ProviderSpecificFields> =
                        providerSpecificFields

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

                        /** Returns a mutable builder for constructing an instance of [Function]. */
                        fun builder() = Builder()
                    }

                    /** A builder for [Function]. */
                    class Builder internal constructor() {

                        private var arguments: JsonField<String> = JsonMissing.of()
                        private var name: JsonField<String> = JsonMissing.of()
                        private var providerSpecificFields: JsonField<ProviderSpecificFields> =
                            JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(function: Function) = apply {
                            arguments = function.arguments
                            name = function.name
                            providerSpecificFields = function.providerSpecificFields
                            additionalProperties = function.additionalProperties.toMutableMap()
                        }

                        fun arguments(arguments: String) = arguments(JsonField.of(arguments))

                        /**
                         * Sets [Builder.arguments] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.arguments] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun arguments(arguments: JsonField<String>) = apply {
                            this.arguments = arguments
                        }

                        fun name(name: String?) = name(JsonField.ofNullable(name))

                        /**
                         * Sets [Builder.name] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.name] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        fun providerSpecificFields(
                            providerSpecificFields: ProviderSpecificFields?
                        ) = providerSpecificFields(JsonField.ofNullable(providerSpecificFields))

                        /**
                         * Sets [Builder.providerSpecificFields] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.providerSpecificFields] with a
                         * well-typed [ProviderSpecificFields] value instead. This method is
                         * primarily for setting the field to an undocumented or not yet supported
                         * value.
                         */
                        fun providerSpecificFields(
                            providerSpecificFields: JsonField<ProviderSpecificFields>
                        ) = apply { this.providerSpecificFields = providerSpecificFields }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Function].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Function =
                            Function(
                                arguments,
                                name,
                                providerSpecificFields,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Function = apply {
                        if (validated) {
                            return@apply
                        }

                        arguments()
                        name()
                        providerSpecificFields()?.validate()
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
                        (if (arguments.asKnown() == null) 0 else 1) +
                            (if (name.asKnown() == null) 0 else 1) +
                            (providerSpecificFields.asKnown()?.validity() ?: 0)

                    class ProviderSpecificFields
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

                            /**
                             * Returns a mutable builder for constructing an instance of
                             * [ProviderSpecificFields].
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [ProviderSpecificFields]. */
                        class Builder internal constructor() {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(providerSpecificFields: ProviderSpecificFields) =
                                apply {
                                    additionalProperties =
                                        providerSpecificFields.additionalProperties.toMutableMap()
                                }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [ProviderSpecificFields].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): ProviderSpecificFields =
                                ProviderSpecificFields(additionalProperties.toImmutable())
                        }

                        private var validated: Boolean = false

                        fun validate(): ProviderSpecificFields = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            additionalProperties.count { (_, value) ->
                                !value.isNull() && !value.isMissing()
                            }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ProviderSpecificFields &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "ProviderSpecificFields{additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Function &&
                            arguments == other.arguments &&
                            name == other.name &&
                            providerSpecificFields == other.providerSpecificFields &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(arguments, name, providerSpecificFields, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Function{arguments=$arguments, name=$name, providerSpecificFields=$providerSpecificFields, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ToolCall &&
                        id == other.id &&
                        function == other.function &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(id, function, type, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ToolCall{id=$id, function=$function, type=$type, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ChatCompletionAssistantMessage &&
                    role == other.role &&
                    cacheControl == other.cacheControl &&
                    content == other.content &&
                    functionCall == other.functionCall &&
                    name == other.name &&
                    reasoningContent == other.reasoningContent &&
                    thinkingBlocks == other.thinkingBlocks &&
                    toolCalls == other.toolCalls &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    role,
                    cacheControl,
                    content,
                    functionCall,
                    name,
                    reasoningContent,
                    thinkingBlocks,
                    toolCalls,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ChatCompletionAssistantMessage{role=$role, cacheControl=$cacheControl, content=$content, functionCall=$functionCall, name=$name, reasoningContent=$reasoningContent, thinkingBlocks=$thinkingBlocks, toolCalls=$toolCalls, additionalProperties=$additionalProperties}"
        }

        class ChatCompletionToolMessage
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<Content>,
            private val role: JsonValue,
            private val toolCallId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<Content> = JsonMissing.of(),
                @JsonProperty("role") @ExcludeMissing role: JsonValue = JsonMissing.of(),
                @JsonProperty("tool_call_id")
                @ExcludeMissing
                toolCallId: JsonField<String> = JsonMissing.of(),
            ) : this(content, role, toolCallId, mutableMapOf())

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): Content = content.getRequired("content")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("tool")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("role") @ExcludeMissing fun _role(): JsonValue = role

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun toolCallId(): String = toolCallId.getRequired("tool_call_id")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

            /**
             * Returns the raw JSON value of [toolCallId].
             *
             * Unlike [toolCallId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tool_call_id")
            @ExcludeMissing
            fun _toolCallId(): JsonField<String> = toolCallId

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
                 * Returns a mutable builder for constructing an instance of
                 * [ChatCompletionToolMessage].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .content()
                 * .toolCallId()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [ChatCompletionToolMessage]. */
            class Builder internal constructor() {

                private var content: JsonField<Content>? = null
                private var role: JsonValue = JsonValue.from("tool")
                private var toolCallId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(chatCompletionToolMessage: ChatCompletionToolMessage) = apply {
                    content = chatCompletionToolMessage.content
                    role = chatCompletionToolMessage.role
                    toolCallId = chatCompletionToolMessage.toolCallId
                    additionalProperties =
                        chatCompletionToolMessage.additionalProperties.toMutableMap()
                }

                fun content(content: Content) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [Content] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<Content>) = apply { this.content = content }

                /** Alias for calling [content] with `Content.ofString(string)`. */
                fun content(string: String) = content(Content.ofString(string))

                /**
                 * Alias for calling [content] with
                 * `Content.ofChatCompletionTextObjects(chatCompletionTextObjects)`.
                 */
                fun contentOfChatCompletionTextObjects(
                    chatCompletionTextObjects: List<Content.ChatCompletionTextObject>
                ) = content(Content.ofChatCompletionTextObjects(chatCompletionTextObjects))

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("tool")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun role(role: JsonValue) = apply { this.role = role }

                fun toolCallId(toolCallId: String) = toolCallId(JsonField.of(toolCallId))

                /**
                 * Sets [Builder.toolCallId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.toolCallId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun toolCallId(toolCallId: JsonField<String>) = apply {
                    this.toolCallId = toolCallId
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
                 * Returns an immutable instance of [ChatCompletionToolMessage].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .content()
                 * .toolCallId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ChatCompletionToolMessage =
                    ChatCompletionToolMessage(
                        checkRequired("content", content),
                        role,
                        checkRequired("toolCallId", toolCallId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ChatCompletionToolMessage = apply {
                if (validated) {
                    return@apply
                }

                content().validate()
                _role().let {
                    if (it != JsonValue.from("tool")) {
                        throw HanzoInvalidDataException("'role' is invalid, received $it")
                    }
                }
                toolCallId()
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
                (content.asKnown()?.validity() ?: 0) +
                    role.let { if (it == JsonValue.from("tool")) 1 else 0 } +
                    (if (toolCallId.asKnown() == null) 0 else 1)

            @JsonDeserialize(using = Content.Deserializer::class)
            @JsonSerialize(using = Content.Serializer::class)
            class Content
            private constructor(
                private val string: String? = null,
                private val chatCompletionTextObjects: List<ChatCompletionTextObject>? = null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): String? = string

                fun chatCompletionTextObjects(): List<ChatCompletionTextObject>? =
                    chatCompletionTextObjects

                fun isString(): Boolean = string != null

                fun isChatCompletionTextObjects(): Boolean = chatCompletionTextObjects != null

                fun asString(): String = string.getOrThrow("string")

                fun asChatCompletionTextObjects(): List<ChatCompletionTextObject> =
                    chatCompletionTextObjects.getOrThrow("chatCompletionTextObjects")

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        chatCompletionTextObjects != null ->
                            visitor.visitChatCompletionTextObjects(chatCompletionTextObjects)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Content = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitString(string: String) {}

                            override fun visitChatCompletionTextObjects(
                                chatCompletionTextObjects: List<ChatCompletionTextObject>
                            ) {
                                chatCompletionTextObjects.forEach { it.validate() }
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

                            override fun visitChatCompletionTextObjects(
                                chatCompletionTextObjects: List<ChatCompletionTextObject>
                            ) = chatCompletionTextObjects.sumOf { it.validity().toInt() }

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Content &&
                        string == other.string &&
                        chatCompletionTextObjects == other.chatCompletionTextObjects
                }

                override fun hashCode(): Int = Objects.hash(string, chatCompletionTextObjects)

                override fun toString(): String =
                    when {
                        string != null -> "Content{string=$string}"
                        chatCompletionTextObjects != null ->
                            "Content{chatCompletionTextObjects=$chatCompletionTextObjects}"
                        _json != null -> "Content{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Content")
                    }

                companion object {

                    fun ofString(string: String) = Content(string = string)

                    fun ofChatCompletionTextObjects(
                        chatCompletionTextObjects: List<ChatCompletionTextObject>
                    ) = Content(chatCompletionTextObjects = chatCompletionTextObjects.toImmutable())
                }

                /**
                 * An interface that defines how to map each variant of [Content] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitChatCompletionTextObjects(
                        chatCompletionTextObjects: List<ChatCompletionTextObject>
                    ): T

                    /**
                     * Maps an unknown variant of [Content] to a value of type [T].
                     *
                     * An instance of [Content] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws HanzoInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw HanzoInvalidDataException("Unknown Content: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Content>(Content::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Content {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Content(string = it, _json = json)
                                    },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<List<ChatCompletionTextObject>>(),
                                        )
                                        ?.let {
                                            Content(chatCompletionTextObjects = it, _json = json)
                                        },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> Content(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Content>(Content::class) {

                    override fun serialize(
                        value: Content,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.chatCompletionTextObjects != null ->
                                generator.writeObject(value.chatCompletionTextObjects)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Content")
                        }
                    }
                }

                class ChatCompletionTextObject
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val text: JsonField<String>,
                    private val type: JsonValue,
                    private val cacheControl: JsonField<CacheControl>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("text")
                        @ExcludeMissing
                        text: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                        @JsonProperty("cache_control")
                        @ExcludeMissing
                        cacheControl: JsonField<CacheControl> = JsonMissing.of(),
                    ) : this(text, type, cacheControl, mutableMapOf())

                    /**
                     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun text(): String = text.getRequired("text")

                    /**
                     * Expected to always return the following:
                     * ```kotlin
                     * JsonValue.from("text")
                     * ```
                     *
                     * However, this method can be useful for debugging and logging (e.g. if the
                     * server responded with an unexpected value).
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                    /**
                     * @throws HanzoInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun cacheControl(): CacheControl? = cacheControl.getNullable("cache_control")

                    /**
                     * Returns the raw JSON value of [text].
                     *
                     * Unlike [text], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                    /**
                     * Returns the raw JSON value of [cacheControl].
                     *
                     * Unlike [cacheControl], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("cache_control")
                    @ExcludeMissing
                    fun _cacheControl(): JsonField<CacheControl> = cacheControl

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
                         * Returns a mutable builder for constructing an instance of
                         * [ChatCompletionTextObject].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .text()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [ChatCompletionTextObject]. */
                    class Builder internal constructor() {

                        private var text: JsonField<String>? = null
                        private var type: JsonValue = JsonValue.from("text")
                        private var cacheControl: JsonField<CacheControl> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(chatCompletionTextObject: ChatCompletionTextObject) =
                            apply {
                                text = chatCompletionTextObject.text
                                type = chatCompletionTextObject.type
                                cacheControl = chatCompletionTextObject.cacheControl
                                additionalProperties =
                                    chatCompletionTextObject.additionalProperties.toMutableMap()
                            }

                        fun text(text: String) = text(JsonField.of(text))

                        /**
                         * Sets [Builder.text] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.text] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun text(text: JsonField<String>) = apply { this.text = text }

                        /**
                         * Sets the field to an arbitrary JSON value.
                         *
                         * It is usually unnecessary to call this method because the field defaults
                         * to the following:
                         * ```kotlin
                         * JsonValue.from("text")
                         * ```
                         *
                         * This method is primarily for setting the field to an undocumented or not
                         * yet supported value.
                         */
                        fun type(type: JsonValue) = apply { this.type = type }

                        fun cacheControl(cacheControl: CacheControl) =
                            cacheControl(JsonField.of(cacheControl))

                        /**
                         * Sets [Builder.cacheControl] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.cacheControl] with a well-typed
                         * [CacheControl] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun cacheControl(cacheControl: JsonField<CacheControl>) = apply {
                            this.cacheControl = cacheControl
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [ChatCompletionTextObject].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .text()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): ChatCompletionTextObject =
                            ChatCompletionTextObject(
                                checkRequired("text", text),
                                type,
                                cacheControl,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): ChatCompletionTextObject = apply {
                        if (validated) {
                            return@apply
                        }

                        text()
                        _type().let {
                            if (it != JsonValue.from("text")) {
                                throw HanzoInvalidDataException("'type' is invalid, received $it")
                            }
                        }
                        cacheControl()?.validate()
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
                        (if (text.asKnown() == null) 0 else 1) +
                            type.let { if (it == JsonValue.from("text")) 1 else 0 } +
                            (cacheControl.asKnown()?.validity() ?: 0)

                    class CacheControl
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val type: JsonValue,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of()
                        ) : this(type, mutableMapOf())

                        /**
                         * Expected to always return the following:
                         * ```kotlin
                         * JsonValue.from("ephemeral")
                         * ```
                         *
                         * However, this method can be useful for debugging and logging (e.g. if the
                         * server responded with an unexpected value).
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

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
                             * Returns a mutable builder for constructing an instance of
                             * [CacheControl].
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [CacheControl]. */
                        class Builder internal constructor() {

                            private var type: JsonValue = JsonValue.from("ephemeral")
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(cacheControl: CacheControl) = apply {
                                type = cacheControl.type
                                additionalProperties =
                                    cacheControl.additionalProperties.toMutableMap()
                            }

                            /**
                             * Sets the field to an arbitrary JSON value.
                             *
                             * It is usually unnecessary to call this method because the field
                             * defaults to the following:
                             * ```kotlin
                             * JsonValue.from("ephemeral")
                             * ```
                             *
                             * This method is primarily for setting the field to an undocumented or
                             * not yet supported value.
                             */
                            fun type(type: JsonValue) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [CacheControl].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): CacheControl =
                                CacheControl(type, additionalProperties.toMutableMap())
                        }

                        private var validated: Boolean = false

                        fun validate(): CacheControl = apply {
                            if (validated) {
                                return@apply
                            }

                            _type().let {
                                if (it != JsonValue.from("ephemeral")) {
                                    throw HanzoInvalidDataException(
                                        "'type' is invalid, received $it"
                                    )
                                }
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            type.let { if (it == JsonValue.from("ephemeral")) 1 else 0 }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is CacheControl &&
                                type == other.type &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(type, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "CacheControl{type=$type, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ChatCompletionTextObject &&
                            text == other.text &&
                            type == other.type &&
                            cacheControl == other.cacheControl &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(text, type, cacheControl, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "ChatCompletionTextObject{text=$text, type=$type, cacheControl=$cacheControl, additionalProperties=$additionalProperties}"
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ChatCompletionToolMessage &&
                    content == other.content &&
                    role == other.role &&
                    toolCallId == other.toolCallId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(content, role, toolCallId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ChatCompletionToolMessage{content=$content, role=$role, toolCallId=$toolCallId, additionalProperties=$additionalProperties}"
        }

        class ChatCompletionSystemMessage
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<Content>,
            private val role: JsonValue,
            private val cacheControl: JsonField<CacheControl>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<Content> = JsonMissing.of(),
                @JsonProperty("role") @ExcludeMissing role: JsonValue = JsonMissing.of(),
                @JsonProperty("cache_control")
                @ExcludeMissing
                cacheControl: JsonField<CacheControl> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(content, role, cacheControl, name, mutableMapOf())

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): Content = content.getRequired("content")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("system")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("role") @ExcludeMissing fun _role(): JsonValue = role

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun cacheControl(): CacheControl? = cacheControl.getNullable("cache_control")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): String? = name.getNullable("name")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

            /**
             * Returns the raw JSON value of [cacheControl].
             *
             * Unlike [cacheControl], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("cache_control")
            @ExcludeMissing
            fun _cacheControl(): JsonField<CacheControl> = cacheControl

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
                 * Returns a mutable builder for constructing an instance of
                 * [ChatCompletionSystemMessage].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .content()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [ChatCompletionSystemMessage]. */
            class Builder internal constructor() {

                private var content: JsonField<Content>? = null
                private var role: JsonValue = JsonValue.from("system")
                private var cacheControl: JsonField<CacheControl> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(chatCompletionSystemMessage: ChatCompletionSystemMessage) =
                    apply {
                        content = chatCompletionSystemMessage.content
                        role = chatCompletionSystemMessage.role
                        cacheControl = chatCompletionSystemMessage.cacheControl
                        name = chatCompletionSystemMessage.name
                        additionalProperties =
                            chatCompletionSystemMessage.additionalProperties.toMutableMap()
                    }

                fun content(content: Content) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [Content] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<Content>) = apply { this.content = content }

                /** Alias for calling [content] with `Content.ofString(string)`. */
                fun content(string: String) = content(Content.ofString(string))

                /** Alias for calling [content] with `Content.ofJsonValues(jsonValues)`. */
                fun contentOfJsonValues(jsonValues: List<JsonValue>) =
                    content(Content.ofJsonValues(jsonValues))

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("system")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun role(role: JsonValue) = apply { this.role = role }

                fun cacheControl(cacheControl: CacheControl) =
                    cacheControl(JsonField.of(cacheControl))

                /**
                 * Sets [Builder.cacheControl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cacheControl] with a well-typed [CacheControl]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun cacheControl(cacheControl: JsonField<CacheControl>) = apply {
                    this.cacheControl = cacheControl
                }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
                 * Returns an immutable instance of [ChatCompletionSystemMessage].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .content()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ChatCompletionSystemMessage =
                    ChatCompletionSystemMessage(
                        checkRequired("content", content),
                        role,
                        cacheControl,
                        name,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ChatCompletionSystemMessage = apply {
                if (validated) {
                    return@apply
                }

                content().validate()
                _role().let {
                    if (it != JsonValue.from("system")) {
                        throw HanzoInvalidDataException("'role' is invalid, received $it")
                    }
                }
                cacheControl()?.validate()
                name()
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
                (content.asKnown()?.validity() ?: 0) +
                    role.let { if (it == JsonValue.from("system")) 1 else 0 } +
                    (cacheControl.asKnown()?.validity() ?: 0) +
                    (if (name.asKnown() == null) 0 else 1)

            @JsonDeserialize(using = Content.Deserializer::class)
            @JsonSerialize(using = Content.Serializer::class)
            class Content
            private constructor(
                private val string: String? = null,
                private val jsonValues: List<JsonValue>? = null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): String? = string

                fun jsonValues(): List<JsonValue>? = jsonValues

                fun isString(): Boolean = string != null

                fun isJsonValues(): Boolean = jsonValues != null

                fun asString(): String = string.getOrThrow("string")

                fun asJsonValues(): List<JsonValue> = jsonValues.getOrThrow("jsonValues")

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        jsonValues != null -> visitor.visitJsonValues(jsonValues)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Content = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitString(string: String) {}

                            override fun visitJsonValues(jsonValues: List<JsonValue>) {}
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

                            override fun visitJsonValues(jsonValues: List<JsonValue>) =
                                jsonValues.size

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Content &&
                        string == other.string &&
                        jsonValues == other.jsonValues
                }

                override fun hashCode(): Int = Objects.hash(string, jsonValues)

                override fun toString(): String =
                    when {
                        string != null -> "Content{string=$string}"
                        jsonValues != null -> "Content{jsonValues=$jsonValues}"
                        _json != null -> "Content{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Content")
                    }

                companion object {

                    fun ofString(string: String) = Content(string = string)

                    fun ofJsonValues(jsonValues: List<JsonValue>) =
                        Content(jsonValues = jsonValues.toImmutable())
                }

                /**
                 * An interface that defines how to map each variant of [Content] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitJsonValues(jsonValues: List<JsonValue>): T

                    /**
                     * Maps an unknown variant of [Content] to a value of type [T].
                     *
                     * An instance of [Content] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws HanzoInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw HanzoInvalidDataException("Unknown Content: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Content>(Content::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Content {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Content(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<List<JsonValue>>())?.let {
                                        Content(jsonValues = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> Content(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Content>(Content::class) {

                    override fun serialize(
                        value: Content,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.jsonValues != null -> generator.writeObject(value.jsonValues)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Content")
                        }
                    }
                }
            }

            class CacheControl
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val type: JsonValue,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of()
                ) : this(type, mutableMapOf())

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("ephemeral")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

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

                    /** Returns a mutable builder for constructing an instance of [CacheControl]. */
                    fun builder() = Builder()
                }

                /** A builder for [CacheControl]. */
                class Builder internal constructor() {

                    private var type: JsonValue = JsonValue.from("ephemeral")
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(cacheControl: CacheControl) = apply {
                        type = cacheControl.type
                        additionalProperties = cacheControl.additionalProperties.toMutableMap()
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("ephemeral")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

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
                     * Returns an immutable instance of [CacheControl].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): CacheControl =
                        CacheControl(type, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): CacheControl = apply {
                    if (validated) {
                        return@apply
                    }

                    _type().let {
                        if (it != JsonValue.from("ephemeral")) {
                            throw HanzoInvalidDataException("'type' is invalid, received $it")
                        }
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
                    type.let { if (it == JsonValue.from("ephemeral")) 1 else 0 }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CacheControl &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CacheControl{type=$type, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ChatCompletionSystemMessage &&
                    content == other.content &&
                    role == other.role &&
                    cacheControl == other.cacheControl &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(content, role, cacheControl, name, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ChatCompletionSystemMessage{content=$content, role=$role, cacheControl=$cacheControl, name=$name, additionalProperties=$additionalProperties}"
        }

        class ChatCompletionFunctionMessage
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<Content>,
            private val name: JsonField<String>,
            private val role: JsonValue,
            private val toolCallId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<Content> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("role") @ExcludeMissing role: JsonValue = JsonMissing.of(),
                @JsonProperty("tool_call_id")
                @ExcludeMissing
                toolCallId: JsonField<String> = JsonMissing.of(),
            ) : this(content, name, role, toolCallId, mutableMapOf())

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun content(): Content? = content.getNullable("content")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("function")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("role") @ExcludeMissing fun _role(): JsonValue = role

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun toolCallId(): String? = toolCallId.getNullable("tool_call_id")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [toolCallId].
             *
             * Unlike [toolCallId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tool_call_id")
            @ExcludeMissing
            fun _toolCallId(): JsonField<String> = toolCallId

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
                 * Returns a mutable builder for constructing an instance of
                 * [ChatCompletionFunctionMessage].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .content()
                 * .name()
                 * .toolCallId()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [ChatCompletionFunctionMessage]. */
            class Builder internal constructor() {

                private var content: JsonField<Content>? = null
                private var name: JsonField<String>? = null
                private var role: JsonValue = JsonValue.from("function")
                private var toolCallId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(chatCompletionFunctionMessage: ChatCompletionFunctionMessage) =
                    apply {
                        content = chatCompletionFunctionMessage.content
                        name = chatCompletionFunctionMessage.name
                        role = chatCompletionFunctionMessage.role
                        toolCallId = chatCompletionFunctionMessage.toolCallId
                        additionalProperties =
                            chatCompletionFunctionMessage.additionalProperties.toMutableMap()
                    }

                fun content(content: Content?) = content(JsonField.ofNullable(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [Content] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<Content>) = apply { this.content = content }

                /** Alias for calling [content] with `Content.ofString(string)`. */
                fun content(string: String) = content(Content.ofString(string))

                /**
                 * Alias for calling [content] with
                 * `Content.ofChatCompletionTextObjects(chatCompletionTextObjects)`.
                 */
                fun contentOfChatCompletionTextObjects(
                    chatCompletionTextObjects: List<Content.ChatCompletionTextObject>
                ) = content(Content.ofChatCompletionTextObjects(chatCompletionTextObjects))

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("function")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun role(role: JsonValue) = apply { this.role = role }

                fun toolCallId(toolCallId: String?) = toolCallId(JsonField.ofNullable(toolCallId))

                /**
                 * Sets [Builder.toolCallId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.toolCallId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun toolCallId(toolCallId: JsonField<String>) = apply {
                    this.toolCallId = toolCallId
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
                 * Returns an immutable instance of [ChatCompletionFunctionMessage].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .content()
                 * .name()
                 * .toolCallId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ChatCompletionFunctionMessage =
                    ChatCompletionFunctionMessage(
                        checkRequired("content", content),
                        checkRequired("name", name),
                        role,
                        checkRequired("toolCallId", toolCallId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ChatCompletionFunctionMessage = apply {
                if (validated) {
                    return@apply
                }

                content()?.validate()
                name()
                _role().let {
                    if (it != JsonValue.from("function")) {
                        throw HanzoInvalidDataException("'role' is invalid, received $it")
                    }
                }
                toolCallId()
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
                (content.asKnown()?.validity() ?: 0) +
                    (if (name.asKnown() == null) 0 else 1) +
                    role.let { if (it == JsonValue.from("function")) 1 else 0 } +
                    (if (toolCallId.asKnown() == null) 0 else 1)

            @JsonDeserialize(using = Content.Deserializer::class)
            @JsonSerialize(using = Content.Serializer::class)
            class Content
            private constructor(
                private val string: String? = null,
                private val chatCompletionTextObjects: List<ChatCompletionTextObject>? = null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): String? = string

                fun chatCompletionTextObjects(): List<ChatCompletionTextObject>? =
                    chatCompletionTextObjects

                fun isString(): Boolean = string != null

                fun isChatCompletionTextObjects(): Boolean = chatCompletionTextObjects != null

                fun asString(): String = string.getOrThrow("string")

                fun asChatCompletionTextObjects(): List<ChatCompletionTextObject> =
                    chatCompletionTextObjects.getOrThrow("chatCompletionTextObjects")

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        chatCompletionTextObjects != null ->
                            visitor.visitChatCompletionTextObjects(chatCompletionTextObjects)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Content = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitString(string: String) {}

                            override fun visitChatCompletionTextObjects(
                                chatCompletionTextObjects: List<ChatCompletionTextObject>
                            ) {
                                chatCompletionTextObjects.forEach { it.validate() }
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

                            override fun visitChatCompletionTextObjects(
                                chatCompletionTextObjects: List<ChatCompletionTextObject>
                            ) = chatCompletionTextObjects.sumOf { it.validity().toInt() }

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Content &&
                        string == other.string &&
                        chatCompletionTextObjects == other.chatCompletionTextObjects
                }

                override fun hashCode(): Int = Objects.hash(string, chatCompletionTextObjects)

                override fun toString(): String =
                    when {
                        string != null -> "Content{string=$string}"
                        chatCompletionTextObjects != null ->
                            "Content{chatCompletionTextObjects=$chatCompletionTextObjects}"
                        _json != null -> "Content{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Content")
                    }

                companion object {

                    fun ofString(string: String) = Content(string = string)

                    fun ofChatCompletionTextObjects(
                        chatCompletionTextObjects: List<ChatCompletionTextObject>
                    ) = Content(chatCompletionTextObjects = chatCompletionTextObjects.toImmutable())
                }

                /**
                 * An interface that defines how to map each variant of [Content] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitChatCompletionTextObjects(
                        chatCompletionTextObjects: List<ChatCompletionTextObject>
                    ): T

                    /**
                     * Maps an unknown variant of [Content] to a value of type [T].
                     *
                     * An instance of [Content] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws HanzoInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw HanzoInvalidDataException("Unknown Content: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Content>(Content::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Content {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Content(string = it, _json = json)
                                    },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<List<ChatCompletionTextObject>>(),
                                        )
                                        ?.let {
                                            Content(chatCompletionTextObjects = it, _json = json)
                                        },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> Content(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Content>(Content::class) {

                    override fun serialize(
                        value: Content,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.chatCompletionTextObjects != null ->
                                generator.writeObject(value.chatCompletionTextObjects)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Content")
                        }
                    }
                }

                class ChatCompletionTextObject
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val text: JsonField<String>,
                    private val type: JsonValue,
                    private val cacheControl: JsonField<CacheControl>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("text")
                        @ExcludeMissing
                        text: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                        @JsonProperty("cache_control")
                        @ExcludeMissing
                        cacheControl: JsonField<CacheControl> = JsonMissing.of(),
                    ) : this(text, type, cacheControl, mutableMapOf())

                    /**
                     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun text(): String = text.getRequired("text")

                    /**
                     * Expected to always return the following:
                     * ```kotlin
                     * JsonValue.from("text")
                     * ```
                     *
                     * However, this method can be useful for debugging and logging (e.g. if the
                     * server responded with an unexpected value).
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                    /**
                     * @throws HanzoInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun cacheControl(): CacheControl? = cacheControl.getNullable("cache_control")

                    /**
                     * Returns the raw JSON value of [text].
                     *
                     * Unlike [text], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                    /**
                     * Returns the raw JSON value of [cacheControl].
                     *
                     * Unlike [cacheControl], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("cache_control")
                    @ExcludeMissing
                    fun _cacheControl(): JsonField<CacheControl> = cacheControl

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
                         * Returns a mutable builder for constructing an instance of
                         * [ChatCompletionTextObject].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .text()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [ChatCompletionTextObject]. */
                    class Builder internal constructor() {

                        private var text: JsonField<String>? = null
                        private var type: JsonValue = JsonValue.from("text")
                        private var cacheControl: JsonField<CacheControl> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(chatCompletionTextObject: ChatCompletionTextObject) =
                            apply {
                                text = chatCompletionTextObject.text
                                type = chatCompletionTextObject.type
                                cacheControl = chatCompletionTextObject.cacheControl
                                additionalProperties =
                                    chatCompletionTextObject.additionalProperties.toMutableMap()
                            }

                        fun text(text: String) = text(JsonField.of(text))

                        /**
                         * Sets [Builder.text] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.text] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun text(text: JsonField<String>) = apply { this.text = text }

                        /**
                         * Sets the field to an arbitrary JSON value.
                         *
                         * It is usually unnecessary to call this method because the field defaults
                         * to the following:
                         * ```kotlin
                         * JsonValue.from("text")
                         * ```
                         *
                         * This method is primarily for setting the field to an undocumented or not
                         * yet supported value.
                         */
                        fun type(type: JsonValue) = apply { this.type = type }

                        fun cacheControl(cacheControl: CacheControl) =
                            cacheControl(JsonField.of(cacheControl))

                        /**
                         * Sets [Builder.cacheControl] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.cacheControl] with a well-typed
                         * [CacheControl] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun cacheControl(cacheControl: JsonField<CacheControl>) = apply {
                            this.cacheControl = cacheControl
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [ChatCompletionTextObject].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .text()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): ChatCompletionTextObject =
                            ChatCompletionTextObject(
                                checkRequired("text", text),
                                type,
                                cacheControl,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): ChatCompletionTextObject = apply {
                        if (validated) {
                            return@apply
                        }

                        text()
                        _type().let {
                            if (it != JsonValue.from("text")) {
                                throw HanzoInvalidDataException("'type' is invalid, received $it")
                            }
                        }
                        cacheControl()?.validate()
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
                        (if (text.asKnown() == null) 0 else 1) +
                            type.let { if (it == JsonValue.from("text")) 1 else 0 } +
                            (cacheControl.asKnown()?.validity() ?: 0)

                    class CacheControl
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val type: JsonValue,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of()
                        ) : this(type, mutableMapOf())

                        /**
                         * Expected to always return the following:
                         * ```kotlin
                         * JsonValue.from("ephemeral")
                         * ```
                         *
                         * However, this method can be useful for debugging and logging (e.g. if the
                         * server responded with an unexpected value).
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

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
                             * Returns a mutable builder for constructing an instance of
                             * [CacheControl].
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [CacheControl]. */
                        class Builder internal constructor() {

                            private var type: JsonValue = JsonValue.from("ephemeral")
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(cacheControl: CacheControl) = apply {
                                type = cacheControl.type
                                additionalProperties =
                                    cacheControl.additionalProperties.toMutableMap()
                            }

                            /**
                             * Sets the field to an arbitrary JSON value.
                             *
                             * It is usually unnecessary to call this method because the field
                             * defaults to the following:
                             * ```kotlin
                             * JsonValue.from("ephemeral")
                             * ```
                             *
                             * This method is primarily for setting the field to an undocumented or
                             * not yet supported value.
                             */
                            fun type(type: JsonValue) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [CacheControl].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): CacheControl =
                                CacheControl(type, additionalProperties.toMutableMap())
                        }

                        private var validated: Boolean = false

                        fun validate(): CacheControl = apply {
                            if (validated) {
                                return@apply
                            }

                            _type().let {
                                if (it != JsonValue.from("ephemeral")) {
                                    throw HanzoInvalidDataException(
                                        "'type' is invalid, received $it"
                                    )
                                }
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            type.let { if (it == JsonValue.from("ephemeral")) 1 else 0 }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is CacheControl &&
                                type == other.type &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(type, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "CacheControl{type=$type, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ChatCompletionTextObject &&
                            text == other.text &&
                            type == other.type &&
                            cacheControl == other.cacheControl &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(text, type, cacheControl, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "ChatCompletionTextObject{text=$text, type=$type, cacheControl=$cacheControl, additionalProperties=$additionalProperties}"
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ChatCompletionFunctionMessage &&
                    content == other.content &&
                    name == other.name &&
                    role == other.role &&
                    toolCallId == other.toolCallId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(content, name, role, toolCallId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ChatCompletionFunctionMessage{content=$content, name=$name, role=$role, toolCallId=$toolCallId, additionalProperties=$additionalProperties}"
        }

        class ChatCompletionDeveloperMessage
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<Content>,
            private val role: JsonValue,
            private val cacheControl: JsonField<CacheControl>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<Content> = JsonMissing.of(),
                @JsonProperty("role") @ExcludeMissing role: JsonValue = JsonMissing.of(),
                @JsonProperty("cache_control")
                @ExcludeMissing
                cacheControl: JsonField<CacheControl> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(content, role, cacheControl, name, mutableMapOf())

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): Content = content.getRequired("content")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("developer")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("role") @ExcludeMissing fun _role(): JsonValue = role

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun cacheControl(): CacheControl? = cacheControl.getNullable("cache_control")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): String? = name.getNullable("name")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

            /**
             * Returns the raw JSON value of [cacheControl].
             *
             * Unlike [cacheControl], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("cache_control")
            @ExcludeMissing
            fun _cacheControl(): JsonField<CacheControl> = cacheControl

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
                 * Returns a mutable builder for constructing an instance of
                 * [ChatCompletionDeveloperMessage].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .content()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [ChatCompletionDeveloperMessage]. */
            class Builder internal constructor() {

                private var content: JsonField<Content>? = null
                private var role: JsonValue = JsonValue.from("developer")
                private var cacheControl: JsonField<CacheControl> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(chatCompletionDeveloperMessage: ChatCompletionDeveloperMessage) =
                    apply {
                        content = chatCompletionDeveloperMessage.content
                        role = chatCompletionDeveloperMessage.role
                        cacheControl = chatCompletionDeveloperMessage.cacheControl
                        name = chatCompletionDeveloperMessage.name
                        additionalProperties =
                            chatCompletionDeveloperMessage.additionalProperties.toMutableMap()
                    }

                fun content(content: Content) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [Content] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<Content>) = apply { this.content = content }

                /** Alias for calling [content] with `Content.ofString(string)`. */
                fun content(string: String) = content(Content.ofString(string))

                /** Alias for calling [content] with `Content.ofJsonValues(jsonValues)`. */
                fun contentOfJsonValues(jsonValues: List<JsonValue>) =
                    content(Content.ofJsonValues(jsonValues))

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("developer")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun role(role: JsonValue) = apply { this.role = role }

                fun cacheControl(cacheControl: CacheControl) =
                    cacheControl(JsonField.of(cacheControl))

                /**
                 * Sets [Builder.cacheControl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cacheControl] with a well-typed [CacheControl]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun cacheControl(cacheControl: JsonField<CacheControl>) = apply {
                    this.cacheControl = cacheControl
                }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
                 * Returns an immutable instance of [ChatCompletionDeveloperMessage].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .content()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ChatCompletionDeveloperMessage =
                    ChatCompletionDeveloperMessage(
                        checkRequired("content", content),
                        role,
                        cacheControl,
                        name,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ChatCompletionDeveloperMessage = apply {
                if (validated) {
                    return@apply
                }

                content().validate()
                _role().let {
                    if (it != JsonValue.from("developer")) {
                        throw HanzoInvalidDataException("'role' is invalid, received $it")
                    }
                }
                cacheControl()?.validate()
                name()
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
                (content.asKnown()?.validity() ?: 0) +
                    role.let { if (it == JsonValue.from("developer")) 1 else 0 } +
                    (cacheControl.asKnown()?.validity() ?: 0) +
                    (if (name.asKnown() == null) 0 else 1)

            @JsonDeserialize(using = Content.Deserializer::class)
            @JsonSerialize(using = Content.Serializer::class)
            class Content
            private constructor(
                private val string: String? = null,
                private val jsonValues: List<JsonValue>? = null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): String? = string

                fun jsonValues(): List<JsonValue>? = jsonValues

                fun isString(): Boolean = string != null

                fun isJsonValues(): Boolean = jsonValues != null

                fun asString(): String = string.getOrThrow("string")

                fun asJsonValues(): List<JsonValue> = jsonValues.getOrThrow("jsonValues")

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        jsonValues != null -> visitor.visitJsonValues(jsonValues)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Content = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitString(string: String) {}

                            override fun visitJsonValues(jsonValues: List<JsonValue>) {}
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

                            override fun visitJsonValues(jsonValues: List<JsonValue>) =
                                jsonValues.size

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Content &&
                        string == other.string &&
                        jsonValues == other.jsonValues
                }

                override fun hashCode(): Int = Objects.hash(string, jsonValues)

                override fun toString(): String =
                    when {
                        string != null -> "Content{string=$string}"
                        jsonValues != null -> "Content{jsonValues=$jsonValues}"
                        _json != null -> "Content{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Content")
                    }

                companion object {

                    fun ofString(string: String) = Content(string = string)

                    fun ofJsonValues(jsonValues: List<JsonValue>) =
                        Content(jsonValues = jsonValues.toImmutable())
                }

                /**
                 * An interface that defines how to map each variant of [Content] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitJsonValues(jsonValues: List<JsonValue>): T

                    /**
                     * Maps an unknown variant of [Content] to a value of type [T].
                     *
                     * An instance of [Content] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws HanzoInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw HanzoInvalidDataException("Unknown Content: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Content>(Content::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Content {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Content(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<List<JsonValue>>())?.let {
                                        Content(jsonValues = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> Content(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Content>(Content::class) {

                    override fun serialize(
                        value: Content,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.jsonValues != null -> generator.writeObject(value.jsonValues)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Content")
                        }
                    }
                }
            }

            class CacheControl
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val type: JsonValue,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of()
                ) : this(type, mutableMapOf())

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("ephemeral")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

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

                    /** Returns a mutable builder for constructing an instance of [CacheControl]. */
                    fun builder() = Builder()
                }

                /** A builder for [CacheControl]. */
                class Builder internal constructor() {

                    private var type: JsonValue = JsonValue.from("ephemeral")
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(cacheControl: CacheControl) = apply {
                        type = cacheControl.type
                        additionalProperties = cacheControl.additionalProperties.toMutableMap()
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("ephemeral")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

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
                     * Returns an immutable instance of [CacheControl].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): CacheControl =
                        CacheControl(type, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): CacheControl = apply {
                    if (validated) {
                        return@apply
                    }

                    _type().let {
                        if (it != JsonValue.from("ephemeral")) {
                            throw HanzoInvalidDataException("'type' is invalid, received $it")
                        }
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
                    type.let { if (it == JsonValue.from("ephemeral")) 1 else 0 }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CacheControl &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CacheControl{type=$type, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ChatCompletionDeveloperMessage &&
                    content == other.content &&
                    role == other.role &&
                    cacheControl == other.cacheControl &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(content, role, cacheControl, name, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ChatCompletionDeveloperMessage{content=$content, role=$role, cacheControl=$cacheControl, name=$name, additionalProperties=$additionalProperties}"
        }
    }

    class ContextWindowFallbackDict
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

            /**
             * Returns a mutable builder for constructing an instance of
             * [ContextWindowFallbackDict].
             */
            fun builder() = Builder()
        }

        /** A builder for [ContextWindowFallbackDict]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(contextWindowFallbackDict: ContextWindowFallbackDict) = apply {
                additionalProperties = contextWindowFallbackDict.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ContextWindowFallbackDict].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ContextWindowFallbackDict =
                ContextWindowFallbackDict(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ContextWindowFallbackDict = apply {
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

            return other is ContextWindowFallbackDict &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContextWindowFallbackDict{additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = FunctionCall.Deserializer::class)
    @JsonSerialize(using = FunctionCall.Serializer::class)
    class FunctionCall
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

        fun validate(): FunctionCall = apply {
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

            return other is FunctionCall &&
                string == other.string &&
                unionMember1 == other.unionMember1
        }

        override fun hashCode(): Int = Objects.hash(string, unionMember1)

        override fun toString(): String =
            when {
                string != null -> "FunctionCall{string=$string}"
                unionMember1 != null -> "FunctionCall{unionMember1=$unionMember1}"
                _json != null -> "FunctionCall{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid FunctionCall")
            }

        companion object {

            fun ofString(string: String) = FunctionCall(string = string)

            fun ofUnionMember1(unionMember1: UnionMember1) =
                FunctionCall(unionMember1 = unionMember1)
        }

        /**
         * An interface that defines how to map each variant of [FunctionCall] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitUnionMember1(unionMember1: UnionMember1): T

            /**
             * Maps an unknown variant of [FunctionCall] to a value of type [T].
             *
             * An instance of [FunctionCall] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws HanzoInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HanzoInvalidDataException("Unknown FunctionCall: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<FunctionCall>(FunctionCall::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): FunctionCall {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                                FunctionCall(unionMember1 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                FunctionCall(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> FunctionCall(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<FunctionCall>(FunctionCall::class) {

            override fun serialize(
                value: FunctionCall,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid FunctionCall")
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

    class Function
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

            /** Returns a mutable builder for constructing an instance of [Function]. */
            fun builder() = Builder()
        }

        /** A builder for [Function]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(function: Function) = apply {
                additionalProperties = function.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Function].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Function = Function(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Function = apply {
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

            return other is Function && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Function{additionalProperties=$additionalProperties}"
    }

    class LogitBias
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

            /** Returns a mutable builder for constructing an instance of [LogitBias]. */
            fun builder() = Builder()
        }

        /** A builder for [LogitBias]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(logitBias: LogitBias) = apply {
                additionalProperties = logitBias.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [LogitBias].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): LogitBias = LogitBias(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): LogitBias = apply {
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

            return other is LogitBias && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "LogitBias{additionalProperties=$additionalProperties}"
    }

    class Metadata
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

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
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

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    class ResponseFormat
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

            /** Returns a mutable builder for constructing an instance of [ResponseFormat]. */
            fun builder() = Builder()
        }

        /** A builder for [ResponseFormat]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(responseFormat: ResponseFormat) = apply {
                additionalProperties = responseFormat.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ResponseFormat].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ResponseFormat = ResponseFormat(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ResponseFormat = apply {
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

            return other is ResponseFormat && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ResponseFormat{additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = Stop.Deserializer::class)
    @JsonSerialize(using = Stop.Serializer::class)
    class Stop
    private constructor(
        private val string: String? = null,
        private val strings: List<String>? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): String? = string

        fun strings(): List<String>? = strings

        fun isString(): Boolean = string != null

        fun isStrings(): Boolean = strings != null

        fun asString(): String = string.getOrThrow("string")

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                strings != null -> visitor.visitStrings(strings)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Stop = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitStrings(strings: List<String>) {}
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

                    override fun visitStrings(strings: List<String>) = strings.size

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Stop && string == other.string && strings == other.strings
        }

        override fun hashCode(): Int = Objects.hash(string, strings)

        override fun toString(): String =
            when {
                string != null -> "Stop{string=$string}"
                strings != null -> "Stop{strings=$strings}"
                _json != null -> "Stop{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Stop")
            }

        companion object {

            fun ofString(string: String) = Stop(string = string)

            fun ofStrings(strings: List<String>) = Stop(strings = strings.toImmutable())
        }

        /** An interface that defines how to map each variant of [Stop] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitStrings(strings: List<String>): T

            /**
             * Maps an unknown variant of [Stop] to a value of type [T].
             *
             * An instance of [Stop] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws HanzoInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HanzoInvalidDataException("Unknown Stop: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Stop>(Stop::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Stop {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Stop(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                Stop(strings = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Stop(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Stop>(Stop::class) {

            override fun serialize(
                value: Stop,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.strings != null -> generator.writeObject(value.strings)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Stop")
                }
            }
        }
    }

    class StreamOptions
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

            /** Returns a mutable builder for constructing an instance of [StreamOptions]. */
            fun builder() = Builder()
        }

        /** A builder for [StreamOptions]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(streamOptions: StreamOptions) = apply {
                additionalProperties = streamOptions.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [StreamOptions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): StreamOptions = StreamOptions(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): StreamOptions = apply {
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

            return other is StreamOptions && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "StreamOptions{additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = ToolChoice.Deserializer::class)
    @JsonSerialize(using = ToolChoice.Serializer::class)
    class ToolChoice
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

        fun validate(): ToolChoice = apply {
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

            return other is ToolChoice &&
                string == other.string &&
                unionMember1 == other.unionMember1
        }

        override fun hashCode(): Int = Objects.hash(string, unionMember1)

        override fun toString(): String =
            when {
                string != null -> "ToolChoice{string=$string}"
                unionMember1 != null -> "ToolChoice{unionMember1=$unionMember1}"
                _json != null -> "ToolChoice{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ToolChoice")
            }

        companion object {

            fun ofString(string: String) = ToolChoice(string = string)

            fun ofUnionMember1(unionMember1: UnionMember1) = ToolChoice(unionMember1 = unionMember1)
        }

        /**
         * An interface that defines how to map each variant of [ToolChoice] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitUnionMember1(unionMember1: UnionMember1): T

            /**
             * Maps an unknown variant of [ToolChoice] to a value of type [T].
             *
             * An instance of [ToolChoice] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws HanzoInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HanzoInvalidDataException("Unknown ToolChoice: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<ToolChoice>(ToolChoice::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ToolChoice {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                                ToolChoice(unionMember1 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                ToolChoice(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> ToolChoice(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<ToolChoice>(ToolChoice::class) {

            override fun serialize(
                value: ToolChoice,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ToolChoice")
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

    class Tool
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

            /** Returns a mutable builder for constructing an instance of [Tool]. */
            fun builder() = Builder()
        }

        /** A builder for [Tool]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tool: Tool) = apply {
                additionalProperties = tool.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Tool].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Tool = Tool(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Tool = apply {
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

            return other is Tool && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Tool{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CompletionCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CompletionCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
