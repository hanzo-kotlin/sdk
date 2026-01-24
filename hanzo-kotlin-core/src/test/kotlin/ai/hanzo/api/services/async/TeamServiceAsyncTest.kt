// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.models.team.BlockTeamRequest
import ai.hanzo.api.models.team.Member
import ai.hanzo.api.models.team.TeamAddMemberParams
import ai.hanzo.api.models.team.TeamCreateParams
import ai.hanzo.api.models.team.TeamDeleteParams
import ai.hanzo.api.models.team.TeamListAvailableParams
import ai.hanzo.api.models.team.TeamListParams
import ai.hanzo.api.models.team.TeamRemoveMemberParams
import ai.hanzo.api.models.team.TeamRetrieveInfoParams
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
                    .litellmChangedBy("litellm-changed-by")
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

        val response = teamServiceAsync.block(BlockTeamRequest.builder().teamId("team_id").build())

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
            teamServiceAsync.unblock(BlockTeamRequest.builder().teamId("team_id").build())

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
                    .rpmLimit(0L)
                    .tpmLimit(0L)
                    .userEmail("user_email")
                    .userId("user_id")
                    .build()
            )

        response.validate()
    }
}
