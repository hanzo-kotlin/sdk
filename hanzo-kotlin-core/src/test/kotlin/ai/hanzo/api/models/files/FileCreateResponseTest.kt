// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.files

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileCreateResponseTest {

    @Test
    fun create() {
        val fileCreateResponse = FileCreateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileCreateResponse = FileCreateResponse.builder().build()

        val roundtrippedFileCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileCreateResponse),
                jacksonTypeRef<FileCreateResponse>(),
            )

        assertThat(roundtrippedFileCreateResponse).isEqualTo(fileCreateResponse)
    }
}
