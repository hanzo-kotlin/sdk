// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.organization.info

import ai.hanzo.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InfoRetrieveParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        InfoRetrieveParams.builder().organizationId("organization_id").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params = InfoRetrieveParams.builder().organizationId("organization_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("organization_id", "organization_id").build())
    }
}
