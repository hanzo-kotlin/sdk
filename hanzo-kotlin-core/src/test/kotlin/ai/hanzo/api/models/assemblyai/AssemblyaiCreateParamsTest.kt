// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.assemblyai

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssemblyaiCreateParamsTest {

    @Test
    fun create() {
        AssemblyaiCreateParams.builder().endpoint("endpoint").build()
    }

    @Test
    fun pathParams() {
        val params = AssemblyaiCreateParams.builder().endpoint("endpoint").build()

        assertThat(params._pathParam(0)).isEqualTo("endpoint")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
