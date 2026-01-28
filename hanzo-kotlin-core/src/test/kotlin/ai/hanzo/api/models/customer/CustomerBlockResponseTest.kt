// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.customer

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerBlockResponseTest {

    @Test
    fun create() {
        val customerBlockResponse = CustomerBlockResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerBlockResponse = CustomerBlockResponse.builder().build()

        val roundtrippedCustomerBlockResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerBlockResponse),
                jacksonTypeRef<CustomerBlockResponse>(),
            )

        assertThat(roundtrippedCustomerBlockResponse).isEqualTo(customerBlockResponse)
    }
}
