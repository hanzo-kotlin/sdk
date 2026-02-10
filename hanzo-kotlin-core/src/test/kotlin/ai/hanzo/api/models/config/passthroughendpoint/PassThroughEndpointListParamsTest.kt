// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.config.passthroughendpoint

import ai.hanzo.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PassThroughEndpointListParamsTest {

    @Test
    fun create() {
        PassThroughEndpointListParams.builder().endpointId("endpoint_id").build()
    }

    @Test
    fun queryParams() {
        val params = PassThroughEndpointListParams.builder().endpointId("endpoint_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("endpoint_id", "endpoint_id").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PassThroughEndpointListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
