// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TeamBlockResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val teamBlockResponse = TeamBlockResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val teamBlockResponse = TeamBlockResponse.builder().build()

        val roundtrippedTeamBlockResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamBlockResponse),
                jacksonTypeRef<TeamBlockResponse>(),
            )

        assertThat(roundtrippedTeamBlockResponse).isEqualTo(teamBlockResponse)
    }
}
