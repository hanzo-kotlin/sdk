// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.azure

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AzureCreateResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val azureCreateResponse = AzureCreateResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val azureCreateResponse = AzureCreateResponse.builder().build()

        val roundtrippedAzureCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(azureCreateResponse),
                jacksonTypeRef<AzureCreateResponse>(),
            )

        assertThat(roundtrippedAzureCreateResponse).isEqualTo(azureCreateResponse)
    }
}
