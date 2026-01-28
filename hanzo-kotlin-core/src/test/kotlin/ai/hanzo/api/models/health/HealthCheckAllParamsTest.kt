// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.health

import ai.hanzo.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HealthCheckAllParamsTest {

    @Test
    fun create() {
        HealthCheckAllParams.builder().model("model").modelId("model_id").build()
    }

    @Test
    fun queryParams() {
        val params = HealthCheckAllParams.builder().model("model").modelId("model_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("model", "model").put("model_id", "model_id").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = HealthCheckAllParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
