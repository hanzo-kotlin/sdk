// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.budget

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BudgetDeleteParamsTest {

    @Test
    fun create() {
        BudgetDeleteParams.builder().id("id").build()
    }

    @Test
    fun body() {
        val params = BudgetDeleteParams.builder().id("id").build()

        val body = params._body()

        assertThat(body.id()).isEqualTo("id")
    }
}
