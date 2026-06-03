// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.chat

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.chat.completions.CompletionCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CompletionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val completionServiceAsync = client.chat().completions()

        val completion =
            completionServiceAsync.create(CompletionCreateParams.builder().model("model").build())

        completion.validate()
    }
}
