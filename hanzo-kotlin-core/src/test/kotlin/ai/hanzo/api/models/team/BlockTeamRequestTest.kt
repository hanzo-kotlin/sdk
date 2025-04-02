// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
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

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val blockTeamRequest = BlockTeamRequest.builder().teamId("team_id").build()

        val roundtrippedBlockTeamRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(blockTeamRequest),
                jacksonTypeRef<BlockTeamRequest>(),
            )

        assertThat(roundtrippedBlockTeamRequest).isEqualTo(blockTeamRequest)
    }
}
