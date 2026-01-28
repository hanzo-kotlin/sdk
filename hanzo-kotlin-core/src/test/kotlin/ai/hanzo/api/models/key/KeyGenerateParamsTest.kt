// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KeyGenerateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun headers() {
        val params =
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

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("litellm-changed-by", "litellm-changed-by").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = KeyGenerateParams.builder().build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.aliases())
            .isEqualTo(
                KeyGenerateParams.Aliases.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.allowedCacheControls())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.allowedPassthroughRoutes())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.allowedRoutes()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.allowedVectorStoreIndexes())
            .containsExactly(
                KeyGenerateParams.AllowedVectorStoreIndex.builder()
                    .indexName("index_name")
                    .addIndexPermission(
                        KeyGenerateParams.AllowedVectorStoreIndex.IndexPermission.READ
                    )
                    .build()
            )
        assertThat(body.autoRotate()).isEqualTo(true)
        assertThat(body.blocked()).isEqualTo(true)
        assertThat(body.budgetDuration()).isEqualTo("budget_duration")
        assertThat(body.budgetId()).isEqualTo("budget_id")
        assertThat(body.config())
            .isEqualTo(
                KeyGenerateParams.Config.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.duration()).isEqualTo("duration")
        assertThat(body.enforcedParams()).containsExactly("string")
        assertThat(body.guardrails()).containsExactly("string")
        assertThat(body.key()).isEqualTo("key")
        assertThat(body.keyAlias()).isEqualTo("key_alias")
        assertThat(body.keyType()).isEqualTo(KeyGenerateParams.KeyType.LLM_API)
        assertThat(body.maxBudget()).isEqualTo(0.0)
        assertThat(body.maxParallelRequests()).isEqualTo(0L)
        assertThat(body.metadata())
            .isEqualTo(
                KeyGenerateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.modelMaxBudget())
            .isEqualTo(
                KeyGenerateParams.ModelMaxBudget.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.modelRpmLimit())
            .isEqualTo(
                KeyGenerateParams.ModelRpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.modelTpmLimit())
            .isEqualTo(
                KeyGenerateParams.ModelTpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.models()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.objectPermission())
            .isEqualTo(
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
        assertThat(body.organizationId()).isEqualTo("organization_id")
        assertThat(body.permissions())
            .isEqualTo(
                KeyGenerateParams.Permissions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.prompts()).containsExactly("string")
        assertThat(body.rotationInterval()).isEqualTo("rotation_interval")
        assertThat(body.routerSettings())
            .isEqualTo(
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
        assertThat(body.rpmLimit()).isEqualTo(0L)
        assertThat(body.rpmLimitType())
            .isEqualTo(KeyGenerateParams.RpmLimitType.GUARANTEED_THROUGHPUT)
        assertThat(body.sendInviteEmail()).isEqualTo(true)
        assertThat(body.softBudget()).isEqualTo(0.0)
        assertThat(body.spend()).isEqualTo(0.0)
        assertThat(body.tags()).containsExactly("string")
        assertThat(body.teamId()).isEqualTo("team_id")
        assertThat(body.tpmLimit()).isEqualTo(0L)
        assertThat(body.tpmLimitType())
            .isEqualTo(KeyGenerateParams.TpmLimitType.GUARANTEED_THROUGHPUT)
        assertThat(body.userId()).isEqualTo("user_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = KeyGenerateParams.builder().build()

        val body = params._body()
    }
}
