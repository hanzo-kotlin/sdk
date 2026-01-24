// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.engines

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.models.engines.chat.ChatCompleteParams
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
        val chatServiceAsync = client.engines().chat()

        val response =
            chatServiceAsync.complete(
                ChatCompleteParams.builder()
                    .pathModel("model")
                    .addMessage(
                        ChatCompleteParams.Message.ChatCompletionUserMessage.builder()
                            .content("Hello, how are you?")
                            .cacheControl(
                                ChatCompleteParams.Message.ChatCompletionUserMessage.CacheControl
                                    .builder()
                                    .build()
                            )
                            .build()
                    )
                    .bodyModel("model")
                    .caching(true)
                    .contextWindowFallbackDict(
                        ChatCompleteParams.ContextWindowFallbackDict.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .addFallback("string")
                    .frequencyPenalty(0.0)
                    .functionCall("string")
                    .addFunction(
                        ChatCompleteParams.Function.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .addGuardrail("string")
                    .logitBias(
                        ChatCompleteParams.LogitBias.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .logprobs(true)
                    .maxTokens(0L)
                    .metadata(
                        ChatCompleteParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .n(0L)
                    .numRetries(0L)
                    .parallelToolCalls(true)
                    .presencePenalty(0.0)
                    .responseFormat(
                        ChatCompleteParams.ResponseFormat.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .seed(0L)
                    .serviceTier("service_tier")
                    .stop("string")
                    .stream(true)
                    .streamOptions(
                        ChatCompleteParams.StreamOptions.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .temperature(0.0)
                    .toolChoice("string")
                    .addTool(
                        ChatCompleteParams.Tool.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .topLogprobs(0L)
                    .topP(0.0)
                    .user("user")
                    .build()
            )

        response.validate()
    }
}
