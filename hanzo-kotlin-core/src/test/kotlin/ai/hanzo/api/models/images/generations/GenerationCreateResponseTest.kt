// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.images.generations

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GenerationCreateResponseTest {

    @Test
    fun create() {
        val generationCreateResponse = GenerationCreateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val generationCreateResponse = GenerationCreateResponse.builder().build()

        val roundtrippedGenerationCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(generationCreateResponse),
                jacksonTypeRef<GenerationCreateResponse>(),
            )

        assertThat(roundtrippedGenerationCreateResponse).isEqualTo(generationCreateResponse)
    }
}
