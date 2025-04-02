// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.batches

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchRetrieveWithProviderResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val batchRetrieveWithProviderResponse = BatchRetrieveWithProviderResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchRetrieveWithProviderResponse = BatchRetrieveWithProviderResponse.builder().build()

        val roundtrippedBatchRetrieveWithProviderResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchRetrieveWithProviderResponse),
                jacksonTypeRef<BatchRetrieveWithProviderResponse>(),
            )

        assertThat(roundtrippedBatchRetrieveWithProviderResponse)
            .isEqualTo(batchRetrieveWithProviderResponse)
    }
}
