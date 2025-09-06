// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.add.AddAddAllowedIpParams
import ai.hanzo.api.models.add.IpAddress
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AddServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun addAllowedIp() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val addServiceAsync = client.add()

        val response =
            addServiceAsync.addAllowedIp(
                AddAddAllowedIpParams.builder()
                    .ipAddress(IpAddress.builder().ip("ip").build())
                    .build()
            )

        response.validate()
    }
}
