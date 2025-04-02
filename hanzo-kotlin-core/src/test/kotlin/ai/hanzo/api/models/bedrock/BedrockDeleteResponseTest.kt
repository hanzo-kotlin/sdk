// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.bedrock

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BedrockDeleteResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val bedrockDeleteResponse = BedrockDeleteResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bedrockDeleteResponse = BedrockDeleteResponse.builder().build()

        val roundtrippedBedrockDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bedrockDeleteResponse),
                jacksonTypeRef<BedrockDeleteResponse>(),
            )

        assertThat(roundtrippedBedrockDeleteResponse).isEqualTo(bedrockDeleteResponse)
    }
}
