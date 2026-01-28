// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.bedrock

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BedrockPatchResponseTest {

    @Test
    fun create() {
        val bedrockPatchResponse = BedrockPatchResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bedrockPatchResponse = BedrockPatchResponse.builder().build()

        val roundtrippedBedrockPatchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bedrockPatchResponse),
                jacksonTypeRef<BedrockPatchResponse>(),
            )

        assertThat(roundtrippedBedrockPatchResponse).isEqualTo(bedrockPatchResponse)
    }
}
