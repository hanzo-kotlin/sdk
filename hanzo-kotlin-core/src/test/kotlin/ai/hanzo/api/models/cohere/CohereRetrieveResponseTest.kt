// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.cohere

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CohereRetrieveResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val cohereRetrieveResponse = CohereRetrieveResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cohereRetrieveResponse = CohereRetrieveResponse.builder().build()

        val roundtrippedCohereRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cohereRetrieveResponse),
                jacksonTypeRef<CohereRetrieveResponse>(),
            )

        assertThat(roundtrippedCohereRetrieveResponse).isEqualTo(cohereRetrieveResponse)
    }
}
