// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.customer

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CustomerUpdateResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val customerUpdateResponse = CustomerUpdateResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerUpdateResponse = CustomerUpdateResponse.builder().build()

        val roundtrippedCustomerUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerUpdateResponse),
                jacksonTypeRef<CustomerUpdateResponse>(),
            )

        assertThat(roundtrippedCustomerUpdateResponse).isEqualTo(customerUpdateResponse)
    }
}
