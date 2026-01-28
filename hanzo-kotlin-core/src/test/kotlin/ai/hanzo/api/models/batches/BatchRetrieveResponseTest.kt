// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.batches

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchRetrieveResponseTest {

    @Test
    fun create() {
        val batchRetrieveResponse = BatchRetrieveResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchRetrieveResponse = BatchRetrieveResponse.builder().build()

        val roundtrippedBatchRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchRetrieveResponse),
                jacksonTypeRef<BatchRetrieveResponse>(),
            )

        assertThat(roundtrippedBatchRetrieveResponse).isEqualTo(batchRetrieveResponse)
    }
}
