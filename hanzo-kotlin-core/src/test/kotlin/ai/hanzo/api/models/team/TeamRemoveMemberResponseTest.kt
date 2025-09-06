// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamRemoveMemberResponseTest {

    @Test
    fun create() {
        val teamRemoveMemberResponse = TeamRemoveMemberResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val teamRemoveMemberResponse = TeamRemoveMemberResponse.builder().build()

        val roundtrippedTeamRemoveMemberResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamRemoveMemberResponse),
                jacksonTypeRef<TeamRemoveMemberResponse>(),
            )

        assertThat(roundtrippedTeamRemoveMemberResponse).isEqualTo(teamRemoveMemberResponse)
    }
}
