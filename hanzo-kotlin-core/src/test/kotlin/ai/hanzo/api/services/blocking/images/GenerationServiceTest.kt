// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.images

import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GenerationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HanzoOkHttpClient.builder().apiKey("My API Key").build()
        val generationService = client.images().generations()

        val generation = generationService.create()

        generation.validate()
    }
}
