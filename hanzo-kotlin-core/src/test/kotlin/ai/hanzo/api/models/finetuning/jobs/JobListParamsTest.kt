// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.finetuning.jobs

import ai.hanzo.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobListParamsTest {

    @Test
    fun create() {
        JobListParams.builder()
            .after("after")
            .customLlmProvider(JobListParams.CustomLlmProvider.OPENAI)
            .limit(0L)
            .targetModelNames("target_model_names")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            JobListParams.builder()
                .after("after")
                .customLlmProvider(JobListParams.CustomLlmProvider.OPENAI)
                .limit(0L)
                .targetModelNames("target_model_names")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("custom_llm_provider", "openai")
                    .put("limit", "0")
                    .put("target_model_names", "target_model_names")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = JobListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
