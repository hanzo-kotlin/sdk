// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModelDeleteParamsTest {

    @Test
    fun create() {
        ModelDeleteParams.builder().id("id").build()
    }

    @Test
    fun body() {
        val params = ModelDeleteParams.builder().id("id").build()

        val body = params._body()

        assertThat(body.id()).isEqualTo("id")
    }
}
