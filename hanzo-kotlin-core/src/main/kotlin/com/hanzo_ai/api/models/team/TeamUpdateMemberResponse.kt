// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.team

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hanzo_ai.api.core.ExcludeMissing
import com.hanzo_ai.api.core.JsonField
import com.hanzo_ai.api.core.JsonMissing
import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.core.checkRequired
import com.hanzo_ai.api.errors.HanzoInvalidDataException
import java.util.Collections
import java.util.Objects

class TeamUpdateMemberResponse
private constructor(
    private val teamId: JsonField<String>,
    private val userId: JsonField<String>,
    private val maxBudgetInTeam: JsonField<Double>,
    private val userEmail: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("team_id") @ExcludeMissing teamId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("max_budget_in_team")
        @ExcludeMissing
        maxBudgetInTeam: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("user_email") @ExcludeMissing userEmail: JsonField<String> = JsonMissing.of(),
    ) : this(teamId, userId, maxBudgetInTeam, userEmail, mutableMapOf())

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun teamId(): String = teamId.getRequired("team_id")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): String = userId.getRequired("user_id")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxBudgetInTeam(): Double? = maxBudgetInTeam.getNullable("max_budget_in_team")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userEmail(): String? = userEmail.getNullable("user_email")

    /**
     * Returns the raw JSON value of [teamId].
     *
     * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("team_id") @ExcludeMissing fun _teamId(): JsonField<String> = teamId

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    /**
     * Returns the raw JSON value of [maxBudgetInTeam].
     *
     * Unlike [maxBudgetInTeam], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_budget_in_team")
    @ExcludeMissing
    fun _maxBudgetInTeam(): JsonField<Double> = maxBudgetInTeam

    /**
     * Returns the raw JSON value of [userEmail].
     *
     * Unlike [userEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_email") @ExcludeMissing fun _userEmail(): JsonField<String> = userEmail

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
         * Returns a mutable builder for constructing an instance of [TeamUpdateMemberResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .teamId()
         * .userId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [TeamUpdateMemberResponse]. */
    class Builder internal constructor() {

        private var teamId: JsonField<String>? = null
        private var userId: JsonField<String>? = null
        private var maxBudgetInTeam: JsonField<Double> = JsonMissing.of()
        private var userEmail: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(teamUpdateMemberResponse: TeamUpdateMemberResponse) = apply {
            teamId = teamUpdateMemberResponse.teamId
            userId = teamUpdateMemberResponse.userId
            maxBudgetInTeam = teamUpdateMemberResponse.maxBudgetInTeam
            userEmail = teamUpdateMemberResponse.userEmail
            additionalProperties = teamUpdateMemberResponse.additionalProperties.toMutableMap()
        }

        fun teamId(teamId: String) = teamId(JsonField.of(teamId))

        /**
         * Sets [Builder.teamId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teamId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun teamId(teamId: JsonField<String>) = apply { this.teamId = teamId }

        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        fun maxBudgetInTeam(maxBudgetInTeam: Double?) =
            maxBudgetInTeam(JsonField.ofNullable(maxBudgetInTeam))

        /**
         * Alias for [Builder.maxBudgetInTeam].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxBudgetInTeam(maxBudgetInTeam: Double) = maxBudgetInTeam(maxBudgetInTeam as Double?)

        /**
         * Sets [Builder.maxBudgetInTeam] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxBudgetInTeam] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxBudgetInTeam(maxBudgetInTeam: JsonField<Double>) = apply {
            this.maxBudgetInTeam = maxBudgetInTeam
        }

        fun userEmail(userEmail: String?) = userEmail(JsonField.ofNullable(userEmail))

        /**
         * Sets [Builder.userEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userEmail(userEmail: JsonField<String>) = apply { this.userEmail = userEmail }

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
         * Returns an immutable instance of [TeamUpdateMemberResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .teamId()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TeamUpdateMemberResponse =
            TeamUpdateMemberResponse(
                checkRequired("teamId", teamId),
                checkRequired("userId", userId),
                maxBudgetInTeam,
                userEmail,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TeamUpdateMemberResponse = apply {
        if (validated) {
            return@apply
        }

        teamId()
        userId()
        maxBudgetInTeam()
        userEmail()
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TeamUpdateMemberResponse && teamId == other.teamId && userId == other.userId && maxBudgetInTeam == other.maxBudgetInTeam && userEmail == other.userEmail && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(teamId, userId, maxBudgetInTeam, userEmail, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TeamUpdateMemberResponse{teamId=$teamId, userId=$userId, maxBudgetInTeam=$maxBudgetInTeam, userEmail=$userEmail, additionalProperties=$additionalProperties}"
}
