// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.finetuning.jobs

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobListResponseTest {

    @Test
    fun create() {
        val jobListResponse = JobListResponse.builder().build()
    }

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
