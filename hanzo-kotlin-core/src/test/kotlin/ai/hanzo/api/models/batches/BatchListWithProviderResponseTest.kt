// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.batches

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchListWithProviderResponseTest {

    @Test
    fun create() {
        val batchListWithProviderResponse = BatchListWithProviderResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchListWithProviderResponse = BatchListWithProviderResponse.builder().build()

        val roundtrippedBatchListWithProviderResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchListWithProviderResponse),
                jacksonTypeRef<BatchListWithProviderResponse>(),
            )

        assertThat(roundtrippedBatchListWithProviderResponse)
            .isEqualTo(batchListWithProviderResponse)
    }
}
