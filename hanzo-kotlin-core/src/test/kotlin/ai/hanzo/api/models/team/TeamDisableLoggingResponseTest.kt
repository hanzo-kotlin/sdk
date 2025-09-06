// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamDisableLoggingResponseTest {

    @Test
    fun create() {
        val teamDisableLoggingResponse = TeamDisableLoggingResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val teamDisableLoggingResponse = TeamDisableLoggingResponse.builder().build()

        val roundtrippedTeamDisableLoggingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamDisableLoggingResponse),
                jacksonTypeRef<TeamDisableLoggingResponse>(),
            )

        assertThat(roundtrippedTeamDisableLoggingResponse).isEqualTo(teamDisableLoggingResponse)
    }
}
