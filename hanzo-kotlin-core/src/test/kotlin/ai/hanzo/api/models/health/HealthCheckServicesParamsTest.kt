// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.health

import ai.hanzo.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HealthCheckServicesParamsTest {

    @Test
    fun create() {
        HealthCheckServicesParams.builder()
            .service(HealthCheckServicesParams.Service.SLACK_BUDGET_ALERTS)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            HealthCheckServicesParams.builder()
                .service(HealthCheckServicesParams.Service.SLACK_BUDGET_ALERTS)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
