// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.customer

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerUnblockResponseTest {

    @Test
    fun create() {
        val customerUnblockResponse = CustomerUnblockResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerUnblockResponse = CustomerUnblockResponse.builder().build()

        val roundtrippedCustomerUnblockResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerUnblockResponse),
                jacksonTypeRef<CustomerUnblockResponse>(),
            )

        assertThat(roundtrippedCustomerUnblockResponse).isEqualTo(customerUnblockResponse)
    }
}
