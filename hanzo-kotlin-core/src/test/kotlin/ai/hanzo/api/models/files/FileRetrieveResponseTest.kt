// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.files

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FileRetrieveResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val fileRetrieveResponse = FileRetrieveResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileRetrieveResponse = FileRetrieveResponse.builder().build()

        val roundtrippedFileRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileRetrieveResponse),
                jacksonTypeRef<FileRetrieveResponse>(),
            )

        assertThat(roundtrippedFileRetrieveResponse).isEqualTo(fileRetrieveResponse)
    }
}
