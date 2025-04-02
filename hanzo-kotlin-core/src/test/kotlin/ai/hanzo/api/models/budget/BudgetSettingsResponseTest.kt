// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.budget

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BudgetSettingsResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val budgetSettingsResponse = BudgetSettingsResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val budgetSettingsResponse = BudgetSettingsResponse.builder().build()

        val roundtrippedBudgetSettingsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(budgetSettingsResponse),
                jacksonTypeRef<BudgetSettingsResponse>(),
            )

        assertThat(roundtrippedBudgetSettingsResponse).isEqualTo(budgetSettingsResponse)
    }
}
