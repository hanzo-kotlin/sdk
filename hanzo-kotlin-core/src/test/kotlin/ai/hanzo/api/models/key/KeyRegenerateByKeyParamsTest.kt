// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.http.Headers
import ai.hanzo.api.models.key.regenerate.RegenerateKeyRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KeyRegenerateByKeyParamsTest {

    @Test
    fun create() {
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
                                RegenerateKeyRequest.AllowedVectorStoreIndex.IndexPermission.READ
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
                                RegenerateKeyRequest.ObjectPermission.McpToolPermissions.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
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
                                RegenerateKeyRequest.RouterSettings.ContextWindowFallback.builder()
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
                                RegenerateKeyRequest.RouterSettings.ModelGroupAlias.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .modelGroupRetryPolicy(
                                RegenerateKeyRequest.RouterSettings.ModelGroupRetryPolicy.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .numRetries(0L)
                            .retryAfter(0.0)
                            .routingStrategy("routing_strategy")
                            .routingStrategyArgs(
                                RegenerateKeyRequest.RouterSettings.RoutingStrategyArgs.builder()
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
    }

    @Test
    fun pathParams() {
        val params = KeyRegenerateByKeyParams.builder().pathKey("key").build()

        assertThat(params._pathParam(0)).isEqualTo("key")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
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
                                    RegenerateKeyRequest.RouterSettings.ModelGroupAlias.builder()
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

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("litellm-changed-by", "litellm-changed-by").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = KeyRegenerateByKeyParams.builder().pathKey("key").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
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
                                    RegenerateKeyRequest.RouterSettings.ModelGroupAlias.builder()
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
                                RegenerateKeyRequest.AllowedVectorStoreIndex.IndexPermission.READ
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
                                RegenerateKeyRequest.ObjectPermission.McpToolPermissions.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
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
                                RegenerateKeyRequest.RouterSettings.ContextWindowFallback.builder()
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
                                RegenerateKeyRequest.RouterSettings.ModelGroupAlias.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .modelGroupRetryPolicy(
                                RegenerateKeyRequest.RouterSettings.ModelGroupRetryPolicy.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .numRetries(0L)
                            .retryAfter(0.0)
                            .routingStrategy("routing_strategy")
                            .routingStrategyArgs(
                                RegenerateKeyRequest.RouterSettings.RoutingStrategyArgs.builder()
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = KeyRegenerateByKeyParams.builder().pathKey("key").build()

        val body = params._body()
    }
}
