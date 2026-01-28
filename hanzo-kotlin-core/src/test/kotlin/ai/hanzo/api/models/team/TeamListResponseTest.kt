// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamListResponseTest {

    @Test
    fun create() {
        val teamListResponse = TeamListResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val teamListResponse = TeamListResponse.builder().build()

        val roundtrippedTeamListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamListResponse),
                jacksonTypeRef<TeamListResponse>(),
            )

        assertThat(roundtrippedTeamListResponse).isEqualTo(teamListResponse)
    }
}
