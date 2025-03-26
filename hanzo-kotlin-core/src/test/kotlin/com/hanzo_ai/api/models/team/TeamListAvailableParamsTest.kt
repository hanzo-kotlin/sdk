// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.team

import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TeamListAvailableParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        TeamListAvailableParams.builder()
            .responseModel(JsonValue.from(mapOf<String, Any>()))
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            TeamListAvailableParams.builder()
                .responseModel(JsonValue.from(mapOf<String, Any>()))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TeamListAvailableParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
