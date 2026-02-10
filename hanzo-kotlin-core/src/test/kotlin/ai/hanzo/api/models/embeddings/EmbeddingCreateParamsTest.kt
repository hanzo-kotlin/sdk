// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.embeddings

import ai.hanzo.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmbeddingCreateParamsTest {

    @Test
    fun create() {
        EmbeddingCreateParams.builder().model("model").build()
    }

    @Test
    fun queryParams() {
        val params = EmbeddingCreateParams.builder().model("model").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("model", "model").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EmbeddingCreateParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
