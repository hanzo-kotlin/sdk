// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.openai.deployments

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChatServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun complete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatServiceAsync = client.openai().deployments().chat()

        val response = chatServiceAsync.complete("model")

        response.validate()
    }
}
