// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.cohere

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CohereModifyParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        CohereModifyParams.builder().endpoint("endpoint").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params = CohereModifyParams.builder().endpoint("endpoint").build()

        assertThat(params._pathParam(0)).isEqualTo("endpoint")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
