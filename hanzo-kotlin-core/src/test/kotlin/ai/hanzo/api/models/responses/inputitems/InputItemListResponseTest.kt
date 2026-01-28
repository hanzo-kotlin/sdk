// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.responses.inputitems

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InputItemListResponseTest {

    @Test
    fun create() {
        val inputItemListResponse = InputItemListResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inputItemListResponse = InputItemListResponse.builder().build()

        val roundtrippedInputItemListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inputItemListResponse),
                jacksonTypeRef<InputItemListResponse>(),
            )

        assertThat(roundtrippedInputItemListResponse).isEqualTo(inputItemListResponse)
    }
}
