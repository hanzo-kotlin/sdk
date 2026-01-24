// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.images

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.images.generations.GenerationCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GenerationServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val generationServiceAsync = client.images().generations()

        val generation =
            generationServiceAsync.create(GenerationCreateParams.builder().model("model").build())

        generation.validate()
    }
}
