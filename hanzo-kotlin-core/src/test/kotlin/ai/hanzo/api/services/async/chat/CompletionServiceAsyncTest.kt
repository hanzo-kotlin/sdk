// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.chat

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.models.chat.completions.CompletionCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CompletionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val completionServiceAsync = client.chat().completions()

        val completion =
            completionServiceAsync.create(
                CompletionCreateParams.builder()
                    .addMessage(
                        CompletionCreateParams.Message.ChatCompletionUserMessage.builder()
                            .content("Hello, how are you?")
                            .cacheControl(
                                CompletionCreateParams.Message.ChatCompletionUserMessage
                                    .CacheControl
                                    .builder()
                                    .build()
                            )
                            .build()
                    )
                    .model("model")
                    .caching(true)
                    .contextWindowFallbackDict(
                        CompletionCreateParams.ContextWindowFallbackDict.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .addFallback("string")
                    .frequencyPenalty(0.0)
                    .functionCall("string")
                    .addFunction(
                        CompletionCreateParams.Function.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .addGuardrail("string")
                    .logitBias(
                        CompletionCreateParams.LogitBias.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .logprobs(true)
                    .maxTokens(0L)
                    .metadata(
                        CompletionCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .n(0L)
                    .numRetries(0L)
                    .parallelToolCalls(true)
                    .presencePenalty(0.0)
                    .responseFormat(
                        CompletionCreateParams.ResponseFormat.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .seed(0L)
                    .serviceTier("service_tier")
                    .stop("string")
                    .stream(true)
                    .streamOptions(
                        CompletionCreateParams.StreamOptions.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .temperature(0.0)
                    .toolChoice("string")
                    .addTool(
                        CompletionCreateParams.Tool.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .topLogprobs(0L)
                    .topP(0.0)
                    .user("user")
                    .build()
            )

        completion.validate()
    }
}
