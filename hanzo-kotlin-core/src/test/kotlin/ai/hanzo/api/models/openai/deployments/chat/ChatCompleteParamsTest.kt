// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.openai.deployments.chat

import ai.hanzo.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCompleteParamsTest {

    @Test
    fun create() {
        ChatCompleteParams.builder()
            .pathModel("model")
            .addMessage(
                ChatCompleteParams.Message.ChatCompletionUserMessage.builder()
                    .content("Hello, how are you?")
                    .cacheControl(
                        ChatCompleteParams.Message.ChatCompletionUserMessage.CacheControl.builder()
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
    }

    @Test
    fun pathParams() {
        val params =
            ChatCompleteParams.builder()
                .pathModel("model")
                .addMessage(
                    ChatCompleteParams.Message.ChatCompletionUserMessage.builder()
                        .content("Hello, how are you?")
                        .build()
                )
                .bodyModel("model")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("model")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.messages())
            .containsExactly(
                ChatCompleteParams.Message.ofChatCompletionUser(
                    ChatCompleteParams.Message.ChatCompletionUserMessage.builder()
                        .content("Hello, how are you?")
                        .cacheControl(
                            ChatCompleteParams.Message.ChatCompletionUserMessage.CacheControl
                                .builder()
                                .build()
                        )
                        .build()
                )
            )
        assertThat(body.bodyModel()).isEqualTo("model")
        assertThat(body.caching()).isEqualTo(true)
        assertThat(body.contextWindowFallbackDict())
            .isEqualTo(
                ChatCompleteParams.ContextWindowFallbackDict.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.fallbacks()).containsExactly("string")
        assertThat(body.frequencyPenalty()).isEqualTo(0.0)
        assertThat(body.functionCall())
            .isEqualTo(ChatCompleteParams.FunctionCall.ofString("string"))
        assertThat(body.functions())
            .containsExactly(
                ChatCompleteParams.Function.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.guardrails()).containsExactly("string")
        assertThat(body.logitBias())
            .isEqualTo(
                ChatCompleteParams.LogitBias.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(body.logprobs()).isEqualTo(true)
        assertThat(body.maxTokens()).isEqualTo(0L)
        assertThat(body.metadata())
            .isEqualTo(
                ChatCompleteParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.n()).isEqualTo(0L)
        assertThat(body.numRetries()).isEqualTo(0L)
        assertThat(body.parallelToolCalls()).isEqualTo(true)
        assertThat(body.presencePenalty()).isEqualTo(0.0)
        assertThat(body.responseFormat())
            .isEqualTo(
                ChatCompleteParams.ResponseFormat.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.seed()).isEqualTo(0L)
        assertThat(body.serviceTier()).isEqualTo("service_tier")
        assertThat(body.stop()).isEqualTo(ChatCompleteParams.Stop.ofString("string"))
        assertThat(body.stream()).isEqualTo(true)
        assertThat(body.streamOptions())
            .isEqualTo(
                ChatCompleteParams.StreamOptions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.temperature()).isEqualTo(0.0)
        assertThat(body.toolChoice()).isEqualTo(ChatCompleteParams.ToolChoice.ofString("string"))
        assertThat(body.tools())
            .containsExactly(
                ChatCompleteParams.Tool.builder()
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
            ChatCompleteParams.builder()
                .pathModel("model")
                .addMessage(
                    ChatCompleteParams.Message.ChatCompletionUserMessage.builder()
                        .content("Hello, how are you?")
                        .build()
                )
                .bodyModel("model")
                .build()

        val body = params._body()

        assertThat(body.messages())
            .containsExactly(
                ChatCompleteParams.Message.ofChatCompletionUser(
                    ChatCompleteParams.Message.ChatCompletionUserMessage.builder()
                        .content("Hello, how are you?")
                        .build()
                )
            )
        assertThat(body.bodyModel()).isEqualTo("model")
    }
}
