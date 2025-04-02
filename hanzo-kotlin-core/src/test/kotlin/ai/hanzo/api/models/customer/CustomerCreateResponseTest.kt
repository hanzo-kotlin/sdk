// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.customer

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CustomerCreateResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val customerCreateResponse = CustomerCreateResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreateResponse = CustomerCreateResponse.builder().build()

        val roundtrippedCustomerCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreateResponse),
                jacksonTypeRef<CustomerCreateResponse>(),
            )

        assertThat(roundtrippedCustomerCreateResponse).isEqualTo(customerCreateResponse)
    }
}
