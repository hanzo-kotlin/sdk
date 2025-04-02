// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.organization

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OrganizationUpdateMemberResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val organizationUpdateMemberResponse =
            OrganizationUpdateMemberResponse.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .organizationId("organization_id")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userId("user_id")
                .budgetId("budget_id")
                .llmBudgetTable(
                    OrganizationUpdateMemberResponse.LlmBudgetTable.builder()
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

        assertThat(organizationUpdateMemberResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(organizationUpdateMemberResponse.organizationId()).isEqualTo("organization_id")
        assertThat(organizationUpdateMemberResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(organizationUpdateMemberResponse.userId()).isEqualTo("user_id")
        assertThat(organizationUpdateMemberResponse.budgetId()).isEqualTo("budget_id")
        assertThat(organizationUpdateMemberResponse.llmBudgetTable())
            .isEqualTo(
                OrganizationUpdateMemberResponse.LlmBudgetTable.builder()
                    .budgetDuration("budget_duration")
                    .maxBudget(0.0)
                    .maxParallelRequests(0L)
                    .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                    .rpmLimit(0L)
                    .softBudget(0.0)
                    .tpmLimit(0L)
                    .build()
            )
        assertThat(organizationUpdateMemberResponse.spend()).isEqualTo(0.0)
        assertThat(organizationUpdateMemberResponse._user())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(organizationUpdateMemberResponse.userRole()).isEqualTo("user_role")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val organizationUpdateMemberResponse =
            OrganizationUpdateMemberResponse.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .organizationId("organization_id")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userId("user_id")
                .budgetId("budget_id")
                .llmBudgetTable(
                    OrganizationUpdateMemberResponse.LlmBudgetTable.builder()
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

        val roundtrippedOrganizationUpdateMemberResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(organizationUpdateMemberResponse),
                jacksonTypeRef<OrganizationUpdateMemberResponse>(),
            )

        assertThat(roundtrippedOrganizationUpdateMemberResponse)
            .isEqualTo(organizationUpdateMemberResponse)
    }
}
