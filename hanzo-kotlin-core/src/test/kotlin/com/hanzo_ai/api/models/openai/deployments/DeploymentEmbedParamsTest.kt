// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.openai.deployments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DeploymentEmbedParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        DeploymentEmbedParams.builder().model("model").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params = DeploymentEmbedParams.builder().model("model").build()

        assertThat(params._pathParam(0)).isEqualTo("model")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
