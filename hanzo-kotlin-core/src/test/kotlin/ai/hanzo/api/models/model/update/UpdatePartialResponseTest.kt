// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.model.update

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UpdatePartialResponseTest {

    @Test
    fun create() {
        val updatePartialResponse = UpdatePartialResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val updatePartialResponse = UpdatePartialResponse.builder().build()

        val roundtrippedUpdatePartialResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(updatePartialResponse),
                jacksonTypeRef<UpdatePartialResponse>(),
            )

        assertThat(roundtrippedUpdatePartialResponse).isEqualTo(updatePartialResponse)
    }
}
