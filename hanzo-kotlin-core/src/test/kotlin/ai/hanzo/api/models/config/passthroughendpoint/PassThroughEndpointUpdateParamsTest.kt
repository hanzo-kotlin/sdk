// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.config.passthroughendpoint

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PassThroughEndpointUpdateParamsTest {

    @Test
    fun create() {
        PassThroughEndpointUpdateParams.builder().endpointId("endpoint_id").build()
    }

    @Test
    fun pathParams() {
        val params = PassThroughEndpointUpdateParams.builder().endpointId("endpoint_id").build()

        assertThat(params._pathParam(0)).isEqualTo("endpoint_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
