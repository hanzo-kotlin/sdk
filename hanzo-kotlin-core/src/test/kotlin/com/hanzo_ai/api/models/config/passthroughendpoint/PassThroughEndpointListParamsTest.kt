// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.config.passthroughendpoint

import com.hanzo_ai.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PassThroughEndpointListParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        PassThroughEndpointListParams.builder().endpointId("endpoint_id").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params = PassThroughEndpointListParams.builder().endpointId("endpoint_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("endpoint_id", "endpoint_id").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PassThroughEndpointListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
