// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.engines

import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ChatServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun complete() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val chatService = client.engines().chat()

        val response = chatService.complete("model")

        response.validate()
    }
}
