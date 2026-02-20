// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import ai.hanzo.api.models.add.IpAddress
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AddServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun addAllowedIp() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val addService = client.add()

        val response = addService.addAllowedIp(IpAddress.builder().ip("ip").build())

        response.validate()
    }
}
