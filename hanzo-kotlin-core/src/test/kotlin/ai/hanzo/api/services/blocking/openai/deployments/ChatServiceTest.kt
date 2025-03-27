// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.openai.deployments

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import ai.hanzo.api.models.openai.deployments.chat.ChatCompleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChatServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun complete() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatService = client.openai().deployments().chat()

        val response = chatService.complete(ChatCompleteParams.builder().model("model").build())

        response.validate()
    }
}
