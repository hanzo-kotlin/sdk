// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.organization.info

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InfoDeprecatedParamsTest {

    @Test
    fun create() {
        InfoDeprecatedParams.builder().addOrganization("string").build()
    }

    @Test
    fun body() {
        val params = InfoDeprecatedParams.builder().addOrganization("string").build()

        val body = params._body()

        assertThat(body.organizations()).containsExactly("string")
    }
}
