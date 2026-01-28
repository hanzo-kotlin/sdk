// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.finetuning.jobs

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobRetrieveResponseTest {

    @Test
    fun create() {
        val jobRetrieveResponse = JobRetrieveResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val jobRetrieveResponse = JobRetrieveResponse.builder().build()

        val roundtrippedJobRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jobRetrieveResponse),
                jacksonTypeRef<JobRetrieveResponse>(),
            )

        assertThat(roundtrippedJobRetrieveResponse).isEqualTo(jobRetrieveResponse)
    }
}
