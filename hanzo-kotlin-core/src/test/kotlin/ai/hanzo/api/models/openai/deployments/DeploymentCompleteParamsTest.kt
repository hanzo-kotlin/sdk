// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.openai.deployments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeploymentCompleteParamsTest {

    @Test
    fun create() {
        DeploymentCompleteParams.builder().model("model").build()
    }

    @Test
    fun pathParams() {
        val params = DeploymentCompleteParams.builder().model("model").build()

        assertThat(params._pathParam(0)).isEqualTo("model")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
