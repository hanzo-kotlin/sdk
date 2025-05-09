// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.team

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.models.team.callback.CallbackAddParams
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

        val callback = callbackServiceAsync.retrieve("team_id")

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
