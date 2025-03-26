// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.batches.cancel

import com.hanzo_ai.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CancelCancelParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        CancelCancelParams.builder().batchId("batch_id").provider("provider").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params = CancelCancelParams.builder().batchId("batch_id").build()

        assertThat(params._pathParam(0)).isEqualTo("batch_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params = CancelCancelParams.builder().batchId("batch_id").provider("provider").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("provider", "provider").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CancelCancelParams.builder().batchId("batch_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
