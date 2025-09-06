// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.cohere

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CohereDeleteResponseTest {

    @Test
    fun create() {
        val cohereDeleteResponse = CohereDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cohereDeleteResponse = CohereDeleteResponse.builder().build()

        val roundtrippedCohereDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cohereDeleteResponse),
                jacksonTypeRef<CohereDeleteResponse>(),
            )

        assertThat(roundtrippedCohereDeleteResponse).isEqualTo(cohereDeleteResponse)
    }
}
