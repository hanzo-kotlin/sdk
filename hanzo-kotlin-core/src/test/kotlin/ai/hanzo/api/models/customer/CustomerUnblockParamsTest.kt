// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.customer

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerUnblockParamsTest {

    @Test
    fun create() {
        CustomerUnblockParams.builder()
            .blockUsers(BlockUsers.builder().addUserId("string").build())
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomerUnblockParams.builder()
                .blockUsers(BlockUsers.builder().addUserId("string").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(BlockUsers.builder().addUserId("string").build())
    }
}
