// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.assistants

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AssistantCreateResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val assistantCreateResponse = AssistantCreateResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val assistantCreateResponse = AssistantCreateResponse.builder().build()

        val roundtrippedAssistantCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assistantCreateResponse),
                jacksonTypeRef<AssistantCreateResponse>(),
            )

        assertThat(roundtrippedAssistantCreateResponse).isEqualTo(assistantCreateResponse)
    }
}
