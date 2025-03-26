// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.key

import com.hanzo_ai.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class KeyBlockParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        KeyBlockParams.builder()
            .llmChangedBy("llm-changed-by")
            .blockKeyRequest(BlockKeyRequest.builder().key("key").build())
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun headers() {
        val params =
            KeyBlockParams.builder()
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
            KeyBlockParams.builder()
                .blockKeyRequest(BlockKeyRequest.builder().key("key").build())
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            KeyBlockParams.builder()
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
            KeyBlockParams.builder()
                .blockKeyRequest(BlockKeyRequest.builder().key("key").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(BlockKeyRequest.builder().key("key").build())
    }
}
