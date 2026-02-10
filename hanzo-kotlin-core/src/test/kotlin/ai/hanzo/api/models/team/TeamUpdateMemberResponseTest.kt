// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamUpdateMemberResponseTest {

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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val teamUpdateMemberResponse =
            TeamUpdateMemberResponse.builder()
                .teamId("team_id")
                .userId("user_id")
                .maxBudgetInTeam(0.0)
                .userEmail("user_email")
                .build()

        val roundtrippedTeamUpdateMemberResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamUpdateMemberResponse),
                jacksonTypeRef<TeamUpdateMemberResponse>(),
            )

        assertThat(roundtrippedTeamUpdateMemberResponse).isEqualTo(teamUpdateMemberResponse)
    }
}
