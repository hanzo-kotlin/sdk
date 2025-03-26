// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.add

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IpAddressTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val ipAddress = IpAddress.builder().ip("ip").build()

        assertThat(ipAddress.ip()).isEqualTo("ip")
    }
}
