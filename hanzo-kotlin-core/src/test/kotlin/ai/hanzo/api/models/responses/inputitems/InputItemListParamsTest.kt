// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.responses.inputitems

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InputItemListParamsTest {

    @Test
    fun create() {
        InputItemListParams.builder().responseId("response_id").build()
    }

    @Test
    fun pathParams() {
        val params = InputItemListParams.builder().responseId("response_id").build()

        assertThat(params._pathParam(0)).isEqualTo("response_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
