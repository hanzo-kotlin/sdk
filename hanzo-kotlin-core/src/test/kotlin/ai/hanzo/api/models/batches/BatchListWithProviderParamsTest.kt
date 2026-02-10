// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.batches

import ai.hanzo.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchListWithProviderParamsTest {

    @Test
    fun create() {
        BatchListWithProviderParams.builder().provider("provider").after("after").limit(0L).build()
    }

    @Test
    fun pathParams() {
        val params = BatchListWithProviderParams.builder().provider("provider").build()

        assertThat(params._pathParam(0)).isEqualTo("provider")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            BatchListWithProviderParams.builder()
                .provider("provider")
                .after("after")
                .limit(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("after", "after").put("limit", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BatchListWithProviderParams.builder().provider("provider").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
