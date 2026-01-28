// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.organization

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationAddMemberResponseTest {

    @Test
    fun create() {
        val organizationAddMemberResponse =
            OrganizationAddMemberResponse.builder()
                .organizationId("organization_id")
                .addUpdatedOrganizationMembership(
                    OrganizationMembershipTable.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .organizationId("organization_id")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .userId("user_id")
                        .budgetId("budget_id")
                        .litellmBudgetTable(
                            BudgetTable.builder()
                                .budgetDuration("budget_duration")
                                .budgetId("budget_id")
                                .maxBudget(0.0)
                                .maxParallelRequests(0L)
                                .modelMaxBudget(
                                    BudgetTable.ModelMaxBudget.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .rpmLimit(0L)
                                .softBudget(0.0)
                                .tpmLimit(0L)
                                .build()
                        )
                        .spend(0.0)
                        .user(JsonValue.from(mapOf<String, Any>()))
                        .userRole("user_role")
                        .build()
                )
                .addUpdatedUser(
                    OrganizationAddMemberResponse.UpdatedUser.builder()
                        .userId("user_id")
                        .budgetDuration("budget_duration")
                        .budgetResetAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .maxBudget(0.0)
                        .metadata(
                            OrganizationAddMemberResponse.UpdatedUser.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .modelMaxBudget(
                            OrganizationAddMemberResponse.UpdatedUser.ModelMaxBudget.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .modelSpend(
                            OrganizationAddMemberResponse.UpdatedUser.ModelSpend.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .addModel(JsonValue.from(mapOf<String, Any>()))
                        .objectPermission(
                            OrganizationAddMemberResponse.UpdatedUser.ObjectPermission.builder()
                                .objectPermissionId("object_permission_id")
                                .addAgentAccessGroup("string")
                                .addAgent("string")
                                .addMcpAccessGroup("string")
                                .addMcpServer("string")
                                .mcpToolPermissions(
                                    OrganizationAddMemberResponse.UpdatedUser.ObjectPermission
                                        .McpToolPermissions
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
                        .addOrganizationMembership(
                            OrganizationMembershipTable.builder()
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .organizationId("organization_id")
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .userId("user_id")
                                .budgetId("budget_id")
                                .litellmBudgetTable(
                                    BudgetTable.builder()
                                        .budgetDuration("budget_duration")
                                        .budgetId("budget_id")
                                        .maxBudget(0.0)
                                        .maxParallelRequests(0L)
                                        .modelMaxBudget(
                                            BudgetTable.ModelMaxBudget.builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .rpmLimit(0L)
                                        .softBudget(0.0)
                                        .tpmLimit(0L)
                                        .build()
                                )
                                .spend(0.0)
                                .user(JsonValue.from(mapOf<String, Any>()))
                                .userRole("user_role")
                                .build()
                        )
                        .rpmLimit(0L)
                        .spend(0.0)
                        .ssoUserId("sso_user_id")
                        .addTeam("string")
                        .tpmLimit(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .userAlias("user_alias")
                        .userEmail("user_email")
                        .userRole("user_role")
                        .build()
                )
                .build()

        assertThat(organizationAddMemberResponse.organizationId()).isEqualTo("organization_id")
        assertThat(organizationAddMemberResponse.updatedOrganizationMemberships())
            .containsExactly(
                OrganizationMembershipTable.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .organizationId("organization_id")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .userId("user_id")
                    .budgetId("budget_id")
                    .litellmBudgetTable(
                        BudgetTable.builder()
                            .budgetDuration("budget_duration")
                            .budgetId("budget_id")
                            .maxBudget(0.0)
                            .maxParallelRequests(0L)
                            .modelMaxBudget(
                                BudgetTable.ModelMaxBudget.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .rpmLimit(0L)
                            .softBudget(0.0)
                            .tpmLimit(0L)
                            .build()
                    )
                    .spend(0.0)
                    .user(JsonValue.from(mapOf<String, Any>()))
                    .userRole("user_role")
                    .build()
            )
        assertThat(organizationAddMemberResponse.updatedUsers())
            .containsExactly(
                OrganizationAddMemberResponse.UpdatedUser.builder()
                    .userId("user_id")
                    .budgetDuration("budget_duration")
                    .budgetResetAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .maxBudget(0.0)
                    .metadata(
                        OrganizationAddMemberResponse.UpdatedUser.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .modelMaxBudget(
                        OrganizationAddMemberResponse.UpdatedUser.ModelMaxBudget.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .modelSpend(
                        OrganizationAddMemberResponse.UpdatedUser.ModelSpend.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .addModel(JsonValue.from(mapOf<String, Any>()))
                    .objectPermission(
                        OrganizationAddMemberResponse.UpdatedUser.ObjectPermission.builder()
                            .objectPermissionId("object_permission_id")
                            .addAgentAccessGroup("string")
                            .addAgent("string")
                            .addMcpAccessGroup("string")
                            .addMcpServer("string")
                            .mcpToolPermissions(
                                OrganizationAddMemberResponse.UpdatedUser.ObjectPermission
                                    .McpToolPermissions
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                    .build()
                            )
                            .addVectorStore("string")
                            .build()
                    )
                    .addOrganizationMembership(
                        OrganizationMembershipTable.builder()
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .organizationId("organization_id")
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .userId("user_id")
                            .budgetId("budget_id")
                            .litellmBudgetTable(
                                BudgetTable.builder()
                                    .budgetDuration("budget_duration")
                                    .budgetId("budget_id")
                                    .maxBudget(0.0)
                                    .maxParallelRequests(0L)
                                    .modelMaxBudget(
                                        BudgetTable.ModelMaxBudget.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .rpmLimit(0L)
                                    .softBudget(0.0)
                                    .tpmLimit(0L)
                                    .build()
                            )
                            .spend(0.0)
                            .user(JsonValue.from(mapOf<String, Any>()))
                            .userRole("user_role")
                            .build()
                    )
                    .rpmLimit(0L)
                    .spend(0.0)
                    .ssoUserId("sso_user_id")
                    .addTeam("string")
                    .tpmLimit(0L)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .userAlias("user_alias")
                    .userEmail("user_email")
                    .userRole("user_role")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val organizationAddMemberResponse =
            OrganizationAddMemberResponse.builder()
                .organizationId("organization_id")
                .addUpdatedOrganizationMembership(
                    OrganizationMembershipTable.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .organizationId("organization_id")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .userId("user_id")
                        .budgetId("budget_id")
                        .litellmBudgetTable(
                            BudgetTable.builder()
                                .budgetDuration("budget_duration")
                                .budgetId("budget_id")
                                .maxBudget(0.0)
                                .maxParallelRequests(0L)
                                .modelMaxBudget(
                                    BudgetTable.ModelMaxBudget.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .rpmLimit(0L)
                                .softBudget(0.0)
                                .tpmLimit(0L)
                                .build()
                        )
                        .spend(0.0)
                        .user(JsonValue.from(mapOf<String, Any>()))
                        .userRole("user_role")
                        .build()
                )
                .addUpdatedUser(
                    OrganizationAddMemberResponse.UpdatedUser.builder()
                        .userId("user_id")
                        .budgetDuration("budget_duration")
                        .budgetResetAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .maxBudget(0.0)
                        .metadata(
                            OrganizationAddMemberResponse.UpdatedUser.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .modelMaxBudget(
                            OrganizationAddMemberResponse.UpdatedUser.ModelMaxBudget.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .modelSpend(
                            OrganizationAddMemberResponse.UpdatedUser.ModelSpend.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .addModel(JsonValue.from(mapOf<String, Any>()))
                        .objectPermission(
                            OrganizationAddMemberResponse.UpdatedUser.ObjectPermission.builder()
                                .objectPermissionId("object_permission_id")
                                .addAgentAccessGroup("string")
                                .addAgent("string")
                                .addMcpAccessGroup("string")
                                .addMcpServer("string")
                                .mcpToolPermissions(
                                    OrganizationAddMemberResponse.UpdatedUser.ObjectPermission
                                        .McpToolPermissions
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
                        .addOrganizationMembership(
                            OrganizationMembershipTable.builder()
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .organizationId("organization_id")
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .userId("user_id")
                                .budgetId("budget_id")
                                .litellmBudgetTable(
                                    BudgetTable.builder()
                                        .budgetDuration("budget_duration")
                                        .budgetId("budget_id")
                                        .maxBudget(0.0)
                                        .maxParallelRequests(0L)
                                        .modelMaxBudget(
                                            BudgetTable.ModelMaxBudget.builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .rpmLimit(0L)
                                        .softBudget(0.0)
                                        .tpmLimit(0L)
                                        .build()
                                )
                                .spend(0.0)
                                .user(JsonValue.from(mapOf<String, Any>()))
                                .userRole("user_role")
                                .build()
                        )
                        .rpmLimit(0L)
                        .spend(0.0)
                        .ssoUserId("sso_user_id")
                        .addTeam("string")
                        .tpmLimit(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .userAlias("user_alias")
                        .userEmail("user_email")
                        .userRole("user_role")
                        .build()
                )
                .build()

        val roundtrippedOrganizationAddMemberResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(organizationAddMemberResponse),
                jacksonTypeRef<OrganizationAddMemberResponse>(),
            )

        assertThat(roundtrippedOrganizationAddMemberResponse)
            .isEqualTo(organizationAddMemberResponse)
    }
}
