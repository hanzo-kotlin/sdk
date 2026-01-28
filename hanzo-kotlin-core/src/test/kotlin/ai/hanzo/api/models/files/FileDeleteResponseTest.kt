// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.files

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileDeleteResponseTest {

    @Test
    fun create() {
        val fileDeleteResponse = FileDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileDeleteResponse = FileDeleteResponse.builder().build()

        val roundtrippedFileDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileDeleteResponse),
                jacksonTypeRef<FileDeleteResponse>(),
            )

        assertThat(roundtrippedFileDeleteResponse).isEqualTo(fileDeleteResponse)
    }
}
