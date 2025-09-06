// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.budget

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BudgetInfoParamsTest {

    @Test
    fun create() {
        BudgetInfoParams.builder().addBudget("string").build()
    }

    @Test
    fun body() {
        val params = BudgetInfoParams.builder().addBudget("string").build()

        val body = params._body()

        assertThat(body.budgets()).containsExactly("string")
    }
}
