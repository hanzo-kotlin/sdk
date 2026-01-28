// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.models.engines.EngineEmbedParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EngineServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun complete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val engineServiceAsync = client.engines()

        val response = engineServiceAsync.complete("model")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun embed() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val engineServiceAsync = client.engines()

        val response =
            engineServiceAsync.embed(
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
            )

        response.validate()
    }
}
