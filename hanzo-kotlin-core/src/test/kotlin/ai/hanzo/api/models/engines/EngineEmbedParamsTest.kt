// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.engines

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EngineEmbedParamsTest {

    @Test
    fun create() {
        EngineEmbedParams.builder().model("model").build()
    }

    @Test
    fun pathParams() {
        val params = EngineEmbedParams.builder().model("model").build()

        assertThat(params._pathParam(0)).isEqualTo("model")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
