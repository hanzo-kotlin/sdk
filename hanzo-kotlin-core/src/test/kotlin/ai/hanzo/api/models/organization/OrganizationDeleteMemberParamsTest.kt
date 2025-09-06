// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.organization

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationDeleteMemberParamsTest {

    @Test
    fun create() {
        OrganizationDeleteMemberParams.builder()
            .organizationId("organization_id")
            .userEmail("user_email")
            .userId("user_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            OrganizationDeleteMemberParams.builder()
                .organizationId("organization_id")
                .userEmail("user_email")
                .userId("user_id")
                .build()

        val body = params._body()

        assertThat(body.organizationId()).isEqualTo("organization_id")
        assertThat(body.userEmail()).isEqualTo("user_email")
        assertThat(body.userId()).isEqualTo("user_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OrganizationDeleteMemberParams.builder().organizationId("organization_id").build()

        val body = params._body()

        assertThat(body.organizationId()).isEqualTo("organization_id")
    }
}
