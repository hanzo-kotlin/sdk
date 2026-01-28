// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.modelgroup

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModelGroupRetrieveInfoResponseTest {

    @Test
    fun create() {
        val modelGroupRetrieveInfoResponse = ModelGroupRetrieveInfoResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val modelGroupRetrieveInfoResponse = ModelGroupRetrieveInfoResponse.builder().build()

        val roundtrippedModelGroupRetrieveInfoResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modelGroupRetrieveInfoResponse),
                jacksonTypeRef<ModelGroupRetrieveInfoResponse>(),
            )

        assertThat(roundtrippedModelGroupRetrieveInfoResponse)
            .isEqualTo(modelGroupRetrieveInfoResponse)
    }
}
