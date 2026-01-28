// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.rerank

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RerankCreateResponseTest {

    @Test
    fun create() {
        val rerankCreateResponse = RerankCreateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rerankCreateResponse = RerankCreateResponse.builder().build()

        val roundtrippedRerankCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rerankCreateResponse),
                jacksonTypeRef<RerankCreateResponse>(),
            )

        assertThat(roundtrippedRerankCreateResponse).isEqualTo(rerankCreateResponse)
    }
}
