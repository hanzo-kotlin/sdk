// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.bedrock

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BedrockUpdateResponseTest {

    @Test
    fun create() {
        val bedrockUpdateResponse = BedrockUpdateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bedrockUpdateResponse = BedrockUpdateResponse.builder().build()

        val roundtrippedBedrockUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bedrockUpdateResponse),
                jacksonTypeRef<BedrockUpdateResponse>(),
            )

        assertThat(roundtrippedBedrockUpdateResponse).isEqualTo(bedrockUpdateResponse)
    }
}
