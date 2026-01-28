// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.organization

import ai.hanzo.api.core.Enum
import ai.hanzo.api.core.JsonField
import ai.hanzo.api.errors.HanzoInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/**
 * Admin Roles: PROXY_ADMIN: admin over the platform PROXY_ADMIN_VIEW_ONLY: can login, view all own
 * keys, view all spend ORG_ADMIN: admin over a specific organization, can create teams, users only
 * within their organization
 *
 * Internal User Roles: INTERNAL_USER: can login, view/create/delete their own keys, view their
 * spend INTERNAL_USER_VIEW_ONLY: can login, view their own keys, view their own spend
 *
 * Team Roles: TEAM: used for JWT auth
 *
 * Customer Roles: CUSTOMER: External users -> these are customers
 */
class UserRoles @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
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

        fun of(value: String) = UserRoles(JsonField.of(value))
    }

    /** An enum containing [UserRoles]'s known values. */
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
     * An enum containing [UserRoles]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [UserRoles] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
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
        /** An enum member indicating that [UserRoles] was instantiated with an unknown value. */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
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
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
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
            else -> throw HanzoInvalidDataException("Unknown UserRoles: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws HanzoInvalidDataException if this class instance's value does not have the expected
     *   primitive type.
     */
    fun asString(): String =
        _value().asString() ?: throw HanzoInvalidDataException("Value is not a String")

    private var validated: Boolean = false

    fun validate(): UserRoles = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserRoles && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
