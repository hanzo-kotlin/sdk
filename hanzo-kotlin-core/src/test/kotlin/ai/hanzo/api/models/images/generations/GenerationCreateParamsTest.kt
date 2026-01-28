// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.images.generations

import ai.hanzo.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GenerationCreateParamsTest {

    @Test
    fun create() {
        GenerationCreateParams.builder().model("model").build()
    }

    @Test
    fun queryParams() {
        val params = GenerationCreateParams.builder().model("model").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("model", "model").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = GenerationCreateParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
