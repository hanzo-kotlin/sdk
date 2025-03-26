// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.key

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hanzo_ai.api.core.ExcludeMissing
import com.hanzo_ai.api.core.JsonField
import com.hanzo_ai.api.core.JsonMissing
import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.core.Params
import com.hanzo_ai.api.core.checkKnown
import com.hanzo_ai.api.core.http.Headers
import com.hanzo_ai.api.core.http.QueryParams
import com.hanzo_ai.api.core.toImmutable
import com.hanzo_ai.api.errors.HanzoInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * Delete a key from the key management system.
 *
 * Parameters::
 * - keys (List[str]): A list of keys or hashed keys to delete. Example {"keys":
 *   ["sk-QWrxEynunsNpV1zT48HIrw", "837e17519f44683334df5291321d97b8bf1098cd490e49e215f6fea935aa28be"]}
 * - key_aliases (List[str]): A list of key aliases to delete. Can be passed instead of
 *   `keys`.Example {"key_aliases": ["alias1", "alias2"]}
 *
 * Returns:
 * - deleted_keys (List[str]): A list of deleted keys. Example {"deleted_keys":
 *   ["sk-QWrxEynunsNpV1zT48HIrw", "837e17519f44683334df5291321d97b8bf1098cd490e49e215f6fea935aa28be"]}
 *
 * Example:
 * ```bash
 * curl --location 'http://0.0.0.0:4000/key/delete'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data '{
 *     "keys": ["sk-QWrxEynunsNpV1zT48HIrw"]
 * }'
 * ```
 *
 * Raises: HTTPException: If an error occurs during key deletion.
 */
class KeyDeleteParams
private constructor(
    private val llmChangedBy: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The llm-changed-by header enables tracking of actions performed by authorized users on behalf
     * of other users, providing an audit trail for accountability
     */
    fun llmChangedBy(): String? = llmChangedBy

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun keyAliases(): List<String>? = body.keyAliases()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun keys(): List<String>? = body.keys()

    /**
     * Returns the raw JSON value of [keyAliases].
     *
     * Unlike [keyAliases], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _keyAliases(): JsonField<List<String>> = body._keyAliases()

    /**
     * Returns the raw JSON value of [keys].
     *
     * Unlike [keys], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _keys(): JsonField<List<String>> = body._keys()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): KeyDeleteParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [KeyDeleteParams]. */
        fun builder() = Builder()
    }

    /** A builder for [KeyDeleteParams]. */
    class Builder internal constructor() {

        private var llmChangedBy: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(keyDeleteParams: KeyDeleteParams) = apply {
            llmChangedBy = keyDeleteParams.llmChangedBy
            body = keyDeleteParams.body.toBuilder()
            additionalHeaders = keyDeleteParams.additionalHeaders.toBuilder()
            additionalQueryParams = keyDeleteParams.additionalQueryParams.toBuilder()
        }

        /**
         * The llm-changed-by header enables tracking of actions performed by authorized users on
         * behalf of other users, providing an audit trail for accountability
         */
        fun llmChangedBy(llmChangedBy: String?) = apply { this.llmChangedBy = llmChangedBy }

        fun keyAliases(keyAliases: List<String>?) = apply { body.keyAliases(keyAliases) }

        /**
         * Sets [Builder.keyAliases] to an arbitrary JSON value.
         *
         * You should usually call [Builder.keyAliases] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun keyAliases(keyAliases: JsonField<List<String>>) = apply { body.keyAliases(keyAliases) }

        /**
         * Adds a single [String] to [keyAliases].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addKeyAlias(keyAlias: String) = apply { body.addKeyAlias(keyAlias) }

        fun keys(keys: List<String>?) = apply { body.keys(keys) }

        /**
         * Sets [Builder.keys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.keys] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun keys(keys: JsonField<List<String>>) = apply { body.keys(keys) }

        /**
         * Adds a single [String] to [keys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addKey(key: String) = apply { body.addKey(key) }

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
         * Returns an immutable instance of [KeyDeleteParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): KeyDeleteParams =
            KeyDeleteParams(
                llmChangedBy,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    internal fun _body(): Body = body

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                llmChangedBy?.let { put("llm-changed-by", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val keyAliases: JsonField<List<String>>,
        private val keys: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("key_aliases")
            @ExcludeMissing
            keyAliases: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("keys") @ExcludeMissing keys: JsonField<List<String>> = JsonMissing.of(),
        ) : this(keyAliases, keys, mutableMapOf())

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun keyAliases(): List<String>? = keyAliases.getNullable("key_aliases")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun keys(): List<String>? = keys.getNullable("keys")

        /**
         * Returns the raw JSON value of [keyAliases].
         *
         * Unlike [keyAliases], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("key_aliases")
        @ExcludeMissing
        fun _keyAliases(): JsonField<List<String>> = keyAliases

        /**
         * Returns the raw JSON value of [keys].
         *
         * Unlike [keys], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("keys") @ExcludeMissing fun _keys(): JsonField<List<String>> = keys

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var keyAliases: JsonField<MutableList<String>>? = null
            private var keys: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                keyAliases = body.keyAliases.map { it.toMutableList() }
                keys = body.keys.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun keyAliases(keyAliases: List<String>?) = keyAliases(JsonField.ofNullable(keyAliases))

            /**
             * Sets [Builder.keyAliases] to an arbitrary JSON value.
             *
             * You should usually call [Builder.keyAliases] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun keyAliases(keyAliases: JsonField<List<String>>) = apply {
                this.keyAliases = keyAliases.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [keyAliases].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addKeyAlias(keyAlias: String) = apply {
                keyAliases =
                    (keyAliases ?: JsonField.of(mutableListOf())).also {
                        checkKnown("keyAliases", it).add(keyAlias)
                    }
            }

            fun keys(keys: List<String>?) = keys(JsonField.ofNullable(keys))

            /**
             * Sets [Builder.keys] to an arbitrary JSON value.
             *
             * You should usually call [Builder.keys] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun keys(keys: JsonField<List<String>>) = apply {
                this.keys = keys.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [keys].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addKey(key: String) = apply {
                keys =
                    (keys ?: JsonField.of(mutableListOf())).also { checkKnown("keys", it).add(key) }
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
             */
            fun build(): Body =
                Body(
                    (keyAliases ?: JsonMissing.of()).map { it.toImmutable() },
                    (keys ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            keyAliases()
            keys()
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && keyAliases == other.keyAliases && keys == other.keys && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(keyAliases, keys, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{keyAliases=$keyAliases, keys=$keys, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is KeyDeleteParams && llmChangedBy == other.llmChangedBy && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(llmChangedBy, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "KeyDeleteParams{llmChangedBy=$llmChangedBy, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
