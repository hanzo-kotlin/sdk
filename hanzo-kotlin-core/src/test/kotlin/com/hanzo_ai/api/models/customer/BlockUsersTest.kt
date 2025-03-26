// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.customer

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BlockUsersTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val blockUsers = BlockUsers.builder().addUserId("string").build()

        assertThat(blockUsers.userIds()).containsExactly("string")
    }
}
