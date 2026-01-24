// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

import ai.hanzo.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KeyBlockParamsTest {

    @Test
    fun create() {
        KeyBlockParams.builder()
            .litellmChangedBy("litellm-changed-by")
            .blockKeyRequest(BlockKeyRequest.builder().key("key").build())
            .build()
    }

    @Test
    fun headers() {
        val params =
            KeyBlockParams.builder()
                .litellmChangedBy("litellm-changed-by")
                .blockKeyRequest(BlockKeyRequest.builder().key("key").build())
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("litellm-changed-by", "litellm-changed-by").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            KeyBlockParams.builder()
                .blockKeyRequest(BlockKeyRequest.builder().key("key").build())
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            KeyBlockParams.builder()
                .litellmChangedBy("litellm-changed-by")
                .blockKeyRequest(BlockKeyRequest.builder().key("key").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(BlockKeyRequest.builder().key("key").build())
    }

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
