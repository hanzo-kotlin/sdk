// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team

import ai.hanzo.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamDeleteParamsTest {

    @Test
    fun create() {
        TeamDeleteParams.builder().llmChangedBy("llm-changed-by").addTeamId("string").build()
    }

    @Test
    fun headers() {
        val params =
            TeamDeleteParams.builder().llmChangedBy("llm-changed-by").addTeamId("string").build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("llm-changed-by", "llm-changed-by").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = TeamDeleteParams.builder().addTeamId("string").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            TeamDeleteParams.builder().llmChangedBy("llm-changed-by").addTeamId("string").build()

        val body = params._body()

        assertThat(body.teamIds()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TeamDeleteParams.builder().addTeamId("string").build()

        val body = params._body()

        assertThat(body.teamIds()).containsExactly("string")
    }
}
