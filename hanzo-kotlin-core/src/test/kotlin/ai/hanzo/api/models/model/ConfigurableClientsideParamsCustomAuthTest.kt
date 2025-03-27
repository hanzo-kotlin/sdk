// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConfigurableClientsideParamsCustomAuthTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val configurableClientsideParamsCustomAuth =
            ConfigurableClientsideParamsCustomAuth.builder().apiBase("api_base").build()

        assertThat(configurableClientsideParamsCustomAuth.apiBase()).isEqualTo("api_base")
    }
}
