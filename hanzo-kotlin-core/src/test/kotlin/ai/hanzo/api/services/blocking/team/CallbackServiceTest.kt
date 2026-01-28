// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.team

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClient
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.models.team.callback.CallbackAddParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CallbackServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val callbackService = client.team().callback()

        val callback = callbackService.retrieve("team_id")

        callback.validate()
    }

    @Disabled("Prism tests are disabled")
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
                    .litellmChangedBy("litellm-changed-by")
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
