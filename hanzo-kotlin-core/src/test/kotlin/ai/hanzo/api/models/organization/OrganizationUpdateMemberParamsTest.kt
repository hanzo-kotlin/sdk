// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.organization

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationUpdateMemberParamsTest {

    @Test
    fun create() {
        OrganizationUpdateMemberParams.builder()
            .organizationId("organization_id")
            .maxBudgetInOrganization(0.0)
            .role(OrganizationUpdateMemberParams.Role.PROXY_ADMIN)
            .userEmail("user_email")
            .userId("user_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            OrganizationUpdateMemberParams.builder()
                .organizationId("organization_id")
                .maxBudgetInOrganization(0.0)
                .role(OrganizationUpdateMemberParams.Role.PROXY_ADMIN)
                .userEmail("user_email")
                .userId("user_id")
                .build()

        val body = params._body()

        assertThat(body.organizationId()).isEqualTo("organization_id")
        assertThat(body.maxBudgetInOrganization()).isEqualTo(0.0)
        assertThat(body.role()).isEqualTo(OrganizationUpdateMemberParams.Role.PROXY_ADMIN)
        assertThat(body.userEmail()).isEqualTo("user_email")
        assertThat(body.userId()).isEqualTo("user_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OrganizationUpdateMemberParams.builder().organizationId("organization_id").build()

        val body = params._body()

        assertThat(body.organizationId()).isEqualTo("organization_id")
    }
}
