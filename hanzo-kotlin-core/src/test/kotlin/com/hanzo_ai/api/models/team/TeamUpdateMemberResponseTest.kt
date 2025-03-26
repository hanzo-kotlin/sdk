// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.team

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TeamUpdateMemberResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val teamUpdateMemberResponse =
            TeamUpdateMemberResponse.builder()
                .teamId("team_id")
                .userId("user_id")
                .maxBudgetInTeam(0.0)
                .userEmail("user_email")
                .build()

        assertThat(teamUpdateMemberResponse.teamId()).isEqualTo("team_id")
        assertThat(teamUpdateMemberResponse.userId()).isEqualTo("user_id")
        assertThat(teamUpdateMemberResponse.maxBudgetInTeam()).isEqualTo(0.0)
        assertThat(teamUpdateMemberResponse.userEmail()).isEqualTo("user_email")
    }
}
