// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.health

import ai.hanzo.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HealthCheckAllParamsTest {

    @Test
    fun create() {
        HealthCheckAllParams.builder().model("model").build()
    }

    @Test
    fun queryParams() {
        val params = HealthCheckAllParams.builder().model("model").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("model", "model").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = HealthCheckAllParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
