// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.health

import com.hanzo_ai.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class HealthCheckServicesParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        HealthCheckServicesParams.builder()
            .service(HealthCheckServicesParams.Service.SLACK_BUDGET_ALERTS)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
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
