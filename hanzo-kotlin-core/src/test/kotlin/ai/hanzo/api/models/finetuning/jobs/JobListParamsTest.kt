// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.finetuning.jobs

import ai.hanzo.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class JobListParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        JobListParams.builder()
            .customLlmProvider(JobListParams.CustomLlmProvider.OPENAI)
            .after("after")
            .limit(0L)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            JobListParams.builder()
                .customLlmProvider(JobListParams.CustomLlmProvider.OPENAI)
                .after("after")
                .limit(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("custom_llm_provider", "openai")
                    .put("after", "after")
                    .put("limit", "0")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            JobListParams.builder()
                .customLlmProvider(JobListParams.CustomLlmProvider.OPENAI)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("custom_llm_provider", "openai").build())
    }
}
