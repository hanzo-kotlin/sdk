// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.key

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hanzo_ai.api.core.Enum
import com.hanzo_ai.api.core.ExcludeMissing
import com.hanzo_ai.api.core.JsonField
import com.hanzo_ai.api.core.JsonMissing
import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.core.checkKnown
import com.hanzo_ai.api.core.toImmutable
import com.hanzo_ai.api.errors.HanzoInvalidDataException
import java.util.Collections
import java.util.Objects

class KeyCheckHealthResponse
private constructor(
    private val key: JsonField<Key>,
    private val loggingCallbacks: JsonField<LoggingCallbacks>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("key") @ExcludeMissing key: JsonField<Key> = JsonMissing.of(),
        @JsonProperty("logging_callbacks")
        @ExcludeMissing
        loggingCallbacks: JsonField<LoggingCallbacks> = JsonMissing.of(),
    ) : this(key, loggingCallbacks, mutableMapOf())

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun key(): Key? = key.getNullable("key")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun loggingCallbacks(): LoggingCallbacks? = loggingCallbacks.getNullable("logging_callbacks")

    /**
     * Returns the raw JSON value of [key].
     *
     * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<Key> = key

    /**
     * Returns the raw JSON value of [loggingCallbacks].
     *
     * Unlike [loggingCallbacks], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("logging_callbacks")
    @ExcludeMissing
    fun _loggingCallbacks(): JsonField<LoggingCallbacks> = loggingCallbacks

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

        /** Returns a mutable builder for constructing an instance of [KeyCheckHealthResponse]. */
        fun builder() = Builder()
    }

    /** A builder for [KeyCheckHealthResponse]. */
    class Builder internal constructor() {

        private var key: JsonField<Key> = JsonMissing.of()
        private var loggingCallbacks: JsonField<LoggingCallbacks> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(keyCheckHealthResponse: KeyCheckHealthResponse) = apply {
            key = keyCheckHealthResponse.key
            loggingCallbacks = keyCheckHealthResponse.loggingCallbacks
            additionalProperties = keyCheckHealthResponse.additionalProperties.toMutableMap()
        }

        fun key(key: Key) = key(JsonField.of(key))

        /**
         * Sets [Builder.key] to an arbitrary JSON value.
         *
         * You should usually call [Builder.key] with a well-typed [Key] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun key(key: JsonField<Key>) = apply { this.key = key }

        fun loggingCallbacks(loggingCallbacks: LoggingCallbacks?) =
            loggingCallbacks(JsonField.ofNullable(loggingCallbacks))

        /**
         * Sets [Builder.loggingCallbacks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.loggingCallbacks] with a well-typed [LoggingCallbacks]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun loggingCallbacks(loggingCallbacks: JsonField<LoggingCallbacks>) = apply {
            this.loggingCallbacks = loggingCallbacks
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
         * Returns an immutable instance of [KeyCheckHealthResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): KeyCheckHealthResponse =
            KeyCheckHealthResponse(key, loggingCallbacks, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): KeyCheckHealthResponse = apply {
        if (validated) {
            return@apply
        }

        key()
        loggingCallbacks()?.validate()
        validated = true
    }

    class Key @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val HEALTHY = of("healthy")

            val UNHEALTHY = of("unhealthy")

            fun of(value: String) = Key(JsonField.of(value))
        }

        /** An enum containing [Key]'s known values. */
        enum class Known {
            HEALTHY,
            UNHEALTHY,
        }

        /**
         * An enum containing [Key]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Key] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            HEALTHY,
            UNHEALTHY,
            /** An enum member indicating that [Key] was instantiated with an unknown value. */
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
                HEALTHY -> Value.HEALTHY
                UNHEALTHY -> Value.UNHEALTHY
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
                HEALTHY -> Known.HEALTHY
                UNHEALTHY -> Known.UNHEALTHY
                else -> throw HanzoInvalidDataException("Unknown Key: $value")
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

            return /* spotless:off */ other is Key && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class LoggingCallbacks
    private constructor(
        private val callbacks: JsonField<List<String>>,
        private val details: JsonField<String>,
        private val status: JsonField<Status>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("callbacks")
            @ExcludeMissing
            callbacks: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("details") @ExcludeMissing details: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        ) : this(callbacks, details, status, mutableMapOf())

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callbacks(): List<String>? = callbacks.getNullable("callbacks")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun details(): String? = details.getNullable("details")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Status? = status.getNullable("status")

        /**
         * Returns the raw JSON value of [callbacks].
         *
         * Unlike [callbacks], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("callbacks")
        @ExcludeMissing
        fun _callbacks(): JsonField<List<String>> = callbacks

        /**
         * Returns the raw JSON value of [details].
         *
         * Unlike [details], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("details") @ExcludeMissing fun _details(): JsonField<String> = details

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

            /** Returns a mutable builder for constructing an instance of [LoggingCallbacks]. */
            fun builder() = Builder()
        }

        /** A builder for [LoggingCallbacks]. */
        class Builder internal constructor() {

            private var callbacks: JsonField<MutableList<String>>? = null
            private var details: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(loggingCallbacks: LoggingCallbacks) = apply {
                callbacks = loggingCallbacks.callbacks.map { it.toMutableList() }
                details = loggingCallbacks.details
                status = loggingCallbacks.status
                additionalProperties = loggingCallbacks.additionalProperties.toMutableMap()
            }

            fun callbacks(callbacks: List<String>) = callbacks(JsonField.of(callbacks))

            /**
             * Sets [Builder.callbacks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callbacks] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callbacks(callbacks: JsonField<List<String>>) = apply {
                this.callbacks = callbacks.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [callbacks].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCallback(callback: String) = apply {
                callbacks =
                    (callbacks ?: JsonField.of(mutableListOf())).also {
                        checkKnown("callbacks", it).add(callback)
                    }
            }

            fun details(details: String?) = details(JsonField.ofNullable(details))

            /**
             * Sets [Builder.details] to an arbitrary JSON value.
             *
             * You should usually call [Builder.details] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun details(details: JsonField<String>) = apply { this.details = details }

            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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
             * Returns an immutable instance of [LoggingCallbacks].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): LoggingCallbacks =
                LoggingCallbacks(
                    (callbacks ?: JsonMissing.of()).map { it.toImmutable() },
                    details,
                    status,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): LoggingCallbacks = apply {
            if (validated) {
                return@apply
            }

            callbacks()
            details()
            status()
            validated = true
        }

        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val HEALTHY = of("healthy")

                val UNHEALTHY = of("unhealthy")

                fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                HEALTHY,
                UNHEALTHY,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                HEALTHY,
                UNHEALTHY,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    HEALTHY -> Value.HEALTHY
                    UNHEALTHY -> Value.UNHEALTHY
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws HanzoInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    HEALTHY -> Known.HEALTHY
                    UNHEALTHY -> Known.UNHEALTHY
                    else -> throw HanzoInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
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

                return /* spotless:off */ other is Status && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LoggingCallbacks && callbacks == other.callbacks && details == other.details && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(callbacks, details, status, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LoggingCallbacks{callbacks=$callbacks, details=$details, status=$status, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is KeyCheckHealthResponse && key == other.key && loggingCallbacks == other.loggingCallbacks && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(key, loggingCallbacks, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "KeyCheckHealthResponse{key=$key, loggingCallbacks=$loggingCallbacks, additionalProperties=$additionalProperties}"
}
