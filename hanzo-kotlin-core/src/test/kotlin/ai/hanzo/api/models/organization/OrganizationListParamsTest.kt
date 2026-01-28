// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.organization

import ai.hanzo.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationListParamsTest {

    @Test
    fun create() {
        OrganizationListParams.builder().orgAlias("org_alias").orgId("org_id").build()
    }

    @Test
    fun queryParams() {
        val params = OrganizationListParams.builder().orgAlias("org_alias").orgId("org_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("org_alias", "org_alias").put("org_id", "org_id").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = OrganizationListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
