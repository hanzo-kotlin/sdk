// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.models.engines.EngineEmbedParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EngineServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun complete() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val engineService = client.engines()

        val response = engineService.complete("model")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun embed() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val engineService = client.engines()

        val response =
            engineService.embed(
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
