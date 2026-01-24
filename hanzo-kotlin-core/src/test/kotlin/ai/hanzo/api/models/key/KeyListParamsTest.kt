// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

import ai.hanzo.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KeyListParamsTest {

    @Test
    fun create() {
        KeyListParams.builder()
            .addExpand("string")
            .includeCreatedByKeys(true)
            .includeTeamKeys(true)
            .keyAlias("key_alias")
            .keyHash("key_hash")
            .organizationId("organization_id")
            .page(1L)
            .returnFullObject(true)
            .size(1L)
            .sortBy("sort_by")
            .sortOrder("sort_order")
            .status("status")
            .teamId("team_id")
            .userId("user_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            KeyListParams.builder()
                .addExpand("string")
                .includeCreatedByKeys(true)
                .includeTeamKeys(true)
                .keyAlias("key_alias")
                .keyHash("key_hash")
                .organizationId("organization_id")
                .page(1L)
                .returnFullObject(true)
                .size(1L)
                .sortBy("sort_by")
                .sortOrder("sort_order")
                .status("status")
                .teamId("team_id")
                .userId("user_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("expand", listOf("string").joinToString(","))
                    .put("include_created_by_keys", "true")
                    .put("include_team_keys", "true")
                    .put("key_alias", "key_alias")
                    .put("key_hash", "key_hash")
                    .put("organization_id", "organization_id")
                    .put("page", "1")
                    .put("return_full_object", "true")
                    .put("size", "1")
                    .put("sort_by", "sort_by")
                    .put("sort_order", "sort_order")
                    .put("status", "status")
                    .put("team_id", "team_id")
                    .put("user_id", "user_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = KeyListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
