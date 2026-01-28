// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.model

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModelDeleteResponseTest {

    @Test
    fun create() {
        val modelDeleteResponse = ModelDeleteResponse.builder().build()
    }

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
