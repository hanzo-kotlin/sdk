// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KeyUnblockResponseTest {

    @Test
    fun create() {
        val keyUnblockResponse = KeyUnblockResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val keyUnblockResponse = KeyUnblockResponse.builder().build()

        val roundtrippedKeyUnblockResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(keyUnblockResponse),
                jacksonTypeRef<KeyUnblockResponse>(),
            )

        assertThat(roundtrippedKeyUnblockResponse).isEqualTo(keyUnblockResponse)
    }
}
