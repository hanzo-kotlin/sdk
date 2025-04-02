// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.global.spend

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SpendResetResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val spendResetResponse = SpendResetResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val spendResetResponse = SpendResetResponse.builder().build()

        val roundtrippedSpendResetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(spendResetResponse),
                jacksonTypeRef<SpendResetResponse>(),
            )

        assertThat(roundtrippedSpendResetResponse).isEqualTo(spendResetResponse)
    }
}
