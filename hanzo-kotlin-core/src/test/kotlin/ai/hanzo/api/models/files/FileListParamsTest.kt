// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.files

import ai.hanzo.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileListParamsTest {

    @Test
    fun create() {
        FileListParams.builder().provider("provider").purpose("purpose").build()
    }

    @Test
    fun pathParams() {
        val params = FileListParams.builder().provider("provider").build()

        assertThat(params._pathParam(0)).isEqualTo("provider")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = FileListParams.builder().provider("provider").purpose("purpose").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("purpose", "purpose").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FileListParams.builder().provider("provider").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
