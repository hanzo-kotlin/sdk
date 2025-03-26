// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import com.hanzo_ai.api.models.add.IpAddress
import com.hanzo_ai.api.models.delete.DeleteCreateAllowedIpParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DeleteServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun createAllowedIp() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deleteServiceAsync = client.delete()

        val response =
            deleteServiceAsync.createAllowedIp(
                DeleteCreateAllowedIpParams.builder()
                    .ipAddress(IpAddress.builder().ip("ip").build())
                    .build()
            )

        response.validate()
    }
}
