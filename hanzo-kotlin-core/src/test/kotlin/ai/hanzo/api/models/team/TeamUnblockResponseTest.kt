// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamUnblockResponseTest {

    @Test
    fun create() {
        val teamUnblockResponse = TeamUnblockResponse.builder().build()
    }

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
