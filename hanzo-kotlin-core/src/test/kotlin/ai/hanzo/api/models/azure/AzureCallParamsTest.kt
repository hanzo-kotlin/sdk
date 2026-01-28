// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.azure

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AzureCallParamsTest {

    @Test
    fun create() {
        AzureCallParams.builder().endpoint("endpoint").build()
    }

    @Test
    fun pathParams() {
        val params = AzureCallParams.builder().endpoint("endpoint").build()

        assertThat(params._pathParam(0)).isEqualTo("endpoint")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
