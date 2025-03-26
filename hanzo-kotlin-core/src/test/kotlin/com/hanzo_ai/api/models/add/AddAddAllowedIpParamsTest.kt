// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.add

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AddAddAllowedIpParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        AddAddAllowedIpParams.builder().ipAddress(IpAddress.builder().ip("ip").build()).build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            AddAddAllowedIpParams.builder().ipAddress(IpAddress.builder().ip("ip").build()).build()

        val body = params._body()

        assertThat(body).isEqualTo(IpAddress.builder().ip("ip").build())
    }
}
