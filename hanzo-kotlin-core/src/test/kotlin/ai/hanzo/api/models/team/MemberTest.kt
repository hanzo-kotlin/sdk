// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MemberTest {

    @Test
    fun create() {
        val member =
            Member.builder()
                .role(Member.Role.ADMIN)
                .userEmail("user_email")
                .userId("user_id")
                .build()

        assertThat(member.role()).isEqualTo(Member.Role.ADMIN)
        assertThat(member.userEmail()).isEqualTo("user_email")
        assertThat(member.userId()).isEqualTo("user_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val member =
            Member.builder()
                .role(Member.Role.ADMIN)
                .userEmail("user_email")
                .userId("user_id")
                .build()

        val roundtrippedMember =
            jsonMapper.readValue(jsonMapper.writeValueAsString(member), jacksonTypeRef<Member>())

        assertThat(roundtrippedMember).isEqualTo(member)
    }
}
