// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.add.IpAddress
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DeleteServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun createAllowedIp() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deleteServiceAsync = client.delete()

        val response = deleteServiceAsync.createAllowedIp(IpAddress.builder().ip("ip").build())

        response.validate()
    }
}
