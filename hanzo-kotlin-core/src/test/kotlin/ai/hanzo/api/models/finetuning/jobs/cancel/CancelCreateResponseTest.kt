// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.finetuning.jobs.cancel

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CancelCreateResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val cancelCreateResponse = CancelCreateResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cancelCreateResponse = CancelCreateResponse.builder().build()

        val roundtrippedCancelCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cancelCreateResponse),
                jacksonTypeRef<CancelCreateResponse>(),
            )

        assertThat(roundtrippedCancelCreateResponse).isEqualTo(cancelCreateResponse)
    }
}
