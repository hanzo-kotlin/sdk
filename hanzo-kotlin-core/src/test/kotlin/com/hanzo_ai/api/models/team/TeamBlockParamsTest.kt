// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.team

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TeamBlockParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        TeamBlockParams.builder()
            .blockTeamRequest(BlockTeamRequest.builder().teamId("team_id").build())
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            TeamBlockParams.builder()
                .blockTeamRequest(BlockTeamRequest.builder().teamId("team_id").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(BlockTeamRequest.builder().teamId("team_id").build())
    }
}
