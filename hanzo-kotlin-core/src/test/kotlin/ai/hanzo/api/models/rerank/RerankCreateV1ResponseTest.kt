// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.rerank

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RerankCreateV1ResponseTest {

    @Test
    fun create() {
        val rerankCreateV1Response = RerankCreateV1Response.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rerankCreateV1Response = RerankCreateV1Response.builder().build()

        val roundtrippedRerankCreateV1Response =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rerankCreateV1Response),
                jacksonTypeRef<RerankCreateV1Response>(),
            )

        assertThat(roundtrippedRerankCreateV1Response).isEqualTo(rerankCreateV1Response)
    }
}
