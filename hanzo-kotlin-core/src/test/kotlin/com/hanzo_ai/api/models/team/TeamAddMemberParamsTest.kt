// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.team

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TeamAddMemberParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        TeamAddMemberParams.builder()
            .memberOfMembers(
                listOf(
                    Member.builder()
                        .role(Member.Role.ADMIN)
                        .userEmail("user_email")
                        .userId("user_id")
                        .build()
                )
            )
            .teamId("team_id")
            .maxBudgetInTeam(0.0)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            TeamAddMemberParams.builder()
                .memberOfMembers(
                    listOf(
                        Member.builder()
                            .role(Member.Role.ADMIN)
                            .userEmail("user_email")
                            .userId("user_id")
                            .build()
                    )
                )
                .teamId("team_id")
                .maxBudgetInTeam(0.0)
                .build()

        val body = params._body()

        assertThat(body.member())
            .isEqualTo(
                TeamAddMemberParams.Member.ofMembers(
                    listOf(
                        Member.builder()
                            .role(Member.Role.ADMIN)
                            .userEmail("user_email")
                            .userId("user_id")
                            .build()
                    )
                )
            )
        assertThat(body.teamId()).isEqualTo("team_id")
        assertThat(body.maxBudgetInTeam()).isEqualTo(0.0)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TeamAddMemberParams.builder()
                .memberOfMembers(listOf(Member.builder().role(Member.Role.ADMIN).build()))
                .teamId("team_id")
                .build()

        val body = params._body()

        assertThat(body.member())
            .isEqualTo(
                TeamAddMemberParams.Member.ofMembers(
                    listOf(Member.builder().role(Member.Role.ADMIN).build())
                )
            )
        assertThat(body.teamId()).isEqualTo("team_id")
    }
}
