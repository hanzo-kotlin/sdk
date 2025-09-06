// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.cohere

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CohereCreateResponseTest {

    @Test
    fun create() {
        val cohereCreateResponse = CohereCreateResponse.builder().build()
    }

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
