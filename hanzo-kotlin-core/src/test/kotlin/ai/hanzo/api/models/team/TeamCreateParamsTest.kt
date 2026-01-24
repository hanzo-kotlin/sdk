// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamCreateParamsTest {

    @Test
    fun create() {
        TeamCreateParams.builder()
            .litellmChangedBy("litellm-changed-by")
            .addAdmin(JsonValue.from(mapOf<String, Any>()))
            .addAllowedPassthroughRoute(JsonValue.from(mapOf<String, Any>()))
            .addAllowedVectorStoreIndex(
                TeamCreateParams.AllowedVectorStoreIndex.builder()
                    .indexName("index_name")
                    .addIndexPermission(
                        TeamCreateParams.AllowedVectorStoreIndex.IndexPermission.READ
                    )
                    .build()
            )
            .blocked(true)
            .budgetDuration("budget_duration")
            .addGuardrail("string")
            .maxBudget(0.0)
            .addMember(JsonValue.from(mapOf<String, Any>()))
            .addMembersWithRole(
                Member.builder()
                    .role(Member.Role.ADMIN)
                    .userEmail("user_email")
                    .userId("user_id")
                    .build()
            )
            .metadata(
                TeamCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .modelAliases(
                TeamCreateParams.ModelAliases.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .modelRpmLimit(
                TeamCreateParams.ModelRpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
            .modelTpmLimit(
                TeamCreateParams.ModelTpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
            .addModel(JsonValue.from(mapOf<String, Any>()))
            .objectPermission(
                TeamCreateParams.ObjectPermission.builder()
                    .addAgentAccessGroup("string")
                    .addAgent("string")
                    .addMcpAccessGroup("string")
                    .addMcpServer("string")
                    .mcpToolPermissions(
                        TeamCreateParams.ObjectPermission.McpToolPermissions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .addVectorStore("string")
                    .build()
            )
            .organizationId("organization_id")
            .addPrompt("string")
            .routerSettings(
                TeamCreateParams.RouterSettings.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .rpmLimit(0L)
            .rpmLimitType(TeamCreateParams.RpmLimitType.GUARANTEED_THROUGHPUT)
            .secretManagerSettings(
                TeamCreateParams.SecretManagerSettings.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .addTag(JsonValue.from(mapOf<String, Any>()))
            .teamAlias("team_alias")
            .teamId("team_id")
            .teamMemberBudget(0.0)
            .teamMemberKeyDuration("team_member_key_duration")
            .addTeamMemberPermission("string")
            .teamMemberRpmLimit(0L)
            .teamMemberTpmLimit(0L)
            .tpmLimit(0L)
            .tpmLimitType(TeamCreateParams.TpmLimitType.GUARANTEED_THROUGHPUT)
            .build()
    }

    @Test
    fun headers() {
        val params =
            TeamCreateParams.builder()
                .litellmChangedBy("litellm-changed-by")
                .addAdmin(JsonValue.from(mapOf<String, Any>()))
                .addAllowedPassthroughRoute(JsonValue.from(mapOf<String, Any>()))
                .addAllowedVectorStoreIndex(
                    TeamCreateParams.AllowedVectorStoreIndex.builder()
                        .indexName("index_name")
                        .addIndexPermission(
                            TeamCreateParams.AllowedVectorStoreIndex.IndexPermission.READ
                        )
                        .build()
                )
                .blocked(true)
                .budgetDuration("budget_duration")
                .addGuardrail("string")
                .maxBudget(0.0)
                .addMember(JsonValue.from(mapOf<String, Any>()))
                .addMembersWithRole(
                    Member.builder()
                        .role(Member.Role.ADMIN)
                        .userEmail("user_email")
                        .userId("user_id")
                        .build()
                )
                .metadata(
                    TeamCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelAliases(
                    TeamCreateParams.ModelAliases.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelRpmLimit(
                    TeamCreateParams.ModelRpmLimit.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .modelTpmLimit(
                    TeamCreateParams.ModelTpmLimit.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .objectPermission(
                    TeamCreateParams.ObjectPermission.builder()
                        .addAgentAccessGroup("string")
                        .addAgent("string")
                        .addMcpAccessGroup("string")
                        .addMcpServer("string")
                        .mcpToolPermissions(
                            TeamCreateParams.ObjectPermission.McpToolPermissions.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addVectorStore("string")
                        .build()
                )
                .organizationId("organization_id")
                .addPrompt("string")
                .routerSettings(
                    TeamCreateParams.RouterSettings.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .rpmLimit(0L)
                .rpmLimitType(TeamCreateParams.RpmLimitType.GUARANTEED_THROUGHPUT)
                .secretManagerSettings(
                    TeamCreateParams.SecretManagerSettings.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addTag(JsonValue.from(mapOf<String, Any>()))
                .teamAlias("team_alias")
                .teamId("team_id")
                .teamMemberBudget(0.0)
                .teamMemberKeyDuration("team_member_key_duration")
                .addTeamMemberPermission("string")
                .teamMemberRpmLimit(0L)
                .teamMemberTpmLimit(0L)
                .tpmLimit(0L)
                .tpmLimitType(TeamCreateParams.TpmLimitType.GUARANTEED_THROUGHPUT)
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("litellm-changed-by", "litellm-changed-by").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = TeamCreateParams.builder().build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            TeamCreateParams.builder()
                .litellmChangedBy("litellm-changed-by")
                .addAdmin(JsonValue.from(mapOf<String, Any>()))
                .addAllowedPassthroughRoute(JsonValue.from(mapOf<String, Any>()))
                .addAllowedVectorStoreIndex(
                    TeamCreateParams.AllowedVectorStoreIndex.builder()
                        .indexName("index_name")
                        .addIndexPermission(
                            TeamCreateParams.AllowedVectorStoreIndex.IndexPermission.READ
                        )
                        .build()
                )
                .blocked(true)
                .budgetDuration("budget_duration")
                .addGuardrail("string")
                .maxBudget(0.0)
                .addMember(JsonValue.from(mapOf<String, Any>()))
                .addMembersWithRole(
                    Member.builder()
                        .role(Member.Role.ADMIN)
                        .userEmail("user_email")
                        .userId("user_id")
                        .build()
                )
                .metadata(
                    TeamCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelAliases(
                    TeamCreateParams.ModelAliases.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelRpmLimit(
                    TeamCreateParams.ModelRpmLimit.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .modelTpmLimit(
                    TeamCreateParams.ModelTpmLimit.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .objectPermission(
                    TeamCreateParams.ObjectPermission.builder()
                        .addAgentAccessGroup("string")
                        .addAgent("string")
                        .addMcpAccessGroup("string")
                        .addMcpServer("string")
                        .mcpToolPermissions(
                            TeamCreateParams.ObjectPermission.McpToolPermissions.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addVectorStore("string")
                        .build()
                )
                .organizationId("organization_id")
                .addPrompt("string")
                .routerSettings(
                    TeamCreateParams.RouterSettings.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .rpmLimit(0L)
                .rpmLimitType(TeamCreateParams.RpmLimitType.GUARANTEED_THROUGHPUT)
                .secretManagerSettings(
                    TeamCreateParams.SecretManagerSettings.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addTag(JsonValue.from(mapOf<String, Any>()))
                .teamAlias("team_alias")
                .teamId("team_id")
                .teamMemberBudget(0.0)
                .teamMemberKeyDuration("team_member_key_duration")
                .addTeamMemberPermission("string")
                .teamMemberRpmLimit(0L)
                .teamMemberTpmLimit(0L)
                .tpmLimit(0L)
                .tpmLimitType(TeamCreateParams.TpmLimitType.GUARANTEED_THROUGHPUT)
                .build()

        val body = params._body()

        assertThat(body.admins()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.allowedPassthroughRoutes())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.allowedVectorStoreIndexes())
            .containsExactly(
                TeamCreateParams.AllowedVectorStoreIndex.builder()
                    .indexName("index_name")
                    .addIndexPermission(
                        TeamCreateParams.AllowedVectorStoreIndex.IndexPermission.READ
                    )
                    .build()
            )
        assertThat(body.blocked()).isEqualTo(true)
        assertThat(body.budgetDuration()).isEqualTo("budget_duration")
        assertThat(body.guardrails()).containsExactly("string")
        assertThat(body.maxBudget()).isEqualTo(0.0)
        assertThat(body.members()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.membersWithRoles())
            .containsExactly(
                Member.builder()
                    .role(Member.Role.ADMIN)
                    .userEmail("user_email")
                    .userId("user_id")
                    .build()
            )
        assertThat(body.metadata())
            .isEqualTo(
                TeamCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.modelAliases())
            .isEqualTo(
                TeamCreateParams.ModelAliases.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.modelRpmLimit())
            .isEqualTo(
                TeamCreateParams.ModelRpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(body.modelTpmLimit())
            .isEqualTo(
                TeamCreateParams.ModelTpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(body.models()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.objectPermission())
            .isEqualTo(
                TeamCreateParams.ObjectPermission.builder()
                    .addAgentAccessGroup("string")
                    .addAgent("string")
                    .addMcpAccessGroup("string")
                    .addMcpServer("string")
                    .mcpToolPermissions(
                        TeamCreateParams.ObjectPermission.McpToolPermissions.builder()
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
                TeamCreateParams.RouterSettings.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.rpmLimit()).isEqualTo(0L)
        assertThat(body.rpmLimitType())
            .isEqualTo(TeamCreateParams.RpmLimitType.GUARANTEED_THROUGHPUT)
        assertThat(body.secretManagerSettings())
            .isEqualTo(
                TeamCreateParams.SecretManagerSettings.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.tags()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.teamAlias()).isEqualTo("team_alias")
        assertThat(body.teamId()).isEqualTo("team_id")
        assertThat(body.teamMemberBudget()).isEqualTo(0.0)
        assertThat(body.teamMemberKeyDuration()).isEqualTo("team_member_key_duration")
        assertThat(body.teamMemberPermissions()).containsExactly("string")
        assertThat(body.teamMemberRpmLimit()).isEqualTo(0L)
        assertThat(body.teamMemberTpmLimit()).isEqualTo(0L)
        assertThat(body.tpmLimit()).isEqualTo(0L)
        assertThat(body.tpmLimitType())
            .isEqualTo(TeamCreateParams.TpmLimitType.GUARANTEED_THROUGHPUT)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TeamCreateParams.builder().build()

        val body = params._body()
    }
}
