// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team.model

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModelAddResponseTest {

    @Test
    fun create() {
        val modelAddResponse = ModelAddResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val modelAddResponse = ModelAddResponse.builder().build()

        val roundtrippedModelAddResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modelAddResponse),
                jacksonTypeRef<ModelAddResponse>(),
            )

        assertThat(roundtrippedModelAddResponse).isEqualTo(modelAddResponse)
    }
}
