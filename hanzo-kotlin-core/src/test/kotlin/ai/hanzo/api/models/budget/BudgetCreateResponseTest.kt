// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.budget

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BudgetCreateResponseTest {

    @Test
    fun create() {
        val budgetCreateResponse = BudgetCreateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val budgetCreateResponse = BudgetCreateResponse.builder().build()

        val roundtrippedBudgetCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(budgetCreateResponse),
                jacksonTypeRef<BudgetCreateResponse>(),
            )

        assertThat(roundtrippedBudgetCreateResponse).isEqualTo(budgetCreateResponse)
    }
}
