// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.files

import ai.hanzo.api.core.ExcludeMissing
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.MultipartField
import ai.hanzo.api.core.Params
import ai.hanzo.api.core.checkRequired
import ai.hanzo.api.core.http.Headers
import ai.hanzo.api.core.http.QueryParams
import ai.hanzo.api.core.toImmutable
import ai.hanzo.api.errors.HanzoInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import java.io.InputStream
import java.nio.file.Path
import java.util.Collections
import java.util.Objects
import kotlin.io.path.inputStream
import kotlin.io.path.name

/**
 * Upload a file that can be used across - Assistants API, Batch API This is the equivalent of POST
 * https://api.openai.com/v1/files
 *
 * Supports Identical Params as: https://platform.openai.com/docs/api-reference/files/create
 *
 * Example Curl
 *
 * ```
 * curl http://localhost:4000/v1/files         -H "Authorization: Bearer sk-1234"         -F purpose="batch"         -F file="@mydata.jsonl"
 *     -F expires_after[anchor]="created_at"         -F expires_after[seconds]=2592000
 * ```
 */
class FileCreateParams
private constructor(
    private val provider: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun provider(): String? = provider

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun file(): InputStream = body.file()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun purpose(): String = body.purpose()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customLlmProvider(): String? = body.customLlmProvider()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun litellmMetadata(): String? = body.litellmMetadata()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun targetModelNames(): String? = body.targetModelNames()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun targetStorage(): String? = body.targetStorage()

    /**
     * Returns the raw multipart value of [file].
     *
     * Unlike [file], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _file(): MultipartField<InputStream> = body._file()

    /**
     * Returns the raw multipart value of [purpose].
     *
     * Unlike [purpose], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _purpose(): MultipartField<String> = body._purpose()

    /**
     * Returns the raw multipart value of [customLlmProvider].
     *
     * Unlike [customLlmProvider], this method doesn't throw if the multipart field has an
     * unexpected type.
     */
    fun _customLlmProvider(): MultipartField<String> = body._customLlmProvider()

    /**
     * Returns the raw multipart value of [litellmMetadata].
     *
     * Unlike [litellmMetadata], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _litellmMetadata(): MultipartField<String> = body._litellmMetadata()

    /**
     * Returns the raw multipart value of [targetModelNames].
     *
     * Unlike [targetModelNames], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _targetModelNames(): MultipartField<String> = body._targetModelNames()

    /**
     * Returns the raw multipart value of [targetStorage].
     *
     * Unlike [targetStorage], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _targetStorage(): MultipartField<String> = body._targetStorage()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FileCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .file()
         * .purpose()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [FileCreateParams]. */
    class Builder internal constructor() {

        private var provider: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(fileCreateParams: FileCreateParams) = apply {
            provider = fileCreateParams.provider
            body = fileCreateParams.body.toBuilder()
            additionalHeaders = fileCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = fileCreateParams.additionalQueryParams.toBuilder()
        }

        fun provider(provider: String?) = apply { this.provider = provider }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [file]
         * - [purpose]
         * - [customLlmProvider]
         * - [litellmMetadata]
         * - [targetModelNames]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun file(file: InputStream) = apply { body.file(file) }

        /**
         * Sets [Builder.file] to an arbitrary multipart value.
         *
         * You should usually call [Builder.file] with a well-typed [InputStream] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun file(file: MultipartField<InputStream>) = apply { body.file(file) }

        fun file(file: ByteArray) = apply { body.file(file) }

        fun file(path: Path) = apply { body.file(path) }

        fun purpose(purpose: String) = apply { body.purpose(purpose) }

        /**
         * Sets [Builder.purpose] to an arbitrary multipart value.
         *
         * You should usually call [Builder.purpose] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun purpose(purpose: MultipartField<String>) = apply { body.purpose(purpose) }

        fun customLlmProvider(customLlmProvider: String) = apply {
            body.customLlmProvider(customLlmProvider)
        }

        /**
         * Sets [Builder.customLlmProvider] to an arbitrary multipart value.
         *
         * You should usually call [Builder.customLlmProvider] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customLlmProvider(customLlmProvider: MultipartField<String>) = apply {
            body.customLlmProvider(customLlmProvider)
        }

        fun litellmMetadata(litellmMetadata: String?) = apply {
            body.litellmMetadata(litellmMetadata)
        }

        /**
         * Sets [Builder.litellmMetadata] to an arbitrary multipart value.
         *
         * You should usually call [Builder.litellmMetadata] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun litellmMetadata(litellmMetadata: MultipartField<String>) = apply {
            body.litellmMetadata(litellmMetadata)
        }

        fun targetModelNames(targetModelNames: String) = apply {
            body.targetModelNames(targetModelNames)
        }

        /**
         * Sets [Builder.targetModelNames] to an arbitrary multipart value.
         *
         * You should usually call [Builder.targetModelNames] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun targetModelNames(targetModelNames: MultipartField<String>) = apply {
            body.targetModelNames(targetModelNames)
        }

        fun targetStorage(targetStorage: String) = apply { body.targetStorage(targetStorage) }

        /**
         * Sets [Builder.targetStorage] to an arbitrary multipart value.
         *
         * You should usually call [Builder.targetStorage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun targetStorage(targetStorage: MultipartField<String>) = apply {
            body.targetStorage(targetStorage)
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
         * Returns an immutable instance of [FileCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .file()
         * .purpose()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FileCreateParams =
            FileCreateParams(
                provider,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf(
                "file" to _file(),
                "purpose" to _purpose(),
                "custom_llm_provider" to _customLlmProvider(),
                "litellm_metadata" to _litellmMetadata(),
                "target_model_names" to _targetModelNames(),
                "target_storage" to _targetStorage(),
            ) + _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> provider ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val file: MultipartField<InputStream>,
        private val purpose: MultipartField<String>,
        private val customLlmProvider: MultipartField<String>,
        private val litellmMetadata: MultipartField<String>,
        private val targetModelNames: MultipartField<String>,
        private val targetStorage: MultipartField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun file(): InputStream = file.value.getRequired("file")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun purpose(): String = purpose.value.getRequired("purpose")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customLlmProvider(): String? =
            customLlmProvider.value.getNullable("custom_llm_provider")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun litellmMetadata(): String? = litellmMetadata.value.getNullable("litellm_metadata")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun targetModelNames(): String? = targetModelNames.value.getNullable("target_model_names")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun targetStorage(): String? = targetStorage.value.getNullable("target_storage")

        /**
         * Returns the raw multipart value of [file].
         *
         * Unlike [file], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("file") @ExcludeMissing fun _file(): MultipartField<InputStream> = file

        /**
         * Returns the raw multipart value of [purpose].
         *
         * Unlike [purpose], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("purpose") @ExcludeMissing fun _purpose(): MultipartField<String> = purpose

        /**
         * Returns the raw multipart value of [customLlmProvider].
         *
         * Unlike [customLlmProvider], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("custom_llm_provider")
        @ExcludeMissing
        fun _customLlmProvider(): MultipartField<String> = customLlmProvider

        /**
         * Returns the raw multipart value of [litellmMetadata].
         *
         * Unlike [litellmMetadata], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("litellm_metadata")
        @ExcludeMissing
        fun _litellmMetadata(): MultipartField<String> = litellmMetadata

        /**
         * Returns the raw multipart value of [targetModelNames].
         *
         * Unlike [targetModelNames], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("target_model_names")
        @ExcludeMissing
        fun _targetModelNames(): MultipartField<String> = targetModelNames

        /**
         * Returns the raw multipart value of [targetStorage].
         *
         * Unlike [targetStorage], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("target_storage")
        @ExcludeMissing
        fun _targetStorage(): MultipartField<String> = targetStorage

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
             * .file()
             * .purpose()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var file: MultipartField<InputStream>? = null
            private var purpose: MultipartField<String>? = null
            private var customLlmProvider: MultipartField<String> = MultipartField.of(null)
            private var litellmMetadata: MultipartField<String> = MultipartField.of(null)
            private var targetModelNames: MultipartField<String> = MultipartField.of(null)
            private var targetStorage: MultipartField<String> = MultipartField.of(null)
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                file = body.file
                purpose = body.purpose
                customLlmProvider = body.customLlmProvider
                litellmMetadata = body.litellmMetadata
                targetModelNames = body.targetModelNames
                targetStorage = body.targetStorage
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun file(file: InputStream) = file(MultipartField.of(file))

            /**
             * Sets [Builder.file] to an arbitrary multipart value.
             *
             * You should usually call [Builder.file] with a well-typed [InputStream] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun file(file: MultipartField<InputStream>) = apply { this.file = file }

            fun file(file: ByteArray) = file(file.inputStream())

            fun file(path: Path) =
                file(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

            fun purpose(purpose: String) = purpose(MultipartField.of(purpose))

            /**
             * Sets [Builder.purpose] to an arbitrary multipart value.
             *
             * You should usually call [Builder.purpose] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun purpose(purpose: MultipartField<String>) = apply { this.purpose = purpose }

            fun customLlmProvider(customLlmProvider: String) =
                customLlmProvider(MultipartField.of(customLlmProvider))

            /**
             * Sets [Builder.customLlmProvider] to an arbitrary multipart value.
             *
             * You should usually call [Builder.customLlmProvider] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customLlmProvider(customLlmProvider: MultipartField<String>) = apply {
                this.customLlmProvider = customLlmProvider
            }

            fun litellmMetadata(litellmMetadata: String?) =
                litellmMetadata(MultipartField.of(litellmMetadata))

            /**
             * Sets [Builder.litellmMetadata] to an arbitrary multipart value.
             *
             * You should usually call [Builder.litellmMetadata] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun litellmMetadata(litellmMetadata: MultipartField<String>) = apply {
                this.litellmMetadata = litellmMetadata
            }

            fun targetModelNames(targetModelNames: String) =
                targetModelNames(MultipartField.of(targetModelNames))

            /**
             * Sets [Builder.targetModelNames] to an arbitrary multipart value.
             *
             * You should usually call [Builder.targetModelNames] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetModelNames(targetModelNames: MultipartField<String>) = apply {
                this.targetModelNames = targetModelNames
            }

            fun targetStorage(targetStorage: String) =
                targetStorage(MultipartField.of(targetStorage))

            /**
             * Sets [Builder.targetStorage] to an arbitrary multipart value.
             *
             * You should usually call [Builder.targetStorage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetStorage(targetStorage: MultipartField<String>) = apply {
                this.targetStorage = targetStorage
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
             * .file()
             * .purpose()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("file", file),
                    checkRequired("purpose", purpose),
                    customLlmProvider,
                    litellmMetadata,
                    targetModelNames,
                    targetStorage,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            file()
            purpose()
            customLlmProvider()
            litellmMetadata()
            targetModelNames()
            targetStorage()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HanzoInvalidDataException) {
                false
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                file == other.file &&
                purpose == other.purpose &&
                customLlmProvider == other.customLlmProvider &&
                litellmMetadata == other.litellmMetadata &&
                targetModelNames == other.targetModelNames &&
                targetStorage == other.targetStorage &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                file,
                purpose,
                customLlmProvider,
                litellmMetadata,
                targetModelNames,
                targetStorage,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{file=$file, purpose=$purpose, customLlmProvider=$customLlmProvider, litellmMetadata=$litellmMetadata, targetModelNames=$targetModelNames, targetStorage=$targetStorage, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileCreateParams &&
            provider == other.provider &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(provider, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "FileCreateParams{provider=$provider, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
