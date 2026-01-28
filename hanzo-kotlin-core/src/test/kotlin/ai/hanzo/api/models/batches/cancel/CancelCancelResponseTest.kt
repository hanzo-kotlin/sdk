// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.batches.cancel

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CancelCancelResponseTest {

    @Test
    fun create() {
        val cancelCancelResponse = CancelCancelResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cancelCancelResponse = CancelCancelResponse.builder().build()

        val roundtrippedCancelCancelResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cancelCancelResponse),
                jacksonTypeRef<CancelCancelResponse>(),
            )

        assertThat(roundtrippedCancelCancelResponse).isEqualTo(cancelCancelResponse)
    }
}
