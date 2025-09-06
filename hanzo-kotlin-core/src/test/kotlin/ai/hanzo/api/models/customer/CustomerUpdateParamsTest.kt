// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.customer

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerUpdateParamsTest {

    @Test
    fun create() {
        CustomerUpdateParams.builder()
            .userId("user_id")
            .alias("alias")
            .allowedModelRegion(CustomerUpdateParams.AllowedModelRegion.EU)
            .blocked(true)
            .budgetId("budget_id")
            .defaultModel("default_model")
            .maxBudget(0.0)
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomerUpdateParams.builder()
                .userId("user_id")
                .alias("alias")
                .allowedModelRegion(CustomerUpdateParams.AllowedModelRegion.EU)
                .blocked(true)
                .budgetId("budget_id")
                .defaultModel("default_model")
                .maxBudget(0.0)
                .build()

        val body = params._body()

        assertThat(body.userId()).isEqualTo("user_id")
        assertThat(body.alias()).isEqualTo("alias")
        assertThat(body.allowedModelRegion()).isEqualTo(CustomerUpdateParams.AllowedModelRegion.EU)
        assertThat(body.blocked()).isEqualTo(true)
        assertThat(body.budgetId()).isEqualTo("budget_id")
        assertThat(body.defaultModel()).isEqualTo("default_model")
        assertThat(body.maxBudget()).isEqualTo(0.0)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CustomerUpdateParams.builder().userId("user_id").build()

        val body = params._body()

        assertThat(body.userId()).isEqualTo("user_id")
    }
}
