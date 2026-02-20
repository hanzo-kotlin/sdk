// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.openai.deployments

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ChatServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun complete() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val chatServiceAsync = client.openai().deployments().chat()

        val response = chatServiceAsync.complete("model")

        response.validate()
    }
}
