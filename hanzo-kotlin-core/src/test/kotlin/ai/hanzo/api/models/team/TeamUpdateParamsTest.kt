// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamUpdateParamsTest {

    @Test
    fun create() {
        TeamUpdateParams.builder()
            .litellmChangedBy("litellm-changed-by")
            .teamId("team_id")
            .addAllowedPassthroughRoute(JsonValue.from(mapOf<String, Any>()))
            .addAllowedVectorStoreIndex(
                TeamUpdateParams.AllowedVectorStoreIndex.builder()
                    .indexName("index_name")
                    .addIndexPermission(
                        TeamUpdateParams.AllowedVectorStoreIndex.IndexPermission.READ
                    )
                    .build()
            )
            .blocked(true)
            .budgetDuration("budget_duration")
            .addGuardrail("string")
            .maxBudget(0.0)
            .metadata(
                TeamUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .modelAliases(
                TeamUpdateParams.ModelAliases.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .modelRpmLimit(
                TeamUpdateParams.ModelRpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
            .modelTpmLimit(
                TeamUpdateParams.ModelTpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
            .addModel(JsonValue.from(mapOf<String, Any>()))
            .objectPermission(
                TeamUpdateParams.ObjectPermission.builder()
                    .addAgentAccessGroup("string")
                    .addAgent("string")
                    .addMcpAccessGroup("string")
                    .addMcpServer("string")
                    .mcpToolPermissions(
                        TeamUpdateParams.ObjectPermission.McpToolPermissions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .addVectorStore("string")
                    .build()
            )
            .organizationId("organization_id")
            .addPrompt("string")
            .routerSettings(
                TeamUpdateParams.RouterSettings.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .rpmLimit(0L)
            .secretManagerSettings(
                TeamUpdateParams.SecretManagerSettings.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .addTag(JsonValue.from(mapOf<String, Any>()))
            .teamAlias("team_alias")
            .teamMemberBudget(0.0)
            .teamMemberBudgetDuration("team_member_budget_duration")
            .teamMemberKeyDuration("team_member_key_duration")
            .teamMemberRpmLimit(0L)
            .teamMemberTpmLimit(0L)
            .tpmLimit(0L)
            .build()
    }

    @Test
    fun headers() {
        val params =
            TeamUpdateParams.builder()
                .litellmChangedBy("litellm-changed-by")
                .teamId("team_id")
                .addAllowedPassthroughRoute(JsonValue.from(mapOf<String, Any>()))
                .addAllowedVectorStoreIndex(
                    TeamUpdateParams.AllowedVectorStoreIndex.builder()
                        .indexName("index_name")
                        .addIndexPermission(
                            TeamUpdateParams.AllowedVectorStoreIndex.IndexPermission.READ
                        )
                        .build()
                )
                .blocked(true)
                .budgetDuration("budget_duration")
                .addGuardrail("string")
                .maxBudget(0.0)
                .metadata(
                    TeamUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelAliases(
                    TeamUpdateParams.ModelAliases.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelRpmLimit(
                    TeamUpdateParams.ModelRpmLimit.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .modelTpmLimit(
                    TeamUpdateParams.ModelTpmLimit.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .objectPermission(
                    TeamUpdateParams.ObjectPermission.builder()
                        .addAgentAccessGroup("string")
                        .addAgent("string")
                        .addMcpAccessGroup("string")
                        .addMcpServer("string")
                        .mcpToolPermissions(
                            TeamUpdateParams.ObjectPermission.McpToolPermissions.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addVectorStore("string")
                        .build()
                )
                .organizationId("organization_id")
                .addPrompt("string")
                .routerSettings(
                    TeamUpdateParams.RouterSettings.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .rpmLimit(0L)
                .secretManagerSettings(
                    TeamUpdateParams.SecretManagerSettings.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addTag(JsonValue.from(mapOf<String, Any>()))
                .teamAlias("team_alias")
                .teamMemberBudget(0.0)
                .teamMemberBudgetDuration("team_member_budget_duration")
                .teamMemberKeyDuration("team_member_key_duration")
                .teamMemberRpmLimit(0L)
                .teamMemberTpmLimit(0L)
                .tpmLimit(0L)
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("litellm-changed-by", "litellm-changed-by").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = TeamUpdateParams.builder().teamId("team_id").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            TeamUpdateParams.builder()
                .litellmChangedBy("litellm-changed-by")
                .teamId("team_id")
                .addAllowedPassthroughRoute(JsonValue.from(mapOf<String, Any>()))
                .addAllowedVectorStoreIndex(
                    TeamUpdateParams.AllowedVectorStoreIndex.builder()
                        .indexName("index_name")
                        .addIndexPermission(
                            TeamUpdateParams.AllowedVectorStoreIndex.IndexPermission.READ
                        )
                        .build()
                )
                .blocked(true)
                .budgetDuration("budget_duration")
                .addGuardrail("string")
                .maxBudget(0.0)
                .metadata(
                    TeamUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelAliases(
                    TeamUpdateParams.ModelAliases.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelRpmLimit(
                    TeamUpdateParams.ModelRpmLimit.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .modelTpmLimit(
                    TeamUpdateParams.ModelTpmLimit.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .objectPermission(
                    TeamUpdateParams.ObjectPermission.builder()
                        .addAgentAccessGroup("string")
                        .addAgent("string")
                        .addMcpAccessGroup("string")
                        .addMcpServer("string")
                        .mcpToolPermissions(
                            TeamUpdateParams.ObjectPermission.McpToolPermissions.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addVectorStore("string")
                        .build()
                )
                .organizationId("organization_id")
                .addPrompt("string")
                .routerSettings(
                    TeamUpdateParams.RouterSettings.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .rpmLimit(0L)
                .secretManagerSettings(
                    TeamUpdateParams.SecretManagerSettings.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addTag(JsonValue.from(mapOf<String, Any>()))
                .teamAlias("team_alias")
                .teamMemberBudget(0.0)
                .teamMemberBudgetDuration("team_member_budget_duration")
                .teamMemberKeyDuration("team_member_key_duration")
                .teamMemberRpmLimit(0L)
                .teamMemberTpmLimit(0L)
                .tpmLimit(0L)
                .build()

        val body = params._body()

        assertThat(body.teamId()).isEqualTo("team_id")
        assertThat(body.allowedPassthroughRoutes())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.allowedVectorStoreIndexes())
            .containsExactly(
                TeamUpdateParams.AllowedVectorStoreIndex.builder()
                    .indexName("index_name")
                    .addIndexPermission(
                        TeamUpdateParams.AllowedVectorStoreIndex.IndexPermission.READ
                    )
                    .build()
            )
        assertThat(body.blocked()).isEqualTo(true)
        assertThat(body.budgetDuration()).isEqualTo("budget_duration")
        assertThat(body.guardrails()).containsExactly("string")
        assertThat(body.maxBudget()).isEqualTo(0.0)
        assertThat(body.metadata())
            .isEqualTo(
                TeamUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.modelAliases())
            .isEqualTo(
                TeamUpdateParams.ModelAliases.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.modelRpmLimit())
            .isEqualTo(
                TeamUpdateParams.ModelRpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(body.modelTpmLimit())
            .isEqualTo(
                TeamUpdateParams.ModelTpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(body.models()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.objectPermission())
            .isEqualTo(
                TeamUpdateParams.ObjectPermission.builder()
                    .addAgentAccessGroup("string")
                    .addAgent("string")
                    .addMcpAccessGroup("string")
                    .addMcpServer("string")
                    .mcpToolPermissions(
                        TeamUpdateParams.ObjectPermission.McpToolPermissions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .addVectorStore("string")
                    .build()
            )
        assertThat(body.organizationId()).isEqualTo("organization_id")
        assertThat(body.prompts()).containsExactly("string")
        assertThat(body.routerSettings())
            .isEqualTo(
                TeamUpdateParams.RouterSettings.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.rpmLimit()).isEqualTo(0L)
        assertThat(body.secretManagerSettings())
            .isEqualTo(
                TeamUpdateParams.SecretManagerSettings.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.tags()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.teamAlias()).isEqualTo("team_alias")
        assertThat(body.teamMemberBudget()).isEqualTo(0.0)
        assertThat(body.teamMemberBudgetDuration()).isEqualTo("team_member_budget_duration")
        assertThat(body.teamMemberKeyDuration()).isEqualTo("team_member_key_duration")
        assertThat(body.teamMemberRpmLimit()).isEqualTo(0L)
        assertThat(body.teamMemberTpmLimit()).isEqualTo(0L)
        assertThat(body.tpmLimit()).isEqualTo(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TeamUpdateParams.builder().teamId("team_id").build()

        val body = params._body()

        assertThat(body.teamId()).isEqualTo("team_id")
    }
}
