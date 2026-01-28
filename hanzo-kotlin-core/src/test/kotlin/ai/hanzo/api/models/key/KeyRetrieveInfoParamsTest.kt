// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

import ai.hanzo.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KeyRetrieveInfoParamsTest {

    @Test
    fun create() {
        KeyRetrieveInfoParams.builder().key("key").build()
    }

    @Test
    fun queryParams() {
        val params = KeyRetrieveInfoParams.builder().key("key").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = KeyRetrieveInfoParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
