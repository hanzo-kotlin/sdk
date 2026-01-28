// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.organization

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationAddMemberParamsTest {

    @Test
    fun create() {
        OrganizationAddMemberParams.builder()
            .memberOfOrgMembers(
                listOf(
                    OrgMember.builder()
                        .role(OrgMember.Role.ORG_ADMIN)
                        .userEmail("user_email")
                        .userId("user_id")
                        .build()
                )
            )
            .organizationId("organization_id")
            .maxBudgetInOrganization(0.0)
            .build()
    }

    @Test
    fun body() {
        val params =
            OrganizationAddMemberParams.builder()
                .memberOfOrgMembers(
                    listOf(
                        OrgMember.builder()
                            .role(OrgMember.Role.ORG_ADMIN)
                            .userEmail("user_email")
                            .userId("user_id")
                            .build()
                    )
                )
                .organizationId("organization_id")
                .maxBudgetInOrganization(0.0)
                .build()

        val body = params._body()

        assertThat(body.member())
            .isEqualTo(
                OrganizationAddMemberParams.Member.ofOrgMembers(
                    listOf(
                        OrgMember.builder()
                            .role(OrgMember.Role.ORG_ADMIN)
                            .userEmail("user_email")
                            .userId("user_id")
                            .build()
                    )
                )
            )
        assertThat(body.organizationId()).isEqualTo("organization_id")
        assertThat(body.maxBudgetInOrganization()).isEqualTo(0.0)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OrganizationAddMemberParams.builder()
                .memberOfOrgMembers(
                    listOf(OrgMember.builder().role(OrgMember.Role.ORG_ADMIN).build())
                )
                .organizationId("organization_id")
                .build()

        val body = params._body()

        assertThat(body.member())
            .isEqualTo(
                OrganizationAddMemberParams.Member.ofOrgMembers(
                    listOf(OrgMember.builder().role(OrgMember.Role.ORG_ADMIN).build())
                )
            )
        assertThat(body.organizationId()).isEqualTo("organization_id")
    }
}
