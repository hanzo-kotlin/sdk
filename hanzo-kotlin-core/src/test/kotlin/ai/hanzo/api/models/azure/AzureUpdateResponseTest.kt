// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.azure

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AzureUpdateResponseTest {

    @Test
    fun create() {
        val azureUpdateResponse = AzureUpdateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val azureUpdateResponse = AzureUpdateResponse.builder().build()

        val roundtrippedAzureUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(azureUpdateResponse),
                jacksonTypeRef<AzureUpdateResponse>(),
            )

        assertThat(roundtrippedAzureUpdateResponse).isEqualTo(azureUpdateResponse)
    }
}
