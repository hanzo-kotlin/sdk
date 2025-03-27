// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.organization

import ai.hanzo.api.core.Enum
import ai.hanzo.api.core.ExcludeMissing
import ai.hanzo.api.core.JsonField
import ai.hanzo.api.core.JsonMissing
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.Params
import ai.hanzo.api.core.checkRequired
import ai.hanzo.api.core.http.Headers
import ai.hanzo.api.core.http.QueryParams
import ai.hanzo.api.errors.HanzoInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/** Update a member's role in an organization */
class OrganizationUpdateMemberParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun organizationId(): String = body.organizationId()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxBudgetInOrganization(): Double? = body.maxBudgetInOrganization()

    /**
     * Admin Roles: PROXY_ADMIN: admin over the platform PROXY_ADMIN_VIEW_ONLY: can login, view all
     * own keys, view all spend ORG_ADMIN: admin over a specific organization, can create teams,
     * users only within their organization
     *
     * Internal User Roles: INTERNAL_USER: can login, view/create/delete their own keys, view their
     * spend INTERNAL_USER_VIEW_ONLY: can login, view their own keys, view their own spend
     *
     * Team Roles: TEAM: used for JWT auth
     *
     * Customer Roles: CUSTOMER: External users -> these are customers
     *
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
     * Returns the raw JSON value of [organizationId].
     *
     * Unlike [organizationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _organizationId(): JsonField<String> = body._organizationId()

    /**
     * Returns the raw JSON value of [maxBudgetInOrganization].
     *
     * Unlike [maxBudgetInOrganization], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _maxBudgetInOrganization(): JsonField<Double> = body._maxBudgetInOrganization()

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
         * Returns a mutable builder for constructing an instance of
         * [OrganizationUpdateMemberParams].
         *
         * The following fields are required:
         * ```kotlin
         * .organizationId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [OrganizationUpdateMemberParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(organizationUpdateMemberParams: OrganizationUpdateMemberParams) = apply {
            body = organizationUpdateMemberParams.body.toBuilder()
            additionalHeaders = organizationUpdateMemberParams.additionalHeaders.toBuilder()
            additionalQueryParams = organizationUpdateMemberParams.additionalQueryParams.toBuilder()
        }

        fun organizationId(organizationId: String) = apply { body.organizationId(organizationId) }

        /**
         * Sets [Builder.organizationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizationId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun organizationId(organizationId: JsonField<String>) = apply {
            body.organizationId(organizationId)
        }

        fun maxBudgetInOrganization(maxBudgetInOrganization: Double?) = apply {
            body.maxBudgetInOrganization(maxBudgetInOrganization)
        }

        /**
         * Alias for [Builder.maxBudgetInOrganization].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxBudgetInOrganization(maxBudgetInOrganization: Double) =
            maxBudgetInOrganization(maxBudgetInOrganization as Double?)

        /**
         * Sets [Builder.maxBudgetInOrganization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxBudgetInOrganization] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun maxBudgetInOrganization(maxBudgetInOrganization: JsonField<Double>) = apply {
            body.maxBudgetInOrganization(maxBudgetInOrganization)
        }

        /**
         * Admin Roles: PROXY_ADMIN: admin over the platform PROXY_ADMIN_VIEW_ONLY: can login, view
         * all own keys, view all spend ORG_ADMIN: admin over a specific organization, can create
         * teams, users only within their organization
         *
         * Internal User Roles: INTERNAL_USER: can login, view/create/delete their own keys, view
         * their spend INTERNAL_USER_VIEW_ONLY: can login, view their own keys, view their own spend
         *
         * Team Roles: TEAM: used for JWT auth
         *
         * Customer Roles: CUSTOMER: External users -> these are customers
         */
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
         * Returns an immutable instance of [OrganizationUpdateMemberParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .organizationId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OrganizationUpdateMemberParams =
            OrganizationUpdateMemberParams(
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
        private val organizationId: JsonField<String>,
        private val maxBudgetInOrganization: JsonField<Double>,
        private val role: JsonField<Role>,
        private val userEmail: JsonField<String>,
        private val userId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("organization_id")
            @ExcludeMissing
            organizationId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_budget_in_organization")
            @ExcludeMissing
            maxBudgetInOrganization: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("role") @ExcludeMissing role: JsonField<Role> = JsonMissing.of(),
            @JsonProperty("user_email")
            @ExcludeMissing
            userEmail: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        ) : this(organizationId, maxBudgetInOrganization, role, userEmail, userId, mutableMapOf())

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun organizationId(): String = organizationId.getRequired("organization_id")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxBudgetInOrganization(): Double? =
            maxBudgetInOrganization.getNullable("max_budget_in_organization")

        /**
         * Admin Roles: PROXY_ADMIN: admin over the platform PROXY_ADMIN_VIEW_ONLY: can login, view
         * all own keys, view all spend ORG_ADMIN: admin over a specific organization, can create
         * teams, users only within their organization
         *
         * Internal User Roles: INTERNAL_USER: can login, view/create/delete their own keys, view
         * their spend INTERNAL_USER_VIEW_ONLY: can login, view their own keys, view their own spend
         *
         * Team Roles: TEAM: used for JWT auth
         *
         * Customer Roles: CUSTOMER: External users -> these are customers
         *
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
         * Returns the raw JSON value of [organizationId].
         *
         * Unlike [organizationId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("organization_id")
        @ExcludeMissing
        fun _organizationId(): JsonField<String> = organizationId

        /**
         * Returns the raw JSON value of [maxBudgetInOrganization].
         *
         * Unlike [maxBudgetInOrganization], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("max_budget_in_organization")
        @ExcludeMissing
        fun _maxBudgetInOrganization(): JsonField<Double> = maxBudgetInOrganization

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
             * .organizationId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var organizationId: JsonField<String>? = null
            private var maxBudgetInOrganization: JsonField<Double> = JsonMissing.of()
            private var role: JsonField<Role> = JsonMissing.of()
            private var userEmail: JsonField<String> = JsonMissing.of()
            private var userId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                organizationId = body.organizationId
                maxBudgetInOrganization = body.maxBudgetInOrganization
                role = body.role
                userEmail = body.userEmail
                userId = body.userId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun organizationId(organizationId: String) =
                organizationId(JsonField.of(organizationId))

            /**
             * Sets [Builder.organizationId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.organizationId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun organizationId(organizationId: JsonField<String>) = apply {
                this.organizationId = organizationId
            }

            fun maxBudgetInOrganization(maxBudgetInOrganization: Double?) =
                maxBudgetInOrganization(JsonField.ofNullable(maxBudgetInOrganization))

            /**
             * Alias for [Builder.maxBudgetInOrganization].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxBudgetInOrganization(maxBudgetInOrganization: Double) =
                maxBudgetInOrganization(maxBudgetInOrganization as Double?)

            /**
             * Sets [Builder.maxBudgetInOrganization] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxBudgetInOrganization] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun maxBudgetInOrganization(maxBudgetInOrganization: JsonField<Double>) = apply {
                this.maxBudgetInOrganization = maxBudgetInOrganization
            }

            /**
             * Admin Roles: PROXY_ADMIN: admin over the platform PROXY_ADMIN_VIEW_ONLY: can login,
             * view all own keys, view all spend ORG_ADMIN: admin over a specific organization, can
             * create teams, users only within their organization
             *
             * Internal User Roles: INTERNAL_USER: can login, view/create/delete their own keys,
             * view their spend INTERNAL_USER_VIEW_ONLY: can login, view their own keys, view their
             * own spend
             *
             * Team Roles: TEAM: used for JWT auth
             *
             * Customer Roles: CUSTOMER: External users -> these are customers
             */
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
             * .organizationId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("organizationId", organizationId),
                    maxBudgetInOrganization,
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

            organizationId()
            maxBudgetInOrganization()
            role()
            userEmail()
            userId()
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && organizationId == other.organizationId && maxBudgetInOrganization == other.maxBudgetInOrganization && role == other.role && userEmail == other.userEmail && userId == other.userId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(organizationId, maxBudgetInOrganization, role, userEmail, userId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{organizationId=$organizationId, maxBudgetInOrganization=$maxBudgetInOrganization, role=$role, userEmail=$userEmail, userId=$userId, additionalProperties=$additionalProperties}"
    }

    /**
     * Admin Roles: PROXY_ADMIN: admin over the platform PROXY_ADMIN_VIEW_ONLY: can login, view all
     * own keys, view all spend ORG_ADMIN: admin over a specific organization, can create teams,
     * users only within their organization
     *
     * Internal User Roles: INTERNAL_USER: can login, view/create/delete their own keys, view their
     * spend INTERNAL_USER_VIEW_ONLY: can login, view their own keys, view their own spend
     *
     * Team Roles: TEAM: used for JWT auth
     *
     * Customer Roles: CUSTOMER: External users -> these are customers
     */
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

            val PROXY_ADMIN = of("proxy_admin")

            val PROXY_ADMIN_VIEWER = of("proxy_admin_viewer")

            val ORG_ADMIN = of("org_admin")

            val INTERNAL_USER = of("internal_user")

            val INTERNAL_USER_VIEWER = of("internal_user_viewer")

            val TEAM = of("team")

            val CUSTOMER = of("customer")

            fun of(value: String) = Role(JsonField.of(value))
        }

        /** An enum containing [Role]'s known values. */
        enum class Known {
            PROXY_ADMIN,
            PROXY_ADMIN_VIEWER,
            ORG_ADMIN,
            INTERNAL_USER,
            INTERNAL_USER_VIEWER,
            TEAM,
            CUSTOMER,
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
            PROXY_ADMIN,
            PROXY_ADMIN_VIEWER,
            ORG_ADMIN,
            INTERNAL_USER,
            INTERNAL_USER_VIEWER,
            TEAM,
            CUSTOMER,
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
                PROXY_ADMIN -> Value.PROXY_ADMIN
                PROXY_ADMIN_VIEWER -> Value.PROXY_ADMIN_VIEWER
                ORG_ADMIN -> Value.ORG_ADMIN
                INTERNAL_USER -> Value.INTERNAL_USER
                INTERNAL_USER_VIEWER -> Value.INTERNAL_USER_VIEWER
                TEAM -> Value.TEAM
                CUSTOMER -> Value.CUSTOMER
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
                PROXY_ADMIN -> Known.PROXY_ADMIN
                PROXY_ADMIN_VIEWER -> Known.PROXY_ADMIN_VIEWER
                ORG_ADMIN -> Known.ORG_ADMIN
                INTERNAL_USER -> Known.INTERNAL_USER
                INTERNAL_USER_VIEWER -> Known.INTERNAL_USER_VIEWER
                TEAM -> Known.TEAM
                CUSTOMER -> Known.CUSTOMER
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

        return /* spotless:off */ other is OrganizationUpdateMemberParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "OrganizationUpdateMemberParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
