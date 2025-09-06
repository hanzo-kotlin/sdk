// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.add

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IpAddressTest {

    @Test
    fun create() {
        val ipAddress = IpAddress.builder().ip("ip").build()

        assertThat(ipAddress.ip()).isEqualTo("ip")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ipAddress = IpAddress.builder().ip("ip").build()

        val roundtrippedIpAddress =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ipAddress),
                jacksonTypeRef<IpAddress>(),
            )

        assertThat(roundtrippedIpAddress).isEqualTo(ipAddress)
    }
}
