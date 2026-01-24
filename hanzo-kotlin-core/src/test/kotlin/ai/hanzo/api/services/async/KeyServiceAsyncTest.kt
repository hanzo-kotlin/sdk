// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.models.key.BlockKeyRequest
import ai.hanzo.api.models.key.KeyBlockParams
import ai.hanzo.api.models.key.KeyDeleteParams
import ai.hanzo.api.models.key.KeyGenerateParams
import ai.hanzo.api.models.key.KeyListParams
import ai.hanzo.api.models.key.KeyRegenerateByKeyParams
import ai.hanzo.api.models.key.KeyRetrieveInfoParams
import ai.hanzo.api.models.key.KeyUnblockParams
import ai.hanzo.api.models.key.KeyUpdateParams
import ai.hanzo.api.models.key.regenerate.RegenerateKeyRequest
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class KeyServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val keyServiceAsync = client.key()

        val key =
            keyServiceAsync.update(
                KeyUpdateParams.builder()
                    .litellmChangedBy("litellm-changed-by")
                    .key("key")
                    .aliases(
                        KeyUpdateParams.Aliases.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                    .addAllowedPassthroughRoute(JsonValue.from(mapOf<String, Any>()))
                    .addAllowedRoute(JsonValue.from(mapOf<String, Any>()))
                    .addAllowedVectorStoreIndex(
                        KeyUpdateParams.AllowedVectorStoreIndex.builder()
                            .indexName("index_name")
                            .addIndexPermission(
                                KeyUpdateParams.AllowedVectorStoreIndex.IndexPermission.READ
                            )
                            .build()
                    )
                    .autoRotate(true)
                    .blocked(true)
                    .budgetDuration("budget_duration")
                    .budgetId("budget_id")
                    .config(
                        KeyUpdateParams.Config.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .duration("duration")
                    .addEnforcedParam("string")
                    .addGuardrail("string")
                    .keyAlias("key_alias")
                    .maxBudget(0.0)
                    .maxParallelRequests(0L)
                    .metadata(
                        KeyUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .modelMaxBudget(
                        KeyUpdateParams.ModelMaxBudget.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .modelRpmLimit(
                        KeyUpdateParams.ModelRpmLimit.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .modelTpmLimit(
                        KeyUpdateParams.ModelTpmLimit.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .addModel(JsonValue.from(mapOf<String, Any>()))
                    .objectPermission(
                        KeyUpdateParams.ObjectPermission.builder()
                            .addAgentAccessGroup("string")
                            .addAgent("string")
                            .addMcpAccessGroup("string")
                            .addMcpServer("string")
                            .mcpToolPermissions(
                                KeyUpdateParams.ObjectPermission.McpToolPermissions.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                    .build()
                            )
                            .addVectorStore("string")
                            .build()
                    )
                    .permissions(
                        KeyUpdateParams.Permissions.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .addPrompt("string")
                    .rotationInterval("rotation_interval")
                    .routerSettings(
                        KeyUpdateParams.RouterSettings.builder()
                            .allowedFails(0L)
                            .addContextWindowFallback(
                                KeyUpdateParams.RouterSettings.ContextWindowFallback.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .cooldownTime(0.0)
                            .addFallback(
                                KeyUpdateParams.RouterSettings.Fallback.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .maxRetries(0L)
                            .modelGroupAlias(
                                KeyUpdateParams.RouterSettings.ModelGroupAlias.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .modelGroupRetryPolicy(
                                KeyUpdateParams.RouterSettings.ModelGroupRetryPolicy.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .numRetries(0L)
                            .retryAfter(0.0)
                            .routingStrategy("routing_strategy")
                            .routingStrategyArgs(
                                KeyUpdateParams.RouterSettings.RoutingStrategyArgs.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .timeout(0.0)
                            .build()
                    )
                    .rpmLimit(0L)
                    .rpmLimitType(KeyUpdateParams.RpmLimitType.GUARANTEED_THROUGHPUT)
                    .spend(0.0)
                    .addTag("string")
                    .teamId("team_id")
                    .tempBudgetExpiry(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .tempBudgetIncrease(0.0)
                    .tpmLimit(0L)
                    .tpmLimitType(KeyUpdateParams.TpmLimitType.GUARANTEED_THROUGHPUT)
                    .userId("user_id")
                    .build()
            )

        key.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val keyServiceAsync = client.key()

        val keys =
            keyServiceAsync.list(
                KeyListParams.builder()
                    .addExpand("string")
                    .includeCreatedByKeys(true)
                    .includeTeamKeys(true)
                    .keyAlias("key_alias")
                    .keyHash("key_hash")
                    .organizationId("organization_id")
                    .page(1L)
                    .returnFullObject(true)
                    .size(1L)
                    .sortBy("sort_by")
                    .sortOrder("sort_order")
                    .status("status")
                    .teamId("team_id")
                    .userId("user_id")
                    .build()
            )

        keys.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val keyServiceAsync = client.key()

        val key =
            keyServiceAsync.delete(
                KeyDeleteParams.builder()
                    .litellmChangedBy("litellm-changed-by")
                    .addKeyAlias("string")
                    .addKey("string")
                    .build()
            )

        key.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun block() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val keyServiceAsync = client.key()

        val response =
            keyServiceAsync.block(
                KeyBlockParams.builder()
                    .litellmChangedBy("litellm-changed-by")
                    .blockKeyRequest(BlockKeyRequest.builder().key("key").build())
                    .build()
            )

        response?.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun checkHealth() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val keyServiceAsync = client.key()

        val response = keyServiceAsync.checkHealth()

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun generate() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val keyServiceAsync = client.key()

        val generateKeyResponse =
            keyServiceAsync.generate(
                KeyGenerateParams.builder()
                    .litellmChangedBy("litellm-changed-by")
                    .aliases(
                        KeyGenerateParams.Aliases.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                    .addAllowedPassthroughRoute(JsonValue.from(mapOf<String, Any>()))
                    .addAllowedRoute(JsonValue.from(mapOf<String, Any>()))
                    .addAllowedVectorStoreIndex(
                        KeyGenerateParams.AllowedVectorStoreIndex.builder()
                            .indexName("index_name")
                            .addIndexPermission(
                                KeyGenerateParams.AllowedVectorStoreIndex.IndexPermission.READ
                            )
                            .build()
                    )
                    .autoRotate(true)
                    .blocked(true)
                    .budgetDuration("budget_duration")
                    .budgetId("budget_id")
                    .config(
                        KeyGenerateParams.Config.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .duration("duration")
                    .addEnforcedParam("string")
                    .addGuardrail("string")
                    .key("key")
                    .keyAlias("key_alias")
                    .keyType(KeyGenerateParams.KeyType.LLM_API)
                    .maxBudget(0.0)
                    .maxParallelRequests(0L)
                    .metadata(
                        KeyGenerateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .modelMaxBudget(
                        KeyGenerateParams.ModelMaxBudget.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .modelRpmLimit(
                        KeyGenerateParams.ModelRpmLimit.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .modelTpmLimit(
                        KeyGenerateParams.ModelTpmLimit.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .addModel(JsonValue.from(mapOf<String, Any>()))
                    .objectPermission(
                        KeyGenerateParams.ObjectPermission.builder()
                            .addAgentAccessGroup("string")
                            .addAgent("string")
                            .addMcpAccessGroup("string")
                            .addMcpServer("string")
                            .mcpToolPermissions(
                                KeyGenerateParams.ObjectPermission.McpToolPermissions.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                    .build()
                            )
                            .addVectorStore("string")
                            .build()
                    )
                    .organizationId("organization_id")
                    .permissions(
                        KeyGenerateParams.Permissions.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .addPrompt("string")
                    .rotationInterval("rotation_interval")
                    .routerSettings(
                        KeyGenerateParams.RouterSettings.builder()
                            .allowedFails(0L)
                            .addContextWindowFallback(
                                KeyGenerateParams.RouterSettings.ContextWindowFallback.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .cooldownTime(0.0)
                            .addFallback(
                                KeyGenerateParams.RouterSettings.Fallback.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .maxRetries(0L)
                            .modelGroupAlias(
                                KeyGenerateParams.RouterSettings.ModelGroupAlias.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .modelGroupRetryPolicy(
                                KeyGenerateParams.RouterSettings.ModelGroupRetryPolicy.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .numRetries(0L)
                            .retryAfter(0.0)
                            .routingStrategy("routing_strategy")
                            .routingStrategyArgs(
                                KeyGenerateParams.RouterSettings.RoutingStrategyArgs.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .timeout(0.0)
                            .build()
                    )
                    .rpmLimit(0L)
                    .rpmLimitType(KeyGenerateParams.RpmLimitType.GUARANTEED_THROUGHPUT)
                    .sendInviteEmail(true)
                    .softBudget(0.0)
                    .spend(0.0)
                    .addTag("string")
                    .teamId("team_id")
                    .tpmLimit(0L)
                    .tpmLimitType(KeyGenerateParams.TpmLimitType.GUARANTEED_THROUGHPUT)
                    .userId("user_id")
                    .build()
            )

        generateKeyResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun regenerateByKey() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val keyServiceAsync = client.key()

        val generateKeyResponse =
            keyServiceAsync.regenerateByKey(
                KeyRegenerateByKeyParams.builder()
                    .pathKey("key")
                    .litellmChangedBy("litellm-changed-by")
                    .regenerateKeyRequest(
                        RegenerateKeyRequest.builder()
                            .aliases(
                                RegenerateKeyRequest.Aliases.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                            .addAllowedPassthroughRoute(JsonValue.from(mapOf<String, Any>()))
                            .addAllowedRoute(JsonValue.from(mapOf<String, Any>()))
                            .addAllowedVectorStoreIndex(
                                RegenerateKeyRequest.AllowedVectorStoreIndex.builder()
                                    .indexName("index_name")
                                    .addIndexPermission(
                                        RegenerateKeyRequest.AllowedVectorStoreIndex.IndexPermission
                                            .READ
                                    )
                                    .build()
                            )
                            .autoRotate(true)
                            .blocked(true)
                            .budgetDuration("budget_duration")
                            .budgetId("budget_id")
                            .config(
                                RegenerateKeyRequest.Config.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .duration("duration")
                            .addEnforcedParam("string")
                            .addGuardrail("string")
                            .key("key")
                            .keyAlias("key_alias")
                            .keyType(RegenerateKeyRequest.KeyType.LLM_API)
                            .maxBudget(0.0)
                            .maxParallelRequests(0L)
                            .metadata(
                                RegenerateKeyRequest.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .modelMaxBudget(
                                RegenerateKeyRequest.ModelMaxBudget.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .modelRpmLimit(
                                RegenerateKeyRequest.ModelRpmLimit.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .modelTpmLimit(
                                RegenerateKeyRequest.ModelTpmLimit.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .addModel(JsonValue.from(mapOf<String, Any>()))
                            .newKey("new_key")
                            .newMasterKey("new_master_key")
                            .objectPermission(
                                RegenerateKeyRequest.ObjectPermission.builder()
                                    .addAgentAccessGroup("string")
                                    .addAgent("string")
                                    .addMcpAccessGroup("string")
                                    .addMcpServer("string")
                                    .mcpToolPermissions(
                                        RegenerateKeyRequest.ObjectPermission.McpToolPermissions
                                            .builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(listOf("string")),
                                            )
                                            .build()
                                    )
                                    .addVectorStore("string")
                                    .build()
                            )
                            .organizationId("organization_id")
                            .permissions(
                                RegenerateKeyRequest.Permissions.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .addPrompt("string")
                            .rotationInterval("rotation_interval")
                            .routerSettings(
                                RegenerateKeyRequest.RouterSettings.builder()
                                    .allowedFails(0L)
                                    .addContextWindowFallback(
                                        RegenerateKeyRequest.RouterSettings.ContextWindowFallback
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .cooldownTime(0.0)
                                    .addFallback(
                                        RegenerateKeyRequest.RouterSettings.Fallback.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .maxRetries(0L)
                                    .modelGroupAlias(
                                        RegenerateKeyRequest.RouterSettings.ModelGroupAlias
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .modelGroupRetryPolicy(
                                        RegenerateKeyRequest.RouterSettings.ModelGroupRetryPolicy
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .numRetries(0L)
                                    .retryAfter(0.0)
                                    .routingStrategy("routing_strategy")
                                    .routingStrategyArgs(
                                        RegenerateKeyRequest.RouterSettings.RoutingStrategyArgs
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .timeout(0.0)
                                    .build()
                            )
                            .rpmLimit(0L)
                            .rpmLimitType(RegenerateKeyRequest.RpmLimitType.GUARANTEED_THROUGHPUT)
                            .sendInviteEmail(true)
                            .softBudget(0.0)
                            .spend(0.0)
                            .addTag("string")
                            .teamId("team_id")
                            .tpmLimit(0L)
                            .tpmLimitType(RegenerateKeyRequest.TpmLimitType.GUARANTEED_THROUGHPUT)
                            .userId("user_id")
                            .build()
                    )
                    .build()
            )

        generateKeyResponse?.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieveInfo() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val keyServiceAsync = client.key()

        val response =
            keyServiceAsync.retrieveInfo(KeyRetrieveInfoParams.builder().key("key").build())

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun unblock() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val keyServiceAsync = client.key()

        val response =
            keyServiceAsync.unblock(
                KeyUnblockParams.builder()
                    .litellmChangedBy("litellm-changed-by")
                    .blockKeyRequest(BlockKeyRequest.builder().key("key").build())
                    .build()
            )

        response.validate()
    }
}
