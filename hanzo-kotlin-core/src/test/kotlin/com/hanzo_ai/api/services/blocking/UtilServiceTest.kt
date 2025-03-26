// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClient
import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.models.utils.UtilGetSupportedOpenAIParamsParams
import com.hanzo_ai.api.models.utils.UtilTokenCounterParams
import com.hanzo_ai.api.models.utils.UtilTransformRequestParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UtilServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
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
                    .model("model")
                    .addMessage(JsonValue.from(mapOf<String, Any>()))
                    .prompt("prompt")
                    .build()
            )

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
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
                    .requestBody(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        response.validate()
    }
}
