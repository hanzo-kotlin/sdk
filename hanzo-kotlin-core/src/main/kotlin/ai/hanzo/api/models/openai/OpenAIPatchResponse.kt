// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.openai

import ai.hanzo.api.core.ExcludeMissing
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.errors.HanzoInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Collections
import java.util.Objects

class OpenAIPatchResponse
private constructor(private val additionalProperties: MutableMap<String, JsonValue>) {

    @JsonCreator private constructor() : this(mutableMapOf())

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

        /** Returns a mutable builder for constructing an instance of [OpenAIPatchResponse]. */
        fun builder() = Builder()
    }

    /** A builder for [OpenAIPatchResponse]. */
    class Builder internal constructor() {

        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(openaiPatchResponse: OpenAIPatchResponse) = apply {
            additionalProperties = openaiPatchResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [OpenAIPatchResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OpenAIPatchResponse = OpenAIPatchResponse(additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): OpenAIPatchResponse = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int = 0

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OpenAIPatchResponse && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "OpenAIPatchResponse{additionalProperties=$additionalProperties}"
}
