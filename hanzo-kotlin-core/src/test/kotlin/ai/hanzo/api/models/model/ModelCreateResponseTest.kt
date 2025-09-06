// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.model

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModelCreateResponseTest {

    @Test
    fun create() {
        val modelCreateResponse = ModelCreateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val modelCreateResponse = ModelCreateResponse.builder().build()

        val roundtrippedModelCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modelCreateResponse),
                jacksonTypeRef<ModelCreateResponse>(),
            )

        assertThat(roundtrippedModelCreateResponse).isEqualTo(modelCreateResponse)
    }
}
