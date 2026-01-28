// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.utils

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UtilGetSupportedOpenAIParamsResponseTest {

    @Test
    fun create() {
        val utilGetSupportedOpenAIParamsResponse =
            UtilGetSupportedOpenAIParamsResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val utilGetSupportedOpenAIParamsResponse =
            UtilGetSupportedOpenAIParamsResponse.builder().build()

        val roundtrippedUtilGetSupportedOpenAIParamsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(utilGetSupportedOpenAIParamsResponse),
                jacksonTypeRef<UtilGetSupportedOpenAIParamsResponse>(),
            )

        assertThat(roundtrippedUtilGetSupportedOpenAIParamsResponse)
            .isEqualTo(utilGetSupportedOpenAIParamsResponse)
    }
}
