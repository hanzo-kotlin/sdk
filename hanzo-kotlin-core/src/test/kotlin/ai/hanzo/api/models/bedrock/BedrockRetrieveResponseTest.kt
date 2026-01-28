// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.bedrock

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BedrockRetrieveResponseTest {

    @Test
    fun create() {
        val bedrockRetrieveResponse = BedrockRetrieveResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bedrockRetrieveResponse = BedrockRetrieveResponse.builder().build()

        val roundtrippedBedrockRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bedrockRetrieveResponse),
                jacksonTypeRef<BedrockRetrieveResponse>(),
            )

        assertThat(roundtrippedBedrockRetrieveResponse).isEqualTo(bedrockRetrieveResponse)
    }
}
