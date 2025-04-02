// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.finetuning.jobs

import ai.hanzo.api.core.Enum
import ai.hanzo.api.core.JsonField
import ai.hanzo.api.core.Params
import ai.hanzo.api.core.checkRequired
import ai.hanzo.api.core.http.Headers
import ai.hanzo.api.core.http.QueryParams
import ai.hanzo.api.errors.HanzoInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects

/**
 * Lists fine-tuning jobs for the organization. This is the equivalent of GET
 * https://api.openai.com/v1/fine_tuning/jobs
 *
 * Supported Query Params:
 * - `custom_llm_provider`: Name of the LLM provider
 * - `after`: Identifier for the last job from the previous pagination request.
 * - `limit`: Number of fine-tuning jobs to retrieve (default is 20).
 */
class JobListParams
private constructor(
    private val customLlmProvider: CustomLlmProvider,
    private val after: String?,
    private val limit: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun customLlmProvider(): CustomLlmProvider = customLlmProvider

    fun after(): String? = after

    fun limit(): Long? = limit

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [JobListParams].
         *
         * The following fields are required:
         * ```kotlin
         * .customLlmProvider()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [JobListParams]. */
    class Builder internal constructor() {

        private var customLlmProvider: CustomLlmProvider? = null
        private var after: String? = null
        private var limit: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(jobListParams: JobListParams) = apply {
            customLlmProvider = jobListParams.customLlmProvider
            after = jobListParams.after
            limit = jobListParams.limit
            additionalHeaders = jobListParams.additionalHeaders.toBuilder()
            additionalQueryParams = jobListParams.additionalQueryParams.toBuilder()
        }

        fun customLlmProvider(customLlmProvider: CustomLlmProvider) = apply {
            this.customLlmProvider = customLlmProvider
        }

        fun after(after: String?) = apply { this.after = after }

        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

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
         * Returns an immutable instance of [JobListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .customLlmProvider()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): JobListParams =
            JobListParams(
                checkRequired("customLlmProvider", customLlmProvider),
                after,
                limit,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("custom_llm_provider", customLlmProvider.toString())
                after?.let { put("after", it) }
                limit?.let { put("limit", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

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

            fun of(value: String) = CustomLlmProvider(JsonField.of(value))
        }

        /** An enum containing [CustomLlmProvider]'s known values. */
        enum class Known {
            OPENAI,
            AZURE,
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is JobListParams && customLlmProvider == other.customLlmProvider && after == other.after && limit == other.limit && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customLlmProvider, after, limit, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "JobListParams{customLlmProvider=$customLlmProvider, after=$after, limit=$limit, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
