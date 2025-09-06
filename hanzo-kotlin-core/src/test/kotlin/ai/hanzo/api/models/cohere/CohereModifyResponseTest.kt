// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.cohere

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CohereModifyResponseTest {

    @Test
    fun create() {
        val cohereModifyResponse = CohereModifyResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cohereModifyResponse = CohereModifyResponse.builder().build()

        val roundtrippedCohereModifyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cohereModifyResponse),
                jacksonTypeRef<CohereModifyResponse>(),
            )

        assertThat(roundtrippedCohereModifyResponse).isEqualTo(cohereModifyResponse)
    }
}
