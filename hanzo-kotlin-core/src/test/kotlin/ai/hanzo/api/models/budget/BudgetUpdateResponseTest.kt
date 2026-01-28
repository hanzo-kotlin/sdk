// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.budget

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BudgetUpdateResponseTest {

    @Test
    fun create() {
        val budgetUpdateResponse = BudgetUpdateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val budgetUpdateResponse = BudgetUpdateResponse.builder().build()

        val roundtrippedBudgetUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(budgetUpdateResponse),
                jacksonTypeRef<BudgetUpdateResponse>(),
            )

        assertThat(roundtrippedBudgetUpdateResponse).isEqualTo(budgetUpdateResponse)
    }
}
