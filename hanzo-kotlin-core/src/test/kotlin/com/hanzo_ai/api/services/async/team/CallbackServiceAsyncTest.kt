// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.team

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.models.team.callback.CallbackAddParams
import com.hanzo_ai.api.models.team.callback.CallbackRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CallbackServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun retrieve() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val callbackServiceAsync = client.team().callback()

        val callback =
            callbackServiceAsync.retrieve(
                CallbackRetrieveParams.builder().teamId("team_id").build()
            )

        callback.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun add() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val callbackServiceAsync = client.team().callback()

        val response =
            callbackServiceAsync.add(
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
