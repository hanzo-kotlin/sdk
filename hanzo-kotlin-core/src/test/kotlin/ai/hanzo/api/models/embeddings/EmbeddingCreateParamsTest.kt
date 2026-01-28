// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.embeddings

import ai.hanzo.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmbeddingCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.model()).isEqualTo("model")
        assertThat(body.apiBase()).isEqualTo("api_base")
        assertThat(body.apiKey()).isEqualTo("api_key")
        assertThat(body.apiType()).isEqualTo("api_type")
        assertThat(body.apiVersion()).isEqualTo("api_version")
        assertThat(body.caching()).isEqualTo(true)
        assertThat(body.customLlmProvider())
            .isEqualTo(EmbeddingCreateParams.CustomLlmProvider.ofString("string"))
        assertThat(body.input()).containsExactly("string")
        assertThat(body.litellmCallId()).isEqualTo("litellm_call_id")
        assertThat(body.litellmLoggingObj())
            .isEqualTo(
                EmbeddingCreateParams.LitellmLoggingObj.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.loggerFn()).isEqualTo("logger_fn")
        assertThat(body.timeout()).isEqualTo(0L)
        assertThat(body.user()).isEqualTo("user")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = EmbeddingCreateParams.builder().model("model").build()

        val body = params._body()

        assertThat(body.model()).isEqualTo("model")
    }
}
