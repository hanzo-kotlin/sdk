// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.threads

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ThreadCreateResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val threadCreateResponse = ThreadCreateResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val threadCreateResponse = ThreadCreateResponse.builder().build()

        val roundtrippedThreadCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(threadCreateResponse),
                jacksonTypeRef<ThreadCreateResponse>(),
            )

        assertThat(roundtrippedThreadCreateResponse).isEqualTo(threadCreateResponse)
    }
}
