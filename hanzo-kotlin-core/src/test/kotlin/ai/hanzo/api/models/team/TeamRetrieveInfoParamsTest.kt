// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team

import ai.hanzo.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamRetrieveInfoParamsTest {

    @Test
    fun create() {
        TeamRetrieveInfoParams.builder().teamId("team_id").build()
    }

    @Test
    fun queryParams() {
        val params = TeamRetrieveInfoParams.builder().teamId("team_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("team_id", "team_id").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TeamRetrieveInfoParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
