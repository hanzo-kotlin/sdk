// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team

import ai.hanzo.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamListParamsTest {

    @Test
    fun create() {
        TeamListParams.builder().organizationId("organization_id").userId("user_id").build()
    }

    @Test
    fun queryParams() {
        val params =
            TeamListParams.builder().organizationId("organization_id").userId("user_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("organization_id", "organization_id")
                    .put("user_id", "user_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TeamListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
