// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.spend

import ai.hanzo.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SpendCalculateSpendParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        SpendCalculateSpendParams.builder()
            .completionResponse(JsonValue.from(mapOf<String, Any>()))
            .addMessage(JsonValue.from(mapOf<String, Any>()))
            .model("model")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            SpendCalculateSpendParams.builder()
                .completionResponse(JsonValue.from(mapOf<String, Any>()))
                .addMessage(JsonValue.from(mapOf<String, Any>()))
                .model("model")
                .build()

        val body = params._body()

        assertThat(body._completionResponse()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.messages()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.model()).isEqualTo("model")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = SpendCalculateSpendParams.builder().build()

        val body = params._body()
    }
}
