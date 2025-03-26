// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking.team

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClient
import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.models.team.callback.CallbackAddParams
import com.hanzo_ai.api.models.team.callback.CallbackRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CallbackServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val callbackService = client.team().callback()

        val callback =
            callbackService.retrieve(CallbackRetrieveParams.builder().teamId("team_id").build())

        callback.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun add() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val callbackService = client.team().callback()

        val response =
            callbackService.add(
                CallbackAddParams.builder()
                    .teamId("team_id")
                    .llmChangedBy("llm-changed-by")
                    .callbackName("callback_name")
                    .callbackVars(
                        CallbackAddParams.CallbackVars.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .callbackType(CallbackAddParams.CallbackType.SUCCESS)
                    .build()
            )

        response.validate()
    }
}
