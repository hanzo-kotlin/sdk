// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.add.IpAddress
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AddServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun addAllowedIp() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val addServiceAsync = client.add()

        val response = addServiceAsync.addAllowedIp(IpAddress.builder().ip("ip").build())

        response.validate()
    }
}
