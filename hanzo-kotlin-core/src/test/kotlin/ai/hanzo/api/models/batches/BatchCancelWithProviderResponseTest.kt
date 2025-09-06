// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.batches

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchCancelWithProviderResponseTest {

    @Test
    fun create() {
        val batchCancelWithProviderResponse = BatchCancelWithProviderResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchCancelWithProviderResponse = BatchCancelWithProviderResponse.builder().build()

        val roundtrippedBatchCancelWithProviderResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchCancelWithProviderResponse),
                jacksonTypeRef<BatchCancelWithProviderResponse>(),
            )

        assertThat(roundtrippedBatchCancelWithProviderResponse)
            .isEqualTo(batchCancelWithProviderResponse)
    }
}
