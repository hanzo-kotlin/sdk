// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.finetuning.jobs

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobCreateResponseTest {

    @Test
    fun create() {
        val jobCreateResponse = JobCreateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val jobCreateResponse = JobCreateResponse.builder().build()

        val roundtrippedJobCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jobCreateResponse),
                jacksonTypeRef<JobCreateResponse>(),
            )

        assertThat(roundtrippedJobCreateResponse).isEqualTo(jobCreateResponse)
    }
}
