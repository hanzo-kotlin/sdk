// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.files.content

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ContentRetrieveResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val contentRetrieveResponse = ContentRetrieveResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contentRetrieveResponse = ContentRetrieveResponse.builder().build()

        val roundtrippedContentRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contentRetrieveResponse),
                jacksonTypeRef<ContentRetrieveResponse>(),
            )

        assertThat(roundtrippedContentRetrieveResponse).isEqualTo(contentRetrieveResponse)
    }
}
