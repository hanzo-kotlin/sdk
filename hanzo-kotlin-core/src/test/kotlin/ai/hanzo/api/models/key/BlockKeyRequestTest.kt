// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BlockKeyRequestTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val blockKeyRequest = BlockKeyRequest.builder().key("key").build()

        assertThat(blockKeyRequest.key()).isEqualTo("key")
    }

    @Disabled("skipped: tests are disabled for the time being")
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
