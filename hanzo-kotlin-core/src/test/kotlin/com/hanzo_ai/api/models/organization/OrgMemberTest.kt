// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.organization

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OrgMemberTest {

    @Disabled("skipped: tests are disabled for the time being")
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
}
