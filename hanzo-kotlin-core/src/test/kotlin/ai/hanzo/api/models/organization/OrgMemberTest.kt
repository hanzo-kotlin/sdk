// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.organization

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrgMemberTest {

    @Test
    fun create() {
        val orgMember =
            OrgMember.builder()
                .role(OrgMember.Role.ORG_ADMIN)
                .userEmail("user_email")
                .userId("user_id")
                .build()

        assertThat(orgMember.role()).isEqualTo(OrgMember.Role.ORG_ADMIN)
        assertThat(orgMember.userEmail()).isEqualTo("user_email")
        assertThat(orgMember.userId()).isEqualTo("user_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val orgMember =
            OrgMember.builder()
                .role(OrgMember.Role.ORG_ADMIN)
                .userEmail("user_email")
                .userId("user_id")
                .build()

        val roundtrippedOrgMember =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orgMember),
                jacksonTypeRef<OrgMember>(),
            )

        assertThat(roundtrippedOrgMember).isEqualTo(orgMember)
    }
}
