// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.global.spend

import ai.hanzo.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SpendRetrieveReportParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        SpendRetrieveReportParams.builder()
            .apiKey("api_key")
            .customerId("customer_id")
            .endDate("end_date")
            .groupBy(SpendRetrieveReportParams.GroupBy.TEAM)
            .internalUserId("internal_user_id")
            .startDate("start_date")
            .teamId("team_id")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            SpendRetrieveReportParams.builder()
                .apiKey("api_key")
                .customerId("customer_id")
                .endDate("end_date")
                .groupBy(SpendRetrieveReportParams.GroupBy.TEAM)
                .internalUserId("internal_user_id")
                .startDate("start_date")
                .teamId("team_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("api_key", "api_key")
                    .put("customer_id", "customer_id")
                    .put("end_date", "end_date")
                    .put("group_by", "team")
                    .put("internal_user_id", "internal_user_id")
                    .put("start_date", "start_date")
                    .put("team_id", "team_id")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SpendRetrieveReportParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
