// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.key

import com.hanzo_ai.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class KeyListParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        KeyListParams.builder()
            .includeTeamKeys(true)
            .keyAlias("key_alias")
            .organizationId("organization_id")
            .page(1L)
            .returnFullObject(true)
            .size(1L)
            .teamId("team_id")
            .userId("user_id")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            KeyListParams.builder()
                .includeTeamKeys(true)
                .keyAlias("key_alias")
                .organizationId("organization_id")
                .page(1L)
                .returnFullObject(true)
                .size(1L)
                .teamId("team_id")
                .userId("user_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("include_team_keys", "true")
                    .put("key_alias", "key_alias")
                    .put("organization_id", "organization_id")
                    .put("page", "1")
                    .put("return_full_object", "true")
                    .put("size", "1")
                    .put("team_id", "team_id")
                    .put("user_id", "user_id")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = KeyListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
