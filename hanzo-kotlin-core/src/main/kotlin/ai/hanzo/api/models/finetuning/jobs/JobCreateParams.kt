// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.finetuning.jobs

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
 * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.
 * This is the equivalent of POST https://api.openai.com/v1/fine_tuning/jobs
 *
 * Supports Identical Params as: https://platform.openai.com/docs/api-reference/fine-tuning/create
 *
 * Example Curl:
 * ```
 * curl http://localhost:4000/v1/fine_tuning/jobs       -H "Content-Type: application/json"       -H "Authorization: Bearer sk-1234"       -d '{
 *     "model": "gpt-3.5-turbo",
 *     "training_file": "file-abc123",
 *     "hyperparameters": {
 *       "n_epochs": 4
 *     }
 *   }'
 * ```
 */
class JobCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customLlmProvider(): CustomLlmProvider = body.customLlmProvider()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun model(): String = body.model()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun trainingFile(): String = body.trainingFile()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hyperparameters(): Hyperparameters? = body.hyperparameters()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun integrations(): List<String>? = body.integrations()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun seed(): Long? = body.seed()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun suffix(): String? = body.suffix()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun validationFile(): String? = body.validationFile()

    /**
     * Returns the raw JSON value of [customLlmProvider].
     *
     * Unlike [customLlmProvider], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _customLlmProvider(): JsonField<CustomLlmProvider> = body._customLlmProvider()

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _model(): JsonField<String> = body._model()

    /**
     * Returns the raw JSON value of [trainingFile].
     *
     * Unlike [trainingFile], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _trainingFile(): JsonField<String> = body._trainingFile()

    /**
     * Returns the raw JSON value of [hyperparameters].
     *
     * Unlike [hyperparameters], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _hyperparameters(): JsonField<Hyperparameters> = body._hyperparameters()

    /**
     * Returns the raw JSON value of [integrations].
     *
     * Unlike [integrations], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _integrations(): JsonField<List<String>> = body._integrations()

    /**
     * Returns the raw JSON value of [seed].
     *
     * Unlike [seed], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _seed(): JsonField<Long> = body._seed()

    /**
     * Returns the raw JSON value of [suffix].
     *
     * Unlike [suffix], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _suffix(): JsonField<String> = body._suffix()

    /**
     * Returns the raw JSON value of [validationFile].
     *
     * Unlike [validationFile], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _validationFile(): JsonField<String> = body._validationFile()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [JobCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .customLlmProvider()
         * .model()
         * .trainingFile()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [JobCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(jobCreateParams: JobCreateParams) = apply {
            body = jobCreateParams.body.toBuilder()
            additionalHeaders = jobCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = jobCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [customLlmProvider]
         * - [model]
         * - [trainingFile]
         * - [hyperparameters]
         * - [integrations]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun customLlmProvider(customLlmProvider: CustomLlmProvider) = apply {
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

        fun model(model: String) = apply { body.model(model) }

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { body.model(model) }

        fun trainingFile(trainingFile: String) = apply { body.trainingFile(trainingFile) }

        /**
         * Sets [Builder.trainingFile] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trainingFile] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun trainingFile(trainingFile: JsonField<String>) = apply {
            body.trainingFile(trainingFile)
        }

        fun hyperparameters(hyperparameters: Hyperparameters?) = apply {
            body.hyperparameters(hyperparameters)
        }

        /**
         * Sets [Builder.hyperparameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hyperparameters] with a well-typed [Hyperparameters]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun hyperparameters(hyperparameters: JsonField<Hyperparameters>) = apply {
            body.hyperparameters(hyperparameters)
        }

        fun integrations(integrations: List<String>?) = apply { body.integrations(integrations) }

        /**
         * Sets [Builder.integrations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.integrations] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun integrations(integrations: JsonField<List<String>>) = apply {
            body.integrations(integrations)
        }

        /**
         * Adds a single [String] to [integrations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIntegration(integration: String) = apply { body.addIntegration(integration) }

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

        fun suffix(suffix: String?) = apply { body.suffix(suffix) }

        /**
         * Sets [Builder.suffix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.suffix] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun suffix(suffix: JsonField<String>) = apply { body.suffix(suffix) }

        fun validationFile(validationFile: String?) = apply { body.validationFile(validationFile) }

        /**
         * Sets [Builder.validationFile] to an arbitrary JSON value.
         *
         * You should usually call [Builder.validationFile] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun validationFile(validationFile: JsonField<String>) = apply {
            body.validationFile(validationFile)
        }

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
         * Returns an immutable instance of [JobCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .customLlmProvider()
         * .model()
         * .trainingFile()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): JobCreateParams =
            JobCreateParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val customLlmProvider: JsonField<CustomLlmProvider>,
        private val model: JsonField<String>,
        private val trainingFile: JsonField<String>,
        private val hyperparameters: JsonField<Hyperparameters>,
        private val integrations: JsonField<List<String>>,
        private val seed: JsonField<Long>,
        private val suffix: JsonField<String>,
        private val validationFile: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("custom_llm_provider")
            @ExcludeMissing
            customLlmProvider: JsonField<CustomLlmProvider> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("training_file")
            @ExcludeMissing
            trainingFile: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hyperparameters")
            @ExcludeMissing
            hyperparameters: JsonField<Hyperparameters> = JsonMissing.of(),
            @JsonProperty("integrations")
            @ExcludeMissing
            integrations: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("seed") @ExcludeMissing seed: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("suffix") @ExcludeMissing suffix: JsonField<String> = JsonMissing.of(),
            @JsonProperty("validation_file")
            @ExcludeMissing
            validationFile: JsonField<String> = JsonMissing.of(),
        ) : this(
            customLlmProvider,
            model,
            trainingFile,
            hyperparameters,
            integrations,
            seed,
            suffix,
            validationFile,
            mutableMapOf(),
        )

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customLlmProvider(): CustomLlmProvider =
            customLlmProvider.getRequired("custom_llm_provider")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun model(): String = model.getRequired("model")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun trainingFile(): String = trainingFile.getRequired("training_file")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hyperparameters(): Hyperparameters? = hyperparameters.getNullable("hyperparameters")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun integrations(): List<String>? = integrations.getNullable("integrations")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun seed(): Long? = seed.getNullable("seed")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun suffix(): String? = suffix.getNullable("suffix")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun validationFile(): String? = validationFile.getNullable("validation_file")

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
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [trainingFile].
         *
         * Unlike [trainingFile], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("training_file")
        @ExcludeMissing
        fun _trainingFile(): JsonField<String> = trainingFile

        /**
         * Returns the raw JSON value of [hyperparameters].
         *
         * Unlike [hyperparameters], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("hyperparameters")
        @ExcludeMissing
        fun _hyperparameters(): JsonField<Hyperparameters> = hyperparameters

        /**
         * Returns the raw JSON value of [integrations].
         *
         * Unlike [integrations], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("integrations")
        @ExcludeMissing
        fun _integrations(): JsonField<List<String>> = integrations

        /**
         * Returns the raw JSON value of [seed].
         *
         * Unlike [seed], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("seed") @ExcludeMissing fun _seed(): JsonField<Long> = seed

        /**
         * Returns the raw JSON value of [suffix].
         *
         * Unlike [suffix], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("suffix") @ExcludeMissing fun _suffix(): JsonField<String> = suffix

        /**
         * Returns the raw JSON value of [validationFile].
         *
         * Unlike [validationFile], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("validation_file")
        @ExcludeMissing
        fun _validationFile(): JsonField<String> = validationFile

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
             * .customLlmProvider()
             * .model()
             * .trainingFile()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var customLlmProvider: JsonField<CustomLlmProvider>? = null
            private var model: JsonField<String>? = null
            private var trainingFile: JsonField<String>? = null
            private var hyperparameters: JsonField<Hyperparameters> = JsonMissing.of()
            private var integrations: JsonField<MutableList<String>>? = null
            private var seed: JsonField<Long> = JsonMissing.of()
            private var suffix: JsonField<String> = JsonMissing.of()
            private var validationFile: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                customLlmProvider = body.customLlmProvider
                model = body.model
                trainingFile = body.trainingFile
                hyperparameters = body.hyperparameters
                integrations = body.integrations.map { it.toMutableList() }
                seed = body.seed
                suffix = body.suffix
                validationFile = body.validationFile
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun customLlmProvider(customLlmProvider: CustomLlmProvider) =
                customLlmProvider(JsonField.of(customLlmProvider))

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

            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            fun trainingFile(trainingFile: String) = trainingFile(JsonField.of(trainingFile))

            /**
             * Sets [Builder.trainingFile] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trainingFile] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun trainingFile(trainingFile: JsonField<String>) = apply {
                this.trainingFile = trainingFile
            }

            fun hyperparameters(hyperparameters: Hyperparameters?) =
                hyperparameters(JsonField.ofNullable(hyperparameters))

            /**
             * Sets [Builder.hyperparameters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hyperparameters] with a well-typed [Hyperparameters]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun hyperparameters(hyperparameters: JsonField<Hyperparameters>) = apply {
                this.hyperparameters = hyperparameters
            }

            fun integrations(integrations: List<String>?) =
                integrations(JsonField.ofNullable(integrations))

            /**
             * Sets [Builder.integrations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.integrations] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun integrations(integrations: JsonField<List<String>>) = apply {
                this.integrations = integrations.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [integrations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addIntegration(integration: String) = apply {
                integrations =
                    (integrations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("integrations", it).add(integration)
                    }
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

            fun suffix(suffix: String?) = suffix(JsonField.ofNullable(suffix))

            /**
             * Sets [Builder.suffix] to an arbitrary JSON value.
             *
             * You should usually call [Builder.suffix] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun suffix(suffix: JsonField<String>) = apply { this.suffix = suffix }

            fun validationFile(validationFile: String?) =
                validationFile(JsonField.ofNullable(validationFile))

            /**
             * Sets [Builder.validationFile] to an arbitrary JSON value.
             *
             * You should usually call [Builder.validationFile] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun validationFile(validationFile: JsonField<String>) = apply {
                this.validationFile = validationFile
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .customLlmProvider()
             * .model()
             * .trainingFile()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("customLlmProvider", customLlmProvider),
                    checkRequired("model", model),
                    checkRequired("trainingFile", trainingFile),
                    hyperparameters,
                    (integrations ?: JsonMissing.of()).map { it.toImmutable() },
                    seed,
                    suffix,
                    validationFile,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            customLlmProvider().validate()
            model()
            trainingFile()
            hyperparameters()?.validate()
            integrations()
            seed()
            suffix()
            validationFile()
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
            (customLlmProvider.asKnown()?.validity() ?: 0) +
                (if (model.asKnown() == null) 0 else 1) +
                (if (trainingFile.asKnown() == null) 0 else 1) +
                (hyperparameters.asKnown()?.validity() ?: 0) +
                (integrations.asKnown()?.size ?: 0) +
                (if (seed.asKnown() == null) 0 else 1) +
                (if (suffix.asKnown() == null) 0 else 1) +
                (if (validationFile.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && customLlmProvider == other.customLlmProvider && model == other.model && trainingFile == other.trainingFile && hyperparameters == other.hyperparameters && integrations == other.integrations && seed == other.seed && suffix == other.suffix && validationFile == other.validationFile && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(customLlmProvider, model, trainingFile, hyperparameters, integrations, seed, suffix, validationFile, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{customLlmProvider=$customLlmProvider, model=$model, trainingFile=$trainingFile, hyperparameters=$hyperparameters, integrations=$integrations, seed=$seed, suffix=$suffix, validationFile=$validationFile, additionalProperties=$additionalProperties}"
    }

    class CustomLlmProvider @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            val OPENAI = of("openai")

            val AZURE = of("azure")

            val VERTEX_AI = of("vertex_ai")

            fun of(value: String) = CustomLlmProvider(JsonField.of(value))
        }

        /** An enum containing [CustomLlmProvider]'s known values. */
        enum class Known {
            OPENAI,
            AZURE,
            VERTEX_AI,
        }

        /**
         * An enum containing [CustomLlmProvider]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CustomLlmProvider] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OPENAI,
            AZURE,
            VERTEX_AI,
            /**
             * An enum member indicating that [CustomLlmProvider] was instantiated with an unknown
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
                OPENAI -> Value.OPENAI
                AZURE -> Value.AZURE
                VERTEX_AI -> Value.VERTEX_AI
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
                OPENAI -> Known.OPENAI
                AZURE -> Known.AZURE
                VERTEX_AI -> Known.VERTEX_AI
                else -> throw HanzoInvalidDataException("Unknown CustomLlmProvider: $value")
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

        fun validate(): CustomLlmProvider = apply {
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

            return /* spotless:off */ other is CustomLlmProvider && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Hyperparameters
    private constructor(
        private val batchSize: JsonField<BatchSize>,
        private val learningRateMultiplier: JsonField<LearningRateMultiplier>,
        private val nEpochs: JsonField<NEpochs>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("batch_size")
            @ExcludeMissing
            batchSize: JsonField<BatchSize> = JsonMissing.of(),
            @JsonProperty("learning_rate_multiplier")
            @ExcludeMissing
            learningRateMultiplier: JsonField<LearningRateMultiplier> = JsonMissing.of(),
            @JsonProperty("n_epochs") @ExcludeMissing nEpochs: JsonField<NEpochs> = JsonMissing.of(),
        ) : this(batchSize, learningRateMultiplier, nEpochs, mutableMapOf())

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun batchSize(): BatchSize? = batchSize.getNullable("batch_size")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun learningRateMultiplier(): LearningRateMultiplier? =
            learningRateMultiplier.getNullable("learning_rate_multiplier")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun nEpochs(): NEpochs? = nEpochs.getNullable("n_epochs")

        /**
         * Returns the raw JSON value of [batchSize].
         *
         * Unlike [batchSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("batch_size")
        @ExcludeMissing
        fun _batchSize(): JsonField<BatchSize> = batchSize

        /**
         * Returns the raw JSON value of [learningRateMultiplier].
         *
         * Unlike [learningRateMultiplier], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("learning_rate_multiplier")
        @ExcludeMissing
        fun _learningRateMultiplier(): JsonField<LearningRateMultiplier> = learningRateMultiplier

        /**
         * Returns the raw JSON value of [nEpochs].
         *
         * Unlike [nEpochs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("n_epochs") @ExcludeMissing fun _nEpochs(): JsonField<NEpochs> = nEpochs

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

            /** Returns a mutable builder for constructing an instance of [Hyperparameters]. */
            fun builder() = Builder()
        }

        /** A builder for [Hyperparameters]. */
        class Builder internal constructor() {

            private var batchSize: JsonField<BatchSize> = JsonMissing.of()
            private var learningRateMultiplier: JsonField<LearningRateMultiplier> = JsonMissing.of()
            private var nEpochs: JsonField<NEpochs> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(hyperparameters: Hyperparameters) = apply {
                batchSize = hyperparameters.batchSize
                learningRateMultiplier = hyperparameters.learningRateMultiplier
                nEpochs = hyperparameters.nEpochs
                additionalProperties = hyperparameters.additionalProperties.toMutableMap()
            }

            fun batchSize(batchSize: BatchSize?) = batchSize(JsonField.ofNullable(batchSize))

            /**
             * Sets [Builder.batchSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.batchSize] with a well-typed [BatchSize] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun batchSize(batchSize: JsonField<BatchSize>) = apply { this.batchSize = batchSize }

            /** Alias for calling [batchSize] with `BatchSize.ofString(string)`. */
            fun batchSize(string: String) = batchSize(BatchSize.ofString(string))

            /** Alias for calling [batchSize] with `BatchSize.ofLong(long)`. */
            fun batchSize(long: Long) = batchSize(BatchSize.ofLong(long))

            fun learningRateMultiplier(learningRateMultiplier: LearningRateMultiplier?) =
                learningRateMultiplier(JsonField.ofNullable(learningRateMultiplier))

            /**
             * Sets [Builder.learningRateMultiplier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.learningRateMultiplier] with a well-typed
             * [LearningRateMultiplier] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun learningRateMultiplier(learningRateMultiplier: JsonField<LearningRateMultiplier>) =
                apply {
                    this.learningRateMultiplier = learningRateMultiplier
                }

            /**
             * Alias for calling [learningRateMultiplier] with
             * `LearningRateMultiplier.ofString(string)`.
             */
            fun learningRateMultiplier(string: String) =
                learningRateMultiplier(LearningRateMultiplier.ofString(string))

            /**
             * Alias for calling [learningRateMultiplier] with
             * `LearningRateMultiplier.ofDouble(double)`.
             */
            fun learningRateMultiplier(double: Double) =
                learningRateMultiplier(LearningRateMultiplier.ofDouble(double))

            fun nEpochs(nEpochs: NEpochs?) = nEpochs(JsonField.ofNullable(nEpochs))

            /**
             * Sets [Builder.nEpochs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nEpochs] with a well-typed [NEpochs] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nEpochs(nEpochs: JsonField<NEpochs>) = apply { this.nEpochs = nEpochs }

            /** Alias for calling [nEpochs] with `NEpochs.ofString(string)`. */
            fun nEpochs(string: String) = nEpochs(NEpochs.ofString(string))

            /** Alias for calling [nEpochs] with `NEpochs.ofLong(long)`. */
            fun nEpochs(long: Long) = nEpochs(NEpochs.ofLong(long))

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
             * Returns an immutable instance of [Hyperparameters].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Hyperparameters =
                Hyperparameters(
                    batchSize,
                    learningRateMultiplier,
                    nEpochs,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Hyperparameters = apply {
            if (validated) {
                return@apply
            }

            batchSize()?.validate()
            learningRateMultiplier()?.validate()
            nEpochs()?.validate()
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
            (batchSize.asKnown()?.validity() ?: 0) +
                (learningRateMultiplier.asKnown()?.validity() ?: 0) +
                (nEpochs.asKnown()?.validity() ?: 0)

        @JsonDeserialize(using = BatchSize.Deserializer::class)
        @JsonSerialize(using = BatchSize.Serializer::class)
        class BatchSize
        private constructor(
            private val string: String? = null,
            private val long: Long? = null,
            private val _json: JsonValue? = null,
        ) {

            fun string(): String? = string

            fun long(): Long? = long

            fun isString(): Boolean = string != null

            fun isLong(): Boolean = long != null

            fun asString(): String = string.getOrThrow("string")

            fun asLong(): Long = long.getOrThrow("long")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    long != null -> visitor.visitLong(long)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): BatchSize = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitString(string: String) {}

                        override fun visitLong(long: Long) {}
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

                        override fun visitLong(long: Long) = 1

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BatchSize && string == other.string && long == other.long /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, long) /* spotless:on */

            override fun toString(): String =
                when {
                    string != null -> "BatchSize{string=$string}"
                    long != null -> "BatchSize{long=$long}"
                    _json != null -> "BatchSize{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid BatchSize")
                }

            companion object {

                fun ofString(string: String) = BatchSize(string = string)

                fun ofLong(long: Long) = BatchSize(long = long)
            }

            /**
             * An interface that defines how to map each variant of [BatchSize] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitLong(long: Long): T

                /**
                 * Maps an unknown variant of [BatchSize] to a value of type [T].
                 *
                 * An instance of [BatchSize] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws HanzoInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw HanzoInvalidDataException("Unknown BatchSize: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<BatchSize>(BatchSize::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): BatchSize {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    BatchSize(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                    BatchSize(long = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from object).
                        0 -> BatchSize(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<BatchSize>(BatchSize::class) {

                override fun serialize(
                    value: BatchSize,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.string != null -> generator.writeObject(value.string)
                        value.long != null -> generator.writeObject(value.long)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid BatchSize")
                    }
                }
            }
        }

        @JsonDeserialize(using = LearningRateMultiplier.Deserializer::class)
        @JsonSerialize(using = LearningRateMultiplier.Serializer::class)
        class LearningRateMultiplier
        private constructor(
            private val string: String? = null,
            private val double: Double? = null,
            private val _json: JsonValue? = null,
        ) {

            fun string(): String? = string

            fun double(): Double? = double

            fun isString(): Boolean = string != null

            fun isDouble(): Boolean = double != null

            fun asString(): String = string.getOrThrow("string")

            fun asDouble(): Double = double.getOrThrow("double")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    double != null -> visitor.visitDouble(double)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): LearningRateMultiplier = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitString(string: String) {}

                        override fun visitDouble(double: Double) {}
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

                        override fun visitDouble(double: Double) = 1

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LearningRateMultiplier && string == other.string && double == other.double /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, double) /* spotless:on */

            override fun toString(): String =
                when {
                    string != null -> "LearningRateMultiplier{string=$string}"
                    double != null -> "LearningRateMultiplier{double=$double}"
                    _json != null -> "LearningRateMultiplier{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid LearningRateMultiplier")
                }

            companion object {

                fun ofString(string: String) = LearningRateMultiplier(string = string)

                fun ofDouble(double: Double) = LearningRateMultiplier(double = double)
            }

            /**
             * An interface that defines how to map each variant of [LearningRateMultiplier] to a
             * value of type [T].
             */
            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitDouble(double: Double): T

                /**
                 * Maps an unknown variant of [LearningRateMultiplier] to a value of type [T].
                 *
                 * An instance of [LearningRateMultiplier] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws HanzoInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw HanzoInvalidDataException("Unknown LearningRateMultiplier: $json")
                }
            }

            internal class Deserializer :
                BaseDeserializer<LearningRateMultiplier>(LearningRateMultiplier::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): LearningRateMultiplier {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    LearningRateMultiplier(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                    LearningRateMultiplier(double = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from object).
                        0 -> LearningRateMultiplier(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer :
                BaseSerializer<LearningRateMultiplier>(LearningRateMultiplier::class) {

                override fun serialize(
                    value: LearningRateMultiplier,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.string != null -> generator.writeObject(value.string)
                        value.double != null -> generator.writeObject(value.double)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid LearningRateMultiplier")
                    }
                }
            }
        }

        @JsonDeserialize(using = NEpochs.Deserializer::class)
        @JsonSerialize(using = NEpochs.Serializer::class)
        class NEpochs
        private constructor(
            private val string: String? = null,
            private val long: Long? = null,
            private val _json: JsonValue? = null,
        ) {

            fun string(): String? = string

            fun long(): Long? = long

            fun isString(): Boolean = string != null

            fun isLong(): Boolean = long != null

            fun asString(): String = string.getOrThrow("string")

            fun asLong(): Long = long.getOrThrow("long")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    long != null -> visitor.visitLong(long)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): NEpochs = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitString(string: String) {}

                        override fun visitLong(long: Long) {}
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

                        override fun visitLong(long: Long) = 1

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is NEpochs && string == other.string && long == other.long /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, long) /* spotless:on */

            override fun toString(): String =
                when {
                    string != null -> "NEpochs{string=$string}"
                    long != null -> "NEpochs{long=$long}"
                    _json != null -> "NEpochs{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid NEpochs")
                }

            companion object {

                fun ofString(string: String) = NEpochs(string = string)

                fun ofLong(long: Long) = NEpochs(long = long)
            }

            /**
             * An interface that defines how to map each variant of [NEpochs] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitLong(long: Long): T

                /**
                 * Maps an unknown variant of [NEpochs] to a value of type [T].
                 *
                 * An instance of [NEpochs] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws HanzoInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw HanzoInvalidDataException("Unknown NEpochs: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<NEpochs>(NEpochs::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): NEpochs {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    NEpochs(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                    NEpochs(long = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from object).
                        0 -> NEpochs(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<NEpochs>(NEpochs::class) {

                override fun serialize(
                    value: NEpochs,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.string != null -> generator.writeObject(value.string)
                        value.long != null -> generator.writeObject(value.long)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid NEpochs")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Hyperparameters && batchSize == other.batchSize && learningRateMultiplier == other.learningRateMultiplier && nEpochs == other.nEpochs && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(batchSize, learningRateMultiplier, nEpochs, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Hyperparameters{batchSize=$batchSize, learningRateMultiplier=$learningRateMultiplier, nEpochs=$nEpochs, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is JobCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "JobCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
