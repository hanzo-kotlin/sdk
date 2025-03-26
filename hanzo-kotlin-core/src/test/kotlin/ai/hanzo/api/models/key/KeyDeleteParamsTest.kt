// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

import ai.hanzo.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class KeyDeleteParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        KeyDeleteParams.builder()
            .llmChangedBy("llm-changed-by")
            .addKeyAlias("string")
            .addKey("string")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun headers() {
        val params =
            KeyDeleteParams.builder()
                .llmChangedBy("llm-changed-by")
                .addKeyAlias("string")
                .addKey("string")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("llm-changed-by", "llm-changed-by").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun headersWithoutOptionalFields() {
        val params = KeyDeleteParams.builder().build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            KeyDeleteParams.builder()
                .llmChangedBy("llm-changed-by")
                .addKeyAlias("string")
                .addKey("string")
                .build()

        val body = params._body()

        assertThat(body.keyAliases()).containsExactly("string")
        assertThat(body.keys()).containsExactly("string")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = KeyDeleteParams.builder().build()

        val body = params._body()
    }
}
