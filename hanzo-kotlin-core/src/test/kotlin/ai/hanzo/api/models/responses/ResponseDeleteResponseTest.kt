// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.responses

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResponseDeleteResponseTest {

    @Test
    fun create() {
        val responseDeleteResponse = ResponseDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val responseDeleteResponse = ResponseDeleteResponse.builder().build()

        val roundtrippedResponseDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseDeleteResponse),
                jacksonTypeRef<ResponseDeleteResponse>(),
            )

        assertThat(roundtrippedResponseDeleteResponse).isEqualTo(responseDeleteResponse)
    }
}
