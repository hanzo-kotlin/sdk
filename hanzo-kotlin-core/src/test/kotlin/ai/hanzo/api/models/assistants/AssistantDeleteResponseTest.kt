// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.assistants

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssistantDeleteResponseTest {

    @Test
    fun create() {
        val assistantDeleteResponse = AssistantDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val assistantDeleteResponse = AssistantDeleteResponse.builder().build()

        val roundtrippedAssistantDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assistantDeleteResponse),
                jacksonTypeRef<AssistantDeleteResponse>(),
            )

        assertThat(roundtrippedAssistantDeleteResponse).isEqualTo(assistantDeleteResponse)
    }
}
