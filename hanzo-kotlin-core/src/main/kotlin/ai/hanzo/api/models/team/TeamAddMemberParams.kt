// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team

import ai.hanzo.api.core.BaseDeserializer
import ai.hanzo.api.core.BaseSerializer
import ai.hanzo.api.core.ExcludeMissing
import ai.hanzo.api.core.JsonField
import ai.hanzo.api.core.JsonMissing
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.Params
import ai.hanzo.api.core.allMaxBy
import ai.hanzo.api.core.checkRequired
import ai.hanzo.api.core.getOrThrow
import ai.hanzo.api.core.http.Headers
import ai.hanzo.api.core.http.QueryParams
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

/**
 * [BETA]
 *
 * Add new members (either via user_email or user_id) to a team
 *
 * If user doesn't exist, new user row will also be added to User Table
 *
 * Only proxy_admin or admin of team, allowed to access this endpoint.
 *
 * ```
 *
 * curl -X POST 'http://0.0.0.0:4000/team/member_add'     -H 'Authorization: Bearer sk-1234'     -H 'Content-Type: application/json'     -d '{"team_id": "45e3e396-ee08-4a61-a88e-16b3ce7e0849", "member": {"role": "user", "user_id": "dev247652@hanzo.ai"}}'
 *
 * ```
 */
class TeamAddMemberParams
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
    fun teamId(): String = body.teamId()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxBudgetInTeam(): Double? = body.maxBudgetInTeam()

    /**
     * Returns the raw JSON value of [member].
     *
     * Unlike [member], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _member(): JsonField<Member> = body._member()

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

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TeamAddMemberParams].
         *
         * The following fields are required:
         * ```kotlin
         * .member()
         * .teamId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [TeamAddMemberParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(teamAddMemberParams: TeamAddMemberParams) = apply {
            body = teamAddMemberParams.body.toBuilder()
            additionalHeaders = teamAddMemberParams.additionalHeaders.toBuilder()
            additionalQueryParams = teamAddMemberParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [member]
         * - [teamId]
         * - [maxBudgetInTeam]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun member(member: Member) = apply { body.member(member) }

        /**
         * Sets [Builder.member] to an arbitrary JSON value.
         *
         * You should usually call [Builder.member] with a well-typed [Member] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun member(member: JsonField<Member>) = apply { body.member(member) }

        /** Alias for calling [member] with `Member.ofMembers(members)`. */
        fun memberOfMembers(members: List<Member>) = apply { body.memberOfMembers(members) }

        /** Alias for calling [Builder.member] with `Member.ofMember(member)`. */
        fun member(member: Member) = apply { body.member(member) }

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
         * Returns an immutable instance of [TeamAddMemberParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .member()
         * .teamId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TeamAddMemberParams =
            TeamAddMemberParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val member: JsonField<Member>,
        private val teamId: JsonField<String>,
        private val maxBudgetInTeam: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("member") @ExcludeMissing member: JsonField<Member> = JsonMissing.of(),
            @JsonProperty("team_id") @ExcludeMissing teamId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_budget_in_team")
            @ExcludeMissing
            maxBudgetInTeam: JsonField<Double> = JsonMissing.of(),
        ) : this(member, teamId, maxBudgetInTeam, mutableMapOf())

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun member(): Member = member.getRequired("member")

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
         * Returns the raw JSON value of [member].
         *
         * Unlike [member], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("member") @ExcludeMissing fun _member(): JsonField<Member> = member

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
             * .teamId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var member: JsonField<Member>? = null
            private var teamId: JsonField<String>? = null
            private var maxBudgetInTeam: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                member = body.member
                teamId = body.teamId
                maxBudgetInTeam = body.maxBudgetInTeam
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

            /** Alias for calling [member] with `Member.ofMembers(members)`. */
            fun memberOfMembers(members: List<Member>) = member(Member.ofMembers(members))

            /** Alias for calling [Builder.member] with `Member.ofMember(member)`. */
            fun member(member: Member) = member(Member.ofMember(member))

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
             * .teamId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("member", member),
                    checkRequired("teamId", teamId),
                    maxBudgetInTeam,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            member().validate()
            teamId()
            maxBudgetInTeam()
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
            (member.asKnown()?.validity() ?: 0) +
                (if (teamId.asKnown() == null) 0 else 1) +
                (if (maxBudgetInTeam.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && member == other.member && teamId == other.teamId && maxBudgetInTeam == other.maxBudgetInTeam && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(member, teamId, maxBudgetInTeam, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{member=$member, teamId=$teamId, maxBudgetInTeam=$maxBudgetInTeam, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = Member.Deserializer::class)
    @JsonSerialize(using = Member.Serializer::class)
    class Member
    private constructor(
        private val members: List<Member>? = null,
        private val member: Member? = null,
        private val _json: JsonValue? = null,
    ) {

        fun members(): List<Member>? = members

        fun member(): Member? = member

        fun isMembers(): Boolean = members != null

        fun isMember(): Boolean = member != null

        fun asMembers(): List<Member> = members.getOrThrow("members")

        fun asMember(): Member = member.getOrThrow("member")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                members != null -> visitor.visitMembers(members)
                member != null -> visitor.visitMember(member)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Member = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitMembers(members: List<Member>) {
                        members.forEach { it.validate() }
                    }

                    override fun visitMember(member: Member) {
                        member.validate()
                    }
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
                    override fun visitMembers(members: List<Member>) =
                        members.sumOf { it.validity().toInt() }

                    override fun visitMember(member: Member) = member.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Member && members == other.members && member == other.member /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(members, member) /* spotless:on */

        override fun toString(): String =
            when {
                members != null -> "Member{members=$members}"
                member != null -> "Member{member=$member}"
                _json != null -> "Member{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Member")
            }

        companion object {

            fun ofMembers(members: List<Member>) = Member(members = members)

            fun ofMember(member: Member) = Member(member = member)
        }

        /** An interface that defines how to map each variant of [Member] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitMembers(members: List<Member>): T

            fun visitMember(member: Member): T

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

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Member>())?.let {
                                Member(member = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<Member>>())?.let {
                                Member(members = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Member(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Member>(Member::class) {

            override fun serialize(
                value: Member,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.members != null -> generator.writeObject(value.members)
                    value.member != null -> generator.writeObject(value.member)
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

        return /* spotless:off */ other is TeamAddMemberParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TeamAddMemberParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
