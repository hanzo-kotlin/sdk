// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KeyRetrieveInfoResponseTest {

    @Test
    fun create() {
        val keyRetrieveInfoResponse = KeyRetrieveInfoResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val keyRetrieveInfoResponse = KeyRetrieveInfoResponse.builder().build()

        val roundtrippedKeyRetrieveInfoResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(keyRetrieveInfoResponse),
                jacksonTypeRef<KeyRetrieveInfoResponse>(),
            )

        assertThat(roundtrippedKeyRetrieveInfoResponse).isEqualTo(keyRetrieveInfoResponse)
    }
}
