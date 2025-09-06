// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamRetrieveInfoResponseTest {

    @Test
    fun create() {
        val teamRetrieveInfoResponse = TeamRetrieveInfoResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val teamRetrieveInfoResponse = TeamRetrieveInfoResponse.builder().build()

        val roundtrippedTeamRetrieveInfoResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamRetrieveInfoResponse),
                jacksonTypeRef<TeamRetrieveInfoResponse>(),
            )

        assertThat(roundtrippedTeamRetrieveInfoResponse).isEqualTo(teamRetrieveInfoResponse)
    }
}
