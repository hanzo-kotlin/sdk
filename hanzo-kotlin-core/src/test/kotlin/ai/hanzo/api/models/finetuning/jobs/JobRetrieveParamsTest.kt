// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.finetuning.jobs

import ai.hanzo.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class JobRetrieveParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        JobRetrieveParams.builder()
            .fineTuningJobId("fine_tuning_job_id")
            .customLlmProvider(JobRetrieveParams.CustomLlmProvider.OPENAI)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params =
            JobRetrieveParams.builder()
                .fineTuningJobId("fine_tuning_job_id")
                .customLlmProvider(JobRetrieveParams.CustomLlmProvider.OPENAI)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("fine_tuning_job_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            JobRetrieveParams.builder()
                .fineTuningJobId("fine_tuning_job_id")
                .customLlmProvider(JobRetrieveParams.CustomLlmProvider.OPENAI)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("custom_llm_provider", "openai").build())
    }
}
