// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EuAssemblyaiServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val euAssemblyaiService = client.euAssemblyai()

        val euAssemblyai = euAssemblyaiService.create("endpoint")

        euAssemblyai.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val euAssemblyaiService = client.euAssemblyai()

        val euAssemblyai = euAssemblyaiService.retrieve("endpoint")

        euAssemblyai.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val euAssemblyaiService = client.euAssemblyai()

        val euAssemblyai = euAssemblyaiService.update("endpoint")

        euAssemblyai.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val euAssemblyaiService = client.euAssemblyai()

        val euAssemblyai = euAssemblyaiService.delete("endpoint")

        euAssemblyai.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun patch() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val euAssemblyaiService = client.euAssemblyai()

        val response = euAssemblyaiService.patch("endpoint")

        response.validate()
    }
}
