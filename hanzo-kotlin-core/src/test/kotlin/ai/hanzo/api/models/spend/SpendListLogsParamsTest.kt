// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.spend

import ai.hanzo.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SpendListLogsParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        SpendListLogsParams.builder()
            .apiKey("api_key")
            .endDate("end_date")
            .requestId("request_id")
            .startDate("start_date")
            .userId("user_id")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            SpendListLogsParams.builder()
                .apiKey("api_key")
                .endDate("end_date")
                .requestId("request_id")
                .startDate("start_date")
                .userId("user_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("api_key", "api_key")
                    .put("end_date", "end_date")
                    .put("request_id", "request_id")
                    .put("start_date", "start_date")
                    .put("user_id", "user_id")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SpendListLogsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
