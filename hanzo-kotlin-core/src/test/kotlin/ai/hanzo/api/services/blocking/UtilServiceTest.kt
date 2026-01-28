// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.models.utils.UtilGetSupportedOpenAIParamsParams
import ai.hanzo.api.models.utils.UtilTokenCounterParams
import ai.hanzo.api.models.utils.UtilTransformRequestParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UtilServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun getSupportedOpenAIParams() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val utilService = client.utils()

        val response =
            utilService.getSupportedOpenAIParams(
                UtilGetSupportedOpenAIParamsParams.builder().model("model").build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun tokenCounter() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val utilService = client.utils()

        val response =
            utilService.tokenCounter(
                UtilTokenCounterParams.builder()
                    .callEndpoint(true)
                    .model("model")
                    .addContent(
                        UtilTokenCounterParams.Content.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .addMessage(
                        UtilTokenCounterParams.Message.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .prompt("prompt")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun transformRequest() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val utilService = client.utils()

        val response =
            utilService.transformRequest(
                UtilTransformRequestParams.builder()
                    .callType(UtilTransformRequestParams.CallType.EMBEDDING)
                    .requestBody(
                        UtilTransformRequestParams.RequestBody.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
