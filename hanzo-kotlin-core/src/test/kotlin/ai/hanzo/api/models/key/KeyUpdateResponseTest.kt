// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KeyUpdateResponseTest {

    @Test
    fun create() {
        val keyUpdateResponse = KeyUpdateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val keyUpdateResponse = KeyUpdateResponse.builder().build()

        val roundtrippedKeyUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(keyUpdateResponse),
                jacksonTypeRef<KeyUpdateResponse>(),
            )

        assertThat(roundtrippedKeyUpdateResponse).isEqualTo(keyUpdateResponse)
    }
}
