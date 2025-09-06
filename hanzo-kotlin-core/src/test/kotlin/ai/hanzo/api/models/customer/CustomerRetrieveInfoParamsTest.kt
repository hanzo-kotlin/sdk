// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.customer

import ai.hanzo.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerRetrieveInfoParamsTest {

    @Test
    fun create() {
        CustomerRetrieveInfoParams.builder().endUserId("end_user_id").build()
    }

    @Test
    fun queryParams() {
        val params = CustomerRetrieveInfoParams.builder().endUserId("end_user_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("end_user_id", "end_user_id").build())
    }
}
