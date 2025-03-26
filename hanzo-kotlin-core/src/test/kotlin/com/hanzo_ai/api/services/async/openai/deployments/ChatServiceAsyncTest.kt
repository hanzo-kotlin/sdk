// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.openai.deployments

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import com.hanzo_ai.api.models.openai.deployments.chat.ChatCompleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChatServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun complete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatServiceAsync = client.openai().deployments().chat()

        val response =
            chatServiceAsync.complete(ChatCompleteParams.builder().model("model").build())

        response.validate()
    }
}
