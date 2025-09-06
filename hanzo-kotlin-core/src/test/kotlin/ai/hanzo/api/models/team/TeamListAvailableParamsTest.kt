// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamListAvailableParamsTest {

    @Test
    fun create() {
        TeamListAvailableParams.builder()
            .responseModel(JsonValue.from(mapOf<String, Any>()))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TeamListAvailableParams.builder()
                .responseModel(JsonValue.from(mapOf<String, Any>()))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TeamListAvailableParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
