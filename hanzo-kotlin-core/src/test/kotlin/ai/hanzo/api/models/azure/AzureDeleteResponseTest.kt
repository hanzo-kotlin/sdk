// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.azure

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AzureDeleteResponseTest {

    @Test
    fun create() {
        val azureDeleteResponse = AzureDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val azureDeleteResponse = AzureDeleteResponse.builder().build()

        val roundtrippedAzureDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(azureDeleteResponse),
                jacksonTypeRef<AzureDeleteResponse>(),
            )

        assertThat(roundtrippedAzureDeleteResponse).isEqualTo(azureDeleteResponse)
    }
}
