// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.azure

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AzurePatchResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val azurePatchResponse = AzurePatchResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
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
