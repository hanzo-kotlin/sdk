// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AnthropicServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val anthropicService = client.anthropic()

        val anthropic = anthropicService.create("endpoint")

        anthropic.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val anthropicService = client.anthropic()

        val anthropic = anthropicService.retrieve("endpoint")

        anthropic.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val anthropicService = client.anthropic()

        val anthropic = anthropicService.update("endpoint")

        anthropic.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val anthropicService = client.anthropic()

        val anthropic = anthropicService.delete("endpoint")

        anthropic.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun modify() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val anthropicService = client.anthropic()

        val response = anthropicService.modify("endpoint")

        response.validate()
    }
}
