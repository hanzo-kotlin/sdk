// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.customer

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerBlockParamsTest {

    @Test
    fun create() {
        CustomerBlockParams.builder()
            .blockUsers(BlockUsers.builder().addUserId("string").build())
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomerBlockParams.builder()
                .blockUsers(BlockUsers.builder().addUserId("string").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(BlockUsers.builder().addUserId("string").build())
    }
}
