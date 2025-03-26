// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.organization

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
import com.hanzo_ai.api.core.BaseDeserializer
import com.hanzo_ai.api.core.BaseSerializer
import com.hanzo_ai.api.core.ExcludeMissing
import com.hanzo_ai.api.core.JsonField
import com.hanzo_ai.api.core.JsonMissing
import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.core.Params
import com.hanzo_ai.api.core.checkRequired
import com.hanzo_ai.api.core.getOrThrow
import com.hanzo_ai.api.core.http.Headers
import com.hanzo_ai.api.core.http.QueryParams
import com.hanzo_ai.api.errors.HanzoInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * [BETA]
 *
 * Add new members (either via user_email or user_id) to an organization
 *
 * If user doesn't exist, new user row will also be added to User Table
 *
 * Only proxy_admin or org_admin of organization, allowed to access this endpoint.
 *
 * # Parameters:
 * - organization_id: str (required)
 * - member: Union[List[Member], Member] (required)
 *     - role: Literal[LLMUserRoles] (required)
 *     - user_id: Optional[str]
 *     - user_email: Optional[str]
 *
 * Note: Either user_id or user_email must be provided for each member.
 *
 * Example:
 * ```
 * curl -X POST 'http://0.0.0.0:4000/organization/member_add'     -H 'Authorization: Bearer sk-1234'     -H 'Content-Type: application/json'     -d '{
 *     "organization_id": "45e3e396-ee08-4a61-a88e-16b3ce7e0849",
 *     "member": {
 *         "role": "internal_user",
 *         "user_id": "dev247652@hanzo.ai"
 *     },
 *     "max_budget_in_organization": 100.0
 * }'
 * ```
 *
 * The following is executed in this function:
 * 1. Check if organization exists
 * 2. Creates a new Internal User if the user_id or user_email is not found in LLM_UserTable
 * 3. Add Internal User to the `LLM_OrganizationMembership` table
 */
class OrganizationAddMemberParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun member(): Member = body.member()

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
     * Returns the raw JSON value of [member].
     *
     * Unlike [member], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _member(): JsonField<Member> = body._member()

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

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OrganizationAddMemberParams].
         *
         * The following fields are required:
         * ```kotlin
         * .member()
         * .organizationId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [OrganizationAddMemberParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(organizationAddMemberParams: OrganizationAddMemberParams) = apply {
            body = organizationAddMemberParams.body.toBuilder()
            additionalHeaders = organizationAddMemberParams.additionalHeaders.toBuilder()
            additionalQueryParams = organizationAddMemberParams.additionalQueryParams.toBuilder()
        }

        fun member(member: Member) = apply { body.member(member) }

        /**
         * Sets [Builder.member] to an arbitrary JSON value.
         *
         * You should usually call [Builder.member] with a well-typed [Member] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun member(member: JsonField<Member>) = apply { body.member(member) }

        /** Alias for calling [member] with `Member.ofOrgMembers(orgMembers)`. */
        fun memberOfOrgMembers(orgMembers: List<OrgMember>) = apply {
            body.memberOfOrgMembers(orgMembers)
        }

        /** Alias for calling [member] with `Member.ofOrg(org)`. */
        fun member(org: OrgMember) = apply { body.member(org) }

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
         * Returns an immutable instance of [OrganizationAddMemberParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .member()
         * .organizationId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OrganizationAddMemberParams =
            OrganizationAddMemberParams(
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
        private val member: JsonField<Member>,
        private val organizationId: JsonField<String>,
        private val maxBudgetInOrganization: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("member") @ExcludeMissing member: JsonField<Member> = JsonMissing.of(),
            @JsonProperty("organization_id")
            @ExcludeMissing
            organizationId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_budget_in_organization")
            @ExcludeMissing
            maxBudgetInOrganization: JsonField<Double> = JsonMissing.of(),
        ) : this(member, organizationId, maxBudgetInOrganization, mutableMapOf())

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun member(): Member = member.getRequired("member")

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
         * Returns the raw JSON value of [member].
         *
         * Unlike [member], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("member") @ExcludeMissing fun _member(): JsonField<Member> = member

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
             * .member()
             * .organizationId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var member: JsonField<Member>? = null
            private var organizationId: JsonField<String>? = null
            private var maxBudgetInOrganization: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                member = body.member
                organizationId = body.organizationId
                maxBudgetInOrganization = body.maxBudgetInOrganization
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun member(member: Member) = member(JsonField.of(member))

            /**
             * Sets [Builder.member] to an arbitrary JSON value.
             *
             * You should usually call [Builder.member] with a well-typed [Member] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun member(member: JsonField<Member>) = apply { this.member = member }

            /** Alias for calling [member] with `Member.ofOrgMembers(orgMembers)`. */
            fun memberOfOrgMembers(orgMembers: List<OrgMember>) =
                member(Member.ofOrgMembers(orgMembers))

            /** Alias for calling [member] with `Member.ofOrg(org)`. */
            fun member(org: OrgMember) = member(Member.ofOrg(org))

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
             * .member()
             * .organizationId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("member", member),
                    checkRequired("organizationId", organizationId),
                    maxBudgetInOrganization,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            member().validate()
            organizationId()
            maxBudgetInOrganization()
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && member == other.member && organizationId == other.organizationId && maxBudgetInOrganization == other.maxBudgetInOrganization && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(member, organizationId, maxBudgetInOrganization, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{member=$member, organizationId=$organizationId, maxBudgetInOrganization=$maxBudgetInOrganization, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = Member.Deserializer::class)
    @JsonSerialize(using = Member.Serializer::class)
    class Member
    private constructor(
        private val orgMembers: List<OrgMember>? = null,
        private val org: OrgMember? = null,
        private val _json: JsonValue? = null,
    ) {

        fun orgMembers(): List<OrgMember>? = orgMembers

        fun org(): OrgMember? = org

        fun isOrgMembers(): Boolean = orgMembers != null

        fun isOrg(): Boolean = org != null

        fun asOrgMembers(): List<OrgMember> = orgMembers.getOrThrow("orgMembers")

        fun asOrg(): OrgMember = org.getOrThrow("org")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                orgMembers != null -> visitor.visitOrgMembers(orgMembers)
                org != null -> visitor.visitOrg(org)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Member = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitOrgMembers(orgMembers: List<OrgMember>) {
                        orgMembers.forEach { it.validate() }
                    }

                    override fun visitOrg(org: OrgMember) {
                        org.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Member && orgMembers == other.orgMembers && org == other.org /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgMembers, org) /* spotless:on */

        override fun toString(): String =
            when {
                orgMembers != null -> "Member{orgMembers=$orgMembers}"
                org != null -> "Member{org=$org}"
                _json != null -> "Member{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Member")
            }

        companion object {

            fun ofOrgMembers(orgMembers: List<OrgMember>) = Member(orgMembers = orgMembers)

            fun ofOrg(org: OrgMember) = Member(org = org)
        }

        /** An interface that defines how to map each variant of [Member] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitOrgMembers(orgMembers: List<OrgMember>): T

            fun visitOrg(org: OrgMember): T

            /**
             * Maps an unknown variant of [Member] to a value of type [T].
             *
             * An instance of [Member] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws HanzoInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HanzoInvalidDataException("Unknown Member: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Member>(Member::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Member {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<List<OrgMember>>()) {
                        it.forEach { it.validate() }
                    }
                    ?.let {
                        return Member(orgMembers = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<OrgMember>()) { it.validate() }
                    ?.let {
                        return Member(org = it, _json = json)
                    }

                return Member(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Member>(Member::class) {

            override fun serialize(
                value: Member,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.orgMembers != null -> generator.writeObject(value.orgMembers)
                    value.org != null -> generator.writeObject(value.org)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Member")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OrganizationAddMemberParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "OrganizationAddMemberParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
