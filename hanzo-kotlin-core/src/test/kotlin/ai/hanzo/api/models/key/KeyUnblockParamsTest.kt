// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

import ai.hanzo.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class KeyUnblockParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        KeyUnblockParams.builder()
            .llmChangedBy("llm-changed-by")
            .blockKeyRequest(BlockKeyRequest.builder().key("key").build())
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun headers() {
        val params =
            KeyUnblockParams.builder()
                .llmChangedBy("llm-changed-by")
                .blockKeyRequest(BlockKeyRequest.builder().key("key").build())
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("llm-changed-by", "llm-changed-by").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun headersWithoutOptionalFields() {
        val params =
            KeyUnblockParams.builder()
                .blockKeyRequest(BlockKeyRequest.builder().key("key").build())
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            KeyUnblockParams.builder()
                .llmChangedBy("llm-changed-by")
                .blockKeyRequest(BlockKeyRequest.builder().key("key").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(BlockKeyRequest.builder().key("key").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            KeyUnblockParams.builder()
                .blockKeyRequest(BlockKeyRequest.builder().key("key").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(BlockKeyRequest.builder().key("key").build())
    }
}
