// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

import ai.hanzo.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KeyDeleteParamsTest {

    @Test
    fun create() {
        KeyDeleteParams.builder()
            .litellmChangedBy("litellm-changed-by")
            .addKeyAlias("string")
            .addKey("string")
            .build()
    }

    @Test
    fun headers() {
        val params =
            KeyDeleteParams.builder()
                .litellmChangedBy("litellm-changed-by")
                .addKeyAlias("string")
                .addKey("string")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("litellm-changed-by", "litellm-changed-by").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = KeyDeleteParams.builder().build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            KeyDeleteParams.builder()
                .litellmChangedBy("litellm-changed-by")
                .addKeyAlias("string")
                .addKey("string")
                .build()

        val body = params._body()

        assertThat(body.keyAliases()).containsExactly("string")
        assertThat(body.keys()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = KeyDeleteParams.builder().build()

        val body = params._body()
    }
}
