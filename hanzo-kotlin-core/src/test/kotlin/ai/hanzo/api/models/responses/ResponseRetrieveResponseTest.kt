// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.responses

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResponseRetrieveResponseTest {

    @Test
    fun create() {
        val responseRetrieveResponse = ResponseRetrieveResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val responseRetrieveResponse = ResponseRetrieveResponse.builder().build()

        val roundtrippedResponseRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseRetrieveResponse),
                jacksonTypeRef<ResponseRetrieveResponse>(),
            )

        assertThat(roundtrippedResponseRetrieveResponse).isEqualTo(responseRetrieveResponse)
    }
}
