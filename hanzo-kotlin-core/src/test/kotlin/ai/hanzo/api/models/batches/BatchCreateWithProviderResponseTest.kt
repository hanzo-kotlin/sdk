// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.batches

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchCreateWithProviderResponseTest {

    @Test
    fun create() {
        val batchCreateWithProviderResponse = BatchCreateWithProviderResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchCreateWithProviderResponse = BatchCreateWithProviderResponse.builder().build()

        val roundtrippedBatchCreateWithProviderResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchCreateWithProviderResponse),
                jacksonTypeRef<BatchCreateWithProviderResponse>(),
            )

        assertThat(roundtrippedBatchCreateWithProviderResponse)
            .isEqualTo(batchCreateWithProviderResponse)
    }
}
