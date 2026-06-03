// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VertexAiServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val vertexAiService = client.vertexAi()

        val vertexAi = vertexAiService.create("endpoint")

        vertexAi.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val vertexAiService = client.vertexAi()

        val vertexAi = vertexAiService.retrieve("endpoint")

        vertexAi.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val vertexAiService = client.vertexAi()

        val vertexAi = vertexAiService.update("endpoint")

        vertexAi.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val vertexAiService = client.vertexAi()

        val vertexAi = vertexAiService.delete("endpoint")

        vertexAi.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun patch() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val vertexAiService = client.vertexAi()

        val response = vertexAiService.patch("endpoint")

        response.validate()
    }
}
