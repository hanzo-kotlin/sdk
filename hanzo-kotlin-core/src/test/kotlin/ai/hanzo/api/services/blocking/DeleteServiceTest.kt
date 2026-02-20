// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import ai.hanzo.api.models.add.IpAddress
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DeleteServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createAllowedIp() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val deleteService = client.delete()

        val response = deleteService.createAllowedIp(IpAddress.builder().ip("ip").build())

        response.validate()
    }
}
