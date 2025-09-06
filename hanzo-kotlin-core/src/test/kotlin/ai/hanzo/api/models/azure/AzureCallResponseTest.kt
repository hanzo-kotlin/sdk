// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.azure

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AzureCallResponseTest {

    @Test
    fun create() {
        val azureCallResponse = AzureCallResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val azureCallResponse = AzureCallResponse.builder().build()

        val roundtrippedAzureCallResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(azureCallResponse),
                jacksonTypeRef<AzureCallResponse>(),
            )

        assertThat(roundtrippedAzureCallResponse).isEqualTo(azureCallResponse)
    }
}
