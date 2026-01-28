// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

import ai.hanzo.api.core.BaseDeserializer
import ai.hanzo.api.core.BaseSerializer
import ai.hanzo.api.core.Enum
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
import ai.hanzo.api.models.organization.UserRoles
import ai.hanzo.api.models.team.Member
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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class KeyListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val currentPage: JsonField<Long>,
    private val keys: JsonField<List<Key>>,
    private val totalCount: JsonField<Long>,
    private val totalPages: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("current_page")
        @ExcludeMissing
        currentPage: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("keys") @ExcludeMissing keys: JsonField<List<Key>> = JsonMissing.of(),
        @JsonProperty("total_count") @ExcludeMissing totalCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("total_pages") @ExcludeMissing totalPages: JsonField<Long> = JsonMissing.of(),
    ) : this(currentPage, keys, totalCount, totalPages, mutableMapOf())

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currentPage(): Long? = currentPage.getNullable("current_page")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun keys(): List<Key>? = keys.getNullable("keys")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalCount(): Long? = totalCount.getNullable("total_count")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalPages(): Long? = totalPages.getNullable("total_pages")

    /**
     * Returns the raw JSON value of [currentPage].
     *
     * Unlike [currentPage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("current_page") @ExcludeMissing fun _currentPage(): JsonField<Long> = currentPage

    /**
     * Returns the raw JSON value of [keys].
     *
     * Unlike [keys], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("keys") @ExcludeMissing fun _keys(): JsonField<List<Key>> = keys

    /**
     * Returns the raw JSON value of [totalCount].
     *
     * Unlike [totalCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_count") @ExcludeMissing fun _totalCount(): JsonField<Long> = totalCount

    /**
     * Returns the raw JSON value of [totalPages].
     *
     * Unlike [totalPages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_pages") @ExcludeMissing fun _totalPages(): JsonField<Long> = totalPages

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

        /** Returns a mutable builder for constructing an instance of [KeyListResponse]. */
        fun builder() = Builder()
    }

    /** A builder for [KeyListResponse]. */
    class Builder internal constructor() {

        private var currentPage: JsonField<Long> = JsonMissing.of()
        private var keys: JsonField<MutableList<Key>>? = null
        private var totalCount: JsonField<Long> = JsonMissing.of()
        private var totalPages: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(keyListResponse: KeyListResponse) = apply {
            currentPage = keyListResponse.currentPage
            keys = keyListResponse.keys.map { it.toMutableList() }
            totalCount = keyListResponse.totalCount
            totalPages = keyListResponse.totalPages
            additionalProperties = keyListResponse.additionalProperties.toMutableMap()
        }

        fun currentPage(currentPage: Long?) = currentPage(JsonField.ofNullable(currentPage))

        /**
         * Alias for [Builder.currentPage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun currentPage(currentPage: Long) = currentPage(currentPage as Long?)

        /**
         * Sets [Builder.currentPage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentPage] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currentPage(currentPage: JsonField<Long>) = apply { this.currentPage = currentPage }

        fun keys(keys: List<Key>) = keys(JsonField.of(keys))

        /**
         * Sets [Builder.keys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.keys] with a well-typed `List<Key>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun keys(keys: JsonField<List<Key>>) = apply { this.keys = keys.map { it.toMutableList() } }

        /**
         * Adds a single [Key] to [keys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addKey(key: Key) = apply {
            keys = (keys ?: JsonField.of(mutableListOf())).also { checkKnown("keys", it).add(key) }
        }

        /** Alias for calling [addKey] with `Key.ofString(string)`. */
        fun addKey(string: String) = addKey(Key.ofString(string))

        /** Alias for calling [addKey] with `Key.ofUserApiKeyAuth(userApiKeyAuth)`. */
        fun addKey(userApiKeyAuth: Key.UserApiKeyAuth) =
            addKey(Key.ofUserApiKeyAuth(userApiKeyAuth))

        /**
         * Alias for calling [addKey] with
         * `Key.ofLiteLlmDeletedVerificationToken(liteLlmDeletedVerificationToken)`.
         */
        fun addKey(liteLlmDeletedVerificationToken: Key.LiteLlmDeletedVerificationToken) =
            addKey(Key.ofLiteLlmDeletedVerificationToken(liteLlmDeletedVerificationToken))

        fun totalCount(totalCount: Long?) = totalCount(JsonField.ofNullable(totalCount))

        /**
         * Alias for [Builder.totalCount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun totalCount(totalCount: Long) = totalCount(totalCount as Long?)

        /**
         * Sets [Builder.totalCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalCount(totalCount: JsonField<Long>) = apply { this.totalCount = totalCount }

        fun totalPages(totalPages: Long?) = totalPages(JsonField.ofNullable(totalPages))

        /**
         * Alias for [Builder.totalPages].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun totalPages(totalPages: Long) = totalPages(totalPages as Long?)

        /**
         * Sets [Builder.totalPages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalPages] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalPages(totalPages: JsonField<Long>) = apply { this.totalPages = totalPages }

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
         * Returns an immutable instance of [KeyListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): KeyListResponse =
            KeyListResponse(
                currentPage,
                (keys ?: JsonMissing.of()).map { it.toImmutable() },
                totalCount,
                totalPages,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): KeyListResponse = apply {
        if (validated) {
            return@apply
        }

        currentPage()
        keys()?.forEach { it.validate() }
        totalCount()
        totalPages()
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
    internal fun validity(): Int =
        (if (currentPage.asKnown() == null) 0 else 1) +
            (keys.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (totalCount.asKnown() == null) 0 else 1) +
            (if (totalPages.asKnown() == null) 0 else 1)

    /** Return the row in the db */
    @JsonDeserialize(using = Key.Deserializer::class)
    @JsonSerialize(using = Key.Serializer::class)
    class Key
    private constructor(
        private val string: String? = null,
        private val userApiKeyAuth: UserApiKeyAuth? = null,
        private val liteLlmDeletedVerificationToken: LiteLlmDeletedVerificationToken? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): String? = string

        /** Return the row in the db */
        fun userApiKeyAuth(): UserApiKeyAuth? = userApiKeyAuth

        /**
         * Recording of deleted keys for audit purposes. Mirrors LiteLLM_VerificationToken plus
         * metadata captured at deletion time.
         */
        fun liteLlmDeletedVerificationToken(): LiteLlmDeletedVerificationToken? =
            liteLlmDeletedVerificationToken

        fun isString(): Boolean = string != null

        fun isUserApiKeyAuth(): Boolean = userApiKeyAuth != null

        fun isLiteLlmDeletedVerificationToken(): Boolean = liteLlmDeletedVerificationToken != null

        fun asString(): String = string.getOrThrow("string")

        /** Return the row in the db */
        fun asUserApiKeyAuth(): UserApiKeyAuth = userApiKeyAuth.getOrThrow("userApiKeyAuth")

        /**
         * Recording of deleted keys for audit purposes. Mirrors LiteLLM_VerificationToken plus
         * metadata captured at deletion time.
         */
        fun asLiteLlmDeletedVerificationToken(): LiteLlmDeletedVerificationToken =
            liteLlmDeletedVerificationToken.getOrThrow("liteLlmDeletedVerificationToken")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                userApiKeyAuth != null -> visitor.visitUserApiKeyAuth(userApiKeyAuth)
                liteLlmDeletedVerificationToken != null ->
                    visitor.visitLiteLlmDeletedVerificationToken(liteLlmDeletedVerificationToken)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Key = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitUserApiKeyAuth(userApiKeyAuth: UserApiKeyAuth) {
                        userApiKeyAuth.validate()
                    }

                    override fun visitLiteLlmDeletedVerificationToken(
                        liteLlmDeletedVerificationToken: LiteLlmDeletedVerificationToken
                    ) {
                        liteLlmDeletedVerificationToken.validate()
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
                    override fun visitString(string: String) = 1

                    override fun visitUserApiKeyAuth(userApiKeyAuth: UserApiKeyAuth) =
                        userApiKeyAuth.validity()

                    override fun visitLiteLlmDeletedVerificationToken(
                        liteLlmDeletedVerificationToken: LiteLlmDeletedVerificationToken
                    ) = liteLlmDeletedVerificationToken.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Key &&
                string == other.string &&
                userApiKeyAuth == other.userApiKeyAuth &&
                liteLlmDeletedVerificationToken == other.liteLlmDeletedVerificationToken
        }

        override fun hashCode(): Int =
            Objects.hash(string, userApiKeyAuth, liteLlmDeletedVerificationToken)

        override fun toString(): String =
            when {
                string != null -> "Key{string=$string}"
                userApiKeyAuth != null -> "Key{userApiKeyAuth=$userApiKeyAuth}"
                liteLlmDeletedVerificationToken != null ->
                    "Key{liteLlmDeletedVerificationToken=$liteLlmDeletedVerificationToken}"
                _json != null -> "Key{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Key")
            }

        companion object {

            fun ofString(string: String) = Key(string = string)

            /** Return the row in the db */
            fun ofUserApiKeyAuth(userApiKeyAuth: UserApiKeyAuth) =
                Key(userApiKeyAuth = userApiKeyAuth)

            /**
             * Recording of deleted keys for audit purposes. Mirrors LiteLLM_VerificationToken plus
             * metadata captured at deletion time.
             */
            fun ofLiteLlmDeletedVerificationToken(
                liteLlmDeletedVerificationToken: LiteLlmDeletedVerificationToken
            ) = Key(liteLlmDeletedVerificationToken = liteLlmDeletedVerificationToken)
        }

        /** An interface that defines how to map each variant of [Key] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitString(string: String): T

            /** Return the row in the db */
            fun visitUserApiKeyAuth(userApiKeyAuth: UserApiKeyAuth): T

            /**
             * Recording of deleted keys for audit purposes. Mirrors LiteLLM_VerificationToken plus
             * metadata captured at deletion time.
             */
            fun visitLiteLlmDeletedVerificationToken(
                liteLlmDeletedVerificationToken: LiteLlmDeletedVerificationToken
            ): T

            /**
             * Maps an unknown variant of [Key] to a value of type [T].
             *
             * An instance of [Key] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws HanzoInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HanzoInvalidDataException("Unknown Key: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Key>(Key::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Key {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UserApiKeyAuth>())?.let {
                                Key(userApiKeyAuth = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<LiteLlmDeletedVerificationToken>())
                                ?.let { Key(liteLlmDeletedVerificationToken = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Key(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Key(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Key>(Key::class) {

            override fun serialize(
                value: Key,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.userApiKeyAuth != null -> generator.writeObject(value.userApiKeyAuth)
                    value.liteLlmDeletedVerificationToken != null ->
                        generator.writeObject(value.liteLlmDeletedVerificationToken)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Key")
                }
            }
        }

        /** Return the row in the db */
        class UserApiKeyAuth
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val token: JsonField<String>,
            private val aliases: JsonField<Aliases>,
            private val allowedCacheControls: JsonField<List<JsonValue>>,
            private val allowedModelRegion: JsonField<AllowedModelRegion>,
            private val allowedRoutes: JsonField<List<JsonValue>>,
            private val apiKey: JsonField<String>,
            private val autoRotate: JsonField<Boolean>,
            private val blocked: JsonField<Boolean>,
            private val budgetDuration: JsonField<String>,
            private val budgetResetAt: JsonField<OffsetDateTime>,
            private val config: JsonField<Config>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val createdBy: JsonField<String>,
            private val endUserId: JsonField<String>,
            private val endUserMaxBudget: JsonField<Double>,
            private val endUserRpmLimit: JsonField<Long>,
            private val endUserTpmLimit: JsonField<Long>,
            private val expires: JsonField<Expires>,
            private val keyAlias: JsonField<String>,
            private val keyName: JsonField<String>,
            private val keyRotationAt: JsonField<OffsetDateTime>,
            private val lastRefreshedAt: JsonField<Double>,
            private val lastRotationAt: JsonField<OffsetDateTime>,
            private val litellmBudgetTable: JsonField<LitellmBudgetTable>,
            private val maxBudget: JsonField<Double>,
            private val maxParallelRequests: JsonField<Long>,
            private val metadata: JsonField<Metadata>,
            private val modelMaxBudget: JsonField<ModelMaxBudget>,
            private val modelSpend: JsonField<ModelSpend>,
            private val models: JsonField<List<JsonValue>>,
            private val objectPermission: JsonField<ObjectPermission>,
            private val objectPermissionId: JsonField<String>,
            private val orgId: JsonField<String>,
            private val organizationMaxBudget: JsonField<Double>,
            private val organizationMetadata: JsonField<OrganizationMetadata>,
            private val organizationRpmLimit: JsonField<Long>,
            private val organizationTpmLimit: JsonField<Long>,
            private val parentOtelSpan: JsonValue,
            private val permissions: JsonField<Permissions>,
            private val requestRoute: JsonField<String>,
            private val rotationCount: JsonField<Long>,
            private val rotationInterval: JsonField<String>,
            private val routerSettings: JsonField<RouterSettings>,
            private val rpmLimit: JsonField<Long>,
            private val rpmLimitPerModel: JsonField<RpmLimitPerModel>,
            private val softBudget: JsonField<Double>,
            private val softBudgetCooldown: JsonField<Boolean>,
            private val spend: JsonField<Double>,
            private val teamAlias: JsonField<String>,
            private val teamBlocked: JsonField<Boolean>,
            private val teamId: JsonField<String>,
            private val teamMaxBudget: JsonField<Double>,
            private val teamMember: JsonField<Member>,
            private val teamMemberRpmLimit: JsonField<Long>,
            private val teamMemberSpend: JsonField<Double>,
            private val teamMemberTpmLimit: JsonField<Long>,
            private val teamMetadata: JsonField<TeamMetadata>,
            private val teamModelAliases: JsonField<TeamModelAliases>,
            private val teamModels: JsonField<List<JsonValue>>,
            private val teamObjectPermissionId: JsonField<String>,
            private val teamRpmLimit: JsonField<Long>,
            private val teamSpend: JsonField<Double>,
            private val teamTpmLimit: JsonField<Long>,
            private val tpmLimit: JsonField<Long>,
            private val tpmLimitPerModel: JsonField<TpmLimitPerModel>,
            private val updatedAt: JsonField<OffsetDateTime>,
            private val updatedBy: JsonField<String>,
            private val user: JsonValue,
            private val userEmail: JsonField<String>,
            private val userId: JsonField<String>,
            private val userMaxBudget: JsonField<Double>,
            private val userRole: JsonField<UserRoles>,
            private val userRpmLimit: JsonField<Long>,
            private val userSpend: JsonField<Double>,
            private val userTpmLimit: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
                @JsonProperty("aliases")
                @ExcludeMissing
                aliases: JsonField<Aliases> = JsonMissing.of(),
                @JsonProperty("allowed_cache_controls")
                @ExcludeMissing
                allowedCacheControls: JsonField<List<JsonValue>> = JsonMissing.of(),
                @JsonProperty("allowed_model_region")
                @ExcludeMissing
                allowedModelRegion: JsonField<AllowedModelRegion> = JsonMissing.of(),
                @JsonProperty("allowed_routes")
                @ExcludeMissing
                allowedRoutes: JsonField<List<JsonValue>> = JsonMissing.of(),
                @JsonProperty("api_key")
                @ExcludeMissing
                apiKey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("auto_rotate")
                @ExcludeMissing
                autoRotate: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("blocked")
                @ExcludeMissing
                blocked: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("budget_duration")
                @ExcludeMissing
                budgetDuration: JsonField<String> = JsonMissing.of(),
                @JsonProperty("budget_reset_at")
                @ExcludeMissing
                budgetResetAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("config")
                @ExcludeMissing
                config: JsonField<Config> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("created_by")
                @ExcludeMissing
                createdBy: JsonField<String> = JsonMissing.of(),
                @JsonProperty("end_user_id")
                @ExcludeMissing
                endUserId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("end_user_max_budget")
                @ExcludeMissing
                endUserMaxBudget: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("end_user_rpm_limit")
                @ExcludeMissing
                endUserRpmLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("end_user_tpm_limit")
                @ExcludeMissing
                endUserTpmLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("expires")
                @ExcludeMissing
                expires: JsonField<Expires> = JsonMissing.of(),
                @JsonProperty("key_alias")
                @ExcludeMissing
                keyAlias: JsonField<String> = JsonMissing.of(),
                @JsonProperty("key_name")
                @ExcludeMissing
                keyName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("key_rotation_at")
                @ExcludeMissing
                keyRotationAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("last_refreshed_at")
                @ExcludeMissing
                lastRefreshedAt: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("last_rotation_at")
                @ExcludeMissing
                lastRotationAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("litellm_budget_table")
                @ExcludeMissing
                litellmBudgetTable: JsonField<LitellmBudgetTable> = JsonMissing.of(),
                @JsonProperty("max_budget")
                @ExcludeMissing
                maxBudget: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("max_parallel_requests")
                @ExcludeMissing
                maxParallelRequests: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("model_max_budget")
                @ExcludeMissing
                modelMaxBudget: JsonField<ModelMaxBudget> = JsonMissing.of(),
                @JsonProperty("model_spend")
                @ExcludeMissing
                modelSpend: JsonField<ModelSpend> = JsonMissing.of(),
                @JsonProperty("models")
                @ExcludeMissing
                models: JsonField<List<JsonValue>> = JsonMissing.of(),
                @JsonProperty("object_permission")
                @ExcludeMissing
                objectPermission: JsonField<ObjectPermission> = JsonMissing.of(),
                @JsonProperty("object_permission_id")
                @ExcludeMissing
                objectPermissionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("org_id") @ExcludeMissing orgId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("organization_max_budget")
                @ExcludeMissing
                organizationMaxBudget: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("organization_metadata")
                @ExcludeMissing
                organizationMetadata: JsonField<OrganizationMetadata> = JsonMissing.of(),
                @JsonProperty("organization_rpm_limit")
                @ExcludeMissing
                organizationRpmLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("organization_tpm_limit")
                @ExcludeMissing
                organizationTpmLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("parent_otel_span")
                @ExcludeMissing
                parentOtelSpan: JsonValue = JsonMissing.of(),
                @JsonProperty("permissions")
                @ExcludeMissing
                permissions: JsonField<Permissions> = JsonMissing.of(),
                @JsonProperty("request_route")
                @ExcludeMissing
                requestRoute: JsonField<String> = JsonMissing.of(),
                @JsonProperty("rotation_count")
                @ExcludeMissing
                rotationCount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("rotation_interval")
                @ExcludeMissing
                rotationInterval: JsonField<String> = JsonMissing.of(),
                @JsonProperty("router_settings")
                @ExcludeMissing
                routerSettings: JsonField<RouterSettings> = JsonMissing.of(),
                @JsonProperty("rpm_limit")
                @ExcludeMissing
                rpmLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("rpm_limit_per_model")
                @ExcludeMissing
                rpmLimitPerModel: JsonField<RpmLimitPerModel> = JsonMissing.of(),
                @JsonProperty("soft_budget")
                @ExcludeMissing
                softBudget: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("soft_budget_cooldown")
                @ExcludeMissing
                softBudgetCooldown: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("spend") @ExcludeMissing spend: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("team_alias")
                @ExcludeMissing
                teamAlias: JsonField<String> = JsonMissing.of(),
                @JsonProperty("team_blocked")
                @ExcludeMissing
                teamBlocked: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("team_id")
                @ExcludeMissing
                teamId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("team_max_budget")
                @ExcludeMissing
                teamMaxBudget: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("team_member")
                @ExcludeMissing
                teamMember: JsonField<Member> = JsonMissing.of(),
                @JsonProperty("team_member_rpm_limit")
                @ExcludeMissing
                teamMemberRpmLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("team_member_spend")
                @ExcludeMissing
                teamMemberSpend: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("team_member_tpm_limit")
                @ExcludeMissing
                teamMemberTpmLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("team_metadata")
                @ExcludeMissing
                teamMetadata: JsonField<TeamMetadata> = JsonMissing.of(),
                @JsonProperty("team_model_aliases")
                @ExcludeMissing
                teamModelAliases: JsonField<TeamModelAliases> = JsonMissing.of(),
                @JsonProperty("team_models")
                @ExcludeMissing
                teamModels: JsonField<List<JsonValue>> = JsonMissing.of(),
                @JsonProperty("team_object_permission_id")
                @ExcludeMissing
                teamObjectPermissionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("team_rpm_limit")
                @ExcludeMissing
                teamRpmLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("team_spend")
                @ExcludeMissing
                teamSpend: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("team_tpm_limit")
                @ExcludeMissing
                teamTpmLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("tpm_limit")
                @ExcludeMissing
                tpmLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("tpm_limit_per_model")
                @ExcludeMissing
                tpmLimitPerModel: JsonField<TpmLimitPerModel> = JsonMissing.of(),
                @JsonProperty("updated_at")
                @ExcludeMissing
                updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("updated_by")
                @ExcludeMissing
                updatedBy: JsonField<String> = JsonMissing.of(),
                @JsonProperty("user") @ExcludeMissing user: JsonValue = JsonMissing.of(),
                @JsonProperty("user_email")
                @ExcludeMissing
                userEmail: JsonField<String> = JsonMissing.of(),
                @JsonProperty("user_id")
                @ExcludeMissing
                userId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("user_max_budget")
                @ExcludeMissing
                userMaxBudget: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("user_role")
                @ExcludeMissing
                userRole: JsonField<UserRoles> = JsonMissing.of(),
                @JsonProperty("user_rpm_limit")
                @ExcludeMissing
                userRpmLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("user_spend")
                @ExcludeMissing
                userSpend: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("user_tpm_limit")
                @ExcludeMissing
                userTpmLimit: JsonField<Long> = JsonMissing.of(),
            ) : this(
                token,
                aliases,
                allowedCacheControls,
                allowedModelRegion,
                allowedRoutes,
                apiKey,
                autoRotate,
                blocked,
                budgetDuration,
                budgetResetAt,
                config,
                createdAt,
                createdBy,
                endUserId,
                endUserMaxBudget,
                endUserRpmLimit,
                endUserTpmLimit,
                expires,
                keyAlias,
                keyName,
                keyRotationAt,
                lastRefreshedAt,
                lastRotationAt,
                litellmBudgetTable,
                maxBudget,
                maxParallelRequests,
                metadata,
                modelMaxBudget,
                modelSpend,
                models,
                objectPermission,
                objectPermissionId,
                orgId,
                organizationMaxBudget,
                organizationMetadata,
                organizationRpmLimit,
                organizationTpmLimit,
                parentOtelSpan,
                permissions,
                requestRoute,
                rotationCount,
                rotationInterval,
                routerSettings,
                rpmLimit,
                rpmLimitPerModel,
                softBudget,
                softBudgetCooldown,
                spend,
                teamAlias,
                teamBlocked,
                teamId,
                teamMaxBudget,
                teamMember,
                teamMemberRpmLimit,
                teamMemberSpend,
                teamMemberTpmLimit,
                teamMetadata,
                teamModelAliases,
                teamModels,
                teamObjectPermissionId,
                teamRpmLimit,
                teamSpend,
                teamTpmLimit,
                tpmLimit,
                tpmLimitPerModel,
                updatedAt,
                updatedBy,
                user,
                userEmail,
                userId,
                userMaxBudget,
                userRole,
                userRpmLimit,
                userSpend,
                userTpmLimit,
                mutableMapOf(),
            )

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun token(): String? = token.getNullable("token")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun aliases(): Aliases? = aliases.getNullable("aliases")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun allowedCacheControls(): List<JsonValue>? =
                allowedCacheControls.getNullable("allowed_cache_controls")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun allowedModelRegion(): AllowedModelRegion? =
                allowedModelRegion.getNullable("allowed_model_region")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun allowedRoutes(): List<JsonValue>? = allowedRoutes.getNullable("allowed_routes")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun apiKey(): String? = apiKey.getNullable("api_key")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun autoRotate(): Boolean? = autoRotate.getNullable("auto_rotate")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun blocked(): Boolean? = blocked.getNullable("blocked")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun budgetDuration(): String? = budgetDuration.getNullable("budget_duration")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun budgetResetAt(): OffsetDateTime? = budgetResetAt.getNullable("budget_reset_at")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun config(): Config? = config.getNullable("config")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun createdBy(): String? = createdBy.getNullable("created_by")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun endUserId(): String? = endUserId.getNullable("end_user_id")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun endUserMaxBudget(): Double? = endUserMaxBudget.getNullable("end_user_max_budget")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun endUserRpmLimit(): Long? = endUserRpmLimit.getNullable("end_user_rpm_limit")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun endUserTpmLimit(): Long? = endUserTpmLimit.getNullable("end_user_tpm_limit")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun expires(): Expires? = expires.getNullable("expires")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun keyAlias(): String? = keyAlias.getNullable("key_alias")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun keyName(): String? = keyName.getNullable("key_name")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun keyRotationAt(): OffsetDateTime? = keyRotationAt.getNullable("key_rotation_at")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun lastRefreshedAt(): Double? = lastRefreshedAt.getNullable("last_refreshed_at")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun lastRotationAt(): OffsetDateTime? = lastRotationAt.getNullable("last_rotation_at")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun litellmBudgetTable(): LitellmBudgetTable? =
                litellmBudgetTable.getNullable("litellm_budget_table")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun maxBudget(): Double? = maxBudget.getNullable("max_budget")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun maxParallelRequests(): Long? =
                maxParallelRequests.getNullable("max_parallel_requests")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun modelMaxBudget(): ModelMaxBudget? = modelMaxBudget.getNullable("model_max_budget")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun modelSpend(): ModelSpend? = modelSpend.getNullable("model_spend")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun models(): List<JsonValue>? = models.getNullable("models")

            /**
             * Represents a LiteLLM_ObjectPermissionTable record
             *
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun objectPermission(): ObjectPermission? =
                objectPermission.getNullable("object_permission")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun objectPermissionId(): String? =
                objectPermissionId.getNullable("object_permission_id")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun orgId(): String? = orgId.getNullable("org_id")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun organizationMaxBudget(): Double? =
                organizationMaxBudget.getNullable("organization_max_budget")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun organizationMetadata(): OrganizationMetadata? =
                organizationMetadata.getNullable("organization_metadata")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun organizationRpmLimit(): Long? =
                organizationRpmLimit.getNullable("organization_rpm_limit")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun organizationTpmLimit(): Long? =
                organizationTpmLimit.getNullable("organization_tpm_limit")

            /**
             * This arbitrary value can be deserialized into a custom type using the `convert`
             * method:
             * ```kotlin
             * val myObject: MyClass = userApiKeyAuth.parentOtelSpan().convert(MyClass::class.java)
             * ```
             */
            @JsonProperty("parent_otel_span")
            @ExcludeMissing
            fun _parentOtelSpan(): JsonValue = parentOtelSpan

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun permissions(): Permissions? = permissions.getNullable("permissions")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun requestRoute(): String? = requestRoute.getNullable("request_route")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun rotationCount(): Long? = rotationCount.getNullable("rotation_count")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun rotationInterval(): String? = rotationInterval.getNullable("rotation_interval")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun routerSettings(): RouterSettings? = routerSettings.getNullable("router_settings")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun rpmLimit(): Long? = rpmLimit.getNullable("rpm_limit")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun rpmLimitPerModel(): RpmLimitPerModel? =
                rpmLimitPerModel.getNullable("rpm_limit_per_model")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun softBudget(): Double? = softBudget.getNullable("soft_budget")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun softBudgetCooldown(): Boolean? =
                softBudgetCooldown.getNullable("soft_budget_cooldown")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun spend(): Double? = spend.getNullable("spend")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamAlias(): String? = teamAlias.getNullable("team_alias")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamBlocked(): Boolean? = teamBlocked.getNullable("team_blocked")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamId(): String? = teamId.getNullable("team_id")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamMaxBudget(): Double? = teamMaxBudget.getNullable("team_max_budget")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamMember(): Member? = teamMember.getNullable("team_member")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamMemberRpmLimit(): Long? =
                teamMemberRpmLimit.getNullable("team_member_rpm_limit")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamMemberSpend(): Double? = teamMemberSpend.getNullable("team_member_spend")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamMemberTpmLimit(): Long? =
                teamMemberTpmLimit.getNullable("team_member_tpm_limit")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamMetadata(): TeamMetadata? = teamMetadata.getNullable("team_metadata")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamModelAliases(): TeamModelAliases? =
                teamModelAliases.getNullable("team_model_aliases")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamModels(): List<JsonValue>? = teamModels.getNullable("team_models")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamObjectPermissionId(): String? =
                teamObjectPermissionId.getNullable("team_object_permission_id")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamRpmLimit(): Long? = teamRpmLimit.getNullable("team_rpm_limit")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamSpend(): Double? = teamSpend.getNullable("team_spend")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamTpmLimit(): Long? = teamTpmLimit.getNullable("team_tpm_limit")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tpmLimit(): Long? = tpmLimit.getNullable("tpm_limit")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tpmLimitPerModel(): TpmLimitPerModel? =
                tpmLimitPerModel.getNullable("tpm_limit_per_model")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun updatedBy(): String? = updatedBy.getNullable("updated_by")

            /**
             * This arbitrary value can be deserialized into a custom type using the `convert`
             * method:
             * ```kotlin
             * val myObject: MyClass = userApiKeyAuth.user().convert(MyClass::class.java)
             * ```
             */
            @JsonProperty("user") @ExcludeMissing fun _user(): JsonValue = user

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userEmail(): String? = userEmail.getNullable("user_email")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userId(): String? = userId.getNullable("user_id")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userMaxBudget(): Double? = userMaxBudget.getNullable("user_max_budget")

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
             *
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userRole(): UserRoles? = userRole.getNullable("user_role")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userRpmLimit(): Long? = userRpmLimit.getNullable("user_rpm_limit")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userSpend(): Double? = userSpend.getNullable("user_spend")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userTpmLimit(): Long? = userTpmLimit.getNullable("user_tpm_limit")

            /**
             * Returns the raw JSON value of [token].
             *
             * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

            /**
             * Returns the raw JSON value of [aliases].
             *
             * Unlike [aliases], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("aliases") @ExcludeMissing fun _aliases(): JsonField<Aliases> = aliases

            /**
             * Returns the raw JSON value of [allowedCacheControls].
             *
             * Unlike [allowedCacheControls], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("allowed_cache_controls")
            @ExcludeMissing
            fun _allowedCacheControls(): JsonField<List<JsonValue>> = allowedCacheControls

            /**
             * Returns the raw JSON value of [allowedModelRegion].
             *
             * Unlike [allowedModelRegion], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("allowed_model_region")
            @ExcludeMissing
            fun _allowedModelRegion(): JsonField<AllowedModelRegion> = allowedModelRegion

            /**
             * Returns the raw JSON value of [allowedRoutes].
             *
             * Unlike [allowedRoutes], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("allowed_routes")
            @ExcludeMissing
            fun _allowedRoutes(): JsonField<List<JsonValue>> = allowedRoutes

            /**
             * Returns the raw JSON value of [apiKey].
             *
             * Unlike [apiKey], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("api_key") @ExcludeMissing fun _apiKey(): JsonField<String> = apiKey

            /**
             * Returns the raw JSON value of [autoRotate].
             *
             * Unlike [autoRotate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("auto_rotate")
            @ExcludeMissing
            fun _autoRotate(): JsonField<Boolean> = autoRotate

            /**
             * Returns the raw JSON value of [blocked].
             *
             * Unlike [blocked], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("blocked") @ExcludeMissing fun _blocked(): JsonField<Boolean> = blocked

            /**
             * Returns the raw JSON value of [budgetDuration].
             *
             * Unlike [budgetDuration], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("budget_duration")
            @ExcludeMissing
            fun _budgetDuration(): JsonField<String> = budgetDuration

            /**
             * Returns the raw JSON value of [budgetResetAt].
             *
             * Unlike [budgetResetAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("budget_reset_at")
            @ExcludeMissing
            fun _budgetResetAt(): JsonField<OffsetDateTime> = budgetResetAt

            /**
             * Returns the raw JSON value of [config].
             *
             * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("config") @ExcludeMissing fun _config(): JsonField<Config> = config

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [createdBy].
             *
             * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_by")
            @ExcludeMissing
            fun _createdBy(): JsonField<String> = createdBy

            /**
             * Returns the raw JSON value of [endUserId].
             *
             * Unlike [endUserId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("end_user_id")
            @ExcludeMissing
            fun _endUserId(): JsonField<String> = endUserId

            /**
             * Returns the raw JSON value of [endUserMaxBudget].
             *
             * Unlike [endUserMaxBudget], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("end_user_max_budget")
            @ExcludeMissing
            fun _endUserMaxBudget(): JsonField<Double> = endUserMaxBudget

            /**
             * Returns the raw JSON value of [endUserRpmLimit].
             *
             * Unlike [endUserRpmLimit], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("end_user_rpm_limit")
            @ExcludeMissing
            fun _endUserRpmLimit(): JsonField<Long> = endUserRpmLimit

            /**
             * Returns the raw JSON value of [endUserTpmLimit].
             *
             * Unlike [endUserTpmLimit], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("end_user_tpm_limit")
            @ExcludeMissing
            fun _endUserTpmLimit(): JsonField<Long> = endUserTpmLimit

            /**
             * Returns the raw JSON value of [expires].
             *
             * Unlike [expires], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("expires") @ExcludeMissing fun _expires(): JsonField<Expires> = expires

            /**
             * Returns the raw JSON value of [keyAlias].
             *
             * Unlike [keyAlias], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("key_alias") @ExcludeMissing fun _keyAlias(): JsonField<String> = keyAlias

            /**
             * Returns the raw JSON value of [keyName].
             *
             * Unlike [keyName], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("key_name") @ExcludeMissing fun _keyName(): JsonField<String> = keyName

            /**
             * Returns the raw JSON value of [keyRotationAt].
             *
             * Unlike [keyRotationAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("key_rotation_at")
            @ExcludeMissing
            fun _keyRotationAt(): JsonField<OffsetDateTime> = keyRotationAt

            /**
             * Returns the raw JSON value of [lastRefreshedAt].
             *
             * Unlike [lastRefreshedAt], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("last_refreshed_at")
            @ExcludeMissing
            fun _lastRefreshedAt(): JsonField<Double> = lastRefreshedAt

            /**
             * Returns the raw JSON value of [lastRotationAt].
             *
             * Unlike [lastRotationAt], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("last_rotation_at")
            @ExcludeMissing
            fun _lastRotationAt(): JsonField<OffsetDateTime> = lastRotationAt

            /**
             * Returns the raw JSON value of [litellmBudgetTable].
             *
             * Unlike [litellmBudgetTable], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("litellm_budget_table")
            @ExcludeMissing
            fun _litellmBudgetTable(): JsonField<LitellmBudgetTable> = litellmBudgetTable

            /**
             * Returns the raw JSON value of [maxBudget].
             *
             * Unlike [maxBudget], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("max_budget")
            @ExcludeMissing
            fun _maxBudget(): JsonField<Double> = maxBudget

            /**
             * Returns the raw JSON value of [maxParallelRequests].
             *
             * Unlike [maxParallelRequests], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("max_parallel_requests")
            @ExcludeMissing
            fun _maxParallelRequests(): JsonField<Long> = maxParallelRequests

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * Returns the raw JSON value of [modelMaxBudget].
             *
             * Unlike [modelMaxBudget], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("model_max_budget")
            @ExcludeMissing
            fun _modelMaxBudget(): JsonField<ModelMaxBudget> = modelMaxBudget

            /**
             * Returns the raw JSON value of [modelSpend].
             *
             * Unlike [modelSpend], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("model_spend")
            @ExcludeMissing
            fun _modelSpend(): JsonField<ModelSpend> = modelSpend

            /**
             * Returns the raw JSON value of [models].
             *
             * Unlike [models], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("models")
            @ExcludeMissing
            fun _models(): JsonField<List<JsonValue>> = models

            /**
             * Returns the raw JSON value of [objectPermission].
             *
             * Unlike [objectPermission], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("object_permission")
            @ExcludeMissing
            fun _objectPermission(): JsonField<ObjectPermission> = objectPermission

            /**
             * Returns the raw JSON value of [objectPermissionId].
             *
             * Unlike [objectPermissionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("object_permission_id")
            @ExcludeMissing
            fun _objectPermissionId(): JsonField<String> = objectPermissionId

            /**
             * Returns the raw JSON value of [orgId].
             *
             * Unlike [orgId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("org_id") @ExcludeMissing fun _orgId(): JsonField<String> = orgId

            /**
             * Returns the raw JSON value of [organizationMaxBudget].
             *
             * Unlike [organizationMaxBudget], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("organization_max_budget")
            @ExcludeMissing
            fun _organizationMaxBudget(): JsonField<Double> = organizationMaxBudget

            /**
             * Returns the raw JSON value of [organizationMetadata].
             *
             * Unlike [organizationMetadata], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("organization_metadata")
            @ExcludeMissing
            fun _organizationMetadata(): JsonField<OrganizationMetadata> = organizationMetadata

            /**
             * Returns the raw JSON value of [organizationRpmLimit].
             *
             * Unlike [organizationRpmLimit], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("organization_rpm_limit")
            @ExcludeMissing
            fun _organizationRpmLimit(): JsonField<Long> = organizationRpmLimit

            /**
             * Returns the raw JSON value of [organizationTpmLimit].
             *
             * Unlike [organizationTpmLimit], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("organization_tpm_limit")
            @ExcludeMissing
            fun _organizationTpmLimit(): JsonField<Long> = organizationTpmLimit

            /**
             * Returns the raw JSON value of [permissions].
             *
             * Unlike [permissions], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("permissions")
            @ExcludeMissing
            fun _permissions(): JsonField<Permissions> = permissions

            /**
             * Returns the raw JSON value of [requestRoute].
             *
             * Unlike [requestRoute], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("request_route")
            @ExcludeMissing
            fun _requestRoute(): JsonField<String> = requestRoute

            /**
             * Returns the raw JSON value of [rotationCount].
             *
             * Unlike [rotationCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("rotation_count")
            @ExcludeMissing
            fun _rotationCount(): JsonField<Long> = rotationCount

            /**
             * Returns the raw JSON value of [rotationInterval].
             *
             * Unlike [rotationInterval], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("rotation_interval")
            @ExcludeMissing
            fun _rotationInterval(): JsonField<String> = rotationInterval

            /**
             * Returns the raw JSON value of [routerSettings].
             *
             * Unlike [routerSettings], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("router_settings")
            @ExcludeMissing
            fun _routerSettings(): JsonField<RouterSettings> = routerSettings

            /**
             * Returns the raw JSON value of [rpmLimit].
             *
             * Unlike [rpmLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("rpm_limit") @ExcludeMissing fun _rpmLimit(): JsonField<Long> = rpmLimit

            /**
             * Returns the raw JSON value of [rpmLimitPerModel].
             *
             * Unlike [rpmLimitPerModel], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("rpm_limit_per_model")
            @ExcludeMissing
            fun _rpmLimitPerModel(): JsonField<RpmLimitPerModel> = rpmLimitPerModel

            /**
             * Returns the raw JSON value of [softBudget].
             *
             * Unlike [softBudget], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("soft_budget")
            @ExcludeMissing
            fun _softBudget(): JsonField<Double> = softBudget

            /**
             * Returns the raw JSON value of [softBudgetCooldown].
             *
             * Unlike [softBudgetCooldown], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("soft_budget_cooldown")
            @ExcludeMissing
            fun _softBudgetCooldown(): JsonField<Boolean> = softBudgetCooldown

            /**
             * Returns the raw JSON value of [spend].
             *
             * Unlike [spend], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("spend") @ExcludeMissing fun _spend(): JsonField<Double> = spend

            /**
             * Returns the raw JSON value of [teamAlias].
             *
             * Unlike [teamAlias], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("team_alias")
            @ExcludeMissing
            fun _teamAlias(): JsonField<String> = teamAlias

            /**
             * Returns the raw JSON value of [teamBlocked].
             *
             * Unlike [teamBlocked], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("team_blocked")
            @ExcludeMissing
            fun _teamBlocked(): JsonField<Boolean> = teamBlocked

            /**
             * Returns the raw JSON value of [teamId].
             *
             * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("team_id") @ExcludeMissing fun _teamId(): JsonField<String> = teamId

            /**
             * Returns the raw JSON value of [teamMaxBudget].
             *
             * Unlike [teamMaxBudget], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("team_max_budget")
            @ExcludeMissing
            fun _teamMaxBudget(): JsonField<Double> = teamMaxBudget

            /**
             * Returns the raw JSON value of [teamMember].
             *
             * Unlike [teamMember], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("team_member")
            @ExcludeMissing
            fun _teamMember(): JsonField<Member> = teamMember

            /**
             * Returns the raw JSON value of [teamMemberRpmLimit].
             *
             * Unlike [teamMemberRpmLimit], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("team_member_rpm_limit")
            @ExcludeMissing
            fun _teamMemberRpmLimit(): JsonField<Long> = teamMemberRpmLimit

            /**
             * Returns the raw JSON value of [teamMemberSpend].
             *
             * Unlike [teamMemberSpend], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("team_member_spend")
            @ExcludeMissing
            fun _teamMemberSpend(): JsonField<Double> = teamMemberSpend

            /**
             * Returns the raw JSON value of [teamMemberTpmLimit].
             *
             * Unlike [teamMemberTpmLimit], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("team_member_tpm_limit")
            @ExcludeMissing
            fun _teamMemberTpmLimit(): JsonField<Long> = teamMemberTpmLimit

            /**
             * Returns the raw JSON value of [teamMetadata].
             *
             * Unlike [teamMetadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("team_metadata")
            @ExcludeMissing
            fun _teamMetadata(): JsonField<TeamMetadata> = teamMetadata

            /**
             * Returns the raw JSON value of [teamModelAliases].
             *
             * Unlike [teamModelAliases], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("team_model_aliases")
            @ExcludeMissing
            fun _teamModelAliases(): JsonField<TeamModelAliases> = teamModelAliases

            /**
             * Returns the raw JSON value of [teamModels].
             *
             * Unlike [teamModels], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("team_models")
            @ExcludeMissing
            fun _teamModels(): JsonField<List<JsonValue>> = teamModels

            /**
             * Returns the raw JSON value of [teamObjectPermissionId].
             *
             * Unlike [teamObjectPermissionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("team_object_permission_id")
            @ExcludeMissing
            fun _teamObjectPermissionId(): JsonField<String> = teamObjectPermissionId

            /**
             * Returns the raw JSON value of [teamRpmLimit].
             *
             * Unlike [teamRpmLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("team_rpm_limit")
            @ExcludeMissing
            fun _teamRpmLimit(): JsonField<Long> = teamRpmLimit

            /**
             * Returns the raw JSON value of [teamSpend].
             *
             * Unlike [teamSpend], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("team_spend")
            @ExcludeMissing
            fun _teamSpend(): JsonField<Double> = teamSpend

            /**
             * Returns the raw JSON value of [teamTpmLimit].
             *
             * Unlike [teamTpmLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("team_tpm_limit")
            @ExcludeMissing
            fun _teamTpmLimit(): JsonField<Long> = teamTpmLimit

            /**
             * Returns the raw JSON value of [tpmLimit].
             *
             * Unlike [tpmLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tpm_limit") @ExcludeMissing fun _tpmLimit(): JsonField<Long> = tpmLimit

            /**
             * Returns the raw JSON value of [tpmLimitPerModel].
             *
             * Unlike [tpmLimitPerModel], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("tpm_limit_per_model")
            @ExcludeMissing
            fun _tpmLimitPerModel(): JsonField<TpmLimitPerModel> = tpmLimitPerModel

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("updated_at")
            @ExcludeMissing
            fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

            /**
             * Returns the raw JSON value of [updatedBy].
             *
             * Unlike [updatedBy], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("updated_by")
            @ExcludeMissing
            fun _updatedBy(): JsonField<String> = updatedBy

            /**
             * Returns the raw JSON value of [userEmail].
             *
             * Unlike [userEmail], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("user_email")
            @ExcludeMissing
            fun _userEmail(): JsonField<String> = userEmail

            /**
             * Returns the raw JSON value of [userId].
             *
             * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

            /**
             * Returns the raw JSON value of [userMaxBudget].
             *
             * Unlike [userMaxBudget], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("user_max_budget")
            @ExcludeMissing
            fun _userMaxBudget(): JsonField<Double> = userMaxBudget

            /**
             * Returns the raw JSON value of [userRole].
             *
             * Unlike [userRole], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("user_role")
            @ExcludeMissing
            fun _userRole(): JsonField<UserRoles> = userRole

            /**
             * Returns the raw JSON value of [userRpmLimit].
             *
             * Unlike [userRpmLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("user_rpm_limit")
            @ExcludeMissing
            fun _userRpmLimit(): JsonField<Long> = userRpmLimit

            /**
             * Returns the raw JSON value of [userSpend].
             *
             * Unlike [userSpend], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("user_spend")
            @ExcludeMissing
            fun _userSpend(): JsonField<Double> = userSpend

            /**
             * Returns the raw JSON value of [userTpmLimit].
             *
             * Unlike [userTpmLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("user_tpm_limit")
            @ExcludeMissing
            fun _userTpmLimit(): JsonField<Long> = userTpmLimit

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

                /** Returns a mutable builder for constructing an instance of [UserApiKeyAuth]. */
                fun builder() = Builder()
            }

            /** A builder for [UserApiKeyAuth]. */
            class Builder internal constructor() {

                private var token: JsonField<String> = JsonMissing.of()
                private var aliases: JsonField<Aliases> = JsonMissing.of()
                private var allowedCacheControls: JsonField<MutableList<JsonValue>>? = null
                private var allowedModelRegion: JsonField<AllowedModelRegion> = JsonMissing.of()
                private var allowedRoutes: JsonField<MutableList<JsonValue>>? = null
                private var apiKey: JsonField<String> = JsonMissing.of()
                private var autoRotate: JsonField<Boolean> = JsonMissing.of()
                private var blocked: JsonField<Boolean> = JsonMissing.of()
                private var budgetDuration: JsonField<String> = JsonMissing.of()
                private var budgetResetAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var config: JsonField<Config> = JsonMissing.of()
                private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var createdBy: JsonField<String> = JsonMissing.of()
                private var endUserId: JsonField<String> = JsonMissing.of()
                private var endUserMaxBudget: JsonField<Double> = JsonMissing.of()
                private var endUserRpmLimit: JsonField<Long> = JsonMissing.of()
                private var endUserTpmLimit: JsonField<Long> = JsonMissing.of()
                private var expires: JsonField<Expires> = JsonMissing.of()
                private var keyAlias: JsonField<String> = JsonMissing.of()
                private var keyName: JsonField<String> = JsonMissing.of()
                private var keyRotationAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var lastRefreshedAt: JsonField<Double> = JsonMissing.of()
                private var lastRotationAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var litellmBudgetTable: JsonField<LitellmBudgetTable> = JsonMissing.of()
                private var maxBudget: JsonField<Double> = JsonMissing.of()
                private var maxParallelRequests: JsonField<Long> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var modelMaxBudget: JsonField<ModelMaxBudget> = JsonMissing.of()
                private var modelSpend: JsonField<ModelSpend> = JsonMissing.of()
                private var models: JsonField<MutableList<JsonValue>>? = null
                private var objectPermission: JsonField<ObjectPermission> = JsonMissing.of()
                private var objectPermissionId: JsonField<String> = JsonMissing.of()
                private var orgId: JsonField<String> = JsonMissing.of()
                private var organizationMaxBudget: JsonField<Double> = JsonMissing.of()
                private var organizationMetadata: JsonField<OrganizationMetadata> = JsonMissing.of()
                private var organizationRpmLimit: JsonField<Long> = JsonMissing.of()
                private var organizationTpmLimit: JsonField<Long> = JsonMissing.of()
                private var parentOtelSpan: JsonValue = JsonMissing.of()
                private var permissions: JsonField<Permissions> = JsonMissing.of()
                private var requestRoute: JsonField<String> = JsonMissing.of()
                private var rotationCount: JsonField<Long> = JsonMissing.of()
                private var rotationInterval: JsonField<String> = JsonMissing.of()
                private var routerSettings: JsonField<RouterSettings> = JsonMissing.of()
                private var rpmLimit: JsonField<Long> = JsonMissing.of()
                private var rpmLimitPerModel: JsonField<RpmLimitPerModel> = JsonMissing.of()
                private var softBudget: JsonField<Double> = JsonMissing.of()
                private var softBudgetCooldown: JsonField<Boolean> = JsonMissing.of()
                private var spend: JsonField<Double> = JsonMissing.of()
                private var teamAlias: JsonField<String> = JsonMissing.of()
                private var teamBlocked: JsonField<Boolean> = JsonMissing.of()
                private var teamId: JsonField<String> = JsonMissing.of()
                private var teamMaxBudget: JsonField<Double> = JsonMissing.of()
                private var teamMember: JsonField<Member> = JsonMissing.of()
                private var teamMemberRpmLimit: JsonField<Long> = JsonMissing.of()
                private var teamMemberSpend: JsonField<Double> = JsonMissing.of()
                private var teamMemberTpmLimit: JsonField<Long> = JsonMissing.of()
                private var teamMetadata: JsonField<TeamMetadata> = JsonMissing.of()
                private var teamModelAliases: JsonField<TeamModelAliases> = JsonMissing.of()
                private var teamModels: JsonField<MutableList<JsonValue>>? = null
                private var teamObjectPermissionId: JsonField<String> = JsonMissing.of()
                private var teamRpmLimit: JsonField<Long> = JsonMissing.of()
                private var teamSpend: JsonField<Double> = JsonMissing.of()
                private var teamTpmLimit: JsonField<Long> = JsonMissing.of()
                private var tpmLimit: JsonField<Long> = JsonMissing.of()
                private var tpmLimitPerModel: JsonField<TpmLimitPerModel> = JsonMissing.of()
                private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var updatedBy: JsonField<String> = JsonMissing.of()
                private var user: JsonValue = JsonMissing.of()
                private var userEmail: JsonField<String> = JsonMissing.of()
                private var userId: JsonField<String> = JsonMissing.of()
                private var userMaxBudget: JsonField<Double> = JsonMissing.of()
                private var userRole: JsonField<UserRoles> = JsonMissing.of()
                private var userRpmLimit: JsonField<Long> = JsonMissing.of()
                private var userSpend: JsonField<Double> = JsonMissing.of()
                private var userTpmLimit: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(userApiKeyAuth: UserApiKeyAuth) = apply {
                    token = userApiKeyAuth.token
                    aliases = userApiKeyAuth.aliases
                    allowedCacheControls =
                        userApiKeyAuth.allowedCacheControls.map { it.toMutableList() }
                    allowedModelRegion = userApiKeyAuth.allowedModelRegion
                    allowedRoutes = userApiKeyAuth.allowedRoutes.map { it.toMutableList() }
                    apiKey = userApiKeyAuth.apiKey
                    autoRotate = userApiKeyAuth.autoRotate
                    blocked = userApiKeyAuth.blocked
                    budgetDuration = userApiKeyAuth.budgetDuration
                    budgetResetAt = userApiKeyAuth.budgetResetAt
                    config = userApiKeyAuth.config
                    createdAt = userApiKeyAuth.createdAt
                    createdBy = userApiKeyAuth.createdBy
                    endUserId = userApiKeyAuth.endUserId
                    endUserMaxBudget = userApiKeyAuth.endUserMaxBudget
                    endUserRpmLimit = userApiKeyAuth.endUserRpmLimit
                    endUserTpmLimit = userApiKeyAuth.endUserTpmLimit
                    expires = userApiKeyAuth.expires
                    keyAlias = userApiKeyAuth.keyAlias
                    keyName = userApiKeyAuth.keyName
                    keyRotationAt = userApiKeyAuth.keyRotationAt
                    lastRefreshedAt = userApiKeyAuth.lastRefreshedAt
                    lastRotationAt = userApiKeyAuth.lastRotationAt
                    litellmBudgetTable = userApiKeyAuth.litellmBudgetTable
                    maxBudget = userApiKeyAuth.maxBudget
                    maxParallelRequests = userApiKeyAuth.maxParallelRequests
                    metadata = userApiKeyAuth.metadata
                    modelMaxBudget = userApiKeyAuth.modelMaxBudget
                    modelSpend = userApiKeyAuth.modelSpend
                    models = userApiKeyAuth.models.map { it.toMutableList() }
                    objectPermission = userApiKeyAuth.objectPermission
                    objectPermissionId = userApiKeyAuth.objectPermissionId
                    orgId = userApiKeyAuth.orgId
                    organizationMaxBudget = userApiKeyAuth.organizationMaxBudget
                    organizationMetadata = userApiKeyAuth.organizationMetadata
                    organizationRpmLimit = userApiKeyAuth.organizationRpmLimit
                    organizationTpmLimit = userApiKeyAuth.organizationTpmLimit
                    parentOtelSpan = userApiKeyAuth.parentOtelSpan
                    permissions = userApiKeyAuth.permissions
                    requestRoute = userApiKeyAuth.requestRoute
                    rotationCount = userApiKeyAuth.rotationCount
                    rotationInterval = userApiKeyAuth.rotationInterval
                    routerSettings = userApiKeyAuth.routerSettings
                    rpmLimit = userApiKeyAuth.rpmLimit
                    rpmLimitPerModel = userApiKeyAuth.rpmLimitPerModel
                    softBudget = userApiKeyAuth.softBudget
                    softBudgetCooldown = userApiKeyAuth.softBudgetCooldown
                    spend = userApiKeyAuth.spend
                    teamAlias = userApiKeyAuth.teamAlias
                    teamBlocked = userApiKeyAuth.teamBlocked
                    teamId = userApiKeyAuth.teamId
                    teamMaxBudget = userApiKeyAuth.teamMaxBudget
                    teamMember = userApiKeyAuth.teamMember
                    teamMemberRpmLimit = userApiKeyAuth.teamMemberRpmLimit
                    teamMemberSpend = userApiKeyAuth.teamMemberSpend
                    teamMemberTpmLimit = userApiKeyAuth.teamMemberTpmLimit
                    teamMetadata = userApiKeyAuth.teamMetadata
                    teamModelAliases = userApiKeyAuth.teamModelAliases
                    teamModels = userApiKeyAuth.teamModels.map { it.toMutableList() }
                    teamObjectPermissionId = userApiKeyAuth.teamObjectPermissionId
                    teamRpmLimit = userApiKeyAuth.teamRpmLimit
                    teamSpend = userApiKeyAuth.teamSpend
                    teamTpmLimit = userApiKeyAuth.teamTpmLimit
                    tpmLimit = userApiKeyAuth.tpmLimit
                    tpmLimitPerModel = userApiKeyAuth.tpmLimitPerModel
                    updatedAt = userApiKeyAuth.updatedAt
                    updatedBy = userApiKeyAuth.updatedBy
                    user = userApiKeyAuth.user
                    userEmail = userApiKeyAuth.userEmail
                    userId = userApiKeyAuth.userId
                    userMaxBudget = userApiKeyAuth.userMaxBudget
                    userRole = userApiKeyAuth.userRole
                    userRpmLimit = userApiKeyAuth.userRpmLimit
                    userSpend = userApiKeyAuth.userSpend
                    userTpmLimit = userApiKeyAuth.userTpmLimit
                    additionalProperties = userApiKeyAuth.additionalProperties.toMutableMap()
                }

                fun token(token: String?) = token(JsonField.ofNullable(token))

                /**
                 * Sets [Builder.token] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.token] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun token(token: JsonField<String>) = apply { this.token = token }

                fun aliases(aliases: Aliases) = aliases(JsonField.of(aliases))

                /**
                 * Sets [Builder.aliases] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.aliases] with a well-typed [Aliases] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun aliases(aliases: JsonField<Aliases>) = apply { this.aliases = aliases }

                fun allowedCacheControls(allowedCacheControls: List<JsonValue>?) =
                    allowedCacheControls(JsonField.ofNullable(allowedCacheControls))

                /**
                 * Sets [Builder.allowedCacheControls] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.allowedCacheControls] with a well-typed
                 * `List<JsonValue>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun allowedCacheControls(allowedCacheControls: JsonField<List<JsonValue>>) = apply {
                    this.allowedCacheControls = allowedCacheControls.map { it.toMutableList() }
                }

                /**
                 * Adds a single [JsonValue] to [allowedCacheControls].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAllowedCacheControl(allowedCacheControl: JsonValue) = apply {
                    allowedCacheControls =
                        (allowedCacheControls ?: JsonField.of(mutableListOf())).also {
                            checkKnown("allowedCacheControls", it).add(allowedCacheControl)
                        }
                }

                fun allowedModelRegion(allowedModelRegion: AllowedModelRegion?) =
                    allowedModelRegion(JsonField.ofNullable(allowedModelRegion))

                /**
                 * Sets [Builder.allowedModelRegion] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.allowedModelRegion] with a well-typed
                 * [AllowedModelRegion] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun allowedModelRegion(allowedModelRegion: JsonField<AllowedModelRegion>) = apply {
                    this.allowedModelRegion = allowedModelRegion
                }

                fun allowedRoutes(allowedRoutes: List<JsonValue>?) =
                    allowedRoutes(JsonField.ofNullable(allowedRoutes))

                /**
                 * Sets [Builder.allowedRoutes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.allowedRoutes] with a well-typed
                 * `List<JsonValue>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun allowedRoutes(allowedRoutes: JsonField<List<JsonValue>>) = apply {
                    this.allowedRoutes = allowedRoutes.map { it.toMutableList() }
                }

                /**
                 * Adds a single [JsonValue] to [allowedRoutes].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAllowedRoute(allowedRoute: JsonValue) = apply {
                    allowedRoutes =
                        (allowedRoutes ?: JsonField.of(mutableListOf())).also {
                            checkKnown("allowedRoutes", it).add(allowedRoute)
                        }
                }

                fun apiKey(apiKey: String?) = apiKey(JsonField.ofNullable(apiKey))

                /**
                 * Sets [Builder.apiKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.apiKey] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun apiKey(apiKey: JsonField<String>) = apply { this.apiKey = apiKey }

                fun autoRotate(autoRotate: Boolean?) = autoRotate(JsonField.ofNullable(autoRotate))

                /**
                 * Alias for [Builder.autoRotate].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun autoRotate(autoRotate: Boolean) = autoRotate(autoRotate as Boolean?)

                /**
                 * Sets [Builder.autoRotate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.autoRotate] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun autoRotate(autoRotate: JsonField<Boolean>) = apply {
                    this.autoRotate = autoRotate
                }

                fun blocked(blocked: Boolean?) = blocked(JsonField.ofNullable(blocked))

                /**
                 * Alias for [Builder.blocked].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun blocked(blocked: Boolean) = blocked(blocked as Boolean?)

                /**
                 * Sets [Builder.blocked] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.blocked] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun blocked(blocked: JsonField<Boolean>) = apply { this.blocked = blocked }

                fun budgetDuration(budgetDuration: String?) =
                    budgetDuration(JsonField.ofNullable(budgetDuration))

                /**
                 * Sets [Builder.budgetDuration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.budgetDuration] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun budgetDuration(budgetDuration: JsonField<String>) = apply {
                    this.budgetDuration = budgetDuration
                }

                fun budgetResetAt(budgetResetAt: OffsetDateTime?) =
                    budgetResetAt(JsonField.ofNullable(budgetResetAt))

                /**
                 * Sets [Builder.budgetResetAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.budgetResetAt] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun budgetResetAt(budgetResetAt: JsonField<OffsetDateTime>) = apply {
                    this.budgetResetAt = budgetResetAt
                }

                fun config(config: Config) = config(JsonField.of(config))

                /**
                 * Sets [Builder.config] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.config] with a well-typed [Config] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun config(config: JsonField<Config>) = apply { this.config = config }

                fun createdAt(createdAt: OffsetDateTime?) =
                    createdAt(JsonField.ofNullable(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                fun createdBy(createdBy: String?) = createdBy(JsonField.ofNullable(createdBy))

                /**
                 * Sets [Builder.createdBy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdBy] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

                fun endUserId(endUserId: String?) = endUserId(JsonField.ofNullable(endUserId))

                /**
                 * Sets [Builder.endUserId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endUserId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun endUserId(endUserId: JsonField<String>) = apply { this.endUserId = endUserId }

                fun endUserMaxBudget(endUserMaxBudget: Double?) =
                    endUserMaxBudget(JsonField.ofNullable(endUserMaxBudget))

                /**
                 * Alias for [Builder.endUserMaxBudget].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun endUserMaxBudget(endUserMaxBudget: Double) =
                    endUserMaxBudget(endUserMaxBudget as Double?)

                /**
                 * Sets [Builder.endUserMaxBudget] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endUserMaxBudget] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun endUserMaxBudget(endUserMaxBudget: JsonField<Double>) = apply {
                    this.endUserMaxBudget = endUserMaxBudget
                }

                fun endUserRpmLimit(endUserRpmLimit: Long?) =
                    endUserRpmLimit(JsonField.ofNullable(endUserRpmLimit))

                /**
                 * Alias for [Builder.endUserRpmLimit].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun endUserRpmLimit(endUserRpmLimit: Long) =
                    endUserRpmLimit(endUserRpmLimit as Long?)

                /**
                 * Sets [Builder.endUserRpmLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endUserRpmLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun endUserRpmLimit(endUserRpmLimit: JsonField<Long>) = apply {
                    this.endUserRpmLimit = endUserRpmLimit
                }

                fun endUserTpmLimit(endUserTpmLimit: Long?) =
                    endUserTpmLimit(JsonField.ofNullable(endUserTpmLimit))

                /**
                 * Alias for [Builder.endUserTpmLimit].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun endUserTpmLimit(endUserTpmLimit: Long) =
                    endUserTpmLimit(endUserTpmLimit as Long?)

                /**
                 * Sets [Builder.endUserTpmLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endUserTpmLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun endUserTpmLimit(endUserTpmLimit: JsonField<Long>) = apply {
                    this.endUserTpmLimit = endUserTpmLimit
                }

                fun expires(expires: Expires?) = expires(JsonField.ofNullable(expires))

                /**
                 * Sets [Builder.expires] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expires] with a well-typed [Expires] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun expires(expires: JsonField<Expires>) = apply { this.expires = expires }

                /** Alias for calling [expires] with `Expires.ofString(string)`. */
                fun expires(string: String) = expires(Expires.ofString(string))

                /** Alias for calling [expires] with `Expires.ofOffsetDateTime(offsetDateTime)`. */
                fun expires(offsetDateTime: OffsetDateTime) =
                    expires(Expires.ofOffsetDateTime(offsetDateTime))

                fun keyAlias(keyAlias: String?) = keyAlias(JsonField.ofNullable(keyAlias))

                /**
                 * Sets [Builder.keyAlias] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.keyAlias] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun keyAlias(keyAlias: JsonField<String>) = apply { this.keyAlias = keyAlias }

                fun keyName(keyName: String?) = keyName(JsonField.ofNullable(keyName))

                /**
                 * Sets [Builder.keyName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.keyName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun keyName(keyName: JsonField<String>) = apply { this.keyName = keyName }

                fun keyRotationAt(keyRotationAt: OffsetDateTime?) =
                    keyRotationAt(JsonField.ofNullable(keyRotationAt))

                /**
                 * Sets [Builder.keyRotationAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.keyRotationAt] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun keyRotationAt(keyRotationAt: JsonField<OffsetDateTime>) = apply {
                    this.keyRotationAt = keyRotationAt
                }

                fun lastRefreshedAt(lastRefreshedAt: Double?) =
                    lastRefreshedAt(JsonField.ofNullable(lastRefreshedAt))

                /**
                 * Alias for [Builder.lastRefreshedAt].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun lastRefreshedAt(lastRefreshedAt: Double) =
                    lastRefreshedAt(lastRefreshedAt as Double?)

                /**
                 * Sets [Builder.lastRefreshedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lastRefreshedAt] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun lastRefreshedAt(lastRefreshedAt: JsonField<Double>) = apply {
                    this.lastRefreshedAt = lastRefreshedAt
                }

                fun lastRotationAt(lastRotationAt: OffsetDateTime?) =
                    lastRotationAt(JsonField.ofNullable(lastRotationAt))

                /**
                 * Sets [Builder.lastRotationAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lastRotationAt] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun lastRotationAt(lastRotationAt: JsonField<OffsetDateTime>) = apply {
                    this.lastRotationAt = lastRotationAt
                }

                fun litellmBudgetTable(litellmBudgetTable: LitellmBudgetTable?) =
                    litellmBudgetTable(JsonField.ofNullable(litellmBudgetTable))

                /**
                 * Sets [Builder.litellmBudgetTable] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.litellmBudgetTable] with a well-typed
                 * [LitellmBudgetTable] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun litellmBudgetTable(litellmBudgetTable: JsonField<LitellmBudgetTable>) = apply {
                    this.litellmBudgetTable = litellmBudgetTable
                }

                fun maxBudget(maxBudget: Double?) = maxBudget(JsonField.ofNullable(maxBudget))

                /**
                 * Alias for [Builder.maxBudget].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun maxBudget(maxBudget: Double) = maxBudget(maxBudget as Double?)

                /**
                 * Sets [Builder.maxBudget] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxBudget] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxBudget(maxBudget: JsonField<Double>) = apply { this.maxBudget = maxBudget }

                fun maxParallelRequests(maxParallelRequests: Long?) =
                    maxParallelRequests(JsonField.ofNullable(maxParallelRequests))

                /**
                 * Alias for [Builder.maxParallelRequests].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun maxParallelRequests(maxParallelRequests: Long) =
                    maxParallelRequests(maxParallelRequests as Long?)

                /**
                 * Sets [Builder.maxParallelRequests] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxParallelRequests] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun maxParallelRequests(maxParallelRequests: JsonField<Long>) = apply {
                    this.maxParallelRequests = maxParallelRequests
                }

                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                fun modelMaxBudget(modelMaxBudget: ModelMaxBudget) =
                    modelMaxBudget(JsonField.of(modelMaxBudget))

                /**
                 * Sets [Builder.modelMaxBudget] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.modelMaxBudget] with a well-typed
                 * [ModelMaxBudget] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun modelMaxBudget(modelMaxBudget: JsonField<ModelMaxBudget>) = apply {
                    this.modelMaxBudget = modelMaxBudget
                }

                fun modelSpend(modelSpend: ModelSpend) = modelSpend(JsonField.of(modelSpend))

                /**
                 * Sets [Builder.modelSpend] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.modelSpend] with a well-typed [ModelSpend] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun modelSpend(modelSpend: JsonField<ModelSpend>) = apply {
                    this.modelSpend = modelSpend
                }

                fun models(models: List<JsonValue>) = models(JsonField.of(models))

                /**
                 * Sets [Builder.models] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.models] with a well-typed `List<JsonValue>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun models(models: JsonField<List<JsonValue>>) = apply {
                    this.models = models.map { it.toMutableList() }
                }

                /**
                 * Adds a single [JsonValue] to [models].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addModel(model: JsonValue) = apply {
                    models =
                        (models ?: JsonField.of(mutableListOf())).also {
                            checkKnown("models", it).add(model)
                        }
                }

                /** Represents a LiteLLM_ObjectPermissionTable record */
                fun objectPermission(objectPermission: ObjectPermission?) =
                    objectPermission(JsonField.ofNullable(objectPermission))

                /**
                 * Sets [Builder.objectPermission] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.objectPermission] with a well-typed
                 * [ObjectPermission] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun objectPermission(objectPermission: JsonField<ObjectPermission>) = apply {
                    this.objectPermission = objectPermission
                }

                fun objectPermissionId(objectPermissionId: String?) =
                    objectPermissionId(JsonField.ofNullable(objectPermissionId))

                /**
                 * Sets [Builder.objectPermissionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.objectPermissionId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun objectPermissionId(objectPermissionId: JsonField<String>) = apply {
                    this.objectPermissionId = objectPermissionId
                }

                fun orgId(orgId: String?) = orgId(JsonField.ofNullable(orgId))

                /**
                 * Sets [Builder.orgId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.orgId] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun orgId(orgId: JsonField<String>) = apply { this.orgId = orgId }

                fun organizationMaxBudget(organizationMaxBudget: Double?) =
                    organizationMaxBudget(JsonField.ofNullable(organizationMaxBudget))

                /**
                 * Alias for [Builder.organizationMaxBudget].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun organizationMaxBudget(organizationMaxBudget: Double) =
                    organizationMaxBudget(organizationMaxBudget as Double?)

                /**
                 * Sets [Builder.organizationMaxBudget] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.organizationMaxBudget] with a well-typed
                 * [Double] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun organizationMaxBudget(organizationMaxBudget: JsonField<Double>) = apply {
                    this.organizationMaxBudget = organizationMaxBudget
                }

                fun organizationMetadata(organizationMetadata: OrganizationMetadata?) =
                    organizationMetadata(JsonField.ofNullable(organizationMetadata))

                /**
                 * Sets [Builder.organizationMetadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.organizationMetadata] with a well-typed
                 * [OrganizationMetadata] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun organizationMetadata(organizationMetadata: JsonField<OrganizationMetadata>) =
                    apply {
                        this.organizationMetadata = organizationMetadata
                    }

                fun organizationRpmLimit(organizationRpmLimit: Long?) =
                    organizationRpmLimit(JsonField.ofNullable(organizationRpmLimit))

                /**
                 * Alias for [Builder.organizationRpmLimit].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun organizationRpmLimit(organizationRpmLimit: Long) =
                    organizationRpmLimit(organizationRpmLimit as Long?)

                /**
                 * Sets [Builder.organizationRpmLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.organizationRpmLimit] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun organizationRpmLimit(organizationRpmLimit: JsonField<Long>) = apply {
                    this.organizationRpmLimit = organizationRpmLimit
                }

                fun organizationTpmLimit(organizationTpmLimit: Long?) =
                    organizationTpmLimit(JsonField.ofNullable(organizationTpmLimit))

                /**
                 * Alias for [Builder.organizationTpmLimit].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun organizationTpmLimit(organizationTpmLimit: Long) =
                    organizationTpmLimit(organizationTpmLimit as Long?)

                /**
                 * Sets [Builder.organizationTpmLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.organizationTpmLimit] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun organizationTpmLimit(organizationTpmLimit: JsonField<Long>) = apply {
                    this.organizationTpmLimit = organizationTpmLimit
                }

                fun parentOtelSpan(parentOtelSpan: JsonValue) = apply {
                    this.parentOtelSpan = parentOtelSpan
                }

                fun permissions(permissions: Permissions) = permissions(JsonField.of(permissions))

                /**
                 * Sets [Builder.permissions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.permissions] with a well-typed [Permissions]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun permissions(permissions: JsonField<Permissions>) = apply {
                    this.permissions = permissions
                }

                fun requestRoute(requestRoute: String?) =
                    requestRoute(JsonField.ofNullable(requestRoute))

                /**
                 * Sets [Builder.requestRoute] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requestRoute] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun requestRoute(requestRoute: JsonField<String>) = apply {
                    this.requestRoute = requestRoute
                }

                fun rotationCount(rotationCount: Long?) =
                    rotationCount(JsonField.ofNullable(rotationCount))

                /**
                 * Alias for [Builder.rotationCount].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun rotationCount(rotationCount: Long) = rotationCount(rotationCount as Long?)

                /**
                 * Sets [Builder.rotationCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rotationCount] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun rotationCount(rotationCount: JsonField<Long>) = apply {
                    this.rotationCount = rotationCount
                }

                fun rotationInterval(rotationInterval: String?) =
                    rotationInterval(JsonField.ofNullable(rotationInterval))

                /**
                 * Sets [Builder.rotationInterval] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rotationInterval] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun rotationInterval(rotationInterval: JsonField<String>) = apply {
                    this.rotationInterval = rotationInterval
                }

                fun routerSettings(routerSettings: RouterSettings?) =
                    routerSettings(JsonField.ofNullable(routerSettings))

                /**
                 * Sets [Builder.routerSettings] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.routerSettings] with a well-typed
                 * [RouterSettings] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun routerSettings(routerSettings: JsonField<RouterSettings>) = apply {
                    this.routerSettings = routerSettings
                }

                fun rpmLimit(rpmLimit: Long?) = rpmLimit(JsonField.ofNullable(rpmLimit))

                /**
                 * Alias for [Builder.rpmLimit].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun rpmLimit(rpmLimit: Long) = rpmLimit(rpmLimit as Long?)

                /**
                 * Sets [Builder.rpmLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rpmLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun rpmLimit(rpmLimit: JsonField<Long>) = apply { this.rpmLimit = rpmLimit }

                fun rpmLimitPerModel(rpmLimitPerModel: RpmLimitPerModel?) =
                    rpmLimitPerModel(JsonField.ofNullable(rpmLimitPerModel))

                /**
                 * Sets [Builder.rpmLimitPerModel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rpmLimitPerModel] with a well-typed
                 * [RpmLimitPerModel] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun rpmLimitPerModel(rpmLimitPerModel: JsonField<RpmLimitPerModel>) = apply {
                    this.rpmLimitPerModel = rpmLimitPerModel
                }

                fun softBudget(softBudget: Double?) = softBudget(JsonField.ofNullable(softBudget))

                /**
                 * Alias for [Builder.softBudget].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun softBudget(softBudget: Double) = softBudget(softBudget as Double?)

                /**
                 * Sets [Builder.softBudget] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.softBudget] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun softBudget(softBudget: JsonField<Double>) = apply {
                    this.softBudget = softBudget
                }

                fun softBudgetCooldown(softBudgetCooldown: Boolean) =
                    softBudgetCooldown(JsonField.of(softBudgetCooldown))

                /**
                 * Sets [Builder.softBudgetCooldown] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.softBudgetCooldown] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun softBudgetCooldown(softBudgetCooldown: JsonField<Boolean>) = apply {
                    this.softBudgetCooldown = softBudgetCooldown
                }

                fun spend(spend: Double) = spend(JsonField.of(spend))

                /**
                 * Sets [Builder.spend] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.spend] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun spend(spend: JsonField<Double>) = apply { this.spend = spend }

                fun teamAlias(teamAlias: String?) = teamAlias(JsonField.ofNullable(teamAlias))

                /**
                 * Sets [Builder.teamAlias] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamAlias] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun teamAlias(teamAlias: JsonField<String>) = apply { this.teamAlias = teamAlias }

                fun teamBlocked(teamBlocked: Boolean) = teamBlocked(JsonField.of(teamBlocked))

                /**
                 * Sets [Builder.teamBlocked] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamBlocked] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun teamBlocked(teamBlocked: JsonField<Boolean>) = apply {
                    this.teamBlocked = teamBlocked
                }

                fun teamId(teamId: String?) = teamId(JsonField.ofNullable(teamId))

                /**
                 * Sets [Builder.teamId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun teamId(teamId: JsonField<String>) = apply { this.teamId = teamId }

                fun teamMaxBudget(teamMaxBudget: Double?) =
                    teamMaxBudget(JsonField.ofNullable(teamMaxBudget))

                /**
                 * Alias for [Builder.teamMaxBudget].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun teamMaxBudget(teamMaxBudget: Double) = teamMaxBudget(teamMaxBudget as Double?)

                /**
                 * Sets [Builder.teamMaxBudget] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamMaxBudget] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun teamMaxBudget(teamMaxBudget: JsonField<Double>) = apply {
                    this.teamMaxBudget = teamMaxBudget
                }

                fun teamMember(teamMember: Member?) = teamMember(JsonField.ofNullable(teamMember))

                /**
                 * Sets [Builder.teamMember] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamMember] with a well-typed [Member] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun teamMember(teamMember: JsonField<Member>) = apply {
                    this.teamMember = teamMember
                }

                fun teamMemberRpmLimit(teamMemberRpmLimit: Long?) =
                    teamMemberRpmLimit(JsonField.ofNullable(teamMemberRpmLimit))

                /**
                 * Alias for [Builder.teamMemberRpmLimit].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun teamMemberRpmLimit(teamMemberRpmLimit: Long) =
                    teamMemberRpmLimit(teamMemberRpmLimit as Long?)

                /**
                 * Sets [Builder.teamMemberRpmLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamMemberRpmLimit] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun teamMemberRpmLimit(teamMemberRpmLimit: JsonField<Long>) = apply {
                    this.teamMemberRpmLimit = teamMemberRpmLimit
                }

                fun teamMemberSpend(teamMemberSpend: Double?) =
                    teamMemberSpend(JsonField.ofNullable(teamMemberSpend))

                /**
                 * Alias for [Builder.teamMemberSpend].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun teamMemberSpend(teamMemberSpend: Double) =
                    teamMemberSpend(teamMemberSpend as Double?)

                /**
                 * Sets [Builder.teamMemberSpend] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamMemberSpend] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun teamMemberSpend(teamMemberSpend: JsonField<Double>) = apply {
                    this.teamMemberSpend = teamMemberSpend
                }

                fun teamMemberTpmLimit(teamMemberTpmLimit: Long?) =
                    teamMemberTpmLimit(JsonField.ofNullable(teamMemberTpmLimit))

                /**
                 * Alias for [Builder.teamMemberTpmLimit].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun teamMemberTpmLimit(teamMemberTpmLimit: Long) =
                    teamMemberTpmLimit(teamMemberTpmLimit as Long?)

                /**
                 * Sets [Builder.teamMemberTpmLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamMemberTpmLimit] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun teamMemberTpmLimit(teamMemberTpmLimit: JsonField<Long>) = apply {
                    this.teamMemberTpmLimit = teamMemberTpmLimit
                }

                fun teamMetadata(teamMetadata: TeamMetadata?) =
                    teamMetadata(JsonField.ofNullable(teamMetadata))

                /**
                 * Sets [Builder.teamMetadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamMetadata] with a well-typed [TeamMetadata]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun teamMetadata(teamMetadata: JsonField<TeamMetadata>) = apply {
                    this.teamMetadata = teamMetadata
                }

                fun teamModelAliases(teamModelAliases: TeamModelAliases?) =
                    teamModelAliases(JsonField.ofNullable(teamModelAliases))

                /**
                 * Sets [Builder.teamModelAliases] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamModelAliases] with a well-typed
                 * [TeamModelAliases] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun teamModelAliases(teamModelAliases: JsonField<TeamModelAliases>) = apply {
                    this.teamModelAliases = teamModelAliases
                }

                fun teamModels(teamModels: List<JsonValue>) = teamModels(JsonField.of(teamModels))

                /**
                 * Sets [Builder.teamModels] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamModels] with a well-typed `List<JsonValue>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun teamModels(teamModels: JsonField<List<JsonValue>>) = apply {
                    this.teamModels = teamModels.map { it.toMutableList() }
                }

                /**
                 * Adds a single [JsonValue] to [teamModels].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addTeamModel(teamModel: JsonValue) = apply {
                    teamModels =
                        (teamModels ?: JsonField.of(mutableListOf())).also {
                            checkKnown("teamModels", it).add(teamModel)
                        }
                }

                fun teamObjectPermissionId(teamObjectPermissionId: String?) =
                    teamObjectPermissionId(JsonField.ofNullable(teamObjectPermissionId))

                /**
                 * Sets [Builder.teamObjectPermissionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamObjectPermissionId] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun teamObjectPermissionId(teamObjectPermissionId: JsonField<String>) = apply {
                    this.teamObjectPermissionId = teamObjectPermissionId
                }

                fun teamRpmLimit(teamRpmLimit: Long?) =
                    teamRpmLimit(JsonField.ofNullable(teamRpmLimit))

                /**
                 * Alias for [Builder.teamRpmLimit].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun teamRpmLimit(teamRpmLimit: Long) = teamRpmLimit(teamRpmLimit as Long?)

                /**
                 * Sets [Builder.teamRpmLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamRpmLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun teamRpmLimit(teamRpmLimit: JsonField<Long>) = apply {
                    this.teamRpmLimit = teamRpmLimit
                }

                fun teamSpend(teamSpend: Double?) = teamSpend(JsonField.ofNullable(teamSpend))

                /**
                 * Alias for [Builder.teamSpend].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun teamSpend(teamSpend: Double) = teamSpend(teamSpend as Double?)

                /**
                 * Sets [Builder.teamSpend] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamSpend] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun teamSpend(teamSpend: JsonField<Double>) = apply { this.teamSpend = teamSpend }

                fun teamTpmLimit(teamTpmLimit: Long?) =
                    teamTpmLimit(JsonField.ofNullable(teamTpmLimit))

                /**
                 * Alias for [Builder.teamTpmLimit].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun teamTpmLimit(teamTpmLimit: Long) = teamTpmLimit(teamTpmLimit as Long?)

                /**
                 * Sets [Builder.teamTpmLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamTpmLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun teamTpmLimit(teamTpmLimit: JsonField<Long>) = apply {
                    this.teamTpmLimit = teamTpmLimit
                }

                fun tpmLimit(tpmLimit: Long?) = tpmLimit(JsonField.ofNullable(tpmLimit))

                /**
                 * Alias for [Builder.tpmLimit].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun tpmLimit(tpmLimit: Long) = tpmLimit(tpmLimit as Long?)

                /**
                 * Sets [Builder.tpmLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tpmLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tpmLimit(tpmLimit: JsonField<Long>) = apply { this.tpmLimit = tpmLimit }

                fun tpmLimitPerModel(tpmLimitPerModel: TpmLimitPerModel?) =
                    tpmLimitPerModel(JsonField.ofNullable(tpmLimitPerModel))

                /**
                 * Sets [Builder.tpmLimitPerModel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tpmLimitPerModel] with a well-typed
                 * [TpmLimitPerModel] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun tpmLimitPerModel(tpmLimitPerModel: JsonField<TpmLimitPerModel>) = apply {
                    this.tpmLimitPerModel = tpmLimitPerModel
                }

                fun updatedAt(updatedAt: OffsetDateTime?) =
                    updatedAt(JsonField.ofNullable(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                    this.updatedAt = updatedAt
                }

                fun updatedBy(updatedBy: String?) = updatedBy(JsonField.ofNullable(updatedBy))

                /**
                 * Sets [Builder.updatedBy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedBy] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun updatedBy(updatedBy: JsonField<String>) = apply { this.updatedBy = updatedBy }

                fun user(user: JsonValue) = apply { this.user = user }

                fun userEmail(userEmail: String?) = userEmail(JsonField.ofNullable(userEmail))

                /**
                 * Sets [Builder.userEmail] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userEmail] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userEmail(userEmail: JsonField<String>) = apply { this.userEmail = userEmail }

                fun userId(userId: String?) = userId(JsonField.ofNullable(userId))

                /**
                 * Sets [Builder.userId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userId(userId: JsonField<String>) = apply { this.userId = userId }

                fun userMaxBudget(userMaxBudget: Double?) =
                    userMaxBudget(JsonField.ofNullable(userMaxBudget))

                /**
                 * Alias for [Builder.userMaxBudget].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun userMaxBudget(userMaxBudget: Double) = userMaxBudget(userMaxBudget as Double?)

                /**
                 * Sets [Builder.userMaxBudget] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userMaxBudget] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userMaxBudget(userMaxBudget: JsonField<Double>) = apply {
                    this.userMaxBudget = userMaxBudget
                }

                /**
                 * Admin Roles: PROXY_ADMIN: admin over the platform PROXY_ADMIN_VIEW_ONLY: can
                 * login, view all own keys, view all spend ORG_ADMIN: admin over a specific
                 * organization, can create teams, users only within their organization
                 *
                 * Internal User Roles: INTERNAL_USER: can login, view/create/delete their own keys,
                 * view their spend INTERNAL_USER_VIEW_ONLY: can login, view their own keys, view
                 * their own spend
                 *
                 * Team Roles: TEAM: used for JWT auth
                 *
                 * Customer Roles: CUSTOMER: External users -> these are customers
                 */
                fun userRole(userRole: UserRoles?) = userRole(JsonField.ofNullable(userRole))

                /**
                 * Sets [Builder.userRole] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userRole] with a well-typed [UserRoles] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userRole(userRole: JsonField<UserRoles>) = apply { this.userRole = userRole }

                fun userRpmLimit(userRpmLimit: Long?) =
                    userRpmLimit(JsonField.ofNullable(userRpmLimit))

                /**
                 * Alias for [Builder.userRpmLimit].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun userRpmLimit(userRpmLimit: Long) = userRpmLimit(userRpmLimit as Long?)

                /**
                 * Sets [Builder.userRpmLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userRpmLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userRpmLimit(userRpmLimit: JsonField<Long>) = apply {
                    this.userRpmLimit = userRpmLimit
                }

                fun userSpend(userSpend: Double?) = userSpend(JsonField.ofNullable(userSpend))

                /**
                 * Alias for [Builder.userSpend].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun userSpend(userSpend: Double) = userSpend(userSpend as Double?)

                /**
                 * Sets [Builder.userSpend] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userSpend] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userSpend(userSpend: JsonField<Double>) = apply { this.userSpend = userSpend }

                fun userTpmLimit(userTpmLimit: Long?) =
                    userTpmLimit(JsonField.ofNullable(userTpmLimit))

                /**
                 * Alias for [Builder.userTpmLimit].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun userTpmLimit(userTpmLimit: Long) = userTpmLimit(userTpmLimit as Long?)

                /**
                 * Sets [Builder.userTpmLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userTpmLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userTpmLimit(userTpmLimit: JsonField<Long>) = apply {
                    this.userTpmLimit = userTpmLimit
                }

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
                 * Returns an immutable instance of [UserApiKeyAuth].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UserApiKeyAuth =
                    UserApiKeyAuth(
                        token,
                        aliases,
                        (allowedCacheControls ?: JsonMissing.of()).map { it.toImmutable() },
                        allowedModelRegion,
                        (allowedRoutes ?: JsonMissing.of()).map { it.toImmutable() },
                        apiKey,
                        autoRotate,
                        blocked,
                        budgetDuration,
                        budgetResetAt,
                        config,
                        createdAt,
                        createdBy,
                        endUserId,
                        endUserMaxBudget,
                        endUserRpmLimit,
                        endUserTpmLimit,
                        expires,
                        keyAlias,
                        keyName,
                        keyRotationAt,
                        lastRefreshedAt,
                        lastRotationAt,
                        litellmBudgetTable,
                        maxBudget,
                        maxParallelRequests,
                        metadata,
                        modelMaxBudget,
                        modelSpend,
                        (models ?: JsonMissing.of()).map { it.toImmutable() },
                        objectPermission,
                        objectPermissionId,
                        orgId,
                        organizationMaxBudget,
                        organizationMetadata,
                        organizationRpmLimit,
                        organizationTpmLimit,
                        parentOtelSpan,
                        permissions,
                        requestRoute,
                        rotationCount,
                        rotationInterval,
                        routerSettings,
                        rpmLimit,
                        rpmLimitPerModel,
                        softBudget,
                        softBudgetCooldown,
                        spend,
                        teamAlias,
                        teamBlocked,
                        teamId,
                        teamMaxBudget,
                        teamMember,
                        teamMemberRpmLimit,
                        teamMemberSpend,
                        teamMemberTpmLimit,
                        teamMetadata,
                        teamModelAliases,
                        (teamModels ?: JsonMissing.of()).map { it.toImmutable() },
                        teamObjectPermissionId,
                        teamRpmLimit,
                        teamSpend,
                        teamTpmLimit,
                        tpmLimit,
                        tpmLimitPerModel,
                        updatedAt,
                        updatedBy,
                        user,
                        userEmail,
                        userId,
                        userMaxBudget,
                        userRole,
                        userRpmLimit,
                        userSpend,
                        userTpmLimit,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): UserApiKeyAuth = apply {
                if (validated) {
                    return@apply
                }

                token()
                aliases()?.validate()
                allowedCacheControls()
                allowedModelRegion()?.validate()
                allowedRoutes()
                apiKey()
                autoRotate()
                blocked()
                budgetDuration()
                budgetResetAt()
                config()?.validate()
                createdAt()
                createdBy()
                endUserId()
                endUserMaxBudget()
                endUserRpmLimit()
                endUserTpmLimit()
                expires()?.validate()
                keyAlias()
                keyName()
                keyRotationAt()
                lastRefreshedAt()
                lastRotationAt()
                litellmBudgetTable()?.validate()
                maxBudget()
                maxParallelRequests()
                metadata()?.validate()
                modelMaxBudget()?.validate()
                modelSpend()?.validate()
                models()
                objectPermission()?.validate()
                objectPermissionId()
                orgId()
                organizationMaxBudget()
                organizationMetadata()?.validate()
                organizationRpmLimit()
                organizationTpmLimit()
                permissions()?.validate()
                requestRoute()
                rotationCount()
                rotationInterval()
                routerSettings()?.validate()
                rpmLimit()
                rpmLimitPerModel()?.validate()
                softBudget()
                softBudgetCooldown()
                spend()
                teamAlias()
                teamBlocked()
                teamId()
                teamMaxBudget()
                teamMember()?.validate()
                teamMemberRpmLimit()
                teamMemberSpend()
                teamMemberTpmLimit()
                teamMetadata()?.validate()
                teamModelAliases()?.validate()
                teamModels()
                teamObjectPermissionId()
                teamRpmLimit()
                teamSpend()
                teamTpmLimit()
                tpmLimit()
                tpmLimitPerModel()?.validate()
                updatedAt()
                updatedBy()
                userEmail()
                userId()
                userMaxBudget()
                userRole()?.validate()
                userRpmLimit()
                userSpend()
                userTpmLimit()
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
                (if (token.asKnown() == null) 0 else 1) +
                    (aliases.asKnown()?.validity() ?: 0) +
                    (allowedCacheControls.asKnown()?.size ?: 0) +
                    (allowedModelRegion.asKnown()?.validity() ?: 0) +
                    (allowedRoutes.asKnown()?.size ?: 0) +
                    (if (apiKey.asKnown() == null) 0 else 1) +
                    (if (autoRotate.asKnown() == null) 0 else 1) +
                    (if (blocked.asKnown() == null) 0 else 1) +
                    (if (budgetDuration.asKnown() == null) 0 else 1) +
                    (if (budgetResetAt.asKnown() == null) 0 else 1) +
                    (config.asKnown()?.validity() ?: 0) +
                    (if (createdAt.asKnown() == null) 0 else 1) +
                    (if (createdBy.asKnown() == null) 0 else 1) +
                    (if (endUserId.asKnown() == null) 0 else 1) +
                    (if (endUserMaxBudget.asKnown() == null) 0 else 1) +
                    (if (endUserRpmLimit.asKnown() == null) 0 else 1) +
                    (if (endUserTpmLimit.asKnown() == null) 0 else 1) +
                    (expires.asKnown()?.validity() ?: 0) +
                    (if (keyAlias.asKnown() == null) 0 else 1) +
                    (if (keyName.asKnown() == null) 0 else 1) +
                    (if (keyRotationAt.asKnown() == null) 0 else 1) +
                    (if (lastRefreshedAt.asKnown() == null) 0 else 1) +
                    (if (lastRotationAt.asKnown() == null) 0 else 1) +
                    (litellmBudgetTable.asKnown()?.validity() ?: 0) +
                    (if (maxBudget.asKnown() == null) 0 else 1) +
                    (if (maxParallelRequests.asKnown() == null) 0 else 1) +
                    (metadata.asKnown()?.validity() ?: 0) +
                    (modelMaxBudget.asKnown()?.validity() ?: 0) +
                    (modelSpend.asKnown()?.validity() ?: 0) +
                    (models.asKnown()?.size ?: 0) +
                    (objectPermission.asKnown()?.validity() ?: 0) +
                    (if (objectPermissionId.asKnown() == null) 0 else 1) +
                    (if (orgId.asKnown() == null) 0 else 1) +
                    (if (organizationMaxBudget.asKnown() == null) 0 else 1) +
                    (organizationMetadata.asKnown()?.validity() ?: 0) +
                    (if (organizationRpmLimit.asKnown() == null) 0 else 1) +
                    (if (organizationTpmLimit.asKnown() == null) 0 else 1) +
                    (permissions.asKnown()?.validity() ?: 0) +
                    (if (requestRoute.asKnown() == null) 0 else 1) +
                    (if (rotationCount.asKnown() == null) 0 else 1) +
                    (if (rotationInterval.asKnown() == null) 0 else 1) +
                    (routerSettings.asKnown()?.validity() ?: 0) +
                    (if (rpmLimit.asKnown() == null) 0 else 1) +
                    (rpmLimitPerModel.asKnown()?.validity() ?: 0) +
                    (if (softBudget.asKnown() == null) 0 else 1) +
                    (if (softBudgetCooldown.asKnown() == null) 0 else 1) +
                    (if (spend.asKnown() == null) 0 else 1) +
                    (if (teamAlias.asKnown() == null) 0 else 1) +
                    (if (teamBlocked.asKnown() == null) 0 else 1) +
                    (if (teamId.asKnown() == null) 0 else 1) +
                    (if (teamMaxBudget.asKnown() == null) 0 else 1) +
                    (teamMember.asKnown()?.validity() ?: 0) +
                    (if (teamMemberRpmLimit.asKnown() == null) 0 else 1) +
                    (if (teamMemberSpend.asKnown() == null) 0 else 1) +
                    (if (teamMemberTpmLimit.asKnown() == null) 0 else 1) +
                    (teamMetadata.asKnown()?.validity() ?: 0) +
                    (teamModelAliases.asKnown()?.validity() ?: 0) +
                    (teamModels.asKnown()?.size ?: 0) +
                    (if (teamObjectPermissionId.asKnown() == null) 0 else 1) +
                    (if (teamRpmLimit.asKnown() == null) 0 else 1) +
                    (if (teamSpend.asKnown() == null) 0 else 1) +
                    (if (teamTpmLimit.asKnown() == null) 0 else 1) +
                    (if (tpmLimit.asKnown() == null) 0 else 1) +
                    (tpmLimitPerModel.asKnown()?.validity() ?: 0) +
                    (if (updatedAt.asKnown() == null) 0 else 1) +
                    (if (updatedBy.asKnown() == null) 0 else 1) +
                    (if (userEmail.asKnown() == null) 0 else 1) +
                    (if (userId.asKnown() == null) 0 else 1) +
                    (if (userMaxBudget.asKnown() == null) 0 else 1) +
                    (userRole.asKnown()?.validity() ?: 0) +
                    (if (userRpmLimit.asKnown() == null) 0 else 1) +
                    (if (userSpend.asKnown() == null) 0 else 1) +
                    (if (userTpmLimit.asKnown() == null) 0 else 1)

            class Aliases
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Aliases]. */
                    fun builder() = Builder()
                }

                /** A builder for [Aliases]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(aliases: Aliases) = apply {
                        additionalProperties = aliases.additionalProperties.toMutableMap()
                    }

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
                     * Returns an immutable instance of [Aliases].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Aliases = Aliases(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Aliases = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Aliases && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Aliases{additionalProperties=$additionalProperties}"
            }

            class AllowedModelRegion
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val EU = of("eu")

                    val US = of("us")

                    fun of(value: String) = AllowedModelRegion(JsonField.of(value))
                }

                /** An enum containing [AllowedModelRegion]'s known values. */
                enum class Known {
                    EU,
                    US,
                }

                /**
                 * An enum containing [AllowedModelRegion]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [AllowedModelRegion] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    EU,
                    US,
                    /**
                     * An enum member indicating that [AllowedModelRegion] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        EU -> Value.EU
                        US -> Value.US
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws HanzoInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
                fun known(): Known =
                    when (this) {
                        EU -> Known.EU
                        US -> Known.US
                        else ->
                            throw HanzoInvalidDataException("Unknown AllowedModelRegion: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws HanzoInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw HanzoInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): AllowedModelRegion = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AllowedModelRegion && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Config
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Config]. */
                    fun builder() = Builder()
                }

                /** A builder for [Config]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(config: Config) = apply {
                        additionalProperties = config.additionalProperties.toMutableMap()
                    }

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
                     * Returns an immutable instance of [Config].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Config = Config(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Config = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Config && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Config{additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(using = Expires.Deserializer::class)
            @JsonSerialize(using = Expires.Serializer::class)
            class Expires
            private constructor(
                private val string: String? = null,
                private val offsetDateTime: OffsetDateTime? = null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): String? = string

                fun offsetDateTime(): OffsetDateTime? = offsetDateTime

                fun isString(): Boolean = string != null

                fun isOffsetDateTime(): Boolean = offsetDateTime != null

                fun asString(): String = string.getOrThrow("string")

                fun asOffsetDateTime(): OffsetDateTime = offsetDateTime.getOrThrow("offsetDateTime")

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        offsetDateTime != null -> visitor.visitOffsetDateTime(offsetDateTime)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Expires = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitString(string: String) {}

                            override fun visitOffsetDateTime(offsetDateTime: OffsetDateTime) {}
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

                            override fun visitOffsetDateTime(offsetDateTime: OffsetDateTime) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Expires &&
                        string == other.string &&
                        offsetDateTime == other.offsetDateTime
                }

                override fun hashCode(): Int = Objects.hash(string, offsetDateTime)

                override fun toString(): String =
                    when {
                        string != null -> "Expires{string=$string}"
                        offsetDateTime != null -> "Expires{offsetDateTime=$offsetDateTime}"
                        _json != null -> "Expires{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Expires")
                    }

                companion object {

                    fun ofString(string: String) = Expires(string = string)

                    fun ofOffsetDateTime(offsetDateTime: OffsetDateTime) =
                        Expires(offsetDateTime = offsetDateTime)
                }

                /**
                 * An interface that defines how to map each variant of [Expires] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitOffsetDateTime(offsetDateTime: OffsetDateTime): T

                    /**
                     * Maps an unknown variant of [Expires] to a value of type [T].
                     *
                     * An instance of [Expires] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws HanzoInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw HanzoInvalidDataException("Unknown Expires: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Expires>(Expires::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Expires {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                                        Expires(offsetDateTime = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Expires(string = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> Expires(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Expires>(Expires::class) {

                    override fun serialize(
                        value: Expires,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.offsetDateTime != null ->
                                generator.writeObject(value.offsetDateTime)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Expires")
                        }
                    }
                }
            }

            class LitellmBudgetTable
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [LitellmBudgetTable].
                     */
                    fun builder() = Builder()
                }

                /** A builder for [LitellmBudgetTable]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(litellmBudgetTable: LitellmBudgetTable) = apply {
                        additionalProperties =
                            litellmBudgetTable.additionalProperties.toMutableMap()
                    }

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
                     * Returns an immutable instance of [LitellmBudgetTable].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): LitellmBudgetTable =
                        LitellmBudgetTable(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): LitellmBudgetTable = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is LitellmBudgetTable &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LitellmBudgetTable{additionalProperties=$additionalProperties}"
            }

            class Metadata
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Metadata]. */
                    fun builder() = Builder()
                }

                /** A builder for [Metadata]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties = metadata.additionalProperties.toMutableMap()
                    }

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
                     * Returns an immutable instance of [Metadata].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Metadata = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            class ModelMaxBudget
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [ModelMaxBudget].
                     */
                    fun builder() = Builder()
                }

                /** A builder for [ModelMaxBudget]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(modelMaxBudget: ModelMaxBudget) = apply {
                        additionalProperties = modelMaxBudget.additionalProperties.toMutableMap()
                    }

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
                     * Returns an immutable instance of [ModelMaxBudget].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ModelMaxBudget = ModelMaxBudget(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): ModelMaxBudget = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ModelMaxBudget &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ModelMaxBudget{additionalProperties=$additionalProperties}"
            }

            class ModelSpend
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [ModelSpend]. */
                    fun builder() = Builder()
                }

                /** A builder for [ModelSpend]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(modelSpend: ModelSpend) = apply {
                        additionalProperties = modelSpend.additionalProperties.toMutableMap()
                    }

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
                     * Returns an immutable instance of [ModelSpend].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ModelSpend = ModelSpend(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): ModelSpend = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ModelSpend && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "ModelSpend{additionalProperties=$additionalProperties}"
            }

            /** Represents a LiteLLM_ObjectPermissionTable record */
            class ObjectPermission
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val objectPermissionId: JsonField<String>,
                private val agentAccessGroups: JsonField<List<String>>,
                private val agents: JsonField<List<String>>,
                private val mcpAccessGroups: JsonField<List<String>>,
                private val mcpServers: JsonField<List<String>>,
                private val mcpToolPermissions: JsonField<McpToolPermissions>,
                private val vectorStores: JsonField<List<String>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("object_permission_id")
                    @ExcludeMissing
                    objectPermissionId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("agent_access_groups")
                    @ExcludeMissing
                    agentAccessGroups: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("agents")
                    @ExcludeMissing
                    agents: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("mcp_access_groups")
                    @ExcludeMissing
                    mcpAccessGroups: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("mcp_servers")
                    @ExcludeMissing
                    mcpServers: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("mcp_tool_permissions")
                    @ExcludeMissing
                    mcpToolPermissions: JsonField<McpToolPermissions> = JsonMissing.of(),
                    @JsonProperty("vector_stores")
                    @ExcludeMissing
                    vectorStores: JsonField<List<String>> = JsonMissing.of(),
                ) : this(
                    objectPermissionId,
                    agentAccessGroups,
                    agents,
                    mcpAccessGroups,
                    mcpServers,
                    mcpToolPermissions,
                    vectorStores,
                    mutableMapOf(),
                )

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun objectPermissionId(): String =
                    objectPermissionId.getRequired("object_permission_id")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun agentAccessGroups(): List<String>? =
                    agentAccessGroups.getNullable("agent_access_groups")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun agents(): List<String>? = agents.getNullable("agents")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun mcpAccessGroups(): List<String>? =
                    mcpAccessGroups.getNullable("mcp_access_groups")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun mcpServers(): List<String>? = mcpServers.getNullable("mcp_servers")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun mcpToolPermissions(): McpToolPermissions? =
                    mcpToolPermissions.getNullable("mcp_tool_permissions")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun vectorStores(): List<String>? = vectorStores.getNullable("vector_stores")

                /**
                 * Returns the raw JSON value of [objectPermissionId].
                 *
                 * Unlike [objectPermissionId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("object_permission_id")
                @ExcludeMissing
                fun _objectPermissionId(): JsonField<String> = objectPermissionId

                /**
                 * Returns the raw JSON value of [agentAccessGroups].
                 *
                 * Unlike [agentAccessGroups], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("agent_access_groups")
                @ExcludeMissing
                fun _agentAccessGroups(): JsonField<List<String>> = agentAccessGroups

                /**
                 * Returns the raw JSON value of [agents].
                 *
                 * Unlike [agents], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("agents")
                @ExcludeMissing
                fun _agents(): JsonField<List<String>> = agents

                /**
                 * Returns the raw JSON value of [mcpAccessGroups].
                 *
                 * Unlike [mcpAccessGroups], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("mcp_access_groups")
                @ExcludeMissing
                fun _mcpAccessGroups(): JsonField<List<String>> = mcpAccessGroups

                /**
                 * Returns the raw JSON value of [mcpServers].
                 *
                 * Unlike [mcpServers], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("mcp_servers")
                @ExcludeMissing
                fun _mcpServers(): JsonField<List<String>> = mcpServers

                /**
                 * Returns the raw JSON value of [mcpToolPermissions].
                 *
                 * Unlike [mcpToolPermissions], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("mcp_tool_permissions")
                @ExcludeMissing
                fun _mcpToolPermissions(): JsonField<McpToolPermissions> = mcpToolPermissions

                /**
                 * Returns the raw JSON value of [vectorStores].
                 *
                 * Unlike [vectorStores], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("vector_stores")
                @ExcludeMissing
                fun _vectorStores(): JsonField<List<String>> = vectorStores

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
                     * Returns a mutable builder for constructing an instance of [ObjectPermission].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .objectPermissionId()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [ObjectPermission]. */
                class Builder internal constructor() {

                    private var objectPermissionId: JsonField<String>? = null
                    private var agentAccessGroups: JsonField<MutableList<String>>? = null
                    private var agents: JsonField<MutableList<String>>? = null
                    private var mcpAccessGroups: JsonField<MutableList<String>>? = null
                    private var mcpServers: JsonField<MutableList<String>>? = null
                    private var mcpToolPermissions: JsonField<McpToolPermissions> = JsonMissing.of()
                    private var vectorStores: JsonField<MutableList<String>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(objectPermission: ObjectPermission) = apply {
                        objectPermissionId = objectPermission.objectPermissionId
                        agentAccessGroups =
                            objectPermission.agentAccessGroups.map { it.toMutableList() }
                        agents = objectPermission.agents.map { it.toMutableList() }
                        mcpAccessGroups =
                            objectPermission.mcpAccessGroups.map { it.toMutableList() }
                        mcpServers = objectPermission.mcpServers.map { it.toMutableList() }
                        mcpToolPermissions = objectPermission.mcpToolPermissions
                        vectorStores = objectPermission.vectorStores.map { it.toMutableList() }
                        additionalProperties = objectPermission.additionalProperties.toMutableMap()
                    }

                    fun objectPermissionId(objectPermissionId: String) =
                        objectPermissionId(JsonField.of(objectPermissionId))

                    /**
                     * Sets [Builder.objectPermissionId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.objectPermissionId] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun objectPermissionId(objectPermissionId: JsonField<String>) = apply {
                        this.objectPermissionId = objectPermissionId
                    }

                    fun agentAccessGroups(agentAccessGroups: List<String>?) =
                        agentAccessGroups(JsonField.ofNullable(agentAccessGroups))

                    /**
                     * Sets [Builder.agentAccessGroups] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.agentAccessGroups] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun agentAccessGroups(agentAccessGroups: JsonField<List<String>>) = apply {
                        this.agentAccessGroups = agentAccessGroups.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [agentAccessGroups].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addAgentAccessGroup(agentAccessGroup: String) = apply {
                        agentAccessGroups =
                            (agentAccessGroups ?: JsonField.of(mutableListOf())).also {
                                checkKnown("agentAccessGroups", it).add(agentAccessGroup)
                            }
                    }

                    fun agents(agents: List<String>?) = agents(JsonField.ofNullable(agents))

                    /**
                     * Sets [Builder.agents] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.agents] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun agents(agents: JsonField<List<String>>) = apply {
                        this.agents = agents.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [agents].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addAgent(agent: String) = apply {
                        agents =
                            (agents ?: JsonField.of(mutableListOf())).also {
                                checkKnown("agents", it).add(agent)
                            }
                    }

                    fun mcpAccessGroups(mcpAccessGroups: List<String>?) =
                        mcpAccessGroups(JsonField.ofNullable(mcpAccessGroups))

                    /**
                     * Sets [Builder.mcpAccessGroups] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.mcpAccessGroups] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun mcpAccessGroups(mcpAccessGroups: JsonField<List<String>>) = apply {
                        this.mcpAccessGroups = mcpAccessGroups.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [mcpAccessGroups].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addMcpAccessGroup(mcpAccessGroup: String) = apply {
                        mcpAccessGroups =
                            (mcpAccessGroups ?: JsonField.of(mutableListOf())).also {
                                checkKnown("mcpAccessGroups", it).add(mcpAccessGroup)
                            }
                    }

                    fun mcpServers(mcpServers: List<String>?) =
                        mcpServers(JsonField.ofNullable(mcpServers))

                    /**
                     * Sets [Builder.mcpServers] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.mcpServers] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun mcpServers(mcpServers: JsonField<List<String>>) = apply {
                        this.mcpServers = mcpServers.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [mcpServers].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addMcpServer(mcpServer: String) = apply {
                        mcpServers =
                            (mcpServers ?: JsonField.of(mutableListOf())).also {
                                checkKnown("mcpServers", it).add(mcpServer)
                            }
                    }

                    fun mcpToolPermissions(mcpToolPermissions: McpToolPermissions?) =
                        mcpToolPermissions(JsonField.ofNullable(mcpToolPermissions))

                    /**
                     * Sets [Builder.mcpToolPermissions] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.mcpToolPermissions] with a well-typed
                     * [McpToolPermissions] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun mcpToolPermissions(mcpToolPermissions: JsonField<McpToolPermissions>) =
                        apply {
                            this.mcpToolPermissions = mcpToolPermissions
                        }

                    fun vectorStores(vectorStores: List<String>?) =
                        vectorStores(JsonField.ofNullable(vectorStores))

                    /**
                     * Sets [Builder.vectorStores] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.vectorStores] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun vectorStores(vectorStores: JsonField<List<String>>) = apply {
                        this.vectorStores = vectorStores.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [vectorStores].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addVectorStore(vectorStore: String) = apply {
                        vectorStores =
                            (vectorStores ?: JsonField.of(mutableListOf())).also {
                                checkKnown("vectorStores", it).add(vectorStore)
                            }
                    }

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
                     * Returns an immutable instance of [ObjectPermission].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .objectPermissionId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): ObjectPermission =
                        ObjectPermission(
                            checkRequired("objectPermissionId", objectPermissionId),
                            (agentAccessGroups ?: JsonMissing.of()).map { it.toImmutable() },
                            (agents ?: JsonMissing.of()).map { it.toImmutable() },
                            (mcpAccessGroups ?: JsonMissing.of()).map { it.toImmutable() },
                            (mcpServers ?: JsonMissing.of()).map { it.toImmutable() },
                            mcpToolPermissions,
                            (vectorStores ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): ObjectPermission = apply {
                    if (validated) {
                        return@apply
                    }

                    objectPermissionId()
                    agentAccessGroups()
                    agents()
                    mcpAccessGroups()
                    mcpServers()
                    mcpToolPermissions()?.validate()
                    vectorStores()
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
                    (if (objectPermissionId.asKnown() == null) 0 else 1) +
                        (agentAccessGroups.asKnown()?.size ?: 0) +
                        (agents.asKnown()?.size ?: 0) +
                        (mcpAccessGroups.asKnown()?.size ?: 0) +
                        (mcpServers.asKnown()?.size ?: 0) +
                        (mcpToolPermissions.asKnown()?.validity() ?: 0) +
                        (vectorStores.asKnown()?.size ?: 0)

                class McpToolPermissions
                @JsonCreator
                private constructor(
                    @com.fasterxml.jackson.annotation.JsonValue
                    private val additionalProperties: Map<String, JsonValue>
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [McpToolPermissions].
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [McpToolPermissions]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(mcpToolPermissions: McpToolPermissions) = apply {
                            additionalProperties =
                                mcpToolPermissions.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [McpToolPermissions].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): McpToolPermissions =
                            McpToolPermissions(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): McpToolPermissions = apply {
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
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    internal fun validity(): Int =
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is McpToolPermissions &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "McpToolPermissions{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ObjectPermission &&
                        objectPermissionId == other.objectPermissionId &&
                        agentAccessGroups == other.agentAccessGroups &&
                        agents == other.agents &&
                        mcpAccessGroups == other.mcpAccessGroups &&
                        mcpServers == other.mcpServers &&
                        mcpToolPermissions == other.mcpToolPermissions &&
                        vectorStores == other.vectorStores &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        objectPermissionId,
                        agentAccessGroups,
                        agents,
                        mcpAccessGroups,
                        mcpServers,
                        mcpToolPermissions,
                        vectorStores,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ObjectPermission{objectPermissionId=$objectPermissionId, agentAccessGroups=$agentAccessGroups, agents=$agents, mcpAccessGroups=$mcpAccessGroups, mcpServers=$mcpServers, mcpToolPermissions=$mcpToolPermissions, vectorStores=$vectorStores, additionalProperties=$additionalProperties}"
            }

            class OrganizationMetadata
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [OrganizationMetadata].
                     */
                    fun builder() = Builder()
                }

                /** A builder for [OrganizationMetadata]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(organizationMetadata: OrganizationMetadata) = apply {
                        additionalProperties =
                            organizationMetadata.additionalProperties.toMutableMap()
                    }

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
                     * Returns an immutable instance of [OrganizationMetadata].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): OrganizationMetadata =
                        OrganizationMetadata(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): OrganizationMetadata = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is OrganizationMetadata &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "OrganizationMetadata{additionalProperties=$additionalProperties}"
            }

            class Permissions
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Permissions]. */
                    fun builder() = Builder()
                }

                /** A builder for [Permissions]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(permissions: Permissions) = apply {
                        additionalProperties = permissions.additionalProperties.toMutableMap()
                    }

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
                     * Returns an immutable instance of [Permissions].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Permissions = Permissions(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Permissions = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Permissions &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Permissions{additionalProperties=$additionalProperties}"
            }

            class RouterSettings
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [RouterSettings].
                     */
                    fun builder() = Builder()
                }

                /** A builder for [RouterSettings]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(routerSettings: RouterSettings) = apply {
                        additionalProperties = routerSettings.additionalProperties.toMutableMap()
                    }

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
                     * Returns an immutable instance of [RouterSettings].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): RouterSettings = RouterSettings(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): RouterSettings = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RouterSettings &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RouterSettings{additionalProperties=$additionalProperties}"
            }

            class RpmLimitPerModel
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [RpmLimitPerModel].
                     */
                    fun builder() = Builder()
                }

                /** A builder for [RpmLimitPerModel]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(rpmLimitPerModel: RpmLimitPerModel) = apply {
                        additionalProperties = rpmLimitPerModel.additionalProperties.toMutableMap()
                    }

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
                     * Returns an immutable instance of [RpmLimitPerModel].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): RpmLimitPerModel =
                        RpmLimitPerModel(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): RpmLimitPerModel = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RpmLimitPerModel &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RpmLimitPerModel{additionalProperties=$additionalProperties}"
            }

            class TeamMetadata
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [TeamMetadata]. */
                    fun builder() = Builder()
                }

                /** A builder for [TeamMetadata]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(teamMetadata: TeamMetadata) = apply {
                        additionalProperties = teamMetadata.additionalProperties.toMutableMap()
                    }

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
                     * Returns an immutable instance of [TeamMetadata].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): TeamMetadata = TeamMetadata(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): TeamMetadata = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is TeamMetadata &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "TeamMetadata{additionalProperties=$additionalProperties}"
            }

            class TeamModelAliases
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [TeamModelAliases].
                     */
                    fun builder() = Builder()
                }

                /** A builder for [TeamModelAliases]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(teamModelAliases: TeamModelAliases) = apply {
                        additionalProperties = teamModelAliases.additionalProperties.toMutableMap()
                    }

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
                     * Returns an immutable instance of [TeamModelAliases].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): TeamModelAliases =
                        TeamModelAliases(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): TeamModelAliases = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is TeamModelAliases &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "TeamModelAliases{additionalProperties=$additionalProperties}"
            }

            class TpmLimitPerModel
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [TpmLimitPerModel].
                     */
                    fun builder() = Builder()
                }

                /** A builder for [TpmLimitPerModel]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(tpmLimitPerModel: TpmLimitPerModel) = apply {
                        additionalProperties = tpmLimitPerModel.additionalProperties.toMutableMap()
                    }

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
                     * Returns an immutable instance of [TpmLimitPerModel].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): TpmLimitPerModel =
                        TpmLimitPerModel(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): TpmLimitPerModel = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is TpmLimitPerModel &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "TpmLimitPerModel{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UserApiKeyAuth &&
                    token == other.token &&
                    aliases == other.aliases &&
                    allowedCacheControls == other.allowedCacheControls &&
                    allowedModelRegion == other.allowedModelRegion &&
                    allowedRoutes == other.allowedRoutes &&
                    apiKey == other.apiKey &&
                    autoRotate == other.autoRotate &&
                    blocked == other.blocked &&
                    budgetDuration == other.budgetDuration &&
                    budgetResetAt == other.budgetResetAt &&
                    config == other.config &&
                    createdAt == other.createdAt &&
                    createdBy == other.createdBy &&
                    endUserId == other.endUserId &&
                    endUserMaxBudget == other.endUserMaxBudget &&
                    endUserRpmLimit == other.endUserRpmLimit &&
                    endUserTpmLimit == other.endUserTpmLimit &&
                    expires == other.expires &&
                    keyAlias == other.keyAlias &&
                    keyName == other.keyName &&
                    keyRotationAt == other.keyRotationAt &&
                    lastRefreshedAt == other.lastRefreshedAt &&
                    lastRotationAt == other.lastRotationAt &&
                    litellmBudgetTable == other.litellmBudgetTable &&
                    maxBudget == other.maxBudget &&
                    maxParallelRequests == other.maxParallelRequests &&
                    metadata == other.metadata &&
                    modelMaxBudget == other.modelMaxBudget &&
                    modelSpend == other.modelSpend &&
                    models == other.models &&
                    objectPermission == other.objectPermission &&
                    objectPermissionId == other.objectPermissionId &&
                    orgId == other.orgId &&
                    organizationMaxBudget == other.organizationMaxBudget &&
                    organizationMetadata == other.organizationMetadata &&
                    organizationRpmLimit == other.organizationRpmLimit &&
                    organizationTpmLimit == other.organizationTpmLimit &&
                    parentOtelSpan == other.parentOtelSpan &&
                    permissions == other.permissions &&
                    requestRoute == other.requestRoute &&
                    rotationCount == other.rotationCount &&
                    rotationInterval == other.rotationInterval &&
                    routerSettings == other.routerSettings &&
                    rpmLimit == other.rpmLimit &&
                    rpmLimitPerModel == other.rpmLimitPerModel &&
                    softBudget == other.softBudget &&
                    softBudgetCooldown == other.softBudgetCooldown &&
                    spend == other.spend &&
                    teamAlias == other.teamAlias &&
                    teamBlocked == other.teamBlocked &&
                    teamId == other.teamId &&
                    teamMaxBudget == other.teamMaxBudget &&
                    teamMember == other.teamMember &&
                    teamMemberRpmLimit == other.teamMemberRpmLimit &&
                    teamMemberSpend == other.teamMemberSpend &&
                    teamMemberTpmLimit == other.teamMemberTpmLimit &&
                    teamMetadata == other.teamMetadata &&
                    teamModelAliases == other.teamModelAliases &&
                    teamModels == other.teamModels &&
                    teamObjectPermissionId == other.teamObjectPermissionId &&
                    teamRpmLimit == other.teamRpmLimit &&
                    teamSpend == other.teamSpend &&
                    teamTpmLimit == other.teamTpmLimit &&
                    tpmLimit == other.tpmLimit &&
                    tpmLimitPerModel == other.tpmLimitPerModel &&
                    updatedAt == other.updatedAt &&
                    updatedBy == other.updatedBy &&
                    user == other.user &&
                    userEmail == other.userEmail &&
                    userId == other.userId &&
                    userMaxBudget == other.userMaxBudget &&
                    userRole == other.userRole &&
                    userRpmLimit == other.userRpmLimit &&
                    userSpend == other.userSpend &&
                    userTpmLimit == other.userTpmLimit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    token,
                    aliases,
                    allowedCacheControls,
                    allowedModelRegion,
                    allowedRoutes,
                    apiKey,
                    autoRotate,
                    blocked,
                    budgetDuration,
                    budgetResetAt,
                    config,
                    createdAt,
                    createdBy,
                    endUserId,
                    endUserMaxBudget,
                    endUserRpmLimit,
                    endUserTpmLimit,
                    expires,
                    keyAlias,
                    keyName,
                    keyRotationAt,
                    lastRefreshedAt,
                    lastRotationAt,
                    litellmBudgetTable,
                    maxBudget,
                    maxParallelRequests,
                    metadata,
                    modelMaxBudget,
                    modelSpend,
                    models,
                    objectPermission,
                    objectPermissionId,
                    orgId,
                    organizationMaxBudget,
                    organizationMetadata,
                    organizationRpmLimit,
                    organizationTpmLimit,
                    parentOtelSpan,
                    permissions,
                    requestRoute,
                    rotationCount,
                    rotationInterval,
                    routerSettings,
                    rpmLimit,
                    rpmLimitPerModel,
                    softBudget,
                    softBudgetCooldown,
                    spend,
                    teamAlias,
                    teamBlocked,
                    teamId,
                    teamMaxBudget,
                    teamMember,
                    teamMemberRpmLimit,
                    teamMemberSpend,
                    teamMemberTpmLimit,
                    teamMetadata,
                    teamModelAliases,
                    teamModels,
                    teamObjectPermissionId,
                    teamRpmLimit,
                    teamSpend,
                    teamTpmLimit,
                    tpmLimit,
                    tpmLimitPerModel,
                    updatedAt,
                    updatedBy,
                    user,
                    userEmail,
                    userId,
                    userMaxBudget,
                    userRole,
                    userRpmLimit,
                    userSpend,
                    userTpmLimit,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UserApiKeyAuth{token=$token, aliases=$aliases, allowedCacheControls=$allowedCacheControls, allowedModelRegion=$allowedModelRegion, allowedRoutes=$allowedRoutes, apiKey=$apiKey, autoRotate=$autoRotate, blocked=$blocked, budgetDuration=$budgetDuration, budgetResetAt=$budgetResetAt, config=$config, createdAt=$createdAt, createdBy=$createdBy, endUserId=$endUserId, endUserMaxBudget=$endUserMaxBudget, endUserRpmLimit=$endUserRpmLimit, endUserTpmLimit=$endUserTpmLimit, expires=$expires, keyAlias=$keyAlias, keyName=$keyName, keyRotationAt=$keyRotationAt, lastRefreshedAt=$lastRefreshedAt, lastRotationAt=$lastRotationAt, litellmBudgetTable=$litellmBudgetTable, maxBudget=$maxBudget, maxParallelRequests=$maxParallelRequests, metadata=$metadata, modelMaxBudget=$modelMaxBudget, modelSpend=$modelSpend, models=$models, objectPermission=$objectPermission, objectPermissionId=$objectPermissionId, orgId=$orgId, organizationMaxBudget=$organizationMaxBudget, organizationMetadata=$organizationMetadata, organizationRpmLimit=$organizationRpmLimit, organizationTpmLimit=$organizationTpmLimit, parentOtelSpan=$parentOtelSpan, permissions=$permissions, requestRoute=$requestRoute, rotationCount=$rotationCount, rotationInterval=$rotationInterval, routerSettings=$routerSettings, rpmLimit=$rpmLimit, rpmLimitPerModel=$rpmLimitPerModel, softBudget=$softBudget, softBudgetCooldown=$softBudgetCooldown, spend=$spend, teamAlias=$teamAlias, teamBlocked=$teamBlocked, teamId=$teamId, teamMaxBudget=$teamMaxBudget, teamMember=$teamMember, teamMemberRpmLimit=$teamMemberRpmLimit, teamMemberSpend=$teamMemberSpend, teamMemberTpmLimit=$teamMemberTpmLimit, teamMetadata=$teamMetadata, teamModelAliases=$teamModelAliases, teamModels=$teamModels, teamObjectPermissionId=$teamObjectPermissionId, teamRpmLimit=$teamRpmLimit, teamSpend=$teamSpend, teamTpmLimit=$teamTpmLimit, tpmLimit=$tpmLimit, tpmLimitPerModel=$tpmLimitPerModel, updatedAt=$updatedAt, updatedBy=$updatedBy, user=$user, userEmail=$userEmail, userId=$userId, userMaxBudget=$userMaxBudget, userRole=$userRole, userRpmLimit=$userRpmLimit, userSpend=$userSpend, userTpmLimit=$userTpmLimit, additionalProperties=$additionalProperties}"
        }

        /**
         * Recording of deleted keys for audit purposes. Mirrors LiteLLM_VerificationToken plus
         * metadata captured at deletion time.
         */
        class LiteLlmDeletedVerificationToken
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val token: JsonField<String>,
            private val aliases: JsonField<Aliases>,
            private val allowedCacheControls: JsonField<List<JsonValue>>,
            private val allowedRoutes: JsonField<List<JsonValue>>,
            private val autoRotate: JsonField<Boolean>,
            private val blocked: JsonField<Boolean>,
            private val budgetDuration: JsonField<String>,
            private val budgetResetAt: JsonField<OffsetDateTime>,
            private val config: JsonField<Config>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val createdBy: JsonField<String>,
            private val deletedAt: JsonField<OffsetDateTime>,
            private val deletedBy: JsonField<String>,
            private val deletedByApiKey: JsonField<String>,
            private val expires: JsonField<Expires>,
            private val keyAlias: JsonField<String>,
            private val keyName: JsonField<String>,
            private val keyRotationAt: JsonField<OffsetDateTime>,
            private val lastRotationAt: JsonField<OffsetDateTime>,
            private val litellmBudgetTable: JsonField<LitellmBudgetTable>,
            private val litellmChangedBy: JsonField<String>,
            private val maxBudget: JsonField<Double>,
            private val maxParallelRequests: JsonField<Long>,
            private val metadata: JsonField<Metadata>,
            private val modelMaxBudget: JsonField<ModelMaxBudget>,
            private val modelSpend: JsonField<ModelSpend>,
            private val models: JsonField<List<JsonValue>>,
            private val objectPermission: JsonField<ObjectPermission>,
            private val objectPermissionId: JsonField<String>,
            private val orgId: JsonField<String>,
            private val permissions: JsonField<Permissions>,
            private val rotationCount: JsonField<Long>,
            private val rotationInterval: JsonField<String>,
            private val routerSettings: JsonField<RouterSettings>,
            private val rpmLimit: JsonField<Long>,
            private val softBudgetCooldown: JsonField<Boolean>,
            private val spend: JsonField<Double>,
            private val teamId: JsonField<String>,
            private val tpmLimit: JsonField<Long>,
            private val updatedAt: JsonField<OffsetDateTime>,
            private val updatedBy: JsonField<String>,
            private val userId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
                @JsonProperty("aliases")
                @ExcludeMissing
                aliases: JsonField<Aliases> = JsonMissing.of(),
                @JsonProperty("allowed_cache_controls")
                @ExcludeMissing
                allowedCacheControls: JsonField<List<JsonValue>> = JsonMissing.of(),
                @JsonProperty("allowed_routes")
                @ExcludeMissing
                allowedRoutes: JsonField<List<JsonValue>> = JsonMissing.of(),
                @JsonProperty("auto_rotate")
                @ExcludeMissing
                autoRotate: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("blocked")
                @ExcludeMissing
                blocked: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("budget_duration")
                @ExcludeMissing
                budgetDuration: JsonField<String> = JsonMissing.of(),
                @JsonProperty("budget_reset_at")
                @ExcludeMissing
                budgetResetAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("config")
                @ExcludeMissing
                config: JsonField<Config> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("created_by")
                @ExcludeMissing
                createdBy: JsonField<String> = JsonMissing.of(),
                @JsonProperty("deleted_at")
                @ExcludeMissing
                deletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("deleted_by")
                @ExcludeMissing
                deletedBy: JsonField<String> = JsonMissing.of(),
                @JsonProperty("deleted_by_api_key")
                @ExcludeMissing
                deletedByApiKey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("expires")
                @ExcludeMissing
                expires: JsonField<Expires> = JsonMissing.of(),
                @JsonProperty("key_alias")
                @ExcludeMissing
                keyAlias: JsonField<String> = JsonMissing.of(),
                @JsonProperty("key_name")
                @ExcludeMissing
                keyName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("key_rotation_at")
                @ExcludeMissing
                keyRotationAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("last_rotation_at")
                @ExcludeMissing
                lastRotationAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("litellm_budget_table")
                @ExcludeMissing
                litellmBudgetTable: JsonField<LitellmBudgetTable> = JsonMissing.of(),
                @JsonProperty("litellm_changed_by")
                @ExcludeMissing
                litellmChangedBy: JsonField<String> = JsonMissing.of(),
                @JsonProperty("max_budget")
                @ExcludeMissing
                maxBudget: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("max_parallel_requests")
                @ExcludeMissing
                maxParallelRequests: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("model_max_budget")
                @ExcludeMissing
                modelMaxBudget: JsonField<ModelMaxBudget> = JsonMissing.of(),
                @JsonProperty("model_spend")
                @ExcludeMissing
                modelSpend: JsonField<ModelSpend> = JsonMissing.of(),
                @JsonProperty("models")
                @ExcludeMissing
                models: JsonField<List<JsonValue>> = JsonMissing.of(),
                @JsonProperty("object_permission")
                @ExcludeMissing
                objectPermission: JsonField<ObjectPermission> = JsonMissing.of(),
                @JsonProperty("object_permission_id")
                @ExcludeMissing
                objectPermissionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("org_id") @ExcludeMissing orgId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("permissions")
                @ExcludeMissing
                permissions: JsonField<Permissions> = JsonMissing.of(),
                @JsonProperty("rotation_count")
                @ExcludeMissing
                rotationCount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("rotation_interval")
                @ExcludeMissing
                rotationInterval: JsonField<String> = JsonMissing.of(),
                @JsonProperty("router_settings")
                @ExcludeMissing
                routerSettings: JsonField<RouterSettings> = JsonMissing.of(),
                @JsonProperty("rpm_limit")
                @ExcludeMissing
                rpmLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("soft_budget_cooldown")
                @ExcludeMissing
                softBudgetCooldown: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("spend") @ExcludeMissing spend: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("team_id")
                @ExcludeMissing
                teamId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tpm_limit")
                @ExcludeMissing
                tpmLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("updated_at")
                @ExcludeMissing
                updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("updated_by")
                @ExcludeMissing
                updatedBy: JsonField<String> = JsonMissing.of(),
                @JsonProperty("user_id")
                @ExcludeMissing
                userId: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                token,
                aliases,
                allowedCacheControls,
                allowedRoutes,
                autoRotate,
                blocked,
                budgetDuration,
                budgetResetAt,
                config,
                createdAt,
                createdBy,
                deletedAt,
                deletedBy,
                deletedByApiKey,
                expires,
                keyAlias,
                keyName,
                keyRotationAt,
                lastRotationAt,
                litellmBudgetTable,
                litellmChangedBy,
                maxBudget,
                maxParallelRequests,
                metadata,
                modelMaxBudget,
                modelSpend,
                models,
                objectPermission,
                objectPermissionId,
                orgId,
                permissions,
                rotationCount,
                rotationInterval,
                routerSettings,
                rpmLimit,
                softBudgetCooldown,
                spend,
                teamId,
                tpmLimit,
                updatedAt,
                updatedBy,
                userId,
                mutableMapOf(),
            )

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): String? = id.getNullable("id")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun token(): String? = token.getNullable("token")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun aliases(): Aliases? = aliases.getNullable("aliases")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun allowedCacheControls(): List<JsonValue>? =
                allowedCacheControls.getNullable("allowed_cache_controls")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun allowedRoutes(): List<JsonValue>? = allowedRoutes.getNullable("allowed_routes")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun autoRotate(): Boolean? = autoRotate.getNullable("auto_rotate")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun blocked(): Boolean? = blocked.getNullable("blocked")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun budgetDuration(): String? = budgetDuration.getNullable("budget_duration")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun budgetResetAt(): OffsetDateTime? = budgetResetAt.getNullable("budget_reset_at")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun config(): Config? = config.getNullable("config")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun createdBy(): String? = createdBy.getNullable("created_by")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun deletedAt(): OffsetDateTime? = deletedAt.getNullable("deleted_at")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun deletedBy(): String? = deletedBy.getNullable("deleted_by")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun deletedByApiKey(): String? = deletedByApiKey.getNullable("deleted_by_api_key")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun expires(): Expires? = expires.getNullable("expires")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun keyAlias(): String? = keyAlias.getNullable("key_alias")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun keyName(): String? = keyName.getNullable("key_name")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun keyRotationAt(): OffsetDateTime? = keyRotationAt.getNullable("key_rotation_at")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun lastRotationAt(): OffsetDateTime? = lastRotationAt.getNullable("last_rotation_at")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun litellmBudgetTable(): LitellmBudgetTable? =
                litellmBudgetTable.getNullable("litellm_budget_table")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun litellmChangedBy(): String? = litellmChangedBy.getNullable("litellm_changed_by")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun maxBudget(): Double? = maxBudget.getNullable("max_budget")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun maxParallelRequests(): Long? =
                maxParallelRequests.getNullable("max_parallel_requests")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun modelMaxBudget(): ModelMaxBudget? = modelMaxBudget.getNullable("model_max_budget")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun modelSpend(): ModelSpend? = modelSpend.getNullable("model_spend")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun models(): List<JsonValue>? = models.getNullable("models")

            /**
             * Represents a LiteLLM_ObjectPermissionTable record
             *
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun objectPermission(): ObjectPermission? =
                objectPermission.getNullable("object_permission")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun objectPermissionId(): String? =
                objectPermissionId.getNullable("object_permission_id")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun orgId(): String? = orgId.getNullable("org_id")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun permissions(): Permissions? = permissions.getNullable("permissions")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun rotationCount(): Long? = rotationCount.getNullable("rotation_count")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun rotationInterval(): String? = rotationInterval.getNullable("rotation_interval")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun routerSettings(): RouterSettings? = routerSettings.getNullable("router_settings")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun rpmLimit(): Long? = rpmLimit.getNullable("rpm_limit")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun softBudgetCooldown(): Boolean? =
                softBudgetCooldown.getNullable("soft_budget_cooldown")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun spend(): Double? = spend.getNullable("spend")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamId(): String? = teamId.getNullable("team_id")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tpmLimit(): Long? = tpmLimit.getNullable("tpm_limit")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun updatedBy(): String? = updatedBy.getNullable("updated_by")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userId(): String? = userId.getNullable("user_id")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [token].
             *
             * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

            /**
             * Returns the raw JSON value of [aliases].
             *
             * Unlike [aliases], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("aliases") @ExcludeMissing fun _aliases(): JsonField<Aliases> = aliases

            /**
             * Returns the raw JSON value of [allowedCacheControls].
             *
             * Unlike [allowedCacheControls], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("allowed_cache_controls")
            @ExcludeMissing
            fun _allowedCacheControls(): JsonField<List<JsonValue>> = allowedCacheControls

            /**
             * Returns the raw JSON value of [allowedRoutes].
             *
             * Unlike [allowedRoutes], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("allowed_routes")
            @ExcludeMissing
            fun _allowedRoutes(): JsonField<List<JsonValue>> = allowedRoutes

            /**
             * Returns the raw JSON value of [autoRotate].
             *
             * Unlike [autoRotate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("auto_rotate")
            @ExcludeMissing
            fun _autoRotate(): JsonField<Boolean> = autoRotate

            /**
             * Returns the raw JSON value of [blocked].
             *
             * Unlike [blocked], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("blocked") @ExcludeMissing fun _blocked(): JsonField<Boolean> = blocked

            /**
             * Returns the raw JSON value of [budgetDuration].
             *
             * Unlike [budgetDuration], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("budget_duration")
            @ExcludeMissing
            fun _budgetDuration(): JsonField<String> = budgetDuration

            /**
             * Returns the raw JSON value of [budgetResetAt].
             *
             * Unlike [budgetResetAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("budget_reset_at")
            @ExcludeMissing
            fun _budgetResetAt(): JsonField<OffsetDateTime> = budgetResetAt

            /**
             * Returns the raw JSON value of [config].
             *
             * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("config") @ExcludeMissing fun _config(): JsonField<Config> = config

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [createdBy].
             *
             * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_by")
            @ExcludeMissing
            fun _createdBy(): JsonField<String> = createdBy

            /**
             * Returns the raw JSON value of [deletedAt].
             *
             * Unlike [deletedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("deleted_at")
            @ExcludeMissing
            fun _deletedAt(): JsonField<OffsetDateTime> = deletedAt

            /**
             * Returns the raw JSON value of [deletedBy].
             *
             * Unlike [deletedBy], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("deleted_by")
            @ExcludeMissing
            fun _deletedBy(): JsonField<String> = deletedBy

            /**
             * Returns the raw JSON value of [deletedByApiKey].
             *
             * Unlike [deletedByApiKey], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("deleted_by_api_key")
            @ExcludeMissing
            fun _deletedByApiKey(): JsonField<String> = deletedByApiKey

            /**
             * Returns the raw JSON value of [expires].
             *
             * Unlike [expires], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("expires") @ExcludeMissing fun _expires(): JsonField<Expires> = expires

            /**
             * Returns the raw JSON value of [keyAlias].
             *
             * Unlike [keyAlias], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("key_alias") @ExcludeMissing fun _keyAlias(): JsonField<String> = keyAlias

            /**
             * Returns the raw JSON value of [keyName].
             *
             * Unlike [keyName], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("key_name") @ExcludeMissing fun _keyName(): JsonField<String> = keyName

            /**
             * Returns the raw JSON value of [keyRotationAt].
             *
             * Unlike [keyRotationAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("key_rotation_at")
            @ExcludeMissing
            fun _keyRotationAt(): JsonField<OffsetDateTime> = keyRotationAt

            /**
             * Returns the raw JSON value of [lastRotationAt].
             *
             * Unlike [lastRotationAt], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("last_rotation_at")
            @ExcludeMissing
            fun _lastRotationAt(): JsonField<OffsetDateTime> = lastRotationAt

            /**
             * Returns the raw JSON value of [litellmBudgetTable].
             *
             * Unlike [litellmBudgetTable], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("litellm_budget_table")
            @ExcludeMissing
            fun _litellmBudgetTable(): JsonField<LitellmBudgetTable> = litellmBudgetTable

            /**
             * Returns the raw JSON value of [litellmChangedBy].
             *
             * Unlike [litellmChangedBy], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("litellm_changed_by")
            @ExcludeMissing
            fun _litellmChangedBy(): JsonField<String> = litellmChangedBy

            /**
             * Returns the raw JSON value of [maxBudget].
             *
             * Unlike [maxBudget], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("max_budget")
            @ExcludeMissing
            fun _maxBudget(): JsonField<Double> = maxBudget

            /**
             * Returns the raw JSON value of [maxParallelRequests].
             *
             * Unlike [maxParallelRequests], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("max_parallel_requests")
            @ExcludeMissing
            fun _maxParallelRequests(): JsonField<Long> = maxParallelRequests

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * Returns the raw JSON value of [modelMaxBudget].
             *
             * Unlike [modelMaxBudget], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("model_max_budget")
            @ExcludeMissing
            fun _modelMaxBudget(): JsonField<ModelMaxBudget> = modelMaxBudget

            /**
             * Returns the raw JSON value of [modelSpend].
             *
             * Unlike [modelSpend], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("model_spend")
            @ExcludeMissing
            fun _modelSpend(): JsonField<ModelSpend> = modelSpend

            /**
             * Returns the raw JSON value of [models].
             *
             * Unlike [models], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("models")
            @ExcludeMissing
            fun _models(): JsonField<List<JsonValue>> = models

            /**
             * Returns the raw JSON value of [objectPermission].
             *
             * Unlike [objectPermission], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("object_permission")
            @ExcludeMissing
            fun _objectPermission(): JsonField<ObjectPermission> = objectPermission

            /**
             * Returns the raw JSON value of [objectPermissionId].
             *
             * Unlike [objectPermissionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("object_permission_id")
            @ExcludeMissing
            fun _objectPermissionId(): JsonField<String> = objectPermissionId

            /**
             * Returns the raw JSON value of [orgId].
             *
             * Unlike [orgId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("org_id") @ExcludeMissing fun _orgId(): JsonField<String> = orgId

            /**
             * Returns the raw JSON value of [permissions].
             *
             * Unlike [permissions], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("permissions")
            @ExcludeMissing
            fun _permissions(): JsonField<Permissions> = permissions

            /**
             * Returns the raw JSON value of [rotationCount].
             *
             * Unlike [rotationCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("rotation_count")
            @ExcludeMissing
            fun _rotationCount(): JsonField<Long> = rotationCount

            /**
             * Returns the raw JSON value of [rotationInterval].
             *
             * Unlike [rotationInterval], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("rotation_interval")
            @ExcludeMissing
            fun _rotationInterval(): JsonField<String> = rotationInterval

            /**
             * Returns the raw JSON value of [routerSettings].
             *
             * Unlike [routerSettings], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("router_settings")
            @ExcludeMissing
            fun _routerSettings(): JsonField<RouterSettings> = routerSettings

            /**
             * Returns the raw JSON value of [rpmLimit].
             *
             * Unlike [rpmLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("rpm_limit") @ExcludeMissing fun _rpmLimit(): JsonField<Long> = rpmLimit

            /**
             * Returns the raw JSON value of [softBudgetCooldown].
             *
             * Unlike [softBudgetCooldown], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("soft_budget_cooldown")
            @ExcludeMissing
            fun _softBudgetCooldown(): JsonField<Boolean> = softBudgetCooldown

            /**
             * Returns the raw JSON value of [spend].
             *
             * Unlike [spend], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("spend") @ExcludeMissing fun _spend(): JsonField<Double> = spend

            /**
             * Returns the raw JSON value of [teamId].
             *
             * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("team_id") @ExcludeMissing fun _teamId(): JsonField<String> = teamId

            /**
             * Returns the raw JSON value of [tpmLimit].
             *
             * Unlike [tpmLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tpm_limit") @ExcludeMissing fun _tpmLimit(): JsonField<Long> = tpmLimit

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("updated_at")
            @ExcludeMissing
            fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

            /**
             * Returns the raw JSON value of [updatedBy].
             *
             * Unlike [updatedBy], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("updated_by")
            @ExcludeMissing
            fun _updatedBy(): JsonField<String> = updatedBy

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
                 * Returns a mutable builder for constructing an instance of
                 * [LiteLlmDeletedVerificationToken].
                 */
                fun builder() = Builder()
            }

            /** A builder for [LiteLlmDeletedVerificationToken]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var token: JsonField<String> = JsonMissing.of()
                private var aliases: JsonField<Aliases> = JsonMissing.of()
                private var allowedCacheControls: JsonField<MutableList<JsonValue>>? = null
                private var allowedRoutes: JsonField<MutableList<JsonValue>>? = null
                private var autoRotate: JsonField<Boolean> = JsonMissing.of()
                private var blocked: JsonField<Boolean> = JsonMissing.of()
                private var budgetDuration: JsonField<String> = JsonMissing.of()
                private var budgetResetAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var config: JsonField<Config> = JsonMissing.of()
                private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var createdBy: JsonField<String> = JsonMissing.of()
                private var deletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var deletedBy: JsonField<String> = JsonMissing.of()
                private var deletedByApiKey: JsonField<String> = JsonMissing.of()
                private var expires: JsonField<Expires> = JsonMissing.of()
                private var keyAlias: JsonField<String> = JsonMissing.of()
                private var keyName: JsonField<String> = JsonMissing.of()
                private var keyRotationAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var lastRotationAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var litellmBudgetTable: JsonField<LitellmBudgetTable> = JsonMissing.of()
                private var litellmChangedBy: JsonField<String> = JsonMissing.of()
                private var maxBudget: JsonField<Double> = JsonMissing.of()
                private var maxParallelRequests: JsonField<Long> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var modelMaxBudget: JsonField<ModelMaxBudget> = JsonMissing.of()
                private var modelSpend: JsonField<ModelSpend> = JsonMissing.of()
                private var models: JsonField<MutableList<JsonValue>>? = null
                private var objectPermission: JsonField<ObjectPermission> = JsonMissing.of()
                private var objectPermissionId: JsonField<String> = JsonMissing.of()
                private var orgId: JsonField<String> = JsonMissing.of()
                private var permissions: JsonField<Permissions> = JsonMissing.of()
                private var rotationCount: JsonField<Long> = JsonMissing.of()
                private var rotationInterval: JsonField<String> = JsonMissing.of()
                private var routerSettings: JsonField<RouterSettings> = JsonMissing.of()
                private var rpmLimit: JsonField<Long> = JsonMissing.of()
                private var softBudgetCooldown: JsonField<Boolean> = JsonMissing.of()
                private var spend: JsonField<Double> = JsonMissing.of()
                private var teamId: JsonField<String> = JsonMissing.of()
                private var tpmLimit: JsonField<Long> = JsonMissing.of()
                private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var updatedBy: JsonField<String> = JsonMissing.of()
                private var userId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    liteLlmDeletedVerificationToken: LiteLlmDeletedVerificationToken
                ) = apply {
                    id = liteLlmDeletedVerificationToken.id
                    token = liteLlmDeletedVerificationToken.token
                    aliases = liteLlmDeletedVerificationToken.aliases
                    allowedCacheControls =
                        liteLlmDeletedVerificationToken.allowedCacheControls.map {
                            it.toMutableList()
                        }
                    allowedRoutes =
                        liteLlmDeletedVerificationToken.allowedRoutes.map { it.toMutableList() }
                    autoRotate = liteLlmDeletedVerificationToken.autoRotate
                    blocked = liteLlmDeletedVerificationToken.blocked
                    budgetDuration = liteLlmDeletedVerificationToken.budgetDuration
                    budgetResetAt = liteLlmDeletedVerificationToken.budgetResetAt
                    config = liteLlmDeletedVerificationToken.config
                    createdAt = liteLlmDeletedVerificationToken.createdAt
                    createdBy = liteLlmDeletedVerificationToken.createdBy
                    deletedAt = liteLlmDeletedVerificationToken.deletedAt
                    deletedBy = liteLlmDeletedVerificationToken.deletedBy
                    deletedByApiKey = liteLlmDeletedVerificationToken.deletedByApiKey
                    expires = liteLlmDeletedVerificationToken.expires
                    keyAlias = liteLlmDeletedVerificationToken.keyAlias
                    keyName = liteLlmDeletedVerificationToken.keyName
                    keyRotationAt = liteLlmDeletedVerificationToken.keyRotationAt
                    lastRotationAt = liteLlmDeletedVerificationToken.lastRotationAt
                    litellmBudgetTable = liteLlmDeletedVerificationToken.litellmBudgetTable
                    litellmChangedBy = liteLlmDeletedVerificationToken.litellmChangedBy
                    maxBudget = liteLlmDeletedVerificationToken.maxBudget
                    maxParallelRequests = liteLlmDeletedVerificationToken.maxParallelRequests
                    metadata = liteLlmDeletedVerificationToken.metadata
                    modelMaxBudget = liteLlmDeletedVerificationToken.modelMaxBudget
                    modelSpend = liteLlmDeletedVerificationToken.modelSpend
                    models = liteLlmDeletedVerificationToken.models.map { it.toMutableList() }
                    objectPermission = liteLlmDeletedVerificationToken.objectPermission
                    objectPermissionId = liteLlmDeletedVerificationToken.objectPermissionId
                    orgId = liteLlmDeletedVerificationToken.orgId
                    permissions = liteLlmDeletedVerificationToken.permissions
                    rotationCount = liteLlmDeletedVerificationToken.rotationCount
                    rotationInterval = liteLlmDeletedVerificationToken.rotationInterval
                    routerSettings = liteLlmDeletedVerificationToken.routerSettings
                    rpmLimit = liteLlmDeletedVerificationToken.rpmLimit
                    softBudgetCooldown = liteLlmDeletedVerificationToken.softBudgetCooldown
                    spend = liteLlmDeletedVerificationToken.spend
                    teamId = liteLlmDeletedVerificationToken.teamId
                    tpmLimit = liteLlmDeletedVerificationToken.tpmLimit
                    updatedAt = liteLlmDeletedVerificationToken.updatedAt
                    updatedBy = liteLlmDeletedVerificationToken.updatedBy
                    userId = liteLlmDeletedVerificationToken.userId
                    additionalProperties =
                        liteLlmDeletedVerificationToken.additionalProperties.toMutableMap()
                }

                fun id(id: String?) = id(JsonField.ofNullable(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun token(token: String?) = token(JsonField.ofNullable(token))

                /**
                 * Sets [Builder.token] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.token] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun token(token: JsonField<String>) = apply { this.token = token }

                fun aliases(aliases: Aliases) = aliases(JsonField.of(aliases))

                /**
                 * Sets [Builder.aliases] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.aliases] with a well-typed [Aliases] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun aliases(aliases: JsonField<Aliases>) = apply { this.aliases = aliases }

                fun allowedCacheControls(allowedCacheControls: List<JsonValue>?) =
                    allowedCacheControls(JsonField.ofNullable(allowedCacheControls))

                /**
                 * Sets [Builder.allowedCacheControls] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.allowedCacheControls] with a well-typed
                 * `List<JsonValue>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun allowedCacheControls(allowedCacheControls: JsonField<List<JsonValue>>) = apply {
                    this.allowedCacheControls = allowedCacheControls.map { it.toMutableList() }
                }

                /**
                 * Adds a single [JsonValue] to [allowedCacheControls].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAllowedCacheControl(allowedCacheControl: JsonValue) = apply {
                    allowedCacheControls =
                        (allowedCacheControls ?: JsonField.of(mutableListOf())).also {
                            checkKnown("allowedCacheControls", it).add(allowedCacheControl)
                        }
                }

                fun allowedRoutes(allowedRoutes: List<JsonValue>?) =
                    allowedRoutes(JsonField.ofNullable(allowedRoutes))

                /**
                 * Sets [Builder.allowedRoutes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.allowedRoutes] with a well-typed
                 * `List<JsonValue>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun allowedRoutes(allowedRoutes: JsonField<List<JsonValue>>) = apply {
                    this.allowedRoutes = allowedRoutes.map { it.toMutableList() }
                }

                /**
                 * Adds a single [JsonValue] to [allowedRoutes].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAllowedRoute(allowedRoute: JsonValue) = apply {
                    allowedRoutes =
                        (allowedRoutes ?: JsonField.of(mutableListOf())).also {
                            checkKnown("allowedRoutes", it).add(allowedRoute)
                        }
                }

                fun autoRotate(autoRotate: Boolean?) = autoRotate(JsonField.ofNullable(autoRotate))

                /**
                 * Alias for [Builder.autoRotate].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun autoRotate(autoRotate: Boolean) = autoRotate(autoRotate as Boolean?)

                /**
                 * Sets [Builder.autoRotate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.autoRotate] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun autoRotate(autoRotate: JsonField<Boolean>) = apply {
                    this.autoRotate = autoRotate
                }

                fun blocked(blocked: Boolean?) = blocked(JsonField.ofNullable(blocked))

                /**
                 * Alias for [Builder.blocked].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun blocked(blocked: Boolean) = blocked(blocked as Boolean?)

                /**
                 * Sets [Builder.blocked] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.blocked] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun blocked(blocked: JsonField<Boolean>) = apply { this.blocked = blocked }

                fun budgetDuration(budgetDuration: String?) =
                    budgetDuration(JsonField.ofNullable(budgetDuration))

                /**
                 * Sets [Builder.budgetDuration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.budgetDuration] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun budgetDuration(budgetDuration: JsonField<String>) = apply {
                    this.budgetDuration = budgetDuration
                }

                fun budgetResetAt(budgetResetAt: OffsetDateTime?) =
                    budgetResetAt(JsonField.ofNullable(budgetResetAt))

                /**
                 * Sets [Builder.budgetResetAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.budgetResetAt] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun budgetResetAt(budgetResetAt: JsonField<OffsetDateTime>) = apply {
                    this.budgetResetAt = budgetResetAt
                }

                fun config(config: Config) = config(JsonField.of(config))

                /**
                 * Sets [Builder.config] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.config] with a well-typed [Config] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun config(config: JsonField<Config>) = apply { this.config = config }

                fun createdAt(createdAt: OffsetDateTime?) =
                    createdAt(JsonField.ofNullable(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                fun createdBy(createdBy: String?) = createdBy(JsonField.ofNullable(createdBy))

                /**
                 * Sets [Builder.createdBy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdBy] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

                fun deletedAt(deletedAt: OffsetDateTime?) =
                    deletedAt(JsonField.ofNullable(deletedAt))

                /**
                 * Sets [Builder.deletedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.deletedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun deletedAt(deletedAt: JsonField<OffsetDateTime>) = apply {
                    this.deletedAt = deletedAt
                }

                fun deletedBy(deletedBy: String?) = deletedBy(JsonField.ofNullable(deletedBy))

                /**
                 * Sets [Builder.deletedBy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.deletedBy] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun deletedBy(deletedBy: JsonField<String>) = apply { this.deletedBy = deletedBy }

                fun deletedByApiKey(deletedByApiKey: String?) =
                    deletedByApiKey(JsonField.ofNullable(deletedByApiKey))

                /**
                 * Sets [Builder.deletedByApiKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.deletedByApiKey] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun deletedByApiKey(deletedByApiKey: JsonField<String>) = apply {
                    this.deletedByApiKey = deletedByApiKey
                }

                fun expires(expires: Expires?) = expires(JsonField.ofNullable(expires))

                /**
                 * Sets [Builder.expires] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expires] with a well-typed [Expires] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun expires(expires: JsonField<Expires>) = apply { this.expires = expires }

                /** Alias for calling [expires] with `Expires.ofString(string)`. */
                fun expires(string: String) = expires(Expires.ofString(string))

                /** Alias for calling [expires] with `Expires.ofOffsetDateTime(offsetDateTime)`. */
                fun expires(offsetDateTime: OffsetDateTime) =
                    expires(Expires.ofOffsetDateTime(offsetDateTime))

                fun keyAlias(keyAlias: String?) = keyAlias(JsonField.ofNullable(keyAlias))

                /**
                 * Sets [Builder.keyAlias] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.keyAlias] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun keyAlias(keyAlias: JsonField<String>) = apply { this.keyAlias = keyAlias }

                fun keyName(keyName: String?) = keyName(JsonField.ofNullable(keyName))

                /**
                 * Sets [Builder.keyName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.keyName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun keyName(keyName: JsonField<String>) = apply { this.keyName = keyName }

                fun keyRotationAt(keyRotationAt: OffsetDateTime?) =
                    keyRotationAt(JsonField.ofNullable(keyRotationAt))

                /**
                 * Sets [Builder.keyRotationAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.keyRotationAt] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun keyRotationAt(keyRotationAt: JsonField<OffsetDateTime>) = apply {
                    this.keyRotationAt = keyRotationAt
                }

                fun lastRotationAt(lastRotationAt: OffsetDateTime?) =
                    lastRotationAt(JsonField.ofNullable(lastRotationAt))

                /**
                 * Sets [Builder.lastRotationAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lastRotationAt] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun lastRotationAt(lastRotationAt: JsonField<OffsetDateTime>) = apply {
                    this.lastRotationAt = lastRotationAt
                }

                fun litellmBudgetTable(litellmBudgetTable: LitellmBudgetTable?) =
                    litellmBudgetTable(JsonField.ofNullable(litellmBudgetTable))

                /**
                 * Sets [Builder.litellmBudgetTable] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.litellmBudgetTable] with a well-typed
                 * [LitellmBudgetTable] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun litellmBudgetTable(litellmBudgetTable: JsonField<LitellmBudgetTable>) = apply {
                    this.litellmBudgetTable = litellmBudgetTable
                }

                fun litellmChangedBy(litellmChangedBy: String?) =
                    litellmChangedBy(JsonField.ofNullable(litellmChangedBy))

                /**
                 * Sets [Builder.litellmChangedBy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.litellmChangedBy] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun litellmChangedBy(litellmChangedBy: JsonField<String>) = apply {
                    this.litellmChangedBy = litellmChangedBy
                }

                fun maxBudget(maxBudget: Double?) = maxBudget(JsonField.ofNullable(maxBudget))

                /**
                 * Alias for [Builder.maxBudget].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun maxBudget(maxBudget: Double) = maxBudget(maxBudget as Double?)

                /**
                 * Sets [Builder.maxBudget] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxBudget] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxBudget(maxBudget: JsonField<Double>) = apply { this.maxBudget = maxBudget }

                fun maxParallelRequests(maxParallelRequests: Long?) =
                    maxParallelRequests(JsonField.ofNullable(maxParallelRequests))

                /**
                 * Alias for [Builder.maxParallelRequests].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun maxParallelRequests(maxParallelRequests: Long) =
                    maxParallelRequests(maxParallelRequests as Long?)

                /**
                 * Sets [Builder.maxParallelRequests] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxParallelRequests] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun maxParallelRequests(maxParallelRequests: JsonField<Long>) = apply {
                    this.maxParallelRequests = maxParallelRequests
                }

                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                fun modelMaxBudget(modelMaxBudget: ModelMaxBudget) =
                    modelMaxBudget(JsonField.of(modelMaxBudget))

                /**
                 * Sets [Builder.modelMaxBudget] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.modelMaxBudget] with a well-typed
                 * [ModelMaxBudget] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun modelMaxBudget(modelMaxBudget: JsonField<ModelMaxBudget>) = apply {
                    this.modelMaxBudget = modelMaxBudget
                }

                fun modelSpend(modelSpend: ModelSpend) = modelSpend(JsonField.of(modelSpend))

                /**
                 * Sets [Builder.modelSpend] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.modelSpend] with a well-typed [ModelSpend] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun modelSpend(modelSpend: JsonField<ModelSpend>) = apply {
                    this.modelSpend = modelSpend
                }

                fun models(models: List<JsonValue>) = models(JsonField.of(models))

                /**
                 * Sets [Builder.models] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.models] with a well-typed `List<JsonValue>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun models(models: JsonField<List<JsonValue>>) = apply {
                    this.models = models.map { it.toMutableList() }
                }

                /**
                 * Adds a single [JsonValue] to [models].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addModel(model: JsonValue) = apply {
                    models =
                        (models ?: JsonField.of(mutableListOf())).also {
                            checkKnown("models", it).add(model)
                        }
                }

                /** Represents a LiteLLM_ObjectPermissionTable record */
                fun objectPermission(objectPermission: ObjectPermission?) =
                    objectPermission(JsonField.ofNullable(objectPermission))

                /**
                 * Sets [Builder.objectPermission] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.objectPermission] with a well-typed
                 * [ObjectPermission] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun objectPermission(objectPermission: JsonField<ObjectPermission>) = apply {
                    this.objectPermission = objectPermission
                }

                fun objectPermissionId(objectPermissionId: String?) =
                    objectPermissionId(JsonField.ofNullable(objectPermissionId))

                /**
                 * Sets [Builder.objectPermissionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.objectPermissionId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun objectPermissionId(objectPermissionId: JsonField<String>) = apply {
                    this.objectPermissionId = objectPermissionId
                }

                fun orgId(orgId: String?) = orgId(JsonField.ofNullable(orgId))

                /**
                 * Sets [Builder.orgId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.orgId] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun orgId(orgId: JsonField<String>) = apply { this.orgId = orgId }

                fun permissions(permissions: Permissions) = permissions(JsonField.of(permissions))

                /**
                 * Sets [Builder.permissions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.permissions] with a well-typed [Permissions]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun permissions(permissions: JsonField<Permissions>) = apply {
                    this.permissions = permissions
                }

                fun rotationCount(rotationCount: Long?) =
                    rotationCount(JsonField.ofNullable(rotationCount))

                /**
                 * Alias for [Builder.rotationCount].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun rotationCount(rotationCount: Long) = rotationCount(rotationCount as Long?)

                /**
                 * Sets [Builder.rotationCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rotationCount] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun rotationCount(rotationCount: JsonField<Long>) = apply {
                    this.rotationCount = rotationCount
                }

                fun rotationInterval(rotationInterval: String?) =
                    rotationInterval(JsonField.ofNullable(rotationInterval))

                /**
                 * Sets [Builder.rotationInterval] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rotationInterval] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun rotationInterval(rotationInterval: JsonField<String>) = apply {
                    this.rotationInterval = rotationInterval
                }

                fun routerSettings(routerSettings: RouterSettings?) =
                    routerSettings(JsonField.ofNullable(routerSettings))

                /**
                 * Sets [Builder.routerSettings] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.routerSettings] with a well-typed
                 * [RouterSettings] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun routerSettings(routerSettings: JsonField<RouterSettings>) = apply {
                    this.routerSettings = routerSettings
                }

                fun rpmLimit(rpmLimit: Long?) = rpmLimit(JsonField.ofNullable(rpmLimit))

                /**
                 * Alias for [Builder.rpmLimit].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun rpmLimit(rpmLimit: Long) = rpmLimit(rpmLimit as Long?)

                /**
                 * Sets [Builder.rpmLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rpmLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun rpmLimit(rpmLimit: JsonField<Long>) = apply { this.rpmLimit = rpmLimit }

                fun softBudgetCooldown(softBudgetCooldown: Boolean) =
                    softBudgetCooldown(JsonField.of(softBudgetCooldown))

                /**
                 * Sets [Builder.softBudgetCooldown] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.softBudgetCooldown] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun softBudgetCooldown(softBudgetCooldown: JsonField<Boolean>) = apply {
                    this.softBudgetCooldown = softBudgetCooldown
                }

                fun spend(spend: Double) = spend(JsonField.of(spend))

                /**
                 * Sets [Builder.spend] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.spend] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun spend(spend: JsonField<Double>) = apply { this.spend = spend }

                fun teamId(teamId: String?) = teamId(JsonField.ofNullable(teamId))

                /**
                 * Sets [Builder.teamId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun teamId(teamId: JsonField<String>) = apply { this.teamId = teamId }

                fun tpmLimit(tpmLimit: Long?) = tpmLimit(JsonField.ofNullable(tpmLimit))

                /**
                 * Alias for [Builder.tpmLimit].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun tpmLimit(tpmLimit: Long) = tpmLimit(tpmLimit as Long?)

                /**
                 * Sets [Builder.tpmLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tpmLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tpmLimit(tpmLimit: JsonField<Long>) = apply { this.tpmLimit = tpmLimit }

                fun updatedAt(updatedAt: OffsetDateTime?) =
                    updatedAt(JsonField.ofNullable(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                    this.updatedAt = updatedAt
                }

                fun updatedBy(updatedBy: String?) = updatedBy(JsonField.ofNullable(updatedBy))

                /**
                 * Sets [Builder.updatedBy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedBy] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun updatedBy(updatedBy: JsonField<String>) = apply { this.updatedBy = updatedBy }

                fun userId(userId: String?) = userId(JsonField.ofNullable(userId))

                /**
                 * Sets [Builder.userId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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
                 * Returns an immutable instance of [LiteLlmDeletedVerificationToken].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): LiteLlmDeletedVerificationToken =
                    LiteLlmDeletedVerificationToken(
                        id,
                        token,
                        aliases,
                        (allowedCacheControls ?: JsonMissing.of()).map { it.toImmutable() },
                        (allowedRoutes ?: JsonMissing.of()).map { it.toImmutable() },
                        autoRotate,
                        blocked,
                        budgetDuration,
                        budgetResetAt,
                        config,
                        createdAt,
                        createdBy,
                        deletedAt,
                        deletedBy,
                        deletedByApiKey,
                        expires,
                        keyAlias,
                        keyName,
                        keyRotationAt,
                        lastRotationAt,
                        litellmBudgetTable,
                        litellmChangedBy,
                        maxBudget,
                        maxParallelRequests,
                        metadata,
                        modelMaxBudget,
                        modelSpend,
                        (models ?: JsonMissing.of()).map { it.toImmutable() },
                        objectPermission,
                        objectPermissionId,
                        orgId,
                        permissions,
                        rotationCount,
                        rotationInterval,
                        routerSettings,
                        rpmLimit,
                        softBudgetCooldown,
                        spend,
                        teamId,
                        tpmLimit,
                        updatedAt,
                        updatedBy,
                        userId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): LiteLlmDeletedVerificationToken = apply {
                if (validated) {
                    return@apply
                }

                id()
                token()
                aliases()?.validate()
                allowedCacheControls()
                allowedRoutes()
                autoRotate()
                blocked()
                budgetDuration()
                budgetResetAt()
                config()?.validate()
                createdAt()
                createdBy()
                deletedAt()
                deletedBy()
                deletedByApiKey()
                expires()?.validate()
                keyAlias()
                keyName()
                keyRotationAt()
                lastRotationAt()
                litellmBudgetTable()?.validate()
                litellmChangedBy()
                maxBudget()
                maxParallelRequests()
                metadata()?.validate()
                modelMaxBudget()?.validate()
                modelSpend()?.validate()
                models()
                objectPermission()?.validate()
                objectPermissionId()
                orgId()
                permissions()?.validate()
                rotationCount()
                rotationInterval()
                routerSettings()?.validate()
                rpmLimit()
                softBudgetCooldown()
                spend()
                teamId()
                tpmLimit()
                updatedAt()
                updatedBy()
                userId()
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
                (if (id.asKnown() == null) 0 else 1) +
                    (if (token.asKnown() == null) 0 else 1) +
                    (aliases.asKnown()?.validity() ?: 0) +
                    (allowedCacheControls.asKnown()?.size ?: 0) +
                    (allowedRoutes.asKnown()?.size ?: 0) +
                    (if (autoRotate.asKnown() == null) 0 else 1) +
                    (if (blocked.asKnown() == null) 0 else 1) +
                    (if (budgetDuration.asKnown() == null) 0 else 1) +
                    (if (budgetResetAt.asKnown() == null) 0 else 1) +
                    (config.asKnown()?.validity() ?: 0) +
                    (if (createdAt.asKnown() == null) 0 else 1) +
                    (if (createdBy.asKnown() == null) 0 else 1) +
                    (if (deletedAt.asKnown() == null) 0 else 1) +
                    (if (deletedBy.asKnown() == null) 0 else 1) +
                    (if (deletedByApiKey.asKnown() == null) 0 else 1) +
                    (expires.asKnown()?.validity() ?: 0) +
                    (if (keyAlias.asKnown() == null) 0 else 1) +
                    (if (keyName.asKnown() == null) 0 else 1) +
                    (if (keyRotationAt.asKnown() == null) 0 else 1) +
                    (if (lastRotationAt.asKnown() == null) 0 else 1) +
                    (litellmBudgetTable.asKnown()?.validity() ?: 0) +
                    (if (litellmChangedBy.asKnown() == null) 0 else 1) +
                    (if (maxBudget.asKnown() == null) 0 else 1) +
                    (if (maxParallelRequests.asKnown() == null) 0 else 1) +
                    (metadata.asKnown()?.validity() ?: 0) +
                    (modelMaxBudget.asKnown()?.validity() ?: 0) +
                    (modelSpend.asKnown()?.validity() ?: 0) +
                    (models.asKnown()?.size ?: 0) +
                    (objectPermission.asKnown()?.validity() ?: 0) +
                    (if (objectPermissionId.asKnown() == null) 0 else 1) +
                    (if (orgId.asKnown() == null) 0 else 1) +
                    (permissions.asKnown()?.validity() ?: 0) +
                    (if (rotationCount.asKnown() == null) 0 else 1) +
                    (if (rotationInterval.asKnown() == null) 0 else 1) +
                    (routerSettings.asKnown()?.validity() ?: 0) +
                    (if (rpmLimit.asKnown() == null) 0 else 1) +
                    (if (softBudgetCooldown.asKnown() == null) 0 else 1) +
                    (if (spend.asKnown() == null) 0 else 1) +
                    (if (teamId.asKnown() == null) 0 else 1) +
                    (if (tpmLimit.asKnown() == null) 0 else 1) +
                    (if (updatedAt.asKnown() == null) 0 else 1) +
                    (if (updatedBy.asKnown() == null) 0 else 1) +
                    (if (userId.asKnown() == null) 0 else 1)

            class Aliases
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Aliases]. */
                    fun builder() = Builder()
                }

                /** A builder for [Aliases]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(aliases: Aliases) = apply {
                        additionalProperties = aliases.additionalProperties.toMutableMap()
                    }

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
                     * Returns an immutable instance of [Aliases].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Aliases = Aliases(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Aliases = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Aliases && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Aliases{additionalProperties=$additionalProperties}"
            }

            class Config
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Config]. */
                    fun builder() = Builder()
                }

                /** A builder for [Config]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(config: Config) = apply {
                        additionalProperties = config.additionalProperties.toMutableMap()
                    }

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
                     * Returns an immutable instance of [Config].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Config = Config(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Config = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Config && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Config{additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(using = Expires.Deserializer::class)
            @JsonSerialize(using = Expires.Serializer::class)
            class Expires
            private constructor(
                private val string: String? = null,
                private val offsetDateTime: OffsetDateTime? = null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): String? = string

                fun offsetDateTime(): OffsetDateTime? = offsetDateTime

                fun isString(): Boolean = string != null

                fun isOffsetDateTime(): Boolean = offsetDateTime != null

                fun asString(): String = string.getOrThrow("string")

                fun asOffsetDateTime(): OffsetDateTime = offsetDateTime.getOrThrow("offsetDateTime")

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        offsetDateTime != null -> visitor.visitOffsetDateTime(offsetDateTime)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Expires = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitString(string: String) {}

                            override fun visitOffsetDateTime(offsetDateTime: OffsetDateTime) {}
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

                            override fun visitOffsetDateTime(offsetDateTime: OffsetDateTime) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Expires &&
                        string == other.string &&
                        offsetDateTime == other.offsetDateTime
                }

                override fun hashCode(): Int = Objects.hash(string, offsetDateTime)

                override fun toString(): String =
                    when {
                        string != null -> "Expires{string=$string}"
                        offsetDateTime != null -> "Expires{offsetDateTime=$offsetDateTime}"
                        _json != null -> "Expires{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Expires")
                    }

                companion object {

                    fun ofString(string: String) = Expires(string = string)

                    fun ofOffsetDateTime(offsetDateTime: OffsetDateTime) =
                        Expires(offsetDateTime = offsetDateTime)
                }

                /**
                 * An interface that defines how to map each variant of [Expires] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitOffsetDateTime(offsetDateTime: OffsetDateTime): T

                    /**
                     * Maps an unknown variant of [Expires] to a value of type [T].
                     *
                     * An instance of [Expires] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws HanzoInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw HanzoInvalidDataException("Unknown Expires: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Expires>(Expires::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Expires {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                                        Expires(offsetDateTime = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Expires(string = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> Expires(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Expires>(Expires::class) {

                    override fun serialize(
                        value: Expires,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.offsetDateTime != null ->
                                generator.writeObject(value.offsetDateTime)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Expires")
                        }
                    }
                }
            }

            class LitellmBudgetTable
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [LitellmBudgetTable].
                     */
                    fun builder() = Builder()
                }

                /** A builder for [LitellmBudgetTable]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(litellmBudgetTable: LitellmBudgetTable) = apply {
                        additionalProperties =
                            litellmBudgetTable.additionalProperties.toMutableMap()
                    }

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
                     * Returns an immutable instance of [LitellmBudgetTable].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): LitellmBudgetTable =
                        LitellmBudgetTable(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): LitellmBudgetTable = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is LitellmBudgetTable &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LitellmBudgetTable{additionalProperties=$additionalProperties}"
            }

            class Metadata
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Metadata]. */
                    fun builder() = Builder()
                }

                /** A builder for [Metadata]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties = metadata.additionalProperties.toMutableMap()
                    }

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
                     * Returns an immutable instance of [Metadata].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Metadata = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            class ModelMaxBudget
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [ModelMaxBudget].
                     */
                    fun builder() = Builder()
                }

                /** A builder for [ModelMaxBudget]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(modelMaxBudget: ModelMaxBudget) = apply {
                        additionalProperties = modelMaxBudget.additionalProperties.toMutableMap()
                    }

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
                     * Returns an immutable instance of [ModelMaxBudget].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ModelMaxBudget = ModelMaxBudget(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): ModelMaxBudget = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ModelMaxBudget &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ModelMaxBudget{additionalProperties=$additionalProperties}"
            }

            class ModelSpend
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [ModelSpend]. */
                    fun builder() = Builder()
                }

                /** A builder for [ModelSpend]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(modelSpend: ModelSpend) = apply {
                        additionalProperties = modelSpend.additionalProperties.toMutableMap()
                    }

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
                     * Returns an immutable instance of [ModelSpend].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ModelSpend = ModelSpend(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): ModelSpend = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ModelSpend && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "ModelSpend{additionalProperties=$additionalProperties}"
            }

            /** Represents a LiteLLM_ObjectPermissionTable record */
            class ObjectPermission
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val objectPermissionId: JsonField<String>,
                private val agentAccessGroups: JsonField<List<String>>,
                private val agents: JsonField<List<String>>,
                private val mcpAccessGroups: JsonField<List<String>>,
                private val mcpServers: JsonField<List<String>>,
                private val mcpToolPermissions: JsonField<McpToolPermissions>,
                private val vectorStores: JsonField<List<String>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("object_permission_id")
                    @ExcludeMissing
                    objectPermissionId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("agent_access_groups")
                    @ExcludeMissing
                    agentAccessGroups: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("agents")
                    @ExcludeMissing
                    agents: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("mcp_access_groups")
                    @ExcludeMissing
                    mcpAccessGroups: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("mcp_servers")
                    @ExcludeMissing
                    mcpServers: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("mcp_tool_permissions")
                    @ExcludeMissing
                    mcpToolPermissions: JsonField<McpToolPermissions> = JsonMissing.of(),
                    @JsonProperty("vector_stores")
                    @ExcludeMissing
                    vectorStores: JsonField<List<String>> = JsonMissing.of(),
                ) : this(
                    objectPermissionId,
                    agentAccessGroups,
                    agents,
                    mcpAccessGroups,
                    mcpServers,
                    mcpToolPermissions,
                    vectorStores,
                    mutableMapOf(),
                )

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun objectPermissionId(): String =
                    objectPermissionId.getRequired("object_permission_id")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun agentAccessGroups(): List<String>? =
                    agentAccessGroups.getNullable("agent_access_groups")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun agents(): List<String>? = agents.getNullable("agents")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun mcpAccessGroups(): List<String>? =
                    mcpAccessGroups.getNullable("mcp_access_groups")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun mcpServers(): List<String>? = mcpServers.getNullable("mcp_servers")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun mcpToolPermissions(): McpToolPermissions? =
                    mcpToolPermissions.getNullable("mcp_tool_permissions")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun vectorStores(): List<String>? = vectorStores.getNullable("vector_stores")

                /**
                 * Returns the raw JSON value of [objectPermissionId].
                 *
                 * Unlike [objectPermissionId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("object_permission_id")
                @ExcludeMissing
                fun _objectPermissionId(): JsonField<String> = objectPermissionId

                /**
                 * Returns the raw JSON value of [agentAccessGroups].
                 *
                 * Unlike [agentAccessGroups], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("agent_access_groups")
                @ExcludeMissing
                fun _agentAccessGroups(): JsonField<List<String>> = agentAccessGroups

                /**
                 * Returns the raw JSON value of [agents].
                 *
                 * Unlike [agents], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("agents")
                @ExcludeMissing
                fun _agents(): JsonField<List<String>> = agents

                /**
                 * Returns the raw JSON value of [mcpAccessGroups].
                 *
                 * Unlike [mcpAccessGroups], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("mcp_access_groups")
                @ExcludeMissing
                fun _mcpAccessGroups(): JsonField<List<String>> = mcpAccessGroups

                /**
                 * Returns the raw JSON value of [mcpServers].
                 *
                 * Unlike [mcpServers], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("mcp_servers")
                @ExcludeMissing
                fun _mcpServers(): JsonField<List<String>> = mcpServers

                /**
                 * Returns the raw JSON value of [mcpToolPermissions].
                 *
                 * Unlike [mcpToolPermissions], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("mcp_tool_permissions")
                @ExcludeMissing
                fun _mcpToolPermissions(): JsonField<McpToolPermissions> = mcpToolPermissions

                /**
                 * Returns the raw JSON value of [vectorStores].
                 *
                 * Unlike [vectorStores], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("vector_stores")
                @ExcludeMissing
                fun _vectorStores(): JsonField<List<String>> = vectorStores

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
                     * Returns a mutable builder for constructing an instance of [ObjectPermission].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .objectPermissionId()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [ObjectPermission]. */
                class Builder internal constructor() {

                    private var objectPermissionId: JsonField<String>? = null
                    private var agentAccessGroups: JsonField<MutableList<String>>? = null
                    private var agents: JsonField<MutableList<String>>? = null
                    private var mcpAccessGroups: JsonField<MutableList<String>>? = null
                    private var mcpServers: JsonField<MutableList<String>>? = null
                    private var mcpToolPermissions: JsonField<McpToolPermissions> = JsonMissing.of()
                    private var vectorStores: JsonField<MutableList<String>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(objectPermission: ObjectPermission) = apply {
                        objectPermissionId = objectPermission.objectPermissionId
                        agentAccessGroups =
                            objectPermission.agentAccessGroups.map { it.toMutableList() }
                        agents = objectPermission.agents.map { it.toMutableList() }
                        mcpAccessGroups =
                            objectPermission.mcpAccessGroups.map { it.toMutableList() }
                        mcpServers = objectPermission.mcpServers.map { it.toMutableList() }
                        mcpToolPermissions = objectPermission.mcpToolPermissions
                        vectorStores = objectPermission.vectorStores.map { it.toMutableList() }
                        additionalProperties = objectPermission.additionalProperties.toMutableMap()
                    }

                    fun objectPermissionId(objectPermissionId: String) =
                        objectPermissionId(JsonField.of(objectPermissionId))

                    /**
                     * Sets [Builder.objectPermissionId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.objectPermissionId] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun objectPermissionId(objectPermissionId: JsonField<String>) = apply {
                        this.objectPermissionId = objectPermissionId
                    }

                    fun agentAccessGroups(agentAccessGroups: List<String>?) =
                        agentAccessGroups(JsonField.ofNullable(agentAccessGroups))

                    /**
                     * Sets [Builder.agentAccessGroups] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.agentAccessGroups] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun agentAccessGroups(agentAccessGroups: JsonField<List<String>>) = apply {
                        this.agentAccessGroups = agentAccessGroups.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [agentAccessGroups].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addAgentAccessGroup(agentAccessGroup: String) = apply {
                        agentAccessGroups =
                            (agentAccessGroups ?: JsonField.of(mutableListOf())).also {
                                checkKnown("agentAccessGroups", it).add(agentAccessGroup)
                            }
                    }

                    fun agents(agents: List<String>?) = agents(JsonField.ofNullable(agents))

                    /**
                     * Sets [Builder.agents] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.agents] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun agents(agents: JsonField<List<String>>) = apply {
                        this.agents = agents.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [agents].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addAgent(agent: String) = apply {
                        agents =
                            (agents ?: JsonField.of(mutableListOf())).also {
                                checkKnown("agents", it).add(agent)
                            }
                    }

                    fun mcpAccessGroups(mcpAccessGroups: List<String>?) =
                        mcpAccessGroups(JsonField.ofNullable(mcpAccessGroups))

                    /**
                     * Sets [Builder.mcpAccessGroups] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.mcpAccessGroups] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun mcpAccessGroups(mcpAccessGroups: JsonField<List<String>>) = apply {
                        this.mcpAccessGroups = mcpAccessGroups.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [mcpAccessGroups].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addMcpAccessGroup(mcpAccessGroup: String) = apply {
                        mcpAccessGroups =
                            (mcpAccessGroups ?: JsonField.of(mutableListOf())).also {
                                checkKnown("mcpAccessGroups", it).add(mcpAccessGroup)
                            }
                    }

                    fun mcpServers(mcpServers: List<String>?) =
                        mcpServers(JsonField.ofNullable(mcpServers))

                    /**
                     * Sets [Builder.mcpServers] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.mcpServers] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun mcpServers(mcpServers: JsonField<List<String>>) = apply {
                        this.mcpServers = mcpServers.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [mcpServers].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addMcpServer(mcpServer: String) = apply {
                        mcpServers =
                            (mcpServers ?: JsonField.of(mutableListOf())).also {
                                checkKnown("mcpServers", it).add(mcpServer)
                            }
                    }

                    fun mcpToolPermissions(mcpToolPermissions: McpToolPermissions?) =
                        mcpToolPermissions(JsonField.ofNullable(mcpToolPermissions))

                    /**
                     * Sets [Builder.mcpToolPermissions] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.mcpToolPermissions] with a well-typed
                     * [McpToolPermissions] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun mcpToolPermissions(mcpToolPermissions: JsonField<McpToolPermissions>) =
                        apply {
                            this.mcpToolPermissions = mcpToolPermissions
                        }

                    fun vectorStores(vectorStores: List<String>?) =
                        vectorStores(JsonField.ofNullable(vectorStores))

                    /**
                     * Sets [Builder.vectorStores] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.vectorStores] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun vectorStores(vectorStores: JsonField<List<String>>) = apply {
                        this.vectorStores = vectorStores.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [vectorStores].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addVectorStore(vectorStore: String) = apply {
                        vectorStores =
                            (vectorStores ?: JsonField.of(mutableListOf())).also {
                                checkKnown("vectorStores", it).add(vectorStore)
                            }
                    }

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
                     * Returns an immutable instance of [ObjectPermission].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .objectPermissionId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): ObjectPermission =
                        ObjectPermission(
                            checkRequired("objectPermissionId", objectPermissionId),
                            (agentAccessGroups ?: JsonMissing.of()).map { it.toImmutable() },
                            (agents ?: JsonMissing.of()).map { it.toImmutable() },
                            (mcpAccessGroups ?: JsonMissing.of()).map { it.toImmutable() },
                            (mcpServers ?: JsonMissing.of()).map { it.toImmutable() },
                            mcpToolPermissions,
                            (vectorStores ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): ObjectPermission = apply {
                    if (validated) {
                        return@apply
                    }

                    objectPermissionId()
                    agentAccessGroups()
                    agents()
                    mcpAccessGroups()
                    mcpServers()
                    mcpToolPermissions()?.validate()
                    vectorStores()
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
                    (if (objectPermissionId.asKnown() == null) 0 else 1) +
                        (agentAccessGroups.asKnown()?.size ?: 0) +
                        (agents.asKnown()?.size ?: 0) +
                        (mcpAccessGroups.asKnown()?.size ?: 0) +
                        (mcpServers.asKnown()?.size ?: 0) +
                        (mcpToolPermissions.asKnown()?.validity() ?: 0) +
                        (vectorStores.asKnown()?.size ?: 0)

                class McpToolPermissions
                @JsonCreator
                private constructor(
                    @com.fasterxml.jackson.annotation.JsonValue
                    private val additionalProperties: Map<String, JsonValue>
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [McpToolPermissions].
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [McpToolPermissions]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(mcpToolPermissions: McpToolPermissions) = apply {
                            additionalProperties =
                                mcpToolPermissions.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [McpToolPermissions].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): McpToolPermissions =
                            McpToolPermissions(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): McpToolPermissions = apply {
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
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    internal fun validity(): Int =
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is McpToolPermissions &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "McpToolPermissions{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ObjectPermission &&
                        objectPermissionId == other.objectPermissionId &&
                        agentAccessGroups == other.agentAccessGroups &&
                        agents == other.agents &&
                        mcpAccessGroups == other.mcpAccessGroups &&
                        mcpServers == other.mcpServers &&
                        mcpToolPermissions == other.mcpToolPermissions &&
                        vectorStores == other.vectorStores &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        objectPermissionId,
                        agentAccessGroups,
                        agents,
                        mcpAccessGroups,
                        mcpServers,
                        mcpToolPermissions,
                        vectorStores,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ObjectPermission{objectPermissionId=$objectPermissionId, agentAccessGroups=$agentAccessGroups, agents=$agents, mcpAccessGroups=$mcpAccessGroups, mcpServers=$mcpServers, mcpToolPermissions=$mcpToolPermissions, vectorStores=$vectorStores, additionalProperties=$additionalProperties}"
            }

            class Permissions
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Permissions]. */
                    fun builder() = Builder()
                }

                /** A builder for [Permissions]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(permissions: Permissions) = apply {
                        additionalProperties = permissions.additionalProperties.toMutableMap()
                    }

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
                     * Returns an immutable instance of [Permissions].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Permissions = Permissions(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Permissions = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Permissions &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Permissions{additionalProperties=$additionalProperties}"
            }

            class RouterSettings
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [RouterSettings].
                     */
                    fun builder() = Builder()
                }

                /** A builder for [RouterSettings]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(routerSettings: RouterSettings) = apply {
                        additionalProperties = routerSettings.additionalProperties.toMutableMap()
                    }

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
                     * Returns an immutable instance of [RouterSettings].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): RouterSettings = RouterSettings(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): RouterSettings = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RouterSettings &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RouterSettings{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LiteLlmDeletedVerificationToken &&
                    id == other.id &&
                    token == other.token &&
                    aliases == other.aliases &&
                    allowedCacheControls == other.allowedCacheControls &&
                    allowedRoutes == other.allowedRoutes &&
                    autoRotate == other.autoRotate &&
                    blocked == other.blocked &&
                    budgetDuration == other.budgetDuration &&
                    budgetResetAt == other.budgetResetAt &&
                    config == other.config &&
                    createdAt == other.createdAt &&
                    createdBy == other.createdBy &&
                    deletedAt == other.deletedAt &&
                    deletedBy == other.deletedBy &&
                    deletedByApiKey == other.deletedByApiKey &&
                    expires == other.expires &&
                    keyAlias == other.keyAlias &&
                    keyName == other.keyName &&
                    keyRotationAt == other.keyRotationAt &&
                    lastRotationAt == other.lastRotationAt &&
                    litellmBudgetTable == other.litellmBudgetTable &&
                    litellmChangedBy == other.litellmChangedBy &&
                    maxBudget == other.maxBudget &&
                    maxParallelRequests == other.maxParallelRequests &&
                    metadata == other.metadata &&
                    modelMaxBudget == other.modelMaxBudget &&
                    modelSpend == other.modelSpend &&
                    models == other.models &&
                    objectPermission == other.objectPermission &&
                    objectPermissionId == other.objectPermissionId &&
                    orgId == other.orgId &&
                    permissions == other.permissions &&
                    rotationCount == other.rotationCount &&
                    rotationInterval == other.rotationInterval &&
                    routerSettings == other.routerSettings &&
                    rpmLimit == other.rpmLimit &&
                    softBudgetCooldown == other.softBudgetCooldown &&
                    spend == other.spend &&
                    teamId == other.teamId &&
                    tpmLimit == other.tpmLimit &&
                    updatedAt == other.updatedAt &&
                    updatedBy == other.updatedBy &&
                    userId == other.userId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    token,
                    aliases,
                    allowedCacheControls,
                    allowedRoutes,
                    autoRotate,
                    blocked,
                    budgetDuration,
                    budgetResetAt,
                    config,
                    createdAt,
                    createdBy,
                    deletedAt,
                    deletedBy,
                    deletedByApiKey,
                    expires,
                    keyAlias,
                    keyName,
                    keyRotationAt,
                    lastRotationAt,
                    litellmBudgetTable,
                    litellmChangedBy,
                    maxBudget,
                    maxParallelRequests,
                    metadata,
                    modelMaxBudget,
                    modelSpend,
                    models,
                    objectPermission,
                    objectPermissionId,
                    orgId,
                    permissions,
                    rotationCount,
                    rotationInterval,
                    routerSettings,
                    rpmLimit,
                    softBudgetCooldown,
                    spend,
                    teamId,
                    tpmLimit,
                    updatedAt,
                    updatedBy,
                    userId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LiteLlmDeletedVerificationToken{id=$id, token=$token, aliases=$aliases, allowedCacheControls=$allowedCacheControls, allowedRoutes=$allowedRoutes, autoRotate=$autoRotate, blocked=$blocked, budgetDuration=$budgetDuration, budgetResetAt=$budgetResetAt, config=$config, createdAt=$createdAt, createdBy=$createdBy, deletedAt=$deletedAt, deletedBy=$deletedBy, deletedByApiKey=$deletedByApiKey, expires=$expires, keyAlias=$keyAlias, keyName=$keyName, keyRotationAt=$keyRotationAt, lastRotationAt=$lastRotationAt, litellmBudgetTable=$litellmBudgetTable, litellmChangedBy=$litellmChangedBy, maxBudget=$maxBudget, maxParallelRequests=$maxParallelRequests, metadata=$metadata, modelMaxBudget=$modelMaxBudget, modelSpend=$modelSpend, models=$models, objectPermission=$objectPermission, objectPermissionId=$objectPermissionId, orgId=$orgId, permissions=$permissions, rotationCount=$rotationCount, rotationInterval=$rotationInterval, routerSettings=$routerSettings, rpmLimit=$rpmLimit, softBudgetCooldown=$softBudgetCooldown, spend=$spend, teamId=$teamId, tpmLimit=$tpmLimit, updatedAt=$updatedAt, updatedBy=$updatedBy, userId=$userId, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is KeyListResponse &&
            currentPage == other.currentPage &&
            keys == other.keys &&
            totalCount == other.totalCount &&
            totalPages == other.totalPages &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(currentPage, keys, totalCount, totalPages, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "KeyListResponse{currentPage=$currentPage, keys=$keys, totalCount=$totalCount, totalPages=$totalPages, additionalProperties=$additionalProperties}"
}
