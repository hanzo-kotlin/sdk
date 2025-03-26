// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.finetuning.jobs.cancel

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CancelCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        CancelCreateParams.builder().fineTuningJobId("fine_tuning_job_id").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params = CancelCreateParams.builder().fineTuningJobId("fine_tuning_job_id").build()

        assertThat(params._pathParam(0)).isEqualTo("fine_tuning_job_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
