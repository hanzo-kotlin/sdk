// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.finetuning.jobs

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class JobListResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val jobListResponse = JobListResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val jobListResponse = JobListResponse.builder().build()

        val roundtrippedJobListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jobListResponse),
                jacksonTypeRef<JobListResponse>(),
            )

        assertThat(roundtrippedJobListResponse).isEqualTo(jobListResponse)
    }
}
