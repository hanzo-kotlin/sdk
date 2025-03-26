// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.spend

import com.hanzo_ai.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SpendListTagsParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        SpendListTagsParams.builder().endDate("end_date").startDate("start_date").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            SpendListTagsParams.builder().endDate("end_date").startDate("start_date").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("end_date", "end_date")
                    .put("start_date", "start_date")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SpendListTagsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
