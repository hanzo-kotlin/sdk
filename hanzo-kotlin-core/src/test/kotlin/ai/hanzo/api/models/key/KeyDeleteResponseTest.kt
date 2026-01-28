// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KeyDeleteResponseTest {

    @Test
    fun create() {
        val keyDeleteResponse = KeyDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val keyDeleteResponse = KeyDeleteResponse.builder().build()

        val roundtrippedKeyDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(keyDeleteResponse),
                jacksonTypeRef<KeyDeleteResponse>(),
            )

        assertThat(roundtrippedKeyDeleteResponse).isEqualTo(keyDeleteResponse)
    }
}
