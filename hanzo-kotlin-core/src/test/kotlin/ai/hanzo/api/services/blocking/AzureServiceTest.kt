// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AzureServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val azureService = client.azure()

        val azure = azureService.create("endpoint")

        azure.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val azureService = client.azure()

        val azure = azureService.update("endpoint")

        azure.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val azureService = client.azure()

        val azure = azureService.delete("endpoint")

        azure.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun call() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val azureService = client.azure()

        val response = azureService.call("endpoint")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun patch() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val azureService = client.azure()

        val response = azureService.patch("endpoint")

        response.validate()
    }
}
