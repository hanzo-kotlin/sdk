// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.models

import ai.hanzo.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModelListParamsTest {

    @Test
    fun create() {
        ModelListParams.builder()
            .fallbackType("fallback_type")
            .includeMetadata(true)
            .includeModelAccessGroups(true)
            .onlyModelAccessGroups(true)
            .returnWildcardRoutes(true)
            .teamId("team_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ModelListParams.builder()
                .fallbackType("fallback_type")
                .includeMetadata(true)
                .includeModelAccessGroups(true)
                .onlyModelAccessGroups(true)
                .returnWildcardRoutes(true)
                .teamId("team_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("fallback_type", "fallback_type")
                    .put("include_metadata", "true")
                    .put("include_model_access_groups", "true")
                    .put("only_model_access_groups", "true")
                    .put("return_wildcard_routes", "true")
                    .put("team_id", "team_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ModelListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
