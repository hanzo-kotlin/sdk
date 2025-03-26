// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.team

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BlockTeamRequestTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val blockTeamRequest = BlockTeamRequest.builder().teamId("team_id").build()

        assertThat(blockTeamRequest.teamId()).isEqualTo("team_id")
    }
}
