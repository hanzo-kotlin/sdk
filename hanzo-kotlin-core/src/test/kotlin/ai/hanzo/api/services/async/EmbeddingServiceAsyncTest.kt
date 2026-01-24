// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.models.embeddings.EmbeddingCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EmbeddingServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val embeddingServiceAsync = client.embeddings()

        val embedding =
            embeddingServiceAsync.create(
                EmbeddingCreateParams.builder()
                    .model("model")
                    .apiBase("api_base")
                    .apiKey("api_key")
                    .apiType("api_type")
                    .apiVersion("api_version")
                    .caching(true)
                    .customLlmProvider("string")
                    .addInput("string")
                    .litellmCallId("litellm_call_id")
                    .litellmLoggingObj(
                        EmbeddingCreateParams.LitellmLoggingObj.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .loggerFn("logger_fn")
                    .timeout(0L)
                    .user("user")
                    .build()
            )

        embedding.validate()
    }
}
