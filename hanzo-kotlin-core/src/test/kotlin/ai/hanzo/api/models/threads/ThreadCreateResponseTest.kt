// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.threads

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreadCreateResponseTest {

    @Test
    fun create() {
        val threadCreateResponse = ThreadCreateResponse.builder().build()
    }

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
