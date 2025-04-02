// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.model

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ModelDeleteResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val modelDeleteResponse = ModelDeleteResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val modelDeleteResponse = ModelDeleteResponse.builder().build()

        val roundtrippedModelDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modelDeleteResponse),
                jacksonTypeRef<ModelDeleteResponse>(),
            )

        assertThat(roundtrippedModelDeleteResponse).isEqualTo(modelDeleteResponse)
    }
}
