// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.responses

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ResponseRetrieveParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        ResponseRetrieveParams.builder().responseId("response_id").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params = ResponseRetrieveParams.builder().responseId("response_id").build()

        assertThat(params._pathParam(0)).isEqualTo("response_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
