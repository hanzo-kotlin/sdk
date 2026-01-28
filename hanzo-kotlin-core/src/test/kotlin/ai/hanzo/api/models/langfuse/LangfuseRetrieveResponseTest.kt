// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.langfuse

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LangfuseRetrieveResponseTest {

    @Test
    fun create() {
        val langfuseRetrieveResponse = LangfuseRetrieveResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val langfuseRetrieveResponse = LangfuseRetrieveResponse.builder().build()

        val roundtrippedLangfuseRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(langfuseRetrieveResponse),
                jacksonTypeRef<LangfuseRetrieveResponse>(),
            )

        assertThat(roundtrippedLangfuseRetrieveResponse).isEqualTo(langfuseRetrieveResponse)
    }
}
