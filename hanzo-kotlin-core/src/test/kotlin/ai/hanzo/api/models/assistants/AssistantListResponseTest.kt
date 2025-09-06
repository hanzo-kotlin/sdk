// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.assistants

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssistantListResponseTest {

    @Test
    fun create() {
        val assistantListResponse = AssistantListResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val assistantListResponse = AssistantListResponse.builder().build()

        val roundtrippedAssistantListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assistantListResponse),
                jacksonTypeRef<AssistantListResponse>(),
            )

        assertThat(roundtrippedAssistantListResponse).isEqualTo(assistantListResponse)
    }
}
