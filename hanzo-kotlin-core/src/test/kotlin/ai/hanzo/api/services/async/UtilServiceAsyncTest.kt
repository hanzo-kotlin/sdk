// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.models.utils.UtilGetSupportedOpenAIParamsParams
import ai.hanzo.api.models.utils.UtilTokenCounterParams
import ai.hanzo.api.models.utils.UtilTransformRequestParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UtilServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun getSupportedOpenAIParams() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val utilServiceAsync = client.utils()

        val response =
            utilServiceAsync.getSupportedOpenAIParams(
                UtilGetSupportedOpenAIParamsParams.builder().model("model").build()
            )

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun tokenCounter() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val utilServiceAsync = client.utils()

        val response =
            utilServiceAsync.tokenCounter(
                UtilTokenCounterParams.builder()
                    .model("model")
                    .addMessage(JsonValue.from(mapOf<String, Any>()))
                    .prompt("prompt")
                    .build()
            )

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun transformRequest() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val utilServiceAsync = client.utils()

        val response =
            utilServiceAsync.transformRequest(
                UtilTransformRequestParams.builder()
                    .callType(UtilTransformRequestParams.CallType.EMBEDDING)
                    .requestBody(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        response.validate()
    }
}
