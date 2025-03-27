// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class KeyListResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val keyListResponse =
            KeyListResponse.builder()
                .currentPage(0L)
                .addKey("string")
                .totalCount(0L)
                .totalPages(0L)
                .build()

        assertThat(keyListResponse.currentPage()).isEqualTo(0L)
        assertThat(keyListResponse.keys()).containsExactly(KeyListResponse.Key.ofString("string"))
        assertThat(keyListResponse.totalCount()).isEqualTo(0L)
        assertThat(keyListResponse.totalPages()).isEqualTo(0L)
    }
}
