// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TeamUpdateResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val teamUpdateResponse = TeamUpdateResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
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
