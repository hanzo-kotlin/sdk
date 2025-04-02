// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.langfuse

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LangfusePatchResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val langfusePatchResponse = LangfusePatchResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val langfusePatchResponse = LangfusePatchResponse.builder().build()

        val roundtrippedLangfusePatchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(langfusePatchResponse),
                jacksonTypeRef<LangfusePatchResponse>(),
            )

        assertThat(roundtrippedLangfusePatchResponse).isEqualTo(langfusePatchResponse)
    }
}
