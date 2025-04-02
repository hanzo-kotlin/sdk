// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.model.update

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UpdateFullResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val updateFullResponse = UpdateFullResponse.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
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
