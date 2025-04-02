// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.organization

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OrganizationDeleteMemberResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val organizationDeleteMemberResponse = OrganizationDeleteMemberResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val organizationDeleteMemberResponse = OrganizationDeleteMemberResponse.builder().build()

        val roundtrippedOrganizationDeleteMemberResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(organizationDeleteMemberResponse),
                jacksonTypeRef<OrganizationDeleteMemberResponse>(),
            )

        assertThat(roundtrippedOrganizationDeleteMemberResponse)
            .isEqualTo(organizationDeleteMemberResponse)
    }
}
