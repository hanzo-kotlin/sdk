// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BlockKeyRequestTest {

    @Test
    fun create() {
        val blockKeyRequest = BlockKeyRequest.builder().key("key").build()

        assertThat(blockKeyRequest.key()).isEqualTo("key")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val blockKeyRequest = BlockKeyRequest.builder().key("key").build()

        val roundtrippedBlockKeyRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(blockKeyRequest),
                jacksonTypeRef<BlockKeyRequest>(),
            )

        assertThat(roundtrippedBlockKeyRequest).isEqualTo(blockKeyRequest)
    }
}
