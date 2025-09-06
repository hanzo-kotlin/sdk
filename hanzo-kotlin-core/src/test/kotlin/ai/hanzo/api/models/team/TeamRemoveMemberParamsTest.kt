// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamRemoveMemberParamsTest {

    @Test
    fun create() {
        TeamRemoveMemberParams.builder()
            .teamId("team_id")
            .userEmail("user_email")
            .userId("user_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            TeamRemoveMemberParams.builder()
                .teamId("team_id")
                .userEmail("user_email")
                .userId("user_id")
                .build()

        val body = params._body()

        assertThat(body.teamId()).isEqualTo("team_id")
        assertThat(body.userEmail()).isEqualTo("user_email")
        assertThat(body.userId()).isEqualTo("user_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TeamRemoveMemberParams.builder().teamId("team_id").build()

        val body = params._body()

        assertThat(body.teamId()).isEqualTo("team_id")
    }
}
