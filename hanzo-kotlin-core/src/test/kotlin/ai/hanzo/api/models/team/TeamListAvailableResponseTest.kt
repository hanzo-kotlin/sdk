// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamListAvailableResponseTest {

    @Test
    fun create() {
        val teamListAvailableResponse = TeamListAvailableResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val teamListAvailableResponse = TeamListAvailableResponse.builder().build()

        val roundtrippedTeamListAvailableResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamListAvailableResponse),
                jacksonTypeRef<TeamListAvailableResponse>(),
            )

        assertThat(roundtrippedTeamListAvailableResponse).isEqualTo(teamListAvailableResponse)
    }
}
