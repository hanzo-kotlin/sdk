// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClient
import com.hanzo_ai.api.models.add.IpAddress
import com.hanzo_ai.api.models.delete.DeleteCreateAllowedIpParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DeleteServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun createAllowedIp() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deleteService = client.delete()

        val response =
            deleteService.createAllowedIp(
                DeleteCreateAllowedIpParams.builder()
                    .ipAddress(IpAddress.builder().ip("ip").build())
                    .build()
            )

        response.validate()
    }
}
