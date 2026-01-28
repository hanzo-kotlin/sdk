// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.organization

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationMembershipTableTest {

    @Test
    fun create() {
        val organizationMembershipTable =
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

        assertThat(organizationMembershipTable.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(organizationMembershipTable.organizationId()).isEqualTo("organization_id")
        assertThat(organizationMembershipTable.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(organizationMembershipTable.userId()).isEqualTo("user_id")
        assertThat(organizationMembershipTable.budgetId()).isEqualTo("budget_id")
        assertThat(organizationMembershipTable.litellmBudgetTable())
            .isEqualTo(
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
        assertThat(organizationMembershipTable.spend()).isEqualTo(0.0)
        assertThat(organizationMembershipTable._user())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(organizationMembershipTable.userRole()).isEqualTo("user_role")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val organizationMembershipTable =
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

        val roundtrippedOrganizationMembershipTable =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(organizationMembershipTable),
                jacksonTypeRef<OrganizationMembershipTable>(),
            )

        assertThat(roundtrippedOrganizationMembershipTable).isEqualTo(organizationMembershipTable)
    }
}
