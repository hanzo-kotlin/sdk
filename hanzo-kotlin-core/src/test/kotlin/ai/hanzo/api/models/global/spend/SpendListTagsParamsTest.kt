// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.global.spend

import ai.hanzo.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpendListTagsParamsTest {

    @Test
    fun create() {
        SpendListTagsParams.builder()
            .endDate("end_date")
            .startDate("start_date")
            .tags("tags")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SpendListTagsParams.builder()
                .endDate("end_date")
                .startDate("start_date")
                .tags("tags")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("end_date", "end_date")
                    .put("start_date", "start_date")
                    .put("tags", "tags")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SpendListTagsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
