// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.vertexai

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VertexAiRetrieveParamsTest {

    @Test
    fun create() {
        VertexAiRetrieveParams.builder().endpoint("endpoint").build()
    }

    @Test
    fun pathParams() {
        val params = VertexAiRetrieveParams.builder().endpoint("endpoint").build()

        assertThat(params._pathParam(0)).isEqualTo("endpoint")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
