// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.langfuse

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LangfuseDeleteResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val langfuseDeleteResponse = LangfuseDeleteResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val langfuseDeleteResponse = LangfuseDeleteResponse.builder().build()

        val roundtrippedLangfuseDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(langfuseDeleteResponse),
                jacksonTypeRef<LangfuseDeleteResponse>(),
            )

        assertThat(roundtrippedLangfuseDeleteResponse).isEqualTo(langfuseDeleteResponse)
    }
}
