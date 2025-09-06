// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.user

import ai.hanzo.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserDeleteParamsTest {

    @Test
    fun create() {
        UserDeleteParams.builder().llmChangedBy("llm-changed-by").addUserId("string").build()
    }

    @Test
    fun headers() {
        val params =
            UserDeleteParams.builder().llmChangedBy("llm-changed-by").addUserId("string").build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("llm-changed-by", "llm-changed-by").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = UserDeleteParams.builder().addUserId("string").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            UserDeleteParams.builder().llmChangedBy("llm-changed-by").addUserId("string").build()

        val body = params._body()

        assertThat(body.userIds()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = UserDeleteParams.builder().addUserId("string").build()

        val body = params._body()

        assertThat(body.userIds()).containsExactly("string")
    }
}
