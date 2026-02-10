// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.model

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigurableClientsideParamsCustomAuthTest {

    @Test
    fun create() {
        val configurableClientsideParamsCustomAuth =
            ConfigurableClientsideParamsCustomAuth.builder().apiBase("api_base").build()

        assertThat(configurableClientsideParamsCustomAuth.apiBase()).isEqualTo("api_base")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val configurableClientsideParamsCustomAuth =
            ConfigurableClientsideParamsCustomAuth.builder().apiBase("api_base").build()

        val roundtrippedConfigurableClientsideParamsCustomAuth =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(configurableClientsideParamsCustomAuth),
                jacksonTypeRef<ConfigurableClientsideParamsCustomAuth>(),
            )

        assertThat(roundtrippedConfigurableClientsideParamsCustomAuth)
            .isEqualTo(configurableClientsideParamsCustomAuth)
    }
}
