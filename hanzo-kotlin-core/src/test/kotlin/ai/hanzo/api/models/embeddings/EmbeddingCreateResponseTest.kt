// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.embeddings

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmbeddingCreateResponseTest {

    @Test
    fun create() {
        val embeddingCreateResponse = EmbeddingCreateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val embeddingCreateResponse = EmbeddingCreateResponse.builder().build()

        val roundtrippedEmbeddingCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(embeddingCreateResponse),
                jacksonTypeRef<EmbeddingCreateResponse>(),
            )

        assertThat(roundtrippedEmbeddingCreateResponse).isEqualTo(embeddingCreateResponse)
    }
}
