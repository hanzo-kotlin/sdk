// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.models.team.BlockTeamRequest
import ai.hanzo.api.models.team.Member
import ai.hanzo.api.models.team.TeamAddMemberParams
import ai.hanzo.api.models.team.TeamBlockParams
import ai.hanzo.api.models.team.TeamCreateParams
import ai.hanzo.api.models.team.TeamDeleteParams
import ai.hanzo.api.models.team.TeamListAvailableParams
import ai.hanzo.api.models.team.TeamListParams
import ai.hanzo.api.models.team.TeamRemoveMemberParams
import ai.hanzo.api.models.team.TeamRetrieveInfoParams
import ai.hanzo.api.models.team.TeamUnblockParams
import ai.hanzo.api.models.team.TeamUpdateMemberParams
import ai.hanzo.api.models.team.TeamUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TeamServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val teamService = client.team()

        val team =
            teamService.create(
                TeamCreateParams.builder()
                    .llmChangedBy("llm-changed-by")
                    .addAdmin(JsonValue.from(mapOf<String, Any>()))
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
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .modelAliases(JsonValue.from(mapOf<String, Any>()))
                    .addModel(JsonValue.from(mapOf<String, Any>()))
                    .organizationId("organization_id")
                    .rpmLimit(0L)
                    .addTag(JsonValue.from(mapOf<String, Any>()))
                    .teamAlias("team_alias")
                    .teamId("team_id")
                    .tpmLimit(0L)
                    .build()
            )

        team.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val teamService = client.team()

        val team =
            teamService.update(
                TeamUpdateParams.builder()
                    .llmChangedBy("llm-changed-by")
                    .teamId("team_id")
                    .blocked(true)
                    .budgetDuration("budget_duration")
                    .addGuardrail("string")
                    .maxBudget(0.0)
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .modelAliases(JsonValue.from(mapOf<String, Any>()))
                    .addModel(JsonValue.from(mapOf<String, Any>()))
                    .organizationId("organization_id")
                    .rpmLimit(0L)
                    .addTag(JsonValue.from(mapOf<String, Any>()))
                    .teamAlias("team_alias")
                    .tpmLimit(0L)
                    .build()
            )

        team.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val teamService = client.team()

        val teams =
            teamService.list(
                TeamListParams.builder().organizationId("organization_id").userId("user_id").build()
            )

        teams.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val teamService = client.team()

        val team =
            teamService.delete(
                TeamDeleteParams.builder()
                    .llmChangedBy("llm-changed-by")
                    .addTeamId("string")
                    .build()
            )

        team.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun addMember() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val teamService = client.team()

        val response =
            teamService.addMember(
                TeamAddMemberParams.builder()
                    .memberOfMembers(
                        listOf(
                            Member.builder()
                                .role(Member.Role.ADMIN)
                                .userEmail("user_email")
                                .userId("user_id")
                                .build()
                        )
                    )
                    .teamId("team_id")
                    .maxBudgetInTeam(0.0)
                    .build()
            )

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun block() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val teamService = client.team()

        val response =
            teamService.block(
                TeamBlockParams.builder()
                    .blockTeamRequest(BlockTeamRequest.builder().teamId("team_id").build())
                    .build()
            )

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun disableLogging() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val teamService = client.team()

        val response = teamService.disableLogging("team_id")

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun listAvailable() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val teamService = client.team()

        val response =
            teamService.listAvailable(
                TeamListAvailableParams.builder()
                    .responseModel(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun removeMember() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val teamService = client.team()

        val response =
            teamService.removeMember(
                TeamRemoveMemberParams.builder()
                    .teamId("team_id")
                    .userEmail("user_email")
                    .userId("user_id")
                    .build()
            )

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieveInfo() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val teamService = client.team()

        val response =
            teamService.retrieveInfo(TeamRetrieveInfoParams.builder().teamId("team_id").build())

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun unblock() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val teamService = client.team()

        val response =
            teamService.unblock(
                TeamUnblockParams.builder()
                    .blockTeamRequest(BlockTeamRequest.builder().teamId("team_id").build())
                    .build()
            )

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun updateMember() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val teamService = client.team()

        val response =
            teamService.updateMember(
                TeamUpdateMemberParams.builder()
                    .teamId("team_id")
                    .maxBudgetInTeam(0.0)
                    .role(TeamUpdateMemberParams.Role.ADMIN)
                    .userEmail("user_email")
                    .userId("user_id")
                    .build()
            )

        response.validate()
    }
}
