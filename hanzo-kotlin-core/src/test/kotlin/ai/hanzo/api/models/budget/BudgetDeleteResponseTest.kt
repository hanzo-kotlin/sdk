// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.budget

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BudgetDeleteResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val budgetDeleteResponse = BudgetDeleteResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val budgetDeleteResponse = BudgetDeleteResponse.builder().build()

        val roundtrippedBudgetDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(budgetDeleteResponse),
                jacksonTypeRef<BudgetDeleteResponse>(),
            )

        assertThat(roundtrippedBudgetDeleteResponse).isEqualTo(budgetDeleteResponse)
    }
}
