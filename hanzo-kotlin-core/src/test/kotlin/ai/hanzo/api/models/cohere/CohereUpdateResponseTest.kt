// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.cohere

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CohereUpdateResponseTest {

    @Test
    fun create() {
        val cohereUpdateResponse = CohereUpdateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cohereUpdateResponse = CohereUpdateResponse.builder().build()

        val roundtrippedCohereUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cohereUpdateResponse),
                jacksonTypeRef<CohereUpdateResponse>(),
            )

        assertThat(roundtrippedCohereUpdateResponse).isEqualTo(cohereUpdateResponse)
    }
}
