// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.rerank

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RerankCreateV2ResponseTest {

    @Test
    fun create() {
        val rerankCreateV2Response = RerankCreateV2Response.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rerankCreateV2Response = RerankCreateV2Response.builder().build()

        val roundtrippedRerankCreateV2Response =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rerankCreateV2Response),
                jacksonTypeRef<RerankCreateV2Response>(),
            )

        assertThat(roundtrippedRerankCreateV2Response).isEqualTo(rerankCreateV2Response)
    }
}
