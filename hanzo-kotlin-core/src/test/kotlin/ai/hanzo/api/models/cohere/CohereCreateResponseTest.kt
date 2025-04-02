// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.cohere

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CohereCreateResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val cohereCreateResponse = CohereCreateResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cohereCreateResponse = CohereCreateResponse.builder().build()

        val roundtrippedCohereCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cohereCreateResponse),
                jacksonTypeRef<CohereCreateResponse>(),
            )

        assertThat(roundtrippedCohereCreateResponse).isEqualTo(cohereCreateResponse)
    }
}
