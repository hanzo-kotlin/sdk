// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AssemblyaiServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val assemblyaiService = client.assemblyai()

        val assemblyai = assemblyaiService.create("endpoint")

        assemblyai.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val assemblyaiService = client.assemblyai()

        val assemblyai = assemblyaiService.retrieve("endpoint")

        assemblyai.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val assemblyaiService = client.assemblyai()

        val assemblyai = assemblyaiService.update("endpoint")

        assemblyai.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val assemblyaiService = client.assemblyai()

        val assemblyai = assemblyaiService.delete("endpoint")

        assemblyai.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun patch() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val assemblyaiService = client.assemblyai()

        val response = assemblyaiService.patch("endpoint")

        response.validate()
    }
}
