// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.spend

import ai.hanzo.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpendCalculateSpendParamsTest {

    @Test
    fun create() {
        SpendCalculateSpendParams.builder()
            .completionResponse(
                SpendCalculateSpendParams.CompletionResponse.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .addMessage(JsonValue.from(mapOf<String, Any>()))
            .model("model")
            .build()
    }

    @Test
    fun body() {
        val params =
            SpendCalculateSpendParams.builder()
                .completionResponse(
                    SpendCalculateSpendParams.CompletionResponse.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addMessage(JsonValue.from(mapOf<String, Any>()))
                .model("model")
                .build()

        val body = params._body()

        assertThat(body.completionResponse())
            .isEqualTo(
                SpendCalculateSpendParams.CompletionResponse.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.messages()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.model()).isEqualTo("model")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SpendCalculateSpendParams.builder().build()

        val body = params._body()
    }
}
