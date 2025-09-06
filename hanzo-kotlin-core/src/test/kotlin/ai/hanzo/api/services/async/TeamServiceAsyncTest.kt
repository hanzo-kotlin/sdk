// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
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
internal class TeamServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val teamServiceAsync = client.team()

        val team =
            teamServiceAsync.create(
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

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val teamServiceAsync = client.team()

        val team =
            teamServiceAsync.update(
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

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val teamServiceAsync = client.team()

        val teams =
            teamServiceAsync.list(
                TeamListParams.builder().organizationId("organization_id").userId("user_id").build()
            )

        teams.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val teamServiceAsync = client.team()

        val team =
            teamServiceAsync.delete(
                TeamDeleteParams.builder()
                    .llmChangedBy("llm-changed-by")
                    .addTeamId("string")
                    .build()
            )

        team.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun addMember() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val teamServiceAsync = client.team()

        val response =
            teamServiceAsync.addMember(
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

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun block() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val teamServiceAsync = client.team()

        val response =
            teamServiceAsync.block(
                TeamBlockParams.builder()
                    .blockTeamRequest(BlockTeamRequest.builder().teamId("team_id").build())
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun disableLogging() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val teamServiceAsync = client.team()

        val response = teamServiceAsync.disableLogging("team_id")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun listAvailable() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val teamServiceAsync = client.team()

        val response =
            teamServiceAsync.listAvailable(
                TeamListAvailableParams.builder()
                    .responseModel(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun removeMember() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val teamServiceAsync = client.team()

        val response =
            teamServiceAsync.removeMember(
                TeamRemoveMemberParams.builder()
                    .teamId("team_id")
                    .userEmail("user_email")
                    .userId("user_id")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieveInfo() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val teamServiceAsync = client.team()

        val response =
            teamServiceAsync.retrieveInfo(
                TeamRetrieveInfoParams.builder().teamId("team_id").build()
            )

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
        val teamServiceAsync = client.team()

        val response =
            teamServiceAsync.unblock(
                TeamUnblockParams.builder()
                    .blockTeamRequest(BlockTeamRequest.builder().teamId("team_id").build())
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun updateMember() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val teamServiceAsync = client.team()

        val response =
            teamServiceAsync.updateMember(
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
