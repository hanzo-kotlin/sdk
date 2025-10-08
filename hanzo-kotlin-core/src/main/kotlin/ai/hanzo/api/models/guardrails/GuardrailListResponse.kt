// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.guardrails

import ai.hanzo.api.core.BaseDeserializer
import ai.hanzo.api.core.BaseSerializer
import ai.hanzo.api.core.ExcludeMissing
import ai.hanzo.api.core.JsonField
import ai.hanzo.api.core.JsonMissing
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.allMaxBy
import ai.hanzo.api.core.checkKnown
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
import java.util.Collections
import java.util.Objects

class GuardrailListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val guardrails: JsonField<List<Guardrail>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("guardrails")
        @ExcludeMissing
        guardrails: JsonField<List<Guardrail>> = JsonMissing.of()
    ) : this(guardrails, mutableMapOf())

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun guardrails(): List<Guardrail> = guardrails.getRequired("guardrails")

    /**
     * Returns the raw JSON value of [guardrails].
     *
     * Unlike [guardrails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("guardrails")
    @ExcludeMissing
    fun _guardrails(): JsonField<List<Guardrail>> = guardrails

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
         * Returns a mutable builder for constructing an instance of [GuardrailListResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .guardrails()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [GuardrailListResponse]. */
    class Builder internal constructor() {

        private var guardrails: JsonField<MutableList<Guardrail>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(guardrailListResponse: GuardrailListResponse) = apply {
            guardrails = guardrailListResponse.guardrails.map { it.toMutableList() }
            additionalProperties = guardrailListResponse.additionalProperties.toMutableMap()
        }

        fun guardrails(guardrails: List<Guardrail>) = guardrails(JsonField.of(guardrails))

        /**
         * Sets [Builder.guardrails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.guardrails] with a well-typed `List<Guardrail>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun guardrails(guardrails: JsonField<List<Guardrail>>) = apply {
            this.guardrails = guardrails.map { it.toMutableList() }
        }

        /**
         * Adds a single [Guardrail] to [guardrails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGuardrail(guardrail: Guardrail) = apply {
            guardrails =
                (guardrails ?: JsonField.of(mutableListOf())).also {
                    checkKnown("guardrails", it).add(guardrail)
                }
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
         * Returns an immutable instance of [GuardrailListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .guardrails()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): GuardrailListResponse =
            GuardrailListResponse(
                checkRequired("guardrails", guardrails).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): GuardrailListResponse = apply {
        if (validated) {
            return@apply
        }

        guardrails().forEach { it.validate() }
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
    internal fun validity(): Int = (guardrails.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    class Guardrail
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val guardrailInfo: JsonValue,
        private val guardrailName: JsonField<String>,
        private val llmParams: JsonField<LlmParams>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("guardrail_info")
            @ExcludeMissing
            guardrailInfo: JsonValue = JsonMissing.of(),
            @JsonProperty("guardrail_name")
            @ExcludeMissing
            guardrailName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("llm_params")
            @ExcludeMissing
            llmParams: JsonField<LlmParams> = JsonMissing.of(),
        ) : this(guardrailInfo, guardrailName, llmParams, mutableMapOf())

        @JsonProperty("guardrail_info")
        @ExcludeMissing
        fun _guardrailInfo(): JsonValue = guardrailInfo

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun guardrailName(): String = guardrailName.getRequired("guardrail_name")

        /**
         * The returned LLM Params object for /guardrails/list
         *
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun llmParams(): LlmParams = llmParams.getRequired("llm_params")

        /**
         * Returns the raw JSON value of [guardrailName].
         *
         * Unlike [guardrailName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("guardrail_name")
        @ExcludeMissing
        fun _guardrailName(): JsonField<String> = guardrailName

        /**
         * Returns the raw JSON value of [llmParams].
         *
         * Unlike [llmParams], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("llm_params")
        @ExcludeMissing
        fun _llmParams(): JsonField<LlmParams> = llmParams

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
             * Returns a mutable builder for constructing an instance of [Guardrail].
             *
             * The following fields are required:
             * ```kotlin
             * .guardrailInfo()
             * .guardrailName()
             * .llmParams()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Guardrail]. */
        class Builder internal constructor() {

            private var guardrailInfo: JsonValue? = null
            private var guardrailName: JsonField<String>? = null
            private var llmParams: JsonField<LlmParams>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(guardrail: Guardrail) = apply {
                guardrailInfo = guardrail.guardrailInfo
                guardrailName = guardrail.guardrailName
                llmParams = guardrail.llmParams
                additionalProperties = guardrail.additionalProperties.toMutableMap()
            }

            fun guardrailInfo(guardrailInfo: JsonValue) = apply {
                this.guardrailInfo = guardrailInfo
            }

            fun guardrailName(guardrailName: String) = guardrailName(JsonField.of(guardrailName))

            /**
             * Sets [Builder.guardrailName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.guardrailName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun guardrailName(guardrailName: JsonField<String>) = apply {
                this.guardrailName = guardrailName
            }

            /** The returned LLM Params object for /guardrails/list */
            fun llmParams(llmParams: LlmParams) = llmParams(JsonField.of(llmParams))

            /**
             * Sets [Builder.llmParams] to an arbitrary JSON value.
             *
             * You should usually call [Builder.llmParams] with a well-typed [LlmParams] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun llmParams(llmParams: JsonField<LlmParams>) = apply { this.llmParams = llmParams }

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
             * Returns an immutable instance of [Guardrail].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .guardrailInfo()
             * .guardrailName()
             * .llmParams()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Guardrail =
                Guardrail(
                    checkRequired("guardrailInfo", guardrailInfo),
                    checkRequired("guardrailName", guardrailName),
                    checkRequired("llmParams", llmParams),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Guardrail = apply {
            if (validated) {
                return@apply
            }

            guardrailName()
            llmParams().validate()
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
            (if (guardrailName.asKnown() == null) 0 else 1) + (llmParams.asKnown()?.validity() ?: 0)

        /** The returned LLM Params object for /guardrails/list */
        class LlmParams
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val guardrail: JsonField<String>,
            private val mode: JsonField<Mode>,
            private val defaultOn: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("guardrail")
                @ExcludeMissing
                guardrail: JsonField<String> = JsonMissing.of(),
                @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of(),
                @JsonProperty("default_on")
                @ExcludeMissing
                defaultOn: JsonField<Boolean> = JsonMissing.of(),
            ) : this(guardrail, mode, defaultOn, mutableMapOf())

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun guardrail(): String = guardrail.getRequired("guardrail")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun mode(): Mode = mode.getRequired("mode")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun defaultOn(): Boolean? = defaultOn.getNullable("default_on")

            /**
             * Returns the raw JSON value of [guardrail].
             *
             * Unlike [guardrail], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("guardrail")
            @ExcludeMissing
            fun _guardrail(): JsonField<String> = guardrail

            /**
             * Returns the raw JSON value of [mode].
             *
             * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

            /**
             * Returns the raw JSON value of [defaultOn].
             *
             * Unlike [defaultOn], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("default_on")
            @ExcludeMissing
            fun _defaultOn(): JsonField<Boolean> = defaultOn

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
                 * Returns a mutable builder for constructing an instance of [LlmParams].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .guardrail()
                 * .mode()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [LlmParams]. */
            class Builder internal constructor() {

                private var guardrail: JsonField<String>? = null
                private var mode: JsonField<Mode>? = null
                private var defaultOn: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(llmParams: LlmParams) = apply {
                    guardrail = llmParams.guardrail
                    mode = llmParams.mode
                    defaultOn = llmParams.defaultOn
                    additionalProperties = llmParams.additionalProperties.toMutableMap()
                }

                fun guardrail(guardrail: String) = guardrail(JsonField.of(guardrail))

                /**
                 * Sets [Builder.guardrail] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.guardrail] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun guardrail(guardrail: JsonField<String>) = apply { this.guardrail = guardrail }

                fun mode(mode: Mode) = mode(JsonField.of(mode))

                /**
                 * Sets [Builder.mode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mode] with a well-typed [Mode] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

                /** Alias for calling [mode] with `Mode.ofString(string)`. */
                fun mode(string: String) = mode(Mode.ofString(string))

                /** Alias for calling [mode] with `Mode.ofStrings(strings)`. */
                fun modeOfStrings(strings: List<String>) = mode(Mode.ofStrings(strings))

                fun defaultOn(defaultOn: Boolean) = defaultOn(JsonField.of(defaultOn))

                /**
                 * Sets [Builder.defaultOn] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.defaultOn] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun defaultOn(defaultOn: JsonField<Boolean>) = apply { this.defaultOn = defaultOn }

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
                 * Returns an immutable instance of [LlmParams].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .guardrail()
                 * .mode()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): LlmParams =
                    LlmParams(
                        checkRequired("guardrail", guardrail),
                        checkRequired("mode", mode),
                        defaultOn,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): LlmParams = apply {
                if (validated) {
                    return@apply
                }

                guardrail()
                mode().validate()
                defaultOn()
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
                (if (guardrail.asKnown() == null) 0 else 1) +
                    (mode.asKnown()?.validity() ?: 0) +
                    (if (defaultOn.asKnown() == null) 0 else 1)

            @JsonDeserialize(using = Mode.Deserializer::class)
            @JsonSerialize(using = Mode.Serializer::class)
            class Mode
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

                fun validate(): Mode = apply {
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

                    return other is Mode && string == other.string && strings == other.strings
                }

                override fun hashCode(): Int = Objects.hash(string, strings)

                override fun toString(): String =
                    when {
                        string != null -> "Mode{string=$string}"
                        strings != null -> "Mode{strings=$strings}"
                        _json != null -> "Mode{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Mode")
                    }

                companion object {

                    fun ofString(string: String) = Mode(string = string)

                    fun ofStrings(strings: List<String>) = Mode(strings = strings.toImmutable())
                }

                /**
                 * An interface that defines how to map each variant of [Mode] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitStrings(strings: List<String>): T

                    /**
                     * Maps an unknown variant of [Mode] to a value of type [T].
                     *
                     * An instance of [Mode] can contain an unknown variant if it was deserialized
                     * from data that doesn't match any known variant. For example, if the SDK is on
                     * an older version than the API, then the API may respond with new variants
                     * that the SDK is unaware of.
                     *
                     * @throws HanzoInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw HanzoInvalidDataException("Unknown Mode: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Mode>(Mode::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Mode {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Mode(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                        Mode(strings = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // object).
                            0 -> Mode(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Mode>(Mode::class) {

                    override fun serialize(
                        value: Mode,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.strings != null -> generator.writeObject(value.strings)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Mode")
                        }
                    }
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LlmParams &&
                    guardrail == other.guardrail &&
                    mode == other.mode &&
                    defaultOn == other.defaultOn &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(guardrail, mode, defaultOn, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LlmParams{guardrail=$guardrail, mode=$mode, defaultOn=$defaultOn, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Guardrail &&
                guardrailInfo == other.guardrailInfo &&
                guardrailName == other.guardrailName &&
                llmParams == other.llmParams &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(guardrailInfo, guardrailName, llmParams, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Guardrail{guardrailInfo=$guardrailInfo, guardrailName=$guardrailName, llmParams=$llmParams, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GuardrailListResponse &&
            guardrails == other.guardrails &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(guardrails, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GuardrailListResponse{guardrails=$guardrails, additionalProperties=$additionalProperties}"
}
