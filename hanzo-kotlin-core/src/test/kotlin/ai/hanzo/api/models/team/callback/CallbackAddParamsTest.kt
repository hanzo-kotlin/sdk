// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team.callback

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CallbackAddParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
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
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params =
            CallbackAddParams.builder()
                .teamId("team_id")
                .callbackName("callback_name")
                .callbackVars(
                    CallbackAddParams.CallbackVars.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("team_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun headers() {
        val params =
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

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("llm-changed-by", "llm-changed-by").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun headersWithoutOptionalFields() {
        val params =
            CallbackAddParams.builder()
                .teamId("team_id")
                .callbackName("callback_name")
                .callbackVars(
                    CallbackAddParams.CallbackVars.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.callbackName()).isEqualTo("callback_name")
        assertThat(body.callbackVars())
            .isEqualTo(
                CallbackAddParams.CallbackVars.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.callbackType()).isEqualTo(CallbackAddParams.CallbackType.SUCCESS)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CallbackAddParams.builder()
                .teamId("team_id")
                .callbackName("callback_name")
                .callbackVars(
                    CallbackAddParams.CallbackVars.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.callbackName()).isEqualTo("callback_name")
        assertThat(body.callbackVars())
            .isEqualTo(
                CallbackAddParams.CallbackVars.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }
}
