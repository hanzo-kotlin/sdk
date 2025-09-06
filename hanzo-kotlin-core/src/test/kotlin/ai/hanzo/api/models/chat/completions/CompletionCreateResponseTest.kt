// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.chat.completions

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompletionCreateResponseTest {

    @Test
    fun create() {
        val completionCreateResponse = CompletionCreateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val completionCreateResponse = CompletionCreateResponse.builder().build()

        val roundtrippedCompletionCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(completionCreateResponse),
                jacksonTypeRef<CompletionCreateResponse>(),
            )

        assertThat(roundtrippedCompletionCreateResponse).isEqualTo(completionCreateResponse)
    }
}
