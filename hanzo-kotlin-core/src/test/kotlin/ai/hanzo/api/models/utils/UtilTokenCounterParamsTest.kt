// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.utils

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UtilTokenCounterParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun queryParams() {
        val params =
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("call_endpoint", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = UtilTokenCounterParams.builder().model("model").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.model()).isEqualTo("model")
        assertThat(body.contents())
            .containsExactly(
                UtilTokenCounterParams.Content.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.messages())
            .containsExactly(
                UtilTokenCounterParams.Message.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.prompt()).isEqualTo("prompt")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = UtilTokenCounterParams.builder().model("model").build()

        val body = params._body()

        assertThat(body.model()).isEqualTo("model")
    }
}
