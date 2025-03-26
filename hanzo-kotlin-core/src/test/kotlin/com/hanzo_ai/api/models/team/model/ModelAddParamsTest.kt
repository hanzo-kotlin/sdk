// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.team.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ModelAddParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        ModelAddParams.builder().addModel("string").teamId("team_id").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params = ModelAddParams.builder().addModel("string").teamId("team_id").build()

        val body = params._body()

        assertThat(body.models()).containsExactly("string")
        assertThat(body.teamId()).isEqualTo("team_id")
    }
}
