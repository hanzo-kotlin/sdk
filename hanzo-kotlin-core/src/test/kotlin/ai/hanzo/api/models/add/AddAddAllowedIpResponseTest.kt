// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.add

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AddAddAllowedIpResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val addAddAllowedIpResponse = AddAddAllowedIpResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addAddAllowedIpResponse = AddAddAllowedIpResponse.builder().build()

        val roundtrippedAddAddAllowedIpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addAddAllowedIpResponse),
                jacksonTypeRef<AddAddAllowedIpResponse>(),
            )

        assertThat(roundtrippedAddAddAllowedIpResponse).isEqualTo(addAddAllowedIpResponse)
    }
}
