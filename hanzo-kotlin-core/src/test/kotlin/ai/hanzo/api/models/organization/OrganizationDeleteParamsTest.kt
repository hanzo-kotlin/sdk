// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.organization

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OrganizationDeleteParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        OrganizationDeleteParams.builder().addOrganizationId("string").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params = OrganizationDeleteParams.builder().addOrganizationId("string").build()

        val body = params._body()

        assertThat(body.organizationIds()).containsExactly("string")
    }
}
