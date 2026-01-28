// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AnthropicServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val anthropicServiceAsync = client.anthropic()

        val anthropic = anthropicServiceAsync.create("endpoint")

        anthropic.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val anthropicServiceAsync = client.anthropic()

        val anthropic = anthropicServiceAsync.retrieve("endpoint")

        anthropic.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val anthropicServiceAsync = client.anthropic()

        val anthropic = anthropicServiceAsync.update("endpoint")

        anthropic.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val anthropicServiceAsync = client.anthropic()

        val anthropic = anthropicServiceAsync.delete("endpoint")

        anthropic.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun modify() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val anthropicServiceAsync = client.anthropic()

        val response = anthropicServiceAsync.modify("endpoint")

        response.validate()
    }
}
