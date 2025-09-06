// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamUpdateResponseTest {

    @Test
    fun create() {
        val teamUpdateResponse = TeamUpdateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val teamUpdateResponse = TeamUpdateResponse.builder().build()

        val roundtrippedTeamUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamUpdateResponse),
                jacksonTypeRef<TeamUpdateResponse>(),
            )

        assertThat(roundtrippedTeamUpdateResponse).isEqualTo(teamUpdateResponse)
    }
}
