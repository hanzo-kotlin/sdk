// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.azure

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AzurePatchResponseTest {

    @Test
    fun create() {
        val azurePatchResponse = AzurePatchResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val azurePatchResponse = AzurePatchResponse.builder().build()

        val roundtrippedAzurePatchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(azurePatchResponse),
                jacksonTypeRef<AzurePatchResponse>(),
            )

        assertThat(roundtrippedAzurePatchResponse).isEqualTo(azurePatchResponse)
    }
}
