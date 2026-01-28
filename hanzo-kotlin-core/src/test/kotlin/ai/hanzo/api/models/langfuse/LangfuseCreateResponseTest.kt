// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.langfuse

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LangfuseCreateResponseTest {

    @Test
    fun create() {
        val langfuseCreateResponse = LangfuseCreateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val langfuseCreateResponse = LangfuseCreateResponse.builder().build()

        val roundtrippedLangfuseCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(langfuseCreateResponse),
                jacksonTypeRef<LangfuseCreateResponse>(),
            )

        assertThat(roundtrippedLangfuseCreateResponse).isEqualTo(langfuseCreateResponse)
    }
}
