// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.budget

import ai.hanzo.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BudgetSettingsParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        BudgetSettingsParams.builder().budgetId("budget_id").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params = BudgetSettingsParams.builder().budgetId("budget_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("budget_id", "budget_id").build())
    }
}
