// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.responses

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResponseDeleteParamsTest {

    @Test
    fun create() {
        ResponseDeleteParams.builder().responseId("response_id").build()
    }

    @Test
    fun pathParams() {
        val params = ResponseDeleteParams.builder().responseId("response_id").build()

        assertThat(params._pathParam(0)).isEqualTo("response_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
