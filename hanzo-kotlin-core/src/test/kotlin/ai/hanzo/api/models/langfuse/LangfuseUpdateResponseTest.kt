// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.langfuse

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LangfuseUpdateResponseTest {

    @Test
    fun create() {
        val langfuseUpdateResponse = LangfuseUpdateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val langfuseUpdateResponse = LangfuseUpdateResponse.builder().build()

        val roundtrippedLangfuseUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(langfuseUpdateResponse),
                jacksonTypeRef<LangfuseUpdateResponse>(),
            )

        assertThat(roundtrippedLangfuseUpdateResponse).isEqualTo(langfuseUpdateResponse)
    }
}
