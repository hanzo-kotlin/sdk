// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamCreateResponseTest {

    @Test
    fun create() {
        val teamCreateResponse =
            TeamCreateResponse.builder()
                .teamId("team_id")
                .addAdmin(JsonValue.from(mapOf<String, Any>()))
                .blocked(true)
                .budgetDuration("budget_duration")
                .budgetResetAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .litellmModelTable(JsonValue.from(mapOf<String, Any>()))
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .addMember(JsonValue.from(mapOf<String, Any>()))
                .addMembersWithRole(
                    Member.builder()
                        .role(Member.Role.ADMIN)
                        .userEmail("user_email")
                        .userId("user_id")
                        .build()
                )
                .metadata(
                    TeamCreateResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelId(0L)
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .objectPermission(
                    TeamCreateResponse.ObjectPermission.builder()
                        .objectPermissionId("object_permission_id")
                        .addAgentAccessGroup("string")
                        .addAgent("string")
                        .addMcpAccessGroup("string")
                        .addMcpServer("string")
                        .mcpToolPermissions(
                            TeamCreateResponse.ObjectPermission.McpToolPermissions.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addVectorStore("string")
                        .build()
                )
                .objectPermissionId("object_permission_id")
                .organizationId("organization_id")
                .routerSettings(
                    TeamCreateResponse.RouterSettings.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .rpmLimit(0L)
                .spend(0.0)
                .teamAlias("team_alias")
                .addTeamMemberPermission("string")
                .tpmLimit(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(teamCreateResponse.teamId()).isEqualTo("team_id")
        assertThat(teamCreateResponse.admins())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(teamCreateResponse.blocked()).isEqualTo(true)
        assertThat(teamCreateResponse.budgetDuration()).isEqualTo("budget_duration")
        assertThat(teamCreateResponse.budgetResetAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(teamCreateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(teamCreateResponse._litellmModelTable())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(teamCreateResponse.maxBudget()).isEqualTo(0.0)
        assertThat(teamCreateResponse.maxParallelRequests()).isEqualTo(0L)
        assertThat(teamCreateResponse.members())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(teamCreateResponse.membersWithRoles())
            .containsExactly(
                Member.builder()
                    .role(Member.Role.ADMIN)
                    .userEmail("user_email")
                    .userId("user_id")
                    .build()
            )
        assertThat(teamCreateResponse.metadata())
            .isEqualTo(
                TeamCreateResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(teamCreateResponse.modelId()).isEqualTo(0L)
        assertThat(teamCreateResponse.models())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(teamCreateResponse.objectPermission())
            .isEqualTo(
                TeamCreateResponse.ObjectPermission.builder()
                    .objectPermissionId("object_permission_id")
                    .addAgentAccessGroup("string")
                    .addAgent("string")
                    .addMcpAccessGroup("string")
                    .addMcpServer("string")
                    .mcpToolPermissions(
                        TeamCreateResponse.ObjectPermission.McpToolPermissions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .addVectorStore("string")
                    .build()
            )
        assertThat(teamCreateResponse.objectPermissionId()).isEqualTo("object_permission_id")
        assertThat(teamCreateResponse.organizationId()).isEqualTo("organization_id")
        assertThat(teamCreateResponse.routerSettings())
            .isEqualTo(
                TeamCreateResponse.RouterSettings.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(teamCreateResponse.rpmLimit()).isEqualTo(0L)
        assertThat(teamCreateResponse.spend()).isEqualTo(0.0)
        assertThat(teamCreateResponse.teamAlias()).isEqualTo("team_alias")
        assertThat(teamCreateResponse.teamMemberPermissions()).containsExactly("string")
        assertThat(teamCreateResponse.tpmLimit()).isEqualTo(0L)
        assertThat(teamCreateResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val teamCreateResponse =
            TeamCreateResponse.builder()
                .teamId("team_id")
                .addAdmin(JsonValue.from(mapOf<String, Any>()))
                .blocked(true)
                .budgetDuration("budget_duration")
                .budgetResetAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .litellmModelTable(JsonValue.from(mapOf<String, Any>()))
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .addMember(JsonValue.from(mapOf<String, Any>()))
                .addMembersWithRole(
                    Member.builder()
                        .role(Member.Role.ADMIN)
                        .userEmail("user_email")
                        .userId("user_id")
                        .build()
                )
                .metadata(
                    TeamCreateResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelId(0L)
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .objectPermission(
                    TeamCreateResponse.ObjectPermission.builder()
                        .objectPermissionId("object_permission_id")
                        .addAgentAccessGroup("string")
                        .addAgent("string")
                        .addMcpAccessGroup("string")
                        .addMcpServer("string")
                        .mcpToolPermissions(
                            TeamCreateResponse.ObjectPermission.McpToolPermissions.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addVectorStore("string")
                        .build()
                )
                .objectPermissionId("object_permission_id")
                .organizationId("organization_id")
                .routerSettings(
                    TeamCreateResponse.RouterSettings.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .rpmLimit(0L)
                .spend(0.0)
                .teamAlias("team_alias")
                .addTeamMemberPermission("string")
                .tpmLimit(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedTeamCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamCreateResponse),
                jacksonTypeRef<TeamCreateResponse>(),
            )

        assertThat(roundtrippedTeamCreateResponse).isEqualTo(teamCreateResponse)
    }
}
