// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.model.info

import ai.hanzo.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InfoListParamsTest {

    @Test
    fun create() {
        InfoListParams.builder().litellmModelId("litellm_model_id").build()
    }

    @Test
    fun queryParams() {
        val params = InfoListParams.builder().litellmModelId("litellm_model_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("litellm_model_id", "litellm_model_id").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InfoListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
