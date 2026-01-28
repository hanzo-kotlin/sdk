// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.moderations

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModerationCreateResponseTest {

    @Test
    fun create() {
        val moderationCreateResponse = ModerationCreateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val moderationCreateResponse = ModerationCreateResponse.builder().build()

        val roundtrippedModerationCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(moderationCreateResponse),
                jacksonTypeRef<ModerationCreateResponse>(),
            )

        assertThat(roundtrippedModerationCreateResponse).isEqualTo(moderationCreateResponse)
    }
}
