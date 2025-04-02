// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.threads

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ThreadRetrieveResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val threadRetrieveResponse = ThreadRetrieveResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val threadRetrieveResponse = ThreadRetrieveResponse.builder().build()

        val roundtrippedThreadRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(threadRetrieveResponse),
                jacksonTypeRef<ThreadRetrieveResponse>(),
            )

        assertThat(roundtrippedThreadRetrieveResponse).isEqualTo(threadRetrieveResponse)
    }
}
