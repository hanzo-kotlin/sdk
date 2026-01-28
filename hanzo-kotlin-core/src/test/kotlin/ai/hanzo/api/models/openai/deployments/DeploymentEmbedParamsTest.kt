// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.openai.deployments

import ai.hanzo.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeploymentEmbedParamsTest {

    @Test
    fun create() {
        DeploymentEmbedParams.builder()
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
                DeploymentEmbedParams.LitellmLoggingObj.builder()
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
        val params = DeploymentEmbedParams.builder().pathModel("model").bodyModel("model").build()

        assertThat(params._pathParam(0)).isEqualTo("model")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DeploymentEmbedParams.builder()
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
                    DeploymentEmbedParams.LitellmLoggingObj.builder()
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
            .isEqualTo(DeploymentEmbedParams.CustomLlmProvider.ofString("string"))
        assertThat(body.input()).containsExactly("string")
        assertThat(body.litellmCallId()).isEqualTo("litellm_call_id")
        assertThat(body.litellmLoggingObj())
            .isEqualTo(
                DeploymentEmbedParams.LitellmLoggingObj.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.loggerFn()).isEqualTo("logger_fn")
        assertThat(body.timeout()).isEqualTo(0L)
        assertThat(body.user()).isEqualTo("user")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = DeploymentEmbedParams.builder().pathModel("model").bodyModel("model").build()

        val body = params._body()

        assertThat(body.bodyModel()).isEqualTo("model")
    }
}
