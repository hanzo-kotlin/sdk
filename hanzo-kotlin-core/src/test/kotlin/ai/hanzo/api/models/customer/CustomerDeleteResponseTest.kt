// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.customer

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerDeleteResponseTest {

    @Test
    fun create() {
        val customerDeleteResponse = CustomerDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerDeleteResponse = CustomerDeleteResponse.builder().build()

        val roundtrippedCustomerDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerDeleteResponse),
                jacksonTypeRef<CustomerDeleteResponse>(),
            )

        assertThat(roundtrippedCustomerDeleteResponse).isEqualTo(customerDeleteResponse)
    }
}
