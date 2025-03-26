// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.team

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hanzo_ai.api.core.Enum
import com.hanzo_ai.api.core.ExcludeMissing
import com.hanzo_ai.api.core.JsonField
import com.hanzo_ai.api.core.JsonMissing
import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.core.Params
import com.hanzo_ai.api.core.checkRequired
import com.hanzo_ai.api.core.http.Headers
import com.hanzo_ai.api.core.http.QueryParams
import com.hanzo_ai.api.errors.HanzoInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * [BETA]
 *
 * Update team member budgets and team member role
 */
class TeamUpdateMemberParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun teamId(): String = body.teamId()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxBudgetInTeam(): Double? = body.maxBudgetInTeam()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun role(): Role? = body.role()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userEmail(): String? = body.userEmail()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): String? = body.userId()

    /**
     * Returns the raw JSON value of [teamId].
     *
     * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _teamId(): JsonField<String> = body._teamId()

    /**
     * Returns the raw JSON value of [maxBudgetInTeam].
     *
     * Unlike [maxBudgetInTeam], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxBudgetInTeam(): JsonField<Double> = body._maxBudgetInTeam()

    /**
     * Returns the raw JSON value of [role].
     *
     * Unlike [role], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _role(): JsonField<Role> = body._role()

    /**
     * Returns the raw JSON value of [userEmail].
     *
     * Unlike [userEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _userEmail(): JsonField<String> = body._userEmail()

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _userId(): JsonField<String> = body._userId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TeamUpdateMemberParams].
         *
         * The following fields are required:
         * ```kotlin
         * .teamId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [TeamUpdateMemberParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(teamUpdateMemberParams: TeamUpdateMemberParams) = apply {
            body = teamUpdateMemberParams.body.toBuilder()
            additionalHeaders = teamUpdateMemberParams.additionalHeaders.toBuilder()
            additionalQueryParams = teamUpdateMemberParams.additionalQueryParams.toBuilder()
        }

        fun teamId(teamId: String) = apply { body.teamId(teamId) }

        /**
         * Sets [Builder.teamId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teamId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun teamId(teamId: JsonField<String>) = apply { body.teamId(teamId) }

        fun maxBudgetInTeam(maxBudgetInTeam: Double?) = apply {
            body.maxBudgetInTeam(maxBudgetInTeam)
        }

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
            body.maxBudgetInTeam(maxBudgetInTeam)
        }

        fun role(role: Role?) = apply { body.role(role) }

        /**
         * Sets [Builder.role] to an arbitrary JSON value.
         *
         * You should usually call [Builder.role] with a well-typed [Role] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun role(role: JsonField<Role>) = apply { body.role(role) }

        fun userEmail(userEmail: String?) = apply { body.userEmail(userEmail) }

        /**
         * Sets [Builder.userEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userEmail(userEmail: JsonField<String>) = apply { body.userEmail(userEmail) }

        fun userId(userId: String?) = apply { body.userId(userId) }

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { body.userId(userId) }

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
         * Returns an immutable instance of [TeamUpdateMemberParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .teamId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TeamUpdateMemberParams =
            TeamUpdateMemberParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val teamId: JsonField<String>,
        private val maxBudgetInTeam: JsonField<Double>,
        private val role: JsonField<Role>,
        private val userEmail: JsonField<String>,
        private val userId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("team_id") @ExcludeMissing teamId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_budget_in_team")
            @ExcludeMissing
            maxBudgetInTeam: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("role") @ExcludeMissing role: JsonField<Role> = JsonMissing.of(),
            @JsonProperty("user_email")
            @ExcludeMissing
            userEmail: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        ) : this(teamId, maxBudgetInTeam, role, userEmail, userId, mutableMapOf())

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun teamId(): String = teamId.getRequired("team_id")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxBudgetInTeam(): Double? = maxBudgetInTeam.getNullable("max_budget_in_team")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun role(): Role? = role.getNullable("role")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userEmail(): String? = userEmail.getNullable("user_email")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userId(): String? = userId.getNullable("user_id")

        /**
         * Returns the raw JSON value of [teamId].
         *
         * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("team_id") @ExcludeMissing fun _teamId(): JsonField<String> = teamId

        /**
         * Returns the raw JSON value of [maxBudgetInTeam].
         *
         * Unlike [maxBudgetInTeam], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("max_budget_in_team")
        @ExcludeMissing
        fun _maxBudgetInTeam(): JsonField<Double> = maxBudgetInTeam

        /**
         * Returns the raw JSON value of [role].
         *
         * Unlike [role], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<Role> = role

        /**
         * Returns the raw JSON value of [userEmail].
         *
         * Unlike [userEmail], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_email") @ExcludeMissing fun _userEmail(): JsonField<String> = userEmail

        /**
         * Returns the raw JSON value of [userId].
         *
         * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

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
             * .teamId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var teamId: JsonField<String>? = null
            private var maxBudgetInTeam: JsonField<Double> = JsonMissing.of()
            private var role: JsonField<Role> = JsonMissing.of()
            private var userEmail: JsonField<String> = JsonMissing.of()
            private var userId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                teamId = body.teamId
                maxBudgetInTeam = body.maxBudgetInTeam
                role = body.role
                userEmail = body.userEmail
                userId = body.userId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun teamId(teamId: String) = teamId(JsonField.of(teamId))

            /**
             * Sets [Builder.teamId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.teamId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun teamId(teamId: JsonField<String>) = apply { this.teamId = teamId }

            fun maxBudgetInTeam(maxBudgetInTeam: Double?) =
                maxBudgetInTeam(JsonField.ofNullable(maxBudgetInTeam))

            /**
             * Alias for [Builder.maxBudgetInTeam].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxBudgetInTeam(maxBudgetInTeam: Double) =
                maxBudgetInTeam(maxBudgetInTeam as Double?)

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

            fun role(role: Role?) = role(JsonField.ofNullable(role))

            /**
             * Sets [Builder.role] to an arbitrary JSON value.
             *
             * You should usually call [Builder.role] with a well-typed [Role] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun role(role: JsonField<Role>) = apply { this.role = role }

            fun userEmail(userEmail: String?) = userEmail(JsonField.ofNullable(userEmail))

            /**
             * Sets [Builder.userEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userEmail] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userEmail(userEmail: JsonField<String>) = apply { this.userEmail = userEmail }

            fun userId(userId: String?) = userId(JsonField.ofNullable(userId))

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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
             * .teamId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("teamId", teamId),
                    maxBudgetInTeam,
                    role,
                    userEmail,
                    userId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            teamId()
            maxBudgetInTeam()
            role()
            userEmail()
            userId()
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && teamId == other.teamId && maxBudgetInTeam == other.maxBudgetInTeam && role == other.role && userEmail == other.userEmail && userId == other.userId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(teamId, maxBudgetInTeam, role, userEmail, userId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{teamId=$teamId, maxBudgetInTeam=$maxBudgetInTeam, role=$role, userEmail=$userEmail, userId=$userId, additionalProperties=$additionalProperties}"
    }

    class Role @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val ADMIN = of("admin")

            val USER = of("user")

            fun of(value: String) = Role(JsonField.of(value))
        }

        /** An enum containing [Role]'s known values. */
        enum class Known {
            ADMIN,
            USER,
        }

        /**
         * An enum containing [Role]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Role] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ADMIN,
            USER,
            /** An enum member indicating that [Role] was instantiated with an unknown value. */
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
                ADMIN -> Value.ADMIN
                USER -> Value.USER
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
                ADMIN -> Known.ADMIN
                USER -> Known.USER
                else -> throw HanzoInvalidDataException("Unknown Role: $value")
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

            return /* spotless:off */ other is Role && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TeamUpdateMemberParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TeamUpdateMemberParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
