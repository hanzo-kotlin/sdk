// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.customer

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CustomerBlockParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        CustomerBlockParams.builder()
            .blockUsers(BlockUsers.builder().addUserId("string").build())
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
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
