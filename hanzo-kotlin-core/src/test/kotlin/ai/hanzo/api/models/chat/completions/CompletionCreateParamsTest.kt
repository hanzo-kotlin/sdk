// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.chat.completions

import ai.hanzo.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompletionCreateParamsTest {

    @Test
    fun create() {
        CompletionCreateParams.builder().model("model").build()
    }

    @Test
    fun queryParams() {
        val params = CompletionCreateParams.builder().model("model").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("model", "model").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CompletionCreateParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
