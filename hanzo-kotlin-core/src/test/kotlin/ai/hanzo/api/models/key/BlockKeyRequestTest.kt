// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

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
}
