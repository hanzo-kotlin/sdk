// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.files

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileRetrieveParamsTest {

    @Test
    fun create() {
        FileRetrieveParams.builder().provider("provider").fileId("file_id").build()
    }

    @Test
    fun pathParams() {
        val params = FileRetrieveParams.builder().provider("provider").fileId("file_id").build()

        assertThat(params._pathParam(0)).isEqualTo("provider")
        assertThat(params._pathParam(1)).isEqualTo("file_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
