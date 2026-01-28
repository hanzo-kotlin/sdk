// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.budget

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BudgetListResponseTest {

    @Test
    fun create() {
        val budgetListResponse = BudgetListResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val budgetListResponse = BudgetListResponse.builder().build()

        val roundtrippedBudgetListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(budgetListResponse),
                jacksonTypeRef<BudgetListResponse>(),
            )

        assertThat(roundtrippedBudgetListResponse).isEqualTo(budgetListResponse)
    }
}
