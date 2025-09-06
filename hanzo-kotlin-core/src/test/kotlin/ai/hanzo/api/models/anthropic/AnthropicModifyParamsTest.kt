// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.anthropic

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnthropicModifyParamsTest {

    @Test
    fun create() {
        AnthropicModifyParams.builder().endpoint("endpoint").build()
    }

    @Test
    fun pathParams() {
        val params = AnthropicModifyParams.builder().endpoint("endpoint").build()

        assertThat(params._pathParam(0)).isEqualTo("endpoint")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
