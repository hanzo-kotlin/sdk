// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.chat

import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import ai.hanzo.api.models.chat.completions.CompletionCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CompletionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val completionService = client.chat().completions()

        val completion =
            completionService.create(CompletionCreateParams.builder().model("model").build())

        completion.validate()
    }
}
