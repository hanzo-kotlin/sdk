// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.batches

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchListResponseTest {

    @Test
    fun create() {
        val batchListResponse = BatchListResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchListResponse = BatchListResponse.builder().build()

        val roundtrippedBatchListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchListResponse),
                jacksonTypeRef<BatchListResponse>(),
            )

        assertThat(roundtrippedBatchListResponse).isEqualTo(batchListResponse)
    }
}
