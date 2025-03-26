// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.user

import com.hanzo_ai.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserDeleteParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        UserDeleteParams.builder().llmChangedBy("llm-changed-by").addUserId("string").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun headers() {
        val params =
            UserDeleteParams.builder().llmChangedBy("llm-changed-by").addUserId("string").build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("llm-changed-by", "llm-changed-by").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun headersWithoutOptionalFields() {
        val params = UserDeleteParams.builder().addUserId("string").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            UserDeleteParams.builder().llmChangedBy("llm-changed-by").addUserId("string").build()

        val body = params._body()

        assertThat(body.userIds()).containsExactly("string")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = UserDeleteParams.builder().addUserId("string").build()

        val body = params._body()

        assertThat(body.userIds()).containsExactly("string")
    }
}
