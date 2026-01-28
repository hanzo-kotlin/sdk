// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team.model

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModelRemoveResponseTest {

    @Test
    fun create() {
        val modelRemoveResponse = ModelRemoveResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val modelRemoveResponse = ModelRemoveResponse.builder().build()

        val roundtrippedModelRemoveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modelRemoveResponse),
                jacksonTypeRef<ModelRemoveResponse>(),
            )

        assertThat(roundtrippedModelRemoveResponse).isEqualTo(modelRemoveResponse)
    }
}
