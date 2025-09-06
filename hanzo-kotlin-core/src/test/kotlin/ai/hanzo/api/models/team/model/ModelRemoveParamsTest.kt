// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModelRemoveParamsTest {

    @Test
    fun create() {
        ModelRemoveParams.builder().addModel("string").teamId("team_id").build()
    }

    @Test
    fun body() {
        val params = ModelRemoveParams.builder().addModel("string").teamId("team_id").build()

        val body = params._body()

        assertThat(body.models()).containsExactly("string")
        assertThat(body.teamId()).isEqualTo("team_id")
    }
}
