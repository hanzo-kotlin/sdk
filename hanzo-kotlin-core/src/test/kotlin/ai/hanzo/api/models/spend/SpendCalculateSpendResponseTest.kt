// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.spend

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpendCalculateSpendResponseTest {

    @Test
    fun create() {
        val spendCalculateSpendResponse = SpendCalculateSpendResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val spendCalculateSpendResponse = SpendCalculateSpendResponse.builder().build()

        val roundtrippedSpendCalculateSpendResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(spendCalculateSpendResponse),
                jacksonTypeRef<SpendCalculateSpendResponse>(),
            )

        assertThat(roundtrippedSpendCalculateSpendResponse).isEqualTo(spendCalculateSpendResponse)
    }
}
