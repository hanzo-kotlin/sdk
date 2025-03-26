// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.budget

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BudgetDeleteParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        BudgetDeleteParams.builder().id("id").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params = BudgetDeleteParams.builder().id("id").build()

        val body = params._body()

        assertThat(body.id()).isEqualTo("id")
    }
}
