// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.modelgroup

import ai.hanzo.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModelGroupRetrieveInfoParamsTest {

    @Test
    fun create() {
        ModelGroupRetrieveInfoParams.builder().modelGroup("model_group").build()
    }

    @Test
    fun queryParams() {
        val params = ModelGroupRetrieveInfoParams.builder().modelGroup("model_group").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("model_group", "model_group").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ModelGroupRetrieveInfoParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
