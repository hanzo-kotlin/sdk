// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TeamUnblockResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val teamUnblockResponse = TeamUnblockResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val teamUnblockResponse = TeamUnblockResponse.builder().build()

        val roundtrippedTeamUnblockResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamUnblockResponse),
                jacksonTypeRef<TeamUnblockResponse>(),
            )

        assertThat(roundtrippedTeamUnblockResponse).isEqualTo(teamUnblockResponse)
    }
}
