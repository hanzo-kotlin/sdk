// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.models

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModelListResponseTest {

    @Test
    fun create() {
        val modelListResponse = ModelListResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val modelListResponse = ModelListResponse.builder().build()

        val roundtrippedModelListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modelListResponse),
                jacksonTypeRef<ModelListResponse>(),
            )

        assertThat(roundtrippedModelListResponse).isEqualTo(modelListResponse)
    }
}
