// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.customer

import ai.hanzo.api.core.ExcludeMissing
import ai.hanzo.api.core.JsonField
import ai.hanzo.api.core.JsonMissing
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.checkKnown
import ai.hanzo.api.core.checkRequired
import ai.hanzo.api.core.toImmutable
import ai.hanzo.api.errors.HanzoInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class BlockUsers
private constructor(
    private val userIds: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("user_ids")
        @ExcludeMissing
        userIds: JsonField<List<String>> = JsonMissing.of()
    ) : this(userIds, mutableMapOf())

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userIds(): List<String> = userIds.getRequired("user_ids")

    /**
     * Returns the raw JSON value of [userIds].
     *
     * Unlike [userIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_ids") @ExcludeMissing fun _userIds(): JsonField<List<String>> = userIds

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
         * Returns a mutable builder for constructing an instance of [BlockUsers].
         *
         * The following fields are required:
         * ```kotlin
         * .userIds()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BlockUsers]. */
    class Builder internal constructor() {

        private var userIds: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(blockUsers: BlockUsers) = apply {
            userIds = blockUsers.userIds.map { it.toMutableList() }
            additionalProperties = blockUsers.additionalProperties.toMutableMap()
        }

        fun userIds(userIds: List<String>) = userIds(JsonField.of(userIds))

        /**
         * Sets [Builder.userIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userIds] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userIds(userIds: JsonField<List<String>>) = apply {
            this.userIds = userIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [userIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUserId(userId: String) = apply {
            userIds =
                (userIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("userIds", it).add(userId)
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
         * Returns an immutable instance of [BlockUsers].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .userIds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BlockUsers =
            BlockUsers(
                checkRequired("userIds", userIds).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BlockUsers = apply {
        if (validated) {
            return@apply
        }

        userIds()
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
    internal fun validity(): Int = (userIds.asKnown()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BlockUsers &&
            userIds == other.userIds &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(userIds, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BlockUsers{userIds=$userIds, additionalProperties=$additionalProperties}"
}
