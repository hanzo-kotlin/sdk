// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.organization

import ai.hanzo.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OrganizationAddMemberResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val organizationAddMemberResponse =
            OrganizationAddMemberResponse.builder()
                .organizationId("organization_id")
                .addUpdatedOrganizationMembership(
                    OrganizationAddMemberResponse.UpdatedOrganizationMembership.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .organizationId("organization_id")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .userId("user_id")
                        .budgetId("budget_id")
                        .llmBudgetTable(
                            OrganizationAddMemberResponse.UpdatedOrganizationMembership
                                .LlmBudgetTable
                                .builder()
                                .budgetDuration("budget_duration")
                                .maxBudget(0.0)
                                .maxParallelRequests(0L)
                                .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
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
                        .maxBudget(0.0)
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                        .modelSpend(JsonValue.from(mapOf<String, Any>()))
                        .addModel(JsonValue.from(mapOf<String, Any>()))
                        .addOrganizationMembership(
                            OrganizationAddMemberResponse.UpdatedUser.OrganizationMembership
                                .builder()
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .organizationId("organization_id")
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .userId("user_id")
                                .budgetId("budget_id")
                                .llmBudgetTable(
                                    OrganizationAddMemberResponse.UpdatedUser.OrganizationMembership
                                        .LlmBudgetTable
                                        .builder()
                                        .budgetDuration("budget_duration")
                                        .maxBudget(0.0)
                                        .maxParallelRequests(0L)
                                        .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
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
                        .userEmail("user_email")
                        .userRole("user_role")
                        .build()
                )
                .build()

        assertThat(organizationAddMemberResponse.organizationId()).isEqualTo("organization_id")
        assertThat(organizationAddMemberResponse.updatedOrganizationMemberships())
            .containsExactly(
                OrganizationAddMemberResponse.UpdatedOrganizationMembership.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .organizationId("organization_id")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .userId("user_id")
                    .budgetId("budget_id")
                    .llmBudgetTable(
                        OrganizationAddMemberResponse.UpdatedOrganizationMembership.LlmBudgetTable
                            .builder()
                            .budgetDuration("budget_duration")
                            .maxBudget(0.0)
                            .maxParallelRequests(0L)
                            .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
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
                    .maxBudget(0.0)
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                    .modelSpend(JsonValue.from(mapOf<String, Any>()))
                    .addModel(JsonValue.from(mapOf<String, Any>()))
                    .addOrganizationMembership(
                        OrganizationAddMemberResponse.UpdatedUser.OrganizationMembership.builder()
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .organizationId("organization_id")
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .userId("user_id")
                            .budgetId("budget_id")
                            .llmBudgetTable(
                                OrganizationAddMemberResponse.UpdatedUser.OrganizationMembership
                                    .LlmBudgetTable
                                    .builder()
                                    .budgetDuration("budget_duration")
                                    .maxBudget(0.0)
                                    .maxParallelRequests(0L)
                                    .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
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
                    .userEmail("user_email")
                    .userRole("user_role")
                    .build()
            )
    }
}
