// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.responses

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResponseCreateResponseTest {

    @Test
    fun create() {
        val responseCreateResponse = ResponseCreateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val responseCreateResponse = ResponseCreateResponse.builder().build()

        val roundtrippedResponseCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseCreateResponse),
                jacksonTypeRef<ResponseCreateResponse>(),
            )

        assertThat(roundtrippedResponseCreateResponse).isEqualTo(responseCreateResponse)
    }
}
