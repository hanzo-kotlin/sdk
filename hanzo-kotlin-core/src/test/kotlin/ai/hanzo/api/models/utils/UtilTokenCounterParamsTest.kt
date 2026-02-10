// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.utils

import ai.hanzo.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UtilTokenCounterParamsTest {

    @Test
    fun create() {
        UtilTokenCounterParams.builder()
            .model("model")
            .addMessage(JsonValue.from(mapOf<String, Any>()))
            .prompt("prompt")
            .build()
    }

    @Test
    fun body() {
        val params =
            UtilTokenCounterParams.builder()
                .model("model")
                .addMessage(JsonValue.from(mapOf<String, Any>()))
                .prompt("prompt")
                .build()

        val body = params._body()

        assertThat(body.model()).isEqualTo("model")
        assertThat(body.messages()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.prompt()).isEqualTo("prompt")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = UtilTokenCounterParams.builder().model("model").build()

        val body = params._body()

        assertThat(body.model()).isEqualTo("model")
    }
}
