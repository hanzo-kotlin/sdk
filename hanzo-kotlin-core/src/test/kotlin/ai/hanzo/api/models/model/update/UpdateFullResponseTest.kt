// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.model.update

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UpdateFullResponseTest {

    @Test
    fun create() {
        val updateFullResponse = UpdateFullResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val updateFullResponse = UpdateFullResponse.builder().build()

        val roundtrippedUpdateFullResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(updateFullResponse),
                jacksonTypeRef<UpdateFullResponse>(),
            )

        assertThat(roundtrippedUpdateFullResponse).isEqualTo(updateFullResponse)
    }
}
