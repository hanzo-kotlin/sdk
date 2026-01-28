// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.chat.completions

import ai.hanzo.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompletionCreateParamsTest {

    @Test
    fun create() {
        CompletionCreateParams.builder()
            .addMessage(
                CompletionCreateParams.Message.ChatCompletionUserMessage.builder()
                    .content("Hello, how are you?")
                    .cacheControl(
                        CompletionCreateParams.Message.ChatCompletionUserMessage.CacheControl
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
    }

    @Test
    fun body() {
        val params =
            CompletionCreateParams.builder()
                .addMessage(
                    CompletionCreateParams.Message.ChatCompletionUserMessage.builder()
                        .content("Hello, how are you?")
                        .cacheControl(
                            CompletionCreateParams.Message.ChatCompletionUserMessage.CacheControl
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

        val body = params._body()

        assertThat(body.messages())
            .containsExactly(
                CompletionCreateParams.Message.ofChatCompletionUser(
                    CompletionCreateParams.Message.ChatCompletionUserMessage.builder()
                        .content("Hello, how are you?")
                        .cacheControl(
                            CompletionCreateParams.Message.ChatCompletionUserMessage.CacheControl
                                .builder()
                                .build()
                        )
                        .build()
                )
            )
        assertThat(body.model()).isEqualTo("model")
        assertThat(body.caching()).isEqualTo(true)
        assertThat(body.contextWindowFallbackDict())
            .isEqualTo(
                CompletionCreateParams.ContextWindowFallbackDict.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.fallbacks()).containsExactly("string")
        assertThat(body.frequencyPenalty()).isEqualTo(0.0)
        assertThat(body.functionCall())
            .isEqualTo(CompletionCreateParams.FunctionCall.ofString("string"))
        assertThat(body.functions())
            .containsExactly(
                CompletionCreateParams.Function.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.guardrails()).containsExactly("string")
        assertThat(body.logitBias())
            .isEqualTo(
                CompletionCreateParams.LogitBias.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(body.logprobs()).isEqualTo(true)
        assertThat(body.maxTokens()).isEqualTo(0L)
        assertThat(body.metadata())
            .isEqualTo(
                CompletionCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.n()).isEqualTo(0L)
        assertThat(body.numRetries()).isEqualTo(0L)
        assertThat(body.parallelToolCalls()).isEqualTo(true)
        assertThat(body.presencePenalty()).isEqualTo(0.0)
        assertThat(body.responseFormat())
            .isEqualTo(
                CompletionCreateParams.ResponseFormat.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.seed()).isEqualTo(0L)
        assertThat(body.serviceTier()).isEqualTo("service_tier")
        assertThat(body.stop()).isEqualTo(CompletionCreateParams.Stop.ofString("string"))
        assertThat(body.stream()).isEqualTo(true)
        assertThat(body.streamOptions())
            .isEqualTo(
                CompletionCreateParams.StreamOptions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.temperature()).isEqualTo(0.0)
        assertThat(body.toolChoice())
            .isEqualTo(CompletionCreateParams.ToolChoice.ofString("string"))
        assertThat(body.tools())
            .containsExactly(
                CompletionCreateParams.Tool.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.topLogprobs()).isEqualTo(0L)
        assertThat(body.topP()).isEqualTo(0.0)
        assertThat(body.user()).isEqualTo("user")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CompletionCreateParams.builder()
                .addMessage(
                    CompletionCreateParams.Message.ChatCompletionUserMessage.builder()
                        .content("Hello, how are you?")
                        .build()
                )
                .model("model")
                .build()

        val body = params._body()

        assertThat(body.messages())
            .containsExactly(
                CompletionCreateParams.Message.ofChatCompletionUser(
                    CompletionCreateParams.Message.ChatCompletionUserMessage.builder()
                        .content("Hello, how are you?")
                        .build()
                )
            )
        assertThat(body.model()).isEqualTo("model")
    }
}
