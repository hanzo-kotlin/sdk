// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClient
import com.hanzo_ai.api.models.azure.AzureCallParams
import com.hanzo_ai.api.models.azure.AzureCreateParams
import com.hanzo_ai.api.models.azure.AzureDeleteParams
import com.hanzo_ai.api.models.azure.AzurePatchParams
import com.hanzo_ai.api.models.azure.AzureUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AzureServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val azureService = client.azure()

        val azure = azureService.create(AzureCreateParams.builder().endpoint("endpoint").build())

        azure.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val azureService = client.azure()

        val azure = azureService.update(AzureUpdateParams.builder().endpoint("endpoint").build())

        azure.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val azureService = client.azure()

        val azure = azureService.delete(AzureDeleteParams.builder().endpoint("endpoint").build())

        azure.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun call() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val azureService = client.azure()

        val response = azureService.call(AzureCallParams.builder().endpoint("endpoint").build())

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun patch() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val azureService = client.azure()

        val response = azureService.patch(AzurePatchParams.builder().endpoint("endpoint").build())

        response.validate()
    }
}
