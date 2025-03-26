// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.customer

import com.hanzo_ai.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CustomerRetrieveInfoParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        CustomerRetrieveInfoParams.builder().endUserId("end_user_id").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params = CustomerRetrieveInfoParams.builder().endUserId("end_user_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("end_user_id", "end_user_id").build())
    }
}
