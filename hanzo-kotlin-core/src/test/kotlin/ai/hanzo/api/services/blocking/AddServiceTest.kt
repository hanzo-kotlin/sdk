// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import ai.hanzo.api.models.add.AddAddAllowedIpParams
import ai.hanzo.api.models.add.IpAddress
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AddServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun addAllowedIp() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val addService = client.add()

        val response =
            addService.addAllowedIp(
                AddAddAllowedIpParams.builder()
                    .ipAddress(IpAddress.builder().ip("ip").build())
                    .build()
            )

        response.validate()
    }
}
