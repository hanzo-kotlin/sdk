// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team

import ai.hanzo.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TeamCreateResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
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
                .llmModelTable(
                    TeamCreateResponse.LlmModelTable.builder()
                        .createdBy("created_by")
                        .updatedBy("updated_by")
                        .modelAliases(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
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
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .modelId(0L)
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .organizationId("organization_id")
                .rpmLimit(0L)
                .spend(0.0)
                .teamAlias("team_alias")
                .tpmLimit(0L)
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
        assertThat(teamCreateResponse.llmModelTable())
            .isEqualTo(
                TeamCreateResponse.LlmModelTable.builder()
                    .createdBy("created_by")
                    .updatedBy("updated_by")
                    .modelAliases(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
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
        assertThat(teamCreateResponse._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(teamCreateResponse.modelId()).isEqualTo(0L)
        assertThat(teamCreateResponse.models())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(teamCreateResponse.organizationId()).isEqualTo("organization_id")
        assertThat(teamCreateResponse.rpmLimit()).isEqualTo(0L)
        assertThat(teamCreateResponse.spend()).isEqualTo(0.0)
        assertThat(teamCreateResponse.teamAlias()).isEqualTo("team_alias")
        assertThat(teamCreateResponse.tpmLimit()).isEqualTo(0L)
    }
}
