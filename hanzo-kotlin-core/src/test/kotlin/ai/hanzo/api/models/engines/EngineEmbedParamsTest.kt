// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.engines

import ai.hanzo.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EngineEmbedParamsTest {

    @Test
    fun create() {
        EngineEmbedParams.builder()
            .pathModel("model")
            .bodyModel("model")
            .apiBase("api_base")
            .apiKey("api_key")
            .apiType("api_type")
            .apiVersion("api_version")
            .caching(true)
            .customLlmProvider("string")
            .addInput("string")
            .litellmCallId("litellm_call_id")
            .litellmLoggingObj(
                EngineEmbedParams.LitellmLoggingObj.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .loggerFn("logger_fn")
            .timeout(0L)
            .user("user")
            .build()
    }

    @Test
    fun pathParams() {
        val params = EngineEmbedParams.builder().pathModel("model").bodyModel("model").build()

        assertThat(params._pathParam(0)).isEqualTo("model")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            EngineEmbedParams.builder()
                .pathModel("model")
                .bodyModel("model")
                .apiBase("api_base")
                .apiKey("api_key")
                .apiType("api_type")
                .apiVersion("api_version")
                .caching(true)
                .customLlmProvider("string")
                .addInput("string")
                .litellmCallId("litellm_call_id")
                .litellmLoggingObj(
                    EngineEmbedParams.LitellmLoggingObj.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .loggerFn("logger_fn")
                .timeout(0L)
                .user("user")
                .build()

        val body = params._body()

        assertThat(body.bodyModel()).isEqualTo("model")
        assertThat(body.apiBase()).isEqualTo("api_base")
        assertThat(body.apiKey()).isEqualTo("api_key")
        assertThat(body.apiType()).isEqualTo("api_type")
        assertThat(body.apiVersion()).isEqualTo("api_version")
        assertThat(body.caching()).isEqualTo(true)
        assertThat(body.customLlmProvider())
            .isEqualTo(EngineEmbedParams.CustomLlmProvider.ofString("string"))
        assertThat(body.input()).containsExactly("string")
        assertThat(body.litellmCallId()).isEqualTo("litellm_call_id")
        assertThat(body.litellmLoggingObj())
            .isEqualTo(
                EngineEmbedParams.LitellmLoggingObj.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.loggerFn()).isEqualTo("logger_fn")
        assertThat(body.timeout()).isEqualTo(0L)
        assertThat(body.user()).isEqualTo("user")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = EngineEmbedParams.builder().pathModel("model").bodyModel("model").build()

        val body = params._body()

        assertThat(body.bodyModel()).isEqualTo("model")
    }
}
